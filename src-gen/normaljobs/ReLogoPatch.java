package normaljobs;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.ast.Diffusible;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoPatch extends BasePatch{

	/**
	 * Sprouts (makes) a number of new workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> sproutWorkers(int number, Closure closure) {
		AgentSet<normaljobs.relogo.Worker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Worker");
		for (Turtle t : createResult){
			if (t instanceof normaljobs.relogo.Worker){
				result.add((normaljobs.relogo.Worker)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> sproutWorkers(int number) {
		return sproutWorkers(number,null);
	}

	/**
	 * Returns an agentset of workers from the patch of the caller.
	 * 
	 * @return agentset of workers from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> workersHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<normaljobs.relogo.Worker> result = new AgentSet<normaljobs.relogo.Worker>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"worker")){
			if (t instanceof normaljobs.relogo.Worker)
			result.add((normaljobs.relogo.Worker)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of workers on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of workers at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> workersAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<normaljobs.relogo.Worker> result = new AgentSet<normaljobs.relogo.Worker>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"worker")){
			if (t instanceof normaljobs.relogo.Worker)
			result.add((normaljobs.relogo.Worker)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<normaljobs.relogo.Worker>();
		}
	}

	/**
	 * Returns an agentset of workers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of workers on patch p
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> workersOn(Patch p){
		AgentSet<normaljobs.relogo.Worker> result = new AgentSet<normaljobs.relogo.Worker>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"worker")){
			if (t instanceof normaljobs.relogo.Worker)
			result.add((normaljobs.relogo.Worker)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of workers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of workers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> workersOn(Turtle t){
		AgentSet<normaljobs.relogo.Worker> result = new AgentSet<normaljobs.relogo.Worker>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"worker")){
			if (tt instanceof normaljobs.relogo.Worker)
			result.add((normaljobs.relogo.Worker)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of workers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of workers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> workersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<normaljobs.relogo.Worker>();
		}

		Set<normaljobs.relogo.Worker> total = new HashSet<normaljobs.relogo.Worker>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(workersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(workersOn(p));
				}
			}
		}
		return new AgentSet<normaljobs.relogo.Worker>(total);
	}

	/**
	 * Queries if object is a worker.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a worker
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public boolean isWorkerQ(Object o){
		return (o instanceof normaljobs.relogo.Worker);
	}

	/**
	 * Returns an agentset containing all workers.
	 * 
	 * @return agentset of all workers
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> workers(){
		AgentSet<normaljobs.relogo.Worker> a = new AgentSet<normaljobs.relogo.Worker>();
		for (Object e : this.getMyObserver().getContext().getObjects(normaljobs.relogo.Worker.class)) {
			if (e instanceof normaljobs.relogo.Worker){
				a.add((normaljobs.relogo.Worker)e);
			}
		}
		return a;
	}

	/**
	 * Returns the worker with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public normaljobs.relogo.Worker worker(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof normaljobs.relogo.Worker)
			return (normaljobs.relogo.Worker) turtle;
		return null;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof normaljobs.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> userLinks(){
		AgentSet<normaljobs.relogo.UserLink> a = new AgentSet<normaljobs.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(normaljobs.relogo.UserLink.class)) {
			if (e instanceof normaljobs.relogo.UserLink){
				a.add((normaljobs.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (normaljobs.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numWorkers.
	 *
	 * @return the value of the global variable numWorkers
	 */
	@ReLogoBuilderGeneratedFor("global: numWorkers")
	public Object getNumWorkers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numWorkers");
	}

	/**
	 * Sets the value of the global variable numWorkers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numWorkers")
	public void setNumWorkers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numWorkers",value);
	}

	/**
	 * Returns the value of the global variable numRequirements.
	 *
	 * @return the value of the global variable numRequirements
	 */
	@ReLogoBuilderGeneratedFor("global: numRequirements")
	public Object getNumRequirements(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numRequirements");
	}

	/**
	 * Sets the value of the global variable numRequirements.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numRequirements")
	public void setNumRequirements(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numRequirements",value);
	}

	/**
	 * Returns the value of the global variable numberSteps.
	 *
	 * @return the value of the global variable numberSteps
	 */
	@ReLogoBuilderGeneratedFor("global: numberSteps")
	public Object getNumberSteps(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numberSteps");
	}

	/**
	 * Sets the value of the global variable numberSteps.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numberSteps")
	public void setNumberSteps(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numberSteps",value);
	}

	/**
	 * Returns the value of the global variable workIncrement.
	 *
	 * @return the value of the global variable workIncrement
	 */
	@ReLogoBuilderGeneratedFor("global: workIncrement")
	public Object getWorkIncrement(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("workIncrement");
	}

	/**
	 * Sets the value of the global variable workIncrement.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: workIncrement")
	public void setWorkIncrement(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("workIncrement",value);
	}


}