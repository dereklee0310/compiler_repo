// $ANTLR null C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g 2023-05-10 14:26:29

    // import packages here.
    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class myparserParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTO", "BREAK", "CHAR", "CHARACTER_LITERAL", 
		"COMMENT", "CONST", "CONTINUE", "DECIMAL_LITERAL", "DO", "DOUBLE", "ELSE", 
		"EXTERN", "EscapeSequence", "FLOAT", "FLOATING_POINT_LITERAL", "FOR", 
		"GOTO", "IDENTIFIER", "IF", "INT", "LETTER", "LINE_COMMAND", "LINE_COMMENT", 
		"LONG", "MAIN", "REGISTER", "RETURN", "SHORT", "SIGNED", "STATIC", "STRING_LITERAL", 
		"SWITCH", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "WS", "'!'", "'!='", 
		"'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'**'", "'*='", 
		"'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'...'", 
		"'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", 
		"'>'", "'>='", "'>>'", "'>>='", "'?'", "'['", "']'", "'^'", "'^='", "'case'", 
		"'default'", "'sizeof'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__41=41;
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
	public static final int AUTO=4;
	public static final int BREAK=5;
	public static final int CHAR=6;
	public static final int CHARACTER_LITERAL=7;
	public static final int COMMENT=8;
	public static final int CONST=9;
	public static final int CONTINUE=10;
	public static final int DECIMAL_LITERAL=11;
	public static final int DO=12;
	public static final int DOUBLE=13;
	public static final int ELSE=14;
	public static final int EXTERN=15;
	public static final int EscapeSequence=16;
	public static final int FLOAT=17;
	public static final int FLOATING_POINT_LITERAL=18;
	public static final int FOR=19;
	public static final int GOTO=20;
	public static final int IDENTIFIER=21;
	public static final int IF=22;
	public static final int INT=23;
	public static final int LETTER=24;
	public static final int LINE_COMMAND=25;
	public static final int LINE_COMMENT=26;
	public static final int LONG=27;
	public static final int MAIN=28;
	public static final int REGISTER=29;
	public static final int RETURN=30;
	public static final int SHORT=31;
	public static final int SIGNED=32;
	public static final int STATIC=33;
	public static final int STRING_LITERAL=34;
	public static final int SWITCH=35;
	public static final int UNSIGNED=36;
	public static final int VOID=37;
	public static final int VOLATILE=38;
	public static final int WHILE=39;
	public static final int WS=40;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "type_name", "synpred80_myparser", "synpred109_myparser", 
		"statement", "synpred105_myparser", "synpred42_myparser", "synpred63_myparser", 
		"expression_statement", "synpred68_myparser", "declaration", "synpred31_myparser", 
		"synpred117_myparser", "synpred27_myparser", "synpred126_myparser", "synpred60_myparser", 
		"synpred120_myparser", "synpred48_myparser", "synpred71_myparser", "synpred86_myparser", 
		"synpred104_myparser", "synpred22_myparser", "type_specifier", "postfix_expression", 
		"synpred29_myparser", "logical_or_expression", "synpred51_myparser", "synpred55_myparser", 
		"synpred7_myparser", "synpred13_myparser", "synpred40_myparser", "synpred58_myparser", 
		"synpred72_myparser", "synpred3_myparser", "synpred103_myparser", "synpred108_myparser", 
		"synpred119_myparser", "synpred125_myparser", "synpred54_myparser", "synpred24_myparser", 
		"multiplicative_expression", "declarator_suffix", "synpred73_myparser", 
		"exclusive_or_expression", "synpred14_myparser", "synpred93_myparser", 
		"synpred5_myparser", "synpred57_myparser", "abstract_declarator", "compound_statement", 
		"synpred8_myparser", "synpred122_myparser", "declarator", "logical_and_expression", 
		"synpred113_myparser", "primary_expression", "synpred32_myparser", "synpred53_myparser", 
		"synpred74_myparser", "synpred110_myparser", "synpred99_myparser", "declaration_specifiers", 
		"synpred43_myparser", "identifier_list", "synpred87_myparser", "cast_expression", 
		"synpred26_myparser", "synpred112_myparser", "pointer", "synpred88_myparser", 
		"synpred62_myparser", "synpred106_myparser", "storage_class_specifier", 
		"iteration_statement", "synpred83_myparser", "synpred65_myparser", "synpred69_myparser", 
		"synpred17_myparser", "synpred49_myparser", "direct_abstract_declarator", 
		"relational_expression", "synpred85_myparser", "synpred34_myparser", "synpred25_myparser", 
		"statement_list", "init_declarator", "synpred12_myparser", "synpred36_myparser", 
		"synpred38_myparser", "conditional_expression", "unary_operator", "synpred47_myparser", 
		"specifier_qualifier_list", "constant_expression", "lvalue", "initializer_list", 
		"synpred92_myparser", "synpred114_myparser", "synpred10_myparser", "synpred9_myparser", 
		"synpred16_myparser", "additive_expression", "synpred115_myparser", "synpred35_myparser", 
		"synpred33_myparser", "unary_expression", "synpred37_myparser", "synpred52_myparser", 
		"synpred84_myparser", "synpred90_myparser", "assignment_expression", "synpred44_myparser", 
		"synpred96_myparser", "constant", "synpred1_myparser", "synpred11_myparser", 
		"labeled_statement", "synpred30_myparser", "synpred70_myparser", "initializer", 
		"parameter_type_list", "synpred64_myparser", "synpred67_myparser", "and_expression", 
		"synpred66_myparser", "synpred4_myparser", "synpred50_myparser", "synpred18_myparser", 
		"synpred101_myparser", "parameter_list", "synpred100_myparser", "synpred19_myparser", 
		"synpred28_myparser", "synpred61_myparser", "equality_expression", "assignment_operator", 
		"type_qualifier", "jump_statement", "direct_declarator", "synpred123_myparser", 
		"synpred20_myparser", "synpred23_myparser", "parameter_declaration", "synpred111_myparser", 
		"synpred39_myparser", "synpred89_myparser", "synpred121_myparser", "synpred46_myparser", 
		"init_declarator_list", "synpred107_myparser", "synpred81_myparser", "synpred41_myparser", 
		"synpred91_myparser", "synpred124_myparser", "synpred2_myparser", "synpred45_myparser", 
		"abstract_declarator_suffix", "synpred102_myparser", "synpred15_myparser", 
		"synpred77_myparser", "inclusive_or_expression", "synpred98_myparser", 
		"synpred59_myparser", "synpred56_myparser", "synpred76_myparser", "synpred6_myparser", 
		"synpred116_myparser", "synpred95_myparser", "synpred118_myparser", "expression", 
		"synpred94_myparser", "synpred78_myparser", "synpred82_myparser", "synpred21_myparser", 
		"selection_statement", "argument_expression_list", "shift_expression", 
		"synpred75_myparser", "synpred97_myparser", "program", "synpred79_myparser"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, true, false, true, false, false, true, true, false, 
		    false, true, false, true, false, false, true, false, false, false, 
		    false, false, false, false, false, true, false, false, false, false, 
		    false, true, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public myparserParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[180+1];


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

	public myparserParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
		this.state.ruleMemo = new HashMap[180+1];


	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g"; }


	    boolean TRACEON = false;
		HashMap<String,Integer> SymbolTable = new HashMap<String,Integer>();



	// $ANTLR start "program"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:27:1: program : ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' compound_statement ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:5: ( ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' compound_statement )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:7: ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' compound_statement
			{
			dbg.location(28,7);
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
			}dbg.location(28,20);
			match(input,MAIN,FOLLOW_MAIN_in_program84); if (state.failed) return;dbg.location(28,25);
			match(input,48,FOLLOW_48_in_program86); if (state.failed) return;dbg.location(28,29);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:29: ( INT IDENTIFIER )?
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

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:30: INT IDENTIFIER
					{
					dbg.location(28,30);
					match(input,INT,FOLLOW_INT_in_program89); if (state.failed) return;dbg.location(28,34);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program91); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(28,47);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:47: ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )?
			int alt2=3;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==56) ) {
				alt2=1;
			}
			else if ( (LA2_0==CHAR) ) {
				alt2=2;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:48: ',' ( CHAR '**' IDENTIFIER )
					{
					dbg.location(28,48);
					match(input,56,FOLLOW_56_in_program96); if (state.failed) return;dbg.location(28,52);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:52: ( CHAR '**' IDENTIFIER )
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:53: CHAR '**' IDENTIFIER
					{
					dbg.location(28,53);
					match(input,CHAR,FOLLOW_CHAR_in_program99); if (state.failed) return;dbg.location(28,58);
					match(input,51,FOLLOW_51_in_program101); if (state.failed) return;dbg.location(28,63);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program103); if (state.failed) return;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:77: ( CHAR '*' IDENTIFIER '[' ']' )
					{
					dbg.location(28,77);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:77: ( CHAR '*' IDENTIFIER '[' ']' )
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:28:78: CHAR '*' IDENTIFIER '[' ']'
					{
					dbg.location(28,78);
					match(input,CHAR,FOLLOW_CHAR_in_program109); if (state.failed) return;dbg.location(28,83);
					match(input,50,FOLLOW_50_in_program111); if (state.failed) return;dbg.location(28,87);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program113); if (state.failed) return;dbg.location(28,98);
					match(input,78,FOLLOW_78_in_program115); if (state.failed) return;dbg.location(28,102);
					match(input,79,FOLLOW_79_in_program117); if (state.failed) return;
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(28,109);
			match(input,49,FOLLOW_49_in_program122); if (state.failed) return;dbg.location(28,113);
			pushFollow(FOLLOW_compound_statement_in_program124);
			compound_statement();
			state._fsp--;
			if (state.failed) return;dbg.location(29,5);
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
		dbg.location(30, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:33:1: declaration : declaration_specifiers ( init_declarator_list )? ';' ;
	public final void declaration() throws RecognitionException {
		int declaration_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:34:5: ( declaration_specifiers ( init_declarator_list )? ';' )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:34:7: declaration_specifiers ( init_declarator_list )? ';'
			{
			dbg.location(34,7);
			pushFollow(FOLLOW_declaration_specifiers_in_declaration149);
			declaration_specifiers();
			state._fsp--;
			if (state.failed) return;dbg.location(34,30);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:34:30: ( init_declarator_list )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDENTIFIER||LA3_0==48||LA3_0==50) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:34:30: init_declarator_list
					{
					dbg.location(34,30);
					pushFollow(FOLLOW_init_declarator_list_in_declaration151);
					init_declarator_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(34,52);
			match(input,66,FOLLOW_66_in_declaration154); if (state.failed) return;dbg.location(35,3);
			if ( state.backtracking==0 ) { 
						if(TRACEON)
							System.out.println("declaration: declaration_specifiers init_declarator_list? ';'");
						

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
		dbg.location(41, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declaration"



	// $ANTLR start "init_declarator_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:51:1: init_declarator_list : init_declarator ( ',' init_declarator )* ;
	public final void init_declarator_list() throws RecognitionException {
		int init_declarator_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "init_declarator_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:52:2: ( init_declarator ( ',' init_declarator )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:52:4: init_declarator ( ',' init_declarator )*
			{
			dbg.location(52,4);
			pushFollow(FOLLOW_init_declarator_in_init_declarator_list178);
			init_declarator();
			state._fsp--;
			if (state.failed) return;dbg.location(52,20);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:52:20: ( ',' init_declarator )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==56) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:52:21: ',' init_declarator
					{
					dbg.location(52,21);
					match(input,56,FOLLOW_56_in_init_declarator_list181); if (state.failed) return;dbg.location(52,25);
					pushFollow(FOLLOW_init_declarator_in_init_declarator_list183);
					init_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(52,43);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("init_declarator_list: init_declarator (',' init_declarator)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, init_declarator_list_StartIndex); }

		}
		dbg.location(53, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init_declarator_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "init_declarator_list"



	// $ANTLR start "init_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:56:1: init_declarator : declarator ( '=' initializer )? ;
	public final void init_declarator() throws RecognitionException {
		int init_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "init_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:57:2: ( declarator ( '=' initializer )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:57:4: declarator ( '=' initializer )?
			{
			dbg.location(57,4);
			pushFollow(FOLLOW_declarator_in_init_declarator199);
			declarator();
			state._fsp--;
			if (state.failed) return;dbg.location(57,15);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:57:15: ( '=' initializer )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==71) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:57:16: '=' initializer
					{
					dbg.location(57,16);
					match(input,71,FOLLOW_71_in_init_declarator202); if (state.failed) return;dbg.location(57,20);
					pushFollow(FOLLOW_initializer_in_init_declarator204);
					initializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(57,34);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("init_declarator: declarator ('=' initializer)?"); }
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
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "init_declarator"



	// $ANTLR start "declaration_specifiers"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:61:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier )+ ;
	public final void declaration_specifiers() throws RecognitionException {
		int declaration_specifiers_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "declaration_specifiers");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:62:2: ( ( storage_class_specifier | type_specifier | type_qualifier )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:62:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			{
			dbg.location(62,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:62:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			int cnt6=0;
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=4;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				switch ( input.LA(1) ) {
				case AUTO:
				case EXTERN:
				case REGISTER:
				case STATIC:
					{
					alt6=1;
					}
					break;
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
					alt6=2;
					}
					break;
				case CONST:
				case VOLATILE:
					{
					alt6=3;
					}
					break;
				}
				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:62:5: storage_class_specifier
					{
					dbg.location(62,5);
					pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers221);
					storage_class_specifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:62:31: type_specifier
					{
					dbg.location(62,31);
					pushFollow(FOLLOW_type_specifier_in_declaration_specifiers225);
					type_specifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:62:48: type_qualifier
					{
					dbg.location(62,48);
					pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers229);
					type_qualifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(6, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt6++;
			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(63,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declaration_specifiers: (storage_class_specifier | type_specifier | type_qualifier)+"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, declaration_specifiers_StartIndex); }

		}
		dbg.location(64, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration_specifiers");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declaration_specifiers"



	// $ANTLR start "type_qualifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:66:1: type_qualifier : ( CONST | VOLATILE );
	public final void type_qualifier() throws RecognitionException {
		int type_qualifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_qualifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:67:2: ( CONST | VOLATILE )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==CONST) ) {
				alt7=1;
			}
			else if ( (LA7_0==VOLATILE) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:67:4: CONST
					{
					dbg.location(67,4);
					match(input,CONST,FOLLOW_CONST_in_type_qualifier246); if (state.failed) return;dbg.location(67,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_qualifier: CONST"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:68:4: VOLATILE
					{
					dbg.location(68,4);
					match(input,VOLATILE,FOLLOW_VOLATILE_in_type_qualifier253); if (state.failed) return;dbg.location(68,13);
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
		dbg.location(69, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_qualifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type_qualifier"



	// $ANTLR start "storage_class_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:71:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER );
	public final void storage_class_specifier() throws RecognitionException {
		int storage_class_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "storage_class_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:72:2: ( EXTERN | STATIC | AUTO | REGISTER )
			int alt8=4;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case EXTERN:
				{
				alt8=1;
				}
				break;
			case STATIC:
				{
				alt8=2;
				}
				break;
			case AUTO:
				{
				alt8=3;
				}
				break;
			case REGISTER:
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:72:4: EXTERN
					{
					dbg.location(72,4);
					match(input,EXTERN,FOLLOW_EXTERN_in_storage_class_specifier266); if (state.failed) return;dbg.location(72,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: EXTERN"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:73:4: STATIC
					{
					dbg.location(73,4);
					match(input,STATIC,FOLLOW_STATIC_in_storage_class_specifier273); if (state.failed) return;dbg.location(73,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: STATIC"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:74:4: AUTO
					{
					dbg.location(74,4);
					match(input,AUTO,FOLLOW_AUTO_in_storage_class_specifier280); if (state.failed) return;dbg.location(74,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: AUTO"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:75:4: REGISTER
					{
					dbg.location(75,4);
					match(input,REGISTER,FOLLOW_REGISTER_in_storage_class_specifier287); if (state.failed) return;dbg.location(75,13);
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
		dbg.location(76, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "storage_class_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "storage_class_specifier"



	// $ANTLR start "type_name"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:79:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
	public final void type_name() throws RecognitionException {
		int type_name_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:80:2: ( specifier_qualifier_list ( abstract_declarator )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:80:4: specifier_qualifier_list ( abstract_declarator )?
			{
			dbg.location(80,4);
			pushFollow(FOLLOW_specifier_qualifier_list_in_type_name301);
			specifier_qualifier_list();
			state._fsp--;
			if (state.failed) return;dbg.location(80,29);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:80:29: ( abstract_declarator )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==48||LA9_0==50||LA9_0==78) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:80:29: abstract_declarator
					{
					dbg.location(80,29);
					pushFollow(FOLLOW_abstract_declarator_in_type_name303);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(80,50);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_name: specifier_qualifier_list abstract_declarator?"); }
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
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type_name"



	// $ANTLR start "specifier_qualifier_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:84:1: specifier_qualifier_list : ( type_qualifier | type_specifier )+ ;
	public final void specifier_qualifier_list() throws RecognitionException {
		int specifier_qualifier_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "specifier_qualifier_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:85:2: ( ( type_qualifier | type_specifier )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:85:4: ( type_qualifier | type_specifier )+
			{
			dbg.location(85,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:85:4: ( type_qualifier | type_specifier )+
			int cnt10=0;
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=3;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==CONST||LA10_0==VOLATILE) ) {
					alt10=1;
				}
				else if ( (LA10_0==CHAR||LA10_0==DOUBLE||LA10_0==FLOAT||LA10_0==INT||LA10_0==LONG||(LA10_0 >= SHORT && LA10_0 <= SIGNED)||(LA10_0 >= UNSIGNED && LA10_0 <= VOID)) ) {
					alt10=2;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:85:5: type_qualifier
					{
					dbg.location(85,5);
					pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list319);
					type_qualifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:85:22: type_specifier
					{
					dbg.location(85,22);
					pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list323);
					type_specifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(10, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt10++;
			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(85,39);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("specifier_qualifier_list: (type_qualifier | type_specifier)+"); }
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
		dbg.location(86, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specifier_qualifier_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "specifier_qualifier_list"



	// $ANTLR start "type_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:89:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED );
	public final void type_specifier() throws RecognitionException {
		int type_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:90:2: ( VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED )
			int alt11=9;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case VOID:
				{
				alt11=1;
				}
				break;
			case CHAR:
				{
				alt11=2;
				}
				break;
			case SHORT:
				{
				alt11=3;
				}
				break;
			case INT:
				{
				alt11=4;
				}
				break;
			case LONG:
				{
				alt11=5;
				}
				break;
			case FLOAT:
				{
				alt11=6;
				}
				break;
			case DOUBLE:
				{
				alt11=7;
				}
				break;
			case SIGNED:
				{
				alt11=8;
				}
				break;
			case UNSIGNED:
				{
				alt11=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:90:4: VOID
					{
					dbg.location(90,4);
					match(input,VOID,FOLLOW_VOID_in_type_specifier339); if (state.failed) return;dbg.location(90,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: VOID"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:91:4: CHAR
					{
					dbg.location(91,4);
					match(input,CHAR,FOLLOW_CHAR_in_type_specifier346); if (state.failed) return;dbg.location(91,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: CHAR"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:92:4: SHORT
					{
					dbg.location(92,4);
					match(input,SHORT,FOLLOW_SHORT_in_type_specifier353); if (state.failed) return;dbg.location(92,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: SHORT"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:93:4: INT
					{
					dbg.location(93,4);
					match(input,INT,FOLLOW_INT_in_type_specifier360); if (state.failed) return;dbg.location(93,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: INT"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:94:4: LONG
					{
					dbg.location(94,4);
					match(input,LONG,FOLLOW_LONG_in_type_specifier367); if (state.failed) return;dbg.location(94,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: LONG"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:95:4: FLOAT
					{
					dbg.location(95,4);
					match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier374); if (state.failed) return;dbg.location(95,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: FLOAT"); }
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:96:4: DOUBLE
					{
					dbg.location(96,4);
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier381); if (state.failed) return;dbg.location(96,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: DOUBLE"); }
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:97:4: SIGNED
					{
					dbg.location(97,4);
					match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier388); if (state.failed) return;dbg.location(97,11);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: SIGNED"); }
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:98:4: UNSIGNED
					{
					dbg.location(98,4);
					match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier395); if (state.failed) return;dbg.location(98,13);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: UNSIGNED"); }
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
			if ( state.backtracking>0 ) { memoize(input, 10, type_specifier_StartIndex); }

		}
		dbg.location(99, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type_specifier"



	// $ANTLR start "declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:102:1: declarator : ( ( pointer )? direct_declarator | pointer );
	public final void declarator() throws RecognitionException {
		int declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:2: ( ( pointer )? direct_declarator | pointer )
			int alt13=2;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==50) ) {
				int LA13_1 = input.LA(2);
				if ( (synpred27_myparser()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

			}
			else if ( (LA13_0==IDENTIFIER||LA13_0==48) ) {
				alt13=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:4: ( pointer )? direct_declarator
					{
					dbg.location(103,4);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:4: ( pointer )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==50) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:4: pointer
							{
							dbg.location(103,4);
							pushFollow(FOLLOW_pointer_in_declarator409);
							pointer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(103,13);
					pushFollow(FOLLOW_direct_declarator_in_declarator412);
					direct_declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(103,31);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator: pointer? direct_declarator"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:104:4: pointer
					{
					dbg.location(104,4);
					pushFollow(FOLLOW_pointer_in_declarator419);
					pointer();
					state._fsp--;
					if (state.failed) return;dbg.location(104,12);
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
		dbg.location(105, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declarator"



	// $ANTLR start "direct_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:108:1: direct_declarator : ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* ;
	public final void direct_declarator() throws RecognitionException {
		int direct_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "direct_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:2: ( ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:4: ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )*
			{
			dbg.location(109,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:4: ( IDENTIFIER | '(' declarator ')' )
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==IDENTIFIER) ) {
				alt14=1;
			}
			else if ( (LA14_0==48) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:5: IDENTIFIER
					{
					dbg.location(109,5);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_direct_declarator434); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:18: '(' declarator ')'
					{
					dbg.location(109,18);
					match(input,48,FOLLOW_48_in_direct_declarator438); if (state.failed) return;dbg.location(109,22);
					pushFollow(FOLLOW_declarator_in_direct_declarator440);
					declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(109,33);
					match(input,49,FOLLOW_49_in_direct_declarator442); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(109,38);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:38: ( declarator_suffix )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==48) ) {
					switch ( input.LA(2) ) {
					case 49:
						{
						int LA15_10 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA15_12 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case EXTERN:
						{
						int LA15_15 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case STATIC:
						{
						int LA15_16 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case AUTO:
						{
						int LA15_17 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case REGISTER:
						{
						int LA15_18 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case VOID:
						{
						int LA15_19 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case CHAR:
						{
						int LA15_20 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case SHORT:
						{
						int LA15_21 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case INT:
						{
						int LA15_22 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case LONG:
						{
						int LA15_23 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case FLOAT:
						{
						int LA15_24 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case DOUBLE:
						{
						int LA15_25 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case SIGNED:
						{
						int LA15_26 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case UNSIGNED:
						{
						int LA15_27 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case CONST:
						{
						int LA15_28 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case VOLATILE:
						{
						int LA15_29 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					}
				}
				else if ( (LA15_0==78) ) {
					switch ( input.LA(2) ) {
					case 79:
						{
						int LA15_30 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 48:
						{
						int LA15_31 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA15_32 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case DECIMAL_LITERAL:
						{
						int LA15_33 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case CHARACTER_LITERAL:
						{
						int LA15_34 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case STRING_LITERAL:
						{
						int LA15_35 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case FLOATING_POINT_LITERAL:
						{
						int LA15_36 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 54:
						{
						int LA15_37 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 58:
						{
						int LA15_38 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 46:
						{
						int LA15_39 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 50:
						{
						int LA15_40 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 53:
						{
						int LA15_41 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 57:
						{
						int LA15_42 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 90:
						{
						int LA15_43 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 41:
						{
						int LA15_44 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					case 84:
						{
						int LA15_45 = input.LA(3);
						if ( (synpred29_myparser()) ) {
							alt15=1;
						}

						}
						break;
					}
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:38: declarator_suffix
					{
					dbg.location(109,38);
					pushFollow(FOLLOW_declarator_suffix_in_direct_declarator445);
					declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(109,57);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("direct_declarator: (IDENTIFIER | '(' declarator ')') declarator_suffix*"); }
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
		dbg.location(110, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "direct_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "direct_declarator"



	// $ANTLR start "declarator_suffix"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:113:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );
	public final void declarator_suffix() throws RecognitionException {
		int declarator_suffix_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "declarator_suffix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:114:2: ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' )
			int alt16=5;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==78) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==79) ) {
					alt16=2;
				}
				else if ( (LA16_1==CHARACTER_LITERAL||LA16_1==DECIMAL_LITERAL||LA16_1==FLOATING_POINT_LITERAL||LA16_1==IDENTIFIER||LA16_1==STRING_LITERAL||LA16_1==41||LA16_1==46||LA16_1==48||LA16_1==50||(LA16_1 >= 53 && LA16_1 <= 54)||(LA16_1 >= 57 && LA16_1 <= 58)||LA16_1==84||LA16_1==90) ) {
					alt16=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA16_0==48) ) {
				switch ( input.LA(2) ) {
				case 49:
					{
					alt16=5;
					}
					break;
				case AUTO:
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
					alt16=3;
					}
					break;
				case IDENTIFIER:
					{
					alt16=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 2, input);
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
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:114:4: '[' constant_expression ']'
					{
					dbg.location(114,4);
					match(input,78,FOLLOW_78_in_declarator_suffix460); if (state.failed) return;dbg.location(114,8);
					pushFollow(FOLLOW_constant_expression_in_declarator_suffix462);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(114,28);
					match(input,79,FOLLOW_79_in_declarator_suffix464); if (state.failed) return;dbg.location(114,32);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '[' constant_expression ']'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:115:7: '[' ']'
					{
					dbg.location(115,7);
					match(input,78,FOLLOW_78_in_declarator_suffix474); if (state.failed) return;dbg.location(115,11);
					match(input,79,FOLLOW_79_in_declarator_suffix476); if (state.failed) return;dbg.location(115,15);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '[' ']'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:116:9: '(' parameter_type_list ')'
					{
					dbg.location(116,9);
					match(input,48,FOLLOW_48_in_declarator_suffix488); if (state.failed) return;dbg.location(116,13);
					pushFollow(FOLLOW_parameter_type_list_in_declarator_suffix490);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;dbg.location(116,33);
					match(input,49,FOLLOW_49_in_declarator_suffix492); if (state.failed) return;dbg.location(116,37);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '(' parameter_type_list ')'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:117:9: '(' identifier_list ')'
					{
					dbg.location(117,9);
					match(input,48,FOLLOW_48_in_declarator_suffix504); if (state.failed) return;dbg.location(117,13);
					pushFollow(FOLLOW_identifier_list_in_declarator_suffix506);
					identifier_list();
					state._fsp--;
					if (state.failed) return;dbg.location(117,29);
					match(input,49,FOLLOW_49_in_declarator_suffix508); if (state.failed) return;dbg.location(117,33);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '(' identifier_list ')'"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:118:9: '(' ')'
					{
					dbg.location(118,9);
					match(input,48,FOLLOW_48_in_declarator_suffix520); if (state.failed) return;dbg.location(118,13);
					match(input,49,FOLLOW_49_in_declarator_suffix522); if (state.failed) return;dbg.location(118,17);
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
		dbg.location(119, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declarator_suffix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declarator_suffix"



	// $ANTLR start "pointer"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:121:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );
	public final void pointer() throws RecognitionException {
		int pointer_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "pointer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:2: ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' )
			int alt19=3;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==50) ) {
				switch ( input.LA(2) ) {
				case CONST:
				case VOLATILE:
					{
					alt19=1;
					}
					break;
				case 50:
					{
					int LA19_4 = input.LA(3);
					if ( (synpred37_myparser()) ) {
						alt19=2;
					}
					else if ( (true) ) {
						alt19=3;
					}

					}
					break;
				case EOF:
				case IDENTIFIER:
				case 48:
				case 49:
				case 56:
				case 66:
				case 71:
				case 78:
					{
					alt19=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
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
					new NoViableAltException("", 19, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:4: '*' ( type_qualifier )+ ( pointer )?
					{
					dbg.location(122,4);
					match(input,50,FOLLOW_50_in_pointer535); if (state.failed) return;dbg.location(122,8);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:8: ( type_qualifier )+
					int cnt17=0;
					try { dbg.enterSubRule(17);

					loop17:
					while (true) {
						int alt17=2;
						try { dbg.enterDecision(17, decisionCanBacktrack[17]);

						int LA17_0 = input.LA(1);
						if ( (LA17_0==CONST||LA17_0==VOLATILE) ) {
							alt17=1;
						}

						} finally {dbg.exitDecision(17);}

						switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:8: type_qualifier
							{
							dbg.location(122,8);
							pushFollow(FOLLOW_type_qualifier_in_pointer537);
							type_qualifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(17, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt17++;
					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(122,24);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:24: ( pointer )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( (LA18_0==50) ) {
						int LA18_1 = input.LA(2);
						if ( (synpred35_myparser()) ) {
							alt18=1;
						}
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:24: pointer
							{
							dbg.location(122,24);
							pushFollow(FOLLOW_pointer_in_pointer540);
							pointer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(122,33);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("pointer: '*' type_qualifier+ pointer?"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:123:4: '*' pointer
					{
					dbg.location(123,4);
					match(input,50,FOLLOW_50_in_pointer548); if (state.failed) return;dbg.location(123,8);
					pushFollow(FOLLOW_pointer_in_pointer550);
					pointer();
					state._fsp--;
					if (state.failed) return;dbg.location(123,16);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("pointer: '*' pointer"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:124:4: '*'
					{
					dbg.location(124,4);
					match(input,50,FOLLOW_50_in_pointer557); if (state.failed) return;dbg.location(124,8);
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
		dbg.location(125, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "pointer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "pointer"



	// $ANTLR start "parameter_type_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:127:1: parameter_type_list : parameter_list ( ',' '...' )? ;
	public final void parameter_type_list() throws RecognitionException {
		int parameter_type_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_type_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(127, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:128:2: ( parameter_list ( ',' '...' )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:128:4: parameter_list ( ',' '...' )?
			{
			dbg.location(128,4);
			pushFollow(FOLLOW_parameter_list_in_parameter_type_list570);
			parameter_list();
			state._fsp--;
			if (state.failed) return;dbg.location(128,19);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:128:19: ( ',' '...' )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==56) ) {
				alt20=1;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:128:20: ',' '...'
					{
					dbg.location(128,20);
					match(input,56,FOLLOW_56_in_parameter_type_list573); if (state.failed) return;dbg.location(128,24);
					match(input,62,FOLLOW_62_in_parameter_type_list575); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(128,32);
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
		dbg.location(129, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_type_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_type_list"



	// $ANTLR start "parameter_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:130:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* ;
	public final void parameter_list() throws RecognitionException {
		int parameter_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:131:2: ( parameter_declaration ( ',' parameter_declaration )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:131:4: parameter_declaration ( ',' parameter_declaration )*
			{
			dbg.location(131,4);
			pushFollow(FOLLOW_parameter_declaration_in_parameter_list589);
			parameter_declaration();
			state._fsp--;
			if (state.failed) return;dbg.location(131,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:131:26: ( ',' parameter_declaration )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==56) ) {
					int LA21_1 = input.LA(2);
					if ( (LA21_1==AUTO||LA21_1==CHAR||LA21_1==CONST||LA21_1==DOUBLE||LA21_1==EXTERN||LA21_1==FLOAT||LA21_1==INT||LA21_1==LONG||LA21_1==REGISTER||(LA21_1 >= SHORT && LA21_1 <= STATIC)||(LA21_1 >= UNSIGNED && LA21_1 <= VOLATILE)) ) {
						alt21=1;
					}

				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:131:27: ',' parameter_declaration
					{
					dbg.location(131,27);
					match(input,56,FOLLOW_56_in_parameter_list592); if (state.failed) return;dbg.location(131,31);
					pushFollow(FOLLOW_parameter_declaration_in_parameter_list594);
					parameter_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(131,55);
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
		dbg.location(132, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_list"



	// $ANTLR start "parameter_declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:133:1: parameter_declaration : declaration_specifiers ( declarator | abstract_declarator )* ;
	public final void parameter_declaration() throws RecognitionException {
		int parameter_declaration_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:2: ( declaration_specifiers ( declarator | abstract_declarator )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:4: declaration_specifiers ( declarator | abstract_declarator )*
			{
			dbg.location(134,4);
			pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration608);
			declaration_specifiers();
			state._fsp--;
			if (state.failed) return;dbg.location(134,27);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:27: ( declarator | abstract_declarator )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=3;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				switch ( input.LA(1) ) {
				case 50:
					{
					int LA22_4 = input.LA(2);
					if ( (synpred40_myparser()) ) {
						alt22=1;
					}
					else if ( (synpred41_myparser()) ) {
						alt22=2;
					}

					}
					break;
				case IDENTIFIER:
					{
					alt22=1;
					}
					break;
				case 48:
					{
					switch ( input.LA(2) ) {
					case AUTO:
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
					case 49:
					case 78:
						{
						alt22=2;
						}
						break;
					case 50:
						{
						int LA22_18 = input.LA(3);
						if ( (synpred40_myparser()) ) {
							alt22=1;
						}
						else if ( (synpred41_myparser()) ) {
							alt22=2;
						}

						}
						break;
					case IDENTIFIER:
						{
						alt22=1;
						}
						break;
					case 48:
						{
						int LA22_20 = input.LA(3);
						if ( (synpred40_myparser()) ) {
							alt22=1;
						}
						else if ( (synpred41_myparser()) ) {
							alt22=2;
						}

						}
						break;
					}
					}
					break;
				case 78:
					{
					alt22=2;
					}
					break;
				}
				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:28: declarator
					{
					dbg.location(134,28);
					pushFollow(FOLLOW_declarator_in_parameter_declaration611);
					declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:39: abstract_declarator
					{
					dbg.location(134,39);
					pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration613);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(134,61);
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
		dbg.location(135, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_declaration"



	// $ANTLR start "identifier_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:137:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* ;
	public final void identifier_list() throws RecognitionException {
		int identifier_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "identifier_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:138:2: ( IDENTIFIER ( ',' IDENTIFIER )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:138:4: IDENTIFIER ( ',' IDENTIFIER )*
			{
			dbg.location(138,4);
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list628); if (state.failed) return;dbg.location(138,15);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:138:15: ( ',' IDENTIFIER )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==56) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:138:16: ',' IDENTIFIER
					{
					dbg.location(138,16);
					match(input,56,FOLLOW_56_in_identifier_list631); if (state.failed) return;dbg.location(138,20);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list633); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(138,33);
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
		dbg.location(139, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifier_list"



	// $ANTLR start "abstract_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:142:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );
	public final void abstract_declarator() throws RecognitionException {
		int abstract_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "abstract_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(142, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:143:2: ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator )
			int alt25=2;
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==50) ) {
				alt25=1;
			}
			else if ( (LA25_0==48||LA25_0==78) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:143:4: pointer ( direct_abstract_declarator )?
					{
					dbg.location(143,4);
					pushFollow(FOLLOW_pointer_in_abstract_declarator649);
					pointer();
					state._fsp--;
					if (state.failed) return;dbg.location(143,12);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:143:12: ( direct_abstract_declarator )?
					int alt24=2;
					try { dbg.enterSubRule(24);
					try { dbg.enterDecision(24, decisionCanBacktrack[24]);

					int LA24_0 = input.LA(1);
					if ( (LA24_0==48) ) {
						switch ( input.LA(2) ) {
							case 49:
								{
								int LA24_8 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 50:
								{
								int LA24_9 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 48:
								{
								int LA24_10 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 78:
								{
								int LA24_11 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case EXTERN:
								{
								int LA24_12 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case STATIC:
								{
								int LA24_13 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case AUTO:
								{
								int LA24_14 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case REGISTER:
								{
								int LA24_15 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case VOID:
								{
								int LA24_16 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case CHAR:
								{
								int LA24_17 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case SHORT:
								{
								int LA24_18 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case INT:
								{
								int LA24_19 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case LONG:
								{
								int LA24_20 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case FLOAT:
								{
								int LA24_21 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case DOUBLE:
								{
								int LA24_22 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case SIGNED:
								{
								int LA24_23 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case UNSIGNED:
								{
								int LA24_24 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case CONST:
								{
								int LA24_25 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case VOLATILE:
								{
								int LA24_26 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
						}
					}
					else if ( (LA24_0==78) ) {
						switch ( input.LA(2) ) {
							case 79:
								{
								int LA24_28 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 48:
								{
								int LA24_29 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case IDENTIFIER:
								{
								int LA24_30 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case DECIMAL_LITERAL:
								{
								int LA24_31 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case CHARACTER_LITERAL:
								{
								int LA24_32 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case STRING_LITERAL:
								{
								int LA24_33 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case FLOATING_POINT_LITERAL:
								{
								int LA24_34 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 54:
								{
								int LA24_35 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 58:
								{
								int LA24_36 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 46:
								{
								int LA24_37 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 50:
								{
								int LA24_38 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 53:
								{
								int LA24_39 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 57:
								{
								int LA24_40 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 90:
								{
								int LA24_41 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 41:
								{
								int LA24_42 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
							case 84:
								{
								int LA24_43 = input.LA(3);
								if ( (synpred43_myparser()) ) {
									alt24=1;
								}
								}
								break;
						}
					}
					} finally {dbg.exitDecision(24);}

					switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:143:12: direct_abstract_declarator
							{
							dbg.location(143,12);
							pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator651);
							direct_abstract_declarator();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(24);}
					dbg.location(143,40);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator: pointer direct_abstract_declarator?"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:144:4: direct_abstract_declarator
					{
					dbg.location(144,4);
					pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator659);
					direct_abstract_declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(144,31);
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
		dbg.location(145, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "abstract_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "abstract_declarator"



	// $ANTLR start "direct_abstract_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:147:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* ;
	public final void direct_abstract_declarator() throws RecognitionException {
		int direct_abstract_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "direct_abstract_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:2: ( ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )*
			{
			dbg.location(148,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==48) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==AUTO||LA26_1==CHAR||LA26_1==CONST||LA26_1==DOUBLE||LA26_1==EXTERN||LA26_1==FLOAT||LA26_1==INT||LA26_1==LONG||LA26_1==REGISTER||(LA26_1 >= SHORT && LA26_1 <= STATIC)||(LA26_1 >= UNSIGNED && LA26_1 <= VOLATILE)||LA26_1==49) ) {
					alt26=2;
				}
				else if ( (LA26_1==48||LA26_1==50||LA26_1==78) ) {
					alt26=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA26_0==78) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:6: '(' abstract_declarator ')'
					{
					dbg.location(148,6);
					match(input,48,FOLLOW_48_in_direct_abstract_declarator674); if (state.failed) return;dbg.location(148,10);
					pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator676);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(148,30);
					match(input,49,FOLLOW_49_in_direct_abstract_declarator678); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:36: abstract_declarator_suffix
					{
					dbg.location(148,36);
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator682);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(148,65);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:65: ( abstract_declarator_suffix )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==48) ) {
					switch ( input.LA(2) ) {
					case 49:
						{
						int LA27_8 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case EXTERN:
						{
						int LA27_13 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case STATIC:
						{
						int LA27_14 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case AUTO:
						{
						int LA27_15 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case REGISTER:
						{
						int LA27_16 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case VOID:
						{
						int LA27_17 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case CHAR:
						{
						int LA27_18 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case SHORT:
						{
						int LA27_19 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case INT:
						{
						int LA27_20 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case LONG:
						{
						int LA27_21 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case FLOAT:
						{
						int LA27_22 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case DOUBLE:
						{
						int LA27_23 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case SIGNED:
						{
						int LA27_24 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case UNSIGNED:
						{
						int LA27_25 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case CONST:
						{
						int LA27_26 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case VOLATILE:
						{
						int LA27_27 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					}
				}
				else if ( (LA27_0==78) ) {
					switch ( input.LA(2) ) {
					case 79:
						{
						int LA27_28 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 48:
						{
						int LA27_29 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA27_30 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case DECIMAL_LITERAL:
						{
						int LA27_31 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case CHARACTER_LITERAL:
						{
						int LA27_32 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case STRING_LITERAL:
						{
						int LA27_33 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case FLOATING_POINT_LITERAL:
						{
						int LA27_34 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 54:
						{
						int LA27_35 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 58:
						{
						int LA27_36 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 46:
						{
						int LA27_37 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 50:
						{
						int LA27_38 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 53:
						{
						int LA27_39 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 57:
						{
						int LA27_40 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 90:
						{
						int LA27_41 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 41:
						{
						int LA27_42 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					case 84:
						{
						int LA27_43 = input.LA(3);
						if ( (synpred46_myparser()) ) {
							alt27=1;
						}

						}
						break;
					}
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:65: abstract_declarator_suffix
					{
					dbg.location(148,65);
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator686);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(149,2);
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
		dbg.location(150, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "direct_abstract_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "direct_abstract_declarator"



	// $ANTLR start "abstract_declarator_suffix"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:152:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );
	public final void abstract_declarator_suffix() throws RecognitionException {
		int abstract_declarator_suffix_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "abstract_declarator_suffix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:153:2: ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' )
			int alt28=4;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==78) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==79) ) {
					alt28=1;
				}
				else if ( (LA28_1==CHARACTER_LITERAL||LA28_1==DECIMAL_LITERAL||LA28_1==FLOATING_POINT_LITERAL||LA28_1==IDENTIFIER||LA28_1==STRING_LITERAL||LA28_1==41||LA28_1==46||LA28_1==48||LA28_1==50||(LA28_1 >= 53 && LA28_1 <= 54)||(LA28_1 >= 57 && LA28_1 <= 58)||LA28_1==84||LA28_1==90) ) {
					alt28=2;
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
			else if ( (LA28_0==48) ) {
				int LA28_2 = input.LA(2);
				if ( (LA28_2==49) ) {
					alt28=3;
				}
				else if ( (LA28_2==AUTO||LA28_2==CHAR||LA28_2==CONST||LA28_2==DOUBLE||LA28_2==EXTERN||LA28_2==FLOAT||LA28_2==INT||LA28_2==LONG||LA28_2==REGISTER||(LA28_2 >= SHORT && LA28_2 <= STATIC)||(LA28_2 >= UNSIGNED && LA28_2 <= VOLATILE)) ) {
					alt28=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 2, input);
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
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:153:4: '[' ']'
					{
					dbg.location(153,4);
					match(input,78,FOLLOW_78_in_abstract_declarator_suffix701); if (state.failed) return;dbg.location(153,8);
					match(input,79,FOLLOW_79_in_abstract_declarator_suffix703); if (state.failed) return;dbg.location(153,12);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' ']'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:154:4: '[' constant_expression ']'
					{
					dbg.location(154,4);
					match(input,78,FOLLOW_78_in_abstract_declarator_suffix710); if (state.failed) return;dbg.location(154,8);
					pushFollow(FOLLOW_constant_expression_in_abstract_declarator_suffix712);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(154,28);
					match(input,79,FOLLOW_79_in_abstract_declarator_suffix714); if (state.failed) return;dbg.location(154,32);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' constant_expression ']'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:155:4: '(' ')'
					{
					dbg.location(155,4);
					match(input,48,FOLLOW_48_in_abstract_declarator_suffix721); if (state.failed) return;dbg.location(155,8);
					match(input,49,FOLLOW_49_in_abstract_declarator_suffix723); if (state.failed) return;dbg.location(155,12);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '(' ')'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:156:4: '(' parameter_type_list ')'
					{
					dbg.location(156,4);
					match(input,48,FOLLOW_48_in_abstract_declarator_suffix730); if (state.failed) return;dbg.location(156,8);
					pushFollow(FOLLOW_parameter_type_list_in_abstract_declarator_suffix732);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;dbg.location(156,28);
					match(input,49,FOLLOW_49_in_abstract_declarator_suffix734); if (state.failed) return;dbg.location(156,32);
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
		dbg.location(157, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "abstract_declarator_suffix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "abstract_declarator_suffix"



	// $ANTLR start "initializer"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:160:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' );
	public final void initializer() throws RecognitionException {
		int initializer_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "initializer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(160, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:161:2: ( assignment_expression | '{' initializer_list ( ',' )? '}' )
			int alt30=2;
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==CHARACTER_LITERAL||LA30_0==DECIMAL_LITERAL||LA30_0==FLOATING_POINT_LITERAL||LA30_0==IDENTIFIER||LA30_0==STRING_LITERAL||LA30_0==41||LA30_0==46||LA30_0==48||LA30_0==50||(LA30_0 >= 53 && LA30_0 <= 54)||(LA30_0 >= 57 && LA30_0 <= 58)||LA30_0==84||LA30_0==90) ) {
				alt30=1;
			}
			else if ( (LA30_0==85) ) {
				alt30=2;
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

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:161:4: assignment_expression
					{
					dbg.location(161,4);
					pushFollow(FOLLOW_assignment_expression_in_initializer748);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(161,26);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("initializer: assignment_expression"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:162:4: '{' initializer_list ( ',' )? '}'
					{
					dbg.location(162,4);
					match(input,85,FOLLOW_85_in_initializer755); if (state.failed) return;dbg.location(162,8);
					pushFollow(FOLLOW_initializer_list_in_initializer757);
					initializer_list();
					state._fsp--;
					if (state.failed) return;dbg.location(162,25);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:162:25: ( ',' )?
					int alt29=2;
					try { dbg.enterSubRule(29);
					try { dbg.enterDecision(29, decisionCanBacktrack[29]);

					int LA29_0 = input.LA(1);
					if ( (LA29_0==56) ) {
						alt29=1;
					}
					} finally {dbg.exitDecision(29);}

					switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:162:25: ','
							{
							dbg.location(162,25);
							match(input,56,FOLLOW_56_in_initializer759); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(29);}
					dbg.location(162,30);
					match(input,89,FOLLOW_89_in_initializer762); if (state.failed) return;dbg.location(162,34);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("initializer: '{' initializer_list ','? '}'"); }
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
			if ( state.backtracking>0 ) { memoize(input, 22, initializer_StartIndex); }

		}
		dbg.location(163, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "initializer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "initializer"



	// $ANTLR start "initializer_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:166:1: initializer_list : initializer ( ',' initializer )* ;
	public final void initializer_list() throws RecognitionException {
		int initializer_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "initializer_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:167:2: ( initializer ( ',' initializer )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:167:4: initializer ( ',' initializer )*
			{
			dbg.location(167,4);
			pushFollow(FOLLOW_initializer_in_initializer_list776);
			initializer();
			state._fsp--;
			if (state.failed) return;dbg.location(167,16);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:167:16: ( ',' initializer )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==56) ) {
					int LA31_1 = input.LA(2);
					if ( (LA31_1==CHARACTER_LITERAL||LA31_1==DECIMAL_LITERAL||LA31_1==FLOATING_POINT_LITERAL||LA31_1==IDENTIFIER||LA31_1==STRING_LITERAL||LA31_1==41||LA31_1==46||LA31_1==48||LA31_1==50||(LA31_1 >= 53 && LA31_1 <= 54)||(LA31_1 >= 57 && LA31_1 <= 58)||(LA31_1 >= 84 && LA31_1 <= 85)||LA31_1==90) ) {
						alt31=1;
					}

				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:167:17: ',' initializer
					{
					dbg.location(167,17);
					match(input,56,FOLLOW_56_in_initializer_list779); if (state.failed) return;dbg.location(167,21);
					pushFollow(FOLLOW_initializer_in_initializer_list781);
					initializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(167,35);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("initializer_list: initializer (',' initializer)*"); }
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
		dbg.location(168, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "initializer_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "initializer_list"



	// $ANTLR start "argument_expression_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:171:1: argument_expression_list : assignment_expression ( ',' assignment_expression )* ;
	public final void argument_expression_list() throws RecognitionException {
		int argument_expression_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "argument_expression_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(171, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:172:2: ( assignment_expression ( ',' assignment_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:172:4: assignment_expression ( ',' assignment_expression )*
			{
			dbg.location(172,4);
			pushFollow(FOLLOW_assignment_expression_in_argument_expression_list797);
			assignment_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(172,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:172:26: ( ',' assignment_expression )*
			try { dbg.enterSubRule(32);

			loop32:
			while (true) {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( (LA32_0==56) ) {
					alt32=1;
				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:172:27: ',' assignment_expression
					{
					dbg.location(172,27);
					match(input,56,FOLLOW_56_in_argument_expression_list800); if (state.failed) return;dbg.location(172,31);
					pushFollow(FOLLOW_assignment_expression_in_argument_expression_list802);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(172,55);
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
		dbg.location(173, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "argument_expression_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "argument_expression_list"



	// $ANTLR start "additive_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:176:1: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
	public final void additive_expression() throws RecognitionException {
		int additive_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "additive_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(176, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:177:2: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:177:4: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
			{
			dbg.location(177,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:177:4: ( multiplicative_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:177:5: multiplicative_expression
			{
			dbg.location(177,5);
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression819);
			multiplicative_expression();
			state._fsp--;
			if (state.failed) return;
			}
			dbg.location(177,32);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:177:32: ( '+' multiplicative_expression | '-' multiplicative_expression )*
			try { dbg.enterSubRule(33);

			loop33:
			while (true) {
				int alt33=3;
				try { dbg.enterDecision(33, decisionCanBacktrack[33]);

				int LA33_0 = input.LA(1);
				if ( (LA33_0==53) ) {
					alt33=1;
				}
				else if ( (LA33_0==57) ) {
					alt33=2;
				}

				} finally {dbg.exitDecision(33);}

				switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:177:33: '+' multiplicative_expression
					{
					dbg.location(177,33);
					match(input,53,FOLLOW_53_in_additive_expression823); if (state.failed) return;dbg.location(177,37);
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression825);
					multiplicative_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:177:65: '-' multiplicative_expression
					{
					dbg.location(177,65);
					match(input,57,FOLLOW_57_in_additive_expression829); if (state.failed) return;dbg.location(177,69);
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression831);
					multiplicative_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop33;
				}
			}
			} finally {dbg.exitSubRule(33);}
			dbg.location(178,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("additive_expression: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, additive_expression_StartIndex); }

		}
		dbg.location(179, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "additive_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "additive_expression"



	// $ANTLR start "multiplicative_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:181:1: multiplicative_expression : ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* ;
	public final void multiplicative_expression() throws RecognitionException {
		int multiplicative_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "multiplicative_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(181, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:2: ( ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:4: ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
			{
			dbg.location(182,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:4: ( cast_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:5: cast_expression
			{
			dbg.location(182,5);
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression849);
			cast_expression();
			state._fsp--;
			if (state.failed) return;
			}
			dbg.location(182,22);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:22: ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
			try { dbg.enterSubRule(34);

			loop34:
			while (true) {
				int alt34=4;
				try { dbg.enterDecision(34, decisionCanBacktrack[34]);

				switch ( input.LA(1) ) {
				case 50:
					{
					alt34=1;
					}
					break;
				case 63:
					{
					alt34=2;
					}
					break;
				case 43:
					{
					alt34=3;
					}
					break;
				}
				} finally {dbg.exitDecision(34);}

				switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:23: '*' cast_expression
					{
					dbg.location(182,23);
					match(input,50,FOLLOW_50_in_multiplicative_expression853); if (state.failed) return;dbg.location(182,27);
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression855);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:45: '/' cast_expression
					{
					dbg.location(182,45);
					match(input,63,FOLLOW_63_in_multiplicative_expression859); if (state.failed) return;dbg.location(182,49);
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression861);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:182:67: '%' cast_expression
					{
					dbg.location(182,67);
					match(input,43,FOLLOW_43_in_multiplicative_expression865); if (state.failed) return;dbg.location(182,71);
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression867);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}
			} finally {dbg.exitSubRule(34);}
			dbg.location(183,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("multiplicative_expression: (cast_expression) ('*' cast_expression | '/' cast_expression | '%' cast_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, multiplicative_expression_StartIndex); }

		}
		dbg.location(184, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multiplicative_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multiplicative_expression"



	// $ANTLR start "cast_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:187:1: cast_expression : ( '(' type_name ')' cast_expression | unary_expression );
	public final void cast_expression() throws RecognitionException {
		int cast_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "cast_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(187, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:188:2: ( '(' type_name ')' cast_expression | unary_expression )
			int alt35=2;
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==48) ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1==CHAR||LA35_1==CONST||LA35_1==DOUBLE||LA35_1==FLOAT||LA35_1==INT||LA35_1==LONG||(LA35_1 >= SHORT && LA35_1 <= SIGNED)||(LA35_1 >= UNSIGNED && LA35_1 <= VOLATILE)) ) {
					alt35=1;
				}
				else if ( (LA35_1==CHARACTER_LITERAL||LA35_1==DECIMAL_LITERAL||LA35_1==FLOATING_POINT_LITERAL||LA35_1==IDENTIFIER||LA35_1==STRING_LITERAL||LA35_1==41||LA35_1==46||LA35_1==48||LA35_1==50||(LA35_1 >= 53 && LA35_1 <= 54)||(LA35_1 >= 57 && LA35_1 <= 58)||LA35_1==84||LA35_1==90) ) {
					alt35=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA35_0==CHARACTER_LITERAL||LA35_0==DECIMAL_LITERAL||LA35_0==FLOATING_POINT_LITERAL||LA35_0==IDENTIFIER||LA35_0==STRING_LITERAL||LA35_0==41||LA35_0==46||LA35_0==50||(LA35_0 >= 53 && LA35_0 <= 54)||(LA35_0 >= 57 && LA35_0 <= 58)||LA35_0==84||LA35_0==90) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:188:4: '(' type_name ')' cast_expression
					{
					dbg.location(188,4);
					match(input,48,FOLLOW_48_in_cast_expression884); if (state.failed) return;dbg.location(188,8);
					pushFollow(FOLLOW_type_name_in_cast_expression886);
					type_name();
					state._fsp--;
					if (state.failed) return;dbg.location(188,18);
					match(input,49,FOLLOW_49_in_cast_expression888); if (state.failed) return;dbg.location(188,22);
					pushFollow(FOLLOW_cast_expression_in_cast_expression890);
					cast_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(188,38);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("cast_expression: '(' type_name ')' cast_expression"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:189:4: unary_expression
					{
					dbg.location(189,4);
					pushFollow(FOLLOW_unary_expression_in_cast_expression897);
					unary_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(189,21);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("cast_expression: unary_expression"); }
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
			if ( state.backtracking>0 ) { memoize(input, 27, cast_expression_StartIndex); }

		}
		dbg.location(190, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "cast_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "cast_expression"



	// $ANTLR start "unary_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:193:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );
	public final void unary_expression() throws RecognitionException {
		int unary_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "unary_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(193, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:194:2: ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' )
			int alt36=6;
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			switch ( input.LA(1) ) {
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case IDENTIFIER:
			case STRING_LITERAL:
			case 48:
				{
				alt36=1;
				}
				break;
			case 54:
				{
				alt36=2;
				}
				break;
			case 58:
				{
				alt36=3;
				}
				break;
			case 41:
			case 46:
			case 50:
			case 53:
			case 57:
			case 90:
				{
				alt36=4;
				}
				break;
			case 84:
				{
				int LA36_15 = input.LA(2);
				if ( (LA36_15==48) ) {
					int LA36_16 = input.LA(3);
					if ( (synpred64_myparser()) ) {
						alt36=5;
					}
					else if ( (true) ) {
						alt36=6;
					}

				}
				else if ( (LA36_15==CHARACTER_LITERAL||LA36_15==DECIMAL_LITERAL||LA36_15==FLOATING_POINT_LITERAL||LA36_15==IDENTIFIER||LA36_15==STRING_LITERAL||LA36_15==41||LA36_15==46||LA36_15==50||(LA36_15 >= 53 && LA36_15 <= 54)||(LA36_15 >= 57 && LA36_15 <= 58)||LA36_15==84||LA36_15==90) ) {
					alt36=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 15, input);
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
					new NoViableAltException("", 36, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(36);}

			switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:194:4: postfix_expression
					{
					dbg.location(194,4);
					pushFollow(FOLLOW_postfix_expression_in_unary_expression911);
					postfix_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(194,23);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: postfix_expression"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:195:4: '++' unary_expression
					{
					dbg.location(195,4);
					match(input,54,FOLLOW_54_in_unary_expression918); if (state.failed) return;dbg.location(195,9);
					pushFollow(FOLLOW_unary_expression_in_unary_expression920);
					unary_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(195,26);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: '++' unary_expression"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:196:4: '--' unary_expression
					{
					dbg.location(196,4);
					match(input,58,FOLLOW_58_in_unary_expression927); if (state.failed) return;dbg.location(196,9);
					pushFollow(FOLLOW_unary_expression_in_unary_expression929);
					unary_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(196,26);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: '--' unary_expression"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:197:4: unary_operator cast_expression
					{
					dbg.location(197,4);
					pushFollow(FOLLOW_unary_operator_in_unary_expression936);
					unary_operator();
					state._fsp--;
					if (state.failed) return;dbg.location(197,19);
					pushFollow(FOLLOW_cast_expression_in_unary_expression938);
					cast_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(197,35);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: unary_operator cast_expression"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:198:4: 'sizeof' unary_expression
					{
					dbg.location(198,4);
					match(input,84,FOLLOW_84_in_unary_expression945); if (state.failed) return;dbg.location(198,13);
					pushFollow(FOLLOW_unary_expression_in_unary_expression947);
					unary_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(198,30);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: 'sizeof' unary_expression"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:199:4: 'sizeof' '(' type_name ')'
					{
					dbg.location(199,4);
					match(input,84,FOLLOW_84_in_unary_expression954); if (state.failed) return;dbg.location(199,13);
					match(input,48,FOLLOW_48_in_unary_expression956); if (state.failed) return;dbg.location(199,17);
					pushFollow(FOLLOW_type_name_in_unary_expression958);
					type_name();
					state._fsp--;
					if (state.failed) return;dbg.location(199,27);
					match(input,49,FOLLOW_49_in_unary_expression960); if (state.failed) return;dbg.location(199,31);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: 'sizeof' '(' type_name ')'"); }
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
		dbg.location(200, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unary_expression"



	// $ANTLR start "postfix_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:203:1: postfix_expression : primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* ;
	public final void postfix_expression() throws RecognitionException {
		int postfix_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "postfix_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(203, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:204:2: ( primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:205:5: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			{
			dbg.location(205,5);
			pushFollow(FOLLOW_primary_expression_in_postfix_expression981);
			primary_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(206,5);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:206:5: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			try { dbg.enterSubRule(37);

			loop37:
			while (true) {
				int alt37=8;
				try { dbg.enterDecision(37, decisionCanBacktrack[37]);

				switch ( input.LA(1) ) {
				case 78:
					{
					alt37=1;
					}
					break;
				case 48:
					{
					int LA37_34 = input.LA(2);
					if ( (LA37_34==49) ) {
						alt37=2;
					}
					else if ( (LA37_34==CHARACTER_LITERAL||LA37_34==DECIMAL_LITERAL||LA37_34==FLOATING_POINT_LITERAL||LA37_34==IDENTIFIER||LA37_34==STRING_LITERAL||LA37_34==41||LA37_34==46||LA37_34==48||LA37_34==50||(LA37_34 >= 53 && LA37_34 <= 54)||(LA37_34 >= 57 && LA37_34 <= 58)||LA37_34==84||LA37_34==90) ) {
						alt37=3;
					}

					}
					break;
				case 61:
					{
					alt37=4;
					}
					break;
				case 60:
					{
					alt37=5;
					}
					break;
				case 54:
					{
					alt37=6;
					}
					break;
				case 58:
					{
					alt37=7;
					}
					break;
				}
				} finally {dbg.exitDecision(37);}

				switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:206:7: '[' expression ']'
					{
					dbg.location(206,7);
					match(input,78,FOLLOW_78_in_postfix_expression989); if (state.failed) return;dbg.location(206,11);
					pushFollow(FOLLOW_expression_in_postfix_expression991);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(206,22);
					match(input,79,FOLLOW_79_in_postfix_expression993); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:207:7: '(' ')'
					{
					dbg.location(207,7);
					match(input,48,FOLLOW_48_in_postfix_expression1001); if (state.failed) return;dbg.location(207,11);
					match(input,49,FOLLOW_49_in_postfix_expression1003); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:208:7: '(' argument_expression_list ')'
					{
					dbg.location(208,7);
					match(input,48,FOLLOW_48_in_postfix_expression1011); if (state.failed) return;dbg.location(208,11);
					pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1013);
					argument_expression_list();
					state._fsp--;
					if (state.failed) return;dbg.location(208,36);
					match(input,49,FOLLOW_49_in_postfix_expression1015); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:209:9: '.' IDENTIFIER
					{
					dbg.location(209,9);
					match(input,61,FOLLOW_61_in_postfix_expression1025); if (state.failed) return;dbg.location(209,13);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1027); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:210:9: '->' IDENTIFIER
					{
					dbg.location(210,9);
					match(input,60,FOLLOW_60_in_postfix_expression1037); if (state.failed) return;dbg.location(210,14);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1039); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:211:7: '++'
					{
					dbg.location(211,7);
					match(input,54,FOLLOW_54_in_postfix_expression1047); if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:212:7: '--'
					{
					dbg.location(212,7);
					match(input,58,FOLLOW_58_in_postfix_expression1055); if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}
			} finally {dbg.exitSubRule(37);}
			dbg.location(214,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("postfix_expression: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '++' | '--' )*"); }
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
		dbg.location(215, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "postfix_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "postfix_expression"



	// $ANTLR start "unary_operator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:217:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final void unary_operator() throws RecognitionException {
		int unary_operator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "unary_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(217, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:218:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
			int alt38=6;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			switch ( input.LA(1) ) {
			case 46:
				{
				alt38=1;
				}
				break;
			case 50:
				{
				alt38=2;
				}
				break;
			case 53:
				{
				alt38=3;
				}
				break;
			case 57:
				{
				alt38=4;
				}
				break;
			case 90:
				{
				alt38=5;
				}
				break;
			case 41:
				{
				alt38=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:218:4: '&'
					{
					dbg.location(218,4);
					match(input,46,FOLLOW_46_in_unary_operator1076); if (state.failed) return;dbg.location(218,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '&'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:219:4: '*'
					{
					dbg.location(219,4);
					match(input,50,FOLLOW_50_in_unary_operator1083); if (state.failed) return;dbg.location(219,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '*'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:220:4: '+'
					{
					dbg.location(220,4);
					match(input,53,FOLLOW_53_in_unary_operator1090); if (state.failed) return;dbg.location(220,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '+'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:221:4: '-'
					{
					dbg.location(221,4);
					match(input,57,FOLLOW_57_in_unary_operator1097); if (state.failed) return;dbg.location(221,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '-'"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:222:4: '~'
					{
					dbg.location(222,4);
					match(input,90,FOLLOW_90_in_unary_operator1104); if (state.failed) return;dbg.location(222,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '~'"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:223:4: '!'
					{
					dbg.location(223,4);
					match(input,41,FOLLOW_41_in_unary_operator1111); if (state.failed) return;dbg.location(223,8);
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
		dbg.location(224, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unary_operator"



	// $ANTLR start "primary_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:227:1: primary_expression : ( IDENTIFIER | constant | '(' expression ')' );
	public final void primary_expression() throws RecognitionException {
		int primary_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "primary_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(227, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:228:2: ( IDENTIFIER | constant | '(' expression ')' )
			int alt39=3;
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt39=1;
				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case STRING_LITERAL:
				{
				alt39=2;
				}
				break;
			case 48:
				{
				alt39=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(39);}

			switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:228:4: IDENTIFIER
					{
					dbg.location(228,4);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1125); if (state.failed) return;dbg.location(228,15);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("primary_expression: IDENTIFIER"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:229:4: constant
					{
					dbg.location(229,4);
					pushFollow(FOLLOW_constant_in_primary_expression1132);
					constant();
					state._fsp--;
					if (state.failed) return;dbg.location(229,13);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("primary_expression: constant"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:230:4: '(' expression ')'
					{
					dbg.location(230,4);
					match(input,48,FOLLOW_48_in_primary_expression1139); if (state.failed) return;dbg.location(230,8);
					pushFollow(FOLLOW_expression_in_primary_expression1141);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(230,19);
					match(input,49,FOLLOW_49_in_primary_expression1143); if (state.failed) return;dbg.location(230,23);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("primary_expression: '(' expression ')'"); }
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
		dbg.location(231, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "primary_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "primary_expression"



	// $ANTLR start "constant"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:233:1: constant : ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
	public final void constant() throws RecognitionException {
		int constant_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "constant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(233, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:234:5: ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
			int alt40=4;
			try { dbg.enterDecision(40, decisionCanBacktrack[40]);

			switch ( input.LA(1) ) {
			case DECIMAL_LITERAL:
				{
				alt40=1;
				}
				break;
			case CHARACTER_LITERAL:
				{
				alt40=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt40=3;
				}
				break;
			case FLOATING_POINT_LITERAL:
				{
				alt40=4;
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

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:234:9: DECIMAL_LITERAL
					{
					dbg.location(234,9);
					match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_constant1161); if (state.failed) return;dbg.location(234,25);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: DECIMAL_LITERAL"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:235:7: CHARACTER_LITERAL
					{
					dbg.location(235,7);
					match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_constant1171); if (state.failed) return;dbg.location(235,25);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: CHARACTER_LITERAL"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:236:4: STRING_LITERAL
					{
					dbg.location(236,4);
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant1178); if (state.failed) return;dbg.location(236,19);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: STRING_LITERAL"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:237:9: FLOATING_POINT_LITERAL
					{
					dbg.location(237,9);
					match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_constant1190); if (state.failed) return;dbg.location(237,32);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: FLOATING_POINT_LITERAL"); }
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
		dbg.location(238, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "constant"



	// $ANTLR start "expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:241:1: expression : assignment_expression ( ',' assignment_expression )* ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(241, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:242:2: ( assignment_expression ( ',' assignment_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:242:4: assignment_expression ( ',' assignment_expression )*
			{
			dbg.location(242,4);
			pushFollow(FOLLOW_assignment_expression_in_expression1207);
			assignment_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(242,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:242:26: ( ',' assignment_expression )*
			try { dbg.enterSubRule(41);

			loop41:
			while (true) {
				int alt41=2;
				try { dbg.enterDecision(41, decisionCanBacktrack[41]);

				int LA41_0 = input.LA(1);
				if ( (LA41_0==56) ) {
					alt41=1;
				}

				} finally {dbg.exitDecision(41);}

				switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:242:27: ',' assignment_expression
					{
					dbg.location(242,27);
					match(input,56,FOLLOW_56_in_expression1210); if (state.failed) return;dbg.location(242,31);
					pushFollow(FOLLOW_assignment_expression_in_expression1212);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop41;
				}
			}
			} finally {dbg.exitSubRule(41);}
			dbg.location(242,55);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("expression: assignment_expression (',' assignment_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, expression_StartIndex); }

		}
		dbg.location(243, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "constant_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:246:1: constant_expression : conditional_expression ;
	public final void constant_expression() throws RecognitionException {
		int constant_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "constant_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(246, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:247:2: ( conditional_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:247:4: conditional_expression
			{
			dbg.location(247,4);
			pushFollow(FOLLOW_conditional_expression_in_constant_expression1228);
			conditional_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(247,27);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant_expression: conditional_expression"); }
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
		dbg.location(248, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "constant_expression"



	// $ANTLR start "assignment_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:251:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );
	public final void assignment_expression() throws RecognitionException {
		int assignment_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "assignment_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(251, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:252:2: ( lvalue assignment_operator assignment_expression | conditional_expression )
			int alt42=2;
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			try {
				isCyclicDecision = true;
				alt42 = dfa42.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(42);}

			switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:252:4: lvalue assignment_operator assignment_expression
					{
					dbg.location(252,4);
					pushFollow(FOLLOW_lvalue_in_assignment_expression1242);
					lvalue();
					state._fsp--;
					if (state.failed) return;dbg.location(252,11);
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1244);
					assignment_operator();
					state._fsp--;
					if (state.failed) return;dbg.location(252,31);
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1246);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(252,53);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_expression: lvalue assignment_operator assignment_expression"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:253:4: conditional_expression
					{
					dbg.location(253,4);
					pushFollow(FOLLOW_conditional_expression_in_assignment_expression1253);
					conditional_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(253,27);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_expression: conditional_expression"); }
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
			if ( state.backtracking>0 ) { memoize(input, 35, assignment_expression_StartIndex); }

		}
		dbg.location(254, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignment_expression"



	// $ANTLR start "lvalue"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:256:1: lvalue : unary_expression ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(256, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:257:2: ( unary_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:257:4: unary_expression
			{
			dbg.location(257,4);
			pushFollow(FOLLOW_unary_expression_in_lvalue1266);
			unary_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(257,21);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("lvalue: unary_expression"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, lvalue_StartIndex); }

		}
		dbg.location(258, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lvalue"



	// $ANTLR start "assignment_operator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:260:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final void assignment_operator() throws RecognitionException {
		int assignment_operator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "assignment_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(260, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:261:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			int alt43=11;
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			switch ( input.LA(1) ) {
			case 71:
				{
				alt43=1;
				}
				break;
			case 52:
				{
				alt43=2;
				}
				break;
			case 64:
				{
				alt43=3;
				}
				break;
			case 44:
				{
				alt43=4;
				}
				break;
			case 55:
				{
				alt43=5;
				}
				break;
			case 59:
				{
				alt43=6;
				}
				break;
			case 69:
				{
				alt43=7;
				}
				break;
			case 76:
				{
				alt43=8;
				}
				break;
			case 47:
				{
				alt43=9;
				}
				break;
			case 81:
				{
				alt43=10;
				}
				break;
			case 87:
				{
				alt43=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:261:4: '='
					{
					dbg.location(261,4);
					match(input,71,FOLLOW_71_in_assignment_operator1279); if (state.failed) return;dbg.location(261,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '='"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:262:4: '*='
					{
					dbg.location(262,4);
					match(input,52,FOLLOW_52_in_assignment_operator1286); if (state.failed) return;dbg.location(262,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '*='"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:263:4: '/='
					{
					dbg.location(263,4);
					match(input,64,FOLLOW_64_in_assignment_operator1293); if (state.failed) return;dbg.location(263,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '/='"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:264:4: '%='
					{
					dbg.location(264,4);
					match(input,44,FOLLOW_44_in_assignment_operator1300); if (state.failed) return;dbg.location(264,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '%='"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:265:4: '+='
					{
					dbg.location(265,4);
					match(input,55,FOLLOW_55_in_assignment_operator1307); if (state.failed) return;dbg.location(265,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '+='"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:266:4: '-='
					{
					dbg.location(266,4);
					match(input,59,FOLLOW_59_in_assignment_operator1314); if (state.failed) return;dbg.location(266,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '-='"); }
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:267:4: '<<='
					{
					dbg.location(267,4);
					match(input,69,FOLLOW_69_in_assignment_operator1321); if (state.failed) return;dbg.location(267,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '<<='"); }
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:268:4: '>>='
					{
					dbg.location(268,4);
					match(input,76,FOLLOW_76_in_assignment_operator1328); if (state.failed) return;dbg.location(268,10);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '>>='"); }
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:269:4: '&='
					{
					dbg.location(269,4);
					match(input,47,FOLLOW_47_in_assignment_operator1335); if (state.failed) return;dbg.location(269,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '&='"); }
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:270:4: '^='
					{
					dbg.location(270,4);
					match(input,81,FOLLOW_81_in_assignment_operator1342); if (state.failed) return;dbg.location(270,9);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '^='"); }
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:271:4: '|='
					{
					dbg.location(271,4);
					match(input,87,FOLLOW_87_in_assignment_operator1349); if (state.failed) return;dbg.location(271,9);
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
		dbg.location(272, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignment_operator"



	// $ANTLR start "conditional_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:274:1: conditional_expression : logical_or_expression ( '?' expression ':' conditional_expression )? ;
	public final void conditional_expression() throws RecognitionException {
		int conditional_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(274, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:275:2: ( logical_or_expression ( '?' expression ':' conditional_expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:275:4: logical_or_expression ( '?' expression ':' conditional_expression )?
			{
			dbg.location(275,4);
			pushFollow(FOLLOW_logical_or_expression_in_conditional_expression1366);
			logical_or_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(275,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:275:26: ( '?' expression ':' conditional_expression )?
			int alt44=2;
			try { dbg.enterSubRule(44);
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

			int LA44_0 = input.LA(1);
			if ( (LA44_0==77) ) {
				alt44=1;
			}
			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:275:27: '?' expression ':' conditional_expression
					{
					dbg.location(275,27);
					match(input,77,FOLLOW_77_in_conditional_expression1369); if (state.failed) return;dbg.location(275,31);
					pushFollow(FOLLOW_expression_in_conditional_expression1371);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(275,42);
					match(input,65,FOLLOW_65_in_conditional_expression1373); if (state.failed) return;dbg.location(275,46);
					pushFollow(FOLLOW_conditional_expression_in_conditional_expression1375);
					conditional_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(44);}
			dbg.location(276,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("conditional_expression: logical_or_expression ('?' expression ':' conditional_expression)?"); }
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
		dbg.location(277, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditional_expression"



	// $ANTLR start "logical_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:279:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
	public final void logical_or_expression() throws RecognitionException {
		int logical_or_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "logical_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(279, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:280:2: ( logical_and_expression ( '||' logical_and_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:280:4: logical_and_expression ( '||' logical_and_expression )*
			{
			dbg.location(280,4);
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1391);
			logical_and_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(280,27);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:280:27: ( '||' logical_and_expression )*
			try { dbg.enterSubRule(45);

			loop45:
			while (true) {
				int alt45=2;
				try { dbg.enterDecision(45, decisionCanBacktrack[45]);

				int LA45_0 = input.LA(1);
				if ( (LA45_0==88) ) {
					alt45=1;
				}

				} finally {dbg.exitDecision(45);}

				switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:280:28: '||' logical_and_expression
					{
					dbg.location(280,28);
					match(input,88,FOLLOW_88_in_logical_or_expression1394); if (state.failed) return;dbg.location(280,33);
					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1396);
					logical_and_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop45;
				}
			}
			} finally {dbg.exitSubRule(45);}
			dbg.location(281,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("logical_or_expression: logical_and_expression ('||' logical_and_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, logical_or_expression_StartIndex); }

		}
		dbg.location(282, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "logical_or_expression"



	// $ANTLR start "logical_and_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:283:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
	public final void logical_and_expression() throws RecognitionException {
		int logical_and_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "logical_and_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(283, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:284:2: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:284:4: inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			dbg.location(284,4);
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1411);
			inclusive_or_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(284,28);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:284:28: ( '&&' inclusive_or_expression )*
			try { dbg.enterSubRule(46);

			loop46:
			while (true) {
				int alt46=2;
				try { dbg.enterDecision(46, decisionCanBacktrack[46]);

				int LA46_0 = input.LA(1);
				if ( (LA46_0==45) ) {
					alt46=1;
				}

				} finally {dbg.exitDecision(46);}

				switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:284:29: '&&' inclusive_or_expression
					{
					dbg.location(284,29);
					match(input,45,FOLLOW_45_in_logical_and_expression1414); if (state.failed) return;dbg.location(284,34);
					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1416);
					inclusive_or_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop46;
				}
			}
			} finally {dbg.exitSubRule(46);}
			dbg.location(285,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("logical_and_expression: inclusive_or_expression ('&&' inclusive_or_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, logical_and_expression_StartIndex); }

		}
		dbg.location(286, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_and_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "logical_and_expression"



	// $ANTLR start "inclusive_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:287:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
	public final void inclusive_or_expression() throws RecognitionException {
		int inclusive_or_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "inclusive_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(287, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:288:2: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:288:4: exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			dbg.location(288,4);
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1431);
			exclusive_or_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(288,28);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:288:28: ( '|' exclusive_or_expression )*
			try { dbg.enterSubRule(47);

			loop47:
			while (true) {
				int alt47=2;
				try { dbg.enterDecision(47, decisionCanBacktrack[47]);

				int LA47_0 = input.LA(1);
				if ( (LA47_0==86) ) {
					alt47=1;
				}

				} finally {dbg.exitDecision(47);}

				switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:288:29: '|' exclusive_or_expression
					{
					dbg.location(288,29);
					match(input,86,FOLLOW_86_in_inclusive_or_expression1434); if (state.failed) return;dbg.location(288,33);
					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1436);
					exclusive_or_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop47;
				}
			}
			} finally {dbg.exitSubRule(47);}
			dbg.location(289,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("inclusive_or_expression: exclusive_or_expression ('|' exclusive_or_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, inclusive_or_expression_StartIndex); }

		}
		dbg.location(290, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inclusive_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inclusive_or_expression"



	// $ANTLR start "exclusive_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:291:1: exclusive_or_expression : and_expression ( '^' and_expression )* ;
	public final void exclusive_or_expression() throws RecognitionException {
		int exclusive_or_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "exclusive_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(291, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:292:2: ( and_expression ( '^' and_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:292:4: and_expression ( '^' and_expression )*
			{
			dbg.location(292,4);
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1451);
			and_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(292,19);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:292:19: ( '^' and_expression )*
			try { dbg.enterSubRule(48);

			loop48:
			while (true) {
				int alt48=2;
				try { dbg.enterDecision(48, decisionCanBacktrack[48]);

				int LA48_0 = input.LA(1);
				if ( (LA48_0==80) ) {
					alt48=1;
				}

				} finally {dbg.exitDecision(48);}

				switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:292:20: '^' and_expression
					{
					dbg.location(292,20);
					match(input,80,FOLLOW_80_in_exclusive_or_expression1454); if (state.failed) return;dbg.location(292,24);
					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1456);
					and_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop48;
				}
			}
			} finally {dbg.exitSubRule(48);}
			dbg.location(293,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("exclusive_or_expression: and_expression ('^' and_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, exclusive_or_expression_StartIndex); }

		}
		dbg.location(294, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exclusive_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exclusive_or_expression"



	// $ANTLR start "and_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:295:1: and_expression : equality_expression ( '&' equality_expression )* ;
	public final void and_expression() throws RecognitionException {
		int and_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "and_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(295, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:296:2: ( equality_expression ( '&' equality_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:296:4: equality_expression ( '&' equality_expression )*
			{
			dbg.location(296,4);
			pushFollow(FOLLOW_equality_expression_in_and_expression1471);
			equality_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(296,24);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:296:24: ( '&' equality_expression )*
			try { dbg.enterSubRule(49);

			loop49:
			while (true) {
				int alt49=2;
				try { dbg.enterDecision(49, decisionCanBacktrack[49]);

				int LA49_0 = input.LA(1);
				if ( (LA49_0==46) ) {
					alt49=1;
				}

				} finally {dbg.exitDecision(49);}

				switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:296:25: '&' equality_expression
					{
					dbg.location(296,25);
					match(input,46,FOLLOW_46_in_and_expression1474); if (state.failed) return;dbg.location(296,29);
					pushFollow(FOLLOW_equality_expression_in_and_expression1476);
					equality_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}
			} finally {dbg.exitSubRule(49);}
			dbg.location(297,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("and_expression: equality_expression ('&' equality_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, and_expression_StartIndex); }

		}
		dbg.location(298, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "and_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "and_expression"



	// $ANTLR start "equality_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:299:1: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
	public final void equality_expression() throws RecognitionException {
		int equality_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "equality_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(299, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:300:2: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:300:4: relational_expression ( ( '==' | '!=' ) relational_expression )*
			{
			dbg.location(300,4);
			pushFollow(FOLLOW_relational_expression_in_equality_expression1491);
			relational_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(300,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:300:26: ( ( '==' | '!=' ) relational_expression )*
			try { dbg.enterSubRule(50);

			loop50:
			while (true) {
				int alt50=2;
				try { dbg.enterDecision(50, decisionCanBacktrack[50]);

				int LA50_0 = input.LA(1);
				if ( (LA50_0==42||LA50_0==72) ) {
					alt50=1;
				}

				} finally {dbg.exitDecision(50);}

				switch (alt50) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:300:27: ( '==' | '!=' ) relational_expression
					{
					dbg.location(300,27);
					if ( input.LA(1)==42||input.LA(1)==72 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(300,39);
					pushFollow(FOLLOW_relational_expression_in_equality_expression1500);
					relational_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop50;
				}
			}
			} finally {dbg.exitSubRule(50);}
			dbg.location(301,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("equality_expression: relational_expression (('=='|'!=') relational_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, equality_expression_StartIndex); }

		}
		dbg.location(302, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "equality_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "equality_expression"



	// $ANTLR start "relational_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:303:1: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
	public final void relational_expression() throws RecognitionException {
		int relational_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "relational_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(303, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:304:2: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:304:4: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			{
			dbg.location(304,4);
			pushFollow(FOLLOW_shift_expression_in_relational_expression1515);
			shift_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(304,21);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:304:21: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			try { dbg.enterSubRule(51);

			loop51:
			while (true) {
				int alt51=2;
				try { dbg.enterDecision(51, decisionCanBacktrack[51]);

				int LA51_0 = input.LA(1);
				if ( (LA51_0==67||LA51_0==70||(LA51_0 >= 73 && LA51_0 <= 74)) ) {
					alt51=1;
				}

				} finally {dbg.exitDecision(51);}

				switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:304:22: ( '<' | '>' | '<=' | '>=' ) shift_expression
					{
					dbg.location(304,22);
					if ( input.LA(1)==67||input.LA(1)==70||(input.LA(1) >= 73 && input.LA(1) <= 74) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(304,42);
					pushFollow(FOLLOW_shift_expression_in_relational_expression1528);
					shift_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop51;
				}
			}
			} finally {dbg.exitSubRule(51);}
			dbg.location(305,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("relational_expression: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, relational_expression_StartIndex); }

		}
		dbg.location(306, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relational_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "relational_expression"



	// $ANTLR start "shift_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:307:1: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
	public final void shift_expression() throws RecognitionException {
		int shift_expression_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "shift_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(307, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:308:2: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:308:4: additive_expression ( ( '<<' | '>>' ) additive_expression )*
			{
			dbg.location(308,4);
			pushFollow(FOLLOW_additive_expression_in_shift_expression1543);
			additive_expression();
			state._fsp--;
			if (state.failed) return;dbg.location(308,24);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:308:24: ( ( '<<' | '>>' ) additive_expression )*
			try { dbg.enterSubRule(52);

			loop52:
			while (true) {
				int alt52=2;
				try { dbg.enterDecision(52, decisionCanBacktrack[52]);

				int LA52_0 = input.LA(1);
				if ( (LA52_0==68||LA52_0==75) ) {
					alt52=1;
				}

				} finally {dbg.exitDecision(52);}

				switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:308:25: ( '<<' | '>>' ) additive_expression
					{
					dbg.location(308,25);
					if ( input.LA(1)==68||input.LA(1)==75 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(308,37);
					pushFollow(FOLLOW_additive_expression_in_shift_expression1552);
					additive_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop52;
				}
			}
			} finally {dbg.exitSubRule(52);}
			dbg.location(309,2);
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("shift_expression: additive_expression (('<<'|'>>') additive_expression)*"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, shift_expression_StartIndex); }

		}
		dbg.location(310, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "shift_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "shift_expression"



	// $ANTLR start "statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:313:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(313, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:314:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement )
			int alt53=6;
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			try {
				isCyclicDecision = true;
				alt53 = dfa53.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:314:7: labeled_statement
					{
					dbg.location(314,7);
					pushFollow(FOLLOW_labeled_statement_in_statement1572);
					labeled_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(314,25);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: labeled_statement;"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:315:7: compound_statement
					{
					dbg.location(315,7);
					pushFollow(FOLLOW_compound_statement_in_statement1582);
					compound_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(315,26);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: compound_statement"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:316:7: expression_statement
					{
					dbg.location(316,7);
					pushFollow(FOLLOW_expression_statement_in_statement1592);
					expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(316,28);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: compound_statement"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:317:7: selection_statement
					{
					dbg.location(317,7);
					pushFollow(FOLLOW_selection_statement_in_statement1602);
					selection_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(317,27);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: selection_statement"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:318:7: iteration_statement
					{
					dbg.location(318,7);
					pushFollow(FOLLOW_iteration_statement_in_statement1612);
					iteration_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(318,27);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: iteration_statement"); }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:319:4: jump_statement
					{
					dbg.location(319,4);
					pushFollow(FOLLOW_jump_statement_in_statement1619);
					jump_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(319,19);
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
		dbg.location(320, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "labeled_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:323:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );
	public final void labeled_statement() throws RecognitionException {
		int labeled_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "labeled_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(323, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:324:2: ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement )
			int alt54=3;
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt54=1;
				}
				break;
			case 82:
				{
				alt54=2;
				}
				break;
			case 83:
				{
				alt54=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(54);}

			switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:324:4: IDENTIFIER ':' statement
					{
					dbg.location(324,4);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_labeled_statement1636); if (state.failed) return;dbg.location(324,15);
					match(input,65,FOLLOW_65_in_labeled_statement1638); if (state.failed) return;dbg.location(324,19);
					pushFollow(FOLLOW_statement_in_labeled_statement1640);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(324,29);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("labeled_statement: IDENTIFIER ':' statement"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:325:4: 'case' constant_expression ':' statement
					{
					dbg.location(325,4);
					match(input,82,FOLLOW_82_in_labeled_statement1647); if (state.failed) return;dbg.location(325,11);
					pushFollow(FOLLOW_constant_expression_in_labeled_statement1649);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(325,31);
					match(input,65,FOLLOW_65_in_labeled_statement1651); if (state.failed) return;dbg.location(325,35);
					pushFollow(FOLLOW_statement_in_labeled_statement1653);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(325,45);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("labeled_statement: 'case' constant_expression ':' statement"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:326:4: 'default' ':' statement
					{
					dbg.location(326,4);
					match(input,83,FOLLOW_83_in_labeled_statement1660); if (state.failed) return;dbg.location(326,14);
					match(input,65,FOLLOW_65_in_labeled_statement1662); if (state.failed) return;dbg.location(326,18);
					pushFollow(FOLLOW_statement_in_labeled_statement1664);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(326,28);
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
		dbg.location(327, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "labeled_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "labeled_statement"



	// $ANTLR start "compound_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:330:1: compound_statement : '{' ( declaration )* ( statement_list )? '}' ;
	public final void compound_statement() throws RecognitionException {
		int compound_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "compound_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(330, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:331:5: ( '{' ( declaration )* ( statement_list )? '}' )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:331:7: '{' ( declaration )* ( statement_list )? '}'
			{
			dbg.location(331,7);
			match(input,85,FOLLOW_85_in_compound_statement1681); if (state.failed) return;dbg.location(331,11);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:331:11: ( declaration )*
			try { dbg.enterSubRule(55);

			loop55:
			while (true) {
				int alt55=2;
				try { dbg.enterDecision(55, decisionCanBacktrack[55]);

				int LA55_0 = input.LA(1);
				if ( (LA55_0==AUTO||LA55_0==CHAR||LA55_0==CONST||LA55_0==DOUBLE||LA55_0==EXTERN||LA55_0==FLOAT||LA55_0==INT||LA55_0==LONG||LA55_0==REGISTER||(LA55_0 >= SHORT && LA55_0 <= STATIC)||(LA55_0 >= UNSIGNED && LA55_0 <= VOLATILE)) ) {
					alt55=1;
				}

				} finally {dbg.exitDecision(55);}

				switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:331:11: declaration
					{
					dbg.location(331,11);
					pushFollow(FOLLOW_declaration_in_compound_statement1683);
					declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop55;
				}
			}
			} finally {dbg.exitSubRule(55);}
			dbg.location(331,24);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:331:24: ( statement_list )?
			int alt56=2;
			try { dbg.enterSubRule(56);
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

			int LA56_0 = input.LA(1);
			if ( (LA56_0==BREAK||LA56_0==CHARACTER_LITERAL||(LA56_0 >= CONTINUE && LA56_0 <= DO)||(LA56_0 >= FLOATING_POINT_LITERAL && LA56_0 <= IF)||LA56_0==RETURN||(LA56_0 >= STRING_LITERAL && LA56_0 <= SWITCH)||LA56_0==WHILE||LA56_0==41||LA56_0==46||LA56_0==48||LA56_0==50||(LA56_0 >= 53 && LA56_0 <= 54)||(LA56_0 >= 57 && LA56_0 <= 58)||LA56_0==66||(LA56_0 >= 82 && LA56_0 <= 85)||LA56_0==90) ) {
				alt56=1;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:331:24: statement_list
					{
					dbg.location(331,24);
					pushFollow(FOLLOW_statement_list_in_compound_statement1686);
					statement_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(56);}
			dbg.location(331,40);
			match(input,89,FOLLOW_89_in_compound_statement1689); if (state.failed) return;dbg.location(331,44);
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
		dbg.location(332, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compound_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compound_statement"



	// $ANTLR start "statement_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:335:1: statement_list : ( statement )+ ;
	public final void statement_list() throws RecognitionException {
		int statement_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(335, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:336:2: ( ( statement )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:336:4: ( statement )+
			{
			dbg.location(336,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:336:4: ( statement )+
			int cnt57=0;
			try { dbg.enterSubRule(57);

			loop57:
			while (true) {
				int alt57=2;
				try { dbg.enterDecision(57, decisionCanBacktrack[57]);

				int LA57_0 = input.LA(1);
				if ( (LA57_0==BREAK||LA57_0==CHARACTER_LITERAL||(LA57_0 >= CONTINUE && LA57_0 <= DO)||(LA57_0 >= FLOATING_POINT_LITERAL && LA57_0 <= IF)||LA57_0==RETURN||(LA57_0 >= STRING_LITERAL && LA57_0 <= SWITCH)||LA57_0==WHILE||LA57_0==41||LA57_0==46||LA57_0==48||LA57_0==50||(LA57_0 >= 53 && LA57_0 <= 54)||(LA57_0 >= 57 && LA57_0 <= 58)||LA57_0==66||(LA57_0 >= 82 && LA57_0 <= 85)||LA57_0==90) ) {
					alt57=1;
				}

				} finally {dbg.exitDecision(57);}

				switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:336:4: statement
					{
					dbg.location(336,4);
					pushFollow(FOLLOW_statement_in_statement_list1706);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(57, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt57++;
			}
			} finally {dbg.exitSubRule(57);}
			dbg.location(336,15);
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
		dbg.location(337, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement_list"



	// $ANTLR start "expression_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:339:1: expression_statement : ( ';' | expression ';' );
	public final void expression_statement() throws RecognitionException {
		int expression_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "expression_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(339, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:340:2: ( ';' | expression ';' )
			int alt58=2;
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			int LA58_0 = input.LA(1);
			if ( (LA58_0==66) ) {
				alt58=1;
			}
			else if ( (LA58_0==CHARACTER_LITERAL||LA58_0==DECIMAL_LITERAL||LA58_0==FLOATING_POINT_LITERAL||LA58_0==IDENTIFIER||LA58_0==STRING_LITERAL||LA58_0==41||LA58_0==46||LA58_0==48||LA58_0==50||(LA58_0 >= 53 && LA58_0 <= 54)||(LA58_0 >= 57 && LA58_0 <= 58)||LA58_0==84||LA58_0==90) ) {
				alt58=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(58);}

			switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:340:4: ';'
					{
					dbg.location(340,4);
					match(input,66,FOLLOW_66_in_expression_statement1720); if (state.failed) return;dbg.location(340,8);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("expression_statement: ';'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:341:4: expression ';'
					{
					dbg.location(341,4);
					pushFollow(FOLLOW_expression_in_expression_statement1727);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(341,15);
					match(input,66,FOLLOW_66_in_expression_statement1729); if (state.failed) return;dbg.location(341,19);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("expression_statement: expression ';'"); }
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
			if ( state.backtracking>0 ) { memoize(input, 51, expression_statement_StartIndex); }

		}
		dbg.location(342, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression_statement"



	// $ANTLR start "selection_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:345:1: selection_statement : ( IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? | SWITCH '(' expression ')' statement );
	public final void selection_statement() throws RecognitionException {
		int selection_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "selection_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(345, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:346:2: ( IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? | SWITCH '(' expression ')' statement )
			int alt60=2;
			try { dbg.enterDecision(60, decisionCanBacktrack[60]);

			int LA60_0 = input.LA(1);
			if ( (LA60_0==IF) ) {
				alt60=1;
			}
			else if ( (LA60_0==SWITCH) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(60);}

			switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:346:4: IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )?
					{
					dbg.location(346,4);
					match(input,IF,FOLLOW_IF_in_selection_statement1743); if (state.failed) return;dbg.location(346,7);
					match(input,48,FOLLOW_48_in_selection_statement1745); if (state.failed) return;dbg.location(346,11);
					pushFollow(FOLLOW_expression_in_selection_statement1747);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(346,22);
					match(input,49,FOLLOW_49_in_selection_statement1749); if (state.failed) return;dbg.location(346,26);
					pushFollow(FOLLOW_statement_in_selection_statement1751);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(346,36);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:346:36: ( options {k=1; backtrack=false; } : ELSE statement )?
					int alt59=2;
					try { dbg.enterSubRule(59);
					try { dbg.enterDecision(59, decisionCanBacktrack[59]);

					int LA59_0 = input.LA(1);
					if ( (LA59_0==ELSE) ) {
						int LA59_1 = input.LA(2);
						if ( (true) ) {
							alt59=1;
						}
					}
					} finally {dbg.exitDecision(59);}

					switch (alt59) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:346:69: ELSE statement
							{
							dbg.location(346,69);
							match(input,ELSE,FOLLOW_ELSE_in_selection_statement1766); if (state.failed) return;dbg.location(346,74);
							pushFollow(FOLLOW_statement_in_selection_statement1768);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(59);}
					dbg.location(347,2);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("selection_statement: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:348:4: SWITCH '(' expression ')' statement
					{
					dbg.location(348,4);
					match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement1778); if (state.failed) return;dbg.location(348,11);
					match(input,48,FOLLOW_48_in_selection_statement1780); if (state.failed) return;dbg.location(348,15);
					pushFollow(FOLLOW_expression_in_selection_statement1782);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(348,26);
					match(input,49,FOLLOW_49_in_selection_statement1784); if (state.failed) return;dbg.location(348,30);
					pushFollow(FOLLOW_statement_in_selection_statement1786);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(349,2);
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
		dbg.location(350, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selection_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selection_statement"



	// $ANTLR start "iteration_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:353:1: iteration_statement : ( WHILE '(' expression ')' statement | DO statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expression_statement ( expression )? ')' statement );
	public final void iteration_statement() throws RecognitionException {
		int iteration_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "iteration_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(353, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:354:5: ( WHILE '(' expression ')' statement | DO statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expression_statement ( expression )? ')' statement )
			int alt62=3;
			try { dbg.enterDecision(62, decisionCanBacktrack[62]);

			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt62=1;
				}
				break;
			case DO:
				{
				alt62=2;
				}
				break;
			case FOR:
				{
				alt62=3;
				}
				break;
			default:
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

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:354:7: WHILE '(' expression ')' statement
					{
					dbg.location(354,7);
					match(input,WHILE,FOLLOW_WHILE_in_iteration_statement1804); if (state.failed) return;dbg.location(354,13);
					match(input,48,FOLLOW_48_in_iteration_statement1806); if (state.failed) return;dbg.location(354,17);
					pushFollow(FOLLOW_expression_in_iteration_statement1808);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(354,28);
					match(input,49,FOLLOW_49_in_iteration_statement1810); if (state.failed) return;dbg.location(354,32);
					pushFollow(FOLLOW_statement_in_iteration_statement1812);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(354,42);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("iteration_statement: WHILE '(' expression ')' statement"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:355:4: DO statement WHILE '(' expression ')' ';'
					{
					dbg.location(355,4);
					match(input,DO,FOLLOW_DO_in_iteration_statement1819); if (state.failed) return;dbg.location(355,7);
					pushFollow(FOLLOW_statement_in_iteration_statement1821);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(355,17);
					match(input,WHILE,FOLLOW_WHILE_in_iteration_statement1823); if (state.failed) return;dbg.location(355,23);
					match(input,48,FOLLOW_48_in_iteration_statement1825); if (state.failed) return;dbg.location(355,27);
					pushFollow(FOLLOW_expression_in_iteration_statement1827);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(355,38);
					match(input,49,FOLLOW_49_in_iteration_statement1829); if (state.failed) return;dbg.location(355,42);
					match(input,66,FOLLOW_66_in_iteration_statement1831); if (state.failed) return;dbg.location(355,46);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("iteration_statement: DO statement WHILE '(' expression ')' ';'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:356:4: FOR '(' expression_statement expression_statement ( expression )? ')' statement
					{
					dbg.location(356,4);
					match(input,FOR,FOLLOW_FOR_in_iteration_statement1838); if (state.failed) return;dbg.location(356,8);
					match(input,48,FOLLOW_48_in_iteration_statement1840); if (state.failed) return;dbg.location(356,12);
					pushFollow(FOLLOW_expression_statement_in_iteration_statement1842);
					expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(356,33);
					pushFollow(FOLLOW_expression_statement_in_iteration_statement1844);
					expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(356,54);
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:356:54: ( expression )?
					int alt61=2;
					try { dbg.enterSubRule(61);
					try { dbg.enterDecision(61, decisionCanBacktrack[61]);

					int LA61_0 = input.LA(1);
					if ( (LA61_0==CHARACTER_LITERAL||LA61_0==DECIMAL_LITERAL||LA61_0==FLOATING_POINT_LITERAL||LA61_0==IDENTIFIER||LA61_0==STRING_LITERAL||LA61_0==41||LA61_0==46||LA61_0==48||LA61_0==50||(LA61_0 >= 53 && LA61_0 <= 54)||(LA61_0 >= 57 && LA61_0 <= 58)||LA61_0==84||LA61_0==90) ) {
						alt61=1;
					}
					} finally {dbg.exitDecision(61);}

					switch (alt61) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:356:54: expression
							{
							dbg.location(356,54);
							pushFollow(FOLLOW_expression_in_iteration_statement1846);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(61);}
					dbg.location(356,66);
					match(input,49,FOLLOW_49_in_iteration_statement1849); if (state.failed) return;dbg.location(356,70);
					pushFollow(FOLLOW_statement_in_iteration_statement1851);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(357,2);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("iteration_statement: FOR '(' expression_statement expression_statement expression? ')' statement"); }
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
		dbg.location(358, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteration_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteration_statement"



	// $ANTLR start "jump_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:361:1: jump_statement : ( GOTO IDENTIFIER ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' );
	public final void jump_statement() throws RecognitionException {
		int jump_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "jump_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(361, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:362:2: ( GOTO IDENTIFIER ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' )
			int alt63=5;
			try { dbg.enterDecision(63, decisionCanBacktrack[63]);

			switch ( input.LA(1) ) {
			case GOTO:
				{
				alt63=1;
				}
				break;
			case CONTINUE:
				{
				alt63=2;
				}
				break;
			case BREAK:
				{
				alt63=3;
				}
				break;
			case RETURN:
				{
				int LA63_4 = input.LA(2);
				if ( (LA63_4==66) ) {
					alt63=4;
				}
				else if ( (LA63_4==CHARACTER_LITERAL||LA63_4==DECIMAL_LITERAL||LA63_4==FLOATING_POINT_LITERAL||LA63_4==IDENTIFIER||LA63_4==STRING_LITERAL||LA63_4==41||LA63_4==46||LA63_4==48||LA63_4==50||(LA63_4 >= 53 && LA63_4 <= 54)||(LA63_4 >= 57 && LA63_4 <= 58)||LA63_4==84||LA63_4==90) ) {
					alt63=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 4, input);
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
					new NoViableAltException("", 63, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(63);}

			switch (alt63) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:362:4: GOTO IDENTIFIER ';'
					{
					dbg.location(362,4);
					match(input,GOTO,FOLLOW_GOTO_in_jump_statement1867); if (state.failed) return;dbg.location(362,9);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_jump_statement1869); if (state.failed) return;dbg.location(362,20);
					match(input,66,FOLLOW_66_in_jump_statement1871); if (state.failed) return;dbg.location(362,24);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: GOTO IDENTIFIER ';'"); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:363:4: CONTINUE ';'
					{
					dbg.location(363,4);
					match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1878); if (state.failed) return;dbg.location(363,13);
					match(input,66,FOLLOW_66_in_jump_statement1880); if (state.failed) return;dbg.location(363,17);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: CONTINUE ';'"); }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:364:4: BREAK ';'
					{
					dbg.location(364,4);
					match(input,BREAK,FOLLOW_BREAK_in_jump_statement1887); if (state.failed) return;dbg.location(364,10);
					match(input,66,FOLLOW_66_in_jump_statement1889); if (state.failed) return;dbg.location(364,14);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: BREAK ';'"); }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:365:4: RETURN ';'
					{
					dbg.location(365,4);
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement1896); if (state.failed) return;dbg.location(365,11);
					match(input,66,FOLLOW_66_in_jump_statement1898); if (state.failed) return;dbg.location(365,15);
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: RETURN ';'"); }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:366:4: RETURN expression ';'
					{
					dbg.location(366,4);
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement1905); if (state.failed) return;dbg.location(366,11);
					pushFollow(FOLLOW_expression_in_jump_statement1907);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(366,22);
					match(input,66,FOLLOW_66_in_jump_statement1909); if (state.failed) return;dbg.location(366,26);
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
		dbg.location(367, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "jump_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "jump_statement"

	// $ANTLR start synpred27_myparser
	public final void synpred27_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:4: ( ( pointer )? direct_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:4: ( pointer )? direct_declarator
		{
		dbg.location(103,4);
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:4: ( pointer )?
		int alt64=2;
		try { dbg.enterSubRule(64);
		try { dbg.enterDecision(64, decisionCanBacktrack[64]);

		int LA64_0 = input.LA(1);
		if ( (LA64_0==50) ) {
			alt64=1;
		}
		} finally {dbg.exitDecision(64);}

		switch (alt64) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:103:4: pointer
				{
				dbg.location(103,4);
				pushFollow(FOLLOW_pointer_in_synpred27_myparser409);
				pointer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(64);}
		dbg.location(103,13);
		pushFollow(FOLLOW_direct_declarator_in_synpred27_myparser412);
		direct_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_myparser

	// $ANTLR start synpred29_myparser
	public final void synpred29_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:38: ( declarator_suffix )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:109:38: declarator_suffix
		{
		dbg.location(109,38);
		pushFollow(FOLLOW_declarator_suffix_in_synpred29_myparser445);
		declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_myparser

	// $ANTLR start synpred35_myparser
	public final void synpred35_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:24: ( pointer )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:122:24: pointer
		{
		dbg.location(122,24);
		pushFollow(FOLLOW_pointer_in_synpred35_myparser540);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred35_myparser

	// $ANTLR start synpred37_myparser
	public final void synpred37_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:123:4: ( '*' pointer )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:123:4: '*' pointer
		{
		dbg.location(123,4);
		match(input,50,FOLLOW_50_in_synpred37_myparser548); if (state.failed) return;dbg.location(123,8);
		pushFollow(FOLLOW_pointer_in_synpred37_myparser550);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred37_myparser

	// $ANTLR start synpred40_myparser
	public final void synpred40_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:28: ( declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:28: declarator
		{
		dbg.location(134,28);
		pushFollow(FOLLOW_declarator_in_synpred40_myparser611);
		declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_myparser

	// $ANTLR start synpred41_myparser
	public final void synpred41_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:39: ( abstract_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:134:39: abstract_declarator
		{
		dbg.location(134,39);
		pushFollow(FOLLOW_abstract_declarator_in_synpred41_myparser613);
		abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred41_myparser

	// $ANTLR start synpred43_myparser
	public final void synpred43_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:143:12: ( direct_abstract_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:143:12: direct_abstract_declarator
		{
		dbg.location(143,12);
		pushFollow(FOLLOW_direct_abstract_declarator_in_synpred43_myparser651);
		direct_abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_myparser

	// $ANTLR start synpred46_myparser
	public final void synpred46_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:65: ( abstract_declarator_suffix )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:148:65: abstract_declarator_suffix
		{
		dbg.location(148,65);
		pushFollow(FOLLOW_abstract_declarator_suffix_in_synpred46_myparser686);
		abstract_declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred46_myparser

	// $ANTLR start synpred64_myparser
	public final void synpred64_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:198:4: ( 'sizeof' unary_expression )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:198:4: 'sizeof' unary_expression
		{
		dbg.location(198,4);
		match(input,84,FOLLOW_84_in_synpred64_myparser945); if (state.failed) return;dbg.location(198,13);
		pushFollow(FOLLOW_unary_expression_in_synpred64_myparser947);
		unary_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred64_myparser

	// $ANTLR start synpred83_myparser
	public final void synpred83_myparser_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:252:4: ( lvalue assignment_operator assignment_expression )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myparser.g:252:4: lvalue assignment_operator assignment_expression
		{
		dbg.location(252,4);
		pushFollow(FOLLOW_lvalue_in_synpred83_myparser1242);
		lvalue();
		state._fsp--;
		if (state.failed) return;dbg.location(252,11);
		pushFollow(FOLLOW_assignment_operator_in_synpred83_myparser1244);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;dbg.location(252,31);
		pushFollow(FOLLOW_assignment_expression_in_synpred83_myparser1246);
		assignment_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_myparser

	// Delegated rules

	public final boolean synpred64_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred64_myparser_fragment(); // can never throw exception
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
	public final boolean synpred27_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred27_myparser_fragment(); // can never throw exception
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
	public final boolean synpred35_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred35_myparser_fragment(); // can never throw exception
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
	public final boolean synpred40_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred40_myparser_fragment(); // can never throw exception
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
	public final boolean synpred43_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred43_myparser_fragment(); // can never throw exception
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
	public final boolean synpred46_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred46_myparser_fragment(); // can never throw exception
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
	public final boolean synpred29_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred29_myparser_fragment(); // can never throw exception
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
	public final boolean synpred83_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred83_myparser_fragment(); // can never throw exception
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
	public final boolean synpred41_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred41_myparser_fragment(); // can never throw exception
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
	public final boolean synpred37_myparser() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred37_myparser_fragment(); // can never throw exception
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


	protected DFA42 dfa42 = new DFA42(this);
	protected DFA53 dfa53 = new DFA53(this);
	static final String DFA42_eotS =
		"\u016f\uffff";
	static final String DFA42_eofS =
		"\1\uffff\5\41\u0169\uffff";
	static final String DFA42_minS =
		"\1\7\5\52\1\6\11\7\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff"+
		"\6\0\40\uffff\17\0\13\uffff\u0087\0";
	static final String DFA42_maxS =
		"\1\132\5\131\12\132\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff\6\0\40\uffff"+
		"\6\0\40\uffff\17\0\13\uffff\u0087\0";
	static final String DFA42_acceptS =
		"\26\uffff\1\1\12\uffff\1\2\u014d\uffff";
	static final String DFA42_specialS =
		"\20\uffff\1\0\1\1\1\2\1\3\1\4\1\5\40\uffff\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\40\uffff\1\14\1\15\1\16\1\17\1\20\1\21\40\uffff\1\22\1\23\1\24\1\25\1"+
		"\26\1\27\40\uffff\1\30\1\31\1\32\1\33\1\34\1\35\40\uffff\1\36\1\37\1\40"+
		"\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\13\uffff"+
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
	static final String[] DFA42_transitionS = {
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
			"\1\41\1\u00d0\1\uffff\1\41\1\uffff\1\u00cf\1\uffff\1\41\3\uffff\1\41"+
			"\1\u00d2\2\uffff\1\u00ce\1\uffff\1\41\3\uffff\1\41\3\uffff\2\41\1\uffff"+
			"\1\u00d1\1\uffff\3\41\2\uffff\1\u00db\4\uffff\1\u00d6\1\uffff\1\u00d3"+
			"\1\uffff\1\u00d7\2\uffff\1\u00d8\1\u00d4\2\uffff\1\u00d9\1\u00d5\31\uffff"+
			"\1\u00dc\5\uffff\1\u00da",
			"\1\u00ea\3\uffff\1\u00e9\6\uffff\1\u00ec\2\uffff\1\u00e8\14\uffff\1"+
			"\u00eb\6\uffff\1\u00f5\4\uffff\1\u00f0\1\uffff\1\u00ed\1\uffff\1\u00f1"+
			"\2\uffff\1\u00f2\1\u00ee\2\uffff\1\u00f3\1\u00ef\31\uffff\1\u00f6\5\uffff"+
			"\1\u00f4",
			"\1\u00f9\3\uffff\1\u00f8\6\uffff\1\u00fb\2\uffff\1\u00f7\14\uffff\1"+
			"\u00fa\6\uffff\1\u0104\4\uffff\1\u00ff\1\uffff\1\u00fc\1\uffff\1\u0100"+
			"\2\uffff\1\u0101\1\u00fd\2\uffff\1\u0102\1\u00fe\31\uffff\1\u0105\5\uffff"+
			"\1\u0103",
			"\1\u0109\3\uffff\1\u0108\6\uffff\1\u010b\2\uffff\1\u0107\14\uffff\1"+
			"\u010a\6\uffff\1\u0113\4\uffff\1\u010e\1\uffff\1\u0106\1\uffff\1\u010f"+
			"\2\uffff\1\u0110\1\u010c\2\uffff\1\u0111\1\u010d\31\uffff\1\u0114\5\uffff"+
			"\1\u0112",
			"\1\u0118\3\uffff\1\u0117\6\uffff\1\u011a\2\uffff\1\u0116\14\uffff\1"+
			"\u0119\6\uffff\1\u0122\4\uffff\1\u011d\1\uffff\1\u0115\1\uffff\1\u011e"+
			"\2\uffff\1\u011f\1\u011b\2\uffff\1\u0120\1\u011c\31\uffff\1\u0123\5\uffff"+
			"\1\u0121",
			"\1\u0127\3\uffff\1\u0126\6\uffff\1\u0129\2\uffff\1\u0125\14\uffff\1"+
			"\u0128\6\uffff\1\u0131\4\uffff\1\u012c\1\uffff\1\u0124\1\uffff\1\u012d"+
			"\2\uffff\1\u012e\1\u012a\2\uffff\1\u012f\1\u012b\31\uffff\1\u0132\5\uffff"+
			"\1\u0130",
			"\1\u0136\3\uffff\1\u0135\6\uffff\1\u0138\2\uffff\1\u0134\14\uffff\1"+
			"\u0137\6\uffff\1\u0140\4\uffff\1\u013b\1\uffff\1\u0133\1\uffff\1\u013c"+
			"\2\uffff\1\u013d\1\u0139\2\uffff\1\u013e\1\u013a\31\uffff\1\u0141\5\uffff"+
			"\1\u013f",
			"\1\u0145\3\uffff\1\u0144\6\uffff\1\u0147\2\uffff\1\u0143\14\uffff\1"+
			"\u0146\6\uffff\1\u014f\4\uffff\1\u014a\1\uffff\1\u0142\1\uffff\1\u014b"+
			"\2\uffff\1\u014c\1\u0148\2\uffff\1\u014d\1\u0149\31\uffff\1\u0150\5\uffff"+
			"\1\u014e",
			"\1\u0154\3\uffff\1\u0153\6\uffff\1\u0156\2\uffff\1\u0152\14\uffff\1"+
			"\u0155\6\uffff\1\u015e\4\uffff\1\u0159\1\uffff\1\u0151\1\uffff\1\u015a"+
			"\2\uffff\1\u015b\1\u0157\2\uffff\1\u015c\1\u0158\31\uffff\1\u015f\5\uffff"+
			"\1\u015d",
			"\1\u0163\3\uffff\1\u0162\6\uffff\1\u0165\2\uffff\1\u0161\14\uffff\1"+
			"\u0164\6\uffff\1\u016d\4\uffff\1\u0168\1\uffff\1\u0160\1\uffff\1\u0169"+
			"\2\uffff\1\u016a\1\u0166\2\uffff\1\u016b\1\u0167\31\uffff\1\u016e\5\uffff"+
			"\1\u016c",
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

	static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
	static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
	static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
	static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
	static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
	static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
	static final short[][] DFA42_transition;

	static {
		int numStates = DFA42_transitionS.length;
		DFA42_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
		}
	}

	protected class DFA42 extends DFA {

		public DFA42(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 42;
			this.eot = DFA42_eot;
			this.eof = DFA42_eof;
			this.min = DFA42_min;
			this.max = DFA42_max;
			this.accept = DFA42_accept;
			this.special = DFA42_special;
			this.transition = DFA42_transition;
		}
		@Override
		public String getDescription() {
			return "251:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );";
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
						int LA42_16 = input.LA(1);
						 
						int index42_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_16);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA42_17 = input.LA(1);
						 
						int index42_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_17);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA42_18 = input.LA(1);
						 
						int index42_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_18);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA42_19 = input.LA(1);
						 
						int index42_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_19);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA42_20 = input.LA(1);
						 
						int index42_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_20);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA42_21 = input.LA(1);
						 
						int index42_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_21);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA42_54 = input.LA(1);
						 
						int index42_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_54);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA42_55 = input.LA(1);
						 
						int index42_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_55);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA42_56 = input.LA(1);
						 
						int index42_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_56);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA42_57 = input.LA(1);
						 
						int index42_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_57);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA42_58 = input.LA(1);
						 
						int index42_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_58);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA42_59 = input.LA(1);
						 
						int index42_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_59);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA42_92 = input.LA(1);
						 
						int index42_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_92);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA42_93 = input.LA(1);
						 
						int index42_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_93);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA42_94 = input.LA(1);
						 
						int index42_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_94);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA42_95 = input.LA(1);
						 
						int index42_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_95);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA42_96 = input.LA(1);
						 
						int index42_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_96);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA42_97 = input.LA(1);
						 
						int index42_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_97);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA42_130 = input.LA(1);
						 
						int index42_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_130);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA42_131 = input.LA(1);
						 
						int index42_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_131);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA42_132 = input.LA(1);
						 
						int index42_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_132);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA42_133 = input.LA(1);
						 
						int index42_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_133);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA42_134 = input.LA(1);
						 
						int index42_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_134);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA42_135 = input.LA(1);
						 
						int index42_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_135);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA42_168 = input.LA(1);
						 
						int index42_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_168);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA42_169 = input.LA(1);
						 
						int index42_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_169);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA42_170 = input.LA(1);
						 
						int index42_170 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_170);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA42_171 = input.LA(1);
						 
						int index42_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_171);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA42_172 = input.LA(1);
						 
						int index42_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_172);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA42_173 = input.LA(1);
						 
						int index42_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_173);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA42_206 = input.LA(1);
						 
						int index42_206 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_206);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA42_207 = input.LA(1);
						 
						int index42_207 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_207);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA42_208 = input.LA(1);
						 
						int index42_208 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_208);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA42_209 = input.LA(1);
						 
						int index42_209 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_209);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA42_210 = input.LA(1);
						 
						int index42_210 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_210);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA42_211 = input.LA(1);
						 
						int index42_211 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_211);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA42_212 = input.LA(1);
						 
						int index42_212 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_212);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA42_213 = input.LA(1);
						 
						int index42_213 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_213);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA42_214 = input.LA(1);
						 
						int index42_214 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_214);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA42_215 = input.LA(1);
						 
						int index42_215 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_215);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA42_216 = input.LA(1);
						 
						int index42_216 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_216);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA42_217 = input.LA(1);
						 
						int index42_217 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_217);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA42_218 = input.LA(1);
						 
						int index42_218 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_218);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA42_219 = input.LA(1);
						 
						int index42_219 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_219);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA42_220 = input.LA(1);
						 
						int index42_220 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_220);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA42_232 = input.LA(1);
						 
						int index42_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_232);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA42_233 = input.LA(1);
						 
						int index42_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_233);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA42_234 = input.LA(1);
						 
						int index42_234 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_234);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA42_235 = input.LA(1);
						 
						int index42_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_235);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA42_236 = input.LA(1);
						 
						int index42_236 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_236);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA42_237 = input.LA(1);
						 
						int index42_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_237);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA42_238 = input.LA(1);
						 
						int index42_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_238);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA42_239 = input.LA(1);
						 
						int index42_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_239);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA42_240 = input.LA(1);
						 
						int index42_240 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_240);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA42_241 = input.LA(1);
						 
						int index42_241 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_241);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA42_242 = input.LA(1);
						 
						int index42_242 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_242);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA42_243 = input.LA(1);
						 
						int index42_243 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_243);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA42_244 = input.LA(1);
						 
						int index42_244 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_244);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA42_245 = input.LA(1);
						 
						int index42_245 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_245);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA42_246 = input.LA(1);
						 
						int index42_246 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_246);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA42_247 = input.LA(1);
						 
						int index42_247 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_247);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA42_248 = input.LA(1);
						 
						int index42_248 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_248);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA42_249 = input.LA(1);
						 
						int index42_249 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_249);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA42_250 = input.LA(1);
						 
						int index42_250 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_250);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA42_251 = input.LA(1);
						 
						int index42_251 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_251);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA42_252 = input.LA(1);
						 
						int index42_252 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_252);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA42_253 = input.LA(1);
						 
						int index42_253 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_253);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA42_254 = input.LA(1);
						 
						int index42_254 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_254);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA42_255 = input.LA(1);
						 
						int index42_255 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_255);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA42_256 = input.LA(1);
						 
						int index42_256 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_256);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA42_257 = input.LA(1);
						 
						int index42_257 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_257);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA42_258 = input.LA(1);
						 
						int index42_258 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_258);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA42_259 = input.LA(1);
						 
						int index42_259 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_259);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA42_260 = input.LA(1);
						 
						int index42_260 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_260);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA42_261 = input.LA(1);
						 
						int index42_261 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_261);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA42_262 = input.LA(1);
						 
						int index42_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_262);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA42_263 = input.LA(1);
						 
						int index42_263 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_263);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA42_264 = input.LA(1);
						 
						int index42_264 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_264);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA42_265 = input.LA(1);
						 
						int index42_265 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_265);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA42_266 = input.LA(1);
						 
						int index42_266 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_266);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA42_267 = input.LA(1);
						 
						int index42_267 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_267);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA42_268 = input.LA(1);
						 
						int index42_268 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_268);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA42_269 = input.LA(1);
						 
						int index42_269 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_269);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA42_270 = input.LA(1);
						 
						int index42_270 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_270);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA42_271 = input.LA(1);
						 
						int index42_271 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_271);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA42_272 = input.LA(1);
						 
						int index42_272 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_272);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA42_273 = input.LA(1);
						 
						int index42_273 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_273);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA42_274 = input.LA(1);
						 
						int index42_274 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_274);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA42_275 = input.LA(1);
						 
						int index42_275 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_275);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA42_276 = input.LA(1);
						 
						int index42_276 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_276);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA42_277 = input.LA(1);
						 
						int index42_277 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_277);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA42_278 = input.LA(1);
						 
						int index42_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_278);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA42_279 = input.LA(1);
						 
						int index42_279 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_279);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA42_280 = input.LA(1);
						 
						int index42_280 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_280);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA42_281 = input.LA(1);
						 
						int index42_281 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_281);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA42_282 = input.LA(1);
						 
						int index42_282 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_282);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA42_283 = input.LA(1);
						 
						int index42_283 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_283);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA42_284 = input.LA(1);
						 
						int index42_284 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_284);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA42_285 = input.LA(1);
						 
						int index42_285 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_285);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA42_286 = input.LA(1);
						 
						int index42_286 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_286);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA42_287 = input.LA(1);
						 
						int index42_287 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_287);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA42_288 = input.LA(1);
						 
						int index42_288 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_288);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA42_289 = input.LA(1);
						 
						int index42_289 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_289);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA42_290 = input.LA(1);
						 
						int index42_290 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_290);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA42_291 = input.LA(1);
						 
						int index42_291 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_291);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA42_292 = input.LA(1);
						 
						int index42_292 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_292);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA42_293 = input.LA(1);
						 
						int index42_293 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_293);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA42_294 = input.LA(1);
						 
						int index42_294 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_294);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA42_295 = input.LA(1);
						 
						int index42_295 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_295);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA42_296 = input.LA(1);
						 
						int index42_296 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_296);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA42_297 = input.LA(1);
						 
						int index42_297 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_297);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA42_298 = input.LA(1);
						 
						int index42_298 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_298);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA42_299 = input.LA(1);
						 
						int index42_299 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_299);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA42_300 = input.LA(1);
						 
						int index42_300 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_300);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA42_301 = input.LA(1);
						 
						int index42_301 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_301);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA42_302 = input.LA(1);
						 
						int index42_302 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_302);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA42_303 = input.LA(1);
						 
						int index42_303 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_303);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA42_304 = input.LA(1);
						 
						int index42_304 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_304);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA42_305 = input.LA(1);
						 
						int index42_305 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_305);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA42_306 = input.LA(1);
						 
						int index42_306 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_306);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA42_307 = input.LA(1);
						 
						int index42_307 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_307);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA42_308 = input.LA(1);
						 
						int index42_308 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_308);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA42_309 = input.LA(1);
						 
						int index42_309 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_309);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA42_310 = input.LA(1);
						 
						int index42_310 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_310);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA42_311 = input.LA(1);
						 
						int index42_311 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_311);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA42_312 = input.LA(1);
						 
						int index42_312 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_312);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA42_313 = input.LA(1);
						 
						int index42_313 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_313);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA42_314 = input.LA(1);
						 
						int index42_314 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_314);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA42_315 = input.LA(1);
						 
						int index42_315 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_315);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA42_316 = input.LA(1);
						 
						int index42_316 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_316);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA42_317 = input.LA(1);
						 
						int index42_317 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_317);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA42_318 = input.LA(1);
						 
						int index42_318 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_318);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA42_319 = input.LA(1);
						 
						int index42_319 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_319);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA42_320 = input.LA(1);
						 
						int index42_320 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_320);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA42_321 = input.LA(1);
						 
						int index42_321 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_321);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA42_322 = input.LA(1);
						 
						int index42_322 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_322);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA42_323 = input.LA(1);
						 
						int index42_323 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_323);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA42_324 = input.LA(1);
						 
						int index42_324 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_324);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA42_325 = input.LA(1);
						 
						int index42_325 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_325);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA42_326 = input.LA(1);
						 
						int index42_326 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_326);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA42_327 = input.LA(1);
						 
						int index42_327 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_327);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA42_328 = input.LA(1);
						 
						int index42_328 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_328);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA42_329 = input.LA(1);
						 
						int index42_329 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_329);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA42_330 = input.LA(1);
						 
						int index42_330 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_330);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA42_331 = input.LA(1);
						 
						int index42_331 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_331);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA42_332 = input.LA(1);
						 
						int index42_332 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_332);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA42_333 = input.LA(1);
						 
						int index42_333 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_333);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA42_334 = input.LA(1);
						 
						int index42_334 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_334);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA42_335 = input.LA(1);
						 
						int index42_335 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_335);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA42_336 = input.LA(1);
						 
						int index42_336 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_336);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA42_337 = input.LA(1);
						 
						int index42_337 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_337);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA42_338 = input.LA(1);
						 
						int index42_338 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_338);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA42_339 = input.LA(1);
						 
						int index42_339 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_339);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA42_340 = input.LA(1);
						 
						int index42_340 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_340);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA42_341 = input.LA(1);
						 
						int index42_341 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_341);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA42_342 = input.LA(1);
						 
						int index42_342 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_342);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA42_343 = input.LA(1);
						 
						int index42_343 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_343);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA42_344 = input.LA(1);
						 
						int index42_344 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_344);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA42_345 = input.LA(1);
						 
						int index42_345 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_345);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA42_346 = input.LA(1);
						 
						int index42_346 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_346);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA42_347 = input.LA(1);
						 
						int index42_347 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_347);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA42_348 = input.LA(1);
						 
						int index42_348 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_348);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA42_349 = input.LA(1);
						 
						int index42_349 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_349);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA42_350 = input.LA(1);
						 
						int index42_350 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_350);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA42_351 = input.LA(1);
						 
						int index42_351 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_351);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA42_352 = input.LA(1);
						 
						int index42_352 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_352);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA42_353 = input.LA(1);
						 
						int index42_353 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_353);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA42_354 = input.LA(1);
						 
						int index42_354 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_354);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA42_355 = input.LA(1);
						 
						int index42_355 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_355);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA42_356 = input.LA(1);
						 
						int index42_356 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_356);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA42_357 = input.LA(1);
						 
						int index42_357 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_357);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA42_358 = input.LA(1);
						 
						int index42_358 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_358);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA42_359 = input.LA(1);
						 
						int index42_359 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_359);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA42_360 = input.LA(1);
						 
						int index42_360 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_360);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA42_361 = input.LA(1);
						 
						int index42_361 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_361);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA42_362 = input.LA(1);
						 
						int index42_362 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_362);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA42_363 = input.LA(1);
						 
						int index42_363 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_363);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA42_364 = input.LA(1);
						 
						int index42_364 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_364);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA42_365 = input.LA(1);
						 
						int index42_365 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_365);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA42_366 = input.LA(1);
						 
						int index42_366 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred83_myparser()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index42_366);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 42, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA53_eotS =
		"\77\uffff";
	static final String DFA53_eofS =
		"\77\uffff";
	static final String DFA53_minS =
		"\1\5\1\52\75\uffff";
	static final String DFA53_maxS =
		"\1\132\1\130\75\uffff";
	static final String DFA53_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\1\3\16\uffff\1\4\1\uffff\1\5\2\uffff\1\6\45\uffff";
	static final String DFA53_specialS =
		"\77\uffff}>";
	static final String[] DFA53_transitionS = {
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

	static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
	static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
	static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
	static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
	static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
	static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
	static final short[][] DFA53_transition;

	static {
		int numStates = DFA53_transitionS.length;
		DFA53_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
		}
	}

	protected class DFA53 extends DFA {

		public DFA53(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 53;
			this.eot = DFA53_eot;
			this.eof = DFA53_eof;
			this.min = DFA53_min;
			this.max = DFA53_max;
			this.accept = DFA53_accept;
			this.special = DFA53_special;
			this.transition = DFA53_transition;
		}
		@Override
		public String getDescription() {
			return "313:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_set_in_program76 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_MAIN_in_program84 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_program86 = new BitSet(new long[]{0x0102000000800040L});
	public static final BitSet FOLLOW_INT_in_program89 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_program91 = new BitSet(new long[]{0x0102000000000040L});
	public static final BitSet FOLLOW_56_in_program96 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CHAR_in_program99 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_program101 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_program103 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_CHAR_in_program109 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_program111 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_program113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_program115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_program117 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_program122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_compound_statement_in_program124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_declaration149 = new BitSet(new long[]{0x0005000000200000L,0x0000000000000004L});
	public static final BitSet FOLLOW_init_declarator_list_in_declaration151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_declaration154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list178 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_init_declarator_list181 = new BitSet(new long[]{0x0005000000200000L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list183 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_declarator_in_init_declarator199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_init_declarator202 = new BitSet(new long[]{0x0665420400240880L,0x0000000004300000L});
	public static final BitSet FOLLOW_initializer_in_init_declarator204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers221 = new BitSet(new long[]{0x00000073A882A252L});
	public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers225 = new BitSet(new long[]{0x00000073A882A252L});
	public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers229 = new BitSet(new long[]{0x00000073A882A252L});
	public static final BitSet FOLLOW_CONST_in_type_qualifier246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_type_qualifier253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTERN_in_storage_class_specifier266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_storage_class_specifier273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTO_in_storage_class_specifier280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_storage_class_specifier287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name301 = new BitSet(new long[]{0x0005000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_in_type_name303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list319 = new BitSet(new long[]{0x0000007188822242L});
	public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list323 = new BitSet(new long[]{0x0000007188822242L});
	public static final BitSet FOLLOW_VOID_in_type_specifier339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type_specifier346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type_specifier353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type_specifier360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_type_specifier367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type_specifier374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type_specifier381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNED_in_type_specifier388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_in_type_specifier395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator409 = new BitSet(new long[]{0x0001000000200000L});
	public static final BitSet FOLLOW_direct_declarator_in_declarator412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_direct_declarator434 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_48_in_direct_declarator438 = new BitSet(new long[]{0x0005000000200000L});
	public static final BitSet FOLLOW_declarator_in_direct_declarator440 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_direct_declarator442 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_suffix_in_direct_declarator445 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_declarator_suffix460 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_constant_expression_in_declarator_suffix462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_declarator_suffix464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_declarator_suffix474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_declarator_suffix476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_declarator_suffix488 = new BitSet(new long[]{0x00000073A882A250L});
	public static final BitSet FOLLOW_parameter_type_list_in_declarator_suffix490 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarator_suffix492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_declarator_suffix504 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_identifier_list_in_declarator_suffix506 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarator_suffix508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_declarator_suffix520 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarator_suffix522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_pointer535 = new BitSet(new long[]{0x0000004000000200L});
	public static final BitSet FOLLOW_type_qualifier_in_pointer537 = new BitSet(new long[]{0x0004004000000202L});
	public static final BitSet FOLLOW_pointer_in_pointer540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_pointer548 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_pointer_in_pointer550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_pointer557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_list_in_parameter_type_list570 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_parameter_type_list573 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_parameter_type_list575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list589 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_parameter_list592 = new BitSet(new long[]{0x00000073A882A250L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list594 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration608 = new BitSet(new long[]{0x0005000000200002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_in_parameter_declaration611 = new BitSet(new long[]{0x0005000000200002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration613 = new BitSet(new long[]{0x0005000000200002L,0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list628 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_identifier_list631 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list633 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_pointer_in_abstract_declarator649 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_direct_abstract_declarator674 = new BitSet(new long[]{0x0005000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator676 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_direct_abstract_declarator678 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator682 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator686 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_abstract_declarator_suffix701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_abstract_declarator_suffix703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_abstract_declarator_suffix710 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_constant_expression_in_abstract_declarator_suffix712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_abstract_declarator_suffix714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_abstract_declarator_suffix721 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_abstract_declarator_suffix723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_abstract_declarator_suffix730 = new BitSet(new long[]{0x00000073A882A250L});
	public static final BitSet FOLLOW_parameter_type_list_in_abstract_declarator_suffix732 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_abstract_declarator_suffix734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_initializer755 = new BitSet(new long[]{0x0665420400240880L,0x0000000004300000L});
	public static final BitSet FOLLOW_initializer_list_in_initializer757 = new BitSet(new long[]{0x0100000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_56_in_initializer759 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_initializer762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initializer_in_initializer_list776 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_initializer_list779 = new BitSet(new long[]{0x0665420400240880L,0x0000000004300000L});
	public static final BitSet FOLLOW_initializer_in_initializer_list781 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list797 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_argument_expression_list800 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list802 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression819 = new BitSet(new long[]{0x0220000000000002L});
	public static final BitSet FOLLOW_53_in_additive_expression823 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression825 = new BitSet(new long[]{0x0220000000000002L});
	public static final BitSet FOLLOW_57_in_additive_expression829 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression831 = new BitSet(new long[]{0x0220000000000002L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression849 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_50_in_multiplicative_expression853 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression855 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_63_in_multiplicative_expression859 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression861 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_43_in_multiplicative_expression865 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression867 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_48_in_cast_expression884 = new BitSet(new long[]{0x0000007188822240L});
	public static final BitSet FOLLOW_type_name_in_cast_expression886 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_cast_expression888 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unary_expression918 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_unary_expression927 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression936 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_unary_expression945 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_unary_expression954 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_unary_expression956 = new BitSet(new long[]{0x0000007188822240L});
	public static final BitSet FOLLOW_type_name_in_unary_expression958 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_unary_expression960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression981 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_postfix_expression989 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_postfix_expression991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_postfix_expression993 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_48_in_postfix_expression1001 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_postfix_expression1003 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_48_in_postfix_expression1011 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1013 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_postfix_expression1015 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_61_in_postfix_expression1025 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1027 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_60_in_postfix_expression1037 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1039 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_54_in_postfix_expression1047 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_58_in_postfix_expression1055 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_46_in_unary_operator1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_unary_operator1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_unary_operator1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unary_operator1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_unary_operator1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unary_operator1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_primary_expression1139 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_primary_expression1141 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_primary_expression1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_constant1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_LITERAL_in_constant1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_constant1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1207 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_expression1210 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1212 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_constant_expression1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment_expression1242 = new BitSet(new long[]{0x0890900000000000L,0x00000000008210A1L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1244 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_assignment_expression1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_lvalue1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_assignment_operator1279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignment_operator1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_assignment_operator1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_assignment_operator1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_assignment_operator1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_assignment_operator1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_assignment_operator1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_assignment_operator1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_assignment_operator1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_assignment_operator1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_assignment_operator1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression1366 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_conditional_expression1369 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_conditional_expression1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_conditional_expression1373 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_expression1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1391 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_logical_or_expression1394 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1396 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1411 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_logical_and_expression1414 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1416 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1431 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_inclusive_or_expression1434 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_exclusive_or_expression1454 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1471 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_and_expression1474 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1476 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1491 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_set_in_equality_expression1494 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1500 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000648L});
	public static final BitSet FOLLOW_set_in_relational_expression1518 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000648L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1543 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000810L});
	public static final BitSet FOLLOW_set_in_shift_expression1546 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1552 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000810L});
	public static final BitSet FOLLOW_labeled_statement_in_statement1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_labeled_statement1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_labeled_statement1638 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_labeled_statement1647 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_constant_expression_in_labeled_statement1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_labeled_statement1651 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_labeled_statement1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_labeled_statement1662 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_compound_statement1681 = new BitSet(new long[]{0x066542FFE8FEBEF0L,0x00000000063C0004L});
	public static final BitSet FOLLOW_declaration_in_compound_statement1683 = new BitSet(new long[]{0x066542FFE8FEBEF0L,0x00000000063C0004L});
	public static final BitSet FOLLOW_statement_list_in_compound_statement1686 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_compound_statement1689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement_list1706 = new BitSet(new long[]{0x0665428C407C1CA2L,0x00000000043C0004L});
	public static final BitSet FOLLOW_66_in_expression_statement1720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_expression_statement1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_selection_statement1743 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_selection_statement1745 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_selection_statement1747 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_selection_statement1749 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_selection_statement1751 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ELSE_in_selection_statement1766 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_selection_statement1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_selection_statement1778 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_selection_statement1780 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_selection_statement1782 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_selection_statement1784 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_selection_statement1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement1804 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1806 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1808 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1810 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_iteration_statement1819 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1821 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement1823 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1825 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1827 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_iteration_statement1831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_iteration_statement1838 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1840 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100004L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement1842 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100004L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement1844 = new BitSet(new long[]{0x0667420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1846 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1849 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GOTO_in_jump_statement1867 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_jump_statement1869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_jump_statement1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_jump_statement1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement1896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement1905 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_jump_statement1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred27_myparser409 = new BitSet(new long[]{0x0001000000200000L});
	public static final BitSet FOLLOW_direct_declarator_in_synpred27_myparser412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_suffix_in_synpred29_myparser445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred35_myparser540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_synpred37_myparser548 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_pointer_in_synpred37_myparser550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_in_synpred40_myparser611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_in_synpred41_myparser613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred43_myparser651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_synpred46_myparser686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_synpred64_myparser945 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_synpred64_myparser947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred83_myparser1242 = new BitSet(new long[]{0x0890900000000000L,0x00000000008210A1L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred83_myparser1244 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred83_myparser1246 = new BitSet(new long[]{0x0000000000000002L});
}
