package normaljobs.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		/**
		 * Place custom panels and globals below, for example:
		 */ 
//	        addGlobal("globalVariable1")	// Globally accessible variable ( variable name)
	        // Slider with label ( variable name, slider label, minimum value, increment, maximum value, initial value )
	        addSliderWL ("numWorkers", "Number of Workers", 1 , 1 , 1000 , 11)
	        addSliderWL ("numRequirements", "Number of Requirements", 1 , 1 , 10000 , 1000)
	        addSliderWL ("numberSteps", "Number of Steps", 1 , 1 , 100 , 50)
	        addSliderWL ("workIncrement", "Requirements solved per step", 1 , 1 , 100 , 10)
	        
			
	}
}