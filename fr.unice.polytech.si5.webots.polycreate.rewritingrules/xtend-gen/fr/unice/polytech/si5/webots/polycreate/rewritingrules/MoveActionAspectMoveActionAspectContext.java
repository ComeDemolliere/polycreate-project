package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspectMoveActionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class MoveActionAspectMoveActionAspectContext {
  public final static MoveActionAspectMoveActionAspectContext INSTANCE = new MoveActionAspectMoveActionAspectContext();
  
  public static MoveActionAspectMoveActionAspectProperties getSelf(final MoveAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspectMoveActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MoveAction, MoveActionAspectMoveActionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.MoveAction, fr.unice.polytech.si5.webots.polycreate.rewritingrules.MoveActionAspectMoveActionAspectProperties>();
  
  public Map<MoveAction, MoveActionAspectMoveActionAspectProperties> getMap() {
    return map;
  }
}
