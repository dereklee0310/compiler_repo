// $ANTLR 3.5.3 mylexer.g 2023-03-25 21:48:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int ACCESS_OP=4;
	public static final int ADD_ASSIGN_OP=5;
	public static final int ADD_OP=6;
	public static final int AND_OP=7;
	public static final int APOSTROPHE=8;
	public static final int ASSIGN_OP=9;
	public static final int AUTO_TYPE=10;
	public static final int BOOL=11;
	public static final int BOOL_TYPE_2=12;
	public static final int BREAK_TYPE=13;
	public static final int B_AND_OP=14;
	public static final int B_NOT_OP=15;
	public static final int B_OR_OP=16;
	public static final int B_XOR_OP=17;
	public static final int CASE_TYPE=18;
	public static final int CHAR_LITERAL=19;
	public static final int CHAR_TYPE=20;
	public static final int COLON=21;
	public static final int COMMA=22;
	public static final int COMMENT1=23;
	public static final int COMMENT2=24;
	public static final int COMPLEX_TYPE=25;
	public static final int COMPLEX_TYPE_2=26;
	public static final int CONST_TYPE=27;
	public static final int CONTINUE_TYPE=28;
	public static final int CURLY_LBRACKET=29;
	public static final int CURLY_RBRACKET=30;
	public static final int DEC_NUM=31;
	public static final int DEFAULT_TYPE=32;
	public static final int DIGIT=33;
	public static final int DIVIDE_ASSIGN_OP=34;
	public static final int DIVIDE_OP=35;
	public static final int DOUBLE_TYPE=36;
	public static final int DO_TYPE=37;
	public static final int ELSE_TYPE=38;
	public static final int ENUM_TYPE=39;
	public static final int EQ_OP=40;
	public static final int EXTERN_TYPE=41;
	public static final int FLOAT_NUM=42;
	public static final int FLOAT_NUM1=43;
	public static final int FLOAT_NUM2=44;
	public static final int FLOAT_NUM3=45;
	public static final int FLOAT_TYPE=46;
	public static final int FOR_TYPE=47;
	public static final int GE_OP=48;
	public static final int GOTO_TYPE=49;
	public static final int HASH=50;
	public static final int ID=51;
	public static final int IF_TYPE=52;
	public static final int IMAGINARY_TYPE=53;
	public static final int IMAGINARY_TYPE_2=54;
	public static final int INLINE_TYPE=55;
	public static final int INT_TYPE=56;
	public static final int LBRACKET=57;
	public static final int LETTER=58;
	public static final int LE_OP=59;
	public static final int LONG_TYPE=60;
	public static final int LPAREN=61;
	public static final int LSHIFT_ASSIGN_OP=62;
	public static final int LSHIFT_OP=63;
	public static final int LT_OP=64;
	public static final int MINUS_ASSIGN_OP=65;
	public static final int MINUS_OP=66;
	public static final int MM_OP=67;
	public static final int MOD_ASSIGN_OP=68;
	public static final int MOD_OP=69;
	public static final int MUL_ASSIGN_OP=70;
	public static final int MUL_OP=71;
	public static final int NEW_LINE=72;
	public static final int NE_OP=73;
	public static final int NOT_OP=74;
	public static final int OR_ASSIGN_OP=75;
	public static final int OR_OP=76;
	public static final int PP_OP=77;
	public static final int PTR_ACCESS_OP=78;
	public static final int QUESTIONMARK=79;
	public static final int QUOTE=80;
	public static final int RBRACKET=81;
	public static final int REGISTER_TYPE=82;
	public static final int RESTRICT_TYPE=83;
	public static final int RETURN_TYPE=84;
	public static final int RPAREN=85;
	public static final int RSHIFT_ASSIGN_OP=86;
	public static final int RSHIFT_OP=87;
	public static final int RT_OP=88;
	public static final int SEMICOLON=89;
	public static final int SHORT_TYPE=90;
	public static final int SIGNED_TYPE=91;
	public static final int SIZEOF=92;
	public static final int STATIC_TYPE=93;
	public static final int STRING_LITERAL=94;
	public static final int STRUCT_TYPE=95;
	public static final int SWITCH_TYPE=96;
	public static final int TYPEDEF_TYPE=97;
	public static final int UNION_TYPE=98;
	public static final int UNSIGNED_TYPE=99;
	public static final int VAR_ARG=100;
	public static final int VOID_TYPE=101;
	public static final int WHILE_TYPE=102;
	public static final int WS=103;
	public static final int XOR_ASSIGN_OP=104;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:8:16: ( '\\\"' ( options {greedy=false; } : . )* '\\\"' )
			// mylexer.g:8:18: '\\\"' ( options {greedy=false; } : . )* '\\\"'
			{
			match('\"'); 
			// mylexer.g:8:22: ( options {greedy=false; } : . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\"') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:8:47: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "CHAR_LITERAL"
	public final void mCHAR_LITERAL() throws RecognitionException {
		try {
			int _type = CHAR_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:9:14: ( '\\'' ( options {greedy=false; } : . )? '\\'' )
			// mylexer.g:9:16: '\\'' ( options {greedy=false; } : . )? '\\''
			{
			match('\''); 
			// mylexer.g:9:20: ( options {greedy=false; } : . )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\'') ) {
				alt2=2;
			}
			else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// mylexer.g:9:45: .
					{
					matchAny(); 
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_LITERAL"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:11: ( 'int' )
			// mylexer.g:12:13: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:11: ( 'char' )
			// mylexer.g:13:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:14:11: ( 'void' )
			// mylexer.g:14:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:12: ( 'float' )
			// mylexer.g:15:14: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:13: ( 'double' )
			// mylexer.g:16:14: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:6: ( 'bool' )
			// mylexer.g:17:8: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "BOOL_TYPE_2"
	public final void mBOOL_TYPE_2() throws RecognitionException {
		try {
			int _type = BOOL_TYPE_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:13: ( '_Bool' )
			// mylexer.g:18:15: '_Bool'
			{
			match("_Bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL_TYPE_2"

	// $ANTLR start "COMPLEX_TYPE"
	public final void mCOMPLEX_TYPE() throws RecognitionException {
		try {
			int _type = COMPLEX_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:14: ( 'complex' )
			// mylexer.g:19:16: 'complex'
			{
			match("complex"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPLEX_TYPE"

	// $ANTLR start "COMPLEX_TYPE_2"
	public final void mCOMPLEX_TYPE_2() throws RecognitionException {
		try {
			int _type = COMPLEX_TYPE_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:16: ( '_Complex' )
			// mylexer.g:20:18: '_Complex'
			{
			match("_Complex"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPLEX_TYPE_2"

	// $ANTLR start "IMAGINARY_TYPE"
	public final void mIMAGINARY_TYPE() throws RecognitionException {
		try {
			int _type = IMAGINARY_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:16: ( 'imaginary' )
			// mylexer.g:21:18: 'imaginary'
			{
			match("imaginary"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMAGINARY_TYPE"

	// $ANTLR start "IMAGINARY_TYPE_2"
	public final void mIMAGINARY_TYPE_2() throws RecognitionException {
		try {
			int _type = IMAGINARY_TYPE_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:18: ( '_Imaginary' )
			// mylexer.g:22:20: '_Imaginary'
			{
			match("_Imaginary"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMAGINARY_TYPE_2"

	// $ANTLR start "ENUM_TYPE"
	public final void mENUM_TYPE() throws RecognitionException {
		try {
			int _type = ENUM_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:11: ( 'enum' )
			// mylexer.g:25:13: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM_TYPE"

	// $ANTLR start "STRUCT_TYPE"
	public final void mSTRUCT_TYPE() throws RecognitionException {
		try {
			int _type = STRUCT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:13: ( 'struct' )
			// mylexer.g:26:15: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT_TYPE"

	// $ANTLR start "UNION_TYPE"
	public final void mUNION_TYPE() throws RecognitionException {
		try {
			int _type = UNION_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:12: ( 'union' )
			// mylexer.g:27:14: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION_TYPE"

	// $ANTLR start "SWITCH_TYPE"
	public final void mSWITCH_TYPE() throws RecognitionException {
		try {
			int _type = SWITCH_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:13: ( 'switch' )
			// mylexer.g:30:15: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_TYPE"

	// $ANTLR start "CASE_TYPE"
	public final void mCASE_TYPE() throws RecognitionException {
		try {
			int _type = CASE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:31:11: ( 'case' )
			// mylexer.g:31:13: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE_TYPE"

	// $ANTLR start "DEFAULT_TYPE"
	public final void mDEFAULT_TYPE() throws RecognitionException {
		try {
			int _type = DEFAULT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:32:14: ( 'default' )
			// mylexer.g:32:16: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT_TYPE"

	// $ANTLR start "DO_TYPE"
	public final void mDO_TYPE() throws RecognitionException {
		try {
			int _type = DO_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:33:9: ( 'do' )
			// mylexer.g:33:11: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO_TYPE"

	// $ANTLR start "WHILE_TYPE"
	public final void mWHILE_TYPE() throws RecognitionException {
		try {
			int _type = WHILE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:34:12: ( 'while' )
			// mylexer.g:34:15: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_TYPE"

	// $ANTLR start "BREAK_TYPE"
	public final void mBREAK_TYPE() throws RecognitionException {
		try {
			int _type = BREAK_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:12: ( 'break' )
			// mylexer.g:35:14: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_TYPE"

	// $ANTLR start "CONTINUE_TYPE"
	public final void mCONTINUE_TYPE() throws RecognitionException {
		try {
			int _type = CONTINUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:15: ( 'continue' )
			// mylexer.g:36:17: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_TYPE"

	// $ANTLR start "FOR_TYPE"
	public final void mFOR_TYPE() throws RecognitionException {
		try {
			int _type = FOR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:10: ( 'for' )
			// mylexer.g:37:12: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_TYPE"

	// $ANTLR start "IF_TYPE"
	public final void mIF_TYPE() throws RecognitionException {
		try {
			int _type = IF_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:9: ( 'if' )
			// mylexer.g:38:11: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_TYPE"

	// $ANTLR start "ELSE_TYPE"
	public final void mELSE_TYPE() throws RecognitionException {
		try {
			int _type = ELSE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:11: ( 'else' )
			// mylexer.g:39:13: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_TYPE"

	// $ANTLR start "GOTO_TYPE"
	public final void mGOTO_TYPE() throws RecognitionException {
		try {
			int _type = GOTO_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:40:11: ( 'goto' )
			// mylexer.g:40:13: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOTO_TYPE"

	// $ANTLR start "RETURN_TYPE"
	public final void mRETURN_TYPE() throws RecognitionException {
		try {
			int _type = RETURN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:41:13: ( 'return' )
			// mylexer.g:41:15: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_TYPE"

	// $ANTLR start "CONST_TYPE"
	public final void mCONST_TYPE() throws RecognitionException {
		try {
			int _type = CONST_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:44:12: ( 'const' )
			// mylexer.g:44:14: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST_TYPE"

	// $ANTLR start "RESTRICT_TYPE"
	public final void mRESTRICT_TYPE() throws RecognitionException {
		try {
			int _type = RESTRICT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:15: ( 'restrict' )
			// mylexer.g:45:17: 'restrict'
			{
			match("restrict"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESTRICT_TYPE"

	// $ANTLR start "INLINE_TYPE"
	public final void mINLINE_TYPE() throws RecognitionException {
		try {
			int _type = INLINE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:13: ( 'inline' )
			// mylexer.g:48:15: 'inline'
			{
			match("inline"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INLINE_TYPE"

	// $ANTLR start "SHORT_TYPE"
	public final void mSHORT_TYPE() throws RecognitionException {
		try {
			int _type = SHORT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:12: ( 'short' )
			// mylexer.g:51:14: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:11: ( 'long' )
			// mylexer.g:52:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "SIGNED_TYPE"
	public final void mSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = SIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:13: ( 'signed' )
			// mylexer.g:53:15: 'signed'
			{
			match("signed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNED_TYPE"

	// $ANTLR start "UNSIGNED_TYPE"
	public final void mUNSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = UNSIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:15: ( 'unsigned' )
			// mylexer.g:54:17: 'unsigned'
			{
			match("unsigned"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED_TYPE"

	// $ANTLR start "AUTO_TYPE"
	public final void mAUTO_TYPE() throws RecognitionException {
		try {
			int _type = AUTO_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:11: ( 'auto' )
			// mylexer.g:57:13: 'auto'
			{
			match("auto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTO_TYPE"

	// $ANTLR start "REGISTER_TYPE"
	public final void mREGISTER_TYPE() throws RecognitionException {
		try {
			int _type = REGISTER_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:15: ( 'register' )
			// mylexer.g:58:17: 'register'
			{
			match("register"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGISTER_TYPE"

	// $ANTLR start "STATIC_TYPE"
	public final void mSTATIC_TYPE() throws RecognitionException {
		try {
			int _type = STATIC_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:13: ( 'static' )
			// mylexer.g:59:15: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC_TYPE"

	// $ANTLR start "EXTERN_TYPE"
	public final void mEXTERN_TYPE() throws RecognitionException {
		try {
			int _type = EXTERN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:13: ( 'extern' )
			// mylexer.g:60:15: 'extern'
			{
			match("extern"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTERN_TYPE"

	// $ANTLR start "TYPEDEF_TYPE"
	public final void mTYPEDEF_TYPE() throws RecognitionException {
		try {
			int _type = TYPEDEF_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:14: ( 'typedef' )
			// mylexer.g:61:16: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEDEF_TYPE"

	// $ANTLR start "SIZEOF"
	public final void mSIZEOF() throws RecognitionException {
		try {
			int _type = SIZEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:8: ( 'sizeof' )
			// mylexer.g:64:10: 'sizeof'
			{
			match("sizeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIZEOF"

	// $ANTLR start "VAR_ARG"
	public final void mVAR_ARG() throws RecognitionException {
		try {
			int _type = VAR_ARG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:8: ( '...' )
			// mylexer.g:65:10: '...'
			{
			match("..."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_ARG"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:7: ( ',' )
			// mylexer.g:66:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:7: ( ':' )
			// mylexer.g:67:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:68:11: ( ';' )
			// mylexer.g:68:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "HASH"
	public final void mHASH() throws RecognitionException {
		try {
			int _type = HASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:69:6: ( '#' )
			// mylexer.g:69:8: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASH"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:70:8: ( '(' )
			// mylexer.g:70:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:8: ( ')' )
			// mylexer.g:71:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:72:10: ( '[' )
			// mylexer.g:72:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACKET"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:73:10: ( ']' )
			// mylexer.g:73:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACKET"

	// $ANTLR start "CURLY_LBRACKET"
	public final void mCURLY_LBRACKET() throws RecognitionException {
		try {
			int _type = CURLY_LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:74:16: ( '{' )
			// mylexer.g:74:18: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURLY_LBRACKET"

	// $ANTLR start "CURLY_RBRACKET"
	public final void mCURLY_RBRACKET() throws RecognitionException {
		try {
			int _type = CURLY_RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:75:16: ( '}' )
			// mylexer.g:75:18: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURLY_RBRACKET"

	// $ANTLR start "APOSTROPHE"
	public final void mAPOSTROPHE() throws RecognitionException {
		try {
			int _type = APOSTROPHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:12: ( '\\'' )
			// mylexer.g:76:14: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APOSTROPHE"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:77:7: ( '\\\"' )
			// mylexer.g:77:9: '\\\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "QUESTIONMARK"
	public final void mQUESTIONMARK() throws RecognitionException {
		try {
			int _type = QUESTIONMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:78:14: ( '?' )
			// mylexer.g:78:16: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTIONMARK"

	// $ANTLR start "ACCESS_OP"
	public final void mACCESS_OP() throws RecognitionException {
		try {
			int _type = ACCESS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:81:11: ( '.' )
			// mylexer.g:81:13: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACCESS_OP"

	// $ANTLR start "PTR_ACCESS_OP"
	public final void mPTR_ACCESS_OP() throws RecognitionException {
		try {
			int _type = PTR_ACCESS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:82:15: ( '->' )
			// mylexer.g:82:17: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PTR_ACCESS_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:85:7: ( '++' )
			// mylexer.g:85:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:86:7: ( '--' )
			// mylexer.g:86:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "NOT_OP"
	public final void mNOT_OP() throws RecognitionException {
		try {
			int _type = NOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:89:8: ( '!' )
			// mylexer.g:89:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_OP"

	// $ANTLR start "AND_OP"
	public final void mAND_OP() throws RecognitionException {
		try {
			int _type = AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:90:8: ( '&&' )
			// mylexer.g:90:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_OP"

	// $ANTLR start "OR_OP"
	public final void mOR_OP() throws RecognitionException {
		try {
			int _type = OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:91:7: ( '||' )
			// mylexer.g:91:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_OP"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:94:7: ( '==' )
			// mylexer.g:94:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:95:7: ( '!=' )
			// mylexer.g:95:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:96:7: ( '<=' )
			// mylexer.g:96:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:97:7: ( '>=' )
			// mylexer.g:97:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "LT_OP"
	public final void mLT_OP() throws RecognitionException {
		try {
			int _type = LT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:98:7: ( '<' )
			// mylexer.g:98:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT_OP"

	// $ANTLR start "RT_OP"
	public final void mRT_OP() throws RecognitionException {
		try {
			int _type = RT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:99:7: ( '>' )
			// mylexer.g:99:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RT_OP"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:102:11: ( '=' )
			// mylexer.g:102:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN_OP"

	// $ANTLR start "ADD_ASSIGN_OP"
	public final void mADD_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = ADD_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:103:15: ( '+=' )
			// mylexer.g:103:17: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_ASSIGN_OP"

	// $ANTLR start "MINUS_ASSIGN_OP"
	public final void mMINUS_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = MINUS_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:104:17: ( '-=' )
			// mylexer.g:104:19: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_ASSIGN_OP"

	// $ANTLR start "MUL_ASSIGN_OP"
	public final void mMUL_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = MUL_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:105:15: ( '*=' )
			// mylexer.g:105:17: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_ASSIGN_OP"

	// $ANTLR start "DIVIDE_ASSIGN_OP"
	public final void mDIVIDE_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = DIVIDE_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:106:18: ( '/=' )
			// mylexer.g:106:20: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE_ASSIGN_OP"

	// $ANTLR start "MOD_ASSIGN_OP"
	public final void mMOD_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = MOD_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:107:15: ( '%=' )
			// mylexer.g:107:17: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_ASSIGN_OP"

	// $ANTLR start "OR_ASSIGN_OP"
	public final void mOR_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = OR_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:108:14: ( '|=' )
			// mylexer.g:108:16: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_ASSIGN_OP"

	// $ANTLR start "XOR_ASSIGN_OP"
	public final void mXOR_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = XOR_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:109:15: ( '^=' )
			// mylexer.g:109:17: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR_ASSIGN_OP"

	// $ANTLR start "LSHIFT_ASSIGN_OP"
	public final void mLSHIFT_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:110:18: ( '<<=' )
			// mylexer.g:110:20: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_ASSIGN_OP"

	// $ANTLR start "RSHIFT_ASSIGN_OP"
	public final void mRSHIFT_ASSIGN_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:111:18: ( '>>=' )
			// mylexer.g:111:20: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_ASSIGN_OP"

	// $ANTLR start "ADD_OP"
	public final void mADD_OP() throws RecognitionException {
		try {
			int _type = ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:114:8: ( '+' )
			// mylexer.g:114:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_OP"

	// $ANTLR start "MINUS_OP"
	public final void mMINUS_OP() throws RecognitionException {
		try {
			int _type = MINUS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:115:10: ( '-' )
			// mylexer.g:115:12: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:116:8: ( '*' )
			// mylexer.g:116:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "DIVIDE_OP"
	public final void mDIVIDE_OP() throws RecognitionException {
		try {
			int _type = DIVIDE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:117:11: ( '/' )
			// mylexer.g:117:13: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:118:8: ( '%' )
			// mylexer.g:118:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_OP"

	// $ANTLR start "B_NOT_OP"
	public final void mB_NOT_OP() throws RecognitionException {
		try {
			int _type = B_NOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:119:10: ( '~' )
			// mylexer.g:119:12: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B_NOT_OP"

	// $ANTLR start "B_AND_OP"
	public final void mB_AND_OP() throws RecognitionException {
		try {
			int _type = B_AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:120:10: ( '&' )
			// mylexer.g:120:12: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B_AND_OP"

	// $ANTLR start "B_OR_OP"
	public final void mB_OR_OP() throws RecognitionException {
		try {
			int _type = B_OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:121:9: ( '|' )
			// mylexer.g:121:11: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B_OR_OP"

	// $ANTLR start "B_XOR_OP"
	public final void mB_XOR_OP() throws RecognitionException {
		try {
			int _type = B_XOR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:122:10: ( '^' )
			// mylexer.g:122:12: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B_XOR_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:123:11: ( '<<' )
			// mylexer.g:123:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:124:11: ( '>>' )
			// mylexer.g:124:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:126:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:126:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:126:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// mylexer.g:126:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:126:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:126:28: ( DIGIT )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:128:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:128:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:128:14: ( LETTER | DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:130:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt6=3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// mylexer.g:130:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:130:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:130:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:131:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:131:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:131:22: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			match('.'); 
			// mylexer.g:131:33: ( DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:132:20: ( '.' ( DIGIT )+ )
			// mylexer.g:132:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:132:25: ( DIGIT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:133:20: ( ( DIGIT )+ )
			// mylexer.g:133:22: ( DIGIT )+
			{
			// mylexer.g:133:22: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:136:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:137:16: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:141:10: ( '//' ( . )* '\\n' )
			// mylexer.g:141:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:141:16: ( . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\n') ) {
					alt11=2;
				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:141:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:142:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:142:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:142:17: ( options {greedy=false; } : . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='*') ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1=='/') ) {
						alt12=2;
					}
					else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
						alt12=1;
					}

				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:142:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:145:9: ( '\\n' )
			// mylexer.g:145:11: '\\n'
			{
			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:146:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:146:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:146:7: ( ' ' | '\\r' | '\\t' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\t'||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( STRING_LITERAL | CHAR_LITERAL | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | BOOL | BOOL_TYPE_2 | COMPLEX_TYPE | COMPLEX_TYPE_2 | IMAGINARY_TYPE | IMAGINARY_TYPE_2 | ENUM_TYPE | STRUCT_TYPE | UNION_TYPE | SWITCH_TYPE | CASE_TYPE | DEFAULT_TYPE | DO_TYPE | WHILE_TYPE | BREAK_TYPE | CONTINUE_TYPE | FOR_TYPE | IF_TYPE | ELSE_TYPE | GOTO_TYPE | RETURN_TYPE | CONST_TYPE | RESTRICT_TYPE | INLINE_TYPE | SHORT_TYPE | LONG_TYPE | SIGNED_TYPE | UNSIGNED_TYPE | AUTO_TYPE | REGISTER_TYPE | STATIC_TYPE | EXTERN_TYPE | TYPEDEF_TYPE | SIZEOF | VAR_ARG | COMMA | COLON | SEMICOLON | HASH | LPAREN | RPAREN | LBRACKET | RBRACKET | CURLY_LBRACKET | CURLY_RBRACKET | APOSTROPHE | QUOTE | QUESTIONMARK | ACCESS_OP | PTR_ACCESS_OP | PP_OP | MM_OP | NOT_OP | AND_OP | OR_OP | EQ_OP | NE_OP | LE_OP | GE_OP | LT_OP | RT_OP | ASSIGN_OP | ADD_ASSIGN_OP | MINUS_ASSIGN_OP | MUL_ASSIGN_OP | DIVIDE_ASSIGN_OP | MOD_ASSIGN_OP | OR_ASSIGN_OP | XOR_ASSIGN_OP | LSHIFT_ASSIGN_OP | RSHIFT_ASSIGN_OP | ADD_OP | MINUS_OP | MUL_OP | DIVIDE_OP | MOD_OP | B_NOT_OP | B_AND_OP | B_OR_OP | B_XOR_OP | RSHIFT_OP | LSHIFT_OP | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | WS )
		int alt14=96;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// mylexer.g:1:10: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 2 :
				// mylexer.g:1:25: CHAR_LITERAL
				{
				mCHAR_LITERAL(); 

				}
				break;
			case 3 :
				// mylexer.g:1:38: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:47: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:57: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:67: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:78: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:90: BOOL
				{
				mBOOL(); 

				}
				break;
			case 9 :
				// mylexer.g:1:95: BOOL_TYPE_2
				{
				mBOOL_TYPE_2(); 

				}
				break;
			case 10 :
				// mylexer.g:1:107: COMPLEX_TYPE
				{
				mCOMPLEX_TYPE(); 

				}
				break;
			case 11 :
				// mylexer.g:1:120: COMPLEX_TYPE_2
				{
				mCOMPLEX_TYPE_2(); 

				}
				break;
			case 12 :
				// mylexer.g:1:135: IMAGINARY_TYPE
				{
				mIMAGINARY_TYPE(); 

				}
				break;
			case 13 :
				// mylexer.g:1:150: IMAGINARY_TYPE_2
				{
				mIMAGINARY_TYPE_2(); 

				}
				break;
			case 14 :
				// mylexer.g:1:167: ENUM_TYPE
				{
				mENUM_TYPE(); 

				}
				break;
			case 15 :
				// mylexer.g:1:177: STRUCT_TYPE
				{
				mSTRUCT_TYPE(); 

				}
				break;
			case 16 :
				// mylexer.g:1:189: UNION_TYPE
				{
				mUNION_TYPE(); 

				}
				break;
			case 17 :
				// mylexer.g:1:200: SWITCH_TYPE
				{
				mSWITCH_TYPE(); 

				}
				break;
			case 18 :
				// mylexer.g:1:212: CASE_TYPE
				{
				mCASE_TYPE(); 

				}
				break;
			case 19 :
				// mylexer.g:1:222: DEFAULT_TYPE
				{
				mDEFAULT_TYPE(); 

				}
				break;
			case 20 :
				// mylexer.g:1:235: DO_TYPE
				{
				mDO_TYPE(); 

				}
				break;
			case 21 :
				// mylexer.g:1:243: WHILE_TYPE
				{
				mWHILE_TYPE(); 

				}
				break;
			case 22 :
				// mylexer.g:1:254: BREAK_TYPE
				{
				mBREAK_TYPE(); 

				}
				break;
			case 23 :
				// mylexer.g:1:265: CONTINUE_TYPE
				{
				mCONTINUE_TYPE(); 

				}
				break;
			case 24 :
				// mylexer.g:1:279: FOR_TYPE
				{
				mFOR_TYPE(); 

				}
				break;
			case 25 :
				// mylexer.g:1:288: IF_TYPE
				{
				mIF_TYPE(); 

				}
				break;
			case 26 :
				// mylexer.g:1:296: ELSE_TYPE
				{
				mELSE_TYPE(); 

				}
				break;
			case 27 :
				// mylexer.g:1:306: GOTO_TYPE
				{
				mGOTO_TYPE(); 

				}
				break;
			case 28 :
				// mylexer.g:1:316: RETURN_TYPE
				{
				mRETURN_TYPE(); 

				}
				break;
			case 29 :
				// mylexer.g:1:328: CONST_TYPE
				{
				mCONST_TYPE(); 

				}
				break;
			case 30 :
				// mylexer.g:1:339: RESTRICT_TYPE
				{
				mRESTRICT_TYPE(); 

				}
				break;
			case 31 :
				// mylexer.g:1:353: INLINE_TYPE
				{
				mINLINE_TYPE(); 

				}
				break;
			case 32 :
				// mylexer.g:1:365: SHORT_TYPE
				{
				mSHORT_TYPE(); 

				}
				break;
			case 33 :
				// mylexer.g:1:376: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 34 :
				// mylexer.g:1:386: SIGNED_TYPE
				{
				mSIGNED_TYPE(); 

				}
				break;
			case 35 :
				// mylexer.g:1:398: UNSIGNED_TYPE
				{
				mUNSIGNED_TYPE(); 

				}
				break;
			case 36 :
				// mylexer.g:1:412: AUTO_TYPE
				{
				mAUTO_TYPE(); 

				}
				break;
			case 37 :
				// mylexer.g:1:422: REGISTER_TYPE
				{
				mREGISTER_TYPE(); 

				}
				break;
			case 38 :
				// mylexer.g:1:436: STATIC_TYPE
				{
				mSTATIC_TYPE(); 

				}
				break;
			case 39 :
				// mylexer.g:1:448: EXTERN_TYPE
				{
				mEXTERN_TYPE(); 

				}
				break;
			case 40 :
				// mylexer.g:1:460: TYPEDEF_TYPE
				{
				mTYPEDEF_TYPE(); 

				}
				break;
			case 41 :
				// mylexer.g:1:473: SIZEOF
				{
				mSIZEOF(); 

				}
				break;
			case 42 :
				// mylexer.g:1:480: VAR_ARG
				{
				mVAR_ARG(); 

				}
				break;
			case 43 :
				// mylexer.g:1:488: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 44 :
				// mylexer.g:1:494: COLON
				{
				mCOLON(); 

				}
				break;
			case 45 :
				// mylexer.g:1:500: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 46 :
				// mylexer.g:1:510: HASH
				{
				mHASH(); 

				}
				break;
			case 47 :
				// mylexer.g:1:515: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 48 :
				// mylexer.g:1:522: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 49 :
				// mylexer.g:1:529: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 50 :
				// mylexer.g:1:538: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 51 :
				// mylexer.g:1:547: CURLY_LBRACKET
				{
				mCURLY_LBRACKET(); 

				}
				break;
			case 52 :
				// mylexer.g:1:562: CURLY_RBRACKET
				{
				mCURLY_RBRACKET(); 

				}
				break;
			case 53 :
				// mylexer.g:1:577: APOSTROPHE
				{
				mAPOSTROPHE(); 

				}
				break;
			case 54 :
				// mylexer.g:1:588: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 55 :
				// mylexer.g:1:594: QUESTIONMARK
				{
				mQUESTIONMARK(); 

				}
				break;
			case 56 :
				// mylexer.g:1:607: ACCESS_OP
				{
				mACCESS_OP(); 

				}
				break;
			case 57 :
				// mylexer.g:1:617: PTR_ACCESS_OP
				{
				mPTR_ACCESS_OP(); 

				}
				break;
			case 58 :
				// mylexer.g:1:631: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 59 :
				// mylexer.g:1:637: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 60 :
				// mylexer.g:1:643: NOT_OP
				{
				mNOT_OP(); 

				}
				break;
			case 61 :
				// mylexer.g:1:650: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 62 :
				// mylexer.g:1:657: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 63 :
				// mylexer.g:1:663: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 64 :
				// mylexer.g:1:669: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 65 :
				// mylexer.g:1:675: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 66 :
				// mylexer.g:1:681: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 67 :
				// mylexer.g:1:687: LT_OP
				{
				mLT_OP(); 

				}
				break;
			case 68 :
				// mylexer.g:1:693: RT_OP
				{
				mRT_OP(); 

				}
				break;
			case 69 :
				// mylexer.g:1:699: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 70 :
				// mylexer.g:1:709: ADD_ASSIGN_OP
				{
				mADD_ASSIGN_OP(); 

				}
				break;
			case 71 :
				// mylexer.g:1:723: MINUS_ASSIGN_OP
				{
				mMINUS_ASSIGN_OP(); 

				}
				break;
			case 72 :
				// mylexer.g:1:739: MUL_ASSIGN_OP
				{
				mMUL_ASSIGN_OP(); 

				}
				break;
			case 73 :
				// mylexer.g:1:753: DIVIDE_ASSIGN_OP
				{
				mDIVIDE_ASSIGN_OP(); 

				}
				break;
			case 74 :
				// mylexer.g:1:770: MOD_ASSIGN_OP
				{
				mMOD_ASSIGN_OP(); 

				}
				break;
			case 75 :
				// mylexer.g:1:784: OR_ASSIGN_OP
				{
				mOR_ASSIGN_OP(); 

				}
				break;
			case 76 :
				// mylexer.g:1:797: XOR_ASSIGN_OP
				{
				mXOR_ASSIGN_OP(); 

				}
				break;
			case 77 :
				// mylexer.g:1:811: LSHIFT_ASSIGN_OP
				{
				mLSHIFT_ASSIGN_OP(); 

				}
				break;
			case 78 :
				// mylexer.g:1:828: RSHIFT_ASSIGN_OP
				{
				mRSHIFT_ASSIGN_OP(); 

				}
				break;
			case 79 :
				// mylexer.g:1:845: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 80 :
				// mylexer.g:1:852: MINUS_OP
				{
				mMINUS_OP(); 

				}
				break;
			case 81 :
				// mylexer.g:1:861: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 82 :
				// mylexer.g:1:868: DIVIDE_OP
				{
				mDIVIDE_OP(); 

				}
				break;
			case 83 :
				// mylexer.g:1:878: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 84 :
				// mylexer.g:1:885: B_NOT_OP
				{
				mB_NOT_OP(); 

				}
				break;
			case 85 :
				// mylexer.g:1:894: B_AND_OP
				{
				mB_AND_OP(); 

				}
				break;
			case 86 :
				// mylexer.g:1:903: B_OR_OP
				{
				mB_OR_OP(); 

				}
				break;
			case 87 :
				// mylexer.g:1:911: B_XOR_OP
				{
				mB_XOR_OP(); 

				}
				break;
			case 88 :
				// mylexer.g:1:920: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 89 :
				// mylexer.g:1:930: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 90 :
				// mylexer.g:1:940: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 91 :
				// mylexer.g:1:948: ID
				{
				mID(); 

				}
				break;
			case 92 :
				// mylexer.g:1:951: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 93 :
				// mylexer.g:1:961: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 94 :
				// mylexer.g:1:970: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 95 :
				// mylexer.g:1:979: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 96 :
				// mylexer.g:1:988: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA6_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA6_eofS =
		"\5\uffff";
	static final String DFA6_minS =
		"\2\56\3\uffff";
	static final String DFA6_maxS =
		"\2\71\3\uffff";
	static final String DFA6_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA6_specialS =
		"\5\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "130:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA14_eotS =
		"\1\uffff\1\62\1\64\20\56\1\124\13\uffff\1\131\1\134\1\136\1\140\1\143"+
		"\1\145\1\150\1\153\1\155\1\161\1\163\1\165\1\uffff\2\166\7\uffff\2\56"+
		"\1\173\6\56\1\u0084\24\56\24\uffff\1\u009f\2\uffff\1\u00a1\14\uffff\1"+
		"\166\1\u00a2\2\56\1\uffff\6\56\1\u00ac\1\56\1\uffff\31\56\5\uffff\2\56"+
		"\1\u00c9\3\56\1\u00cd\1\u00ce\1\56\1\uffff\2\56\1\u00d2\4\56\1\u00d7\1"+
		"\u00d8\12\56\1\u00e3\3\56\1\u00e7\1\u00e8\3\56\1\uffff\2\56\1\u00ee\2"+
		"\uffff\1\u00ef\2\56\1\uffff\1\u00f2\1\u00f3\2\56\2\uffff\4\56\1\u00fa"+
		"\2\56\1\u00fd\1\56\1\u00ff\1\uffff\3\56\2\uffff\1\56\1\u0104\3\56\2\uffff"+
		"\1\u0108\1\56\2\uffff\2\56\1\u010c\1\u010d\1\u010e\1\u010f\1\uffff\1\u0110"+
		"\1\u0111\1\uffff\1\56\1\uffff\1\u0113\3\56\1\uffff\1\56\1\u0118\1\56\1"+
		"\uffff\1\u011a\2\56\6\uffff\1\56\1\uffff\2\56\1\u0120\1\56\1\uffff\1\u0122"+
		"\1\uffff\1\u0123\1\56\1\u0125\1\u0126\1\u0127\1\uffff\1\u0128\2\uffff"+
		"\1\56\4\uffff\1\u012a\1\uffff";
	static final String DFA14_eofS =
		"\u012b\uffff";
	static final String DFA14_minS =
		"\1\11\2\0\1\146\1\141\1\157\1\154\1\145\1\157\1\102\1\154\1\150\1\156"+
		"\1\150\1\157\1\145\1\157\1\165\1\171\1\56\13\uffff\1\55\1\53\1\75\1\46"+
		"\2\75\1\74\2\75\1\52\2\75\1\uffff\2\56\7\uffff\1\154\1\141\1\60\1\141"+
		"\1\155\1\163\1\151\1\157\1\162\1\60\1\146\1\157\1\145\2\157\1\155\1\165"+
		"\1\163\1\164\1\141\1\151\1\157\1\147\2\151\1\164\1\147\1\156\1\164\1\160"+
		"\24\uffff\1\75\2\uffff\1\75\14\uffff\1\56\1\60\1\151\1\147\1\uffff\1\162"+
		"\1\160\1\163\1\145\1\144\1\141\1\60\1\142\1\uffff\1\141\1\154\1\141\1"+
		"\157\1\155\1\141\1\155\2\145\1\165\2\164\1\162\1\156\1\145\1\157\1\151"+
		"\1\154\1\157\1\165\1\164\1\151\1\147\1\157\1\145\5\uffff\1\156\1\151\1"+
		"\60\1\154\1\151\1\164\2\60\1\164\1\uffff\1\154\1\165\1\60\1\153\1\154"+
		"\1\160\1\147\2\60\1\162\1\143\1\151\1\143\1\164\1\145\1\157\1\156\1\147"+
		"\1\145\1\60\2\162\1\163\2\60\1\144\1\145\1\156\1\uffff\1\145\1\156\1\60"+
		"\2\uffff\1\60\1\145\1\154\1\uffff\2\60\1\154\1\151\2\uffff\1\156\1\164"+
		"\1\143\1\150\1\60\1\144\1\146\1\60\1\156\1\60\1\uffff\1\156\1\151\1\164"+
		"\2\uffff\1\145\1\60\1\141\1\170\1\165\2\uffff\1\60\1\164\2\uffff\1\145"+
		"\1\156\4\60\1\uffff\2\60\1\uffff\1\145\1\uffff\1\60\1\143\1\145\1\146"+
		"\1\uffff\1\162\1\60\1\145\1\uffff\1\60\1\170\1\141\6\uffff\1\144\1\uffff"+
		"\1\164\1\162\1\60\1\171\1\uffff\1\60\1\uffff\1\60\1\162\3\60\1\uffff\1"+
		"\60\2\uffff\1\171\4\uffff\1\60\1\uffff";
	static final String DFA14_maxS =
		"\1\176\2\uffff\1\156\4\157\1\162\1\111\1\170\1\167\1\156\1\150\1\157\1"+
		"\145\1\157\1\165\1\171\1\71\13\uffff\1\76\2\75\1\46\1\174\2\75\1\76\4"+
		"\75\1\uffff\2\71\7\uffff\1\164\1\141\1\172\1\141\1\156\1\163\1\151\1\157"+
		"\1\162\1\172\1\146\1\157\1\145\2\157\1\155\1\165\1\163\1\164\1\162\1\151"+
		"\1\157\1\172\1\163\1\151\2\164\1\156\1\164\1\160\24\uffff\1\75\2\uffff"+
		"\1\75\14\uffff\1\71\1\172\1\151\1\147\1\uffff\1\162\1\160\1\164\1\145"+
		"\1\144\1\141\1\172\1\142\1\uffff\1\141\1\154\1\141\1\157\1\155\1\141\1"+
		"\155\2\145\1\165\2\164\1\162\1\156\1\145\1\157\1\151\1\154\1\157\1\165"+
		"\1\164\1\151\1\147\1\157\1\145\5\uffff\1\156\1\151\1\172\1\154\1\151\1"+
		"\164\2\172\1\164\1\uffff\1\154\1\165\1\172\1\153\1\154\1\160\1\147\2\172"+
		"\1\162\1\143\1\151\1\143\1\164\1\145\1\157\1\156\1\147\1\145\1\172\2\162"+
		"\1\163\2\172\1\144\1\145\1\156\1\uffff\1\145\1\156\1\172\2\uffff\1\172"+
		"\1\145\1\154\1\uffff\2\172\1\154\1\151\2\uffff\1\156\1\164\1\143\1\150"+
		"\1\172\1\144\1\146\1\172\1\156\1\172\1\uffff\1\156\1\151\1\164\2\uffff"+
		"\1\145\1\172\1\141\1\170\1\165\2\uffff\1\172\1\164\2\uffff\1\145\1\156"+
		"\4\172\1\uffff\2\172\1\uffff\1\145\1\uffff\1\172\1\143\1\145\1\146\1\uffff"+
		"\1\162\1\172\1\145\1\uffff\1\172\1\170\1\141\6\uffff\1\144\1\uffff\1\164"+
		"\1\162\1\172\1\171\1\uffff\1\172\1\uffff\1\172\1\162\3\172\1\uffff\1\172"+
		"\2\uffff\1\171\4\uffff\1\172\1\uffff";
	static final String DFA14_acceptS =
		"\24\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\67\14\uffff"+
		"\1\124\2\uffff\1\133\1\137\1\140\1\1\1\66\1\2\1\65\36\uffff\1\52\1\70"+
		"\1\134\1\71\1\73\1\107\1\120\1\72\1\106\1\117\1\100\1\74\1\75\1\125\1"+
		"\76\1\113\1\126\1\77\1\105\1\101\1\uffff\1\103\1\102\1\uffff\1\104\1\110"+
		"\1\121\1\111\1\135\1\136\1\122\1\112\1\123\1\114\1\127\1\132\4\uffff\1"+
		"\31\10\uffff\1\24\31\uffff\1\115\1\130\1\116\1\131\1\3\11\uffff\1\30\34"+
		"\uffff\1\4\3\uffff\1\22\1\5\3\uffff\1\10\4\uffff\1\16\1\32\12\uffff\1"+
		"\33\3\uffff\1\41\1\44\5\uffff\1\35\1\6\2\uffff\1\26\1\11\6\uffff\1\40"+
		"\2\uffff\1\20\1\uffff\1\25\4\uffff\1\37\3\uffff\1\7\3\uffff\1\47\1\17"+
		"\1\46\1\21\1\42\1\51\1\uffff\1\34\4\uffff\1\12\1\uffff\1\23\5\uffff\1"+
		"\50\1\uffff\1\27\1\13\1\uffff\1\43\1\36\1\45\1\14\1\uffff\1\15";
	static final String DFA14_specialS =
		"\1\uffff\1\1\1\0\u0128\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\60\1\57\2\uffff\1\60\22\uffff\1\60\1\41\1\1\1\27\1\uffff\1\51\1\42"+
			"\1\2\1\30\1\31\1\47\1\40\1\24\1\37\1\23\1\50\1\54\11\55\1\25\1\26\1\45"+
			"\1\44\1\46\1\36\1\uffff\32\56\1\32\1\uffff\1\33\1\52\1\11\1\uffff\1\21"+
			"\1\10\1\4\1\7\1\12\1\6\1\16\1\56\1\3\2\56\1\20\5\56\1\17\1\13\1\22\1"+
			"\14\1\5\1\15\3\56\1\34\1\43\1\35\1\53",
			"\0\61",
			"\0\63",
			"\1\67\6\uffff\1\66\1\65",
			"\1\72\6\uffff\1\70\6\uffff\1\71",
			"\1\73",
			"\1\74\2\uffff\1\75",
			"\1\77\11\uffff\1\76",
			"\1\100\2\uffff\1\101",
			"\1\102\1\103\5\uffff\1\104",
			"\1\106\1\uffff\1\105\11\uffff\1\107",
			"\1\112\1\113\12\uffff\1\110\2\uffff\1\111",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123\1\uffff\12\125",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\127\17\uffff\1\130\1\126",
			"\1\132\21\uffff\1\133",
			"\1\135",
			"\1\137",
			"\1\142\76\uffff\1\141",
			"\1\144",
			"\1\147\1\146",
			"\1\151\1\152",
			"\1\154",
			"\1\160\4\uffff\1\157\15\uffff\1\156",
			"\1\162",
			"\1\164",
			"",
			"\1\125\1\uffff\12\125",
			"\1\125\1\uffff\12\167",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\171\7\uffff\1\170",
			"\1\172",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\174",
			"\1\175\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0083\5\56",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008f\20\uffff\1\u008e",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092\22\uffff\1\u0093",
			"\1\u0094\11\uffff\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u009a\13\uffff\1\u0099\1\u0098",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u009e",
			"",
			"",
			"\1\u00a0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\125\1\uffff\12\167",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00a3",
			"\1\u00a4",
			"",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a8\1\u00a7",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00ad",
			"",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"",
			"",
			"",
			"",
			"\1\u00c7",
			"\1\u00c8",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00cf",
			"",
			"\1\u00d0",
			"\1\u00d1",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"",
			"\1\u00ec",
			"\1\u00ed",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00f0",
			"\1\u00f1",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00f4",
			"\1\u00f5",
			"",
			"",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00fb",
			"\1\u00fc",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00fe",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"",
			"",
			"\1\u0103",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0109",
			"",
			"",
			"\1\u010a",
			"\1\u010b",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\u0112",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"",
			"\1\u0117",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0119",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u011b",
			"\1\u011c",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u011d",
			"",
			"\1\u011e",
			"\1\u011f",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0121",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0124",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\u0129",
			"",
			"",
			"",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( STRING_LITERAL | CHAR_LITERAL | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | BOOL | BOOL_TYPE_2 | COMPLEX_TYPE | COMPLEX_TYPE_2 | IMAGINARY_TYPE | IMAGINARY_TYPE_2 | ENUM_TYPE | STRUCT_TYPE | UNION_TYPE | SWITCH_TYPE | CASE_TYPE | DEFAULT_TYPE | DO_TYPE | WHILE_TYPE | BREAK_TYPE | CONTINUE_TYPE | FOR_TYPE | IF_TYPE | ELSE_TYPE | GOTO_TYPE | RETURN_TYPE | CONST_TYPE | RESTRICT_TYPE | INLINE_TYPE | SHORT_TYPE | LONG_TYPE | SIGNED_TYPE | UNSIGNED_TYPE | AUTO_TYPE | REGISTER_TYPE | STATIC_TYPE | EXTERN_TYPE | TYPEDEF_TYPE | SIZEOF | VAR_ARG | COMMA | COLON | SEMICOLON | HASH | LPAREN | RPAREN | LBRACKET | RBRACKET | CURLY_LBRACKET | CURLY_RBRACKET | APOSTROPHE | QUOTE | QUESTIONMARK | ACCESS_OP | PTR_ACCESS_OP | PP_OP | MM_OP | NOT_OP | AND_OP | OR_OP | EQ_OP | NE_OP | LE_OP | GE_OP | LT_OP | RT_OP | ASSIGN_OP | ADD_ASSIGN_OP | MINUS_ASSIGN_OP | MUL_ASSIGN_OP | DIVIDE_ASSIGN_OP | MOD_ASSIGN_OP | OR_ASSIGN_OP | XOR_ASSIGN_OP | LSHIFT_ASSIGN_OP | RSHIFT_ASSIGN_OP | ADD_OP | MINUS_OP | MUL_OP | DIVIDE_OP | MOD_OP | B_NOT_OP | B_AND_OP | B_OR_OP | B_XOR_OP | RSHIFT_OP | LSHIFT_OP | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_2 = input.LA(1);
						s = -1;
						if ( ((LA14_2 >= '\u0000' && LA14_2 <= '\uFFFF')) ) {s = 51;}
						else s = 52;
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA14_1 = input.LA(1);
						s = -1;
						if ( ((LA14_1 >= '\u0000' && LA14_1 <= '\uFFFF')) ) {s = 49;}
						else s = 50;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
