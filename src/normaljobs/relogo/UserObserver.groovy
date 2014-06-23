package normaljobs.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import normaljobs.ReLogoObserver;

class UserObserver extends ReLogoObserver{

	@Setup
	def setup(){
		clearAll()
		createWorkers(numWorkers){
			
		}
	}

	@Go
	def go(){
		ask(workers()){

		}
	}
}
