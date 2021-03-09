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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotProgram'", "'->'", "'and'", "'=>'", "'State'", "':'", "'actions'", "'='", "'['", "','", "']'", "'transitions'", "'detect'", "'object'", "'with'", "'distance'", "'angle'", "'move'", "'during'", "'turn'", "'gripper'", "'-'", "'.'", "'E'", "'e'", "'COLLISION_LEFT'", "'COLLISION_RIGHT'", "'VIRTUAL_WALL'", "'CLIFF_LEFT'", "'CLIFF_RIGHT'", "'CLIFF_FRONT'", "'<'", "'>'", "'FORWARD'", "'BACKWARD'", "'BACK'", "'FRONT'", "'Open'", "'Closed'"
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
    // InternalPolycreate.g:72:1: ruleRobotProgram returns [EObject current=null] : ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (lv_initialState_4_0= ruleState ) ) ( (lv_ownedStates_5_0= ruleState ) )* ( (lv_globalTransitions_6_0= ruleGlobalTransitions ) )* ) ;
    public final EObject ruleRobotProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_initialState_4_0 = null;

        EObject lv_ownedStates_5_0 = null;

        EObject lv_globalTransitions_6_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:78:2: ( ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (lv_initialState_4_0= ruleState ) ) ( (lv_ownedStates_5_0= ruleState ) )* ( (lv_globalTransitions_6_0= ruleGlobalTransitions ) )* ) )
            // InternalPolycreate.g:79:2: ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (lv_initialState_4_0= ruleState ) ) ( (lv_ownedStates_5_0= ruleState ) )* ( (lv_globalTransitions_6_0= ruleGlobalTransitions ) )* )
            {
            // InternalPolycreate.g:79:2: ( () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (lv_initialState_4_0= ruleState ) ) ( (lv_ownedStates_5_0= ruleState ) )* ( (lv_globalTransitions_6_0= ruleGlobalTransitions ) )* )
            // InternalPolycreate.g:80:3: () otherlv_1= 'RobotProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( (lv_initialState_4_0= ruleState ) ) ( (lv_ownedStates_5_0= ruleState ) )* ( (lv_globalTransitions_6_0= ruleGlobalTransitions ) )*
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotProgramAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalPolycreate.g:114:3: ( (lv_initialState_4_0= ruleState ) )
            // InternalPolycreate.g:115:4: (lv_initialState_4_0= ruleState )
            {
            // InternalPolycreate.g:115:4: (lv_initialState_4_0= ruleState )
            // InternalPolycreate.g:116:5: lv_initialState_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getRobotProgramAccess().getInitialStateStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_initialState_4_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotProgramRule());
            					}
            					set(
            						current,
            						"initialState",
            						lv_initialState_4_0,
            						"fr.unice.polytech.si5.webots.Polycreate.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:133:3: ( (lv_ownedStates_5_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPolycreate.g:134:4: (lv_ownedStates_5_0= ruleState )
            	    {
            	    // InternalPolycreate.g:134:4: (lv_ownedStates_5_0= ruleState )
            	    // InternalPolycreate.g:135:5: lv_ownedStates_5_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getRobotProgramAccess().getOwnedStatesStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_ownedStates_5_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedStates",
            	    						lv_ownedStates_5_0,
            	    						"fr.unice.polytech.si5.webots.Polycreate.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPolycreate.g:152:3: ( (lv_globalTransitions_6_0= ruleGlobalTransitions ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPolycreate.g:153:4: (lv_globalTransitions_6_0= ruleGlobalTransitions )
            	    {
            	    // InternalPolycreate.g:153:4: (lv_globalTransitions_6_0= ruleGlobalTransitions )
            	    // InternalPolycreate.g:154:5: lv_globalTransitions_6_0= ruleGlobalTransitions
            	    {

            	    					newCompositeNode(grammarAccess.getRobotProgramAccess().getGlobalTransitionsGlobalTransitionsParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_globalTransitions_6_0=ruleGlobalTransitions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"globalTransitions",
            	    						lv_globalTransitions_6_0,
            	    						"fr.unice.polytech.si5.webots.Polycreate.GlobalTransitions");
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
    // InternalPolycreate.g:175:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPolycreate.g:175:47: (iv_ruleEString= ruleEString EOF )
            // InternalPolycreate.g:176:2: iv_ruleEString= ruleEString EOF
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
    // InternalPolycreate.g:182:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:188:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPolycreate.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPolycreate.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPolycreate.g:190:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:198:3: this_ID_1= RULE_ID
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
    // InternalPolycreate.g:209:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalPolycreate.g:209:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalPolycreate.g:210:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalPolycreate.g:216:1: ruleCondition returns [EObject current=null] : (this_SimpleCondition_0= ruleSimpleCondition | this_ObjectCondition_1= ruleObjectCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleCondition_0 = null;

        EObject this_ObjectCondition_1 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:222:2: ( (this_SimpleCondition_0= ruleSimpleCondition | this_ObjectCondition_1= ruleObjectCondition ) )
            // InternalPolycreate.g:223:2: (this_SimpleCondition_0= ruleSimpleCondition | this_ObjectCondition_1= ruleObjectCondition )
            {
            // InternalPolycreate.g:223:2: (this_SimpleCondition_0= ruleSimpleCondition | this_ObjectCondition_1= ruleObjectCondition )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=36 && LA4_1<=41)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==24) ) {
                    alt4=2;
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
                    // InternalPolycreate.g:224:3: this_SimpleCondition_0= ruleSimpleCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleCondition_0=ruleSimpleCondition();

                    state._fsp--;


                    			current = this_SimpleCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:233:3: this_ObjectCondition_1= ruleObjectCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getObjectConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectCondition_1=ruleObjectCondition();

                    state._fsp--;


                    			current = this_ObjectCondition_1;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAction"
    // InternalPolycreate.g:245:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPolycreate.g:245:47: (iv_ruleAction= ruleAction EOF )
            // InternalPolycreate.g:246:2: iv_ruleAction= ruleAction EOF
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
    // InternalPolycreate.g:252:1: ruleAction returns [EObject current=null] : (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction | this_GripAction_2= ruleGripAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_MoveAction_0 = null;

        EObject this_TurnAction_1 = null;

        EObject this_GripAction_2 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:258:2: ( (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction | this_GripAction_2= ruleGripAction ) )
            // InternalPolycreate.g:259:2: (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction | this_GripAction_2= ruleGripAction )
            {
            // InternalPolycreate.g:259:2: (this_MoveAction_0= ruleMoveAction | this_TurnAction_1= ruleTurnAction | this_GripAction_2= ruleGripAction )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 48:
            case 49:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPolycreate.g:260:3: this_MoveAction_0= ruleMoveAction
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
                    // InternalPolycreate.g:269:3: this_TurnAction_1= ruleTurnAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTurnActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnAction_1=ruleTurnAction();

                    state._fsp--;


                    			current = this_TurnAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:278:3: this_GripAction_2= ruleGripAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGripActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GripAction_2=ruleGripAction();

                    state._fsp--;


                    			current = this_GripAction_2;
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
    // InternalPolycreate.g:290:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalPolycreate.g:290:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalPolycreate.g:291:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalPolycreate.g:297:1: ruleTransition returns [EObject current=null] : ( () ( ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' )? ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:303:2: ( ( () ( ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' )? ( ( ruleEString ) ) ) )
            // InternalPolycreate.g:304:2: ( () ( ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' )? ( ( ruleEString ) ) )
            {
            // InternalPolycreate.g:304:2: ( () ( ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' )? ( ( ruleEString ) ) )
            // InternalPolycreate.g:305:3: () ( ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' )? ( ( ruleEString ) )
            {
            // InternalPolycreate.g:305:3: ()
            // InternalPolycreate.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            // InternalPolycreate.g:312:3: ( ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPolycreate.g:313:4: ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>'
                    {
                    // InternalPolycreate.g:313:4: ( (lv_conditions_1_0= ruleCondition ) )
                    // InternalPolycreate.g:314:5: (lv_conditions_1_0= ruleCondition )
                    {
                    // InternalPolycreate.g:314:5: (lv_conditions_1_0= ruleCondition )
                    // InternalPolycreate.g:315:6: lv_conditions_1_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_conditions_1_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_1_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:332:4: (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPolycreate.g:333:5: otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) )
                    	    {
                    	    otherlv_2=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getAndKeyword_1_1_0());
                    	    				
                    	    // InternalPolycreate.g:337:5: ( (lv_conditions_3_0= ruleCondition ) )
                    	    // InternalPolycreate.g:338:6: (lv_conditions_3_0= ruleCondition )
                    	    {
                    	    // InternalPolycreate.g:338:6: (lv_conditions_3_0= ruleCondition )
                    	    // InternalPolycreate.g:339:7: lv_conditions_3_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_conditions_3_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conditions",
                    	    								lv_conditions_3_0,
                    	    								"fr.unice.polytech.si5.webots.Polycreate.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:362:3: ( ( ruleEString ) )
            // InternalPolycreate.g:363:4: ( ruleEString )
            {
            // InternalPolycreate.g:363:4: ( ruleEString )
            // InternalPolycreate.g:364:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleGlobalTransitions"
    // InternalPolycreate.g:382:1: entryRuleGlobalTransitions returns [EObject current=null] : iv_ruleGlobalTransitions= ruleGlobalTransitions EOF ;
    public final EObject entryRuleGlobalTransitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalTransitions = null;


        try {
            // InternalPolycreate.g:382:58: (iv_ruleGlobalTransitions= ruleGlobalTransitions EOF )
            // InternalPolycreate.g:383:2: iv_ruleGlobalTransitions= ruleGlobalTransitions EOF
            {
             newCompositeNode(grammarAccess.getGlobalTransitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalTransitions=ruleGlobalTransitions();

            state._fsp--;

             current =iv_ruleGlobalTransitions; 
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
    // $ANTLR end "entryRuleGlobalTransitions"


    // $ANTLR start "ruleGlobalTransitions"
    // InternalPolycreate.g:389:1: ruleGlobalTransitions returns [EObject current=null] : ( () ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' ( ( ruleEString ) ) ) ;
    public final EObject ruleGlobalTransitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:395:2: ( ( () ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' ( ( ruleEString ) ) ) )
            // InternalPolycreate.g:396:2: ( () ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' ( ( ruleEString ) ) )
            {
            // InternalPolycreate.g:396:2: ( () ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' ( ( ruleEString ) ) )
            // InternalPolycreate.g:397:3: () ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= '=>' ( ( ruleEString ) )
            {
            // InternalPolycreate.g:397:3: ()
            // InternalPolycreate.g:398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalTransitionsAccess().getTransitionAction_0(),
            					current);
            			

            }

            // InternalPolycreate.g:404:3: ( (lv_conditions_1_0= ruleCondition ) )
            // InternalPolycreate.g:405:4: (lv_conditions_1_0= ruleCondition )
            {
            // InternalPolycreate.g:405:4: (lv_conditions_1_0= ruleCondition )
            // InternalPolycreate.g:406:5: lv_conditions_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getGlobalTransitionsAccess().getConditionsConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_conditions_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalTransitionsRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"fr.unice.polytech.si5.webots.Polycreate.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:423:3: (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPolycreate.g:424:4: otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getGlobalTransitionsAccess().getAndKeyword_2_0());
            	    			
            	    // InternalPolycreate.g:428:4: ( (lv_conditions_3_0= ruleCondition ) )
            	    // InternalPolycreate.g:429:5: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalPolycreate.g:429:5: (lv_conditions_3_0= ruleCondition )
            	    // InternalPolycreate.g:430:6: lv_conditions_3_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getGlobalTransitionsAccess().getConditionsConditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGlobalTransitionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_3_0,
            	    							"fr.unice.polytech.si5.webots.Polycreate.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGlobalTransitionsAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalPolycreate.g:452:3: ( ( ruleEString ) )
            // InternalPolycreate.g:453:4: ( ruleEString )
            {
            // InternalPolycreate.g:453:4: ( ruleEString )
            // InternalPolycreate.g:454:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalTransitionsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGlobalTransitionsAccess().getNextStateStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleGlobalTransitions"


    // $ANTLR start "entryRuleState"
    // InternalPolycreate.g:472:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalPolycreate.g:472:46: (iv_ruleState= ruleState EOF )
            // InternalPolycreate.g:473:2: iv_ruleState= ruleState EOF
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
    // InternalPolycreate.g:479:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'actions' otherlv_5= '=' otherlv_6= '[' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= ']' )? (otherlv_11= 'transitions' otherlv_12= '=' otherlv_13= '[' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= ']' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_transitions_14_0 = null;

        EObject lv_transitions_16_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:485:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'actions' otherlv_5= '=' otherlv_6= '[' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= ']' )? (otherlv_11= 'transitions' otherlv_12= '=' otherlv_13= '[' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= ']' )? ) )
            // InternalPolycreate.g:486:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'actions' otherlv_5= '=' otherlv_6= '[' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= ']' )? (otherlv_11= 'transitions' otherlv_12= '=' otherlv_13= '[' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= ']' )? )
            {
            // InternalPolycreate.g:486:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'actions' otherlv_5= '=' otherlv_6= '[' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= ']' )? (otherlv_11= 'transitions' otherlv_12= '=' otherlv_13= '[' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= ']' )? )
            // InternalPolycreate.g:487:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' (otherlv_4= 'actions' otherlv_5= '=' otherlv_6= '[' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= ']' )? (otherlv_11= 'transitions' otherlv_12= '=' otherlv_13= '[' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= ']' )?
            {
            // InternalPolycreate.g:487:3: ()
            // InternalPolycreate.g:488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalPolycreate.g:498:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPolycreate.g:499:4: (lv_name_2_0= ruleEString )
            {
            // InternalPolycreate.g:499:4: (lv_name_2_0= ruleEString )
            // InternalPolycreate.g:500:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getColonKeyword_3());
            		
            // InternalPolycreate.g:521:3: (otherlv_4= 'actions' otherlv_5= '=' otherlv_6= '[' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPolycreate.g:522:4: otherlv_4= 'actions' otherlv_5= '=' otherlv_6= '[' ( (lv_actions_7_0= ruleAction ) ) (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )* otherlv_10= ']'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getEqualsSignKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftSquareBracketKeyword_4_2());
                    			
                    // InternalPolycreate.g:534:4: ( (lv_actions_7_0= ruleAction ) )
                    // InternalPolycreate.g:535:5: (lv_actions_7_0= ruleAction )
                    {
                    // InternalPolycreate.g:535:5: (lv_actions_7_0= ruleAction )
                    // InternalPolycreate.g:536:6: lv_actions_7_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_actions_7_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_7_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPolycreate.g:553:4: (otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPolycreate.g:554:5: otherlv_8= ',' ( (lv_actions_9_0= ruleAction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStateAccess().getCommaKeyword_4_4_0());
                    	    				
                    	    // InternalPolycreate.g:558:5: ( (lv_actions_9_0= ruleAction ) )
                    	    // InternalPolycreate.g:559:6: (lv_actions_9_0= ruleAction )
                    	    {
                    	    // InternalPolycreate.g:559:6: (lv_actions_9_0= ruleAction )
                    	    // InternalPolycreate.g:560:7: lv_actions_9_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_4_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_actions_9_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_9_0,
                    	    								"fr.unice.polytech.si5.webots.Polycreate.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightSquareBracketKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:583:3: (otherlv_11= 'transitions' otherlv_12= '=' otherlv_13= '[' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPolycreate.g:584:4: otherlv_11= 'transitions' otherlv_12= '=' otherlv_13= '[' ( (lv_transitions_14_0= ruleTransition ) ) (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )* otherlv_17= ']'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getTransitionsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getEqualsSignKeyword_5_1());
                    			
                    otherlv_13=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getStateAccess().getLeftSquareBracketKeyword_5_2());
                    			
                    // InternalPolycreate.g:596:4: ( (lv_transitions_14_0= ruleTransition ) )
                    // InternalPolycreate.g:597:5: (lv_transitions_14_0= ruleTransition )
                    {
                    // InternalPolycreate.g:597:5: (lv_transitions_14_0= ruleTransition )
                    // InternalPolycreate.g:598:6: lv_transitions_14_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalPolycreate.g:615:4: (otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPolycreate.g:616:5: otherlv_15= ',' ( (lv_transitions_16_0= ruleTransition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,20,FOLLOW_17); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getStateAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalPolycreate.g:620:5: ( (lv_transitions_16_0= ruleTransition ) )
                    	    // InternalPolycreate.g:621:6: (lv_transitions_16_0= ruleTransition )
                    	    {
                    	    // InternalPolycreate.g:621:6: (lv_transitions_16_0= ruleTransition )
                    	    // InternalPolycreate.g:622:7: lv_transitions_16_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_transitions_16_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_16_0,
                    	    								"fr.unice.polytech.si5.webots.Polycreate.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getStateAccess().getRightSquareBracketKeyword_5_5());
                    			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleSimpleCondition"
    // InternalPolycreate.g:649:1: entryRuleSimpleCondition returns [EObject current=null] : iv_ruleSimpleCondition= ruleSimpleCondition EOF ;
    public final EObject entryRuleSimpleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleCondition = null;


        try {
            // InternalPolycreate.g:649:56: (iv_ruleSimpleCondition= ruleSimpleCondition EOF )
            // InternalPolycreate.g:650:2: iv_ruleSimpleCondition= ruleSimpleCondition EOF
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
    // InternalPolycreate.g:656:1: ruleSimpleCondition returns [EObject current=null] : ( () otherlv_1= 'detect' ( (lv_detectionType_2_0= ruleDETECTION ) ) ) ;
    public final EObject ruleSimpleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_detectionType_2_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:662:2: ( ( () otherlv_1= 'detect' ( (lv_detectionType_2_0= ruleDETECTION ) ) ) )
            // InternalPolycreate.g:663:2: ( () otherlv_1= 'detect' ( (lv_detectionType_2_0= ruleDETECTION ) ) )
            {
            // InternalPolycreate.g:663:2: ( () otherlv_1= 'detect' ( (lv_detectionType_2_0= ruleDETECTION ) ) )
            // InternalPolycreate.g:664:3: () otherlv_1= 'detect' ( (lv_detectionType_2_0= ruleDETECTION ) )
            {
            // InternalPolycreate.g:664:3: ()
            // InternalPolycreate.g:665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleConditionAccess().getDetectKeyword_1());
            		
            // InternalPolycreate.g:675:3: ( (lv_detectionType_2_0= ruleDETECTION ) )
            // InternalPolycreate.g:676:4: (lv_detectionType_2_0= ruleDETECTION )
            {
            // InternalPolycreate.g:676:4: (lv_detectionType_2_0= ruleDETECTION )
            // InternalPolycreate.g:677:5: lv_detectionType_2_0= ruleDETECTION
            {

            					newCompositeNode(grammarAccess.getSimpleConditionAccess().getDetectionTypeDETECTIONEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_detectionType_2_0=ruleDETECTION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleConditionRule());
            					}
            					set(
            						current,
            						"detectionType",
            						lv_detectionType_2_0,
            						"fr.unice.polytech.si5.webots.Polycreate.DETECTION");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleSimpleCondition"


    // $ANTLR start "entryRuleObjectCondition"
    // InternalPolycreate.g:698:1: entryRuleObjectCondition returns [EObject current=null] : iv_ruleObjectCondition= ruleObjectCondition EOF ;
    public final EObject entryRuleObjectCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectCondition = null;


        try {
            // InternalPolycreate.g:698:56: (iv_ruleObjectCondition= ruleObjectCondition EOF )
            // InternalPolycreate.g:699:2: iv_ruleObjectCondition= ruleObjectCondition EOF
            {
             newCompositeNode(grammarAccess.getObjectConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectCondition=ruleObjectCondition();

            state._fsp--;

             current =iv_ruleObjectCondition; 
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
    // $ANTLR end "entryRuleObjectCondition"


    // $ANTLR start "ruleObjectCondition"
    // InternalPolycreate.g:705:1: ruleObjectCondition returns [EObject current=null] : (this_DistanceCondition_0= ruleDistanceCondition | this_AngleCondition_1= ruleAngleCondition ) ;
    public final EObject ruleObjectCondition() throws RecognitionException {
        EObject current = null;

        EObject this_DistanceCondition_0 = null;

        EObject this_AngleCondition_1 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:711:2: ( (this_DistanceCondition_0= ruleDistanceCondition | this_AngleCondition_1= ruleAngleCondition ) )
            // InternalPolycreate.g:712:2: (this_DistanceCondition_0= ruleDistanceCondition | this_AngleCondition_1= ruleAngleCondition )
            {
            // InternalPolycreate.g:712:2: (this_DistanceCondition_0= ruleDistanceCondition | this_AngleCondition_1= ruleAngleCondition )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==24) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==46) ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==25) ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5==27) ) {
                                alt13=2;
                            }
                            else if ( (LA13_5==26) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_2==47) ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==25) ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5==27) ) {
                                alt13=2;
                            }
                            else if ( (LA13_5==26) ) {
                                alt13=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPolycreate.g:713:3: this_DistanceCondition_0= ruleDistanceCondition
                    {

                    			newCompositeNode(grammarAccess.getObjectConditionAccess().getDistanceConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceCondition_0=ruleDistanceCondition();

                    state._fsp--;


                    			current = this_DistanceCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:722:3: this_AngleCondition_1= ruleAngleCondition
                    {

                    			newCompositeNode(grammarAccess.getObjectConditionAccess().getAngleConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AngleCondition_1=ruleAngleCondition();

                    state._fsp--;


                    			current = this_AngleCondition_1;
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
    // $ANTLR end "ruleObjectCondition"


    // $ANTLR start "entryRuleDistanceCondition"
    // InternalPolycreate.g:734:1: entryRuleDistanceCondition returns [EObject current=null] : iv_ruleDistanceCondition= ruleDistanceCondition EOF ;
    public final EObject entryRuleDistanceCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceCondition = null;


        try {
            // InternalPolycreate.g:734:58: (iv_ruleDistanceCondition= ruleDistanceCondition EOF )
            // InternalPolycreate.g:735:2: iv_ruleDistanceCondition= ruleDistanceCondition EOF
            {
             newCompositeNode(grammarAccess.getDistanceConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceCondition=ruleDistanceCondition();

            state._fsp--;

             current =iv_ruleDistanceCondition; 
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
    // $ANTLR end "entryRuleDistanceCondition"


    // $ANTLR start "ruleDistanceCondition"
    // InternalPolycreate.g:741:1: ruleDistanceCondition returns [EObject current=null] : ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'distance' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_distance_7_0= ruleEDouble ) ) ) ;
    public final EObject ruleDistanceCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_cameraType_3_0 = null;

        Enumerator lv_operator_6_0 = null;

        AntlrDatatypeRuleToken lv_distance_7_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:747:2: ( ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'distance' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_distance_7_0= ruleEDouble ) ) ) )
            // InternalPolycreate.g:748:2: ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'distance' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_distance_7_0= ruleEDouble ) ) )
            {
            // InternalPolycreate.g:748:2: ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'distance' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_distance_7_0= ruleEDouble ) ) )
            // InternalPolycreate.g:749:3: () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'distance' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_distance_7_0= ruleEDouble ) )
            {
            // InternalPolycreate.g:749:3: ()
            // InternalPolycreate.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDistanceConditionAccess().getDistanceConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceConditionAccess().getDetectKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getDistanceConditionAccess().getObjectKeyword_2());
            		
            // InternalPolycreate.g:764:3: ( (lv_cameraType_3_0= ruleCAMERATYPE ) )
            // InternalPolycreate.g:765:4: (lv_cameraType_3_0= ruleCAMERATYPE )
            {
            // InternalPolycreate.g:765:4: (lv_cameraType_3_0= ruleCAMERATYPE )
            // InternalPolycreate.g:766:5: lv_cameraType_3_0= ruleCAMERATYPE
            {

            					newCompositeNode(grammarAccess.getDistanceConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_cameraType_3_0=ruleCAMERATYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceConditionRule());
            					}
            					set(
            						current,
            						"cameraType",
            						lv_cameraType_3_0,
            						"fr.unice.polytech.si5.webots.Polycreate.CAMERATYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getDistanceConditionAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getDistanceConditionAccess().getDistanceKeyword_5());
            		
            // InternalPolycreate.g:791:3: ( (lv_operator_6_0= ruleOPERATOR ) )
            // InternalPolycreate.g:792:4: (lv_operator_6_0= ruleOPERATOR )
            {
            // InternalPolycreate.g:792:4: (lv_operator_6_0= ruleOPERATOR )
            // InternalPolycreate.g:793:5: lv_operator_6_0= ruleOPERATOR
            {

            					newCompositeNode(grammarAccess.getDistanceConditionAccess().getOperatorOPERATOREnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_operator_6_0=ruleOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_6_0,
            						"fr.unice.polytech.si5.webots.Polycreate.OPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:810:3: ( (lv_distance_7_0= ruleEDouble ) )
            // InternalPolycreate.g:811:4: (lv_distance_7_0= ruleEDouble )
            {
            // InternalPolycreate.g:811:4: (lv_distance_7_0= ruleEDouble )
            // InternalPolycreate.g:812:5: lv_distance_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getDistanceConditionAccess().getDistanceEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceConditionRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_7_0,
            						"fr.unice.polytech.si5.webots.Polycreate.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleDistanceCondition"


    // $ANTLR start "entryRuleAngleCondition"
    // InternalPolycreate.g:833:1: entryRuleAngleCondition returns [EObject current=null] : iv_ruleAngleCondition= ruleAngleCondition EOF ;
    public final EObject entryRuleAngleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngleCondition = null;


        try {
            // InternalPolycreate.g:833:55: (iv_ruleAngleCondition= ruleAngleCondition EOF )
            // InternalPolycreate.g:834:2: iv_ruleAngleCondition= ruleAngleCondition EOF
            {
             newCompositeNode(grammarAccess.getAngleConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngleCondition=ruleAngleCondition();

            state._fsp--;

             current =iv_ruleAngleCondition; 
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
    // $ANTLR end "entryRuleAngleCondition"


    // $ANTLR start "ruleAngleCondition"
    // InternalPolycreate.g:840:1: ruleAngleCondition returns [EObject current=null] : ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'angle' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_angle_7_0= ruleEDouble ) ) ) ;
    public final EObject ruleAngleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_cameraType_3_0 = null;

        Enumerator lv_operator_6_0 = null;

        AntlrDatatypeRuleToken lv_angle_7_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:846:2: ( ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'angle' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_angle_7_0= ruleEDouble ) ) ) )
            // InternalPolycreate.g:847:2: ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'angle' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_angle_7_0= ruleEDouble ) ) )
            {
            // InternalPolycreate.g:847:2: ( () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'angle' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_angle_7_0= ruleEDouble ) ) )
            // InternalPolycreate.g:848:3: () otherlv_1= 'detect' otherlv_2= 'object' ( (lv_cameraType_3_0= ruleCAMERATYPE ) ) otherlv_4= 'with' otherlv_5= 'angle' ( (lv_operator_6_0= ruleOPERATOR ) ) ( (lv_angle_7_0= ruleEDouble ) )
            {
            // InternalPolycreate.g:848:3: ()
            // InternalPolycreate.g:849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAngleConditionAccess().getAngleConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAngleConditionAccess().getDetectKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAngleConditionAccess().getObjectKeyword_2());
            		
            // InternalPolycreate.g:863:3: ( (lv_cameraType_3_0= ruleCAMERATYPE ) )
            // InternalPolycreate.g:864:4: (lv_cameraType_3_0= ruleCAMERATYPE )
            {
            // InternalPolycreate.g:864:4: (lv_cameraType_3_0= ruleCAMERATYPE )
            // InternalPolycreate.g:865:5: lv_cameraType_3_0= ruleCAMERATYPE
            {

            					newCompositeNode(grammarAccess.getAngleConditionAccess().getCameraTypeCAMERATYPEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_cameraType_3_0=ruleCAMERATYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAngleConditionRule());
            					}
            					set(
            						current,
            						"cameraType",
            						lv_cameraType_3_0,
            						"fr.unice.polytech.si5.webots.Polycreate.CAMERATYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getAngleConditionAccess().getWithKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getAngleConditionAccess().getAngleKeyword_5());
            		
            // InternalPolycreate.g:890:3: ( (lv_operator_6_0= ruleOPERATOR ) )
            // InternalPolycreate.g:891:4: (lv_operator_6_0= ruleOPERATOR )
            {
            // InternalPolycreate.g:891:4: (lv_operator_6_0= ruleOPERATOR )
            // InternalPolycreate.g:892:5: lv_operator_6_0= ruleOPERATOR
            {

            					newCompositeNode(grammarAccess.getAngleConditionAccess().getOperatorOPERATOREnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_operator_6_0=ruleOPERATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAngleConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_6_0,
            						"fr.unice.polytech.si5.webots.Polycreate.OPERATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:909:3: ( (lv_angle_7_0= ruleEDouble ) )
            // InternalPolycreate.g:910:4: (lv_angle_7_0= ruleEDouble )
            {
            // InternalPolycreate.g:910:4: (lv_angle_7_0= ruleEDouble )
            // InternalPolycreate.g:911:5: lv_angle_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAngleConditionAccess().getAngleEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_angle_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAngleConditionRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_7_0,
            						"fr.unice.polytech.si5.webots.Polycreate.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAngleCondition"


    // $ANTLR start "entryRuleMoveAction"
    // InternalPolycreate.g:932:1: entryRuleMoveAction returns [EObject current=null] : iv_ruleMoveAction= ruleMoveAction EOF ;
    public final EObject entryRuleMoveAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveAction = null;


        try {
            // InternalPolycreate.g:932:51: (iv_ruleMoveAction= ruleMoveAction EOF )
            // InternalPolycreate.g:933:2: iv_ruleMoveAction= ruleMoveAction EOF
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
    // InternalPolycreate.g:939:1: ruleMoveAction returns [EObject current=null] : ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleDIRECTION ) ) otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) ) ;
    public final EObject ruleMoveAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:945:2: ( ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleDIRECTION ) ) otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) ) )
            // InternalPolycreate.g:946:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleDIRECTION ) ) otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )
            {
            // InternalPolycreate.g:946:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleDIRECTION ) ) otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )
            // InternalPolycreate.g:947:3: () otherlv_1= 'move' ( (lv_direction_2_0= ruleDIRECTION ) ) otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) )
            {
            // InternalPolycreate.g:947:3: ()
            // InternalPolycreate.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveActionAccess().getMoveActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveActionAccess().getMoveKeyword_1());
            		
            // InternalPolycreate.g:958:3: ( (lv_direction_2_0= ruleDIRECTION ) )
            // InternalPolycreate.g:959:4: (lv_direction_2_0= ruleDIRECTION )
            {
            // InternalPolycreate.g:959:4: (lv_direction_2_0= ruleDIRECTION )
            // InternalPolycreate.g:960:5: lv_direction_2_0= ruleDIRECTION
            {

            					newCompositeNode(grammarAccess.getMoveActionAccess().getDirectionDIRECTIONEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_direction_2_0=ruleDIRECTION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveActionRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_2_0,
            						"fr.unice.polytech.si5.webots.Polycreate.DIRECTION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveActionAccess().getDuringKeyword_3());
            		
            // InternalPolycreate.g:981:3: ( (lv_duration_4_0= ruleEDouble ) )
            // InternalPolycreate.g:982:4: (lv_duration_4_0= ruleEDouble )
            {
            // InternalPolycreate.g:982:4: (lv_duration_4_0= ruleEDouble )
            // InternalPolycreate.g:983:5: lv_duration_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMoveActionAccess().getDurationEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_duration_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveActionRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_4_0,
            						"fr.unice.polytech.si5.webots.Polycreate.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleMoveAction"


    // $ANTLR start "entryRuleTurnAction"
    // InternalPolycreate.g:1004:1: entryRuleTurnAction returns [EObject current=null] : iv_ruleTurnAction= ruleTurnAction EOF ;
    public final EObject entryRuleTurnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnAction = null;


        try {
            // InternalPolycreate.g:1004:51: (iv_ruleTurnAction= ruleTurnAction EOF )
            // InternalPolycreate.g:1005:2: iv_ruleTurnAction= ruleTurnAction EOF
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
    // InternalPolycreate.g:1011:1: ruleTurnAction returns [EObject current=null] : ( () otherlv_1= 'turn' ( (lv_angle_2_0= ruleEDouble ) ) (otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleTurnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_angle_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:1017:2: ( ( () otherlv_1= 'turn' ( (lv_angle_2_0= ruleEDouble ) ) (otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )? ) )
            // InternalPolycreate.g:1018:2: ( () otherlv_1= 'turn' ( (lv_angle_2_0= ruleEDouble ) ) (otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )? )
            {
            // InternalPolycreate.g:1018:2: ( () otherlv_1= 'turn' ( (lv_angle_2_0= ruleEDouble ) ) (otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )? )
            // InternalPolycreate.g:1019:3: () otherlv_1= 'turn' ( (lv_angle_2_0= ruleEDouble ) ) (otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )?
            {
            // InternalPolycreate.g:1019:3: ()
            // InternalPolycreate.g:1020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnActionAccess().getTurnActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnActionAccess().getTurnKeyword_1());
            		
            // InternalPolycreate.g:1030:3: ( (lv_angle_2_0= ruleEDouble ) )
            // InternalPolycreate.g:1031:4: (lv_angle_2_0= ruleEDouble )
            {
            // InternalPolycreate.g:1031:4: (lv_angle_2_0= ruleEDouble )
            // InternalPolycreate.g:1032:5: lv_angle_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getTurnActionAccess().getAngleEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_angle_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnActionRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_2_0,
            						"fr.unice.polytech.si5.webots.Polycreate.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPolycreate.g:1049:3: (otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPolycreate.g:1050:4: otherlv_3= 'during' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getTurnActionAccess().getDuringKeyword_3_0());
                    			
                    // InternalPolycreate.g:1054:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalPolycreate.g:1055:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalPolycreate.g:1055:5: (lv_duration_4_0= ruleEDouble )
                    // InternalPolycreate.g:1056:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTurnActionAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTurnActionRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_4_0,
                    							"fr.unice.polytech.si5.webots.Polycreate.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleTurnAction"


    // $ANTLR start "entryRuleGripAction"
    // InternalPolycreate.g:1078:1: entryRuleGripAction returns [EObject current=null] : iv_ruleGripAction= ruleGripAction EOF ;
    public final EObject entryRuleGripAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGripAction = null;


        try {
            // InternalPolycreate.g:1078:51: (iv_ruleGripAction= ruleGripAction EOF )
            // InternalPolycreate.g:1079:2: iv_ruleGripAction= ruleGripAction EOF
            {
             newCompositeNode(grammarAccess.getGripActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGripAction=ruleGripAction();

            state._fsp--;

             current =iv_ruleGripAction; 
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
    // $ANTLR end "entryRuleGripAction"


    // $ANTLR start "ruleGripAction"
    // InternalPolycreate.g:1085:1: ruleGripAction returns [EObject current=null] : ( () ( (lv_state_1_0= ruleGRIPPER_STATE ) ) otherlv_2= 'gripper' ) ;
    public final EObject ruleGripAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_state_1_0 = null;



        	enterRule();

        try {
            // InternalPolycreate.g:1091:2: ( ( () ( (lv_state_1_0= ruleGRIPPER_STATE ) ) otherlv_2= 'gripper' ) )
            // InternalPolycreate.g:1092:2: ( () ( (lv_state_1_0= ruleGRIPPER_STATE ) ) otherlv_2= 'gripper' )
            {
            // InternalPolycreate.g:1092:2: ( () ( (lv_state_1_0= ruleGRIPPER_STATE ) ) otherlv_2= 'gripper' )
            // InternalPolycreate.g:1093:3: () ( (lv_state_1_0= ruleGRIPPER_STATE ) ) otherlv_2= 'gripper'
            {
            // InternalPolycreate.g:1093:3: ()
            // InternalPolycreate.g:1094:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGripActionAccess().getGripActionAction_0(),
            					current);
            			

            }

            // InternalPolycreate.g:1100:3: ( (lv_state_1_0= ruleGRIPPER_STATE ) )
            // InternalPolycreate.g:1101:4: (lv_state_1_0= ruleGRIPPER_STATE )
            {
            // InternalPolycreate.g:1101:4: (lv_state_1_0= ruleGRIPPER_STATE )
            // InternalPolycreate.g:1102:5: lv_state_1_0= ruleGRIPPER_STATE
            {

            					newCompositeNode(grammarAccess.getGripActionAccess().getStateGRIPPER_STATEEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_state_1_0=ruleGRIPPER_STATE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGripActionRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_1_0,
            						"fr.unice.polytech.si5.webots.Polycreate.GRIPPER_STATE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGripActionAccess().getGripperKeyword_2());
            		

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
    // $ANTLR end "ruleGripAction"


    // $ANTLR start "entryRuleEDouble"
    // InternalPolycreate.g:1127:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPolycreate.g:1127:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPolycreate.g:1128:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalPolycreate.g:1134:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalPolycreate.g:1140:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalPolycreate.g:1141:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalPolycreate.g:1141:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalPolycreate.g:1142:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalPolycreate.g:1142:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPolycreate.g:1143:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPolycreate.g:1149:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPolycreate.g:1150:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_31); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_33); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalPolycreate.g:1170:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=34 && LA19_0<=35)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPolycreate.g:1171:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalPolycreate.g:1171:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==34) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==35) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalPolycreate.g:1172:5: kw= 'E'
                            {
                            kw=(Token)match(input,34,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPolycreate.g:1178:5: kw= 'e'
                            {
                            kw=(Token)match(input,35,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalPolycreate.g:1184:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalPolycreate.g:1185:5: kw= '-'
                            {
                            kw=(Token)match(input,32,FOLLOW_32); 

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
    // InternalPolycreate.g:1203:1: ruleDETECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) ) ;
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
            // InternalPolycreate.g:1209:2: ( ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) ) )
            // InternalPolycreate.g:1210:2: ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) )
            {
            // InternalPolycreate.g:1210:2: ( (enumLiteral_0= 'COLLISION_LEFT' ) | (enumLiteral_1= 'COLLISION_RIGHT' ) | (enumLiteral_2= 'VIRTUAL_WALL' ) | (enumLiteral_3= 'CLIFF_LEFT' ) | (enumLiteral_4= 'CLIFF_RIGHT' ) | (enumLiteral_5= 'CLIFF_FRONT' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case 38:
                {
                alt20=3;
                }
                break;
            case 39:
                {
                alt20=4;
                }
                break;
            case 40:
                {
                alt20=5;
                }
                break;
            case 41:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPolycreate.g:1211:3: (enumLiteral_0= 'COLLISION_LEFT' )
                    {
                    // InternalPolycreate.g:1211:3: (enumLiteral_0= 'COLLISION_LEFT' )
                    // InternalPolycreate.g:1212:4: enumLiteral_0= 'COLLISION_LEFT'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDETECTIONAccess().getCOLLISION_LEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:1219:3: (enumLiteral_1= 'COLLISION_RIGHT' )
                    {
                    // InternalPolycreate.g:1219:3: (enumLiteral_1= 'COLLISION_RIGHT' )
                    // InternalPolycreate.g:1220:4: enumLiteral_1= 'COLLISION_RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDETECTIONAccess().getCOLLISION_RIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPolycreate.g:1227:3: (enumLiteral_2= 'VIRTUAL_WALL' )
                    {
                    // InternalPolycreate.g:1227:3: (enumLiteral_2= 'VIRTUAL_WALL' )
                    // InternalPolycreate.g:1228:4: enumLiteral_2= 'VIRTUAL_WALL'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDETECTIONAccess().getVIRTUAL_WALLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPolycreate.g:1235:3: (enumLiteral_3= 'CLIFF_LEFT' )
                    {
                    // InternalPolycreate.g:1235:3: (enumLiteral_3= 'CLIFF_LEFT' )
                    // InternalPolycreate.g:1236:4: enumLiteral_3= 'CLIFF_LEFT'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDETECTIONAccess().getCLIFF_LEFTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPolycreate.g:1243:3: (enumLiteral_4= 'CLIFF_RIGHT' )
                    {
                    // InternalPolycreate.g:1243:3: (enumLiteral_4= 'CLIFF_RIGHT' )
                    // InternalPolycreate.g:1244:4: enumLiteral_4= 'CLIFF_RIGHT'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDETECTIONAccess().getCLIFF_RIGHTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPolycreate.g:1251:3: (enumLiteral_5= 'CLIFF_FRONT' )
                    {
                    // InternalPolycreate.g:1251:3: (enumLiteral_5= 'CLIFF_FRONT' )
                    // InternalPolycreate.g:1252:4: enumLiteral_5= 'CLIFF_FRONT'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

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


    // $ANTLR start "ruleOPERATOR"
    // InternalPolycreate.g:1262:1: ruleOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) ;
    public final Enumerator ruleOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:1268:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) )
            // InternalPolycreate.g:1269:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            {
            // InternalPolycreate.g:1269:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            else if ( (LA21_0==43) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPolycreate.g:1270:3: (enumLiteral_0= '<' )
                    {
                    // InternalPolycreate.g:1270:3: (enumLiteral_0= '<' )
                    // InternalPolycreate.g:1271:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOPERATORAccess().getINFERIOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOPERATORAccess().getINFERIOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:1278:3: (enumLiteral_1= '>' )
                    {
                    // InternalPolycreate.g:1278:3: (enumLiteral_1= '>' )
                    // InternalPolycreate.g:1279:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOPERATORAccess().getSUPERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOPERATORAccess().getSUPERIOREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOPERATOR"


    // $ANTLR start "ruleDIRECTION"
    // InternalPolycreate.g:1289:1: ruleDIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) ) ;
    public final Enumerator ruleDIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:1295:2: ( ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) ) )
            // InternalPolycreate.g:1296:2: ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) )
            {
            // InternalPolycreate.g:1296:2: ( (enumLiteral_0= 'FORWARD' ) | (enumLiteral_1= 'BACKWARD' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==45) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPolycreate.g:1297:3: (enumLiteral_0= 'FORWARD' )
                    {
                    // InternalPolycreate.g:1297:3: (enumLiteral_0= 'FORWARD' )
                    // InternalPolycreate.g:1298:4: enumLiteral_0= 'FORWARD'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDIRECTIONAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:1305:3: (enumLiteral_1= 'BACKWARD' )
                    {
                    // InternalPolycreate.g:1305:3: (enumLiteral_1= 'BACKWARD' )
                    // InternalPolycreate.g:1306:4: enumLiteral_1= 'BACKWARD'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

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


    // $ANTLR start "ruleCAMERATYPE"
    // InternalPolycreate.g:1316:1: ruleCAMERATYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'BACK' ) | (enumLiteral_1= 'FRONT' ) ) ;
    public final Enumerator ruleCAMERATYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:1322:2: ( ( (enumLiteral_0= 'BACK' ) | (enumLiteral_1= 'FRONT' ) ) )
            // InternalPolycreate.g:1323:2: ( (enumLiteral_0= 'BACK' ) | (enumLiteral_1= 'FRONT' ) )
            {
            // InternalPolycreate.g:1323:2: ( (enumLiteral_0= 'BACK' ) | (enumLiteral_1= 'FRONT' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            else if ( (LA23_0==47) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPolycreate.g:1324:3: (enumLiteral_0= 'BACK' )
                    {
                    // InternalPolycreate.g:1324:3: (enumLiteral_0= 'BACK' )
                    // InternalPolycreate.g:1325:4: enumLiteral_0= 'BACK'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCAMERATYPEAccess().getBACKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:1332:3: (enumLiteral_1= 'FRONT' )
                    {
                    // InternalPolycreate.g:1332:3: (enumLiteral_1= 'FRONT' )
                    // InternalPolycreate.g:1333:4: enumLiteral_1= 'FRONT'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getCAMERATYPEAccess().getFRONTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCAMERATYPEAccess().getFRONTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCAMERATYPE"


    // $ANTLR start "ruleGRIPPER_STATE"
    // InternalPolycreate.g:1343:1: ruleGRIPPER_STATE returns [Enumerator current=null] : ( (enumLiteral_0= 'Open' ) | (enumLiteral_1= 'Closed' ) ) ;
    public final Enumerator ruleGRIPPER_STATE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPolycreate.g:1349:2: ( ( (enumLiteral_0= 'Open' ) | (enumLiteral_1= 'Closed' ) ) )
            // InternalPolycreate.g:1350:2: ( (enumLiteral_0= 'Open' ) | (enumLiteral_1= 'Closed' ) )
            {
            // InternalPolycreate.g:1350:2: ( (enumLiteral_0= 'Open' ) | (enumLiteral_1= 'Closed' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            else if ( (LA24_0==49) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPolycreate.g:1351:3: (enumLiteral_0= 'Open' )
                    {
                    // InternalPolycreate.g:1351:3: (enumLiteral_0= 'Open' )
                    // InternalPolycreate.g:1352:4: enumLiteral_0= 'Open'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getGRIPPER_STATEAccess().getOPENEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGRIPPER_STATEAccess().getOPENEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPolycreate.g:1359:3: (enumLiteral_1= 'Closed' )
                    {
                    // InternalPolycreate.g:1359:3: (enumLiteral_1= 'Closed' )
                    // InternalPolycreate.g:1360:4: enumLiteral_1= 'Closed'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getGRIPPER_STATEAccess().getCLOSEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGRIPPER_STATEAccess().getCLOSEDEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleGRIPPER_STATE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000808002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003000050000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003F000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000040L});

}