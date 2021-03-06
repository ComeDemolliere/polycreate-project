/**
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.webots.formatting2;

import com.google.inject.Inject;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Condition;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.State;
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition;
import fr.unice.polytech.si5.webots.services.PolycreateGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PolycreateFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private PolycreateGrammarAccess _polycreateGrammarAccess;
  
  protected void _format(final RobotProgram robotProgram, @Extension final IFormattableDocument document) {
    EList<State> _ownedStates = robotProgram.getOwnedStates();
    for (final State state : _ownedStates) {
      document.<State>format(state);
    }
    EList<Transition> _globalTransitions = robotProgram.getGlobalTransitions();
    for (final Transition transition : _globalTransitions) {
      document.<Transition>format(transition);
    }
  }
  
  protected void _format(final Transition transition, @Extension final IFormattableDocument document) {
    EList<Condition> _conditions = transition.getConditions();
    for (final Condition condition : _conditions) {
      document.<Condition>format(condition);
    }
  }
  
  public void format(final Object robotProgram, final IFormattableDocument document) {
    if (robotProgram instanceof XtextResource) {
      _format((XtextResource)robotProgram, document);
      return;
    } else if (robotProgram instanceof RobotProgram) {
      _format((RobotProgram)robotProgram, document);
      return;
    } else if (robotProgram instanceof Transition) {
      _format((Transition)robotProgram, document);
      return;
    } else if (robotProgram instanceof EObject) {
      _format((EObject)robotProgram, document);
      return;
    } else if (robotProgram == null) {
      _format((Void)null, document);
      return;
    } else if (robotProgram != null) {
      _format(robotProgram, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(robotProgram, document).toString());
    }
  }
}
