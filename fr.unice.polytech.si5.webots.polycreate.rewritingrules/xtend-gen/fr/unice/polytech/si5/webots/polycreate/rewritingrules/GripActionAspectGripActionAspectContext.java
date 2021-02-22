package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspectGripActionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class GripActionAspectGripActionAspectContext {
  public final static GripActionAspectGripActionAspectContext INSTANCE = new GripActionAspectGripActionAspectContext();
  
  public static GripActionAspectGripActionAspectProperties getSelf(final GripAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspectGripActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<GripAction, GripActionAspectGripActionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.GripAction, fr.unice.polytech.si5.webots.polycreate.rewritingrules.GripActionAspectGripActionAspectProperties>();
  
  public Map<GripAction, GripActionAspectGripActionAspectProperties> getMap() {
    return map;
  }
}
