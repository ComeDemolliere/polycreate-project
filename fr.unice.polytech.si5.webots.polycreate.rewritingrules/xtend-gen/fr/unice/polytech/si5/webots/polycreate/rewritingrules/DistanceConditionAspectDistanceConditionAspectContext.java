package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspectDistanceConditionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class DistanceConditionAspectDistanceConditionAspectContext {
  public final static DistanceConditionAspectDistanceConditionAspectContext INSTANCE = new DistanceConditionAspectDistanceConditionAspectContext();
  
  public static DistanceConditionAspectDistanceConditionAspectProperties getSelf(final DistanceCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspectDistanceConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DistanceCondition, DistanceConditionAspectDistanceConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.DistanceCondition, fr.unice.polytech.si5.webots.polycreate.rewritingrules.DistanceConditionAspectDistanceConditionAspectProperties>();
  
  public Map<DistanceCondition, DistanceConditionAspectDistanceConditionAspectProperties> getMap() {
    return map;
  }
}
