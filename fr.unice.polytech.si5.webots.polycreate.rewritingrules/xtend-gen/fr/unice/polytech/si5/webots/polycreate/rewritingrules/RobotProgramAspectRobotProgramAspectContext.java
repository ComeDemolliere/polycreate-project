package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class RobotProgramAspectRobotProgramAspectContext {
  public final static RobotProgramAspectRobotProgramAspectContext INSTANCE = new RobotProgramAspectRobotProgramAspectContext();
  
  public static RobotProgramAspectRobotProgramAspectProperties getSelf(final RobotProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RobotProgram, RobotProgramAspectRobotProgramAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram, fr.unice.polytech.si5.webots.polycreate.rewritingrules.RobotProgramAspectRobotProgramAspectProperties>();
  
  public Map<RobotProgram, RobotProgramAspectRobotProgramAspectProperties> getMap() {
    return map;
  }
}
