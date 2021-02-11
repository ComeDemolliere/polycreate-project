package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TurnActionAspectTurnActionAspectContext {
  public final static TurnActionAspectTurnActionAspectContext INSTANCE = new TurnActionAspectTurnActionAspectContext();
  
  public static TurnActionAspectTurnActionAspectProperties getSelf(final TurnAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnAction, TurnActionAspectTurnActionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.TurnAction, fr.unice.polytech.si5.webots.polycreate.rewritingrules.TurnActionAspectTurnActionAspectProperties>();
  
  public Map<TurnAction, TurnActionAspectTurnActionAspectProperties> getMap() {
    return map;
  }
}
