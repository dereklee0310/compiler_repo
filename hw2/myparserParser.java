// $ANTLR 3.5.3 myparser.g 2023-06-07 03:09:42

    // import packages here.


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myparserParser extends Parser {
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


	public myparserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[180+1];


	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myparser.g"; }


	    boolean TRACEON = true;



	// $ANTLR start "program"
	// myparser.g:25:1: program : ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' compound_statement ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myparser.g:26:5: ( ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' compound_statement )
			// myparser.g:26:7: ( VOID | INT ) MAIN '(' ( INT IDENTIFIER )? ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )? ')' compound_statement
			{
			if ( input.LA(1)==INT||input.LA(1)==VOID ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,MAIN,FOLLOW_MAIN_in_program84); if (state.failed) return;
			match(input,48,FOLLOW_48_in_program86); if (state.failed) return;
			// myparser.g:26:29: ( INT IDENTIFIER )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// myparser.g:26:30: INT IDENTIFIER
					{
					match(input,INT,FOLLOW_INT_in_program89); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program91); if (state.failed) return;
					}
					break;

			}

			// myparser.g:26:47: ( ',' ( CHAR '**' IDENTIFIER ) | ( CHAR '*' IDENTIFIER '[' ']' ) )?
			int alt2=3;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==56) ) {
				alt2=1;
			}
			else if ( (LA2_0==CHAR) ) {
				alt2=2;
			}
			switch (alt2) {
				case 1 :
					// myparser.g:26:48: ',' ( CHAR '**' IDENTIFIER )
					{
					match(input,56,FOLLOW_56_in_program96); if (state.failed) return;
					// myparser.g:26:52: ( CHAR '**' IDENTIFIER )
					// myparser.g:26:53: CHAR '**' IDENTIFIER
					{
					match(input,CHAR,FOLLOW_CHAR_in_program99); if (state.failed) return;
					match(input,51,FOLLOW_51_in_program101); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program103); if (state.failed) return;
					}

					}
					break;
				case 2 :
					// myparser.g:26:77: ( CHAR '*' IDENTIFIER '[' ']' )
					{
					// myparser.g:26:77: ( CHAR '*' IDENTIFIER '[' ']' )
					// myparser.g:26:78: CHAR '*' IDENTIFIER '[' ']'
					{
					match(input,CHAR,FOLLOW_CHAR_in_program109); if (state.failed) return;
					match(input,50,FOLLOW_50_in_program111); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_program113); if (state.failed) return;
					match(input,78,FOLLOW_78_in_program115); if (state.failed) return;
					match(input,79,FOLLOW_79_in_program117); if (state.failed) return;
					}

					}
					break;

			}

			match(input,49,FOLLOW_49_in_program122); if (state.failed) return;
			pushFollow(FOLLOW_compound_statement_in_program124);
			compound_statement();
			state._fsp--;
			if (state.failed) return;
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
	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// myparser.g:31:1: declaration : declaration_specifiers ( init_declarator_list )? ';' ;
	public final void declaration() throws RecognitionException {
		int declaration_StartIndex = input.index();

		ParserRuleReturnScope init_declarator_list1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myparser.g:32:5: ( declaration_specifiers ( init_declarator_list )? ';' )
			// myparser.g:32:7: declaration_specifiers ( init_declarator_list )? ';'
			{
			pushFollow(FOLLOW_declaration_specifiers_in_declaration149);
			declaration_specifiers();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:32:30: ( init_declarator_list )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDENTIFIER||LA3_0==48||LA3_0==50) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// myparser.g:32:30: init_declarator_list
					{
					pushFollow(FOLLOW_init_declarator_list_in_declaration151);
					init_declarator_list1=init_declarator_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,66,FOLLOW_66_in_declaration154); if (state.failed) return;
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declaration: declaration_specifiers init_declarator_list? ';'");}
			if ( state.backtracking==0 ) {System.out.println((init_declarator_list1!=null?input.toString(init_declarator_list1.start,init_declarator_list1.stop):null));}
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
	}
	// $ANTLR end "declaration"


	public static class init_declarator_list_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "init_declarator_list"
	// myparser.g:36:1: init_declarator_list : init_declarator ( ',' init_declarator )* ;
	public final myparserParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
		myparserParser.init_declarator_list_return retval = new myparserParser.init_declarator_list_return();
		retval.start = input.LT(1);
		int init_declarator_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// myparser.g:37:2: ( init_declarator ( ',' init_declarator )* )
			// myparser.g:37:4: init_declarator ( ',' init_declarator )*
			{
			pushFollow(FOLLOW_init_declarator_in_init_declarator_list170);
			init_declarator();
			state._fsp--;
			if (state.failed) return retval;
			// myparser.g:37:20: ( ',' init_declarator )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==56) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myparser.g:37:21: ',' init_declarator
					{
					match(input,56,FOLLOW_56_in_init_declarator_list173); if (state.failed) return retval;
					pushFollow(FOLLOW_init_declarator_in_init_declarator_list175);
					init_declarator();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop4;
				}
			}

			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("init_declarator_list: init_declarator (',' init_declarator)*"); }
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
		return retval;
	}
	// $ANTLR end "init_declarator_list"



	// $ANTLR start "init_declarator"
	// myparser.g:41:1: init_declarator : declarator ( '=' initializer )? ;
	public final void init_declarator() throws RecognitionException {
		int init_declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// myparser.g:42:2: ( declarator ( '=' initializer )? )
			// myparser.g:42:4: declarator ( '=' initializer )?
			{
			pushFollow(FOLLOW_declarator_in_init_declarator191);
			declarator();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:42:15: ( '=' initializer )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==71) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// myparser.g:42:16: '=' initializer
					{
					match(input,71,FOLLOW_71_in_init_declarator194); if (state.failed) return;
					pushFollow(FOLLOW_initializer_in_init_declarator196);
					initializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

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
	}
	// $ANTLR end "init_declarator"



	// $ANTLR start "declaration_specifiers"
	// myparser.g:46:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier )+ ;
	public final void declaration_specifiers() throws RecognitionException {
		int declaration_specifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// myparser.g:47:2: ( ( storage_class_specifier | type_specifier | type_qualifier )+ )
			// myparser.g:47:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			{
			// myparser.g:47:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=4;
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
				switch (alt6) {
				case 1 :
					// myparser.g:47:5: storage_class_specifier
					{
					pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers213);
					storage_class_specifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:47:31: type_specifier
					{
					pushFollow(FOLLOW_type_specifier_in_declaration_specifiers217);
					type_specifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:47:48: type_qualifier
					{
					pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers221);
					type_qualifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

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
	}
	// $ANTLR end "declaration_specifiers"



	// $ANTLR start "type_qualifier"
	// myparser.g:51:1: type_qualifier : ( CONST | VOLATILE );
	public final void type_qualifier() throws RecognitionException {
		int type_qualifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// myparser.g:52:2: ( CONST | VOLATILE )
			int alt7=2;
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
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// myparser.g:52:4: CONST
					{
					match(input,CONST,FOLLOW_CONST_in_type_qualifier238); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_qualifier: CONST"); }
					}
					break;
				case 2 :
					// myparser.g:53:4: VOLATILE
					{
					match(input,VOLATILE,FOLLOW_VOLATILE_in_type_qualifier245); if (state.failed) return;
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
	}
	// $ANTLR end "type_qualifier"



	// $ANTLR start "storage_class_specifier"
	// myparser.g:56:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER );
	public final void storage_class_specifier() throws RecognitionException {
		int storage_class_specifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// myparser.g:57:2: ( EXTERN | STATIC | AUTO | REGISTER )
			int alt8=4;
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
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// myparser.g:57:4: EXTERN
					{
					match(input,EXTERN,FOLLOW_EXTERN_in_storage_class_specifier258); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: EXTERN"); }
					}
					break;
				case 2 :
					// myparser.g:58:4: STATIC
					{
					match(input,STATIC,FOLLOW_STATIC_in_storage_class_specifier265); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: STATIC"); }
					}
					break;
				case 3 :
					// myparser.g:59:4: AUTO
					{
					match(input,AUTO,FOLLOW_AUTO_in_storage_class_specifier272); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("storage_class_specifier: AUTO"); }
					}
					break;
				case 4 :
					// myparser.g:60:4: REGISTER
					{
					match(input,REGISTER,FOLLOW_REGISTER_in_storage_class_specifier279); if (state.failed) return;
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
	}
	// $ANTLR end "storage_class_specifier"



	// $ANTLR start "type_name"
	// myparser.g:64:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
	public final void type_name() throws RecognitionException {
		int type_name_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// myparser.g:65:2: ( specifier_qualifier_list ( abstract_declarator )? )
			// myparser.g:65:4: specifier_qualifier_list ( abstract_declarator )?
			{
			pushFollow(FOLLOW_specifier_qualifier_list_in_type_name293);
			specifier_qualifier_list();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:65:29: ( abstract_declarator )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==48||LA9_0==50||LA9_0==78) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// myparser.g:65:29: abstract_declarator
					{
					pushFollow(FOLLOW_abstract_declarator_in_type_name295);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

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
	}
	// $ANTLR end "type_name"



	// $ANTLR start "specifier_qualifier_list"
	// myparser.g:69:1: specifier_qualifier_list : ( type_qualifier | type_specifier )+ ;
	public final void specifier_qualifier_list() throws RecognitionException {
		int specifier_qualifier_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// myparser.g:70:2: ( ( type_qualifier | type_specifier )+ )
			// myparser.g:70:4: ( type_qualifier | type_specifier )+
			{
			// myparser.g:70:4: ( type_qualifier | type_specifier )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==CONST||LA10_0==VOLATILE) ) {
					alt10=1;
				}
				else if ( (LA10_0==CHAR||LA10_0==DOUBLE||LA10_0==FLOAT||LA10_0==INT||LA10_0==LONG||(LA10_0 >= SHORT && LA10_0 <= SIGNED)||(LA10_0 >= UNSIGNED && LA10_0 <= VOID)) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// myparser.g:70:5: type_qualifier
					{
					pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list311);
					type_qualifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:70:22: type_specifier
					{
					pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list315);
					type_specifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

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
	}
	// $ANTLR end "specifier_qualifier_list"



	// $ANTLR start "type_specifier"
	// myparser.g:74:1: type_specifier : ( VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED );
	public final void type_specifier() throws RecognitionException {
		int type_specifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myparser.g:75:2: ( VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED )
			int alt11=9;
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
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myparser.g:75:4: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type_specifier331); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: VOID"); }
					}
					break;
				case 2 :
					// myparser.g:76:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type_specifier338); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: CHAR"); }
					}
					break;
				case 3 :
					// myparser.g:77:4: SHORT
					{
					match(input,SHORT,FOLLOW_SHORT_in_type_specifier345); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: SHORT"); }
					}
					break;
				case 4 :
					// myparser.g:78:4: INT
					{
					match(input,INT,FOLLOW_INT_in_type_specifier352); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: INT"); }
					}
					break;
				case 5 :
					// myparser.g:79:4: LONG
					{
					match(input,LONG,FOLLOW_LONG_in_type_specifier359); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: LONG"); }
					}
					break;
				case 6 :
					// myparser.g:80:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier366); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: FLOAT"); }
					}
					break;
				case 7 :
					// myparser.g:81:4: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type_specifier373); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: DOUBLE"); }
					}
					break;
				case 8 :
					// myparser.g:82:4: SIGNED
					{
					match(input,SIGNED,FOLLOW_SIGNED_in_type_specifier380); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type_specifier: SIGNED"); }
					}
					break;
				case 9 :
					// myparser.g:83:4: UNSIGNED
					{
					match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type_specifier387); if (state.failed) return;
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
	}
	// $ANTLR end "type_specifier"



	// $ANTLR start "declarator"
	// myparser.g:87:1: declarator : ( ( pointer )? direct_declarator | pointer );
	public final void declarator() throws RecognitionException {
		int declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myparser.g:88:2: ( ( pointer )? direct_declarator | pointer )
			int alt13=2;
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
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// myparser.g:88:4: ( pointer )? direct_declarator
					{
					// myparser.g:88:4: ( pointer )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==50) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// myparser.g:88:4: pointer
							{
							pushFollow(FOLLOW_pointer_in_declarator401);
							pointer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_direct_declarator_in_declarator404);
					direct_declarator();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator: pointer? direct_declarator"); }
					}
					break;
				case 2 :
					// myparser.g:89:4: pointer
					{
					pushFollow(FOLLOW_pointer_in_declarator411);
					pointer();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "declarator"



	// $ANTLR start "direct_declarator"
	// myparser.g:93:1: direct_declarator : ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* ;
	public final void direct_declarator() throws RecognitionException {
		int direct_declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myparser.g:94:2: ( ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* )
			// myparser.g:94:4: ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )*
			{
			// myparser.g:94:4: ( IDENTIFIER | '(' declarator ')' )
			int alt14=2;
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
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// myparser.g:94:5: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_direct_declarator426); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:94:18: '(' declarator ')'
					{
					match(input,48,FOLLOW_48_in_direct_declarator430); if (state.failed) return;
					pushFollow(FOLLOW_declarator_in_direct_declarator432);
					declarator();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_direct_declarator434); if (state.failed) return;
					}
					break;

			}

			// myparser.g:94:38: ( declarator_suffix )*
			loop15:
			while (true) {
				int alt15=2;
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

				switch (alt15) {
				case 1 :
					// myparser.g:94:38: declarator_suffix
					{
					pushFollow(FOLLOW_declarator_suffix_in_direct_declarator437);
					declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}

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
	}
	// $ANTLR end "direct_declarator"



	// $ANTLR start "declarator_suffix"
	// myparser.g:98:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );
	public final void declarator_suffix() throws RecognitionException {
		int declarator_suffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myparser.g:99:2: ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' )
			int alt16=5;
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
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// myparser.g:99:4: '[' constant_expression ']'
					{
					match(input,78,FOLLOW_78_in_declarator_suffix452); if (state.failed) return;
					pushFollow(FOLLOW_constant_expression_in_declarator_suffix454);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,79,FOLLOW_79_in_declarator_suffix456); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '[' constant_expression ']'"); }
					}
					break;
				case 2 :
					// myparser.g:100:7: '[' ']'
					{
					match(input,78,FOLLOW_78_in_declarator_suffix466); if (state.failed) return;
					match(input,79,FOLLOW_79_in_declarator_suffix468); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '[' ']'"); }
					}
					break;
				case 3 :
					// myparser.g:101:9: '(' parameter_type_list ')'
					{
					match(input,48,FOLLOW_48_in_declarator_suffix480); if (state.failed) return;
					pushFollow(FOLLOW_parameter_type_list_in_declarator_suffix482);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_declarator_suffix484); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '(' parameter_type_list ')'"); }
					}
					break;
				case 4 :
					// myparser.g:102:9: '(' identifier_list ')'
					{
					match(input,48,FOLLOW_48_in_declarator_suffix496); if (state.failed) return;
					pushFollow(FOLLOW_identifier_list_in_declarator_suffix498);
					identifier_list();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_declarator_suffix500); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarator_suffix: '(' identifier_list ')'"); }
					}
					break;
				case 5 :
					// myparser.g:103:9: '(' ')'
					{
					match(input,48,FOLLOW_48_in_declarator_suffix512); if (state.failed) return;
					match(input,49,FOLLOW_49_in_declarator_suffix514); if (state.failed) return;
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
	}
	// $ANTLR end "declarator_suffix"



	// $ANTLR start "pointer"
	// myparser.g:106:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );
	public final void pointer() throws RecognitionException {
		int pointer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myparser.g:107:2: ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' )
			int alt19=3;
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
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// myparser.g:107:4: '*' ( type_qualifier )+ ( pointer )?
					{
					match(input,50,FOLLOW_50_in_pointer527); if (state.failed) return;
					// myparser.g:107:8: ( type_qualifier )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==CONST||LA17_0==VOLATILE) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// myparser.g:107:8: type_qualifier
							{
							pushFollow(FOLLOW_type_qualifier_in_pointer529);
							type_qualifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					// myparser.g:107:24: ( pointer )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==50) ) {
						int LA18_1 = input.LA(2);
						if ( (synpred35_myparser()) ) {
							alt18=1;
						}
					}
					switch (alt18) {
						case 1 :
							// myparser.g:107:24: pointer
							{
							pushFollow(FOLLOW_pointer_in_pointer532);
							pointer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("pointer: '*' type_qualifier+ pointer?"); }
					}
					break;
				case 2 :
					// myparser.g:108:4: '*' pointer
					{
					match(input,50,FOLLOW_50_in_pointer540); if (state.failed) return;
					pushFollow(FOLLOW_pointer_in_pointer542);
					pointer();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("pointer: '*' pointer"); }
					}
					break;
				case 3 :
					// myparser.g:109:4: '*'
					{
					match(input,50,FOLLOW_50_in_pointer549); if (state.failed) return;
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
	}
	// $ANTLR end "pointer"



	// $ANTLR start "parameter_type_list"
	// myparser.g:112:1: parameter_type_list : parameter_list ( ',' '...' )? ;
	public final void parameter_type_list() throws RecognitionException {
		int parameter_type_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myparser.g:113:2: ( parameter_list ( ',' '...' )? )
			// myparser.g:113:4: parameter_list ( ',' '...' )?
			{
			pushFollow(FOLLOW_parameter_list_in_parameter_type_list562);
			parameter_list();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:113:19: ( ',' '...' )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==56) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// myparser.g:113:20: ',' '...'
					{
					match(input,56,FOLLOW_56_in_parameter_type_list565); if (state.failed) return;
					match(input,62,FOLLOW_62_in_parameter_type_list567); if (state.failed) return;
					}
					break;

			}

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
	}
	// $ANTLR end "parameter_type_list"



	// $ANTLR start "parameter_list"
	// myparser.g:115:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* ;
	public final void parameter_list() throws RecognitionException {
		int parameter_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myparser.g:116:2: ( parameter_declaration ( ',' parameter_declaration )* )
			// myparser.g:116:4: parameter_declaration ( ',' parameter_declaration )*
			{
			pushFollow(FOLLOW_parameter_declaration_in_parameter_list581);
			parameter_declaration();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:116:26: ( ',' parameter_declaration )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==56) ) {
					int LA21_1 = input.LA(2);
					if ( (LA21_1==AUTO||LA21_1==CHAR||LA21_1==CONST||LA21_1==DOUBLE||LA21_1==EXTERN||LA21_1==FLOAT||LA21_1==INT||LA21_1==LONG||LA21_1==REGISTER||(LA21_1 >= SHORT && LA21_1 <= STATIC)||(LA21_1 >= UNSIGNED && LA21_1 <= VOLATILE)) ) {
						alt21=1;
					}

				}

				switch (alt21) {
				case 1 :
					// myparser.g:116:27: ',' parameter_declaration
					{
					match(input,56,FOLLOW_56_in_parameter_list584); if (state.failed) return;
					pushFollow(FOLLOW_parameter_declaration_in_parameter_list586);
					parameter_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}

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
	}
	// $ANTLR end "parameter_list"



	// $ANTLR start "parameter_declaration"
	// myparser.g:118:1: parameter_declaration : declaration_specifiers ( declarator | abstract_declarator )* ;
	public final void parameter_declaration() throws RecognitionException {
		int parameter_declaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// myparser.g:119:2: ( declaration_specifiers ( declarator | abstract_declarator )* )
			// myparser.g:119:4: declaration_specifiers ( declarator | abstract_declarator )*
			{
			pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration600);
			declaration_specifiers();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:119:27: ( declarator | abstract_declarator )*
			loop22:
			while (true) {
				int alt22=3;
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
				switch (alt22) {
				case 1 :
					// myparser.g:119:28: declarator
					{
					pushFollow(FOLLOW_declarator_in_parameter_declaration603);
					declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:119:39: abstract_declarator
					{
					pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration605);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

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
	}
	// $ANTLR end "parameter_declaration"



	// $ANTLR start "identifier_list"
	// myparser.g:122:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* ;
	public final void identifier_list() throws RecognitionException {
		int identifier_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// myparser.g:123:2: ( IDENTIFIER ( ',' IDENTIFIER )* )
			// myparser.g:123:4: IDENTIFIER ( ',' IDENTIFIER )*
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list620); if (state.failed) return;
			// myparser.g:123:15: ( ',' IDENTIFIER )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==56) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// myparser.g:123:16: ',' IDENTIFIER
					{
					match(input,56,FOLLOW_56_in_identifier_list623); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list625); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

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
	}
	// $ANTLR end "identifier_list"



	// $ANTLR start "abstract_declarator"
	// myparser.g:127:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );
	public final void abstract_declarator() throws RecognitionException {
		int abstract_declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// myparser.g:128:2: ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator )
			int alt25=2;
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
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// myparser.g:128:4: pointer ( direct_abstract_declarator )?
					{
					pushFollow(FOLLOW_pointer_in_abstract_declarator641);
					pointer();
					state._fsp--;
					if (state.failed) return;
					// myparser.g:128:12: ( direct_abstract_declarator )?
					int alt24=2;
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
					switch (alt24) {
						case 1 :
							// myparser.g:128:12: direct_abstract_declarator
							{
							pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator643);
							direct_abstract_declarator();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator: pointer direct_abstract_declarator?"); }
					}
					break;
				case 2 :
					// myparser.g:129:4: direct_abstract_declarator
					{
					pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator651);
					direct_abstract_declarator();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "abstract_declarator"



	// $ANTLR start "direct_abstract_declarator"
	// myparser.g:132:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* ;
	public final void direct_abstract_declarator() throws RecognitionException {
		int direct_abstract_declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// myparser.g:133:2: ( ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* )
			// myparser.g:133:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )*
			{
			// myparser.g:133:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )
			int alt26=2;
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
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// myparser.g:133:6: '(' abstract_declarator ')'
					{
					match(input,48,FOLLOW_48_in_direct_abstract_declarator666); if (state.failed) return;
					pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator668);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_direct_abstract_declarator670); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:133:36: abstract_declarator_suffix
					{
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator674);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// myparser.g:133:65: ( abstract_declarator_suffix )*
			loop27:
			while (true) {
				int alt27=2;
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

				switch (alt27) {
				case 1 :
					// myparser.g:133:65: abstract_declarator_suffix
					{
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator678);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop27;
				}
			}

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
	}
	// $ANTLR end "direct_abstract_declarator"



	// $ANTLR start "abstract_declarator_suffix"
	// myparser.g:137:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );
	public final void abstract_declarator_suffix() throws RecognitionException {
		int abstract_declarator_suffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// myparser.g:138:2: ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' )
			int alt28=4;
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
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// myparser.g:138:4: '[' ']'
					{
					match(input,78,FOLLOW_78_in_abstract_declarator_suffix693); if (state.failed) return;
					match(input,79,FOLLOW_79_in_abstract_declarator_suffix695); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' ']'"); }
					}
					break;
				case 2 :
					// myparser.g:139:4: '[' constant_expression ']'
					{
					match(input,78,FOLLOW_78_in_abstract_declarator_suffix702); if (state.failed) return;
					pushFollow(FOLLOW_constant_expression_in_abstract_declarator_suffix704);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,79,FOLLOW_79_in_abstract_declarator_suffix706); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' constant_expression ']'"); }
					}
					break;
				case 3 :
					// myparser.g:140:4: '(' ')'
					{
					match(input,48,FOLLOW_48_in_abstract_declarator_suffix713); if (state.failed) return;
					match(input,49,FOLLOW_49_in_abstract_declarator_suffix715); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("abstract_declarator_suffix: '(' ')'"); }
					}
					break;
				case 4 :
					// myparser.g:141:4: '(' parameter_type_list ')'
					{
					match(input,48,FOLLOW_48_in_abstract_declarator_suffix722); if (state.failed) return;
					pushFollow(FOLLOW_parameter_type_list_in_abstract_declarator_suffix724);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_abstract_declarator_suffix726); if (state.failed) return;
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
	}
	// $ANTLR end "abstract_declarator_suffix"



	// $ANTLR start "initializer"
	// myparser.g:145:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' );
	public final void initializer() throws RecognitionException {
		int initializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// myparser.g:146:2: ( assignment_expression | '{' initializer_list ( ',' )? '}' )
			int alt30=2;
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
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// myparser.g:146:4: assignment_expression
					{
					pushFollow(FOLLOW_assignment_expression_in_initializer740);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("initializer: assignment_expression"); }
					}
					break;
				case 2 :
					// myparser.g:147:4: '{' initializer_list ( ',' )? '}'
					{
					match(input,85,FOLLOW_85_in_initializer747); if (state.failed) return;
					pushFollow(FOLLOW_initializer_list_in_initializer749);
					initializer_list();
					state._fsp--;
					if (state.failed) return;
					// myparser.g:147:25: ( ',' )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==56) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// myparser.g:147:25: ','
							{
							match(input,56,FOLLOW_56_in_initializer751); if (state.failed) return;
							}
							break;

					}

					match(input,89,FOLLOW_89_in_initializer754); if (state.failed) return;
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
	}
	// $ANTLR end "initializer"



	// $ANTLR start "initializer_list"
	// myparser.g:151:1: initializer_list : initializer ( ',' initializer )* ;
	public final void initializer_list() throws RecognitionException {
		int initializer_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// myparser.g:152:2: ( initializer ( ',' initializer )* )
			// myparser.g:152:4: initializer ( ',' initializer )*
			{
			pushFollow(FOLLOW_initializer_in_initializer_list768);
			initializer();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:152:16: ( ',' initializer )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==56) ) {
					int LA31_1 = input.LA(2);
					if ( (LA31_1==CHARACTER_LITERAL||LA31_1==DECIMAL_LITERAL||LA31_1==FLOATING_POINT_LITERAL||LA31_1==IDENTIFIER||LA31_1==STRING_LITERAL||LA31_1==41||LA31_1==46||LA31_1==48||LA31_1==50||(LA31_1 >= 53 && LA31_1 <= 54)||(LA31_1 >= 57 && LA31_1 <= 58)||(LA31_1 >= 84 && LA31_1 <= 85)||LA31_1==90) ) {
						alt31=1;
					}

				}

				switch (alt31) {
				case 1 :
					// myparser.g:152:17: ',' initializer
					{
					match(input,56,FOLLOW_56_in_initializer_list771); if (state.failed) return;
					pushFollow(FOLLOW_initializer_in_initializer_list773);
					initializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop31;
				}
			}

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
	}
	// $ANTLR end "initializer_list"



	// $ANTLR start "argument_expression_list"
	// myparser.g:159:1: argument_expression_list : assignment_expression ( ',' assignment_expression )* ;
	public final void argument_expression_list() throws RecognitionException {
		int argument_expression_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// myparser.g:160:2: ( assignment_expression ( ',' assignment_expression )* )
			// myparser.g:160:4: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_argument_expression_list792);
			assignment_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:160:26: ( ',' assignment_expression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==56) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// myparser.g:160:27: ',' assignment_expression
					{
					match(input,56,FOLLOW_56_in_argument_expression_list795); if (state.failed) return;
					pushFollow(FOLLOW_assignment_expression_in_argument_expression_list797);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop32;
				}
			}

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
	}
	// $ANTLR end "argument_expression_list"



	// $ANTLR start "additive_expression"
	// myparser.g:164:1: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
	public final void additive_expression() throws RecognitionException {
		int additive_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// myparser.g:165:2: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
			// myparser.g:165:4: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
			{
			// myparser.g:165:4: ( multiplicative_expression )
			// myparser.g:165:5: multiplicative_expression
			{
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression814);
			multiplicative_expression();
			state._fsp--;
			if (state.failed) return;
			}

			// myparser.g:165:32: ( '+' multiplicative_expression | '-' multiplicative_expression )*
			loop33:
			while (true) {
				int alt33=3;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==53) ) {
					alt33=1;
				}
				else if ( (LA33_0==57) ) {
					alt33=2;
				}

				switch (alt33) {
				case 1 :
					// myparser.g:165:33: '+' multiplicative_expression
					{
					match(input,53,FOLLOW_53_in_additive_expression818); if (state.failed) return;
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression820);
					multiplicative_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:165:65: '-' multiplicative_expression
					{
					match(input,57,FOLLOW_57_in_additive_expression824); if (state.failed) return;
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression826);
					multiplicative_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop33;
				}
			}

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
	}
	// $ANTLR end "additive_expression"



	// $ANTLR start "multiplicative_expression"
	// myparser.g:169:1: multiplicative_expression : ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* ;
	public final void multiplicative_expression() throws RecognitionException {
		int multiplicative_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// myparser.g:170:2: ( ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* )
			// myparser.g:170:4: ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
			{
			// myparser.g:170:4: ( cast_expression )
			// myparser.g:170:5: cast_expression
			{
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression844);
			cast_expression();
			state._fsp--;
			if (state.failed) return;
			}

			// myparser.g:170:22: ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
			loop34:
			while (true) {
				int alt34=4;
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
				switch (alt34) {
				case 1 :
					// myparser.g:170:23: '*' cast_expression
					{
					match(input,50,FOLLOW_50_in_multiplicative_expression848); if (state.failed) return;
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression850);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:170:45: '/' cast_expression
					{
					match(input,63,FOLLOW_63_in_multiplicative_expression854); if (state.failed) return;
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression856);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:170:67: '%' cast_expression
					{
					match(input,43,FOLLOW_43_in_multiplicative_expression860); if (state.failed) return;
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression862);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}

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
	}
	// $ANTLR end "multiplicative_expression"



	// $ANTLR start "cast_expression"
	// myparser.g:175:1: cast_expression : ( '(' type_name ')' cast_expression | unary_expression );
	public final void cast_expression() throws RecognitionException {
		int cast_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// myparser.g:176:2: ( '(' type_name ')' cast_expression | unary_expression )
			int alt35=2;
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
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// myparser.g:176:4: '(' type_name ')' cast_expression
					{
					match(input,48,FOLLOW_48_in_cast_expression879); if (state.failed) return;
					pushFollow(FOLLOW_type_name_in_cast_expression881);
					type_name();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_cast_expression883); if (state.failed) return;
					pushFollow(FOLLOW_cast_expression_in_cast_expression885);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("cast_expression: '(' type_name ')' cast_expression"); }
					}
					break;
				case 2 :
					// myparser.g:177:4: unary_expression
					{
					pushFollow(FOLLOW_unary_expression_in_cast_expression892);
					unary_expression();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "cast_expression"



	// $ANTLR start "unary_expression"
	// myparser.g:181:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );
	public final void unary_expression() throws RecognitionException {
		int unary_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// myparser.g:182:2: ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' )
			int alt36=6;
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
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// myparser.g:182:4: postfix_expression
					{
					pushFollow(FOLLOW_postfix_expression_in_unary_expression906);
					postfix_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: postfix_expression"); }
					}
					break;
				case 2 :
					// myparser.g:183:4: '++' unary_expression
					{
					match(input,54,FOLLOW_54_in_unary_expression913); if (state.failed) return;
					pushFollow(FOLLOW_unary_expression_in_unary_expression915);
					unary_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: '++' unary_expression"); }
					}
					break;
				case 3 :
					// myparser.g:184:4: '--' unary_expression
					{
					match(input,58,FOLLOW_58_in_unary_expression922); if (state.failed) return;
					pushFollow(FOLLOW_unary_expression_in_unary_expression924);
					unary_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: '--' unary_expression"); }
					}
					break;
				case 4 :
					// myparser.g:185:4: unary_operator cast_expression
					{
					pushFollow(FOLLOW_unary_operator_in_unary_expression931);
					unary_operator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_cast_expression_in_unary_expression933);
					cast_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: unary_operator cast_expression"); }
					}
					break;
				case 5 :
					// myparser.g:186:4: 'sizeof' unary_expression
					{
					match(input,84,FOLLOW_84_in_unary_expression940); if (state.failed) return;
					pushFollow(FOLLOW_unary_expression_in_unary_expression942);
					unary_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_expression: 'sizeof' unary_expression"); }
					}
					break;
				case 6 :
					// myparser.g:187:4: 'sizeof' '(' type_name ')'
					{
					match(input,84,FOLLOW_84_in_unary_expression949); if (state.failed) return;
					match(input,48,FOLLOW_48_in_unary_expression951); if (state.failed) return;
					pushFollow(FOLLOW_type_name_in_unary_expression953);
					type_name();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_unary_expression955); if (state.failed) return;
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
	}
	// $ANTLR end "unary_expression"



	// $ANTLR start "postfix_expression"
	// myparser.g:191:1: postfix_expression : primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* ;
	public final void postfix_expression() throws RecognitionException {
		int postfix_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// myparser.g:192:2: ( primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* )
			// myparser.g:193:5: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			{
			pushFollow(FOLLOW_primary_expression_in_postfix_expression976);
			primary_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:194:5: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			loop37:
			while (true) {
				int alt37=8;
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
				switch (alt37) {
				case 1 :
					// myparser.g:194:7: '[' expression ']'
					{
					match(input,78,FOLLOW_78_in_postfix_expression984); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_postfix_expression986);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,79,FOLLOW_79_in_postfix_expression988); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:195:7: '(' ')'
					{
					match(input,48,FOLLOW_48_in_postfix_expression996); if (state.failed) return;
					match(input,49,FOLLOW_49_in_postfix_expression998); if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:196:7: '(' argument_expression_list ')'
					{
					match(input,48,FOLLOW_48_in_postfix_expression1006); if (state.failed) return;
					pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1008);
					argument_expression_list();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_postfix_expression1010); if (state.failed) return;
					}
					break;
				case 4 :
					// myparser.g:197:9: '.' IDENTIFIER
					{
					match(input,61,FOLLOW_61_in_postfix_expression1020); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1022); if (state.failed) return;
					}
					break;
				case 5 :
					// myparser.g:198:9: '->' IDENTIFIER
					{
					match(input,60,FOLLOW_60_in_postfix_expression1032); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1034); if (state.failed) return;
					}
					break;
				case 6 :
					// myparser.g:199:7: '++'
					{
					match(input,54,FOLLOW_54_in_postfix_expression1042); if (state.failed) return;
					}
					break;
				case 7 :
					// myparser.g:200:7: '--'
					{
					match(input,58,FOLLOW_58_in_postfix_expression1050); if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}

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
	}
	// $ANTLR end "postfix_expression"



	// $ANTLR start "unary_operator"
	// myparser.g:205:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final void unary_operator() throws RecognitionException {
		int unary_operator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// myparser.g:206:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
			int alt38=6;
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
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// myparser.g:206:4: '&'
					{
					match(input,46,FOLLOW_46_in_unary_operator1071); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '&'"); }
					}
					break;
				case 2 :
					// myparser.g:207:4: '*'
					{
					match(input,50,FOLLOW_50_in_unary_operator1078); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '*'"); }
					}
					break;
				case 3 :
					// myparser.g:208:4: '+'
					{
					match(input,53,FOLLOW_53_in_unary_operator1085); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '+'"); }
					}
					break;
				case 4 :
					// myparser.g:209:4: '-'
					{
					match(input,57,FOLLOW_57_in_unary_operator1092); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '-'"); }
					}
					break;
				case 5 :
					// myparser.g:210:4: '~'
					{
					match(input,90,FOLLOW_90_in_unary_operator1099); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("unary_operator: '~'"); }
					}
					break;
				case 6 :
					// myparser.g:211:4: '!'
					{
					match(input,41,FOLLOW_41_in_unary_operator1106); if (state.failed) return;
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
	}
	// $ANTLR end "unary_operator"



	// $ANTLR start "primary_expression"
	// myparser.g:215:1: primary_expression : ( IDENTIFIER | constant | '(' expression ')' );
	public final void primary_expression() throws RecognitionException {
		int primary_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// myparser.g:216:2: ( IDENTIFIER | constant | '(' expression ')' )
			int alt39=3;
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
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// myparser.g:216:4: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1120); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("primary_expression: IDENTIFIER"); }
					}
					break;
				case 2 :
					// myparser.g:217:4: constant
					{
					pushFollow(FOLLOW_constant_in_primary_expression1127);
					constant();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("primary_expression: constant"); }
					}
					break;
				case 3 :
					// myparser.g:218:4: '(' expression ')'
					{
					match(input,48,FOLLOW_48_in_primary_expression1134); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_primary_expression1136);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_primary_expression1138); if (state.failed) return;
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
	}
	// $ANTLR end "primary_expression"



	// $ANTLR start "constant"
	// myparser.g:221:1: constant : ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
	public final void constant() throws RecognitionException {
		int constant_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// myparser.g:222:5: ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
			int alt40=4;
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
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// myparser.g:222:9: DECIMAL_LITERAL
					{
					match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_constant1156); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: DECIMAL_LITERAL"); }
					}
					break;
				case 2 :
					// myparser.g:223:7: CHARACTER_LITERAL
					{
					match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_constant1166); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: CHARACTER_LITERAL"); }
					}
					break;
				case 3 :
					// myparser.g:224:4: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant1173); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("constant: STRING_LITERAL"); }
					}
					break;
				case 4 :
					// myparser.g:225:9: FLOATING_POINT_LITERAL
					{
					match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_constant1185); if (state.failed) return;
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
	}
	// $ANTLR end "constant"



	// $ANTLR start "expression"
	// myparser.g:229:1: expression : assignment_expression ( ',' assignment_expression )* ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// myparser.g:230:2: ( assignment_expression ( ',' assignment_expression )* )
			// myparser.g:230:4: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_expression1202);
			assignment_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:230:26: ( ',' assignment_expression )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==56) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// myparser.g:230:27: ',' assignment_expression
					{
					match(input,56,FOLLOW_56_in_expression1205); if (state.failed) return;
					pushFollow(FOLLOW_assignment_expression_in_expression1207);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop41;
				}
			}

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
	}
	// $ANTLR end "expression"



	// $ANTLR start "constant_expression"
	// myparser.g:234:1: constant_expression : conditional_expression ;
	public final void constant_expression() throws RecognitionException {
		int constant_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// myparser.g:235:2: ( conditional_expression )
			// myparser.g:235:4: conditional_expression
			{
			pushFollow(FOLLOW_conditional_expression_in_constant_expression1223);
			conditional_expression();
			state._fsp--;
			if (state.failed) return;
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
	}
	// $ANTLR end "constant_expression"



	// $ANTLR start "assignment_expression"
	// myparser.g:239:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );
	public final void assignment_expression() throws RecognitionException {
		int assignment_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return; }

			// myparser.g:240:2: ( lvalue assignment_operator assignment_expression | conditional_expression )
			int alt42=2;
			alt42 = dfa42.predict(input);
			switch (alt42) {
				case 1 :
					// myparser.g:240:4: lvalue assignment_operator assignment_expression
					{
					pushFollow(FOLLOW_lvalue_in_assignment_expression1237);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1239);
					assignment_operator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1241);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_expression: lvalue assignment_operator assignment_expression"); }
					}
					break;
				case 2 :
					// myparser.g:241:4: conditional_expression
					{
					pushFollow(FOLLOW_conditional_expression_in_assignment_expression1248);
					conditional_expression();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "assignment_expression"



	// $ANTLR start "lvalue"
	// myparser.g:244:1: lvalue : unary_expression ;
	public final void lvalue() throws RecognitionException {
		int lvalue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return; }

			// myparser.g:245:2: ( unary_expression )
			// myparser.g:245:4: unary_expression
			{
			pushFollow(FOLLOW_unary_expression_in_lvalue1261);
			unary_expression();
			state._fsp--;
			if (state.failed) return;
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
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "assignment_operator"
	// myparser.g:248:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final void assignment_operator() throws RecognitionException {
		int assignment_operator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// myparser.g:249:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			int alt43=11;
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
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// myparser.g:249:4: '='
					{
					match(input,71,FOLLOW_71_in_assignment_operator1274); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '='"); }
					}
					break;
				case 2 :
					// myparser.g:250:4: '*='
					{
					match(input,52,FOLLOW_52_in_assignment_operator1281); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '*='"); }
					}
					break;
				case 3 :
					// myparser.g:251:4: '/='
					{
					match(input,64,FOLLOW_64_in_assignment_operator1288); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '/='"); }
					}
					break;
				case 4 :
					// myparser.g:252:4: '%='
					{
					match(input,44,FOLLOW_44_in_assignment_operator1295); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '%='"); }
					}
					break;
				case 5 :
					// myparser.g:253:4: '+='
					{
					match(input,55,FOLLOW_55_in_assignment_operator1302); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '+='"); }
					}
					break;
				case 6 :
					// myparser.g:254:4: '-='
					{
					match(input,59,FOLLOW_59_in_assignment_operator1309); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '-='"); }
					}
					break;
				case 7 :
					// myparser.g:255:4: '<<='
					{
					match(input,69,FOLLOW_69_in_assignment_operator1316); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '<<='"); }
					}
					break;
				case 8 :
					// myparser.g:256:4: '>>='
					{
					match(input,76,FOLLOW_76_in_assignment_operator1323); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '>>='"); }
					}
					break;
				case 9 :
					// myparser.g:257:4: '&='
					{
					match(input,47,FOLLOW_47_in_assignment_operator1330); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '&='"); }
					}
					break;
				case 10 :
					// myparser.g:258:4: '^='
					{
					match(input,81,FOLLOW_81_in_assignment_operator1337); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("assignment_operator: '^='"); }
					}
					break;
				case 11 :
					// myparser.g:259:4: '|='
					{
					match(input,87,FOLLOW_87_in_assignment_operator1344); if (state.failed) return;
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
	}
	// $ANTLR end "assignment_operator"



	// $ANTLR start "conditional_expression"
	// myparser.g:262:1: conditional_expression : logical_or_expression ( '?' expression ':' conditional_expression )? ;
	public final void conditional_expression() throws RecognitionException {
		int conditional_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return; }

			// myparser.g:263:2: ( logical_or_expression ( '?' expression ':' conditional_expression )? )
			// myparser.g:263:4: logical_or_expression ( '?' expression ':' conditional_expression )?
			{
			pushFollow(FOLLOW_logical_or_expression_in_conditional_expression1361);
			logical_or_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:263:26: ( '?' expression ':' conditional_expression )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==77) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// myparser.g:263:27: '?' expression ':' conditional_expression
					{
					match(input,77,FOLLOW_77_in_conditional_expression1364); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditional_expression1366);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,65,FOLLOW_65_in_conditional_expression1368); if (state.failed) return;
					pushFollow(FOLLOW_conditional_expression_in_conditional_expression1370);
					conditional_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

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
	}
	// $ANTLR end "conditional_expression"



	// $ANTLR start "logical_or_expression"
	// myparser.g:267:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
	public final void logical_or_expression() throws RecognitionException {
		int logical_or_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// myparser.g:268:2: ( logical_and_expression ( '||' logical_and_expression )* )
			// myparser.g:268:4: logical_and_expression ( '||' logical_and_expression )*
			{
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1386);
			logical_and_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:268:27: ( '||' logical_and_expression )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==88) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// myparser.g:268:28: '||' logical_and_expression
					{
					match(input,88,FOLLOW_88_in_logical_or_expression1389); if (state.failed) return;
					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1391);
					logical_and_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop45;
				}
			}

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
	}
	// $ANTLR end "logical_or_expression"



	// $ANTLR start "logical_and_expression"
	// myparser.g:271:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
	public final void logical_and_expression() throws RecognitionException {
		int logical_and_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return; }

			// myparser.g:272:2: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
			// myparser.g:272:4: inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1406);
			inclusive_or_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:272:28: ( '&&' inclusive_or_expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==45) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// myparser.g:272:29: '&&' inclusive_or_expression
					{
					match(input,45,FOLLOW_45_in_logical_and_expression1409); if (state.failed) return;
					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1411);
					inclusive_or_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop46;
				}
			}

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
	}
	// $ANTLR end "logical_and_expression"



	// $ANTLR start "inclusive_or_expression"
	// myparser.g:275:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
	public final void inclusive_or_expression() throws RecognitionException {
		int inclusive_or_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return; }

			// myparser.g:276:2: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
			// myparser.g:276:4: exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1426);
			exclusive_or_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:276:28: ( '|' exclusive_or_expression )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==86) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// myparser.g:276:29: '|' exclusive_or_expression
					{
					match(input,86,FOLLOW_86_in_inclusive_or_expression1429); if (state.failed) return;
					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1431);
					exclusive_or_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop47;
				}
			}

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
	}
	// $ANTLR end "inclusive_or_expression"



	// $ANTLR start "exclusive_or_expression"
	// myparser.g:279:1: exclusive_or_expression : and_expression ( '^' and_expression )* ;
	public final void exclusive_or_expression() throws RecognitionException {
		int exclusive_or_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return; }

			// myparser.g:280:2: ( and_expression ( '^' and_expression )* )
			// myparser.g:280:4: and_expression ( '^' and_expression )*
			{
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1446);
			and_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:280:19: ( '^' and_expression )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==80) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// myparser.g:280:20: '^' and_expression
					{
					match(input,80,FOLLOW_80_in_exclusive_or_expression1449); if (state.failed) return;
					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1451);
					and_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop48;
				}
			}

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
	}
	// $ANTLR end "exclusive_or_expression"



	// $ANTLR start "and_expression"
	// myparser.g:283:1: and_expression : equality_expression ( '&' equality_expression )* ;
	public final void and_expression() throws RecognitionException {
		int and_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// myparser.g:284:2: ( equality_expression ( '&' equality_expression )* )
			// myparser.g:284:4: equality_expression ( '&' equality_expression )*
			{
			pushFollow(FOLLOW_equality_expression_in_and_expression1466);
			equality_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:284:24: ( '&' equality_expression )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==46) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// myparser.g:284:25: '&' equality_expression
					{
					match(input,46,FOLLOW_46_in_and_expression1469); if (state.failed) return;
					pushFollow(FOLLOW_equality_expression_in_and_expression1471);
					equality_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

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
	}
	// $ANTLR end "and_expression"



	// $ANTLR start "equality_expression"
	// myparser.g:287:1: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
	public final void equality_expression() throws RecognitionException {
		int equality_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// myparser.g:288:2: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
			// myparser.g:288:4: relational_expression ( ( '==' | '!=' ) relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression1486);
			relational_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:288:26: ( ( '==' | '!=' ) relational_expression )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==42||LA50_0==72) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// myparser.g:288:27: ( '==' | '!=' ) relational_expression
					{
					if ( input.LA(1)==42||input.LA(1)==72 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relational_expression_in_equality_expression1495);
					relational_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop50;
				}
			}

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
	}
	// $ANTLR end "equality_expression"



	// $ANTLR start "relational_expression"
	// myparser.g:291:1: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
	public final void relational_expression() throws RecognitionException {
		int relational_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// myparser.g:292:2: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
			// myparser.g:292:4: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			{
			pushFollow(FOLLOW_shift_expression_in_relational_expression1510);
			shift_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:292:21: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==67||LA51_0==70||(LA51_0 >= 73 && LA51_0 <= 74)) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// myparser.g:292:22: ( '<' | '>' | '<=' | '>=' ) shift_expression
					{
					if ( input.LA(1)==67||input.LA(1)==70||(input.LA(1) >= 73 && input.LA(1) <= 74) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_shift_expression_in_relational_expression1523);
					shift_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop51;
				}
			}

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
	}
	// $ANTLR end "relational_expression"



	// $ANTLR start "shift_expression"
	// myparser.g:295:1: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
	public final void shift_expression() throws RecognitionException {
		int shift_expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// myparser.g:296:2: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
			// myparser.g:296:4: additive_expression ( ( '<<' | '>>' ) additive_expression )*
			{
			pushFollow(FOLLOW_additive_expression_in_shift_expression1538);
			additive_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:296:24: ( ( '<<' | '>>' ) additive_expression )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==68||LA52_0==75) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// myparser.g:296:25: ( '<<' | '>>' ) additive_expression
					{
					if ( input.LA(1)==68||input.LA(1)==75 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additive_expression_in_shift_expression1547);
					additive_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop52;
				}
			}

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
	}
	// $ANTLR end "shift_expression"



	// $ANTLR start "statement"
	// myparser.g:301:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// myparser.g:302:5: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement )
			int alt53=6;
			alt53 = dfa53.predict(input);
			switch (alt53) {
				case 1 :
					// myparser.g:302:7: labeled_statement
					{
					pushFollow(FOLLOW_labeled_statement_in_statement1567);
					labeled_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: labeled_statement;"); }
					}
					break;
				case 2 :
					// myparser.g:303:7: compound_statement
					{
					pushFollow(FOLLOW_compound_statement_in_statement1577);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: compound_statement"); }
					}
					break;
				case 3 :
					// myparser.g:304:7: expression_statement
					{
					pushFollow(FOLLOW_expression_statement_in_statement1587);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: compound_statement"); }
					}
					break;
				case 4 :
					// myparser.g:305:7: selection_statement
					{
					pushFollow(FOLLOW_selection_statement_in_statement1597);
					selection_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: selection_statement"); }
					}
					break;
				case 5 :
					// myparser.g:306:7: iteration_statement
					{
					pushFollow(FOLLOW_iteration_statement_in_statement1607);
					iteration_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("statement: iteration_statement"); }
					}
					break;
				case 6 :
					// myparser.g:307:4: jump_statement
					{
					pushFollow(FOLLOW_jump_statement_in_statement1614);
					jump_statement();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "statement"



	// $ANTLR start "labeled_statement"
	// myparser.g:311:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );
	public final void labeled_statement() throws RecognitionException {
		int labeled_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// myparser.g:312:2: ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement )
			int alt54=3;
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
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// myparser.g:312:4: IDENTIFIER ':' statement
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_labeled_statement1631); if (state.failed) return;
					match(input,65,FOLLOW_65_in_labeled_statement1633); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement1635);
					statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("labeled_statement: IDENTIFIER ':' statement"); }
					}
					break;
				case 2 :
					// myparser.g:313:4: 'case' constant_expression ':' statement
					{
					match(input,82,FOLLOW_82_in_labeled_statement1642); if (state.failed) return;
					pushFollow(FOLLOW_constant_expression_in_labeled_statement1644);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,65,FOLLOW_65_in_labeled_statement1646); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement1648);
					statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("labeled_statement: 'case' constant_expression ':' statement"); }
					}
					break;
				case 3 :
					// myparser.g:314:4: 'default' ':' statement
					{
					match(input,83,FOLLOW_83_in_labeled_statement1655); if (state.failed) return;
					match(input,65,FOLLOW_65_in_labeled_statement1657); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement1659);
					statement();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "labeled_statement"



	// $ANTLR start "compound_statement"
	// myparser.g:318:1: compound_statement : '{' ( declaration )* ( statement_list )? '}' ;
	public final void compound_statement() throws RecognitionException {
		int compound_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// myparser.g:319:5: ( '{' ( declaration )* ( statement_list )? '}' )
			// myparser.g:319:7: '{' ( declaration )* ( statement_list )? '}'
			{
			match(input,85,FOLLOW_85_in_compound_statement1676); if (state.failed) return;
			// myparser.g:319:11: ( declaration )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==AUTO||LA55_0==CHAR||LA55_0==CONST||LA55_0==DOUBLE||LA55_0==EXTERN||LA55_0==FLOAT||LA55_0==INT||LA55_0==LONG||LA55_0==REGISTER||(LA55_0 >= SHORT && LA55_0 <= STATIC)||(LA55_0 >= UNSIGNED && LA55_0 <= VOLATILE)) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// myparser.g:319:11: declaration
					{
					pushFollow(FOLLOW_declaration_in_compound_statement1678);
					declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop55;
				}
			}

			// myparser.g:319:24: ( statement_list )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==BREAK||LA56_0==CHARACTER_LITERAL||(LA56_0 >= CONTINUE && LA56_0 <= DO)||(LA56_0 >= FLOATING_POINT_LITERAL && LA56_0 <= IF)||LA56_0==RETURN||(LA56_0 >= STRING_LITERAL && LA56_0 <= SWITCH)||LA56_0==WHILE||LA56_0==41||LA56_0==46||LA56_0==48||LA56_0==50||(LA56_0 >= 53 && LA56_0 <= 54)||(LA56_0 >= 57 && LA56_0 <= 58)||LA56_0==66||(LA56_0 >= 82 && LA56_0 <= 85)||LA56_0==90) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// myparser.g:319:24: statement_list
					{
					pushFollow(FOLLOW_statement_list_in_compound_statement1681);
					statement_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,89,FOLLOW_89_in_compound_statement1684); if (state.failed) return;
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
	}
	// $ANTLR end "compound_statement"



	// $ANTLR start "statement_list"
	// myparser.g:323:1: statement_list : ( statement )+ ;
	public final void statement_list() throws RecognitionException {
		int statement_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// myparser.g:324:2: ( ( statement )+ )
			// myparser.g:324:4: ( statement )+
			{
			// myparser.g:324:4: ( statement )+
			int cnt57=0;
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==BREAK||LA57_0==CHARACTER_LITERAL||(LA57_0 >= CONTINUE && LA57_0 <= DO)||(LA57_0 >= FLOATING_POINT_LITERAL && LA57_0 <= IF)||LA57_0==RETURN||(LA57_0 >= STRING_LITERAL && LA57_0 <= SWITCH)||LA57_0==WHILE||LA57_0==41||LA57_0==46||LA57_0==48||LA57_0==50||(LA57_0 >= 53 && LA57_0 <= 54)||(LA57_0 >= 57 && LA57_0 <= 58)||LA57_0==66||(LA57_0 >= 82 && LA57_0 <= 85)||LA57_0==90) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// myparser.g:324:4: statement
					{
					pushFollow(FOLLOW_statement_in_statement_list1701);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(57, input);
					throw eee;
				}
				cnt57++;
			}

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
	}
	// $ANTLR end "statement_list"



	// $ANTLR start "expression_statement"
	// myparser.g:327:1: expression_statement : ( ';' | expression ';' );
	public final void expression_statement() throws RecognitionException {
		int expression_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return; }

			// myparser.g:328:2: ( ';' | expression ';' )
			int alt58=2;
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
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// myparser.g:328:4: ';'
					{
					match(input,66,FOLLOW_66_in_expression_statement1715); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("expression_statement: ';'"); }
					}
					break;
				case 2 :
					// myparser.g:329:4: expression ';'
					{
					pushFollow(FOLLOW_expression_in_expression_statement1722);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,66,FOLLOW_66_in_expression_statement1724); if (state.failed) return;
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
	}
	// $ANTLR end "expression_statement"



	// $ANTLR start "selection_statement"
	// myparser.g:333:1: selection_statement : ( IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? | SWITCH '(' expression ')' statement );
	public final void selection_statement() throws RecognitionException {
		int selection_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// myparser.g:334:2: ( IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )? | SWITCH '(' expression ')' statement )
			int alt60=2;
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
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// myparser.g:334:4: IF '(' expression ')' statement ( options {k=1; backtrack=false; } : ELSE statement )?
					{
					match(input,IF,FOLLOW_IF_in_selection_statement1738); if (state.failed) return;
					match(input,48,FOLLOW_48_in_selection_statement1740); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selection_statement1742);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_selection_statement1744); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_selection_statement1746);
					statement();
					state._fsp--;
					if (state.failed) return;
					// myparser.g:334:36: ( options {k=1; backtrack=false; } : ELSE statement )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==ELSE) ) {
						int LA59_1 = input.LA(2);
						if ( (true) ) {
							alt59=1;
						}
					}
					switch (alt59) {
						case 1 :
							// myparser.g:334:69: ELSE statement
							{
							match(input,ELSE,FOLLOW_ELSE_in_selection_statement1761); if (state.failed) return;
							pushFollow(FOLLOW_statement_in_selection_statement1763);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("selection_statement: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?"); }
					}
					break;
				case 2 :
					// myparser.g:336:4: SWITCH '(' expression ')' statement
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_selection_statement1773); if (state.failed) return;
					match(input,48,FOLLOW_48_in_selection_statement1775); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selection_statement1777);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_selection_statement1779); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_selection_statement1781);
					statement();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "selection_statement"



	// $ANTLR start "iteration_statement"
	// myparser.g:341:1: iteration_statement : ( WHILE '(' expression ')' statement | DO statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expression_statement ( expression )? ')' statement );
	public final void iteration_statement() throws RecognitionException {
		int iteration_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// myparser.g:342:5: ( WHILE '(' expression ')' statement | DO statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expression_statement ( expression )? ')' statement )
			int alt62=3;
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
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// myparser.g:342:7: WHILE '(' expression ')' statement
					{
					match(input,WHILE,FOLLOW_WHILE_in_iteration_statement1799); if (state.failed) return;
					match(input,48,FOLLOW_48_in_iteration_statement1801); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_iteration_statement1803);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_iteration_statement1805); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_iteration_statement1807);
					statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("iteration_statement: WHILE '(' expression ')' statement"); }
					}
					break;
				case 2 :
					// myparser.g:343:4: DO statement WHILE '(' expression ')' ';'
					{
					match(input,DO,FOLLOW_DO_in_iteration_statement1814); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_iteration_statement1816);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input,WHILE,FOLLOW_WHILE_in_iteration_statement1818); if (state.failed) return;
					match(input,48,FOLLOW_48_in_iteration_statement1820); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_iteration_statement1822);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_iteration_statement1824); if (state.failed) return;
					match(input,66,FOLLOW_66_in_iteration_statement1826); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("iteration_statement: DO statement WHILE '(' expression ')' ';'"); }
					}
					break;
				case 3 :
					// myparser.g:344:4: FOR '(' expression_statement expression_statement ( expression )? ')' statement
					{
					match(input,FOR,FOLLOW_FOR_in_iteration_statement1833); if (state.failed) return;
					match(input,48,FOLLOW_48_in_iteration_statement1835); if (state.failed) return;
					pushFollow(FOLLOW_expression_statement_in_iteration_statement1837);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expression_statement_in_iteration_statement1839);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					// myparser.g:344:54: ( expression )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==CHARACTER_LITERAL||LA61_0==DECIMAL_LITERAL||LA61_0==FLOATING_POINT_LITERAL||LA61_0==IDENTIFIER||LA61_0==STRING_LITERAL||LA61_0==41||LA61_0==46||LA61_0==48||LA61_0==50||(LA61_0 >= 53 && LA61_0 <= 54)||(LA61_0 >= 57 && LA61_0 <= 58)||LA61_0==84||LA61_0==90) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// myparser.g:344:54: expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1841);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,49,FOLLOW_49_in_iteration_statement1844); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_iteration_statement1846);
					statement();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "iteration_statement"



	// $ANTLR start "jump_statement"
	// myparser.g:349:1: jump_statement : ( GOTO IDENTIFIER ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' );
	public final void jump_statement() throws RecognitionException {
		int jump_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// myparser.g:350:2: ( GOTO IDENTIFIER ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' )
			int alt63=5;
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
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// myparser.g:350:4: GOTO IDENTIFIER ';'
					{
					match(input,GOTO,FOLLOW_GOTO_in_jump_statement1862); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_jump_statement1864); if (state.failed) return;
					match(input,66,FOLLOW_66_in_jump_statement1866); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: GOTO IDENTIFIER ';'"); }
					}
					break;
				case 2 :
					// myparser.g:351:4: CONTINUE ';'
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1873); if (state.failed) return;
					match(input,66,FOLLOW_66_in_jump_statement1875); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: CONTINUE ';'"); }
					}
					break;
				case 3 :
					// myparser.g:352:4: BREAK ';'
					{
					match(input,BREAK,FOLLOW_BREAK_in_jump_statement1882); if (state.failed) return;
					match(input,66,FOLLOW_66_in_jump_statement1884); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: BREAK ';'"); }
					}
					break;
				case 4 :
					// myparser.g:353:4: RETURN ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement1891); if (state.failed) return;
					match(input,66,FOLLOW_66_in_jump_statement1893); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("jump_statement: RETURN ';'"); }
					}
					break;
				case 5 :
					// myparser.g:354:4: RETURN expression ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement1900); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_jump_statement1902);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,66,FOLLOW_66_in_jump_statement1904); if (state.failed) return;
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
	}
	// $ANTLR end "jump_statement"

	// $ANTLR start synpred27_myparser
	public final void synpred27_myparser_fragment() throws RecognitionException {
		// myparser.g:88:4: ( ( pointer )? direct_declarator )
		// myparser.g:88:4: ( pointer )? direct_declarator
		{
		// myparser.g:88:4: ( pointer )?
		int alt64=2;
		int LA64_0 = input.LA(1);
		if ( (LA64_0==50) ) {
			alt64=1;
		}
		switch (alt64) {
			case 1 :
				// myparser.g:88:4: pointer
				{
				pushFollow(FOLLOW_pointer_in_synpred27_myparser401);
				pointer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		pushFollow(FOLLOW_direct_declarator_in_synpred27_myparser404);
		direct_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_myparser

	// $ANTLR start synpred29_myparser
	public final void synpred29_myparser_fragment() throws RecognitionException {
		// myparser.g:94:38: ( declarator_suffix )
		// myparser.g:94:38: declarator_suffix
		{
		pushFollow(FOLLOW_declarator_suffix_in_synpred29_myparser437);
		declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_myparser

	// $ANTLR start synpred35_myparser
	public final void synpred35_myparser_fragment() throws RecognitionException {
		// myparser.g:107:24: ( pointer )
		// myparser.g:107:24: pointer
		{
		pushFollow(FOLLOW_pointer_in_synpred35_myparser532);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred35_myparser

	// $ANTLR start synpred37_myparser
	public final void synpred37_myparser_fragment() throws RecognitionException {
		// myparser.g:108:4: ( '*' pointer )
		// myparser.g:108:4: '*' pointer
		{
		match(input,50,FOLLOW_50_in_synpred37_myparser540); if (state.failed) return;
		pushFollow(FOLLOW_pointer_in_synpred37_myparser542);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred37_myparser

	// $ANTLR start synpred40_myparser
	public final void synpred40_myparser_fragment() throws RecognitionException {
		// myparser.g:119:28: ( declarator )
		// myparser.g:119:28: declarator
		{
		pushFollow(FOLLOW_declarator_in_synpred40_myparser603);
		declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_myparser

	// $ANTLR start synpred41_myparser
	public final void synpred41_myparser_fragment() throws RecognitionException {
		// myparser.g:119:39: ( abstract_declarator )
		// myparser.g:119:39: abstract_declarator
		{
		pushFollow(FOLLOW_abstract_declarator_in_synpred41_myparser605);
		abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred41_myparser

	// $ANTLR start synpred43_myparser
	public final void synpred43_myparser_fragment() throws RecognitionException {
		// myparser.g:128:12: ( direct_abstract_declarator )
		// myparser.g:128:12: direct_abstract_declarator
		{
		pushFollow(FOLLOW_direct_abstract_declarator_in_synpred43_myparser643);
		direct_abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_myparser

	// $ANTLR start synpred46_myparser
	public final void synpred46_myparser_fragment() throws RecognitionException {
		// myparser.g:133:65: ( abstract_declarator_suffix )
		// myparser.g:133:65: abstract_declarator_suffix
		{
		pushFollow(FOLLOW_abstract_declarator_suffix_in_synpred46_myparser678);
		abstract_declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred46_myparser

	// $ANTLR start synpred64_myparser
	public final void synpred64_myparser_fragment() throws RecognitionException {
		// myparser.g:186:4: ( 'sizeof' unary_expression )
		// myparser.g:186:4: 'sizeof' unary_expression
		{
		match(input,84,FOLLOW_84_in_synpred64_myparser940); if (state.failed) return;
		pushFollow(FOLLOW_unary_expression_in_synpred64_myparser942);
		unary_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred64_myparser

	// $ANTLR start synpred83_myparser
	public final void synpred83_myparser_fragment() throws RecognitionException {
		// myparser.g:240:4: ( lvalue assignment_operator assignment_expression )
		// myparser.g:240:4: lvalue assignment_operator assignment_expression
		{
		pushFollow(FOLLOW_lvalue_in_synpred83_myparser1237);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_assignment_operator_in_synpred83_myparser1239);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_assignment_expression_in_synpred83_myparser1241);
		assignment_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_myparser

	// Delegated rules

	public final boolean synpred64_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred64_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred35_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred35_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred46_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
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
			return "239:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );";
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
			return "301:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );";
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
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list170 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_init_declarator_list173 = new BitSet(new long[]{0x0005000000200000L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list175 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_declarator_in_init_declarator191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_init_declarator194 = new BitSet(new long[]{0x0665420400240880L,0x0000000004300000L});
	public static final BitSet FOLLOW_initializer_in_init_declarator196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers213 = new BitSet(new long[]{0x00000073A882A252L});
	public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers217 = new BitSet(new long[]{0x00000073A882A252L});
	public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers221 = new BitSet(new long[]{0x00000073A882A252L});
	public static final BitSet FOLLOW_CONST_in_type_qualifier238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_type_qualifier245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTERN_in_storage_class_specifier258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_storage_class_specifier265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTO_in_storage_class_specifier272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_storage_class_specifier279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name293 = new BitSet(new long[]{0x0005000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_in_type_name295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list311 = new BitSet(new long[]{0x0000007188822242L});
	public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list315 = new BitSet(new long[]{0x0000007188822242L});
	public static final BitSet FOLLOW_VOID_in_type_specifier331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type_specifier338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type_specifier345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type_specifier352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_type_specifier359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type_specifier366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type_specifier373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNED_in_type_specifier380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_in_type_specifier387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator401 = new BitSet(new long[]{0x0001000000200000L});
	public static final BitSet FOLLOW_direct_declarator_in_declarator404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_direct_declarator426 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_48_in_direct_declarator430 = new BitSet(new long[]{0x0005000000200000L});
	public static final BitSet FOLLOW_declarator_in_direct_declarator432 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_direct_declarator434 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_suffix_in_direct_declarator437 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_declarator_suffix452 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_constant_expression_in_declarator_suffix454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_declarator_suffix456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_declarator_suffix466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_declarator_suffix468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_declarator_suffix480 = new BitSet(new long[]{0x00000073A882A250L});
	public static final BitSet FOLLOW_parameter_type_list_in_declarator_suffix482 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarator_suffix484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_declarator_suffix496 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_identifier_list_in_declarator_suffix498 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarator_suffix500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_declarator_suffix512 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarator_suffix514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_pointer527 = new BitSet(new long[]{0x0000004000000200L});
	public static final BitSet FOLLOW_type_qualifier_in_pointer529 = new BitSet(new long[]{0x0004004000000202L});
	public static final BitSet FOLLOW_pointer_in_pointer532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_pointer540 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_pointer_in_pointer542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_pointer549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_list_in_parameter_type_list562 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_parameter_type_list565 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_parameter_type_list567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list581 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_parameter_list584 = new BitSet(new long[]{0x00000073A882A250L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list586 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration600 = new BitSet(new long[]{0x0005000000200002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_in_parameter_declaration603 = new BitSet(new long[]{0x0005000000200002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration605 = new BitSet(new long[]{0x0005000000200002L,0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list620 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_identifier_list623 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list625 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_pointer_in_abstract_declarator641 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_direct_abstract_declarator666 = new BitSet(new long[]{0x0005000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator668 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_direct_abstract_declarator670 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator674 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator678 = new BitSet(new long[]{0x0001000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_abstract_declarator_suffix693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_abstract_declarator_suffix695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_abstract_declarator_suffix702 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_constant_expression_in_abstract_declarator_suffix704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_abstract_declarator_suffix706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_abstract_declarator_suffix713 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_abstract_declarator_suffix715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_abstract_declarator_suffix722 = new BitSet(new long[]{0x00000073A882A250L});
	public static final BitSet FOLLOW_parameter_type_list_in_abstract_declarator_suffix724 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_abstract_declarator_suffix726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_initializer747 = new BitSet(new long[]{0x0665420400240880L,0x0000000004300000L});
	public static final BitSet FOLLOW_initializer_list_in_initializer749 = new BitSet(new long[]{0x0100000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_56_in_initializer751 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_initializer754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initializer_in_initializer_list768 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_initializer_list771 = new BitSet(new long[]{0x0665420400240880L,0x0000000004300000L});
	public static final BitSet FOLLOW_initializer_in_initializer_list773 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list792 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_argument_expression_list795 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list797 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression814 = new BitSet(new long[]{0x0220000000000002L});
	public static final BitSet FOLLOW_53_in_additive_expression818 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression820 = new BitSet(new long[]{0x0220000000000002L});
	public static final BitSet FOLLOW_57_in_additive_expression824 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression826 = new BitSet(new long[]{0x0220000000000002L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression844 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_50_in_multiplicative_expression848 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression850 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_63_in_multiplicative_expression854 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression856 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_43_in_multiplicative_expression860 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression862 = new BitSet(new long[]{0x8004080000000002L});
	public static final BitSet FOLLOW_48_in_cast_expression879 = new BitSet(new long[]{0x0000007188822240L});
	public static final BitSet FOLLOW_type_name_in_cast_expression881 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_cast_expression883 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unary_expression913 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_unary_expression922 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression931 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_unary_expression940 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_unary_expression949 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_unary_expression951 = new BitSet(new long[]{0x0000007188822240L});
	public static final BitSet FOLLOW_type_name_in_unary_expression953 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_unary_expression955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression976 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_postfix_expression984 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_postfix_expression986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_postfix_expression988 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_48_in_postfix_expression996 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_postfix_expression998 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_48_in_postfix_expression1006 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1008 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_postfix_expression1010 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_61_in_postfix_expression1020 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1022 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_60_in_postfix_expression1032 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1034 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_54_in_postfix_expression1042 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_58_in_postfix_expression1050 = new BitSet(new long[]{0x3441000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_46_in_unary_operator1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_unary_operator1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_unary_operator1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unary_operator1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_unary_operator1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unary_operator1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_primary_expression1134 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_primary_expression1136 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_primary_expression1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_constant1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_LITERAL_in_constant1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_constant1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1202 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_expression1205 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1207 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_constant_expression1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment_expression1237 = new BitSet(new long[]{0x0890900000000000L,0x00000000008210A1L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1239 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_assignment_expression1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_lvalue1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_assignment_operator1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignment_operator1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_assignment_operator1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_assignment_operator1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_assignment_operator1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_assignment_operator1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_assignment_operator1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_assignment_operator1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_assignment_operator1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_assignment_operator1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_assignment_operator1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression1361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_conditional_expression1364 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_conditional_expression1366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_conditional_expression1368 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_expression1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1386 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_logical_or_expression1389 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1391 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1406 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_logical_and_expression1409 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1411 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_inclusive_or_expression1429 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1431 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_exclusive_or_expression1449 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1466 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_and_expression1469 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1471 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1486 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_set_in_equality_expression1489 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1495 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1510 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000648L});
	public static final BitSet FOLLOW_set_in_relational_expression1513 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000648L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000810L});
	public static final BitSet FOLLOW_set_in_shift_expression1541 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000810L});
	public static final BitSet FOLLOW_labeled_statement_in_statement1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement1607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement1614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_labeled_statement1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_labeled_statement1633 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_labeled_statement1642 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_constant_expression_in_labeled_statement1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_labeled_statement1646 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_labeled_statement1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_labeled_statement1657 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_compound_statement1676 = new BitSet(new long[]{0x066542FFE8FEBEF0L,0x00000000063C0004L});
	public static final BitSet FOLLOW_declaration_in_compound_statement1678 = new BitSet(new long[]{0x066542FFE8FEBEF0L,0x00000000063C0004L});
	public static final BitSet FOLLOW_statement_list_in_compound_statement1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_compound_statement1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement_list1701 = new BitSet(new long[]{0x0665428C407C1CA2L,0x00000000043C0004L});
	public static final BitSet FOLLOW_66_in_expression_statement1715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_expression_statement1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_selection_statement1738 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_selection_statement1740 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_selection_statement1742 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_selection_statement1744 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_selection_statement1746 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ELSE_in_selection_statement1761 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_selection_statement1763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_selection_statement1773 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_selection_statement1775 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_selection_statement1777 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_selection_statement1779 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_selection_statement1781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement1799 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1801 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1803 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1805 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_iteration_statement1814 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1816 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement1818 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1820 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1822 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_iteration_statement1826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_iteration_statement1833 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1835 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100004L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement1837 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100004L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement1839 = new BitSet(new long[]{0x0667420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1841 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1844 = new BitSet(new long[]{0x0665428C407C1CA0L,0x00000000043C0004L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GOTO_in_jump_statement1862 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_jump_statement1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_jump_statement1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_jump_statement1882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement1900 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_expression_in_jump_statement1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_jump_statement1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred27_myparser401 = new BitSet(new long[]{0x0001000000200000L});
	public static final BitSet FOLLOW_direct_declarator_in_synpred27_myparser404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_suffix_in_synpred29_myparser437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred35_myparser532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_synpred37_myparser540 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_pointer_in_synpred37_myparser542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_in_synpred40_myparser603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_in_synpred41_myparser605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred43_myparser643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_synpred46_myparser678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_synpred64_myparser940 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_unary_expression_in_synpred64_myparser942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred83_myparser1237 = new BitSet(new long[]{0x0890900000000000L,0x00000000008210A1L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred83_myparser1239 = new BitSet(new long[]{0x0665420400240880L,0x0000000004100000L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred83_myparser1241 = new BitSet(new long[]{0x0000000000000002L});
}
