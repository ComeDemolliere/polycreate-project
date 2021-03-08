package fr.unice.polytech.si5.webots.polycreate.design;

import org.eclipse.emf.ecore.EObject;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GRIPPER_STATE;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.OPERATOR;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String printAllGlobalTransitions(RobotProgram robot) {
    	String res = "";
    	for (int i = 0; i < robot.getGlobalTransitions().size() ; i++) {
    		for (Condition condition : robot.getGlobalTransitions().get(i).getConditions()) {
        		if (condition instanceof SimpleCondition) {
        			res += "if there is a " + ((SimpleCondition) condition).getDetectionType().toString() + "\n";
        		}
        		if (condition instanceof AngleCondition) {
        			res += "if angle ";
        			res += ((AngleCondition) condition).getOperator().equals(OPERATOR.INFERIOR) ? "< " : "> ";
        			res += ((AngleCondition) condition).getAngle();
        			res += " on camera " + ((AngleCondition) condition).getCameraType() + "\n";
        		}
        		if (condition instanceof DistanceCondition) {
        			res += "if distance ";
        			res += ((DistanceCondition) condition).getOperator().equals(OPERATOR.INFERIOR) ? "< " : "> ";
        			res += ((DistanceCondition) condition).getDistance();
        			res += " on camera " + ((DistanceCondition) condition).getCameraType() + "\n";
        		}
    			if (i < robot.getGlobalTransitions().size() - 1) res += "OR ";
    		}
    	}
    	return res;
    	
    }
    
    public String printTransition(Transition transition) {
    	String res = "";
    	for (Condition condition : transition.getConditions()) {
    		if (condition instanceof SimpleCondition) {
    			res += "there is a " + ((SimpleCondition) condition).getDetectionType().toString() + "\n";
    		}
    		if (condition instanceof AngleCondition) {
    			res += "angle ";
    			res += ((AngleCondition) condition).getOperator().equals(OPERATOR.INFERIOR) ? "< " : "> ";
    			res += ((AngleCondition) condition).getAngle();
    			res += " on camera " + ((AngleCondition) condition).getCameraType() + "\n";
    		}
    		if (condition instanceof DistanceCondition) {
    			res += " distance ";
    			res += ((DistanceCondition) condition).getOperator().equals(OPERATOR.INFERIOR) ? "< " : "> ";
    			res += ((DistanceCondition) condition).getDistance();
    			res += " on camera " + ((DistanceCondition) condition).getCameraType() + "\n";
    		}
			
		}
    	if (res.isEmpty()) {
    		return "No conditions";
    	}
    	return res;
    }
    
    public String printMoveAction(MoveAction action) {
    	String res = "Move " + action.getDirection().toString();
    	if (action.getDuration() > 0) {
    		res += " during " + action.getDuration() + " secondes";
    	}
    	
    	return res;
    }
    
    public String printTurnAction(TurnAction action) {
    	String res = "Turn " + action.getAngle() + "°";
    	if (action.getDuration() > 0) {
    		res += " during " + action.getDuration() + " secondes";
    	}
    	
    	return res;
    }

    public String printGripAction(GripAction action) {
    	return action.getState().equals(GRIPPER_STATE.OPEN) ? "Open gripper " : "Close gripper";    	
    }
}
