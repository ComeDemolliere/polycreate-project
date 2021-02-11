package fr.unice.polytech.si5.webots.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.si5.webots.services.PolycreateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPolycreateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotProgram'", "'Transition'", "'{'", "'conditions'", "','", "'}'", "'nextState'", "'State'", "'actions'", "'transitions'", "'SimpleCondition'", "'detectionType'", "'MoveAction'", "'direction'", "'TurnAction'", "'angle'", "'-'", "'.'", "'E'", "'e'", "'COLLISION_LEFT'", "'COLLISION_RIGHT'", "'VIRTUAL_WALL'", "'CLIFF_LEFT'", "'CLIFF_RIGHT'", "'CLIFF_FRONT'", "'FORWARD'", "'BACKWARD'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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

        public InternalPolycreateParser(TokenStream input, PolycreateGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RobotProgram";
       	}

       	@Override
       	protected PolycreateGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobotProgram"
    // InternalPolycreate.g:65:1: entryRuleRobotProgram returns [EObject current=null] : iv_ruleRobotProgram= ruleRobotProgram EOF ;
    public final EObject entryRuleRobotProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotProgram = null;


        try {
            // InternalPolycreate.g:65:53: (iv_ruleRobotProgram= ruleRobotProgram EOF )
            // InternalPolycreate.g:66:2: iv_ruleRobotProgram= ruleRobotProgram EOF
            {
             newCompositeNode(grammarAccess.getRobotProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotProgram=ruleRobotProgram();

            state._fsp--;

             current =iv_ruleRobotProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobotProgram"


    // $ANTLR start "ruleRobotProgram"
    // InternalPolycreate.g:72:1: ruleRobotProgram returns [EObject current=null] : ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) ( (lv_initialState_3_0= ruleState ) ) ( (lv_ownedStates_4_0= ruleState ) )* ( (lv_globalTransitions_5_0= ruleTransition ) )* ) ;
    public final EObject ruleRobotProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_initialState_3_0 = null;

        EObject lv_ownedStates_4_0 = null;

        EObject lv_globalTransitions_5_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:78:2: ( ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) ( (lv_initialState_3_0= ruleState ) ) ( (lv_ownedStates_4_0= ruleState ) )* ( (lv_globalTransitions_5_0= ruleTransition ) )* ) )
            // InternalPolycreate.g:79:2: ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) ( (lv_initialState_3_0= ruleState ) ) ( (lv_ownedStates_4_0= ruleState ) )* ( (lv_globalTransitions_5_0= ruleTransition ) )* )
            {
            // InternalPolycreate.g:79:2: ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) ( (lv_initialState_3_0= ruleState ) ) ( (lv_ownedStates_4_0= ruleState ) )* ( (lv_globalTransitions_5_0= ruleTransition ) )* )
            // InternalPolycreate.g:80:3: () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) ( (lv_initialState_3_0= ruleState ) ) ( (lv_ownedStates_4_0= ruleState ) )* ( (lv_globalTransitions_5_0= ruleTransition ) )*
            {
            // InternalPolycreate.g:80:3: ()
            // InternalPolycreate.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotProgramAccess().getRobotProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotProgramAccess().getRobotProgramKeyword_1());
            		
            // InternalPolycreate.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:92:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotProgramAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotProgramRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.webots.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:110:3: ( (lv_initialState_3_0= ruleState ) )
            // InternalPolycreate.g:111:4: (lv_initialState_3_0= ruleState )
            {
            // InternalPolycreate.g:111:4: (lv_initialState_3_0= ruleState )
            // InternalPolycreate.g:112:5: lv_initialState_3_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRobotProgramAccess().getInitialStateStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_initialState_3_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotProgramRule());
            					}
            					set(
            						current,
            						"initialState",
            						lv_initialState_3_0,
            						"fr.unice.polytech.si5.webots.Polycreate.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:129:3: ( (lv_ownedStates_4_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPolycreate.g:130:4: (lv_ownedStates_4_0= ruleState )
            	    {
            	    // InternalPolycreate.g:130:4: (lv_ownedStates_4_0= ruleState )
            	    // InternalPolycreate.g:131:5: lv_ownedStates_4_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getRobotProgramAccess().getOwnedStatesStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedStates_4_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedStates",
            	    						lv_ownedStates_4_0,
            	    						"fr.unice.polytech.si5.webots.Polycreate.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPolycreate.g:148:3: ( (lv_globalTransitions_5_0= ruleTransition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPolycreate.g:149:4: (lv_globalTransitions_5_0= ruleTransition )
            	    {
            	    // InternalPolycreate.g:149:4: (lv_globalTransitions_5_0= ruleTransition )
            	    // InternalPolycreate.g:150:5: lv_globalTransitions_5_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getRobotProgramAccess().getGlobalTransitionsTransitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_globalTransitions_5_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"globalTransitions",
            	    						lv_globalTransitions_5_0,
            	    						"fr.unice.polytech.si5.webots.Polycreate.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobotProgram"


    // $ANTLR start "entryRuleEString"
    // InternalPolycreate.g:171:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPolycreate.g:171:47: (iv_ruleEString= ruleEString EOF )
            // InternalPolycreate.g:172:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPolycreate.g:178:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:184:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPolycreate.g:185:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPolycreate.g:185:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPolycreate.g:186:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:194:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCondition"
    // InternalPolycreate.g:205:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalPolycreate.g:205:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalPolycreate.g:206:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalPolycreate.g:212:1: ruleCondition returns [EObject current=null] : this_SimpleCondition_0= ruleSimpleCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleCondition_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:218:2: (this_SimpleCondition_0= ruleSimpleCondition )
            // InternalPolycreate.g:219:2: this_SimpleCondition_0= ruleSimpleCondition
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SimpleCondition_0=ruleSimpleCondition();

            state._fsp--;


            		current = this_SimpleCondition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAction"
    // InternalPolycreate.g:230:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPolycreate.g:230:47: (iv_ruleAction= ruleAction EOF )
            // InternalPolycreate.g:231:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPolycreate.g:237:1: ruleAction returns [EObject current=null] : (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_MoveAction_0 = null;

        EObject this_TurnAction_1 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:243:2: ( (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction ) )
            // InternalPolycreate.g:244:2: (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction )
            {
            // InternalPolycreate.g:244:2: (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPolycreate.g:245:3: this_MoveAction_0= ruleMoveAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMoveActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveAction_0=ruleMoveAction();

                    state._fsp--;


                    			current = this_MoveAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:254:3: this_TurnAction_1= ruleTurnAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTurnActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnAction_1=ruleTurnAction();

                    state._fsp--;


                    			current = this_TurnAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalPolycreate.g:266:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalPolycreate.g:266:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalPolycreate.g:267:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPolycreate.g:273:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* otherlv_7= '}' )? otherlv_8= 'nextState' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_conditions_4_0 = null;

        EObject lv_conditions_6_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:279:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* otherlv_7= '}' )? otherlv_8= 'nextState' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalPolycreate.g:280:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* otherlv_7= '}' )? otherlv_8= 'nextState' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalPolycreate.g:280:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* otherlv_7= '}' )? otherlv_8= 'nextState' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalPolycreate.g:281:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* otherlv_7= '}' )? otherlv_8= 'nextState' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPolycreate.g:289:3: (otherlv_2= 'conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPolycreate.g:290:4: otherlv_2= 'conditions' otherlv_3= '{' ( (lv_conditions_4_0= ruleCondition ) ) (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getConditionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalPolycreate.g:298:4: ( (lv_conditions_4_0= ruleCondition ) )
                    // InternalPolycreate.g:299:5: (lv_conditions_4_0= ruleCondition )
                    {
                    // InternalPolycreate.g:299:5: (lv_conditions_4_0= ruleCondition )
                    // InternalPolycreate.g:300:6: lv_conditions_4_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_conditions_4_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_4_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:317:4: (otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPolycreate.g:318:5: otherlv_5= ',' ( (lv_conditions_6_0= ruleCondition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalPolycreate.g:322:5: ( (lv_conditions_6_0= ruleCondition ) )
                    	    // InternalPolycreate.g:323:6: (lv_conditions_6_0= ruleCondition )
                    	    {
                    	    // InternalPolycreate.g:323:6: (lv_conditions_6_0= ruleCondition )
                    	    // InternalPolycreate.g:324:7: lv_conditions_6_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_conditions_6_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conditions",
                    	    								lv_conditions_6_0,
                    	    								"fr.unice.polytech.si5.webots.Polycreate.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getNextStateKeyword_3());
            		
            // InternalPolycreate.g:351:3: ( ( ruleEString ) )
            // InternalPolycreate.g:352:4: ( ruleEString )
            {
            // InternalPolycreate.g:352:4: ( ruleEString )
            // InternalPolycreate.g:353:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // InternalPolycreate.g:375:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalPolycreate.g:375:46: (iv_ruleState= ruleState EOF )
            // InternalPolycreate.g:376:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalPolycreate.g:382:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_transitions_12_0 = null;

        EObject lv_transitions_14_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:388:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalPolycreate.g:389:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalPolycreate.g:389:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalPolycreate.g:390:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalPolycreate.g:390:3: ()
            // InternalPolycreate.g:391:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalPolycreate.g:401:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:402:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:402:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:403:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.webots.Polycreate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPolycreate.g:424:3: (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPolycreate.g:425:4: otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleAction ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalPolycreate.g:433:4: ( (lv_actions_6_0= ruleAction ) )
                    // InternalPolycreate.g:434:5: (lv_actions_6_0= ruleAction )
                    {
                    // InternalPolycreate.g:434:5: (lv_actions_6_0= ruleAction )
                    // InternalPolycreate.g:435:6: lv_actions_6_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_actions_6_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_6_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:452:4: (otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPolycreate.g:453:5: otherlv_7= ',' ( (lv_actions_8_0= ruleAction ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalPolycreate.g:457:5: ( (lv_actions_8_0= ruleAction ) )
                    	    // InternalPolycreate.g:458:6: (lv_actions_8_0= ruleAction )
                    	    {
                    	    // InternalPolycreate.g:458:6: (lv_actions_8_0= ruleAction )
                    	    // InternalPolycreate.g:459:7: lv_actions_8_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_actions_8_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_8_0,
                    	    								"fr.unice.polytech.si5.webots.Polycreate.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:482:3: (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPolycreate.g:483:4: otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getTransitionsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalPolycreate.g:491:4: ( (lv_transitions_12_0= ruleTransition ) )
                    // InternalPolycreate.g:492:5: (lv_transitions_12_0= ruleTransition )
                    {
                    // InternalPolycreate.g:492:5: (lv_transitions_12_0= ruleTransition )
                    // InternalPolycreate.g:493:6: lv_transitions_12_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_transitions_12_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_12_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:510:4: (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPolycreate.g:511:5: otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalPolycreate.g:515:5: ( (lv_transitions_14_0= ruleTransition ) )
                    	    // InternalPolycreate.g:516:6: (lv_transitions_14_0= ruleTransition )
                    	    {
                    	    // InternalPolycreate.g:516:6: (lv_transitions_14_0= ruleTransition )
                    	    // InternalPolycreate.g:517:7: lv_transitions_14_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_transitions_14_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_14_0,
                    	    								"fr.unice.polytech.si5.webots.Polycreate.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleSimpleCondition"
    // InternalPolycreate.g:548:1: entryRuleSimpleCondition returns [EObject current=null] : iv_ruleSimpleCondition= ruleSimpleCondition EOF ;
    public final EObject entryRuleSimpleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleCondition = null;


        try {
            // InternalPolycreate.g:548:56: (iv_ruleSimpleCondition= ruleSimpleCondition EOF )
            // InternalPolycreate.g:549:2: iv_ruleSimpleCondition= ruleSimpleCondition EOF
            {
             newCompositeNode(grammarAccess.getSimpleConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleCondition=ruleSimpleCondition();

            state._fsp--;

             current =iv_ruleSimpleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleCondition"


    // $ANTLR start "ruleSimpleCondition"
    // InternalPolycreate.g:555:1: ruleSimpleCondition returns [EObject current=null] : ( () otherlv_1= 'SimpleCondition' otherlv_2= '{' (otherlv_3= 'detectionType' ( (lv_detectionType_4_0= ruleDETECTION ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSimpleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_detectionType_4_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:561:2: ( ( () otherlv_1= 'SimpleCondition' otherlv_2= '{' (otherlv_3= 'detectionType' ( (lv_detectionType_4_0= ruleDETECTION ) ) )? otherlv_5= '}' ) )
            // InternalPolycreate.g:562:2: ( () otherlv_1= 'SimpleCondition' otherlv_2= '{' (otherlv_3= 'detectionType' ( (lv_detectionType_4_0= ruleDETECTION ) ) )? otherlv_5= '}' )
            {
            // InternalPolycreate.g:562:2: ( () otherlv_1= 'SimpleCondition' otherlv_2= '{' (otherlv_3= 'detectionType' ( (lv_detectionType_4_0= ruleDETECTION ) ) )? otherlv_5= '}' )
            // InternalPolycreate.g:563:3: () otherlv_1= 'SimpleCondition' otherlv_2= '{' (otherlv_3= 'detectionType' ( (lv_detectionType_4_0= ruleDETECTION ) ) )? otherlv_5= '}'
            {
            // InternalPolycreate.g:563:3: ()
            // InternalPolycreate.g:564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleConditionAccess().getSimpleConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPolycreate.g:578:3: (otherlv_3= 'detectionType' ( (lv_detectionType_4_0= ruleDETECTION ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPolycreate.g:579:4: otherlv_3= 'detectionType' ( (lv_detectionType_4_0= ruleDETECTION ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleConditionAccess().getDetectionTypeKeyword_3_0());
                    			
                    // InternalPolycreate.g:583:4: ( (lv_detectionType_4_0= ruleDETECTION ) )
                    // InternalPolycreate.g:584:5: (lv_detectionType_4_0= ruleDETECTION )
                    {
                    // InternalPolycreate.g:584:5: (lv_detectionType_4_0= ruleDETECTION )
                    // InternalPolycreate.g:585:6: lv_detectionType_4_0= ruleDETECTION
                    {

                    						newCompositeNode(grammarAccess.getSimpleConditionAccess().getDetectionTypeDETECTIONEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_detectionType_4_0=ruleDETECTION();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleConditionRule());
                    						}
                    						set(
                    							current,
                    							"detectionType",
                    							lv_detectionType_4_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.DETECTION");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleConditionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleCondition"


    // $ANTLR start "entryRuleMoveAction"
    // InternalPolycreate.g:611:1: entryRuleMoveAction returns [EObject current=null] : iv_ruleMoveAction= ruleMoveAction EOF ;
    public final EObject entryRuleMoveAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveAction = null;


        try {
            // InternalPolycreate.g:611:51: (iv_ruleMoveAction= ruleMoveAction EOF )
            // InternalPolycreate.g:612:2: iv_ruleMoveAction= ruleMoveAction EOF
            {
             newCompositeNode(grammarAccess.getMoveActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveAction=ruleMoveAction();

            state._fsp--;

             current =iv_ruleMoveAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveAction"


    // $ANTLR start "ruleMoveAction"
    // InternalPolycreate.g:618:1: ruleMoveAction returns [EObject current=null] : ( () otherlv_1= 'MoveAction' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMoveAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_direction_4_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:624:2: ( ( () otherlv_1= 'MoveAction' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) )? otherlv_5= '}' ) )
            // InternalPolycreate.g:625:2: ( () otherlv_1= 'MoveAction' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) )? otherlv_5= '}' )
            {
            // InternalPolycreate.g:625:2: ( () otherlv_1= 'MoveAction' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) )? otherlv_5= '}' )
            // InternalPolycreate.g:626:3: () otherlv_1= 'MoveAction' otherlv_2= '{' (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) )? otherlv_5= '}'
            {
            // InternalPolycreate.g:626:3: ()
            // InternalPolycreate.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveActionAccess().getMoveActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveActionAccess().getMoveActionKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPolycreate.g:641:3: (otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPolycreate.g:642:4: otherlv_3= 'direction' ( (lv_direction_4_0= ruleDIRECTION ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoveActionAccess().getDirectionKeyword_3_0());
                    			
                    // InternalPolycreate.g:646:4: ( (lv_direction_4_0= ruleDIRECTION ) )
                    // InternalPolycreate.g:647:5: (lv_direction_4_0= ruleDIRECTION )
                    {
                    // InternalPolycreate.g:647:5: (lv_direction_4_0= ruleDIRECTION )
                    // InternalPolycreate.g:648:6: lv_direction_4_0= ruleDIRECTION
                    {

                    						newCompositeNode(grammarAccess.getMoveActionAccess().getDirectionDIRECTIONEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_direction_4_0=ruleDIRECTION();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoveActionRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_4_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.DIRECTION");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveActionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveAction"


    // $ANTLR start "entryRuleTurnAction"
    // InternalPolycreate.g:674:1: entryRuleTurnAction returns [EObject current=null] : iv_ruleTurnAction= ruleTurnAction EOF ;
    public final EObject entryRuleTurnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnAction = null;


        try {
            // InternalPolycreate.g:674:51: (iv_ruleTurnAction= ruleTurnAction EOF )
            // InternalPolycreate.g:675:2: iv_ruleTurnAction= ruleTurnAction EOF
            {
             newCompositeNode(grammarAccess.getTurnActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnAction=ruleTurnAction();

            state._fsp--;

             current =iv_ruleTurnAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnAction"


    // $ANTLR start "ruleTurnAction"
    // InternalPolycreate.g:681:1: ruleTurnAction returns [EObject current=null] : ( () otherlv_1= 'TurnAction' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTurnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_angle_4_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:687:2: ( ( () otherlv_1= 'TurnAction' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalPolycreate.g:688:2: ( () otherlv_1= 'TurnAction' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalPolycreate.g:688:2: ( () otherlv_1= 'TurnAction' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalPolycreate.g:689:3: () otherlv_1= 'TurnAction' otherlv_2= '{' (otherlv_3= 'angle' ( (lv_angle_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalPolycreate.g:689:3: ()
            // InternalPolycreate.g:690:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnActionAccess().getTurnActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnActionAccess().getTurnActionKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPolycreate.g:704:3: (otherlv_3= 'angle' ( (lv_angle_4_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPolycreate.g:705:4: otherlv_3= 'angle' ( (lv_angle_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getTurnActionAccess().getAngleKeyword_3_0());
                    			
                    // InternalPolycreate.g:709:4: ( (lv_angle_4_0= ruleEDouble ) )
                    // InternalPolycreate.g:710:5: (lv_angle_4_0= ruleEDouble )
                    {
                    // InternalPolycreate.g:710:5: (lv_angle_4_0= ruleEDouble )
                    // InternalPolycreate.g:711:6: lv_angle_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTurnActionAccess().getAngleEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_angle_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTurnActionRule());
                    						}
                    						set(
                    							current,
                    							"angle",
                    							lv_angle_4_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTurnActionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnAction"


    // $ANTLR start "entryRuleEDouble"
    // InternalPolycreate.g:737:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPolycreate.g:737:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPolycreate.g:738:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalPolycreate.g:744:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalPolycreate.g:750:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalPolycreate.g:751:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalPolycreate.g:751:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalPolycreate.g:752:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalPolycreate.g:752:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPolycreate.g:753:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:759:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPolycreate.g:760:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,28,FOLLOW_25); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalPolycreate.g:780:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPolycreate.g:781:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalPolycreate.g:781:4: (kw= 'E' | kw= 'e' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==29) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==30) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPolycreate.g:782:5: kw= 'E'
                            {
                            kw=(Token)match(input,29,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPolycreate.g:788:5: kw= 'e'
                            {
                            kw=(Token)match(input,30,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalPolycreate.g:794:4: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalPolycreate.g:795:5: kw= '-'
                            {
                            kw=(Token)match(input,27,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleDETECTION"
    // InternalPolycreate.g:813:1: ruleDETECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) ) ;
    public final Enumerator ruleDETECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalPolycreate.g:819:2: ( ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) ) )
            // InternalPolycreate.g:820:2: ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) )
            {
            // InternalPolycreate.g:820:2: ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            case 35:
                {
                alt19=5;
                }
                break;
            case 36:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPolycreate.g:821:3: (enumLiteral_0= 'COLLISION_LEFT' )
                    {
                    // InternalPolycreate.g:821:3: (enumLiteral_0= 'COLLISION_LEFT' )
                    // InternalPolycreate.g:822:4: enumLiteral_0= 'COLLISION_LEFT'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:829:3: (enumLiteral_1= 'COLLISION_RIGHT' )
                    {
                    // InternalPolycreate.g:829:3: (enumLiteral_1= 'COLLISION_RIGHT' )
                    // InternalPolycreate.g:830:4: enumLiteral_1= 'COLLISION_RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:837:3: (enumLiteral_2= 'VIRTUAL_WALL' )
                    {
                    // InternalPolycreate.g:837:3: (enumLiteral_2= 'VIRTUAL_WALL' )
                    // InternalPolycreate.g:838:4: enumLiteral_2= 'VIRTUAL_WALL'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:845:3: (enumLiteral_3= 'CLIFF_LEFT' )
                    {
                    // InternalPolycreate.g:845:3: (enumLiteral_3= 'CLIFF_LEFT' )
                    // InternalPolycreate.g:846:4: enumLiteral_3= 'CLIFF_LEFT'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:853:3: (enumLiteral_4= 'CLIFF_RIGHT' )
                    {
                    // InternalPolycreate.g:853:3: (enumLiteral_4= 'CLIFF_RIGHT' )
                    // InternalPolycreate.g:854:4: enumLiteral_4= 'CLIFF_RIGHT'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:861:3: (enumLiteral_5= 'CLIFF_FRONT' )
                    {
                    // InternalPolycreate.g:861:3: (enumLiteral_5= 'CLIFF_FRONT' )
                    // InternalPolycreate.g:862:4: enumLiteral_5= 'CLIFF_FRONT'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCLIFF_FRONTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDETECTIONAccess().getCLIFF_FRONTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDETECTION"


    // $ANTLR start "ruleDIRECTION"
    // InternalPolycreate.g:872:1: ruleDIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) ) ;
    public final Enumerator ruleDIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:878:2: ( ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) ) )
            // InternalPolycreate.g:879:2: ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) )
            {
            // InternalPolycreate.g:879:2: ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:880:3: (enumLiteral_0= 'FORWARD' )
                    {
                    // InternalPolycreate.g:880:3: (enumLiteral_0= 'FORWARD' )
                    // InternalPolycreate.g:881:4: enumLiteral_0= 'FORWARD'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:888:3: (enumLiteral_1= 'BACKWARD' )
                    {
                    // InternalPolycreate.g:888:3: (enumLiteral_1= 'BACKWARD' )
                    // InternalPolycreate.g:889:4: enumLiteral_1= 'BACKWARD'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDIRECTIONAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDIRECTIONAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIRECTION"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000040L});

}