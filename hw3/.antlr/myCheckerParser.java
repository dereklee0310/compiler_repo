// Generated from c:\Users\User\workspace\ccu_compiler\hw3\myChecker.g by ANTLR 4.9.2

    // import packages here.
    import java.util.HashMap;
	import java.util.Map;
	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCheckerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, VOID=51, CHAR=52, SHORT=53, 
		INT=54, LONG=55, FLOAT=56, DOUBLE=57, SIGNED=58, UNSIGNED=59, BOOL=60, 
		CONST=61, VOLATILE=62, EXTERN=63, STATIC=64, AUTO=65, REGISTER=66, MAIN=67, 
		IF=68, ELSE=69, SWITCH=70, WHILE=71, DO=72, FOR=73, GOTO=74, CONTINUE=75, 
		BREAK=76, RETURN=77, IDENTIFIER=78, CHARACTER_LITERAL=79, STRING_LITERAL=80, 
		DECIMAL_LITERAL=81, FLOATING_POINT_LITERAL=82, EscapeSequence=83, WS=84, 
		COMMENT=85, LINE_COMMENT=86, LINE_COMMAND=87;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_init_declarator_list = 2, 
		RULE_init_declarator = 3, RULE_declaration_specifiers = 4, RULE_type_qualifier = 5, 
		RULE_storage_class_specifier = 6, RULE_type_name = 7, RULE_specifier_qualifier_list = 8, 
		RULE_type_specifier = 9, RULE_declarator = 10, RULE_direct_declarator = 11, 
		RULE_declarator_suffix = 12, RULE_pointer = 13, RULE_parameter_type_list = 14, 
		RULE_parameter_list = 15, RULE_parameter_declaration = 16, RULE_identifier_list = 17, 
		RULE_abstract_declarator = 18, RULE_direct_abstract_declarator = 19, RULE_abstract_declarator_suffix = 20, 
		RULE_initializer = 21, RULE_initializer_list = 22, RULE_argument_expression_list = 23, 
		RULE_additive_expression = 24, RULE_multiplicative_expression = 25, RULE_cast_expression = 26, 
		RULE_unary_expression = 27, RULE_postfix_expression = 28, RULE_unary_operator = 29, 
		RULE_primary_expression = 30, RULE_constant = 31, RULE_expression = 32, 
		RULE_constant_expression = 33, RULE_assignment_expression = 34, RULE_lvalue = 35, 
		RULE_assignment_operator = 36, RULE_conditional_expression = 37, RULE_logical_or_expression = 38, 
		RULE_logical_and_expression = 39, RULE_inclusive_or_expression = 40, RULE_exclusive_or_expression = 41, 
		RULE_and_expression = 42, RULE_equality_expression = 43, RULE_relational_expression = 44, 
		RULE_shift_expression = 45, RULE_statement = 46, RULE_labeled_statement = 47, 
		RULE_compound_statement = 48, RULE_statement_list = 49, RULE_expression_statement = 50, 
		RULE_selection_statement = 51, RULE_iteration_statement = 52, RULE_jump_statement = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "init_declarator_list", "init_declarator", 
			"declaration_specifiers", "type_qualifier", "storage_class_specifier", 
			"type_name", "specifier_qualifier_list", "type_specifier", "declarator", 
			"direct_declarator", "declarator_suffix", "pointer", "parameter_type_list", 
			"parameter_list", "parameter_declaration", "identifier_list", "abstract_declarator", 
			"direct_abstract_declarator", "abstract_declarator_suffix", "initializer", 
			"initializer_list", "argument_expression_list", "additive_expression", 
			"multiplicative_expression", "cast_expression", "unary_expression", "postfix_expression", 
			"unary_operator", "primary_expression", "constant", "expression", "constant_expression", 
			"assignment_expression", "lvalue", "assignment_operator", "conditional_expression", 
			"logical_or_expression", "logical_and_expression", "inclusive_or_expression", 
			"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
			"shift_expression", "statement", "labeled_statement", "compound_statement", 
			"statement_list", "expression_statement", "selection_statement", "iteration_statement", 
			"jump_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "'**'", "'*'", "'['", "']'", "')'", "';'", "'='", 
			"'...'", "'{'", "'}'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", "'sizeof'", 
			"'.'", "'->'", "'&'", "'~'", "'!'", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='", "'?'", "':'", "'||'", "'&&'", 
			"'|'", "'^'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'<<'", "'>>'", 
			"'case'", "'default'", "'void'", "'char'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'signed'", "'unsigned'", "'bool'", "'const'", 
			"'volatile'", "'extern'", "'static'", "'auto'", "'register'", "'main'", 
			"'if'", "'else'", "'switch'", "'while'", "'do'", "'for'", "'goto'", "'continue'", 
			"'break'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VOID", "CHAR", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", 
			"SIGNED", "UNSIGNED", "BOOL", "CONST", "VOLATILE", "EXTERN", "STATIC", 
			"AUTO", "REGISTER", "MAIN", "IF", "ELSE", "SWITCH", "WHILE", "DO", "FOR", 
			"GOTO", "CONTINUE", "BREAK", "RETURN", "IDENTIFIER", "CHARACTER_LITERAL", 
			"STRING_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "EscapeSequence", 
			"WS", "COMMENT", "LINE_COMMENT", "LINE_COMMAND"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "myChecker.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = false;
		enum Type {
			VOID, CHAR, SHORT, INT, LONG, FLOAT, DOUBLE, SIGNED, UNSIGNED, BOOL, CHARS, ERROR; // CHARS for string
		}
		HashMap<String,Type> symbolTable = new HashMap<String,Type>();

	public myCheckerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(myCheckerParser.MAIN, 0); }
		public TerminalNode VOID() { return getToken(myCheckerParser.VOID, 0); }
		public List<TerminalNode> INT() { return getTokens(myCheckerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(myCheckerParser.INT, i);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(myCheckerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(myCheckerParser.IDENTIFIER, i);
		}
		public TerminalNode CHAR() { return getToken(myCheckerParser.CHAR, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			match(MAIN);
			setState(110);
			match(T__0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(111);
				match(INT);
				setState(112);
				match(IDENTIFIER);
				}
			}

			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(115);
				match(T__1);
				{
				setState(116);
				match(CHAR);
				setState(117);
				match(T__2);
				setState(118);
				match(IDENTIFIER);
				}
				}
				break;
			case CHAR:
				{
				{
				setState(119);
				match(CHAR);
				setState(120);
				match(T__3);
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(T__4);
				setState(123);
				match(T__5);
				}
				}
				break;
			case T__6:
				break;
			default:
				break;
			}
			setState(126);
			match(T__6);
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case CHAR:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case SIGNED:
			case UNSIGNED:
			case BOOL:
			case CONST:
			case VOLATILE:
			case EXTERN:
			case STATIC:
			case AUTO:
			case REGISTER:
				{
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					declaration();
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (VOID - 51)) | (1L << (CHAR - 51)) | (1L << (SHORT - 51)) | (1L << (INT - 51)) | (1L << (LONG - 51)) | (1L << (FLOAT - 51)) | (1L << (DOUBLE - 51)) | (1L << (SIGNED - 51)) | (1L << (UNSIGNED - 51)) | (1L << (BOOL - 51)) | (1L << (CONST - 51)) | (1L << (VOLATILE - 51)) | (1L << (EXTERN - 51)) | (1L << (STATIC - 51)) | (1L << (AUTO - 51)) | (1L << (REGISTER - 51)))) != 0) );
				setState(132);
				compound_statement();
				}
				break;
			case T__10:
				{
				setState(134);
				compound_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 if (TRACEON) System.out.println("program: (VOID | INT) MAIN '(' (INT IDENTIFIER)? (',' (CHAR '**' IDENTIFIER) | (CHAR '*' IDENTIFIER '[' ']'))? ')' ( declaration+ compound_statement | compound_statement)"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		 HashMap<String, Type> identifiers = new HashMap<String, Type>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			declaration_specifiers();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__3 || _la==IDENTIFIER) {
				{
				setState(140);
				init_declarator_list(identifiers);
				}
			}

			setState(143);
			match(T__7);
			 
						if(TRACEON)
							System.out.println("declaration: declaration_specifiers init_declarator_list? ';'");

						if((((DeclarationContext)_localctx).init_declarator_list!=null?_input.getText(((DeclarationContext)_localctx).init_declarator_list.start,((DeclarationContext)_localctx).init_declarator_list.stop):null) != null) {
							Type specifier = ((DeclarationContext)_localctx).declaration_specifiers.specifier;
							for(Map.Entry<String, Type> entry: identifiers.entrySet()) {
								String id = entry.getKey();
								Type type = entry.getValue();

								if(symbolTable.containsKey(id)) {
									System.out.println("Error! " + (((DeclarationContext)_localctx).declaration_specifiers!=null?(((DeclarationContext)_localctx).declaration_specifiers.start):null).getLine() + ": Redeclared identifier ");
								} else {
									if(specifier == Type.VOID || specifier == Type.CHAR || specifier == Type.BOOL || specifier == Type.CHARS) {
										if(type != specifier && type != null)
											System.out.println("Error! " + (((DeclarationContext)_localctx).declaration_specifiers!=null?(((DeclarationContext)_localctx).declaration_specifiers.start):null).getLine() + ": Type mismatch while initializing a variable ");
									} else if(type != null && ((specifier == Type.SHORT && (type != Type.CHAR && type != Type.SHORT))
											|| (specifier == Type.INT && (type != Type.CHAR && type != Type.SHORT && type != Type.INT))
											|| (specifier == Type.LONG && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG))
											|| (specifier == Type.FLOAT && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG && type != Type.FLOAT))
											|| (specifier == Type.DOUBLE && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG && type != Type.FLOAT && type != Type.DOUBLE))))
										System.out.println("Error! " + (((DeclarationContext)_localctx).declaration_specifiers!=null?(((DeclarationContext)_localctx).declaration_specifiers.start):null).getLine() + ": Type mismatch while initializing a variable ");
									symbolTable.put(id, specifier);
								}
								// VOID, CHAR, SHORT, INT, LONG, FLOAT, DOUBLE, SIGNED, UNSIGNED, BOOL, CHARS;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public HashMap<String, Type> identifiers;
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState, HashMap<String, Type> identifiers) {
			super(parent, invokingState);
			this.identifiers = identifiers;
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
	}

	public final Init_declarator_listContext init_declarator_list(HashMap<String, Type> identifiers) throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState(), identifiers);
		enterRule(_localctx, 4, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			init_declarator(identifiers);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(147);
				match(T__1);
				setState(148);
				init_declarator(identifiers);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("init_declarator_list: init_declarator (',' init_declarator)*"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public HashMap<String, Type> identifiers;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Init_declaratorContext(ParserRuleContext parent, int invokingState, HashMap<String, Type> identifiers) {
			super(parent, invokingState);
			this.identifiers = identifiers;
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	}

	public final Init_declaratorContext init_declarator(HashMap<String, Type> identifiers) throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState(), identifiers);
		enterRule(_localctx, 6, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			declarator();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(157);
				match(T__8);
				setState(158);
				initializer();
				}
			}


						if(TRACEON) 
							System.out.println("init_declarator: declarator ('=' initializer)?");
						
						Type type = null;
						if((((Init_declaratorContext)_localctx).initializer!=null?_input.getText(((Init_declaratorContext)_localctx).initializer.start,((Init_declaratorContext)_localctx).initializer.stop):null) != null)
							type = ((Init_declaratorContext)_localctx).initializer.type;
						_localctx.identifiers.put(((Init_declaratorContext)_localctx).declarator.id, type);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public Type specifier;
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXTERN:
				case STATIC:
				case AUTO:
				case REGISTER:
					{
					setState(163);
					storage_class_specifier();
					}
					break;
				case VOID:
				case CHAR:
				case SHORT:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case SIGNED:
				case UNSIGNED:
				case BOOL:
					{
					setState(164);
					type_specifier();
					}
					break;
				case CONST:
				case VOLATILE:
					{
					setState(165);
					type_qualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (VOID - 51)) | (1L << (CHAR - 51)) | (1L << (SHORT - 51)) | (1L << (INT - 51)) | (1L << (LONG - 51)) | (1L << (FLOAT - 51)) | (1L << (DOUBLE - 51)) | (1L << (SIGNED - 51)) | (1L << (UNSIGNED - 51)) | (1L << (BOOL - 51)) | (1L << (CONST - 51)) | (1L << (VOLATILE - 51)) | (1L << (EXTERN - 51)) | (1L << (STATIC - 51)) | (1L << (AUTO - 51)) | (1L << (REGISTER - 51)))) != 0) );
			 
						if(TRACEON)
							System.out.println("declaration_specifiers: (storage_class_specifier | type_specifier | type_qualifier)+");

						if((((Declaration_specifiersContext)_localctx).type_specifier!=null?_input.getText(((Declaration_specifiersContext)_localctx).type_specifier.start,((Declaration_specifiersContext)_localctx).type_specifier.stop):null) != null)
							((Declaration_specifiersContext)_localctx).specifier =  ((Declaration_specifiersContext)_localctx).type_specifier.specifier;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_qualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(myCheckerParser.CONST, 0); }
		public TerminalNode VOLATILE() { return getToken(myCheckerParser.VOLATILE, 0); }
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_qualifier);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(CONST);
				 if (TRACEON) System.out.println("type_qualifier: CONST"); 
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(VOLATILE);
				 if (TRACEON) System.out.println("type_qualifier: VOLATILE"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(myCheckerParser.EXTERN, 0); }
		public TerminalNode STATIC() { return getToken(myCheckerParser.STATIC, 0); }
		public TerminalNode AUTO() { return getToken(myCheckerParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(myCheckerParser.REGISTER, 0); }
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_storage_class_specifier);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(EXTERN);
				 if (TRACEON) System.out.println("storage_class_specifier: EXTERN"); 
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(STATIC);
				 if (TRACEON) System.out.println("storage_class_specifier: STATIC"); 
				}
				break;
			case AUTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(AUTO);
				 if (TRACEON) System.out.println("storage_class_specifier: AUTO"); 
				}
				break;
			case REGISTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(REGISTER);
				 if (TRACEON) System.out.println("storage_class_specifier: REGISTER"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Type specifier;
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			specifier_qualifier_list();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(189);
				abstract_declarator();
				}
			}

			 if (TRACEON) System.out.println("type_name: specifier_qualifier_list abstract_declarator?"); ((Type_nameContext)_localctx).specifier =  ((Type_nameContext)_localctx).specifier_qualifier_list.specifier;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public Type specifier;
		public Type_specifierContext qual1;
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specifier_qualifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
				case VOLATILE:
					{
					setState(194);
					type_qualifier();
					}
					break;
				case VOID:
				case CHAR:
				case SHORT:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case SIGNED:
				case UNSIGNED:
				case BOOL:
					{
					setState(195);
					((Specifier_qualifier_listContext)_localctx).qual1 = type_specifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << CHAR) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << SIGNED) | (1L << UNSIGNED) | (1L << BOOL) | (1L << CONST) | (1L << VOLATILE))) != 0) );
			 if (TRACEON) System.out.println("specifier_qualifier_list: (type_qualifier | type_specifier)+"); ((Specifier_qualifier_listContext)_localctx).specifier =  ((Specifier_qualifier_listContext)_localctx).qual1.specifier; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public Type specifier;
		public TerminalNode VOID() { return getToken(myCheckerParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(myCheckerParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(myCheckerParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(myCheckerParser.INT, 0); }
		public TerminalNode LONG() { return getToken(myCheckerParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(myCheckerParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(myCheckerParser.DOUBLE, 0); }
		public TerminalNode SIGNED() { return getToken(myCheckerParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(myCheckerParser.UNSIGNED, 0); }
		public TerminalNode BOOL() { return getToken(myCheckerParser.BOOL, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_specifier);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(VOID);
				 if (TRACEON) System.out.println("type_specifier: VOID"); ((Type_specifierContext)_localctx).specifier =  Type.VOID; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(CHAR);
				 if (TRACEON) System.out.println("type_specifier: CHAR"); ((Type_specifierContext)_localctx).specifier =  Type.CHAR; 
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(SHORT);
				 if (TRACEON) System.out.println("type_specifier: SHORT"); ((Type_specifierContext)_localctx).specifier =  Type.SHORT; 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(INT);
				 if (TRACEON) System.out.println("type_specifier: INT"); ((Type_specifierContext)_localctx).specifier =  Type.INT; 
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(LONG);
				 if (TRACEON) System.out.println("type_specifier: LONG"); ((Type_specifierContext)_localctx).specifier =  Type.LONG; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(FLOAT);
				 if (TRACEON) System.out.println("type_specifier: FLOAT"); ((Type_specifierContext)_localctx).specifier =  Type.FLOAT; 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(DOUBLE);
				 if (TRACEON) System.out.println("type_specifier: DOUBLE"); ((Type_specifierContext)_localctx).specifier =  Type.DOUBLE; 
				}
				break;
			case SIGNED:
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				match(SIGNED);
				 if (TRACEON) System.out.println("type_specifier: SIGNED"); ((Type_specifierContext)_localctx).specifier =  Type.SIGNED; 
				}
				break;
			case UNSIGNED:
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
				match(UNSIGNED);
				 if (TRACEON) System.out.println("type_specifier: UNSIGNED"); ((Type_specifierContext)_localctx).specifier =  Type.UNSIGNED; 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(BOOL);
				 if (TRACEON) System.out.println("type_specifier: BOOL"); ((Type_specifierContext)_localctx).specifier =  Type.BOOL; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public String id;
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarator);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(224);
					pointer();
					}
				}

				setState(227);
				direct_declarator();
				 if (TRACEON) System.out.println("declarator: pointer? direct_declarator"); ((DeclaratorContext)_localctx).id =  ((DeclaratorContext)_localctx).direct_declarator.id; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				pointer();
				 if (TRACEON) System.out.println("declarator: pointer"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Direct_declaratorContext extends ParserRuleContext {
		public String id;
		public TerminalNode IDENTIFIER() { return getToken(myCheckerParser.IDENTIFIER, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public List<Declarator_suffixContext> declarator_suffix() {
			return getRuleContexts(Declarator_suffixContext.class);
		}
		public Declarator_suffixContext declarator_suffix(int i) {
			return getRuleContext(Declarator_suffixContext.class,i);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_direct_declarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(235);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				setState(236);
				match(T__0);
				setState(237);
				declarator();
				setState(238);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					declarator_suffix();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			 if (TRACEON) System.out.println("direct_declarator: (IDENTIFIER | '(' declarator ')') declarator_suffix*"); ((Direct_declaratorContext)_localctx).id =  (((Direct_declaratorContext)_localctx).IDENTIFIER!=null?((Direct_declaratorContext)_localctx).IDENTIFIER.getText():null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarator_suffixContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Parameter_type_listContext parameter_type_list() {
			return getRuleContext(Parameter_type_listContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_suffix; }
	}

	public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
		Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarator_suffix);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__4);
				setState(251);
				constant_expression();
				setState(252);
				match(T__5);
				 if (TRACEON) System.out.println("declarator_suffix: '[' constant_expression ']'"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__4);
				setState(256);
				match(T__5);
				 if (TRACEON) System.out.println("declarator_suffix: '[' ']'"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T__0);
				setState(259);
				parameter_type_list();
				setState(260);
				match(T__6);
				 if (TRACEON) System.out.println("declarator_suffix: '(' parameter_type_list ')'"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(T__0);
				setState(264);
				identifier_list();
				setState(265);
				match(T__6);
				 if (TRACEON) System.out.println("declarator_suffix: '(' identifier_list ')'"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(T__0);
				setState(269);
				match(T__6);
				 if (TRACEON) System.out.println("declarator_suffix: '(' ')'"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pointer);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__3);
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					type_qualifier();
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==VOLATILE );
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(279);
					pointer();
					}
					break;
				}
				 if (TRACEON) System.out.println("pointer: '*' type_qualifier+ pointer?"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__3);
				setState(285);
				pointer();
				 if (TRACEON) System.out.println("pointer: '*' pointer"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(T__3);
				 if (TRACEON) System.out.println("pointer: '*'"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_type_listContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_type_list; }
	}

	public final Parameter_type_listContext parameter_type_list() throws RecognitionException {
		Parameter_type_listContext _localctx = new Parameter_type_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			parameter_list();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(293);
				match(T__1);
				setState(294);
				match(T__9);
				}
			}

			 if (TRACEON) System.out.println("parameter_type_list: parameter_list (',' '...')?"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			parameter_declaration();
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(T__1);
					setState(301);
					parameter_declaration();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			 if (TRACEON) System.out.println("parameter_type_list: parameter_declaration (',' parameter_declaration)*"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<Abstract_declaratorContext> abstract_declarator() {
			return getRuleContexts(Abstract_declaratorContext.class);
		}
		public Abstract_declaratorContext abstract_declarator(int i) {
			return getRuleContext(Abstract_declaratorContext.class,i);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			declaration_specifiers();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4))) != 0) || _la==IDENTIFIER) {
				{
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(310);
					declarator();
					}
					break;
				case 2:
					{
					setState(311);
					abstract_declarator();
					}
					break;
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("parameter_type_list: declaration_specifiers (declarator|abstract_declarator)*"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(myCheckerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(myCheckerParser.IDENTIFIER, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(IDENTIFIER);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(320);
				match(T__1);
				setState(321);
				match(IDENTIFIER);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("identifier_list: IDENTIFIER (',' IDENTIFIER)*"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Direct_abstract_declaratorContext direct_abstract_declarator() {
			return getRuleContext(Direct_abstract_declaratorContext.class,0);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_abstract_declarator);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				pointer();
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(330);
					direct_abstract_declarator();
					}
					break;
				}
				 if (TRACEON) System.out.println("abstract_declarator: pointer direct_abstract_declarator?"); 
				}
				break;
			case T__0:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				direct_abstract_declarator();
				 if (TRACEON) System.out.println("abstract_declarator: direct_abstract_declarator"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Direct_abstract_declaratorContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
			return getRuleContexts(Abstract_declarator_suffixContext.class);
		}
		public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
			return getRuleContext(Abstract_declarator_suffixContext.class,i);
		}
		public Direct_abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_abstract_declarator; }
	}

	public final Direct_abstract_declaratorContext direct_abstract_declarator() throws RecognitionException {
		Direct_abstract_declaratorContext _localctx = new Direct_abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_direct_abstract_declarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(340);
				match(T__0);
				setState(341);
				abstract_declarator();
				setState(342);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(344);
				abstract_declarator_suffix();
				}
				break;
			}
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					abstract_declarator_suffix();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			 if (TRACEON) System.out.println("direct_abstract_declarator: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) abstract_declarator_suffix*"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_declarator_suffixContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Parameter_type_listContext parameter_type_list() {
			return getRuleContext(Parameter_type_listContext.class,0);
		}
		public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator_suffix; }
	}

	public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
		Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstract_declarator_suffix);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__4);
				setState(356);
				match(T__5);
				 if (TRACEON) System.out.println("abstract_declarator_suffix: '[' ']'"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(T__4);
				setState(359);
				constant_expression();
				setState(360);
				match(T__5);
				 if (TRACEON) System.out.println("abstract_declarator_suffix: '[' constant_expression ']'"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(T__0);
				setState(364);
				match(T__6);
				 if (TRACEON) System.out.println("abstract_declarator_suffix: '(' ')'"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(T__0);
				setState(367);
				parameter_type_list();
				setState(368);
				match(T__6);
				 if (TRACEON) System.out.println("abstract_declarator_suffix: '(' parameter_type_list ')'"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Type type;
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initializer);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__12:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__22:
			case T__23:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				assignment_expression();
				 if (TRACEON) System.out.println("initializer: assignment_expression"); ((InitializerContext)_localctx).type =  ((InitializerContext)_localctx).assignment_expression.type; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(T__10);
				setState(377);
				initializer_list();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(378);
					match(T__1);
					}
				}

				setState(381);
				match(T__11);
				 if (TRACEON) System.out.println("initializer: '{' initializer_list ','? '}'"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public Type type;
		public InitializerContext init;
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			((Initializer_listContext)_localctx).init = initializer();
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					match(T__1);
					setState(388);
					initializer();
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			 if (TRACEON) System.out.println("initializer_list: initializer (',' initializer)*"); ((Initializer_listContext)_localctx).type =  ((Initializer_listContext)_localctx).init.type; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			assignment_expression();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(397);
				match(T__1);
				setState(398);
				assignment_expression();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("argument_expression_list: assignment_expression (',' assignment_expression)*"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Type type;
		public Multiplicative_expressionContext mul1;
		public Multiplicative_expressionContext mul2;
		public Multiplicative_expressionContext mul3;
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(406);
			((Additive_expressionContext)_localctx).mul1 = multiplicative_expression();
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				setState(411);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(407);
					match(T__12);
					setState(408);
					((Additive_expressionContext)_localctx).mul2 = multiplicative_expression();
					}
					break;
				case T__13:
					{
					setState(409);
					match(T__13);
					setState(410);
					((Additive_expressionContext)_localctx).mul3 = multiplicative_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("additive_expression: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)*");
						
						if((((Additive_expressionContext)_localctx).mul2!=null?_input.getText(((Additive_expressionContext)_localctx).mul2.start,((Additive_expressionContext)_localctx).mul2.stop):null) != null && ((Additive_expressionContext)_localctx).mul1.type != ((Additive_expressionContext)_localctx).mul2.type) {
							System.out.println("Error! " + (((Additive_expressionContext)_localctx).mul1!=null?(((Additive_expressionContext)_localctx).mul1.start):null).getLine() + ": Type mismatch in an addition");
							((Additive_expressionContext)_localctx).type =  Type.ERROR;
						} else if((((Additive_expressionContext)_localctx).mul3!=null?_input.getText(((Additive_expressionContext)_localctx).mul3.start,((Additive_expressionContext)_localctx).mul3.stop):null) != null && ((Additive_expressionContext)_localctx).mul1.type != ((Additive_expressionContext)_localctx).mul3.type) {
							System.out.println("Error! " + (((Additive_expressionContext)_localctx).mul1!=null?(((Additive_expressionContext)_localctx).mul1.start):null).getLine() + ": Type mismatch in a subtraction");
							((Additive_expressionContext)_localctx).type =  Type.ERROR;
						} else {
							((Additive_expressionContext)_localctx).type =  ((Additive_expressionContext)_localctx).mul1.type;
						}	
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Type type;
		public Cast_expressionContext cast1;
		public Cast_expressionContext cast2;
		public Cast_expressionContext cast3;
		public Cast_expressionContext cast4;
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			((Multiplicative_expressionContext)_localctx).cast1 = cast_expression();
			}
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(419);
					match(T__3);
					setState(420);
					((Multiplicative_expressionContext)_localctx).cast2 = cast_expression();
					}
					break;
				case T__14:
					{
					setState(421);
					match(T__14);
					setState(422);
					((Multiplicative_expressionContext)_localctx).cast3 = cast_expression();
					}
					break;
				case T__15:
					{
					setState(423);
					match(T__15);
					setState(424);
					((Multiplicative_expressionContext)_localctx).cast4 = cast_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

						if(TRACEON)
							System.out.println("multiplicative_expression: (cast_expression) ('*' cast_expression | '/' cast_expression | '\%' cast_expression)*");

						if((((Multiplicative_expressionContext)_localctx).cast2!=null?_input.getText(((Multiplicative_expressionContext)_localctx).cast2.start,((Multiplicative_expressionContext)_localctx).cast2.stop):null) != null && ((Multiplicative_expressionContext)_localctx).cast1.type != ((Multiplicative_expressionContext)_localctx).cast2.type) {
							System.out.println("Error! " + (((Multiplicative_expressionContext)_localctx).cast1!=null?(((Multiplicative_expressionContext)_localctx).cast1.start):null).getLine() + ": Type mismatch in a multiplication");
							((Multiplicative_expressionContext)_localctx).type =  Type.ERROR;
						} else if((((Multiplicative_expressionContext)_localctx).cast3!=null?_input.getText(((Multiplicative_expressionContext)_localctx).cast3.start,((Multiplicative_expressionContext)_localctx).cast3.stop):null) != null && ((Multiplicative_expressionContext)_localctx).cast1.type != ((Multiplicative_expressionContext)_localctx).cast3.type) {
							System.out.println("Error! " + (((Multiplicative_expressionContext)_localctx).cast1!=null?(((Multiplicative_expressionContext)_localctx).cast1.start):null).getLine() + ": Type mismatch in a division");
							((Multiplicative_expressionContext)_localctx).type =  Type.ERROR;
						} else if((((Multiplicative_expressionContext)_localctx).cast4!=null?_input.getText(((Multiplicative_expressionContext)_localctx).cast4.start,((Multiplicative_expressionContext)_localctx).cast4.stop):null) != null && ((Multiplicative_expressionContext)_localctx).cast1.type != ((Multiplicative_expressionContext)_localctx).cast4.type) {
							System.out.println("Error! " + (((Multiplicative_expressionContext)_localctx).cast1!=null?(((Multiplicative_expressionContext)_localctx).cast1.start):null).getLine() + ": Type mismatch in a modulus");
							((Multiplicative_expressionContext)_localctx).type =  Type.ERROR;
						} else {
							((Multiplicative_expressionContext)_localctx).type =  ((Multiplicative_expressionContext)_localctx).cast1.type;
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Type type;
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cast_expression);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(T__0);
				setState(433);
				type_name();
				setState(434);
				match(T__6);
				setState(435);
				cast_expression();
				 if (TRACEON) System.out.println("cast_expression: '(' type_name ')' cast_expression"); ((Cast_expressionContext)_localctx).type =  ((Cast_expressionContext)_localctx).type_name.specifier; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				unary_expression();
				 if (TRACEON) System.out.println("cast_expression: unary_expression"); ((Cast_expressionContext)_localctx).type =  ((Cast_expressionContext)_localctx).unary_expression.type; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Type type;
		public Unary_expressionContext unary2;
		public Unary_expressionContext unary3;
		public Unary_expressionContext unary4;
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unary_expression);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				postfix_expression();
				 if (TRACEON) System.out.println("unary_expression: postfix_expression"); ((Unary_expressionContext)_localctx).type =  ((Unary_expressionContext)_localctx).postfix_expression.type; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(T__16);
				setState(447);
				((Unary_expressionContext)_localctx).unary2 = unary_expression();
				 if (TRACEON) System.out.println("unary_expression: '++' unary_expression"); ((Unary_expressionContext)_localctx).type =  ((Unary_expressionContext)_localctx).unary2.type; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(T__17);
				setState(451);
				((Unary_expressionContext)_localctx).unary3 = unary_expression();
				 if (TRACEON) System.out.println("unary_expression: '--' unary_expression"); ((Unary_expressionContext)_localctx).type =  ((Unary_expressionContext)_localctx).unary3.type; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				unary_operator();
				setState(455);
				cast_expression();
				 if (TRACEON) System.out.println("unary_expression: unary_operator cast_expression"); ((Unary_expressionContext)_localctx).type =  ((Unary_expressionContext)_localctx).cast_expression.type; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				match(T__18);
				setState(459);
				((Unary_expressionContext)_localctx).unary4 = unary_expression();
				 if (TRACEON) System.out.println("unary_expression: 'sizeof' unary_expression"); ((Unary_expressionContext)_localctx).type =  Type.INT; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				match(T__18);
				setState(463);
				match(T__0);
				setState(464);
				type_name();
				setState(465);
				match(T__6);
				 if (TRACEON) System.out.println("unary_expression: 'sizeof' '(' type_name ')'"); ((Unary_expressionContext)_localctx).type =  Type.INT; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Type type;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(myCheckerParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(myCheckerParser.IDENTIFIER, i);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			primary_expression();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(471);
					match(T__4);
					setState(472);
					expression();
					setState(473);
					match(T__5);
					}
					break;
				case 2:
					{
					setState(475);
					match(T__0);
					setState(476);
					match(T__6);
					}
					break;
				case 3:
					{
					setState(477);
					match(T__0);
					setState(478);
					argument_expression_list();
					setState(479);
					match(T__6);
					}
					break;
				case 4:
					{
					setState(481);
					match(T__19);
					setState(482);
					match(IDENTIFIER);
					}
					break;
				case 5:
					{
					setState(483);
					match(T__20);
					setState(484);
					match(IDENTIFIER);
					}
					break;
				case 6:
					{
					setState(485);
					match(T__16);
					}
					break;
				case 7:
					{
					setState(486);
					match(T__17);
					}
					break;
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

						if(TRACEON)
							System.out.println("primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' |  '.' IDENTIFIER |  '->' IDENTIFIER | '++' | '--')*");
					
						((Postfix_expressionContext)_localctx).type =  ((Postfix_expressionContext)_localctx).primary_expression.type;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unary_operator);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(T__21);
				 if (TRACEON) System.out.println("unary_operator: '&'"); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(T__3);
				 if (TRACEON) System.out.println("unary_operator: '*'"); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(T__12);
				 if (TRACEON) System.out.println("unary_operator: '+'"); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				match(T__13);
				 if (TRACEON) System.out.println("unary_operator: '-'"); 
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				match(T__22);
				 if (TRACEON) System.out.println("unary_operator: '~'"); 
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				match(T__23);
				 if (TRACEON) System.out.println("unary_operator: '!'"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Type type;
		public TerminalNode IDENTIFIER() { return getToken(myCheckerParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primary_expression);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(IDENTIFIER);

							if(TRACEON)
								System.out.println("primary_expression: IDENTIFIER");

							if(symbolTable.containsKey((((Primary_expressionContext)_localctx).IDENTIFIER!=null?((Primary_expressionContext)_localctx).IDENTIFIER.getText():null)))
								((Primary_expressionContext)_localctx).type =  symbolTable.get((((Primary_expressionContext)_localctx).IDENTIFIER!=null?((Primary_expressionContext)_localctx).IDENTIFIER.getText():null));
							else {
								System.out.println("Error! " + ((Primary_expressionContext)_localctx).IDENTIFIER.getLine() + ": Undeclared identifier");
								((Primary_expressionContext)_localctx).type =  Type.ERROR;
							}
						
				}
				break;
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				constant();
				 if (TRACEON) System.out.println("primary_expression: constant"); ((Primary_expressionContext)_localctx).type =  ((Primary_expressionContext)_localctx).constant.type; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				match(T__0);
				setState(514);
				expression();
				setState(515);
				match(T__6);
				 if (TRACEON) System.out.println("primary_expression: '(' expression ')'"); ((Primary_expressionContext)_localctx).type =  ((Primary_expressionContext)_localctx).expression.type; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Type type;
		public TerminalNode DECIMAL_LITERAL() { return getToken(myCheckerParser.DECIMAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(myCheckerParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(myCheckerParser.STRING_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(myCheckerParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constant);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(DECIMAL_LITERAL);
				 
							if(TRACEON)
								System.out.println("constant: DECIMAL_LITERAL"); 
							
							long val = Integer.parseInt((((ConstantContext)_localctx).DECIMAL_LITERAL!=null?((ConstantContext)_localctx).DECIMAL_LITERAL.getText():null));
							((ConstantContext)_localctx).type =  Type.CHAR;
							if(val < -128 || val > 255)
								((ConstantContext)_localctx).type =  Type.SHORT;
							if(val < -32768 || val > 32767)
								((ConstantContext)_localctx).type =  Type.INT;
							if(val > 2147483647)
								((ConstantContext)_localctx).type =  Type.LONG;
						
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(CHARACTER_LITERAL);
				 if (TRACEON) System.out.println("constant: CHARACTER_LITERAL"); ((ConstantContext)_localctx).type =  Type.CHAR; 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(STRING_LITERAL);
				 if (TRACEON) System.out.println("constant: STRING_LITERAL"); ((ConstantContext)_localctx).type =  Type.CHARS; 
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				match(FLOATING_POINT_LITERAL);
				 
							if(TRACEON)
								System.out.println("constant: FLOATING_POINT_LITERAL");
							
							double val = Double.parseDouble((((ConstantContext)_localctx).FLOATING_POINT_LITERAL!=null?((ConstantContext)_localctx).FLOATING_POINT_LITERAL.getText():null));
							((ConstantContext)_localctx).type =  Type.FLOAT;
							if(val < 1.2e-38 || val > 3.4e+38)
								((ConstantContext)_localctx).type =  Type.DOUBLE;
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Type type;
		public Assignment_expressionContext assign1;
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			((ExpressionContext)_localctx).assign1 = assignment_expression();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(531);
				match(T__1);
				setState(532);
				assignment_expression();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("expression: assignment_expression (',' assignment_expression)*");

						((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).assign1.type;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public Type type;
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			conditional_expression();
			 if (TRACEON) System.out.println("constant_expression: conditional_expression"); ((Constant_expressionContext)_localctx).type =  ((Constant_expressionContext)_localctx).conditional_expression.type; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Type type;
		public Assignment_expressionContext assign2;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignment_expression);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				lvalue();
				setState(544);
				assignment_operator();
				setState(545);
				((Assignment_expressionContext)_localctx).assign2 = assignment_expression();
				 
							if(TRACEON) 
								System.out.println("assignment_expression: lvalue assignment_operator assignment_expression");
							if(((Assignment_expressionContext)_localctx).lvalue.type == Type.VOID || ((Assignment_expressionContext)_localctx).lvalue.type == Type.CHAR || ((Assignment_expressionContext)_localctx).lvalue.type == Type.BOOL || ((Assignment_expressionContext)_localctx).lvalue.type == Type.CHARS) {
								if(((Assignment_expressionContext)_localctx).assign2.type != ((Assignment_expressionContext)_localctx).lvalue.type && ((Assignment_expressionContext)_localctx).assign2.type != null)
									System.out.println("Error! " + (((Assignment_expressionContext)_localctx).lvalue!=null?(((Assignment_expressionContext)_localctx).lvalue.start):null).getLine() + ": Type mismatch while assigning a value to a variable");
							} else if((((Assignment_expressionContext)_localctx).lvalue.type == Type.SHORT && (((Assignment_expressionContext)_localctx).assign2.type != Type.CHAR && ((Assignment_expressionContext)_localctx).assign2.type != Type.SHORT))
									|| (((Assignment_expressionContext)_localctx).lvalue.type == Type.INT && (((Assignment_expressionContext)_localctx).assign2.type != Type.CHAR && ((Assignment_expressionContext)_localctx).assign2.type != Type.SHORT && ((Assignment_expressionContext)_localctx).assign2.type != Type.INT))
									|| (((Assignment_expressionContext)_localctx).lvalue.type == Type.LONG && (((Assignment_expressionContext)_localctx).assign2.type != Type.CHAR && ((Assignment_expressionContext)_localctx).assign2.type != Type.SHORT && ((Assignment_expressionContext)_localctx).assign2.type != Type.INT && ((Assignment_expressionContext)_localctx).assign2.type != Type.LONG))
									|| (((Assignment_expressionContext)_localctx).lvalue.type == Type.FLOAT && (((Assignment_expressionContext)_localctx).assign2.type != Type.CHAR && ((Assignment_expressionContext)_localctx).assign2.type != Type.SHORT && ((Assignment_expressionContext)_localctx).assign2.type != Type.INT && ((Assignment_expressionContext)_localctx).assign2.type != Type.LONG && ((Assignment_expressionContext)_localctx).assign2.type != Type.FLOAT))
									|| (((Assignment_expressionContext)_localctx).lvalue.type == Type.DOUBLE && (((Assignment_expressionContext)_localctx).assign2.type != Type.CHAR && ((Assignment_expressionContext)_localctx).assign2.type != Type.SHORT && ((Assignment_expressionContext)_localctx).assign2.type != Type.INT && ((Assignment_expressionContext)_localctx).assign2.type != Type.LONG && ((Assignment_expressionContext)_localctx).assign2.type != Type.FLOAT && ((Assignment_expressionContext)_localctx).assign2.type != Type.DOUBLE)))
								System.out.println("Error! " +(((Assignment_expressionContext)_localctx).lvalue!=null?(((Assignment_expressionContext)_localctx).lvalue.start):null).getLine() + ": Type mismatch while assigning a value to a variable ");
							((Assignment_expressionContext)_localctx).type =  ((Assignment_expressionContext)_localctx).lvalue.type;
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				conditional_expression();
				 if (TRACEON) System.out.println("assignment_expression: conditional_expression"); ((Assignment_expressionContext)_localctx).type =  ((Assignment_expressionContext)_localctx).conditional_expression.type; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public Type type;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			unary_expression();
			 if (TRACEON) System.out.println("lvalue: unary_expression"); ((LvalueContext)_localctx).type =  ((LvalueContext)_localctx).unary_expression.type; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignment_operator);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(T__8);
				 if (TRACEON) System.out.println("assignment_operator: '='"); 
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(T__24);
				 if (TRACEON) System.out.println("assignment_operator: '*='"); 
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				match(T__25);
				 if (TRACEON) System.out.println("assignment_operator: '/='"); 
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				match(T__26);
				 if (TRACEON) System.out.println("assignment_operator: '\%='"); 
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(564);
				match(T__27);
				 if (TRACEON) System.out.println("assignment_operator: '+='"); 
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(566);
				match(T__28);
				 if (TRACEON) System.out.println("assignment_operator: '-='"); 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(568);
				match(T__29);
				 if (TRACEON) System.out.println("assignment_operator: '<<='"); 
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(570);
				match(T__30);
				 if (TRACEON) System.out.println("assignment_operator: '>>='"); 
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 9);
				{
				setState(572);
				match(T__31);
				 if (TRACEON) System.out.println("assignment_operator: '&='"); 
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 10);
				{
				setState(574);
				match(T__32);
				 if (TRACEON) System.out.println("assignment_operator: '^='"); 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 11);
				{
				setState(576);
				match(T__33);
				 if (TRACEON) System.out.println("assignment_operator: '|='"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Type type;
		public Logical_or_expressionContext con1;
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			((Conditional_expressionContext)_localctx).con1 = logical_or_expression();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(581);
				match(T__34);
				setState(582);
				expression();
				setState(583);
				match(T__35);
				setState(584);
				conditional_expression();
				}
			}


						if(TRACEON)
							System.out.println("conditional_expression: logical_or_expression ('?' expression ':' conditional_expression)?");

						((Conditional_expressionContext)_localctx).type =  ((Conditional_expressionContext)_localctx).con1.type;
						if((((Conditional_expressionContext)_localctx).expression!=null?_input.getText(((Conditional_expressionContext)_localctx).expression.start,((Conditional_expressionContext)_localctx).expression.stop):null) != null) {
							if(((Conditional_expressionContext)_localctx).expression.type != Type.BOOL) {
								System.out.println("Error! " + (((Conditional_expressionContext)_localctx).con1!=null?(((Conditional_expressionContext)_localctx).con1.start):null).getLine() + ": Invalid condition type");
								((Conditional_expressionContext)_localctx).type =  Type.ERROR;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Type type;
		public Logical_and_expressionContext or1;
		public Logical_and_expressionContext or2;
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			((Logical_or_expressionContext)_localctx).or1 = logical_and_expression();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(591);
				match(T__36);
				setState(592);
				((Logical_or_expressionContext)_localctx).or2 = logical_and_expression();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("logical_or_expression: logical_and_expression ('||' logical_and_expression)*");
						
						((Logical_or_expressionContext)_localctx).type =  ((Logical_or_expressionContext)_localctx).or1.type;
						if((((Logical_or_expressionContext)_localctx).or2!=null?_input.getText(((Logical_or_expressionContext)_localctx).or2.start,((Logical_or_expressionContext)_localctx).or2.stop):null) != null) {
							if(((Logical_or_expressionContext)_localctx).or1.type != ((Logical_or_expressionContext)_localctx).or2.type) {
								System.out.println("Error! " + (((Logical_or_expressionContext)_localctx).or1!=null?(((Logical_or_expressionContext)_localctx).or1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((Logical_or_expressionContext)_localctx).type =  Type.ERROR;
							} else {
								((Logical_or_expressionContext)_localctx).type =  Type.BOOL;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Type type;
		public Inclusive_or_expressionContext and1;
		public Inclusive_or_expressionContext and2;
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			((Logical_and_expressionContext)_localctx).and1 = inclusive_or_expression();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(601);
				match(T__37);
				setState(602);
				((Logical_and_expressionContext)_localctx).and2 = inclusive_or_expression();
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("logical_and_expression: inclusive_or_expression ('&&' inclusive_or_expression)*");
						
						((Logical_and_expressionContext)_localctx).type =  ((Logical_and_expressionContext)_localctx).and1.type;
						if((((Logical_and_expressionContext)_localctx).and2!=null?_input.getText(((Logical_and_expressionContext)_localctx).and2.start,((Logical_and_expressionContext)_localctx).and2.stop):null) != null) {
							if(((Logical_and_expressionContext)_localctx).and1.type != ((Logical_and_expressionContext)_localctx).and2.type) {
								System.out.println("Error! " + (((Logical_and_expressionContext)_localctx).and1!=null?(((Logical_and_expressionContext)_localctx).and1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((Logical_and_expressionContext)_localctx).type =  Type.ERROR;
							} else {
								((Logical_and_expressionContext)_localctx).type =  Type.BOOL;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Type type;
		public Exclusive_or_expressionContext eor1;
		public Exclusive_or_expressionContext eor2;
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			((Inclusive_or_expressionContext)_localctx).eor1 = exclusive_or_expression();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(611);
				match(T__38);
				setState(612);
				((Inclusive_or_expressionContext)_localctx).eor2 = exclusive_or_expression();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("inclusive_or_expression: exclusive_or_expression ('|' exclusive_or_expression)*");
						
						((Inclusive_or_expressionContext)_localctx).type =  ((Inclusive_or_expressionContext)_localctx).eor1.type;
						if((((Inclusive_or_expressionContext)_localctx).eor2!=null?_input.getText(((Inclusive_or_expressionContext)_localctx).eor2.start,((Inclusive_or_expressionContext)_localctx).eor2.stop):null) != null) {
							if(((Inclusive_or_expressionContext)_localctx).eor1.type != ((Inclusive_or_expressionContext)_localctx).eor2.type) {
								System.out.println("Error! " + (((Inclusive_or_expressionContext)_localctx).eor1!=null?(((Inclusive_or_expressionContext)_localctx).eor1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((Inclusive_or_expressionContext)_localctx).type =  Type.ERROR;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Type type;
		public And_expressionContext and1;
		public And_expressionContext and2;
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			((Exclusive_or_expressionContext)_localctx).and1 = and_expression();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(621);
				match(T__39);
				setState(622);
				((Exclusive_or_expressionContext)_localctx).and2 = and_expression();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("exclusive_or_expression: and_expression ('^' and_expression)*");
						
						((Exclusive_or_expressionContext)_localctx).type =  ((Exclusive_or_expressionContext)_localctx).and1.type;
						if((((Exclusive_or_expressionContext)_localctx).and2!=null?_input.getText(((Exclusive_or_expressionContext)_localctx).and2.start,((Exclusive_or_expressionContext)_localctx).and2.stop):null) != null) {
							if(((Exclusive_or_expressionContext)_localctx).and1.type != ((Exclusive_or_expressionContext)_localctx).and2.type) {
								System.out.println("Error! " + (((Exclusive_or_expressionContext)_localctx).and1!=null?(((Exclusive_or_expressionContext)_localctx).and1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((Exclusive_or_expressionContext)_localctx).type =  Type.ERROR;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Type type;
		public Equality_expressionContext equal1;
		public Equality_expressionContext equal2;
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			((And_expressionContext)_localctx).equal1 = equality_expression();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(631);
				match(T__21);
				setState(632);
				((And_expressionContext)_localctx).equal2 = equality_expression();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("and_expression: equality_expression ('&' equality_expression)*");

						((And_expressionContext)_localctx).type =  ((And_expressionContext)_localctx).equal1.type;
						if((((And_expressionContext)_localctx).equal2!=null?_input.getText(((And_expressionContext)_localctx).equal2.start,((And_expressionContext)_localctx).equal2.stop):null) != null) {
							if(((And_expressionContext)_localctx).equal1.type != ((And_expressionContext)_localctx).equal2.type) {
								System.out.println("Error! " + (((And_expressionContext)_localctx).equal1!=null?(((And_expressionContext)_localctx).equal1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((And_expressionContext)_localctx).type =  Type.ERROR;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Type type;
		public Relational_expressionContext rel1;
		public Relational_expressionContext rel2;
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			((Equality_expressionContext)_localctx).rel1 = relational_expression();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40 || _la==T__41) {
				{
				{
				setState(641);
				_la = _input.LA(1);
				if ( !(_la==T__40 || _la==T__41) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(642);
				((Equality_expressionContext)_localctx).rel2 = relational_expression();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("equality_expression: relational_expression (('=='|'!=') relational_expression)*");
						// System.out.println((((Equality_expressionContext)_localctx).rel1!=null?_input.getText(((Equality_expressionContext)_localctx).rel1.start,((Equality_expressionContext)_localctx).rel1.stop):null) + " " + ((Equality_expressionContext)_localctx).rel1.type + "___" + (((Equality_expressionContext)_localctx).rel2!=null?_input.getText(((Equality_expressionContext)_localctx).rel2.start,((Equality_expressionContext)_localctx).rel2.stop):null) + " " + ((Equality_expressionContext)_localctx).rel2.type);
						((Equality_expressionContext)_localctx).type =  ((Equality_expressionContext)_localctx).rel1.type;
						if((((Equality_expressionContext)_localctx).rel2!=null?_input.getText(((Equality_expressionContext)_localctx).rel2.start,((Equality_expressionContext)_localctx).rel2.stop):null) != null) {
							if(((Equality_expressionContext)_localctx).rel1.type != ((Equality_expressionContext)_localctx).rel2.type) {
								System.out.println("Error! " + (((Equality_expressionContext)_localctx).rel1!=null?(((Equality_expressionContext)_localctx).rel1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((Equality_expressionContext)_localctx).type =  Type.ERROR;
							} else {
								((Equality_expressionContext)_localctx).type =  Type.BOOL;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Type type;
		public Shift_expressionContext shift1;
		public Shift_expressionContext shift2;
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			((Relational_expressionContext)_localctx).shift1 = shift_expression();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) {
				{
				{
				setState(651);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(652);
				((Relational_expressionContext)_localctx).shift2 = shift_expression();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("relational_expression: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*");

						((Relational_expressionContext)_localctx).type =  ((Relational_expressionContext)_localctx).shift1.type;
						if((((Relational_expressionContext)_localctx).shift2!=null?_input.getText(((Relational_expressionContext)_localctx).shift2.start,((Relational_expressionContext)_localctx).shift2.stop):null) != null) {
							if(((Relational_expressionContext)_localctx).shift1.type != ((Relational_expressionContext)_localctx).shift2.type) {
								System.out.println("Error! " + (((Relational_expressionContext)_localctx).shift1!=null?(((Relational_expressionContext)_localctx).shift1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((Relational_expressionContext)_localctx).type =  Type.ERROR;
							} else {
								((Relational_expressionContext)_localctx).type =  Type.BOOL;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Type type;
		public Additive_expressionContext add1;
		public Additive_expressionContext add2;
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			((Shift_expressionContext)_localctx).add1 = additive_expression();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46 || _la==T__47) {
				{
				{
				setState(661);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(662);
				((Shift_expressionContext)_localctx).add2 = additive_expression();
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
						if(TRACEON)
							System.out.println("shift_expression: additive_expression (('<<'|'>>') additive_expression)*");

						((Shift_expressionContext)_localctx).type =  ((Shift_expressionContext)_localctx).add1.type;
						if((((Shift_expressionContext)_localctx).add2!=null?_input.getText(((Shift_expressionContext)_localctx).add2.start,((Shift_expressionContext)_localctx).add2.stop):null) != null) {
							if(((Shift_expressionContext)_localctx).add1.type != ((Shift_expressionContext)_localctx).add2.type) {
								System.out.println("Error! " + (((Shift_expressionContext)_localctx).add1!=null?(((Shift_expressionContext)_localctx).add1.start):null).getLine() + ": Type mismatch between two side of an operator");
								((Shift_expressionContext)_localctx).type =  Type.ERROR;
							}
						}
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statement);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				labeled_statement();
				 if (TRACEON) System.out.println("statement: labeled_statement;"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				compound_statement();
				 if (TRACEON) System.out.println("statement: compound_statement"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				expression_statement();
				 if (TRACEON) System.out.println("statement: compound_statement"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(679);
				selection_statement();
				 if (TRACEON) System.out.println("statement: selection_statement"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(682);
				iteration_statement();
				 if (TRACEON) System.out.println("statement: iteration_statement"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(685);
				jump_statement();
				 if (TRACEON) System.out.println("statement: jump_statement"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(myCheckerParser.IDENTIFIER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_labeled_statement);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(IDENTIFIER);
				setState(691);
				match(T__35);
				setState(692);
				statement();
				 if (TRACEON) System.out.println("labeled_statement: IDENTIFIER ':' statement"); 
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(T__48);
				setState(696);
				constant_expression();
				setState(697);
				match(T__35);
				setState(698);
				statement();
				 if (TRACEON) System.out.println("labeled_statement: 'case' constant_expression ':' statement"); 
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(701);
				match(T__49);
				setState(702);
				match(T__35);
				setState(703);
				statement();
				 if (TRACEON) System.out.println("labeled_statement: 'default' ':' statement"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__10);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (VOID - 51)) | (1L << (CHAR - 51)) | (1L << (SHORT - 51)) | (1L << (INT - 51)) | (1L << (LONG - 51)) | (1L << (FLOAT - 51)) | (1L << (DOUBLE - 51)) | (1L << (SIGNED - 51)) | (1L << (UNSIGNED - 51)) | (1L << (BOOL - 51)) | (1L << (CONST - 51)) | (1L << (VOLATILE - 51)) | (1L << (EXTERN - 51)) | (1L << (STATIC - 51)) | (1L << (AUTO - 51)) | (1L << (REGISTER - 51)))) != 0)) {
				{
				{
				setState(709);
				declaration();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (SWITCH - 68)) | (1L << (WHILE - 68)) | (1L << (DO - 68)) | (1L << (FOR - 68)) | (1L << (GOTO - 68)) | (1L << (CONTINUE - 68)) | (1L << (BREAK - 68)) | (1L << (RETURN - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHARACTER_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOATING_POINT_LITERAL - 68)))) != 0)) {
				{
				setState(715);
				statement_list();
				}
			}

			setState(718);
			match(T__11);
			 if (TRACEON) System.out.println("compound_statement: '{' declaration* statement_list? '}'"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(721);
				statement();
				}
				}
				setState(724); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IF - 68)) | (1L << (SWITCH - 68)) | (1L << (WHILE - 68)) | (1L << (DO - 68)) | (1L << (FOR - 68)) | (1L << (GOTO - 68)) | (1L << (CONTINUE - 68)) | (1L << (BREAK - 68)) | (1L << (RETURN - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (CHARACTER_LITERAL - 68)) | (1L << (STRING_LITERAL - 68)) | (1L << (DECIMAL_LITERAL - 68)) | (1L << (FLOATING_POINT_LITERAL - 68)))) != 0) );
			 if (TRACEON) System.out.println("statement_list: statement+"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_statementContext extends ParserRuleContext {
		public Type type;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expression_statement);
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(T__7);
				 if (TRACEON) System.out.println("expression_statement: ';'"); ((Expression_statementContext)_localctx).type =  Type.BOOL; 
				}
				break;
			case T__0:
			case T__3:
			case T__12:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__22:
			case T__23:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				expression();
				setState(731);
				match(T__7);
				 if (TRACEON) System.out.println("expression_statement: expression ';'"); ((Expression_statementContext)_localctx).type =  ((Expression_statementContext)_localctx).expression.type; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myCheckerParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(myCheckerParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(myCheckerParser.SWITCH, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selection_statement);
		try {
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(IF);
				setState(737);
				match(T__0);
				setState(738);
				expression();
				setState(739);
				match(T__6);
				setState(740);
				statement();
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(741);
					match(ELSE);
					setState(742);
					statement();
					}
					break;
				}
				 
							if(TRACEON)
								System.out.println("selection_statement: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?");

							if(((Selection_statementContext)_localctx).expression.type != Type.BOOL)
								System.out.println("Error! " + ((Selection_statementContext)_localctx).IF.getLine() + ": Invalid condition type");
						
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				match(SWITCH);
				setState(748);
				match(T__0);
				setState(749);
				expression();
				setState(750);
				match(T__6);
				setState(751);
				statement();
				 if (TRACEON) System.out.println("selection_statement: SWITCH '(' expression ')' statement"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_statementContext extends ParserRuleContext {
		public Expression_statementContext expr2;
		public TerminalNode WHILE() { return getToken(myCheckerParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(myCheckerParser.DO, 0); }
		public TerminalNode FOR() { return getToken(myCheckerParser.FOR, 0); }
		public List<Expression_statementContext> expression_statement() {
			return getRuleContexts(Expression_statementContext.class);
		}
		public Expression_statementContext expression_statement(int i) {
			return getRuleContext(Expression_statementContext.class,i);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_iteration_statement);
		int _la;
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				match(WHILE);
				setState(757);
				match(T__0);
				setState(758);
				expression();
				setState(759);
				match(T__6);
				setState(760);
				statement();
				 
							if(TRACEON)
								System.out.println("iteration_statement: WHILE '(' expression ')' statement");

							if(((Iteration_statementContext)_localctx).expression.type != Type.BOOL)
								System.out.println("Error! " + ((Iteration_statementContext)_localctx).WHILE.getLine() + ": Invalid condition type");
						
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				match(DO);
				setState(764);
				statement();
				setState(765);
				match(WHILE);
				setState(766);
				match(T__0);
				setState(767);
				expression();
				setState(768);
				match(T__6);
				setState(769);
				match(T__7);
				 
							if(TRACEON)
								System.out.println("iteration_statement: DO statement WHILE '(' expression ')' ';'");
							
							if(((Iteration_statementContext)_localctx).expression.type != Type.BOOL)
								System.out.println("Error! " + ((Iteration_statementContext)_localctx).DO.getLine() + ": Invalid condition type");
						
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(FOR);
				setState(773);
				match(T__0);
				setState(774);
				expression_statement();
				setState(775);
				((Iteration_statementContext)_localctx).expr2 = expression_statement();
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (IDENTIFIER - 78)) | (1L << (CHARACTER_LITERAL - 78)) | (1L << (STRING_LITERAL - 78)) | (1L << (DECIMAL_LITERAL - 78)) | (1L << (FLOATING_POINT_LITERAL - 78)))) != 0)) {
					{
					setState(776);
					expression();
					}
				}

				setState(779);
				match(T__6);
				setState(780);
				statement();
				 
							if(TRACEON)
								System.out.println("iteration_statement: FOR '(' expression_statement expression_statement expression? ')' statement");

							if(((Iteration_statementContext)_localctx).expr2.type != Type.BOOL)
								System.out.println("Error! " + (((Iteration_statementContext)_localctx).expr2!=null?(((Iteration_statementContext)_localctx).expr2.start):null).getLine() + ": Invalid condition type");
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(myCheckerParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(myCheckerParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(myCheckerParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(myCheckerParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(myCheckerParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jump_statement);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				match(GOTO);
				setState(786);
				match(IDENTIFIER);
				setState(787);
				match(T__7);
				 if (TRACEON) System.out.println("jump_statement: GOTO IDENTIFIER ';'"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(CONTINUE);
				setState(790);
				match(T__7);
				 if (TRACEON) System.out.println("jump_statement: CONTINUE ';'"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				match(BREAK);
				setState(793);
				match(T__7);
				 if (TRACEON) System.out.println("jump_statement: BREAK ';'"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				match(RETURN);
				setState(796);
				match(T__7);
				 if (TRACEON) System.out.println("jump_statement: RETURN ';'"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				match(RETURN);
				setState(799);
				expression();
				setState(800);
				match(T__7);
				 if (TRACEON) System.out.println("jump_statement: RETURN expression ';'"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u0328\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\5\2t\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\177\n\2\3\2\3\2\6\2\u0083\n\2\r\2\16"+
		"\2\u0084\3\2\3\2\3\2\5\2\u008a\n\2\3\2\3\2\3\3\3\3\5\3\u0090\n\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\7\4\u0098\n\4\f\4\16\4\u009b\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5\u00a2\n\5\3\5\3\5\3\6\3\6\3\6\6\6\u00a9\n\6\r\6\16\6\u00aa\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7\u00b3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00bd\n\b\3\t\3\t\5\t\u00c1\n\t\3\t\3\t\3\n\3\n\6\n\u00c7\n\n\r\n\16"+
		"\n\u00c8\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e1\n\13\3\f\5\f"+
		"\u00e4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ec\n\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00f3\n\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0112\n\16\3\17\3\17\6\17\u0116\n\17\r\17"+
		"\16\17\u0117\3\17\5\17\u011b\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0125\n\17\3\20\3\20\3\20\5\20\u012a\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\7\21\u0131\n\21\f\21\16\21\u0134\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\7\22\u013b\n\22\f\22\16\22\u013e\13\22\3\22\3\22\3\23\3\23\3\23\7\23"+
		"\u0145\n\23\f\23\16\23\u0148\13\23\3\23\3\23\3\24\3\24\5\24\u014e\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0155\n\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u015c\n\25\3\25\7\25\u015f\n\25\f\25\16\25\u0162\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0176\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017e\n\27\3"+
		"\27\3\27\3\27\5\27\u0183\n\27\3\30\3\30\3\30\7\30\u0188\n\30\f\30\16\30"+
		"\u018b\13\30\3\30\3\30\3\31\3\31\3\31\7\31\u0192\n\31\f\31\16\31\u0195"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u019e\n\32\f\32\16\32\u01a1"+
		"\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01ac\n\33\f"+
		"\33\16\33\u01af\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u01bc\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01d7\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01ea\n\36\f\36\16\36\u01ed\13"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u01fd\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0209\n \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u0213\n!\3\"\3\"\3\"\7\"\u0218\n\"\f\"\16\"\u021b"+
		"\13\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u022a\n$\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0245"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u024d\n\'\3\'\3\'\3(\3(\3(\7(\u0254\n"+
		"(\f(\16(\u0257\13(\3(\3(\3)\3)\3)\7)\u025e\n)\f)\16)\u0261\13)\3)\3)\3"+
		"*\3*\3*\7*\u0268\n*\f*\16*\u026b\13*\3*\3*\3+\3+\3+\7+\u0272\n+\f+\16"+
		"+\u0275\13+\3+\3+\3,\3,\3,\7,\u027c\n,\f,\16,\u027f\13,\3,\3,\3-\3-\3"+
		"-\7-\u0286\n-\f-\16-\u0289\13-\3-\3-\3.\3.\3.\7.\u0290\n.\f.\16.\u0293"+
		"\13.\3.\3.\3/\3/\3/\7/\u029a\n/\f/\16/\u029d\13/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u02b3\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02c5\n\61\3\62\3\62\7\62\u02c9\n"+
		"\62\f\62\16\62\u02cc\13\62\3\62\5\62\u02cf\n\62\3\62\3\62\3\62\3\63\6"+
		"\63\u02d5\n\63\r\63\16\63\u02d6\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u02e1\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02ea\n\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02f5\n\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u030c\n\66\3\66\3\66\3\66\3\66\5\66\u0312"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0326\n\67\3\67\2\28\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"l\2\6\4\2\65\6588\3\2+,\3\2-\60\3\2\61\62\2\u036d\2n\3\2\2\2\4\u008d\3"+
		"\2\2\2\6\u0094\3\2\2\2\b\u009e\3\2\2\2\n\u00a8\3\2\2\2\f\u00b2\3\2\2\2"+
		"\16\u00bc\3\2\2\2\20\u00be\3\2\2\2\22\u00c6\3\2\2\2\24\u00e0\3\2\2\2\26"+
		"\u00eb\3\2\2\2\30\u00f2\3\2\2\2\32\u0111\3\2\2\2\34\u0124\3\2\2\2\36\u0126"+
		"\3\2\2\2 \u012d\3\2\2\2\"\u0137\3\2\2\2$\u0141\3\2\2\2&\u0154\3\2\2\2"+
		"(\u015b\3\2\2\2*\u0175\3\2\2\2,\u0182\3\2\2\2.\u0184\3\2\2\2\60\u018e"+
		"\3\2\2\2\62\u0198\3\2\2\2\64\u01a4\3\2\2\2\66\u01bb\3\2\2\28\u01d6\3\2"+
		"\2\2:\u01d8\3\2\2\2<\u01fc\3\2\2\2>\u0208\3\2\2\2@\u0212\3\2\2\2B\u0214"+
		"\3\2\2\2D\u021e\3\2\2\2F\u0229\3\2\2\2H\u022b\3\2\2\2J\u0244\3\2\2\2L"+
		"\u0246\3\2\2\2N\u0250\3\2\2\2P\u025a\3\2\2\2R\u0264\3\2\2\2T\u026e\3\2"+
		"\2\2V\u0278\3\2\2\2X\u0282\3\2\2\2Z\u028c\3\2\2\2\\\u0296\3\2\2\2^\u02b2"+
		"\3\2\2\2`\u02c4\3\2\2\2b\u02c6\3\2\2\2d\u02d4\3\2\2\2f\u02e0\3\2\2\2h"+
		"\u02f4\3\2\2\2j\u0311\3\2\2\2l\u0325\3\2\2\2no\t\2\2\2op\7E\2\2ps\7\3"+
		"\2\2qr\78\2\2rt\7P\2\2sq\3\2\2\2st\3\2\2\2t~\3\2\2\2uv\7\4\2\2vw\7\66"+
		"\2\2wx\7\5\2\2x\177\7P\2\2yz\7\66\2\2z{\7\6\2\2{|\7P\2\2|}\7\7\2\2}\177"+
		"\7\b\2\2~u\3\2\2\2~y\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0089"+
		"\7\t\2\2\u0081\u0083\5\4\3\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5b"+
		"\62\2\u0087\u008a\3\2\2\2\u0088\u008a\5b\62\2\u0089\u0082\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\2\1\2\u008c\3\3\2\2\2"+
		"\u008d\u008f\5\n\6\2\u008e\u0090\5\6\4\2\u008f\u008e\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\n\2\2\u0092\u0093\b\3\1\2\u0093"+
		"\5\3\2\2\2\u0094\u0099\5\b\5\2\u0095\u0096\7\4\2\2\u0096\u0098\5\b\5\2"+
		"\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\b\4\1\2\u009d"+
		"\7\3\2\2\2\u009e\u00a1\5\26\f\2\u009f\u00a0\7\13\2\2\u00a0\u00a2\5,\27"+
		"\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\b\5\1\2\u00a4\t\3\2\2\2\u00a5\u00a9\5\16\b\2\u00a6\u00a9\5\24\13\2\u00a7"+
		"\u00a9\5\f\7\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\b\6\1\2\u00ad\13\3\2\2\2\u00ae\u00af\7?\2\2"+
		"\u00af\u00b3\b\7\1\2\u00b0\u00b1\7@\2\2\u00b1\u00b3\b\7\1\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\r\3\2\2\2\u00b4\u00b5\7A\2\2\u00b5"+
		"\u00bd\b\b\1\2\u00b6\u00b7\7B\2\2\u00b7\u00bd\b\b\1\2\u00b8\u00b9\7C\2"+
		"\2\u00b9\u00bd\b\b\1\2\u00ba\u00bb\7D\2\2\u00bb\u00bd\b\b\1\2\u00bc\u00b4"+
		"\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\17\3\2\2\2\u00be\u00c0\5\22\n\2\u00bf\u00c1\5&\24\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\t\1\2\u00c3\21"+
		"\3\2\2\2\u00c4\u00c7\5\f\7\2\u00c5\u00c7\5\24\13\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\n\1\2\u00cb\23\3\2\2\2\u00cc"+
		"\u00cd\7\65\2\2\u00cd\u00e1\b\13\1\2\u00ce\u00cf\7\66\2\2\u00cf\u00e1"+
		"\b\13\1\2\u00d0\u00d1\7\67\2\2\u00d1\u00e1\b\13\1\2\u00d2\u00d3\78\2\2"+
		"\u00d3\u00e1\b\13\1\2\u00d4\u00d5\79\2\2\u00d5\u00e1\b\13\1\2\u00d6\u00d7"+
		"\7:\2\2\u00d7\u00e1\b\13\1\2\u00d8\u00d9\7;\2\2\u00d9\u00e1\b\13\1\2\u00da"+
		"\u00db\7<\2\2\u00db\u00e1\b\13\1\2\u00dc\u00dd\7=\2\2\u00dd\u00e1\b\13"+
		"\1\2\u00de\u00df\7>\2\2\u00df\u00e1\b\13\1\2\u00e0\u00cc\3\2\2\2\u00e0"+
		"\u00ce\3\2\2\2\u00e0\u00d0\3\2\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d4\3\2"+
		"\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0"+
		"\u00dc\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e4\5\34\17"+
		"\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\5\30\r\2\u00e6\u00e7\b\f\1\2\u00e7\u00ec\3\2\2\2\u00e8\u00e9\5\34\17"+
		"\2\u00e9\u00ea\b\f\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e8"+
		"\3\2\2\2\u00ec\27\3\2\2\2\u00ed\u00f3\7P\2\2\u00ee\u00ef\7\3\2\2\u00ef"+
		"\u00f0\5\26\f\2\u00f0\u00f1\7\t\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ed\3"+
		"\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\5\32\16\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\r\1\2\u00fb"+
		"\31\3\2\2\2\u00fc\u00fd\7\7\2\2\u00fd\u00fe\5D#\2\u00fe\u00ff\7\b\2\2"+
		"\u00ff\u0100\b\16\1\2\u0100\u0112\3\2\2\2\u0101\u0102\7\7\2\2\u0102\u0103"+
		"\7\b\2\2\u0103\u0112\b\16\1\2\u0104\u0105\7\3\2\2\u0105\u0106\5\36\20"+
		"\2\u0106\u0107\7\t\2\2\u0107\u0108\b\16\1\2\u0108\u0112\3\2\2\2\u0109"+
		"\u010a\7\3\2\2\u010a\u010b\5$\23\2\u010b\u010c\7\t\2\2\u010c\u010d\b\16"+
		"\1\2\u010d\u0112\3\2\2\2\u010e\u010f\7\3\2\2\u010f\u0110\7\t\2\2\u0110"+
		"\u0112\b\16\1\2\u0111\u00fc\3\2\2\2\u0111\u0101\3\2\2\2\u0111\u0104\3"+
		"\2\2\2\u0111\u0109\3\2\2\2\u0111\u010e\3\2\2\2\u0112\33\3\2\2\2\u0113"+
		"\u0115\7\6\2\2\u0114\u0116\5\f\7\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u011b\5\34\17\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3"+
		"\2\2\2\u011c\u011d\b\17\1\2\u011d\u0125\3\2\2\2\u011e\u011f\7\6\2\2\u011f"+
		"\u0120\5\34\17\2\u0120\u0121\b\17\1\2\u0121\u0125\3\2\2\2\u0122\u0123"+
		"\7\6\2\2\u0123\u0125\b\17\1\2\u0124\u0113\3\2\2\2\u0124\u011e\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0125\35\3\2\2\2\u0126\u0129\5 \21\2\u0127\u0128"+
		"\7\4\2\2\u0128\u012a\7\f\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\b\20\1\2\u012c\37\3\2\2\2\u012d\u0132\5\"\22"+
		"\2\u012e\u012f\7\4\2\2\u012f\u0131\5\"\22\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b\21\1\2\u0136!\3\2\2\2\u0137\u013c"+
		"\5\n\6\2\u0138\u013b\5\26\f\2\u0139\u013b\5&\24\2\u013a\u0138\3\2\2\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\b\22\1\2"+
		"\u0140#\3\2\2\2\u0141\u0146\7P\2\2\u0142\u0143\7\4\2\2\u0143\u0145\7P"+
		"\2\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\b\23"+
		"\1\2\u014a%\3\2\2\2\u014b\u014d\5\34\17\2\u014c\u014e\5(\25\2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b\24\1\2"+
		"\u0150\u0155\3\2\2\2\u0151\u0152\5(\25\2\u0152\u0153\b\24\1\2\u0153\u0155"+
		"\3\2\2\2\u0154\u014b\3\2\2\2\u0154\u0151\3\2\2\2\u0155\'\3\2\2\2\u0156"+
		"\u0157\7\3\2\2\u0157\u0158\5&\24\2\u0158\u0159\7\t\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u015c\5*\26\2\u015b\u0156\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u0160\3\2\2\2\u015d\u015f\5*\26\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0164\b\25\1\2\u0164)\3\2\2\2\u0165\u0166\7\7\2\2"+
		"\u0166\u0167\7\b\2\2\u0167\u0176\b\26\1\2\u0168\u0169\7\7\2\2\u0169\u016a"+
		"\5D#\2\u016a\u016b\7\b\2\2\u016b\u016c\b\26\1\2\u016c\u0176\3\2\2\2\u016d"+
		"\u016e\7\3\2\2\u016e\u016f\7\t\2\2\u016f\u0176\b\26\1\2\u0170\u0171\7"+
		"\3\2\2\u0171\u0172\5\36\20\2\u0172\u0173\7\t\2\2\u0173\u0174\b\26\1\2"+
		"\u0174\u0176\3\2\2\2\u0175\u0165\3\2\2\2\u0175\u0168\3\2\2\2\u0175\u016d"+
		"\3\2\2\2\u0175\u0170\3\2\2\2\u0176+\3\2\2\2\u0177\u0178\5F$\2\u0178\u0179"+
		"\b\27\1\2\u0179\u0183\3\2\2\2\u017a\u017b\7\r\2\2\u017b\u017d\5.\30\2"+
		"\u017c\u017e\7\4\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0180\7\16\2\2\u0180\u0181\b\27\1\2\u0181\u0183\3\2\2\2"+
		"\u0182\u0177\3\2\2\2\u0182\u017a\3\2\2\2\u0183-\3\2\2\2\u0184\u0189\5"+
		",\27\2\u0185\u0186\7\4\2\2\u0186\u0188\5,\27\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018d\b\30\1\2\u018d/\3\2\2\2\u018e\u0193"+
		"\5F$\2\u018f\u0190\7\4\2\2\u0190\u0192\5F$\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u0197\b\31\1\2\u0197\61\3\2\2\2\u0198\u019f"+
		"\5\64\33\2\u0199\u019a\7\17\2\2\u019a\u019e\5\64\33\2\u019b\u019c\7\20"+
		"\2\2\u019c\u019e\5\64\33\2\u019d\u0199\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b\32\1\2\u01a3\63\3\2\2\2\u01a4\u01ad"+
		"\5\66\34\2\u01a5\u01a6\7\6\2\2\u01a6\u01ac\5\66\34\2\u01a7\u01a8\7\21"+
		"\2\2\u01a8\u01ac\5\66\34\2\u01a9\u01aa\7\22\2\2\u01aa\u01ac\5\66\34\2"+
		"\u01ab\u01a5\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01af"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01b1\b\33\1\2\u01b1\65\3\2\2\2\u01b2\u01b3\7\3\2"+
		"\2\u01b3\u01b4\5\20\t\2\u01b4\u01b5\7\t\2\2\u01b5\u01b6\5\66\34\2\u01b6"+
		"\u01b7\b\34\1\2\u01b7\u01bc\3\2\2\2\u01b8\u01b9\58\35\2\u01b9\u01ba\b"+
		"\34\1\2\u01ba\u01bc\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bc"+
		"\67\3\2\2\2\u01bd\u01be\5:\36\2\u01be\u01bf\b\35\1\2\u01bf\u01d7\3\2\2"+
		"\2\u01c0\u01c1\7\23\2\2\u01c1\u01c2\58\35\2\u01c2\u01c3\b\35\1\2\u01c3"+
		"\u01d7\3\2\2\2\u01c4\u01c5\7\24\2\2\u01c5\u01c6\58\35\2\u01c6\u01c7\b"+
		"\35\1\2\u01c7\u01d7\3\2\2\2\u01c8\u01c9\5<\37\2\u01c9\u01ca\5\66\34\2"+
		"\u01ca\u01cb\b\35\1\2\u01cb\u01d7\3\2\2\2\u01cc\u01cd\7\25\2\2\u01cd\u01ce"+
		"\58\35\2\u01ce\u01cf\b\35\1\2\u01cf\u01d7\3\2\2\2\u01d0\u01d1\7\25\2\2"+
		"\u01d1\u01d2\7\3\2\2\u01d2\u01d3\5\20\t\2\u01d3\u01d4\7\t\2\2\u01d4\u01d5"+
		"\b\35\1\2\u01d5\u01d7\3\2\2\2\u01d6\u01bd\3\2\2\2\u01d6\u01c0\3\2\2\2"+
		"\u01d6\u01c4\3\2\2\2\u01d6\u01c8\3\2\2\2\u01d6\u01cc\3\2\2\2\u01d6\u01d0"+
		"\3\2\2\2\u01d79\3\2\2\2\u01d8\u01eb\5> \2\u01d9\u01da\7\7\2\2\u01da\u01db"+
		"\5B\"\2\u01db\u01dc\7\b\2\2\u01dc\u01ea\3\2\2\2\u01dd\u01de\7\3\2\2\u01de"+
		"\u01ea\7\t\2\2\u01df\u01e0\7\3\2\2\u01e0\u01e1\5\60\31\2\u01e1\u01e2\7"+
		"\t\2\2\u01e2\u01ea\3\2\2\2\u01e3\u01e4\7\26\2\2\u01e4\u01ea\7P\2\2\u01e5"+
		"\u01e6\7\27\2\2\u01e6\u01ea\7P\2\2\u01e7\u01ea\7\23\2\2\u01e8\u01ea\7"+
		"\24\2\2\u01e9\u01d9\3\2\2\2\u01e9\u01dd\3\2\2\2\u01e9\u01df\3\2\2\2\u01e9"+
		"\u01e3\3\2\2\2\u01e9\u01e5\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2"+
		"\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\b\36\1\2\u01ef;\3\2\2\2"+
		"\u01f0\u01f1\7\30\2\2\u01f1\u01fd\b\37\1\2\u01f2\u01f3\7\6\2\2\u01f3\u01fd"+
		"\b\37\1\2\u01f4\u01f5\7\17\2\2\u01f5\u01fd\b\37\1\2\u01f6\u01f7\7\20\2"+
		"\2\u01f7\u01fd\b\37\1\2\u01f8\u01f9\7\31\2\2\u01f9\u01fd\b\37\1\2\u01fa"+
		"\u01fb\7\32\2\2\u01fb\u01fd\b\37\1\2\u01fc\u01f0\3\2\2\2\u01fc\u01f2\3"+
		"\2\2\2\u01fc\u01f4\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd=\3\2\2\2\u01fe\u01ff\7P\2\2\u01ff\u0209\b \1\2\u0200"+
		"\u0201\5@!\2\u0201\u0202\b \1\2\u0202\u0209\3\2\2\2\u0203\u0204\7\3\2"+
		"\2\u0204\u0205\5B\"\2\u0205\u0206\7\t\2\2\u0206\u0207\b \1\2\u0207\u0209"+
		"\3\2\2\2\u0208\u01fe\3\2\2\2\u0208\u0200\3\2\2\2\u0208\u0203\3\2\2\2\u0209"+
		"?\3\2\2\2\u020a\u020b\7S\2\2\u020b\u0213\b!\1\2\u020c\u020d\7Q\2\2\u020d"+
		"\u0213\b!\1\2\u020e\u020f\7R\2\2\u020f\u0213\b!\1\2\u0210\u0211\7T\2\2"+
		"\u0211\u0213\b!\1\2\u0212\u020a\3\2\2\2\u0212\u020c\3\2\2\2\u0212\u020e"+
		"\3\2\2\2\u0212\u0210\3\2\2\2\u0213A\3\2\2\2\u0214\u0219\5F$\2\u0215\u0216"+
		"\7\4\2\2\u0216\u0218\5F$\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021c\u021d\b\"\1\2\u021dC\3\2\2\2\u021e\u021f\5L\'\2\u021f\u0220"+
		"\b#\1\2\u0220E\3\2\2\2\u0221\u0222\5H%\2\u0222\u0223\5J&\2\u0223\u0224"+
		"\5F$\2\u0224\u0225\b$\1\2\u0225\u022a\3\2\2\2\u0226\u0227\5L\'\2\u0227"+
		"\u0228\b$\1\2\u0228\u022a\3\2\2\2\u0229\u0221\3\2\2\2\u0229\u0226\3\2"+
		"\2\2\u022aG\3\2\2\2\u022b\u022c\58\35\2\u022c\u022d\b%\1\2\u022dI\3\2"+
		"\2\2\u022e\u022f\7\13\2\2\u022f\u0245\b&\1\2\u0230\u0231\7\33\2\2\u0231"+
		"\u0245\b&\1\2\u0232\u0233\7\34\2\2\u0233\u0245\b&\1\2\u0234\u0235\7\35"+
		"\2\2\u0235\u0245\b&\1\2\u0236\u0237\7\36\2\2\u0237\u0245\b&\1\2\u0238"+
		"\u0239\7\37\2\2\u0239\u0245\b&\1\2\u023a\u023b\7 \2\2\u023b\u0245\b&\1"+
		"\2\u023c\u023d\7!\2\2\u023d\u0245\b&\1\2\u023e\u023f\7\"\2\2\u023f\u0245"+
		"\b&\1\2\u0240\u0241\7#\2\2\u0241\u0245\b&\1\2\u0242\u0243\7$\2\2\u0243"+
		"\u0245\b&\1\2\u0244\u022e\3\2\2\2\u0244\u0230\3\2\2\2\u0244\u0232\3\2"+
		"\2\2\u0244\u0234\3\2\2\2\u0244\u0236\3\2\2\2\u0244\u0238\3\2\2\2\u0244"+
		"\u023a\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u023e\3\2\2\2\u0244\u0240\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0245K\3\2\2\2\u0246\u024c\5N(\2\u0247\u0248"+
		"\7%\2\2\u0248\u0249\5B\"\2\u0249\u024a\7&\2\2\u024a\u024b\5L\'\2\u024b"+
		"\u024d\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u024f\b\'\1\2\u024fM\3\2\2\2\u0250\u0255\5P)\2\u0251\u0252"+
		"\7\'\2\2\u0252\u0254\5P)\2\u0253\u0251\3\2\2\2\u0254\u0257\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0258\u0259\b(\1\2\u0259O\3\2\2\2\u025a\u025f\5R*\2\u025b\u025c\7"+
		"(\2\2\u025c\u025e\5R*\2\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2"+
		"\2\2\u0262\u0263\b)\1\2\u0263Q\3\2\2\2\u0264\u0269\5T+\2\u0265\u0266\7"+
		")\2\2\u0266\u0268\5T+\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026c\u026d\b*\1\2\u026dS\3\2\2\2\u026e\u0273\5V,\2\u026f\u0270\7"+
		"*\2\2\u0270\u0272\5V,\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0276\u0277\b+\1\2\u0277U\3\2\2\2\u0278\u027d\5X-\2\u0279\u027a\7"+
		"\30\2\2\u027a\u027c\5X-\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0281\b,\1\2\u0281W\3\2\2\2\u0282\u0287\5Z.\2\u0283\u0284\t"+
		"\3\2\2\u0284\u0286\5Z.\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2"+
		"\2\2\u028a\u028b\b-\1\2\u028bY\3\2\2\2\u028c\u0291\5\\/\2\u028d\u028e"+
		"\t\4\2\2\u028e\u0290\5\\/\2\u028f\u028d\3\2\2\2\u0290\u0293\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0294\u0295\b.\1\2\u0295[\3\2\2\2\u0296\u029b\5\62\32\2\u0297\u0298"+
		"\t\5\2\2\u0298\u029a\5\62\32\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2"+
		"\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b"+
		"\3\2\2\2\u029e\u029f\b/\1\2\u029f]\3\2\2\2\u02a0\u02a1\5`\61\2\u02a1\u02a2"+
		"\b\60\1\2\u02a2\u02b3\3\2\2\2\u02a3\u02a4\5b\62\2\u02a4\u02a5\b\60\1\2"+
		"\u02a5\u02b3\3\2\2\2\u02a6\u02a7\5f\64\2\u02a7\u02a8\b\60\1\2\u02a8\u02b3"+
		"\3\2\2\2\u02a9\u02aa\5h\65\2\u02aa\u02ab\b\60\1\2\u02ab\u02b3\3\2\2\2"+
		"\u02ac\u02ad\5j\66\2\u02ad\u02ae\b\60\1\2\u02ae\u02b3\3\2\2\2\u02af\u02b0"+
		"\5l\67\2\u02b0\u02b1\b\60\1\2\u02b1\u02b3\3\2\2\2\u02b2\u02a0\3\2\2\2"+
		"\u02b2\u02a3\3\2\2\2\u02b2\u02a6\3\2\2\2\u02b2\u02a9\3\2\2\2\u02b2\u02ac"+
		"\3\2\2\2\u02b2\u02af\3\2\2\2\u02b3_\3\2\2\2\u02b4\u02b5\7P\2\2\u02b5\u02b6"+
		"\7&\2\2\u02b6\u02b7\5^\60\2\u02b7\u02b8\b\61\1\2\u02b8\u02c5\3\2\2\2\u02b9"+
		"\u02ba\7\63\2\2\u02ba\u02bb\5D#\2\u02bb\u02bc\7&\2\2\u02bc\u02bd\5^\60"+
		"\2\u02bd\u02be\b\61\1\2\u02be\u02c5\3\2\2\2\u02bf\u02c0\7\64\2\2\u02c0"+
		"\u02c1\7&\2\2\u02c1\u02c2\5^\60\2\u02c2\u02c3\b\61\1\2\u02c3\u02c5\3\2"+
		"\2\2\u02c4\u02b4\3\2\2\2\u02c4\u02b9\3\2\2\2\u02c4\u02bf\3\2\2\2\u02c5"+
		"a\3\2\2\2\u02c6\u02ca\7\r\2\2\u02c7\u02c9\5\4\3\2\u02c8\u02c7\3\2\2\2"+
		"\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02ce"+
		"\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02cf\5d\63\2\u02ce\u02cd\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7\16\2\2\u02d1\u02d2\b"+
		"\62\1\2\u02d2c\3\2\2\2\u02d3\u02d5\5^\60\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02d9\b\63\1\2\u02d9e\3\2\2\2\u02da\u02db\7\n\2\2\u02db\u02e1\b\64\1"+
		"\2\u02dc\u02dd\5B\"\2\u02dd\u02de\7\n\2\2\u02de\u02df\b\64\1\2\u02df\u02e1"+
		"\3\2\2\2\u02e0\u02da\3\2\2\2\u02e0\u02dc\3\2\2\2\u02e1g\3\2\2\2\u02e2"+
		"\u02e3\7F\2\2\u02e3\u02e4\7\3\2\2\u02e4\u02e5\5B\"\2\u02e5\u02e6\7\t\2"+
		"\2\u02e6\u02e9\5^\60\2\u02e7\u02e8\7G\2\2\u02e8\u02ea\5^\60\2\u02e9\u02e7"+
		"\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\b\65\1\2"+
		"\u02ec\u02f5\3\2\2\2\u02ed\u02ee\7H\2\2\u02ee\u02ef\7\3\2\2\u02ef\u02f0"+
		"\5B\"\2\u02f0\u02f1\7\t\2\2\u02f1\u02f2\5^\60\2\u02f2\u02f3\b\65\1\2\u02f3"+
		"\u02f5\3\2\2\2\u02f4\u02e2\3\2\2\2\u02f4\u02ed\3\2\2\2\u02f5i\3\2\2\2"+
		"\u02f6\u02f7\7I\2\2\u02f7\u02f8\7\3\2\2\u02f8\u02f9\5B\"\2\u02f9\u02fa"+
		"\7\t\2\2\u02fa\u02fb\5^\60\2\u02fb\u02fc\b\66\1\2\u02fc\u0312\3\2\2\2"+
		"\u02fd\u02fe\7J\2\2\u02fe\u02ff\5^\60\2\u02ff\u0300\7I\2\2\u0300\u0301"+
		"\7\3\2\2\u0301\u0302\5B\"\2\u0302\u0303\7\t\2\2\u0303\u0304\7\n\2\2\u0304"+
		"\u0305\b\66\1\2\u0305\u0312\3\2\2\2\u0306\u0307\7K\2\2\u0307\u0308\7\3"+
		"\2\2\u0308\u0309\5f\64\2\u0309\u030b\5f\64\2\u030a\u030c\5B\"\2\u030b"+
		"\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\7\t"+
		"\2\2\u030e\u030f\5^\60\2\u030f\u0310\b\66\1\2\u0310\u0312\3\2\2\2\u0311"+
		"\u02f6\3\2\2\2\u0311\u02fd\3\2\2\2\u0311\u0306\3\2\2\2\u0312k\3\2\2\2"+
		"\u0313\u0314\7L\2\2\u0314\u0315\7P\2\2\u0315\u0316\7\n\2\2\u0316\u0326"+
		"\b\67\1\2\u0317\u0318\7M\2\2\u0318\u0319\7\n\2\2\u0319\u0326\b\67\1\2"+
		"\u031a\u031b\7N\2\2\u031b\u031c\7\n\2\2\u031c\u0326\b\67\1\2\u031d\u031e"+
		"\7O\2\2\u031e\u031f\7\n\2\2\u031f\u0326\b\67\1\2\u0320\u0321\7O\2\2\u0321"+
		"\u0322\5B\"\2\u0322\u0323\7\n\2\2\u0323\u0324\b\67\1\2\u0324\u0326\3\2"+
		"\2\2\u0325\u0313\3\2\2\2\u0325\u0317\3\2\2\2\u0325\u031a\3\2\2\2\u0325"+
		"\u031d\3\2\2\2\u0325\u0320\3\2\2\2\u0326m\3\2\2\2Is~\u0084\u0089\u008f"+
		"\u0099\u00a1\u00a8\u00aa\u00b2\u00bc\u00c0\u00c6\u00c8\u00e0\u00e3\u00eb"+
		"\u00f2\u00f7\u0111\u0117\u011a\u0124\u0129\u0132\u013a\u013c\u0146\u014d"+
		"\u0154\u015b\u0160\u0175\u017d\u0182\u0189\u0193\u019d\u019f\u01ab\u01ad"+
		"\u01bb\u01d6\u01e9\u01eb\u01fc\u0208\u0212\u0219\u0229\u0244\u024c\u0255"+
		"\u025f\u0269\u0273\u027d\u0287\u0291\u029b\u02b2\u02c4\u02ca\u02ce\u02d6"+
		"\u02e0\u02e9\u02f4\u030b\u0311\u0325";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}