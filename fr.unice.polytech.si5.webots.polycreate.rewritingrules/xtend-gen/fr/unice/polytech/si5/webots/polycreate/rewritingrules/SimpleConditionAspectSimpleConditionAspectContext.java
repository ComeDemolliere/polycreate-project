package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspectSimpleConditionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class SimpleConditionAspectSimpleConditionAspectContext {
  public final static SimpleConditionAspectSimpleConditionAspectContext INSTANCE = new SimpleConditionAspectSimpleConditionAspectContext();
  
  public static SimpleConditionAspectSimpleConditionAspectProperties getSelf(final SimpleCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspectSimpleConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SimpleCondition, SimpleConditionAspectSimpleConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.SimpleCondition, fr.unice.polytech.si5.webots.polycreate.rewritingrules.SimpleConditionAspectSimpleConditionAspectProperties>();
  
  public Map<SimpleCondition, SimpleConditionAspectSimpleConditionAspectProperties> getMap() {
    return map;
  }
}
