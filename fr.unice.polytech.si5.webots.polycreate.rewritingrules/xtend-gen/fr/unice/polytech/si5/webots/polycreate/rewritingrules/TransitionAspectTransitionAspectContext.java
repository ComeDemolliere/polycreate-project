package fr.unice.polytech.si5.webots.polycreate.rewritingrules;

import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspectTransitionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition, fr.unice.polytech.si5.webots.polycreate.rewritingrules.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
