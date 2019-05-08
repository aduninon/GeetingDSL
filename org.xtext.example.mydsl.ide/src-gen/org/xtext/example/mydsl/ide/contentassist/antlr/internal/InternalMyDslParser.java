package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalMyDsl.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMyObject"
    // InternalMyDsl.g:78:1: entryRuleMyObject : ruleMyObject EOF ;
    public final void entryRuleMyObject() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleMyObject EOF )
            // InternalMyDsl.g:80:1: ruleMyObject EOF
            {
             before(grammarAccess.getMyObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleMyObject();

            state._fsp--;

             after(grammarAccess.getMyObjectRule()); 
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
    // $ANTLR end "entryRuleMyObject"


    // $ANTLR start "ruleMyObject"
    // InternalMyDsl.g:87:1: ruleMyObject : ( ( rule__MyObject__Group__0 ) ) ;
    public final void ruleMyObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__MyObject__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__MyObject__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__MyObject__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__MyObject__Group__0 )
            {
             before(grammarAccess.getMyObjectAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__MyObject__Group__0 )
            // InternalMyDsl.g:94:4: rule__MyObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyObject"


    // $ANTLR start "entryRuleMyPort"
    // InternalMyDsl.g:103:1: entryRuleMyPort : ruleMyPort EOF ;
    public final void entryRuleMyPort() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMyPort EOF )
            // InternalMyDsl.g:105:1: ruleMyPort EOF
            {
             before(grammarAccess.getMyPortRule()); 
            pushFollow(FOLLOW_1);
            ruleMyPort();

            state._fsp--;

             after(grammarAccess.getMyPortRule()); 
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
    // $ANTLR end "entryRuleMyPort"


    // $ANTLR start "ruleMyPort"
    // InternalMyDsl.g:112:1: ruleMyPort : ( ( rule__MyPort__Group__0 ) ) ;
    public final void ruleMyPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__MyPort__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__MyPort__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__MyPort__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__MyPort__Group__0 )
            {
             before(grammarAccess.getMyPortAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__MyPort__Group__0 )
            // InternalMyDsl.g:119:4: rule__MyPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyPort"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalMyDsl.g:127:1: rule__Model__Alternatives : ( ( ( rule__Model__MyObjectAssignment_0 ) ) | ( ( rule__Model__MyPortAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( ( ( rule__Model__MyObjectAssignment_0 ) ) | ( ( rule__Model__MyPortAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:132:2: ( ( rule__Model__MyObjectAssignment_0 ) )
                    {
                    // InternalMyDsl.g:132:2: ( ( rule__Model__MyObjectAssignment_0 ) )
                    // InternalMyDsl.g:133:3: ( rule__Model__MyObjectAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getMyObjectAssignment_0()); 
                    // InternalMyDsl.g:134:3: ( rule__Model__MyObjectAssignment_0 )
                    // InternalMyDsl.g:134:4: rule__Model__MyObjectAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__MyObjectAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getMyObjectAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:138:2: ( ( rule__Model__MyPortAssignment_1 ) )
                    {
                    // InternalMyDsl.g:138:2: ( ( rule__Model__MyPortAssignment_1 ) )
                    // InternalMyDsl.g:139:3: ( rule__Model__MyPortAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getMyPortAssignment_1()); 
                    // InternalMyDsl.g:140:3: ( rule__Model__MyPortAssignment_1 )
                    // InternalMyDsl.g:140:4: rule__Model__MyPortAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__MyPortAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getMyPortAssignment_1()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__MyObject__Group__0"
    // InternalMyDsl.g:148:1: rule__MyObject__Group__0 : rule__MyObject__Group__0__Impl rule__MyObject__Group__1 ;
    public final void rule__MyObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:152:1: ( rule__MyObject__Group__0__Impl rule__MyObject__Group__1 )
            // InternalMyDsl.g:153:2: rule__MyObject__Group__0__Impl rule__MyObject__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MyObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__0"


    // $ANTLR start "rule__MyObject__Group__0__Impl"
    // InternalMyDsl.g:160:1: rule__MyObject__Group__0__Impl : ( 'myobject' ) ;
    public final void rule__MyObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:164:1: ( ( 'myobject' ) )
            // InternalMyDsl.g:165:1: ( 'myobject' )
            {
            // InternalMyDsl.g:165:1: ( 'myobject' )
            // InternalMyDsl.g:166:2: 'myobject'
            {
             before(grammarAccess.getMyObjectAccess().getMyobjectKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMyObjectAccess().getMyobjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__0__Impl"


    // $ANTLR start "rule__MyObject__Group__1"
    // InternalMyDsl.g:175:1: rule__MyObject__Group__1 : rule__MyObject__Group__1__Impl rule__MyObject__Group__2 ;
    public final void rule__MyObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:179:1: ( rule__MyObject__Group__1__Impl rule__MyObject__Group__2 )
            // InternalMyDsl.g:180:2: rule__MyObject__Group__1__Impl rule__MyObject__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MyObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__1"


    // $ANTLR start "rule__MyObject__Group__1__Impl"
    // InternalMyDsl.g:187:1: rule__MyObject__Group__1__Impl : ( ( rule__MyObject__NameAssignment_1 ) ) ;
    public final void rule__MyObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:1: ( ( ( rule__MyObject__NameAssignment_1 ) ) )
            // InternalMyDsl.g:192:1: ( ( rule__MyObject__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:192:1: ( ( rule__MyObject__NameAssignment_1 ) )
            // InternalMyDsl.g:193:2: ( rule__MyObject__NameAssignment_1 )
            {
             before(grammarAccess.getMyObjectAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:194:2: ( rule__MyObject__NameAssignment_1 )
            // InternalMyDsl.g:194:3: rule__MyObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__1__Impl"


    // $ANTLR start "rule__MyObject__Group__2"
    // InternalMyDsl.g:202:1: rule__MyObject__Group__2 : rule__MyObject__Group__2__Impl rule__MyObject__Group__3 ;
    public final void rule__MyObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( rule__MyObject__Group__2__Impl rule__MyObject__Group__3 )
            // InternalMyDsl.g:207:2: rule__MyObject__Group__2__Impl rule__MyObject__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MyObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__2"


    // $ANTLR start "rule__MyObject__Group__2__Impl"
    // InternalMyDsl.g:214:1: rule__MyObject__Group__2__Impl : ( 'import' ) ;
    public final void rule__MyObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:218:1: ( ( 'import' ) )
            // InternalMyDsl.g:219:1: ( 'import' )
            {
            // InternalMyDsl.g:219:1: ( 'import' )
            // InternalMyDsl.g:220:2: 'import'
            {
             before(grammarAccess.getMyObjectAccess().getImportKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMyObjectAccess().getImportKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__2__Impl"


    // $ANTLR start "rule__MyObject__Group__3"
    // InternalMyDsl.g:229:1: rule__MyObject__Group__3 : rule__MyObject__Group__3__Impl ;
    public final void rule__MyObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:1: ( rule__MyObject__Group__3__Impl )
            // InternalMyDsl.g:234:2: rule__MyObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__3"


    // $ANTLR start "rule__MyObject__Group__3__Impl"
    // InternalMyDsl.g:240:1: rule__MyObject__Group__3__Impl : ( ( rule__MyObject__ImportPathAssignment_3 ) ) ;
    public final void rule__MyObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:244:1: ( ( ( rule__MyObject__ImportPathAssignment_3 ) ) )
            // InternalMyDsl.g:245:1: ( ( rule__MyObject__ImportPathAssignment_3 ) )
            {
            // InternalMyDsl.g:245:1: ( ( rule__MyObject__ImportPathAssignment_3 ) )
            // InternalMyDsl.g:246:2: ( rule__MyObject__ImportPathAssignment_3 )
            {
             before(grammarAccess.getMyObjectAccess().getImportPathAssignment_3()); 
            // InternalMyDsl.g:247:2: ( rule__MyObject__ImportPathAssignment_3 )
            // InternalMyDsl.g:247:3: rule__MyObject__ImportPathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MyObject__ImportPathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMyObjectAccess().getImportPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__Group__3__Impl"


    // $ANTLR start "rule__MyPort__Group__0"
    // InternalMyDsl.g:256:1: rule__MyPort__Group__0 : rule__MyPort__Group__0__Impl rule__MyPort__Group__1 ;
    public final void rule__MyPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( rule__MyPort__Group__0__Impl rule__MyPort__Group__1 )
            // InternalMyDsl.g:261:2: rule__MyPort__Group__0__Impl rule__MyPort__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MyPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__Group__0"


    // $ANTLR start "rule__MyPort__Group__0__Impl"
    // InternalMyDsl.g:268:1: rule__MyPort__Group__0__Impl : ( ( rule__MyPort__ObjectAssignment_0 ) ) ;
    public final void rule__MyPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( ( ( rule__MyPort__ObjectAssignment_0 ) ) )
            // InternalMyDsl.g:273:1: ( ( rule__MyPort__ObjectAssignment_0 ) )
            {
            // InternalMyDsl.g:273:1: ( ( rule__MyPort__ObjectAssignment_0 ) )
            // InternalMyDsl.g:274:2: ( rule__MyPort__ObjectAssignment_0 )
            {
             before(grammarAccess.getMyPortAccess().getObjectAssignment_0()); 
            // InternalMyDsl.g:275:2: ( rule__MyPort__ObjectAssignment_0 )
            // InternalMyDsl.g:275:3: rule__MyPort__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MyPort__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMyPortAccess().getObjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__Group__0__Impl"


    // $ANTLR start "rule__MyPort__Group__1"
    // InternalMyDsl.g:283:1: rule__MyPort__Group__1 : rule__MyPort__Group__1__Impl rule__MyPort__Group__2 ;
    public final void rule__MyPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:287:1: ( rule__MyPort__Group__1__Impl rule__MyPort__Group__2 )
            // InternalMyDsl.g:288:2: rule__MyPort__Group__1__Impl rule__MyPort__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MyPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__Group__1"


    // $ANTLR start "rule__MyPort__Group__1__Impl"
    // InternalMyDsl.g:295:1: rule__MyPort__Group__1__Impl : ( '.' ) ;
    public final void rule__MyPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( ( '.' ) )
            // InternalMyDsl.g:300:1: ( '.' )
            {
            // InternalMyDsl.g:300:1: ( '.' )
            // InternalMyDsl.g:301:2: '.'
            {
             before(grammarAccess.getMyPortAccess().getFullStopKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMyPortAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__Group__1__Impl"


    // $ANTLR start "rule__MyPort__Group__2"
    // InternalMyDsl.g:310:1: rule__MyPort__Group__2 : rule__MyPort__Group__2__Impl ;
    public final void rule__MyPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( rule__MyPort__Group__2__Impl )
            // InternalMyDsl.g:315:2: rule__MyPort__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__Group__2"


    // $ANTLR start "rule__MyPort__Group__2__Impl"
    // InternalMyDsl.g:321:1: rule__MyPort__Group__2__Impl : ( ( rule__MyPort__PortAssignment_2 ) ) ;
    public final void rule__MyPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:325:1: ( ( ( rule__MyPort__PortAssignment_2 ) ) )
            // InternalMyDsl.g:326:1: ( ( rule__MyPort__PortAssignment_2 ) )
            {
            // InternalMyDsl.g:326:1: ( ( rule__MyPort__PortAssignment_2 ) )
            // InternalMyDsl.g:327:2: ( rule__MyPort__PortAssignment_2 )
            {
             before(grammarAccess.getMyPortAccess().getPortAssignment_2()); 
            // InternalMyDsl.g:328:2: ( rule__MyPort__PortAssignment_2 )
            // InternalMyDsl.g:328:3: rule__MyPort__PortAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MyPort__PortAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMyPortAccess().getPortAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__Group__2__Impl"


    // $ANTLR start "rule__Model__MyObjectAssignment_0"
    // InternalMyDsl.g:337:1: rule__Model__MyObjectAssignment_0 : ( ruleMyObject ) ;
    public final void rule__Model__MyObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( ( ruleMyObject ) )
            // InternalMyDsl.g:342:2: ( ruleMyObject )
            {
            // InternalMyDsl.g:342:2: ( ruleMyObject )
            // InternalMyDsl.g:343:3: ruleMyObject
            {
             before(grammarAccess.getModelAccess().getMyObjectMyObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMyObject();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMyObjectMyObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MyObjectAssignment_0"


    // $ANTLR start "rule__Model__MyPortAssignment_1"
    // InternalMyDsl.g:352:1: rule__Model__MyPortAssignment_1 : ( ruleMyPort ) ;
    public final void rule__Model__MyPortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( ( ruleMyPort ) )
            // InternalMyDsl.g:357:2: ( ruleMyPort )
            {
            // InternalMyDsl.g:357:2: ( ruleMyPort )
            // InternalMyDsl.g:358:3: ruleMyPort
            {
             before(grammarAccess.getModelAccess().getMyPortMyPortParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMyPort();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMyPortMyPortParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MyPortAssignment_1"


    // $ANTLR start "rule__MyObject__NameAssignment_1"
    // InternalMyDsl.g:367:1: rule__MyObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MyObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:371:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:372:2: ( RULE_ID )
            {
            // InternalMyDsl.g:372:2: ( RULE_ID )
            // InternalMyDsl.g:373:3: RULE_ID
            {
             before(grammarAccess.getMyObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMyObjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__NameAssignment_1"


    // $ANTLR start "rule__MyObject__ImportPathAssignment_3"
    // InternalMyDsl.g:382:1: rule__MyObject__ImportPathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MyObject__ImportPathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:387:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:387:2: ( RULE_STRING )
            // InternalMyDsl.g:388:3: RULE_STRING
            {
             before(grammarAccess.getMyObjectAccess().getImportPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMyObjectAccess().getImportPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyObject__ImportPathAssignment_3"


    // $ANTLR start "rule__MyPort__ObjectAssignment_0"
    // InternalMyDsl.g:397:1: rule__MyPort__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MyPort__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:402:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:402:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:403:3: ( RULE_ID )
            {
             before(grammarAccess.getMyPortAccess().getObjectMyObjectCrossReference_0_0()); 
            // InternalMyDsl.g:404:3: ( RULE_ID )
            // InternalMyDsl.g:405:4: RULE_ID
            {
             before(grammarAccess.getMyPortAccess().getObjectMyObjectIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMyPortAccess().getObjectMyObjectIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMyPortAccess().getObjectMyObjectCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__ObjectAssignment_0"


    // $ANTLR start "rule__MyPort__PortAssignment_2"
    // InternalMyDsl.g:416:1: rule__MyPort__PortAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MyPort__PortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:421:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:421:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:422:3: ( RULE_ID )
            {
             before(grammarAccess.getMyPortAccess().getPortPortCrossReference_2_0()); 
            // InternalMyDsl.g:423:3: ( RULE_ID )
            // InternalMyDsl.g:424:4: RULE_ID
            {
             before(grammarAccess.getMyPortAccess().getPortPortIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMyPortAccess().getPortPortIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMyPortAccess().getPortPortCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyPort__PortAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});

}