/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.webots.parser.antlr;

import com.google.inject.Inject;
import fr.unice.polytech.si5.webots.parser.antlr.internal.InternalPolycreateParser;
import fr.unice.polytech.si5.webots.services.PolycreateGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PolycreateParser extends AbstractAntlrParser {

	@Inject
	private PolycreateGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPolycreateParser createParser(XtextTokenStream stream) {
		return new InternalPolycreateParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RobotProgram";
	}

	public PolycreateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PolycreateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
