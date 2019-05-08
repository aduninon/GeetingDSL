package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'myobject'", "'import'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_myObject_0_0= ruleMyObject ) ) | ( (lv_myPort_1_0= ruleMyPort ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_myObject_0_0 = null;

        EObject lv_myPort_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_myObject_0_0= ruleMyObject ) ) | ( (lv_myPort_1_0= ruleMyPort ) ) )* )
            // InternalMyDsl.g:78:2: ( ( (lv_myObject_0_0= ruleMyObject ) ) | ( (lv_myPort_1_0= ruleMyPort ) ) )*
            {
            // InternalMyDsl.g:78:2: ( ( (lv_myObject_0_0= ruleMyObject ) ) | ( (lv_myPort_1_0= ruleMyPort ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_ID) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: ( (lv_myObject_0_0= ruleMyObject ) )
            	    {
            	    // InternalMyDsl.g:79:3: ( (lv_myObject_0_0= ruleMyObject ) )
            	    // InternalMyDsl.g:80:4: (lv_myObject_0_0= ruleMyObject )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_myObject_0_0= ruleMyObject )
            	    // InternalMyDsl.g:81:5: lv_myObject_0_0= ruleMyObject
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMyObjectMyObjectParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_myObject_0_0=ruleMyObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"myObject",
            	    						lv_myObject_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.MyObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:99:3: ( (lv_myPort_1_0= ruleMyPort ) )
            	    {
            	    // InternalMyDsl.g:99:3: ( (lv_myPort_1_0= ruleMyPort ) )
            	    // InternalMyDsl.g:100:4: (lv_myPort_1_0= ruleMyPort )
            	    {
            	    // InternalMyDsl.g:100:4: (lv_myPort_1_0= ruleMyPort )
            	    // InternalMyDsl.g:101:5: lv_myPort_1_0= ruleMyPort
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMyPortMyPortParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_myPort_1_0=ruleMyPort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"myPort",
            	    						lv_myPort_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.MyPort");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMyObject"
    // InternalMyDsl.g:122:1: entryRuleMyObject returns [EObject current=null] : iv_ruleMyObject= ruleMyObject EOF ;
    public final EObject entryRuleMyObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyObject = null;


        try {
            // InternalMyDsl.g:122:49: (iv_ruleMyObject= ruleMyObject EOF )
            // InternalMyDsl.g:123:2: iv_ruleMyObject= ruleMyObject EOF
            {
             newCompositeNode(grammarAccess.getMyObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyObject=ruleMyObject();

            state._fsp--;

             current =iv_ruleMyObject; 
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
    // $ANTLR end "entryRuleMyObject"


    // $ANTLR start "ruleMyObject"
    // InternalMyDsl.g:129:1: ruleMyObject returns [EObject current=null] : (otherlv_0= 'myobject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'import' ( (lv_importPath_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMyObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_importPath_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:135:2: ( (otherlv_0= 'myobject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'import' ( (lv_importPath_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:136:2: (otherlv_0= 'myobject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'import' ( (lv_importPath_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:136:2: (otherlv_0= 'myobject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'import' ( (lv_importPath_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:137:3: otherlv_0= 'myobject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'import' ( (lv_importPath_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMyObjectAccess().getMyobjectKeyword_0());
            		
            // InternalMyDsl.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMyObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMyObjectAccess().getImportKeyword_2());
            		
            // InternalMyDsl.g:163:3: ( (lv_importPath_3_0= RULE_STRING ) )
            // InternalMyDsl.g:164:4: (lv_importPath_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:164:4: (lv_importPath_3_0= RULE_STRING )
            // InternalMyDsl.g:165:5: lv_importPath_3_0= RULE_STRING
            {
            lv_importPath_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importPath_3_0, grammarAccess.getMyObjectAccess().getImportPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importPath",
            						lv_importPath_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMyObject"


    // $ANTLR start "entryRuleMyPort"
    // InternalMyDsl.g:185:1: entryRuleMyPort returns [EObject current=null] : iv_ruleMyPort= ruleMyPort EOF ;
    public final EObject entryRuleMyPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyPort = null;


        try {
            // InternalMyDsl.g:185:47: (iv_ruleMyPort= ruleMyPort EOF )
            // InternalMyDsl.g:186:2: iv_ruleMyPort= ruleMyPort EOF
            {
             newCompositeNode(grammarAccess.getMyPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyPort=ruleMyPort();

            state._fsp--;

             current =iv_ruleMyPort; 
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
    // $ANTLR end "entryRuleMyPort"


    // $ANTLR start "ruleMyPort"
    // InternalMyDsl.g:192:1: ruleMyPort returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMyPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:198:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:199:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:199:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:200:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMyDsl.g:200:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:201:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:201:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:202:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyPortRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getMyPortAccess().getObjectMyObjectCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMyPortAccess().getFullStopKeyword_1());
            		
            // InternalMyDsl.g:217:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:218:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:218:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:219:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMyPortRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getMyPortAccess().getPortPortCrossReference_2_0());
            				

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
    // $ANTLR end "ruleMyPort"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});

}