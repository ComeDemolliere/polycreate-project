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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'COLLISION_LEFT'", "'COLLISION_RIGHT'", "'VIRTUAL_WALL'", "'CLIFF_LEFT'", "'CLIFF_RIGHT'", "'CLIFF_FRONT'", "'FORWARD'", "'BACKWARD'", "'BACK'", "'FRONT'", "'RobotProgram'", "'->'", "'=>'", "'and'", "'State'", "':'", "'actions'", "'='", "'['", "']'", "','", "'transitions'", "'detect'", "'object'", "'with'", "'distance'", "'<'", "'angle'", "'move'", "'during'", "'turn'", "'-'", "'.'"
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
    public static final int T__44=44;
    public static final int T__45=45;
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


    // $ANTLR start "entryRuleEDouble"
    // InternalPolycreate.g:353:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPolycreate.g:354:1: ( ruleEDouble EOF )
            // InternalPolycreate.g:355:1: ruleEDouble EOF
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
    // InternalPolycreate.g:362:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:366:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalPolycreate.g:367:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalPolycreate.g:367:2: ( ( rule__EDouble__Group__0 ) )
            // InternalPolycreate.g:368:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalPolycreate.g:369:3: ( rule__EDouble__Group__0 )
            // InternalPolycreate.g:369:4: rule__EDouble__Group__0
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
    // InternalPolycreate.g:378:1: ruleDETECTION : ( ( rule__DETECTION__Alternatives ) ) ;
    public final void ruleDETECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:382:1: ( ( ( rule__DETECTION__Alternatives ) ) )
            // InternalPolycreate.g:383:2: ( ( rule__DETECTION__Alternatives ) )
            {
            // InternalPolycreate.g:383:2: ( ( rule__DETECTION__Alternatives ) )
            // InternalPolycreate.g:384:3: ( rule__DETECTION__Alternatives )
            {
             before(grammarAccess.getDETECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:385:3: ( rule__DETECTION__Alternatives )
            // InternalPolycreate.g:385:4: rule__DETECTION__Alternatives
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
    // InternalPolycreate.g:394:1: ruleDIRECTION : ( ( rule__DIRECTION__Alternatives ) ) ;
    public final void ruleDIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:398:1: ( ( ( rule__DIRECTION__Alternatives ) ) )
            // InternalPolycreate.g:399:2: ( ( rule__DIRECTION__Alternatives ) )
            {
            // InternalPolycreate.g:399:2: ( ( rule__DIRECTION__Alternatives ) )
            // InternalPolycreate.g:400:3: ( rule__DIRECTION__Alternatives )
            {
             before(grammarAccess.getDIRECTIONAccess().getAlternatives()); 
            // InternalPolycreate.g:401:3: ( rule__DIRECTION__Alternatives )
            // InternalPolycreate.g:401:4: rule__DIRECTION__Alternatives
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
    // InternalPolycreate.g:410:1: ruleCAMERATYPE : ( ( rule__CAMERATYPE__Alternatives ) ) ;
    public final void ruleCAMERATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:414:1: ( ( ( rule__CAMERATYPE__Alternatives ) ) )
            // InternalPolycreate.g:415:2: ( ( rule__CAMERATYPE__Alternatives ) )
            {
            // InternalPolycreate.g:415:2: ( ( rule__CAMERATYPE__Alternatives ) )
            // InternalPolycreate.g:416:3: ( rule__CAMERATYPE__Alternatives )
            {
             before(grammarAccess.getCAMERATYPEAccess().getAlternatives()); 
            // InternalPolycreate.g:417:3: ( rule__CAMERATYPE__Alternatives )
            // InternalPolycreate.g:417:4: rule__CAMERATYPE__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPolycreate.g:425:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:429:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPolycreate.g:430:2: ( RULE_STRING )
                    {
                    // InternalPolycreate.g:430:2: ( RULE_STRING )
                    // InternalPolycreate.g:431:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:436:2: ( RULE_ID )
                    {
                    // InternalPolycreate.g:436:2: ( RULE_ID )
                    // InternalPolycreate.g:437:3: RULE_ID
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
    // InternalPolycreate.g:446:1: rule__Condition__Alternatives : ( ( ruleSimpleCondition ) | ( ruleObjectCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:450:1: ( ( ruleSimpleCondition ) | ( ruleObjectCondition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==36) ) {
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
                    // InternalPolycreate.g:451:2: ( ruleSimpleCondition )
                    {
                    // InternalPolycreate.g:451:2: ( ruleSimpleCondition )
                    // InternalPolycreate.g:452:3: ruleSimpleCondition
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
                    // InternalPolycreate.g:457:2: ( ruleObjectCondition )
                    {
                    // InternalPolycreate.g:457:2: ( ruleObjectCondition )
                    // InternalPolycreate.g:458:3: ruleObjectCondition
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
    // InternalPolycreate.g:467:1: rule__Action__Alternatives : ( ( ruleMoveAction ) | ( ruleTurnAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:471:1: ( ( ruleMoveAction ) | ( ruleTurnAction ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==43) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPolycreate.g:472:2: ( ruleMoveAction )
                    {
                    // InternalPolycreate.g:472:2: ( ruleMoveAction )
                    // InternalPolycreate.g:473:3: ruleMoveAction
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
                    // InternalPolycreate.g:478:2: ( ruleTurnAction )
                    {
                    // InternalPolycreate.g:478:2: ( ruleTurnAction )
                    // InternalPolycreate.g:479:3: ruleTurnAction
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


    // $ANTLR start "rule__ObjectCondition__Alternatives"
    // InternalPolycreate.g:488:1: rule__ObjectCondition__Alternatives : ( ( ruleDistanceCondition ) | ( ruleAngleCondition ) );
    public final void rule__ObjectCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:492:1: ( ( ruleDistanceCondition ) | ( ruleAngleCondition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==36) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==21) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==37) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==40) ) {
                                alt4=2;
                            }
                            else if ( (LA4_5==38) ) {
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
                    else if ( (LA4_2==22) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==37) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==40) ) {
                                alt4=2;
                            }
                            else if ( (LA4_5==38) ) {
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
                    // InternalPolycreate.g:493:2: ( ruleDistanceCondition )
                    {
                    // InternalPolycreate.g:493:2: ( ruleDistanceCondition )
                    // InternalPolycreate.g:494:3: ruleDistanceCondition
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
                    // InternalPolycreate.g:499:2: ( ruleAngleCondition )
                    {
                    // InternalPolycreate.g:499:2: ( ruleAngleCondition )
                    // InternalPolycreate.g:500:3: ruleAngleCondition
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
    // InternalPolycreate.g:509:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:513:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalPolycreate.g:514:2: ( 'E' )
                    {
                    // InternalPolycreate.g:514:2: ( 'E' )
                    // InternalPolycreate.g:515:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:520:2: ( 'e' )
                    {
                    // InternalPolycreate.g:520:2: ( 'e' )
                    // InternalPolycreate.g:521:3: 'e'
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
    // InternalPolycreate.g:530:1: rule__DETECTION__Alternatives : ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) );
    public final void rule__DETECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:534:1: ( ( ( 'COLLISION_LEFT' ) ) | ( ( 'COLLISION_RIGHT' ) ) | ( ( 'VIRTUAL_WALL' ) ) | ( ( 'CLIFF_LEFT' ) ) | ( ( 'CLIFF_RIGHT' ) ) | ( ( 'CLIFF_FRONT' ) ) )
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
                    // InternalPolycreate.g:535:2: ( ( 'COLLISION_LEFT' ) )
                    {
                    // InternalPolycreate.g:535:2: ( ( 'COLLISION_LEFT' ) )
                    // InternalPolycreate.g:536:3: ( 'COLLISION_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:537:3: ( 'COLLISION_LEFT' )
                    // InternalPolycreate.g:537:4: 'COLLISION_LEFT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:541:2: ( ( 'COLLISION_RIGHT' ) )
                    {
                    // InternalPolycreate.g:541:2: ( ( 'COLLISION_RIGHT' ) )
                    // InternalPolycreate.g:542:3: ( 'COLLISION_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:543:3: ( 'COLLISION_RIGHT' )
                    // InternalPolycreate.g:543:4: 'COLLISION_RIGHT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:547:2: ( ( 'VIRTUAL_WALL' ) )
                    {
                    // InternalPolycreate.g:547:2: ( ( 'VIRTUAL_WALL' ) )
                    // InternalPolycreate.g:548:3: ( 'VIRTUAL_WALL' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 
                    // InternalPolycreate.g:549:3: ( 'VIRTUAL_WALL' )
                    // InternalPolycreate.g:549:4: 'VIRTUAL_WALL'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:553:2: ( ( 'CLIFF_LEFT' ) )
                    {
                    // InternalPolycreate.g:553:2: ( ( 'CLIFF_LEFT' ) )
                    // InternalPolycreate.g:554:3: ( 'CLIFF_LEFT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 
                    // InternalPolycreate.g:555:3: ( 'CLIFF_LEFT' )
                    // InternalPolycreate.g:555:4: 'CLIFF_LEFT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:559:2: ( ( 'CLIFF_RIGHT' ) )
                    {
                    // InternalPolycreate.g:559:2: ( ( 'CLIFF_RIGHT' ) )
                    // InternalPolycreate.g:560:3: ( 'CLIFF_RIGHT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 
                    // InternalPolycreate.g:561:3: ( 'CLIFF_RIGHT' )
                    // InternalPolycreate.g:561:4: 'CLIFF_RIGHT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:565:2: ( ( 'CLIFF_FRONT' ) )
                    {
                    // InternalPolycreate.g:565:2: ( ( 'CLIFF_FRONT' ) )
                    // InternalPolycreate.g:566:3: ( 'CLIFF_FRONT' )
                    {
                     before(grammarAccess.getDETECTIONAccess().getCLIFF_FRONTEnumLiteralDeclaration_5()); 
                    // InternalPolycreate.g:567:3: ( 'CLIFF_FRONT' )
                    // InternalPolycreate.g:567:4: 'CLIFF_FRONT'
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
    // InternalPolycreate.g:575:1: rule__DIRECTION__Alternatives : ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) );
    public final void rule__DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:579:1: ( ( ( 'FORWARD' ) ) | ( ( 'BACKWARD' ) ) )
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
                    // InternalPolycreate.g:580:2: ( ( 'FORWARD' ) )
                    {
                    // InternalPolycreate.g:580:2: ( ( 'FORWARD' ) )
                    // InternalPolycreate.g:581:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:582:3: ( 'FORWARD' )
                    // InternalPolycreate.g:582:4: 'FORWARD'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:586:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalPolycreate.g:586:2: ( ( 'BACKWARD' ) )
                    // InternalPolycreate.g:587:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getDIRECTIONAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:588:3: ( 'BACKWARD' )
                    // InternalPolycreate.g:588:4: 'BACKWARD'
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


    // $ANTLR start "rule__CAMERATYPE__Alternatives"
    // InternalPolycreate.g:596:1: rule__CAMERATYPE__Alternatives : ( ( ( 'BACK' ) ) | ( ( 'FRONT' ) ) );
    public final void rule__CAMERATYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:600:1: ( ( ( 'BACK' ) ) | ( ( 'FRONT' ) ) )
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
                    // InternalPolycreate.g:601:2: ( ( 'BACK' ) )
                    {
                    // InternalPolycreate.g:601:2: ( ( 'BACK' ) )
                    // InternalPolycreate.g:602:3: ( 'BACK' )
                    {
                     before(grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0()); 
                    // InternalPolycreate.g:603:3: ( 'BACK' )
                    // InternalPolycreate.g:603:4: 'BACK'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:607:2: ( ( 'FRONT' ) )
                    {
                    // InternalPolycreate.g:607:2: ( ( 'FRONT' ) )
                    // InternalPolycreate.g:608:3: ( 'FRONT' )
                    {
                     before(grammarAccess.getCAMERATYPEAccess().getFRONTEnumLiteralDeclaration_1()); 
                    // InternalPolycreate.g:609:3: ( 'FRONT' )
                    // InternalPolycreate.g:609:4: 'FRONT'
                    {
                    match(input,22,FOLLOW_2); 

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


    // $ANTLR start "rule__RobotProgram__Group__0"
    // InternalPolycreate.g:617:1: rule__RobotProgram__Group__0 : rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 ;
    public final void rule__RobotProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:621:1: ( rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1 )
            // InternalPolycreate.g:622:2: rule__RobotProgram__Group__0__Impl rule__RobotProgram__Group__1
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
    // InternalPolycreate.g:629:1: rule__RobotProgram__Group__0__Impl : ( () ) ;
    public final void rule__RobotProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:633:1: ( ( () ) )
            // InternalPolycreate.g:634:1: ( () )
            {
            // InternalPolycreate.g:634:1: ( () )
            // InternalPolycreate.g:635:2: ()
            {
             before(grammarAccess.getRobotProgramAccess().getRobotProgramAction_0()); 
            // InternalPolycreate.g:636:2: ()
            // InternalPolycreate.g:636:3: 
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
    // InternalPolycreate.g:644:1: rule__RobotProgram__Group__1 : rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 ;
    public final void rule__RobotProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:648:1: ( rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2 )
            // InternalPolycreate.g:649:2: rule__RobotProgram__Group__1__Impl rule__RobotProgram__Group__2
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
    // InternalPolycreate.g:656:1: rule__RobotProgram__Group__1__Impl : ( 'RobotProgram' ) ;
    public final void rule__RobotProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:660:1: ( ( 'RobotProgram' ) )
            // InternalPolycreate.g:661:1: ( 'RobotProgram' )
            {
            // InternalPolycreate.g:661:1: ( 'RobotProgram' )
            // InternalPolycreate.g:662:2: 'RobotProgram'
            {
             before(grammarAccess.getRobotProgramAccess().getRobotProgramKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalPolycreate.g:671:1: rule__RobotProgram__Group__2 : rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 ;
    public final void rule__RobotProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:675:1: ( rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3 )
            // InternalPolycreate.g:676:2: rule__RobotProgram__Group__2__Impl rule__RobotProgram__Group__3
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
    // InternalPolycreate.g:683:1: rule__RobotProgram__Group__2__Impl : ( ( rule__RobotProgram__NameAssignment_2 ) ) ;
    public final void rule__RobotProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:687:1: ( ( ( rule__RobotProgram__NameAssignment_2 ) ) )
            // InternalPolycreate.g:688:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:688:1: ( ( rule__RobotProgram__NameAssignment_2 ) )
            // InternalPolycreate.g:689:2: ( rule__RobotProgram__NameAssignment_2 )
            {
             before(grammarAccess.getRobotProgramAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:690:2: ( rule__RobotProgram__NameAssignment_2 )
            // InternalPolycreate.g:690:3: rule__RobotProgram__NameAssignment_2
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
    // InternalPolycreate.g:698:1: rule__RobotProgram__Group__3 : rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 ;
    public final void rule__RobotProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:702:1: ( rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4 )
            // InternalPolycreate.g:703:2: rule__RobotProgram__Group__3__Impl rule__RobotProgram__Group__4
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
    // InternalPolycreate.g:710:1: rule__RobotProgram__Group__3__Impl : ( '->' ) ;
    public final void rule__RobotProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:714:1: ( ( '->' ) )
            // InternalPolycreate.g:715:1: ( '->' )
            {
            // InternalPolycreate.g:715:1: ( '->' )
            // InternalPolycreate.g:716:2: '->'
            {
             before(grammarAccess.getRobotProgramAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPolycreate.g:725:1: rule__RobotProgram__Group__4 : rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 ;
    public final void rule__RobotProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:729:1: ( rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5 )
            // InternalPolycreate.g:730:2: rule__RobotProgram__Group__4__Impl rule__RobotProgram__Group__5
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
    // InternalPolycreate.g:737:1: rule__RobotProgram__Group__4__Impl : ( ( rule__RobotProgram__InitialStateAssignment_4 ) ) ;
    public final void rule__RobotProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:741:1: ( ( ( rule__RobotProgram__InitialStateAssignment_4 ) ) )
            // InternalPolycreate.g:742:1: ( ( rule__RobotProgram__InitialStateAssignment_4 ) )
            {
            // InternalPolycreate.g:742:1: ( ( rule__RobotProgram__InitialStateAssignment_4 ) )
            // InternalPolycreate.g:743:2: ( rule__RobotProgram__InitialStateAssignment_4 )
            {
             before(grammarAccess.getRobotProgramAccess().getInitialStateAssignment_4()); 
            // InternalPolycreate.g:744:2: ( rule__RobotProgram__InitialStateAssignment_4 )
            // InternalPolycreate.g:744:3: rule__RobotProgram__InitialStateAssignment_4
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
    // InternalPolycreate.g:752:1: rule__RobotProgram__Group__5 : rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6 ;
    public final void rule__RobotProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:756:1: ( rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6 )
            // InternalPolycreate.g:757:2: rule__RobotProgram__Group__5__Impl rule__RobotProgram__Group__6
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
    // InternalPolycreate.g:764:1: rule__RobotProgram__Group__5__Impl : ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* ) ;
    public final void rule__RobotProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:768:1: ( ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* ) )
            // InternalPolycreate.g:769:1: ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* )
            {
            // InternalPolycreate.g:769:1: ( ( rule__RobotProgram__OwnedStatesAssignment_5 )* )
            // InternalPolycreate.g:770:2: ( rule__RobotProgram__OwnedStatesAssignment_5 )*
            {
             before(grammarAccess.getRobotProgramAccess().getOwnedStatesAssignment_5()); 
            // InternalPolycreate.g:771:2: ( rule__RobotProgram__OwnedStatesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPolycreate.g:771:3: rule__RobotProgram__OwnedStatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RobotProgram__OwnedStatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalPolycreate.g:779:1: rule__RobotProgram__Group__6 : rule__RobotProgram__Group__6__Impl ;
    public final void rule__RobotProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:783:1: ( rule__RobotProgram__Group__6__Impl )
            // InternalPolycreate.g:784:2: rule__RobotProgram__Group__6__Impl
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
    // InternalPolycreate.g:790:1: rule__RobotProgram__Group__6__Impl : ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* ) ;
    public final void rule__RobotProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:794:1: ( ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* ) )
            // InternalPolycreate.g:795:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* )
            {
            // InternalPolycreate.g:795:1: ( ( rule__RobotProgram__GlobalTransitionsAssignment_6 )* )
            // InternalPolycreate.g:796:2: ( rule__RobotProgram__GlobalTransitionsAssignment_6 )*
            {
             before(grammarAccess.getRobotProgramAccess().getGlobalTransitionsAssignment_6()); 
            // InternalPolycreate.g:797:2: ( rule__RobotProgram__GlobalTransitionsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPolycreate.g:797:3: rule__RobotProgram__GlobalTransitionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RobotProgram__GlobalTransitionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalPolycreate.g:806:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:810:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPolycreate.g:811:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalPolycreate.g:818:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:822:1: ( ( () ) )
            // InternalPolycreate.g:823:1: ( () )
            {
            // InternalPolycreate.g:823:1: ( () )
            // InternalPolycreate.g:824:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalPolycreate.g:825:2: ()
            // InternalPolycreate.g:825:3: 
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
    // InternalPolycreate.g:833:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:837:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPolycreate.g:838:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalPolycreate.g:845:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:849:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalPolycreate.g:850:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalPolycreate.g:850:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalPolycreate.g:851:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalPolycreate.g:852:2: ( rule__Transition__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPolycreate.g:852:3: rule__Transition__Group_1__0
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
    // InternalPolycreate.g:860:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:864:1: ( rule__Transition__Group__2__Impl )
            // InternalPolycreate.g:865:2: rule__Transition__Group__2__Impl
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
    // InternalPolycreate.g:871:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__NextStateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:875:1: ( ( ( rule__Transition__NextStateAssignment_2 ) ) )
            // InternalPolycreate.g:876:1: ( ( rule__Transition__NextStateAssignment_2 ) )
            {
            // InternalPolycreate.g:876:1: ( ( rule__Transition__NextStateAssignment_2 ) )
            // InternalPolycreate.g:877:2: ( rule__Transition__NextStateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getNextStateAssignment_2()); 
            // InternalPolycreate.g:878:2: ( rule__Transition__NextStateAssignment_2 )
            // InternalPolycreate.g:878:3: rule__Transition__NextStateAssignment_2
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
    // InternalPolycreate.g:887:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:891:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalPolycreate.g:892:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
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
    // InternalPolycreate.g:899:1: rule__Transition__Group_1__0__Impl : ( ( rule__Transition__ConditionsAssignment_1_0 ) ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:903:1: ( ( ( rule__Transition__ConditionsAssignment_1_0 ) ) )
            // InternalPolycreate.g:904:1: ( ( rule__Transition__ConditionsAssignment_1_0 ) )
            {
            // InternalPolycreate.g:904:1: ( ( rule__Transition__ConditionsAssignment_1_0 ) )
            // InternalPolycreate.g:905:2: ( rule__Transition__ConditionsAssignment_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_1_0()); 
            // InternalPolycreate.g:906:2: ( rule__Transition__ConditionsAssignment_1_0 )
            // InternalPolycreate.g:906:3: rule__Transition__ConditionsAssignment_1_0
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
    // InternalPolycreate.g:914:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:918:1: ( rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 )
            // InternalPolycreate.g:919:2: rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2
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
    // InternalPolycreate.g:926:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__Group_1_1__0 )* ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:930:1: ( ( ( rule__Transition__Group_1_1__0 )* ) )
            // InternalPolycreate.g:931:1: ( ( rule__Transition__Group_1_1__0 )* )
            {
            // InternalPolycreate.g:931:1: ( ( rule__Transition__Group_1_1__0 )* )
            // InternalPolycreate.g:932:2: ( rule__Transition__Group_1_1__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_1_1()); 
            // InternalPolycreate.g:933:2: ( rule__Transition__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPolycreate.g:933:3: rule__Transition__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Transition__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPolycreate.g:941:1: rule__Transition__Group_1__2 : rule__Transition__Group_1__2__Impl ;
    public final void rule__Transition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:945:1: ( rule__Transition__Group_1__2__Impl )
            // InternalPolycreate.g:946:2: rule__Transition__Group_1__2__Impl
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
    // InternalPolycreate.g:952:1: rule__Transition__Group_1__2__Impl : ( '=>' ) ;
    public final void rule__Transition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:956:1: ( ( '=>' ) )
            // InternalPolycreate.g:957:1: ( '=>' )
            {
            // InternalPolycreate.g:957:1: ( '=>' )
            // InternalPolycreate.g:958:2: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPolycreate.g:968:1: rule__Transition__Group_1_1__0 : rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1 ;
    public final void rule__Transition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:972:1: ( rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1 )
            // InternalPolycreate.g:973:2: rule__Transition__Group_1_1__0__Impl rule__Transition__Group_1_1__1
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
    // InternalPolycreate.g:980:1: rule__Transition__Group_1_1__0__Impl : ( 'and' ) ;
    public final void rule__Transition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:984:1: ( ( 'and' ) )
            // InternalPolycreate.g:985:1: ( 'and' )
            {
            // InternalPolycreate.g:985:1: ( 'and' )
            // InternalPolycreate.g:986:2: 'and'
            {
             before(grammarAccess.getTransitionAccess().getAndKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalPolycreate.g:995:1: rule__Transition__Group_1_1__1 : rule__Transition__Group_1_1__1__Impl ;
    public final void rule__Transition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:999:1: ( rule__Transition__Group_1_1__1__Impl )
            // InternalPolycreate.g:1000:2: rule__Transition__Group_1_1__1__Impl
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
    // InternalPolycreate.g:1006:1: rule__Transition__Group_1_1__1__Impl : ( ( rule__Transition__ConditionsAssignment_1_1_1 ) ) ;
    public final void rule__Transition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1010:1: ( ( ( rule__Transition__ConditionsAssignment_1_1_1 ) ) )
            // InternalPolycreate.g:1011:1: ( ( rule__Transition__ConditionsAssignment_1_1_1 ) )
            {
            // InternalPolycreate.g:1011:1: ( ( rule__Transition__ConditionsAssignment_1_1_1 ) )
            // InternalPolycreate.g:1012:2: ( rule__Transition__ConditionsAssignment_1_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionsAssignment_1_1_1()); 
            // InternalPolycreate.g:1013:2: ( rule__Transition__ConditionsAssignment_1_1_1 )
            // InternalPolycreate.g:1013:3: rule__Transition__ConditionsAssignment_1_1_1
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
    // InternalPolycreate.g:1022:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1026:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalPolycreate.g:1027:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalPolycreate.g:1034:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1038:1: ( ( () ) )
            // InternalPolycreate.g:1039:1: ( () )
            {
            // InternalPolycreate.g:1039:1: ( () )
            // InternalPolycreate.g:1040:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalPolycreate.g:1041:2: ()
            // InternalPolycreate.g:1041:3: 
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
    // InternalPolycreate.g:1049:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1053:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalPolycreate.g:1054:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalPolycreate.g:1061:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1065:1: ( ( 'State' ) )
            // InternalPolycreate.g:1066:1: ( 'State' )
            {
            // InternalPolycreate.g:1066:1: ( 'State' )
            // InternalPolycreate.g:1067:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPolycreate.g:1076:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1080:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalPolycreate.g:1081:2: rule__State__Group__2__Impl rule__State__Group__3
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
    // InternalPolycreate.g:1088:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1092:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalPolycreate.g:1093:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalPolycreate.g:1093:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalPolycreate.g:1094:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalPolycreate.g:1095:2: ( rule__State__NameAssignment_2 )
            // InternalPolycreate.g:1095:3: rule__State__NameAssignment_2
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
    // InternalPolycreate.g:1103:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1107:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalPolycreate.g:1108:2: rule__State__Group__3__Impl rule__State__Group__4
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
    // InternalPolycreate.g:1115:1: rule__State__Group__3__Impl : ( ':' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1119:1: ( ( ':' ) )
            // InternalPolycreate.g:1120:1: ( ':' )
            {
            // InternalPolycreate.g:1120:1: ( ':' )
            // InternalPolycreate.g:1121:2: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPolycreate.g:1130:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1134:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalPolycreate.g:1135:2: rule__State__Group__4__Impl rule__State__Group__5
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
    // InternalPolycreate.g:1142:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1146:1: ( ( ( rule__State__Group_4__0 )? ) )
            // InternalPolycreate.g:1147:1: ( ( rule__State__Group_4__0 )? )
            {
            // InternalPolycreate.g:1147:1: ( ( rule__State__Group_4__0 )? )
            // InternalPolycreate.g:1148:2: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalPolycreate.g:1149:2: ( rule__State__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPolycreate.g:1149:3: rule__State__Group_4__0
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
    // InternalPolycreate.g:1157:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1161:1: ( rule__State__Group__5__Impl )
            // InternalPolycreate.g:1162:2: rule__State__Group__5__Impl
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
    // InternalPolycreate.g:1168:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1172:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalPolycreate.g:1173:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalPolycreate.g:1173:1: ( ( rule__State__Group_5__0 )? )
            // InternalPolycreate.g:1174:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalPolycreate.g:1175:2: ( rule__State__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPolycreate.g:1175:3: rule__State__Group_5__0
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
    // InternalPolycreate.g:1184:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1188:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalPolycreate.g:1189:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
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
    // InternalPolycreate.g:1196:1: rule__State__Group_4__0__Impl : ( 'actions' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1200:1: ( ( 'actions' ) )
            // InternalPolycreate.g:1201:1: ( 'actions' )
            {
            // InternalPolycreate.g:1201:1: ( 'actions' )
            // InternalPolycreate.g:1202:2: 'actions'
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
    // InternalPolycreate.g:1211:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1215:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // InternalPolycreate.g:1216:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
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
    // InternalPolycreate.g:1223:1: rule__State__Group_4__1__Impl : ( '=' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1227:1: ( ( '=' ) )
            // InternalPolycreate.g:1228:1: ( '=' )
            {
            // InternalPolycreate.g:1228:1: ( '=' )
            // InternalPolycreate.g:1229:2: '='
            {
             before(grammarAccess.getStateAccess().getEqualsSignKeyword_4_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPolycreate.g:1238:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl rule__State__Group_4__3 ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1242:1: ( rule__State__Group_4__2__Impl rule__State__Group_4__3 )
            // InternalPolycreate.g:1243:2: rule__State__Group_4__2__Impl rule__State__Group_4__3
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
    // InternalPolycreate.g:1250:1: rule__State__Group_4__2__Impl : ( '[' ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1254:1: ( ( '[' ) )
            // InternalPolycreate.g:1255:1: ( '[' )
            {
            // InternalPolycreate.g:1255:1: ( '[' )
            // InternalPolycreate.g:1256:2: '['
            {
             before(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_4_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPolycreate.g:1265:1: rule__State__Group_4__3 : rule__State__Group_4__3__Impl rule__State__Group_4__4 ;
    public final void rule__State__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1269:1: ( rule__State__Group_4__3__Impl rule__State__Group_4__4 )
            // InternalPolycreate.g:1270:2: rule__State__Group_4__3__Impl rule__State__Group_4__4
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
    // InternalPolycreate.g:1277:1: rule__State__Group_4__3__Impl : ( ( rule__State__ActionsAssignment_4_3 ) ) ;
    public final void rule__State__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1281:1: ( ( ( rule__State__ActionsAssignment_4_3 ) ) )
            // InternalPolycreate.g:1282:1: ( ( rule__State__ActionsAssignment_4_3 ) )
            {
            // InternalPolycreate.g:1282:1: ( ( rule__State__ActionsAssignment_4_3 ) )
            // InternalPolycreate.g:1283:2: ( rule__State__ActionsAssignment_4_3 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_3()); 
            // InternalPolycreate.g:1284:2: ( rule__State__ActionsAssignment_4_3 )
            // InternalPolycreate.g:1284:3: rule__State__ActionsAssignment_4_3
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
    // InternalPolycreate.g:1292:1: rule__State__Group_4__4 : rule__State__Group_4__4__Impl rule__State__Group_4__5 ;
    public final void rule__State__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1296:1: ( rule__State__Group_4__4__Impl rule__State__Group_4__5 )
            // InternalPolycreate.g:1297:2: rule__State__Group_4__4__Impl rule__State__Group_4__5
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
    // InternalPolycreate.g:1304:1: rule__State__Group_4__4__Impl : ( ( rule__State__Group_4_4__0 )* ) ;
    public final void rule__State__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1308:1: ( ( ( rule__State__Group_4_4__0 )* ) )
            // InternalPolycreate.g:1309:1: ( ( rule__State__Group_4_4__0 )* )
            {
            // InternalPolycreate.g:1309:1: ( ( rule__State__Group_4_4__0 )* )
            // InternalPolycreate.g:1310:2: ( rule__State__Group_4_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4_4()); 
            // InternalPolycreate.g:1311:2: ( rule__State__Group_4_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPolycreate.g:1311:3: rule__State__Group_4_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__Group_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPolycreate.g:1319:1: rule__State__Group_4__5 : rule__State__Group_4__5__Impl ;
    public final void rule__State__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1323:1: ( rule__State__Group_4__5__Impl )
            // InternalPolycreate.g:1324:2: rule__State__Group_4__5__Impl
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
    // InternalPolycreate.g:1330:1: rule__State__Group_4__5__Impl : ( ']' ) ;
    public final void rule__State__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1334:1: ( ( ']' ) )
            // InternalPolycreate.g:1335:1: ( ']' )
            {
            // InternalPolycreate.g:1335:1: ( ']' )
            // InternalPolycreate.g:1336:2: ']'
            {
             before(grammarAccess.getStateAccess().getRightSquareBracketKeyword_4_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPolycreate.g:1346:1: rule__State__Group_4_4__0 : rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1 ;
    public final void rule__State__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1350:1: ( rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1 )
            // InternalPolycreate.g:1351:2: rule__State__Group_4_4__0__Impl rule__State__Group_4_4__1
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
    // InternalPolycreate.g:1358:1: rule__State__Group_4_4__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1362:1: ( ( ',' ) )
            // InternalPolycreate.g:1363:1: ( ',' )
            {
            // InternalPolycreate.g:1363:1: ( ',' )
            // InternalPolycreate.g:1364:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_4_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPolycreate.g:1373:1: rule__State__Group_4_4__1 : rule__State__Group_4_4__1__Impl ;
    public final void rule__State__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1377:1: ( rule__State__Group_4_4__1__Impl )
            // InternalPolycreate.g:1378:2: rule__State__Group_4_4__1__Impl
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
    // InternalPolycreate.g:1384:1: rule__State__Group_4_4__1__Impl : ( ( rule__State__ActionsAssignment_4_4_1 ) ) ;
    public final void rule__State__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1388:1: ( ( ( rule__State__ActionsAssignment_4_4_1 ) ) )
            // InternalPolycreate.g:1389:1: ( ( rule__State__ActionsAssignment_4_4_1 ) )
            {
            // InternalPolycreate.g:1389:1: ( ( rule__State__ActionsAssignment_4_4_1 ) )
            // InternalPolycreate.g:1390:2: ( rule__State__ActionsAssignment_4_4_1 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_4_4_1()); 
            // InternalPolycreate.g:1391:2: ( rule__State__ActionsAssignment_4_4_1 )
            // InternalPolycreate.g:1391:3: rule__State__ActionsAssignment_4_4_1
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
    // InternalPolycreate.g:1400:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1404:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalPolycreate.g:1405:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
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
    // InternalPolycreate.g:1412:1: rule__State__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1416:1: ( ( 'transitions' ) )
            // InternalPolycreate.g:1417:1: ( 'transitions' )
            {
            // InternalPolycreate.g:1417:1: ( 'transitions' )
            // InternalPolycreate.g:1418:2: 'transitions'
            {
             before(grammarAccess.getStateAccess().getTransitionsKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPolycreate.g:1427:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1431:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalPolycreate.g:1432:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
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
    // InternalPolycreate.g:1439:1: rule__State__Group_5__1__Impl : ( '=' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1443:1: ( ( '=' ) )
            // InternalPolycreate.g:1444:1: ( '=' )
            {
            // InternalPolycreate.g:1444:1: ( '=' )
            // InternalPolycreate.g:1445:2: '='
            {
             before(grammarAccess.getStateAccess().getEqualsSignKeyword_5_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPolycreate.g:1454:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1458:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalPolycreate.g:1459:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
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
    // InternalPolycreate.g:1466:1: rule__State__Group_5__2__Impl : ( '[' ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1470:1: ( ( '[' ) )
            // InternalPolycreate.g:1471:1: ( '[' )
            {
            // InternalPolycreate.g:1471:1: ( '[' )
            // InternalPolycreate.g:1472:2: '['
            {
             before(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_5_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPolycreate.g:1481:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1485:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalPolycreate.g:1486:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
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
    // InternalPolycreate.g:1493:1: rule__State__Group_5__3__Impl : ( ( rule__State__TransitionsAssignment_5_3 ) ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1497:1: ( ( ( rule__State__TransitionsAssignment_5_3 ) ) )
            // InternalPolycreate.g:1498:1: ( ( rule__State__TransitionsAssignment_5_3 ) )
            {
            // InternalPolycreate.g:1498:1: ( ( rule__State__TransitionsAssignment_5_3 ) )
            // InternalPolycreate.g:1499:2: ( rule__State__TransitionsAssignment_5_3 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_3()); 
            // InternalPolycreate.g:1500:2: ( rule__State__TransitionsAssignment_5_3 )
            // InternalPolycreate.g:1500:3: rule__State__TransitionsAssignment_5_3
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
    // InternalPolycreate.g:1508:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl rule__State__Group_5__5 ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1512:1: ( rule__State__Group_5__4__Impl rule__State__Group_5__5 )
            // InternalPolycreate.g:1513:2: rule__State__Group_5__4__Impl rule__State__Group_5__5
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
    // InternalPolycreate.g:1520:1: rule__State__Group_5__4__Impl : ( ( rule__State__Group_5_4__0 )* ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1524:1: ( ( ( rule__State__Group_5_4__0 )* ) )
            // InternalPolycreate.g:1525:1: ( ( rule__State__Group_5_4__0 )* )
            {
            // InternalPolycreate.g:1525:1: ( ( rule__State__Group_5_4__0 )* )
            // InternalPolycreate.g:1526:2: ( rule__State__Group_5_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_4()); 
            // InternalPolycreate.g:1527:2: ( rule__State__Group_5_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPolycreate.g:1527:3: rule__State__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalPolycreate.g:1535:1: rule__State__Group_5__5 : rule__State__Group_5__5__Impl ;
    public final void rule__State__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1539:1: ( rule__State__Group_5__5__Impl )
            // InternalPolycreate.g:1540:2: rule__State__Group_5__5__Impl
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
    // InternalPolycreate.g:1546:1: rule__State__Group_5__5__Impl : ( ']' ) ;
    public final void rule__State__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1550:1: ( ( ']' ) )
            // InternalPolycreate.g:1551:1: ( ']' )
            {
            // InternalPolycreate.g:1551:1: ( ']' )
            // InternalPolycreate.g:1552:2: ']'
            {
             before(grammarAccess.getStateAccess().getRightSquareBracketKeyword_5_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPolycreate.g:1562:1: rule__State__Group_5_4__0 : rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1 ;
    public final void rule__State__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1566:1: ( rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1 )
            // InternalPolycreate.g:1567:2: rule__State__Group_5_4__0__Impl rule__State__Group_5_4__1
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
    // InternalPolycreate.g:1574:1: rule__State__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1578:1: ( ( ',' ) )
            // InternalPolycreate.g:1579:1: ( ',' )
            {
            // InternalPolycreate.g:1579:1: ( ',' )
            // InternalPolycreate.g:1580:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPolycreate.g:1589:1: rule__State__Group_5_4__1 : rule__State__Group_5_4__1__Impl ;
    public final void rule__State__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1593:1: ( rule__State__Group_5_4__1__Impl )
            // InternalPolycreate.g:1594:2: rule__State__Group_5_4__1__Impl
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
    // InternalPolycreate.g:1600:1: rule__State__Group_5_4__1__Impl : ( ( rule__State__TransitionsAssignment_5_4_1 ) ) ;
    public final void rule__State__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1604:1: ( ( ( rule__State__TransitionsAssignment_5_4_1 ) ) )
            // InternalPolycreate.g:1605:1: ( ( rule__State__TransitionsAssignment_5_4_1 ) )
            {
            // InternalPolycreate.g:1605:1: ( ( rule__State__TransitionsAssignment_5_4_1 ) )
            // InternalPolycreate.g:1606:2: ( rule__State__TransitionsAssignment_5_4_1 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5_4_1()); 
            // InternalPolycreate.g:1607:2: ( rule__State__TransitionsAssignment_5_4_1 )
            // InternalPolycreate.g:1607:3: rule__State__TransitionsAssignment_5_4_1
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
    // InternalPolycreate.g:1616:1: rule__SimpleCondition__Group__0 : rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 ;
    public final void rule__SimpleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1620:1: ( rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 )
            // InternalPolycreate.g:1621:2: rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1
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
    // InternalPolycreate.g:1628:1: rule__SimpleCondition__Group__0__Impl : ( () ) ;
    public final void rule__SimpleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1632:1: ( ( () ) )
            // InternalPolycreate.g:1633:1: ( () )
            {
            // InternalPolycreate.g:1633:1: ( () )
            // InternalPolycreate.g:1634:2: ()
            {
             before(grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0()); 
            // InternalPolycreate.g:1635:2: ()
            // InternalPolycreate.g:1635:3: 
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
    // InternalPolycreate.g:1643:1: rule__SimpleCondition__Group__1 : rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 ;
    public final void rule__SimpleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1647:1: ( rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2 )
            // InternalPolycreate.g:1648:2: rule__SimpleCondition__Group__1__Impl rule__SimpleCondition__Group__2
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
    // InternalPolycreate.g:1655:1: rule__SimpleCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__SimpleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1659:1: ( ( 'detect' ) )
            // InternalPolycreate.g:1660:1: ( 'detect' )
            {
            // InternalPolycreate.g:1660:1: ( 'detect' )
            // InternalPolycreate.g:1661:2: 'detect'
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPolycreate.g:1670:1: rule__SimpleCondition__Group__2 : rule__SimpleCondition__Group__2__Impl ;
    public final void rule__SimpleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1674:1: ( rule__SimpleCondition__Group__2__Impl )
            // InternalPolycreate.g:1675:2: rule__SimpleCondition__Group__2__Impl
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
    // InternalPolycreate.g:1681:1: rule__SimpleCondition__Group__2__Impl : ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) ) ;
    public final void rule__SimpleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1685:1: ( ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) ) )
            // InternalPolycreate.g:1686:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) )
            {
            // InternalPolycreate.g:1686:1: ( ( rule__SimpleCondition__DetectionTypeAssignment_2 ) )
            // InternalPolycreate.g:1687:2: ( rule__SimpleCondition__DetectionTypeAssignment_2 )
            {
             before(grammarAccess.getSimpleConditionAccess().getDetectionTypeAssignment_2()); 
            // InternalPolycreate.g:1688:2: ( rule__SimpleCondition__DetectionTypeAssignment_2 )
            // InternalPolycreate.g:1688:3: rule__SimpleCondition__DetectionTypeAssignment_2
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
    // InternalPolycreate.g:1697:1: rule__DistanceCondition__Group__0 : rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 ;
    public final void rule__DistanceCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1701:1: ( rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 )
            // InternalPolycreate.g:1702:2: rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1
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
    // InternalPolycreate.g:1709:1: rule__DistanceCondition__Group__0__Impl : ( () ) ;
    public final void rule__DistanceCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1713:1: ( ( () ) )
            // InternalPolycreate.g:1714:1: ( () )
            {
            // InternalPolycreate.g:1714:1: ( () )
            // InternalPolycreate.g:1715:2: ()
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceConditionAction_0()); 
            // InternalPolycreate.g:1716:2: ()
            // InternalPolycreate.g:1716:3: 
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
    // InternalPolycreate.g:1724:1: rule__DistanceCondition__Group__1 : rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 ;
    public final void rule__DistanceCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1728:1: ( rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 )
            // InternalPolycreate.g:1729:2: rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2
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
    // InternalPolycreate.g:1736:1: rule__DistanceCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__DistanceCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1740:1: ( ( 'detect' ) )
            // InternalPolycreate.g:1741:1: ( 'detect' )
            {
            // InternalPolycreate.g:1741:1: ( 'detect' )
            // InternalPolycreate.g:1742:2: 'detect'
            {
             before(grammarAccess.getDistanceConditionAccess().getDetectKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPolycreate.g:1751:1: rule__DistanceCondition__Group__2 : rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3 ;
    public final void rule__DistanceCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1755:1: ( rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3 )
            // InternalPolycreate.g:1756:2: rule__DistanceCondition__Group__2__Impl rule__DistanceCondition__Group__3
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
    // InternalPolycreate.g:1763:1: rule__DistanceCondition__Group__2__Impl : ( 'object' ) ;
    public final void rule__DistanceCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1767:1: ( ( 'object' ) )
            // InternalPolycreate.g:1768:1: ( 'object' )
            {
            // InternalPolycreate.g:1768:1: ( 'object' )
            // InternalPolycreate.g:1769:2: 'object'
            {
             before(grammarAccess.getDistanceConditionAccess().getObjectKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPolycreate.g:1778:1: rule__DistanceCondition__Group__3 : rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4 ;
    public final void rule__DistanceCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1782:1: ( rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4 )
            // InternalPolycreate.g:1783:2: rule__DistanceCondition__Group__3__Impl rule__DistanceCondition__Group__4
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
    // InternalPolycreate.g:1790:1: rule__DistanceCondition__Group__3__Impl : ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) ) ;
    public final void rule__DistanceCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1794:1: ( ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) ) )
            // InternalPolycreate.g:1795:1: ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) )
            {
            // InternalPolycreate.g:1795:1: ( ( rule__DistanceCondition__CameraTypeAssignment_3 ) )
            // InternalPolycreate.g:1796:2: ( rule__DistanceCondition__CameraTypeAssignment_3 )
            {
             before(grammarAccess.getDistanceConditionAccess().getCameraTypeAssignment_3()); 
            // InternalPolycreate.g:1797:2: ( rule__DistanceCondition__CameraTypeAssignment_3 )
            // InternalPolycreate.g:1797:3: rule__DistanceCondition__CameraTypeAssignment_3
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
    // InternalPolycreate.g:1805:1: rule__DistanceCondition__Group__4 : rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5 ;
    public final void rule__DistanceCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1809:1: ( rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5 )
            // InternalPolycreate.g:1810:2: rule__DistanceCondition__Group__4__Impl rule__DistanceCondition__Group__5
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
    // InternalPolycreate.g:1817:1: rule__DistanceCondition__Group__4__Impl : ( 'with' ) ;
    public final void rule__DistanceCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1821:1: ( ( 'with' ) )
            // InternalPolycreate.g:1822:1: ( 'with' )
            {
            // InternalPolycreate.g:1822:1: ( 'with' )
            // InternalPolycreate.g:1823:2: 'with'
            {
             before(grammarAccess.getDistanceConditionAccess().getWithKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPolycreate.g:1832:1: rule__DistanceCondition__Group__5 : rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6 ;
    public final void rule__DistanceCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1836:1: ( rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6 )
            // InternalPolycreate.g:1837:2: rule__DistanceCondition__Group__5__Impl rule__DistanceCondition__Group__6
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
    // InternalPolycreate.g:1844:1: rule__DistanceCondition__Group__5__Impl : ( 'distance' ) ;
    public final void rule__DistanceCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1848:1: ( ( 'distance' ) )
            // InternalPolycreate.g:1849:1: ( 'distance' )
            {
            // InternalPolycreate.g:1849:1: ( 'distance' )
            // InternalPolycreate.g:1850:2: 'distance'
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPolycreate.g:1859:1: rule__DistanceCondition__Group__6 : rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7 ;
    public final void rule__DistanceCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1863:1: ( rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7 )
            // InternalPolycreate.g:1864:2: rule__DistanceCondition__Group__6__Impl rule__DistanceCondition__Group__7
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
    // InternalPolycreate.g:1871:1: rule__DistanceCondition__Group__6__Impl : ( '<' ) ;
    public final void rule__DistanceCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1875:1: ( ( '<' ) )
            // InternalPolycreate.g:1876:1: ( '<' )
            {
            // InternalPolycreate.g:1876:1: ( '<' )
            // InternalPolycreate.g:1877:2: '<'
            {
             before(grammarAccess.getDistanceConditionAccess().getLessThanSignKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDistanceConditionAccess().getLessThanSignKeyword_6()); 

            }


            }

        }
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
    // InternalPolycreate.g:1886:1: rule__DistanceCondition__Group__7 : rule__DistanceCondition__Group__7__Impl ;
    public final void rule__DistanceCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1890:1: ( rule__DistanceCondition__Group__7__Impl )
            // InternalPolycreate.g:1891:2: rule__DistanceCondition__Group__7__Impl
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
    // InternalPolycreate.g:1897:1: rule__DistanceCondition__Group__7__Impl : ( ( rule__DistanceCondition__DistanceAssignment_7 ) ) ;
    public final void rule__DistanceCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1901:1: ( ( ( rule__DistanceCondition__DistanceAssignment_7 ) ) )
            // InternalPolycreate.g:1902:1: ( ( rule__DistanceCondition__DistanceAssignment_7 ) )
            {
            // InternalPolycreate.g:1902:1: ( ( rule__DistanceCondition__DistanceAssignment_7 ) )
            // InternalPolycreate.g:1903:2: ( rule__DistanceCondition__DistanceAssignment_7 )
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceAssignment_7()); 
            // InternalPolycreate.g:1904:2: ( rule__DistanceCondition__DistanceAssignment_7 )
            // InternalPolycreate.g:1904:3: rule__DistanceCondition__DistanceAssignment_7
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
    // InternalPolycreate.g:1913:1: rule__AngleCondition__Group__0 : rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1 ;
    public final void rule__AngleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1917:1: ( rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1 )
            // InternalPolycreate.g:1918:2: rule__AngleCondition__Group__0__Impl rule__AngleCondition__Group__1
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
    // InternalPolycreate.g:1925:1: rule__AngleCondition__Group__0__Impl : ( () ) ;
    public final void rule__AngleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1929:1: ( ( () ) )
            // InternalPolycreate.g:1930:1: ( () )
            {
            // InternalPolycreate.g:1930:1: ( () )
            // InternalPolycreate.g:1931:2: ()
            {
             before(grammarAccess.getAngleConditionAccess().getAngleConditionAction_0()); 
            // InternalPolycreate.g:1932:2: ()
            // InternalPolycreate.g:1932:3: 
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
    // InternalPolycreate.g:1940:1: rule__AngleCondition__Group__1 : rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2 ;
    public final void rule__AngleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1944:1: ( rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2 )
            // InternalPolycreate.g:1945:2: rule__AngleCondition__Group__1__Impl rule__AngleCondition__Group__2
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
    // InternalPolycreate.g:1952:1: rule__AngleCondition__Group__1__Impl : ( 'detect' ) ;
    public final void rule__AngleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1956:1: ( ( 'detect' ) )
            // InternalPolycreate.g:1957:1: ( 'detect' )
            {
            // InternalPolycreate.g:1957:1: ( 'detect' )
            // InternalPolycreate.g:1958:2: 'detect'
            {
             before(grammarAccess.getAngleConditionAccess().getDetectKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPolycreate.g:1967:1: rule__AngleCondition__Group__2 : rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3 ;
    public final void rule__AngleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1971:1: ( rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3 )
            // InternalPolycreate.g:1972:2: rule__AngleCondition__Group__2__Impl rule__AngleCondition__Group__3
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
    // InternalPolycreate.g:1979:1: rule__AngleCondition__Group__2__Impl : ( 'object' ) ;
    public final void rule__AngleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1983:1: ( ( 'object' ) )
            // InternalPolycreate.g:1984:1: ( 'object' )
            {
            // InternalPolycreate.g:1984:1: ( 'object' )
            // InternalPolycreate.g:1985:2: 'object'
            {
             before(grammarAccess.getAngleConditionAccess().getObjectKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPolycreate.g:1994:1: rule__AngleCondition__Group__3 : rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4 ;
    public final void rule__AngleCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:1998:1: ( rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4 )
            // InternalPolycreate.g:1999:2: rule__AngleCondition__Group__3__Impl rule__AngleCondition__Group__4
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
    // InternalPolycreate.g:2006:1: rule__AngleCondition__Group__3__Impl : ( ( rule__AngleCondition__CameraTypeAssignment_3 ) ) ;
    public final void rule__AngleCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2010:1: ( ( ( rule__AngleCondition__CameraTypeAssignment_3 ) ) )
            // InternalPolycreate.g:2011:1: ( ( rule__AngleCondition__CameraTypeAssignment_3 ) )
            {
            // InternalPolycreate.g:2011:1: ( ( rule__AngleCondition__CameraTypeAssignment_3 ) )
            // InternalPolycreate.g:2012:2: ( rule__AngleCondition__CameraTypeAssignment_3 )
            {
             before(grammarAccess.getAngleConditionAccess().getCameraTypeAssignment_3()); 
            // InternalPolycreate.g:2013:2: ( rule__AngleCondition__CameraTypeAssignment_3 )
            // InternalPolycreate.g:2013:3: rule__AngleCondition__CameraTypeAssignment_3
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
    // InternalPolycreate.g:2021:1: rule__AngleCondition__Group__4 : rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5 ;
    public final void rule__AngleCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2025:1: ( rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5 )
            // InternalPolycreate.g:2026:2: rule__AngleCondition__Group__4__Impl rule__AngleCondition__Group__5
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
    // InternalPolycreate.g:2033:1: rule__AngleCondition__Group__4__Impl : ( 'with' ) ;
    public final void rule__AngleCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2037:1: ( ( 'with' ) )
            // InternalPolycreate.g:2038:1: ( 'with' )
            {
            // InternalPolycreate.g:2038:1: ( 'with' )
            // InternalPolycreate.g:2039:2: 'with'
            {
             before(grammarAccess.getAngleConditionAccess().getWithKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPolycreate.g:2048:1: rule__AngleCondition__Group__5 : rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6 ;
    public final void rule__AngleCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2052:1: ( rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6 )
            // InternalPolycreate.g:2053:2: rule__AngleCondition__Group__5__Impl rule__AngleCondition__Group__6
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
    // InternalPolycreate.g:2060:1: rule__AngleCondition__Group__5__Impl : ( 'angle' ) ;
    public final void rule__AngleCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2064:1: ( ( 'angle' ) )
            // InternalPolycreate.g:2065:1: ( 'angle' )
            {
            // InternalPolycreate.g:2065:1: ( 'angle' )
            // InternalPolycreate.g:2066:2: 'angle'
            {
             before(grammarAccess.getAngleConditionAccess().getAngleKeyword_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalPolycreate.g:2075:1: rule__AngleCondition__Group__6 : rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7 ;
    public final void rule__AngleCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2079:1: ( rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7 )
            // InternalPolycreate.g:2080:2: rule__AngleCondition__Group__6__Impl rule__AngleCondition__Group__7
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
    // InternalPolycreate.g:2087:1: rule__AngleCondition__Group__6__Impl : ( '<' ) ;
    public final void rule__AngleCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2091:1: ( ( '<' ) )
            // InternalPolycreate.g:2092:1: ( '<' )
            {
            // InternalPolycreate.g:2092:1: ( '<' )
            // InternalPolycreate.g:2093:2: '<'
            {
             before(grammarAccess.getAngleConditionAccess().getLessThanSignKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAngleConditionAccess().getLessThanSignKeyword_6()); 

            }


            }

        }
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
    // InternalPolycreate.g:2102:1: rule__AngleCondition__Group__7 : rule__AngleCondition__Group__7__Impl ;
    public final void rule__AngleCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2106:1: ( rule__AngleCondition__Group__7__Impl )
            // InternalPolycreate.g:2107:2: rule__AngleCondition__Group__7__Impl
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
    // InternalPolycreate.g:2113:1: rule__AngleCondition__Group__7__Impl : ( ( rule__AngleCondition__AngleAssignment_7 ) ) ;
    public final void rule__AngleCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2117:1: ( ( ( rule__AngleCondition__AngleAssignment_7 ) ) )
            // InternalPolycreate.g:2118:1: ( ( rule__AngleCondition__AngleAssignment_7 ) )
            {
            // InternalPolycreate.g:2118:1: ( ( rule__AngleCondition__AngleAssignment_7 ) )
            // InternalPolycreate.g:2119:2: ( rule__AngleCondition__AngleAssignment_7 )
            {
             before(grammarAccess.getAngleConditionAccess().getAngleAssignment_7()); 
            // InternalPolycreate.g:2120:2: ( rule__AngleCondition__AngleAssignment_7 )
            // InternalPolycreate.g:2120:3: rule__AngleCondition__AngleAssignment_7
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
    // InternalPolycreate.g:2129:1: rule__MoveAction__Group__0 : rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 ;
    public final void rule__MoveAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2133:1: ( rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1 )
            // InternalPolycreate.g:2134:2: rule__MoveAction__Group__0__Impl rule__MoveAction__Group__1
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
    // InternalPolycreate.g:2141:1: rule__MoveAction__Group__0__Impl : ( () ) ;
    public final void rule__MoveAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2145:1: ( ( () ) )
            // InternalPolycreate.g:2146:1: ( () )
            {
            // InternalPolycreate.g:2146:1: ( () )
            // InternalPolycreate.g:2147:2: ()
            {
             before(grammarAccess.getMoveActionAccess().getMoveActionAction_0()); 
            // InternalPolycreate.g:2148:2: ()
            // InternalPolycreate.g:2148:3: 
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
    // InternalPolycreate.g:2156:1: rule__MoveAction__Group__1 : rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 ;
    public final void rule__MoveAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2160:1: ( rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2 )
            // InternalPolycreate.g:2161:2: rule__MoveAction__Group__1__Impl rule__MoveAction__Group__2
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
    // InternalPolycreate.g:2168:1: rule__MoveAction__Group__1__Impl : ( 'move' ) ;
    public final void rule__MoveAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2172:1: ( ( 'move' ) )
            // InternalPolycreate.g:2173:1: ( 'move' )
            {
            // InternalPolycreate.g:2173:1: ( 'move' )
            // InternalPolycreate.g:2174:2: 'move'
            {
             before(grammarAccess.getMoveActionAccess().getMoveKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPolycreate.g:2183:1: rule__MoveAction__Group__2 : rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 ;
    public final void rule__MoveAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2187:1: ( rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3 )
            // InternalPolycreate.g:2188:2: rule__MoveAction__Group__2__Impl rule__MoveAction__Group__3
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
    // InternalPolycreate.g:2195:1: rule__MoveAction__Group__2__Impl : ( ( rule__MoveAction__DirectionAssignment_2 ) ) ;
    public final void rule__MoveAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2199:1: ( ( ( rule__MoveAction__DirectionAssignment_2 ) ) )
            // InternalPolycreate.g:2200:1: ( ( rule__MoveAction__DirectionAssignment_2 ) )
            {
            // InternalPolycreate.g:2200:1: ( ( rule__MoveAction__DirectionAssignment_2 ) )
            // InternalPolycreate.g:2201:2: ( rule__MoveAction__DirectionAssignment_2 )
            {
             before(grammarAccess.getMoveActionAccess().getDirectionAssignment_2()); 
            // InternalPolycreate.g:2202:2: ( rule__MoveAction__DirectionAssignment_2 )
            // InternalPolycreate.g:2202:3: rule__MoveAction__DirectionAssignment_2
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
    // InternalPolycreate.g:2210:1: rule__MoveAction__Group__3 : rule__MoveAction__Group__3__Impl ;
    public final void rule__MoveAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2214:1: ( rule__MoveAction__Group__3__Impl )
            // InternalPolycreate.g:2215:2: rule__MoveAction__Group__3__Impl
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
    // InternalPolycreate.g:2221:1: rule__MoveAction__Group__3__Impl : ( ( rule__MoveAction__Group_3__0 )? ) ;
    public final void rule__MoveAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2225:1: ( ( ( rule__MoveAction__Group_3__0 )? ) )
            // InternalPolycreate.g:2226:1: ( ( rule__MoveAction__Group_3__0 )? )
            {
            // InternalPolycreate.g:2226:1: ( ( rule__MoveAction__Group_3__0 )? )
            // InternalPolycreate.g:2227:2: ( rule__MoveAction__Group_3__0 )?
            {
             before(grammarAccess.getMoveActionAccess().getGroup_3()); 
            // InternalPolycreate.g:2228:2: ( rule__MoveAction__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPolycreate.g:2228:3: rule__MoveAction__Group_3__0
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
    // InternalPolycreate.g:2237:1: rule__MoveAction__Group_3__0 : rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1 ;
    public final void rule__MoveAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2241:1: ( rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1 )
            // InternalPolycreate.g:2242:2: rule__MoveAction__Group_3__0__Impl rule__MoveAction__Group_3__1
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
    // InternalPolycreate.g:2249:1: rule__MoveAction__Group_3__0__Impl : ( 'during' ) ;
    public final void rule__MoveAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2253:1: ( ( 'during' ) )
            // InternalPolycreate.g:2254:1: ( 'during' )
            {
            // InternalPolycreate.g:2254:1: ( 'during' )
            // InternalPolycreate.g:2255:2: 'during'
            {
             before(grammarAccess.getMoveActionAccess().getDuringKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPolycreate.g:2264:1: rule__MoveAction__Group_3__1 : rule__MoveAction__Group_3__1__Impl ;
    public final void rule__MoveAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2268:1: ( rule__MoveAction__Group_3__1__Impl )
            // InternalPolycreate.g:2269:2: rule__MoveAction__Group_3__1__Impl
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
    // InternalPolycreate.g:2275:1: rule__MoveAction__Group_3__1__Impl : ( ( rule__MoveAction__DurationAssignment_3_1 ) ) ;
    public final void rule__MoveAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2279:1: ( ( ( rule__MoveAction__DurationAssignment_3_1 ) ) )
            // InternalPolycreate.g:2280:1: ( ( rule__MoveAction__DurationAssignment_3_1 ) )
            {
            // InternalPolycreate.g:2280:1: ( ( rule__MoveAction__DurationAssignment_3_1 ) )
            // InternalPolycreate.g:2281:2: ( rule__MoveAction__DurationAssignment_3_1 )
            {
             before(grammarAccess.getMoveActionAccess().getDurationAssignment_3_1()); 
            // InternalPolycreate.g:2282:2: ( rule__MoveAction__DurationAssignment_3_1 )
            // InternalPolycreate.g:2282:3: rule__MoveAction__DurationAssignment_3_1
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
    // InternalPolycreate.g:2291:1: rule__TurnAction__Group__0 : rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 ;
    public final void rule__TurnAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2295:1: ( rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1 )
            // InternalPolycreate.g:2296:2: rule__TurnAction__Group__0__Impl rule__TurnAction__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalPolycreate.g:2303:1: rule__TurnAction__Group__0__Impl : ( () ) ;
    public final void rule__TurnAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2307:1: ( ( () ) )
            // InternalPolycreate.g:2308:1: ( () )
            {
            // InternalPolycreate.g:2308:1: ( () )
            // InternalPolycreate.g:2309:2: ()
            {
             before(grammarAccess.getTurnActionAccess().getTurnActionAction_0()); 
            // InternalPolycreate.g:2310:2: ()
            // InternalPolycreate.g:2310:3: 
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
    // InternalPolycreate.g:2318:1: rule__TurnAction__Group__1 : rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 ;
    public final void rule__TurnAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2322:1: ( rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2 )
            // InternalPolycreate.g:2323:2: rule__TurnAction__Group__1__Impl rule__TurnAction__Group__2
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
    // InternalPolycreate.g:2330:1: rule__TurnAction__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2334:1: ( ( 'turn' ) )
            // InternalPolycreate.g:2335:1: ( 'turn' )
            {
            // InternalPolycreate.g:2335:1: ( 'turn' )
            // InternalPolycreate.g:2336:2: 'turn'
            {
             before(grammarAccess.getTurnActionAccess().getTurnKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalPolycreate.g:2345:1: rule__TurnAction__Group__2 : rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 ;
    public final void rule__TurnAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2349:1: ( rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3 )
            // InternalPolycreate.g:2350:2: rule__TurnAction__Group__2__Impl rule__TurnAction__Group__3
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
    // InternalPolycreate.g:2357:1: rule__TurnAction__Group__2__Impl : ( ( rule__TurnAction__AngleAssignment_2 ) ) ;
    public final void rule__TurnAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2361:1: ( ( ( rule__TurnAction__AngleAssignment_2 ) ) )
            // InternalPolycreate.g:2362:1: ( ( rule__TurnAction__AngleAssignment_2 ) )
            {
            // InternalPolycreate.g:2362:1: ( ( rule__TurnAction__AngleAssignment_2 ) )
            // InternalPolycreate.g:2363:2: ( rule__TurnAction__AngleAssignment_2 )
            {
             before(grammarAccess.getTurnActionAccess().getAngleAssignment_2()); 
            // InternalPolycreate.g:2364:2: ( rule__TurnAction__AngleAssignment_2 )
            // InternalPolycreate.g:2364:3: rule__TurnAction__AngleAssignment_2
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
    // InternalPolycreate.g:2372:1: rule__TurnAction__Group__3 : rule__TurnAction__Group__3__Impl ;
    public final void rule__TurnAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2376:1: ( rule__TurnAction__Group__3__Impl )
            // InternalPolycreate.g:2377:2: rule__TurnAction__Group__3__Impl
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
    // InternalPolycreate.g:2383:1: rule__TurnAction__Group__3__Impl : ( ( rule__TurnAction__Group_3__0 )? ) ;
    public final void rule__TurnAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2387:1: ( ( ( rule__TurnAction__Group_3__0 )? ) )
            // InternalPolycreate.g:2388:1: ( ( rule__TurnAction__Group_3__0 )? )
            {
            // InternalPolycreate.g:2388:1: ( ( rule__TurnAction__Group_3__0 )? )
            // InternalPolycreate.g:2389:2: ( rule__TurnAction__Group_3__0 )?
            {
             before(grammarAccess.getTurnActionAccess().getGroup_3()); 
            // InternalPolycreate.g:2390:2: ( rule__TurnAction__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPolycreate.g:2390:3: rule__TurnAction__Group_3__0
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
    // InternalPolycreate.g:2399:1: rule__TurnAction__Group_3__0 : rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 ;
    public final void rule__TurnAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2403:1: ( rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1 )
            // InternalPolycreate.g:2404:2: rule__TurnAction__Group_3__0__Impl rule__TurnAction__Group_3__1
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
    // InternalPolycreate.g:2411:1: rule__TurnAction__Group_3__0__Impl : ( 'during' ) ;
    public final void rule__TurnAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2415:1: ( ( 'during' ) )
            // InternalPolycreate.g:2416:1: ( 'during' )
            {
            // InternalPolycreate.g:2416:1: ( 'during' )
            // InternalPolycreate.g:2417:2: 'during'
            {
             before(grammarAccess.getTurnActionAccess().getDuringKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPolycreate.g:2426:1: rule__TurnAction__Group_3__1 : rule__TurnAction__Group_3__1__Impl ;
    public final void rule__TurnAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2430:1: ( rule__TurnAction__Group_3__1__Impl )
            // InternalPolycreate.g:2431:2: rule__TurnAction__Group_3__1__Impl
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
    // InternalPolycreate.g:2437:1: rule__TurnAction__Group_3__1__Impl : ( ( rule__TurnAction__DurationAssignment_3_1 ) ) ;
    public final void rule__TurnAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2441:1: ( ( ( rule__TurnAction__DurationAssignment_3_1 ) ) )
            // InternalPolycreate.g:2442:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            {
            // InternalPolycreate.g:2442:1: ( ( rule__TurnAction__DurationAssignment_3_1 ) )
            // InternalPolycreate.g:2443:2: ( rule__TurnAction__DurationAssignment_3_1 )
            {
             before(grammarAccess.getTurnActionAccess().getDurationAssignment_3_1()); 
            // InternalPolycreate.g:2444:2: ( rule__TurnAction__DurationAssignment_3_1 )
            // InternalPolycreate.g:2444:3: rule__TurnAction__DurationAssignment_3_1
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


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalPolycreate.g:2453:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2457:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalPolycreate.g:2458:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalPolycreate.g:2465:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2469:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2470:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2470:1: ( ( '-' )? )
            // InternalPolycreate.g:2471:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalPolycreate.g:2472:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPolycreate.g:2472:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalPolycreate.g:2480:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2484:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalPolycreate.g:2485:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalPolycreate.g:2492:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2496:1: ( ( ( RULE_INT )? ) )
            // InternalPolycreate.g:2497:1: ( ( RULE_INT )? )
            {
            // InternalPolycreate.g:2497:1: ( ( RULE_INT )? )
            // InternalPolycreate.g:2498:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalPolycreate.g:2499:2: ( RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:2499:3: RULE_INT
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
    // InternalPolycreate.g:2507:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2511:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalPolycreate.g:2512:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalPolycreate.g:2519:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2523:1: ( ( '.' ) )
            // InternalPolycreate.g:2524:1: ( '.' )
            {
            // InternalPolycreate.g:2524:1: ( '.' )
            // InternalPolycreate.g:2525:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPolycreate.g:2534:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2538:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalPolycreate.g:2539:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalPolycreate.g:2546:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2550:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2551:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2551:1: ( RULE_INT )
            // InternalPolycreate.g:2552:2: RULE_INT
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
    // InternalPolycreate.g:2561:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2565:1: ( rule__EDouble__Group__4__Impl )
            // InternalPolycreate.g:2566:2: rule__EDouble__Group__4__Impl
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
    // InternalPolycreate.g:2572:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2576:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalPolycreate.g:2577:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalPolycreate.g:2577:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalPolycreate.g:2578:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalPolycreate.g:2579:2: ( rule__EDouble__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPolycreate.g:2579:3: rule__EDouble__Group_4__0
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
    // InternalPolycreate.g:2588:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2592:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalPolycreate.g:2593:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPolycreate.g:2600:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2604:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalPolycreate.g:2605:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalPolycreate.g:2605:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalPolycreate.g:2606:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalPolycreate.g:2607:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalPolycreate.g:2607:3: rule__EDouble__Alternatives_4_0
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
    // InternalPolycreate.g:2615:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2619:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalPolycreate.g:2620:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalPolycreate.g:2627:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2631:1: ( ( ( '-' )? ) )
            // InternalPolycreate.g:2632:1: ( ( '-' )? )
            {
            // InternalPolycreate.g:2632:1: ( ( '-' )? )
            // InternalPolycreate.g:2633:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalPolycreate.g:2634:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPolycreate.g:2634:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalPolycreate.g:2642:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2646:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalPolycreate.g:2647:2: rule__EDouble__Group_4__2__Impl
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
    // InternalPolycreate.g:2653:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2657:1: ( ( RULE_INT ) )
            // InternalPolycreate.g:2658:1: ( RULE_INT )
            {
            // InternalPolycreate.g:2658:1: ( RULE_INT )
            // InternalPolycreate.g:2659:2: RULE_INT
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
    // InternalPolycreate.g:2669:1: rule__RobotProgram__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RobotProgram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2673:1: ( ( ruleEString ) )
            // InternalPolycreate.g:2674:2: ( ruleEString )
            {
            // InternalPolycreate.g:2674:2: ( ruleEString )
            // InternalPolycreate.g:2675:3: ruleEString
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
    // InternalPolycreate.g:2684:1: rule__RobotProgram__InitialStateAssignment_4 : ( ruleState ) ;
    public final void rule__RobotProgram__InitialStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2688:1: ( ( ruleState ) )
            // InternalPolycreate.g:2689:2: ( ruleState )
            {
            // InternalPolycreate.g:2689:2: ( ruleState )
            // InternalPolycreate.g:2690:3: ruleState
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
    // InternalPolycreate.g:2699:1: rule__RobotProgram__OwnedStatesAssignment_5 : ( ruleState ) ;
    public final void rule__RobotProgram__OwnedStatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2703:1: ( ( ruleState ) )
            // InternalPolycreate.g:2704:2: ( ruleState )
            {
            // InternalPolycreate.g:2704:2: ( ruleState )
            // InternalPolycreate.g:2705:3: ruleState
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
    // InternalPolycreate.g:2714:1: rule__RobotProgram__GlobalTransitionsAssignment_6 : ( ruleTransition ) ;
    public final void rule__RobotProgram__GlobalTransitionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2718:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:2719:2: ( ruleTransition )
            {
            // InternalPolycreate.g:2719:2: ( ruleTransition )
            // InternalPolycreate.g:2720:3: ruleTransition
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
    // InternalPolycreate.g:2729:1: rule__Transition__ConditionsAssignment_1_0 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2733:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:2734:2: ( ruleCondition )
            {
            // InternalPolycreate.g:2734:2: ( ruleCondition )
            // InternalPolycreate.g:2735:3: ruleCondition
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
    // InternalPolycreate.g:2744:1: rule__Transition__ConditionsAssignment_1_1_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2748:1: ( ( ruleCondition ) )
            // InternalPolycreate.g:2749:2: ( ruleCondition )
            {
            // InternalPolycreate.g:2749:2: ( ruleCondition )
            // InternalPolycreate.g:2750:3: ruleCondition
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
    // InternalPolycreate.g:2759:1: rule__Transition__NextStateAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2763:1: ( ( ( ruleEString ) ) )
            // InternalPolycreate.g:2764:2: ( ( ruleEString ) )
            {
            // InternalPolycreate.g:2764:2: ( ( ruleEString ) )
            // InternalPolycreate.g:2765:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_2_0()); 
            // InternalPolycreate.g:2766:3: ( ruleEString )
            // InternalPolycreate.g:2767:4: ruleEString
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
    // InternalPolycreate.g:2778:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2782:1: ( ( ruleEString ) )
            // InternalPolycreate.g:2783:2: ( ruleEString )
            {
            // InternalPolycreate.g:2783:2: ( ruleEString )
            // InternalPolycreate.g:2784:3: ruleEString
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
    // InternalPolycreate.g:2793:1: rule__State__ActionsAssignment_4_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2797:1: ( ( ruleAction ) )
            // InternalPolycreate.g:2798:2: ( ruleAction )
            {
            // InternalPolycreate.g:2798:2: ( ruleAction )
            // InternalPolycreate.g:2799:3: ruleAction
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
    // InternalPolycreate.g:2808:1: rule__State__ActionsAssignment_4_4_1 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2812:1: ( ( ruleAction ) )
            // InternalPolycreate.g:2813:2: ( ruleAction )
            {
            // InternalPolycreate.g:2813:2: ( ruleAction )
            // InternalPolycreate.g:2814:3: ruleAction
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
    // InternalPolycreate.g:2823:1: rule__State__TransitionsAssignment_5_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2827:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:2828:2: ( ruleTransition )
            {
            // InternalPolycreate.g:2828:2: ( ruleTransition )
            // InternalPolycreate.g:2829:3: ruleTransition
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
    // InternalPolycreate.g:2838:1: rule__State__TransitionsAssignment_5_4_1 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2842:1: ( ( ruleTransition ) )
            // InternalPolycreate.g:2843:2: ( ruleTransition )
            {
            // InternalPolycreate.g:2843:2: ( ruleTransition )
            // InternalPolycreate.g:2844:3: ruleTransition
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
    // InternalPolycreate.g:2853:1: rule__SimpleCondition__DetectionTypeAssignment_2 : ( ruleDETECTION ) ;
    public final void rule__SimpleCondition__DetectionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2857:1: ( ( ruleDETECTION ) )
            // InternalPolycreate.g:2858:2: ( ruleDETECTION )
            {
            // InternalPolycreate.g:2858:2: ( ruleDETECTION )
            // InternalPolycreate.g:2859:3: ruleDETECTION
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
    // InternalPolycreate.g:2868:1: rule__DistanceCondition__CameraTypeAssignment_3 : ( ruleCAMERATYPE ) ;
    public final void rule__DistanceCondition__CameraTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2872:1: ( ( ruleCAMERATYPE ) )
            // InternalPolycreate.g:2873:2: ( ruleCAMERATYPE )
            {
            // InternalPolycreate.g:2873:2: ( ruleCAMERATYPE )
            // InternalPolycreate.g:2874:3: ruleCAMERATYPE
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


    // $ANTLR start "rule__DistanceCondition__DistanceAssignment_7"
    // InternalPolycreate.g:2883:1: rule__DistanceCondition__DistanceAssignment_7 : ( ruleEDouble ) ;
    public final void rule__DistanceCondition__DistanceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2887:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2888:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2888:2: ( ruleEDouble )
            // InternalPolycreate.g:2889:3: ruleEDouble
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
    // InternalPolycreate.g:2898:1: rule__AngleCondition__CameraTypeAssignment_3 : ( ruleCAMERATYPE ) ;
    public final void rule__AngleCondition__CameraTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2902:1: ( ( ruleCAMERATYPE ) )
            // InternalPolycreate.g:2903:2: ( ruleCAMERATYPE )
            {
            // InternalPolycreate.g:2903:2: ( ruleCAMERATYPE )
            // InternalPolycreate.g:2904:3: ruleCAMERATYPE
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


    // $ANTLR start "rule__AngleCondition__AngleAssignment_7"
    // InternalPolycreate.g:2913:1: rule__AngleCondition__AngleAssignment_7 : ( ruleEDouble ) ;
    public final void rule__AngleCondition__AngleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2917:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2918:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2918:2: ( ruleEDouble )
            // InternalPolycreate.g:2919:3: ruleEDouble
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
    // InternalPolycreate.g:2928:1: rule__MoveAction__DirectionAssignment_2 : ( ruleDIRECTION ) ;
    public final void rule__MoveAction__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2932:1: ( ( ruleDIRECTION ) )
            // InternalPolycreate.g:2933:2: ( ruleDIRECTION )
            {
            // InternalPolycreate.g:2933:2: ( ruleDIRECTION )
            // InternalPolycreate.g:2934:3: ruleDIRECTION
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
    // InternalPolycreate.g:2943:1: rule__MoveAction__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__MoveAction__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2947:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2948:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2948:2: ( ruleEDouble )
            // InternalPolycreate.g:2949:3: ruleEDouble
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
    // InternalPolycreate.g:2958:1: rule__TurnAction__AngleAssignment_2 : ( ruleEDouble ) ;
    public final void rule__TurnAction__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2962:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2963:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2963:2: ( ruleEDouble )
            // InternalPolycreate.g:2964:3: ruleEDouble
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
    // InternalPolycreate.g:2973:1: rule__TurnAction__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__TurnAction__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPolycreate.g:2977:1: ( ( ruleEDouble ) )
            // InternalPolycreate.g:2978:2: ( ruleEDouble )
            {
            // InternalPolycreate.g:2978:2: ( ruleEDouble )
            // InternalPolycreate.g:2979:3: ruleEDouble
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000808000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000300000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000040L});

}