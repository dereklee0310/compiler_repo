// $ANTLR null C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g 2023-05-12 02:28:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCheckerLexer() {} 
	public myCheckerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g"; }

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:7:7: ( '!' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:7:9: '!'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:8:7: ( '!=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:8:9: '!='
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:9:7: ( '%' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:9:9: '%'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:10:7: ( '%=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:10:9: '%='
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:11:7: ( '&&' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:11:9: '&&'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:12:7: ( '&' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:12:9: '&'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:13:7: ( '&=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:13:9: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:14:7: ( '(' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:14:9: '('
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:15:7: ( ')' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:15:9: ')'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:16:7: ( '*' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:16:9: '*'
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:17:7: ( '**' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:17:9: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:18:7: ( '*=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:18:9: '*='
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:19:7: ( '+' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:19:9: '+'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:20:7: ( '++' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:20:9: '++'
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:21:7: ( '+=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:21:9: '+='
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:22:7: ( ',' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:22:9: ','
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:23:7: ( '-' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:23:9: '-'
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
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:24:7: ( '--' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:24:9: '--'
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
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:25:7: ( '-=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:25:9: '-='
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
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:26:7: ( '->' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:26:9: '->'
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
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:27:7: ( '.' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:27:9: '.'
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
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:28:7: ( '...' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:28:9: '...'
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:29:7: ( '/' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:29:9: '/'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:30:7: ( '/=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:30:9: '/='
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:31:7: ( ':' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:31:9: ':'
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:7: ( ';' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:32:9: ';'
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
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:33:7: ( '<' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:33:9: '<'
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
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:34:7: ( '<<' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:34:9: '<<'
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
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:35:7: ( '<<=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:35:9: '<<='
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
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:36:7: ( '<=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:36:9: '<='
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
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:37:7: ( '=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:37:9: '='
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:38:7: ( '==' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:38:9: '=='
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
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:39:7: ( '>' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:39:9: '>'
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
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:40:7: ( '>=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:40:9: '>='
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:41:7: ( '>>' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:41:9: '>>'
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:42:7: ( '>>=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:42:9: '>>='
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
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:43:7: ( '?' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:43:9: '?'
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
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:44:7: ( '[' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:44:9: '['
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
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:45:7: ( ']' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:45:9: ']'
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
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:46:7: ( '^' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:46:9: '^'
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
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:47:7: ( '^=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:47:9: '^='
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
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:48:7: ( 'case' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:48:9: 'case'
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
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:49:7: ( 'default' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:49:9: 'default'
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
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:50:7: ( 'sizeof' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:50:9: 'sizeof'
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
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:51:7: ( '{' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:51:9: '{'
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
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:52:7: ( '|' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:52:9: '|'
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
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:53:7: ( '|=' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:53:9: '|='
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
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:54:7: ( '||' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:54:9: '||'
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
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:55:7: ( '}' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:55:9: '}'
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
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:56:7: ( '~' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:56:9: '~'
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
	// $ANTLR end "T__91"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:625:5: ( 'void' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:625:7: 'void'
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
	// $ANTLR end "VOID"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:626:5: ( 'char' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:626:7: 'char'
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
	// $ANTLR end "CHAR"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:627:6: ( 'short' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:627:8: 'short'
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
	// $ANTLR end "SHORT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:628:4: ( 'int' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:628:5: 'int'
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
	// $ANTLR end "INT"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:629:5: ( 'long' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:629:7: 'long'
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
	// $ANTLR end "LONG"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:630:6: ( 'float' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:630:7: 'float'
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:631:7: ( 'double' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:631:9: 'double'
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
	// $ANTLR end "DOUBLE"

	// $ANTLR start "SIGNED"
	public final void mSIGNED() throws RecognitionException {
		try {
			int _type = SIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:632:7: ( 'signed' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:632:9: 'signed'
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
	// $ANTLR end "SIGNED"

	// $ANTLR start "UNSIGNED"
	public final void mUNSIGNED() throws RecognitionException {
		try {
			int _type = UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:633:9: ( 'unsigned' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:633:11: 'unsigned'
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
	// $ANTLR end "UNSIGNED"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:634:5: ( 'bool' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:634:7: 'bool'
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

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:636:6: ( 'const' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:636:8: 'const'
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
	// $ANTLR end "CONST"

	// $ANTLR start "VOLATILE"
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:637:9: ( 'volatile' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:637:11: 'volatile'
			{
			match("volatile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOLATILE"

	// $ANTLR start "EXTERN"
	public final void mEXTERN() throws RecognitionException {
		try {
			int _type = EXTERN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:638:7: ( 'extern' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:638:9: 'extern'
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
	// $ANTLR end "EXTERN"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:639:7: ( 'static' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:639:9: 'static'
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
	// $ANTLR end "STATIC"

	// $ANTLR start "AUTO"
	public final void mAUTO() throws RecognitionException {
		try {
			int _type = AUTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:640:5: ( 'auto' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:640:7: 'auto'
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
	// $ANTLR end "AUTO"

	// $ANTLR start "REGISTER"
	public final void mREGISTER() throws RecognitionException {
		try {
			int _type = REGISTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:641:9: ( 'register' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:641:11: 'register'
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
	// $ANTLR end "REGISTER"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:643:5: ( 'main' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:643:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:644:3: ( 'if' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:644:5: 'if'
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
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:645:5: ( 'else' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:645:7: 'else'
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
	// $ANTLR end "ELSE"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:646:7: ( 'switch' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:646:9: 'switch'
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
	// $ANTLR end "SWITCH"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:647:6: ( 'while' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:647:8: 'while'
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
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:648:3: ( 'do' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:648:5: 'do'
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
	// $ANTLR end "DO"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:649:4: ( 'for' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:649:6: 'for'
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
	// $ANTLR end "FOR"

	// $ANTLR start "GOTO"
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:650:5: ( 'goto' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:650:7: 'goto'
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
	// $ANTLR end "GOTO"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:651:9: ( 'continue' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:651:11: 'continue'
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
	// $ANTLR end "CONTINUE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:652:6: ( 'break' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:652:8: 'break'
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
	// $ANTLR end "BREAK"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:653:7: ( 'return' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:653:9: 'return'
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
	// $ANTLR end "RETURN"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:656:2: ( LETTER ( LETTER | '0' .. '9' )* )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:656:4: LETTER ( LETTER | '0' .. '9' )*
			{
			mLETTER(); 

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:656:11: ( LETTER | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop1;
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
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:662:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

	// $ANTLR start "CHARACTER_LITERAL"
	public final void mCHARACTER_LITERAL() throws RecognitionException {
		try {
			int _type = CHARACTER_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:668:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:668:7: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:668:12: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:668:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:668:31: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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
	// $ANTLR end "CHARACTER_LITERAL"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:671:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:671:7: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:671:11: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\\') ) {
					alt3=1;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:671:13: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:671:30: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

	// $ANTLR start "DECIMAL_LITERAL"
	public final void mDECIMAL_LITERAL() throws RecognitionException {
		try {
			int _type = DECIMAL_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:675:5: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:675:7: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			{
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:675:7: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:675:8: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:675:14: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:675:23: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
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
							break loop4;
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
	// $ANTLR end "DECIMAL_LITERAL"

	// $ANTLR start "FLOATING_POINT_LITERAL"
	public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
		try {
			int _type = FLOATING_POINT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:679:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
				alt9=1;
			}
			else if ( (LA9_0=='.') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:679:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
					{
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:679:7: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match('.'); 
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:679:23: ( '0' .. '9' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
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
							break loop7;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:680:7: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:680:11: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
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
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

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
	// $ANTLR end "FLOATING_POINT_LITERAL"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			int _type = EscapeSequence;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:684:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:684:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:688:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:688:7: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:692:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:692:7: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:692:12: ( options {greedy=false; } : . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='*') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1=='/') ) {
						alt10=2;
					}
					else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
						alt10=1;
					}

				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:692:40: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:696:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:696:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:696:12: (~ ( '\\n' | '\\r' ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop11;
				}
			}

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:696:26: ( '\\r' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\r') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:696:26: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "LINE_COMMAND"
	public final void mLINE_COMMAND() throws RecognitionException {
		try {
			int _type = LINE_COMMAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:700:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:700:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:700:11: (~ ( '\\n' | '\\r' ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop13;
				}
			}

			// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:700:25: ( '\\r' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='\r') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:700:25: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMAND"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:8: ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOL | CONST | VOLATILE | EXTERN | STATIC | AUTO | REGISTER | MAIN | IF | ELSE | SWITCH | WHILE | DO | FOR | GOTO | CONTINUE | BREAK | RETURN | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | EscapeSequence | WS | COMMENT | LINE_COMMENT | LINE_COMMAND )
		int alt15=87;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:10: T__42
				{
				mT__42(); 

				}
				break;
			case 2 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:16: T__43
				{
				mT__43(); 

				}
				break;
			case 3 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:22: T__44
				{
				mT__44(); 

				}
				break;
			case 4 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:28: T__45
				{
				mT__45(); 

				}
				break;
			case 5 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:34: T__46
				{
				mT__46(); 

				}
				break;
			case 6 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:40: T__47
				{
				mT__47(); 

				}
				break;
			case 7 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:46: T__48
				{
				mT__48(); 

				}
				break;
			case 8 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:52: T__49
				{
				mT__49(); 

				}
				break;
			case 9 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:58: T__50
				{
				mT__50(); 

				}
				break;
			case 10 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:64: T__51
				{
				mT__51(); 

				}
				break;
			case 11 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:70: T__52
				{
				mT__52(); 

				}
				break;
			case 12 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:76: T__53
				{
				mT__53(); 

				}
				break;
			case 13 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:82: T__54
				{
				mT__54(); 

				}
				break;
			case 14 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:88: T__55
				{
				mT__55(); 

				}
				break;
			case 15 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:94: T__56
				{
				mT__56(); 

				}
				break;
			case 16 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:100: T__57
				{
				mT__57(); 

				}
				break;
			case 17 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:106: T__58
				{
				mT__58(); 

				}
				break;
			case 18 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:112: T__59
				{
				mT__59(); 

				}
				break;
			case 19 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:118: T__60
				{
				mT__60(); 

				}
				break;
			case 20 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:124: T__61
				{
				mT__61(); 

				}
				break;
			case 21 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:130: T__62
				{
				mT__62(); 

				}
				break;
			case 22 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:136: T__63
				{
				mT__63(); 

				}
				break;
			case 23 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:142: T__64
				{
				mT__64(); 

				}
				break;
			case 24 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:148: T__65
				{
				mT__65(); 

				}
				break;
			case 25 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:154: T__66
				{
				mT__66(); 

				}
				break;
			case 26 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:160: T__67
				{
				mT__67(); 

				}
				break;
			case 27 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:166: T__68
				{
				mT__68(); 

				}
				break;
			case 28 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:172: T__69
				{
				mT__69(); 

				}
				break;
			case 29 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:178: T__70
				{
				mT__70(); 

				}
				break;
			case 30 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:184: T__71
				{
				mT__71(); 

				}
				break;
			case 31 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:190: T__72
				{
				mT__72(); 

				}
				break;
			case 32 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:196: T__73
				{
				mT__73(); 

				}
				break;
			case 33 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:202: T__74
				{
				mT__74(); 

				}
				break;
			case 34 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:208: T__75
				{
				mT__75(); 

				}
				break;
			case 35 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:214: T__76
				{
				mT__76(); 

				}
				break;
			case 36 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:220: T__77
				{
				mT__77(); 

				}
				break;
			case 37 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:226: T__78
				{
				mT__78(); 

				}
				break;
			case 38 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:232: T__79
				{
				mT__79(); 

				}
				break;
			case 39 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:238: T__80
				{
				mT__80(); 

				}
				break;
			case 40 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:244: T__81
				{
				mT__81(); 

				}
				break;
			case 41 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:250: T__82
				{
				mT__82(); 

				}
				break;
			case 42 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:256: T__83
				{
				mT__83(); 

				}
				break;
			case 43 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:262: T__84
				{
				mT__84(); 

				}
				break;
			case 44 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:268: T__85
				{
				mT__85(); 

				}
				break;
			case 45 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:274: T__86
				{
				mT__86(); 

				}
				break;
			case 46 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:280: T__87
				{
				mT__87(); 

				}
				break;
			case 47 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:286: T__88
				{
				mT__88(); 

				}
				break;
			case 48 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:292: T__89
				{
				mT__89(); 

				}
				break;
			case 49 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:298: T__90
				{
				mT__90(); 

				}
				break;
			case 50 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:304: T__91
				{
				mT__91(); 

				}
				break;
			case 51 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:310: VOID
				{
				mVOID(); 

				}
				break;
			case 52 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:315: CHAR
				{
				mCHAR(); 

				}
				break;
			case 53 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:320: SHORT
				{
				mSHORT(); 

				}
				break;
			case 54 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:326: INT
				{
				mINT(); 

				}
				break;
			case 55 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:330: LONG
				{
				mLONG(); 

				}
				break;
			case 56 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:335: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 57 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:341: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 58 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:348: SIGNED
				{
				mSIGNED(); 

				}
				break;
			case 59 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:355: UNSIGNED
				{
				mUNSIGNED(); 

				}
				break;
			case 60 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:364: BOOL
				{
				mBOOL(); 

				}
				break;
			case 61 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:369: CONST
				{
				mCONST(); 

				}
				break;
			case 62 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:375: VOLATILE
				{
				mVOLATILE(); 

				}
				break;
			case 63 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:384: EXTERN
				{
				mEXTERN(); 

				}
				break;
			case 64 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:391: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 65 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:398: AUTO
				{
				mAUTO(); 

				}
				break;
			case 66 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:403: REGISTER
				{
				mREGISTER(); 

				}
				break;
			case 67 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:412: MAIN
				{
				mMAIN(); 

				}
				break;
			case 68 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:417: IF
				{
				mIF(); 

				}
				break;
			case 69 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:420: ELSE
				{
				mELSE(); 

				}
				break;
			case 70 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:425: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 71 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:432: WHILE
				{
				mWHILE(); 

				}
				break;
			case 72 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:438: DO
				{
				mDO(); 

				}
				break;
			case 73 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:441: FOR
				{
				mFOR(); 

				}
				break;
			case 74 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:445: GOTO
				{
				mGOTO(); 

				}
				break;
			case 75 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:450: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 76 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:459: BREAK
				{
				mBREAK(); 

				}
				break;
			case 77 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:465: RETURN
				{
				mRETURN(); 

				}
				break;
			case 78 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:472: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 79 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:483: CHARACTER_LITERAL
				{
				mCHARACTER_LITERAL(); 

				}
				break;
			case 80 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:501: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 81 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:516: DECIMAL_LITERAL
				{
				mDECIMAL_LITERAL(); 

				}
				break;
			case 82 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:532: FLOATING_POINT_LITERAL
				{
				mFLOATING_POINT_LITERAL(); 

				}
				break;
			case 83 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:555: EscapeSequence
				{
				mEscapeSequence(); 

				}
				break;
			case 84 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:570: WS
				{
				mWS(); 

				}
				break;
			case 85 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:573: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 86 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:581: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 87 :
				// C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\myChecker.g:1:594: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\1\uffff\1\61\1\63\1\66\2\uffff\1\71\1\74\1\uffff\1\100\1\102\1\107\2"+
		"\uffff\1\112\1\114\1\117\3\uffff\1\121\3\50\1\uffff\1\135\2\uffff\14\50"+
		"\3\uffff\2\156\33\uffff\1\161\5\uffff\1\163\3\uffff\4\50\1\171\4\50\3"+
		"\uffff\2\50\1\u0082\15\50\1\uffff\1\156\4\uffff\5\50\1\uffff\7\50\1\u009e"+
		"\1\uffff\2\50\1\u00a1\13\50\1\u00ad\1\u00ae\11\50\1\u00b8\1\50\1\uffff"+
		"\1\u00ba\1\50\1\uffff\1\50\1\u00bd\2\50\1\u00c0\1\u00c1\2\50\1\u00c4\1"+
		"\50\1\u00c6\2\uffff\1\u00c7\5\50\1\u00cd\2\50\1\uffff\1\50\1\uffff\1\u00d1"+
		"\1\50\1\uffff\1\u00d3\1\50\2\uffff\2\50\1\uffff\1\u00d7\2\uffff\2\50\1"+
		"\u00da\1\u00db\1\u00dc\1\uffff\1\u00dd\1\u00de\1\50\1\uffff\1\50\1\uffff"+
		"\1\u00e1\1\50\1\u00e3\1\uffff\1\50\1\u00e5\5\uffff\2\50\1\uffff\1\50\1"+
		"\uffff\1\u00e9\1\uffff\1\u00ea\1\u00eb\1\u00ec\4\uffff";
	static final String DFA15_eofS =
		"\u00ed\uffff";
	static final String DFA15_minS =
		"\1\11\2\75\1\46\2\uffff\1\52\1\53\1\uffff\1\55\1\56\1\52\2\uffff\1\74"+
		"\2\75\3\uffff\1\75\1\141\1\145\1\150\1\uffff\1\75\2\uffff\1\157\1\146"+
		"\1\157\1\154\1\156\1\157\1\154\1\165\1\145\1\141\1\150\1\157\3\uffff\2"+
		"\56\33\uffff\1\75\5\uffff\1\75\3\uffff\1\163\1\141\1\156\1\146\1\44\1"+
		"\147\1\157\1\141\1\151\3\uffff\1\151\1\164\1\44\1\156\1\157\1\162\1\163"+
		"\1\157\1\145\1\164\1\163\1\164\1\147\2\151\1\164\1\uffff\1\56\4\uffff"+
		"\1\145\1\162\1\163\1\141\1\142\1\uffff\1\145\1\156\1\162\2\164\1\144\1"+
		"\141\1\44\1\uffff\1\147\1\141\1\44\1\151\1\154\1\141\2\145\1\157\1\151"+
		"\1\165\1\156\1\154\1\157\2\44\1\164\1\151\1\165\1\154\1\157\1\145\1\164"+
		"\1\151\1\143\1\44\1\164\1\uffff\1\44\1\164\1\uffff\1\147\1\44\1\153\1"+
		"\162\2\44\1\163\1\162\1\44\1\145\1\44\2\uffff\1\44\1\156\1\154\1\145\1"+
		"\146\1\144\1\44\1\143\1\150\1\uffff\1\151\1\uffff\1\44\1\156\1\uffff\1"+
		"\44\1\156\2\uffff\1\164\1\156\1\uffff\1\44\2\uffff\1\165\1\164\3\44\1"+
		"\uffff\2\44\1\154\1\uffff\1\145\1\uffff\1\44\1\145\1\44\1\uffff\1\145"+
		"\1\44\5\uffff\1\145\1\144\1\uffff\1\162\1\uffff\1\44\1\uffff\3\44\4\uffff";
	static final String DFA15_maxS =
		"\1\176\3\75\2\uffff\2\75\1\uffff\1\76\1\71\1\75\2\uffff\2\75\1\76\3\uffff"+
		"\1\75\2\157\1\167\1\uffff\1\174\2\uffff\1\157\1\156\2\157\1\156\1\162"+
		"\1\170\1\165\1\145\1\141\1\150\1\157\3\uffff\2\71\33\uffff\1\75\5\uffff"+
		"\1\75\3\uffff\1\163\1\141\1\156\1\146\2\172\1\157\1\141\1\151\3\uffff"+
		"\1\154\1\164\1\172\1\156\1\157\1\162\1\163\1\157\1\145\1\164\1\163\2\164"+
		"\2\151\1\164\1\uffff\1\71\4\uffff\1\145\1\162\1\164\1\141\1\142\1\uffff"+
		"\1\145\1\156\1\162\2\164\1\144\1\141\1\172\1\uffff\1\147\1\141\1\172\1"+
		"\151\1\154\1\141\2\145\1\157\1\151\1\165\1\156\1\154\1\157\2\172\1\164"+
		"\1\151\1\165\1\154\1\157\1\145\1\164\1\151\1\143\1\172\1\164\1\uffff\1"+
		"\172\1\164\1\uffff\1\147\1\172\1\153\1\162\2\172\1\163\1\162\1\172\1\145"+
		"\1\172\2\uffff\1\172\1\156\1\154\1\145\1\146\1\144\1\172\1\143\1\150\1"+
		"\uffff\1\151\1\uffff\1\172\1\156\1\uffff\1\172\1\156\2\uffff\1\164\1\156"+
		"\1\uffff\1\172\2\uffff\1\165\1\164\3\172\1\uffff\2\172\1\154\1\uffff\1"+
		"\145\1\uffff\1\172\1\145\1\172\1\uffff\1\145\1\172\5\uffff\1\145\1\144"+
		"\1\uffff\1\162\1\uffff\1\172\1\uffff\3\172\4\uffff";
	static final String DFA15_acceptS =
		"\4\uffff\1\10\1\11\2\uffff\1\20\3\uffff\1\31\1\32\3\uffff\1\45\1\46\1"+
		"\47\4\uffff\1\55\1\uffff\1\61\1\62\14\uffff\1\116\1\117\1\120\2\uffff"+
		"\1\123\1\124\1\127\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\14\1\12\1\16\1\17"+
		"\1\15\1\22\1\23\1\24\1\21\1\26\1\25\1\122\1\30\1\125\1\126\1\27\1\uffff"+
		"\1\36\1\33\1\40\1\37\1\42\1\uffff\1\41\1\51\1\50\11\uffff\1\57\1\60\1"+
		"\56\20\uffff\1\121\1\uffff\1\35\1\34\1\44\1\43\5\uffff\1\110\10\uffff"+
		"\1\104\33\uffff\1\66\2\uffff\1\111\13\uffff\1\52\1\64\11\uffff\1\63\1"+
		"\uffff\1\67\2\uffff\1\74\2\uffff\1\105\1\101\2\uffff\1\103\1\uffff\1\112"+
		"\1\75\5\uffff\1\65\3\uffff\1\70\1\uffff\1\114\3\uffff\1\107\2\uffff\1"+
		"\71\1\54\1\72\1\100\1\106\2\uffff\1\77\1\uffff\1\115\1\uffff\1\53\3\uffff"+
		"\1\113\1\76\1\73\1\102";
	static final String DFA15_specialS =
		"\u00ed\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\56\1\uffff\2\56\22\uffff\1\56\1\1\1\52\1\57\1\50\1\2\1\3\1\51\1\4"+
			"\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\53\11\54\1\14\1\15\1\16\1\17\1\20"+
			"\1\21\1\uffff\32\50\1\22\1\55\1\23\1\24\1\50\1\uffff\1\43\1\41\1\25\1"+
			"\26\1\42\1\37\1\47\1\50\1\35\2\50\1\36\1\45\4\50\1\44\1\27\1\50\1\40"+
			"\1\34\1\46\3\50\1\30\1\31\1\32\1\33",
			"\1\60",
			"\1\62",
			"\1\64\26\uffff\1\65",
			"",
			"",
			"\1\67\22\uffff\1\70",
			"\1\72\21\uffff\1\73",
			"",
			"\1\75\17\uffff\1\76\1\77",
			"\1\101\1\uffff\12\103",
			"\1\105\4\uffff\1\106\15\uffff\1\104",
			"",
			"",
			"\1\110\1\111",
			"\1\113",
			"\1\115\1\116",
			"",
			"",
			"",
			"\1\120",
			"\1\122\6\uffff\1\123\6\uffff\1\124",
			"\1\125\11\uffff\1\126",
			"\1\130\1\127\12\uffff\1\131\2\uffff\1\132",
			"",
			"\1\133\76\uffff\1\134",
			"",
			"",
			"\1\136",
			"\1\140\7\uffff\1\137",
			"\1\141",
			"\1\142\2\uffff\1\143",
			"\1\144",
			"\1\145\2\uffff\1\146",
			"\1\150\13\uffff\1\147",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"",
			"",
			"",
			"\1\103\1\uffff\12\103",
			"\1\103\1\uffff\12\157",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\160",
			"",
			"",
			"",
			"",
			"",
			"\1\162",
			"",
			"",
			"",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\170"+
			"\5\50",
			"\1\173\22\uffff\1\172",
			"\1\174",
			"\1\175",
			"\1\176",
			"",
			"",
			"",
			"\1\177\2\uffff\1\u0080",
			"\1\u0081",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c\14\uffff\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"",
			"\1\103\1\uffff\12\157",
			"",
			"",
			"",
			"",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u009f",
			"\1\u00a0",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00b9",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00bb",
			"",
			"\1\u00bc",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00be",
			"\1\u00bf",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c2",
			"\1\u00c3",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c5",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ce",
			"\1\u00cf",
			"",
			"\1\u00d0",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d2",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d4",
			"",
			"",
			"\1\u00d5",
			"\1\u00d6",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\u00d8",
			"\1\u00d9",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00df",
			"",
			"\1\u00e0",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00e2",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00e4",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"",
			"\1\u00e8",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOL | CONST | VOLATILE | EXTERN | STATIC | AUTO | REGISTER | MAIN | IF | ELSE | SWITCH | WHILE | DO | FOR | GOTO | CONTINUE | BREAK | RETURN | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | EscapeSequence | WS | COMMENT | LINE_COMMENT | LINE_COMMAND );";
		}
	}

}
