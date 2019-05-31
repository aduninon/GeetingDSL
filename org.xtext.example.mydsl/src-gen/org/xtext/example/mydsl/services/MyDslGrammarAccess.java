/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cMyObjectAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cMyObjectMyObjectParserRuleCall_0_0 = (RuleCall)cMyObjectAssignment_0.eContents().get(0);
		private final Assignment cMyPortAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cMyPortMyPortParserRuleCall_1_0 = (RuleCall)cMyPortAssignment_1.eContents().get(0);
		
		//Model:
		//	(myObject+=MyObject | myPort+=MyPort)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(myObject+=MyObject | myPort+=MyPort)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//myObject+=MyObject
		public Assignment getMyObjectAssignment_0() { return cMyObjectAssignment_0; }
		
		//MyObject
		public RuleCall getMyObjectMyObjectParserRuleCall_0_0() { return cMyObjectMyObjectParserRuleCall_0_0; }
		
		//myPort+=MyPort
		public Assignment getMyPortAssignment_1() { return cMyPortAssignment_1; }
		
		//MyPort
		public RuleCall getMyPortMyPortParserRuleCall_1_0() { return cMyPortMyPortParserRuleCall_1_0; }
	}
	public class MyObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.MyObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMyobjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cImportKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cImportPathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cImportPathSTRINGTerminalRuleCall_3_0 = (RuleCall)cImportPathAssignment_3.eContents().get(0);
		
		//MyObject:
		//	'myobject' name=ID 'import' importPath=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'myobject' name=ID 'import' importPath=STRING
		public Group getGroup() { return cGroup; }
		
		//'myobject'
		public Keyword getMyobjectKeyword_0() { return cMyobjectKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'import'
		public Keyword getImportKeyword_2() { return cImportKeyword_2; }
		
		//importPath=STRING
		public Assignment getImportPathAssignment_3() { return cImportPathAssignment_3; }
		
		//STRING
		public RuleCall getImportPathSTRINGTerminalRuleCall_3_0() { return cImportPathSTRINGTerminalRuleCall_3_0; }
	}
	public class MyPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.MyPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cObjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cObjectMyObjectCrossReference_0_0 = (CrossReference)cObjectAssignment_0.eContents().get(0);
		private final RuleCall cObjectMyObjectIDTerminalRuleCall_0_0_1 = (RuleCall)cObjectMyObjectCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPortAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPortPortCrossReference_2_0 = (CrossReference)cPortAssignment_2.eContents().get(0);
		private final RuleCall cPortPortIDTerminalRuleCall_2_0_1 = (RuleCall)cPortPortCrossReference_2_0.eContents().get(1);
		
		//MyPort:
		//	object=[MyObject] '.' port=[thingml::Port];
		@Override public ParserRule getRule() { return rule; }
		
		//object=[MyObject] '.' port=[thingml::Port]
		public Group getGroup() { return cGroup; }
		
		//object=[MyObject]
		public Assignment getObjectAssignment_0() { return cObjectAssignment_0; }
		
		//[MyObject]
		public CrossReference getObjectMyObjectCrossReference_0_0() { return cObjectMyObjectCrossReference_0_0; }
		
		//ID
		public RuleCall getObjectMyObjectIDTerminalRuleCall_0_0_1() { return cObjectMyObjectIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//port=[thingml::Port]
		public Assignment getPortAssignment_2() { return cPortAssignment_2; }
		
		//[thingml::Port]
		public CrossReference getPortPortCrossReference_2_0() { return cPortPortCrossReference_2_0; }
		
		//ID
		public RuleCall getPortPortIDTerminalRuleCall_2_0_1() { return cPortPortIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final MyObjectElements pMyObject;
	private final MyPortElements pMyPort;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pMyObject = new MyObjectElements();
		this.pMyPort = new MyPortElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	(myObject+=MyObject | myPort+=MyPort)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//MyObject:
	//	'myobject' name=ID 'import' importPath=STRING;
	public MyObjectElements getMyObjectAccess() {
		return pMyObject;
	}
	
	public ParserRule getMyObjectRule() {
		return getMyObjectAccess().getRule();
	}
	
	//MyPort:
	//	object=[MyObject] '.' port=[thingml::Port];
	public MyPortElements getMyPortAccess() {
		return pMyPort;
	}
	
	public ParserRule getMyPortRule() {
		return getMyPortAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
