package normaljobs;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoTurtle extends BaseTurtle{

	/**
	 * Makes a number of new workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> hatchWorkers(int number, Closure closure) {
		AgentSet<normaljobs.relogo.Worker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Worker");
		for (Turtle t : createResult){
			if (t instanceof normaljobs.relogo.Worker){
				result.add((normaljobs.relogo.Worker)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.Worker")
	public AgentSet<normaljobs.relogo.Worker> hatchWorkers(int number) {
		return hatchWorkers(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
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
	 * Makes a directed userLink from a turtle to the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink createUserLinkFrom(Turtle t, Closure closure){
		normaljobs.relogo.UserLink link = (normaljobs.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink createUserLinkFrom(Turtle t){
			return createUserLinkFrom(t,null);
	}

	/**
	 * Makes directed userLinks from a collection to the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<normaljobs.relogo.UserLink> links = new AgentSet<normaljobs.relogo.UserLink>();
		for(Turtle t : a){
			links.add((normaljobs.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a){
		return createUserLinksFrom(a,null);
	}

	/**
	 * Makes a directed userLink to a turtle from the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink createUserLinkTo(Turtle t, Closure closure){
		normaljobs.relogo.UserLink link = (normaljobs.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink createUserLinkTo(Turtle t){
			return createUserLinkTo(t,null);
	}

	/**
	 * Makes directed userLinks to a collection from the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<normaljobs.relogo.UserLink> links = new AgentSet<normaljobs.relogo.UserLink>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((normaljobs.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a){
		return createUserLinksTo(a,null);
	}

	/**
	 * Queries if there is a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public boolean inUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed userLinks to the caller.
	 * 
	 * @return agentset with directed userLinks to the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet inUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink inUserLinkFrom(Turtle t){
		return (normaljobs.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed userLinks from other turtles to the caller.
	 * 
	 * @return agentset of directed userLinks from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> myInUserLinks(){
		AgentSet<normaljobs.relogo.UserLink> result = new AgentSet<normaljobs.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getInEdges(this)){
			if (o instanceof normaljobs.relogo.UserLink){
				result.add((normaljobs.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed userLinks to other turtles from the caller.
	 * 
	 * @return agentset of directed userLinks to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> myOutUserLinks(){
		AgentSet<normaljobs.relogo.UserLink> result = new AgentSet<normaljobs.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getOutEdges(this)){
			if (o instanceof normaljobs.relogo.UserLink){
				result.add((normaljobs.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public boolean outUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed userLinks from the caller.
	 * 
	 * @return agentset with directed userLinks from the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet outUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public normaljobs.relogo.UserLink outUserLinkTo(Turtle t){
		return (normaljobs.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(this, t);
	}

	/**
	 * Reports true if there is a userLink connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public boolean userLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * userLinks connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet userLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's userLinks.
	 * 
	 * @return agentset of the caller's userLinks
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserLink")
	public AgentSet<normaljobs.relogo.UserLink> myUserLinks(){
		AgentSet<normaljobs.relogo.UserLink> result = new AgentSet<normaljobs.relogo.UserLink>();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getEdges(this)){
			if (o instanceof normaljobs.relogo.UserLink){
				result.add((normaljobs.relogo.UserLink)o);
			}
		}
		return result;
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