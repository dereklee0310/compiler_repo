// $ANTLR null C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g 2023-05-12 02:28:23

    // import packages here.
    import java.util.HashMap;
	import java.util.Map;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class myCheckerParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTO", "BOOL", "BREAK", "CHAR", 
		"CHARACTER_LITERAL", "COMMENT", "CONST", "CONTINUE", "DECIMAL_LITERAL", 
		"DO", "DOUBLE", "ELSE", "EXTERN", "EscapeSequence", "FLOAT", "FLOATING_POINT_LITERAL", 
		"FOR", "GOTO", "IDENTIFIER", "IF", "INT", "LETTER", "LINE_COMMAND", "LINE_COMMENT", 
		"LONG", "MAIN", "REGISTER", "RETURN", "SHORT", "SIGNED", "STATIC", "STRING_LITERAL", 
		"SWITCH", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "WS", "'!'", "'!='", 
		"'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'**'", "'*='", 
		"'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'...'", 
		"'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", 
		"'>'", "'>='", "'>>'", "'>>='", "'?'", "'['", "']'", "'^'", "'^='", "'case'", 
		"'default'", "'sizeof'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int AUTO=4;
	public static final int BOOL=5;
	public static final int BREAK=6;
	public static final int CHAR=7;
	public static final int CHARACTER_LITERAL=8;
	public static final int COMMENT=9;
	public static final int CONST=10;
	public static final int CONTINUE=11;
	public static final int DECIMAL_LITERAL=12;
	public static final int DO=13;
	public static final int DOUBLE=14;
	public static final int ELSE=15;
	public static final int EXTERN=16;
	public static final int EscapeSequence=17;
	public static final int FLOAT=18;
	public static final int FLOATING_POINT_LITERAL=19;
	public static final int FOR=20;
	public static final int GOTO=21;
	public static final int IDENTIFIER=22;
	public static final int IF=23;
	public static final int INT=24;
	public static final int LETTER=25;
	public static final int LINE_COMMAND=26;
	public static final int LINE_COMMENT=27;
	public static final int LONG=28;
	public static final int MAIN=29;
	public static final int REGISTER=30;
	public static final int RETURN=31;
	public static final int SHORT=32;
	public static final int SIGNED=33;
	public static final int STATIC=34;
	public static final int STRING_LITERAL=35;
	public static final int SWITCH=36;
	public static final int UNSIGNED=37;
	public static final int VOID=38;
	public static final int VOLATILE=39;
	public static final int WHILE=40;
	public static final int WS=41;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred117_myChecker", "synpred78_myChecker", "synpred111_myChecker", 
		"parameter_declaration", "synpred83_myChecker", "synpred96_myChecker", 
		"synpred80_myChecker", "statement_list", "synpred20_myChecker", "synpred22_myChecker", 
		"synpred44_myChecker", "synpred2_myChecker", "synpred10_myChecker", "specifier_qualifier_list", 
		"declaration", "storage_class_specifier", "synpred49_myChecker", "synpred74_myChecker", 
		"cast_expression", "type_name", "synpred93_myChecker", "expression_statement", 
		"synpred88_myChecker", "synpred105_myChecker", "init_declarator", "synpred58_myChecker", 
		"additive_expression", "synpred16_myChecker", "synpred34_myChecker", "synpred115_myChecker", 
		"assignment_expression", "synpred69_myChecker", "synpred13_myChecker", 
		"identifier_list", "synpred4_myChecker", "synpred17_myChecker", "synpred19_myChecker", 
		"synpred37_myChecker", "declaration_specifiers", "synpred109_myChecker", 
		"synpred101_myChecker", "unary_operator", "synpred31_myChecker", "parameter_type_list", 
		"synpred6_myChecker", "synpred100_myChecker", "synpred50_myChecker", "synpred68_myChecker", 
		"synpred87_myChecker", "synpred118_myChecker", "synpred8_myChecker", "synpred70_myChecker", 
		"synpred92_myChecker", "synpred121_myChecker", "synpred65_myChecker", 
		"synpred9_myChecker", "synpred32_myChecker", "synpred106_myChecker", "synpred71_myChecker", 
		"synpred129_myChecker", "synpred57_myChecker", "type_specifier", "synpred28_myChecker", 
		"synpred114_myChecker", "and_expression", "expression", "synpred38_myChecker", 
		"declarator", "synpred35_myChecker", "synpred43_myChecker", "statement", 
		"selection_statement", "synpred77_myChecker", "synpred47_myChecker", "assignment_operator", 
		"synpred7_myChecker", "synpred25_myChecker", "exclusive_or_expression", 
		"synpred90_myChecker", "synpred85_myChecker", "iteration_statement", "synpred53_myChecker", 
		"argument_expression_list", "logical_and_expression", "synpred81_myChecker", 
		"synpred62_myChecker", "synpred103_myChecker", "synpred99_myChecker", 
		"lvalue", "multiplicative_expression", "synpred60_myChecker", "synpred84_myChecker", 
		"synpred104_myChecker", "synpred12_myChecker", "synpred56_myChecker", 
		"synpred119_myChecker", "conditional_expression", "synpred41_myChecker", 
		"synpred127_myChecker", "synpred126_myChecker", "synpred48_myChecker", 
		"synpred40_myChecker", "synpred123_myChecker", "initializer", "synpred51_myChecker", 
		"labeled_statement", "synpred94_myChecker", "synpred113_myChecker", "synpred54_myChecker", 
		"synpred21_myChecker", "synpred128_myChecker", "shift_expression", "synpred15_myChecker", 
		"synpred45_myChecker", "synpred89_myChecker", "constant", "synpred61_myChecker", 
		"synpred125_myChecker", "synpred30_myChecker", "synpred63_myChecker", 
		"synpred79_myChecker", "direct_declarator", "synpred46_myChecker", "synpred122_myChecker", 
		"postfix_expression", "synpred97_myChecker", "synpred107_myChecker", "synpred124_myChecker", 
		"compound_statement", "synpred18_myChecker", "synpred72_myChecker", "type_qualifier", 
		"synpred27_myChecker", "abstract_declarator", "synpred95_myChecker", "synpred42_myChecker", 
		"direct_abstract_declarator", "synpred116_myChecker", "declarator_suffix", 
		"synpred3_myChecker", "synpred55_myChecker", "program", "synpred39_myChecker", 
		"synpred11_myChecker", "initializer_list", "parameter_list", "synpred73_myChecker", 
		"relational_expression", "constant_expression", "synpred29_myChecker", 
		"synpred52_myChecker", "abstract_declarator_suffix", "synpred24_myChecker", 
		"inclusive_or_expression", "logical_or_expression", "synpred33_myChecker", 
		"synpred75_myChecker", "synpred23_myChecker", "jump_statement", "synpred59_myChecker", 
		"synpred120_myChecker", "synpred112_myChecker", "synpred76_myChecker", 
		"synpred14_myChecker", "synpred64_myChecker", "pointer", "synpred98_myChecker", 
		"synpred91_myChecker", "synpred102_myChecker", "synpred110_myChecker", 
		"synpred26_myChecker", "synpred36_myChecker", "synpred82_myChecker", "init_declarator_list", 
		"primary_expression", "synpred5_myChecker", "synpred67_myChecker", "synpred86_myChecker", 
		"synpred108_myChecker", "equality_expression", "synpred66_myChecker", 
		"synpred1_myChecker", "unary_expression"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, true, false, true, false, false, true, 
		    true, false, false, true, false, true, false, false, true, false, 
		    false, false, false, false, false, false, false, true, false, false, 
		    false, false, false, true, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public myCheckerParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public myCheckerParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[183+1];


		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public myCheckerParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
		this.state.ruleMemo = new HashMap[183+1];


	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return myCheckerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g"; }


	    boolean TRACEON = false;
		enum Type {
			VOID, CHAR, SHORT, INT, LONG, FLOAT, DOUBLE, SIGNED, UNSIGNED, BOOL, CHARS, ERROR; // CHARS for string
		}
		HashMap<String,Type> symbolTable = new HashMap<String,Type>();



	// $ANTLR start "program"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:31:1: program : ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' ( ( declaration )+ compound_statement | compound_statement ) ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:5: ( ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' ( ( declaration )+ compound_statement | compound_statement ) )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:7: ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' ( ( declaration )+ compound_statement | compound_statement )
			{
			dbg.location(32,7);
			if ( input.LA(1)==INT||input.LA(1)==VOID ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(32,20);
			match(input,MAIN,FOLLOW_MAIN_in_program83); if (state.failed) return;dbg.location(32,25);
			match(input,49,FOLLOW_49_in_program85); if (state.failed) return;dbg.location(32,29);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:29: ( INT IDENTIFIER )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==INT) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:30: INT IDENTIFIER
					{
					dbg.location(32,30);
					match(input,INT,FOLLOW_INT_in_program88); if (state.failed) return;dbg.location(32,34);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program90); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(32,47);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:47: ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )?
			int alt2=3;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==57) ) {
				alt2=1;
			}
			else if ( (LA2_0==CHAR) ) {
				alt2=2;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:48: ',' ( CHAR '**' IDENTIFIER )
					{
					dbg.location(32,48);
					match(input,57,FOLLOW_57_in_program95); if (state.failed) return;dbg.location(32,52);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:52: ( CHAR '**' IDENTIFIER )
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:53: CHAR '**' IDENTIFIER
					{
					dbg.location(32,53);
					match(input,CHAR,FOLLOW_CHAR_in_program98); if (state.failed) return;dbg.location(32,58);
					match(input,52,FOLLOW_52_in_program100); if (state.failed) return;dbg.location(32,63);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program102); if (state.failed) return;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:77: ( CHAR '*' IDENTIFIER '[' ']' )
					{
					dbg.location(32,77);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:77: ( CHAR '*' IDENTIFIER '[' ']' )
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:78: CHAR '*' IDENTIFIER '[' ']'
					{
					dbg.location(32,78);
					match(input,CHAR,FOLLOW_CHAR_in_program108); if (state.failed) return;dbg.location(32,83);
					match(input,51,FOLLOW_51_in_program110); if (state.failed) return;dbg.location(32,87);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program112); if (state.failed) return;dbg.location(32,98);
					match(input,79,FOLLOW_79_in_program114); if (state.failed) return;dbg.location(32,102);
					match(input,80,FOLLOW_80_in_program116); if (state.failed) return;
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(32,109);
			match(input,50,FOLLOW_50_in_program121); if (state.failed) return;dbg.location(32,113);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:113: ( ( declaration )+ compound_statement | compound_statement )
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= AUTO && LA4_0 <= BOOL)||LA4_0==CHAR||LA4_0==CONST||LA4_0==DOUBLE||LA4_0==EXTERN||LA4_0==FLOAT||LA4_0==INT||LA4_0==LONG||LA4_0==REGISTER||(LA4_0 >= SHORT && LA4_0 <= STATIC)||(LA4_0 >= UNSIGNED && LA4_0 <= VOLATILE)) ) {
				alt4=1;
			}
			else if ( (LA4_0==86) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:115: ( declaration )+ compound_statement
					{
					dbg.location(32,115);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:115: ( declaration )+
					int cnt3=0;
					try { dbg.enterSubRule(3);

					loop3:
					while (true) {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= AUTO && LA3_0 <= BOOL)||LA3_0==CHAR||LA3_0==CONST||LA3_0==DOUBLE||LA3_0==EXTERN||LA3_0==FLOAT||LA3_0==INT||LA3_0==LONG||LA3_0==REGISTER||(LA3_0 >= SHORT && LA3_0 <= STATIC)||(LA3_0 >= UNSIGNED && LA3_0 <= VOLATILE)) ) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:115: declaration
							{
							dbg.location(32,115);
							pushFollow(FOLLOW_declaration_in_program125);
							declaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(3, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt3++;
					}
					} finally {dbg.exitSubRule(3);}
					dbg.location(32,128);
					pushFollow(FOLLOW_compound_statement_in_program128);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:149: compound_statement
					{
					dbg.location(32,149);
					pushFollow(FOLLOW_compound_statement_in_program132);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(33,5);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("program: (VOID | INT) MAIN '(' (INT IDENTIFIER)? (',' (CHAR '**' IDENTIFIER) | (CHAR '*' IDENTIFIER '[' ']'))? ')' compound_statement"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
		dbg.location(34, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:37:1: declaration : declaration_specifiers ( init_declarator_list[identifiers] )? ';' ;
	public final void declaration() throws RecognitionException {
		int declaration_StartIndex = input.index();

		ParserRuleReturnScope init_declarator_list1 =null;
		ParserRuleReturnScope declaration_specifiers2 =null;

		 HashMap<String, Type> identifiers = new HashMap<String, Type>(); 
		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:39:5: ( declaration_specifiers ( init_declarator_list[identifiers] )? ';' )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:39:7: declaration_specifiers ( init_declarator_list[identifiers] )? ';'
			{
			dbg.location(39,7);
			pushFollow(FOLLOW_declaration_specifiers_in_declaration162);
			declaration_specifiers2=declaration_specifiers();
			state._fsp--;
			if (state.failed) return;dbg.location(39,30);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:39:30: ( init_declarator_list[identifiers] )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==IDENTIFIER||LA5_0==49||LA5_0==51) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:39:30: init_declarator_list[identifiers]
					{
					dbg.location(39,30);
					pushFollow(FOLLOW_init_declarator_list_in_declaration164);
					init_declarator_list1=init_declarator_list(identifiers);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(39,65);
			match(input,67,FOLLOW_67_in_declaration168); if (state.failed) return;dbg.location(40,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("declaration: declaration_specifiers init_declarator_list? ';'");

						if((init_declarator_list1!=null?input.toString(init_declarator_list1.start,init_declarator_list1.stop):null) != null) {
							Type specifier = (declaration_specifiers2!=null?((myCheckerParser.declaration_specifiers_return)declaration_specifiers2).specifier:null);
							for(Map.Entry<String, Type> entry: identifiers.entrySet()) {
								String id = entry.getKey();
								Type type = entry.getValue();
								// System.out.println(specifier + "_" + id + "_" + type);

								if(symbolTable.containsKey(id)) {
									System.out.println("Error! " + (declaration_specifiers2!=null?(declaration_specifiers2.start):null).getLine() + ": Redeclared identifier ");
								} else {
									if(specifier == Type.VOID || specifier == Type.CHAR || specifier == Type.BOOL || specifier == Type.CHARS) {
										if(type != specifier && type != null)
											System.out.println("Error! " + (declaration_specifiers2!=null?(declaration_specifiers2.start):null).getLine() + ": Type mismatch while initializing a variable ");
									} else if(type != null && ((specifier == Type.SHORT && (type != Type.CHAR && type != Type.SHORT))
											|| (specifier == Type.INT && (type != Type.CHAR && type != Type.SHORT && type != Type.INT))
											|| (specifier == Type.LONG && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG))
											|| (specifier == Type.FLOAT && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG && type != Type.FLOAT))
											|| (specifier == Type.DOUBLE && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG && type != Type.FLOAT && type != Type.DOUBLE))))
										System.out.println("Error! " + (declaration_specifiers2!=null?(declaration_specifiers2.start):null).getLine() + ": Type mismatch while initializing a variable ");
									symbolTable.put(id, specifier);
								}
								// VOID, CHAR, SHORT, INT, LONG, FLOAT, DOUBLE, SIGNED, UNSIGNED, BOOL, CHARS;
							}
						}
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, declaration_StartIndex); }

		}
		dbg.location(69, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declaration"


	public static class init_declarator_list_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "init_declarator_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:72:1: init_declarator_list[HashMap<String, Type> identifiers] : init_declarator[identifiers] ( ',' init_declarator[identifiers] )* ;
	public final myCheckerParser.init_declarator_list_return init_declarator_list(HashMap<String, Type> identifiers) throws RecognitionException {
		myCheckerParser.init_declarator_list_return retval = new myCheckerParser.init_declarator_list_return();
		retval.start = input.LT(1);
		int init_declarator_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "init_declarator_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:74:2: ( init_declarator[identifiers] ( ',' init_declarator[identifiers] )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:74:4: init_declarator[identifiers] ( ',' init_declarator[identifiers] )*
			{
			dbg.location(74,4);
			pushFollow(FOLLOW_init_declarator_in_init_declarator_list187);
			init_declarator(identifiers);
			state._fsp--;
			if (state.failed) return retval;dbg.location(74,33);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:74:33: ( ',' init_declarator[identifiers] )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==57) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:74:34: ',' init_declarator[identifiers]
					{
					dbg.location(74,34);
					match(input,57,FOLLOW_57_in_init_declarator_list191); if (state.failed) return retval;dbg.location(74,38);
					pushFollow(FOLLOW_init_declarator_in_init_declarator_list193);
					init_declarator(identifiers);
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(75,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("init_declarator_list: init_declarator (',' init_declarator)*");
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, init_declarator_list_StartIndex); }

		}
		dbg.location(79, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init_declarator_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "init_declarator_list"



	// $ANTLR start "init_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:82:1: init_declarator[HashMap<String, Type> identifiers] : declarator ( '=' initializer )? ;
	public final void init_declarator(HashMap<String, Type> identifiers) throws RecognitionException {
		int init_declarator_StartIndex = input.index();

		ParserRuleReturnScope initializer3 =null;
		String declarator4 =null;

		try { dbg.enterRule(getGrammarFileName(), "init_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:84:2: ( declarator ( '=' initializer )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:84:4: declarator ( '=' initializer )?
			{
			dbg.location(84,4);
			pushFollow(FOLLOW_declarator_in_init_declarator215);
			declarator4=declarator();
			state._fsp--;
			if (state.failed) return;dbg.location(84,15);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:84:15: ( '=' initializer )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==72) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:84:16: '=' initializer
					{
					dbg.location(84,16);
					match(input,72,FOLLOW_72_in_init_declarator218); if (state.failed) return;dbg.location(84,20);
					pushFollow(FOLLOW_initializer_in_init_declarator220);
					initializer3=initializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(85,3);
			if ( state.backtracking==0 ) {
						if(TRACEON) 
							System.out.println("init_declarator: declarator ('=' initializer)?");
						
						Type type = null;
						if((initializer3!=null?input.toString(initializer3.start,initializer3.stop):null) != null)
							type = (initializer3!=null?((myCheckerParser.initializer_return)initializer3).type:null);
						identifiers.put(declarator4, type);
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, init_declarator_StartIndex); }

		}
		dbg.location(94, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "init_declarator"


	public static class declaration_specifiers_return extends ParserRuleReturnScope {
		public Type specifier;
	};


	// $ANTLR start "declaration_specifiers"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:97:1: declaration_specifiers returns [Type specifier] : ( storage_class_specifier | type_specifier | type_qualifier )+ ;
	public final myCheckerParser.declaration_specifiers_return declaration_specifiers() throws RecognitionException {
		myCheckerParser.declaration_specifiers_return retval = new myCheckerParser.declaration_specifiers_return();
		retval.start = input.LT(1);
		int declaration_specifiers_StartIndex = input.index();

		ParserRuleReturnScope type_specifier5 =null;

		try { dbg.enterRule(getGrammarFileName(), "declaration_specifiers");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:98:2: ( ( storage_class_specifier | type_specifier | type_qualifier )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:98:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			{
			dbg.location(98,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:98:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			int cnt8=0;
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=4;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				switch ( input.LA(1) ) {
				case AUTO:
				case EXTERN:
				case REGISTER:
				case STATIC:
					{
					alt8=1;
					}
					break;
				case BOOL:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case SIGNED:
				case UNSIGNED:
				case VOID:
					{
					alt8=2;
					}
					break;
				case CONST:
				case VOLATILE:
					{
					alt8=3;
					}
					break;
				}
				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:98:5: storage_class_specifier
					{
					dbg.location(98,5);
					pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers243);
					storage_class_specifier();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:98:31: type_specifier
					{
					dbg.location(98,31);
					pushFollow(FOLLOW_type_specifier_in_declaration_specifiers247);
					type_specifier5=type_specifier();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:98:48: type_qualifier
					{
					dbg.location(98,48);
					pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers251);
					type_qualifier();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(8, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt8++;
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(99,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("declaration_specifiers: (storage_class_specifier | type_specifier | type_qualifier)+");

						if((type_specifier5!=null?input.toString(type_specifier5.start,type_specifier5.stop):null) != null)
							retval.specifier = (type_specifier5!=null?((myCheckerParser.type_specifier_return)type_specifier5).specifier:null);
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, declaration_specifiers_StartIndex); }

		}
		dbg.location(106, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration_specifiers");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declaration_specifiers"



	// $ANTLR start "type_qualifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:108:1: type_qualifier : ( CONST | VOLATILE );
	public final void type_qualifier() throws RecognitionException {
		int type_qualifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_qualifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:109:2: ( CONST | VOLATILE )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==CONST) ) {
				alt9=1;
			}
			else if ( (LA9_0==VOLATILE) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:109:4: CONST
					{
					dbg.location(109,4);
					match(input,CONST,FOLLOW_CONST_in_type_qualifier269); if (state.failed) return;dbg.location(109,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_qualifier: CONST"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:110:4: VOLATILE
					{
					dbg.location(110,4);
					match(input,VOLATILE,FOLLOW_VOLATILE_in_type_qualifier276); if (state.failed) return;dbg.location(110,13);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_qualifier: VOLATILE"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, type_qualifier_StartIndex); }

		}
		dbg.location(111, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_qualifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type_qualifier"



	// $ANTLR start "storage_class_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:113:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER );
	public final void storage_class_specifier() throws RecognitionException {
		int storage_class_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "storage_class_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:114:2: ( EXTERN | STATIC | AUTO | REGISTER )
			int alt10=4;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case EXTERN:
				{
				alt10=1;
				}
				break;
			case STATIC:
				{
				alt10=2;
				}
				break;
			case AUTO:
				{
				alt10=3;
				}
				break;
			case REGISTER:
				{
				alt10=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:114:4: EXTERN
					{
					dbg.location(114,4);
					match(input,EXTERN,FOLLOW_EXTERN_in_storage_class_specifier289); if (state.failed) return;dbg.location(114,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: EXTERN"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:115:4: STATIC
					{
					dbg.location(115,4);
					match(input,STATIC,FOLLOW_STATIC_in_storage_class_specifier296); if (state.failed) return;dbg.location(115,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: STATIC"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:116:4: AUTO
					{
					dbg.location(116,4);
					match(input,AUTO,FOLLOW_AUTO_in_storage_class_specifier303); if (state.failed) return;dbg.location(116,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: AUTO"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:117:4: REGISTER
					{
					dbg.location(117,4);
					match(input,REGISTER,FOLLOW_REGISTER_in_storage_class_specifier310); if (state.failed) return;dbg.location(117,13);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: REGISTER"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, storage_class_specifier_StartIndex); }

		}
		dbg.location(118, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "storage_class_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "storage_class_specifier"



	// $ANTLR start "type_name"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:121:1: type_name returns [Type specifier] : specifier_qualifier_list ( abstract_declarator )? ;
	public final Type type_name() throws RecognitionException {
		Type specifier = null;

		int type_name_StartIndex = input.index();

		Type specifier_qualifier_list6 =null;

		try { dbg.enterRule(getGrammarFileName(), "type_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return specifier; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:122:2: ( specifier_qualifier_list ( abstract_declarator )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:122:4: specifier_qualifier_list ( abstract_declarator )?
			{
			dbg.location(122,4);
			pushFollow(FOLLOW_specifier_qualifier_list_in_type_name328);
			specifier_qualifier_list6=specifier_qualifier_list();
			state._fsp--;
			if (state.failed) return specifier;dbg.location(122,29);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:122:29: ( abstract_declarator )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==49||LA11_0==51||LA11_0==79) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:122:29: abstract_declarator
					{
					dbg.location(122,29);
					pushFollow(FOLLOW_abstract_declarator_in_type_name330);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return specifier;
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(122,50);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_name: specifier_qualifier_list abstract_declarator?"); specifier = specifier_qualifier_list6;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, type_name_StartIndex); }

		}
		dbg.location(123, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return specifier;
	}
	// $ANTLR end "type_name"



	// $ANTLR start "specifier_qualifier_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:126:1: specifier_qualifier_list returns [Type specifier] : ( type_qualifier |qual1= type_specifier )+ ;
	public final Type specifier_qualifier_list() throws RecognitionException {
		Type specifier = null;

		int specifier_qualifier_list_StartIndex = input.index();

		ParserRuleReturnScope qual1 =null;

		try { dbg.enterRule(getGrammarFileName(), "specifier_qualifier_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return specifier; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:127:2: ( ( type_qualifier |qual1= type_specifier )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:127:4: ( type_qualifier |qual1= type_specifier )+
			{
			dbg.location(127,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:127:4: ( type_qualifier |qual1= type_specifier )+
			int cnt12=0;
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=3;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==CONST||LA12_0==VOLATILE) ) {
					alt12=1;
				}
				else if ( (LA12_0==BOOL||LA12_0==CHAR||LA12_0==DOUBLE||LA12_0==FLOAT||LA12_0==INT||LA12_0==LONG||(LA12_0 >= SHORT && LA12_0 <= SIGNED)||(LA12_0 >= UNSIGNED && LA12_0 <= VOID)) ) {
					alt12=2;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:127:5: type_qualifier
					{
					dbg.location(127,5);
					pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list350);
					type_qualifier();
					state._fsp--;
					if (state.failed) return specifier;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:127:22: qual1= type_specifier
					{
					dbg.location(127,27);
					pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list356);
					qual1=type_specifier();
					state._fsp--;
					if (state.failed) return specifier;
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return specifier;}
					EarlyExitException eee = new EarlyExitException(12, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt12++;
			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(127,45);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("specifier_qualifier_list: (type_qualifier | type_specifier)+"); specifier = (qual1!=null?((myCheckerParser.type_specifier_return)qual1).specifier:null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, specifier_qualifier_list_StartIndex); }

		}
		dbg.location(128, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specifier_qualifier_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return specifier;
	}
	// $ANTLR end "specifier_qualifier_list"


	public static class type_specifier_return extends ParserRuleReturnScope {
		public Type specifier;
	};


	// $ANTLR start "type_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:131:1: type_specifier returns [Type specifier] : ( VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOL );
	public final myCheckerParser.type_specifier_return type_specifier() throws RecognitionException {
		myCheckerParser.type_specifier_return retval = new myCheckerParser.type_specifier_return();
		retval.start = input.LT(1);
		int type_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:132:2: ( VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOL )
			int alt13=10;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case VOID:
				{
				alt13=1;
				}
				break;
			case CHAR:
				{
				alt13=2;
				}
				break;
			case SHORT:
				{
				alt13=3;
				}
				break;
			case INT:
				{
				alt13=4;
				}
				break;
			case LONG:
				{
				alt13=5;
				}
				break;
			case FLOAT:
				{
				alt13=6;
				}
				break;
			case DOUBLE:
				{
				alt13=7;
				}
				break;
			case SIGNED:
				{
				alt13=8;
				}
				break;
			case UNSIGNED:
				{
				alt13=9;
				}
				break;
			case BOOL:
				{
				alt13=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:132:4: VOID
					{
					dbg.location(132,4);
					match(input,VOID,FOLLOW_VOID_in_type_specifier376); if (state.failed) return retval;dbg.location(132,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: VOID"); retval.specifier = Type.VOID; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:133:4: CHAR
					{
					dbg.location(133,4);
					match(input,CHAR,FOLLOW_CHAR_in_type_specifier383); if (state.failed) return retval;dbg.location(133,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: CHAR"); retval.specifier = Type.CHAR; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:134:4: SHORT
					{
					dbg.location(134,4);
					match(input,SHORT,FOLLOW_SHORT_in_type_specifier390); if (state.failed) return retval;dbg.location(134,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: SHORT"); retval.specifier = Type.SHORT; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:135:4: INT
					{
					dbg.location(135,4);
					match(input,INT,FOLLOW_INT_in_type_specifier397); if (state.failed) return retval;dbg.location(135,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: INT"); retval.specifier = Type.INT; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:136:4: LONG
					{
					dbg.location(136,4);
					match(input,LONG,FOLLOW_LONG_in_type_specifier404); if (state.failed) return retval;dbg.location(136,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: LONG"); retval.specifier = Type.LONG; }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:137:4: FLOAT
					{
					dbg.location(137,4);
					match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier411); if (state.failed) return retval;dbg.location(137,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: FLOAT"); retval.specifier = Type.FLOAT; }
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:138:4: DOUBLE
					{
					dbg.location(138,4);
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier418); if (state.failed) return retval;dbg.location(138,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: DOUBLE"); retval.specifier = Type.DOUBLE; }
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:139:4: SIGNED
					{
					dbg.location(139,4);
					match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier425); if (state.failed) return retval;dbg.location(139,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: SIGNED"); retval.specifier = Type.SIGNED; }
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:140:4: UNSIGNED
					{
					dbg.location(140,4);
					match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier432); if (state.failed) return retval;dbg.location(140,13);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: UNSIGNED"); retval.specifier = Type.UNSIGNED; }
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:141:4: BOOL
					{
					dbg.location(141,4);
					match(input,BOOL,FOLLOW_BOOL_in_type_specifier439); if (state.failed) return retval;dbg.location(141,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: BOOL"); retval.specifier = Type.BOOL; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, type_specifier_StartIndex); }

		}
		dbg.location(142, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "type_specifier"



	// $ANTLR start "declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:145:1: declarator returns [String id] : ( ( pointer )? direct_declarator | pointer );
	public final String declarator() throws RecognitionException {
		String id = null;

		int declarator_StartIndex = input.index();

		String direct_declarator7 =null;

		try { dbg.enterRule(getGrammarFileName(), "declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(145, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return id; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:2: ( ( pointer )? direct_declarator | pointer )
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==51) ) {
				int LA15_1 = input.LA(2);
				if ( (synpred30_myChecker()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

			}
			else if ( (LA15_0==IDENTIFIER||LA15_0==49) ) {
				alt15=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:4: ( pointer )? direct_declarator
					{
					dbg.location(146,4);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:4: ( pointer )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==51) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:4: pointer
							{
							dbg.location(146,4);
							pushFollow(FOLLOW_pointer_in_declarator458);
							pointer();
							state._fsp--;
							if (state.failed) return id;
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(146,13);
					pushFollow(FOLLOW_direct_declarator_in_declarator461);
					direct_declarator7=direct_declarator();
					state._fsp--;
					if (state.failed) return id;dbg.location(146,31);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator: pointer? direct_declarator"); id = direct_declarator7; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:147:4: pointer
					{
					dbg.location(147,4);
					pushFollow(FOLLOW_pointer_in_declarator468);
					pointer();
					state._fsp--;
					if (state.failed) return id;dbg.location(147,12);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator: pointer"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, declarator_StartIndex); }

		}
		dbg.location(148, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return id;
	}
	// $ANTLR end "declarator"



	// $ANTLR start "direct_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:151:1: direct_declarator returns [String id] : ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* ;
	public final String direct_declarator() throws RecognitionException {
		String id = null;

		int direct_declarator_StartIndex = input.index();

		Token IDENTIFIER8=null;

		try { dbg.enterRule(getGrammarFileName(), "direct_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(151, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return id; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:2: ( ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:4: ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )*
			{
			dbg.location(152,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:4: ( IDENTIFIER | '(' declarator ')' )
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==IDENTIFIER) ) {
				alt16=1;
			}
			else if ( (LA16_0==49) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:5: IDENTIFIER
					{
					dbg.location(152,5);
					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_direct_declarator487); if (state.failed) return id;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:18: '(' declarator ')'
					{
					dbg.location(152,18);
					match(input,49,FOLLOW_49_in_direct_declarator491); if (state.failed) return id;dbg.location(152,22);
					pushFollow(FOLLOW_declarator_in_direct_declarator493);
					declarator();
					state._fsp--;
					if (state.failed) return id;dbg.location(152,33);
					match(input,50,FOLLOW_50_in_direct_declarator495); if (state.failed) return id;
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(152,38);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:38: ( declarator_suffix )*
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( (LA17_0==49) ) {
					switch ( input.LA(2) ) {
					case 50:
						{
						int LA17_10 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA17_12 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case EXTERN:
						{
						int LA17_15 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case STATIC:
						{
						int LA17_16 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case AUTO:
						{
						int LA17_17 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case REGISTER:
						{
						int LA17_18 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case VOID:
						{
						int LA17_19 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case CHAR:
						{
						int LA17_20 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case SHORT:
						{
						int LA17_21 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case INT:
						{
						int LA17_22 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case LONG:
						{
						int LA17_23 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case FLOAT:
						{
						int LA17_24 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case DOUBLE:
						{
						int LA17_25 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case SIGNED:
						{
						int LA17_26 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case UNSIGNED:
						{
						int LA17_27 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case BOOL:
						{
						int LA17_28 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case CONST:
						{
						int LA17_29 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case VOLATILE:
						{
						int LA17_30 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					}
				}
				else if ( (LA17_0==79) ) {
					switch ( input.LA(2) ) {
					case 80:
						{
						int LA17_31 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 49:
						{
						int LA17_32 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA17_33 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case DECIMAL_LITERAL:
						{
						int LA17_34 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case CHARACTER_LITERAL:
						{
						int LA17_35 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case STRING_LITERAL:
						{
						int LA17_36 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case FLOATING_POINT_LITERAL:
						{
						int LA17_37 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 55:
						{
						int LA17_38 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 59:
						{
						int LA17_39 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 47:
						{
						int LA17_40 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 51:
						{
						int LA17_41 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 54:
						{
						int LA17_42 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 58:
						{
						int LA17_43 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 91:
						{
						int LA17_44 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 42:
						{
						int LA17_45 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					case 85:
						{
						int LA17_46 = input.LA(3);
						if ( (synpred32_myChecker()) ) {
							alt17=1;
						}

						}
						break;
					}
				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:38: declarator_suffix
					{
					dbg.location(152,38);
					pushFollow(FOLLOW_declarator_suffix_in_direct_declarator498);
					declarator_suffix();
					state._fsp--;
					if (state.failed) return id;
					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(153,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON) 
							System.out.println("direct_declarator: (IDENTIFIER | '(' declarator ')') declarator_suffix*");
						id = (IDENTIFIER8!=null?IDENTIFIER8.getText():null);
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, direct_declarator_StartIndex); }

		}
		dbg.location(158, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "direct_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return id;
	}
	// $ANTLR end "direct_declarator"



	// $ANTLR start "declarator_suffix"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:161:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );
	public final void declarator_suffix() throws RecognitionException {
		int declarator_suffix_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "declarator_suffix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(161, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:162:2: ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' )
			int alt18=5;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==79) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==80) ) {
					alt18=2;
				}
				else if ( (LA18_1==CHARACTER_LITERAL||LA18_1==DECIMAL_LITERAL||LA18_1==FLOATING_POINT_LITERAL||LA18_1==IDENTIFIER||LA18_1==STRING_LITERAL||LA18_1==42||LA18_1==47||LA18_1==49||LA18_1==51||(LA18_1 >= 54 && LA18_1 <= 55)||(LA18_1 >= 58 && LA18_1 <= 59)||LA18_1==85||LA18_1==91) ) {
					alt18=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA18_0==49) ) {
				switch ( input.LA(2) ) {
				case 50:
					{
					alt18=5;
					}
					break;
				case AUTO:
				case BOOL:
				case CHAR:
				case CONST:
				case DOUBLE:
				case EXTERN:
				case FLOAT:
				case INT:
				case LONG:
				case REGISTER:
				case SHORT:
				case SIGNED:
				case STATIC:
				case UNSIGNED:
				case VOID:
				case VOLATILE:
					{
					alt18=3;
					}
					break;
				case IDENTIFIER:
					{
					alt18=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:162:4: '[' constant_expression ']'
					{
					dbg.location(162,4);
					match(input,79,FOLLOW_79_in_declarator_suffix516); if (state.failed) return;dbg.location(162,8);
					pushFollow(FOLLOW_constant_expression_in_declarator_suffix518);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(162,28);
					match(input,80,FOLLOW_80_in_declarator_suffix520); if (state.failed) return;dbg.location(162,32);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '[' constant_expression ']'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:163:7: '[' ']'
					{
					dbg.location(163,7);
					match(input,79,FOLLOW_79_in_declarator_suffix530); if (state.failed) return;dbg.location(163,11);
					match(input,80,FOLLOW_80_in_declarator_suffix532); if (state.failed) return;dbg.location(163,15);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '[' ']'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:164:9: '(' parameter_type_list ')'
					{
					dbg.location(164,9);
					match(input,49,FOLLOW_49_in_declarator_suffix544); if (state.failed) return;dbg.location(164,13);
					pushFollow(FOLLOW_parameter_type_list_in_declarator_suffix546);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;dbg.location(164,33);
					match(input,50,FOLLOW_50_in_declarator_suffix548); if (state.failed) return;dbg.location(164,37);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '(' parameter_type_list ')'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:165:9: '(' identifier_list ')'
					{
					dbg.location(165,9);
					match(input,49,FOLLOW_49_in_declarator_suffix560); if (state.failed) return;dbg.location(165,13);
					pushFollow(FOLLOW_identifier_list_in_declarator_suffix562);
					identifier_list();
					state._fsp--;
					if (state.failed) return;dbg.location(165,29);
					match(input,50,FOLLOW_50_in_declarator_suffix564); if (state.failed) return;dbg.location(165,33);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '(' identifier_list ')'"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:166:9: '(' ')'
					{
					dbg.location(166,9);
					match(input,49,FOLLOW_49_in_declarator_suffix576); if (state.failed) return;dbg.location(166,13);
					match(input,50,FOLLOW_50_in_declarator_suffix578); if (state.failed) return;dbg.location(166,17);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '(' ')'"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, declarator_suffix_StartIndex); }

		}
		dbg.location(167, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declarator_suffix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declarator_suffix"



	// $ANTLR start "pointer"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:169:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );
	public final void pointer() throws RecognitionException {
		int pointer_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "pointer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(169, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:2: ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' )
			int alt21=3;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==51) ) {
				switch ( input.LA(2) ) {
				case CONST:
				case VOLATILE:
					{
					alt21=1;
					}
					break;
				case 51:
					{
					int LA21_4 = input.LA(3);
					if ( (synpred40_myChecker()) ) {
						alt21=2;
					}
					else if ( (true) ) {
						alt21=3;
					}

					}
					break;
				case EOF:
				case IDENTIFIER:
				case 49:
				case 50:
				case 57:
				case 67:
				case 72:
				case 79:
					{
					alt21=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:4: '*' ( type_qualifier )+ ( pointer )?
					{
					dbg.location(170,4);
					match(input,51,FOLLOW_51_in_pointer591); if (state.failed) return;dbg.location(170,8);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:8: ( type_qualifier )+
					int cnt19=0;
					try { dbg.enterSubRule(19);

					loop19:
					while (true) {
						int alt19=2;
						try { dbg.enterDecision(19, decisionCanBacktrack[19]);

						int LA19_0 = input.LA(1);
						if ( (LA19_0==CONST||LA19_0==VOLATILE) ) {
							alt19=1;
						}

						} finally {dbg.exitDecision(19);}

						switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:8: type_qualifier
							{
							dbg.location(170,8);
							pushFollow(FOLLOW_type_qualifier_in_pointer593);
							type_qualifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(19, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt19++;
					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(170,24);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:24: ( pointer )?
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==51) ) {
						int LA20_1 = input.LA(2);
						if ( (synpred38_myChecker()) ) {
							alt20=1;
						}
					}
					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:24: pointer
							{
							dbg.location(170,24);
							pushFollow(FOLLOW_pointer_in_pointer596);
							pointer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(170,33);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("pointer: '*' type_qualifier+ pointer?"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:171:4: '*' pointer
					{
					dbg.location(171,4);
					match(input,51,FOLLOW_51_in_pointer604); if (state.failed) return;dbg.location(171,8);
					pushFollow(FOLLOW_pointer_in_pointer606);
					pointer();
					state._fsp--;
					if (state.failed) return;dbg.location(171,16);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("pointer: '*' pointer"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:172:4: '*'
					{
					dbg.location(172,4);
					match(input,51,FOLLOW_51_in_pointer613); if (state.failed) return;dbg.location(172,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("pointer: '*'"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, pointer_StartIndex); }

		}
		dbg.location(173, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "pointer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "pointer"



	// $ANTLR start "parameter_type_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:175:1: parameter_type_list : parameter_list ( ',' '...' )? ;
	public final void parameter_type_list() throws RecognitionException {
		int parameter_type_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_type_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(175, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:176:2: ( parameter_list ( ',' '...' )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:176:4: parameter_list ( ',' '...' )?
			{
			dbg.location(176,4);
			pushFollow(FOLLOW_parameter_list_in_parameter_type_list626);
			parameter_list();
			state._fsp--;
			if (state.failed) return;dbg.location(176,19);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:176:19: ( ',' '...' )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==57) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:176:20: ',' '...'
					{
					dbg.location(176,20);
					match(input,57,FOLLOW_57_in_parameter_type_list629); if (state.failed) return;dbg.location(176,24);
					match(input,63,FOLLOW_63_in_parameter_type_list631); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(176,32);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("parameter_type_list: parameter_list (',' '...')?"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, parameter_type_list_StartIndex); }

		}
		dbg.location(177, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_type_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_type_list"



	// $ANTLR start "parameter_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:179:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* ;
	public final void parameter_list() throws RecognitionException {
		int parameter_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(179, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:180:2: ( parameter_declaration ( ',' parameter_declaration )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:180:4: parameter_declaration ( ',' parameter_declaration )*
			{
			dbg.location(180,4);
			pushFollow(FOLLOW_parameter_declaration_in_parameter_list646);
			parameter_declaration();
			state._fsp--;
			if (state.failed) return;dbg.location(180,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:180:26: ( ',' parameter_declaration )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==57) ) {
					int LA23_1 = input.LA(2);
					if ( ((LA23_1 >= AUTO && LA23_1 <= BOOL)||LA23_1==CHAR||LA23_1==CONST||LA23_1==DOUBLE||LA23_1==EXTERN||LA23_1==FLOAT||LA23_1==INT||LA23_1==LONG||LA23_1==REGISTER||(LA23_1 >= SHORT && LA23_1 <= STATIC)||(LA23_1 >= UNSIGNED && LA23_1 <= VOLATILE)) ) {
						alt23=1;
					}

				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:180:27: ',' parameter_declaration
					{
					dbg.location(180,27);
					match(input,57,FOLLOW_57_in_parameter_list649); if (state.failed) return;dbg.location(180,31);
					pushFollow(FOLLOW_parameter_declaration_in_parameter_list651);
					parameter_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(180,55);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("parameter_type_list: parameter_declaration (',' parameter_declaration)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, parameter_list_StartIndex); }

		}
		dbg.location(181, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_list"



	// $ANTLR start "parameter_declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:183:1: parameter_declaration : declaration_specifiers ( declarator | abstract_declarator )* ;
	public final void parameter_declaration() throws RecognitionException {
		int parameter_declaration_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:2: ( declaration_specifiers ( declarator | abstract_declarator )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:4: declaration_specifiers ( declarator | abstract_declarator )*
			{
			dbg.location(184,4);
			pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration666);
			declaration_specifiers();
			state._fsp--;
			if (state.failed) return;dbg.location(184,27);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:27: ( declarator | abstract_declarator )*
			try { dbg.enterSubRule(24);

			loop24:
			while (true) {
				int alt24=3;
				try { dbg.enterDecision(24, decisionCanBacktrack[24]);

				switch ( input.LA(1) ) {
				case 51:
					{
					int LA24_4 = input.LA(2);
					if ( (synpred43_myChecker()) ) {
						alt24=1;
					}
					else if ( (synpred44_myChecker()) ) {
						alt24=2;
					}

					}
					break;
				case IDENTIFIER:
					{
					alt24=1;
					}
					break;
				case 49:
					{
					switch ( input.LA(2) ) {
					case AUTO:
					case BOOL:
					case CHAR:
					case CONST:
					case DOUBLE:
					case EXTERN:
					case FLOAT:
					case INT:
					case LONG:
					case REGISTER:
					case SHORT:
					case SIGNED:
					case STATIC:
					case UNSIGNED:
					case VOID:
					case VOLATILE:
					case 50:
					case 79:
						{
						alt24=2;
						}
						break;
					case 51:
						{
						int LA24_18 = input.LA(3);
						if ( (synpred43_myChecker()) ) {
							alt24=1;
						}
						else if ( (synpred44_myChecker()) ) {
							alt24=2;
						}

						}
						break;
					case IDENTIFIER:
						{
						alt24=1;
						}
						break;
					case 49:
						{
						int LA24_20 = input.LA(3);
						if ( (synpred43_myChecker()) ) {
							alt24=1;
						}
						else if ( (synpred44_myChecker()) ) {
							alt24=2;
						}

						}
						break;
					}
					}
					break;
				case 79:
					{
					alt24=2;
					}
					break;
				}
				} finally {dbg.exitDecision(24);}

				switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:28: declarator
					{
					dbg.location(184,28);
					pushFollow(FOLLOW_declarator_in_parameter_declaration669);
					declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:39: abstract_declarator
					{
					dbg.location(184,39);
					pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration671);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(184,61);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("parameter_type_list: declaration_specifiers (declarator|abstract_declarator)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, parameter_declaration_StartIndex); }

		}
		dbg.location(185, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_declaration"



	// $ANTLR start "identifier_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:187:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* ;
	public final void identifier_list() throws RecognitionException {
		int identifier_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "identifier_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(187, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:188:2: ( IDENTIFIER ( ',' IDENTIFIER )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:188:4: IDENTIFIER ( ',' IDENTIFIER )*
			{
			dbg.location(188,4);
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list686); if (state.failed) return;dbg.location(188,15);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:188:15: ( ',' IDENTIFIER )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==57) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:188:16: ',' IDENTIFIER
					{
					dbg.location(188,16);
					match(input,57,FOLLOW_57_in_identifier_list689); if (state.failed) return;dbg.location(188,20);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list691); if (state.failed) return;
					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(188,33);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("identifier_list: IDENTIFIER (',' IDENTIFIER)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, identifier_list_StartIndex); }

		}
		dbg.location(189, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifier_list"



	// $ANTLR start "abstract_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:192:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );
	public final void abstract_declarator() throws RecognitionException {
		int abstract_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "abstract_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(192, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:193:2: ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator )
			int alt27=2;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==51) ) {
				alt27=1;
			}
			else if ( (LA27_0==49||LA27_0==79) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:193:4: pointer ( direct_abstract_declarator )?
					{
					dbg.location(193,4);
					pushFollow(FOLLOW_pointer_in_abstract_declarator707);
					pointer();
					state._fsp--;
					if (state.failed) return;dbg.location(193,12);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:193:12: ( direct_abstract_declarator )?
					int alt26=2;
					try { dbg.enterSubRule(26);
					try { dbg.enterDecision(26, decisionCanBacktrack[26]);

					int LA26_0 = input.LA(1);
					if ( (LA26_0==49) ) {
						switch ( input.LA(2) ) {
							case 50:
								{
								int LA26_8 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 51:
								{
								int LA26_9 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 49:
								{
								int LA26_10 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 79:
								{
								int LA26_11 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case EXTERN:
								{
								int LA26_12 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case STATIC:
								{
								int LA26_13 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case AUTO:
								{
								int LA26_14 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case REGISTER:
								{
								int LA26_15 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case VOID:
								{
								int LA26_16 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case CHAR:
								{
								int LA26_17 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case SHORT:
								{
								int LA26_18 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case INT:
								{
								int LA26_19 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case LONG:
								{
								int LA26_20 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case FLOAT:
								{
								int LA26_21 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case DOUBLE:
								{
								int LA26_22 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case SIGNED:
								{
								int LA26_23 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case UNSIGNED:
								{
								int LA26_24 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case BOOL:
								{
								int LA26_25 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case CONST:
								{
								int LA26_26 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case VOLATILE:
								{
								int LA26_27 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
						}
					}
					else if ( (LA26_0==79) ) {
						switch ( input.LA(2) ) {
							case 80:
								{
								int LA26_29 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 49:
								{
								int LA26_30 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case IDENTIFIER:
								{
								int LA26_31 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case DECIMAL_LITERAL:
								{
								int LA26_32 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case CHARACTER_LITERAL:
								{
								int LA26_33 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case STRING_LITERAL:
								{
								int LA26_34 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case FLOATING_POINT_LITERAL:
								{
								int LA26_35 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 55:
								{
								int LA26_36 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 59:
								{
								int LA26_37 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 47:
								{
								int LA26_38 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 51:
								{
								int LA26_39 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 54:
								{
								int LA26_40 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 58:
								{
								int LA26_41 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 91:
								{
								int LA26_42 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 42:
								{
								int LA26_43 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
							case 85:
								{
								int LA26_44 = input.LA(3);
								if ( (synpred46_myChecker()) ) {
									alt26=1;
								}
								}
								break;
						}
					}
					} finally {dbg.exitDecision(26);}

					switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:193:12: direct_abstract_declarator
							{
							dbg.location(193,12);
							pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator709);
							direct_abstract_declarator();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(26);}
					dbg.location(193,40);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator: pointer direct_abstract_declarator?"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:194:4: direct_abstract_declarator
					{
					dbg.location(194,4);
					pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator717);
					direct_abstract_declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(194,31);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator: direct_abstract_declarator"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, abstract_declarator_StartIndex); }

		}
		dbg.location(195, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "abstract_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "abstract_declarator"



	// $ANTLR start "direct_abstract_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:197:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* ;
	public final void direct_abstract_declarator() throws RecognitionException {
		int direct_abstract_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "direct_abstract_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(197, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:2: ( ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )*
			{
			dbg.location(198,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==49) ) {
				int LA28_1 = input.LA(2);
				if ( ((LA28_1 >= AUTO && LA28_1 <= BOOL)||LA28_1==CHAR||LA28_1==CONST||LA28_1==DOUBLE||LA28_1==EXTERN||LA28_1==FLOAT||LA28_1==INT||LA28_1==LONG||LA28_1==REGISTER||(LA28_1 >= SHORT && LA28_1 <= STATIC)||(LA28_1 >= UNSIGNED && LA28_1 <= VOLATILE)||LA28_1==50) ) {
					alt28=2;
				}
				else if ( (LA28_1==49||LA28_1==51||LA28_1==79) ) {
					alt28=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA28_0==79) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:6: '(' abstract_declarator ')'
					{
					dbg.location(198,6);
					match(input,49,FOLLOW_49_in_direct_abstract_declarator732); if (state.failed) return;dbg.location(198,10);
					pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator734);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(198,30);
					match(input,50,FOLLOW_50_in_direct_abstract_declarator736); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:36: abstract_declarator_suffix
					{
					dbg.location(198,36);
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator740);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(198,65);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:65: ( abstract_declarator_suffix )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=2;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==49) ) {
					switch ( input.LA(2) ) {
					case 50:
						{
						int LA29_8 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case EXTERN:
						{
						int LA29_13 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case STATIC:
						{
						int LA29_14 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case AUTO:
						{
						int LA29_15 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case REGISTER:
						{
						int LA29_16 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case VOID:
						{
						int LA29_17 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case CHAR:
						{
						int LA29_18 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case SHORT:
						{
						int LA29_19 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case INT:
						{
						int LA29_20 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case LONG:
						{
						int LA29_21 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case FLOAT:
						{
						int LA29_22 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case DOUBLE:
						{
						int LA29_23 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case SIGNED:
						{
						int LA29_24 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case UNSIGNED:
						{
						int LA29_25 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case BOOL:
						{
						int LA29_26 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case CONST:
						{
						int LA29_27 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case VOLATILE:
						{
						int LA29_28 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					}
				}
				else if ( (LA29_0==79) ) {
					switch ( input.LA(2) ) {
					case 80:
						{
						int LA29_29 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 49:
						{
						int LA29_30 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA29_31 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case DECIMAL_LITERAL:
						{
						int LA29_32 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case CHARACTER_LITERAL:
						{
						int LA29_33 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case STRING_LITERAL:
						{
						int LA29_34 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case FLOATING_POINT_LITERAL:
						{
						int LA29_35 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 55:
						{
						int LA29_36 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 59:
						{
						int LA29_37 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 47:
						{
						int LA29_38 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 51:
						{
						int LA29_39 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 54:
						{
						int LA29_40 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 58:
						{
						int LA29_41 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 91:
						{
						int LA29_42 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 42:
						{
						int LA29_43 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					case 85:
						{
						int LA29_44 = input.LA(3);
						if ( (synpred49_myChecker()) ) {
							alt29=1;
						}

						}
						break;
					}
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:65: abstract_declarator_suffix
					{
					dbg.location(198,65);
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator744);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(199,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("direct_abstract_declarator: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) abstract_declarator_suffix*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, direct_abstract_declarator_StartIndex); }

		}
		dbg.location(200, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "direct_abstract_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "direct_abstract_declarator"



	// $ANTLR start "abstract_declarator_suffix"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:202:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );
	public final void abstract_declarator_suffix() throws RecognitionException {
		int abstract_declarator_suffix_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "abstract_declarator_suffix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(202, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:203:2: ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' )
			int alt30=4;
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==79) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==80) ) {
					alt30=1;
				}
				else if ( (LA30_1==CHARACTER_LITERAL||LA30_1==DECIMAL_LITERAL||LA30_1==FLOATING_POINT_LITERAL||LA30_1==IDENTIFIER||LA30_1==STRING_LITERAL||LA30_1==42||LA30_1==47||LA30_1==49||LA30_1==51||(LA30_1 >= 54 && LA30_1 <= 55)||(LA30_1 >= 58 && LA30_1 <= 59)||LA30_1==85||LA30_1==91) ) {
					alt30=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA30_0==49) ) {
				int LA30_2 = input.LA(2);
				if ( (LA30_2==50) ) {
					alt30=3;
				}
				else if ( ((LA30_2 >= AUTO && LA30_2 <= BOOL)||LA30_2==CHAR||LA30_2==CONST||LA30_2==DOUBLE||LA30_2==EXTERN||LA30_2==FLOAT||LA30_2==INT||LA30_2==LONG||LA30_2==REGISTER||(LA30_2 >= SHORT && LA30_2 <= STATIC)||(LA30_2 >= UNSIGNED && LA30_2 <= VOLATILE)) ) {
					alt30=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:203:4: '[' ']'
					{
					dbg.location(203,4);
					match(input,79,FOLLOW_79_in_abstract_declarator_suffix759); if (state.failed) return;dbg.location(203,8);
					match(input,80,FOLLOW_80_in_abstract_declarator_suffix761); if (state.failed) return;dbg.location(203,12);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' ']'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:204:4: '[' constant_expression ']'
					{
					dbg.location(204,4);
					match(input,79,FOLLOW_79_in_abstract_declarator_suffix768); if (state.failed) return;dbg.location(204,8);
					pushFollow(FOLLOW_constant_expression_in_abstract_declarator_suffix770);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(204,28);
					match(input,80,FOLLOW_80_in_abstract_declarator_suffix772); if (state.failed) return;dbg.location(204,32);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' constant_expression ']'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:205:4: '(' ')'
					{
					dbg.location(205,4);
					match(input,49,FOLLOW_49_in_abstract_declarator_suffix779); if (state.failed) return;dbg.location(205,8);
					match(input,50,FOLLOW_50_in_abstract_declarator_suffix781); if (state.failed) return;dbg.location(205,12);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '(' ')'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:206:4: '(' parameter_type_list ')'
					{
					dbg.location(206,4);
					match(input,49,FOLLOW_49_in_abstract_declarator_suffix788); if (state.failed) return;dbg.location(206,8);
					pushFollow(FOLLOW_parameter_type_list_in_abstract_declarator_suffix790);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;dbg.location(206,28);
					match(input,50,FOLLOW_50_in_abstract_declarator_suffix792); if (state.failed) return;dbg.location(206,32);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '(' parameter_type_list ')'"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, abstract_declarator_suffix_StartIndex); }

		}
		dbg.location(207, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "abstract_declarator_suffix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "abstract_declarator_suffix"


	public static class initializer_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "initializer"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:210:1: initializer returns [Type type] : ( assignment_expression | '{' initializer_list ( ',' )? '}' );
	public final myCheckerParser.initializer_return initializer() throws RecognitionException {
		myCheckerParser.initializer_return retval = new myCheckerParser.initializer_return();
		retval.start = input.LT(1);
		int initializer_StartIndex = input.index();

		ParserRuleReturnScope assignment_expression9 =null;

		try { dbg.enterRule(getGrammarFileName(), "initializer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(210, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:211:2: ( assignment_expression | '{' initializer_list ( ',' )? '}' )
			int alt32=2;
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			int LA32_0 = input.LA(1);
			if ( (LA32_0==CHARACTER_LITERAL||LA32_0==DECIMAL_LITERAL||LA32_0==FLOATING_POINT_LITERAL||LA32_0==IDENTIFIER||LA32_0==STRING_LITERAL||LA32_0==42||LA32_0==47||LA32_0==49||LA32_0==51||(LA32_0 >= 54 && LA32_0 <= 55)||(LA32_0 >= 58 && LA32_0 <= 59)||LA32_0==85||LA32_0==91) ) {
				alt32=1;
			}
			else if ( (LA32_0==86) ) {
				alt32=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:211:4: assignment_expression
					{
					dbg.location(211,4);
					pushFollow(FOLLOW_assignment_expression_in_initializer810);
					assignment_expression9=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(211,26);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("initializer: assignment_expression"); retval.type = (assignment_expression9!=null?((myCheckerParser.assignment_expression_return)assignment_expression9).type:null); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:212:4: '{' initializer_list ( ',' )? '}'
					{
					dbg.location(212,4);
					match(input,86,FOLLOW_86_in_initializer817); if (state.failed) return retval;dbg.location(212,8);
					pushFollow(FOLLOW_initializer_list_in_initializer819);
					initializer_list();
					state._fsp--;
					if (state.failed) return retval;dbg.location(212,25);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:212:25: ( ',' )?
					int alt31=2;
					try { dbg.enterSubRule(31);
					try { dbg.enterDecision(31, decisionCanBacktrack[31]);

					int LA31_0 = input.LA(1);
					if ( (LA31_0==57) ) {
						alt31=1;
					}
					} finally {dbg.exitDecision(31);}

					switch (alt31) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:212:25: ','
							{
							dbg.location(212,25);
							match(input,57,FOLLOW_57_in_initializer821); if (state.failed) return retval;
							}
							break;

					}
					} finally {dbg.exitSubRule(31);}
					dbg.location(212,30);
					match(input,90,FOLLOW_90_in_initializer824); if (state.failed) return retval;dbg.location(212,34);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("initializer: '{' initializer_list ','? '}'"); }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, initializer_StartIndex); }

		}
		dbg.location(213, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "initializer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "initializer"



	// $ANTLR start "initializer_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:216:1: initializer_list returns [Type type] : init= initializer ( ',' initializer )* ;
	public final Type initializer_list() throws RecognitionException {
		Type type = null;

		int initializer_list_StartIndex = input.index();

		ParserRuleReturnScope init =null;

		try { dbg.enterRule(getGrammarFileName(), "initializer_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(216, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:217:2: (init= initializer ( ',' initializer )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:217:4: init= initializer ( ',' initializer )*
			{
			dbg.location(217,8);
			pushFollow(FOLLOW_initializer_in_initializer_list844);
			init=initializer();
			state._fsp--;
			if (state.failed) return type;dbg.location(217,21);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:217:21: ( ',' initializer )*
			try { dbg.enterSubRule(33);

			loop33:
			while (true) {
				int alt33=2;
				try { dbg.enterDecision(33, decisionCanBacktrack[33]);

				int LA33_0 = input.LA(1);
				if ( (LA33_0==57) ) {
					int LA33_1 = input.LA(2);
					if ( (LA33_1==CHARACTER_LITERAL||LA33_1==DECIMAL_LITERAL||LA33_1==FLOATING_POINT_LITERAL||LA33_1==IDENTIFIER||LA33_1==STRING_LITERAL||LA33_1==42||LA33_1==47||LA33_1==49||LA33_1==51||(LA33_1 >= 54 && LA33_1 <= 55)||(LA33_1 >= 58 && LA33_1 <= 59)||(LA33_1 >= 85 && LA33_1 <= 86)||LA33_1==91) ) {
						alt33=1;
					}

				}

				} finally {dbg.exitDecision(33);}

				switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:217:22: ',' initializer
					{
					dbg.location(217,22);
					match(input,57,FOLLOW_57_in_initializer_list847); if (state.failed) return type;dbg.location(217,26);
					pushFollow(FOLLOW_initializer_in_initializer_list849);
					initializer();
					state._fsp--;
					if (state.failed) return type;
					}
					break;

				default :
					break loop33;
				}
			}
			} finally {dbg.exitSubRule(33);}
			dbg.location(217,40);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("initializer_list: initializer (',' initializer)*"); type = (init!=null?((myCheckerParser.initializer_return)init).type:null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, initializer_list_StartIndex); }

		}
		dbg.location(218, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "initializer_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "initializer_list"



	// $ANTLR start "argument_expression_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:221:1: argument_expression_list : assignment_expression ( ',' assignment_expression )* ;
	public final void argument_expression_list() throws RecognitionException {
		int argument_expression_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "argument_expression_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(221, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:222:2: ( assignment_expression ( ',' assignment_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:222:4: assignment_expression ( ',' assignment_expression )*
			{
			dbg.location(222,4);
			pushFollow(FOLLOW_assignment_expression_in_argument_expression_list866);
			assignment_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(222,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:222:26: ( ',' assignment_expression )*
			try { dbg.enterSubRule(34);

			loop34:
			while (true) {
				int alt34=2;
				try { dbg.enterDecision(34, decisionCanBacktrack[34]);

				int LA34_0 = input.LA(1);
				if ( (LA34_0==57) ) {
					alt34=1;
				}

				} finally {dbg.exitDecision(34);}

				switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:222:27: ',' assignment_expression
					{
					dbg.location(222,27);
					match(input,57,FOLLOW_57_in_argument_expression_list869); if (state.failed) return;dbg.location(222,31);
					pushFollow(FOLLOW_assignment_expression_in_argument_expression_list871);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}
			} finally {dbg.exitSubRule(34);}
			dbg.location(222,55);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("argument_expression_list: assignment_expression (',' assignment_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, argument_expression_list_StartIndex); }

		}
		dbg.location(223, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "argument_expression_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "argument_expression_list"


	public static class additive_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "additive_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:226:1: additive_expression returns [Type type] : (mul1= multiplicative_expression ) ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )* ;
	public final myCheckerParser.additive_expression_return additive_expression() throws RecognitionException {
		myCheckerParser.additive_expression_return retval = new myCheckerParser.additive_expression_return();
		retval.start = input.LT(1);
		int additive_expression_StartIndex = input.index();

		ParserRuleReturnScope mul1 =null;
		ParserRuleReturnScope mul2 =null;
		ParserRuleReturnScope mul3 =null;

		try { dbg.enterRule(getGrammarFileName(), "additive_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(226, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:227:2: ( (mul1= multiplicative_expression ) ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:227:4: (mul1= multiplicative_expression ) ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )*
			{
			dbg.location(227,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:227:4: (mul1= multiplicative_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:227:5: mul1= multiplicative_expression
			{
			dbg.location(227,9);
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression894);
			mul1=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			}
			dbg.location(227,37);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:227:37: ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )*
			try { dbg.enterSubRule(35);

			loop35:
			while (true) {
				int alt35=3;
				try { dbg.enterDecision(35, decisionCanBacktrack[35]);

				int LA35_0 = input.LA(1);
				if ( (LA35_0==54) ) {
					alt35=1;
				}
				else if ( (LA35_0==58) ) {
					alt35=2;
				}

				} finally {dbg.exitDecision(35);}

				switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:227:38: '+' mul2= multiplicative_expression
					{
					dbg.location(227,38);
					match(input,54,FOLLOW_54_in_additive_expression898); if (state.failed) return retval;dbg.location(227,46);
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression902);
					mul2=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:227:75: '-' mul3= multiplicative_expression
					{
					dbg.location(227,75);
					match(input,58,FOLLOW_58_in_additive_expression906); if (state.failed) return retval;dbg.location(227,83);
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression910);
					mul3=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop35;
				}
			}
			} finally {dbg.exitSubRule(35);}
			dbg.location(228,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("additive_expression: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)*");
						
						if((mul2!=null?input.toString(mul2.start,mul2.stop):null) != null && (mul1!=null?((myCheckerParser.multiplicative_expression_return)mul1).type:null) != (mul2!=null?((myCheckerParser.multiplicative_expression_return)mul2).type:null)) {
							System.out.println("Error! " + (mul1!=null?(mul1.start):null).getLine() + ": Type mismatch in an addition");
							retval.type = Type.ERROR;
						} else if((mul3!=null?input.toString(mul3.start,mul3.stop):null) != null && (mul1!=null?((myCheckerParser.multiplicative_expression_return)mul1).type:null) != (mul3!=null?((myCheckerParser.multiplicative_expression_return)mul3).type:null)) {
							System.out.println("Error! " + (mul1!=null?(mul1.start):null).getLine() + ": Type mismatch in a subtraction");
							retval.type = Type.ERROR;
						} else {
							retval.type = (mul1!=null?((myCheckerParser.multiplicative_expression_return)mul1).type:null);
						}	
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, additive_expression_StartIndex); }

		}
		dbg.location(242, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "additive_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class multiplicative_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "multiplicative_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:244:1: multiplicative_expression returns [Type type] : (cast1= cast_expression ) ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )* ;
	public final myCheckerParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		myCheckerParser.multiplicative_expression_return retval = new myCheckerParser.multiplicative_expression_return();
		retval.start = input.LT(1);
		int multiplicative_expression_StartIndex = input.index();

		ParserRuleReturnScope cast1 =null;
		ParserRuleReturnScope cast2 =null;
		ParserRuleReturnScope cast3 =null;
		ParserRuleReturnScope cast4 =null;

		try { dbg.enterRule(getGrammarFileName(), "multiplicative_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(244, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:2: ( (cast1= cast_expression ) ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:4: (cast1= cast_expression ) ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )*
			{
			dbg.location(245,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:4: (cast1= cast_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:5: cast1= cast_expression
			{
			dbg.location(245,10);
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression935);
			cast1=cast_expression();
			state._fsp--;
			if (state.failed) return retval;
			}
			dbg.location(245,28);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:28: ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )*
			try { dbg.enterSubRule(36);

			loop36:
			while (true) {
				int alt36=4;
				try { dbg.enterDecision(36, decisionCanBacktrack[36]);

				switch ( input.LA(1) ) {
				case 51:
					{
					alt36=1;
					}
					break;
				case 64:
					{
					alt36=2;
					}
					break;
				case 44:
					{
					alt36=3;
					}
					break;
				}
				} finally {dbg.exitDecision(36);}

				switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:29: '*' cast2= cast_expression
					{
					dbg.location(245,29);
					match(input,51,FOLLOW_51_in_multiplicative_expression939); if (state.failed) return retval;dbg.location(245,38);
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression943);
					cast2=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:57: '/' cast3= cast_expression
					{
					dbg.location(245,57);
					match(input,64,FOLLOW_64_in_multiplicative_expression947); if (state.failed) return retval;dbg.location(245,66);
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression951);
					cast3=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:245:85: '%' cast4= cast_expression
					{
					dbg.location(245,85);
					match(input,44,FOLLOW_44_in_multiplicative_expression955); if (state.failed) return retval;dbg.location(245,94);
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression959);
					cast4=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop36;
				}
			}
			} finally {dbg.exitSubRule(36);}
			dbg.location(246,3);
			if ( state.backtracking==0 ) {
						if(TRACEON)
							System.out.println("multiplicative_expression: (cast_expression) ('*' cast_expression | '/' cast_expression | '%' cast_expression)*");

						if((cast2!=null?input.toString(cast2.start,cast2.stop):null) != null && (cast1!=null?((myCheckerParser.cast_expression_return)cast1).type:null) != (cast2!=null?((myCheckerParser.cast_expression_return)cast2).type:null)) {
							System.out.println("Error! " + (cast1!=null?(cast1.start):null).getLine() + ": Type mismatch in a multiplication");
							retval.type = Type.ERROR;
						} else if((cast3!=null?input.toString(cast3.start,cast3.stop):null) != null && (cast1!=null?((myCheckerParser.cast_expression_return)cast1).type:null) != (cast3!=null?((myCheckerParser.cast_expression_return)cast3).type:null)) {
							System.out.println("Error! " + (cast1!=null?(cast1.start):null).getLine() + ": Type mismatch in a division");
							retval.type = Type.ERROR;
						} else if((cast4!=null?input.toString(cast4.start,cast4.stop):null) != null && (cast1!=null?((myCheckerParser.cast_expression_return)cast1).type:null) != (cast4!=null?((myCheckerParser.cast_expression_return)cast4).type:null)) {
							System.out.println("Error! " + (cast1!=null?(cast1.start):null).getLine() + ": Type mismatch in a modulus");
							retval.type = Type.ERROR;
						} else {
							retval.type = (cast1!=null?((myCheckerParser.cast_expression_return)cast1).type:null);
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, multiplicative_expression_StartIndex); }

		}
		dbg.location(263, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multiplicative_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "multiplicative_expression"


	public static class cast_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "cast_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:266:1: cast_expression returns [Type type] : ( '(' type_name ')' cast_expression | unary_expression );
	public final myCheckerParser.cast_expression_return cast_expression() throws RecognitionException {
		myCheckerParser.cast_expression_return retval = new myCheckerParser.cast_expression_return();
		retval.start = input.LT(1);
		int cast_expression_StartIndex = input.index();

		Type type_name10 =null;
		Type unary_expression11 =null;

		try { dbg.enterRule(getGrammarFileName(), "cast_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(266, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:267:2: ( '(' type_name ')' cast_expression | unary_expression )
			int alt37=2;
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			int LA37_0 = input.LA(1);
			if ( (LA37_0==49) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==BOOL||LA37_1==CHAR||LA37_1==CONST||LA37_1==DOUBLE||LA37_1==FLOAT||LA37_1==INT||LA37_1==LONG||(LA37_1 >= SHORT && LA37_1 <= SIGNED)||(LA37_1 >= UNSIGNED && LA37_1 <= VOLATILE)) ) {
					alt37=1;
				}
				else if ( (LA37_1==CHARACTER_LITERAL||LA37_1==DECIMAL_LITERAL||LA37_1==FLOATING_POINT_LITERAL||LA37_1==IDENTIFIER||LA37_1==STRING_LITERAL||LA37_1==42||LA37_1==47||LA37_1==49||LA37_1==51||(LA37_1 >= 54 && LA37_1 <= 55)||(LA37_1 >= 58 && LA37_1 <= 59)||LA37_1==85||LA37_1==91) ) {
					alt37=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA37_0==CHARACTER_LITERAL||LA37_0==DECIMAL_LITERAL||LA37_0==FLOATING_POINT_LITERAL||LA37_0==IDENTIFIER||LA37_0==STRING_LITERAL||LA37_0==42||LA37_0==47||LA37_0==51||(LA37_0 >= 54 && LA37_0 <= 55)||(LA37_0 >= 58 && LA37_0 <= 59)||LA37_0==85||LA37_0==91) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:267:4: '(' type_name ')' cast_expression
					{
					dbg.location(267,4);
					match(input,49,FOLLOW_49_in_cast_expression981); if (state.failed) return retval;dbg.location(267,8);
					pushFollow(FOLLOW_type_name_in_cast_expression983);
					type_name10=type_name();
					state._fsp--;
					if (state.failed) return retval;dbg.location(267,18);
					match(input,50,FOLLOW_50_in_cast_expression985); if (state.failed) return retval;dbg.location(267,22);
					pushFollow(FOLLOW_cast_expression_in_cast_expression987);
					cast_expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(267,38);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("cast_expression: '(' type_name ')' cast_expression"); retval.type = type_name10; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:268:4: unary_expression
					{
					dbg.location(268,4);
					pushFollow(FOLLOW_unary_expression_in_cast_expression994);
					unary_expression11=unary_expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(268,21);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("cast_expression: unary_expression"); retval.type = unary_expression11; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, cast_expression_StartIndex); }

		}
		dbg.location(269, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "cast_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "cast_expression"



	// $ANTLR start "unary_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:272:1: unary_expression returns [Type type] : ( postfix_expression | '++' unary2= unary_expression | '--' unary3= unary_expression | unary_operator cast_expression | 'sizeof' unary4= unary_expression | 'sizeof' '(' type_name ')' );
	public final Type unary_expression() throws RecognitionException {
		Type type = null;

		int unary_expression_StartIndex = input.index();

		Type unary2 =null;
		Type unary3 =null;
		Type unary4 =null;
		Type postfix_expression12 =null;
		ParserRuleReturnScope cast_expression13 =null;

		try { dbg.enterRule(getGrammarFileName(), "unary_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(272, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:273:2: ( postfix_expression | '++' unary2= unary_expression | '--' unary3= unary_expression | unary_operator cast_expression | 'sizeof' unary4= unary_expression | 'sizeof' '(' type_name ')' )
			int alt38=6;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			switch ( input.LA(1) ) {
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case IDENTIFIER:
			case STRING_LITERAL:
			case 49:
				{
				alt38=1;
				}
				break;
			case 55:
				{
				alt38=2;
				}
				break;
			case 59:
				{
				alt38=3;
				}
				break;
			case 42:
			case 47:
			case 51:
			case 54:
			case 58:
			case 91:
				{
				alt38=4;
				}
				break;
			case 85:
				{
				int LA38_15 = input.LA(2);
				if ( (LA38_15==49) ) {
					int LA38_16 = input.LA(3);
					if ( (synpred67_myChecker()) ) {
						alt38=5;
					}
					else if ( (true) ) {
						alt38=6;
					}

				}
				else if ( (LA38_15==CHARACTER_LITERAL||LA38_15==DECIMAL_LITERAL||LA38_15==FLOATING_POINT_LITERAL||LA38_15==IDENTIFIER||LA38_15==STRING_LITERAL||LA38_15==42||LA38_15==47||LA38_15==51||(LA38_15 >= 54 && LA38_15 <= 55)||(LA38_15 >= 58 && LA38_15 <= 59)||LA38_15==85||LA38_15==91) ) {
					alt38=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return type;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 15, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:273:4: postfix_expression
					{
					dbg.location(273,4);
					pushFollow(FOLLOW_postfix_expression_in_unary_expression1012);
					postfix_expression12=postfix_expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(273,23);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: postfix_expression"); type = postfix_expression12; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:274:4: '++' unary2= unary_expression
					{
					dbg.location(274,4);
					match(input,55,FOLLOW_55_in_unary_expression1019); if (state.failed) return type;dbg.location(274,15);
					pushFollow(FOLLOW_unary_expression_in_unary_expression1023);
					unary2=unary_expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(274,33);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: '++' unary_expression"); type = unary2; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:275:4: '--' unary3= unary_expression
					{
					dbg.location(275,4);
					match(input,59,FOLLOW_59_in_unary_expression1030); if (state.failed) return type;dbg.location(275,15);
					pushFollow(FOLLOW_unary_expression_in_unary_expression1034);
					unary3=unary_expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(275,33);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: '--' unary_expression"); type = unary3; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:276:4: unary_operator cast_expression
					{
					dbg.location(276,4);
					pushFollow(FOLLOW_unary_operator_in_unary_expression1041);
					unary_operator();
					state._fsp--;
					if (state.failed) return type;dbg.location(276,19);
					pushFollow(FOLLOW_cast_expression_in_unary_expression1043);
					cast_expression13=cast_expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(276,35);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: unary_operator cast_expression"); type = (cast_expression13!=null?((myCheckerParser.cast_expression_return)cast_expression13).type:null); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:277:4: 'sizeof' unary4= unary_expression
					{
					dbg.location(277,4);
					match(input,85,FOLLOW_85_in_unary_expression1050); if (state.failed) return type;dbg.location(277,19);
					pushFollow(FOLLOW_unary_expression_in_unary_expression1054);
					unary4=unary_expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(277,37);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: 'sizeof' unary_expression"); type = Type.INT; }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:278:4: 'sizeof' '(' type_name ')'
					{
					dbg.location(278,4);
					match(input,85,FOLLOW_85_in_unary_expression1061); if (state.failed) return type;dbg.location(278,13);
					match(input,49,FOLLOW_49_in_unary_expression1063); if (state.failed) return type;dbg.location(278,17);
					pushFollow(FOLLOW_type_name_in_unary_expression1065);
					type_name();
					state._fsp--;
					if (state.failed) return type;dbg.location(278,27);
					match(input,50,FOLLOW_50_in_unary_expression1067); if (state.failed) return type;dbg.location(278,31);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: 'sizeof' '(' type_name ')'"); type = Type.INT; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, unary_expression_StartIndex); }

		}
		dbg.location(279, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "unary_expression"



	// $ANTLR start "postfix_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:282:1: postfix_expression returns [Type type] : primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* ;
	public final Type postfix_expression() throws RecognitionException {
		Type type = null;

		int postfix_expression_StartIndex = input.index();

		Type primary_expression14 =null;

		try { dbg.enterRule(getGrammarFileName(), "postfix_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(282, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:283:2: ( primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:5: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			{
			dbg.location(284,5);
			pushFollow(FOLLOW_primary_expression_in_postfix_expression1092);
			primary_expression14=primary_expression();
			state._fsp--;
			if (state.failed) return type;dbg.location(284,24);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:24: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			try { dbg.enterSubRule(39);

			loop39:
			while (true) {
				int alt39=8;
				try { dbg.enterDecision(39, decisionCanBacktrack[39]);

				switch ( input.LA(1) ) {
				case 79:
					{
					alt39=1;
					}
					break;
				case 49:
					{
					int LA39_34 = input.LA(2);
					if ( (LA39_34==50) ) {
						alt39=2;
					}
					else if ( (LA39_34==CHARACTER_LITERAL||LA39_34==DECIMAL_LITERAL||LA39_34==FLOATING_POINT_LITERAL||LA39_34==IDENTIFIER||LA39_34==STRING_LITERAL||LA39_34==42||LA39_34==47||LA39_34==49||LA39_34==51||(LA39_34 >= 54 && LA39_34 <= 55)||(LA39_34 >= 58 && LA39_34 <= 59)||LA39_34==85||LA39_34==91) ) {
						alt39=3;
					}

					}
					break;
				case 62:
					{
					alt39=4;
					}
					break;
				case 61:
					{
					alt39=5;
					}
					break;
				case 55:
					{
					alt39=6;
					}
					break;
				case 59:
					{
					alt39=7;
					}
					break;
				}
				} finally {dbg.exitDecision(39);}

				switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:26: '[' expression ']'
					{
					dbg.location(284,26);
					match(input,79,FOLLOW_79_in_postfix_expression1096); if (state.failed) return type;dbg.location(284,30);
					pushFollow(FOLLOW_expression_in_postfix_expression1098);
					expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(284,41);
					match(input,80,FOLLOW_80_in_postfix_expression1100); if (state.failed) return type;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:47: '(' ')'
					{
					dbg.location(284,47);
					match(input,49,FOLLOW_49_in_postfix_expression1104); if (state.failed) return type;dbg.location(284,51);
					match(input,50,FOLLOW_50_in_postfix_expression1106); if (state.failed) return type;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:57: '(' argument_expression_list ')'
					{
					dbg.location(284,57);
					match(input,49,FOLLOW_49_in_postfix_expression1110); if (state.failed) return type;dbg.location(284,61);
					pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1112);
					argument_expression_list();
					state._fsp--;
					if (state.failed) return type;dbg.location(284,86);
					match(input,50,FOLLOW_50_in_postfix_expression1114); if (state.failed) return type;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:93: '.' IDENTIFIER
					{
					dbg.location(284,93);
					match(input,62,FOLLOW_62_in_postfix_expression1119); if (state.failed) return type;dbg.location(284,97);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1121); if (state.failed) return type;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:111: '->' IDENTIFIER
					{
					dbg.location(284,111);
					match(input,61,FOLLOW_61_in_postfix_expression1126); if (state.failed) return type;dbg.location(284,116);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1128); if (state.failed) return type;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:129: '++'
					{
					dbg.location(284,129);
					match(input,55,FOLLOW_55_in_postfix_expression1132); if (state.failed) return type;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:284:136: '--'
					{
					dbg.location(284,136);
					match(input,59,FOLLOW_59_in_postfix_expression1136); if (state.failed) return type;
					}
					break;

				default :
					break loop39;
				}
			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(285,3);
			if ( state.backtracking==0 ) {
						if(TRACEON)
							System.out.println("primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' |  '.' IDENTIFIER |  '->' IDENTIFIER | '++' | '--')*");
					
						type = primary_expression14;
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, postfix_expression_StartIndex); }

		}
		dbg.location(291, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "postfix_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "postfix_expression"



	// $ANTLR start "unary_operator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:293:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final void unary_operator() throws RecognitionException {
		int unary_operator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "unary_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(293, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:294:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
			int alt40=6;
			try { dbg.enterDecision(40, decisionCanBacktrack[40]);

			switch ( input.LA(1) ) {
			case 47:
				{
				alt40=1;
				}
				break;
			case 51:
				{
				alt40=2;
				}
				break;
			case 54:
				{
				alt40=3;
				}
				break;
			case 58:
				{
				alt40=4;
				}
				break;
			case 91:
				{
				alt40=5;
				}
				break;
			case 42:
				{
				alt40=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(40);}

			switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:294:4: '&'
					{
					dbg.location(294,4);
					match(input,47,FOLLOW_47_in_unary_operator1153); if (state.failed) return;dbg.location(294,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '&'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:295:4: '*'
					{
					dbg.location(295,4);
					match(input,51,FOLLOW_51_in_unary_operator1160); if (state.failed) return;dbg.location(295,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '*'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:296:4: '+'
					{
					dbg.location(296,4);
					match(input,54,FOLLOW_54_in_unary_operator1167); if (state.failed) return;dbg.location(296,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '+'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:297:4: '-'
					{
					dbg.location(297,4);
					match(input,58,FOLLOW_58_in_unary_operator1174); if (state.failed) return;dbg.location(297,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '-'"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:298:4: '~'
					{
					dbg.location(298,4);
					match(input,91,FOLLOW_91_in_unary_operator1181); if (state.failed) return;dbg.location(298,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '~'"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:299:4: '!'
					{
					dbg.location(299,4);
					match(input,42,FOLLOW_42_in_unary_operator1188); if (state.failed) return;dbg.location(299,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '!'"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, unary_operator_StartIndex); }

		}
		dbg.location(300, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unary_operator"



	// $ANTLR start "primary_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:303:1: primary_expression returns [Type type] : ( IDENTIFIER | constant | '(' expression ')' );
	public final Type primary_expression() throws RecognitionException {
		Type type = null;

		int primary_expression_StartIndex = input.index();

		Token IDENTIFIER15=null;
		Type constant16 =null;
		ParserRuleReturnScope expression17 =null;

		try { dbg.enterRule(getGrammarFileName(), "primary_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(303, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:304:2: ( IDENTIFIER | constant | '(' expression ')' )
			int alt41=3;
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt41=1;
				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case STRING_LITERAL:
				{
				alt41=2;
				}
				break;
			case 49:
				{
				alt41=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:304:4: IDENTIFIER
					{
					dbg.location(304,4);
					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1206); if (state.failed) return type;dbg.location(305,3);
					if ( state.backtracking==0 ) {
								if(TRACEON)
									System.out.println("primary_expression: IDENTIFIER");

								if(symbolTable.containsKey((IDENTIFIER15!=null?IDENTIFIER15.getText():null)))
									type = symbolTable.get((IDENTIFIER15!=null?IDENTIFIER15.getText():null));
								else {
									System.out.println("Error! " + IDENTIFIER15.getLine() + ": Undeclared identifier");
									type = Type.ERROR;
								}
							}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:316:4: constant
					{
					dbg.location(316,4);
					pushFollow(FOLLOW_constant_in_primary_expression1216);
					constant16=constant();
					state._fsp--;
					if (state.failed) return type;dbg.location(316,13);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("primary_expression: constant"); type = constant16; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:317:4: '(' expression ')'
					{
					dbg.location(317,4);
					match(input,49,FOLLOW_49_in_primary_expression1223); if (state.failed) return type;dbg.location(317,8);
					pushFollow(FOLLOW_expression_in_primary_expression1225);
					expression17=expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(317,19);
					match(input,50,FOLLOW_50_in_primary_expression1227); if (state.failed) return type;dbg.location(317,23);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("primary_expression: '(' expression ')'"); type = (expression17!=null?((myCheckerParser.expression_return)expression17).type:null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, primary_expression_StartIndex); }

		}
		dbg.location(318, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "primary_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "primary_expression"



	// $ANTLR start "constant"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:320:1: constant returns [Type type] : ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
	public final Type constant() throws RecognitionException {
		Type type = null;

		int constant_StartIndex = input.index();

		Token DECIMAL_LITERAL18=null;
		Token FLOATING_POINT_LITERAL19=null;

		try { dbg.enterRule(getGrammarFileName(), "constant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(320, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:321:5: ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
			int alt42=4;
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			switch ( input.LA(1) ) {
			case DECIMAL_LITERAL:
				{
				alt42=1;
				}
				break;
			case CHARACTER_LITERAL:
				{
				alt42=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt42=3;
				}
				break;
			case FLOATING_POINT_LITERAL:
				{
				alt42=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(42);}

			switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:321:9: DECIMAL_LITERAL
					{
					dbg.location(321,9);
					DECIMAL_LITERAL18=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_constant1249); if (state.failed) return type;dbg.location(322,3);
					if ( state.backtracking==0 ) { 
								if(TRACEON)
									System.out.println("constant: DECIMAL_LITERAL"); 
								
								long val = Integer.parseInt((DECIMAL_LITERAL18!=null?DECIMAL_LITERAL18.getText():null));
								type = Type.CHAR;
								if(val < -128 || val > 255)
									type = Type.SHORT;
								if(val < -32768 || val > 32767)
									type = Type.INT;
								if(val > 2147483647)
									type = Type.LONG;
							}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:335:7: CHARACTER_LITERAL
					{
					dbg.location(335,7);
					match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_constant1261); if (state.failed) return type;dbg.location(335,25);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: CHARACTER_LITERAL"); type = Type.CHAR; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:336:4: STRING_LITERAL
					{
					dbg.location(336,4);
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant1268); if (state.failed) return type;dbg.location(336,19);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: STRING_LITERAL"); type = Type.CHARS; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:337:9: FLOATING_POINT_LITERAL
					{
					dbg.location(337,9);
					FLOATING_POINT_LITERAL19=(Token)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_constant1280); if (state.failed) return type;dbg.location(338,3);
					if ( state.backtracking==0 ) { 
								if(TRACEON)
									System.out.println("constant: FLOATING_POINT_LITERAL");
								
								double val = Double.parseDouble((FLOATING_POINT_LITERAL19!=null?FLOATING_POINT_LITERAL19.getText():null));
								type = Type.FLOAT;
								if(val < 1.2e-38 || val > 3.4e+38)
									type = Type.DOUBLE;
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
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, constant_StartIndex); }

		}
		dbg.location(347, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "constant"


	public static class expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:350:1: expression returns [Type type] : assign1= assignment_expression ( ',' assignment_expression )* ;
	public final myCheckerParser.expression_return expression() throws RecognitionException {
		myCheckerParser.expression_return retval = new myCheckerParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		ParserRuleReturnScope assign1 =null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(350, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:351:2: (assign1= assignment_expression ( ',' assignment_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:351:4: assign1= assignment_expression ( ',' assignment_expression )*
			{
			dbg.location(351,11);
			pushFollow(FOLLOW_assignment_expression_in_expression1306);
			assign1=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(351,34);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:351:34: ( ',' assignment_expression )*
			try { dbg.enterSubRule(43);

			loop43:
			while (true) {
				int alt43=2;
				try { dbg.enterDecision(43, decisionCanBacktrack[43]);

				int LA43_0 = input.LA(1);
				if ( (LA43_0==57) ) {
					alt43=1;
				}

				} finally {dbg.exitDecision(43);}

				switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:351:35: ',' assignment_expression
					{
					dbg.location(351,35);
					match(input,57,FOLLOW_57_in_expression1309); if (state.failed) return retval;dbg.location(351,39);
					pushFollow(FOLLOW_assignment_expression_in_expression1311);
					assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop43;
				}
			}
			} finally {dbg.exitSubRule(43);}
			dbg.location(352,2);
			if ( state.backtracking==0 ) { 
					if(TRACEON)
						System.out.println("expression: assignment_expression (',' assignment_expression)*");

					retval.type = (assign1!=null?((myCheckerParser.assignment_expression_return)assign1).type:null);
				}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, expression_StartIndex); }

		}
		dbg.location(358, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"



	// $ANTLR start "constant_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:361:1: constant_expression returns [Type type] : conditional_expression ;
	public final Type constant_expression() throws RecognitionException {
		Type type = null;

		int constant_expression_StartIndex = input.index();

		Type conditional_expression20 =null;

		try { dbg.enterRule(getGrammarFileName(), "constant_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(361, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:362:2: ( conditional_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:362:4: conditional_expression
			{
			dbg.location(362,4);
			pushFollow(FOLLOW_conditional_expression_in_constant_expression1333);
			conditional_expression20=conditional_expression();
			state._fsp--;
			if (state.failed) return type;dbg.location(362,27);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant_expression: conditional_expression"); type = conditional_expression20; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, constant_expression_StartIndex); }

		}
		dbg.location(363, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "constant_expression"


	public static class assignment_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "assignment_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:366:1: assignment_expression returns [Type type] : ( lvalue assignment_operator assign2= assignment_expression | conditional_expression );
	public final myCheckerParser.assignment_expression_return assignment_expression() throws RecognitionException {
		myCheckerParser.assignment_expression_return retval = new myCheckerParser.assignment_expression_return();
		retval.start = input.LT(1);
		int assignment_expression_StartIndex = input.index();

		ParserRuleReturnScope assign2 =null;
		ParserRuleReturnScope lvalue21 =null;
		Type conditional_expression22 =null;

		try { dbg.enterRule(getGrammarFileName(), "assignment_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(366, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:367:2: ( lvalue assignment_operator assign2= assignment_expression | conditional_expression )
			int alt44=2;
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			try {
				isCyclicDecision = true;
				alt44 = dfa44.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:367:4: lvalue assignment_operator assign2= assignment_expression
					{
					dbg.location(367,4);
					pushFollow(FOLLOW_lvalue_in_assignment_expression1351);
					lvalue21=lvalue();
					state._fsp--;
					if (state.failed) return retval;dbg.location(367,11);
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1353);
					assignment_operator();
					state._fsp--;
					if (state.failed) return retval;dbg.location(367,38);
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1357);
					assign2=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(368,3);
					if ( state.backtracking==0 ) { 
								if(TRACEON) 
									System.out.println("assignment_expression: lvalue assignment_operator assignment_expression");
								// System.out.println((lvalue21!=null?input.toString(lvalue21.start,lvalue21.stop):null) + "_" + (lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) + " | " + (assign2!=null?input.toString(assign2.start,assign2.stop):null) + " " + (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null));
								if((lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.VOID || (lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.CHAR || (lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.BOOL || (lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.CHARS) {
									if((assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != (lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != null)
										System.out.println("Error! " + (lvalue21!=null?(lvalue21.start):null).getLine() + ": Type mismatch while assigning a value to a variable");
								} else if(((lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.SHORT && ((assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.CHAR && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.SHORT))
										|| ((lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.INT && ((assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.CHAR && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.SHORT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.INT))
										|| ((lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.LONG && ((assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.CHAR && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.SHORT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.INT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.LONG))
										|| ((lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.FLOAT && ((assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.CHAR && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.SHORT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.INT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.LONG && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.FLOAT))
										|| ((lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null) == Type.DOUBLE && ((assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.CHAR && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.SHORT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.INT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.LONG && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.FLOAT && (assign2!=null?((myCheckerParser.assignment_expression_return)assign2).type:null) != Type.DOUBLE)))
									System.out.println("Error! " +(lvalue21!=null?(lvalue21.start):null).getLine() + ": Type mismatch while assigning a value to a variable ");
								retval.type = (lvalue21!=null?((myCheckerParser.lvalue_return)lvalue21).type:null);
							}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:383:4: conditional_expression
					{
					dbg.location(383,4);
					pushFollow(FOLLOW_conditional_expression_in_assignment_expression1367);
					conditional_expression22=conditional_expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(383,27);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_expression: conditional_expression"); retval.type = conditional_expression22; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, assignment_expression_StartIndex); }

		}
		dbg.location(384, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "assignment_expression"


	public static class lvalue_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "lvalue"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:386:1: lvalue returns [Type type] : unary_expression ;
	public final myCheckerParser.lvalue_return lvalue() throws RecognitionException {
		myCheckerParser.lvalue_return retval = new myCheckerParser.lvalue_return();
		retval.start = input.LT(1);
		int lvalue_StartIndex = input.index();

		Type unary_expression23 =null;

		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(386, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:387:2: ( unary_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:387:4: unary_expression
			{
			dbg.location(387,4);
			pushFollow(FOLLOW_unary_expression_in_lvalue1384);
			unary_expression23=unary_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(387,21);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("lvalue: unary_expression"); retval.type = unary_expression23; }
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, lvalue_StartIndex); }

		}
		dbg.location(388, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "assignment_operator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:390:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final void assignment_operator() throws RecognitionException {
		int assignment_operator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "assignment_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(390, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:391:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			int alt45=11;
			try { dbg.enterDecision(45, decisionCanBacktrack[45]);

			switch ( input.LA(1) ) {
			case 72:
				{
				alt45=1;
				}
				break;
			case 53:
				{
				alt45=2;
				}
				break;
			case 65:
				{
				alt45=3;
				}
				break;
			case 45:
				{
				alt45=4;
				}
				break;
			case 56:
				{
				alt45=5;
				}
				break;
			case 60:
				{
				alt45=6;
				}
				break;
			case 70:
				{
				alt45=7;
				}
				break;
			case 77:
				{
				alt45=8;
				}
				break;
			case 48:
				{
				alt45=9;
				}
				break;
			case 82:
				{
				alt45=10;
				}
				break;
			case 88:
				{
				alt45=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(45);}

			switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:391:4: '='
					{
					dbg.location(391,4);
					match(input,72,FOLLOW_72_in_assignment_operator1397); if (state.failed) return;dbg.location(391,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '='"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:392:4: '*='
					{
					dbg.location(392,4);
					match(input,53,FOLLOW_53_in_assignment_operator1404); if (state.failed) return;dbg.location(392,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '*='"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:393:4: '/='
					{
					dbg.location(393,4);
					match(input,65,FOLLOW_65_in_assignment_operator1411); if (state.failed) return;dbg.location(393,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '/='"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:394:4: '%='
					{
					dbg.location(394,4);
					match(input,45,FOLLOW_45_in_assignment_operator1418); if (state.failed) return;dbg.location(394,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '%='"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:395:4: '+='
					{
					dbg.location(395,4);
					match(input,56,FOLLOW_56_in_assignment_operator1425); if (state.failed) return;dbg.location(395,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '+='"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:396:4: '-='
					{
					dbg.location(396,4);
					match(input,60,FOLLOW_60_in_assignment_operator1432); if (state.failed) return;dbg.location(396,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '-='"); }
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:397:4: '<<='
					{
					dbg.location(397,4);
					match(input,70,FOLLOW_70_in_assignment_operator1439); if (state.failed) return;dbg.location(397,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '<<='"); }
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:398:4: '>>='
					{
					dbg.location(398,4);
					match(input,77,FOLLOW_77_in_assignment_operator1446); if (state.failed) return;dbg.location(398,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '>>='"); }
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:399:4: '&='
					{
					dbg.location(399,4);
					match(input,48,FOLLOW_48_in_assignment_operator1453); if (state.failed) return;dbg.location(399,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '&='"); }
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:400:4: '^='
					{
					dbg.location(400,4);
					match(input,82,FOLLOW_82_in_assignment_operator1460); if (state.failed) return;dbg.location(400,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '^='"); }
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:401:4: '|='
					{
					dbg.location(401,4);
					match(input,88,FOLLOW_88_in_assignment_operator1467); if (state.failed) return;dbg.location(401,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '|='"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, assignment_operator_StartIndex); }

		}
		dbg.location(402, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignment_operator"



	// $ANTLR start "conditional_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:404:1: conditional_expression returns [Type type] : con1= logical_or_expression ( '?' expression ':' conditional_expression )? ;
	public final Type conditional_expression() throws RecognitionException {
		Type type = null;

		int conditional_expression_StartIndex = input.index();

		ParserRuleReturnScope con1 =null;
		ParserRuleReturnScope expression24 =null;

		try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(404, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:405:2: (con1= logical_or_expression ( '?' expression ':' conditional_expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:405:4: con1= logical_or_expression ( '?' expression ':' conditional_expression )?
			{
			dbg.location(405,8);
			pushFollow(FOLLOW_logical_or_expression_in_conditional_expression1490);
			con1=logical_or_expression();
			state._fsp--;
			if (state.failed) return type;dbg.location(405,31);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:405:31: ( '?' expression ':' conditional_expression )?
			int alt46=2;
			try { dbg.enterSubRule(46);
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			int LA46_0 = input.LA(1);
			if ( (LA46_0==78) ) {
				alt46=1;
			}
			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:405:32: '?' expression ':' conditional_expression
					{
					dbg.location(405,32);
					match(input,78,FOLLOW_78_in_conditional_expression1493); if (state.failed) return type;dbg.location(405,36);
					pushFollow(FOLLOW_expression_in_conditional_expression1495);
					expression24=expression();
					state._fsp--;
					if (state.failed) return type;dbg.location(405,47);
					match(input,66,FOLLOW_66_in_conditional_expression1497); if (state.failed) return type;dbg.location(405,51);
					pushFollow(FOLLOW_conditional_expression_in_conditional_expression1499);
					conditional_expression();
					state._fsp--;
					if (state.failed) return type;
					}
					break;

			}
			} finally {dbg.exitSubRule(46);}
			dbg.location(406,3);
			if ( state.backtracking==0 ) {
						if(TRACEON)
							System.out.println("conditional_expression: logical_or_expression ('?' expression ':' conditional_expression)?");

						type = (con1!=null?((myCheckerParser.logical_or_expression_return)con1).type:null);
						if((expression24!=null?input.toString(expression24.start,expression24.stop):null) != null) {
							if((expression24!=null?((myCheckerParser.expression_return)expression24).type:null) != Type.BOOL) {
								System.out.println("Error! " + (con1!=null?(con1.start):null).getLine() + ": Invalid condition type");
								type = Type.ERROR;
							}
						}
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, conditional_expression_StartIndex); }

		}
		dbg.location(418, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "conditional_expression"


	public static class logical_or_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "logical_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:420:1: logical_or_expression returns [Type type] : or1= logical_and_expression ( '||' or2= logical_and_expression )* ;
	public final myCheckerParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
		myCheckerParser.logical_or_expression_return retval = new myCheckerParser.logical_or_expression_return();
		retval.start = input.LT(1);
		int logical_or_expression_StartIndex = input.index();

		ParserRuleReturnScope or1 =null;
		ParserRuleReturnScope or2 =null;

		try { dbg.enterRule(getGrammarFileName(), "logical_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(420, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:421:2: (or1= logical_and_expression ( '||' or2= logical_and_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:421:4: or1= logical_and_expression ( '||' or2= logical_and_expression )*
			{
			dbg.location(421,7);
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1522);
			or1=logical_and_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(421,31);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:421:31: ( '||' or2= logical_and_expression )*
			try { dbg.enterSubRule(47);

			loop47:
			while (true) {
				int alt47=2;
				try { dbg.enterDecision(47, decisionCanBacktrack[47]);

				int LA47_0 = input.LA(1);
				if ( (LA47_0==89) ) {
					alt47=1;
				}

				} finally {dbg.exitDecision(47);}

				switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:421:32: '||' or2= logical_and_expression
					{
					dbg.location(421,32);
					match(input,89,FOLLOW_89_in_logical_or_expression1525); if (state.failed) return retval;dbg.location(421,40);
					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1529);
					or2=logical_and_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop47;
				}
			}
			} finally {dbg.exitSubRule(47);}
			dbg.location(422,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("logical_or_expression: logical_and_expression ('||' logical_and_expression)*");
						
						retval.type = Type.BOOL;
						if((or2!=null?input.toString(or2.start,or2.stop):null) != null) {
							if((or1!=null?((myCheckerParser.logical_and_expression_return)or1).type:null) != (or2!=null?((myCheckerParser.logical_and_expression_return)or2).type:null)) {
								System.out.println("Error! " + (or1!=null?(or1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, logical_or_expression_StartIndex); }

		}
		dbg.location(434, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "logical_or_expression"


	public static class logical_and_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "logical_and_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:435:1: logical_and_expression returns [Type type] : and1= inclusive_or_expression ( '&&' and2= inclusive_or_expression )* ;
	public final myCheckerParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
		myCheckerParser.logical_and_expression_return retval = new myCheckerParser.logical_and_expression_return();
		retval.start = input.LT(1);
		int logical_and_expression_StartIndex = input.index();

		ParserRuleReturnScope and1 =null;
		ParserRuleReturnScope and2 =null;

		try { dbg.enterRule(getGrammarFileName(), "logical_and_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(435, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:436:2: (and1= inclusive_or_expression ( '&&' and2= inclusive_or_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:436:4: and1= inclusive_or_expression ( '&&' and2= inclusive_or_expression )*
			{
			dbg.location(436,8);
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1551);
			and1=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(436,33);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:436:33: ( '&&' and2= inclusive_or_expression )*
			try { dbg.enterSubRule(48);

			loop48:
			while (true) {
				int alt48=2;
				try { dbg.enterDecision(48, decisionCanBacktrack[48]);

				int LA48_0 = input.LA(1);
				if ( (LA48_0==46) ) {
					alt48=1;
				}

				} finally {dbg.exitDecision(48);}

				switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:436:34: '&&' and2= inclusive_or_expression
					{
					dbg.location(436,34);
					match(input,46,FOLLOW_46_in_logical_and_expression1554); if (state.failed) return retval;dbg.location(436,43);
					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1558);
					and2=inclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop48;
				}
			}
			} finally {dbg.exitSubRule(48);}
			dbg.location(437,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("logical_and_expression: inclusive_or_expression ('&&' inclusive_or_expression)*");
						
						retval.type = Type.BOOL;
						if((and2!=null?input.toString(and2.start,and2.stop):null) != null) {
							if((and1!=null?((myCheckerParser.inclusive_or_expression_return)and1).type:null) != (and2!=null?((myCheckerParser.inclusive_or_expression_return)and2).type:null)) {
								System.out.println("Error! " + (and1!=null?(and1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, logical_and_expression_StartIndex); }

		}
		dbg.location(449, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_and_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "logical_and_expression"


	public static class inclusive_or_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "inclusive_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:450:1: inclusive_or_expression returns [Type type] : eor1= exclusive_or_expression ( '|' eor2= exclusive_or_expression )* ;
	public final myCheckerParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
		myCheckerParser.inclusive_or_expression_return retval = new myCheckerParser.inclusive_or_expression_return();
		retval.start = input.LT(1);
		int inclusive_or_expression_StartIndex = input.index();

		ParserRuleReturnScope eor1 =null;
		ParserRuleReturnScope eor2 =null;

		try { dbg.enterRule(getGrammarFileName(), "inclusive_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(450, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:451:2: (eor1= exclusive_or_expression ( '|' eor2= exclusive_or_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:451:4: eor1= exclusive_or_expression ( '|' eor2= exclusive_or_expression )*
			{
			dbg.location(451,8);
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1580);
			eor1=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(451,33);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:451:33: ( '|' eor2= exclusive_or_expression )*
			try { dbg.enterSubRule(49);

			loop49:
			while (true) {
				int alt49=2;
				try { dbg.enterDecision(49, decisionCanBacktrack[49]);

				int LA49_0 = input.LA(1);
				if ( (LA49_0==87) ) {
					alt49=1;
				}

				} finally {dbg.exitDecision(49);}

				switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:451:34: '|' eor2= exclusive_or_expression
					{
					dbg.location(451,34);
					match(input,87,FOLLOW_87_in_inclusive_or_expression1583); if (state.failed) return retval;dbg.location(451,42);
					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1587);
					eor2=exclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop49;
				}
			}
			} finally {dbg.exitSubRule(49);}
			dbg.location(452,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("inclusive_or_expression: exclusive_or_expression ('|' exclusive_or_expression)*");
						
						retval.type = (eor1!=null?((myCheckerParser.exclusive_or_expression_return)eor1).type:null);
						if((eor2!=null?input.toString(eor2.start,eor2.stop):null) != null) {
							if((eor1!=null?((myCheckerParser.exclusive_or_expression_return)eor1).type:null) != (eor2!=null?((myCheckerParser.exclusive_or_expression_return)eor2).type:null)) {
								System.out.println("Error! " + (eor1!=null?(eor1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, inclusive_or_expression_StartIndex); }

		}
		dbg.location(464, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inclusive_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "inclusive_or_expression"


	public static class exclusive_or_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "exclusive_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:465:1: exclusive_or_expression returns [Type type] : and1= and_expression ( '^' and2= and_expression )* ;
	public final myCheckerParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
		myCheckerParser.exclusive_or_expression_return retval = new myCheckerParser.exclusive_or_expression_return();
		retval.start = input.LT(1);
		int exclusive_or_expression_StartIndex = input.index();

		ParserRuleReturnScope and1 =null;
		ParserRuleReturnScope and2 =null;

		try { dbg.enterRule(getGrammarFileName(), "exclusive_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(465, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:466:2: (and1= and_expression ( '^' and2= and_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:466:4: and1= and_expression ( '^' and2= and_expression )*
			{
			dbg.location(466,8);
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1609);
			and1=and_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(466,24);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:466:24: ( '^' and2= and_expression )*
			try { dbg.enterSubRule(50);

			loop50:
			while (true) {
				int alt50=2;
				try { dbg.enterDecision(50, decisionCanBacktrack[50]);

				int LA50_0 = input.LA(1);
				if ( (LA50_0==81) ) {
					alt50=1;
				}

				} finally {dbg.exitDecision(50);}

				switch (alt50) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:466:25: '^' and2= and_expression
					{
					dbg.location(466,25);
					match(input,81,FOLLOW_81_in_exclusive_or_expression1612); if (state.failed) return retval;dbg.location(466,33);
					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1616);
					and2=and_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop50;
				}
			}
			} finally {dbg.exitSubRule(50);}
			dbg.location(467,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("exclusive_or_expression: and_expression ('^' and_expression)*");
						
						retval.type = (and1!=null?((myCheckerParser.and_expression_return)and1).type:null);
						if((and2!=null?input.toString(and2.start,and2.stop):null) != null) {
							if((and1!=null?((myCheckerParser.and_expression_return)and1).type:null) != (and2!=null?((myCheckerParser.and_expression_return)and2).type:null)) {
								System.out.println("Error! " + (and1!=null?(and1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, exclusive_or_expression_StartIndex); }

		}
		dbg.location(479, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exclusive_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exclusive_or_expression"


	public static class and_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "and_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:480:1: and_expression returns [Type type] : equal1= equality_expression ( '&' equal2= equality_expression )* ;
	public final myCheckerParser.and_expression_return and_expression() throws RecognitionException {
		myCheckerParser.and_expression_return retval = new myCheckerParser.and_expression_return();
		retval.start = input.LT(1);
		int and_expression_StartIndex = input.index();

		ParserRuleReturnScope equal1 =null;
		ParserRuleReturnScope equal2 =null;

		try { dbg.enterRule(getGrammarFileName(), "and_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(480, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:481:2: (equal1= equality_expression ( '&' equal2= equality_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:481:4: equal1= equality_expression ( '&' equal2= equality_expression )*
			{
			dbg.location(481,10);
			pushFollow(FOLLOW_equality_expression_in_and_expression1638);
			equal1=equality_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(481,31);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:481:31: ( '&' equal2= equality_expression )*
			try { dbg.enterSubRule(51);

			loop51:
			while (true) {
				int alt51=2;
				try { dbg.enterDecision(51, decisionCanBacktrack[51]);

				int LA51_0 = input.LA(1);
				if ( (LA51_0==47) ) {
					alt51=1;
				}

				} finally {dbg.exitDecision(51);}

				switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:481:32: '&' equal2= equality_expression
					{
					dbg.location(481,32);
					match(input,47,FOLLOW_47_in_and_expression1641); if (state.failed) return retval;dbg.location(481,42);
					pushFollow(FOLLOW_equality_expression_in_and_expression1645);
					equal2=equality_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop51;
				}
			}
			} finally {dbg.exitSubRule(51);}
			dbg.location(482,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("and_expression: equality_expression ('&' equality_expression)*");

						retval.type = (equal1!=null?((myCheckerParser.equality_expression_return)equal1).type:null);
						if((equal2!=null?input.toString(equal2.start,equal2.stop):null) != null) {
							if((equal1!=null?((myCheckerParser.equality_expression_return)equal1).type:null) != (equal2!=null?((myCheckerParser.equality_expression_return)equal2).type:null)) {
								System.out.println("Error! " + (equal1!=null?(equal1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, and_expression_StartIndex); }

		}
		dbg.location(494, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "and_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "and_expression"


	public static class equality_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "equality_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:495:1: equality_expression returns [Type type] : rel1= relational_expression ( ( '==' | '!=' ) rel2= relational_expression )* ;
	public final myCheckerParser.equality_expression_return equality_expression() throws RecognitionException {
		myCheckerParser.equality_expression_return retval = new myCheckerParser.equality_expression_return();
		retval.start = input.LT(1);
		int equality_expression_StartIndex = input.index();

		ParserRuleReturnScope rel1 =null;
		ParserRuleReturnScope rel2 =null;

		try { dbg.enterRule(getGrammarFileName(), "equality_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(495, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:496:2: (rel1= relational_expression ( ( '==' | '!=' ) rel2= relational_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:496:4: rel1= relational_expression ( ( '==' | '!=' ) rel2= relational_expression )*
			{
			dbg.location(496,8);
			pushFollow(FOLLOW_relational_expression_in_equality_expression1667);
			rel1=relational_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(496,31);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:496:31: ( ( '==' | '!=' ) rel2= relational_expression )*
			try { dbg.enterSubRule(52);

			loop52:
			while (true) {
				int alt52=2;
				try { dbg.enterDecision(52, decisionCanBacktrack[52]);

				int LA52_0 = input.LA(1);
				if ( (LA52_0==43||LA52_0==73) ) {
					alt52=1;
				}

				} finally {dbg.exitDecision(52);}

				switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:496:32: ( '==' | '!=' ) rel2= relational_expression
					{
					dbg.location(496,32);
					if ( input.LA(1)==43||input.LA(1)==73 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(496,48);
					pushFollow(FOLLOW_relational_expression_in_equality_expression1678);
					rel2=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop52;
				}
			}
			} finally {dbg.exitSubRule(52);}
			dbg.location(497,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("equality_expression: relational_expression (('=='|'!=') relational_expression)*");
						
						retval.type = Type.BOOL;
						if((rel2!=null?input.toString(rel2.start,rel2.stop):null) != null) {
							if((rel1!=null?((myCheckerParser.relational_expression_return)rel1).type:null) != (rel2!=null?((myCheckerParser.relational_expression_return)rel2).type:null)) {
								System.out.println("Error! " + (rel1!=null?(rel1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, equality_expression_StartIndex); }

		}
		dbg.location(509, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "equality_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "equality_expression"


	public static class relational_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "relational_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:510:1: relational_expression returns [Type type] : shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )* ;
	public final myCheckerParser.relational_expression_return relational_expression() throws RecognitionException {
		myCheckerParser.relational_expression_return retval = new myCheckerParser.relational_expression_return();
		retval.start = input.LT(1);
		int relational_expression_StartIndex = input.index();

		ParserRuleReturnScope shift1 =null;
		ParserRuleReturnScope shift2 =null;

		try { dbg.enterRule(getGrammarFileName(), "relational_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(510, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:511:2: (shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:511:4: shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )*
			{
			dbg.location(511,10);
			pushFollow(FOLLOW_shift_expression_in_relational_expression1700);
			shift1=shift_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(511,28);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:511:28: ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )*
			try { dbg.enterSubRule(53);

			loop53:
			while (true) {
				int alt53=2;
				try { dbg.enterDecision(53, decisionCanBacktrack[53]);

				int LA53_0 = input.LA(1);
				if ( (LA53_0==68||LA53_0==71||(LA53_0 >= 74 && LA53_0 <= 75)) ) {
					alt53=1;
				}

				} finally {dbg.exitDecision(53);}

				switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:511:29: ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression
					{
					dbg.location(511,29);
					if ( input.LA(1)==68||input.LA(1)==71||(input.LA(1) >= 74 && input.LA(1) <= 75) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(511,55);
					pushFollow(FOLLOW_shift_expression_in_relational_expression1715);
					shift2=shift_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop53;
				}
			}
			} finally {dbg.exitSubRule(53);}
			dbg.location(512,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("relational_expression: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*");

						retval.type = Type.BOOL;
						if((shift2!=null?input.toString(shift2.start,shift2.stop):null) != null) {
							if((shift1!=null?((myCheckerParser.shift_expression_return)shift1).type:null) != (shift2!=null?((myCheckerParser.shift_expression_return)shift2).type:null)) {
								System.out.println("Error! " + (shift1!=null?(shift1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, relational_expression_StartIndex); }

		}
		dbg.location(524, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relational_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "relational_expression"


	public static class shift_expression_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "shift_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:525:1: shift_expression returns [Type type] : add1= additive_expression ( ( '<<' | '>>' ) add2= additive_expression )* ;
	public final myCheckerParser.shift_expression_return shift_expression() throws RecognitionException {
		myCheckerParser.shift_expression_return retval = new myCheckerParser.shift_expression_return();
		retval.start = input.LT(1);
		int shift_expression_StartIndex = input.index();

		ParserRuleReturnScope add1 =null;
		ParserRuleReturnScope add2 =null;

		try { dbg.enterRule(getGrammarFileName(), "shift_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(525, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:526:2: (add1= additive_expression ( ( '<<' | '>>' ) add2= additive_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:526:4: add1= additive_expression ( ( '<<' | '>>' ) add2= additive_expression )*
			{
			dbg.location(526,8);
			pushFollow(FOLLOW_additive_expression_in_shift_expression1737);
			add1=additive_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(526,29);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:526:29: ( ( '<<' | '>>' ) add2= additive_expression )*
			try { dbg.enterSubRule(54);

			loop54:
			while (true) {
				int alt54=2;
				try { dbg.enterDecision(54, decisionCanBacktrack[54]);

				int LA54_0 = input.LA(1);
				if ( (LA54_0==69||LA54_0==76) ) {
					alt54=1;
				}

				} finally {dbg.exitDecision(54);}

				switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:526:30: ( '<<' | '>>' ) add2= additive_expression
					{
					dbg.location(526,30);
					if ( input.LA(1)==69||input.LA(1)==76 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(526,46);
					pushFollow(FOLLOW_additive_expression_in_shift_expression1748);
					add2=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop54;
				}
			}
			} finally {dbg.exitSubRule(54);}
			dbg.location(527,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("shift_expression: additive_expression (('<<'|'>>') additive_expression)*");

						retval.type = (add1!=null?((myCheckerParser.additive_expression_return)add1).type:null);
						if((add2!=null?input.toString(add2.start,add2.stop):null) != null) {
							if((add1!=null?((myCheckerParser.additive_expression_return)add1).type:null) != (add2!=null?((myCheckerParser.additive_expression_return)add2).type:null)) {
								System.out.println("Error! " + (add1!=null?(add1.start):null).getLine() + ": Type mismatch between two side of an operator");
								retval.type = Type.ERROR;
							}
						}
					}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, shift_expression_StartIndex); }

		}
		dbg.location(539, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "shift_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "shift_expression"



	// $ANTLR start "statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:542:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(542, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:543:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement )
			int alt55=6;
			try { dbg.enterDecision(55, decisionCanBacktrack[55]);

			try {
				isCyclicDecision = true;
				alt55 = dfa55.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(55);}

			switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:543:7: labeled_statement
					{
					dbg.location(543,7);
					pushFollow(FOLLOW_labeled_statement_in_statement1769);
					labeled_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(543,25);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: labeled_statement;"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:544:7: compound_statement
					{
					dbg.location(544,7);
					pushFollow(FOLLOW_compound_statement_in_statement1779);
					compound_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(544,26);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: compound_statement"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:545:7: expression_statement
					{
					dbg.location(545,7);
					pushFollow(FOLLOW_expression_statement_in_statement1789);
					expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(545,28);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: compound_statement"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:546:7: selection_statement
					{
					dbg.location(546,7);
					pushFollow(FOLLOW_selection_statement_in_statement1799);
					selection_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(546,27);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: selection_statement"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:547:7: iteration_statement
					{
					dbg.location(547,7);
					pushFollow(FOLLOW_iteration_statement_in_statement1809);
					iteration_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(547,27);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: iteration_statement"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:548:4: jump_statement
					{
					dbg.location(548,4);
					pushFollow(FOLLOW_jump_statement_in_statement1816);
					jump_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(548,19);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: jump_statement"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, statement_StartIndex); }

		}
		dbg.location(549, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "labeled_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:552:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );
	public final void labeled_statement() throws RecognitionException {
		int labeled_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "labeled_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(552, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:553:2: ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement )
			int alt56=3;
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt56=1;
				}
				break;
			case 83:
				{
				alt56=2;
				}
				break;
			case 84:
				{
				alt56=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:553:4: IDENTIFIER ':' statement
					{
					dbg.location(553,4);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_labeled_statement1833); if (state.failed) return;dbg.location(553,15);
					match(input,66,FOLLOW_66_in_labeled_statement1835); if (state.failed) return;dbg.location(553,19);
					pushFollow(FOLLOW_statement_in_labeled_statement1837);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(553,29);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("labeled_statement: IDENTIFIER ':' statement"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:554:4: 'case' constant_expression ':' statement
					{
					dbg.location(554,4);
					match(input,83,FOLLOW_83_in_labeled_statement1844); if (state.failed) return;dbg.location(554,11);
					pushFollow(FOLLOW_constant_expression_in_labeled_statement1846);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(554,31);
					match(input,66,FOLLOW_66_in_labeled_statement1848); if (state.failed) return;dbg.location(554,35);
					pushFollow(FOLLOW_statement_in_labeled_statement1850);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(554,45);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("labeled_statement: 'case' constant_expression ':' statement"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:555:4: 'default' ':' statement
					{
					dbg.location(555,4);
					match(input,84,FOLLOW_84_in_labeled_statement1857); if (state.failed) return;dbg.location(555,14);
					match(input,66,FOLLOW_66_in_labeled_statement1859); if (state.failed) return;dbg.location(555,18);
					pushFollow(FOLLOW_statement_in_labeled_statement1861);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(555,28);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("labeled_statement: 'default' ':' statement"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, labeled_statement_StartIndex); }

		}
		dbg.location(556, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "labeled_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "labeled_statement"



	// $ANTLR start "compound_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:559:1: compound_statement : '{' ( declaration )* ( statement_list )? '}' ;
	public final void compound_statement() throws RecognitionException {
		int compound_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "compound_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(559, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:560:5: ( '{' ( declaration )* ( statement_list )? '}' )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:560:7: '{' ( declaration )* ( statement_list )? '}'
			{
			dbg.location(560,7);
			match(input,86,FOLLOW_86_in_compound_statement1878); if (state.failed) return;dbg.location(560,11);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:560:11: ( declaration )*
			try { dbg.enterSubRule(57);

			loop57:
			while (true) {
				int alt57=2;
				try { dbg.enterDecision(57, decisionCanBacktrack[57]);

				int LA57_0 = input.LA(1);
				if ( ((LA57_0 >= AUTO && LA57_0 <= BOOL)||LA57_0==CHAR||LA57_0==CONST||LA57_0==DOUBLE||LA57_0==EXTERN||LA57_0==FLOAT||LA57_0==INT||LA57_0==LONG||LA57_0==REGISTER||(LA57_0 >= SHORT && LA57_0 <= STATIC)||(LA57_0 >= UNSIGNED && LA57_0 <= VOLATILE)) ) {
					alt57=1;
				}

				} finally {dbg.exitDecision(57);}

				switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:560:11: declaration
					{
					dbg.location(560,11);
					pushFollow(FOLLOW_declaration_in_compound_statement1880);
					declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop57;
				}
			}
			} finally {dbg.exitSubRule(57);}
			dbg.location(560,24);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:560:24: ( statement_list )?
			int alt58=2;
			try { dbg.enterSubRule(58);
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			int LA58_0 = input.LA(1);
			if ( (LA58_0==BREAK||LA58_0==CHARACTER_LITERAL||(LA58_0 >= CONTINUE && LA58_0 <= DO)||(LA58_0 >= FLOATING_POINT_LITERAL && LA58_0 <= IF)||LA58_0==RETURN||(LA58_0 >= STRING_LITERAL && LA58_0 <= SWITCH)||LA58_0==WHILE||LA58_0==42||LA58_0==47||LA58_0==49||LA58_0==51||(LA58_0 >= 54 && LA58_0 <= 55)||(LA58_0 >= 58 && LA58_0 <= 59)||LA58_0==67||(LA58_0 >= 83 && LA58_0 <= 86)||LA58_0==91) ) {
				alt58=1;
			}
			} finally {dbg.exitDecision(58);}

			switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:560:24: statement_list
					{
					dbg.location(560,24);
					pushFollow(FOLLOW_statement_list_in_compound_statement1883);
					statement_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(58);}
			dbg.location(560,40);
			match(input,90,FOLLOW_90_in_compound_statement1886); if (state.failed) return;dbg.location(560,44);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("compound_statement: '{' declaration* statement_list? '}'"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, compound_statement_StartIndex); }

		}
		dbg.location(561, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compound_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compound_statement"



	// $ANTLR start "statement_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:564:1: statement_list : ( statement )+ ;
	public final void statement_list() throws RecognitionException {
		int statement_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(564, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:565:2: ( ( statement )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:565:4: ( statement )+
			{
			dbg.location(565,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:565:4: ( statement )+
			int cnt59=0;
			try { dbg.enterSubRule(59);

			loop59:
			while (true) {
				int alt59=2;
				try { dbg.enterDecision(59, decisionCanBacktrack[59]);

				int LA59_0 = input.LA(1);
				if ( (LA59_0==BREAK||LA59_0==CHARACTER_LITERAL||(LA59_0 >= CONTINUE && LA59_0 <= DO)||(LA59_0 >= FLOATING_POINT_LITERAL && LA59_0 <= IF)||LA59_0==RETURN||(LA59_0 >= STRING_LITERAL && LA59_0 <= SWITCH)||LA59_0==WHILE||LA59_0==42||LA59_0==47||LA59_0==49||LA59_0==51||(LA59_0 >= 54 && LA59_0 <= 55)||(LA59_0 >= 58 && LA59_0 <= 59)||LA59_0==67||(LA59_0 >= 83 && LA59_0 <= 86)||LA59_0==91) ) {
					alt59=1;
				}

				} finally {dbg.exitDecision(59);}

				switch (alt59) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:565:4: statement
					{
					dbg.location(565,4);
					pushFollow(FOLLOW_statement_in_statement_list1903);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt59 >= 1 ) break loop59;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(59, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt59++;
			}
			} finally {dbg.exitSubRule(59);}
			dbg.location(565,15);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement_list: statement+"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, statement_list_StartIndex); }

		}
		dbg.location(566, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement_list"


	public static class expression_statement_return extends ParserRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "expression_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:568:1: expression_statement returns [Type type] : ( ';' | expression ';' );
	public final myCheckerParser.expression_statement_return expression_statement() throws RecognitionException {
		myCheckerParser.expression_statement_return retval = new myCheckerParser.expression_statement_return();
		retval.start = input.LT(1);
		int expression_statement_StartIndex = input.index();

		ParserRuleReturnScope expression25 =null;

		try { dbg.enterRule(getGrammarFileName(), "expression_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(568, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:569:2: ( ';' | expression ';' )
			int alt60=2;
			try { dbg.enterDecision(60, decisionCanBacktrack[60]);

			int LA60_0 = input.LA(1);
			if ( (LA60_0==67) ) {
				alt60=1;
			}
			else if ( (LA60_0==CHARACTER_LITERAL||LA60_0==DECIMAL_LITERAL||LA60_0==FLOATING_POINT_LITERAL||LA60_0==IDENTIFIER||LA60_0==STRING_LITERAL||LA60_0==42||LA60_0==47||LA60_0==49||LA60_0==51||(LA60_0 >= 54 && LA60_0 <= 55)||(LA60_0 >= 58 && LA60_0 <= 59)||LA60_0==85||LA60_0==91) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(60);}

			switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:569:4: ';'
					{
					dbg.location(569,4);
					match(input,67,FOLLOW_67_in_expression_statement1921); if (state.failed) return retval;dbg.location(569,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("expression_statement: ';'"); retval.type = Type.BOOL; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:570:4: expression ';'
					{
					dbg.location(570,4);
					pushFollow(FOLLOW_expression_in_expression_statement1928);
					expression25=expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(570,15);
					match(input,67,FOLLOW_67_in_expression_statement1930); if (state.failed) return retval;dbg.location(570,19);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("expression_statement: expression ';'"); retval.type = (expression25!=null?((myCheckerParser.expression_return)expression25).type:null); }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, expression_statement_StartIndex); }

		}
		dbg.location(571, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression_statement"



	// $ANTLR start "selection_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:574:1: selection_statement : ( IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? | SWITCH '(' expression ')' statement );
	public final void selection_statement() throws RecognitionException {
		int selection_statement_StartIndex = input.index();

		Token IF27=null;
		ParserRuleReturnScope expression26 =null;

		try { dbg.enterRule(getGrammarFileName(), "selection_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(574, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:575:2: ( IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? | SWITCH '(' expression ')' statement )
			int alt62=2;
			try { dbg.enterDecision(62, decisionCanBacktrack[62]);

			int LA62_0 = input.LA(1);
			if ( (LA62_0==IF) ) {
				alt62=1;
			}
			else if ( (LA62_0==SWITCH) ) {
				alt62=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(62);}

			switch (alt62) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:575:4: IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )?
					{
					dbg.location(575,4);
					IF27=(Token)match(input,IF,FOLLOW_IF_in_selection_statement1944); if (state.failed) return;dbg.location(575,7);
					match(input,49,FOLLOW_49_in_selection_statement1946); if (state.failed) return;dbg.location(575,11);
					pushFollow(FOLLOW_expression_in_selection_statement1948);
					expression26=expression();
					state._fsp--;
					if (state.failed) return;dbg.location(575,22);
					match(input,50,FOLLOW_50_in_selection_statement1950); if (state.failed) return;dbg.location(575,26);
					pushFollow(FOLLOW_statement_in_selection_statement1952);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(575,36);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:575:36: ( options {k=1; backtrack=false; } : ELSE statement )?
					int alt61=2;
					try { dbg.enterSubRule(61);
					try { dbg.enterDecision(61, decisionCanBacktrack[61]);

					int LA61_0 = input.LA(1);
					if ( (LA61_0==ELSE) ) {
						int LA61_1 = input.LA(2);
						if ( (true) ) {
							alt61=1;
						}
					}
					} finally {dbg.exitDecision(61);}

					switch (alt61) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:575:69: ELSE statement
							{
							dbg.location(575,69);
							match(input,ELSE,FOLLOW_ELSE_in_selection_statement1967); if (state.failed) return;dbg.location(575,74);
							pushFollow(FOLLOW_statement_in_selection_statement1969);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(61);}
					dbg.location(576,3);
					if ( state.backtracking==0 ) { 
								if(TRACEON)
									System.out.println("selection_statement: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?");

								if((expression26!=null?((myCheckerParser.expression_return)expression26).type:null) != Type.BOOL)
									System.out.println("Error! " + IF27.getLine() + ": Invalid condition type");
							}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:583:4: SWITCH '(' expression ')' statement
					{
					dbg.location(583,4);
					match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement1980); if (state.failed) return;dbg.location(583,11);
					match(input,49,FOLLOW_49_in_selection_statement1982); if (state.failed) return;dbg.location(583,15);
					pushFollow(FOLLOW_expression_in_selection_statement1984);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(583,26);
					match(input,50,FOLLOW_50_in_selection_statement1986); if (state.failed) return;dbg.location(583,30);
					pushFollow(FOLLOW_statement_in_selection_statement1988);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(584,3);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("selection_statement: SWITCH '(' expression ')' statement"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, selection_statement_StartIndex); }

		}
		dbg.location(585, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selection_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selection_statement"



	// $ANTLR start "iteration_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:588:1: iteration_statement : ( WHILE '(' expression ')' statement | DO statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expr2= expression_statement ( expression )? ')' statement );
	public final void iteration_statement() throws RecognitionException {
		int iteration_statement_StartIndex = input.index();

		Token WHILE29=null;
		Token DO31=null;
		ParserRuleReturnScope expr2 =null;
		ParserRuleReturnScope expression28 =null;
		ParserRuleReturnScope expression30 =null;

		try { dbg.enterRule(getGrammarFileName(), "iteration_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(588, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:589:5: ( WHILE '(' expression ')' statement | DO statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expr2= expression_statement ( expression )? ')' statement )
			int alt64=3;
			try { dbg.enterDecision(64, decisionCanBacktrack[64]);

			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt64=1;
				}
				break;
			case DO:
				{
				alt64=2;
				}
				break;
			case FOR:
				{
				alt64=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(64);}

			switch (alt64) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:589:7: WHILE '(' expression ')' statement
					{
					dbg.location(589,7);
					WHILE29=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_statement2007); if (state.failed) return;dbg.location(589,13);
					match(input,49,FOLLOW_49_in_iteration_statement2009); if (state.failed) return;dbg.location(589,17);
					pushFollow(FOLLOW_expression_in_iteration_statement2011);
					expression28=expression();
					state._fsp--;
					if (state.failed) return;dbg.location(589,28);
					match(input,50,FOLLOW_50_in_iteration_statement2013); if (state.failed) return;dbg.location(589,32);
					pushFollow(FOLLOW_statement_in_iteration_statement2015);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(590,3);
					if ( state.backtracking==0 ) { 
								if(TRACEON)
									System.out.println("iteration_statement: WHILE '(' expression ')' statement");

								if((expression28!=null?((myCheckerParser.expression_return)expression28).type:null) != Type.BOOL)
									System.out.println("Error! " + WHILE29.getLine() + ": Invalid condition type");
							}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:597:4: DO statement WHILE '(' expression ')' ';'
					{
					dbg.location(597,4);
					DO31=(Token)match(input,DO,FOLLOW_DO_in_iteration_statement2025); if (state.failed) return;dbg.location(597,7);
					pushFollow(FOLLOW_statement_in_iteration_statement2027);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(597,17);
					match(input,WHILE,FOLLOW_WHILE_in_iteration_statement2029); if (state.failed) return;dbg.location(597,23);
					match(input,49,FOLLOW_49_in_iteration_statement2031); if (state.failed) return;dbg.location(597,27);
					pushFollow(FOLLOW_expression_in_iteration_statement2033);
					expression30=expression();
					state._fsp--;
					if (state.failed) return;dbg.location(597,38);
					match(input,50,FOLLOW_50_in_iteration_statement2035); if (state.failed) return;dbg.location(597,42);
					match(input,67,FOLLOW_67_in_iteration_statement2037); if (state.failed) return;dbg.location(598,3);
					if ( state.backtracking==0 ) { 
								if(TRACEON)
									System.out.println("iteration_statement: DO statement WHILE '(' expression ')' ';'");
								
								if((expression30!=null?((myCheckerParser.expression_return)expression30).type:null) != Type.BOOL)
									System.out.println("Error! " + DO31.getLine() + ": Invalid condition type");
							}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:605:4: FOR '(' expression_statement expr2= expression_statement ( expression )? ')' statement
					{
					dbg.location(605,4);
					match(input,FOR,FOLLOW_FOR_in_iteration_statement2047); if (state.failed) return;dbg.location(605,8);
					match(input,49,FOLLOW_49_in_iteration_statement2049); if (state.failed) return;dbg.location(605,12);
					pushFollow(FOLLOW_expression_statement_in_iteration_statement2051);
					expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(605,38);
					pushFollow(FOLLOW_expression_statement_in_iteration_statement2055);
					expr2=expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(605,60);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:605:60: ( expression )?
					int alt63=2;
					try { dbg.enterSubRule(63);
					try { dbg.enterDecision(63, decisionCanBacktrack[63]);

					int LA63_0 = input.LA(1);
					if ( (LA63_0==CHARACTER_LITERAL||LA63_0==DECIMAL_LITERAL||LA63_0==FLOATING_POINT_LITERAL||LA63_0==IDENTIFIER||LA63_0==STRING_LITERAL||LA63_0==42||LA63_0==47||LA63_0==49||LA63_0==51||(LA63_0 >= 54 && LA63_0 <= 55)||(LA63_0 >= 58 && LA63_0 <= 59)||LA63_0==85||LA63_0==91) ) {
						alt63=1;
					}
					} finally {dbg.exitDecision(63);}

					switch (alt63) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:605:60: expression
							{
							dbg.location(605,60);
							pushFollow(FOLLOW_expression_in_iteration_statement2057);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(63);}
					dbg.location(605,72);
					match(input,50,FOLLOW_50_in_iteration_statement2060); if (state.failed) return;dbg.location(605,76);
					pushFollow(FOLLOW_statement_in_iteration_statement2062);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(606,3);
					if ( state.backtracking==0 ) { 
								if(TRACEON)
									System.out.println("iteration_statement: FOR '(' expression_statement expression_statement expression? ')' statement");

								if((expr2!=null?((myCheckerParser.expression_statement_return)expr2).type:null) != Type.BOOL)
									System.out.println("Error! " + (expr2!=null?(expr2.start):null).getLine() + ": Invalid condition type");
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
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, iteration_statement_StartIndex); }

		}
		dbg.location(613, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteration_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteration_statement"



	// $ANTLR start "jump_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:616:1: jump_statement : ( GOTO IDENTIFIER ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' );
	public final void jump_statement() throws RecognitionException {
		int jump_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "jump_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(616, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:617:2: ( GOTO IDENTIFIER ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' )
			int alt65=5;
			try { dbg.enterDecision(65, decisionCanBacktrack[65]);

			switch ( input.LA(1) ) {
			case GOTO:
				{
				alt65=1;
				}
				break;
			case CONTINUE:
				{
				alt65=2;
				}
				break;
			case BREAK:
				{
				alt65=3;
				}
				break;
			case RETURN:
				{
				int LA65_4 = input.LA(2);
				if ( (LA65_4==67) ) {
					alt65=4;
				}
				else if ( (LA65_4==CHARACTER_LITERAL||LA65_4==DECIMAL_LITERAL||LA65_4==FLOATING_POINT_LITERAL||LA65_4==IDENTIFIER||LA65_4==STRING_LITERAL||LA65_4==42||LA65_4==47||LA65_4==49||LA65_4==51||(LA65_4 >= 54 && LA65_4 <= 55)||(LA65_4 >= 58 && LA65_4 <= 59)||LA65_4==85||LA65_4==91) ) {
					alt65=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(65);}

			switch (alt65) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:617:4: GOTO IDENTIFIER ';'
					{
					dbg.location(617,4);
					match(input,GOTO,FOLLOW_GOTO_in_jump_statement2079); if (state.failed) return;dbg.location(617,9);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_jump_statement2081); if (state.failed) return;dbg.location(617,20);
					match(input,67,FOLLOW_67_in_jump_statement2083); if (state.failed) return;dbg.location(617,24);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: GOTO IDENTIFIER ';'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:618:4: CONTINUE ';'
					{
					dbg.location(618,4);
					match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement2090); if (state.failed) return;dbg.location(618,13);
					match(input,67,FOLLOW_67_in_jump_statement2092); if (state.failed) return;dbg.location(618,17);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: CONTINUE ';'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:619:4: BREAK ';'
					{
					dbg.location(619,4);
					match(input,BREAK,FOLLOW_BREAK_in_jump_statement2099); if (state.failed) return;dbg.location(619,10);
					match(input,67,FOLLOW_67_in_jump_statement2101); if (state.failed) return;dbg.location(619,14);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: BREAK ';'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:620:4: RETURN ';'
					{
					dbg.location(620,4);
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement2108); if (state.failed) return;dbg.location(620,11);
					match(input,67,FOLLOW_67_in_jump_statement2110); if (state.failed) return;dbg.location(620,15);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: RETURN ';'"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:621:4: RETURN expression ';'
					{
					dbg.location(621,4);
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement2117); if (state.failed) return;dbg.location(621,11);
					pushFollow(FOLLOW_expression_in_jump_statement2119);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(621,22);
					match(input,67,FOLLOW_67_in_jump_statement2121); if (state.failed) return;dbg.location(621,26);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: RETURN expression ';'"); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, jump_statement_StartIndex); }

		}
		dbg.location(622, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "jump_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "jump_statement"

	// $ANTLR start synpred30_myChecker
	public final void synpred30_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:4: ( ( pointer )? direct_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:4: ( pointer )? direct_declarator
		{
		dbg.location(146,4);
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:4: ( pointer )?
		int alt67=2;
		try { dbg.enterSubRule(67);
		try { dbg.enterDecision(67, decisionCanBacktrack[67]);

		int LA67_0 = input.LA(1);
		if ( (LA67_0==51) ) {
			alt67=1;
		}
		} finally {dbg.exitDecision(67);}

		switch (alt67) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:146:4: pointer
				{
				dbg.location(146,4);
				pushFollow(FOLLOW_pointer_in_synpred30_myChecker458);
				pointer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(67);}
		dbg.location(146,13);
		pushFollow(FOLLOW_direct_declarator_in_synpred30_myChecker461);
		direct_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred30_myChecker

	// $ANTLR start synpred32_myChecker
	public final void synpred32_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:38: ( declarator_suffix )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:152:38: declarator_suffix
		{
		dbg.location(152,38);
		pushFollow(FOLLOW_declarator_suffix_in_synpred32_myChecker498);
		declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred32_myChecker

	// $ANTLR start synpred38_myChecker
	public final void synpred38_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:24: ( pointer )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:170:24: pointer
		{
		dbg.location(170,24);
		pushFollow(FOLLOW_pointer_in_synpred38_myChecker596);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred38_myChecker

	// $ANTLR start synpred40_myChecker
	public final void synpred40_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:171:4: ( '*' pointer )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:171:4: '*' pointer
		{
		dbg.location(171,4);
		match(input,51,FOLLOW_51_in_synpred40_myChecker604); if (state.failed) return;dbg.location(171,8);
		pushFollow(FOLLOW_pointer_in_synpred40_myChecker606);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_myChecker

	// $ANTLR start synpred43_myChecker
	public final void synpred43_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:28: ( declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:28: declarator
		{
		dbg.location(184,28);
		pushFollow(FOLLOW_declarator_in_synpred43_myChecker669);
		declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_myChecker

	// $ANTLR start synpred44_myChecker
	public final void synpred44_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:39: ( abstract_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:184:39: abstract_declarator
		{
		dbg.location(184,39);
		pushFollow(FOLLOW_abstract_declarator_in_synpred44_myChecker671);
		abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred44_myChecker

	// $ANTLR start synpred46_myChecker
	public final void synpred46_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:193:12: ( direct_abstract_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:193:12: direct_abstract_declarator
		{
		dbg.location(193,12);
		pushFollow(FOLLOW_direct_abstract_declarator_in_synpred46_myChecker709);
		direct_abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred46_myChecker

	// $ANTLR start synpred49_myChecker
	public final void synpred49_myChecker_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:65: ( abstract_declarator_suffix )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:198:65: abstract_declarator_suffix
		{
		dbg.location(198,65);
		pushFollow(FOLLOW_abstract_declarator_suffix_in_synpred49_myChecker744);
		abstract_declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred49_myChecker

	// $ANTLR start synpred67_myChecker
	public final void synpred67_myChecker_fragment() throws RecognitionException {
		Type unary4 =null;

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:277:4: ( 'sizeof' unary4= unary_expression )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:277:4: 'sizeof' unary4= unary_expression
		{
		dbg.location(277,4);
		match(input,85,FOLLOW_85_in_synpred67_myChecker1050); if (state.failed) return;dbg.location(277,19);
		pushFollow(FOLLOW_unary_expression_in_synpred67_myChecker1054);
		unary4=unary_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred67_myChecker

	// $ANTLR start synpred86_myChecker
	public final void synpred86_myChecker_fragment() throws RecognitionException {
		ParserRuleReturnScope assign2 =null;

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:367:4: ( lvalue assignment_operator assign2= assignment_expression )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:367:4: lvalue assignment_operator assign2= assignment_expression
		{
		dbg.location(367,4);
		pushFollow(FOLLOW_lvalue_in_synpred86_myChecker1351);
		lvalue();
		state._fsp--;
		if (state.failed) return;dbg.location(367,11);
		pushFollow(FOLLOW_assignment_operator_in_synpred86_myChecker1353);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;dbg.location(367,38);
		pushFollow(FOLLOW_assignment_expression_in_synpred86_myChecker1357);
		assign2=assignment_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred86_myChecker

	// Delegated rules

	public final boolean synpred67_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred67_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred49_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred49_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred86_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred44_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred44_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred46_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred32_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred32_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred38_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred43_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred40_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred30_myChecker() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred30_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA44 dfa44 = new DFA44(this);
	protected DFA55 dfa55 = new DFA55(this);
	static final String DFA44_eotS =
		"\u0170\uffff";
	static final String DFA44_eofS =
		"\1\uffff\5\41\u016a\uffff";
	static final String DFA44_minS =
		"\1\10\5\53\1\5\11\10\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff"+
		"\6\0\40\uffff\17\0\14\uffff\u0087\0";
	static final String DFA44_maxS =
		"\1\133\5\132\12\133\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff"+
		"\6\0\40\uffff\17\0\14\uffff\u0087\0";
	static final String DFA44_acceptS =
		"\26\uffff\1\1\12\uffff\1\2\u014e\uffff";
	static final String DFA44_specialS =
		"\20\uffff\1\0\1\1\1\2\1\3\1\4\1\5\40\uffff\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\40\uffff\1\14\1\15\1\16\1\17\1\20\1\21\40\uffff\1\22\1\23\1\24\1\25\1"+
		"\26\1\27\40\uffff\1\30\1\31\1\32\1\33\1\34\1\35\40\uffff\1\36\1\37\1\40"+
		"\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\14\uffff"+
		"\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72"+
		"\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1"+
		"\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
		"\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136"+
		"\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152"+
		"\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166"+
		"\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081"+
		"\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a"+
		"\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093"+
		"\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
		"\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
		"\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae"+
		"\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3}>";
	static final String[] DFA44_transitionS = {
			"\1\3\3\uffff\1\2\6\uffff\1\5\2\uffff\1\1\14\uffff\1\4\6\uffff\1\16\4"+
			"\uffff\1\11\1\uffff\1\6\1\uffff\1\12\2\uffff\1\13\1\7\2\uffff\1\14\1"+
			"\10\31\uffff\1\17\5\uffff\1\15",
			"\2\41\1\26\2\41\1\26\1\21\2\41\1\uffff\1\26\1\41\1\24\1\26\2\41\1\25"+
			"\1\26\1\23\1\22\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26\1\41"+
			"\1\20\2\41\1\26\4\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\67\2\41\1\uffff\1\26\1\41\1\72\1\26\2\41\1\73"+
			"\1\26\1\71\1\70\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26\1\41"+
			"\1\66\2\41\1\26\4\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\135\2\41\1\uffff\1\26\1\41\1\140\1\26\2\41\1"+
			"\141\1\26\1\137\1\136\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26"+
			"\1\41\1\134\2\41\1\26\4\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\u0083\2\41\1\uffff\1\26\1\41\1\u0086\1\26\2\41"+
			"\1\u0087\1\26\1\u0085\1\u0084\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4"+
			"\41\1\26\1\41\1\u0082\2\41\1\26\4\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\u00a9\2\41\1\uffff\1\26\1\41\1\u00ac\1\26\2\41"+
			"\1\u00ad\1\26\1\u00ab\1\u00aa\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4"+
			"\41\1\26\1\41\1\u00a8\2\41\1\26\4\uffff\1\41\1\26\2\41",
			"\1\41\1\uffff\1\41\1\u00d0\1\uffff\1\41\1\uffff\1\u00cf\1\uffff\1\41"+
			"\3\uffff\1\41\1\u00d2\2\uffff\1\u00ce\1\uffff\1\41\3\uffff\1\41\3\uffff"+
			"\2\41\1\uffff\1\u00d1\1\uffff\3\41\2\uffff\1\u00db\4\uffff\1\u00d6\1"+
			"\uffff\1\u00d3\1\uffff\1\u00d7\2\uffff\1\u00d8\1\u00d4\2\uffff\1\u00d9"+
			"\1\u00d5\31\uffff\1\u00dc\5\uffff\1\u00da",
			"\1\u00eb\3\uffff\1\u00ea\6\uffff\1\u00ed\2\uffff\1\u00e9\14\uffff\1"+
			"\u00ec\6\uffff\1\u00f6\4\uffff\1\u00f1\1\uffff\1\u00ee\1\uffff\1\u00f2"+
			"\2\uffff\1\u00f3\1\u00ef\2\uffff\1\u00f4\1\u00f0\31\uffff\1\u00f7\5\uffff"+
			"\1\u00f5",
			"\1\u00fa\3\uffff\1\u00f9\6\uffff\1\u00fc\2\uffff\1\u00f8\14\uffff\1"+
			"\u00fb\6\uffff\1\u0105\4\uffff\1\u0100\1\uffff\1\u00fd\1\uffff\1\u0101"+
			"\2\uffff\1\u0102\1\u00fe\2\uffff\1\u0103\1\u00ff\31\uffff\1\u0106\5\uffff"+
			"\1\u0104",
			"\1\u010a\3\uffff\1\u0109\6\uffff\1\u010c\2\uffff\1\u0108\14\uffff\1"+
			"\u010b\6\uffff\1\u0114\4\uffff\1\u010f\1\uffff\1\u0107\1\uffff\1\u0110"+
			"\2\uffff\1\u0111\1\u010d\2\uffff\1\u0112\1\u010e\31\uffff\1\u0115\5\uffff"+
			"\1\u0113",
			"\1\u0119\3\uffff\1\u0118\6\uffff\1\u011b\2\uffff\1\u0117\14\uffff\1"+
			"\u011a\6\uffff\1\u0123\4\uffff\1\u011e\1\uffff\1\u0116\1\uffff\1\u011f"+
			"\2\uffff\1\u0120\1\u011c\2\uffff\1\u0121\1\u011d\31\uffff\1\u0124\5\uffff"+
			"\1\u0122",
			"\1\u0128\3\uffff\1\u0127\6\uffff\1\u012a\2\uffff\1\u0126\14\uffff\1"+
			"\u0129\6\uffff\1\u0132\4\uffff\1\u012d\1\uffff\1\u0125\1\uffff\1\u012e"+
			"\2\uffff\1\u012f\1\u012b\2\uffff\1\u0130\1\u012c\31\uffff\1\u0133\5\uffff"+
			"\1\u0131",
			"\1\u0137\3\uffff\1\u0136\6\uffff\1\u0139\2\uffff\1\u0135\14\uffff\1"+
			"\u0138\6\uffff\1\u0141\4\uffff\1\u013c\1\uffff\1\u0134\1\uffff\1\u013d"+
			"\2\uffff\1\u013e\1\u013a\2\uffff\1\u013f\1\u013b\31\uffff\1\u0142\5\uffff"+
			"\1\u0140",
			"\1\u0146\3\uffff\1\u0145\6\uffff\1\u0148\2\uffff\1\u0144\14\uffff\1"+
			"\u0147\6\uffff\1\u0150\4\uffff\1\u014b\1\uffff\1\u0143\1\uffff\1\u014c"+
			"\2\uffff\1\u014d\1\u0149\2\uffff\1\u014e\1\u014a\31\uffff\1\u0151\5\uffff"+
			"\1\u014f",
			"\1\u0155\3\uffff\1\u0154\6\uffff\1\u0157\2\uffff\1\u0153\14\uffff\1"+
			"\u0156\6\uffff\1\u015f\4\uffff\1\u015a\1\uffff\1\u0152\1\uffff\1\u015b"+
			"\2\uffff\1\u015c\1\u0158\2\uffff\1\u015d\1\u0159\31\uffff\1\u0160\5\uffff"+
			"\1\u015e",
			"\1\u0164\3\uffff\1\u0163\6\uffff\1\u0166\2\uffff\1\u0162\14\uffff\1"+
			"\u0165\6\uffff\1\u016e\4\uffff\1\u0169\1\uffff\1\u0161\1\uffff\1\u016a"+
			"\2\uffff\1\u016b\1\u0167\2\uffff\1\u016c\1\u0168\31\uffff\1\u016f\5\uffff"+
			"\1\u016d",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
	static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
	static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
	static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
	static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
	static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
	static final short[][] DFA44_transition;

	static {
		int numStates = DFA44_transitionS.length;
		DFA44_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
		}
	}

	protected class DFA44 extends DFA {

		public DFA44(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 44;
			this.eot = DFA44_eot;
			this.eof = DFA44_eof;
			this.min = DFA44_min;
			this.max = DFA44_max;
			this.accept = DFA44_accept;
			this.special = DFA44_special;
			this.transition = DFA44_transition;
		}
		@Override
		public String getDescription() {
			return "366:1: assignment_expression returns [Type type] : ( lvalue assignment_operator assign2= assignment_expression | conditional_expression );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA44_16 = input.LA(1);
						 
						int index44_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_16);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA44_17 = input.LA(1);
						 
						int index44_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_17);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA44_18 = input.LA(1);
						 
						int index44_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_18);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA44_19 = input.LA(1);
						 
						int index44_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_19);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA44_20 = input.LA(1);
						 
						int index44_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_20);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA44_21 = input.LA(1);
						 
						int index44_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_21);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA44_54 = input.LA(1);
						 
						int index44_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_54);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA44_55 = input.LA(1);
						 
						int index44_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_55);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA44_56 = input.LA(1);
						 
						int index44_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_56);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA44_57 = input.LA(1);
						 
						int index44_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_57);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA44_58 = input.LA(1);
						 
						int index44_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_58);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA44_59 = input.LA(1);
						 
						int index44_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_59);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA44_92 = input.LA(1);
						 
						int index44_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_92);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA44_93 = input.LA(1);
						 
						int index44_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_93);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA44_94 = input.LA(1);
						 
						int index44_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_94);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA44_95 = input.LA(1);
						 
						int index44_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_95);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA44_96 = input.LA(1);
						 
						int index44_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_96);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA44_97 = input.LA(1);
						 
						int index44_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_97);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA44_130 = input.LA(1);
						 
						int index44_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_130);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA44_131 = input.LA(1);
						 
						int index44_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_131);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA44_132 = input.LA(1);
						 
						int index44_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_132);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA44_133 = input.LA(1);
						 
						int index44_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_133);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA44_134 = input.LA(1);
						 
						int index44_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_134);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA44_135 = input.LA(1);
						 
						int index44_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_135);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA44_168 = input.LA(1);
						 
						int index44_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_168);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA44_169 = input.LA(1);
						 
						int index44_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_169);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA44_170 = input.LA(1);
						 
						int index44_170 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_170);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA44_171 = input.LA(1);
						 
						int index44_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_171);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA44_172 = input.LA(1);
						 
						int index44_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_172);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA44_173 = input.LA(1);
						 
						int index44_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_173);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA44_206 = input.LA(1);
						 
						int index44_206 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_206);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA44_207 = input.LA(1);
						 
						int index44_207 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_207);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA44_208 = input.LA(1);
						 
						int index44_208 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_208);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA44_209 = input.LA(1);
						 
						int index44_209 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_209);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA44_210 = input.LA(1);
						 
						int index44_210 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_210);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA44_211 = input.LA(1);
						 
						int index44_211 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_211);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA44_212 = input.LA(1);
						 
						int index44_212 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_212);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA44_213 = input.LA(1);
						 
						int index44_213 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_213);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA44_214 = input.LA(1);
						 
						int index44_214 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_214);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA44_215 = input.LA(1);
						 
						int index44_215 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_215);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA44_216 = input.LA(1);
						 
						int index44_216 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_216);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA44_217 = input.LA(1);
						 
						int index44_217 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_217);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA44_218 = input.LA(1);
						 
						int index44_218 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_218);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA44_219 = input.LA(1);
						 
						int index44_219 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_219);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA44_220 = input.LA(1);
						 
						int index44_220 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_220);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA44_233 = input.LA(1);
						 
						int index44_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_233);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA44_234 = input.LA(1);
						 
						int index44_234 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_234);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA44_235 = input.LA(1);
						 
						int index44_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_235);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA44_236 = input.LA(1);
						 
						int index44_236 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_236);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA44_237 = input.LA(1);
						 
						int index44_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_237);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA44_238 = input.LA(1);
						 
						int index44_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_238);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA44_239 = input.LA(1);
						 
						int index44_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_239);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA44_240 = input.LA(1);
						 
						int index44_240 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_240);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA44_241 = input.LA(1);
						 
						int index44_241 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_241);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA44_242 = input.LA(1);
						 
						int index44_242 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_242);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA44_243 = input.LA(1);
						 
						int index44_243 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_243);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA44_244 = input.LA(1);
						 
						int index44_244 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_244);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA44_245 = input.LA(1);
						 
						int index44_245 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_245);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA44_246 = input.LA(1);
						 
						int index44_246 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_246);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA44_247 = input.LA(1);
						 
						int index44_247 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_247);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA44_248 = input.LA(1);
						 
						int index44_248 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_248);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA44_249 = input.LA(1);
						 
						int index44_249 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_249);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA44_250 = input.LA(1);
						 
						int index44_250 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_250);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA44_251 = input.LA(1);
						 
						int index44_251 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_251);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA44_252 = input.LA(1);
						 
						int index44_252 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_252);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA44_253 = input.LA(1);
						 
						int index44_253 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_253);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA44_254 = input.LA(1);
						 
						int index44_254 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_254);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA44_255 = input.LA(1);
						 
						int index44_255 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_255);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA44_256 = input.LA(1);
						 
						int index44_256 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_256);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA44_257 = input.LA(1);
						 
						int index44_257 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_257);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA44_258 = input.LA(1);
						 
						int index44_258 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_258);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA44_259 = input.LA(1);
						 
						int index44_259 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_259);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA44_260 = input.LA(1);
						 
						int index44_260 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_260);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA44_261 = input.LA(1);
						 
						int index44_261 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_261);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA44_262 = input.LA(1);
						 
						int index44_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_262);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA44_263 = input.LA(1);
						 
						int index44_263 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_263);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA44_264 = input.LA(1);
						 
						int index44_264 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_264);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA44_265 = input.LA(1);
						 
						int index44_265 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_265);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA44_266 = input.LA(1);
						 
						int index44_266 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_266);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA44_267 = input.LA(1);
						 
						int index44_267 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_267);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA44_268 = input.LA(1);
						 
						int index44_268 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_268);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA44_269 = input.LA(1);
						 
						int index44_269 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_269);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA44_270 = input.LA(1);
						 
						int index44_270 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_270);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA44_271 = input.LA(1);
						 
						int index44_271 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_271);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA44_272 = input.LA(1);
						 
						int index44_272 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_272);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA44_273 = input.LA(1);
						 
						int index44_273 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_273);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA44_274 = input.LA(1);
						 
						int index44_274 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_274);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA44_275 = input.LA(1);
						 
						int index44_275 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_275);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA44_276 = input.LA(1);
						 
						int index44_276 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_276);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA44_277 = input.LA(1);
						 
						int index44_277 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_277);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA44_278 = input.LA(1);
						 
						int index44_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_278);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA44_279 = input.LA(1);
						 
						int index44_279 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_279);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA44_280 = input.LA(1);
						 
						int index44_280 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_280);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA44_281 = input.LA(1);
						 
						int index44_281 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_281);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA44_282 = input.LA(1);
						 
						int index44_282 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_282);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA44_283 = input.LA(1);
						 
						int index44_283 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_283);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA44_284 = input.LA(1);
						 
						int index44_284 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_284);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA44_285 = input.LA(1);
						 
						int index44_285 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_285);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA44_286 = input.LA(1);
						 
						int index44_286 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_286);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA44_287 = input.LA(1);
						 
						int index44_287 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_287);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA44_288 = input.LA(1);
						 
						int index44_288 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_288);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA44_289 = input.LA(1);
						 
						int index44_289 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_289);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA44_290 = input.LA(1);
						 
						int index44_290 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_290);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA44_291 = input.LA(1);
						 
						int index44_291 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_291);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA44_292 = input.LA(1);
						 
						int index44_292 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_292);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA44_293 = input.LA(1);
						 
						int index44_293 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_293);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA44_294 = input.LA(1);
						 
						int index44_294 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_294);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA44_295 = input.LA(1);
						 
						int index44_295 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_295);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA44_296 = input.LA(1);
						 
						int index44_296 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_296);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA44_297 = input.LA(1);
						 
						int index44_297 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_297);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA44_298 = input.LA(1);
						 
						int index44_298 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_298);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA44_299 = input.LA(1);
						 
						int index44_299 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_299);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA44_300 = input.LA(1);
						 
						int index44_300 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_300);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA44_301 = input.LA(1);
						 
						int index44_301 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_301);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA44_302 = input.LA(1);
						 
						int index44_302 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_302);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA44_303 = input.LA(1);
						 
						int index44_303 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_303);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA44_304 = input.LA(1);
						 
						int index44_304 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_304);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA44_305 = input.LA(1);
						 
						int index44_305 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_305);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA44_306 = input.LA(1);
						 
						int index44_306 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_306);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA44_307 = input.LA(1);
						 
						int index44_307 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_307);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA44_308 = input.LA(1);
						 
						int index44_308 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_308);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA44_309 = input.LA(1);
						 
						int index44_309 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_309);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA44_310 = input.LA(1);
						 
						int index44_310 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_310);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA44_311 = input.LA(1);
						 
						int index44_311 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_311);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA44_312 = input.LA(1);
						 
						int index44_312 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_312);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA44_313 = input.LA(1);
						 
						int index44_313 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_313);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA44_314 = input.LA(1);
						 
						int index44_314 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_314);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA44_315 = input.LA(1);
						 
						int index44_315 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_315);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA44_316 = input.LA(1);
						 
						int index44_316 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_316);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA44_317 = input.LA(1);
						 
						int index44_317 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_317);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA44_318 = input.LA(1);
						 
						int index44_318 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_318);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA44_319 = input.LA(1);
						 
						int index44_319 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_319);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA44_320 = input.LA(1);
						 
						int index44_320 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_320);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA44_321 = input.LA(1);
						 
						int index44_321 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_321);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA44_322 = input.LA(1);
						 
						int index44_322 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_322);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA44_323 = input.LA(1);
						 
						int index44_323 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_323);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA44_324 = input.LA(1);
						 
						int index44_324 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_324);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA44_325 = input.LA(1);
						 
						int index44_325 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_325);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA44_326 = input.LA(1);
						 
						int index44_326 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_326);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA44_327 = input.LA(1);
						 
						int index44_327 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_327);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA44_328 = input.LA(1);
						 
						int index44_328 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_328);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA44_329 = input.LA(1);
						 
						int index44_329 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_329);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA44_330 = input.LA(1);
						 
						int index44_330 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_330);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA44_331 = input.LA(1);
						 
						int index44_331 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_331);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA44_332 = input.LA(1);
						 
						int index44_332 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_332);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA44_333 = input.LA(1);
						 
						int index44_333 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_333);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA44_334 = input.LA(1);
						 
						int index44_334 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_334);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA44_335 = input.LA(1);
						 
						int index44_335 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_335);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA44_336 = input.LA(1);
						 
						int index44_336 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_336);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA44_337 = input.LA(1);
						 
						int index44_337 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_337);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA44_338 = input.LA(1);
						 
						int index44_338 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_338);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA44_339 = input.LA(1);
						 
						int index44_339 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_339);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA44_340 = input.LA(1);
						 
						int index44_340 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_340);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA44_341 = input.LA(1);
						 
						int index44_341 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_341);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA44_342 = input.LA(1);
						 
						int index44_342 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_342);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA44_343 = input.LA(1);
						 
						int index44_343 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_343);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA44_344 = input.LA(1);
						 
						int index44_344 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_344);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA44_345 = input.LA(1);
						 
						int index44_345 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_345);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA44_346 = input.LA(1);
						 
						int index44_346 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_346);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA44_347 = input.LA(1);
						 
						int index44_347 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_347);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA44_348 = input.LA(1);
						 
						int index44_348 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_348);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA44_349 = input.LA(1);
						 
						int index44_349 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_349);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA44_350 = input.LA(1);
						 
						int index44_350 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_350);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA44_351 = input.LA(1);
						 
						int index44_351 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_351);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA44_352 = input.LA(1);
						 
						int index44_352 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_352);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA44_353 = input.LA(1);
						 
						int index44_353 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_353);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA44_354 = input.LA(1);
						 
						int index44_354 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_354);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA44_355 = input.LA(1);
						 
						int index44_355 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_355);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA44_356 = input.LA(1);
						 
						int index44_356 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_356);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA44_357 = input.LA(1);
						 
						int index44_357 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_357);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA44_358 = input.LA(1);
						 
						int index44_358 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_358);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA44_359 = input.LA(1);
						 
						int index44_359 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_359);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA44_360 = input.LA(1);
						 
						int index44_360 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_360);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA44_361 = input.LA(1);
						 
						int index44_361 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_361);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA44_362 = input.LA(1);
						 
						int index44_362 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_362);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA44_363 = input.LA(1);
						 
						int index44_363 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_363);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA44_364 = input.LA(1);
						 
						int index44_364 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_364);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA44_365 = input.LA(1);
						 
						int index44_365 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_365);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA44_366 = input.LA(1);
						 
						int index44_366 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_366);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA44_367 = input.LA(1);
						 
						int index44_367 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred86_myChecker()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index44_367);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 44, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA55_eotS =
		"\77\uffff";
	static final String DFA55_eofS =
		"\77\uffff";
	static final String DFA55_minS =
		"\1\6\1\53\75\uffff";
	static final String DFA55_maxS =
		"\1\133\1\131\75\uffff";
	static final String DFA55_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\1\3\16\uffff\1\4\1\uffff\1\5\2\uffff\1\6\45\uffff";
	static final String DFA55_specialS =
		"\77\uffff}>";
	static final String[] DFA55_transitionS = {
			"\1\31\1\uffff\1\5\2\uffff\1\31\1\5\1\26\5\uffff\1\5\1\26\1\31\1\1\1\24"+
			"\7\uffff\1\31\3\uffff\1\5\1\24\3\uffff\1\26\1\uffff\1\5\4\uffff\1\5\1"+
			"\uffff\1\5\1\uffff\1\5\2\uffff\2\5\2\uffff\2\5\7\uffff\1\5\17\uffff\2"+
			"\2\1\5\1\4\4\uffff\1\5",
			"\7\5\1\uffff\1\5\1\uffff\12\5\1\uffff\2\5\1\2\15\5\1\uffff\2\5\4\uffff"+
			"\3\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
	static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
	static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
	static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
	static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
	static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
	static final short[][] DFA55_transition;

	static {
		int numStates = DFA55_transitionS.length;
		DFA55_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
		}
	}

	protected class DFA55 extends DFA {

		public DFA55(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 55;
			this.eot = DFA55_eot;
			this.eof = DFA55_eof;
			this.min = DFA55_min;
			this.max = DFA55_max;
			this.accept = DFA55_accept;
			this.special = DFA55_special;
			this.transition = DFA55_transition;
		}
		@Override
		public String getDescription() {
			return "542:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_set_in_program75 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_MAIN_in_program83 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_program85 = new BitSet(new long[]{0x0204000001000080L});
	public static final BitSet FOLLOW_INT_in_program88 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_program90 = new BitSet(new long[]{0x0204000000000080L});
	public static final BitSet FOLLOW_57_in_program95 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHAR_in_program98 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_program100 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_program102 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_CHAR_in_program108 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_program110 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_program112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_program114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_program116 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_program121 = new BitSet(new long[]{0x000000E7510544B0L,0x0000000000400000L});
	public static final BitSet FOLLOW_declaration_in_program125 = new BitSet(new long[]{0x000000E7510544B0L,0x0000000000400000L});
	public static final BitSet FOLLOW_compound_statement_in_program128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_program132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_declaration162 = new BitSet(new long[]{0x000A000000400000L,0x0000000000000008L});
	public static final BitSet FOLLOW_init_declarator_list_in_declaration164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_declaration168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list187 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_init_declarator_list191 = new BitSet(new long[]{0x000A000000400000L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list193 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_declarator_in_init_declarator215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_init_declarator218 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008600000L});
	public static final BitSet FOLLOW_initializer_in_init_declarator220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers243 = new BitSet(new long[]{0x000000E7510544B2L});
	public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers247 = new BitSet(new long[]{0x000000E7510544B2L});
	public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers251 = new BitSet(new long[]{0x000000E7510544B2L});
	public static final BitSet FOLLOW_CONST_in_type_qualifier269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_type_qualifier276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTERN_in_storage_class_specifier289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_storage_class_specifier296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTO_in_storage_class_specifier303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_storage_class_specifier310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name328 = new BitSet(new long[]{0x000A000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_abstract_declarator_in_type_name330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list350 = new BitSet(new long[]{0x000000E3110444A2L});
	public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list356 = new BitSet(new long[]{0x000000E3110444A2L});
	public static final BitSet FOLLOW_VOID_in_type_specifier376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type_specifier383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type_specifier390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type_specifier397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_type_specifier404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type_specifier411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type_specifier418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNED_in_type_specifier425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_in_type_specifier432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type_specifier439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator458 = new BitSet(new long[]{0x0002000000400000L});
	public static final BitSet FOLLOW_direct_declarator_in_declarator461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_direct_declarator487 = new BitSet(new long[]{0x0002000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_49_in_direct_declarator491 = new BitSet(new long[]{0x000A000000400000L});
	public static final BitSet FOLLOW_declarator_in_direct_declarator493 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_direct_declarator495 = new BitSet(new long[]{0x0002000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_declarator_suffix_in_direct_declarator498 = new BitSet(new long[]{0x0002000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_declarator_suffix516 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_constant_expression_in_declarator_suffix518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_declarator_suffix520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_declarator_suffix530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_declarator_suffix532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_declarator_suffix544 = new BitSet(new long[]{0x000000E7510544B0L});
	public static final BitSet FOLLOW_parameter_type_list_in_declarator_suffix546 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_declarator_suffix548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_declarator_suffix560 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_identifier_list_in_declarator_suffix562 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_declarator_suffix564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_declarator_suffix576 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_declarator_suffix578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_pointer591 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_type_qualifier_in_pointer593 = new BitSet(new long[]{0x0008008000000402L});
	public static final BitSet FOLLOW_pointer_in_pointer596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_pointer604 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_pointer_in_pointer606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_pointer613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_list_in_parameter_type_list626 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_parameter_type_list629 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_parameter_type_list631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list646 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_parameter_list649 = new BitSet(new long[]{0x000000E7510544B0L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list651 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration666 = new BitSet(new long[]{0x000A000000400002L,0x0000000000008000L});
	public static final BitSet FOLLOW_declarator_in_parameter_declaration669 = new BitSet(new long[]{0x000A000000400002L,0x0000000000008000L});
	public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration671 = new BitSet(new long[]{0x000A000000400002L,0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list686 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_identifier_list689 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list691 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_pointer_in_abstract_declarator707 = new BitSet(new long[]{0x0002000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_direct_abstract_declarator732 = new BitSet(new long[]{0x000A000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator734 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_direct_abstract_declarator736 = new BitSet(new long[]{0x0002000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator740 = new BitSet(new long[]{0x0002000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator744 = new BitSet(new long[]{0x0002000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_abstract_declarator_suffix759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_abstract_declarator_suffix761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_abstract_declarator_suffix768 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_constant_expression_in_abstract_declarator_suffix770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_abstract_declarator_suffix772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_abstract_declarator_suffix779 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_abstract_declarator_suffix781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_abstract_declarator_suffix788 = new BitSet(new long[]{0x000000E7510544B0L});
	public static final BitSet FOLLOW_parameter_type_list_in_abstract_declarator_suffix790 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_abstract_declarator_suffix792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_initializer817 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008600000L});
	public static final BitSet FOLLOW_initializer_list_in_initializer819 = new BitSet(new long[]{0x0200000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_57_in_initializer821 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_initializer824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initializer_in_initializer_list844 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_initializer_list847 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008600000L});
	public static final BitSet FOLLOW_initializer_in_initializer_list849 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list866 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_argument_expression_list869 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list871 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression894 = new BitSet(new long[]{0x0440000000000002L});
	public static final BitSet FOLLOW_54_in_additive_expression898 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression902 = new BitSet(new long[]{0x0440000000000002L});
	public static final BitSet FOLLOW_58_in_additive_expression906 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression910 = new BitSet(new long[]{0x0440000000000002L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression935 = new BitSet(new long[]{0x0008100000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_51_in_multiplicative_expression939 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression943 = new BitSet(new long[]{0x0008100000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_multiplicative_expression947 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression951 = new BitSet(new long[]{0x0008100000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_44_in_multiplicative_expression955 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression959 = new BitSet(new long[]{0x0008100000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_49_in_cast_expression981 = new BitSet(new long[]{0x000000E3110444A0L});
	public static final BitSet FOLLOW_type_name_in_cast_expression983 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_cast_expression985 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unary_expression1019 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_unary_expression1030 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression1041 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_unary_expression1050 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_unary_expression1061 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_unary_expression1063 = new BitSet(new long[]{0x000000E3110444A0L});
	public static final BitSet FOLLOW_type_name_in_unary_expression1065 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_unary_expression1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression1092 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_postfix_expression1096 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_postfix_expression1098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_postfix_expression1100 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_49_in_postfix_expression1104 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_postfix_expression1106 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_49_in_postfix_expression1110 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1112 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_postfix_expression1114 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_62_in_postfix_expression1119 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1121 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_61_in_postfix_expression1126 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1128 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_55_in_postfix_expression1132 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_59_in_postfix_expression1136 = new BitSet(new long[]{0x6882000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_47_in_unary_operator1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unary_operator1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unary_operator1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_unary_operator1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_unary_operator1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_unary_operator1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_primary_expression1223 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_primary_expression1225 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_primary_expression1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_constant1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_LITERAL_in_constant1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_constant1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1306 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_expression1309 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1311 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_constant_expression1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment_expression1351 = new BitSet(new long[]{0x1121200000000000L,0x0000000001042142L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1353 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_assignment_expression1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_lvalue1384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_assignment_operator1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_assignment_operator1404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_assignment_operator1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_assignment_operator1418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_assignment_operator1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_assignment_operator1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_assignment_operator1439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_assignment_operator1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_assignment_operator1453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_assignment_operator1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_assignment_operator1467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression1490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conditional_expression1493 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_conditional_expression1495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_conditional_expression1497 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_expression1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1522 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_logical_or_expression1525 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1529 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1551 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_logical_and_expression1554 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1558 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_inclusive_or_expression1583 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_exclusive_or_expression1612 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1638 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_and_expression1641 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1645 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1667 = new BitSet(new long[]{0x0000080000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_equality_expression1670 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1678 = new BitSet(new long[]{0x0000080000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C90L});
	public static final BitSet FOLLOW_set_in_relational_expression1703 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C90L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1737 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001020L});
	public static final BitSet FOLLOW_set_in_shift_expression1740 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001020L});
	public static final BitSet FOLLOW_labeled_statement_in_statement1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement1779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement1799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement1816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_labeled_statement1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_labeled_statement1835 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_labeled_statement1844 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_constant_expression_in_labeled_statement1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_labeled_statement1848 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_labeled_statement1857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_labeled_statement1859 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_compound_statement1878 = new BitSet(new long[]{0x0CCA85FFD1FD7DF0L,0x000000000C780008L});
	public static final BitSet FOLLOW_declaration_in_compound_statement1880 = new BitSet(new long[]{0x0CCA85FFD1FD7DF0L,0x000000000C780008L});
	public static final BitSet FOLLOW_statement_list_in_compound_statement1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_compound_statement1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement_list1903 = new BitSet(new long[]{0x0CCA851880F83942L,0x0000000008780008L});
	public static final BitSet FOLLOW_67_in_expression_statement1921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_expression_statement1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_selection_statement1944 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_selection_statement1946 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_selection_statement1948 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_selection_statement1950 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_selection_statement1952 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ELSE_in_selection_statement1967 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_selection_statement1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_selection_statement1980 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_selection_statement1982 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_selection_statement1984 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_selection_statement1986 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_selection_statement1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement2007 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement2009 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2011 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_iteration_statement2013 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_iteration_statement2025 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2027 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement2029 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement2031 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2033 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_iteration_statement2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_iteration_statement2037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_iteration_statement2047 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement2049 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200008L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement2051 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200008L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement2055 = new BitSet(new long[]{0x0CCE840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2057 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_iteration_statement2060 = new BitSet(new long[]{0x0CCA851880F83940L,0x0000000008780008L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GOTO_in_jump_statement2079 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_jump_statement2081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_jump_statement2083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_jump_statement2090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_jump_statement2092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_jump_statement2099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_jump_statement2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_jump_statement2110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement2117 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_expression_in_jump_statement2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_jump_statement2121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred30_myChecker458 = new BitSet(new long[]{0x0002000000400000L});
	public static final BitSet FOLLOW_direct_declarator_in_synpred30_myChecker461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_suffix_in_synpred32_myChecker498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred38_myChecker596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_synpred40_myChecker604 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_pointer_in_synpred40_myChecker606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_in_synpred43_myChecker669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_in_synpred44_myChecker671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred46_myChecker709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_synpred49_myChecker744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_synpred67_myChecker1050 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_unary_expression_in_synpred67_myChecker1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred86_myChecker1351 = new BitSet(new long[]{0x1121200000000000L,0x0000000001042142L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred86_myChecker1353 = new BitSet(new long[]{0x0CCA840800481100L,0x0000000008200000L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred86_myChecker1357 = new BitSet(new long[]{0x0000000000000002L});
}
