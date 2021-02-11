/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.webots.formatting2

import com.google.inject.Inject
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.RobotProgram
import fr.unice.polytech.si5.webots.polycreate.abstractsyntax.polycreate.Transition
import fr.unice.polytech.si5.webots.services.PolycreateGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class PolycreateFormatter extends AbstractFormatter2 {
	
	@Inject extension PolycreateGrammarAccess

	def dispatch void format(RobotProgram robotProgram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (state : robotProgram.ownedStates) {
			state.format
		}
		for (transition : robotProgram.globalTransitions) {
			transition.format
		}
	}

	def dispatch void format(Transition transition, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (condition : transition.conditions) {
			condition.format
		}
	}
	
	// TODO: implement for State
}
