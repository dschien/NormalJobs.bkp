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
	def increment = 1
	
	def step(){
		if (this.job && job.numRequirements > job.completionLevel){
			job.completionLevel += increment
		}
	}
	
	def isJobDone(){
		// check out http://groovy.codehaus.org/Operators#Operators-ElvisOperator(?:)
		return job?.numRequirements > job?.completionLevel 
	}
	
	
	
}