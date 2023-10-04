// $ANTLR 3.5.3 myCompiler.g 2023-06-15 15:40:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
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
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int CHARACTER_LITERAL=4;
	public static final int COMMENT=5;
	public static final int DECIMAL_LITERAL=6;
	public static final int EscapeSequence=7;
	public static final int Exponent=8;
	public static final int FLOATING_POINT_LITERAL=9;
	public static final int FloatTypeSuffix=10;
	public static final int IDENTIFIER=11;
	public static final int LETTER=12;
	public static final int LINE_COMMAND=13;
	public static final int LINE_COMMENT=14;
	public static final int STRING_LITERAL=15;
	public static final int WS=16;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:7:7: ( '!' )
			// myCompiler.g:7:9: '!'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:8:7: ( '!=' )
			// myCompiler.g:8:9: '!='
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:9:7: ( '%' )
			// myCompiler.g:9:9: '%'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:10:7: ( '%=' )
			// myCompiler.g:10:9: '%='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:11:7: ( '&&' )
			// myCompiler.g:11:9: '&&'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:12:7: ( '&' )
			// myCompiler.g:12:9: '&'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:13:7: ( '&=' )
			// myCompiler.g:13:9: '&='
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:14:7: ( '(' )
			// myCompiler.g:14:9: '('
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:15:7: ( ')' )
			// myCompiler.g:15:9: ')'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:16:7: ( '*' )
			// myCompiler.g:16:9: '*'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:17:7: ( '*=' )
			// myCompiler.g:17:9: '*='
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:18:7: ( '+' )
			// myCompiler.g:18:9: '+'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:19:7: ( '++' )
			// myCompiler.g:19:9: '++'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:20:7: ( '+=' )
			// myCompiler.g:20:9: '+='
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:21:7: ( ',' )
			// myCompiler.g:21:9: ','
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:22:7: ( '-' )
			// myCompiler.g:22:9: '-'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:23:7: ( '--' )
			// myCompiler.g:23:9: '--'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:24:7: ( '-=' )
			// myCompiler.g:24:9: '-='
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:25:7: ( '->' )
			// myCompiler.g:25:9: '->'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:26:7: ( '.' )
			// myCompiler.g:26:9: '.'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:27:7: ( '...' )
			// myCompiler.g:27:9: '...'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:28:7: ( '/' )
			// myCompiler.g:28:9: '/'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:29:7: ( '/=' )
			// myCompiler.g:29:9: '/='
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:30:7: ( ':' )
			// myCompiler.g:30:9: ':'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:31:7: ( ';' )
			// myCompiler.g:31:9: ';'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:32:7: ( '<' )
			// myCompiler.g:32:9: '<'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:33:7: ( '<<' )
			// myCompiler.g:33:9: '<<'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:34:7: ( '<<=' )
			// myCompiler.g:34:9: '<<='
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:35:7: ( '<=' )
			// myCompiler.g:35:9: '<='
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:36:7: ( '=' )
			// myCompiler.g:36:9: '='
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:37:7: ( '==' )
			// myCompiler.g:37:9: '=='
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:38:7: ( '>' )
			// myCompiler.g:38:9: '>'
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:39:7: ( '>=' )
			// myCompiler.g:39:9: '>='
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:40:7: ( '>>' )
			// myCompiler.g:40:9: '>>'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:41:7: ( '>>=' )
			// myCompiler.g:41:9: '>>='
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:42:7: ( '?' )
			// myCompiler.g:42:9: '?'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:43:7: ( '[' )
			// myCompiler.g:43:9: '['
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:44:7: ( ']' )
			// myCompiler.g:44:9: ']'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:45:7: ( '^' )
			// myCompiler.g:45:9: '^'
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:46:7: ( '^=' )
			// myCompiler.g:46:9: '^='
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:47:7: ( 'auto' )
			// myCompiler.g:47:9: 'auto'
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:48:7: ( 'bool' )
			// myCompiler.g:48:9: 'bool'
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
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:49:7: ( 'break' )
			// myCompiler.g:49:9: 'break'
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
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:50:7: ( 'case' )
			// myCompiler.g:50:9: 'case'
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
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:51:7: ( 'char' )
			// myCompiler.g:51:9: 'char'
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
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:52:7: ( 'const' )
			// myCompiler.g:52:9: 'const'
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
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:53:7: ( 'continue' )
			// myCompiler.g:53:9: 'continue'
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:54:7: ( 'default' )
			// myCompiler.g:54:9: 'default'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:55:7: ( 'do' )
			// myCompiler.g:55:9: 'do'
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:56:7: ( 'double' )
			// myCompiler.g:56:9: 'double'
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:57:7: ( 'else' )
			// myCompiler.g:57:9: 'else'
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
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:58:7: ( 'enum' )
			// myCompiler.g:58:9: 'enum'
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
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:59:7: ( 'extern' )
			// myCompiler.g:59:9: 'extern'
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
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:60:7: ( 'float' )
			// myCompiler.g:60:9: 'float'
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
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:61:7: ( 'for' )
			// myCompiler.g:61:9: 'for'
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
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:62:7: ( 'goto' )
			// myCompiler.g:62:9: 'goto'
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:63:7: ( 'if' )
			// myCompiler.g:63:9: 'if'
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
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:64:7: ( 'int' )
			// myCompiler.g:64:9: 'int'
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
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:65:7: ( 'long' )
			// myCompiler.g:65:9: 'long'
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:66:7: ( 'register' )
			// myCompiler.g:66:9: 'register'
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:67:7: ( 'return' )
			// myCompiler.g:67:9: 'return'
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
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:68:7: ( 'short' )
			// myCompiler.g:68:9: 'short'
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
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:69:7: ( 'signed' )
			// myCompiler.g:69:9: 'signed'
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
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:70:7: ( 'sizeof' )
			// myCompiler.g:70:9: 'sizeof'
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
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:71:7: ( 'static' )
			// myCompiler.g:71:9: 'static'
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
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:72:7: ( 'struct' )
			// myCompiler.g:72:9: 'struct'
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
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:73:7: ( 'switch' )
			// myCompiler.g:73:9: 'switch'
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
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:74:7: ( 'typedef' )
			// myCompiler.g:74:9: 'typedef'
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
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:75:7: ( 'union' )
			// myCompiler.g:75:9: 'union'
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
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:76:7: ( 'unsigned' )
			// myCompiler.g:76:9: 'unsigned'
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
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:77:7: ( 'void' )
			// myCompiler.g:77:9: 'void'
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
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:78:7: ( 'volatile' )
			// myCompiler.g:78:9: 'volatile'
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
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:79:7: ( 'while' )
			// myCompiler.g:79:9: 'while'
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
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:80:7: ( '{' )
			// myCompiler.g:80:9: '{'
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
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:81:7: ( '|' )
			// myCompiler.g:81:9: '|'
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
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:82:7: ( '|=' )
			// myCompiler.g:82:9: '|='
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
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:83:7: ( '||' )
			// myCompiler.g:83:9: '||'
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
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:84:7: ( '}' )
			// myCompiler.g:84:9: '}'
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
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:85:7: ( '~' )
			// myCompiler.g:85:9: '~'
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
	// $ANTLR end "T__95"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:1161:2: ( LETTER ( LETTER | '0' .. '9' )* )
			// myCompiler.g:1161:4: LETTER ( LETTER | '0' .. '9' )*
			{
			mLETTER(); 

			// myCompiler.g:1161:11: ( LETTER | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:
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
			// myCompiler.g:1167:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
			// myCompiler.g:
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
			// myCompiler.g:1173:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// myCompiler.g:1173:7: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// myCompiler.g:1173:12: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )
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
					// myCompiler.g:1173:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:1173:31: ~ ( '\\'' | '\\\\' )
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
			// myCompiler.g:1177:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myCompiler.g:1177:7: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myCompiler.g:1177:11: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
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
					// myCompiler.g:1177:13: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:1177:30: ~ ( '\\\\' | '\"' )
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
			// myCompiler.g:1182:5: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
			// myCompiler.g:1182:7: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			{
			// myCompiler.g:1182:7: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
					// myCompiler.g:1182:8: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myCompiler.g:1182:14: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// myCompiler.g:1182:23: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// myCompiler.g:
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
			// myCompiler.g:1186:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
				alt13=1;
			}
			else if ( (LA13_0=='.') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// myCompiler.g:1186:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
					{
					// myCompiler.g:1186:9: ( '0' .. '9' )+
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
							// myCompiler.g:
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
					// myCompiler.g:1186:25: ( '0' .. '9' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// myCompiler.g:
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

					// myCompiler.g:1186:37: ( Exponent )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// myCompiler.g:1186:37: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// myCompiler.g:1186:47: ( FloatTypeSuffix )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='D'||LA9_0=='F'||LA9_0=='d'||LA9_0=='f') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// myCompiler.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
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

					}
					break;
				case 2 :
					// myCompiler.g:1187:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
					{
					match('.'); 
					// myCompiler.g:1187:13: ( '0' .. '9' )+
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
							// myCompiler.g:
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

					// myCompiler.g:1187:25: ( Exponent )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// myCompiler.g:1187:25: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// myCompiler.g:1187:35: ( FloatTypeSuffix )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='d'||LA12_0=='f') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// myCompiler.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
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

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// myCompiler.g:1194:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// myCompiler.g:1194:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:1194:22: ( '+' | '-' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+'||LA14_0=='-') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// myCompiler.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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

			// myCompiler.g:1194:33: ( '0' .. '9' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "FloatTypeSuffix"
	public final void mFloatTypeSuffix() throws RecognitionException {
		try {
			// myCompiler.g:1197:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
			// myCompiler.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
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
	// $ANTLR end "FloatTypeSuffix"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myCompiler.g:1203:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// myCompiler.g:1203:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
			// myCompiler.g:1206:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// myCompiler.g:1206:7: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
			// myCompiler.g:1210:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myCompiler.g:1210:7: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:1210:12: ( options {greedy=false; } : . )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='*') ) {
					int LA16_1 = input.LA(2);
					if ( (LA16_1=='/') ) {
						alt16=2;
					}
					else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
						alt16=1;
					}

				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// myCompiler.g:1210:40: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop16;
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
			// myCompiler.g:1214:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// myCompiler.g:1214:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// myCompiler.g:1214:12: (~ ( '\\n' | '\\r' ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\uFFFF')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// myCompiler.g:
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
					break loop17;
				}
			}

			// myCompiler.g:1214:26: ( '\\r' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\r') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// myCompiler.g:1214:26: '\\r'
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
			// myCompiler.g:1218:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// myCompiler.g:1218:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// myCompiler.g:1218:11: (~ ( '\\n' | '\\r' ) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myCompiler.g:
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
					break loop19;
				}
			}

			// myCompiler.g:1218:25: ( '\\r' )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\r') ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// myCompiler.g:1218:25: '\\r'
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
		// myCompiler.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND )
		int alt21=88;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// myCompiler.g:1:10: T__17
				{
				mT__17(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:16: T__18
				{
				mT__18(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:22: T__19
				{
				mT__19(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:28: T__20
				{
				mT__20(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:34: T__21
				{
				mT__21(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:40: T__22
				{
				mT__22(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:46: T__23
				{
				mT__23(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:52: T__24
				{
				mT__24(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:58: T__25
				{
				mT__25(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:64: T__26
				{
				mT__26(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:70: T__27
				{
				mT__27(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:76: T__28
				{
				mT__28(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:82: T__29
				{
				mT__29(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:88: T__30
				{
				mT__30(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:94: T__31
				{
				mT__31(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:100: T__32
				{
				mT__32(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:106: T__33
				{
				mT__33(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:112: T__34
				{
				mT__34(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:118: T__35
				{
				mT__35(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:124: T__36
				{
				mT__36(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:130: T__37
				{
				mT__37(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:136: T__38
				{
				mT__38(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:142: T__39
				{
				mT__39(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:148: T__40
				{
				mT__40(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:154: T__41
				{
				mT__41(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:160: T__42
				{
				mT__42(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:166: T__43
				{
				mT__43(); 

				}
				break;
			case 28 :
				// myCompiler.g:1:172: T__44
				{
				mT__44(); 

				}
				break;
			case 29 :
				// myCompiler.g:1:178: T__45
				{
				mT__45(); 

				}
				break;
			case 30 :
				// myCompiler.g:1:184: T__46
				{
				mT__46(); 

				}
				break;
			case 31 :
				// myCompiler.g:1:190: T__47
				{
				mT__47(); 

				}
				break;
			case 32 :
				// myCompiler.g:1:196: T__48
				{
				mT__48(); 

				}
				break;
			case 33 :
				// myCompiler.g:1:202: T__49
				{
				mT__49(); 

				}
				break;
			case 34 :
				// myCompiler.g:1:208: T__50
				{
				mT__50(); 

				}
				break;
			case 35 :
				// myCompiler.g:1:214: T__51
				{
				mT__51(); 

				}
				break;
			case 36 :
				// myCompiler.g:1:220: T__52
				{
				mT__52(); 

				}
				break;
			case 37 :
				// myCompiler.g:1:226: T__53
				{
				mT__53(); 

				}
				break;
			case 38 :
				// myCompiler.g:1:232: T__54
				{
				mT__54(); 

				}
				break;
			case 39 :
				// myCompiler.g:1:238: T__55
				{
				mT__55(); 

				}
				break;
			case 40 :
				// myCompiler.g:1:244: T__56
				{
				mT__56(); 

				}
				break;
			case 41 :
				// myCompiler.g:1:250: T__57
				{
				mT__57(); 

				}
				break;
			case 42 :
				// myCompiler.g:1:256: T__58
				{
				mT__58(); 

				}
				break;
			case 43 :
				// myCompiler.g:1:262: T__59
				{
				mT__59(); 

				}
				break;
			case 44 :
				// myCompiler.g:1:268: T__60
				{
				mT__60(); 

				}
				break;
			case 45 :
				// myCompiler.g:1:274: T__61
				{
				mT__61(); 

				}
				break;
			case 46 :
				// myCompiler.g:1:280: T__62
				{
				mT__62(); 

				}
				break;
			case 47 :
				// myCompiler.g:1:286: T__63
				{
				mT__63(); 

				}
				break;
			case 48 :
				// myCompiler.g:1:292: T__64
				{
				mT__64(); 

				}
				break;
			case 49 :
				// myCompiler.g:1:298: T__65
				{
				mT__65(); 

				}
				break;
			case 50 :
				// myCompiler.g:1:304: T__66
				{
				mT__66(); 

				}
				break;
			case 51 :
				// myCompiler.g:1:310: T__67
				{
				mT__67(); 

				}
				break;
			case 52 :
				// myCompiler.g:1:316: T__68
				{
				mT__68(); 

				}
				break;
			case 53 :
				// myCompiler.g:1:322: T__69
				{
				mT__69(); 

				}
				break;
			case 54 :
				// myCompiler.g:1:328: T__70
				{
				mT__70(); 

				}
				break;
			case 55 :
				// myCompiler.g:1:334: T__71
				{
				mT__71(); 

				}
				break;
			case 56 :
				// myCompiler.g:1:340: T__72
				{
				mT__72(); 

				}
				break;
			case 57 :
				// myCompiler.g:1:346: T__73
				{
				mT__73(); 

				}
				break;
			case 58 :
				// myCompiler.g:1:352: T__74
				{
				mT__74(); 

				}
				break;
			case 59 :
				// myCompiler.g:1:358: T__75
				{
				mT__75(); 

				}
				break;
			case 60 :
				// myCompiler.g:1:364: T__76
				{
				mT__76(); 

				}
				break;
			case 61 :
				// myCompiler.g:1:370: T__77
				{
				mT__77(); 

				}
				break;
			case 62 :
				// myCompiler.g:1:376: T__78
				{
				mT__78(); 

				}
				break;
			case 63 :
				// myCompiler.g:1:382: T__79
				{
				mT__79(); 

				}
				break;
			case 64 :
				// myCompiler.g:1:388: T__80
				{
				mT__80(); 

				}
				break;
			case 65 :
				// myCompiler.g:1:394: T__81
				{
				mT__81(); 

				}
				break;
			case 66 :
				// myCompiler.g:1:400: T__82
				{
				mT__82(); 

				}
				break;
			case 67 :
				// myCompiler.g:1:406: T__83
				{
				mT__83(); 

				}
				break;
			case 68 :
				// myCompiler.g:1:412: T__84
				{
				mT__84(); 

				}
				break;
			case 69 :
				// myCompiler.g:1:418: T__85
				{
				mT__85(); 

				}
				break;
			case 70 :
				// myCompiler.g:1:424: T__86
				{
				mT__86(); 

				}
				break;
			case 71 :
				// myCompiler.g:1:430: T__87
				{
				mT__87(); 

				}
				break;
			case 72 :
				// myCompiler.g:1:436: T__88
				{
				mT__88(); 

				}
				break;
			case 73 :
				// myCompiler.g:1:442: T__89
				{
				mT__89(); 

				}
				break;
			case 74 :
				// myCompiler.g:1:448: T__90
				{
				mT__90(); 

				}
				break;
			case 75 :
				// myCompiler.g:1:454: T__91
				{
				mT__91(); 

				}
				break;
			case 76 :
				// myCompiler.g:1:460: T__92
				{
				mT__92(); 

				}
				break;
			case 77 :
				// myCompiler.g:1:466: T__93
				{
				mT__93(); 

				}
				break;
			case 78 :
				// myCompiler.g:1:472: T__94
				{
				mT__94(); 

				}
				break;
			case 79 :
				// myCompiler.g:1:478: T__95
				{
				mT__95(); 

				}
				break;
			case 80 :
				// myCompiler.g:1:484: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 81 :
				// myCompiler.g:1:495: CHARACTER_LITERAL
				{
				mCHARACTER_LITERAL(); 

				}
				break;
			case 82 :
				// myCompiler.g:1:513: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 83 :
				// myCompiler.g:1:528: DECIMAL_LITERAL
				{
				mDECIMAL_LITERAL(); 

				}
				break;
			case 84 :
				// myCompiler.g:1:544: FLOATING_POINT_LITERAL
				{
				mFLOATING_POINT_LITERAL(); 

				}
				break;
			case 85 :
				// myCompiler.g:1:567: WS
				{
				mWS(); 

				}
				break;
			case 86 :
				// myCompiler.g:1:570: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 87 :
				// myCompiler.g:1:578: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 88 :
				// myCompiler.g:1:591: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA21_eotS =
		"\1\uffff\1\60\1\62\1\65\2\uffff\1\67\1\72\1\uffff\1\76\1\100\1\105\2\uffff"+
		"\1\110\1\112\1\115\3\uffff\1\117\17\50\1\uffff\1\154\5\uffff\2\155\31"+
		"\uffff\1\160\5\uffff\1\162\3\uffff\7\50\1\173\6\50\1\u0082\13\50\4\uffff"+
		"\1\155\4\uffff\10\50\1\uffff\4\50\1\u00a0\1\50\1\uffff\1\u00a2\17\50\1"+
		"\u00b2\1\u00b3\1\50\1\u00b5\1\u00b6\4\50\1\u00bb\1\u00bc\2\50\1\uffff"+
		"\1\u00bf\1\uffff\1\u00c0\13\50\1\u00cc\2\50\2\uffff\1\u00cf\2\uffff\1"+
		"\u00d0\3\50\2\uffff\1\50\1\u00d5\2\uffff\2\50\1\u00d8\6\50\1\u00df\1\50"+
		"\1\uffff\1\50\1\u00e2\2\uffff\2\50\1\u00e5\1\u00e6\1\uffff\1\50\1\u00e8"+
		"\1\uffff\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\50\1\uffff\2\50\1\uffff"+
		"\1\50\1\u00f2\2\uffff\1\50\6\uffff\1\u00f4\2\50\1\u00f7\1\uffff\1\u00f8"+
		"\1\uffff\1\u00f9\1\u00fa\4\uffff";
	static final String DFA21_eofS =
		"\u00fb\uffff";
	static final String DFA21_minS =
		"\1\11\2\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\56\1\52\2\uffff\1\74"+
		"\2\75\3\uffff\1\75\1\165\1\157\1\141\1\145\2\154\1\157\1\146\1\157\1\145"+
		"\1\150\1\171\1\156\1\157\1\150\1\uffff\1\75\5\uffff\2\56\31\uffff\1\75"+
		"\5\uffff\1\75\3\uffff\1\164\1\157\1\145\1\163\1\141\1\156\1\146\1\44\1"+
		"\163\1\165\1\164\1\157\1\162\1\164\1\44\1\164\1\156\1\147\1\157\1\147"+
		"\1\141\1\151\1\160\3\151\4\uffff\1\56\4\uffff\1\157\1\154\1\141\1\145"+
		"\1\162\1\163\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\44\1\157\1"+
		"\uffff\1\44\1\147\1\151\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145"+
		"\1\157\1\151\1\144\1\141\1\154\2\44\1\153\2\44\1\164\1\151\1\165\1\154"+
		"\2\44\1\162\1\164\1\uffff\1\44\1\uffff\1\44\1\163\1\162\1\164\1\145\1"+
		"\157\1\151\2\143\1\144\1\156\1\147\1\44\1\164\1\145\2\uffff\1\44\2\uffff"+
		"\1\44\1\156\1\154\1\145\2\uffff\1\156\1\44\2\uffff\1\164\1\156\1\44\1"+
		"\144\1\146\1\143\1\164\1\150\1\145\1\44\1\156\1\uffff\1\151\1\44\2\uffff"+
		"\1\165\1\164\2\44\1\uffff\1\145\1\44\1\uffff\5\44\1\146\1\uffff\1\145"+
		"\1\154\1\uffff\1\145\1\44\2\uffff\1\162\6\uffff\1\44\1\144\1\145\1\44"+
		"\1\uffff\1\44\1\uffff\2\44\4\uffff";
	static final String DFA21_maxS =
		"\1\176\3\75\2\uffff\2\75\1\uffff\1\76\1\71\1\75\2\uffff\2\75\1\76\3\uffff"+
		"\1\75\1\165\1\162\2\157\1\170\2\157\1\156\1\157\1\145\1\167\1\171\1\156"+
		"\1\157\1\150\1\uffff\1\174\5\uffff\2\71\31\uffff\1\75\5\uffff\1\75\3\uffff"+
		"\1\164\1\157\1\145\1\163\1\141\1\156\1\146\1\172\1\163\1\165\1\164\1\157"+
		"\1\162\1\164\1\172\1\164\1\156\1\164\1\157\1\172\1\162\1\151\1\160\1\163"+
		"\1\154\1\151\4\uffff\1\71\4\uffff\1\157\1\154\1\141\1\145\1\162\1\164"+
		"\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\172\1\157\1\uffff\1\172"+
		"\1\147\1\151\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\157\1\151"+
		"\1\144\1\141\1\154\2\172\1\153\2\172\1\164\1\151\1\165\1\154\2\172\1\162"+
		"\1\164\1\uffff\1\172\1\uffff\1\172\1\163\1\162\1\164\1\145\1\157\1\151"+
		"\2\143\1\144\1\156\1\147\1\172\1\164\1\145\2\uffff\1\172\2\uffff\1\172"+
		"\1\156\1\154\1\145\2\uffff\1\156\1\172\2\uffff\1\164\1\156\1\172\1\144"+
		"\1\146\1\143\1\164\1\150\1\145\1\172\1\156\1\uffff\1\151\1\172\2\uffff"+
		"\1\165\1\164\2\172\1\uffff\1\145\1\172\1\uffff\5\172\1\146\1\uffff\1\145"+
		"\1\154\1\uffff\1\145\1\172\2\uffff\1\162\6\uffff\1\172\1\144\1\145\1\172"+
		"\1\uffff\1\172\1\uffff\2\172\4\uffff";
	static final String DFA21_acceptS =
		"\4\uffff\1\10\1\11\2\uffff\1\17\3\uffff\1\30\1\31\3\uffff\1\44\1\45\1"+
		"\46\20\uffff\1\112\1\uffff\1\116\1\117\1\120\1\121\1\122\2\uffff\1\125"+
		"\1\130\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\12\1\15\1\16\1\14\1\21\1\22"+
		"\1\23\1\20\1\25\1\24\1\124\1\27\1\126\1\127\1\26\1\uffff\1\35\1\32\1\37"+
		"\1\36\1\41\1\uffff\1\40\1\50\1\47\32\uffff\1\114\1\115\1\113\1\123\1\uffff"+
		"\1\34\1\33\1\43\1\42\10\uffff\1\61\6\uffff\1\71\35\uffff\1\67\1\uffff"+
		"\1\72\17\uffff\1\51\1\52\1\uffff\1\54\1\55\4\uffff\1\63\1\64\2\uffff\1"+
		"\70\1\73\13\uffff\1\107\2\uffff\1\53\1\56\4\uffff\1\66\2\uffff\1\76\6"+
		"\uffff\1\105\2\uffff\1\111\2\uffff\1\62\1\65\1\uffff\1\75\1\77\1\100\1"+
		"\101\1\102\1\103\4\uffff\1\60\1\uffff\1\104\2\uffff\1\57\1\74\1\106\1"+
		"\110";
	static final String DFA21_specialS =
		"\u00fb\uffff}>";
	static final String[] DFA21_transitionS = {
			"\2\55\1\uffff\2\55\22\uffff\1\55\1\1\1\52\1\56\1\50\1\2\1\3\1\51\1\4"+
			"\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\53\11\54\1\14\1\15\1\16\1\17\1\20"+
			"\1\21\1\uffff\32\50\1\22\1\uffff\1\23\1\24\1\50\1\uffff\1\25\1\26\1\27"+
			"\1\30\1\31\1\32\1\33\1\50\1\34\2\50\1\35\5\50\1\36\1\37\1\40\1\41\1\42"+
			"\1\43\3\50\1\44\1\45\1\46\1\47",
			"\1\57",
			"\1\61",
			"\1\63\26\uffff\1\64",
			"",
			"",
			"\1\66",
			"\1\70\21\uffff\1\71",
			"",
			"\1\73\17\uffff\1\74\1\75",
			"\1\77\1\uffff\12\101",
			"\1\103\4\uffff\1\104\15\uffff\1\102",
			"",
			"",
			"\1\106\1\107",
			"\1\111",
			"\1\113\1\114",
			"",
			"",
			"",
			"\1\116",
			"\1\120",
			"\1\121\2\uffff\1\122",
			"\1\123\6\uffff\1\124\6\uffff\1\125",
			"\1\126\11\uffff\1\127",
			"\1\130\1\uffff\1\131\11\uffff\1\132",
			"\1\133\2\uffff\1\134",
			"\1\135",
			"\1\136\7\uffff\1\137",
			"\1\140",
			"\1\141",
			"\1\142\1\143\12\uffff\1\144\2\uffff\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"",
			"\1\152\76\uffff\1\153",
			"",
			"",
			"",
			"",
			"",
			"\1\101\1\uffff\12\101",
			"\1\101\1\uffff\12\156",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\157",
			"",
			"",
			"",
			"",
			"",
			"\1\161",
			"",
			"",
			"",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\172"+
			"\5\50",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085\14\uffff\1\u0086",
			"\1\u0087",
			"\1\u0088\22\uffff\1\u0089",
			"\1\u008a\20\uffff\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e\11\uffff\1\u008f",
			"\1\u0090\2\uffff\1\u0091",
			"\1\u0092",
			"",
			"",
			"",
			"",
			"\1\101\1\uffff\12\156",
			"",
			"",
			"",
			"",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a1",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00b4",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00bd",
			"\1\u00be",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00cd",
			"\1\u00ce",
			"",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"",
			"",
			"\1\u00d4",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\u00d6",
			"\1\u00d7",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00e0",
			"",
			"\1\u00e1",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\u00e3",
			"\1\u00e4",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00e7",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ee",
			"",
			"\1\u00ef",
			"\1\u00f0",
			"",
			"\1\u00f1",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\u00f3",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00f5",
			"\1\u00f6",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND );";
		}
	}

}
