package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ObjectConditionAspectObjectConditionAspectContext {
  public final static ObjectConditionAspectObjectConditionAspectContext INSTANCE = new ObjectConditionAspectObjectConditionAspectContext();
  
  public static ObjectConditionAspectObjectConditionAspectProperties getSelf(final ObjectCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObjectCondition, ObjectConditionAspectObjectConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.ObjectCondition, fr.unice.polytech.si5.webots.polycreate.rewritingrules.ObjectConditionAspectObjectConditionAspectProperties>();
  
  public Map<ObjectCondition, ObjectConditionAspectObjectConditionAspectProperties> getMap() {
    return map;
  }
}
