// Generated from c:\Users\User\workspace\ccu_compiler\hw2\myC_new.g by ANTLR 4.9.2

    // import packages here.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myC_newParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VOID=11, INT=12, CHAR=13, FLOAT=14, DOUBLE=15, BOOL=16, COMPLEX=17, 
		IMAGINARY=18, MAIN=19, IF=20, ELSE=21, Identifier=22, Integer_constant=23, 
		Floating_point_constant=24, WS=25, COMMENT=26;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_type = 2, RULE_statements = 3, 
		RULE_arith_expression = 4, RULE_multExpr = 5, RULE_signExpr = 6, RULE_primaryExpr = 7, 
		RULE_statement = 8, RULE_compound_stmt = 9, RULE_selection_stmt = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "type", "statements", "arith_expression", 
			"multExpr", "signExpr", "primaryExpr", "statement", "compound_stmt", 
			"selection_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'void'", "'int'", "'char'", "'float'", "'double'", "'boolean'", 
			"'complex'", "'imaginary'", "'main'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VOID", 
			"INT", "CHAR", "FLOAT", "DOUBLE", "BOOL", "COMPLEX", "IMAGINARY", "MAIN", 
			"IF", "ELSE", "Identifier", "Integer_constant", "Floating_point_constant", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "myC_new.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myC_newParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(myC_newParser.MAIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode VOID() { return getToken(myC_newParser.VOID, 0); }
		public TerminalNode INT() { return getToken(myC_newParser.INT, 0); }
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
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(23);
			match(MAIN);
			setState(24);
			match(T__0);
			setState(25);
			match(T__1);
			setState(26);
			match(T__2);
			setState(27);
			declarations();
			setState(28);
			statements();
			setState(29);
			match(T__3);
			 if (TRACEON) System.out.println("program: (VOID | INT) MAIN () {declarations statements}"); 
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case CHAR:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case COMPLEX:
			case IMAGINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				type();
				setState(33);
				match(Identifier);
				setState(34);
				match(T__4);
				setState(35);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier ; declarations"); 
				}
				break;
			case T__2:
			case T__3:
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				 if (TRACEON) System.out.println("declarations: "); 
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myC_newParser.VOID, 0); }
		public TerminalNode INT() { return getToken(myC_newParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(myC_newParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(myC_newParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(myC_newParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(myC_newParser.BOOL, 0); }
		public TerminalNode COMPLEX() { return getToken(myC_newParser.COMPLEX, 0); }
		public TerminalNode IMAGINARY() { return getToken(myC_newParser.IMAGINARY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(VOID);
				 if (TRACEON) System.out.println("type: VOID"); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(CHAR);
				 if (TRACEON) System.out.println("type: CHAR"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(FLOAT);
				 if (TRACEON) System.out.println("type: FLOAT"); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(DOUBLE);
				 if (TRACEON) System.out.println("type: DOUBLE"); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(BOOL);
				 if (TRACEON) System.out.println("type: BOOL"); 
				}
				break;
			case COMPLEX:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				match(COMPLEX);
				 if (TRACEON) System.out.println("type: COMPLEX"); 
				}
				break;
			case IMAGINARY:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				match(IMAGINARY);
				 if (TRACEON) System.out.println("type: IMAGINARY"); 
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				statement();
				setState(60);
				statements();
				 if (TRACEON) System.out.println("statements: statement statements"); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				 if (TRACEON) System.out.println("statements: "); 
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			multExpr();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(67);
					match(T__5);
					setState(68);
					multExpr();
					}
					break;
				case T__6:
					{
					setState(69);
					match(T__6);
					setState(70);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultExprContext extends ParserRuleContext {
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			signExpr();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(77);
					match(T__7);
					setState(78);
					signExpr();
					}
					break;
				case T__8:
					{
					setState(79);
					match(T__8);
					setState(80);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SignExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_signExpr);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				primaryExpr();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__6);
				setState(88);
				primaryExpr();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode Integer_constant() { return getToken(myC_newParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myC_newParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpr);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(Integer_constant);
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(Floating_point_constant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(T__0);
				setState(95);
				arith_expression();
				setState(96);
				match(T__1);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Selection_stmtContext selection_stmt() {
			return getRuleContext(Selection_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(Identifier);
				setState(101);
				match(T__9);
				setState(102);
				arith_expression();
				setState(103);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				selection_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				compound_stmt();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			statement();
			setState(111);
			match(T__3);
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

	public static class Selection_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myC_newParser.IF, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(myC_newParser.ELSE, 0); }
		public Selection_stmtContext selection_stmt() {
			return getRuleContext(Selection_stmtContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Selection_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_stmt; }
	}

	public final Selection_stmtContext selection_stmt() throws RecognitionException {
		Selection_stmtContext _localctx = new Selection_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selection_stmt);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(IF);
				setState(114);
				match(T__0);
				setState(115);
				arith_expression();
				setState(116);
				match(T__1);
				setState(117);
				statement();
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(118);
					match(ELSE);
					setState(119);
					statement();
					}
					break;
				case 2:
					{
					setState(120);
					selection_stmt();
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__2);
				setState(124);
				statements();
				setState(125);
				match(T__3);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\3\7\3\7\3\7\7\7T\n\7\f\7\16\7W\13"+
		"\7\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\te\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f|\n\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\f\2\2\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\3\3\2\r\16\2\u008e\2\30\3\2\2\2\4)\3\2\2\2\6;\3"+
		"\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fN\3\2\2\2\16[\3\2\2\2\20d\3\2\2\2\22m\3"+
		"\2\2\2\24o\3\2\2\2\26\u0081\3\2\2\2\30\31\t\2\2\2\31\32\7\25\2\2\32\33"+
		"\7\3\2\2\33\34\7\4\2\2\34\35\7\5\2\2\35\36\5\4\3\2\36\37\5\b\5\2\37 \7"+
		"\6\2\2 !\b\2\1\2!\3\3\2\2\2\"#\5\6\4\2#$\7\30\2\2$%\7\7\2\2%&\5\4\3\2"+
		"&\'\b\3\1\2\'*\3\2\2\2(*\b\3\1\2)\"\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\7\r"+
		"\2\2,<\b\4\1\2-.\7\16\2\2.<\b\4\1\2/\60\7\17\2\2\60<\b\4\1\2\61\62\7\20"+
		"\2\2\62<\b\4\1\2\63\64\7\21\2\2\64<\b\4\1\2\65\66\7\22\2\2\66<\b\4\1\2"+
		"\678\7\23\2\28<\b\4\1\29:\7\24\2\2:<\b\4\1\2;+\3\2\2\2;-\3\2\2\2;/\3\2"+
		"\2\2;\61\3\2\2\2;\63\3\2\2\2;\65\3\2\2\2;\67\3\2\2\2;9\3\2\2\2<\7\3\2"+
		"\2\2=>\5\22\n\2>?\5\b\5\2?@\b\5\1\2@C\3\2\2\2AC\b\5\1\2B=\3\2\2\2BA\3"+
		"\2\2\2C\t\3\2\2\2DK\5\f\7\2EF\7\b\2\2FJ\5\f\7\2GH\7\t\2\2HJ\5\f\7\2IE"+
		"\3\2\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2\2MK\3\2\2\2"+
		"NU\5\16\b\2OP\7\n\2\2PT\5\16\b\2QR\7\13\2\2RT\5\16\b\2SO\3\2\2\2SQ\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2X\\\5\20\t\2YZ"+
		"\7\t\2\2Z\\\5\20\t\2[X\3\2\2\2[Y\3\2\2\2\\\17\3\2\2\2]e\7\31\2\2^e\7\32"+
		"\2\2_e\7\30\2\2`a\7\3\2\2ab\5\n\6\2bc\7\4\2\2ce\3\2\2\2d]\3\2\2\2d^\3"+
		"\2\2\2d_\3\2\2\2d`\3\2\2\2e\21\3\2\2\2fg\7\30\2\2gh\7\f\2\2hi\5\n\6\2"+
		"ij\7\7\2\2jn\3\2\2\2kn\5\26\f\2ln\5\24\13\2mf\3\2\2\2mk\3\2\2\2ml\3\2"+
		"\2\2n\23\3\2\2\2op\7\5\2\2pq\5\22\n\2qr\7\6\2\2r\25\3\2\2\2st\7\26\2\2"+
		"tu\7\3\2\2uv\5\n\6\2vw\7\4\2\2w{\5\22\n\2xy\7\27\2\2y|\5\22\n\2z|\5\26"+
		"\f\2{x\3\2\2\2{z\3\2\2\2{|\3\2\2\2|\u0082\3\2\2\2}~\7\5\2\2~\177\5\b\5"+
		"\2\177\u0080\7\6\2\2\u0080\u0082\3\2\2\2\u0081s\3\2\2\2\u0081}\3\2\2\2"+
		"\u0082\27\3\2\2\2\16);BIKSU[dm{\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}