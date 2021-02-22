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


    // $ANTLR start "entryRuleObjectCondition"
    // InternalPolycreate.g:228:1: entryRuleObjectCondition : ruleObjectCondition EOF ;
    public final void entryRuleObjectCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:229:1: ( ruleObjectCondition EOF )
            // InternalPolycreate.g:230:1: ruleObjectCondition EOF
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
    // InternalPolycreate.g:237:1: ruleObjectCondition : ( ( rule__ObjectCondition__Alternatives ) ) ;
    public final void ruleObjectCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:241:2: ( ( ( rule__ObjectCondition__Alternatives ) ) )
            // InternalPolycreate.g:242:2: ( ( rule__ObjectCondition__Alternatives ) )
            {
            // InternalPolycreate.g:242:2: ( ( rule__ObjectCondition__Alternatives ) )
            // InternalPolycreate.g:243:3: ( rule__ObjectCondition__Alternatives )
            {
             before(grammarAccess.getObjectConditionAccess().getAlternatives()); 
            // InternalPolycreate.g:244:3: ( rule__ObjectCondition__Alternatives )
            // InternalPolycreate.g:244:4: rule__ObjectCondition__Alternatives
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
    // InternalPolycreate.g:253:1: entryRuleDistanceCondition : ruleDistanceCondition EOF ;
    public final void entryRuleDistanceCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:254:1: ( ruleDistanceCondition EOF )
            // InternalPolycreate.g:255:1: ruleDistanceCondition EOF
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
    // InternalPolycreate.g:262:1: ruleDistanceCondition : ( ( rule__DistanceCondition__Group__0 ) ) ;
    public final void ruleDistanceCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:266:2: ( ( ( rule__DistanceCondition__Group__0 ) ) )
            // InternalPolycreate.g:267:2: ( ( rule__DistanceCondition__Group__0 ) )
            {
            // InternalPolycreate.g:267:2: ( ( rule__DistanceCondition__Group__0 ) )
            // InternalPolycreate.g:268:3: ( rule__DistanceCondition__Group__0 )
            {
             before(grammarAccess.getDistanceConditionAccess().getGroup()); 
            // InternalPolycreate.g:269:3: ( rule__DistanceCondition__Group__0 )
            // InternalPolycreate.g:269:4: rule__DistanceCondition__Group__0
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
    // InternalPolycreate.g:278:1: entryRuleAngleCondition : ruleAngleCondition EOF ;
    public final void entryRuleAngleCondition() throws RecognitionException {
        try {
            // InternalPolycreate.g:279:1: ( ruleAngleCondition EOF )
            // InternalPolycreate.g:280:1: ruleAngleCondition EOF
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
    // InternalPolycreate.g:287:1: ruleAngleCondition : ( ( rule__AngleCondition__Group__0 ) ) ;
    public final void ruleAngleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:291:2: ( ( ( rule__AngleCondition__Group__0 ) ) )
            // InternalPolycreate.g:292:2: ( ( rule__AngleCondition__Group__0 ) )
            {
            // InternalPolycreate.g:292:2: ( ( rule__AngleCondition__Group__0 ) )
            // InternalPolycreate.g:293:3: ( rule__AngleCondition__Group__0 )
            {
             before(grammarAccess.getAngleConditionAccess().getGroup()); 
            // InternalPolycreate.g:294:3: ( rule__AngleCondition__Group__0 )
            // InternalPolycreate.g:294:4: rule__AngleCondition__Group__0
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
    // InternalPolycreate.g:303:1: entryRuleMoveAction : ruleMoveAction EOF ;
    public final void entryRuleMoveAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:304:1: ( ruleMoveAction EOF )
            // InternalPolycreate.g:305:1: ruleMoveAction EOF
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
    // InternalPolycreate.g:312:1: ruleMoveAction : ( ( rule__MoveAction__Group__0 ) ) ;
    public final void ruleMoveAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:316:2: ( ( ( rule__MoveAction__Group__0 ) ) )
            // InternalPolycreate.g:317:2: ( ( rule__MoveAction__Group__0 ) )
            {
            // InternalPolycreate.g:317:2: ( ( rule__MoveAction__Group__0 ) )
            // InternalPolycreate.g:318:3: ( rule__MoveAction__Group__0 )
            {
             before(grammarAccess.getMoveActionAccess().getGroup()); 
            // InternalPolycreate.g:319:3: ( rule__MoveAction__Group__0 )
            // InternalPolycreate.g:319:4: rule__MoveAction__Group__0
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
    // InternalPolycreate.g:328:1: entryRuleTurnAction : ruleTurnAction EOF ;
    public final void entryRuleTurnAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:329:1: ( ruleTurnAction EOF )
            // InternalPolycreate.g:330:1: ruleTurnAction EOF
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
    // InternalPolycreate.g:337:1: ruleTurnAction : ( ( rule__TurnAction__Group__0 ) ) ;
    public final void ruleTurnAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:341:2: ( ( ( rule__TurnAction__Group__0 ) ) )
            // InternalPolycreate.g:342:2: ( ( rule__TurnAction__Group__0 ) )
            {
            // InternalPolycreate.g:342:2: ( ( rule__TurnAction__Group__0 ) )
            // InternalPolycreate.g:343:3: ( rule__TurnAction__Group__0 )
            {
             before(grammarAccess.getTurnActionAccess().getGroup()); 
            // InternalPolycreate.g:344:3: ( rule__TurnAction__Group__0 )
            // InternalPolycreate.g:344:4: rule__TurnAction__Group__0
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
    // InternalPolycreate.g:353:1: entryRuleGripAction : ruleGripAction EOF ;
    public final void entryRuleGripAction() throws RecognitionException {
        try {
            // InternalPolycreate.g:354:1: ( ruleGripAction EOF )
            // InternalPolycreate.g:355:1: ruleGripAction EOF
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
    // InternalPolycreate.g:362:1: ruleGripAction : ( ( rule__GripAction__Group__0 ) ) ;
    public final void ruleGripAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:366:2: ( ( ( rule__GripAction__Group__0 ) ) )
            // InternalPolycreate.g:367:2: ( ( rule__GripAction__Group__0 ) )
            {
            // InternalPolycreate.g:367:2: ( ( rule__GripAction__Group__0 ) )
            // InternalPolycreate.g:368:3: ( rule__GripAction__Group__0 )
            {
             before(grammarAccess.getGripActionAccess().getGroup()); 
            // InternalPolycreate.g:369:3: ( rule__GripAction__Group__0 )
            // InternalPolycreate.g:369:4: rule__GripAction__Group__0
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
    // InternalPolycreate.g:378:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPolycreate.g:379:1: ( ruleEDouble EOF )
            // InternalPolycreate.g:380:1: ruleEDouble EOF
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
    // InternalPolycreate.g:387:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:391:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPolycreate.g:392:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPolycreate.g:392:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPolycreate.g:393:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPolycreate.g:394:3: ( rule__EDouble__Group__0 )
            // InternalPolycreate.g:394:4: rule__EDouble__Group__0
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
    // InternalPolycreate.g:403:1: ruleDETECTION : ( ( rule__DETECTION__Alternatives ) ) ;
    public final void ruleDETECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:407:1: ( ( ( rule__DETECTION__Alternatives ) ) )
            // InternalPolycreate.g:408:2: ( ( rule__DETECTION__Alternatives ) )
            {
            // InternalPolycreate.g:408:2: ( ( rule__DETECTION__Alternatives ) )
            // InternalPolycreate.g:409:3: ( rule__DETECTION__Alternatives )
            {
             before(grammarAccess.getDETECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:410:3: ( rule__DETECTION__Alternatives )
            // InternalPolycreate.g:410:4: rule__DETECTION__Alternatives
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
    // InternalPolycreate.g:419:1: ruleOPERATOR : ( ( rule__OPERATOR__Alternatives ) ) ;
    public final void ruleOPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:423:1: ( ( ( rule__OPERATOR__Alternatives ) ) )
            // InternalPolycreate.g:424:2: ( ( rule__OPERATOR__Alternatives ) )
            {
            // InternalPolycreate.g:424:2: ( ( rule__OPERATOR__Alternatives ) )
            // InternalPolycreate.g:425:3: ( rule__OPERATOR__Alternatives )
            {
             before(grammarAccess.getOPERATORAccess().getAlternatives()); 
            // InternalPolycreate.g:426:3: ( rule__OPERATOR__Alternatives )
            // InternalPolycreate.g:426:4: rule__OPERATOR__Alternatives
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
    // InternalPolycreate.g:435:1: ruleDIRECTION : ( ( rule__DIRECTION__Alternatives ) ) ;
    public final void ruleDIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:439:1: ( ( ( rule__DIRECTION__Alternatives ) ) )
            // InternalPolycreate.g:440:2: ( ( rule__DIRECTION__Alternatives ) )
            {
            // InternalPolycreate.g:440:2: ( ( rule__DIRECTION__Alternatives ) )
            // InternalPolycreate.g:441:3: ( rule__DIRECTION__Alternatives )
            {
             before(grammarAccess.getDIRECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:442:3: ( rule__DIRECTION__Alternatives )
            // InternalPolycreate.g:442:4: rule__DIRECTION__Alternatives
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
    // InternalPolycreate.g:451:1: ruleCAMERATYPE : ( ( rule__CAMERATYPE__Alternatives ) ) ;
    public final void ruleCAMERATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:455:1: ( ( ( rule__CAMERATYPE__Alternatives ) ) )
            // InternalPolycreate.g:456:2: ( ( rule__CAMERATYPE__Alternatives ) )
            {
            // InternalPolycreate.g:456:2: ( ( rule__CAMERATYPE__Alternatives ) )
            // InternalPolycreate.g:457:3: ( rule__CAMERATYPE__Alternatives )
            {
             before(grammarAccess.getCAMERATYPEAccess().getAlternatives()); 
            // InternalPolycreate.g:458:3: ( rule__CAMERATYPE__Alternatives )
            // InternalPolycreate.g:458:4: rule__CAMERATYPE__Alternatives
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
    // InternalPolycreate.g:467:1: ruleGRIPPER_STATE : ( ( rule__GRIPPER_STATE__Alternatives ) ) ;
    public final void ruleGRIPPER_STATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:471:1: ( ( ( rule__GRIPPER_STATE__Alternatives ) ) )
            // InternalPolycreate.g:472:2: ( ( rule__GRIPPER_STATE__Alternatives ) )
            {
            // InternalPolycreate.g:472:2: ( ( rule__GRIPPER_STATE__Alternatives ) )
            // InternalPolycreate.g:473:3: ( rule__GRIPPER_STATE__Alternatives )
            {
             before(grammarAccess.getGRIPPER_STATEAccess().getAlternatives()); 
            // InternalPolycreate.g:474:3: ( rule__GRIPPER_STATE__Alternatives )
            // InternalPolycreate.g:474:4: rule__GRIPPER_STATE__Alternatives
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
    // InternalPolycreate.g:482:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:486:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPolycreate.g:487:2: ( RULE_STRING )
                    {
                    // InternalPolycreate.g:487:2: ( RULE_STRING )
                    // InternalPolycreate.g:488:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:493:2: ( RULE_ID )
                    {
                    // InternalPolycreate.g:493:2: ( RULE_ID )
                    // InternalPolycreate.g:494:3: RULE_ID
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
    // InternalPolycreate.g:503:1: rule__Condition__Alternatives : ( ( ruleSimpleCondition ) | ( ruleObjectCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:507:1: ( ( ruleSimpleCondition ) | ( ruleObjectCondition ) )
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
                    // InternalPolycreate.g:508:2: ( ruleSimpleCondition )
                    {
                    // InternalPolycreate.g:508:2: ( ruleSimpleCondition )
                    // InternalPolycreate.g:509:3: ruleSimpleCondition
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
                    // InternalPolycreate.g:514:2: ( ruleObjectCondition )
                    {
                    // InternalPolycreate.g:514:2: ( ruleObjectCondition )
                    // InternalPolycreate.g:515:3: ruleObjectCondition
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
    // InternalPolycreate.g:524:1: rule__Action__Alternatives : ( ( ruleMoveAction ) | ( ruleTurnAction ) | ( ruleGripAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:528:1: ( ( ruleMoveAction ) | ( ruleTurnAction ) | ( ruleGripAction ) )
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
                    // InternalPolycreate.g:529:2: ( ruleMoveAction )
                    {
                    // InternalPolycreate.g:529:2: ( ruleMoveAction )
                    // InternalPolycreate.g:530:3: ruleMoveAction
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
                    // InternalPolycreate.g:535:2: ( ruleTurnAction )
                    {
                    // InternalPolycreate.g:535:2: ( ruleTurnAction )
                    // InternalPolycreate.g:536:3: ruleTurnAction
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
                    // InternalPolycreate.g:541:2: ( ruleGripAction )
                    {
                    // InternalPolycreate.g:541:2: ( ruleGripAction )
                    // InternalPolycreate.g:542:3: ruleGripAction
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
    // InternalPolycreate.g:551:1: rule__ObjectCondition__Alternatives : ( ( ruleDistanceCondition ) | ( ruleAngleCondition ) );
    public final void rule__ObjectCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:555:1: ( ( ruleDistanceCondition ) | ( ruleAngleCondition ) )
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

                            if ( (LA4_5==43) ) {
                                alt4=2;
                            }
                            else if ( (LA4_5==42) ) {
                                alt4=1;
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

                            if ( (LA4_5==43) ) {
                                alt4=2;
                            }
                            else if ( (LA4_5==42) ) {
                                alt4=1;
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
                    // InternalPolycreate.g:556:2: ( ruleDistanceCondition )
                    {
                    // InternalPolycreate.g:556:2: ( ruleDistanceCondition )
                    // InternalPolycreate.g:557:3: ruleDistanceCondition
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
                    // InternalPolycreate.g:562:2: ( ruleAngleCondition )
                    {
                    // InternalPolycreate.g:562:2: ( ruleAngleCondition )
                    // InternalPolycreate.g:563:3: ruleAngleCondition
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
    // InternalPolycreate.g:572:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:576:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalPolycreate.g:577:2: ( 'E' )
                    {
                    // InternalPolycreate.g:577:2: ( 'E' )
                    // InternalPolycreate.g:578:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:583:2: ( 'e' )
                    {
                    // InternalPolycreate.g:583:2: ( 'e' )
                    // InternalPolycreate.g:584:3: 'e'
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
    // InternalPolycreate.g:593:1: rule__DETECTION__Alternatives : ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) );
    public final void rule__DETECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:597:1: ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) )
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
                    // InternalPolycreate.g:598:2: ( ( 'COLLISION_LEFT' ) )
                    {
                    // InternalPolycreate.g:598:2: ( ( 'COLLISION_LEFT' ) )
                    // InternalPolycreate.g:599:3: ( 'COLLISION_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:600:3: ( 'COLLISION_LEFT' )
                    // InternalPolycreate.g:600:4: 'COLLISION_LEFT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:604:2: ( ( 'COLLISION_RIGHT' ) )
                    {
                    // InternalPolycreate.g:604:2: ( ( 'COLLISION_RIGHT' ) )
                    // InternalPolycreate.g:605:3: ( 'COLLISION_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:606:3: ( 'COLLISION_RIGHT' )
                    // InternalPolycreate.g:606:4: 'COLLISION_RIGHT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:610:2: ( ( 'VIRTUAL_WALL' ) )
                    {
                    // InternalPolycreate.g:610:2: ( ( 'VIRTUAL_WALL' ) )
                    // InternalPolycreate.g:611:3: ( 'VIRTUAL_WALL' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 
                    // InternalPolycreate.g:612:3: ( 'VIRTUAL_WALL' )
                    // InternalPolycreate.g:612:4: 'VIRTUAL_WALL'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:616:2: ( ( 'CLIFF_LEFT' ) )
                    {
                    // InternalPolycreate.g:616:2: ( ( 'CLIFF_LEFT' ) )
                    // InternalPolycreate.g:617:3: ( 'CLIFF_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 
                    // InternalPolycreate.g:618:3: ( 'CLIFF_LEFT' )
                    // InternalPolycreate.g:618:4: 'CLIFF_LEFT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:622:2: ( ( 'CLIFF_RIGHT' ) )
                    {
                    // InternalPolycreate.g:622:2: ( ( 'CLIFF_RIGHT' ) )
                    // InternalPolycreate.g:623:3: ( 'CLIFF_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 
                    // InternalPolycreate.g:624:3: ( 'CLIFF_RIGHT' )
                    // InternalPolycreate.g:624:4: 'CLIFF_RIGHT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:628:2: ( ( 'CLIFF_FRONT' ) )
                    {
                    // InternalPolycreate.g:628:2: ( ( 'CLIFF_FRONT' ) )
                    // InternalPolycreate.g:629:3: ( 'CLIFF_FRONT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_FRONTEnumLiteralDeclaration_5()); 
                    // InternalPolycreate.g:630:3: ( 'CLIFF_FRONT' )
                    // InternalPolycreate.g:630:4: 'CLIFF_FRONT'
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
    // InternalPolycreate.g:638:1: rule__OPERATOR__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:642:1: ( ( ( '<' ) ) | ( ( '>' ) ) )
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
                    // InternalPolycreate.g:643:2: ( ( '<' ) )
                    {
                    // InternalPolycreate.g:643:2: ( ( '<' ) )
                    // InternalPolycreate.g:644:3: ( '<' )
                    {
                     before(grammarAccess.getOPERATORAccess().getINFERIOREnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:645:3: ( '<' )
                    // InternalPolycreate.g:645:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOPERATORAccess().getINFERIOREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:649:2: ( ( '>' ) )
                    {
                    // InternalPolycreate.g:649:2: ( ( '>' ) )
                    // InternalPolycreate.g:650:3: ( '>' )
                    {
                     before(grammarAccess.getOPERATORAccess().getSUPERIOREnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:651:3: ( '>' )
                    // InternalPolycreate.g:651:4: '>'
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
    // InternalPolycreate.g:659:1: rule__DIRECTION__Alternatives : ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) );
    public final void rule__DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:663:1: ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) )
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
                    // InternalPolycreate.g:664:2: ( ( 'FORWARD' ) )
                    {
                    // InternalPolycreate.g:664:2: ( ( 'FORWARD' ) )
                    // InternalPolycreate.g:665:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:666:3: ( 'FORWARD' )
                    // InternalPolycreate.g:666:4: 'FORWARD'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:670:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalPolycreate.g:670:2: ( ( 'BACKWARD' ) )
                    // InternalPolycreate.g:671:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:672:3: ( 'BACKWARD' )
                    // InternalPolycreate.g:672:4: 'BACKWARD'
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
    // InternalPolycreate.g:680:1: rule__CAMERATYPE__Alternatives : ( ( ( 'BACK' ) ) | ( ( 'FRONT' ) ) );
    public final void rule__CAMERATYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:684:1: ( ( ( 'BACK' ) ) | ( ( 'FRONT' ) ) )
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
                    // InternalPolycreate.g:685:2: ( ( 'BACK' ) )
                    {
                    // InternalPolycreate.g:685:2: ( ( 'BACK' ) )
                    // InternalPolycreate.g:686:3: ( 'BACK' )
                    {
                     before(grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:687:3: ( 'BACK' )
                    // InternalPolycreate.g:687:4: 'BACK'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:691:2: ( ( 'FRONT' ) )
                    {
                    // InternalPolycreate.g:691:2: ( ( 'FRONT' ) )
                    // InternalPolycreate.g:692:3: ( 'FRONT' )
                    {
                     before(grammarAccess.getCAMERATYPEAccess().getFRONTEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:693:3: ( 'FRONT' )
                    // InternalPolycreate.g:693:4: 'FRONT'
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
    // InternalPolycreate.g:701:1: rule__GRIPPER_STATE__Alternatives : ( ( ( 'Open' ) ) | ( ( 'Closed' ) ) );
    public final void rule__GRIPPER_STATE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:705:1: ( ( ( 'Open' ) ) | ( ( 'Closed' ) ) )
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
                    // InternalPolycreate.g:706:2: ( ( 'Open' ) )
                    {
                    // InternalPolycreate.g:706:2: ( ( 'Open' ) )
                    // InternalPolycreate.g:707:3: ( 'Open' )
                    {
                     before(grammarAccess.getGRIPPER_STATEAccess().getOPENEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:708:3: ( 'Open' )
                    // InternalPolycreate.g:708:4: 'Open'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getGRIPPER_STATEAccess().getOPENEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:712:2: ( ( 'Closed' ) )
                    {
                    // InternalPolycreate.g:712:2: ( ( 'Closed' ) )
                    // InternalPolycreate.g:713:3: ( 'Closed' )
                    {
                     before(grammarAccess.getGRIPPER_STATEAccess().getCLOSEDEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:714:3: ( 'Closed' )
                    // InternalPolycreate.g:714:4: 'Closed'
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
    // InternalPolycreate.g:722:1: rule__RobotProgram__Group__0 : rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 ;
    public final void rule__RobotProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:726:1: ( rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 )
            // InternalPolycreate.g:727:2: rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1
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
    // InternalPolycreate.g:734:1: rule__RobotProgram__Group__0__Impl : ( () ) ;
    public final void rule__RobotProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:738:1: ( ( () ) )
            // InternalPolycreate.g:739:1: ( () )
            {
            // InternalPolycreate.g:739:1: ( () )
            // InternalPolycreate.g:740:2: ()
            {
             before(grammarAccess.getRobotProgramAccess().getRobotProgramAction_0()); 
            // InternalPolycreate.g:741:2: ()
            // InternalPolycreate.g:741:3: 
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
    // InternalPolycreate.g:749:1: rule__RobotProgram__Group__1 : rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 ;
    public final void rule__RobotProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:753:1: ( rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 )
            // InternalPolycreate.g:754:2: rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2
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
    // InternalPolycreate.g:761:1: rule__RobotProgram__Group__1__Impl : ( 'RobotProgram' ) ;
    public final void rule__RobotProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:765:1: ( ( 'RobotProgram' ) )
            // InternalPolycreate.g:766:1: ( 'RobotProgram' )
            {
            // InternalPolycreate.g:766:1: ( 'RobotProgram' )
            // InternalPolycreate.g:767:2: 'RobotProgram'
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
    // InternalPolycreate.g:776:1: rule__RobotProgram__Group__2 : rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 ;
    public final void rule__RobotProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:780:1: ( rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 )
            // InternalPolycreate.g:781:2: rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3
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
    // InternalPolycreate.g:788:1: rule__RobotProgram__Group__2__Impl : ( ( rule__RobotProgram__NameAssignment_2 ) ) ;
    public final void rule__RobotProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:792:1: ( ( ( rule__RobotProgram__NameAssignment_2 ) ) )
            // InternalPolycreate.g:793:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:793:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            // InternalPolycreate.g:794:2: ( rule__RobotProgram__NameAssignment_2 )
            {
             before(grammarAccess.getRobotProgramAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:795:2: ( rule__RobotProgram__NameAssignment_2 )
            // InternalPolycreate.g:795:3: rule__RobotProgram__NameAssignment_2
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
    // InternalPolycreate.g:803:1: rule__RobotProgram__Group__3 : rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 ;
    public final void rule__RobotProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:807:1: ( rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 )
            // InternalPolycreate.g:808:2: rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4
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
    // InternalPolycreate.g:815:1: rule__RobotProgram__Group__3__Impl : ( '->' ) ;
    public final void rule__RobotProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:819:1: ( ( '->' ) )
            // InternalPolycreate.g:820:1: ( '->' )
            {
            // InternalPolycreate.g:820:1: ( '->' )
            // InternalPolycreate.g:821:2: '->'
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
    // InternalPolycreate.g:830:1: rule__RobotProgram__Group__4 : rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 ;
    public final void rule__RobotProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:834:1: ( rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 )
            // InternalPolycreate.g:835:2: rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5
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
    // InternalPolycreate.g:842:1: rule__RobotProgram__Group__4__Impl : ( ( rule__RobotProgram__InitialStateAssignment_4 ) ) ;
    public final void rule__RobotProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:846:1: ( ( ( rule__RobotProgram__InitialStateAssignment_4 ) ) )
            // InternalPolycreate.g:847:1: ( ( rule__RobotProgram__InitialStateAssignment_4 ) )
            {
            // InternalPolycreate.g:847:1: ( ( rule__RobotProgram__InitialStateAssignment_4 ) )
            // InternalPolycreate.g:848:2: ( rule__RobotProgram__InitialStateAssignment_4 )
            {
             before(grammarAccess.getRobotProgramAccess().getInitialStateAssignment_4()); 
            // InternalPolycreate.g:849:2: ( rule__RobotProgram__InitialStateAssignment_4 )
            // InternalPolycreate.g:849:3: rule__RobotProgram__InitialStateAssignment_4
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
    // InternalPolycreate.g:857:1: rule__RobotProgram__Group__5 : rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6 ;
    public final void rule__RobotProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:861:1: ( rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6 )
            // InternalPolycreate.g:862:2: rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6
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
    // InternalPolycreate.g:869:1: rule__RobotProgram__Group__5__Impl : ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* ) ;
    public final void rule__RobotProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:873:1: ( ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* ) )
            // InternalPolycreate.g:874:1: ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* )
            {
            // InternalPolycreate.g:874:1: ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* )
            // InternalPolycreate.g:875:2: ( rule__RobotProgram__OwnedStatesAssignment_5 )*
            {
             before(grammarAccess.getRobotProgramAccess().getOwnedStatesAssignment_5()); 
            // InternalPolycreate.g:876:2: ( rule__RobotProgram__OwnedStatesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPolycreate.g:876:3: rule__RobotProgram__OwnedStatesAssignment_5
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
    // InternalPolycreate.g:884:1: rule__RobotProgram__Group__6 : rule__RobotProgram__Group__6__Impl ;
    public final void rule__RobotProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:888:1: ( rule__RobotProgram__Group__6__Impl )
            // InternalPolycreate.g:889:2: rule__RobotProgram__Group__6__Impl
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
    // InternalPolycreate.g:895:1: rule__RobotProgram__Group__6__Impl : ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* ) ;
    public final void rule__RobotProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:899:1: ( ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* ) )
            // InternalPolycreate.g:900:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* )
            {
            // InternalPolycreate.g:900:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* )
            // InternalPolycreate.g:901:2: ( rule__RobotProgram__GlobalTransitionsAssignment_6 )*
            {
             before(grammarAccess.getRobotProgramAccess().getGlobalTransitionsAssignment_6()); 
            // InternalPolycreate.g:902:2: ( rule__RobotProgram__GlobalTransitionsAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPolycreate.g:902:3: rule__RobotProgram__GlobalTransitionsAssignment_6
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
    // InternalPolycreate.g:911:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:915:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPolycreate.g:916:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalPolycreate.g:923:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:927:1: ( ( () ) )
            // InternalPolycreate.g:928:1: ( () )
            {
            // InternalPolycreate.g:928:1: ( () )
            // InternalPolycreate.g:929:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalPolycreate.g:930:2: ()
            // InternalPolycreate.g:930:3: 
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
    // InternalPolycreate.g:938:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:942:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPolycreate.g:943:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalPolycreate.g:950:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:954:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalPolycreate.g:955:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalPolycreate.g:955:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalPolycreate.g:956:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalPolycreate.g:957:2: ( rule__Transition__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPolycreate.g:957:3: rule__Transition__Group_1__0
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
    // InternalPolycreate.g:965:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:969:1: ( rule__Transition__Group__2__Impl )
            // InternalPolycreate.g:970:2: rule__Transition__Group__2__Impl
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
    // InternalPolycreate.g:976:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NextStateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:980:1: ( ( ( rule__Transition__NextStateAssignment_2 ) ) )
            // InternalPolycreate.g:981:1: ( ( rule__Transition__NextStateAssignment_2 ) )
            {
            // InternalPolycreate.g:981:1: ( ( rule__Transition__NextStateAssignment_2 ) )
            // InternalPolycreate.g:982:2: ( rule__Transition__NextStateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNextStateAssignment_2()); 
            // InternalPolycreate.g:983:2: ( rule__Transition__NextStateAssignment_2 )
            // InternalPolycreate.g:983:3: rule__Transition__NextStateAssignment_2
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
    // InternalPolycreate.g:992:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:996:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalPolycreate.g:997:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
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
    // InternalPolycreate.g:1004:1: rule__Transition__Group_1__0__Impl : ( ( rule__Transition__ConditionsAssignment_1_0 ) ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1008:1: ( ( ( rule__Transition__ConditionsAssignment_1_0 ) ) )
            // InternalPolycreate.g:1009:1: ( ( rule__Transition__ConditionsAssignment_1_0 ) )
            {
            // InternalPolycreate.g:1009:1: ( ( rule__Transition__ConditionsAssignment_1_0 ) )
            // InternalPolycreate.g:1010:2: ( rule__Transition__ConditionsAssignment_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_1_0()); 
            // InternalPolycreate.g:1011:2: ( rule__Transition__ConditionsAssignment_1_0 )
            // InternalPolycreate.g:1011:3: rule__Transition__ConditionsAssignment_1_0
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
    // InternalPolycreate.g:1019:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1023:1: ( rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 )
            // InternalPolycreate.g:1024:2: rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2
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
    // InternalPolycreate.g:1031:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__Group_1_1__0 )* ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1035:1: ( ( ( rule__Transition__Group_1_1__0 )* ) )
            // InternalPolycreate.g:1036:1: ( ( rule__Transition__Group_1_1__0 )* )
            {
            // InternalPolycreate.g:1036:1: ( ( rule__Transition__Group_1_1__0 )* )
            // InternalPolycreate.g:1037:2: ( rule__Transition__Group_1_1__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_1_1()); 
            // InternalPolycreate.g:1038:2: ( rule__Transition__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPolycreate.g:1038:3: rule__Transition__Group_1_1__0
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
    // InternalPolycreate.g:1046:1: rule__Transition__Group_1__2 : rule__Transition__Group_1__2__Impl ;
    public final void rule__Transition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1050:1: ( rule__Transition__Group_1__2__Impl )
            // InternalPolycreate.g:1051:2: rule__Transition__Group_1__2__Impl
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
    // InternalPolycreate.g:1057:1: rule__Transition__Group_1__2__Impl : ( '=>' ) ;
    public final void rule__Transition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1061:1: ( ( '=>' ) )
            // InternalPolycreate.g:1062:1: ( '=>' )
            {
            // InternalPolycreate.g:1062:1: ( '=>' )
            // InternalPolycreate.g:1063:2: '=>'
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
    // InternalPolycreate.g:1073:1: rule__Transition__Group_1_1__0 : rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1 ;
    public final void rule__Transition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1077:1: ( rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1 )
            // InternalPolycreate.g:1078:2: rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1
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
    // InternalPolycreate.g:1085:1: rule__Transition__Group_1_1__0__Impl : ( 'and' ) ;
    public final void rule__Transition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1089:1: ( ( 'and' ) )
            // InternalPolycreate.g:1090:1: ( 'and' )
            {
            // InternalPolycreate.g:1090:1: ( 'and' )
            // InternalPolycreate.g:1091:2: 'and'
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
    // InternalPolycreate.g:1100:1: rule__Transition__Group_1_1__1 : rule__Transition__Group_1_1__1__Impl ;
    public final void rule__Transition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1104:1: ( rule__Transition__Group_1_1__1__Impl )
            // InternalPolycreate.g:1105:2: rule__Transition__Group_1_1__1__Impl
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
    // InternalPolycreate.g:1111:1: rule__Transition__Group_1_1__1__Impl : ( ( rule__Transition__ConditionsAssignment_1_1_1 ) ) ;
    public final void rule__Transition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1115:1: ( ( ( rule__Transition__ConditionsAssignment_1_1_1 ) ) )
            // InternalPolycreate.g:1116:1: ( ( rule__Transition__ConditionsAssignment_1_1_1 ) )
            {
            // InternalPolycreate.g:1116:1: ( ( rule__Transition__ConditionsAssignment_1_1_1 ) )
            // InternalPolycreate.g:1117:2: ( rule__Transition__ConditionsAssignment_1_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_1_1_1()); 
            // InternalPolycreate.g:1118:2: ( rule__Transition__ConditionsAssignment_1_1_1 )
            // InternalPolycreate.g:1118:3: rule__Transition__ConditionsAssignment_1_1_1
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


    // $ANTLR start "rule__State__Group__0"
    // InternalPolycreate.g:1127:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1131:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalPolycreate.g:1132:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalPolycreate.g:1139:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1143:1: ( ( () ) )
            // InternalPolycreate.g:1144:1: ( () )
            {
            // InternalPolycreate.g:1144:1: ( () )
            // InternalPolycreate.g:1145:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalPolycreate.g:1146:2: ()
            // InternalPolycreate.g:1146:3: 
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
    // InternalPolycreate.g:1154:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1158:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalPolycreate.g:1159:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalPolycreate.g:1166:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1170:1: ( ( 'State' ) )
            // InternalPolycreate.g:1171:1: ( 'State' )
            {
            // InternalPolycreate.g:1171:1: ( 'State' )
            // InternalPolycreate.g:1172:2: 'State'
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
    // InternalPolycreate.g:1181:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1185:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalPolycreate.g:1186:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalPolycreate.g:1193:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1197:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalPolycreate.g:1198:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:1198:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalPolycreate.g:1199:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:1200:2: ( rule__State__NameAssignment_2 )
            // InternalPolycreate.g:1200:3: rule__State__NameAssignment_2
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
    // InternalPolycreate.g:1208:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1212:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalPolycreate.g:1213:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalPolycreate.g:1220:1: rule__State__Group__3__Impl : ( ':' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1224:1: ( ( ':' ) )
            // InternalPolycreate.g:1225:1: ( ':' )
            {
            // InternalPolycreate.g:1225:1: ( ':' )
            // InternalPolycreate.g:1226:2: ':'
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
    // InternalPolycreate.g:1235:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1239:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalPolycreate.g:1240:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalPolycreate.g:1247:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1251:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalPolycreate.g:1252:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalPolycreate.g:1252:1: ( ( rule__State__Group_4__0 )? )
            // InternalPolycreate.g:1253:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalPolycreate.g:1254:2: ( rule__State__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPolycreate.g:1254:3: rule__State__Group_4__0
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
    // InternalPolycreate.g:1262:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1266:1: ( rule__State__Group__5__Impl )
            // InternalPolycreate.g:1267:2: rule__State__Group__5__Impl
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
    // InternalPolycreate.g:1273:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1277:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalPolycreate.g:1278:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalPolycreate.g:1278:1: ( ( rule__State__Group_5__0 )? )
            // InternalPolycreate.g:1279:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalPolycreate.g:1280:2: ( rule__State__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPolycreate.g:1280:3: rule__State__Group_5__0
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
    // InternalPolycreate.g:1289:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1293:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalPolycreate.g:1294:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
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
    // InternalPolycreate.g:1301:1: rule__State__Group_4__0__Impl : ( 'actions' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1305:1: ( ( 'actions' ) )
            // InternalPolycreate.g:1306:1: ( 'actions' )
            {
            // InternalPolycreate.g:1306:1: ( 'actions' )
            // InternalPolycreate.g:1307:2: 'actions'
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
    // InternalPolycreate.g:1316:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1320:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // InternalPolycreate.g:1321:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
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
    // InternalPolycreate.g:1328:1: rule__State__Group_4__1__Impl : ( '=' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1332:1: ( ( '=' ) )
            // InternalPolycreate.g:1333:1: ( '=' )
            {
            // InternalPolycreate.g:1333:1: ( '=' )
            // InternalPolycreate.g:1334:2: '='
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
    // InternalPolycreate.g:1343:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1347:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // InternalPolycreate.g:1348:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
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
    // InternalPolycreate.g:1355:1: rule__State__Group_4__2__Impl : ( '[' ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1359:1: ( ( '[' ) )
            // InternalPolycreate.g:1360:1: ( '[' )
            {
            // InternalPolycreate.g:1360:1: ( '[' )
            // InternalPolycreate.g:1361:2: '['
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
    // InternalPolycreate.g:1370:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl rule__State__Group_4__4 ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1374:1: ( rule__State__Group_4__3__Impl rule__State__Group_4__4 )
            // InternalPolycreate.g:1375:2: rule__State__Group_4__3__Impl rule__State__Group_4__4
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
    // InternalPolycreate.g:1382:1: rule__State__Group_4__3__Impl : ( ( rule__State__ActionsAssignment_4_3 ) ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1386:1: ( ( ( rule__State__ActionsAssignment_4_3 ) ) )
            // InternalPolycreate.g:1387:1: ( ( rule__State__ActionsAssignment_4_3 ) )
            {
            // InternalPolycreate.g:1387:1: ( ( rule__State__ActionsAssignment_4_3 ) )
            // InternalPolycreate.g:1388:2: ( rule__State__ActionsAssignment_4_3 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_3()); 
            // InternalPolycreate.g:1389:2: ( rule__State__ActionsAssignment_4_3 )
            // InternalPolycreate.g:1389:3: rule__State__ActionsAssignment_4_3
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
    // InternalPolycreate.g:1397:1: rule__State__Group_4__4 : rule__State__Group_4__4__Impl rule__State__Group_4__5 ;
    public final void rule__State__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1401:1: ( rule__State__Group_4__4__Impl rule__State__Group_4__5 )
            // InternalPolycreate.g:1402:2: rule__State__Group_4__4__Impl rule__State__Group_4__5
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
    // InternalPolycreate.g:1409:1: rule__State__Group_4__4__Impl : ( ( rule__State__Group_4_4__0 )* ) ;
    public final void rule__State__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1413:1: ( ( ( rule__State__Group_4_4__0 )* ) )
            // InternalPolycreate.g:1414:1: ( ( rule__State__Group_4_4__0 )* )
            {
            // InternalPolycreate.g:1414:1: ( ( rule__State__Group_4_4__0 )* )
            // InternalPolycreate.g:1415:2: ( rule__State__Group_4_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4_4()); 
            // InternalPolycreate.g:1416:2: ( rule__State__Group_4_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPolycreate.g:1416:3: rule__State__Group_4_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__Group_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPolycreate.g:1424:1: rule__State__Group_4__5 : rule__State__Group_4__5__Impl ;
    public final void rule__State__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1428:1: ( rule__State__Group_4__5__Impl )
            // InternalPolycreate.g:1429:2: rule__State__Group_4__5__Impl
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
    // InternalPolycreate.g:1435:1: rule__State__Group_4__5__Impl : ( ']' ) ;
    public final void rule__State__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1439:1: ( ( ']' ) )
            // InternalPolycreate.g:1440:1: ( ']' )
            {
            // InternalPolycreate.g:1440:1: ( ']' )
            // InternalPolycreate.g:1441:2: ']'
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
    // InternalPolycreate.g:1451:1: rule__State__Group_4_4__0 : rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1 ;
    public final void rule__State__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1455:1: ( rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1 )
            // InternalPolycreate.g:1456:2: rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1
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
    // InternalPolycreate.g:1463:1: rule__State__Group_4_4__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1467:1: ( ( ',' ) )
            // InternalPolycreate.g:1468:1: ( ',' )
            {
            // InternalPolycreate.g:1468:1: ( ',' )
            // InternalPolycreate.g:1469:2: ','
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
    // InternalPolycreate.g:1478:1: rule__State__Group_4_4__1 : rule__State__Group_4_4__1__Impl ;
    public final void rule__State__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1482:1: ( rule__State__Group_4_4__1__Impl )
            // InternalPolycreate.g:1483:2: rule__State__Group_4_4__1__Impl
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
    // InternalPolycreate.g:1489:1: rule__State__Group_4_4__1__Impl : ( ( rule__State__ActionsAssignment_4_4_1 ) ) ;
    public final void rule__State__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1493:1: ( ( ( rule__State__ActionsAssignment_4_4_1 ) ) )
            // InternalPolycreate.g:1494:1: ( ( rule__State__ActionsAssignment_4_4_1 ) )
            {
            // InternalPolycreate.g:1494:1: ( ( rule__State__ActionsAssignment_4_4_1 ) )
            // InternalPolycreate.g:1495:2: ( rule__State__ActionsAssignment_4_4_1 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_4_1()); 
            // InternalPolycreate.g:1496:2: ( rule__State__ActionsAssignment_4_4_1 )
            // InternalPolycreate.g:1496:3: rule__State__ActionsAssignment_4_4_1
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
    // InternalPolycreate.g:1505:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1509:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalPolycreate.g:1510:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
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
    // InternalPolycreate.g:1517:1: rule__State__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1521:1: ( ( 'transitions' ) )
            // InternalPolycreate.g:1522:1: ( 'transitions' )
            {
            // InternalPolycreate.g:1522:1: ( 'transitions' )
            // InternalPolycreate.g:1523:2: 'transitions'
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
    // InternalPolycreate.g:1532:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1536:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalPolycreate.g:1537:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
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
    // InternalPolycreate.g:1544:1: rule__State__Group_5__1__Impl : ( '=' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1548:1: ( ( '=' ) )
            // InternalPolycreate.g:1549:1: ( '=' )
            {
            // InternalPolycreate.g:1549:1: ( '=' )
            // InternalPolycreate.g:1550:2: '='
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
    // InternalPolycreate.g:1559:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1563:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalPolycreate.g:1564:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
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
    // InternalPolycreate.g:1571:1: rule__State__Group_5__2__Impl : ( '[' ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1575:1: ( ( '[' ) )
            // InternalPolycreate.g:1576:1: ( '[' )
            {
            // InternalPolycreate.g:1576:1: ( '[' )
            // InternalPolycreate.g:1577:2: '['
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
    // InternalPolycreate.g:1586:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1590:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalPolycreate.g:1591:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
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
    // InternalPolycreate.g:1598:1: rule__State__Group_5__3__Impl : ( ( rule__State__TransitionsAssignment_5_3 ) ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1602:1: ( ( ( rule__State__TransitionsAssignment_5_3 ) ) )
            // InternalPolycreate.g:1603:1: ( ( rule__State__TransitionsAssignment_5_3 ) )
            {
            // InternalPolycreate.g:1603:1: ( ( rule__State__TransitionsAssignment_5_3 ) )
            // InternalPolycreate.g:1604:2: ( rule__State__TransitionsAssignment_5_3 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_3()); 
            // InternalPolycreate.g:1605:2: ( rule__State__TransitionsAssignment_5_3 )
            // InternalPolycreate.g:1605:3: rule__State__TransitionsAssignment_5_3
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
    // InternalPolycreate.g:1613:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl rule__State__Group_5__5 ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1617:1: ( rule__State__Group_5__4__Impl rule__State__Group_5__5 )
            // InternalPolycreate.g:1618:2: rule__State__Group_5__4__Impl rule__State__Group_5__5
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
    // InternalPolycreate.g:1625:1: rule__State__Group_5__4__Impl : ( ( rule__State__Group_5_4__0 )* ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1629:1: ( ( ( rule__State__Group_5_4__0 )* ) )
            // InternalPolycreate.g:1630:1: ( ( rule__State__Group_5_4__0 )* )
            {
            // InternalPolycreate.g:1630:1: ( ( rule__State__Group_5_4__0 )* )
            // InternalPolycreate.g:1631:2: ( rule__State__Group_5_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_4()); 
            // InternalPolycreate.g:1632:2: ( rule__State__Group_5_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPolycreate.g:1632:3: rule__State__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalPolycreate.g:1640:1: rule__State__Group_5__5 : rule__State__Group_5__5__Impl ;
    public final void rule__State__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1644:1: ( rule__State__Group_5__5__Impl )
            // InternalPolycreate.g:1645:2: rule__State__Group_5__5__Impl
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
    // InternalPolycreate.g:1651:1: rule__State__Group_5__5__Impl : ( ']' ) ;
    public final void rule__State__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1655:1: ( ( ']' ) )
            // InternalPolycreate.g:1656:1: ( ']' )
            {
            // InternalPolycreate.g:1656:1: ( ']' )
            // InternalPolycreate.g:1657:2: ']'
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
    // InternalPolycreate.g:1667:1: rule__State__Group_5_4__0 : rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1 ;
    public final void rule__State__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1671:1: ( rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1 )
            // InternalPolycreate.g:1672:2: rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1
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
    // InternalPolycreate.g:1679:1: rule__State__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1683:1: ( ( ',' ) )
            // InternalPolycreate.g:1684:1: ( ',' )
            {
            // InternalPolycreate.g:1684:1: ( ',' )
            // InternalPolycreate.g:1685:2: ','
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
    // InternalPolycreate.g:1694:1: rule__State__Group_5_4__1 : rule__State__Group_5_4__1__Impl ;
    public final void rule__State__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1698:1: ( rule__State__Group_5_4__1__Impl )
            // InternalPolycreate.g:1699:2: rule__State__Group_5_4__1__Impl
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
    // InternalPolycreate.g:1705:1: rule__State__Group_5_4__1__Impl : ( ( rule__State__TransitionsAssignment_5_4_1 ) ) ;
    public final void rule__State__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1709:1: ( ( ( rule__State__TransitionsAssignment_5_4_1 ) ) )
            // InternalPolycreate.g:1710:1: ( ( rule__State__TransitionsAssignment_5_4_1 ) )
            {
            // InternalPolycreate.g:1710:1: ( ( rule__State__TransitionsAssignment_5_4_1 ) )
            // InternalPolycreate.g:1711:2: ( rule__State__TransitionsAssignment_5_4_1 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_4_1()); 
            // InternalPolycreate.g:1712:2: ( rule__State__TransitionsAssignment_5_4_1 )
            // InternalPolycreate.g:1712:3: rule__State__TransitionsAssignment_5_4_1
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
    // InternalPolycreate.g:1721:1: rule__SimpleCondition__Group__0 : rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 ;
    public final void rule__SimpleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1725:1: ( rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 )
            // InternalPolycreate.g:1726:2: rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1
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
    // InternalPolycreate.g:1733:1: rule__SimpleCondition__Group__0__Impl : ( () ) ;
    public final void rule__SimpleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1737:1: ( ( () ) )
            // InternalPolycreate.g:1738:1: ( () )
            {
            // InternalPolycreate.g:1738:1: ( () )
            // InternalPolycreate.g:1739:2: ()
            {
             before(grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0()); 
            // InternalPolycreate.g:1740:2: ()
            // InternalPolycreate.g:1740:3: 
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
    // InternalPolycreate.g:1748:1: rule__SimpleCondition__Group__1 : rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 ;
    public final void rule__SimpleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1752:1: ( rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 )
            // InternalPolycreate.g:1753:2: rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2
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
    // InternalPolycreate.g:1760:1: rule__SimpleCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__SimpleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1764:1: ( ( 'detect' ) )
            // InternalPolycreate.g:1765:1: ( 'detect' )
            {
            // InternalPolycreate.g:1765:1: ( 'detect' )
            // InternalPolycreate.g:1766:2: 'detect'
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
    // InternalPolycreate.g:1775:1: rule__SimpleCondition__Group__2 : rule__SimpleCondition__Group__2__Impl ;
    public final void rule__SimpleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1779:1: ( rule__SimpleCondition__Group__2__Impl )
            // InternalPolycreate.g:1780:2: rule__SimpleCondition__Group__2__Impl
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
    // InternalPolycreate.g:1786:1: rule__SimpleCondition__Group__2__Impl : ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) ) ;
    public final void rule__SimpleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1790:1: ( ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) ) )
            // InternalPolycreate.g:1791:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) )
            {
            // InternalPolycreate.g:1791:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) )
            // InternalPolycreate.g:1792:2: ( rule__SimpleCondition__DetectionTypeAssignment_2 )
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectionTypeAssignment_2()); 
            // InternalPolycreate.g:1793:2: ( rule__SimpleCondition__DetectionTypeAssignment_2 )
            // InternalPolycreate.g:1793:3: rule__SimpleCondition__DetectionTypeAssignment_2
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
    // InternalPolycreate.g:1802:1: rule__DistanceCondition__Group__0 : rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 ;
    public final void rule__DistanceCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1806:1: ( rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 )
            // InternalPolycreate.g:1807:2: rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1
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
    // InternalPolycreate.g:1814:1: rule__DistanceCondition__Group__0__Impl : ( () ) ;
    public final void rule__DistanceCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1818:1: ( ( () ) )
            // InternalPolycreate.g:1819:1: ( () )
            {
            // InternalPolycreate.g:1819:1: ( () )
            // InternalPolycreate.g:1820:2: ()
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceConditionAction_0()); 
            // InternalPolycreate.g:1821:2: ()
            // InternalPolycreate.g:1821:3: 
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
    // InternalPolycreate.g:1829:1: rule__DistanceCondition__Group__1 : rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 ;
    public final void rule__DistanceCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1833:1: ( rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 )
            // InternalPolycreate.g:1834:2: rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2
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
    // InternalPolycreate.g:1841:1: rule__DistanceCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__DistanceCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1845:1: ( ( 'detect' ) )
            // InternalPolycreate.g:1846:1: ( 'detect' )
            {
            // InternalPolycreate.g:1846:1: ( 'detect' )
            // InternalPolycreate.g:1847:2: 'detect'
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
    // InternalPolycreate.g:1856:1: rule__DistanceCondition__Group__2 : rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3 ;
    public final void rule__DistanceCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1860:1: ( rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3 )
            // InternalPolycreate.g:1861:2: rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3
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
    // InternalPolycreate.g:1868:1: rule__DistanceCondition__Group__2__Impl : ( 'object' ) ;
    public final void rule__DistanceCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1872:1: ( ( 'object' ) )
            // InternalPolycreate.g:1873:1: ( 'object' )
            {
            // InternalPolycreate.g:1873:1: ( 'object' )
            // InternalPolycreate.g:1874:2: 'object'
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
    // InternalPolycreate.g:1883:1: rule__DistanceCondition__Group__3 : rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4 ;
    public final void rule__DistanceCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1887:1: ( rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4 )
            // InternalPolycreate.g:1888:2: rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4
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
    // InternalPolycreate.g:1895:1: rule__DistanceCondition__Group__3__Impl : ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) ) ;
    public final void rule__DistanceCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1899:1: ( ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) ) )
            // InternalPolycreate.g:1900:1: ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) )
            {
            // InternalPolycreate.g:1900:1: ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) )
            // InternalPolycreate.g:1901:2: ( rule__DistanceCondition__CameraTypeAssignment_3 )
            {
             before(grammarAccess.getDistanceConditionAccess().getCameraTypeAssignment_3()); 
            // InternalPolycreate.g:1902:2: ( rule__DistanceCondition__CameraTypeAssignment_3 )
            // InternalPolycreate.g:1902:3: rule__DistanceCondition__CameraTypeAssignment_3
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
    // InternalPolycreate.g:1910:1: rule__DistanceCondition__Group__4 : rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5 ;
    public final void rule__DistanceCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1914:1: ( rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5 )
            // InternalPolycreate.g:1915:2: rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5
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
    // InternalPolycreate.g:1922:1: rule__DistanceCondition__Group__4__Impl : ( 'with' ) ;
    public final void rule__DistanceCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1926:1: ( ( 'with' ) )
            // InternalPolycreate.g:1927:1: ( 'with' )
            {
            // InternalPolycreate.g:1927:1: ( 'with' )
            // InternalPolycreate.g:1928:2: 'with'
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
    // InternalPolycreate.g:1937:1: rule__DistanceCondition__Group__5 : rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6 ;
    public final void rule__DistanceCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1941:1: ( rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6 )
            // InternalPolycreate.g:1942:2: rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6
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
    // InternalPolycreate.g:1949:1: rule__DistanceCondition__Group__5__Impl : ( 'distance' ) ;
    public final void rule__DistanceCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1953:1: ( ( 'distance' ) )
            // InternalPolycreate.g:1954:1: ( 'distance' )
            {
            // InternalPolycreate.g:1954:1: ( 'distance' )
            // InternalPolycreate.g:1955:2: 'distance'
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
    // InternalPolycreate.g:1964:1: rule__DistanceCondition__Group__6 : rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7 ;
    public final void rule__DistanceCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1968:1: ( rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7 )
            // InternalPolycreate.g:1969:2: rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7
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
    // InternalPolycreate.g:1976:1: rule__DistanceCondition__Group__6__Impl : ( ( rule__DistanceCondition__OperatorAssignment_6 ) ) ;
    public final void rule__DistanceCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1980:1: ( ( ( rule__DistanceCondition__OperatorAssignment_6 ) ) )
            // InternalPolycreate.g:1981:1: ( ( rule__DistanceCondition__OperatorAssignment_6 ) )
            {
            // InternalPolycreate.g:1981:1: ( ( rule__DistanceCondition__OperatorAssignment_6 ) )
            // InternalPolycreate.g:1982:2: ( rule__DistanceCondition__OperatorAssignment_6 )
            {
             before(grammarAccess.getDistanceConditionAccess().getOperatorAssignment_6()); 
            // InternalPolycreate.g:1983:2: ( rule__DistanceCondition__OperatorAssignment_6 )
            // InternalPolycreate.g:1983:3: rule__DistanceCondition__OperatorAssignment_6
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
    // InternalPolycreate.g:1991:1: rule__DistanceCondition__Group__7 : rule__DistanceCondition__Group__7__Impl ;
    public final void rule__DistanceCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1995:1: ( rule__DistanceCondition__Group__7__Impl )
            // InternalPolycreate.g:1996:2: rule__DistanceCondition__Group__7__Impl
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
    // InternalPolycreate.g:2002:1: rule__DistanceCondition__Group__7__Impl : ( ( rule__DistanceCondition__DistanceAssignment_7 ) ) ;
    public final void rule__DistanceCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2006:1: ( ( ( rule__DistanceCondition__DistanceAssignment_7 ) ) )
            // InternalPolycreate.g:2007:1: ( ( rule__DistanceCondition__DistanceAssignment_7 ) )
            {
            // InternalPolycreate.g:2007:1: ( ( rule__DistanceCondition__DistanceAssignment_7 ) )
            // InternalPolycreate.g:2008:2: ( rule__DistanceCondition__DistanceAssignment_7 )
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceAssignment_7()); 
            // InternalPolycreate.g:2009:2: ( rule__DistanceCondition__DistanceAssignment_7 )
            // InternalPolycreate.g:2009:3: rule__DistanceCondition__DistanceAssignment_7
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
    // InternalPolycreate.g:2018:1: rule__AngleCondition__Group__0 : rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1 ;
    public final void rule__AngleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2022:1: ( rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1 )
            // InternalPolycreate.g:2023:2: rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1
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
    // InternalPolycreate.g:2030:1: rule__AngleCondition__Group__0__Impl : ( () ) ;
    public final void rule__AngleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2034:1: ( ( () ) )
            // InternalPolycreate.g:2035:1: ( () )
            {
            // InternalPolycreate.g:2035:1: ( () )
            // InternalPolycreate.g:2036:2: ()
            {
             before(grammarAccess.getAngleConditionAccess().getAngleConditionAction_0()); 
            // InternalPolycreate.g:2037:2: ()
            // InternalPolycreate.g:2037:3: 
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
    // InternalPolycreate.g:2045:1: rule__AngleCondition__Group__1 : rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2 ;
    public final void rule__AngleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2049:1: ( rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2 )
            // InternalPolycreate.g:2050:2: rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2
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
    // InternalPolycreate.g:2057:1: rule__AngleCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__AngleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2061:1: ( ( 'detect' ) )
            // InternalPolycreate.g:2062:1: ( 'detect' )
            {
            // InternalPolycreate.g:2062:1: ( 'detect' )
            // InternalPolycreate.g:2063:2: 'detect'
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
    // InternalPolycreate.g:2072:1: rule__AngleCondition__Group__2 : rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3 ;
    public final void rule__AngleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2076:1: ( rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3 )
            // InternalPolycreate.g:2077:2: rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3
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
    // InternalPolycreate.g:2084:1: rule__AngleCondition__Group__2__Impl : ( 'object' ) ;
    public final void rule__AngleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2088:1: ( ( 'object' ) )
            // InternalPolycreate.g:2089:1: ( 'object' )
            {
            // InternalPolycreate.g:2089:1: ( 'object' )
            // InternalPolycreate.g:2090:2: 'object'
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
    // InternalPolycreate.g:2099:1: rule__AngleCondition__Group__3 : rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4 ;
    public final void rule__AngleCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2103:1: ( rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4 )
            // InternalPolycreate.g:2104:2: rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4
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
    // InternalPolycreate.g:2111:1: rule__AngleCondition__Group__3__Impl : ( ( rule__AngleCondition__CameraTypeAssignment_3 ) ) ;
    public final void rule__AngleCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2115:1: ( ( ( rule__AngleCondition__CameraTypeAssignment_3 ) ) )
            // InternalPolycreate.g:2116:1: ( ( rule__AngleCondition__CameraTypeAssignment_3 ) )
            {
            // InternalPolycreate.g:2116:1: ( ( rule__AngleCondition__CameraTypeAssignment_3 ) )
            // InternalPolycreate.g:2117:2: ( rule__AngleCondition__CameraTypeAssignment_3 )
            {
             before(grammarAccess.getAngleConditionAccess().getCameraTypeAssignment_3()); 
            // InternalPolycreate.g:2118:2: ( rule__AngleCondition__CameraTypeAssignment_3 )
            // InternalPolycreate.g:2118:3: rule__AngleCondition__CameraTypeAssignment_3
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
    // InternalPolycreate.g:2126:1: rule__AngleCondition__Group__4 : rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5 ;
    public final void rule__AngleCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2130:1: ( rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5 )
            // InternalPolycreate.g:2131:2: rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5
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
    // InternalPolycreate.g:2138:1: rule__AngleCondition__Group__4__Impl : ( 'with' ) ;
    public final void rule__AngleCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2142:1: ( ( 'with' ) )
            // InternalPolycreate.g:2143:1: ( 'with' )
            {
            // InternalPolycreate.g:2143:1: ( 'with' )
            // InternalPolycreate.g:2144:2: 'with'
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
    // InternalPolycreate.g:2153:1: rule__AngleCondition__Group__5 : rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6 ;
    public final void rule__AngleCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2157:1: ( rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6 )
            // InternalPolycreate.g:2158:2: rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6
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
    // InternalPolycreate.g:2165:1: rule__AngleCondition__Group__5__Impl : ( 'angle' ) ;
    public final void rule__AngleCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2169:1: ( ( 'angle' ) )
            // InternalPolycreate.g:2170:1: ( 'angle' )
            {
            // InternalPolycreate.g:2170:1: ( 'angle' )
            // InternalPolycreate.g:2171:2: 'angle'
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
    // InternalPolycreate.g:2180:1: rule__AngleCondition__Group__6 : rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7 ;
    public final void rule__AngleCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2184:1: ( rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7 )
            // InternalPolycreate.g:2185:2: rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7
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
    // InternalPolycreate.g:2192:1: rule__AngleCondition__Group__6__Impl : ( ( rule__AngleCondition__OperatorAssignment_6 ) ) ;
    public final void rule__AngleCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2196:1: ( ( ( rule__AngleCondition__OperatorAssignment_6 ) ) )
            // InternalPolycreate.g:2197:1: ( ( rule__AngleCondition__OperatorAssignment_6 ) )
            {
            // InternalPolycreate.g:2197:1: ( ( rule__AngleCondition__OperatorAssignment_6 ) )
            // InternalPolycreate.g:2198:2: ( rule__AngleCondition__OperatorAssignment_6 )
            {
             before(grammarAccess.getAngleConditionAccess().getOperatorAssignment_6()); 
            // InternalPolycreate.g:2199:2: ( rule__AngleCondition__OperatorAssignment_6 )
            // InternalPolycreate.g:2199:3: rule__AngleCondition__OperatorAssignment_6
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
    // InternalPolycreate.g:2207:1: rule__AngleCondition__Group__7 : rule__AngleCondition__Group__7__Impl ;
    public final void rule__AngleCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2211:1: ( rule__AngleCondition__Group__7__Impl )
            // InternalPolycreate.g:2212:2: rule__AngleCondition__Group__7__Impl
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
    // InternalPolycreate.g:2218:1: rule__AngleCondition__Group__7__Impl : ( ( rule__AngleCondition__AngleAssignment_7 ) ) ;
    public final void rule__AngleCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2222:1: ( ( ( rule__AngleCondition__AngleAssignment_7 ) ) )
            // InternalPolycreate.g:2223:1: ( ( rule__AngleCondition__AngleAssignment_7 ) )
            {
            // InternalPolycreate.g:2223:1: ( ( rule__AngleCondition__AngleAssignment_7 ) )
            // InternalPolycreate.g:2224:2: ( rule__AngleCondition__AngleAssignment_7 )
            {
             before(grammarAccess.getAngleConditionAccess().getAngleAssignment_7()); 
            // InternalPolycreate.g:2225:2: ( rule__AngleCondition__AngleAssignment_7 )
            // InternalPolycreate.g:2225:3: rule__AngleCondition__AngleAssignment_7
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
    // InternalPolycreate.g:2234:1: rule__MoveAction__Group__0 : rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 ;
    public final void rule__MoveAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2238:1: ( rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 )
            // InternalPolycreate.g:2239:2: rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1
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
    // InternalPolycreate.g:2246:1: rule__MoveAction__Group__0__Impl : ( () ) ;
    public final void rule__MoveAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2250:1: ( ( () ) )
            // InternalPolycreate.g:2251:1: ( () )
            {
            // InternalPolycreate.g:2251:1: ( () )
            // InternalPolycreate.g:2252:2: ()
            {
             before(grammarAccess.getMoveActionAccess().getMoveActionAction_0()); 
            // InternalPolycreate.g:2253:2: ()
            // InternalPolycreate.g:2253:3: 
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
    // InternalPolycreate.g:2261:1: rule__MoveAction__Group__1 : rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 ;
    public final void rule__MoveAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2265:1: ( rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 )
            // InternalPolycreate.g:2266:2: rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2
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
    // InternalPolycreate.g:2273:1: rule__MoveAction__Group__1__Impl : ( 'move' ) ;
    public final void rule__MoveAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2277:1: ( ( 'move' ) )
            // InternalPolycreate.g:2278:1: ( 'move' )
            {
            // InternalPolycreate.g:2278:1: ( 'move' )
            // InternalPolycreate.g:2279:2: 'move'
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
    // InternalPolycreate.g:2288:1: rule__MoveAction__Group__2 : rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 ;
    public final void rule__MoveAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2292:1: ( rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 )
            // InternalPolycreate.g:2293:2: rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3
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
    // InternalPolycreate.g:2300:1: rule__MoveAction__Group__2__Impl : ( ( rule__MoveAction__DirectionAssignment_2 ) ) ;
    public final void rule__MoveAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2304:1: ( ( ( rule__MoveAction__DirectionAssignment_2 ) ) )
            // InternalPolycreate.g:2305:1: ( ( rule__MoveAction__DirectionAssignment_2 ) )
            {
            // InternalPolycreate.g:2305:1: ( ( rule__MoveAction__DirectionAssignment_2 ) )
            // InternalPolycreate.g:2306:2: ( rule__MoveAction__DirectionAssignment_2 )
            {
             before(grammarAccess.getMoveActionAccess().getDirectionAssignment_2()); 
            // InternalPolycreate.g:2307:2: ( rule__MoveAction__DirectionAssignment_2 )
            // InternalPolycreate.g:2307:3: rule__MoveAction__DirectionAssignment_2
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
    // InternalPolycreate.g:2315:1: rule__MoveAction__Group__3 : rule__MoveAction__Group__3__Impl ;
    public final void rule__MoveAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2319:1: ( rule__MoveAction__Group__3__Impl )
            // InternalPolycreate.g:2320:2: rule__MoveAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveAction__Group__3__Impl();

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
    // InternalPolycreate.g:2326:1: rule__MoveAction__Group__3__Impl : ( ( rule__MoveAction__Group_3__0 )? ) ;
    public final void rule__MoveAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2330:1: ( ( ( rule__MoveAction__Group_3__0 )? ) )
            // InternalPolycreate.g:2331:1: ( ( rule__MoveAction__Group_3__0 )? )
            {
            // InternalPolycreate.g:2331:1: ( ( rule__MoveAction__Group_3__0 )? )
            // InternalPolycreate.g:2332:2: ( rule__MoveAction__Group_3__0 )?
            {
             before(grammarAccess.getMoveActionAccess().getGroup_3()); 
            // InternalPolycreate.g:2333:2: ( rule__MoveAction__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPolycreate.g:2333:3: rule__MoveAction__Group_3__0
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


    // $ANTLR start "rule__MoveAction__Group_3__0"
    // InternalPolycreate.g:2342:1: rule__MoveAction__Group_3__0 : rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1 ;
    public final void rule__MoveAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2346:1: ( rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1 )
            // InternalPolycreate.g:2347:2: rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPolycreate.g:2354:1: rule__MoveAction__Group_3__0__Impl : ( 'during' ) ;
    public final void rule__MoveAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2358:1: ( ( 'during' ) )
            // InternalPolycreate.g:2359:1: ( 'during' )
            {
            // InternalPolycreate.g:2359:1: ( 'during' )
            // InternalPolycreate.g:2360:2: 'during'
            {
             before(grammarAccess.getMoveActionAccess().getDuringKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMoveActionAccess().getDuringKeyword_3_0()); 

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
    // InternalPolycreate.g:2369:1: rule__MoveAction__Group_3__1 : rule__MoveAction__Group_3__1__Impl ;
    public final void rule__MoveAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2373:1: ( rule__MoveAction__Group_3__1__Impl )
            // InternalPolycreate.g:2374:2: rule__MoveAction__Group_3__1__Impl
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
    // InternalPolycreate.g:2380:1: rule__MoveAction__Group_3__1__Impl : ( ( rule__MoveAction__DurationAssignment_3_1 ) ) ;
    public final void rule__MoveAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2384:1: ( ( ( rule__MoveAction__DurationAssignment_3_1 ) ) )
            // InternalPolycreate.g:2385:1: ( ( rule__MoveAction__DurationAssignment_3_1 ) )
            {
            // InternalPolycreate.g:2385:1: ( ( rule__MoveAction__DurationAssignment_3_1 ) )
            // InternalPolycreate.g:2386:2: ( rule__MoveAction__DurationAssignment_3_1 )
            {
             before(grammarAccess.getMoveActionAccess().getDurationAssignment_3_1()); 
            // InternalPolycreate.g:2387:2: ( rule__MoveAction__DurationAssignment_3_1 )
            // InternalPolycreate.g:2387:3: rule__MoveAction__DurationAssignment_3_1
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


    // $ANTLR start "rule__TurnAction__Group__0"
    // InternalPolycreate.g:2396:1: rule__TurnAction__Group__0 : rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 ;
    public final void rule__TurnAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2400:1: ( rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 )
            // InternalPolycreate.g:2401:2: rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1
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
    // InternalPolycreate.g:2408:1: rule__TurnAction__Group__0__Impl : ( () ) ;
    public final void rule__TurnAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2412:1: ( ( () ) )
            // InternalPolycreate.g:2413:1: ( () )
            {
            // InternalPolycreate.g:2413:1: ( () )
            // InternalPolycreate.g:2414:2: ()
            {
             before(grammarAccess.getTurnActionAccess().getTurnActionAction_0()); 
            // InternalPolycreate.g:2415:2: ()
            // InternalPolycreate.g:2415:3: 
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
    // InternalPolycreate.g:2423:1: rule__TurnAction__Group__1 : rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 ;
    public final void rule__TurnAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2427:1: ( rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 )
            // InternalPolycreate.g:2428:2: rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2
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
    // InternalPolycreate.g:2435:1: rule__TurnAction__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2439:1: ( ( 'turn' ) )
            // InternalPolycreate.g:2440:1: ( 'turn' )
            {
            // InternalPolycreate.g:2440:1: ( 'turn' )
            // InternalPolycreate.g:2441:2: 'turn'
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
    // InternalPolycreate.g:2450:1: rule__TurnAction__Group__2 : rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 ;
    public final void rule__TurnAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2454:1: ( rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 )
            // InternalPolycreate.g:2455:2: rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3
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
    // InternalPolycreate.g:2462:1: rule__TurnAction__Group__2__Impl : ( ( rule__TurnAction__AngleAssignment_2 ) ) ;
    public final void rule__TurnAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2466:1: ( ( ( rule__TurnAction__AngleAssignment_2 ) ) )
            // InternalPolycreate.g:2467:1: ( ( rule__TurnAction__AngleAssignment_2 ) )
            {
            // InternalPolycreate.g:2467:1: ( ( rule__TurnAction__AngleAssignment_2 ) )
            // InternalPolycreate.g:2468:2: ( rule__TurnAction__AngleAssignment_2 )
            {
             before(grammarAccess.getTurnActionAccess().getAngleAssignment_2()); 
            // InternalPolycreate.g:2469:2: ( rule__TurnAction__AngleAssignment_2 )
            // InternalPolycreate.g:2469:3: rule__TurnAction__AngleAssignment_2
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
    // InternalPolycreate.g:2477:1: rule__TurnAction__Group__3 : rule__TurnAction__Group__3__Impl ;
    public final void rule__TurnAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2481:1: ( rule__TurnAction__Group__3__Impl )
            // InternalPolycreate.g:2482:2: rule__TurnAction__Group__3__Impl
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
    // InternalPolycreate.g:2488:1: rule__TurnAction__Group__3__Impl : ( ( rule__TurnAction__Group_3__0 )? ) ;
    public final void rule__TurnAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2492:1: ( ( ( rule__TurnAction__Group_3__0 )? ) )
            // InternalPolycreate.g:2493:1: ( ( rule__TurnAction__Group_3__0 )? )
            {
            // InternalPolycreate.g:2493:1: ( ( rule__TurnAction__Group_3__0 )? )
            // InternalPolycreate.g:2494:2: ( rule__TurnAction__Group_3__0 )?
            {
             before(grammarAccess.getTurnActionAccess().getGroup_3()); 
            // InternalPolycreate.g:2495:2: ( rule__TurnAction__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:2495:3: rule__TurnAction__Group_3__0
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
    // InternalPolycreate.g:2504:1: rule__TurnAction__Group_3__0 : rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 ;
    public final void rule__TurnAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2508:1: ( rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 )
            // InternalPolycreate.g:2509:2: rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1
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
    // InternalPolycreate.g:2516:1: rule__TurnAction__Group_3__0__Impl : ( 'during' ) ;
    public final void rule__TurnAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2520:1: ( ( 'during' ) )
            // InternalPolycreate.g:2521:1: ( 'during' )
            {
            // InternalPolycreate.g:2521:1: ( 'during' )
            // InternalPolycreate.g:2522:2: 'during'
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
    // InternalPolycreate.g:2531:1: rule__TurnAction__Group_3__1 : rule__TurnAction__Group_3__1__Impl ;
    public final void rule__TurnAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2535:1: ( rule__TurnAction__Group_3__1__Impl )
            // InternalPolycreate.g:2536:2: rule__TurnAction__Group_3__1__Impl
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
    // InternalPolycreate.g:2542:1: rule__TurnAction__Group_3__1__Impl : ( ( rule__TurnAction__DurationAssignment_3_1 ) ) ;
    public final void rule__TurnAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2546:1: ( ( ( rule__TurnAction__DurationAssignment_3_1 ) ) )
            // InternalPolycreate.g:2547:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            {
            // InternalPolycreate.g:2547:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            // InternalPolycreate.g:2548:2: ( rule__TurnAction__DurationAssignment_3_1 )
            {
             before(grammarAccess.getTurnActionAccess().getDurationAssignment_3_1()); 
            // InternalPolycreate.g:2549:2: ( rule__TurnAction__DurationAssignment_3_1 )
            // InternalPolycreate.g:2549:3: rule__TurnAction__DurationAssignment_3_1
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
    // InternalPolycreate.g:2558:1: rule__GripAction__Group__0 : rule__GripAction__Group__0__Impl rule__GripAction__Group__1 ;
    public final void rule__GripAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2562:1: ( rule__GripAction__Group__0__Impl rule__GripAction__Group__1 )
            // InternalPolycreate.g:2563:2: rule__GripAction__Group__0__Impl rule__GripAction__Group__1
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
    // InternalPolycreate.g:2570:1: rule__GripAction__Group__0__Impl : ( () ) ;
    public final void rule__GripAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2574:1: ( ( () ) )
            // InternalPolycreate.g:2575:1: ( () )
            {
            // InternalPolycreate.g:2575:1: ( () )
            // InternalPolycreate.g:2576:2: ()
            {
             before(grammarAccess.getGripActionAccess().getGripActionAction_0()); 
            // InternalPolycreate.g:2577:2: ()
            // InternalPolycreate.g:2577:3: 
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
    // InternalPolycreate.g:2585:1: rule__GripAction__Group__1 : rule__GripAction__Group__1__Impl rule__GripAction__Group__2 ;
    public final void rule__GripAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2589:1: ( rule__GripAction__Group__1__Impl rule__GripAction__Group__2 )
            // InternalPolycreate.g:2590:2: rule__GripAction__Group__1__Impl rule__GripAction__Group__2
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
    // InternalPolycreate.g:2597:1: rule__GripAction__Group__1__Impl : ( ( rule__GripAction__StateAssignment_1 ) ) ;
    public final void rule__GripAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2601:1: ( ( ( rule__GripAction__StateAssignment_1 ) ) )
            // InternalPolycreate.g:2602:1: ( ( rule__GripAction__StateAssignment_1 ) )
            {
            // InternalPolycreate.g:2602:1: ( ( rule__GripAction__StateAssignment_1 ) )
            // InternalPolycreate.g:2603:2: ( rule__GripAction__StateAssignment_1 )
            {
             before(grammarAccess.getGripActionAccess().getStateAssignment_1()); 
            // InternalPolycreate.g:2604:2: ( rule__GripAction__StateAssignment_1 )
            // InternalPolycreate.g:2604:3: rule__GripAction__StateAssignment_1
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
    // InternalPolycreate.g:2612:1: rule__GripAction__Group__2 : rule__GripAction__Group__2__Impl ;
    public final void rule__GripAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2616:1: ( rule__GripAction__Group__2__Impl )
            // InternalPolycreate.g:2617:2: rule__GripAction__Group__2__Impl
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
    // InternalPolycreate.g:2623:1: rule__GripAction__Group__2__Impl : ( 'gripper' ) ;
    public final void rule__GripAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2627:1: ( ( 'gripper' ) )
            // InternalPolycreate.g:2628:1: ( 'gripper' )
            {
            // InternalPolycreate.g:2628:1: ( 'gripper' )
            // InternalPolycreate.g:2629:2: 'gripper'
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
    // InternalPolycreate.g:2639:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2643:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPolycreate.g:2644:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalPolycreate.g:2651:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2655:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2656:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2656:1: ( ( '-' )? )
            // InternalPolycreate.g:2657:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalPolycreate.g:2658:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPolycreate.g:2658:3: '-'
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
    // InternalPolycreate.g:2666:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2670:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPolycreate.g:2671:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalPolycreate.g:2678:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2682:1: ( ( ( RULE_INT )? ) )
            // InternalPolycreate.g:2683:1: ( ( RULE_INT )? )
            {
            // InternalPolycreate.g:2683:1: ( ( RULE_INT )? )
            // InternalPolycreate.g:2684:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalPolycreate.g:2685:2: ( RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPolycreate.g:2685:3: RULE_INT
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
    // InternalPolycreate.g:2693:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2697:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPolycreate.g:2698:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalPolycreate.g:2705:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2709:1: ( ( '.' ) )
            // InternalPolycreate.g:2710:1: ( '.' )
            {
            // InternalPolycreate.g:2710:1: ( '.' )
            // InternalPolycreate.g:2711:2: '.'
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
    // InternalPolycreate.g:2720:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2724:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalPolycreate.g:2725:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
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
    // InternalPolycreate.g:2732:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2736:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2737:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2737:1: ( RULE_INT )
            // InternalPolycreate.g:2738:2: RULE_INT
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
    // InternalPolycreate.g:2747:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2751:1: ( rule__EDouble__Group__4__Impl )
            // InternalPolycreate.g:2752:2: rule__EDouble__Group__4__Impl
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
    // InternalPolycreate.g:2758:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2762:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalPolycreate.g:2763:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalPolycreate.g:2763:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalPolycreate.g:2764:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalPolycreate.g:2765:2: ( rule__EDouble__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=11 && LA23_0<=12)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPolycreate.g:2765:3: rule__EDouble__Group_4__0
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
    // InternalPolycreate.g:2774:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2778:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalPolycreate.g:2779:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
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
    // InternalPolycreate.g:2786:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2790:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalPolycreate.g:2791:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalPolycreate.g:2791:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalPolycreate.g:2792:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalPolycreate.g:2793:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalPolycreate.g:2793:3: rule__EDouble__Alternatives_4_0
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
    // InternalPolycreate.g:2801:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2805:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalPolycreate.g:2806:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
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
    // InternalPolycreate.g:2813:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2817:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2818:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2818:1: ( ( '-' )? )
            // InternalPolycreate.g:2819:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalPolycreate.g:2820:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPolycreate.g:2820:3: '-'
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
    // InternalPolycreate.g:2828:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2832:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalPolycreate.g:2833:2: rule__EDouble__Group_4__2__Impl
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
    // InternalPolycreate.g:2839:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2843:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2844:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2844:1: ( RULE_INT )
            // InternalPolycreate.g:2845:2: RULE_INT
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
    // InternalPolycreate.g:2855:1: rule__RobotProgram__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RobotProgram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2859:1: ( ( ruleEString ) )
            // InternalPolycreate.g:2860:2: ( ruleEString )
            {
            // InternalPolycreate.g:2860:2: ( ruleEString )
            // InternalPolycreate.g:2861:3: ruleEString
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
    // InternalPolycreate.g:2870:1: rule__RobotProgram__InitialStateAssignment_4 : ( ruleState ) ;
    public final void rule__RobotProgram__InitialStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2874:1: ( ( ruleState ) )
            // InternalPolycreate.g:2875:2: ( ruleState )
            {
            // InternalPolycreate.g:2875:2: ( ruleState )
            // InternalPolycreate.g:2876:3: ruleState
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
    // InternalPolycreate.g:2885:1: rule__RobotProgram__OwnedStatesAssignment_5 : ( ruleState ) ;
    public final void rule__RobotProgram__OwnedStatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2889:1: ( ( ruleState ) )
            // InternalPolycreate.g:2890:2: ( ruleState )
            {
            // InternalPolycreate.g:2890:2: ( ruleState )
            // InternalPolycreate.g:2891:3: ruleState
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
    // InternalPolycreate.g:2900:1: rule__RobotProgram__GlobalTransitionsAssignment_6 : ( ruleTransition ) ;
    public final void rule__RobotProgram__GlobalTransitionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2904:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:2905:2: ( ruleTransition )
            {
            // InternalPolycreate.g:2905:2: ( ruleTransition )
            // InternalPolycreate.g:2906:3: ruleTransition
            {
             before(grammarAccess.getRobotProgramAccess().getGlobalTransitionsTransitionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getRobotProgramAccess().getGlobalTransitionsTransitionParserRuleCall_6_0()); 

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
    // InternalPolycreate.g:2915:1: rule__Transition__ConditionsAssignment_1_0 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2919:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:2920:2: ( ruleCondition )
            {
            // InternalPolycreate.g:2920:2: ( ruleCondition )
            // InternalPolycreate.g:2921:3: ruleCondition
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
    // InternalPolycreate.g:2930:1: rule__Transition__ConditionsAssignment_1_1_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2934:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:2935:2: ( ruleCondition )
            {
            // InternalPolycreate.g:2935:2: ( ruleCondition )
            // InternalPolycreate.g:2936:3: ruleCondition
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
    // InternalPolycreate.g:2945:1: rule__Transition__NextStateAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2949:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:2950:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:2950:2: ( ( ruleEString ) )
            // InternalPolycreate.g:2951:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_2_0()); 
            // InternalPolycreate.g:2952:3: ( ruleEString )
            // InternalPolycreate.g:2953:4: ruleEString
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


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalPolycreate.g:2964:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2968:1: ( ( ruleEString ) )
            // InternalPolycreate.g:2969:2: ( ruleEString )
            {
            // InternalPolycreate.g:2969:2: ( ruleEString )
            // InternalPolycreate.g:2970:3: ruleEString
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
    // InternalPolycreate.g:2979:1: rule__State__ActionsAssignment_4_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2983:1: ( ( ruleAction ) )
            // InternalPolycreate.g:2984:2: ( ruleAction )
            {
            // InternalPolycreate.g:2984:2: ( ruleAction )
            // InternalPolycreate.g:2985:3: ruleAction
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
    // InternalPolycreate.g:2994:1: rule__State__ActionsAssignment_4_4_1 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2998:1: ( ( ruleAction ) )
            // InternalPolycreate.g:2999:2: ( ruleAction )
            {
            // InternalPolycreate.g:2999:2: ( ruleAction )
            // InternalPolycreate.g:3000:3: ruleAction
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
    // InternalPolycreate.g:3009:1: rule__State__TransitionsAssignment_5_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3013:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:3014:2: ( ruleTransition )
            {
            // InternalPolycreate.g:3014:2: ( ruleTransition )
            // InternalPolycreate.g:3015:3: ruleTransition
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
    // InternalPolycreate.g:3024:1: rule__State__TransitionsAssignment_5_4_1 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3028:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:3029:2: ( ruleTransition )
            {
            // InternalPolycreate.g:3029:2: ( ruleTransition )
            // InternalPolycreate.g:3030:3: ruleTransition
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
    // InternalPolycreate.g:3039:1: rule__SimpleCondition__DetectionTypeAssignment_2 : ( ruleDETECTION ) ;
    public final void rule__SimpleCondition__DetectionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3043:1: ( ( ruleDETECTION ) )
            // InternalPolycreate.g:3044:2: ( ruleDETECTION )
            {
            // InternalPolycreate.g:3044:2: ( ruleDETECTION )
            // InternalPolycreate.g:3045:3: ruleDETECTION
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
    // InternalPolycreate.g:3054:1: rule__DistanceCondition__CameraTypeAssignment_3 : ( ruleCAMERATYPE ) ;
    public final void rule__DistanceCondition__CameraTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3058:1: ( ( ruleCAMERATYPE ) )
            // InternalPolycreate.g:3059:2: ( ruleCAMERATYPE )
            {
            // InternalPolycreate.g:3059:2: ( ruleCAMERATYPE )
            // InternalPolycreate.g:3060:3: ruleCAMERATYPE
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
    // InternalPolycreate.g:3069:1: rule__DistanceCondition__OperatorAssignment_6 : ( ruleOPERATOR ) ;
    public final void rule__DistanceCondition__OperatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3073:1: ( ( ruleOPERATOR ) )
            // InternalPolycreate.g:3074:2: ( ruleOPERATOR )
            {
            // InternalPolycreate.g:3074:2: ( ruleOPERATOR )
            // InternalPolycreate.g:3075:3: ruleOPERATOR
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
    // InternalPolycreate.g:3084:1: rule__DistanceCondition__DistanceAssignment_7 : ( ruleEDouble ) ;
    public final void rule__DistanceCondition__DistanceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3088:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3089:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3089:2: ( ruleEDouble )
            // InternalPolycreate.g:3090:3: ruleEDouble
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
    // InternalPolycreate.g:3099:1: rule__AngleCondition__CameraTypeAssignment_3 : ( ruleCAMERATYPE ) ;
    public final void rule__AngleCondition__CameraTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3103:1: ( ( ruleCAMERATYPE ) )
            // InternalPolycreate.g:3104:2: ( ruleCAMERATYPE )
            {
            // InternalPolycreate.g:3104:2: ( ruleCAMERATYPE )
            // InternalPolycreate.g:3105:3: ruleCAMERATYPE
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
    // InternalPolycreate.g:3114:1: rule__AngleCondition__OperatorAssignment_6 : ( ruleOPERATOR ) ;
    public final void rule__AngleCondition__OperatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3118:1: ( ( ruleOPERATOR ) )
            // InternalPolycreate.g:3119:2: ( ruleOPERATOR )
            {
            // InternalPolycreate.g:3119:2: ( ruleOPERATOR )
            // InternalPolycreate.g:3120:3: ruleOPERATOR
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
    // InternalPolycreate.g:3129:1: rule__AngleCondition__AngleAssignment_7 : ( ruleEDouble ) ;
    public final void rule__AngleCondition__AngleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3133:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3134:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3134:2: ( ruleEDouble )
            // InternalPolycreate.g:3135:3: ruleEDouble
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
    // InternalPolycreate.g:3144:1: rule__MoveAction__DirectionAssignment_2 : ( ruleDIRECTION ) ;
    public final void rule__MoveAction__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3148:1: ( ( ruleDIRECTION ) )
            // InternalPolycreate.g:3149:2: ( ruleDIRECTION )
            {
            // InternalPolycreate.g:3149:2: ( ruleDIRECTION )
            // InternalPolycreate.g:3150:3: ruleDIRECTION
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


    // $ANTLR start "rule__MoveAction__DurationAssignment_3_1"
    // InternalPolycreate.g:3159:1: rule__MoveAction__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__MoveAction__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3163:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3164:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3164:2: ( ruleEDouble )
            // InternalPolycreate.g:3165:3: ruleEDouble
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


    // $ANTLR start "rule__TurnAction__AngleAssignment_2"
    // InternalPolycreate.g:3174:1: rule__TurnAction__AngleAssignment_2 : ( ruleEDouble ) ;
    public final void rule__TurnAction__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3178:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3179:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3179:2: ( ruleEDouble )
            // InternalPolycreate.g:3180:3: ruleEDouble
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
    // InternalPolycreate.g:3189:1: rule__TurnAction__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__TurnAction__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3193:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:3194:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:3194:2: ( ruleEDouble )
            // InternalPolycreate.g:3195:3: ruleEDouble
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
    // InternalPolycreate.g:3204:1: rule__GripAction__StateAssignment_1 : ( ruleGRIPPER_STATE ) ;
    public final void rule__GripAction__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:3208:1: ( ( ruleGRIPPER_STATE ) )
            // InternalPolycreate.g:3209:2: ( ruleGRIPPER_STATE )
            {
            // InternalPolycreate.g:3209:2: ( ruleGRIPPER_STATE )
            // InternalPolycreate.g:3210:3: ruleGRIPPER_STATE
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008080000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000032L});
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