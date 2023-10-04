// Generated from c:\Users\User\workspace\ccu_compiler\hw1\mylexer.g by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mylexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_LITERAL=1, CHAR_LITERAL=2, INT_TYPE=3, CHAR_TYPE=4, VOID_TYPE=5, 
		FLOAT_TYPE=6, DOUBLE_TYPE=7, BOOL=8, BOOL_TYPE_2=9, COMPLEX_TYPE=10, COMPLEX_TYPE_2=11, 
		IMAGINARY_TYPE=12, IMAGINARY_TYPE_2=13, ENUM_TYPE=14, STRUCT_TYPE=15, 
		UNION_TYPE=16, SWITCH_TYPE=17, CASE_TYPE=18, DEFAULT_TYPE=19, DO_TYPE=20, 
		WHILE_TYPE=21, BREAK_TYPE=22, CONTINUE_TYPE=23, FOR_TYPE=24, IF_TYPE=25, 
		ELSE_TYPE=26, GOTO_TYPE=27, RETURN_TYPE=28, CONST_TYPE=29, RESTRICT_TYPE=30, 
		INLINE_TYPE=31, SHORT_TYPE=32, LONG_TYPE=33, SIGNED_TYPE=34, UNSIGNED_TYPE=35, 
		AUTO_TYPE=36, REGISTER_TYPE=37, STATIC_TYPE=38, EXTERN_TYPE=39, TYPEDEF_TYPE=40, 
		SIZEOF=41, VAR_ARG=42, COMMA=43, COLON=44, SEMICOLON=45, HASH=46, LPAREN=47, 
		RPAREN=48, LBRACKET=49, RBRACKET=50, CURLY_LBRACKET=51, CURLY_RBRACKET=52, 
		APOSTROPHE=53, QUOTE=54, QUESTIONMARK=55, ACCESS_OP=56, PTR_ACCESS_OP=57, 
		PP_OP=58, MM_OP=59, NOT_OP=60, AND_OP=61, OR_OP=62, EQ_OP=63, NE_OP=64, 
		LE_OP=65, GE_OP=66, LT_OP=67, RT_OP=68, ASSIGN_OP=69, ADD_ASSIGN_OP=70, 
		MINUS_ASSIGN_OP=71, MUL_ASSIGN_OP=72, DIVIDE_ASSIGN_OP=73, MOD_ASSIGN_OP=74, 
		OR_ASSIGN_OP=75, XOR_ASSIGN_OP=76, LSHIFT_ASSIGN_OP=77, RSHIFT_ASSIGN_OP=78, 
		ADD_OP=79, MINUS_OP=80, MUL_OP=81, DIVIDE_OP=82, MOD_OP=83, B_NOT_OP=84, 
		B_AND_OP=85, B_OR_OP=86, B_XOR_OP=87, RSHIFT_OP=88, LSHIFT_OP=89, DEC_NUM=90, 
		ID=91, FLOAT_NUM=92, COMMENT1=93, COMMENT2=94, NEW_LINE=95, WS=96;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING_LITERAL", "CHAR_LITERAL", "INT_TYPE", "CHAR_TYPE", "VOID_TYPE", 
			"FLOAT_TYPE", "DOUBLE_TYPE", "BOOL", "BOOL_TYPE_2", "COMPLEX_TYPE", "COMPLEX_TYPE_2", 
			"IMAGINARY_TYPE", "IMAGINARY_TYPE_2", "ENUM_TYPE", "STRUCT_TYPE", "UNION_TYPE", 
			"SWITCH_TYPE", "CASE_TYPE", "DEFAULT_TYPE", "DO_TYPE", "WHILE_TYPE", 
			"BREAK_TYPE", "CONTINUE_TYPE", "FOR_TYPE", "IF_TYPE", "ELSE_TYPE", "GOTO_TYPE", 
			"RETURN_TYPE", "CONST_TYPE", "RESTRICT_TYPE", "INLINE_TYPE", "SHORT_TYPE", 
			"LONG_TYPE", "SIGNED_TYPE", "UNSIGNED_TYPE", "AUTO_TYPE", "REGISTER_TYPE", 
			"STATIC_TYPE", "EXTERN_TYPE", "TYPEDEF_TYPE", "SIZEOF", "VAR_ARG", "COMMA", 
			"COLON", "SEMICOLON", "HASH", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"CURLY_LBRACKET", "CURLY_RBRACKET", "APOSTROPHE", "QUOTE", "QUESTIONMARK", 
			"ACCESS_OP", "PTR_ACCESS_OP", "PP_OP", "MM_OP", "NOT_OP", "AND_OP", "OR_OP", 
			"EQ_OP", "NE_OP", "LE_OP", "GE_OP", "LT_OP", "RT_OP", "ASSIGN_OP", "ADD_ASSIGN_OP", 
			"MINUS_ASSIGN_OP", "MUL_ASSIGN_OP", "DIVIDE_ASSIGN_OP", "MOD_ASSIGN_OP", 
			"OR_ASSIGN_OP", "XOR_ASSIGN_OP", "LSHIFT_ASSIGN_OP", "RSHIFT_ASSIGN_OP", 
			"ADD_OP", "MINUS_OP", "MUL_OP", "DIVIDE_OP", "MOD_OP", "B_NOT_OP", "B_AND_OP", 
			"B_OR_OP", "B_XOR_OP", "RSHIFT_OP", "LSHIFT_OP", "DEC_NUM", "ID", "FLOAT_NUM", 
			"FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "LETTER", "DIGIT", "COMMENT1", 
			"COMMENT2", "NEW_LINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'int'", "'char'", "'void'", "'float'", "'double'", 
			"'bool'", "'_Bool'", "'complex'", "'_Complex'", "'imaginary'", "'_Imaginary'", 
			"'enum'", "'struct'", "'union'", "'switch'", "'case'", "'default'", "'do'", 
			"'while'", "'break'", "'continue'", "'for'", "'if'", "'else'", "'goto'", 
			"'return'", "'const'", "'restrict'", "'inline'", "'short'", "'long'", 
			"'signed'", "'unsigned'", "'auto'", "'register'", "'static'", "'extern'", 
			"'typedef'", "'sizeof'", "'...'", "','", "':'", "';'", "'#'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'''", "'"'", "'?'", "'.'", "'->'", 
			"'++'", "'--'", "'!'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", 
			"'<'", "'>'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'|='", 
			"'^='", "'<<='", "'>>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", null, null, null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING_LITERAL", "CHAR_LITERAL", "INT_TYPE", "CHAR_TYPE", "VOID_TYPE", 
			"FLOAT_TYPE", "DOUBLE_TYPE", "BOOL", "BOOL_TYPE_2", "COMPLEX_TYPE", "COMPLEX_TYPE_2", 
			"IMAGINARY_TYPE", "IMAGINARY_TYPE_2", "ENUM_TYPE", "STRUCT_TYPE", "UNION_TYPE", 
			"SWITCH_TYPE", "CASE_TYPE", "DEFAULT_TYPE", "DO_TYPE", "WHILE_TYPE", 
			"BREAK_TYPE", "CONTINUE_TYPE", "FOR_TYPE", "IF_TYPE", "ELSE_TYPE", "GOTO_TYPE", 
			"RETURN_TYPE", "CONST_TYPE", "RESTRICT_TYPE", "INLINE_TYPE", "SHORT_TYPE", 
			"LONG_TYPE", "SIGNED_TYPE", "UNSIGNED_TYPE", "AUTO_TYPE", "REGISTER_TYPE", 
			"STATIC_TYPE", "EXTERN_TYPE", "TYPEDEF_TYPE", "SIZEOF", "VAR_ARG", "COMMA", 
			"COLON", "SEMICOLON", "HASH", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"CURLY_LBRACKET", "CURLY_RBRACKET", "APOSTROPHE", "QUOTE", "QUESTIONMARK", 
			"ACCESS_OP", "PTR_ACCESS_OP", "PP_OP", "MM_OP", "NOT_OP", "AND_OP", "OR_OP", 
			"EQ_OP", "NE_OP", "LE_OP", "GE_OP", "LT_OP", "RT_OP", "ASSIGN_OP", "ADD_ASSIGN_OP", 
			"MINUS_ASSIGN_OP", "MUL_ASSIGN_OP", "DIVIDE_ASSIGN_OP", "MOD_ASSIGN_OP", 
			"OR_ASSIGN_OP", "XOR_ASSIGN_OP", "LSHIFT_ASSIGN_OP", "RSHIFT_ASSIGN_OP", 
			"ADD_OP", "MINUS_OP", "MUL_OP", "DIVIDE_OP", "MOD_OP", "B_NOT_OP", "B_AND_OP", 
			"B_OR_OP", "B_XOR_OP", "RSHIFT_OP", "LSHIFT_OP", "DEC_NUM", "ID", "FLOAT_NUM", 
			"COMMENT1", "COMMENT2", "NEW_LINE", "WS"
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


	public mylexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mylexer.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 99:
			NEW_LINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 100:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEW_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2b\u02a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\7\2\u00d0\n\2\f\2\16"+
		"\2\u00d3\13\2\3\2\3\3\3\3\5\3\u00d8\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\38\38\39\39\3:\3:\3:\3;\3"+
		";\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3"+
		"C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3"+
		"L\3L\3L\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\7[\u0254\n[\f[\16"+
		"[\u0257\13[\5[\u0259\n[\3\\\3\\\3\\\7\\\u025e\n\\\f\\\16\\\u0261\13\\"+
		"\3]\3]\3]\5]\u0266\n]\3^\6^\u0269\n^\r^\16^\u026a\3^\3^\7^\u026f\n^\f"+
		"^\16^\u0272\13^\3_\3_\6_\u0276\n_\r_\16_\u0277\3`\6`\u027b\n`\r`\16`\u027c"+
		"\3a\3a\3b\3b\3c\3c\3c\3c\7c\u0287\nc\fc\16c\u028a\13c\3c\3c\3d\3d\3d\3"+
		"d\7d\u0292\nd\fd\16d\u0295\13d\3d\3d\3d\3e\3e\3e\3f\6f\u029e\nf\rf\16"+
		"f\u029f\3f\3f\2\2g\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2"+
		"\u00c5_\u00c7`\u00c9a\u00cbb\3\2\4\5\2C\\aac|\5\2\13\13\17\17\"\"\2\u02ac"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\3\u00cd\3\2\2"+
		"\2\5\u00d5\3\2\2\2\7\u00db\3\2\2\2\t\u00df\3\2\2\2\13\u00e4\3\2\2\2\r"+
		"\u00e9\3\2\2\2\17\u00ef\3\2\2\2\21\u00f6\3\2\2\2\23\u00fb\3\2\2\2\25\u0101"+
		"\3\2\2\2\27\u0109\3\2\2\2\31\u0112\3\2\2\2\33\u011c\3\2\2\2\35\u0127\3"+
		"\2\2\2\37\u012c\3\2\2\2!\u0133\3\2\2\2#\u0139\3\2\2\2%\u0140\3\2\2\2\'"+
		"\u0145\3\2\2\2)\u014d\3\2\2\2+\u0150\3\2\2\2-\u0156\3\2\2\2/\u015c\3\2"+
		"\2\2\61\u0165\3\2\2\2\63\u0169\3\2\2\2\65\u016c\3\2\2\2\67\u0171\3\2\2"+
		"\29\u0176\3\2\2\2;\u017d\3\2\2\2=\u0183\3\2\2\2?\u018c\3\2\2\2A\u0193"+
		"\3\2\2\2C\u0199\3\2\2\2E\u019e\3\2\2\2G\u01a5\3\2\2\2I\u01ae\3\2\2\2K"+
		"\u01b3\3\2\2\2M\u01bc\3\2\2\2O\u01c3\3\2\2\2Q\u01ca\3\2\2\2S\u01d2\3\2"+
		"\2\2U\u01d9\3\2\2\2W\u01dd\3\2\2\2Y\u01df\3\2\2\2[\u01e1\3\2\2\2]\u01e3"+
		"\3\2\2\2_\u01e5\3\2\2\2a\u01e7\3\2\2\2c\u01e9\3\2\2\2e\u01eb\3\2\2\2g"+
		"\u01ed\3\2\2\2i\u01ef\3\2\2\2k\u01f1\3\2\2\2m\u01f3\3\2\2\2o\u01f4\3\2"+
		"\2\2q\u01f6\3\2\2\2s\u01f8\3\2\2\2u\u01fb\3\2\2\2w\u01fe\3\2\2\2y\u0201"+
		"\3\2\2\2{\u0203\3\2\2\2}\u0206\3\2\2\2\177\u0209\3\2\2\2\u0081\u020c\3"+
		"\2\2\2\u0083\u020f\3\2\2\2\u0085\u0212\3\2\2\2\u0087\u0215\3\2\2\2\u0089"+
		"\u0217\3\2\2\2\u008b\u0219\3\2\2\2\u008d\u021b\3\2\2\2\u008f\u021e\3\2"+
		"\2\2\u0091\u0221\3\2\2\2\u0093\u0224\3\2\2\2\u0095\u0227\3\2\2\2\u0097"+
		"\u022a\3\2\2\2\u0099\u022d\3\2\2\2\u009b\u0230\3\2\2\2\u009d\u0234\3\2"+
		"\2\2\u009f\u0238\3\2\2\2\u00a1\u023a\3\2\2\2\u00a3\u023c\3\2\2\2\u00a5"+
		"\u023e\3\2\2\2\u00a7\u0240\3\2\2\2\u00a9\u0242\3\2\2\2\u00ab\u0244\3\2"+
		"\2\2\u00ad\u0246\3\2\2\2\u00af\u0248\3\2\2\2\u00b1\u024a\3\2\2\2\u00b3"+
		"\u024d\3\2\2\2\u00b5\u0258\3\2\2\2\u00b7\u025a\3\2\2\2\u00b9\u0265\3\2"+
		"\2\2\u00bb\u0268\3\2\2\2\u00bd\u0273\3\2\2\2\u00bf\u027a\3\2\2\2\u00c1"+
		"\u027e\3\2\2\2\u00c3\u0280\3\2\2\2\u00c5\u0282\3\2\2\2\u00c7\u028d\3\2"+
		"\2\2\u00c9\u0299\3\2\2\2\u00cb\u029d\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce"+
		"\u00d0\13\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\4\3\2\2\2\u00d5\u00d7\7)\2\2\u00d6\u00d8\13\2\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7)\2\2\u00da\6\3"+
		"\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\b\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\n\3\2\2\2\u00e4\u00e5\7x\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7f\2\2\u00e8\f\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7v\2\2"+
		"\u00ee\16\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7"+
		"w\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5\20"+
		"\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\22\3\2\2\2\u00fb\u00fc\7a\2\2\u00fc\u00fd\7D\2\2\u00fd"+
		"\u00fe\7q\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7n\2\2\u0100\24\3\2\2\2\u0101"+
		"\u0102\7e\2\2\u0102\u0103\7q\2\2\u0103\u0104\7o\2\2\u0104\u0105\7r\2\2"+
		"\u0105\u0106\7n\2\2\u0106\u0107\7g\2\2\u0107\u0108\7z\2\2\u0108\26\3\2"+
		"\2\2\u0109\u010a\7a\2\2\u010a\u010b\7E\2\2\u010b\u010c\7q\2\2\u010c\u010d"+
		"\7o\2\2\u010d\u010e\7r\2\2\u010e\u010f\7n\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0111\7z\2\2\u0111\30\3\2\2\2\u0112\u0113\7k\2\2\u0113\u0114\7o\2\2\u0114"+
		"\u0115\7c\2\2\u0115\u0116\7i\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2"+
		"\u0118\u0119\7c\2\2\u0119\u011a\7t\2\2\u011a\u011b\7{\2\2\u011b\32\3\2"+
		"\2\2\u011c\u011d\7a\2\2\u011d\u011e\7K\2\2\u011e\u011f\7o\2\2\u011f\u0120"+
		"\7c\2\2\u0120\u0121\7i\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7t\2\2\u0125\u0126\7{\2\2\u0126\34\3\2\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7p\2\2\u0129\u012a\7w\2\2\u012a\u012b\7o\2\2"+
		"\u012b\36\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e\7v\2\2\u012e\u012f\7"+
		"t\2\2\u012f\u0130\7w\2\2\u0130\u0131\7e\2\2\u0131\u0132\7v\2\2\u0132 "+
		"\3\2\2\2\u0133\u0134\7w\2\2\u0134\u0135\7p\2\2\u0135\u0136\7k\2\2\u0136"+
		"\u0137\7q\2\2\u0137\u0138\7p\2\2\u0138\"\3\2\2\2\u0139\u013a\7u\2\2\u013a"+
		"\u013b\7y\2\2\u013b\u013c\7k\2\2\u013c\u013d\7v\2\2\u013d\u013e\7e\2\2"+
		"\u013e\u013f\7j\2\2\u013f$\3\2\2\2\u0140\u0141\7e\2\2\u0141\u0142\7c\2"+
		"\2\u0142\u0143\7u\2\2\u0143\u0144\7g\2\2\u0144&\3\2\2\2\u0145\u0146\7"+
		"f\2\2\u0146\u0147\7g\2\2\u0147\u0148\7h\2\2\u0148\u0149\7c\2\2\u0149\u014a"+
		"\7w\2\2\u014a\u014b\7n\2\2\u014b\u014c\7v\2\2\u014c(\3\2\2\2\u014d\u014e"+
		"\7f\2\2\u014e\u014f\7q\2\2\u014f*\3\2\2\2\u0150\u0151\7y\2\2\u0151\u0152"+
		"\7j\2\2\u0152\u0153\7k\2\2\u0153\u0154\7n\2\2\u0154\u0155\7g\2\2\u0155"+
		",\3\2\2\2\u0156\u0157\7d\2\2\u0157\u0158\7t\2\2\u0158\u0159\7g\2\2\u0159"+
		"\u015a\7c\2\2\u015a\u015b\7m\2\2\u015b.\3\2\2\2\u015c\u015d\7e\2\2\u015d"+
		"\u015e\7q\2\2\u015e\u015f\7p\2\2\u015f\u0160\7v\2\2\u0160\u0161\7k\2\2"+
		"\u0161\u0162\7p\2\2\u0162\u0163\7w\2\2\u0163\u0164\7g\2\2\u0164\60\3\2"+
		"\2\2\u0165\u0166\7h\2\2\u0166\u0167\7q\2\2\u0167\u0168\7t\2\2\u0168\62"+
		"\3\2\2\2\u0169\u016a\7k\2\2\u016a\u016b\7h\2\2\u016b\64\3\2\2\2\u016c"+
		"\u016d\7g\2\2\u016d\u016e\7n\2\2\u016e\u016f\7u\2\2\u016f\u0170\7g\2\2"+
		"\u0170\66\3\2\2\2\u0171\u0172\7i\2\2\u0172\u0173\7q\2\2\u0173\u0174\7"+
		"v\2\2\u0174\u0175\7q\2\2\u01758\3\2\2\2\u0176\u0177\7t\2\2\u0177\u0178"+
		"\7g\2\2\u0178\u0179\7v\2\2\u0179\u017a\7w\2\2\u017a\u017b\7t\2\2\u017b"+
		"\u017c\7p\2\2\u017c:\3\2\2\2\u017d\u017e\7e\2\2\u017e\u017f\7q\2\2\u017f"+
		"\u0180\7p\2\2\u0180\u0181\7u\2\2\u0181\u0182\7v\2\2\u0182<\3\2\2\2\u0183"+
		"\u0184\7t\2\2\u0184\u0185\7g\2\2\u0185\u0186\7u\2\2\u0186\u0187\7v\2\2"+
		"\u0187\u0188\7t\2\2\u0188\u0189\7k\2\2\u0189\u018a\7e\2\2\u018a\u018b"+
		"\7v\2\2\u018b>\3\2\2\2\u018c\u018d\7k\2\2\u018d\u018e\7p\2\2\u018e\u018f"+
		"\7n\2\2\u018f\u0190\7k\2\2\u0190\u0191\7p\2\2\u0191\u0192\7g\2\2\u0192"+
		"@\3\2\2\2\u0193\u0194\7u\2\2\u0194\u0195\7j\2\2\u0195\u0196\7q\2\2\u0196"+
		"\u0197\7t\2\2\u0197\u0198\7v\2\2\u0198B\3\2\2\2\u0199\u019a\7n\2\2\u019a"+
		"\u019b\7q\2\2\u019b\u019c\7p\2\2\u019c\u019d\7i\2\2\u019dD\3\2\2\2\u019e"+
		"\u019f\7u\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7i\2\2\u01a1\u01a2\7p\2\2"+
		"\u01a2\u01a3\7g\2\2\u01a3\u01a4\7f\2\2\u01a4F\3\2\2\2\u01a5\u01a6\7w\2"+
		"\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa"+
		"\7i\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7f\2\2\u01ad"+
		"H\3\2\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7w\2\2\u01b0\u01b1\7v\2\2\u01b1"+
		"\u01b2\7q\2\2\u01b2J\3\2\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7g\2\2\u01b5"+
		"\u01b6\7i\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9\7v\2\2"+
		"\u01b9\u01ba\7g\2\2\u01ba\u01bb\7t\2\2\u01bbL\3\2\2\2\u01bc\u01bd\7u\2"+
		"\2\u01bd\u01be\7v\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1"+
		"\7k\2\2\u01c1\u01c2\7e\2\2\u01c2N\3\2\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5"+
		"\7z\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7t\2\2\u01c8"+
		"\u01c9\7p\2\2\u01c9P\3\2\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7{\2\2\u01cc"+
		"\u01cd\7r\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf\7f\2\2\u01cf\u01d0\7g\2\2"+
		"\u01d0\u01d1\7h\2\2\u01d1R\3\2\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7k\2"+
		"\2\u01d4\u01d5\7|\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7q\2\2\u01d7\u01d8"+
		"\7h\2\2\u01d8T\3\2\2\2\u01d9\u01da\7\60\2\2\u01da\u01db\7\60\2\2\u01db"+
		"\u01dc\7\60\2\2\u01dcV\3\2\2\2\u01dd\u01de\7.\2\2\u01deX\3\2\2\2\u01df"+
		"\u01e0\7<\2\2\u01e0Z\3\2\2\2\u01e1\u01e2\7=\2\2\u01e2\\\3\2\2\2\u01e3"+
		"\u01e4\7%\2\2\u01e4^\3\2\2\2\u01e5\u01e6\7*\2\2\u01e6`\3\2\2\2\u01e7\u01e8"+
		"\7+\2\2\u01e8b\3\2\2\2\u01e9\u01ea\7]\2\2\u01ead\3\2\2\2\u01eb\u01ec\7"+
		"_\2\2\u01ecf\3\2\2\2\u01ed\u01ee\7}\2\2\u01eeh\3\2\2\2\u01ef\u01f0\7\177"+
		"\2\2\u01f0j\3\2\2\2\u01f1\u01f2\7)\2\2\u01f2l\3\2\2\2\u01f3n\3\2\2\2\u01f4"+
		"\u01f5\7A\2\2\u01f5p\3\2\2\2\u01f6\u01f7\7\60\2\2\u01f7r\3\2\2\2\u01f8"+
		"\u01f9\7/\2\2\u01f9\u01fa\7@\2\2\u01fat\3\2\2\2\u01fb\u01fc\7-\2\2\u01fc"+
		"\u01fd\7-\2\2\u01fdv\3\2\2\2\u01fe\u01ff\7/\2\2\u01ff\u0200\7/\2\2\u0200"+
		"x\3\2\2\2\u0201\u0202\7#\2\2\u0202z\3\2\2\2\u0203\u0204\7(\2\2\u0204\u0205"+
		"\7(\2\2\u0205|\3\2\2\2\u0206\u0207\7~\2\2\u0207\u0208\7~\2\2\u0208~\3"+
		"\2\2\2\u0209\u020a\7?\2\2\u020a\u020b\7?\2\2\u020b\u0080\3\2\2\2\u020c"+
		"\u020d\7#\2\2\u020d\u020e\7?\2\2\u020e\u0082\3\2\2\2\u020f\u0210\7>\2"+
		"\2\u0210\u0211\7?\2\2\u0211\u0084\3\2\2\2\u0212\u0213\7@\2\2\u0213\u0214"+
		"\7?\2\2\u0214\u0086\3\2\2\2\u0215\u0216\7>\2\2\u0216\u0088\3\2\2\2\u0217"+
		"\u0218\7@\2\2\u0218\u008a\3\2\2\2\u0219\u021a\7?\2\2\u021a\u008c\3\2\2"+
		"\2\u021b\u021c\7-\2\2\u021c\u021d\7?\2\2\u021d\u008e\3\2\2\2\u021e\u021f"+
		"\7/\2\2\u021f\u0220\7?\2\2\u0220\u0090\3\2\2\2\u0221\u0222\7,\2\2\u0222"+
		"\u0223\7?\2\2\u0223\u0092\3\2\2\2\u0224\u0225\7\61\2\2\u0225\u0226\7?"+
		"\2\2\u0226\u0094\3\2\2\2\u0227\u0228\7\'\2\2\u0228\u0229\7?\2\2\u0229"+
		"\u0096\3\2\2\2\u022a\u022b\7~\2\2\u022b\u022c\7?\2\2\u022c\u0098\3\2\2"+
		"\2\u022d\u022e\7`\2\2\u022e\u022f\7?\2\2\u022f\u009a\3\2\2\2\u0230\u0231"+
		"\7>\2\2\u0231\u0232\7>\2\2\u0232\u0233\7?\2\2\u0233\u009c\3\2\2\2\u0234"+
		"\u0235\7@\2\2\u0235\u0236\7@\2\2\u0236\u0237\7?\2\2\u0237\u009e\3\2\2"+
		"\2\u0238\u0239\7-\2\2\u0239\u00a0\3\2\2\2\u023a\u023b\7/\2\2\u023b\u00a2"+
		"\3\2\2\2\u023c\u023d\7,\2\2\u023d\u00a4\3\2\2\2\u023e\u023f\7\61\2\2\u023f"+
		"\u00a6\3\2\2\2\u0240\u0241\7\'\2\2\u0241\u00a8\3\2\2\2\u0242\u0243\7\u0080"+
		"\2\2\u0243\u00aa\3\2\2\2\u0244\u0245\7(\2\2\u0245\u00ac\3\2\2\2\u0246"+
		"\u0247\7~\2\2\u0247\u00ae\3\2\2\2\u0248\u0249\7`\2\2\u0249\u00b0\3\2\2"+
		"\2\u024a\u024b\7>\2\2\u024b\u024c\7>\2\2\u024c\u00b2\3\2\2\2\u024d\u024e"+
		"\7@\2\2\u024e\u024f\7@\2\2\u024f\u00b4\3\2\2\2\u0250\u0259\7\62\2\2\u0251"+
		"\u0255\4\63;\2\u0252\u0254\5\u00c3b\2\u0253\u0252\3\2\2\2\u0254\u0257"+
		"\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0259\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0258\u0250\3\2\2\2\u0258\u0251\3\2\2\2\u0259\u00b6\3\2"+
		"\2\2\u025a\u025f\5\u00c1a\2\u025b\u025e\5\u00c1a\2\u025c\u025e\5\u00c3"+
		"b\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u00b8\3\2\2\2\u0261\u025f\3\2"+
		"\2\2\u0262\u0266\5\u00bb^\2\u0263\u0266\5\u00bd_\2\u0264\u0266\5\u00bf"+
		"`\2\u0265\u0262\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0264\3\2\2\2\u0266"+
		"\u00ba\3\2\2\2\u0267\u0269\5\u00c3b\2\u0268\u0267\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u0270\7\60\2\2\u026d\u026f\5\u00c3b\2\u026e\u026d\3\2\2\2\u026f\u0272"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u00bc\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0275\7\60\2\2\u0274\u0276\5\u00c3b\2\u0275\u0274"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u00be\3\2\2\2\u0279\u027b\5\u00c3b\2\u027a\u0279\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u00c0\3\2\2\2\u027e"+
		"\u027f\t\2\2\2\u027f\u00c2\3\2\2\2\u0280\u0281\4\62;\2\u0281\u00c4\3\2"+
		"\2\2\u0282\u0283\7\61\2\2\u0283\u0284\7\61\2\2\u0284\u0288\3\2\2\2\u0285"+
		"\u0287\13\2\2\2\u0286\u0285\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3"+
		"\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b"+
		"\u028c\7\f\2\2\u028c\u00c6\3\2\2\2\u028d\u028e\7\61\2\2\u028e\u028f\7"+
		",\2\2\u028f\u0293\3\2\2\2\u0290\u0292\13\2\2\2\u0291\u0290\3\2\2\2\u0292"+
		"\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2"+
		"\2\2\u0295\u0293\3\2\2\2\u0296\u0297\7,\2\2\u0297\u0298\7\61\2\2\u0298"+
		"\u00c8\3\2\2\2\u0299\u029a\7\f\2\2\u029a\u029b\be\2\2\u029b\u00ca\3\2"+
		"\2\2\u029c\u029e\t\3\2\2\u029d\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\bf"+
		"\3\2\u02a2\u00cc\3\2\2\2\21\2\u00d1\u00d7\u0255\u0258\u025d\u025f\u0265"+
		"\u026a\u0270\u0277\u027c\u0288\u0293\u029f\4\3e\2\3f\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}