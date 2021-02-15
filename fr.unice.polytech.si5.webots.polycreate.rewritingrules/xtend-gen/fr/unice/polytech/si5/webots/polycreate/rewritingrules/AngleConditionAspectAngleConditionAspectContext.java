package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AngleConditionAspectAngleConditionAspectContext {
  public final static AngleConditionAspectAngleConditionAspectContext INSTANCE = new AngleConditionAspectAngleConditionAspectContext();
  
  public static AngleConditionAspectAngleConditionAspectProperties getSelf(final AngleCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AngleCondition, AngleConditionAspectAngleConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.AngleCondition, fr.unice.polytech.si5.webots.polycreate.rewritingrules.AngleConditionAspectAngleConditionAspectProperties>();
  
  public Map<AngleCondition, AngleConditionAspectAngleConditionAspectProperties> getMap() {
    return map;
  }
}
