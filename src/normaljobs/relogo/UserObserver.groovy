package normaljobs.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*
import normaljobs.ReLogoObserver
import org.apache.commons.math3.distribution.NormalDistribution
import repast.simphony.engine.environment.RunEnvironment
import repast.simphony.relogo.Stop
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class UserObserver extends ReLogoObserver{

	LinkedList openJobs = [] as LinkedList
	Queue doneJobs = [] as Queue

	@Setup
	def setup(){
		clearAll()
		this.openJobs.clear();
		this.doneJobs.clear();

		// initialise jobs
		def mu = 0
		//				def mu = numRequirements/ 2
		def sigma = 1

		NormalDistribution norm = new NormalDistribution(mu, sigma)
		def assignedRequirements = 0

		double minLevel = workIncrement * 2 // job effort at least double the min work increment (at least 2 steps per job)

		double freeRequirements = ( numRequirements - minLevel* numberSteps * numWorkers)

		if (freeRequirements < numRequirements * 0.1){
			println "Number of Requirements that can vary is less than 10% of total - you won't see much variation"
		}
		// the maximum number of requirements per job batch
		double h = -1

		def upperBound = 3 * sigma // ~99% of all req covered

		(0..<numberSteps).each{ i ->

			def x_i = (i*2-1) * 1/2 * upperBound/numberSteps
			def x_j = (i*2+1) * 1/2* upperBound/numberSteps

			def _p = norm.probability(x_i, x_j)
			if (h == -1){
				h = _p * freeRequirements  + minLevel * numWorkers
			}

			def p = _p * freeRequirements  // normalise to total number of reqs

			// our actual num of requirements = limit - pdf
			def r = h - p

			// get requirements per workers relative to number of workers
			def job_requirements = r

			//  create job in batches with this level of requirement
			(0..<numWorkers).each{
				this.openJobs.addFirst(new Job(requirements:job_requirements))
				this.openJobs.addLast( new Job(requirements:job_requirements))
			}

			assignedRequirements+= 2*r
		}

		createWorkers(numWorkers){ it ->
			it.increment = this.workIncrement
		}
	}

	@Go
	def go(){
				
		int idleWorkers = 0

		ask(workers()){ worker ->
			
			if (!worker.job) {
				if (this.openJobs){
					worker.job = this.openJobs.poll()				
				} else {					
					// all jobs done
					idleWorkers ++
				
				}
			}
			// let the worker work on it
			worker.step()

			if (worker.isJobDone()){				
				this.doneJobs << worker.job				 
				worker.job = null
			}
		}

		// we've completed our work
		if (idleWorkers == numWorkers){
			RunEnvironment.getInstance().endRun();
		}
	}

	def getNumOpenJobs(){
		return this.openJobs.size()
	}

	def getNumDoneJobs(){
		return this.doneJobs.size()
	}

}

