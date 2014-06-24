package normaljobs.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Plural;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import normaljobs.ReLogoTurtle;

class Worker extends ReLogoTurtle{

	Job job = null
	double increment = 1d

	def step(){
		
		if (this.job && this.job.completionLevel < this.job.requirements){
			this.job.completionLevel += increment			
		}
	}

	def isJobDone(){

		if (this.job && this.job.completionLevel >= this.job.requirements){			
			return true
		}
		return  false
	}
}