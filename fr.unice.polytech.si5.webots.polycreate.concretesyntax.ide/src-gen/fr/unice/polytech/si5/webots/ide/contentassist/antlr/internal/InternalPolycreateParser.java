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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'COLLISION_LEFT'", "'COLLISION_RIGHT'", "'VIRTUAL_WALL'", "'CLIFF_LEFT'", "'CLIFF_RIGHT'", "'CLIFF_FRONT'", "'<'", "'>'", "'FORWARD'", "'BACKWARD'", "'BACK'", "'FRONT'", "'Open'", "'Closed'", "'RobotProgram'", "'->'", "'=>'", "'and'", "'State'", "':'", "'actions'", "'='", "'['", "']'", "','", "'transitions'", "'detect'", "'object'", "'with'", "'distance'", "'angle'", "'move'", "'during'", "'turn'", "'gripper'", "'-'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalPolycreate.g:112:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:116:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalPolycreate.g:117:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalPolycreate.g:117:2: ( ( rule__Condition__Alternatives ) )
            // InternalPolycreate.g:118:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalPolycreate.g:119:3: ( rule__Condition__Alternatives )
            // InternalPolycreate.g:119:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleGlobalTransitions"
    // InternalPolycreate.g:178:1: entryRuleGlobalTransitions : ruleGlobalTransitions EOF ;
    public final void entryRuleGlobalTransitions() throws RecognitionException {
        try {
            // InternalPolycreate.g:179:1: ( ruleGlobalTransitions EOF )
            // InternalPolycreate.g:180:1: ruleGlobalTransitions EOF
            {
             before(grammarAccess.getGlobalTransitionsRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalTransitions();

            state._fsp--;

             after(grammarAccess.getGlobalTransitionsRule()); 
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
    // $ANTLR end "entryRuleGlobalTransitions"


    // $ANTLR start "ruleGlobalTransitions"
    // InternalPolycreate.g:187:1: ruleGlobalTransitions : ( ( rule__GlobalTransitions__Group__0 ) ) ;
    public final void ruleGlobalTransitions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:191:2: ( ( ( rule__GlobalTransitions__Group__0 ) ) )
            // InternalPolycreate.g:192:2: ( ( rule__GlobalTransitions__Group__0 ) )
            {
            // InternalPolycreate.g:192:2: ( ( rule__GlobalTransitions__Group__0 ) )
            // InternalPolycreate.g:193:3: ( rule__GlobalTransitions__Group__0 )
            {
             before(grammarAccess.getGlobalTransitionsAccess().getGroup()); 
            // InternalPolycreate.g:194:3: ( rule__GlobalTransitions__Group__0 )
            // InternalPolycreate.g:194:4: rule__GlobalTransitions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalTransitionsAccess().getGroup()); 

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
    // $ANTLR end "ruleGlobalTransitions"


    // $ANTLR start "entryRuleState"
    // InternalPolycreate.g:203:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalPolycreate.g:204:1: ( ruleState EOF )
            // InternalPolycreate.g:205:1: ruleState EOF
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
    // InternalPolycreate.g:212:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:216:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalPolycreate.g:217:2: ( ( rule__State__Group__0 ) )
            {
            // InternalPolycreate.g:217:2: ( ( rule__State__Group__0 ) )
            // InternalPolycreate.g:218:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalPolycreate.g:219:3: ( rule__State__Group__0 )
            // InternalPolycreate.g:219:4: rule__State__Group__0
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
    // InternalPolycreate.g:228:1: entryRuleSimpleCondition : ruleSimpleCondition EOF ;
    public final void entryRuleSimpleCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:229:1: ( ruleSimpleCondition EOF )
            // InternalPolycreate.g:230:1: ruleSimpleCondition EOF
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
    // InternalPolycreate.g:237:1: ruleSimpleCondition : ( ( rule__SimpleCondition__Group__0 ) ) ;
    public final void ruleSimpleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:241:2: ( ( ( rule__SimpleCondition__Group__0 ) ) )
            // InternalPolycreate.g:242:2: ( ( rule__SimpleCondition__Group__0 ) )
            {
            // InternalPolycreate.g:242:2: ( ( rule__SimpleCondition__Group__0 ) )
            // InternalPolycreate.g:243:3: ( rule__SimpleCondition__Group__0 )
            {
             before(grammarAccess.getSimpleConditionAccess().getGroup()); 
            // InternalPolycreate.g:244:3: ( rule__SimpleCondition__Group__0 )
            // InternalPolycreate.g:244:4: rule__SimpleCondition__Group__0
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


    // $ANTLR start "entryRuleObjectCondition"
    // InternalPolycreate.g:253:1: entryRuleObjectCondition : ruleObjectCondition EOF ;
    public final void entryRuleObjectCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:254:1: ( ruleObjectCondition EOF )
            // InternalPolycreate.g:255:1: ruleObjectCondition EOF
            {
             before(grammarAccess.getObjectConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectCondition();

            state._fsp--;

             after(grammarAccess.getObjectConditionRule()); 
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
    // $ANTLR end "entryRuleObjectCondition"


    // $ANTLR start "ruleObjectCondition"
    // InternalPolycreate.g:262:1: ruleObjectCondition : ( ( rule__ObjectCondition__Alternatives ) ) ;
    public final void ruleObjectCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:266:2: ( ( ( rule__ObjectCondition__Alternatives ) ) )
            // InternalPolycreate.g:267:2: ( ( rule__ObjectCondition__Alternatives ) )
            {
            // InternalPolycreate.g:267:2: ( ( rule__ObjectCondition__Alternatives ) )
            // InternalPolycreate.g:268:3: ( rule__ObjectCondition__Alternatives )
            {
             before(grammarAccess.getObjectConditionAccess().getAlternatives()); 
            // InternalPolycreate.g:269:3: ( rule__ObjectCondition__Alternatives )
            // InternalPolycreate.g:269:4: rule__ObjectCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ObjectCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjectCondition"


    // $ANTLR start "entryRuleDistanceCondition"
    // InternalPolycreate.g:278:1: entryRuleDistanceCondition : ruleDistanceCondition EOF ;
    public final void entryRuleDistanceCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:279:1: ( ruleDistanceCondition EOF )
            // InternalPolycreate.g:280:1: ruleDistanceCondition EOF
            {
             before(grammarAccess.getDistanceConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceCondition();

            state._fsp--;

             after(grammarAccess.getDistanceConditionRule()); 
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
    // $ANTLR end "entryRuleDistanceCondition"


    // $ANTLR start "ruleDistanceCondition"
    // InternalPolycreate.g:287:1: ruleDistanceCondition : ( ( rule__DistanceCondition__Group__0 ) ) ;
    public final void ruleDistanceCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:291:2: ( ( ( rule__DistanceCondition__Group__0 ) ) )
            // InternalPolycreate.g:292:2: ( ( rule__DistanceCondition__Group__0 ) )
            {
            // InternalPolycreate.g:292:2: ( ( rule__DistanceCondition__Group__0 ) )
            // InternalPolycreate.g:293:3: ( rule__DistanceCondition__Group__0 )
            {
             before(grammarAccess.getDistanceConditionAccess().getGroup()); 
            // InternalPolycreate.g:294:3: ( rule__DistanceCondition__Group__0 )
            // InternalPolycreate.g:294:4: rule__DistanceCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleDistanceCondition"


    // $ANTLR start "entryRuleAngleCondition"
    // InternalPolycreate.g:303:1: entryRuleAngleCondition : ruleAngleCondition EOF ;
    public final void entryRuleAngleCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:304:1: ( ruleAngleCondition EOF )
            // InternalPolycreate.g:305:1: ruleAngleCondition EOF
            {
             before(grammarAccess.getAngleConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAngleCondition();

            state._fsp--;

             after(grammarAccess.getAngleConditionRule()); 
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
    // $ANTLR end "entryRuleAngleCondition"


    // $ANTLR start "ruleAngleCondition"
    // InternalPolycreate.g:312:1: ruleAngleCondition : ( ( rule__AngleCondition__Group__0 ) ) ;
    public final void ruleAngleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:316:2: ( ( ( rule__AngleCondition__Group__0 ) ) )
            // InternalPolycreate.g:317:2: ( ( rule__AngleCondition__Group__0 ) )
            {
            // InternalPolycreate.g:317:2: ( ( rule__AngleCondition__Group__0 ) )
            // InternalPolycreate.g:318:3: ( rule__AngleCondition__Group__0 )
            {
             before(grammarAccess.getAngleConditionAccess().getGroup()); 
            // InternalPolycreate.g:319:3: ( rule__AngleCondition__Group__0 )
            // InternalPolycreate.g:319:4: rule__AngleCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAngleConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAngleCondition"


    // $ANTLR start "entryRuleMoveAction"
    // InternalPolycreate.g:328:1: entryRuleMoveAction : ruleMoveAction EOF ;
    public final void entryRuleMoveAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:329:1: ( ruleMoveAction EOF )
            // InternalPolycreate.g:330:1: ruleMoveAction EOF
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
    // InternalPolycreate.g:337:1: ruleMoveAction : ( ( rule__MoveAction__Group__0 ) ) ;
    public final void ruleMoveAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:341:2: ( ( ( rule__MoveAction__Group__0 ) ) )
            // InternalPolycreate.g:342:2: ( ( rule__MoveAction__Group__0 ) )
            {
            // InternalPolycreate.g:342:2: ( ( rule__MoveAction__Group__0 ) )
            // InternalPolycreate.g:343:3: ( rule__MoveAction__Group__0 )
            {
             before(grammarAccess.getMoveActionAccess().getGroup()); 
            // InternalPolycreate.g:344:3: ( rule__MoveAction__Group__0 )
            // InternalPolycreate.g:344:4: rule__MoveAction__Group__0
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
    // InternalPolycreate.g:353:1: entryRuleTurnAction : ruleTurnAction EOF ;
    public final void entryRuleTurnAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:354:1: ( ruleTurnAction EOF )
            // InternalPolycreate.g:355:1: ruleTurnAction EOF
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
    // InternalPolycreate.g:362:1: ruleTurnAction : ( ( rule__TurnAction__Group__0 ) ) ;
    public final void ruleTurnAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:366:2: ( ( ( rule__TurnAction__Group__0 ) ) )
            // InternalPolycreate.g:367:2: ( ( rule__TurnAction__Group__0 ) )
            {
            // InternalPolycreate.g:367:2: ( ( rule__TurnAction__Group__0 ) )
            // InternalPolycreate.g:368:3: ( rule__TurnAction__Group__0 )
            {
             before(grammarAccess.getTurnActionAccess().getGroup()); 
            // InternalPolycreate.g:369:3: ( rule__TurnAction__Group__0 )
            // InternalPolycreate.g:369:4: rule__TurnAction__Group__0
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


    // $ANTLR start "entryRuleGripAction"
    // InternalPolycreate.g:378:1: entryRuleGripAction : ruleGripAction EOF ;
    public final void entryRuleGripAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:379:1: ( ruleGripAction EOF )
            // InternalPolycreate.g:380:1: ruleGripAction EOF
            {
             before(grammarAccess.getGripActionRule()); 
            pushFollow(FOLLOW_1);
            ruleGripAction();

            state._fsp--;

             after(grammarAccess.getGripActionRule()); 
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
    // $ANTLR end "entryRuleGripAction"


    // $ANTLR start "ruleGripAction"
    // InternalPolycreate.g:387:1: ruleGripAction : ( ( rule__GripAction__Group__0 ) ) ;
    public final void ruleGripAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:391:2: ( ( ( rule__GripAction__Group__0 ) ) )
            // InternalPolycreate.g:392:2: ( ( rule__GripAction__Group__0 ) )
            {
            // InternalPolycreate.g:392:2: ( ( rule__GripAction__Group__0 ) )
            // InternalPolycreate.g:393:3: ( rule__GripAction__Group__0 )
            {
             before(grammarAccess.getGripActionAccess().getGroup()); 
            // InternalPolycreate.g:394:3: ( rule__GripAction__Group__0 )
            // InternalPolycreate.g:394:4: rule__GripAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GripAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGripActionAccess().getGroup()); 

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
    // $ANTLR end "ruleGripAction"


    // $ANTLR start "entryRuleEDouble"
    // InternalPolycreate.g:403:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPolycreate.g:404:1: ( ruleEDouble EOF )
            // InternalPolycreate.g:405:1: ruleEDouble EOF
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
    // InternalPolycreate.g:412:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:416:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPolycreate.g:417:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPolycreate.g:417:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPolycreate.g:418:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPolycreate.g:419:3: ( rule__EDouble__Group__0 )
            // InternalPolycreate.g:419:4: rule__EDouble__Group__0
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
    // InternalPolycreate.g:428:1: ruleDETECTION : ( ( rule__DETECTION__Alternatives ) ) ;
    public final void ruleDETECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:432:1: ( ( ( rule__DETECTION__Alternatives ) ) )
            // InternalPolycreate.g:433:2: ( ( rule__DETECTION__Alternatives ) )
            {
            // InternalPolycreate.g:433:2: ( ( rule__DETECTION__Alternatives ) )
            // InternalPolycreate.g:434:3: ( rule__DETECTION__Alternatives )
            {
             before(grammarAccess.getDETECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:435:3: ( rule__DETECTION__Alternatives )
            // InternalPolycreate.g:435:4: rule__DETECTION__Alternatives
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


    // $ANTLR start "ruleOPERATOR"
    // InternalPolycreate.g:444:1: ruleOPERATOR : ( ( rule__OPERATOR__Alternatives ) ) ;
    public final void ruleOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:448:1: ( ( ( rule__OPERATOR__Alternatives ) ) )
            // InternalPolycreate.g:449:2: ( ( rule__OPERATOR__Alternatives ) )
            {
            // InternalPolycreate.g:449:2: ( ( rule__OPERATOR__Alternatives ) )
            // InternalPolycreate.g:450:3: ( rule__OPERATOR__Alternatives )
            {
             before(grammarAccess.getOPERATORAccess().getAlternatives()); 
            // InternalPolycreate.g:451:3: ( rule__OPERATOR__Alternatives )
            // InternalPolycreate.g:451:4: rule__OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OPERATOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOPERATORAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOPERATOR"


    // $ANTLR start "ruleDIRECTION"
    // InternalPolycreate.g:460:1: ruleDIRECTION : ( ( rule__DIRECTION__Alternatives ) ) ;
    public final void ruleDIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:464:1: ( ( ( rule__DIRECTION__Alternatives ) ) )
            // InternalPolycreate.g:465:2: ( ( rule__DIRECTION__Alternatives ) )
            {
            // InternalPolycreate.g:465:2: ( ( rule__DIRECTION__Alternatives ) )
            // InternalPolycreate.g:466:3: ( rule__DIRECTION__Alternatives )
            {
             before(grammarAccess.getDIRECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:467:3: ( rule__DIRECTION__Alternatives )
            // InternalPolycreate.g:467:4: rule__DIRECTION__Alternatives
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


    // $ANTLR start "ruleCAMERATYPE"
    // InternalPolycreate.g:476:1: ruleCAMERATYPE : ( ( rule__CAMERATYPE__Alternatives ) ) ;
    public final void ruleCAMERATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:480:1: ( ( ( rule__CAMERATYPE__Alternatives ) ) )
            // InternalPolycreate.g:481:2: ( ( rule__CAMERATYPE__Alternatives ) )
            {
            // InternalPolycreate.g:481:2: ( ( rule__CAMERATYPE__Alternatives ) )
            // InternalPolycreate.g:482:3: ( rule__CAMERATYPE__Alternatives )
            {
             before(grammarAccess.getCAMERATYPEAccess().getAlternatives()); 
            // InternalPolycreate.g:483:3: ( rule__CAMERATYPE__Alternatives )
            // InternalPolycreate.g:483:4: rule__CAMERATYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CAMERATYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCAMERATYPEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCAMERATYPE"


    // $ANTLR start "ruleGRIPPER_STATE"
    // InternalPolycreate.g:492:1: ruleGRIPPER_STATE : ( ( rule__GRIPPER_STATE__Alternatives ) ) ;
    public final void ruleGRIPPER_STATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:496:1: ( ( ( rule__GRIPPER_STATE__Alternatives ) ) )
            // InternalPolycreate.g:497:2: ( ( rule__GRIPPER_STATE__Alternatives ) )
            {
            // InternalPolycreate.g:497:2: ( ( rule__GRIPPER_STATE__Alternatives ) )
            // InternalPolycreate.g:498:3: ( rule__GRIPPER_STATE__Alternatives )
            {
             before(grammarAccess.getGRIPPER_STATEAccess().getAlternatives()); 
            // InternalPolycreate.g:499:3: ( rule__GRIPPER_STATE__Alternatives )
            // InternalPolycreate.g:499:4: rule__GRIPPER_STATE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GRIPPER_STATE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGRIPPER_STATEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGRIPPER_STATE"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPolycreate.g:507:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:511:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPolycreate.g:512:2: ( RULE_STRING )
                    {
                    // InternalPolycreate.g:512:2: ( RULE_STRING )
                    // InternalPolycreate.g:513:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:518:2: ( RULE_ID )
                    {
                    // InternalPolycreate.g:518:2: ( RULE_ID )
                    // InternalPolycreate.g:519:3: RULE_ID
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


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalPolycreate.g:528:1: rule__Condition__Alternatives : ( ( ruleSimpleCondition ) | ( ruleObjectCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:532:1: ( ( ruleSimpleCondition ) | ( ruleObjectCondition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==39) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==40) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=13 && LA2_1<=18)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPolycreate.g:533:2: ( ruleSimpleCondition )
                    {
                    // InternalPolycreate.g:533:2: ( ruleSimpleCondition )
                    // InternalPolycreate.g:534:3: ruleSimpleCondition
                    {
                     before(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:539:2: ( ruleObjectCondition )
                    {
                    // InternalPolycreate.g:539:2: ( ruleObjectCondition )
                    // InternalPolycreate.g:540:3: ruleObjectCondition
                    {
                     before(grammarAccess.getConditionAccess().getObjectConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getObjectConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalPolycreate.g:549:1: rule__Action__Alternatives : ( ( ruleMoveAction ) | ( ruleTurnAction ) | ( ruleGripAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:553:1: ( ( ruleMoveAction ) | ( ruleTurnAction ) | ( ruleGripAction ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 25:
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPolycreate.g:554:2: ( ruleMoveAction )
                    {
                    // InternalPolycreate.g:554:2: ( ruleMoveAction )
                    // InternalPolycreate.g:555:3: ruleMoveAction
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
                    // InternalPolycreate.g:560:2: ( ruleTurnAction )
                    {
                    // InternalPolycreate.g:560:2: ( ruleTurnAction )
                    // InternalPolycreate.g:561:3: ruleTurnAction
                    {
                     before(grammarAccess.getActionAccess().getTurnActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTurnActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:566:2: ( ruleGripAction )
                    {
                    // InternalPolycreate.g:566:2: ( ruleGripAction )
                    // InternalPolycreate.g:567:3: ruleGripAction
                    {
                     before(grammarAccess.getActionAccess().getGripActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGripAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getGripActionParserRuleCall_2()); 

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


    // $ANTLR start "rule__ObjectCondition__Alternatives"
    // InternalPolycreate.g:576:1: rule__ObjectCondition__Alternatives : ( ( ruleDistanceCondition ) | ( ruleAngleCondition ) );
    public final void rule__ObjectCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:580:1: ( ( ruleDistanceCondition ) | ( ruleAngleCondition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==39) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==40) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==23) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==41) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==42) ) {
                                alt4=1;
                            }
                            else if ( (LA4_5==43) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_2==24) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==41) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==42) ) {
                                alt4=1;
                            }
                            else if ( (LA4_5==43) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPolycreate.g:581:2: ( ruleDistanceCondition )
                    {
                    // InternalPolycreate.g:581:2: ( ruleDistanceCondition )
                    // InternalPolycreate.g:582:3: ruleDistanceCondition
                    {
                     before(grammarAccess.getObjectConditionAccess().getDistanceConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceCondition();

                    state._fsp--;

                     after(grammarAccess.getObjectConditionAccess().getDistanceConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:587:2: ( ruleAngleCondition )
                    {
                    // InternalPolycreate.g:587:2: ( ruleAngleCondition )
                    // InternalPolycreate.g:588:3: ruleAngleCondition
                    {
                     before(grammarAccess.getObjectConditionAccess().getAngleConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAngleCondition();

                    state._fsp--;

                     after(grammarAccess.getObjectConditionAccess().getAngleConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__ObjectCondition__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalPolycreate.g:597:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:601:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPolycreate.g:602:2: ( 'E' )
                    {
                    // InternalPolycreate.g:602:2: ( 'E' )
                    // InternalPolycreate.g:603:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:608:2: ( 'e' )
                    {
                    // InternalPolycreate.g:608:2: ( 'e' )
                    // InternalPolycreate.g:609:3: 'e'
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
    // InternalPolycreate.g:618:1: rule__DETECTION__Alternatives : ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) );
    public final void rule__DETECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:622:1: ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPolycreate.g:623:2: ( ( 'COLLISION_LEFT' ) )
                    {
                    // InternalPolycreate.g:623:2: ( ( 'COLLISION_LEFT' ) )
                    // InternalPolycreate.g:624:3: ( 'COLLISION_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:625:3: ( 'COLLISION_LEFT' )
                    // InternalPolycreate.g:625:4: 'COLLISION_LEFT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:629:2: ( ( 'COLLISION_RIGHT' ) )
                    {
                    // InternalPolycreate.g:629:2: ( ( 'COLLISION_RIGHT' ) )
                    // InternalPolycreate.g:630:3: ( 'COLLISION_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:631:3: ( 'COLLISION_RIGHT' )
                    // InternalPolycreate.g:631:4: 'COLLISION_RIGHT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:635:2: ( ( 'VIRTUAL_WALL' ) )
                    {
                    // InternalPolycreate.g:635:2: ( ( 'VIRTUAL_WALL' ) )
                    // InternalPolycreate.g:636:3: ( 'VIRTUAL_WALL' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 
                    // InternalPolycreate.g:637:3: ( 'VIRTUAL_WALL' )
                    // InternalPolycreate.g:637:4: 'VIRTUAL_WALL'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:641:2: ( ( 'CLIFF_LEFT' ) )
                    {
                    // InternalPolycreate.g:641:2: ( ( 'CLIFF_LEFT' ) )
                    // InternalPolycreate.g:642:3: ( 'CLIFF_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 
                    // InternalPolycreate.g:643:3: ( 'CLIFF_LEFT' )
                    // InternalPolycreate.g:643:4: 'CLIFF_LEFT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:647:2: ( ( 'CLIFF_RIGHT' ) )
                    {
                    // InternalPolycreate.g:647:2: ( ( 'CLIFF_RIGHT' ) )
                    // InternalPolycreate.g:648:3: ( 'CLIFF_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 
                    // InternalPolycreate.g:649:3: ( 'CLIFF_RIGHT' )
                    // InternalPolycreate.g:649:4: 'CLIFF_RIGHT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:653:2: ( ( 'CLIFF_FRONT' ) )
                    {
                    // InternalPolycreate.g:653:2: ( ( 'CLIFF_FRONT' ) )
                    // InternalPolycreate.g:654:3: ( 'CLIFF_FRONT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_FRONTEnumLiteralDeclaration_5()); 
                    // InternalPolycreate.g:655:3: ( 'CLIFF_FRONT' )
                    // InternalPolycreate.g:655:4: 'CLIFF_FRONT'
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


    // $ANTLR start "rule__OPERATOR__Alternatives"
    // InternalPolycreate.g:663:1: rule__OPERATOR__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:667:1: ( ( ( '<' ) ) | ( ( '>' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPolycreate.g:668:2: ( ( '<' ) )
                    {
                    // InternalPolycreate.g:668:2: ( ( '<' ) )
                    // InternalPolycreate.g:669:3: ( '<' )
                    {
                     before(grammarAccess.getOPERATORAccess().getINFERIOREnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:670:3: ( '<' )
                    // InternalPolycreate.g:670:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATORAccess().getINFERIOREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:674:2: ( ( '>' ) )
                    {
                    // InternalPolycreate.g:674:2: ( ( '>' ) )
                    // InternalPolycreate.g:675:3: ( '>' )
                    {
                     before(grammarAccess.getOPERATORAccess().getSUPERIOREnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:676:3: ( '>' )
                    // InternalPolycreate.g:676:4: '>'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATORAccess().getSUPERIOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__OPERATOR__Alternatives"


    // $ANTLR start "rule__DIRECTION__Alternatives"
    // InternalPolycreate.g:684:1: rule__DIRECTION__Alternatives : ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) );
    public final void rule__DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:688:1: ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPolycreate.g:689:2: ( ( 'FORWARD' ) )
                    {
                    // InternalPolycreate.g:689:2: ( ( 'FORWARD' ) )
                    // InternalPolycreate.g:690:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:691:3: ( 'FORWARD' )
                    // InternalPolycreate.g:691:4: 'FORWARD'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:695:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalPolycreate.g:695:2: ( ( 'BACKWARD' ) )
                    // InternalPolycreate.g:696:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:697:3: ( 'BACKWARD' )
                    // InternalPolycreate.g:697:4: 'BACKWARD'
                    {
                    match(input,22,FOLLOW_2); 

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


    // $ANTLR start "rule__CAMERATYPE__Alternatives"
    // InternalPolycreate.g:705:1: rule__CAMERATYPE__Alternatives : ( ( ( 'BACK' ) ) | ( ( 'FRONT' ) ) );
    public final void rule__CAMERATYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:709:1: ( ( ( 'BACK' ) ) | ( ( 'FRONT' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPolycreate.g:710:2: ( ( 'BACK' ) )
                    {
                    // InternalPolycreate.g:710:2: ( ( 'BACK' ) )
                    // InternalPolycreate.g:711:3: ( 'BACK' )
                    {
                     before(grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:712:3: ( 'BACK' )
                    // InternalPolycreate.g:712:4: 'BACK'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:716:2: ( ( 'FRONT' ) )
                    {
                    // InternalPolycreate.g:716:2: ( ( 'FRONT' ) )
                    // InternalPolycreate.g:717:3: ( 'FRONT' )
                    {
                     before(grammarAccess.getCAMERATYPEAccess().getFRONTEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:718:3: ( 'FRONT' )
                    // InternalPolycreate.g:718:4: 'FRONT'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getCAMERATYPEAccess().getFRONTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CAMERATYPE__Alternatives"


    // $ANTLR start "rule__GRIPPER_STATE__Alternatives"
    // InternalPolycreate.g:726:1: rule__GRIPPER_STATE__Alternatives : ( ( ( 'Open' ) ) | ( ( 'Closed' ) ) );
    public final void rule__GRIPPER_STATE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:730:1: ( ( ( 'Open' ) ) | ( ( 'Closed' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPolycreate.g:731:2: ( ( 'Open' ) )
                    {
                    // InternalPolycreate.g:731:2: ( ( 'Open' ) )
                    // InternalPolycreate.g:732:3: ( 'Open' )
                    {
                     before(grammarAccess.getGRIPPER_STATEAccess().getOPENEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:733:3: ( 'Open' )
                    // InternalPolycreate.g:733:4: 'Open'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getGRIPPER_STATEAccess().getOPENEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:737:2: ( ( 'Closed' ) )
                    {
                    // InternalPolycreate.g:737:2: ( ( 'Closed' ) )
                    // InternalPolycreate.g:738:3: ( 'Closed' )
                    {
                     before(grammarAccess.getGRIPPER_STATEAccess().getCLOSEDEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:739:3: ( 'Closed' )
                    // InternalPolycreate.g:739:4: 'Closed'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getGRIPPER_STATEAccess().getCLOSEDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__GRIPPER_STATE__Alternatives"


    // $ANTLR start "rule__RobotProgram__Group__0"
    // InternalPolycreate.g:747:1: rule__RobotProgram__Group__0 : rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 ;
    public final void rule__RobotProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:751:1: ( rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 )
            // InternalPolycreate.g:752:2: rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1
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
    // InternalPolycreate.g:759:1: rule__RobotProgram__Group__0__Impl : ( () ) ;
    public final void rule__RobotProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:763:1: ( ( () ) )
            // InternalPolycreate.g:764:1: ( () )
            {
            // InternalPolycreate.g:764:1: ( () )
            // InternalPolycreate.g:765:2: ()
            {
             before(grammarAccess.getRobotProgramAccess().getRobotProgramAction_0()); 
            // InternalPolycreate.g:766:2: ()
            // InternalPolycreate.g:766:3: 
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
    // InternalPolycreate.g:774:1: rule__RobotProgram__Group__1 : rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 ;
    public final void rule__RobotProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:778:1: ( rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 )
            // InternalPolycreate.g:779:2: rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2
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
    // InternalPolycreate.g:786:1: rule__RobotProgram__Group__1__Impl : ( 'RobotProgram' ) ;
    public final void rule__RobotProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:790:1: ( ( 'RobotProgram' ) )
            // InternalPolycreate.g:791:1: ( 'RobotProgram' )
            {
            // InternalPolycreate.g:791:1: ( 'RobotProgram' )
            // InternalPolycreate.g:792:2: 'RobotProgram'
            {
             before(grammarAccess.getRobotProgramAccess().getRobotProgramKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPolycreate.g:801:1: rule__RobotProgram__Group__2 : rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 ;
    public final void rule__RobotProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:805:1: ( rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 )
            // InternalPolycreate.g:806:2: rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3
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
    // InternalPolycreate.g:813:1: rule__RobotProgram__Group__2__Impl : ( ( rule__RobotProgram__NameAssignment_2 ) ) ;
    public final void rule__RobotProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:817:1: ( ( ( rule__RobotProgram__NameAssignment_2 ) ) )
            // InternalPolycreate.g:818:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:818:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            // InternalPolycreate.g:819:2: ( rule__RobotProgram__NameAssignment_2 )
            {
             before(grammarAccess.getRobotProgramAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:820:2: ( rule__RobotProgram__NameAssignment_2 )
            // InternalPolycreate.g:820:3: rule__RobotProgram__NameAssignment_2
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
    // InternalPolycreate.g:828:1: rule__RobotProgram__Group__3 : rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 ;
    public final void rule__RobotProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:832:1: ( rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 )
            // InternalPolycreate.g:833:2: rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4
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
    // InternalPolycreate.g:840:1: rule__RobotProgram__Group__3__Impl : ( '->' ) ;
    public final void rule__RobotProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:844:1: ( ( '->' ) )
            // InternalPolycreate.g:845:1: ( '->' )
            {
            // InternalPolycreate.g:845:1: ( '->' )
            // InternalPolycreate.g:846:2: '->'
            {
             before(grammarAccess.getRobotProgramAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRobotProgramAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // InternalPolycreate.g:855:1: rule__RobotProgram__Group__4 : rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 ;
    public final void rule__RobotProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:859:1: ( rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 )
            // InternalPolycreate.g:860:2: rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalPolycreate.g:867:1: rule__RobotProgram__Group__4__Impl : ( ( rule__RobotProgram__InitialStateAssignment_4 ) ) ;
    public final void rule__RobotProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:871:1: ( ( ( rule__RobotProgram__InitialStateAssignment_4 ) ) )
            // InternalPolycreate.g:872:1: ( ( rule__RobotProgram__InitialStateAssignment_4 ) )
            {
            // InternalPolycreate.g:872:1: ( ( rule__RobotProgram__InitialStateAssignment_4 ) )
            // InternalPolycreate.g:873:2: ( rule__RobotProgram__InitialStateAssignment_4 )
            {
             before(grammarAccess.getRobotProgramAccess().getInitialStateAssignment_4()); 
            // InternalPolycreate.g:874:2: ( rule__RobotProgram__InitialStateAssignment_4 )
            // InternalPolycreate.g:874:3: rule__RobotProgram__InitialStateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RobotProgram__InitialStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRobotProgramAccess().getInitialStateAssignment_4()); 

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
    // InternalPolycreate.g:882:1: rule__RobotProgram__Group__5 : rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6 ;
    public final void rule__RobotProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:886:1: ( rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6 )
            // InternalPolycreate.g:887:2: rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__RobotProgram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__6();

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
    // InternalPolycreate.g:894:1: rule__RobotProgram__Group__5__Impl : ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* ) ;
    public final void rule__RobotProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:898:1: ( ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* ) )
            // InternalPolycreate.g:899:1: ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* )
            {
            // InternalPolycreate.g:899:1: ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* )
            // InternalPolycreate.g:900:2: ( rule__RobotProgram__OwnedStatesAssignment_5 )*
            {
             before(grammarAccess.getRobotProgramAccess().getOwnedStatesAssignment_5()); 
            // InternalPolycreate.g:901:2: ( rule__RobotProgram__OwnedStatesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPolycreate.g:901:3: rule__RobotProgram__OwnedStatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RobotProgram__OwnedStatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRobotProgramAccess().getOwnedStatesAssignment_5()); 

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


    // $ANTLR start "rule__RobotProgram__Group__6"
    // InternalPolycreate.g:909:1: rule__RobotProgram__Group__6 : rule__RobotProgram__Group__6__Impl ;
    public final void rule__RobotProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:913:1: ( rule__RobotProgram__Group__6__Impl )
            // InternalPolycreate.g:914:2: rule__RobotProgram__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotProgram__Group__6__Impl();

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
    // $ANTLR end "rule__RobotProgram__Group__6"


    // $ANTLR start "rule__RobotProgram__Group__6__Impl"
    // InternalPolycreate.g:920:1: rule__RobotProgram__Group__6__Impl : ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* ) ;
    public final void rule__RobotProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:924:1: ( ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* ) )
            // InternalPolycreate.g:925:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* )
            {
            // InternalPolycreate.g:925:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* )
            // InternalPolycreate.g:926:2: ( rule__RobotProgram__GlobalTransitionsAssignment_6 )*
            {
             before(grammarAccess.getRobotProgramAccess().getGlobalTransitionsAssignment_6()); 
            // InternalPolycreate.g:927:2: ( rule__RobotProgram__GlobalTransitionsAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPolycreate.g:927:3: rule__RobotProgram__GlobalTransitionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RobotProgram__GlobalTransitionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRobotProgramAccess().getGlobalTransitionsAssignment_6()); 

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
    // $ANTLR end "rule__RobotProgram__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalPolycreate.g:936:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:940:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPolycreate.g:941:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPolycreate.g:948:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:952:1: ( ( () ) )
            // InternalPolycreate.g:953:1: ( () )
            {
            // InternalPolycreate.g:953:1: ( () )
            // InternalPolycreate.g:954:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalPolycreate.g:955:2: ()
            // InternalPolycreate.g:955:3: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalPolycreate.g:963:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:967:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPolycreate.g:968:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalPolycreate.g:975:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:979:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalPolycreate.g:980:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalPolycreate.g:980:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalPolycreate.g:981:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalPolycreate.g:982:2: ( rule__Transition__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPolycreate.g:982:3: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_1()); 

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
    // InternalPolycreate.g:990:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:994:1: ( rule__Transition__Group__2__Impl )
            // InternalPolycreate.g:995:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2__Impl();

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
    // InternalPolycreate.g:1001:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NextStateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1005:1: ( ( ( rule__Transition__NextStateAssignment_2 ) ) )
            // InternalPolycreate.g:1006:1: ( ( rule__Transition__NextStateAssignment_2 ) )
            {
            // InternalPolycreate.g:1006:1: ( ( rule__Transition__NextStateAssignment_2 ) )
            // InternalPolycreate.g:1007:2: ( rule__Transition__NextStateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNextStateAssignment_2()); 
            // InternalPolycreate.g:1008:2: ( rule__Transition__NextStateAssignment_2 )
            // InternalPolycreate.g:1008:3: rule__Transition__NextStateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextStateAssignment_2()); 

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


    // $ANTLR start "rule__Transition__Group_1__0"
    // InternalPolycreate.g:1017:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1021:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalPolycreate.g:1022:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__1();

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
    // $ANTLR end "rule__Transition__Group_1__0"


    // $ANTLR start "rule__Transition__Group_1__0__Impl"
    // InternalPolycreate.g:1029:1: rule__Transition__Group_1__0__Impl : ( ( rule__Transition__ConditionsAssignment_1_0 ) ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1033:1: ( ( ( rule__Transition__ConditionsAssignment_1_0 ) ) )
            // InternalPolycreate.g:1034:1: ( ( rule__Transition__ConditionsAssignment_1_0 ) )
            {
            // InternalPolycreate.g:1034:1: ( ( rule__Transition__ConditionsAssignment_1_0 ) )
            // InternalPolycreate.g:1035:2: ( rule__Transition__ConditionsAssignment_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_1_0()); 
            // InternalPolycreate.g:1036:2: ( rule__Transition__ConditionsAssignment_1_0 )
            // InternalPolycreate.g:1036:3: rule__Transition__ConditionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_1_0()); 

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
    // $ANTLR end "rule__Transition__Group_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1__1"
    // InternalPolycreate.g:1044:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1048:1: ( rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 )
            // InternalPolycreate.g:1049:2: rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__2();

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
    // $ANTLR end "rule__Transition__Group_1__1"


    // $ANTLR start "rule__Transition__Group_1__1__Impl"
    // InternalPolycreate.g:1056:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__Group_1_1__0 )* ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1060:1: ( ( ( rule__Transition__Group_1_1__0 )* ) )
            // InternalPolycreate.g:1061:1: ( ( rule__Transition__Group_1_1__0 )* )
            {
            // InternalPolycreate.g:1061:1: ( ( rule__Transition__Group_1_1__0 )* )
            // InternalPolycreate.g:1062:2: ( rule__Transition__Group_1_1__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_1_1()); 
            // InternalPolycreate.g:1063:2: ( rule__Transition__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPolycreate.g:1063:3: rule__Transition__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Transition__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Transition__Group_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_1__2"
    // InternalPolycreate.g:1071:1: rule__Transition__Group_1__2 : rule__Transition__Group_1__2__Impl ;
    public final void rule__Transition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1075:1: ( rule__Transition__Group_1__2__Impl )
            // InternalPolycreate.g:1076:2: rule__Transition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_1__2"


    // $ANTLR start "rule__Transition__Group_1__2__Impl"
    // InternalPolycreate.g:1082:1: rule__Transition__Group_1__2__Impl : ( '=>' ) ;
    public final void rule__Transition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1086:1: ( ( '=>' ) )
            // InternalPolycreate.g:1087:1: ( '=>' )
            {
            // InternalPolycreate.g:1087:1: ( '=>' )
            // InternalPolycreate.g:1088:2: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_2()); 

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
    // $ANTLR end "rule__Transition__Group_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_1_1__0"
    // InternalPolycreate.g:1098:1: rule__Transition__Group_1_1__0 : rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1 ;
    public final void rule__Transition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1102:1: ( rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1 )
            // InternalPolycreate.g:1103:2: rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1_1__1();

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
    // $ANTLR end "rule__Transition__Group_1_1__0"


    // $ANTLR start "rule__Transition__Group_1_1__0__Impl"
    // InternalPolycreate.g:1110:1: rule__Transition__Group_1_1__0__Impl : ( 'and' ) ;
    public final void rule__Transition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1114:1: ( ( 'and' ) )
            // InternalPolycreate.g:1115:1: ( 'and' )
            {
            // InternalPolycreate.g:1115:1: ( 'and' )
            // InternalPolycreate.g:1116:2: 'and'
            {
             before(grammarAccess.getTransitionAccess().getAndKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getAndKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Transition__Group_1_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1_1__1"
    // InternalPolycreate.g:1125:1: rule__Transition__Group_1_1__1 : rule__Transition__Group_1_1__1__Impl ;
    public final void rule__Transition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1129:1: ( rule__Transition__Group_1_1__1__Impl )
            // InternalPolycreate.g:1130:2: rule__Transition__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_1_1__1"


    // $ANTLR start "rule__Transition__Group_1_1__1__Impl"
    // InternalPolycreate.g:1136:1: rule__Transition__Group_1_1__1__Impl : ( ( rule__Transition__ConditionsAssignment_1_1_1 ) ) ;
    public final void rule__Transition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1140:1: ( ( ( rule__Transition__ConditionsAssignment_1_1_1 ) ) )
            // InternalPolycreate.g:1141:1: ( ( rule__Transition__ConditionsAssignment_1_1_1 ) )
            {
            // InternalPolycreate.g:1141:1: ( ( rule__Transition__ConditionsAssignment_1_1_1 ) )
            // InternalPolycreate.g:1142:2: ( rule__Transition__ConditionsAssignment_1_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_1_1_1()); 
            // InternalPolycreate.g:1143:2: ( rule__Transition__ConditionsAssignment_1_1_1 )
            // InternalPolycreate.g:1143:3: rule__Transition__ConditionsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Transition__Group_1_1__1__Impl"


    // $ANTLR start "rule__GlobalTransitions__Group__0"
    // InternalPolycreate.g:1152:1: rule__GlobalTransitions__Group__0 : rule__GlobalTransitions__Group__0__Impl rule__GlobalTransitions__Group__1 ;
    public final void rule__GlobalTransitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1156:1: ( rule__GlobalTransitions__Group__0__Impl rule__GlobalTransitions__Group__1 )
            // InternalPolycreate.g:1157:2: rule__GlobalTransitions__Group__0__Impl rule__GlobalTransitions__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__GlobalTransitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group__1();

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
    // $ANTLR end "rule__GlobalTransitions__Group__0"


    // $ANTLR start "rule__GlobalTransitions__Group__0__Impl"
    // InternalPolycreate.g:1164:1: rule__GlobalTransitions__Group__0__Impl : ( () ) ;
    public final void rule__GlobalTransitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1168:1: ( ( () ) )
            // InternalPolycreate.g:1169:1: ( () )
            {
            // InternalPolycreate.g:1169:1: ( () )
            // InternalPolycreate.g:1170:2: ()
            {
             before(grammarAccess.getGlobalTransitionsAccess().getTransitionAction_0()); 
            // InternalPolycreate.g:1171:2: ()
            // InternalPolycreate.g:1171:3: 
            {
            }

             after(grammarAccess.getGlobalTransitionsAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalTransitions__Group__0__Impl"


    // $ANTLR start "rule__GlobalTransitions__Group__1"
    // InternalPolycreate.g:1179:1: rule__GlobalTransitions__Group__1 : rule__GlobalTransitions__Group__1__Impl rule__GlobalTransitions__Group__2 ;
    public final void rule__GlobalTransitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1183:1: ( rule__GlobalTransitions__Group__1__Impl rule__GlobalTransitions__Group__2 )
            // InternalPolycreate.g:1184:2: rule__GlobalTransitions__Group__1__Impl rule__GlobalTransitions__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GlobalTransitions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group__2();

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
    // $ANTLR end "rule__GlobalTransitions__Group__1"


    // $ANTLR start "rule__GlobalTransitions__Group__1__Impl"
    // InternalPolycreate.g:1191:1: rule__GlobalTransitions__Group__1__Impl : ( ( rule__GlobalTransitions__ConditionsAssignment_1 ) ) ;
    public final void rule__GlobalTransitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1195:1: ( ( ( rule__GlobalTransitions__ConditionsAssignment_1 ) ) )
            // InternalPolycreate.g:1196:1: ( ( rule__GlobalTransitions__ConditionsAssignment_1 ) )
            {
            // InternalPolycreate.g:1196:1: ( ( rule__GlobalTransitions__ConditionsAssignment_1 ) )
            // InternalPolycreate.g:1197:2: ( rule__GlobalTransitions__ConditionsAssignment_1 )
            {
             before(grammarAccess.getGlobalTransitionsAccess().getConditionsAssignment_1()); 
            // InternalPolycreate.g:1198:2: ( rule__GlobalTransitions__ConditionsAssignment_1 )
            // InternalPolycreate.g:1198:3: rule__GlobalTransitions__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__ConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalTransitionsAccess().getConditionsAssignment_1()); 

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
    // $ANTLR end "rule__GlobalTransitions__Group__1__Impl"


    // $ANTLR start "rule__GlobalTransitions__Group__2"
    // InternalPolycreate.g:1206:1: rule__GlobalTransitions__Group__2 : rule__GlobalTransitions__Group__2__Impl rule__GlobalTransitions__Group__3 ;
    public final void rule__GlobalTransitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1210:1: ( rule__GlobalTransitions__Group__2__Impl rule__GlobalTransitions__Group__3 )
            // InternalPolycreate.g:1211:2: rule__GlobalTransitions__Group__2__Impl rule__GlobalTransitions__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GlobalTransitions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group__3();

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
    // $ANTLR end "rule__GlobalTransitions__Group__2"


    // $ANTLR start "rule__GlobalTransitions__Group__2__Impl"
    // InternalPolycreate.g:1218:1: rule__GlobalTransitions__Group__2__Impl : ( ( rule__GlobalTransitions__Group_2__0 )* ) ;
    public final void rule__GlobalTransitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1222:1: ( ( ( rule__GlobalTransitions__Group_2__0 )* ) )
            // InternalPolycreate.g:1223:1: ( ( rule__GlobalTransitions__Group_2__0 )* )
            {
            // InternalPolycreate.g:1223:1: ( ( rule__GlobalTransitions__Group_2__0 )* )
            // InternalPolycreate.g:1224:2: ( rule__GlobalTransitions__Group_2__0 )*
            {
             before(grammarAccess.getGlobalTransitionsAccess().getGroup_2()); 
            // InternalPolycreate.g:1225:2: ( rule__GlobalTransitions__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPolycreate.g:1225:3: rule__GlobalTransitions__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__GlobalTransitions__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getGlobalTransitionsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__GlobalTransitions__Group__2__Impl"


    // $ANTLR start "rule__GlobalTransitions__Group__3"
    // InternalPolycreate.g:1233:1: rule__GlobalTransitions__Group__3 : rule__GlobalTransitions__Group__3__Impl rule__GlobalTransitions__Group__4 ;
    public final void rule__GlobalTransitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1237:1: ( rule__GlobalTransitions__Group__3__Impl rule__GlobalTransitions__Group__4 )
            // InternalPolycreate.g:1238:2: rule__GlobalTransitions__Group__3__Impl rule__GlobalTransitions__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__GlobalTransitions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group__4();

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
    // $ANTLR end "rule__GlobalTransitions__Group__3"


    // $ANTLR start "rule__GlobalTransitions__Group__3__Impl"
    // InternalPolycreate.g:1245:1: rule__GlobalTransitions__Group__3__Impl : ( '=>' ) ;
    public final void rule__GlobalTransitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1249:1: ( ( '=>' ) )
            // InternalPolycreate.g:1250:1: ( '=>' )
            {
            // InternalPolycreate.g:1250:1: ( '=>' )
            // InternalPolycreate.g:1251:2: '=>'
            {
             before(grammarAccess.getGlobalTransitionsAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGlobalTransitionsAccess().getEqualsSignGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__GlobalTransitions__Group__3__Impl"


    // $ANTLR start "rule__GlobalTransitions__Group__4"
    // InternalPolycreate.g:1260:1: rule__GlobalTransitions__Group__4 : rule__GlobalTransitions__Group__4__Impl ;
    public final void rule__GlobalTransitions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1264:1: ( rule__GlobalTransitions__Group__4__Impl )
            // InternalPolycreate.g:1265:2: rule__GlobalTransitions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group__4__Impl();

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
    // $ANTLR end "rule__GlobalTransitions__Group__4"


    // $ANTLR start "rule__GlobalTransitions__Group__4__Impl"
    // InternalPolycreate.g:1271:1: rule__GlobalTransitions__Group__4__Impl : ( ( rule__GlobalTransitions__NextStateAssignment_4 ) ) ;
    public final void rule__GlobalTransitions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1275:1: ( ( ( rule__GlobalTransitions__NextStateAssignment_4 ) ) )
            // InternalPolycreate.g:1276:1: ( ( rule__GlobalTransitions__NextStateAssignment_4 ) )
            {
            // InternalPolycreate.g:1276:1: ( ( rule__GlobalTransitions__NextStateAssignment_4 ) )
            // InternalPolycreate.g:1277:2: ( rule__GlobalTransitions__NextStateAssignment_4 )
            {
             before(grammarAccess.getGlobalTransitionsAccess().getNextStateAssignment_4()); 
            // InternalPolycreate.g:1278:2: ( rule__GlobalTransitions__NextStateAssignment_4 )
            // InternalPolycreate.g:1278:3: rule__GlobalTransitions__NextStateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__NextStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalTransitionsAccess().getNextStateAssignment_4()); 

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
    // $ANTLR end "rule__GlobalTransitions__Group__4__Impl"


    // $ANTLR start "rule__GlobalTransitions__Group_2__0"
    // InternalPolycreate.g:1287:1: rule__GlobalTransitions__Group_2__0 : rule__GlobalTransitions__Group_2__0__Impl rule__GlobalTransitions__Group_2__1 ;
    public final void rule__GlobalTransitions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1291:1: ( rule__GlobalTransitions__Group_2__0__Impl rule__GlobalTransitions__Group_2__1 )
            // InternalPolycreate.g:1292:2: rule__GlobalTransitions__Group_2__0__Impl rule__GlobalTransitions__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__GlobalTransitions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group_2__1();

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
    // $ANTLR end "rule__GlobalTransitions__Group_2__0"


    // $ANTLR start "rule__GlobalTransitions__Group_2__0__Impl"
    // InternalPolycreate.g:1299:1: rule__GlobalTransitions__Group_2__0__Impl : ( 'and' ) ;
    public final void rule__GlobalTransitions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1303:1: ( ( 'and' ) )
            // InternalPolycreate.g:1304:1: ( 'and' )
            {
            // InternalPolycreate.g:1304:1: ( 'and' )
            // InternalPolycreate.g:1305:2: 'and'
            {
             before(grammarAccess.getGlobalTransitionsAccess().getAndKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGlobalTransitionsAccess().getAndKeyword_2_0()); 

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
    // $ANTLR end "rule__GlobalTransitions__Group_2__0__Impl"


    // $ANTLR start "rule__GlobalTransitions__Group_2__1"
    // InternalPolycreate.g:1314:1: rule__GlobalTransitions__Group_2__1 : rule__GlobalTransitions__Group_2__1__Impl ;
    public final void rule__GlobalTransitions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1318:1: ( rule__GlobalTransitions__Group_2__1__Impl )
            // InternalPolycreate.g:1319:2: rule__GlobalTransitions__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__Group_2__1__Impl();

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
    // $ANTLR end "rule__GlobalTransitions__Group_2__1"


    // $ANTLR start "rule__GlobalTransitions__Group_2__1__Impl"
    // InternalPolycreate.g:1325:1: rule__GlobalTransitions__Group_2__1__Impl : ( ( rule__GlobalTransitions__ConditionsAssignment_2_1 ) ) ;
    public final void rule__GlobalTransitions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1329:1: ( ( ( rule__GlobalTransitions__ConditionsAssignment_2_1 ) ) )
            // InternalPolycreate.g:1330:1: ( ( rule__GlobalTransitions__ConditionsAssignment_2_1 ) )
            {
            // InternalPolycreate.g:1330:1: ( ( rule__GlobalTransitions__ConditionsAssignment_2_1 ) )
            // InternalPolycreate.g:1331:2: ( rule__GlobalTransitions__ConditionsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalTransitionsAccess().getConditionsAssignment_2_1()); 
            // InternalPolycreate.g:1332:2: ( rule__GlobalTransitions__ConditionsAssignment_2_1 )
            // InternalPolycreate.g:1332:3: rule__GlobalTransitions__ConditionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalTransitions__ConditionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalTransitionsAccess().getConditionsAssignment_2_1()); 

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
    // $ANTLR end "rule__GlobalTransitions__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalPolycreate.g:1341:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1345:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalPolycreate.g:1346:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPolycreate.g:1353:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1357:1: ( ( () ) )
            // InternalPolycreate.g:1358:1: ( () )
            {
            // InternalPolycreate.g:1358:1: ( () )
            // InternalPolycreate.g:1359:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalPolycreate.g:1360:2: ()
            // InternalPolycreate.g:1360:3: 
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
    // InternalPolycreate.g:1368:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1372:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalPolycreate.g:1373:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalPolycreate.g:1380:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1384:1: ( ( 'State' ) )
            // InternalPolycreate.g:1385:1: ( 'State' )
            {
            // InternalPolycreate.g:1385:1: ( 'State' )
            // InternalPolycreate.g:1386:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPolycreate.g:1395:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1399:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalPolycreate.g:1400:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalPolycreate.g:1407:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1411:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalPolycreate.g:1412:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:1412:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalPolycreate.g:1413:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:1414:2: ( rule__State__NameAssignment_2 )
            // InternalPolycreate.g:1414:3: rule__State__NameAssignment_2
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
    // InternalPolycreate.g:1422:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1426:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalPolycreate.g:1427:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalPolycreate.g:1434:1: rule__State__Group__3__Impl : ( ':' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1438:1: ( ( ':' ) )
            // InternalPolycreate.g:1439:1: ( ':' )
            {
            // InternalPolycreate.g:1439:1: ( ':' )
            // InternalPolycreate.g:1440:2: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getColonKeyword_3()); 

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
    // InternalPolycreate.g:1449:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1453:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalPolycreate.g:1454:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalPolycreate.g:1461:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1465:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalPolycreate.g:1466:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalPolycreate.g:1466:1: ( ( rule__State__Group_4__0 )? )
            // InternalPolycreate.g:1467:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalPolycreate.g:1468:2: ( rule__State__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPolycreate.g:1468:3: rule__State__Group_4__0
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
    // InternalPolycreate.g:1476:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1480:1: ( rule__State__Group__5__Impl )
            // InternalPolycreate.g:1481:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

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
    // InternalPolycreate.g:1487:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1491:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalPolycreate.g:1492:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalPolycreate.g:1492:1: ( ( rule__State__Group_5__0 )? )
            // InternalPolycreate.g:1493:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalPolycreate.g:1494:2: ( rule__State__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPolycreate.g:1494:3: rule__State__Group_5__0
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


    // $ANTLR start "rule__State__Group_4__0"
    // InternalPolycreate.g:1503:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1507:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalPolycreate.g:1508:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPolycreate.g:1515:1: rule__State__Group_4__0__Impl : ( 'actions' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1519:1: ( ( 'actions' ) )
            // InternalPolycreate.g:1520:1: ( 'actions' )
            {
            // InternalPolycreate.g:1520:1: ( 'actions' )
            // InternalPolycreate.g:1521:2: 'actions'
            {
             before(grammarAccess.getStateAccess().getActionsKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPolycreate.g:1530:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1534:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // InternalPolycreate.g:1535:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPolycreate.g:1542:1: rule__State__Group_4__1__Impl : ( '=' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1546:1: ( ( '=' ) )
            // InternalPolycreate.g:1547:1: ( '=' )
            {
            // InternalPolycreate.g:1547:1: ( '=' )
            // InternalPolycreate.g:1548:2: '='
            {
             before(grammarAccess.getStateAccess().getEqualsSignKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getEqualsSignKeyword_4_1()); 

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
    // InternalPolycreate.g:1557:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1561:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // InternalPolycreate.g:1562:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalPolycreate.g:1569:1: rule__State__Group_4__2__Impl : ( '[' ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1573:1: ( ( '[' ) )
            // InternalPolycreate.g:1574:1: ( '[' )
            {
            // InternalPolycreate.g:1574:1: ( '[' )
            // InternalPolycreate.g:1575:2: '['
            {
             before(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_4_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_4_2()); 

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
    // InternalPolycreate.g:1584:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl rule__State__Group_4__4 ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1588:1: ( rule__State__Group_4__3__Impl rule__State__Group_4__4 )
            // InternalPolycreate.g:1589:2: rule__State__Group_4__3__Impl rule__State__Group_4__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPolycreate.g:1596:1: rule__State__Group_4__3__Impl : ( ( rule__State__ActionsAssignment_4_3 ) ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1600:1: ( ( ( rule__State__ActionsAssignment_4_3 ) ) )
            // InternalPolycreate.g:1601:1: ( ( rule__State__ActionsAssignment_4_3 ) )
            {
            // InternalPolycreate.g:1601:1: ( ( rule__State__ActionsAssignment_4_3 ) )
            // InternalPolycreate.g:1602:2: ( rule__State__ActionsAssignment_4_3 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_3()); 
            // InternalPolycreate.g:1603:2: ( rule__State__ActionsAssignment_4_3 )
            // InternalPolycreate.g:1603:3: rule__State__ActionsAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionsAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_4_3()); 

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
    // InternalPolycreate.g:1611:1: rule__State__Group_4__4 : rule__State__Group_4__4__Impl rule__State__Group_4__5 ;
    public final void rule__State__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1615:1: ( rule__State__Group_4__4__Impl rule__State__Group_4__5 )
            // InternalPolycreate.g:1616:2: rule__State__Group_4__4__Impl rule__State__Group_4__5
            {
            pushFollow(FOLLOW_19);
            rule__State__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__5();

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
    // InternalPolycreate.g:1623:1: rule__State__Group_4__4__Impl : ( ( rule__State__Group_4_4__0 )* ) ;
    public final void rule__State__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1627:1: ( ( ( rule__State__Group_4_4__0 )* ) )
            // InternalPolycreate.g:1628:1: ( ( rule__State__Group_4_4__0 )* )
            {
            // InternalPolycreate.g:1628:1: ( ( rule__State__Group_4_4__0 )* )
            // InternalPolycreate.g:1629:2: ( rule__State__Group_4_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4_4()); 
            // InternalPolycreate.g:1630:2: ( rule__State__Group_4_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPolycreate.g:1630:3: rule__State__Group_4_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__Group_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_4_4()); 

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


    // $ANTLR start "rule__State__Group_4__5"
    // InternalPolycreate.g:1638:1: rule__State__Group_4__5 : rule__State__Group_4__5__Impl ;
    public final void rule__State__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1642:1: ( rule__State__Group_4__5__Impl )
            // InternalPolycreate.g:1643:2: rule__State__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4__5__Impl();

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
    // $ANTLR end "rule__State__Group_4__5"


    // $ANTLR start "rule__State__Group_4__5__Impl"
    // InternalPolycreate.g:1649:1: rule__State__Group_4__5__Impl : ( ']' ) ;
    public final void rule__State__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1653:1: ( ( ']' ) )
            // InternalPolycreate.g:1654:1: ( ']' )
            {
            // InternalPolycreate.g:1654:1: ( ']' )
            // InternalPolycreate.g:1655:2: ']'
            {
             before(grammarAccess.getStateAccess().getRightSquareBracketKeyword_4_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightSquareBracketKeyword_4_5()); 

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
    // $ANTLR end "rule__State__Group_4__5__Impl"


    // $ANTLR start "rule__State__Group_4_4__0"
    // InternalPolycreate.g:1665:1: rule__State__Group_4_4__0 : rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1 ;
    public final void rule__State__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1669:1: ( rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1 )
            // InternalPolycreate.g:1670:2: rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1
            {
            pushFollow(FOLLOW_18);
            rule__State__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4_4__1();

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
    // $ANTLR end "rule__State__Group_4_4__0"


    // $ANTLR start "rule__State__Group_4_4__0__Impl"
    // InternalPolycreate.g:1677:1: rule__State__Group_4_4__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1681:1: ( ( ',' ) )
            // InternalPolycreate.g:1682:1: ( ',' )
            {
            // InternalPolycreate.g:1682:1: ( ',' )
            // InternalPolycreate.g:1683:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_4_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getCommaKeyword_4_4_0()); 

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
    // $ANTLR end "rule__State__Group_4_4__0__Impl"


    // $ANTLR start "rule__State__Group_4_4__1"
    // InternalPolycreate.g:1692:1: rule__State__Group_4_4__1 : rule__State__Group_4_4__1__Impl ;
    public final void rule__State__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1696:1: ( rule__State__Group_4_4__1__Impl )
            // InternalPolycreate.g:1697:2: rule__State__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4_4__1__Impl();

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
    // $ANTLR end "rule__State__Group_4_4__1"


    // $ANTLR start "rule__State__Group_4_4__1__Impl"
    // InternalPolycreate.g:1703:1: rule__State__Group_4_4__1__Impl : ( ( rule__State__ActionsAssignment_4_4_1 ) ) ;
    public final void rule__State__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1707:1: ( ( ( rule__State__ActionsAssignment_4_4_1 ) ) )
            // InternalPolycreate.g:1708:1: ( ( rule__State__ActionsAssignment_4_4_1 ) )
            {
            // InternalPolycreate.g:1708:1: ( ( rule__State__ActionsAssignment_4_4_1 ) )
            // InternalPolycreate.g:1709:2: ( rule__State__ActionsAssignment_4_4_1 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_4_1()); 
            // InternalPolycreate.g:1710:2: ( rule__State__ActionsAssignment_4_4_1 )
            // InternalPolycreate.g:1710:3: rule__State__ActionsAssignment_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionsAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_4_4_1()); 

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
    // $ANTLR end "rule__State__Group_4_4__1__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // InternalPolycreate.g:1719:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1723:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalPolycreate.g:1724:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPolycreate.g:1731:1: rule__State__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1735:1: ( ( 'transitions' ) )
            // InternalPolycreate.g:1736:1: ( 'transitions' )
            {
            // InternalPolycreate.g:1736:1: ( 'transitions' )
            // InternalPolycreate.g:1737:2: 'transitions'
            {
             before(grammarAccess.getStateAccess().getTransitionsKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPolycreate.g:1746:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1750:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalPolycreate.g:1751:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
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
    // InternalPolycreate.g:1758:1: rule__State__Group_5__1__Impl : ( '=' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1762:1: ( ( '=' ) )
            // InternalPolycreate.g:1763:1: ( '=' )
            {
            // InternalPolycreate.g:1763:1: ( '=' )
            // InternalPolycreate.g:1764:2: '='
            {
             before(grammarAccess.getStateAccess().getEqualsSignKeyword_5_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getEqualsSignKeyword_5_1()); 

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
    // InternalPolycreate.g:1773:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1777:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalPolycreate.g:1778:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalPolycreate.g:1785:1: rule__State__Group_5__2__Impl : ( '[' ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1789:1: ( ( '[' ) )
            // InternalPolycreate.g:1790:1: ( '[' )
            {
            // InternalPolycreate.g:1790:1: ( '[' )
            // InternalPolycreate.g:1791:2: '['
            {
             before(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_5_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_5_2()); 

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
    // InternalPolycreate.g:1800:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1804:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalPolycreate.g:1805:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalPolycreate.g:1812:1: rule__State__Group_5__3__Impl : ( ( rule__State__TransitionsAssignment_5_3 ) ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1816:1: ( ( ( rule__State__TransitionsAssignment_5_3 ) ) )
            // InternalPolycreate.g:1817:1: ( ( rule__State__TransitionsAssignment_5_3 ) )
            {
            // InternalPolycreate.g:1817:1: ( ( rule__State__TransitionsAssignment_5_3 ) )
            // InternalPolycreate.g:1818:2: ( rule__State__TransitionsAssignment_5_3 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_3()); 
            // InternalPolycreate.g:1819:2: ( rule__State__TransitionsAssignment_5_3 )
            // InternalPolycreate.g:1819:3: rule__State__TransitionsAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionsAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionsAssignment_5_3()); 

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
    // InternalPolycreate.g:1827:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl rule__State__Group_5__5 ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1831:1: ( rule__State__Group_5__4__Impl rule__State__Group_5__5 )
            // InternalPolycreate.g:1832:2: rule__State__Group_5__4__Impl rule__State__Group_5__5
            {
            pushFollow(FOLLOW_19);
            rule__State__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__5();

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
    // InternalPolycreate.g:1839:1: rule__State__Group_5__4__Impl : ( ( rule__State__Group_5_4__0 )* ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1843:1: ( ( ( rule__State__Group_5_4__0 )* ) )
            // InternalPolycreate.g:1844:1: ( ( rule__State__Group_5_4__0 )* )
            {
            // InternalPolycreate.g:1844:1: ( ( rule__State__Group_5_4__0 )* )
            // InternalPolycreate.g:1845:2: ( rule__State__Group_5_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_4()); 
            // InternalPolycreate.g:1846:2: ( rule__State__Group_5_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPolycreate.g:1846:3: rule__State__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5_4()); 

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


    // $ANTLR start "rule__State__Group_5__5"
    // InternalPolycreate.g:1854:1: rule__State__Group_5__5 : rule__State__Group_5__5__Impl ;
    public final void rule__State__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1858:1: ( rule__State__Group_5__5__Impl )
            // InternalPolycreate.g:1859:2: rule__State__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5__5__Impl();

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
    // $ANTLR end "rule__State__Group_5__5"


    // $ANTLR start "rule__State__Group_5__5__Impl"
    // InternalPolycreate.g:1865:1: rule__State__Group_5__5__Impl : ( ']' ) ;
    public final void rule__State__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1869:1: ( ( ']' ) )
            // InternalPolycreate.g:1870:1: ( ']' )
            {
            // InternalPolycreate.g:1870:1: ( ']' )
            // InternalPolycreate.g:1871:2: ']'
            {
             before(grammarAccess.getStateAccess().getRightSquareBracketKeyword_5_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightSquareBracketKeyword_5_5()); 

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
    // $ANTLR end "rule__State__Group_5__5__Impl"


    // $ANTLR start "rule__State__Group_5_4__0"
    // InternalPolycreate.g:1881:1: rule__State__Group_5_4__0 : rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1 ;
    public final void rule__State__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1885:1: ( rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1 )
            // InternalPolycreate.g:1886:2: rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1
            {
            pushFollow(FOLLOW_10);
            rule__State__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5_4__1();

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
    // $ANTLR end "rule__State__Group_5_4__0"


    // $ANTLR start "rule__State__Group_5_4__0__Impl"
    // InternalPolycreate.g:1893:1: rule__State__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1897:1: ( ( ',' ) )
            // InternalPolycreate.g:1898:1: ( ',' )
            {
            // InternalPolycreate.g:1898:1: ( ',' )
            // InternalPolycreate.g:1899:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getCommaKeyword_5_4_0()); 

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
    // $ANTLR end "rule__State__Group_5_4__0__Impl"


    // $ANTLR start "rule__State__Group_5_4__1"
    // InternalPolycreate.g:1908:1: rule__State__Group_5_4__1 : rule__State__Group_5_4__1__Impl ;
    public final void rule__State__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1912:1: ( rule__State__Group_5_4__1__Impl )
            // InternalPolycreate.g:1913:2: rule__State__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5_4__1__Impl();

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
    // $ANTLR end "rule__State__Group_5_4__1"


    // $ANTLR start "rule__State__Group_5_4__1__Impl"
    // InternalPolycreate.g:1919:1: rule__State__Group_5_4__1__Impl : ( ( rule__State__TransitionsAssignment_5_4_1 ) ) ;
    public final void rule__State__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1923:1: ( ( ( rule__State__TransitionsAssignment_5_4_1 ) ) )
            // InternalPolycreate.g:1924:1: ( ( rule__State__TransitionsAssignment_5_4_1 ) )
            {
            // InternalPolycreate.g:1924:1: ( ( rule__State__TransitionsAssignment_5_4_1 ) )
            // InternalPolycreate.g:1925:2: ( rule__State__TransitionsAssignment_5_4_1 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_4_1()); 
            // InternalPolycreate.g:1926:2: ( rule__State__TransitionsAssignment_5_4_1 )
            // InternalPolycreate.g:1926:3: rule__State__TransitionsAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionsAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionsAssignment_5_4_1()); 

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
    // $ANTLR end "rule__State__Group_5_4__1__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__0"
    // InternalPolycreate.g:1935:1: rule__SimpleCondition__Group__0 : rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 ;
    public final void rule__SimpleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1939:1: ( rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 )
            // InternalPolycreate.g:1940:2: rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalPolycreate.g:1947:1: rule__SimpleCondition__Group__0__Impl : ( () ) ;
    public final void rule__SimpleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1951:1: ( ( () ) )
            // InternalPolycreate.g:1952:1: ( () )
            {
            // InternalPolycreate.g:1952:1: ( () )
            // InternalPolycreate.g:1953:2: ()
            {
             before(grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0()); 
            // InternalPolycreate.g:1954:2: ()
            // InternalPolycreate.g:1954:3: 
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
    // InternalPolycreate.g:1962:1: rule__SimpleCondition__Group__1 : rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 ;
    public final void rule__SimpleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1966:1: ( rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 )
            // InternalPolycreate.g:1967:2: rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalPolycreate.g:1974:1: rule__SimpleCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__SimpleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1978:1: ( ( 'detect' ) )
            // InternalPolycreate.g:1979:1: ( 'detect' )
            {
            // InternalPolycreate.g:1979:1: ( 'detect' )
            // InternalPolycreate.g:1980:2: 'detect'
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSimpleConditionAccess().getDetectKeyword_1()); 

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
    // InternalPolycreate.g:1989:1: rule__SimpleCondition__Group__2 : rule__SimpleCondition__Group__2__Impl ;
    public final void rule__SimpleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1993:1: ( rule__SimpleCondition__Group__2__Impl )
            // InternalPolycreate.g:1994:2: rule__SimpleCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__2__Impl();

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
    // InternalPolycreate.g:2000:1: rule__SimpleCondition__Group__2__Impl : ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) ) ;
    public final void rule__SimpleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2004:1: ( ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) ) )
            // InternalPolycreate.g:2005:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) )
            {
            // InternalPolycreate.g:2005:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) )
            // InternalPolycreate.g:2006:2: ( rule__SimpleCondition__DetectionTypeAssignment_2 )
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectionTypeAssignment_2()); 
            // InternalPolycreate.g:2007:2: ( rule__SimpleCondition__DetectionTypeAssignment_2 )
            // InternalPolycreate.g:2007:3: rule__SimpleCondition__DetectionTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__DetectionTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConditionAccess().getDetectionTypeAssignment_2()); 

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


    // $ANTLR start "rule__DistanceCondition__Group__0"
    // InternalPolycreate.g:2016:1: rule__DistanceCondition__Group__0 : rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 ;
    public final void rule__DistanceCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2020:1: ( rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 )
            // InternalPolycreate.g:2021:2: rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DistanceCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__1();

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
    // $ANTLR end "rule__DistanceCondition__Group__0"


    // $ANTLR start "rule__DistanceCondition__Group__0__Impl"
    // InternalPolycreate.g:2028:1: rule__DistanceCondition__Group__0__Impl : ( () ) ;
    public final void rule__DistanceCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2032:1: ( ( () ) )
            // InternalPolycreate.g:2033:1: ( () )
            {
            // InternalPolycreate.g:2033:1: ( () )
            // InternalPolycreate.g:2034:2: ()
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceConditionAction_0()); 
            // InternalPolycreate.g:2035:2: ()
            // InternalPolycreate.g:2035:3: 
            {
            }

             after(grammarAccess.getDistanceConditionAccess().getDistanceConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceCondition__Group__0__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__1"
    // InternalPolycreate.g:2043:1: rule__DistanceCondition__Group__1 : rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 ;
    public final void rule__DistanceCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2047:1: ( rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 )
            // InternalPolycreate.g:2048:2: rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__DistanceCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__2();

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
    // $ANTLR end "rule__DistanceCondition__Group__1"


    // $ANTLR start "rule__DistanceCondition__Group__1__Impl"
    // InternalPolycreate.g:2055:1: rule__DistanceCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__DistanceCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2059:1: ( ( 'detect' ) )
            // InternalPolycreate.g:2060:1: ( 'detect' )
            {
            // InternalPolycreate.g:2060:1: ( 'detect' )
            // InternalPolycreate.g:2061:2: 'detect'
            {
             before(grammarAccess.getDistanceConditionAccess().getDetectKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDistanceConditionAccess().getDetectKeyword_1()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__1__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__2"
    // InternalPolycreate.g:2070:1: rule__DistanceCondition__Group__2 : rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3 ;
    public final void rule__DistanceCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2074:1: ( rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3 )
            // InternalPolycreate.g:2075:2: rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__DistanceCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__3();

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
    // $ANTLR end "rule__DistanceCondition__Group__2"


    // $ANTLR start "rule__DistanceCondition__Group__2__Impl"
    // InternalPolycreate.g:2082:1: rule__DistanceCondition__Group__2__Impl : ( 'object' ) ;
    public final void rule__DistanceCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2086:1: ( ( 'object' ) )
            // InternalPolycreate.g:2087:1: ( 'object' )
            {
            // InternalPolycreate.g:2087:1: ( 'object' )
            // InternalPolycreate.g:2088:2: 'object'
            {
             before(grammarAccess.getDistanceConditionAccess().getObjectKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDistanceConditionAccess().getObjectKeyword_2()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__2__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__3"
    // InternalPolycreate.g:2097:1: rule__DistanceCondition__Group__3 : rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4 ;
    public final void rule__DistanceCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2101:1: ( rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4 )
            // InternalPolycreate.g:2102:2: rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__DistanceCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__4();

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
    // $ANTLR end "rule__DistanceCondition__Group__3"


    // $ANTLR start "rule__DistanceCondition__Group__3__Impl"
    // InternalPolycreate.g:2109:1: rule__DistanceCondition__Group__3__Impl : ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) ) ;
    public final void rule__DistanceCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2113:1: ( ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) ) )
            // InternalPolycreate.g:2114:1: ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) )
            {
            // InternalPolycreate.g:2114:1: ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) )
            // InternalPolycreate.g:2115:2: ( rule__DistanceCondition__CameraTypeAssignment_3 )
            {
             before(grammarAccess.getDistanceConditionAccess().getCameraTypeAssignment_3()); 
            // InternalPolycreate.g:2116:2: ( rule__DistanceCondition__CameraTypeAssignment_3 )
            // InternalPolycreate.g:2116:3: rule__DistanceCondition__CameraTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__CameraTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getCameraTypeAssignment_3()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__3__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__4"
    // InternalPolycreate.g:2124:1: rule__DistanceCondition__Group__4 : rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5 ;
    public final void rule__DistanceCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2128:1: ( rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5 )
            // InternalPolycreate.g:2129:2: rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__DistanceCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__5();

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
    // $ANTLR end "rule__DistanceCondition__Group__4"


    // $ANTLR start "rule__DistanceCondition__Group__4__Impl"
    // InternalPolycreate.g:2136:1: rule__DistanceCondition__Group__4__Impl : ( 'with' ) ;
    public final void rule__DistanceCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2140:1: ( ( 'with' ) )
            // InternalPolycreate.g:2141:1: ( 'with' )
            {
            // InternalPolycreate.g:2141:1: ( 'with' )
            // InternalPolycreate.g:2142:2: 'with'
            {
             before(grammarAccess.getDistanceConditionAccess().getWithKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDistanceConditionAccess().getWithKeyword_4()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__4__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__5"
    // InternalPolycreate.g:2151:1: rule__DistanceCondition__Group__5 : rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6 ;
    public final void rule__DistanceCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2155:1: ( rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6 )
            // InternalPolycreate.g:2156:2: rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__DistanceCondition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__6();

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
    // $ANTLR end "rule__DistanceCondition__Group__5"


    // $ANTLR start "rule__DistanceCondition__Group__5__Impl"
    // InternalPolycreate.g:2163:1: rule__DistanceCondition__Group__5__Impl : ( 'distance' ) ;
    public final void rule__DistanceCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2167:1: ( ( 'distance' ) )
            // InternalPolycreate.g:2168:1: ( 'distance' )
            {
            // InternalPolycreate.g:2168:1: ( 'distance' )
            // InternalPolycreate.g:2169:2: 'distance'
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDistanceConditionAccess().getDistanceKeyword_5()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__5__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__6"
    // InternalPolycreate.g:2178:1: rule__DistanceCondition__Group__6 : rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7 ;
    public final void rule__DistanceCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2182:1: ( rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7 )
            // InternalPolycreate.g:2183:2: rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__DistanceCondition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__7();

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
    // $ANTLR end "rule__DistanceCondition__Group__6"


    // $ANTLR start "rule__DistanceCondition__Group__6__Impl"
    // InternalPolycreate.g:2190:1: rule__DistanceCondition__Group__6__Impl : ( ( rule__DistanceCondition__OperatorAssignment_6 ) ) ;
    public final void rule__DistanceCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2194:1: ( ( ( rule__DistanceCondition__OperatorAssignment_6 ) ) )
            // InternalPolycreate.g:2195:1: ( ( rule__DistanceCondition__OperatorAssignment_6 ) )
            {
            // InternalPolycreate.g:2195:1: ( ( rule__DistanceCondition__OperatorAssignment_6 ) )
            // InternalPolycreate.g:2196:2: ( rule__DistanceCondition__OperatorAssignment_6 )
            {
             before(grammarAccess.getDistanceConditionAccess().getOperatorAssignment_6()); 
            // InternalPolycreate.g:2197:2: ( rule__DistanceCondition__OperatorAssignment_6 )
            // InternalPolycreate.g:2197:3: rule__DistanceCondition__OperatorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__OperatorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getOperatorAssignment_6()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__6__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__7"
    // InternalPolycreate.g:2205:1: rule__DistanceCondition__Group__7 : rule__DistanceCondition__Group__7__Impl ;
    public final void rule__DistanceCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2209:1: ( rule__DistanceCondition__Group__7__Impl )
            // InternalPolycreate.g:2210:2: rule__DistanceCondition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__7__Impl();

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
    // $ANTLR end "rule__DistanceCondition__Group__7"


    // $ANTLR start "rule__DistanceCondition__Group__7__Impl"
    // InternalPolycreate.g:2216:1: rule__DistanceCondition__Group__7__Impl : ( ( rule__DistanceCondition__DistanceAssignment_7 ) ) ;
    public final void rule__DistanceCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2220:1: ( ( ( rule__DistanceCondition__DistanceAssignment_7 ) ) )
            // InternalPolycreate.g:2221:1: ( ( rule__DistanceCondition__DistanceAssignment_7 ) )
            {
            // InternalPolycreate.g:2221:1: ( ( rule__DistanceCondition__DistanceAssignment_7 ) )
            // InternalPolycreate.g:2222:2: ( rule__DistanceCondition__DistanceAssignment_7 )
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceAssignment_7()); 
            // InternalPolycreate.g:2223:2: ( rule__DistanceCondition__DistanceAssignment_7 )
            // InternalPolycreate.g:2223:3: rule__DistanceCondition__DistanceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__DistanceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getDistanceAssignment_7()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__7__Impl"


    // $ANTLR start "rule__AngleCondition__Group__0"
    // InternalPolycreate.g:2232:1: rule__AngleCondition__Group__0 : rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1 ;
    public final void rule__AngleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2236:1: ( rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1 )
            // InternalPolycreate.g:2237:2: rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AngleCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__1();

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
    // $ANTLR end "rule__AngleCondition__Group__0"


    // $ANTLR start "rule__AngleCondition__Group__0__Impl"
    // InternalPolycreate.g:2244:1: rule__AngleCondition__Group__0__Impl : ( () ) ;
    public final void rule__AngleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2248:1: ( ( () ) )
            // InternalPolycreate.g:2249:1: ( () )
            {
            // InternalPolycreate.g:2249:1: ( () )
            // InternalPolycreate.g:2250:2: ()
            {
             before(grammarAccess.getAngleConditionAccess().getAngleConditionAction_0()); 
            // InternalPolycreate.g:2251:2: ()
            // InternalPolycreate.g:2251:3: 
            {
            }

             after(grammarAccess.getAngleConditionAccess().getAngleConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AngleCondition__Group__0__Impl"


    // $ANTLR start "rule__AngleCondition__Group__1"
    // InternalPolycreate.g:2259:1: rule__AngleCondition__Group__1 : rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2 ;
    public final void rule__AngleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2263:1: ( rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2 )
            // InternalPolycreate.g:2264:2: rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__AngleCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__2();

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
    // $ANTLR end "rule__AngleCondition__Group__1"


    // $ANTLR start "rule__AngleCondition__Group__1__Impl"
    // InternalPolycreate.g:2271:1: rule__AngleCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__AngleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2275:1: ( ( 'detect' ) )
            // InternalPolycreate.g:2276:1: ( 'detect' )
            {
            // InternalPolycreate.g:2276:1: ( 'detect' )
            // InternalPolycreate.g:2277:2: 'detect'
            {
             before(grammarAccess.getAngleConditionAccess().getDetectKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAngleConditionAccess().getDetectKeyword_1()); 

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
    // $ANTLR end "rule__AngleCondition__Group__1__Impl"


    // $ANTLR start "rule__AngleCondition__Group__2"
    // InternalPolycreate.g:2286:1: rule__AngleCondition__Group__2 : rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3 ;
    public final void rule__AngleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2290:1: ( rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3 )
            // InternalPolycreate.g:2291:2: rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__AngleCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__3();

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
    // $ANTLR end "rule__AngleCondition__Group__2"


    // $ANTLR start "rule__AngleCondition__Group__2__Impl"
    // InternalPolycreate.g:2298:1: rule__AngleCondition__Group__2__Impl : ( 'object' ) ;
    public final void rule__AngleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2302:1: ( ( 'object' ) )
            // InternalPolycreate.g:2303:1: ( 'object' )
            {
            // InternalPolycreate.g:2303:1: ( 'object' )
            // InternalPolycreate.g:2304:2: 'object'
            {
             before(grammarAccess.getAngleConditionAccess().getObjectKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAngleConditionAccess().getObjectKeyword_2()); 

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
    // $ANTLR end "rule__AngleCondition__Group__2__Impl"


    // $ANTLR start "rule__AngleCondition__Group__3"
    // InternalPolycreate.g:2313:1: rule__AngleCondition__Group__3 : rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4 ;
    public final void rule__AngleCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2317:1: ( rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4 )
            // InternalPolycreate.g:2318:2: rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__AngleCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__4();

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
    // $ANTLR end "rule__AngleCondition__Group__3"


    // $ANTLR start "rule__AngleCondition__Group__3__Impl"
    // InternalPolycreate.g:2325:1: rule__AngleCondition__Group__3__Impl : ( ( rule__AngleCondition__CameraTypeAssignment_3 ) ) ;
    public final void rule__AngleCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2329:1: ( ( ( rule__AngleCondition__CameraTypeAssignment_3 ) ) )
            // InternalPolycreate.g:2330:1: ( ( rule__AngleCondition__CameraTypeAssignment_3 ) )
            {
            // InternalPolycreate.g:2330:1: ( ( rule__AngleCondition__CameraTypeAssignment_3 ) )
            // InternalPolycreate.g:2331:2: ( rule__AngleCondition__CameraTypeAssignment_3 )
            {
             before(grammarAccess.getAngleConditionAccess().getCameraTypeAssignment_3()); 
            // InternalPolycreate.g:2332:2: ( rule__AngleCondition__CameraTypeAssignment_3 )
            // InternalPolycreate.g:2332:3: rule__AngleCondition__CameraTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AngleCondition__CameraTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAngleConditionAccess().getCameraTypeAssignment_3()); 

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
    // $ANTLR end "rule__AngleCondition__Group__3__Impl"


    // $ANTLR start "rule__AngleCondition__Group__4"
    // InternalPolycreate.g:2340:1: rule__AngleCondition__Group__4 : rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5 ;
    public final void rule__AngleCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2344:1: ( rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5 )
            // InternalPolycreate.g:2345:2: rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__AngleCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__5();

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
    // $ANTLR end "rule__AngleCondition__Group__4"


    // $ANTLR start "rule__AngleCondition__Group__4__Impl"
    // InternalPolycreate.g:2352:1: rule__AngleCondition__Group__4__Impl : ( 'with' ) ;
    public final void rule__AngleCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2356:1: ( ( 'with' ) )
            // InternalPolycreate.g:2357:1: ( 'with' )
            {
            // InternalPolycreate.g:2357:1: ( 'with' )
            // InternalPolycreate.g:2358:2: 'with'
            {
             before(grammarAccess.getAngleConditionAccess().getWithKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAngleConditionAccess().getWithKeyword_4()); 

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
    // $ANTLR end "rule__AngleCondition__Group__4__Impl"


    // $ANTLR start "rule__AngleCondition__Group__5"
    // InternalPolycreate.g:2367:1: rule__AngleCondition__Group__5 : rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6 ;
    public final void rule__AngleCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2371:1: ( rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6 )
            // InternalPolycreate.g:2372:2: rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__AngleCondition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__6();

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
    // $ANTLR end "rule__AngleCondition__Group__5"


    // $ANTLR start "rule__AngleCondition__Group__5__Impl"
    // InternalPolycreate.g:2379:1: rule__AngleCondition__Group__5__Impl : ( 'angle' ) ;
    public final void rule__AngleCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2383:1: ( ( 'angle' ) )
            // InternalPolycreate.g:2384:1: ( 'angle' )
            {
            // InternalPolycreate.g:2384:1: ( 'angle' )
            // InternalPolycreate.g:2385:2: 'angle'
            {
             before(grammarAccess.getAngleConditionAccess().getAngleKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAngleConditionAccess().getAngleKeyword_5()); 

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
    // $ANTLR end "rule__AngleCondition__Group__5__Impl"


    // $ANTLR start "rule__AngleCondition__Group__6"
    // InternalPolycreate.g:2394:1: rule__AngleCondition__Group__6 : rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7 ;
    public final void rule__AngleCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2398:1: ( rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7 )
            // InternalPolycreate.g:2399:2: rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__AngleCondition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__7();

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
    // $ANTLR end "rule__AngleCondition__Group__6"


    // $ANTLR start "rule__AngleCondition__Group__6__Impl"
    // InternalPolycreate.g:2406:1: rule__AngleCondition__Group__6__Impl : ( ( rule__AngleCondition__OperatorAssignment_6 ) ) ;
    public final void rule__AngleCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2410:1: ( ( ( rule__AngleCondition__OperatorAssignment_6 ) ) )
            // InternalPolycreate.g:2411:1: ( ( rule__AngleCondition__OperatorAssignment_6 ) )
            {
            // InternalPolycreate.g:2411:1: ( ( rule__AngleCondition__OperatorAssignment_6 ) )
            // InternalPolycreate.g:2412:2: ( rule__AngleCondition__OperatorAssignment_6 )
            {
             before(grammarAccess.getAngleConditionAccess().getOperatorAssignment_6()); 
            // InternalPolycreate.g:2413:2: ( rule__AngleCondition__OperatorAssignment_6 )
            // InternalPolycreate.g:2413:3: rule__AngleCondition__OperatorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AngleCondition__OperatorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAngleConditionAccess().getOperatorAssignment_6()); 

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
    // $ANTLR end "rule__AngleCondition__Group__6__Impl"


    // $ANTLR start "rule__AngleCondition__Group__7"
    // InternalPolycreate.g:2421:1: rule__AngleCondition__Group__7 : rule__AngleCondition__Group__7__Impl ;
    public final void rule__AngleCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2425:1: ( rule__AngleCondition__Group__7__Impl )
            // InternalPolycreate.g:2426:2: rule__AngleCondition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleCondition__Group__7__Impl();

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
    // $ANTLR end "rule__AngleCondition__Group__7"


    // $ANTLR start "rule__AngleCondition__Group__7__Impl"
    // InternalPolycreate.g:2432:1: rule__AngleCondition__Group__7__Impl : ( ( rule__AngleCondition__AngleAssignment_7 ) ) ;
    public final void rule__AngleCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2436:1: ( ( ( rule__AngleCondition__AngleAssignment_7 ) ) )
            // InternalPolycreate.g:2437:1: ( ( rule__AngleCondition__AngleAssignment_7 ) )
            {
            // InternalPolycreate.g:2437:1: ( ( rule__AngleCondition__AngleAssignment_7 ) )
            // InternalPolycreate.g:2438:2: ( rule__AngleCondition__AngleAssignment_7 )
            {
             before(grammarAccess.getAngleConditionAccess().getAngleAssignment_7()); 
            // InternalPolycreate.g:2439:2: ( rule__AngleCondition__AngleAssignment_7 )
            // InternalPolycreate.g:2439:3: rule__AngleCondition__AngleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AngleCondition__AngleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAngleConditionAccess().getAngleAssignment_7()); 

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
    // $ANTLR end "rule__AngleCondition__Group__7__Impl"


    // $ANTLR start "rule__MoveAction__Group__0"
    // InternalPolycreate.g:2448:1: rule__MoveAction__Group__0 : rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 ;
    public final void rule__MoveAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2452:1: ( rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 )
            // InternalPolycreate.g:2453:2: rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPolycreate.g:2460:1: rule__MoveAction__Group__0__Impl : ( () ) ;
    public final void rule__MoveAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2464:1: ( ( () ) )
            // InternalPolycreate.g:2465:1: ( () )
            {
            // InternalPolycreate.g:2465:1: ( () )
            // InternalPolycreate.g:2466:2: ()
            {
             before(grammarAccess.getMoveActionAccess().getMoveActionAction_0()); 
            // InternalPolycreate.g:2467:2: ()
            // InternalPolycreate.g:2467:3: 
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
    // InternalPolycreate.g:2475:1: rule__MoveAction__Group__1 : rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 ;
    public final void rule__MoveAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2479:1: ( rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 )
            // InternalPolycreate.g:2480:2: rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalPolycreate.g:2487:1: rule__MoveAction__Group__1__Impl : ( 'move' ) ;
    public final void rule__MoveAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2491:1: ( ( 'move' ) )
            // InternalPolycreate.g:2492:1: ( 'move' )
            {
            // InternalPolycreate.g:2492:1: ( 'move' )
            // InternalPolycreate.g:2493:2: 'move'
            {
             before(grammarAccess.getMoveActionAccess().getMoveKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getMoveKeyword_1()); 

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
    // InternalPolycreate.g:2502:1: rule__MoveAction__Group__2 : rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 ;
    public final void rule__MoveAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2506:1: ( rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 )
            // InternalPolycreate.g:2507:2: rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalPolycreate.g:2514:1: rule__MoveAction__Group__2__Impl : ( ( rule__MoveAction__DirectionAssignment_2 ) ) ;
    public final void rule__MoveAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2518:1: ( ( ( rule__MoveAction__DirectionAssignment_2 ) ) )
            // InternalPolycreate.g:2519:1: ( ( rule__MoveAction__DirectionAssignment_2 ) )
            {
            // InternalPolycreate.g:2519:1: ( ( rule__MoveAction__DirectionAssignment_2 ) )
            // InternalPolycreate.g:2520:2: ( rule__MoveAction__DirectionAssignment_2 )
            {
             before(grammarAccess.getMoveActionAccess().getDirectionAssignment_2()); 
            // InternalPolycreate.g:2521:2: ( rule__MoveAction__DirectionAssignment_2 )
            // InternalPolycreate.g:2521:3: rule__MoveAction__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveActionAccess().getDirectionAssignment_2()); 

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
    // InternalPolycreate.g:2529:1: rule__MoveAction__Group__3 : rule__MoveAction__Group__3__Impl rule__MoveAction__Group__4 ;
    public final void rule__MoveAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2533:1: ( rule__MoveAction__Group__3__Impl rule__MoveAction__Group__4 )
            // InternalPolycreate.g:2534:2: rule__MoveAction__Group__3__Impl rule__MoveAction__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalPolycreate.g:2541:1: rule__MoveAction__Group__3__Impl : ( 'during' ) ;
    public final void rule__MoveAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2545:1: ( ( 'during' ) )
            // InternalPolycreate.g:2546:1: ( 'during' )
            {
            // InternalPolycreate.g:2546:1: ( 'during' )
            // InternalPolycreate.g:2547:2: 'during'
            {
             before(grammarAccess.getMoveActionAccess().getDuringKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getDuringKeyword_3()); 

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
    // InternalPolycreate.g:2556:1: rule__MoveAction__Group__4 : rule__MoveAction__Group__4__Impl ;
    public final void rule__MoveAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2560:1: ( rule__MoveAction__Group__4__Impl )
            // InternalPolycreate.g:2561:2: rule__MoveAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__4__Impl();

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
    // InternalPolycreate.g:2567:1: rule__MoveAction__Group__4__Impl : ( ( rule__MoveAction__DurationAssignment_4 ) ) ;
    public final void rule__MoveAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2571:1: ( ( ( rule__MoveAction__DurationAssignment_4 ) ) )
            // InternalPolycreate.g:2572:1: ( ( rule__MoveAction__DurationAssignment_4 ) )
            {
            // InternalPolycreate.g:2572:1: ( ( rule__MoveAction__DurationAssignment_4 ) )
            // InternalPolycreate.g:2573:2: ( rule__MoveAction__DurationAssignment_4 )
            {
             before(grammarAccess.getMoveActionAccess().getDurationAssignment_4()); 
            // InternalPolycreate.g:2574:2: ( rule__MoveAction__DurationAssignment_4 )
            // InternalPolycreate.g:2574:3: rule__MoveAction__DurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__DurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveActionAccess().getDurationAssignment_4()); 

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


    // $ANTLR start "rule__TurnAction__Group__0"
    // InternalPolycreate.g:2583:1: rule__TurnAction__Group__0 : rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 ;
    public final void rule__TurnAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2587:1: ( rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 )
            // InternalPolycreate.g:2588:2: rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPolycreate.g:2595:1: rule__TurnAction__Group__0__Impl : ( () ) ;
    public final void rule__TurnAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2599:1: ( ( () ) )
            // InternalPolycreate.g:2600:1: ( () )
            {
            // InternalPolycreate.g:2600:1: ( () )
            // InternalPolycreate.g:2601:2: ()
            {
             before(grammarAccess.getTurnActionAccess().getTurnActionAction_0()); 
            // InternalPolycreate.g:2602:2: ()
            // InternalPolycreate.g:2602:3: 
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
    // InternalPolycreate.g:2610:1: rule__TurnAction__Group__1 : rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 ;
    public final void rule__TurnAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2614:1: ( rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 )
            // InternalPolycreate.g:2615:2: rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalPolycreate.g:2622:1: rule__TurnAction__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2626:1: ( ( 'turn' ) )
            // InternalPolycreate.g:2627:1: ( 'turn' )
            {
            // InternalPolycreate.g:2627:1: ( 'turn' )
            // InternalPolycreate.g:2628:2: 'turn'
            {
             before(grammarAccess.getTurnActionAccess().getTurnKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getTurnKeyword_1()); 

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
    // InternalPolycreate.g:2637:1: rule__TurnAction__Group__2 : rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 ;
    public final void rule__TurnAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2641:1: ( rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 )
            // InternalPolycreate.g:2642:2: rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalPolycreate.g:2649:1: rule__TurnAction__Group__2__Impl : ( ( rule__TurnAction__AngleAssignment_2 ) ) ;
    public final void rule__TurnAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2653:1: ( ( ( rule__TurnAction__AngleAssignment_2 ) ) )
            // InternalPolycreate.g:2654:1: ( ( rule__TurnAction__AngleAssignment_2 ) )
            {
            // InternalPolycreate.g:2654:1: ( ( rule__TurnAction__AngleAssignment_2 ) )
            // InternalPolycreate.g:2655:2: ( rule__TurnAction__AngleAssignment_2 )
            {
             before(grammarAccess.getTurnActionAccess().getAngleAssignment_2()); 
            // InternalPolycreate.g:2656:2: ( rule__TurnAction__AngleAssignment_2 )
            // InternalPolycreate.g:2656:3: rule__TurnAction__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTurnActionAccess().getAngleAssignment_2()); 

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
    // InternalPolycreate.g:2664:1: rule__TurnAction__Group__3 : rule__TurnAction__Group__3__Impl ;
    public final void rule__TurnAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2668:1: ( rule__TurnAction__Group__3__Impl )
            // InternalPolycreate.g:2669:2: rule__TurnAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnAction__Group__3__Impl();

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
    // InternalPolycreate.g:2675:1: rule__TurnAction__Group__3__Impl : ( ( rule__TurnAction__Group_3__0 )? ) ;
    public final void rule__TurnAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2679:1: ( ( ( rule__TurnAction__Group_3__0 )? ) )
            // InternalPolycreate.g:2680:1: ( ( rule__TurnAction__Group_3__0 )? )
            {
            // InternalPolycreate.g:2680:1: ( ( rule__TurnAction__Group_3__0 )? )
            // InternalPolycreate.g:2681:2: ( rule__TurnAction__Group_3__0 )?
            {
             before(grammarAccess.getTurnActionAccess().getGroup_3()); 
            // InternalPolycreate.g:2682:2: ( rule__TurnAction__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:2682:3: rule__TurnAction__Group_3__0
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


    // $ANTLR start "rule__TurnAction__Group_3__0"
    // InternalPolycreate.g:2691:1: rule__TurnAction__Group_3__0 : rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 ;
    public final void rule__TurnAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2695:1: ( rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 )
            // InternalPolycreate.g:2696:2: rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPolycreate.g:2703:1: rule__TurnAction__Group_3__0__Impl : ( 'during' ) ;
    public final void rule__TurnAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2707:1: ( ( 'during' ) )
            // InternalPolycreate.g:2708:1: ( 'during' )
            {
            // InternalPolycreate.g:2708:1: ( 'during' )
            // InternalPolycreate.g:2709:2: 'during'
            {
             before(grammarAccess.getTurnActionAccess().getDuringKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTurnActionAccess().getDuringKeyword_3_0()); 

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
    // InternalPolycreate.g:2718:1: rule__TurnAction__Group_3__1 : rule__TurnAction__Group_3__1__Impl ;
    public final void rule__TurnAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2722:1: ( rule__TurnAction__Group_3__1__Impl )
            // InternalPolycreate.g:2723:2: rule__TurnAction__Group_3__1__Impl
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
    // InternalPolycreate.g:2729:1: rule__TurnAction__Group_3__1__Impl : ( ( rule__TurnAction__DurationAssignment_3_1 ) ) ;
    public final void rule__TurnAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2733:1: ( ( ( rule__TurnAction__DurationAssignment_3_1 ) ) )
            // InternalPolycreate.g:2734:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            {
            // InternalPolycreate.g:2734:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            // InternalPolycreate.g:2735:2: ( rule__TurnAction__DurationAssignment_3_1 )
            {
             before(grammarAccess.getTurnActionAccess().getDurationAssignment_3_1()); 
            // InternalPolycreate.g:2736:2: ( rule__TurnAction__DurationAssignment_3_1 )
            // InternalPolycreate.g:2736:3: rule__TurnAction__DurationAssignment_3_1
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


    // $ANTLR start "rule__GripAction__Group__0"
    // InternalPolycreate.g:2745:1: rule__GripAction__Group__0 : rule__GripAction__Group__0__Impl rule__GripAction__Group__1 ;
    public final void rule__GripAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2749:1: ( rule__GripAction__Group__0__Impl rule__GripAction__Group__1 )
            // InternalPolycreate.g:2750:2: rule__GripAction__Group__0__Impl rule__GripAction__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__GripAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripAction__Group__1();

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
    // $ANTLR end "rule__GripAction__Group__0"


    // $ANTLR start "rule__GripAction__Group__0__Impl"
    // InternalPolycreate.g:2757:1: rule__GripAction__Group__0__Impl : ( () ) ;
    public final void rule__GripAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2761:1: ( ( () ) )
            // InternalPolycreate.g:2762:1: ( () )
            {
            // InternalPolycreate.g:2762:1: ( () )
            // InternalPolycreate.g:2763:2: ()
            {
             before(grammarAccess.getGripActionAccess().getGripActionAction_0()); 
            // InternalPolycreate.g:2764:2: ()
            // InternalPolycreate.g:2764:3: 
            {
            }

             after(grammarAccess.getGripActionAccess().getGripActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GripAction__Group__0__Impl"


    // $ANTLR start "rule__GripAction__Group__1"
    // InternalPolycreate.g:2772:1: rule__GripAction__Group__1 : rule__GripAction__Group__1__Impl rule__GripAction__Group__2 ;
    public final void rule__GripAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2776:1: ( rule__GripAction__Group__1__Impl rule__GripAction__Group__2 )
            // InternalPolycreate.g:2777:2: rule__GripAction__Group__1__Impl rule__GripAction__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__GripAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GripAction__Group__2();

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
    // $ANTLR end "rule__GripAction__Group__1"


    // $ANTLR start "rule__GripAction__Group__1__Impl"
    // InternalPolycreate.g:2784:1: rule__GripAction__Group__1__Impl : ( ( rule__GripAction__StateAssignment_1 ) ) ;
    public final void rule__GripAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2788:1: ( ( ( rule__GripAction__StateAssignment_1 ) ) )
            // InternalPolycreate.g:2789:1: ( ( rule__GripAction__StateAssignment_1 ) )
            {
            // InternalPolycreate.g:2789:1: ( ( rule__GripAction__StateAssignment_1 ) )
            // InternalPolycreate.g:2790:2: ( rule__GripAction__StateAssignment_1 )
            {
             before(grammarAccess.getGripActionAccess().getStateAssignment_1()); 
            // InternalPolycreate.g:2791:2: ( rule__GripAction__StateAssignment_1 )
            // InternalPolycreate.g:2791:3: rule__GripAction__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GripAction__StateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGripActionAccess().getStateAssignment_1()); 

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
    // $ANTLR end "rule__GripAction__Group__1__Impl"


    // $ANTLR start "rule__GripAction__Group__2"
    // InternalPolycreate.g:2799:1: rule__GripAction__Group__2 : rule__GripAction__Group__2__Impl ;
    public final void rule__GripAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2803:1: ( rule__GripAction__Group__2__Impl )
            // InternalPolycreate.g:2804:2: rule__GripAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GripAction__Group__2__Impl();

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
    // $ANTLR end "rule__GripAction__Group__2"


    // $ANTLR start "rule__GripAction__Group__2__Impl"
    // InternalPolycreate.g:2810:1: rule__GripAction__Group__2__Impl : ( 'gripper' ) ;
    public final void rule__GripAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2814:1: ( ( 'gripper' ) )
            // InternalPolycreate.g:2815:1: ( 'gripper' )
            {
            // InternalPolycreate.g:2815:1: ( 'gripper' )
            // InternalPolycreate.g:2816:2: 'gripper'
            {
             before(grammarAccess.getGripActionAccess().getGripperKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getGripActionAccess().getGripperKeyword_2()); 

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
    // $ANTLR end "rule__GripAction__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalPolycreate.g:2826:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2830:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPolycreate.g:2831:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPolycreate.g:2838:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2842:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2843:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2843:1: ( ( '-' )? )
            // InternalPolycreate.g:2844:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalPolycreate.g:2845:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPolycreate.g:2845:3: '-'
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalPolycreate.g:2853:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2857:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPolycreate.g:2858:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalPolycreate.g:2865:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2869:1: ( ( ( RULE_INT )? ) )
            // InternalPolycreate.g:2870:1: ( ( RULE_INT )? )
            {
            // InternalPolycreate.g:2870:1: ( ( RULE_INT )? )
            // InternalPolycreate.g:2871:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalPolycreate.g:2872:2: ( RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPolycreate.g:2872:3: RULE_INT
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
    // InternalPolycreate.g:2880:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2884:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPolycreate.g:2885:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalPolycreate.g:2892:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2896:1: ( ( '.' ) )
            // InternalPolycreate.g:2897:1: ( '.' )
            {
            // InternalPolycreate.g:2897:1: ( '.' )
            // InternalPolycreate.g:2898:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPolycreate.g:2907:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2911:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalPolycreate.g:2912:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalPolycreate.g:2919:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2923:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2924:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2924:1: ( RULE_INT )
            // InternalPolycreate.g:2925:2: RULE_INT
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
    // InternalPolycreate.g:2934:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2938:1: ( rule__EDouble__Group__4__Impl )
            // InternalPolycreate.g:2939:2: rule__EDouble__Group__4__Impl
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
    // InternalPolycreate.g:2945:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2949:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalPolycreate.g:2950:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalPolycreate.g:2950:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalPolycreate.g:2951:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalPolycreate.g:2952:2: ( rule__EDouble__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=11 && LA23_0<=12)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPolycreate.g:2952:3: rule__EDouble__Group_4__0
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
    // InternalPolycreate.g:2961:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2965:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalPolycreate.g:2966:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPolycreate.g:2973:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2977:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalPolycreate.g:2978:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalPolycreate.g:2978:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalPolycreate.g:2979:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalPolycreate.g:2980:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalPolycreate.g:2980:3: rule__EDouble__Alternatives_4_0
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
    // InternalPolycreate.g:2988:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2992:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalPolycreate.g:2993:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalPolycreate.g:3000:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3004:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:3005:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:3005:1: ( ( '-' )? )
            // InternalPolycreate.g:3006:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalPolycreate.g:3007:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPolycreate.g:3007:3: '-'
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalPolycreate.g:3015:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3019:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalPolycreate.g:3020:2: rule__EDouble__Group_4__2__Impl
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
    // InternalPolycreate.g:3026:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3030:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:3031:1: ( RULE_INT )
            {
            // InternalPolycreate.g:3031:1: ( RULE_INT )
            // InternalPolycreate.g:3032:2: RULE_INT
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
    // InternalPolycreate.g:3042:1: rule__RobotProgram__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RobotProgram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3046:1: ( ( ruleEString ) )
            // InternalPolycreate.g:3047:2: ( ruleEString )
            {
            // InternalPolycreate.g:3047:2: ( ruleEString )
            // InternalPolycreate.g:3048:3: ruleEString
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


    // $ANTLR start "rule__RobotProgram__InitialStateAssignment_4"
    // InternalPolycreate.g:3057:1: rule__RobotProgram__InitialStateAssignment_4 : ( ruleState ) ;
    public final void rule__RobotProgram__InitialStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3061:1: ( ( ruleState ) )
            // InternalPolycreate.g:3062:2: ( ruleState )
            {
            // InternalPolycreate.g:3062:2: ( ruleState )
            // InternalPolycreate.g:3063:3: ruleState
            {
             before(grammarAccess.getRobotProgramAccess().getInitialStateStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getInitialStateStateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RobotProgram__InitialStateAssignment_4"


    // $ANTLR start "rule__RobotProgram__OwnedStatesAssignment_5"
    // InternalPolycreate.g:3072:1: rule__RobotProgram__OwnedStatesAssignment_5 : ( ruleState ) ;
    public final void rule__RobotProgram__OwnedStatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3076:1: ( ( ruleState ) )
            // InternalPolycreate.g:3077:2: ( ruleState )
            {
            // InternalPolycreate.g:3077:2: ( ruleState )
            // InternalPolycreate.g:3078:3: ruleState
            {
             before(grammarAccess.getRobotProgramAccess().getOwnedStatesStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getOwnedStatesStateParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RobotProgram__OwnedStatesAssignment_5"


    // $ANTLR start "rule__RobotProgram__GlobalTransitionsAssignment_6"
    // InternalPolycreate.g:3087:1: rule__RobotProgram__GlobalTransitionsAssignment_6 : ( ruleGlobalTransitions ) ;
    public final void rule__RobotProgram__GlobalTransitionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3091:1: ( ( ruleGlobalTransitions ) )
            // InternalPolycreate.g:3092:2: ( ruleGlobalTransitions )
            {
            // InternalPolycreate.g:3092:2: ( ruleGlobalTransitions )
            // InternalPolycreate.g:3093:3: ruleGlobalTransitions
            {
             before(grammarAccess.getRobotProgramAccess().getGlobalTransitionsGlobalTransitionsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalTransitions();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getGlobalTransitionsGlobalTransitionsParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RobotProgram__GlobalTransitionsAssignment_6"


    // $ANTLR start "rule__Transition__ConditionsAssignment_1_0"
    // InternalPolycreate.g:3102:1: rule__Transition__ConditionsAssignment_1_0 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3106:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:3107:2: ( ruleCondition )
            {
            // InternalPolycreate.g:3107:2: ( ruleCondition )
            // InternalPolycreate.g:3108:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Transition__ConditionsAssignment_1_0"


    // $ANTLR start "rule__Transition__ConditionsAssignment_1_1_1"
    // InternalPolycreate.g:3117:1: rule__Transition__ConditionsAssignment_1_1_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3121:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:3122:2: ( ruleCondition )
            {
            // InternalPolycreate.g:3122:2: ( ruleCondition )
            // InternalPolycreate.g:3123:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Transition__ConditionsAssignment_1_1_1"


    // $ANTLR start "rule__Transition__NextStateAssignment_2"
    // InternalPolycreate.g:3132:1: rule__Transition__NextStateAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3136:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:3137:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:3137:2: ( ( ruleEString ) )
            // InternalPolycreate.g:3138:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_2_0()); 
            // InternalPolycreate.g:3139:3: ( ruleEString )
            // InternalPolycreate.g:3140:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateStateEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateStateEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_2_0()); 

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
    // $ANTLR end "rule__Transition__NextStateAssignment_2"


    // $ANTLR start "rule__GlobalTransitions__ConditionsAssignment_1"
    // InternalPolycreate.g:3151:1: rule__GlobalTransitions__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__GlobalTransitions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3155:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:3156:2: ( ruleCondition )
            {
            // InternalPolycreate.g:3156:2: ( ruleCondition )
            // InternalPolycreate.g:3157:3: ruleCondition
            {
             before(grammarAccess.getGlobalTransitionsAccess().getConditionsConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getGlobalTransitionsAccess().getConditionsConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__GlobalTransitions__ConditionsAssignment_1"


    // $ANTLR start "rule__GlobalTransitions__ConditionsAssignment_2_1"
    // InternalPolycreate.g:3166:1: rule__GlobalTransitions__ConditionsAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__GlobalTransitions__ConditionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3170:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:3171:2: ( ruleCondition )
            {
            // InternalPolycreate.g:3171:2: ( ruleCondition )
            // InternalPolycreate.g:3172:3: ruleCondition
            {
             before(grammarAccess.getGlobalTransitionsAccess().getConditionsConditionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getGlobalTransitionsAccess().getConditionsConditionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__GlobalTransitions__ConditionsAssignment_2_1"


    // $ANTLR start "rule__GlobalTransitions__NextStateAssignment_4"
    // InternalPolycreate.g:3181:1: rule__GlobalTransitions__NextStateAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__GlobalTransitions__NextStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3185:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:3186:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:3186:2: ( ( ruleEString ) )
            // InternalPolycreate.g:3187:3: ( ruleEString )
            {
             before(grammarAccess.getGlobalTransitionsAccess().getNextStateStateCrossReference_4_0()); 
            // InternalPolycreate.g:3188:3: ( ruleEString )
            // InternalPolycreate.g:3189:4: ruleEString
            {
             before(grammarAccess.getGlobalTransitionsAccess().getNextStateStateEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGlobalTransitionsAccess().getNextStateStateEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGlobalTransitionsAccess().getNextStateStateCrossReference_4_0()); 

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
    // $ANTLR end "rule__GlobalTransitions__NextStateAssignment_4"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalPolycreate.g:3200:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3204:1: ( ( ruleEString ) )
            // InternalPolycreate.g:3205:2: ( ruleEString )
            {
            // InternalPolycreate.g:3205:2: ( ruleEString )
            // InternalPolycreate.g:3206:3: ruleEString
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


    // $ANTLR start "rule__State__ActionsAssignment_4_3"
    // InternalPolycreate.g:3215:1: rule__State__ActionsAssignment_4_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3219:1: ( ( ruleAction ) )
            // InternalPolycreate.g:3220:2: ( ruleAction )
            {
            // InternalPolycreate.g:3220:2: ( ruleAction )
            // InternalPolycreate.g:3221:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__State__ActionsAssignment_4_3"


    // $ANTLR start "rule__State__ActionsAssignment_4_4_1"
    // InternalPolycreate.g:3230:1: rule__State__ActionsAssignment_4_4_1 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3234:1: ( ( ruleAction ) )
            // InternalPolycreate.g:3235:2: ( ruleAction )
            {
            // InternalPolycreate.g:3235:2: ( ruleAction )
            // InternalPolycreate.g:3236:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_4_1_0()); 

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
    // $ANTLR end "rule__State__ActionsAssignment_4_4_1"


    // $ANTLR start "rule__State__TransitionsAssignment_5_3"
    // InternalPolycreate.g:3245:1: rule__State__TransitionsAssignment_5_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3249:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:3250:2: ( ruleTransition )
            {
            // InternalPolycreate.g:3250:2: ( ruleTransition )
            // InternalPolycreate.g:3251:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__State__TransitionsAssignment_5_3"


    // $ANTLR start "rule__State__TransitionsAssignment_5_4_1"
    // InternalPolycreate.g:3260:1: rule__State__TransitionsAssignment_5_4_1 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3264:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:3265:2: ( ruleTransition )
            {
            // InternalPolycreate.g:3265:2: ( ruleTransition )
            // InternalPolycreate.g:3266:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_4_1_0()); 

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
    // $ANTLR end "rule__State__TransitionsAssignment_5_4_1"


    // $ANTLR start "rule__SimpleCondition__DetectionTypeAssignment_2"
    // InternalPolycreate.g:3275:1: rule__SimpleCondition__DetectionTypeAssignment_2 : ( ruleDETECTION ) ;
    public final void rule__SimpleCondition__DetectionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3279:1: ( ( ruleDETECTION ) )
            // InternalPolycreate.g:3280:2: ( ruleDETECTION )
            {
            // InternalPolycreate.g:3280:2: ( ruleDETECTION )
            // InternalPolycreate.g:3281:3: ruleDETECTION
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectionTypeDETECTIONEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDETECTION();

            state._fsp--;

             after(grammarAccess.getSimpleConditionAccess().getDetectionTypeDETECTIONEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleCondition__DetectionTypeAssignment_2"


    // $ANTLR start "rule__DistanceCondition__CameraTypeAssignment_3"
    // InternalPolycreate.g:3290:1: rule__DistanceCondition__CameraTypeAssignment_3 : ( ruleCAMERATYPE ) ;
    public final void rule__DistanceCondition__CameraTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3294:1: ( ( ruleCAMERATYPE ) )
            // InternalPolycreate.g:3295:2: ( ruleCAMERATYPE )
            {
            // InternalPolycreate.g:3295:2: ( ruleCAMERATYPE )
            // InternalPolycreate.g:3296:3: ruleCAMERATYPE
            {
             before(grammarAccess.getDistanceConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCAMERATYPE();

            state._fsp--;

             after(grammarAccess.getDistanceConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__DistanceCondition__CameraTypeAssignment_3"


    // $ANTLR start "rule__DistanceCondition__OperatorAssignment_6"
    // InternalPolycreate.g:3305:1: rule__DistanceCondition__OperatorAssignment_6 : ( ruleOPERATOR ) ;
    public final void rule__DistanceCondition__OperatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3309:1: ( ( ruleOPERATOR ) )
            // InternalPolycreate.g:3310:2: ( ruleOPERATOR )
            {
            // InternalPolycreate.g:3310:2: ( ruleOPERATOR )
            // InternalPolycreate.g:3311:3: ruleOPERATOR
            {
             before(grammarAccess.getDistanceConditionAccess().getOperatorOPERATOREnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOPERATOR();

            state._fsp--;

             after(grammarAccess.getDistanceConditionAccess().getOperatorOPERATOREnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__DistanceCondition__OperatorAssignment_6"


    // $ANTLR start "rule__DistanceCondition__DistanceAssignment_7"
    // InternalPolycreate.g:3320:1: rule__DistanceCondition__DistanceAssignment_7 : ( ruleEDouble ) ;
    public final void rule__DistanceCondition__DistanceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3324:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3325:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3325:2: ( ruleEDouble )
            // InternalPolycreate.g:3326:3: ruleEDouble
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDistanceConditionAccess().getDistanceEDoubleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__DistanceCondition__DistanceAssignment_7"


    // $ANTLR start "rule__AngleCondition__CameraTypeAssignment_3"
    // InternalPolycreate.g:3335:1: rule__AngleCondition__CameraTypeAssignment_3 : ( ruleCAMERATYPE ) ;
    public final void rule__AngleCondition__CameraTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3339:1: ( ( ruleCAMERATYPE ) )
            // InternalPolycreate.g:3340:2: ( ruleCAMERATYPE )
            {
            // InternalPolycreate.g:3340:2: ( ruleCAMERATYPE )
            // InternalPolycreate.g:3341:3: ruleCAMERATYPE
            {
             before(grammarAccess.getAngleConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCAMERATYPE();

            state._fsp--;

             after(grammarAccess.getAngleConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__AngleCondition__CameraTypeAssignment_3"


    // $ANTLR start "rule__AngleCondition__OperatorAssignment_6"
    // InternalPolycreate.g:3350:1: rule__AngleCondition__OperatorAssignment_6 : ( ruleOPERATOR ) ;
    public final void rule__AngleCondition__OperatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3354:1: ( ( ruleOPERATOR ) )
            // InternalPolycreate.g:3355:2: ( ruleOPERATOR )
            {
            // InternalPolycreate.g:3355:2: ( ruleOPERATOR )
            // InternalPolycreate.g:3356:3: ruleOPERATOR
            {
             before(grammarAccess.getAngleConditionAccess().getOperatorOPERATOREnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOPERATOR();

            state._fsp--;

             after(grammarAccess.getAngleConditionAccess().getOperatorOPERATOREnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__AngleCondition__OperatorAssignment_6"


    // $ANTLR start "rule__AngleCondition__AngleAssignment_7"
    // InternalPolycreate.g:3365:1: rule__AngleCondition__AngleAssignment_7 : ( ruleEDouble ) ;
    public final void rule__AngleCondition__AngleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3369:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3370:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3370:2: ( ruleEDouble )
            // InternalPolycreate.g:3371:3: ruleEDouble
            {
             before(grammarAccess.getAngleConditionAccess().getAngleEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAngleConditionAccess().getAngleEDoubleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__AngleCondition__AngleAssignment_7"


    // $ANTLR start "rule__MoveAction__DirectionAssignment_2"
    // InternalPolycreate.g:3380:1: rule__MoveAction__DirectionAssignment_2 : ( ruleDIRECTION ) ;
    public final void rule__MoveAction__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3384:1: ( ( ruleDIRECTION ) )
            // InternalPolycreate.g:3385:2: ( ruleDIRECTION )
            {
            // InternalPolycreate.g:3385:2: ( ruleDIRECTION )
            // InternalPolycreate.g:3386:3: ruleDIRECTION
            {
             before(grammarAccess.getMoveActionAccess().getDirectionDIRECTIONEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDIRECTION();

            state._fsp--;

             after(grammarAccess.getMoveActionAccess().getDirectionDIRECTIONEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__MoveAction__DirectionAssignment_2"


    // $ANTLR start "rule__MoveAction__DurationAssignment_4"
    // InternalPolycreate.g:3395:1: rule__MoveAction__DurationAssignment_4 : ( ruleEDouble ) ;
    public final void rule__MoveAction__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3399:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3400:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3400:2: ( ruleEDouble )
            // InternalPolycreate.g:3401:3: ruleEDouble
            {
             before(grammarAccess.getMoveActionAccess().getDurationEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMoveActionAccess().getDurationEDoubleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MoveAction__DurationAssignment_4"


    // $ANTLR start "rule__TurnAction__AngleAssignment_2"
    // InternalPolycreate.g:3410:1: rule__TurnAction__AngleAssignment_2 : ( ruleEDouble ) ;
    public final void rule__TurnAction__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3414:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3415:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3415:2: ( ruleEDouble )
            // InternalPolycreate.g:3416:3: ruleEDouble
            {
             before(grammarAccess.getTurnActionAccess().getAngleEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTurnActionAccess().getAngleEDoubleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TurnAction__AngleAssignment_2"


    // $ANTLR start "rule__TurnAction__DurationAssignment_3_1"
    // InternalPolycreate.g:3425:1: rule__TurnAction__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__TurnAction__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3429:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3430:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3430:2: ( ruleEDouble )
            // InternalPolycreate.g:3431:3: ruleEDouble
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


    // $ANTLR start "rule__GripAction__StateAssignment_1"
    // InternalPolycreate.g:3440:1: rule__GripAction__StateAssignment_1 : ( ruleGRIPPER_STATE ) ;
    public final void rule__GripAction__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3444:1: ( ( ruleGRIPPER_STATE ) )
            // InternalPolycreate.g:3445:2: ( ruleGRIPPER_STATE )
            {
            // InternalPolycreate.g:3445:2: ( ruleGRIPPER_STATE )
            // InternalPolycreate.g:3446:3: ruleGRIPPER_STATE
            {
             before(grammarAccess.getGripActionAccess().getStateGRIPPER_STATEEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGRIPPER_STATE();

            state._fsp--;

             after(grammarAccess.getGripActionAccess().getStateGRIPPER_STATEEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__GripAction__StateAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000500006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000040L});

}