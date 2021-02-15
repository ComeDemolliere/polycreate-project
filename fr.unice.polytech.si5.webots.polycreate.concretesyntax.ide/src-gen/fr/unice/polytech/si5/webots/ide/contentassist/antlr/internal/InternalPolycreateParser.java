package fr.unice.polytech.si5.webots.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.unice.polytech.si5.webots.services.PolycreateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolycreateParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'COLLISION_LEFT'", "'COLLISION_RIGHT'", "'VIRTUAL_WALL'", "'CLIFF_LEFT'", "'CLIFF_RIGHT'", "'CLIFF_FRONT'", "'FORWARD'", "'BACKWARD'", "'RobotProgram'", "'Transition'", "'{'", "'nextState'", "'}'", "'conditions'", "','", "'State'", "'actions'", "'transitions'", "'SimpleCondition'", "'detectionType'", "'MoveAction'", "'duration'", "'direction'", "'TurnAction'", "'angle'", "'-'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPolycreateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPolycreateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPolycreateParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPolycreate.g"; }


    	private PolycreateGrammarAccess grammarAccess;

    	public void setGrammarAccess(PolycreateGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobotProgram"
    // InternalPolycreate.g:53:1: entryRuleRobotProgram : ruleRobotProgram EOF ;
    public final void entryRuleRobotProgram() throws RecognitionException {
        try {
            // InternalPolycreate.g:54:1: ( ruleRobotProgram EOF )
            // InternalPolycreate.g:55:1: ruleRobotProgram EOF
            {
             before(grammarAccess.getRobotProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotProgram();

            state._fsp--;

             after(grammarAccess.getRobotProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobotProgram"


    // $ANTLR start "ruleRobotProgram"
    // InternalPolycreate.g:62:1: ruleRobotProgram : ( ( rule__RobotProgram__Group__0 ) ) ;
    public final void ruleRobotProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:66:2: ( ( ( rule__RobotProgram__Group__0 ) ) )
            // InternalPolycreate.g:67:2: ( ( rule__RobotProgram__Group__0 ) )
            {
            // InternalPolycreate.g:67:2: ( ( rule__RobotProgram__Group__0 ) )
            // InternalPolycreate.g:68:3: ( rule__RobotProgram__Group__0 )
            {
             before(grammarAccess.getRobotProgramAccess().getGroup()); 
            // InternalPolycreate.g:69:3: ( rule__RobotProgram__Group__0 )
            // InternalPolycreate.g:69:4: rule__RobotProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobotProgram"


    // $ANTLR start "entryRuleEString"
    // InternalPolycreate.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPolycreate.g:79:1: ( ruleEString EOF )
            // InternalPolycreate.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPolycreate.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPolycreate.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPolycreate.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalPolycreate.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPolycreate.g:94:3: ( rule__EString__Alternatives )
            // InternalPolycreate.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCondition"
    // InternalPolycreate.g:103:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:104:1: ( ruleCondition EOF )
            // InternalPolycreate.g:105:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalPolycreate.g:112:1: ruleCondition : ( ruleSimpleCondition ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:116:2: ( ( ruleSimpleCondition ) )
            // InternalPolycreate.g:117:2: ( ruleSimpleCondition )
            {
            // InternalPolycreate.g:117:2: ( ruleSimpleCondition )
            // InternalPolycreate.g:118:3: ruleSimpleCondition
            {
             before(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSimpleCondition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAction"
    // InternalPolycreate.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:129:1: ( ruleAction EOF )
            // InternalPolycreate.g:130:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPolycreate.g:137:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:141:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalPolycreate.g:142:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalPolycreate.g:142:2: ( ( rule__Action__Alternatives ) )
            // InternalPolycreate.g:143:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalPolycreate.g:144:3: ( rule__Action__Alternatives )
            // InternalPolycreate.g:144:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalPolycreate.g:153:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalPolycreate.g:154:1: ( ruleTransition EOF )
            // InternalPolycreate.g:155:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPolycreate.g:162:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:166:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalPolycreate.g:167:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalPolycreate.g:167:2: ( ( rule__Transition__Group__0 ) )
            // InternalPolycreate.g:168:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalPolycreate.g:169:3: ( rule__Transition__Group__0 )
            // InternalPolycreate.g:169:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // InternalPolycreate.g:178:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalPolycreate.g:179:1: ( ruleState EOF )
            // InternalPolycreate.g:180:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalPolycreate.g:187:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:191:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalPolycreate.g:192:2: ( ( rule__State__Group__0 ) )
            {
            // InternalPolycreate.g:192:2: ( ( rule__State__Group__0 ) )
            // InternalPolycreate.g:193:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalPolycreate.g:194:3: ( rule__State__Group__0 )
            // InternalPolycreate.g:194:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleSimpleCondition"
    // InternalPolycreate.g:203:1: entryRuleSimpleCondition : ruleSimpleCondition EOF ;
    public final void entryRuleSimpleCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:204:1: ( ruleSimpleCondition EOF )
            // InternalPolycreate.g:205:1: ruleSimpleCondition EOF
            {
             before(grammarAccess.getSimpleConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleCondition();

            state._fsp--;

             after(grammarAccess.getSimpleConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleCondition"


    // $ANTLR start "ruleSimpleCondition"
    // InternalPolycreate.g:212:1: ruleSimpleCondition : ( ( rule__SimpleCondition__Group__0 ) ) ;
    public final void ruleSimpleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:216:2: ( ( ( rule__SimpleCondition__Group__0 ) ) )
            // InternalPolycreate.g:217:2: ( ( rule__SimpleCondition__Group__0 ) )
            {
            // InternalPolycreate.g:217:2: ( ( rule__SimpleCondition__Group__0 ) )
            // InternalPolycreate.g:218:3: ( rule__SimpleCondition__Group__0 )
            {
             before(grammarAccess.getSimpleConditionAccess().getGroup()); 
            // InternalPolycreate.g:219:3: ( rule__SimpleCondition__Group__0 )
            // InternalPolycreate.g:219:4: rule__SimpleCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleCondition"


    // $ANTLR start "entryRuleMoveAction"
    // InternalPolycreate.g:228:1: entryRuleMoveAction : ruleMoveAction EOF ;
    public final void entryRuleMoveAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:229:1: ( ruleMoveAction EOF )
            // InternalPolycreate.g:230:1: ruleMoveAction EOF
            {
             before(grammarAccess.getMoveActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveAction();

            state._fsp--;

             after(grammarAccess.getMoveActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveAction"


    // $ANTLR start "ruleMoveAction"
    // InternalPolycreate.g:237:1: ruleMoveAction : ( ( rule__MoveAction__Group__0 ) ) ;
    public final void ruleMoveAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:241:2: ( ( ( rule__MoveAction__Group__0 ) ) )
            // InternalPolycreate.g:242:2: ( ( rule__MoveAction__Group__0 ) )
            {
            // InternalPolycreate.g:242:2: ( ( rule__MoveAction__Group__0 ) )
            // InternalPolycreate.g:243:3: ( rule__MoveAction__Group__0 )
            {
             before(grammarAccess.getMoveActionAccess().getGroup()); 
            // InternalPolycreate.g:244:3: ( rule__MoveAction__Group__0 )
            // InternalPolycreate.g:244:4: rule__MoveAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveAction"


    // $ANTLR start "entryRuleTurnAction"
    // InternalPolycreate.g:253:1: entryRuleTurnAction : ruleTurnAction EOF ;
    public final void entryRuleTurnAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:254:1: ( ruleTurnAction EOF )
            // InternalPolycreate.g:255:1: ruleTurnAction EOF
            {
             before(grammarAccess.getTurnActionRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnAction();

            state._fsp--;

             after(grammarAccess.getTurnActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnAction"


    // $ANTLR start "ruleTurnAction"
    // InternalPolycreate.g:262:1: ruleTurnAction : ( ( rule__TurnAction__Group__0 ) ) ;
    public final void ruleTurnAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:266:2: ( ( ( rule__TurnAction__Group__0 ) ) )
            // InternalPolycreate.g:267:2: ( ( rule__TurnAction__Group__0 ) )
            {
            // InternalPolycreate.g:267:2: ( ( rule__TurnAction__Group__0 ) )
            // InternalPolycreate.g:268:3: ( rule__TurnAction__Group__0 )
            {
             before(grammarAccess.getTurnActionAccess().getGroup()); 
            // InternalPolycreate.g:269:3: ( rule__TurnAction__Group__0 )
            // InternalPolycreate.g:269:4: rule__TurnAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnAction"


    // $ANTLR start "entryRuleEDouble"
    // InternalPolycreate.g:278:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPolycreate.g:279:1: ( ruleEDouble EOF )
            // InternalPolycreate.g:280:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalPolycreate.g:287:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:291:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPolycreate.g:292:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPolycreate.g:292:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPolycreate.g:293:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPolycreate.g:294:3: ( rule__EDouble__Group__0 )
            // InternalPolycreate.g:294:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleDETECTION"
    // InternalPolycreate.g:303:1: ruleDETECTION : ( ( rule__DETECTION__Alternatives ) ) ;
    public final void ruleDETECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:307:1: ( ( ( rule__DETECTION__Alternatives ) ) )
            // InternalPolycreate.g:308:2: ( ( rule__DETECTION__Alternatives ) )
            {
            // InternalPolycreate.g:308:2: ( ( rule__DETECTION__Alternatives ) )
            // InternalPolycreate.g:309:3: ( rule__DETECTION__Alternatives )
            {
             before(grammarAccess.getDETECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:310:3: ( rule__DETECTION__Alternatives )
            // InternalPolycreate.g:310:4: rule__DETECTION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DETECTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDETECTIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDETECTION"


    // $ANTLR start "ruleDIRECTION"
    // InternalPolycreate.g:319:1: ruleDIRECTION : ( ( rule__DIRECTION__Alternatives ) ) ;
    public final void ruleDIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:323:1: ( ( ( rule__DIRECTION__Alternatives ) ) )
            // InternalPolycreate.g:324:2: ( ( rule__DIRECTION__Alternatives ) )
            {
            // InternalPolycreate.g:324:2: ( ( rule__DIRECTION__Alternatives ) )
            // InternalPolycreate.g:325:3: ( rule__DIRECTION__Alternatives )
            {
             before(grammarAccess.getDIRECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:326:3: ( rule__DIRECTION__Alternatives )
            // InternalPolycreate.g:326:4: rule__DIRECTION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DIRECTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDIRECTIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDIRECTION"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPolycreate.g:334:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:338:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPolycreate.g:339:2: ( RULE_STRING )
                    {
                    // InternalPolycreate.g:339:2: ( RULE_STRING )
                    // InternalPolycreate.g:340:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:345:2: ( RULE_ID )
                    {
                    // InternalPolycreate.g:345:2: ( RULE_ID )
                    // InternalPolycreate.g:346:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalPolycreate.g:355:1: rule__Action__Alternatives : ( ( ruleMoveAction ) | ( ruleTurnAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:359:1: ( ( ruleMoveAction ) | ( ruleTurnAction ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPolycreate.g:360:2: ( ruleMoveAction )
                    {
                    // InternalPolycreate.g:360:2: ( ruleMoveAction )
                    // InternalPolycreate.g:361:3: ruleMoveAction
                    {
                     before(grammarAccess.getActionAccess().getMoveActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMoveActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:366:2: ( ruleTurnAction )
                    {
                    // InternalPolycreate.g:366:2: ( ruleTurnAction )
                    // InternalPolycreate.g:367:3: ruleTurnAction
                    {
                     before(grammarAccess.getActionAccess().getTurnActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTurnActionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalPolycreate.g:376:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:380:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPolycreate.g:381:2: ( 'E' )
                    {
                    // InternalPolycreate.g:381:2: ( 'E' )
                    // InternalPolycreate.g:382:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:387:2: ( 'e' )
                    {
                    // InternalPolycreate.g:387:2: ( 'e' )
                    // InternalPolycreate.g:388:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__DETECTION__Alternatives"
    // InternalPolycreate.g:397:1: rule__DETECTION__Alternatives : ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) );
    public final void rule__DETECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:401:1: ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPolycreate.g:402:2: ( ( 'COLLISION_LEFT' ) )
                    {
                    // InternalPolycreate.g:402:2: ( ( 'COLLISION_LEFT' ) )
                    // InternalPolycreate.g:403:3: ( 'COLLISION_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:404:3: ( 'COLLISION_LEFT' )
                    // InternalPolycreate.g:404:4: 'COLLISION_LEFT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:408:2: ( ( 'COLLISION_RIGHT' ) )
                    {
                    // InternalPolycreate.g:408:2: ( ( 'COLLISION_RIGHT' ) )
                    // InternalPolycreate.g:409:3: ( 'COLLISION_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:410:3: ( 'COLLISION_RIGHT' )
                    // InternalPolycreate.g:410:4: 'COLLISION_RIGHT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:414:2: ( ( 'VIRTUAL_WALL' ) )
                    {
                    // InternalPolycreate.g:414:2: ( ( 'VIRTUAL_WALL' ) )
                    // InternalPolycreate.g:415:3: ( 'VIRTUAL_WALL' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 
                    // InternalPolycreate.g:416:3: ( 'VIRTUAL_WALL' )
                    // InternalPolycreate.g:416:4: 'VIRTUAL_WALL'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:420:2: ( ( 'CLIFF_LEFT' ) )
                    {
                    // InternalPolycreate.g:420:2: ( ( 'CLIFF_LEFT' ) )
                    // InternalPolycreate.g:421:3: ( 'CLIFF_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 
                    // InternalPolycreate.g:422:3: ( 'CLIFF_LEFT' )
                    // InternalPolycreate.g:422:4: 'CLIFF_LEFT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:426:2: ( ( 'CLIFF_RIGHT' ) )
                    {
                    // InternalPolycreate.g:426:2: ( ( 'CLIFF_RIGHT' ) )
                    // InternalPolycreate.g:427:3: ( 'CLIFF_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 
                    // InternalPolycreate.g:428:3: ( 'CLIFF_RIGHT' )
                    // InternalPolycreate.g:428:4: 'CLIFF_RIGHT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:432:2: ( ( 'CLIFF_FRONT' ) )
                    {
                    // InternalPolycreate.g:432:2: ( ( 'CLIFF_FRONT' ) )
                    // InternalPolycreate.g:433:3: ( 'CLIFF_FRONT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_FRONTEnumLiteralDeclaration_5()); 
                    // InternalPolycreate.g:434:3: ( 'CLIFF_FRONT' )
                    // InternalPolycreate.g:434:4: 'CLIFF_FRONT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_FRONTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DETECTION__Alternatives"


    // $ANTLR start "rule__DIRECTION__Alternatives"
    // InternalPolycreate.g:442:1: rule__DIRECTION__Alternatives : ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) );
    public final void rule__DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:446:1: ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPolycreate.g:447:2: ( ( 'FORWARD' ) )
                    {
                    // InternalPolycreate.g:447:2: ( ( 'FORWARD' ) )
                    // InternalPolycreate.g:448:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:449:3: ( 'FORWARD' )
                    // InternalPolycreate.g:449:4: 'FORWARD'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:453:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalPolycreate.g:453:2: ( ( 'BACKWARD' ) )
                    // InternalPolycreate.g:454:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:455:3: ( 'BACKWARD' )
                    // InternalPolycreate.g:455:4: 'BACKWARD'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDIRECTIONAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIRECTION__Alternatives"


    // $ANTLR start "rule__RobotProgram__Group__0"
    // InternalPolycreate.g:463:1: rule__RobotProgram__Group__0 : rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 ;
    public final void rule__RobotProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:467:1: ( rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 )
            // InternalPolycreate.g:468:2: rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RobotProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__0"


    // $ANTLR start "rule__RobotProgram__Group__0__Impl"
    // InternalPolycreate.g:475:1: rule__RobotProgram__Group__0__Impl : ( () ) ;
    public final void rule__RobotProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:479:1: ( ( () ) )
            // InternalPolycreate.g:480:1: ( () )
            {
            // InternalPolycreate.g:480:1: ( () )
            // InternalPolycreate.g:481:2: ()
            {
             before(grammarAccess.getRobotProgramAccess().getRobotProgramAction_0()); 
            // InternalPolycreate.g:482:2: ()
            // InternalPolycreate.g:482:3: 
            {
            }

             after(grammarAccess.getRobotProgramAccess().getRobotProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__0__Impl"


    // $ANTLR start "rule__RobotProgram__Group__1"
    // InternalPolycreate.g:490:1: rule__RobotProgram__Group__1 : rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 ;
    public final void rule__RobotProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:494:1: ( rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 )
            // InternalPolycreate.g:495:2: rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RobotProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__1"


    // $ANTLR start "rule__RobotProgram__Group__1__Impl"
    // InternalPolycreate.g:502:1: rule__RobotProgram__Group__1__Impl : ( 'RobotProgram' ) ;
    public final void rule__RobotProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:506:1: ( ( 'RobotProgram' ) )
            // InternalPolycreate.g:507:1: ( 'RobotProgram' )
            {
            // InternalPolycreate.g:507:1: ( 'RobotProgram' )
            // InternalPolycreate.g:508:2: 'RobotProgram'
            {
             before(grammarAccess.getRobotProgramAccess().getRobotProgramKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRobotProgramAccess().getRobotProgramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__1__Impl"


    // $ANTLR start "rule__RobotProgram__Group__2"
    // InternalPolycreate.g:517:1: rule__RobotProgram__Group__2 : rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 ;
    public final void rule__RobotProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:521:1: ( rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 )
            // InternalPolycreate.g:522:2: rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RobotProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__2"


    // $ANTLR start "rule__RobotProgram__Group__2__Impl"
    // InternalPolycreate.g:529:1: rule__RobotProgram__Group__2__Impl : ( ( rule__RobotProgram__NameAssignment_2 ) ) ;
    public final void rule__RobotProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:533:1: ( ( ( rule__RobotProgram__NameAssignment_2 ) ) )
            // InternalPolycreate.g:534:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:534:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            // InternalPolycreate.g:535:2: ( rule__RobotProgram__NameAssignment_2 )
            {
             before(grammarAccess.getRobotProgramAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:536:2: ( rule__RobotProgram__NameAssignment_2 )
            // InternalPolycreate.g:536:3: rule__RobotProgram__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotProgram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotProgramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__2__Impl"


    // $ANTLR start "rule__RobotProgram__Group__3"
    // InternalPolycreate.g:544:1: rule__RobotProgram__Group__3 : rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 ;
    public final void rule__RobotProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:548:1: ( rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 )
            // InternalPolycreate.g:549:2: rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RobotProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__3"


    // $ANTLR start "rule__RobotProgram__Group__3__Impl"
    // InternalPolycreate.g:556:1: rule__RobotProgram__Group__3__Impl : ( ( rule__RobotProgram__InitialStateAssignment_3 ) ) ;
    public final void rule__RobotProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:560:1: ( ( ( rule__RobotProgram__InitialStateAssignment_3 ) ) )
            // InternalPolycreate.g:561:1: ( ( rule__RobotProgram__InitialStateAssignment_3 ) )
            {
            // InternalPolycreate.g:561:1: ( ( rule__RobotProgram__InitialStateAssignment_3 ) )
            // InternalPolycreate.g:562:2: ( rule__RobotProgram__InitialStateAssignment_3 )
            {
             before(grammarAccess.getRobotProgramAccess().getInitialStateAssignment_3()); 
            // InternalPolycreate.g:563:2: ( rule__RobotProgram__InitialStateAssignment_3 )
            // InternalPolycreate.g:563:3: rule__RobotProgram__InitialStateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RobotProgram__InitialStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRobotProgramAccess().getInitialStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__3__Impl"


    // $ANTLR start "rule__RobotProgram__Group__4"
    // InternalPolycreate.g:571:1: rule__RobotProgram__Group__4 : rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 ;
    public final void rule__RobotProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:575:1: ( rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 )
            // InternalPolycreate.g:576:2: rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__RobotProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__4"


    // $ANTLR start "rule__RobotProgram__Group__4__Impl"
    // InternalPolycreate.g:583:1: rule__RobotProgram__Group__4__Impl : ( ( rule__RobotProgram__OwnedStatesAssignment_4 )* ) ;
    public final void rule__RobotProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:587:1: ( ( ( rule__RobotProgram__OwnedStatesAssignment_4 )* ) )
            // InternalPolycreate.g:588:1: ( ( rule__RobotProgram__OwnedStatesAssignment_4 )* )
            {
            // InternalPolycreate.g:588:1: ( ( rule__RobotProgram__OwnedStatesAssignment_4 )* )
            // InternalPolycreate.g:589:2: ( rule__RobotProgram__OwnedStatesAssignment_4 )*
            {
             before(grammarAccess.getRobotProgramAccess().getOwnedStatesAssignment_4()); 
            // InternalPolycreate.g:590:2: ( rule__RobotProgram__OwnedStatesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPolycreate.g:590:3: rule__RobotProgram__OwnedStatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotProgram__OwnedStatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRobotProgramAccess().getOwnedStatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__4__Impl"


    // $ANTLR start "rule__RobotProgram__Group__5"
    // InternalPolycreate.g:598:1: rule__RobotProgram__Group__5 : rule__RobotProgram__Group__5__Impl ;
    public final void rule__RobotProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:602:1: ( rule__RobotProgram__Group__5__Impl )
            // InternalPolycreate.g:603:2: rule__RobotProgram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__5"


    // $ANTLR start "rule__RobotProgram__Group__5__Impl"
    // InternalPolycreate.g:609:1: rule__RobotProgram__Group__5__Impl : ( ( rule__RobotProgram__GlobalTransitionsAssignment_5 )* ) ;
    public final void rule__RobotProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:613:1: ( ( ( rule__RobotProgram__GlobalTransitionsAssignment_5 )* ) )
            // InternalPolycreate.g:614:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_5 )* )
            {
            // InternalPolycreate.g:614:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_5 )* )
            // InternalPolycreate.g:615:2: ( rule__RobotProgram__GlobalTransitionsAssignment_5 )*
            {
             before(grammarAccess.getRobotProgramAccess().getGlobalTransitionsAssignment_5()); 
            // InternalPolycreate.g:616:2: ( rule__RobotProgram__GlobalTransitionsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPolycreate.g:616:3: rule__RobotProgram__GlobalTransitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RobotProgram__GlobalTransitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRobotProgramAccess().getGlobalTransitionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalPolycreate.g:625:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:629:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPolycreate.g:630:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalPolycreate.g:637:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:641:1: ( ( 'Transition' ) )
            // InternalPolycreate.g:642:1: ( 'Transition' )
            {
            // InternalPolycreate.g:642:1: ( 'Transition' )
            // InternalPolycreate.g:643:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalPolycreate.g:652:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:656:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPolycreate.g:657:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalPolycreate.g:664:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:668:1: ( ( '{' ) )
            // InternalPolycreate.g:669:1: ( '{' )
            {
            // InternalPolycreate.g:669:1: ( '{' )
            // InternalPolycreate.g:670:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalPolycreate.g:679:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:683:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalPolycreate.g:684:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalPolycreate.g:691:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:695:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalPolycreate.g:696:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalPolycreate.g:696:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalPolycreate.g:697:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalPolycreate.g:698:2: ( rule__Transition__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPolycreate.g:698:3: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalPolycreate.g:706:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:710:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalPolycreate.g:711:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalPolycreate.g:718:1: rule__Transition__Group__3__Impl : ( 'nextState' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:722:1: ( ( 'nextState' ) )
            // InternalPolycreate.g:723:1: ( 'nextState' )
            {
            // InternalPolycreate.g:723:1: ( 'nextState' )
            // InternalPolycreate.g:724:2: 'nextState'
            {
             before(grammarAccess.getTransitionAccess().getNextStateKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNextStateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalPolycreate.g:733:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:737:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalPolycreate.g:738:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalPolycreate.g:745:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__NextStateAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:749:1: ( ( ( rule__Transition__NextStateAssignment_4 ) ) )
            // InternalPolycreate.g:750:1: ( ( rule__Transition__NextStateAssignment_4 ) )
            {
            // InternalPolycreate.g:750:1: ( ( rule__Transition__NextStateAssignment_4 ) )
            // InternalPolycreate.g:751:2: ( rule__Transition__NextStateAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getNextStateAssignment_4()); 
            // InternalPolycreate.g:752:2: ( rule__Transition__NextStateAssignment_4 )
            // InternalPolycreate.g:752:3: rule__Transition__NextStateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalPolycreate.g:760:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:764:1: ( rule__Transition__Group__5__Impl )
            // InternalPolycreate.g:765:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalPolycreate.g:771:1: rule__Transition__Group__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:775:1: ( ( '}' ) )
            // InternalPolycreate.g:776:1: ( '}' )
            {
            // InternalPolycreate.g:776:1: ( '}' )
            // InternalPolycreate.g:777:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalPolycreate.g:787:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:791:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalPolycreate.g:792:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // InternalPolycreate.g:799:1: rule__Transition__Group_2__0__Impl : ( 'conditions' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:803:1: ( ( 'conditions' ) )
            // InternalPolycreate.g:804:1: ( 'conditions' )
            {
            // InternalPolycreate.g:804:1: ( 'conditions' )
            // InternalPolycreate.g:805:2: 'conditions'
            {
             before(grammarAccess.getTransitionAccess().getConditionsKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getConditionsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // InternalPolycreate.g:814:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:818:1: ( rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 )
            // InternalPolycreate.g:819:2: rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // InternalPolycreate.g:826:1: rule__Transition__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:830:1: ( ( '{' ) )
            // InternalPolycreate.g:831:1: ( '{' )
            {
            // InternalPolycreate.g:831:1: ( '{' )
            // InternalPolycreate.g:832:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_2__2"
    // InternalPolycreate.g:841:1: rule__Transition__Group_2__2 : rule__Transition__Group_2__2__Impl rule__Transition__Group_2__3 ;
    public final void rule__Transition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:845:1: ( rule__Transition__Group_2__2__Impl rule__Transition__Group_2__3 )
            // InternalPolycreate.g:846:2: rule__Transition__Group_2__2__Impl rule__Transition__Group_2__3
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__2"


    // $ANTLR start "rule__Transition__Group_2__2__Impl"
    // InternalPolycreate.g:853:1: rule__Transition__Group_2__2__Impl : ( ( rule__Transition__ConditionsAssignment_2_2 ) ) ;
    public final void rule__Transition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:857:1: ( ( ( rule__Transition__ConditionsAssignment_2_2 ) ) )
            // InternalPolycreate.g:858:1: ( ( rule__Transition__ConditionsAssignment_2_2 ) )
            {
            // InternalPolycreate.g:858:1: ( ( rule__Transition__ConditionsAssignment_2_2 ) )
            // InternalPolycreate.g:859:2: ( rule__Transition__ConditionsAssignment_2_2 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_2_2()); 
            // InternalPolycreate.g:860:2: ( rule__Transition__ConditionsAssignment_2_2 )
            // InternalPolycreate.g:860:3: rule__Transition__ConditionsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__2__Impl"


    // $ANTLR start "rule__Transition__Group_2__3"
    // InternalPolycreate.g:868:1: rule__Transition__Group_2__3 : rule__Transition__Group_2__3__Impl rule__Transition__Group_2__4 ;
    public final void rule__Transition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:872:1: ( rule__Transition__Group_2__3__Impl rule__Transition__Group_2__4 )
            // InternalPolycreate.g:873:2: rule__Transition__Group_2__3__Impl rule__Transition__Group_2__4
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__3"


    // $ANTLR start "rule__Transition__Group_2__3__Impl"
    // InternalPolycreate.g:880:1: rule__Transition__Group_2__3__Impl : ( ( rule__Transition__Group_2_3__0 )* ) ;
    public final void rule__Transition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:884:1: ( ( ( rule__Transition__Group_2_3__0 )* ) )
            // InternalPolycreate.g:885:1: ( ( rule__Transition__Group_2_3__0 )* )
            {
            // InternalPolycreate.g:885:1: ( ( rule__Transition__Group_2_3__0 )* )
            // InternalPolycreate.g:886:2: ( rule__Transition__Group_2_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_2_3()); 
            // InternalPolycreate.g:887:2: ( rule__Transition__Group_2_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPolycreate.g:887:3: rule__Transition__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Transition__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__3__Impl"


    // $ANTLR start "rule__Transition__Group_2__4"
    // InternalPolycreate.g:895:1: rule__Transition__Group_2__4 : rule__Transition__Group_2__4__Impl ;
    public final void rule__Transition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:899:1: ( rule__Transition__Group_2__4__Impl )
            // InternalPolycreate.g:900:2: rule__Transition__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__4"


    // $ANTLR start "rule__Transition__Group_2__4__Impl"
    // InternalPolycreate.g:906:1: rule__Transition__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Transition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:910:1: ( ( '}' ) )
            // InternalPolycreate.g:911:1: ( '}' )
            {
            // InternalPolycreate.g:911:1: ( '}' )
            // InternalPolycreate.g:912:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__4__Impl"


    // $ANTLR start "rule__Transition__Group_2_3__0"
    // InternalPolycreate.g:922:1: rule__Transition__Group_2_3__0 : rule__Transition__Group_2_3__0__Impl rule__Transition__Group_2_3__1 ;
    public final void rule__Transition__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:926:1: ( rule__Transition__Group_2_3__0__Impl rule__Transition__Group_2_3__1 )
            // InternalPolycreate.g:927:2: rule__Transition__Group_2_3__0__Impl rule__Transition__Group_2_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2_3__0"


    // $ANTLR start "rule__Transition__Group_2_3__0__Impl"
    // InternalPolycreate.g:934:1: rule__Transition__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:938:1: ( ( ',' ) )
            // InternalPolycreate.g:939:1: ( ',' )
            {
            // InternalPolycreate.g:939:1: ( ',' )
            // InternalPolycreate.g:940:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_2_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_2_3__1"
    // InternalPolycreate.g:949:1: rule__Transition__Group_2_3__1 : rule__Transition__Group_2_3__1__Impl ;
    public final void rule__Transition__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:953:1: ( rule__Transition__Group_2_3__1__Impl )
            // InternalPolycreate.g:954:2: rule__Transition__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2_3__1"


    // $ANTLR start "rule__Transition__Group_2_3__1__Impl"
    // InternalPolycreate.g:960:1: rule__Transition__Group_2_3__1__Impl : ( ( rule__Transition__ConditionsAssignment_2_3_1 ) ) ;
    public final void rule__Transition__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:964:1: ( ( ( rule__Transition__ConditionsAssignment_2_3_1 ) ) )
            // InternalPolycreate.g:965:1: ( ( rule__Transition__ConditionsAssignment_2_3_1 ) )
            {
            // InternalPolycreate.g:965:1: ( ( rule__Transition__ConditionsAssignment_2_3_1 ) )
            // InternalPolycreate.g:966:2: ( rule__Transition__ConditionsAssignment_2_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_2_3_1()); 
            // InternalPolycreate.g:967:2: ( rule__Transition__ConditionsAssignment_2_3_1 )
            // InternalPolycreate.g:967:3: rule__Transition__ConditionsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2_3__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalPolycreate.g:976:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:980:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalPolycreate.g:981:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalPolycreate.g:988:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:992:1: ( ( () ) )
            // InternalPolycreate.g:993:1: ( () )
            {
            // InternalPolycreate.g:993:1: ( () )
            // InternalPolycreate.g:994:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalPolycreate.g:995:2: ()
            // InternalPolycreate.g:995:3: 
            {
            }

             after(grammarAccess.getStateAccess().getStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalPolycreate.g:1003:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1007:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalPolycreate.g:1008:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalPolycreate.g:1015:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1019:1: ( ( 'State' ) )
            // InternalPolycreate.g:1020:1: ( 'State' )
            {
            // InternalPolycreate.g:1020:1: ( 'State' )
            // InternalPolycreate.g:1021:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalPolycreate.g:1030:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1034:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalPolycreate.g:1035:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalPolycreate.g:1042:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1046:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalPolycreate.g:1047:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:1047:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalPolycreate.g:1048:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:1049:2: ( rule__State__NameAssignment_2 )
            // InternalPolycreate.g:1049:3: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalPolycreate.g:1057:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1061:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalPolycreate.g:1062:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalPolycreate.g:1069:1: rule__State__Group__3__Impl : ( '{' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1073:1: ( ( '{' ) )
            // InternalPolycreate.g:1074:1: ( '{' )
            {
            // InternalPolycreate.g:1074:1: ( '{' )
            // InternalPolycreate.g:1075:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalPolycreate.g:1084:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1088:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalPolycreate.g:1089:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalPolycreate.g:1096:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1100:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalPolycreate.g:1101:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalPolycreate.g:1101:1: ( ( rule__State__Group_4__0 )? )
            // InternalPolycreate.g:1102:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalPolycreate.g:1103:2: ( rule__State__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPolycreate.g:1103:3: rule__State__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalPolycreate.g:1111:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1115:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalPolycreate.g:1116:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalPolycreate.g:1123:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1127:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalPolycreate.g:1128:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalPolycreate.g:1128:1: ( ( rule__State__Group_5__0 )? )
            // InternalPolycreate.g:1129:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalPolycreate.g:1130:2: ( rule__State__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPolycreate.g:1130:3: rule__State__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group__6"
    // InternalPolycreate.g:1138:1: rule__State__Group__6 : rule__State__Group__6__Impl ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1142:1: ( rule__State__Group__6__Impl )
            // InternalPolycreate.g:1143:2: rule__State__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // InternalPolycreate.g:1149:1: rule__State__Group__6__Impl : ( '}' ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1153:1: ( ( '}' ) )
            // InternalPolycreate.g:1154:1: ( '}' )
            {
            // InternalPolycreate.g:1154:1: ( '}' )
            // InternalPolycreate.g:1155:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // InternalPolycreate.g:1165:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1169:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalPolycreate.g:1170:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // InternalPolycreate.g:1177:1: rule__State__Group_4__0__Impl : ( 'actions' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1181:1: ( ( 'actions' ) )
            // InternalPolycreate.g:1182:1: ( 'actions' )
            {
            // InternalPolycreate.g:1182:1: ( 'actions' )
            // InternalPolycreate.g:1183:2: 'actions'
            {
             before(grammarAccess.getStateAccess().getActionsKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getActionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // InternalPolycreate.g:1192:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1196:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // InternalPolycreate.g:1197:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__State__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // InternalPolycreate.g:1204:1: rule__State__Group_4__1__Impl : ( '{' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1208:1: ( ( '{' ) )
            // InternalPolycreate.g:1209:1: ( '{' )
            {
            // InternalPolycreate.g:1209:1: ( '{' )
            // InternalPolycreate.g:1210:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__State__Group_4__2"
    // InternalPolycreate.g:1219:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1223:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // InternalPolycreate.g:1224:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__2"


    // $ANTLR start "rule__State__Group_4__2__Impl"
    // InternalPolycreate.g:1231:1: rule__State__Group_4__2__Impl : ( ( rule__State__ActionsAssignment_4_2 ) ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1235:1: ( ( ( rule__State__ActionsAssignment_4_2 ) ) )
            // InternalPolycreate.g:1236:1: ( ( rule__State__ActionsAssignment_4_2 ) )
            {
            // InternalPolycreate.g:1236:1: ( ( rule__State__ActionsAssignment_4_2 ) )
            // InternalPolycreate.g:1237:2: ( rule__State__ActionsAssignment_4_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_2()); 
            // InternalPolycreate.g:1238:2: ( rule__State__ActionsAssignment_4_2 )
            // InternalPolycreate.g:1238:3: rule__State__ActionsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__2__Impl"


    // $ANTLR start "rule__State__Group_4__3"
    // InternalPolycreate.g:1246:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl rule__State__Group_4__4 ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1250:1: ( rule__State__Group_4__3__Impl rule__State__Group_4__4 )
            // InternalPolycreate.g:1251:2: rule__State__Group_4__3__Impl rule__State__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__3"


    // $ANTLR start "rule__State__Group_4__3__Impl"
    // InternalPolycreate.g:1258:1: rule__State__Group_4__3__Impl : ( ( rule__State__Group_4_3__0 )* ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1262:1: ( ( ( rule__State__Group_4_3__0 )* ) )
            // InternalPolycreate.g:1263:1: ( ( rule__State__Group_4_3__0 )* )
            {
            // InternalPolycreate.g:1263:1: ( ( rule__State__Group_4_3__0 )* )
            // InternalPolycreate.g:1264:2: ( rule__State__Group_4_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4_3()); 
            // InternalPolycreate.g:1265:2: ( rule__State__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPolycreate.g:1265:3: rule__State__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__State__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__3__Impl"


    // $ANTLR start "rule__State__Group_4__4"
    // InternalPolycreate.g:1273:1: rule__State__Group_4__4 : rule__State__Group_4__4__Impl ;
    public final void rule__State__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1277:1: ( rule__State__Group_4__4__Impl )
            // InternalPolycreate.g:1278:2: rule__State__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__4"


    // $ANTLR start "rule__State__Group_4__4__Impl"
    // InternalPolycreate.g:1284:1: rule__State__Group_4__4__Impl : ( '}' ) ;
    public final void rule__State__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1288:1: ( ( '}' ) )
            // InternalPolycreate.g:1289:1: ( '}' )
            {
            // InternalPolycreate.g:1289:1: ( '}' )
            // InternalPolycreate.g:1290:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__4__Impl"


    // $ANTLR start "rule__State__Group_4_3__0"
    // InternalPolycreate.g:1300:1: rule__State__Group_4_3__0 : rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 ;
    public final void rule__State__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1304:1: ( rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1 )
            // InternalPolycreate.g:1305:2: rule__State__Group_4_3__0__Impl rule__State__Group_4_3__1
            {
            pushFollow(FOLLOW_16);
            rule__State__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__0"


    // $ANTLR start "rule__State__Group_4_3__0__Impl"
    // InternalPolycreate.g:1312:1: rule__State__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1316:1: ( ( ',' ) )
            // InternalPolycreate.g:1317:1: ( ',' )
            {
            // InternalPolycreate.g:1317:1: ( ',' )
            // InternalPolycreate.g:1318:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__0__Impl"


    // $ANTLR start "rule__State__Group_4_3__1"
    // InternalPolycreate.g:1327:1: rule__State__Group_4_3__1 : rule__State__Group_4_3__1__Impl ;
    public final void rule__State__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1331:1: ( rule__State__Group_4_3__1__Impl )
            // InternalPolycreate.g:1332:2: rule__State__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__1"


    // $ANTLR start "rule__State__Group_4_3__1__Impl"
    // InternalPolycreate.g:1338:1: rule__State__Group_4_3__1__Impl : ( ( rule__State__ActionsAssignment_4_3_1 ) ) ;
    public final void rule__State__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1342:1: ( ( ( rule__State__ActionsAssignment_4_3_1 ) ) )
            // InternalPolycreate.g:1343:1: ( ( rule__State__ActionsAssignment_4_3_1 ) )
            {
            // InternalPolycreate.g:1343:1: ( ( rule__State__ActionsAssignment_4_3_1 ) )
            // InternalPolycreate.g:1344:2: ( rule__State__ActionsAssignment_4_3_1 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_3_1()); 
            // InternalPolycreate.g:1345:2: ( rule__State__ActionsAssignment_4_3_1 )
            // InternalPolycreate.g:1345:3: rule__State__ActionsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4_3__1__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // InternalPolycreate.g:1354:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1358:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalPolycreate.g:1359:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0"


    // $ANTLR start "rule__State__Group_5__0__Impl"
    // InternalPolycreate.g:1366:1: rule__State__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1370:1: ( ( 'transitions' ) )
            // InternalPolycreate.g:1371:1: ( 'transitions' )
            {
            // InternalPolycreate.g:1371:1: ( 'transitions' )
            // InternalPolycreate.g:1372:2: 'transitions'
            {
             before(grammarAccess.getStateAccess().getTransitionsKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getTransitionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0__Impl"


    // $ANTLR start "rule__State__Group_5__1"
    // InternalPolycreate.g:1381:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1385:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalPolycreate.g:1386:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__State__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1"


    // $ANTLR start "rule__State__Group_5__1__Impl"
    // InternalPolycreate.g:1393:1: rule__State__Group_5__1__Impl : ( '{' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1397:1: ( ( '{' ) )
            // InternalPolycreate.g:1398:1: ( '{' )
            {
            // InternalPolycreate.g:1398:1: ( '{' )
            // InternalPolycreate.g:1399:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1__Impl"


    // $ANTLR start "rule__State__Group_5__2"
    // InternalPolycreate.g:1408:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1412:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalPolycreate.g:1413:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2"


    // $ANTLR start "rule__State__Group_5__2__Impl"
    // InternalPolycreate.g:1420:1: rule__State__Group_5__2__Impl : ( ( rule__State__TransitionsAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1424:1: ( ( ( rule__State__TransitionsAssignment_5_2 ) ) )
            // InternalPolycreate.g:1425:1: ( ( rule__State__TransitionsAssignment_5_2 ) )
            {
            // InternalPolycreate.g:1425:1: ( ( rule__State__TransitionsAssignment_5_2 ) )
            // InternalPolycreate.g:1426:2: ( rule__State__TransitionsAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_2()); 
            // InternalPolycreate.g:1427:2: ( rule__State__TransitionsAssignment_5_2 )
            // InternalPolycreate.g:1427:3: rule__State__TransitionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2__Impl"


    // $ANTLR start "rule__State__Group_5__3"
    // InternalPolycreate.g:1435:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1439:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalPolycreate.g:1440:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3"


    // $ANTLR start "rule__State__Group_5__3__Impl"
    // InternalPolycreate.g:1447:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1451:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // InternalPolycreate.g:1452:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // InternalPolycreate.g:1452:1: ( ( rule__State__Group_5_3__0 )* )
            // InternalPolycreate.g:1453:2: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // InternalPolycreate.g:1454:2: ( rule__State__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPolycreate.g:1454:3: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3__Impl"


    // $ANTLR start "rule__State__Group_5__4"
    // InternalPolycreate.g:1462:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1466:1: ( rule__State__Group_5__4__Impl )
            // InternalPolycreate.g:1467:2: rule__State__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4"


    // $ANTLR start "rule__State__Group_5__4__Impl"
    // InternalPolycreate.g:1473:1: rule__State__Group_5__4__Impl : ( '}' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1477:1: ( ( '}' ) )
            // InternalPolycreate.g:1478:1: ( '}' )
            {
            // InternalPolycreate.g:1478:1: ( '}' )
            // InternalPolycreate.g:1479:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4__Impl"


    // $ANTLR start "rule__State__Group_5_3__0"
    // InternalPolycreate.g:1489:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1493:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // InternalPolycreate.g:1494:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__State__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0"


    // $ANTLR start "rule__State__Group_5_3__0__Impl"
    // InternalPolycreate.g:1501:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1505:1: ( ( ',' ) )
            // InternalPolycreate.g:1506:1: ( ',' )
            {
            // InternalPolycreate.g:1506:1: ( ',' )
            // InternalPolycreate.g:1507:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0__Impl"


    // $ANTLR start "rule__State__Group_5_3__1"
    // InternalPolycreate.g:1516:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1520:1: ( rule__State__Group_5_3__1__Impl )
            // InternalPolycreate.g:1521:2: rule__State__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1"


    // $ANTLR start "rule__State__Group_5_3__1__Impl"
    // InternalPolycreate.g:1527:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__TransitionsAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1531:1: ( ( ( rule__State__TransitionsAssignment_5_3_1 ) ) )
            // InternalPolycreate.g:1532:1: ( ( rule__State__TransitionsAssignment_5_3_1 ) )
            {
            // InternalPolycreate.g:1532:1: ( ( rule__State__TransitionsAssignment_5_3_1 ) )
            // InternalPolycreate.g:1533:2: ( rule__State__TransitionsAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_3_1()); 
            // InternalPolycreate.g:1534:2: ( rule__State__TransitionsAssignment_5_3_1 )
            // InternalPolycreate.g:1534:3: rule__State__TransitionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__0"
    // InternalPolycreate.g:1543:1: rule__SimpleCondition__Group__0 : rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 ;
    public final void rule__SimpleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1547:1: ( rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 )
            // InternalPolycreate.g:1548:2: rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__0"


    // $ANTLR start "rule__SimpleCondition__Group__0__Impl"
    // InternalPolycreate.g:1555:1: rule__SimpleCondition__Group__0__Impl : ( () ) ;
    public final void rule__SimpleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1559:1: ( ( () ) )
            // InternalPolycreate.g:1560:1: ( () )
            {
            // InternalPolycreate.g:1560:1: ( () )
            // InternalPolycreate.g:1561:2: ()
            {
             before(grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0()); 
            // InternalPolycreate.g:1562:2: ()
            // InternalPolycreate.g:1562:3: 
            {
            }

             after(grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__0__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__1"
    // InternalPolycreate.g:1570:1: rule__SimpleCondition__Group__1 : rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 ;
    public final void rule__SimpleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1574:1: ( rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 )
            // InternalPolycreate.g:1575:2: rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SimpleCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__1"


    // $ANTLR start "rule__SimpleCondition__Group__1__Impl"
    // InternalPolycreate.g:1582:1: rule__SimpleCondition__Group__1__Impl : ( 'SimpleCondition' ) ;
    public final void rule__SimpleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1586:1: ( ( 'SimpleCondition' ) )
            // InternalPolycreate.g:1587:1: ( 'SimpleCondition' )
            {
            // InternalPolycreate.g:1587:1: ( 'SimpleCondition' )
            // InternalPolycreate.g:1588:2: 'SimpleCondition'
            {
             before(grammarAccess.getSimpleConditionAccess().getSimpleConditionKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSimpleConditionAccess().getSimpleConditionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__1__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__2"
    // InternalPolycreate.g:1597:1: rule__SimpleCondition__Group__2 : rule__SimpleCondition__Group__2__Impl rule__SimpleCondition__Group__3 ;
    public final void rule__SimpleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1601:1: ( rule__SimpleCondition__Group__2__Impl rule__SimpleCondition__Group__3 )
            // InternalPolycreate.g:1602:2: rule__SimpleCondition__Group__2__Impl rule__SimpleCondition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__SimpleCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__2"


    // $ANTLR start "rule__SimpleCondition__Group__2__Impl"
    // InternalPolycreate.g:1609:1: rule__SimpleCondition__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1613:1: ( ( '{' ) )
            // InternalPolycreate.g:1614:1: ( '{' )
            {
            // InternalPolycreate.g:1614:1: ( '{' )
            // InternalPolycreate.g:1615:2: '{'
            {
             before(grammarAccess.getSimpleConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSimpleConditionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__2__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__3"
    // InternalPolycreate.g:1624:1: rule__SimpleCondition__Group__3 : rule__SimpleCondition__Group__3__Impl rule__SimpleCondition__Group__4 ;
    public final void rule__SimpleCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1628:1: ( rule__SimpleCondition__Group__3__Impl rule__SimpleCondition__Group__4 )
            // InternalPolycreate.g:1629:2: rule__SimpleCondition__Group__3__Impl rule__SimpleCondition__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__SimpleCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__3"


    // $ANTLR start "rule__SimpleCondition__Group__3__Impl"
    // InternalPolycreate.g:1636:1: rule__SimpleCondition__Group__3__Impl : ( ( rule__SimpleCondition__Group_3__0 )? ) ;
    public final void rule__SimpleCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1640:1: ( ( ( rule__SimpleCondition__Group_3__0 )? ) )
            // InternalPolycreate.g:1641:1: ( ( rule__SimpleCondition__Group_3__0 )? )
            {
            // InternalPolycreate.g:1641:1: ( ( rule__SimpleCondition__Group_3__0 )? )
            // InternalPolycreate.g:1642:2: ( rule__SimpleCondition__Group_3__0 )?
            {
             before(grammarAccess.getSimpleConditionAccess().getGroup_3()); 
            // InternalPolycreate.g:1643:2: ( rule__SimpleCondition__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPolycreate.g:1643:3: rule__SimpleCondition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleCondition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleConditionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__3__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__4"
    // InternalPolycreate.g:1651:1: rule__SimpleCondition__Group__4 : rule__SimpleCondition__Group__4__Impl ;
    public final void rule__SimpleCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1655:1: ( rule__SimpleCondition__Group__4__Impl )
            // InternalPolycreate.g:1656:2: rule__SimpleCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__4"


    // $ANTLR start "rule__SimpleCondition__Group__4__Impl"
    // InternalPolycreate.g:1662:1: rule__SimpleCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1666:1: ( ( '}' ) )
            // InternalPolycreate.g:1667:1: ( '}' )
            {
            // InternalPolycreate.g:1667:1: ( '}' )
            // InternalPolycreate.g:1668:2: '}'
            {
             before(grammarAccess.getSimpleConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSimpleConditionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__4__Impl"


    // $ANTLR start "rule__SimpleCondition__Group_3__0"
    // InternalPolycreate.g:1678:1: rule__SimpleCondition__Group_3__0 : rule__SimpleCondition__Group_3__0__Impl rule__SimpleCondition__Group_3__1 ;
    public final void rule__SimpleCondition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1682:1: ( rule__SimpleCondition__Group_3__0__Impl rule__SimpleCondition__Group_3__1 )
            // InternalPolycreate.g:1683:2: rule__SimpleCondition__Group_3__0__Impl rule__SimpleCondition__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__SimpleCondition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group_3__0"


    // $ANTLR start "rule__SimpleCondition__Group_3__0__Impl"
    // InternalPolycreate.g:1690:1: rule__SimpleCondition__Group_3__0__Impl : ( 'detectionType' ) ;
    public final void rule__SimpleCondition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1694:1: ( ( 'detectionType' ) )
            // InternalPolycreate.g:1695:1: ( 'detectionType' )
            {
            // InternalPolycreate.g:1695:1: ( 'detectionType' )
            // InternalPolycreate.g:1696:2: 'detectionType'
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectionTypeKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSimpleConditionAccess().getDetectionTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleCondition__Group_3__1"
    // InternalPolycreate.g:1705:1: rule__SimpleCondition__Group_3__1 : rule__SimpleCondition__Group_3__1__Impl ;
    public final void rule__SimpleCondition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1709:1: ( rule__SimpleCondition__Group_3__1__Impl )
            // InternalPolycreate.g:1710:2: rule__SimpleCondition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group_3__1"


    // $ANTLR start "rule__SimpleCondition__Group_3__1__Impl"
    // InternalPolycreate.g:1716:1: rule__SimpleCondition__Group_3__1__Impl : ( ( rule__SimpleCondition__DetectionTypeAssignment_3_1 ) ) ;
    public final void rule__SimpleCondition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1720:1: ( ( ( rule__SimpleCondition__DetectionTypeAssignment_3_1 ) ) )
            // InternalPolycreate.g:1721:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_3_1 ) )
            {
            // InternalPolycreate.g:1721:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_3_1 ) )
            // InternalPolycreate.g:1722:2: ( rule__SimpleCondition__DetectionTypeAssignment_3_1 )
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectionTypeAssignment_3_1()); 
            // InternalPolycreate.g:1723:2: ( rule__SimpleCondition__DetectionTypeAssignment_3_1 )
            // InternalPolycreate.g:1723:3: rule__SimpleCondition__DetectionTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__DetectionTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConditionAccess().getDetectionTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group_3__1__Impl"


    // $ANTLR start "rule__MoveAction__Group__0"
    // InternalPolycreate.g:1732:1: rule__MoveAction__Group__0 : rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 ;
    public final void rule__MoveAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1736:1: ( rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 )
            // InternalPolycreate.g:1737:2: rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MoveAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__0"


    // $ANTLR start "rule__MoveAction__Group__0__Impl"
    // InternalPolycreate.g:1744:1: rule__MoveAction__Group__0__Impl : ( () ) ;
    public final void rule__MoveAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1748:1: ( ( () ) )
            // InternalPolycreate.g:1749:1: ( () )
            {
            // InternalPolycreate.g:1749:1: ( () )
            // InternalPolycreate.g:1750:2: ()
            {
             before(grammarAccess.getMoveActionAccess().getMoveActionAction_0()); 
            // InternalPolycreate.g:1751:2: ()
            // InternalPolycreate.g:1751:3: 
            {
            }

             after(grammarAccess.getMoveActionAccess().getMoveActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__0__Impl"


    // $ANTLR start "rule__MoveAction__Group__1"
    // InternalPolycreate.g:1759:1: rule__MoveAction__Group__1 : rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 ;
    public final void rule__MoveAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1763:1: ( rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 )
            // InternalPolycreate.g:1764:2: rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MoveAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__1"


    // $ANTLR start "rule__MoveAction__Group__1__Impl"
    // InternalPolycreate.g:1771:1: rule__MoveAction__Group__1__Impl : ( 'MoveAction' ) ;
    public final void rule__MoveAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1775:1: ( ( 'MoveAction' ) )
            // InternalPolycreate.g:1776:1: ( 'MoveAction' )
            {
            // InternalPolycreate.g:1776:1: ( 'MoveAction' )
            // InternalPolycreate.g:1777:2: 'MoveAction'
            {
             before(grammarAccess.getMoveActionAccess().getMoveActionKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getMoveActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__1__Impl"


    // $ANTLR start "rule__MoveAction__Group__2"
    // InternalPolycreate.g:1786:1: rule__MoveAction__Group__2 : rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 ;
    public final void rule__MoveAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1790:1: ( rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 )
            // InternalPolycreate.g:1791:2: rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__MoveAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__2"


    // $ANTLR start "rule__MoveAction__Group__2__Impl"
    // InternalPolycreate.g:1798:1: rule__MoveAction__Group__2__Impl : ( '{' ) ;
    public final void rule__MoveAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1802:1: ( ( '{' ) )
            // InternalPolycreate.g:1803:1: ( '{' )
            {
            // InternalPolycreate.g:1803:1: ( '{' )
            // InternalPolycreate.g:1804:2: '{'
            {
             before(grammarAccess.getMoveActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__2__Impl"


    // $ANTLR start "rule__MoveAction__Group__3"
    // InternalPolycreate.g:1813:1: rule__MoveAction__Group__3 : rule__MoveAction__Group__3__Impl rule__MoveAction__Group__4 ;
    public final void rule__MoveAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1817:1: ( rule__MoveAction__Group__3__Impl rule__MoveAction__Group__4 )
            // InternalPolycreate.g:1818:2: rule__MoveAction__Group__3__Impl rule__MoveAction__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__MoveAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__3"


    // $ANTLR start "rule__MoveAction__Group__3__Impl"
    // InternalPolycreate.g:1825:1: rule__MoveAction__Group__3__Impl : ( ( rule__MoveAction__Group_3__0 )? ) ;
    public final void rule__MoveAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1829:1: ( ( ( rule__MoveAction__Group_3__0 )? ) )
            // InternalPolycreate.g:1830:1: ( ( rule__MoveAction__Group_3__0 )? )
            {
            // InternalPolycreate.g:1830:1: ( ( rule__MoveAction__Group_3__0 )? )
            // InternalPolycreate.g:1831:2: ( rule__MoveAction__Group_3__0 )?
            {
             before(grammarAccess.getMoveActionAccess().getGroup_3()); 
            // InternalPolycreate.g:1832:2: ( rule__MoveAction__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPolycreate.g:1832:3: rule__MoveAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoveAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__3__Impl"


    // $ANTLR start "rule__MoveAction__Group__4"
    // InternalPolycreate.g:1840:1: rule__MoveAction__Group__4 : rule__MoveAction__Group__4__Impl rule__MoveAction__Group__5 ;
    public final void rule__MoveAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1844:1: ( rule__MoveAction__Group__4__Impl rule__MoveAction__Group__5 )
            // InternalPolycreate.g:1845:2: rule__MoveAction__Group__4__Impl rule__MoveAction__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__MoveAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__4"


    // $ANTLR start "rule__MoveAction__Group__4__Impl"
    // InternalPolycreate.g:1852:1: rule__MoveAction__Group__4__Impl : ( ( rule__MoveAction__Group_4__0 )? ) ;
    public final void rule__MoveAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1856:1: ( ( ( rule__MoveAction__Group_4__0 )? ) )
            // InternalPolycreate.g:1857:1: ( ( rule__MoveAction__Group_4__0 )? )
            {
            // InternalPolycreate.g:1857:1: ( ( rule__MoveAction__Group_4__0 )? )
            // InternalPolycreate.g:1858:2: ( rule__MoveAction__Group_4__0 )?
            {
             before(grammarAccess.getMoveActionAccess().getGroup_4()); 
            // InternalPolycreate.g:1859:2: ( rule__MoveAction__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPolycreate.g:1859:3: rule__MoveAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoveAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__4__Impl"


    // $ANTLR start "rule__MoveAction__Group__5"
    // InternalPolycreate.g:1867:1: rule__MoveAction__Group__5 : rule__MoveAction__Group__5__Impl ;
    public final void rule__MoveAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1871:1: ( rule__MoveAction__Group__5__Impl )
            // InternalPolycreate.g:1872:2: rule__MoveAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__5"


    // $ANTLR start "rule__MoveAction__Group__5__Impl"
    // InternalPolycreate.g:1878:1: rule__MoveAction__Group__5__Impl : ( '}' ) ;
    public final void rule__MoveAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1882:1: ( ( '}' ) )
            // InternalPolycreate.g:1883:1: ( '}' )
            {
            // InternalPolycreate.g:1883:1: ( '}' )
            // InternalPolycreate.g:1884:2: '}'
            {
             before(grammarAccess.getMoveActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group__5__Impl"


    // $ANTLR start "rule__MoveAction__Group_3__0"
    // InternalPolycreate.g:1894:1: rule__MoveAction__Group_3__0 : rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1 ;
    public final void rule__MoveAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1898:1: ( rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1 )
            // InternalPolycreate.g:1899:2: rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__MoveAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_3__0"


    // $ANTLR start "rule__MoveAction__Group_3__0__Impl"
    // InternalPolycreate.g:1906:1: rule__MoveAction__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__MoveAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1910:1: ( ( 'duration' ) )
            // InternalPolycreate.g:1911:1: ( 'duration' )
            {
            // InternalPolycreate.g:1911:1: ( 'duration' )
            // InternalPolycreate.g:1912:2: 'duration'
            {
             before(grammarAccess.getMoveActionAccess().getDurationKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_3__0__Impl"


    // $ANTLR start "rule__MoveAction__Group_3__1"
    // InternalPolycreate.g:1921:1: rule__MoveAction__Group_3__1 : rule__MoveAction__Group_3__1__Impl ;
    public final void rule__MoveAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1925:1: ( rule__MoveAction__Group_3__1__Impl )
            // InternalPolycreate.g:1926:2: rule__MoveAction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_3__1"


    // $ANTLR start "rule__MoveAction__Group_3__1__Impl"
    // InternalPolycreate.g:1932:1: rule__MoveAction__Group_3__1__Impl : ( ( rule__MoveAction__DurationAssignment_3_1 ) ) ;
    public final void rule__MoveAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1936:1: ( ( ( rule__MoveAction__DurationAssignment_3_1 ) ) )
            // InternalPolycreate.g:1937:1: ( ( rule__MoveAction__DurationAssignment_3_1 ) )
            {
            // InternalPolycreate.g:1937:1: ( ( rule__MoveAction__DurationAssignment_3_1 ) )
            // InternalPolycreate.g:1938:2: ( rule__MoveAction__DurationAssignment_3_1 )
            {
             before(grammarAccess.getMoveActionAccess().getDurationAssignment_3_1()); 
            // InternalPolycreate.g:1939:2: ( rule__MoveAction__DurationAssignment_3_1 )
            // InternalPolycreate.g:1939:3: rule__MoveAction__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveActionAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_3__1__Impl"


    // $ANTLR start "rule__MoveAction__Group_4__0"
    // InternalPolycreate.g:1948:1: rule__MoveAction__Group_4__0 : rule__MoveAction__Group_4__0__Impl rule__MoveAction__Group_4__1 ;
    public final void rule__MoveAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1952:1: ( rule__MoveAction__Group_4__0__Impl rule__MoveAction__Group_4__1 )
            // InternalPolycreate.g:1953:2: rule__MoveAction__Group_4__0__Impl rule__MoveAction__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__MoveAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveAction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_4__0"


    // $ANTLR start "rule__MoveAction__Group_4__0__Impl"
    // InternalPolycreate.g:1960:1: rule__MoveAction__Group_4__0__Impl : ( 'direction' ) ;
    public final void rule__MoveAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1964:1: ( ( 'direction' ) )
            // InternalPolycreate.g:1965:1: ( 'direction' )
            {
            // InternalPolycreate.g:1965:1: ( 'direction' )
            // InternalPolycreate.g:1966:2: 'direction'
            {
             before(grammarAccess.getMoveActionAccess().getDirectionKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getDirectionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_4__0__Impl"


    // $ANTLR start "rule__MoveAction__Group_4__1"
    // InternalPolycreate.g:1975:1: rule__MoveAction__Group_4__1 : rule__MoveAction__Group_4__1__Impl ;
    public final void rule__MoveAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1979:1: ( rule__MoveAction__Group_4__1__Impl )
            // InternalPolycreate.g:1980:2: rule__MoveAction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_4__1"


    // $ANTLR start "rule__MoveAction__Group_4__1__Impl"
    // InternalPolycreate.g:1986:1: rule__MoveAction__Group_4__1__Impl : ( ( rule__MoveAction__DirectionAssignment_4_1 ) ) ;
    public final void rule__MoveAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1990:1: ( ( ( rule__MoveAction__DirectionAssignment_4_1 ) ) )
            // InternalPolycreate.g:1991:1: ( ( rule__MoveAction__DirectionAssignment_4_1 ) )
            {
            // InternalPolycreate.g:1991:1: ( ( rule__MoveAction__DirectionAssignment_4_1 ) )
            // InternalPolycreate.g:1992:2: ( rule__MoveAction__DirectionAssignment_4_1 )
            {
             before(grammarAccess.getMoveActionAccess().getDirectionAssignment_4_1()); 
            // InternalPolycreate.g:1993:2: ( rule__MoveAction__DirectionAssignment_4_1 )
            // InternalPolycreate.g:1993:3: rule__MoveAction__DirectionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__DirectionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveActionAccess().getDirectionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__Group_4__1__Impl"


    // $ANTLR start "rule__TurnAction__Group__0"
    // InternalPolycreate.g:2002:1: rule__TurnAction__Group__0 : rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 ;
    public final void rule__TurnAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2006:1: ( rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 )
            // InternalPolycreate.g:2007:2: rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TurnAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__0"


    // $ANTLR start "rule__TurnAction__Group__0__Impl"
    // InternalPolycreate.g:2014:1: rule__TurnAction__Group__0__Impl : ( () ) ;
    public final void rule__TurnAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2018:1: ( ( () ) )
            // InternalPolycreate.g:2019:1: ( () )
            {
            // InternalPolycreate.g:2019:1: ( () )
            // InternalPolycreate.g:2020:2: ()
            {
             before(grammarAccess.getTurnActionAccess().getTurnActionAction_0()); 
            // InternalPolycreate.g:2021:2: ()
            // InternalPolycreate.g:2021:3: 
            {
            }

             after(grammarAccess.getTurnActionAccess().getTurnActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__0__Impl"


    // $ANTLR start "rule__TurnAction__Group__1"
    // InternalPolycreate.g:2029:1: rule__TurnAction__Group__1 : rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 ;
    public final void rule__TurnAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2033:1: ( rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 )
            // InternalPolycreate.g:2034:2: rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TurnAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__1"


    // $ANTLR start "rule__TurnAction__Group__1__Impl"
    // InternalPolycreate.g:2041:1: rule__TurnAction__Group__1__Impl : ( 'TurnAction' ) ;
    public final void rule__TurnAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2045:1: ( ( 'TurnAction' ) )
            // InternalPolycreate.g:2046:1: ( 'TurnAction' )
            {
            // InternalPolycreate.g:2046:1: ( 'TurnAction' )
            // InternalPolycreate.g:2047:2: 'TurnAction'
            {
             before(grammarAccess.getTurnActionAccess().getTurnActionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getTurnActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__1__Impl"


    // $ANTLR start "rule__TurnAction__Group__2"
    // InternalPolycreate.g:2056:1: rule__TurnAction__Group__2 : rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 ;
    public final void rule__TurnAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2060:1: ( rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 )
            // InternalPolycreate.g:2061:2: rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__TurnAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__2"


    // $ANTLR start "rule__TurnAction__Group__2__Impl"
    // InternalPolycreate.g:2068:1: rule__TurnAction__Group__2__Impl : ( '{' ) ;
    public final void rule__TurnAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2072:1: ( ( '{' ) )
            // InternalPolycreate.g:2073:1: ( '{' )
            {
            // InternalPolycreate.g:2073:1: ( '{' )
            // InternalPolycreate.g:2074:2: '{'
            {
             before(grammarAccess.getTurnActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__2__Impl"


    // $ANTLR start "rule__TurnAction__Group__3"
    // InternalPolycreate.g:2083:1: rule__TurnAction__Group__3 : rule__TurnAction__Group__3__Impl rule__TurnAction__Group__4 ;
    public final void rule__TurnAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2087:1: ( rule__TurnAction__Group__3__Impl rule__TurnAction__Group__4 )
            // InternalPolycreate.g:2088:2: rule__TurnAction__Group__3__Impl rule__TurnAction__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__TurnAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__3"


    // $ANTLR start "rule__TurnAction__Group__3__Impl"
    // InternalPolycreate.g:2095:1: rule__TurnAction__Group__3__Impl : ( ( rule__TurnAction__Group_3__0 )? ) ;
    public final void rule__TurnAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2099:1: ( ( ( rule__TurnAction__Group_3__0 )? ) )
            // InternalPolycreate.g:2100:1: ( ( rule__TurnAction__Group_3__0 )? )
            {
            // InternalPolycreate.g:2100:1: ( ( rule__TurnAction__Group_3__0 )? )
            // InternalPolycreate.g:2101:2: ( rule__TurnAction__Group_3__0 )?
            {
             before(grammarAccess.getTurnActionAccess().getGroup_3()); 
            // InternalPolycreate.g:2102:2: ( rule__TurnAction__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPolycreate.g:2102:3: rule__TurnAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TurnAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurnActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__3__Impl"


    // $ANTLR start "rule__TurnAction__Group__4"
    // InternalPolycreate.g:2110:1: rule__TurnAction__Group__4 : rule__TurnAction__Group__4__Impl rule__TurnAction__Group__5 ;
    public final void rule__TurnAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2114:1: ( rule__TurnAction__Group__4__Impl rule__TurnAction__Group__5 )
            // InternalPolycreate.g:2115:2: rule__TurnAction__Group__4__Impl rule__TurnAction__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__TurnAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__4"


    // $ANTLR start "rule__TurnAction__Group__4__Impl"
    // InternalPolycreate.g:2122:1: rule__TurnAction__Group__4__Impl : ( ( rule__TurnAction__Group_4__0 )? ) ;
    public final void rule__TurnAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2126:1: ( ( ( rule__TurnAction__Group_4__0 )? ) )
            // InternalPolycreate.g:2127:1: ( ( rule__TurnAction__Group_4__0 )? )
            {
            // InternalPolycreate.g:2127:1: ( ( rule__TurnAction__Group_4__0 )? )
            // InternalPolycreate.g:2128:2: ( rule__TurnAction__Group_4__0 )?
            {
             before(grammarAccess.getTurnActionAccess().getGroup_4()); 
            // InternalPolycreate.g:2129:2: ( rule__TurnAction__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPolycreate.g:2129:3: rule__TurnAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TurnAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurnActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__4__Impl"


    // $ANTLR start "rule__TurnAction__Group__5"
    // InternalPolycreate.g:2137:1: rule__TurnAction__Group__5 : rule__TurnAction__Group__5__Impl ;
    public final void rule__TurnAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2141:1: ( rule__TurnAction__Group__5__Impl )
            // InternalPolycreate.g:2142:2: rule__TurnAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__5"


    // $ANTLR start "rule__TurnAction__Group__5__Impl"
    // InternalPolycreate.g:2148:1: rule__TurnAction__Group__5__Impl : ( '}' ) ;
    public final void rule__TurnAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2152:1: ( ( '}' ) )
            // InternalPolycreate.g:2153:1: ( '}' )
            {
            // InternalPolycreate.g:2153:1: ( '}' )
            // InternalPolycreate.g:2154:2: '}'
            {
             before(grammarAccess.getTurnActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group__5__Impl"


    // $ANTLR start "rule__TurnAction__Group_3__0"
    // InternalPolycreate.g:2164:1: rule__TurnAction__Group_3__0 : rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 ;
    public final void rule__TurnAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2168:1: ( rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 )
            // InternalPolycreate.g:2169:2: rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__TurnAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_3__0"


    // $ANTLR start "rule__TurnAction__Group_3__0__Impl"
    // InternalPolycreate.g:2176:1: rule__TurnAction__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__TurnAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2180:1: ( ( 'duration' ) )
            // InternalPolycreate.g:2181:1: ( 'duration' )
            {
            // InternalPolycreate.g:2181:1: ( 'duration' )
            // InternalPolycreate.g:2182:2: 'duration'
            {
             before(grammarAccess.getTurnActionAccess().getDurationKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_3__0__Impl"


    // $ANTLR start "rule__TurnAction__Group_3__1"
    // InternalPolycreate.g:2191:1: rule__TurnAction__Group_3__1 : rule__TurnAction__Group_3__1__Impl ;
    public final void rule__TurnAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2195:1: ( rule__TurnAction__Group_3__1__Impl )
            // InternalPolycreate.g:2196:2: rule__TurnAction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_3__1"


    // $ANTLR start "rule__TurnAction__Group_3__1__Impl"
    // InternalPolycreate.g:2202:1: rule__TurnAction__Group_3__1__Impl : ( ( rule__TurnAction__DurationAssignment_3_1 ) ) ;
    public final void rule__TurnAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2206:1: ( ( ( rule__TurnAction__DurationAssignment_3_1 ) ) )
            // InternalPolycreate.g:2207:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            {
            // InternalPolycreate.g:2207:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            // InternalPolycreate.g:2208:2: ( rule__TurnAction__DurationAssignment_3_1 )
            {
             before(grammarAccess.getTurnActionAccess().getDurationAssignment_3_1()); 
            // InternalPolycreate.g:2209:2: ( rule__TurnAction__DurationAssignment_3_1 )
            // InternalPolycreate.g:2209:3: rule__TurnAction__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnActionAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_3__1__Impl"


    // $ANTLR start "rule__TurnAction__Group_4__0"
    // InternalPolycreate.g:2218:1: rule__TurnAction__Group_4__0 : rule__TurnAction__Group_4__0__Impl rule__TurnAction__Group_4__1 ;
    public final void rule__TurnAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2222:1: ( rule__TurnAction__Group_4__0__Impl rule__TurnAction__Group_4__1 )
            // InternalPolycreate.g:2223:2: rule__TurnAction__Group_4__0__Impl rule__TurnAction__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__TurnAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnAction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_4__0"


    // $ANTLR start "rule__TurnAction__Group_4__0__Impl"
    // InternalPolycreate.g:2230:1: rule__TurnAction__Group_4__0__Impl : ( 'angle' ) ;
    public final void rule__TurnAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2234:1: ( ( 'angle' ) )
            // InternalPolycreate.g:2235:1: ( 'angle' )
            {
            // InternalPolycreate.g:2235:1: ( 'angle' )
            // InternalPolycreate.g:2236:2: 'angle'
            {
             before(grammarAccess.getTurnActionAccess().getAngleKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getAngleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_4__0__Impl"


    // $ANTLR start "rule__TurnAction__Group_4__1"
    // InternalPolycreate.g:2245:1: rule__TurnAction__Group_4__1 : rule__TurnAction__Group_4__1__Impl ;
    public final void rule__TurnAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2249:1: ( rule__TurnAction__Group_4__1__Impl )
            // InternalPolycreate.g:2250:2: rule__TurnAction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_4__1"


    // $ANTLR start "rule__TurnAction__Group_4__1__Impl"
    // InternalPolycreate.g:2256:1: rule__TurnAction__Group_4__1__Impl : ( ( rule__TurnAction__AngleAssignment_4_1 ) ) ;
    public final void rule__TurnAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2260:1: ( ( ( rule__TurnAction__AngleAssignment_4_1 ) ) )
            // InternalPolycreate.g:2261:1: ( ( rule__TurnAction__AngleAssignment_4_1 ) )
            {
            // InternalPolycreate.g:2261:1: ( ( rule__TurnAction__AngleAssignment_4_1 ) )
            // InternalPolycreate.g:2262:2: ( rule__TurnAction__AngleAssignment_4_1 )
            {
             before(grammarAccess.getTurnActionAccess().getAngleAssignment_4_1()); 
            // InternalPolycreate.g:2263:2: ( rule__TurnAction__AngleAssignment_4_1 )
            // InternalPolycreate.g:2263:3: rule__TurnAction__AngleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__AngleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnActionAccess().getAngleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalPolycreate.g:2272:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2276:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPolycreate.g:2277:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalPolycreate.g:2284:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2288:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2289:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2289:1: ( ( '-' )? )
            // InternalPolycreate.g:2290:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalPolycreate.g:2291:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPolycreate.g:2291:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalPolycreate.g:2299:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2303:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPolycreate.g:2304:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalPolycreate.g:2311:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2315:1: ( ( ( RULE_INT )? ) )
            // InternalPolycreate.g:2316:1: ( ( RULE_INT )? )
            {
            // InternalPolycreate.g:2316:1: ( ( RULE_INT )? )
            // InternalPolycreate.g:2317:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalPolycreate.g:2318:2: ( RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:2318:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalPolycreate.g:2326:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2330:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPolycreate.g:2331:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalPolycreate.g:2338:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2342:1: ( ( '.' ) )
            // InternalPolycreate.g:2343:1: ( '.' )
            {
            // InternalPolycreate.g:2343:1: ( '.' )
            // InternalPolycreate.g:2344:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalPolycreate.g:2353:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2357:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalPolycreate.g:2358:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalPolycreate.g:2365:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2369:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2370:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2370:1: ( RULE_INT )
            // InternalPolycreate.g:2371:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalPolycreate.g:2380:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2384:1: ( rule__EDouble__Group__4__Impl )
            // InternalPolycreate.g:2385:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalPolycreate.g:2391:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2395:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalPolycreate.g:2396:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalPolycreate.g:2396:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalPolycreate.g:2397:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalPolycreate.g:2398:2: ( rule__EDouble__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPolycreate.g:2398:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalPolycreate.g:2407:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2411:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalPolycreate.g:2412:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalPolycreate.g:2419:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2423:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalPolycreate.g:2424:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalPolycreate.g:2424:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalPolycreate.g:2425:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalPolycreate.g:2426:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalPolycreate.g:2426:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalPolycreate.g:2434:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2438:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalPolycreate.g:2439:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalPolycreate.g:2446:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2450:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2451:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2451:1: ( ( '-' )? )
            // InternalPolycreate.g:2452:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalPolycreate.g:2453:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPolycreate.g:2453:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalPolycreate.g:2461:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2465:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalPolycreate.g:2466:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalPolycreate.g:2472:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2476:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2477:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2477:1: ( RULE_INT )
            // InternalPolycreate.g:2478:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__RobotProgram__NameAssignment_2"
    // InternalPolycreate.g:2488:1: rule__RobotProgram__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RobotProgram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2492:1: ( ( ruleEString ) )
            // InternalPolycreate.g:2493:2: ( ruleEString )
            {
            // InternalPolycreate.g:2493:2: ( ruleEString )
            // InternalPolycreate.g:2494:3: ruleEString
            {
             before(grammarAccess.getRobotProgramAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__NameAssignment_2"


    // $ANTLR start "rule__RobotProgram__InitialStateAssignment_3"
    // InternalPolycreate.g:2503:1: rule__RobotProgram__InitialStateAssignment_3 : ( ruleState ) ;
    public final void rule__RobotProgram__InitialStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2507:1: ( ( ruleState ) )
            // InternalPolycreate.g:2508:2: ( ruleState )
            {
            // InternalPolycreate.g:2508:2: ( ruleState )
            // InternalPolycreate.g:2509:3: ruleState
            {
             before(grammarAccess.getRobotProgramAccess().getInitialStateStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getInitialStateStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__InitialStateAssignment_3"


    // $ANTLR start "rule__RobotProgram__OwnedStatesAssignment_4"
    // InternalPolycreate.g:2518:1: rule__RobotProgram__OwnedStatesAssignment_4 : ( ruleState ) ;
    public final void rule__RobotProgram__OwnedStatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2522:1: ( ( ruleState ) )
            // InternalPolycreate.g:2523:2: ( ruleState )
            {
            // InternalPolycreate.g:2523:2: ( ruleState )
            // InternalPolycreate.g:2524:3: ruleState
            {
             before(grammarAccess.getRobotProgramAccess().getOwnedStatesStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getOwnedStatesStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__OwnedStatesAssignment_4"


    // $ANTLR start "rule__RobotProgram__GlobalTransitionsAssignment_5"
    // InternalPolycreate.g:2533:1: rule__RobotProgram__GlobalTransitionsAssignment_5 : ( ruleTransition ) ;
    public final void rule__RobotProgram__GlobalTransitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2537:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:2538:2: ( ruleTransition )
            {
            // InternalPolycreate.g:2538:2: ( ruleTransition )
            // InternalPolycreate.g:2539:3: ruleTransition
            {
             before(grammarAccess.getRobotProgramAccess().getGlobalTransitionsTransitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getGlobalTransitionsTransitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotProgram__GlobalTransitionsAssignment_5"


    // $ANTLR start "rule__Transition__ConditionsAssignment_2_2"
    // InternalPolycreate.g:2548:1: rule__Transition__ConditionsAssignment_2_2 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2552:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:2553:2: ( ruleCondition )
            {
            // InternalPolycreate.g:2553:2: ( ruleCondition )
            // InternalPolycreate.g:2554:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_2_2"


    // $ANTLR start "rule__Transition__ConditionsAssignment_2_3_1"
    // InternalPolycreate.g:2563:1: rule__Transition__ConditionsAssignment_2_3_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2567:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:2568:2: ( ruleCondition )
            {
            // InternalPolycreate.g:2568:2: ( ruleCondition )
            // InternalPolycreate.g:2569:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionsAssignment_2_3_1"


    // $ANTLR start "rule__Transition__NextStateAssignment_4"
    // InternalPolycreate.g:2578:1: rule__Transition__NextStateAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2582:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:2583:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:2583:2: ( ( ruleEString ) )
            // InternalPolycreate.g:2584:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_4_0()); 
            // InternalPolycreate.g:2585:3: ( ruleEString )
            // InternalPolycreate.g:2586:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateStateEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateStateEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NextStateAssignment_4"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalPolycreate.g:2597:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2601:1: ( ( ruleEString ) )
            // InternalPolycreate.g:2602:2: ( ruleEString )
            {
            // InternalPolycreate.g:2602:2: ( ruleEString )
            // InternalPolycreate.g:2603:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__ActionsAssignment_4_2"
    // InternalPolycreate.g:2612:1: rule__State__ActionsAssignment_4_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2616:1: ( ( ruleAction ) )
            // InternalPolycreate.g:2617:2: ( ruleAction )
            {
            // InternalPolycreate.g:2617:2: ( ruleAction )
            // InternalPolycreate.g:2618:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_4_2"


    // $ANTLR start "rule__State__ActionsAssignment_4_3_1"
    // InternalPolycreate.g:2627:1: rule__State__ActionsAssignment_4_3_1 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2631:1: ( ( ruleAction ) )
            // InternalPolycreate.g:2632:2: ( ruleAction )
            {
            // InternalPolycreate.g:2632:2: ( ruleAction )
            // InternalPolycreate.g:2633:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_4_3_1"


    // $ANTLR start "rule__State__TransitionsAssignment_5_2"
    // InternalPolycreate.g:2642:1: rule__State__TransitionsAssignment_5_2 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2646:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:2647:2: ( ruleTransition )
            {
            // InternalPolycreate.g:2647:2: ( ruleTransition )
            // InternalPolycreate.g:2648:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_5_2"


    // $ANTLR start "rule__State__TransitionsAssignment_5_3_1"
    // InternalPolycreate.g:2657:1: rule__State__TransitionsAssignment_5_3_1 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2661:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:2662:2: ( ruleTransition )
            {
            // InternalPolycreate.g:2662:2: ( ruleTransition )
            // InternalPolycreate.g:2663:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_5_3_1"


    // $ANTLR start "rule__SimpleCondition__DetectionTypeAssignment_3_1"
    // InternalPolycreate.g:2672:1: rule__SimpleCondition__DetectionTypeAssignment_3_1 : ( ruleDETECTION ) ;
    public final void rule__SimpleCondition__DetectionTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2676:1: ( ( ruleDETECTION ) )
            // InternalPolycreate.g:2677:2: ( ruleDETECTION )
            {
            // InternalPolycreate.g:2677:2: ( ruleDETECTION )
            // InternalPolycreate.g:2678:3: ruleDETECTION
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectionTypeDETECTIONEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDETECTION();

            state._fsp--;

             after(grammarAccess.getSimpleConditionAccess().getDetectionTypeDETECTIONEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__DetectionTypeAssignment_3_1"


    // $ANTLR start "rule__MoveAction__DurationAssignment_3_1"
    // InternalPolycreate.g:2687:1: rule__MoveAction__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__MoveAction__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2691:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2692:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2692:2: ( ruleEDouble )
            // InternalPolycreate.g:2693:3: ruleEDouble
            {
             before(grammarAccess.getMoveActionAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMoveActionAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__DurationAssignment_3_1"


    // $ANTLR start "rule__MoveAction__DirectionAssignment_4_1"
    // InternalPolycreate.g:2702:1: rule__MoveAction__DirectionAssignment_4_1 : ( ruleDIRECTION ) ;
    public final void rule__MoveAction__DirectionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2706:1: ( ( ruleDIRECTION ) )
            // InternalPolycreate.g:2707:2: ( ruleDIRECTION )
            {
            // InternalPolycreate.g:2707:2: ( ruleDIRECTION )
            // InternalPolycreate.g:2708:3: ruleDIRECTION
            {
             before(grammarAccess.getMoveActionAccess().getDirectionDIRECTIONEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDIRECTION();

            state._fsp--;

             after(grammarAccess.getMoveActionAccess().getDirectionDIRECTIONEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveAction__DirectionAssignment_4_1"


    // $ANTLR start "rule__TurnAction__DurationAssignment_3_1"
    // InternalPolycreate.g:2717:1: rule__TurnAction__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__TurnAction__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2721:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2722:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2722:2: ( ruleEDouble )
            // InternalPolycreate.g:2723:3: ruleEDouble
            {
             before(grammarAccess.getTurnActionAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTurnActionAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__DurationAssignment_3_1"


    // $ANTLR start "rule__TurnAction__AngleAssignment_4_1"
    // InternalPolycreate.g:2732:1: rule__TurnAction__AngleAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TurnAction__AngleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2736:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2737:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2737:2: ( ruleEDouble )
            // InternalPolycreate.g:2738:3: ruleEDouble
            {
             before(grammarAccess.getTurnActionAccess().getAngleEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTurnActionAccess().getAngleEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnAction__AngleAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000C02000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000C000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002402000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000040L});

}