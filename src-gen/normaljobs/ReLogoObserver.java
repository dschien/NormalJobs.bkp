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

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoObserver extends BaseObserver{

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> createUserTurtles(int number, Closure closure) {
		AgentSet<normaljobs.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof normaljobs.relogo.UserTurtle){
				result.add((normaljobs.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> createUserTurtles(int number) {
		return createUserTurtles(number,null);
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> createOrderedUserTurtles(int number, Closure closure) {
		AgentSet<normaljobs.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof normaljobs.relogo.UserTurtle){
				result.add((normaljobs.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> createOrderedUserTurtles(int number) {
		return createOrderedUserTurtles(number,null);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof normaljobs.relogo.UserTurtle);
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> userTurtles(){
		AgentSet<normaljobs.relogo.UserTurtle> a = new AgentSet<normaljobs.relogo.UserTurtle>();
		for (Object e : this.getContext().getObjects(normaljobs.relogo.UserTurtle.class)) {
			if (e instanceof normaljobs.relogo.UserTurtle){
				a.add((normaljobs.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public normaljobs.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof normaljobs.relogo.UserTurtle)
			return (normaljobs.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<normaljobs.relogo.UserTurtle> result = new AgentSet<normaljobs.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"userTurtle")){
			if (t instanceof normaljobs.relogo.UserTurtle)
			result.add((normaljobs.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<normaljobs.relogo.UserTurtle> result = new AgentSet<normaljobs.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"userTurtle")){
			if (tt instanceof normaljobs.relogo.UserTurtle)
			result.add((normaljobs.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("normaljobs.relogo.UserTurtle")
	public AgentSet<normaljobs.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<normaljobs.relogo.UserTurtle>();
		}

		Set<normaljobs.relogo.UserTurtle> total = new HashSet<normaljobs.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<normaljobs.relogo.UserTurtle>(total);
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
		for (Object e : this.getContext().getObjects(normaljobs.relogo.UserLink.class)) {
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
		return (normaljobs.relogo.UserLink)(this.getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
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


}