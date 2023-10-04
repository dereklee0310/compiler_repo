// $ANTLR 3.5.3 myCompiler.g 2023-06-15 15:40:00

    import java.util.HashMap;
	import java.util.Map;
	import java.util.ArrayList;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARACTER_LITERAL", "COMMENT", 
		"DECIMAL_LITERAL", "EscapeSequence", "Exponent", "FLOATING_POINT_LITERAL", 
		"FloatTypeSuffix", "IDENTIFIER", "LETTER", "LINE_COMMAND", "LINE_COMMENT", 
		"STRING_LITERAL", "WS", "'!'", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", 
		"'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", 
		"'-='", "'->'", "'.'", "'...'", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", 
		"'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'?'", 
		"'['", "']'", "'^'", "'^='", "'auto'", "'bool'", "'break'", "'case'", 
		"'char'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extern'", "'float'", "'for'", "'goto'", "'if'", "'int'", "'long'", 
		"'register'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
		"'volatile'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[210+1];


	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


		/* ---------------------------- Global Variables ---------------------------- */
		// check if the main function has a return value
		boolean isReturned = false;
	    
		// start from 1 to make my debugging life simplier
		int localCount = 1;

		int unnamedVarCount = 0;

	    List<String> unnamedCode = new ArrayList<String>();
	    List<String> globalCode = new ArrayList<String>();
	    List<String> mainCode = new ArrayList<String>();

		static final String GLOBAL = "@g";
		static final String LOCAL = "%t";

		/* ------------------------ Symbol and Variable Type ------------------------ */

		public enum Type {
			VOID(0), BOOL(1), CHAR(2), SHORT(3), INT(4), LONG(5), FLOAT(6), DOUBLE(7), SIGNED(8), UNSIGNED(9), STRING(10), CHARS(11);
			
			// type comparison
			private final int value;

			private Type(int value) {
				this.value = value;
			}

			public int getValue() {
				return value;
			}

			public static Type getMaxType(Type type1, Type type2) {
				return type1.getValue() < type2.getValue() ? type2 : type1;
			}

			//TODO: signed and unsigned numbers
			public boolean isNumber() {
				return (1 <= this.getValue() && this.getValue() <= 7);
			}

			//TODO: signed and unsigned numbers
			public boolean isDecimal() {
				return (1 <= this.getValue() && this.getValue() <= 5);
			}
		}

		class Symbol {
			// Variable type
			Type type;

			// IR variable name
			String identifier;
	        int offset;

			// constant
	        String value;
			
			// original string length
			int len;
			
			// distinguish constant from variable
			boolean isConstant;

			// flag to check if the symbol needs to be load
			boolean isStored;

	        Symbol() {
	            type = Type.VOID;

				identifier = LOCAL;
				offset=localCount++;
				
	            value = "";
				isConstant = false;
				isStored = false;
	        }

			// arg might be the value of a constant or offset of a variable
			Symbol(Type type, String arg, boolean isConstant) {
	            this.type = type;

				identifier = isConstant ? LOCAL : arg;
				offset=localCount++;
				
	            this.value = isConstant ? arg : null; 
				this.isConstant = isConstant;
				isStored = false;
	        }
	    }

		// main symbol table
		Map<String, Symbol> symbolTable = new HashMap<String, Symbol>();

		//TODO: not implemented
		public enum Specifier {
			EXTERN, STATIC, AUTO, REGISTER;
		}

		//TODO: not implemented
		public enum Qualifier {
			CONST, VOLATILE;
		}

		class DeclarationSpecifier {
			Type type;
			List<Specifier> specifiers;
			List<Qualifier> qualifiers;

			DeclarationSpecifier() {
				type = null;
				specifiers = null;
				qualifiers = null;
			}
			
			DeclarationSpecifier(Type type, List<Specifier> specifiers, List<Qualifier> qualifiers) {
				this.type = type;
				this.specifiers = specifiers;
				this.qualifiers = qualifiers;
			}
		}

		//TODO: non-primitive data types
	    public enum Suffix {
	        ARRAY, FUNCTION;
	    }

		class Declarator {
			String id;
			Suffix suffix;

			Declarator() {
				id = null;
				suffix = null;
			}

			Declarator(String id, Suffix suffix) {
				this.id = id;
				this.suffix = suffix;
			}
		}

	    public List<String> getCode()
	    {	
			unnamedCode.add(0, ";--------------- Unnamed Variables ---------------;\n");
			

			globalCode.add(0,  "\n;--------------- Global Variables  ---------------;\n");

			
			mainCode.add(0,    "\n;---------------     Main Code     ---------------;\n");
		
			// concatenation
			List<String> code = Stream.concat(unnamedCode.stream(), globalCode.stream()).collect(Collectors.toList());
			code = Stream.concat(code.stream(), mainCode.stream()).collect(Collectors.toList());
			return code;
	    }

		Type getMinType(String literal) {
			long value = Long.parseLong(literal);
			if(value == 0 || value == 1)
				return Type.BOOL;
			else if(-128 <= value && value <= 127)
				return Type.CHAR;
			else if(-32768 <= value && value <= 32767)
				return Type.SHORT;
			else if(-2147483648 <= value && value <= 2147483647)	
				return Type.INT;
			return Type.LONG;
		}

		String getAscii(String literal) {
			if(literal.startsWith("'") && literal.endsWith("'"))
				return String.valueOf((int) literal.charAt(1));
			return literal; 
		}
		
		String getResult(Symbol symb1, Symbol symb2, Type type, String op) {
			if(symb1.type == Type.CHAR)
				symb1.value = getAscii(symb1.value);
			if(symb2.type == Type.CHAR)
				symb2.value = getAscii(symb2.value);
			double operand1 = Double.valueOf(symb1.value);
			double operand2 = Double.valueOf(symb2.value);
			double result = -1;

			switch(op) {
				case "*":
					result = operand1 * operand2;
					break;
				case "/":
					result = operand1 / operand2;
					break;
				case "%":
					result = operand1 % operand2;
					break;
				case "+":
					result = operand1 + operand2;
					break;
				case "-":
					result = operand1 - operand2;
					break;
				case ">":
					result = operand1 > operand2 ? 1 : 0;
					break;
				case "<":
					result = operand1 < operand2 ? 1 : 0;
					break;
				case "<=":
					result = operand1 <= operand2 ? 1 : 0;
					break;
				case ">=":
					result = operand1 >= operand2 ? 1 : 0;
					break;
				case "==":
					result = operand1 == operand2 ? 1 : 0;
					break;
				default:
					System.out.println("test194: something wrong...");
			}

			switch(type) {
				case BOOL:
					return String.valueOf(result != 0);
				case CHAR:
					return String.valueOf((int) result);
				case SHORT:
					return String.valueOf((int) result);
				case INT:
					return String.valueOf((int) result);
				case FLOAT:
					return String.valueOf((float) result);
				case DOUBLE:
					return String.valueOf((double) result);
				default:
					System.out.println("test211: something wrong...");
			}
			return String.valueOf(result);
		}

		Symbol genArithmeticCode(Symbol symb1, Symbol symb2, String op, String irOp, int line) {
			Symbol newSymb = symb1;
			String wrap = (op == "/" || op == "%") ? "" : "nsw";

			if(!symb1.type.isNumber() || !symb2.type.isNumber()){
				System.err.println(String.format(";error: invalid operands to binary %s at line %d", op, line));
			} else {
				if(symb1.isConstant && symb2.isConstant) {
					Type type = Type.getMaxType(symb1.type, symb2.type);
					newSymb.value = getResult(symb1, symb2, type, op);
				} else if(!symb1.isConstant && symb2.isConstant) {
					int offset = symb1.offset;
					if(symb1.isStored) {
						newSymb = new Symbol();
						mainCode.add(genLoadCode("%t", newSymb.offset, "i32", symb1.identifier, offset));
						offset = newSymb.offset;
					}
					newSymb = new Symbol();
					newSymb.identifier = "%t";
					mainCode.add(String.format("%%t%d = %s %s %s %%t%d, %s", newSymb.offset, irOp, wrap, "i32", offset, symb2.value));
				} else if(symb1.isConstant && !symb2.isConstant) {
					int offset = symb2.offset;
					if(symb2.isStored) {
						newSymb = new Symbol();
						mainCode.add(genLoadCode("%t", newSymb.offset, "i32", symb2.identifier, offset));

						offset = newSymb.offset;
					}
					newSymb = new Symbol();
					newSymb.identifier = "%t";
					mainCode.add(String.format("%%t%d = %s %s %s %s, %%t%d", newSymb.offset, irOp, wrap, "i32", symb1.value, offset));
				} else {
					int offset1 = symb1.offset;
					int offset2 = symb2.offset;
					if(symb1.isStored) {
						newSymb = new Symbol();
						mainCode.add(String.format("%%t%d = load %s, %s* %s%d, align 4", newSymb.offset, "i32", "i32", symb1.identifier, offset1));
						offset1 = newSymb.offset;
					}

					if(symb2.isStored) {
						newSymb = new Symbol();
						mainCode.add(String.format("%%t%d = load %s, %s* %s%d, align 4", newSymb.offset, "i32", "i32", symb2.identifier, offset2));
						offset2 = newSymb.offset;
					}
					newSymb = new Symbol();
					newSymb.identifier = "%t";
					mainCode.add(String.format("%%t%d = %s %s %s %%t%d, %%t%d", newSymb.offset, irOp, wrap, "i32", offset1, offset2));
				}
				newSymb.isConstant = (symb1.isConstant & symb2.isConstant);
				newSymb.identifier = symb1.identifier;
				newSymb.type = Type.INT; //TODO: datatype
			}
			return newSymb;
		}
		
		String genLoadCode(String destIdentifier, int destOffset, String type, String srcIdentifier, int srcOffset) {
			return String.format("%s%d = load %s, %s* %s%d, align 4", destIdentifier, destOffset, type, type, srcIdentifier, srcOffset);
		}

		String genStoreCode(String type, String value, String destIdentifier, int destOffset) {
			return String.format("store %s %s, %s* %s%d, align 4", type, value, type, destIdentifier, destOffset);
		}

		String genStoreCode(String type, String srcIdentifier, int srcOffset, String destIdentifier, int destOffset) {
			return String.format("store %s %s%d, %s* %s%d, align 4", type, srcIdentifier, srcOffset, type, destIdentifier, destOffset);
		}


		Symbol genRelationalCode(Symbol symb1, Symbol symb2, String op, String irOp, int line) {
			Symbol newSymb = symb1;
			if(!symb1.type.isNumber() || !symb2.type.isNumber()){
				System.err.println(String.format(";error: invalid operands to binary %s at line %d", op, line));
			} else {
				if(symb1.isConstant && symb2.isConstant) {
					newSymb.value = getResult(symb1, symb2, Type.INT, op);
				} else if(!symb1.isConstant && symb2.isConstant) {
					int offset = symb1.offset;
					if(symb1.isStored) {
						newSymb = new Symbol();
						mainCode.add(genLoadCode("%t", newSymb.offset, "i32", symb1.identifier, offset));
						offset = newSymb.offset;
					}
					newSymb = new Symbol();
					newSymb.identifier = "%t";
					mainCode.add(String.format("%%t%d = icmp %s %s %%t%d, %s", newSymb.offset, irOp, "i32", offset, symb2.value));
				} else if(symb1.isConstant && !symb2.isConstant) {
					int offset = symb2.offset;
					if(symb2.isStored) {
						newSymb = new Symbol();
						mainCode.add(genLoadCode("%t", newSymb.offset, "i32", symb2.identifier, offset));
						offset = newSymb.offset;
					}
					newSymb = new Symbol();
					newSymb.identifier = "%t";
					mainCode.add(String.format("%%t%d = icmp %s %s %%t%d, %s", newSymb.offset, irOp, "i32", offset, symb1.value));
				} else {
					int offset1 = symb1.offset;
					int offset2 = symb2.offset;
					if(symb1.isStored) {
						newSymb = new Symbol();
						mainCode.add(String.format("%%t%d = load %s, %s* %s%d, align 4", newSymb.offset, "i32", "i32", symb1.identifier, offset1));
						offset1 = newSymb.offset;
					}

					if(symb2.isStored) {
						newSymb = new Symbol();
						mainCode.add(String.format("%%t%d = load %s, %s* %s%d, align 4", newSymb.offset, "i32", "i32", symb2.identifier, offset2));
						offset2 = newSymb.offset;
					}
					newSymb = new Symbol();
					newSymb.identifier = "%t";
					mainCode.add(String.format("%%t%d = icmp %s %s %%t%d, %%t%d", newSymb.offset, irOp, "i32", offset1, offset2));
				}
			}
			
			newSymb.isConstant = (symb1.isConstant & symb2.isConstant);
			if(!newSymb.isConstant) {
				newSymb = new Symbol();
				mainCode.add(String.format("%%t%d = zext i1 %%t%d to i32", newSymb.offset, (newSymb.offset - 1)));
			}
			
			newSymb.isConstant = symb1.isConstant & symb2.isConstant;
			newSymb.identifier = symb1.identifier;
			newSymb.type = Type.BOOL; //TODO: datatype
			return newSymb;
		}



	// $ANTLR start "translation_unit"
	// myCompiler.g:393:1: translation_unit : ( external_declaration )+ ;
	public final void translation_unit() throws RecognitionException {
		int translation_unit_StartIndex = input.index();

		System.out.println(";---------------    Debug Info     ---------------;\n");
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myCompiler.g:395:2: ( ( external_declaration )+ )
			// myCompiler.g:395:4: ( external_declaration )+
			{
			// myCompiler.g:395:4: ( external_declaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IDENTIFIER||LA1_0==24||LA1_0==26||(LA1_0 >= 57 && LA1_0 <= 58)||(LA1_0 >= 61 && LA1_0 <= 62)||LA1_0==66||(LA1_0 >= 68 && LA1_0 <= 70)||(LA1_0 >= 74 && LA1_0 <= 76)||(LA1_0 >= 78 && LA1_0 <= 79)||(LA1_0 >= 81 && LA1_0 <= 82)||(LA1_0 >= 84 && LA1_0 <= 88)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:395:4: external_declaration
					{
					pushFollow(FOLLOW_external_declaration_in_translation_unit78);
					external_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, translation_unit_StartIndex); }

		}
	}
	// $ANTLR end "translation_unit"



	// $ANTLR start "external_declaration"
	// myCompiler.g:399:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );
	public final void external_declaration() throws RecognitionException {
		int external_declaration_StartIndex = input.index();

		ParserRuleReturnScope declaration1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myCompiler.g:401:2: ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==69) ) {
				int LA2_1 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==81) ) {
				int LA2_2 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==57) ) {
				int LA2_3 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==76) ) {
				int LA2_4 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==87) ) {
				int LA2_5 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==61) ) {
				int LA2_6 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==78) ) {
				int LA2_7 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==74) ) {
				int LA2_8 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==75) ) {
				int LA2_9 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==70) ) {
				int LA2_10 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==66) ) {
				int LA2_11 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==79) ) {
				int LA2_12 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==86) ) {
				int LA2_13 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==82||LA2_0==85) ) {
				int LA2_14 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==68) ) {
				int LA2_15 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==58) ) {
				int LA2_16 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==62) ) {
				int LA2_17 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==88) ) {
				int LA2_18 = input.LA(2);
				if ( (synpred4_myCompiler()) ) {
					alt2=1;
				}
				else if ( (true) ) {
					alt2=2;
				}

			}
			else if ( (LA2_0==26) && (synpred4_myCompiler())) {
				alt2=1;
			}
			else if ( (LA2_0==IDENTIFIER) && (synpred4_myCompiler())) {
				alt2=1;
			}
			else if ( (LA2_0==24) && (synpred4_myCompiler())) {
				alt2=1;
			}
			else if ( (LA2_0==84) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myCompiler.g:401:4: ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition
					{
					pushFollow(FOLLOW_function_definition_in_external_declaration113);
					function_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:402:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_external_declaration118);
					declaration1=declaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {	
								List<Declarator> declarators = (declaration1!=null?((myCompilerParser.declaration_return)declaration1).declarators:null);
								List<Symbol> symbols = (declaration1!=null?((myCompilerParser.declaration_return)declaration1).symbols:null);
								for(int i = 0; i < declarators.size(); i++) {
									Declarator declarator = declarators.get(i);
									Symbol symbol = symbols.get(i);
									if(declarator == null)
										continue;
									if(symbolTable.containsKey(declarator.id)) {
										System.err.println(String.format(";error: redeclaration of '%s' at line %d", declarator.id, (declaration1!=null?(declaration1.start):null).getLine()));
									} else {
										if(symbol == null) {
											symbol = new Symbol();
											symbol.identifier = "@g";
											symbolTable.put(declarator.id, symbol);
											globalCode.add(String.format("@g%d = dso_local global %s %s, align 4", localCount - 1, "i32", 0)); //TODO: datatype
										} else if(symbol.isConstant) {
											symbol.identifier = "@g";
											symbol.isConstant = false; // this symbol is no longer a constant
											symbolTable.put(declarator.id, symbol);
											globalCode.add(String.format("@g%d = dso_local global %s %s, align 4", symbol.offset, "i32", symbol.value)); //TODO: datatype
										}
									}
								}
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
			if ( state.backtracking>0 ) { memoize(input, 2, external_declaration_StartIndex); }

		}
	}
	// $ANTLR end "external_declaration"



	// $ANTLR start "function_definition"
	// myCompiler.g:431:1: function_definition : ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) ;
	public final void function_definition() throws RecognitionException {
		int function_definition_StartIndex = input.index();

		Declarator declarator2 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// myCompiler.g:432:2: ( ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) )
			// myCompiler.g:432:4: ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement )
			{
			// myCompiler.g:432:4: ( declaration_specifiers )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 57 && LA3_0 <= 58)||(LA3_0 >= 61 && LA3_0 <= 62)||LA3_0==66||(LA3_0 >= 68 && LA3_0 <= 70)||(LA3_0 >= 74 && LA3_0 <= 76)||(LA3_0 >= 78 && LA3_0 <= 79)||(LA3_0 >= 81 && LA3_0 <= 82)||(LA3_0 >= 85 && LA3_0 <= 88)) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// myCompiler.g:432:4: declaration_specifiers
					{
					pushFollow(FOLLOW_declaration_specifiers_in_function_definition134);
					declaration_specifiers();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_declarator_in_function_definition137);
			declarator2=declarator();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {   
			                if(declarator2.id.equals("main") && declarator2.suffix.equals(Suffix.FUNCTION)) {
			                    mainCode.add("declare dso_local i32 @printf(i8*, ...)\n"); //TODO
			                    mainCode.add("define dso_local i32 @main()\n"); //TODO
			                    mainCode.add("{");
			                }
			            }
			// myCompiler.g:440:3: ( ( declaration )+ compound_statement | compound_statement )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= 57 && LA5_0 <= 58)||(LA5_0 >= 61 && LA5_0 <= 62)||LA5_0==66||(LA5_0 >= 68 && LA5_0 <= 70)||(LA5_0 >= 74 && LA5_0 <= 76)||(LA5_0 >= 78 && LA5_0 <= 79)||(LA5_0 >= 81 && LA5_0 <= 82)||(LA5_0 >= 84 && LA5_0 <= 88)) ) {
				alt5=1;
			}
			else if ( (LA5_0==90) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myCompiler.g:440:5: ( declaration )+ compound_statement
					{
					// myCompiler.g:440:5: ( declaration )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= 57 && LA4_0 <= 58)||(LA4_0 >= 61 && LA4_0 <= 62)||LA4_0==66||(LA4_0 >= 68 && LA4_0 <= 70)||(LA4_0 >= 74 && LA4_0 <= 76)||(LA4_0 >= 78 && LA4_0 <= 79)||(LA4_0 >= 81 && LA4_0 <= 82)||(LA4_0 >= 84 && LA4_0 <= 88)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// myCompiler.g:440:5: declaration
							{
							pushFollow(FOLLOW_declaration_in_function_definition157);
							declaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					pushFollow(FOLLOW_compound_statement_in_function_definition160);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:441:5: compound_statement
					{
					pushFollow(FOLLOW_compound_statement_in_function_definition167);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {   
							if(!isReturned)
								mainCode.add("ret i32 0");
							mainCode.add("}");
						}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, function_definition_StartIndex); }

		}
	}
	// $ANTLR end "function_definition"


	public static class declaration_return extends ParserRuleReturnScope {
		public DeclarationSpecifier declarationSpecifier;
		public List<Declarator> declarators;
		public List<Symbol> symbols;
	};


	// $ANTLR start "declaration"
	// myCompiler.g:451:1: declaration returns [DeclarationSpecifier declarationSpecifier, List<Declarator> declarators, List<Symbol> symbols] : ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' );
	public final myCompilerParser.declaration_return declaration() throws RecognitionException {
		myCompilerParser.declaration_return retval = new myCompilerParser.declaration_return();
		retval.start = input.LT(1);
		int declaration_StartIndex = input.index();

		DeclarationSpecifier declaration_specifiers3 =null;
		ParserRuleReturnScope init_declarator_list4 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// myCompiler.g:458:2: ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==84) ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= 57 && LA8_0 <= 58)||(LA8_0 >= 61 && LA8_0 <= 62)||LA8_0==66||(LA8_0 >= 68 && LA8_0 <= 70)||(LA8_0 >= 74 && LA8_0 <= 76)||(LA8_0 >= 78 && LA8_0 <= 79)||(LA8_0 >= 81 && LA8_0 <= 82)||(LA8_0 >= 85 && LA8_0 <= 88)) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myCompiler.g:458:4: 'typedef' ( declaration_specifiers )? init_declarator_list ';'
					{
					match(input,84,FOLLOW_84_in_declaration201); if (state.failed) return retval;
					// myCompiler.g:458:14: ( declaration_specifiers )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= 57 && LA6_0 <= 58)||(LA6_0 >= 61 && LA6_0 <= 62)||LA6_0==66||(LA6_0 >= 68 && LA6_0 <= 70)||(LA6_0 >= 74 && LA6_0 <= 76)||(LA6_0 >= 78 && LA6_0 <= 79)||(LA6_0 >= 81 && LA6_0 <= 82)||(LA6_0 >= 85 && LA6_0 <= 88)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// myCompiler.g:458:14: declaration_specifiers
							{
							pushFollow(FOLLOW_declaration_specifiers_in_declaration203);
							declaration_specifiers();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					pushFollow(FOLLOW_init_declarator_list_in_declaration210);
					init_declarator_list();
					state._fsp--;
					if (state.failed) return retval;
					match(input,41,FOLLOW_41_in_declaration212); if (state.failed) return retval;
					}
					break;
				case 2 :
					// myCompiler.g:460:4: declaration_specifiers ( init_declarator_list )? ';'
					{
					pushFollow(FOLLOW_declaration_specifiers_in_declaration218);
					declaration_specifiers3=declaration_specifiers();
					state._fsp--;
					if (state.failed) return retval;
					// myCompiler.g:460:27: ( init_declarator_list )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==IDENTIFIER||LA7_0==24||LA7_0==26) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// myCompiler.g:460:27: init_declarator_list
							{
							pushFollow(FOLLOW_init_declarator_list_in_declaration220);
							init_declarator_list4=init_declarator_list();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input,41,FOLLOW_41_in_declaration223); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
								retval.declarationSpecifier = declaration_specifiers3;
								retval.declarators = (init_declarator_list4!=null?((myCompilerParser.init_declarator_list_return)init_declarator_list4).declarators:null);
								retval.symbols = (init_declarator_list4!=null?((myCompilerParser.init_declarator_list_return)init_declarator_list4).symbols:null);
							}
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
			if ( state.backtracking>0 ) { memoize(input, 4, declaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "declaration_specifiers"
	// myCompiler.g:469:1: declaration_specifiers returns [DeclarationSpecifier declarationSpecifier] : ( storage_class_specifier | type_specifier | type_qualifier )+ ;
	public final DeclarationSpecifier declaration_specifiers() throws RecognitionException {
		DeclarationSpecifier declarationSpecifier = null;

		int declaration_specifiers_StartIndex = input.index();

		Specifier storage_class_specifier5 =null;
		Type type_specifier6 =null;
		Qualifier type_qualifier7 =null;

			Type type = Type.VOID; List<Specifier> specifiers = new ArrayList<Specifier>(); List<Qualifier> qualifiers = new ArrayList<Qualifier>(); 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return declarationSpecifier; }

			// myCompiler.g:471:2: ( ( storage_class_specifier | type_specifier | type_qualifier )+ )
			// myCompiler.g:471:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			{
			// myCompiler.g:471:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=4;
				switch ( input.LA(1) ) {
				case 57:
				case 69:
				case 76:
				case 81:
					{
					alt9=1;
					}
					break;
				case 58:
				case 61:
				case 66:
				case 68:
				case 70:
				case 74:
				case 75:
				case 78:
				case 79:
				case 82:
				case 85:
				case 86:
				case 87:
					{
					alt9=2;
					}
					break;
				case 62:
				case 88:
					{
					alt9=3;
					}
					break;
				}
				switch (alt9) {
				case 1 :
					// myCompiler.g:471:5: storage_class_specifier
					{
					pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers249);
					storage_class_specifier5=storage_class_specifier();
					state._fsp--;
					if (state.failed) return declarationSpecifier;
					if ( state.backtracking==0 ) { specifiers.add(storage_class_specifier5); }
					}
					break;
				case 2 :
					// myCompiler.g:472:4: type_specifier
					{
					pushFollow(FOLLOW_type_specifier_in_declaration_specifiers256);
					type_specifier6=type_specifier();
					state._fsp--;
					if (state.failed) return declarationSpecifier;
					if ( state.backtracking==0 ) { type = type_specifier6; }
					}
					break;
				case 3 :
					// myCompiler.g:473:7: type_qualifier
					{
					pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers266);
					type_qualifier7=type_qualifier();
					state._fsp--;
					if (state.failed) return declarationSpecifier;
					if ( state.backtracking==0 ) { qualifiers.add(type_qualifier7); }
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return declarationSpecifier;}
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			if ( state.backtracking==0 ) { declarationSpecifier = new DeclarationSpecifier(type, specifiers, qualifiers); }
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
		return declarationSpecifier;
	}
	// $ANTLR end "declaration_specifiers"


	public static class init_declarator_list_return extends ParserRuleReturnScope {
		public List<Declarator> declarators;
		public List<Symbol> symbols;
	};


	// $ANTLR start "init_declarator_list"
	// myCompiler.g:478:1: init_declarator_list returns [List<Declarator> declarators, List<Symbol> symbols] : dclr= init_declarator ( ',' dclr2= init_declarator )* ;
	public final myCompilerParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
		myCompilerParser.init_declarator_list_return retval = new myCompilerParser.init_declarator_list_return();
		retval.start = input.LT(1);
		int init_declarator_list_StartIndex = input.index();

		ParserRuleReturnScope dclr =null;
		ParserRuleReturnScope dclr2 =null;

		 retval.declarators = new ArrayList<Declarator>(); retval.symbols = new ArrayList<Symbol>(); 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// myCompiler.g:480:2: (dclr= init_declarator ( ',' dclr2= init_declarator )* )
			// myCompiler.g:480:4: dclr= init_declarator ( ',' dclr2= init_declarator )*
			{
			pushFollow(FOLLOW_init_declarator_in_init_declarator_list299);
			dclr=init_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { 
						retval.declarators.add((dclr!=null?((myCompilerParser.init_declarator_return)dclr).declarator:null)); 
						retval.symbols.add((dclr!=null?((myCompilerParser.init_declarator_return)dclr).symb:null)); 
					}
			// myCompiler.g:485:2: ( ',' dclr2= init_declarator )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==31) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myCompiler.g:485:3: ',' dclr2= init_declarator
					{
					match(input,31,FOLLOW_31_in_init_declarator_list309); if (state.failed) return retval;
					pushFollow(FOLLOW_init_declarator_in_init_declarator_list313);
					dclr2=init_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
								retval.declarators.add((dclr2!=null?((myCompilerParser.init_declarator_return)dclr2).declarator:null)); 
								retval.symbols.add((dclr2!=null?((myCompilerParser.init_declarator_return)dclr2).symb:null)); 
							}
					}
					break;

				default :
					break loop10;
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
			if ( state.backtracking>0 ) { memoize(input, 6, init_declarator_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "init_declarator_list"


	public static class init_declarator_return extends ParserRuleReturnScope {
		public Declarator declarator;
		public Symbol symb;
	};


	// $ANTLR start "init_declarator"
	// myCompiler.g:494:1: init_declarator returns [Declarator declarator, Symbol symb] : declarator ( '=' initializer )? ;
	public final myCompilerParser.init_declarator_return init_declarator() throws RecognitionException {
		myCompilerParser.init_declarator_return retval = new myCompilerParser.init_declarator_return();
		retval.start = input.LT(1);
		int init_declarator_StartIndex = input.index();

		Declarator declarator8 =null;
		Symbol initializer9 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// myCompiler.g:495:2: ( declarator ( '=' initializer )? )
			// myCompiler.g:495:4: declarator ( '=' initializer )?
			{
			pushFollow(FOLLOW_declarator_in_init_declarator338);
			declarator8=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.declarator = declarator8; }
			// myCompiler.g:495:57: ( '=' initializer )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==46) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// myCompiler.g:495:58: '=' initializer
					{
					match(input,46,FOLLOW_46_in_init_declarator343); if (state.failed) return retval;
					pushFollow(FOLLOW_initializer_in_init_declarator345);
					initializer9=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.symb = initializer9; }
					}
					break;

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
			if ( state.backtracking>0 ) { memoize(input, 7, init_declarator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "init_declarator"



	// $ANTLR start "storage_class_specifier"
	// myCompiler.g:498:1: storage_class_specifier returns [Specifier specifier] : ( 'extern' | 'static' | 'auto' | 'register' );
	public final Specifier storage_class_specifier() throws RecognitionException {
		Specifier specifier = null;

		int storage_class_specifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return specifier; }

			// myCompiler.g:499:2: ( 'extern' | 'static' | 'auto' | 'register' )
			int alt12=4;
			switch ( input.LA(1) ) {
			case 69:
				{
				alt12=1;
				}
				break;
			case 81:
				{
				alt12=2;
				}
				break;
			case 57:
				{
				alt12=3;
				}
				break;
			case 76:
				{
				alt12=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return specifier;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myCompiler.g:499:4: 'extern'
					{
					match(input,69,FOLLOW_69_in_storage_class_specifier366); if (state.failed) return specifier;
					if ( state.backtracking==0 ) { specifier = Specifier.EXTERN; }
					}
					break;
				case 2 :
					// myCompiler.g:500:4: 'static'
					{
					match(input,81,FOLLOW_81_in_storage_class_specifier373); if (state.failed) return specifier;
					if ( state.backtracking==0 ) { specifier = Specifier.STATIC; }
					}
					break;
				case 3 :
					// myCompiler.g:501:4: 'auto'
					{
					match(input,57,FOLLOW_57_in_storage_class_specifier380); if (state.failed) return specifier;
					if ( state.backtracking==0 ) { specifier = Specifier.AUTO; }
					}
					break;
				case 4 :
					// myCompiler.g:502:4: 'register'
					{
					match(input,76,FOLLOW_76_in_storage_class_specifier387); if (state.failed) return specifier;
					if ( state.backtracking==0 ) { specifier = Specifier.REGISTER; }
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
			if ( state.backtracking>0 ) { memoize(input, 8, storage_class_specifier_StartIndex); }

		}
		return specifier;
	}
	// $ANTLR end "storage_class_specifier"



	// $ANTLR start "type_specifier"
	// myCompiler.g:505:1: type_specifier returns [Type type] : ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | struct_or_union_specifier | enum_specifier | 'bool' );
	public final Type type_specifier() throws RecognitionException {
		Type type = null;

		int type_specifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return type; }

			// myCompiler.g:506:2: ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | struct_or_union_specifier | enum_specifier | 'bool' )
			int alt13=12;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt13=1;
				}
				break;
			case 61:
				{
				alt13=2;
				}
				break;
			case 78:
				{
				alt13=3;
				}
				break;
			case 74:
				{
				alt13=4;
				}
				break;
			case 75:
				{
				alt13=5;
				}
				break;
			case 70:
				{
				alt13=6;
				}
				break;
			case 66:
				{
				alt13=7;
				}
				break;
			case 79:
				{
				alt13=8;
				}
				break;
			case 86:
				{
				alt13=9;
				}
				break;
			case 82:
			case 85:
				{
				alt13=10;
				}
				break;
			case 68:
				{
				alt13=11;
				}
				break;
			case 58:
				{
				alt13=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myCompiler.g:506:4: 'void'
					{
					match(input,87,FOLLOW_87_in_type_specifier404); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.VOID; }
					}
					break;
				case 2 :
					// myCompiler.g:507:4: 'char'
					{
					match(input,61,FOLLOW_61_in_type_specifier411); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.CHAR; }
					}
					break;
				case 3 :
					// myCompiler.g:508:4: 'short'
					{
					match(input,78,FOLLOW_78_in_type_specifier418); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.SHORT; }
					}
					break;
				case 4 :
					// myCompiler.g:509:4: 'int'
					{
					match(input,74,FOLLOW_74_in_type_specifier425); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.INT; }
					}
					break;
				case 5 :
					// myCompiler.g:510:4: 'long'
					{
					match(input,75,FOLLOW_75_in_type_specifier432); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.LONG; }
					}
					break;
				case 6 :
					// myCompiler.g:511:4: 'float'
					{
					match(input,70,FOLLOW_70_in_type_specifier439); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.FLOAT; }
					}
					break;
				case 7 :
					// myCompiler.g:512:4: 'double'
					{
					match(input,66,FOLLOW_66_in_type_specifier446); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.DOUBLE; }
					}
					break;
				case 8 :
					// myCompiler.g:513:4: 'signed'
					{
					match(input,79,FOLLOW_79_in_type_specifier453); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.SIGNED; }
					}
					break;
				case 9 :
					// myCompiler.g:514:4: 'unsigned'
					{
					match(input,86,FOLLOW_86_in_type_specifier460); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.UNSIGNED; }
					}
					break;
				case 10 :
					// myCompiler.g:515:4: struct_or_union_specifier
					{
					pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier467);
					struct_or_union_specifier();
					state._fsp--;
					if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.VOID; }
					}
					break;
				case 11 :
					// myCompiler.g:516:4: enum_specifier
					{
					pushFollow(FOLLOW_enum_specifier_in_type_specifier475);
					enum_specifier();
					state._fsp--;
					if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.VOID; }
					}
					break;
				case 12 :
					// myCompiler.g:517:7: 'bool'
					{
					match(input,58,FOLLOW_58_in_type_specifier486); if (state.failed) return type;
					if ( state.backtracking==0 ) { type = Type.BOOL; }
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
			if ( state.backtracking>0 ) { memoize(input, 9, type_specifier_StartIndex); }

		}
		return type;
	}
	// $ANTLR end "type_specifier"



	// $ANTLR start "struct_or_union_specifier"
	// myCompiler.g:528:1: struct_or_union_specifier options {k=3; } : ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER );
	public final void struct_or_union_specifier() throws RecognitionException {
		int struct_or_union_specifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myCompiler.g:534:2: ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==82||LA15_0==85) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==IDENTIFIER) ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2==90) ) {
						alt15=1;
					}
					else if ( (LA15_2==EOF||LA15_2==IDENTIFIER||(LA15_2 >= 24 && LA15_2 <= 26)||LA15_2==31||(LA15_2 >= 40 && LA15_2 <= 41)||LA15_2==53||(LA15_2 >= 57 && LA15_2 <= 58)||(LA15_2 >= 61 && LA15_2 <= 62)||LA15_2==66||(LA15_2 >= 68 && LA15_2 <= 70)||(LA15_2 >= 74 && LA15_2 <= 76)||(LA15_2 >= 78 && LA15_2 <= 79)||(LA15_2 >= 81 && LA15_2 <= 82)||(LA15_2 >= 85 && LA15_2 <= 88)) ) {
						alt15=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 15, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA15_1==90) ) {
					alt15=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myCompiler.g:534:4: struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}'
					{
					pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier520);
					struct_or_union();
					state._fsp--;
					if (state.failed) return;
					// myCompiler.g:534:20: ( IDENTIFIER )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==IDENTIFIER) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// myCompiler.g:534:20: IDENTIFIER
							{
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier522); if (state.failed) return;
							}
							break;

					}

					match(input,90,FOLLOW_90_in_struct_or_union_specifier525); if (state.failed) return;
					pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier527);
					struct_declaration_list();
					state._fsp--;
					if (state.failed) return;
					match(input,94,FOLLOW_94_in_struct_or_union_specifier529); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:535:4: struct_or_union IDENTIFIER
					{
					pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier534);
					struct_or_union();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier536); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 10, struct_or_union_specifier_StartIndex); }

		}
	}
	// $ANTLR end "struct_or_union_specifier"



	// $ANTLR start "struct_or_union"
	// myCompiler.g:538:1: struct_or_union : ( 'struct' | 'union' );
	public final void struct_or_union() throws RecognitionException {
		int struct_or_union_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myCompiler.g:539:2: ( 'struct' | 'union' )
			// myCompiler.g:
			{
			if ( input.LA(1)==82||input.LA(1)==85 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, struct_or_union_StartIndex); }

		}
	}
	// $ANTLR end "struct_or_union"



	// $ANTLR start "struct_declaration_list"
	// myCompiler.g:543:1: struct_declaration_list : ( struct_declaration )+ ;
	public final void struct_declaration_list() throws RecognitionException {
		int struct_declaration_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myCompiler.g:544:2: ( ( struct_declaration )+ )
			// myCompiler.g:544:4: ( struct_declaration )+
			{
			// myCompiler.g:544:4: ( struct_declaration )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==58||(LA16_0 >= 61 && LA16_0 <= 62)||LA16_0==66||LA16_0==68||LA16_0==70||(LA16_0 >= 74 && LA16_0 <= 75)||(LA16_0 >= 78 && LA16_0 <= 79)||LA16_0==82||(LA16_0 >= 85 && LA16_0 <= 88)) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// myCompiler.g:544:4: struct_declaration
					{
					pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list563);
					struct_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, struct_declaration_list_StartIndex); }

		}
	}
	// $ANTLR end "struct_declaration_list"



	// $ANTLR start "struct_declaration"
	// myCompiler.g:547:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' ;
	public final void struct_declaration() throws RecognitionException {
		int struct_declaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myCompiler.g:548:2: ( specifier_qualifier_list struct_declarator_list ';' )
			// myCompiler.g:548:4: specifier_qualifier_list struct_declarator_list ';'
			{
			pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration575);
			specifier_qualifier_list();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration577);
			struct_declarator_list();
			state._fsp--;
			if (state.failed) return;
			match(input,41,FOLLOW_41_in_struct_declaration579); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, struct_declaration_StartIndex); }

		}
	}
	// $ANTLR end "struct_declaration"



	// $ANTLR start "specifier_qualifier_list"
	// myCompiler.g:551:1: specifier_qualifier_list : ( type_qualifier | type_specifier )+ ;
	public final void specifier_qualifier_list() throws RecognitionException {
		int specifier_qualifier_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myCompiler.g:552:2: ( ( type_qualifier | type_specifier )+ )
			// myCompiler.g:552:4: ( type_qualifier | type_specifier )+
			{
			// myCompiler.g:552:4: ( type_qualifier | type_specifier )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==62||LA17_0==88) ) {
					alt17=1;
				}
				else if ( (LA17_0==58||LA17_0==61||LA17_0==66||LA17_0==68||LA17_0==70||(LA17_0 >= 74 && LA17_0 <= 75)||(LA17_0 >= 78 && LA17_0 <= 79)||LA17_0==82||(LA17_0 >= 85 && LA17_0 <= 87)) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// myCompiler.g:552:6: type_qualifier
					{
					pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list592);
					type_qualifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:552:23: type_specifier
					{
					pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list596);
					type_specifier();
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

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, specifier_qualifier_list_StartIndex); }

		}
	}
	// $ANTLR end "specifier_qualifier_list"



	// $ANTLR start "struct_declarator_list"
	// myCompiler.g:555:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* ;
	public final void struct_declarator_list() throws RecognitionException {
		int struct_declarator_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myCompiler.g:556:2: ( struct_declarator ( ',' struct_declarator )* )
			// myCompiler.g:556:4: struct_declarator ( ',' struct_declarator )*
			{
			pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list610);
			struct_declarator();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:556:22: ( ',' struct_declarator )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==31) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// myCompiler.g:556:23: ',' struct_declarator
					{
					match(input,31,FOLLOW_31_in_struct_declarator_list613); if (state.failed) return;
					pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list615);
					struct_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
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
			if ( state.backtracking>0 ) { memoize(input, 15, struct_declarator_list_StartIndex); }

		}
	}
	// $ANTLR end "struct_declarator_list"



	// $ANTLR start "struct_declarator"
	// myCompiler.g:559:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
	public final void struct_declarator() throws RecognitionException {
		int struct_declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myCompiler.g:560:2: ( declarator ( ':' constant_expression )? | ':' constant_expression )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==IDENTIFIER||LA20_0==24||LA20_0==26) ) {
				alt20=1;
			}
			else if ( (LA20_0==40) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// myCompiler.g:560:4: declarator ( ':' constant_expression )?
					{
					pushFollow(FOLLOW_declarator_in_struct_declarator628);
					declarator();
					state._fsp--;
					if (state.failed) return;
					// myCompiler.g:560:15: ( ':' constant_expression )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==40) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// myCompiler.g:560:16: ':' constant_expression
							{
							match(input,40,FOLLOW_40_in_struct_declarator631); if (state.failed) return;
							pushFollow(FOLLOW_constant_expression_in_struct_declarator633);
							constant_expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// myCompiler.g:561:4: ':' constant_expression
					{
					match(input,40,FOLLOW_40_in_struct_declarator640); if (state.failed) return;
					pushFollow(FOLLOW_constant_expression_in_struct_declarator642);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 16, struct_declarator_StartIndex); }

		}
	}
	// $ANTLR end "struct_declarator"



	// $ANTLR start "enum_specifier"
	// myCompiler.g:564:1: enum_specifier options {k=3; } : ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER );
	public final void enum_specifier() throws RecognitionException {
		int enum_specifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// myCompiler.g:566:2: ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==68) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==90) ) {
					alt21=1;
				}
				else if ( (LA21_1==IDENTIFIER) ) {
					int LA21_3 = input.LA(3);
					if ( (LA21_3==90) ) {
						alt21=2;
					}
					else if ( (LA21_3==EOF||LA21_3==IDENTIFIER||(LA21_3 >= 24 && LA21_3 <= 26)||LA21_3==31||(LA21_3 >= 40 && LA21_3 <= 41)||LA21_3==53||(LA21_3 >= 57 && LA21_3 <= 58)||(LA21_3 >= 61 && LA21_3 <= 62)||LA21_3==66||(LA21_3 >= 68 && LA21_3 <= 70)||(LA21_3 >= 74 && LA21_3 <= 76)||(LA21_3 >= 78 && LA21_3 <= 79)||(LA21_3 >= 81 && LA21_3 <= 82)||(LA21_3 >= 85 && LA21_3 <= 88)) ) {
						alt21=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
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
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// myCompiler.g:566:4: 'enum' '{' enumerator_list '}'
					{
					match(input,68,FOLLOW_68_in_enum_specifier660); if (state.failed) return;
					match(input,90,FOLLOW_90_in_enum_specifier662); if (state.failed) return;
					pushFollow(FOLLOW_enumerator_list_in_enum_specifier664);
					enumerator_list();
					state._fsp--;
					if (state.failed) return;
					match(input,94,FOLLOW_94_in_enum_specifier666); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:567:4: 'enum' IDENTIFIER '{' enumerator_list '}'
					{
					match(input,68,FOLLOW_68_in_enum_specifier671); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier673); if (state.failed) return;
					match(input,90,FOLLOW_90_in_enum_specifier675); if (state.failed) return;
					pushFollow(FOLLOW_enumerator_list_in_enum_specifier677);
					enumerator_list();
					state._fsp--;
					if (state.failed) return;
					match(input,94,FOLLOW_94_in_enum_specifier679); if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:568:4: 'enum' IDENTIFIER
					{
					match(input,68,FOLLOW_68_in_enum_specifier684); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier686); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 17, enum_specifier_StartIndex); }

		}
	}
	// $ANTLR end "enum_specifier"



	// $ANTLR start "enumerator_list"
	// myCompiler.g:571:1: enumerator_list : enumerator ( ',' enumerator )* ;
	public final void enumerator_list() throws RecognitionException {
		int enumerator_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// myCompiler.g:572:2: ( enumerator ( ',' enumerator )* )
			// myCompiler.g:572:4: enumerator ( ',' enumerator )*
			{
			pushFollow(FOLLOW_enumerator_in_enumerator_list697);
			enumerator();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:572:15: ( ',' enumerator )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==31) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myCompiler.g:572:16: ',' enumerator
					{
					match(input,31,FOLLOW_31_in_enumerator_list700); if (state.failed) return;
					pushFollow(FOLLOW_enumerator_in_enumerator_list702);
					enumerator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
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
			if ( state.backtracking>0 ) { memoize(input, 18, enumerator_list_StartIndex); }

		}
	}
	// $ANTLR end "enumerator_list"



	// $ANTLR start "enumerator"
	// myCompiler.g:575:1: enumerator : IDENTIFIER ( '=' constant_expression )? ;
	public final void enumerator() throws RecognitionException {
		int enumerator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// myCompiler.g:576:2: ( IDENTIFIER ( '=' constant_expression )? )
			// myCompiler.g:576:4: IDENTIFIER ( '=' constant_expression )?
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerator715); if (state.failed) return;
			// myCompiler.g:576:15: ( '=' constant_expression )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==46) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// myCompiler.g:576:16: '=' constant_expression
					{
					match(input,46,FOLLOW_46_in_enumerator718); if (state.failed) return;
					pushFollow(FOLLOW_constant_expression_in_enumerator720);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, enumerator_StartIndex); }

		}
	}
	// $ANTLR end "enumerator"



	// $ANTLR start "type_qualifier"
	// myCompiler.g:579:1: type_qualifier returns [Qualifier qualifier] : ( 'const' | 'volatile' );
	public final Qualifier type_qualifier() throws RecognitionException {
		Qualifier qualifier = null;

		int type_qualifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return qualifier; }

			// myCompiler.g:580:2: ( 'const' | 'volatile' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==62) ) {
				alt24=1;
			}
			else if ( (LA24_0==88) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return qualifier;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// myCompiler.g:580:4: 'const'
					{
					match(input,62,FOLLOW_62_in_type_qualifier737); if (state.failed) return qualifier;
					if ( state.backtracking==0 ) { qualifier = Qualifier.CONST; }
					}
					break;
				case 2 :
					// myCompiler.g:581:4: 'volatile'
					{
					match(input,88,FOLLOW_88_in_type_qualifier744); if (state.failed) return qualifier;
					if ( state.backtracking==0 ) { qualifier = Qualifier.VOLATILE; }
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
			if ( state.backtracking>0 ) { memoize(input, 20, type_qualifier_StartIndex); }

		}
		return qualifier;
	}
	// $ANTLR end "type_qualifier"



	// $ANTLR start "declarator"
	// myCompiler.g:585:1: declarator returns [Declarator declarator] : ( ( pointer )? direct_declarator | pointer );
	public final Declarator declarator() throws RecognitionException {
		Declarator declarator = null;

		int declarator_StartIndex = input.index();

		Declarator direct_declarator10 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return declarator; }

			// myCompiler.g:586:2: ( ( pointer )? direct_declarator | pointer )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==26) ) {
				int LA26_1 = input.LA(2);
				if ( (synpred45_myCompiler()) ) {
					alt26=1;
				}
				else if ( (true) ) {
					alt26=2;
				}

			}
			else if ( (LA26_0==IDENTIFIER||LA26_0==24) ) {
				alt26=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return declarator;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// myCompiler.g:586:4: ( pointer )? direct_declarator
					{
					// myCompiler.g:586:4: ( pointer )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==26) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// myCompiler.g:586:4: pointer
							{
							pushFollow(FOLLOW_pointer_in_declarator762);
							pointer();
							state._fsp--;
							if (state.failed) return declarator;
							}
							break;

					}

					pushFollow(FOLLOW_direct_declarator_in_declarator765);
					direct_declarator10=direct_declarator();
					state._fsp--;
					if (state.failed) return declarator;
					if ( state.backtracking==0 ) { declarator = direct_declarator10; }
					}
					break;
				case 2 :
					// myCompiler.g:587:4: pointer
					{
					pushFollow(FOLLOW_pointer_in_declarator773);
					pointer();
					state._fsp--;
					if (state.failed) return declarator;
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
			if ( state.backtracking>0 ) { memoize(input, 21, declarator_StartIndex); }

		}
		return declarator;
	}
	// $ANTLR end "declarator"



	// $ANTLR start "direct_declarator"
	// myCompiler.g:591:1: direct_declarator returns [Declarator declarator] : ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* ;
	public final Declarator direct_declarator() throws RecognitionException {
		Declarator declarator = null;

		int direct_declarator_StartIndex = input.index();

		Token IDENTIFIER11=null;
		Suffix declarator_suffix12 =null;

		 Suffix suffix = null; String id = null; 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return declarator; }

			// myCompiler.g:593:2: ( ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* )
			// myCompiler.g:593:4: ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )*
			{
			// myCompiler.g:593:4: ( IDENTIFIER | '(' declarator ')' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==IDENTIFIER) ) {
				alt27=1;
			}
			else if ( (LA27_0==24) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return declarator;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// myCompiler.g:593:5: IDENTIFIER
					{
					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_direct_declarator795); if (state.failed) return declarator;
					if ( state.backtracking==0 ) { id = (IDENTIFIER11!=null?IDENTIFIER11.getText():null); }
					}
					break;
				case 2 :
					// myCompiler.g:600:4: '(' declarator ')'
					{
					match(input,24,FOLLOW_24_in_direct_declarator826); if (state.failed) return declarator;
					pushFollow(FOLLOW_declarator_in_direct_declarator828);
					declarator();
					state._fsp--;
					if (state.failed) return declarator;
					if ( state.backtracking==0 ) { id = declarator.id; }
					match(input,25,FOLLOW_25_in_direct_declarator833); if (state.failed) return declarator;
					}
					break;

			}

			// myCompiler.g:601:7: ( declarator_suffix )*
			loop28:
			while (true) {
				int alt28=2;
				alt28 = dfa28.predict(input);
				switch (alt28) {
				case 1 :
					// myCompiler.g:601:7: declarator_suffix
					{
					pushFollow(FOLLOW_declarator_suffix_in_direct_declarator836);
					declarator_suffix12=declarator_suffix();
					state._fsp--;
					if (state.failed) return declarator;
					}
					break;

				default :
					break loop28;
				}
			}

			if ( state.backtracking==0 ) { suffix = declarator_suffix12; declarator = new Declarator(id, suffix); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, direct_declarator_StartIndex); }

		}
		return declarator;
	}
	// $ANTLR end "direct_declarator"



	// $ANTLR start "declarator_suffix"
	// myCompiler.g:605:1: declarator_suffix returns [Suffix suffix] : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );
	public final Suffix declarator_suffix() throws RecognitionException {
		Suffix suffix = null;

		int declarator_suffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return suffix; }

			// myCompiler.g:606:2: ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' )
			int alt29=5;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==53) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==54) ) {
					alt29=2;
				}
				else if ( (LA29_1==CHARACTER_LITERAL||LA29_1==DECIMAL_LITERAL||LA29_1==FLOATING_POINT_LITERAL||LA29_1==IDENTIFIER||LA29_1==STRING_LITERAL||LA29_1==17||LA29_1==22||LA29_1==24||LA29_1==26||(LA29_1 >= 28 && LA29_1 <= 29)||(LA29_1 >= 32 && LA29_1 <= 33)||LA29_1==80||LA29_1==95) ) {
					alt29=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return suffix;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA29_0==24) ) {
				switch ( input.LA(2) ) {
				case 25:
					{
					alt29=5;
					}
					break;
				case 57:
				case 58:
				case 61:
				case 62:
				case 66:
				case 68:
				case 69:
				case 70:
				case 74:
				case 75:
				case 76:
				case 78:
				case 79:
				case 81:
				case 82:
				case 85:
				case 86:
				case 87:
				case 88:
					{
					alt29=3;
					}
					break;
				case IDENTIFIER:
					{
					alt29=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return suffix;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return suffix;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// myCompiler.g:606:6: '[' constant_expression ']'
					{
					match(input,53,FOLLOW_53_in_declarator_suffix858); if (state.failed) return suffix;
					pushFollow(FOLLOW_constant_expression_in_declarator_suffix860);
					constant_expression();
					state._fsp--;
					if (state.failed) return suffix;
					match(input,54,FOLLOW_54_in_declarator_suffix862); if (state.failed) return suffix;
					if ( state.backtracking==0 ) { suffix = Suffix.ARRAY; }
					}
					break;
				case 2 :
					// myCompiler.g:607:9: '[' ']'
					{
					match(input,53,FOLLOW_53_in_declarator_suffix874); if (state.failed) return suffix;
					match(input,54,FOLLOW_54_in_declarator_suffix876); if (state.failed) return suffix;
					if ( state.backtracking==0 ) { suffix = Suffix.ARRAY; }
					}
					break;
				case 3 :
					// myCompiler.g:608:9: '(' parameter_type_list ')'
					{
					match(input,24,FOLLOW_24_in_declarator_suffix888); if (state.failed) return suffix;
					pushFollow(FOLLOW_parameter_type_list_in_declarator_suffix890);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return suffix;
					match(input,25,FOLLOW_25_in_declarator_suffix892); if (state.failed) return suffix;
					if ( state.backtracking==0 ) { suffix = Suffix.FUNCTION; }
					}
					break;
				case 4 :
					// myCompiler.g:609:9: '(' identifier_list ')'
					{
					match(input,24,FOLLOW_24_in_declarator_suffix904); if (state.failed) return suffix;
					pushFollow(FOLLOW_identifier_list_in_declarator_suffix906);
					identifier_list();
					state._fsp--;
					if (state.failed) return suffix;
					match(input,25,FOLLOW_25_in_declarator_suffix908); if (state.failed) return suffix;
					if ( state.backtracking==0 ) { suffix = Suffix.FUNCTION; }
					}
					break;
				case 5 :
					// myCompiler.g:610:9: '(' ')'
					{
					match(input,24,FOLLOW_24_in_declarator_suffix920); if (state.failed) return suffix;
					match(input,25,FOLLOW_25_in_declarator_suffix922); if (state.failed) return suffix;
					if ( state.backtracking==0 ) { suffix = Suffix.FUNCTION; }
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
			if ( state.backtracking>0 ) { memoize(input, 23, declarator_suffix_StartIndex); }

		}
		return suffix;
	}
	// $ANTLR end "declarator_suffix"



	// $ANTLR start "pointer"
	// myCompiler.g:613:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );
	public final void pointer() throws RecognitionException {
		int pointer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// myCompiler.g:614:2: ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' )
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==26) ) {
				switch ( input.LA(2) ) {
				case 62:
					{
					int LA32_2 = input.LA(3);
					if ( (synpred54_myCompiler()) ) {
						alt32=1;
					}
					else if ( (true) ) {
						alt32=3;
					}

					}
					break;
				case 88:
					{
					int LA32_3 = input.LA(3);
					if ( (synpred54_myCompiler()) ) {
						alt32=1;
					}
					else if ( (true) ) {
						alt32=3;
					}

					}
					break;
				case 26:
					{
					int LA32_4 = input.LA(3);
					if ( (synpred55_myCompiler()) ) {
						alt32=2;
					}
					else if ( (true) ) {
						alt32=3;
					}

					}
					break;
				case EOF:
				case IDENTIFIER:
				case 24:
				case 25:
				case 31:
				case 40:
				case 41:
				case 46:
				case 53:
				case 57:
				case 58:
				case 61:
				case 66:
				case 68:
				case 69:
				case 70:
				case 74:
				case 75:
				case 76:
				case 78:
				case 79:
				case 81:
				case 82:
				case 84:
				case 85:
				case 86:
				case 87:
				case 90:
					{
					alt32=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// myCompiler.g:614:4: '*' ( type_qualifier )+ ( pointer )?
					{
					match(input,26,FOLLOW_26_in_pointer935); if (state.failed) return;
					// myCompiler.g:614:8: ( type_qualifier )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						alt30 = dfa30.predict(input);
						switch (alt30) {
						case 1 :
							// myCompiler.g:614:8: type_qualifier
							{
							pushFollow(FOLLOW_type_qualifier_in_pointer937);
							type_qualifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					// myCompiler.g:614:24: ( pointer )?
					int alt31=2;
					alt31 = dfa31.predict(input);
					switch (alt31) {
						case 1 :
							// myCompiler.g:614:24: pointer
							{
							pushFollow(FOLLOW_pointer_in_pointer940);
							pointer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// myCompiler.g:615:4: '*' pointer
					{
					match(input,26,FOLLOW_26_in_pointer946); if (state.failed) return;
					pushFollow(FOLLOW_pointer_in_pointer948);
					pointer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:616:4: '*'
					{
					match(input,26,FOLLOW_26_in_pointer953); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 24, pointer_StartIndex); }

		}
	}
	// $ANTLR end "pointer"



	// $ANTLR start "parameter_type_list"
	// myCompiler.g:620:1: parameter_type_list : parameter_list ( ',' '...' )? ;
	public final void parameter_type_list() throws RecognitionException {
		int parameter_type_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// myCompiler.g:621:2: ( parameter_list ( ',' '...' )? )
			// myCompiler.g:621:4: parameter_list ( ',' '...' )?
			{
			pushFollow(FOLLOW_parameter_list_in_parameter_type_list965);
			parameter_list();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:621:19: ( ',' '...' )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==31) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// myCompiler.g:621:20: ',' '...'
					{
					match(input,31,FOLLOW_31_in_parameter_type_list968); if (state.failed) return;
					match(input,37,FOLLOW_37_in_parameter_type_list970); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, parameter_type_list_StartIndex); }

		}
	}
	// $ANTLR end "parameter_type_list"



	// $ANTLR start "parameter_list"
	// myCompiler.g:625:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* ;
	public final void parameter_list() throws RecognitionException {
		int parameter_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// myCompiler.g:626:2: ( parameter_declaration ( ',' parameter_declaration )* )
			// myCompiler.g:626:4: parameter_declaration ( ',' parameter_declaration )*
			{
			pushFollow(FOLLOW_parameter_declaration_in_parameter_list984);
			parameter_declaration();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:626:26: ( ',' parameter_declaration )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==31) ) {
					int LA34_1 = input.LA(2);
					if ( ((LA34_1 >= 57 && LA34_1 <= 58)||(LA34_1 >= 61 && LA34_1 <= 62)||LA34_1==66||(LA34_1 >= 68 && LA34_1 <= 70)||(LA34_1 >= 74 && LA34_1 <= 76)||(LA34_1 >= 78 && LA34_1 <= 79)||(LA34_1 >= 81 && LA34_1 <= 82)||(LA34_1 >= 85 && LA34_1 <= 88)) ) {
						alt34=1;
					}

				}

				switch (alt34) {
				case 1 :
					// myCompiler.g:626:27: ',' parameter_declaration
					{
					match(input,31,FOLLOW_31_in_parameter_list987); if (state.failed) return;
					pushFollow(FOLLOW_parameter_declaration_in_parameter_list989);
					parameter_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
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
			if ( state.backtracking>0 ) { memoize(input, 26, parameter_list_StartIndex); }

		}
	}
	// $ANTLR end "parameter_list"



	// $ANTLR start "parameter_declaration"
	// myCompiler.g:630:1: parameter_declaration : declaration_specifiers ( declarator | abstract_declarator )* ;
	public final void parameter_declaration() throws RecognitionException {
		int parameter_declaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// myCompiler.g:631:2: ( declaration_specifiers ( declarator | abstract_declarator )* )
			// myCompiler.g:631:4: declaration_specifiers ( declarator | abstract_declarator )*
			{
			pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration1003);
			declaration_specifiers();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:631:27: ( declarator | abstract_declarator )*
			loop35:
			while (true) {
				int alt35=3;
				switch ( input.LA(1) ) {
				case 26:
					{
					int LA35_4 = input.LA(2);
					if ( (synpred58_myCompiler()) ) {
						alt35=1;
					}
					else if ( (synpred59_myCompiler()) ) {
						alt35=2;
					}

					}
					break;
				case IDENTIFIER:
					{
					alt35=1;
					}
					break;
				case 24:
					{
					switch ( input.LA(2) ) {
					case 25:
					case 53:
					case 57:
					case 58:
					case 61:
					case 62:
					case 66:
					case 68:
					case 69:
					case 70:
					case 74:
					case 75:
					case 76:
					case 78:
					case 79:
					case 81:
					case 82:
					case 85:
					case 86:
					case 87:
					case 88:
						{
						alt35=2;
						}
						break;
					case 26:
						{
						int LA35_18 = input.LA(3);
						if ( (synpred58_myCompiler()) ) {
							alt35=1;
						}
						else if ( (synpred59_myCompiler()) ) {
							alt35=2;
						}

						}
						break;
					case IDENTIFIER:
						{
						alt35=1;
						}
						break;
					case 24:
						{
						int LA35_20 = input.LA(3);
						if ( (synpred58_myCompiler()) ) {
							alt35=1;
						}
						else if ( (synpred59_myCompiler()) ) {
							alt35=2;
						}

						}
						break;
					}
					}
					break;
				case 53:
					{
					alt35=2;
					}
					break;
				}
				switch (alt35) {
				case 1 :
					// myCompiler.g:631:28: declarator
					{
					pushFollow(FOLLOW_declarator_in_parameter_declaration1006);
					declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:631:39: abstract_declarator
					{
					pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration1008);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
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
			if ( state.backtracking>0 ) { memoize(input, 27, parameter_declaration_StartIndex); }

		}
	}
	// $ANTLR end "parameter_declaration"



	// $ANTLR start "identifier_list"
	// myCompiler.g:635:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* ;
	public final void identifier_list() throws RecognitionException {
		int identifier_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// myCompiler.g:636:2: ( IDENTIFIER ( ',' IDENTIFIER )* )
			// myCompiler.g:636:4: IDENTIFIER ( ',' IDENTIFIER )*
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list1022); if (state.failed) return;
			// myCompiler.g:636:15: ( ',' IDENTIFIER )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==31) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// myCompiler.g:636:16: ',' IDENTIFIER
					{
					match(input,31,FOLLOW_31_in_identifier_list1025); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list1027); if (state.failed) return;
					}
					break;

				default :
					break loop36;
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
			if ( state.backtracking>0 ) { memoize(input, 28, identifier_list_StartIndex); }

		}
	}
	// $ANTLR end "identifier_list"



	// $ANTLR start "type_name"
	// myCompiler.g:640:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
	public final void type_name() throws RecognitionException {
		int type_name_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// myCompiler.g:641:2: ( specifier_qualifier_list ( abstract_declarator )? )
			// myCompiler.g:641:4: specifier_qualifier_list ( abstract_declarator )?
			{
			pushFollow(FOLLOW_specifier_qualifier_list_in_type_name1041);
			specifier_qualifier_list();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:641:29: ( abstract_declarator )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==24||LA37_0==26||LA37_0==53) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// myCompiler.g:641:29: abstract_declarator
					{
					pushFollow(FOLLOW_abstract_declarator_in_type_name1043);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, type_name_StartIndex); }

		}
	}
	// $ANTLR end "type_name"



	// $ANTLR start "abstract_declarator"
	// myCompiler.g:645:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );
	public final void abstract_declarator() throws RecognitionException {
		int abstract_declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// myCompiler.g:646:2: ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==26) ) {
				alt39=1;
			}
			else if ( (LA39_0==24||LA39_0==53) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// myCompiler.g:646:4: pointer ( direct_abstract_declarator )?
					{
					pushFollow(FOLLOW_pointer_in_abstract_declarator1056);
					pointer();
					state._fsp--;
					if (state.failed) return;
					// myCompiler.g:646:12: ( direct_abstract_declarator )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==24) ) {
						switch ( input.LA(2) ) {
							case 25:
								{
								int LA38_8 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 26:
								{
								int LA38_9 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 24:
								{
								int LA38_10 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 53:
								{
								int LA38_11 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 69:
								{
								int LA38_12 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 81:
								{
								int LA38_13 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 57:
								{
								int LA38_14 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 76:
								{
								int LA38_15 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 87:
								{
								int LA38_16 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 61:
								{
								int LA38_17 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 78:
								{
								int LA38_18 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 74:
								{
								int LA38_19 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 75:
								{
								int LA38_20 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 70:
								{
								int LA38_21 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 66:
								{
								int LA38_22 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 79:
								{
								int LA38_23 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 86:
								{
								int LA38_24 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 82:
							case 85:
								{
								int LA38_25 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 68:
								{
								int LA38_26 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 58:
								{
								int LA38_27 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 62:
								{
								int LA38_28 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 88:
								{
								int LA38_29 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
						}
					}
					else if ( (LA38_0==53) ) {
						switch ( input.LA(2) ) {
							case 54:
								{
								int LA38_31 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 24:
								{
								int LA38_32 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case IDENTIFIER:
								{
								int LA38_33 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case DECIMAL_LITERAL:
								{
								int LA38_34 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case CHARACTER_LITERAL:
								{
								int LA38_35 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case STRING_LITERAL:
								{
								int LA38_36 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case FLOATING_POINT_LITERAL:
								{
								int LA38_37 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 29:
								{
								int LA38_38 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 33:
								{
								int LA38_39 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 22:
								{
								int LA38_40 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 26:
								{
								int LA38_41 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 28:
								{
								int LA38_42 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 32:
								{
								int LA38_43 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 95:
								{
								int LA38_44 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 17:
								{
								int LA38_45 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
							case 80:
								{
								int LA38_46 = input.LA(3);
								if ( (synpred62_myCompiler()) ) {
									alt38=1;
								}
								}
								break;
						}
					}
					switch (alt38) {
						case 1 :
							// myCompiler.g:646:12: direct_abstract_declarator
							{
							pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator1058);
							direct_abstract_declarator();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// myCompiler.g:647:4: direct_abstract_declarator
					{
					pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator1064);
					direct_abstract_declarator();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 30, abstract_declarator_StartIndex); }

		}
	}
	// $ANTLR end "abstract_declarator"



	// $ANTLR start "direct_abstract_declarator"
	// myCompiler.g:651:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* ;
	public final void direct_abstract_declarator() throws RecognitionException {
		int direct_abstract_declarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// myCompiler.g:652:2: ( ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* )
			// myCompiler.g:652:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )*
			{
			// myCompiler.g:652:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==24) ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1==25||(LA40_1 >= 57 && LA40_1 <= 58)||(LA40_1 >= 61 && LA40_1 <= 62)||LA40_1==66||(LA40_1 >= 68 && LA40_1 <= 70)||(LA40_1 >= 74 && LA40_1 <= 76)||(LA40_1 >= 78 && LA40_1 <= 79)||(LA40_1 >= 81 && LA40_1 <= 82)||(LA40_1 >= 85 && LA40_1 <= 88)) ) {
					alt40=2;
				}
				else if ( (LA40_1==24||LA40_1==26||LA40_1==53) ) {
					alt40=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA40_0==53) ) {
				alt40=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// myCompiler.g:652:6: '(' abstract_declarator ')'
					{
					match(input,24,FOLLOW_24_in_direct_abstract_declarator1078); if (state.failed) return;
					pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator1080);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_direct_abstract_declarator1082); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:652:36: abstract_declarator_suffix
					{
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1086);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// myCompiler.g:652:65: ( abstract_declarator_suffix )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==24) ) {
					switch ( input.LA(2) ) {
					case 25:
						{
						int LA41_8 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 69:
						{
						int LA41_13 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 81:
						{
						int LA41_14 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 57:
						{
						int LA41_15 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 76:
						{
						int LA41_16 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 87:
						{
						int LA41_17 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 61:
						{
						int LA41_18 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 78:
						{
						int LA41_19 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 74:
						{
						int LA41_20 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 75:
						{
						int LA41_21 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 70:
						{
						int LA41_22 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 66:
						{
						int LA41_23 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 79:
						{
						int LA41_24 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 86:
						{
						int LA41_25 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 82:
					case 85:
						{
						int LA41_26 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 68:
						{
						int LA41_27 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 58:
						{
						int LA41_28 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 62:
						{
						int LA41_29 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 88:
						{
						int LA41_30 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					}
				}
				else if ( (LA41_0==53) ) {
					switch ( input.LA(2) ) {
					case 54:
						{
						int LA41_31 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 24:
						{
						int LA41_32 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA41_33 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case DECIMAL_LITERAL:
						{
						int LA41_34 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case CHARACTER_LITERAL:
						{
						int LA41_35 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case STRING_LITERAL:
						{
						int LA41_36 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case FLOATING_POINT_LITERAL:
						{
						int LA41_37 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 29:
						{
						int LA41_38 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 33:
						{
						int LA41_39 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 22:
						{
						int LA41_40 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 26:
						{
						int LA41_41 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 28:
						{
						int LA41_42 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 32:
						{
						int LA41_43 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 95:
						{
						int LA41_44 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 17:
						{
						int LA41_45 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					case 80:
						{
						int LA41_46 = input.LA(3);
						if ( (synpred65_myCompiler()) ) {
							alt41=1;
						}

						}
						break;
					}
				}

				switch (alt41) {
				case 1 :
					// myCompiler.g:652:65: abstract_declarator_suffix
					{
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1090);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop41;
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
			if ( state.backtracking>0 ) { memoize(input, 31, direct_abstract_declarator_StartIndex); }

		}
	}
	// $ANTLR end "direct_abstract_declarator"



	// $ANTLR start "abstract_declarator_suffix"
	// myCompiler.g:656:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );
	public final void abstract_declarator_suffix() throws RecognitionException {
		int abstract_declarator_suffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// myCompiler.g:657:2: ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' )
			int alt42=4;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==53) ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1==54) ) {
					alt42=1;
				}
				else if ( (LA42_1==CHARACTER_LITERAL||LA42_1==DECIMAL_LITERAL||LA42_1==FLOATING_POINT_LITERAL||LA42_1==IDENTIFIER||LA42_1==STRING_LITERAL||LA42_1==17||LA42_1==22||LA42_1==24||LA42_1==26||(LA42_1 >= 28 && LA42_1 <= 29)||(LA42_1 >= 32 && LA42_1 <= 33)||LA42_1==80||LA42_1==95) ) {
					alt42=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA42_0==24) ) {
				int LA42_2 = input.LA(2);
				if ( (LA42_2==25) ) {
					alt42=3;
				}
				else if ( ((LA42_2 >= 57 && LA42_2 <= 58)||(LA42_2 >= 61 && LA42_2 <= 62)||LA42_2==66||(LA42_2 >= 68 && LA42_2 <= 70)||(LA42_2 >= 74 && LA42_2 <= 76)||(LA42_2 >= 78 && LA42_2 <= 79)||(LA42_2 >= 81 && LA42_2 <= 82)||(LA42_2 >= 85 && LA42_2 <= 88)) ) {
					alt42=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// myCompiler.g:657:4: '[' ']'
					{
					match(input,53,FOLLOW_53_in_abstract_declarator_suffix1103); if (state.failed) return;
					match(input,54,FOLLOW_54_in_abstract_declarator_suffix1105); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:658:4: '[' constant_expression ']'
					{
					match(input,53,FOLLOW_53_in_abstract_declarator_suffix1110); if (state.failed) return;
					pushFollow(FOLLOW_constant_expression_in_abstract_declarator_suffix1112);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,54,FOLLOW_54_in_abstract_declarator_suffix1114); if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:659:4: '(' ')'
					{
					match(input,24,FOLLOW_24_in_abstract_declarator_suffix1119); if (state.failed) return;
					match(input,25,FOLLOW_25_in_abstract_declarator_suffix1121); if (state.failed) return;
					}
					break;
				case 4 :
					// myCompiler.g:660:4: '(' parameter_type_list ')'
					{
					match(input,24,FOLLOW_24_in_abstract_declarator_suffix1126); if (state.failed) return;
					pushFollow(FOLLOW_parameter_type_list_in_abstract_declarator_suffix1128);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_abstract_declarator_suffix1130); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 32, abstract_declarator_suffix_StartIndex); }

		}
	}
	// $ANTLR end "abstract_declarator_suffix"



	// $ANTLR start "initializer"
	// myCompiler.g:664:1: initializer returns [Symbol symb] : ( assignment_expression | '{' initializer_list ( ',' )? '}' );
	public final Symbol initializer() throws RecognitionException {
		Symbol symb = null;

		int initializer_StartIndex = input.index();

		Symbol assignment_expression13 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return symb; }

			// myCompiler.g:665:2: ( assignment_expression | '{' initializer_list ( ',' )? '}' )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==CHARACTER_LITERAL||LA44_0==DECIMAL_LITERAL||LA44_0==FLOATING_POINT_LITERAL||LA44_0==IDENTIFIER||LA44_0==STRING_LITERAL||LA44_0==17||LA44_0==22||LA44_0==24||LA44_0==26||(LA44_0 >= 28 && LA44_0 <= 29)||(LA44_0 >= 32 && LA44_0 <= 33)||LA44_0==80||LA44_0==95) ) {
				alt44=1;
			}
			else if ( (LA44_0==90) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return symb;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// myCompiler.g:665:4: assignment_expression
					{
					pushFollow(FOLLOW_assignment_expression_in_initializer1147);
					assignment_expression13=assignment_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) { symb = assignment_expression13; }
					}
					break;
				case 2 :
					// myCompiler.g:666:4: '{' initializer_list ( ',' )? '}'
					{
					match(input,90,FOLLOW_90_in_initializer1154); if (state.failed) return symb;
					pushFollow(FOLLOW_initializer_list_in_initializer1156);
					initializer_list();
					state._fsp--;
					if (state.failed) return symb;
					// myCompiler.g:666:25: ( ',' )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==31) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// myCompiler.g:666:25: ','
							{
							match(input,31,FOLLOW_31_in_initializer1158); if (state.failed) return symb;
							}
							break;

					}

					match(input,94,FOLLOW_94_in_initializer1161); if (state.failed) return symb;
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
			if ( state.backtracking>0 ) { memoize(input, 33, initializer_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "initializer"



	// $ANTLR start "initializer_list"
	// myCompiler.g:670:1: initializer_list : initializer ( ',' initializer )* ;
	public final void initializer_list() throws RecognitionException {
		int initializer_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// myCompiler.g:671:2: ( initializer ( ',' initializer )* )
			// myCompiler.g:671:4: initializer ( ',' initializer )*
			{
			pushFollow(FOLLOW_initializer_in_initializer_list1173);
			initializer();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:671:16: ( ',' initializer )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==31) ) {
					int LA45_1 = input.LA(2);
					if ( (LA45_1==CHARACTER_LITERAL||LA45_1==DECIMAL_LITERAL||LA45_1==FLOATING_POINT_LITERAL||LA45_1==IDENTIFIER||LA45_1==STRING_LITERAL||LA45_1==17||LA45_1==22||LA45_1==24||LA45_1==26||(LA45_1 >= 28 && LA45_1 <= 29)||(LA45_1 >= 32 && LA45_1 <= 33)||LA45_1==80||LA45_1==90||LA45_1==95) ) {
						alt45=1;
					}

				}

				switch (alt45) {
				case 1 :
					// myCompiler.g:671:17: ',' initializer
					{
					match(input,31,FOLLOW_31_in_initializer_list1176); if (state.failed) return;
					pushFollow(FOLLOW_initializer_in_initializer_list1178);
					initializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop45;
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
			if ( state.backtracking>0 ) { memoize(input, 34, initializer_list_StartIndex); }

		}
	}
	// $ANTLR end "initializer_list"



	// $ANTLR start "argument_expression_list"
	// myCompiler.g:679:1: argument_expression_list returns [List<Symbol> symbols] : asgn= assignment_expression ( ',' asgn2= assignment_expression )* ;
	public final List<Symbol> argument_expression_list() throws RecognitionException {
		List<Symbol> symbols = null;

		int argument_expression_list_StartIndex = input.index();

		Symbol asgn =null;
		Symbol asgn2 =null;

		 symbols = new ArrayList<Symbol>(); 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return symbols; }

			// myCompiler.g:681:2: (asgn= assignment_expression ( ',' asgn2= assignment_expression )* )
			// myCompiler.g:681:4: asgn= assignment_expression ( ',' asgn2= assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1210);
			asgn=assignment_expression();
			state._fsp--;
			if (state.failed) return symbols;
			if ( state.backtracking==0 ) { symbols.add(asgn); }
			// myCompiler.g:682:2: ( ',' asgn2= assignment_expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==31) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// myCompiler.g:682:3: ',' asgn2= assignment_expression
					{
					match(input,31,FOLLOW_31_in_argument_expression_list1216); if (state.failed) return symbols;
					pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1220);
					asgn2=assignment_expression();
					state._fsp--;
					if (state.failed) return symbols;
					if ( state.backtracking==0 ) { symbols.add(asgn2); }
					}
					break;

				default :
					break loop46;
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
			if ( state.backtracking>0 ) { memoize(input, 35, argument_expression_list_StartIndex); }

		}
		return symbols;
	}
	// $ANTLR end "argument_expression_list"


	public static class additive_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "additive_expression"
	// myCompiler.g:689:1: additive_expression returns [Symbol symb] : (mul1= multiplicative_expression ) ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )* ;
	public final myCompilerParser.additive_expression_return additive_expression() throws RecognitionException {
		myCompilerParser.additive_expression_return retval = new myCompilerParser.additive_expression_return();
		retval.start = input.LT(1);
		int additive_expression_StartIndex = input.index();

		ParserRuleReturnScope mul1 =null;
		ParserRuleReturnScope mul2 =null;
		ParserRuleReturnScope mul3 =null;

		 Symbol symb2 = null; String op = null; String irOp = null; int line = -1;
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// myCompiler.g:691:2: ( (mul1= multiplicative_expression ) ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )* )
			// myCompiler.g:691:4: (mul1= multiplicative_expression ) ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )*
			{
			// myCompiler.g:691:4: (mul1= multiplicative_expression )
			// myCompiler.g:691:5: mul1= multiplicative_expression
			{
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1253);
			mul1=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			}

			if ( state.backtracking==0 ) { retval.symb = (mul1!=null?((myCompilerParser.multiplicative_expression_return)mul1).symb:null); line = (mul1!=null?(mul1.start):null).getLine(); }
			// myCompiler.g:692:2: ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==28||LA48_0==32) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// myCompiler.g:692:3: ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )
					{
					// myCompiler.g:692:3: ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==28) ) {
						alt47=1;
					}
					else if ( (LA47_0==32) ) {
						alt47=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// myCompiler.g:692:5: '+' mul2= multiplicative_expression
							{
							match(input,28,FOLLOW_28_in_additive_expression1263); if (state.failed) return retval;
							pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1267);
							mul2=multiplicative_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { symb2 = (mul2!=null?((myCompilerParser.multiplicative_expression_return)mul2).symb:null); op = "+"; irOp = "add"; }
							}
							break;
						case 2 :
							// myCompiler.g:693:4: '-' mul3= multiplicative_expression
							{
							match(input,32,FOLLOW_32_in_additive_expression1274); if (state.failed) return retval;
							pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1278);
							mul3=multiplicative_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { symb2 = (mul3!=null?((myCompilerParser.multiplicative_expression_return)mul3).symb:null); op = "-"; irOp = "sub";  }
							}
							break;

					}

					if ( state.backtracking==0 ) { retval.symb = genArithmeticCode(retval.symb, symb2, op, irOp, line); }
					}
					break;

				default :
					break loop48;
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
			if ( state.backtracking>0 ) { memoize(input, 36, additive_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class multiplicative_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "multiplicative_expression"
	// myCompiler.g:699:1: multiplicative_expression returns [Symbol symb] : (cast1= cast_expression ) ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )* ;
	public final myCompilerParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		myCompilerParser.multiplicative_expression_return retval = new myCompilerParser.multiplicative_expression_return();
		retval.start = input.LT(1);
		int multiplicative_expression_StartIndex = input.index();

		ParserRuleReturnScope cast1 =null;
		ParserRuleReturnScope cast2 =null;
		ParserRuleReturnScope cast3 =null;
		ParserRuleReturnScope cast4 =null;

		 Symbol symb2 = null; String op = null; String irOp = null; int line = -1; 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// myCompiler.g:701:2: ( (cast1= cast_expression ) ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )* )
			// myCompiler.g:701:4: (cast1= cast_expression ) ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )*
			{
			// myCompiler.g:701:4: (cast1= cast_expression )
			// myCompiler.g:701:5: cast1= cast_expression
			{
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1313);
			cast1=cast_expression();
			state._fsp--;
			if (state.failed) return retval;
			}

			if ( state.backtracking==0 ) { retval.symb = (cast1!=null?((myCompilerParser.cast_expression_return)cast1).symb:null); line = (cast1!=null?(cast1.start):null).getLine(); }
			// myCompiler.g:702:2: ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==19||LA50_0==26||LA50_0==38) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// myCompiler.g:702:3: ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )
					{
					// myCompiler.g:702:3: ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )
					int alt49=3;
					switch ( input.LA(1) ) {
					case 26:
						{
						alt49=1;
						}
						break;
					case 38:
						{
						alt49=2;
						}
						break;
					case 19:
						{
						alt49=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 49, 0, input);
						throw nvae;
					}
					switch (alt49) {
						case 1 :
							// myCompiler.g:702:5: '*' cast2= cast_expression
							{
							match(input,26,FOLLOW_26_in_multiplicative_expression1323); if (state.failed) return retval;
							pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1327);
							cast2=cast_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { symb2 = (cast2!=null?((myCompilerParser.cast_expression_return)cast2).symb:null); op = "*"; irOp = "mul"; }
							}
							break;
						case 2 :
							// myCompiler.g:703:4: '/' cast3= cast_expression
							{
							match(input,38,FOLLOW_38_in_multiplicative_expression1334); if (state.failed) return retval;
							pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1338);
							cast3=cast_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { symb2 = (cast3!=null?((myCompilerParser.cast_expression_return)cast3).symb:null); op = "/"; irOp = "sdiv"; }
							}
							break;
						case 3 :
							// myCompiler.g:704:4: '%' cast4= cast_expression
							{
							match(input,19,FOLLOW_19_in_multiplicative_expression1345); if (state.failed) return retval;
							pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1349);
							cast4=cast_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) { symb2 = (cast4!=null?((myCompilerParser.cast_expression_return)cast4).symb:null); op = "%"; irOp = "srem"; }
							}
							break;

					}

					if ( state.backtracking==0 ) { retval.symb = genArithmeticCode(retval.symb, symb2, op, irOp, line); }
					}
					break;

				default :
					break loop50;
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
			if ( state.backtracking>0 ) { memoize(input, 37, multiplicative_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiplicative_expression"


	public static class cast_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "cast_expression"
	// myCompiler.g:712:1: cast_expression returns [Symbol symb] : ( '(' type_name ')' cast_expression | unary_expression );
	public final myCompilerParser.cast_expression_return cast_expression() throws RecognitionException {
		myCompilerParser.cast_expression_return retval = new myCompilerParser.cast_expression_return();
		retval.start = input.LT(1);
		int cast_expression_StartIndex = input.index();

		Symbol unary_expression14 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// myCompiler.g:713:2: ( '(' type_name ')' cast_expression | unary_expression )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==24) ) {
				int LA51_1 = input.LA(2);
				if ( (LA51_1==58||(LA51_1 >= 61 && LA51_1 <= 62)||LA51_1==66||LA51_1==68||LA51_1==70||(LA51_1 >= 74 && LA51_1 <= 75)||(LA51_1 >= 78 && LA51_1 <= 79)||LA51_1==82||(LA51_1 >= 85 && LA51_1 <= 88)) ) {
					alt51=1;
				}
				else if ( (LA51_1==CHARACTER_LITERAL||LA51_1==DECIMAL_LITERAL||LA51_1==FLOATING_POINT_LITERAL||LA51_1==IDENTIFIER||LA51_1==STRING_LITERAL||LA51_1==17||LA51_1==22||LA51_1==24||LA51_1==26||(LA51_1 >= 28 && LA51_1 <= 29)||(LA51_1 >= 32 && LA51_1 <= 33)||LA51_1==80||LA51_1==95) ) {
					alt51=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA51_0==CHARACTER_LITERAL||LA51_0==DECIMAL_LITERAL||LA51_0==FLOATING_POINT_LITERAL||LA51_0==IDENTIFIER||LA51_0==STRING_LITERAL||LA51_0==17||LA51_0==22||LA51_0==26||(LA51_0 >= 28 && LA51_0 <= 29)||(LA51_0 >= 32 && LA51_0 <= 33)||LA51_0==80||LA51_0==95) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// myCompiler.g:713:4: '(' type_name ')' cast_expression
					{
					match(input,24,FOLLOW_24_in_cast_expression1379); if (state.failed) return retval;
					pushFollow(FOLLOW_type_name_in_cast_expression1381);
					type_name();
					state._fsp--;
					if (state.failed) return retval;
					match(input,25,FOLLOW_25_in_cast_expression1383); if (state.failed) return retval;
					pushFollow(FOLLOW_cast_expression_in_cast_expression1385);
					cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// myCompiler.g:714:4: unary_expression
					{
					pushFollow(FOLLOW_unary_expression_in_cast_expression1391);
					unary_expression14=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.symb = unary_expression14; }
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
			if ( state.backtracking>0 ) { memoize(input, 38, cast_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cast_expression"



	// $ANTLR start "unary_expression"
	// myCompiler.g:718:1: unary_expression returns [Symbol symb] : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );
	public final Symbol unary_expression() throws RecognitionException {
		Symbol symb = null;

		int unary_expression_StartIndex = input.index();

		Symbol postfix_expression15 =null;
		ParserRuleReturnScope unary_operator16 =null;
		ParserRuleReturnScope cast_expression17 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return symb; }

			// myCompiler.g:719:2: ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' )
			int alt52=6;
			switch ( input.LA(1) ) {
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case IDENTIFIER:
			case STRING_LITERAL:
			case 24:
				{
				alt52=1;
				}
				break;
			case 29:
				{
				alt52=2;
				}
				break;
			case 33:
				{
				alt52=3;
				}
				break;
			case 17:
			case 22:
			case 26:
			case 28:
			case 32:
			case 95:
				{
				alt52=4;
				}
				break;
			case 80:
				{
				int LA52_15 = input.LA(2);
				if ( (LA52_15==24) ) {
					int LA52_16 = input.LA(3);
					if ( (synpred83_myCompiler()) ) {
						alt52=5;
					}
					else if ( (true) ) {
						alt52=6;
					}

				}
				else if ( (LA52_15==CHARACTER_LITERAL||LA52_15==DECIMAL_LITERAL||LA52_15==FLOATING_POINT_LITERAL||LA52_15==IDENTIFIER||LA52_15==STRING_LITERAL||LA52_15==17||LA52_15==22||LA52_15==26||(LA52_15 >= 28 && LA52_15 <= 29)||(LA52_15 >= 32 && LA52_15 <= 33)||LA52_15==80||LA52_15==95) ) {
					alt52=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return symb;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return symb;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// myCompiler.g:719:4: postfix_expression
					{
					pushFollow(FOLLOW_postfix_expression_in_unary_expression1409);
					postfix_expression15=postfix_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) { symb = postfix_expression15; }
					}
					break;
				case 2 :
					// myCompiler.g:720:4: '++' unary_expression
					{
					match(input,29,FOLLOW_29_in_unary_expression1416); if (state.failed) return symb;
					pushFollow(FOLLOW_unary_expression_in_unary_expression1418);
					unary_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) { ; }
					}
					break;
				case 3 :
					// myCompiler.g:721:4: '--' unary_expression
					{
					match(input,33,FOLLOW_33_in_unary_expression1426); if (state.failed) return symb;
					pushFollow(FOLLOW_unary_expression_in_unary_expression1428);
					unary_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) { ; }
					}
					break;
				case 4 :
					// myCompiler.g:722:4: unary_operator cast_expression
					{
					pushFollow(FOLLOW_unary_operator_in_unary_expression1436);
					unary_operator16=unary_operator();
					state._fsp--;
					if (state.failed) return symb;
					pushFollow(FOLLOW_cast_expression_in_unary_expression1438);
					cast_expression17=cast_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) {
								switch((unary_operator16!=null?((myCompilerParser.unary_operator_return)unary_operator16).op:0)) {
									case '&':
										break;
									case '*':
										break;
									case '+':
										symb = (cast_expression17!=null?((myCompilerParser.cast_expression_return)cast_expression17).symb:null);
										break;
									case '-':
										symb = (cast_expression17!=null?((myCompilerParser.cast_expression_return)cast_expression17).symb:null);
										if(!symb.isConstant) {
											Symbol tmp1 = new Symbol(symb.type, symb.identifier, false);
											mainCode.add(genLoadCode(LOCAL, tmp1.offset, "i32", symb.identifier, symb.offset));

											Symbol tmp2 = new Symbol(Type.INT, "0", true);
											mainCode.add(genStoreCode("i32", LOCAL, tmp1.offset, symb.identifier, symb.offset));
											symb = genArithmeticCode(tmp2, tmp1, "-", "sub", (unary_operator16!=null?(unary_operator16.start):null).getLine());
										} else {
											symb.value = "-" + symb.value;
										}
										break;
									case '~':
										break;
									case '!':
										break;
									default:
										System.out.println("TODO743: unary operation");
								}

							}
					}
					break;
				case 5 :
					// myCompiler.g:754:4: 'sizeof' unary_expression
					{
					match(input,80,FOLLOW_80_in_unary_expression1447); if (state.failed) return symb;
					pushFollow(FOLLOW_unary_expression_in_unary_expression1449);
					unary_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;
				case 6 :
					// myCompiler.g:755:4: 'sizeof' '(' type_name ')'
					{
					match(input,80,FOLLOW_80_in_unary_expression1455); if (state.failed) return symb;
					match(input,24,FOLLOW_24_in_unary_expression1457); if (state.failed) return symb;
					pushFollow(FOLLOW_type_name_in_unary_expression1459);
					type_name();
					state._fsp--;
					if (state.failed) return symb;
					match(input,25,FOLLOW_25_in_unary_expression1461); if (state.failed) return symb;
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
			if ( state.backtracking>0 ) { memoize(input, 39, unary_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "unary_expression"



	// $ANTLR start "postfix_expression"
	// myCompiler.g:759:1: postfix_expression returns [Symbol symb] : primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* ;
	public final Symbol postfix_expression() throws RecognitionException {
		Symbol symb = null;

		int postfix_expression_StartIndex = input.index();

		ParserRuleReturnScope primary_expression18 =null;
		List<Symbol> argument_expression_list19 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return symb; }

			// myCompiler.g:760:2: ( primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* )
			// myCompiler.g:760:6: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			{
			pushFollow(FOLLOW_primary_expression_in_postfix_expression1480);
			primary_expression18=primary_expression();
			state._fsp--;
			if (state.failed) return symb;
			if ( state.backtracking==0 ) { symb = (primary_expression18!=null?((myCompilerParser.primary_expression_return)primary_expression18).symb:null); }
			// myCompiler.g:761:9: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			loop53:
			while (true) {
				int alt53=8;
				alt53 = dfa53.predict(input);
				switch (alt53) {
				case 1 :
					// myCompiler.g:761:13: '[' expression ']'
					{
					match(input,53,FOLLOW_53_in_postfix_expression1496); if (state.failed) return symb;
					pushFollow(FOLLOW_expression_in_postfix_expression1498);
					expression();
					state._fsp--;
					if (state.failed) return symb;
					match(input,54,FOLLOW_54_in_postfix_expression1500); if (state.failed) return symb;
					}
					break;
				case 2 :
					// myCompiler.g:762:13: '(' ')'
					{
					match(input,24,FOLLOW_24_in_postfix_expression1514); if (state.failed) return symb;
					match(input,25,FOLLOW_25_in_postfix_expression1516); if (state.failed) return symb;
					}
					break;
				case 3 :
					// myCompiler.g:763:13: '(' argument_expression_list ')'
					{
					match(input,24,FOLLOW_24_in_postfix_expression1530); if (state.failed) return symb;
					pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1532);
					argument_expression_list19=argument_expression_list();
					state._fsp--;
					if (state.failed) return symb;
					match(input,25,FOLLOW_25_in_postfix_expression1534); if (state.failed) return symb;
					if ( state.backtracking==0 ) {	
										String args = "";
										int len = 0;
										for(Symbol symbol : argument_expression_list19) {
											// System.out.println("CHECK: " + symbol.offset);
											if(symbol.type == Type.STRING) {
												len = symbol.len;
												unnamedCode.add(String.format("@.str.%d = private unnamed_addr constant [%d x i8] c%s", unnamedVarCount++, symbol.len, symbol.value));
											} else {
												if(symbol.isConstant) {
													args += String.format(", %s noundef %s", "i32", symbol.value);
												} else {
													if(symbol.isStored || symbol.identifier == "@g") {
														symb = new Symbol();
														mainCode.add(genLoadCode("%t", symb.offset, "i32", symbol.identifier, symbol.offset));
														args += String.format(", %s noundef %s%d", "i32", "%t", symb.offset);
													} else {
														args += String.format(", %s noundef %s%d", "i32", symbol.identifier, symbol.offset);
													}
												}
											}	
										}

										if((primary_expression18!=null?((myCompilerParser.primary_expression_return)primary_expression18).isPrintf:false)) {
											symb = new Symbol();
											mainCode.add(String.format(
												"%%t%d = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([%d x i8], [%d x i8]* @.str.%d, i64 0, i64 0)%s)"
												, symb.offset, len, len, unnamedVarCount - 1, args));
										}
									}
					}
					break;
				case 4 :
					// myCompiler.g:794:13: '.' IDENTIFIER
					{
					match(input,36,FOLLOW_36_in_postfix_expression1555); if (state.failed) return symb;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1557); if (state.failed) return symb;
					}
					break;
				case 5 :
					// myCompiler.g:795:13: '->' IDENTIFIER
					{
					match(input,35,FOLLOW_35_in_postfix_expression1571); if (state.failed) return symb;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1573); if (state.failed) return symb;
					}
					break;
				case 6 :
					// myCompiler.g:796:13: '++'
					{
					match(input,29,FOLLOW_29_in_postfix_expression1587); if (state.failed) return symb;
					}
					break;
				case 7 :
					// myCompiler.g:797:13: '--'
					{
					match(input,33,FOLLOW_33_in_postfix_expression1601); if (state.failed) return symb;
					}
					break;

				default :
					break loop53;
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
			if ( state.backtracking>0 ) { memoize(input, 40, postfix_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "postfix_expression"


	public static class unary_operator_return extends ParserRuleReturnScope {
		public char op;
	};


	// $ANTLR start "unary_operator"
	// myCompiler.g:801:1: unary_operator returns [char op] : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final myCompilerParser.unary_operator_return unary_operator() throws RecognitionException {
		myCompilerParser.unary_operator_return retval = new myCompilerParser.unary_operator_return();
		retval.start = input.LT(1);
		int unary_operator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// myCompiler.g:802:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
			int alt54=6;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt54=1;
				}
				break;
			case 26:
				{
				alt54=2;
				}
				break;
			case 28:
				{
				alt54=3;
				}
				break;
			case 32:
				{
				alt54=4;
				}
				break;
			case 95:
				{
				alt54=5;
				}
				break;
			case 17:
				{
				alt54=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// myCompiler.g:802:4: '&'
					{
					match(input,22,FOLLOW_22_in_unary_operator1627); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.op = '&'; }
					}
					break;
				case 2 :
					// myCompiler.g:803:4: '*'
					{
					match(input,26,FOLLOW_26_in_unary_operator1634); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.op = '*'; }
					}
					break;
				case 3 :
					// myCompiler.g:804:4: '+'
					{
					match(input,28,FOLLOW_28_in_unary_operator1641); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.op = '+'; }
					}
					break;
				case 4 :
					// myCompiler.g:805:4: '-'
					{
					match(input,32,FOLLOW_32_in_unary_operator1648); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.op = '-'; }
					}
					break;
				case 5 :
					// myCompiler.g:806:4: '~'
					{
					match(input,95,FOLLOW_95_in_unary_operator1655); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.op = '~'; }
					}
					break;
				case 6 :
					// myCompiler.g:807:4: '!'
					{
					match(input,17,FOLLOW_17_in_unary_operator1662); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.op = '!'; }
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
			if ( state.backtracking>0 ) { memoize(input, 41, unary_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unary_operator"


	public static class primary_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
		public boolean isPrintf;
	};


	// $ANTLR start "primary_expression"
	// myCompiler.g:811:1: primary_expression returns [Symbol symb, boolean isPrintf] : ( IDENTIFIER | constant | '(' expression ')' );
	public final myCompilerParser.primary_expression_return primary_expression() throws RecognitionException {
		myCompilerParser.primary_expression_return retval = new myCompilerParser.primary_expression_return();
		retval.start = input.LT(1);
		int primary_expression_StartIndex = input.index();

		Token IDENTIFIER20=null;
		Symbol constant21 =null;
		ParserRuleReturnScope expression22 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// myCompiler.g:812:2: ( IDENTIFIER | constant | '(' expression ')' )
			int alt55=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt55=1;
				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case STRING_LITERAL:
				{
				alt55=2;
				}
				break;
			case 24:
				{
				alt55=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// myCompiler.g:812:4: IDENTIFIER
					{
					IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1681); if (state.failed) return retval;
					if ( state.backtracking==0 ) { 	
								if((IDENTIFIER20!=null?IDENTIFIER20.getText():null).equals("printf")) {
									retval.isPrintf = true;
									retval.symb = new Symbol();
								} else if(!symbolTable.containsKey((IDENTIFIER20!=null?IDENTIFIER20.getText():null))) {
									System.err.println(String.format(";error: '%s' undeclared in line %d", (IDENTIFIER20!=null?IDENTIFIER20.getText():null), IDENTIFIER20.getLine()));
									retval.symb = null;
								} else {
									retval.isPrintf = false;
									retval.symb = symbolTable.get((IDENTIFIER20!=null?IDENTIFIER20.getText():null));
								}
							}
					}
					break;
				case 2 :
					// myCompiler.g:825:4: constant
					{
					pushFollow(FOLLOW_constant_in_primary_expression1692);
					constant21=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.symb = constant21; }
					}
					break;
				case 3 :
					// myCompiler.g:826:4: '(' expression ')'
					{
					match(input,24,FOLLOW_24_in_primary_expression1699); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_primary_expression1701);
					expression22=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input,25,FOLLOW_25_in_primary_expression1703); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.symb = (expression22!=null?((myCompilerParser.expression_return)expression22).symb:null); }
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
			if ( state.backtracking>0 ) { memoize(input, 42, primary_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary_expression"



	// $ANTLR start "constant"
	// myCompiler.g:830:1: constant returns [Symbol symb] : ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
	public final Symbol constant() throws RecognitionException {
		Symbol symb = null;

		int constant_StartIndex = input.index();

		Token DECIMAL_LITERAL23=null;
		Token CHARACTER_LITERAL24=null;
		Token STRING_LITERAL25=null;
		Token FLOATING_POINT_LITERAL26=null;

		 symb = new Symbol(); symb.isConstant = true;
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return symb; }

			// myCompiler.g:834:5: ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
			int alt56=4;
			switch ( input.LA(1) ) {
			case DECIMAL_LITERAL:
				{
				alt56=1;
				}
				break;
			case CHARACTER_LITERAL:
				{
				alt56=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt56=3;
				}
				break;
			case FLOATING_POINT_LITERAL:
				{
				alt56=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return symb;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// myCompiler.g:834:9: DECIMAL_LITERAL
					{
					DECIMAL_LITERAL23=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_constant1741); if (state.failed) return symb;
					if ( state.backtracking==0 ) { 	
								symb.type = getMinType((DECIMAL_LITERAL23!=null?DECIMAL_LITERAL23.getText():null));
								symb.value = (DECIMAL_LITERAL23!=null?DECIMAL_LITERAL23.getText():null);
							}
					}
					break;
				case 2 :
					// myCompiler.g:840:7: CHARACTER_LITERAL
					{
					CHARACTER_LITERAL24=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_constant1755); if (state.failed) return symb;
					if ( state.backtracking==0 ) { symb.value = (CHARACTER_LITERAL24!=null?CHARACTER_LITERAL24.getText():null); }
					if ( state.backtracking==0 ) {	
								symb.type = Type.CHAR;
								symb.len = 2; // 1 literal + 1 null character 
								symb.value = symb.value.replace("\\n", "\\0A");
							}
					}
					break;
				case 3 :
					// myCompiler.g:847:4: STRING_LITERAL
					{
					STRING_LITERAL25=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant1768); if (state.failed) return symb;
					if ( state.backtracking==0 ) { symb.value = (STRING_LITERAL25!=null?STRING_LITERAL25.getText():null); }
					if ( state.backtracking==0 ) { symb.len = symb.value.length(); }
					if ( state.backtracking==0 ) {	
								symb.type = Type.STRING;
								symb.len = symb.value.replace("\\n", "0").length() - 1; // -2 quote + 1 null character 
								symb.value = symb.value.replace("\\n", "\\0A");
								symb.value = symb.value.substring(0, symb.value.length() - 1) + "\\00" + "\"";
							}
					}
					break;
				case 4 :
					// myCompiler.g:855:9: FLOATING_POINT_LITERAL
					{
					FLOATING_POINT_LITERAL26=(Token)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_constant1787); if (state.failed) return symb;
					if ( state.backtracking==0 ) { symb.value = (FLOATING_POINT_LITERAL26!=null?FLOATING_POINT_LITERAL26.getText():null); symb.type = Type.DOUBLE; }
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
			if ( state.backtracking>0 ) { memoize(input, 43, constant_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "constant"


	public static class expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "expression"
	// myCompiler.g:861:1: expression returns [Symbol symb] : a1= assignment_expression ( ',' assignment_expression )* ;
	public final myCompilerParser.expression_return expression() throws RecognitionException {
		myCompilerParser.expression_return retval = new myCompilerParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		Symbol a1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// myCompiler.g:862:2: (a1= assignment_expression ( ',' assignment_expression )* )
			// myCompiler.g:862:4: a1= assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_expression1815);
			a1=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.symb = a1; }
			// myCompiler.g:862:51: ( ',' assignment_expression )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==31) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// myCompiler.g:862:52: ',' assignment_expression
					{
					match(input,31,FOLLOW_31_in_expression1820); if (state.failed) return retval;
					pushFollow(FOLLOW_assignment_expression_in_expression1822);
					assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop57;
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
			if ( state.backtracking>0 ) { memoize(input, 44, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"



	// $ANTLR start "constant_expression"
	// myCompiler.g:866:1: constant_expression returns [Symbol symb] : conditional_expression ;
	public final Symbol constant_expression() throws RecognitionException {
		Symbol symb = null;

		int constant_expression_StartIndex = input.index();

		Symbol conditional_expression27 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return symb; }

			// myCompiler.g:867:2: ( conditional_expression )
			// myCompiler.g:867:4: conditional_expression
			{
			pushFollow(FOLLOW_conditional_expression_in_constant_expression1841);
			conditional_expression27=conditional_expression();
			state._fsp--;
			if (state.failed) return symb;
			if ( state.backtracking==0 ) { symb = conditional_expression27; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, constant_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "constant_expression"



	// $ANTLR start "assignment_expression"
	// myCompiler.g:871:1: assignment_expression returns [Symbol symb] : ( lvalue assignment_operator asgn2= assignment_expression | conditional_expression );
	public final Symbol assignment_expression() throws RecognitionException {
		Symbol symb = null;

		int assignment_expression_StartIndex = input.index();

		Symbol asgn2 =null;
		ParserRuleReturnScope lvalue28 =null;
		Symbol conditional_expression29 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return symb; }

			// myCompiler.g:872:2: ( lvalue assignment_operator asgn2= assignment_expression | conditional_expression )
			int alt58=2;
			alt58 = dfa58.predict(input);
			switch (alt58) {
				case 1 :
					// myCompiler.g:872:4: lvalue assignment_operator asgn2= assignment_expression
					{
					pushFollow(FOLLOW_lvalue_in_assignment_expression1859);
					lvalue28=lvalue();
					state._fsp--;
					if (state.failed) return symb;
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1861);
					assignment_operator();
					state._fsp--;
					if (state.failed) return symb;
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1865);
					asgn2=assignment_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) { 	
								if((lvalue28!=null?((myCompilerParser.lvalue_return)lvalue28).symb:null) != null) {
									//TODO: op
									symb = asgn2;
									String identifier = symbolTable.get((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null)).identifier;
									if(symb.isConstant) {		
										mainCode.add(genStoreCode("i32", symb.value, identifier, symbolTable.get((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null)).offset));
										symb.isStored = true;
										symb.isConstant = false;
										symb.identifier = identifier;
										symb.offset = symbolTable.get((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null)).offset;
										symbolTable.put((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null), symb);
									} else {
										if(symb.isStored) {
											symb = new Symbol();
											mainCode.add(genLoadCode("%t", symb.offset, "i32", asgn2.identifier, asgn2.offset));
											mainCode.add(genStoreCode("i32", "%t", symb.offset, identifier, symbolTable.get((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null)).offset));
										} else {
											mainCode.add(genStoreCode("i32", "%t", symb.offset, identifier, symbolTable.get((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null)).offset));
										}
										symb.isStored = true;
										symb.isConstant = false;
										symb.identifier = identifier;
										symb.offset = symbolTable.get((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null)).offset;
										symbolTable.put((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null), symb);
									}
								}
							}
					}
					break;
				case 2 :
					// myCompiler.g:901:4: conditional_expression
					{
					pushFollow(FOLLOW_conditional_expression_in_assignment_expression1876);
					conditional_expression29=conditional_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) { symb = conditional_expression29; }
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
			if ( state.backtracking>0 ) { memoize(input, 46, assignment_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "assignment_expression"


	public static class lvalue_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "lvalue"
	// myCompiler.g:905:1: lvalue returns [Symbol symb] : unary_expression ;
	public final myCompilerParser.lvalue_return lvalue() throws RecognitionException {
		myCompilerParser.lvalue_return retval = new myCompilerParser.lvalue_return();
		retval.start = input.LT(1);
		int lvalue_StartIndex = input.index();

		Symbol unary_expression30 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// myCompiler.g:906:2: ( unary_expression )
			// myCompiler.g:906:4: unary_expression
			{
			pushFollow(FOLLOW_unary_expression_in_lvalue1894);
			unary_expression30=unary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.symb = unary_expression30; }
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, lvalue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "lvalue"



	// $ANTLR start "assignment_operator"
	// myCompiler.g:909:1: assignment_operator returns [String op] : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final String assignment_operator() throws RecognitionException {
		String op = null;

		int assignment_operator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return op; }

			// myCompiler.g:910:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			int alt59=11;
			switch ( input.LA(1) ) {
			case 46:
				{
				alt59=1;
				}
				break;
			case 27:
				{
				alt59=2;
				}
				break;
			case 39:
				{
				alt59=3;
				}
				break;
			case 20:
				{
				alt59=4;
				}
				break;
			case 30:
				{
				alt59=5;
				}
				break;
			case 34:
				{
				alt59=6;
				}
				break;
			case 44:
				{
				alt59=7;
				}
				break;
			case 51:
				{
				alt59=8;
				}
				break;
			case 23:
				{
				alt59=9;
				}
				break;
			case 56:
				{
				alt59=10;
				}
				break;
			case 92:
				{
				alt59=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// myCompiler.g:910:4: '='
					{
					match(input,46,FOLLOW_46_in_assignment_operator1911); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "="; }
					}
					break;
				case 2 :
					// myCompiler.g:911:4: '*='
					{
					match(input,27,FOLLOW_27_in_assignment_operator1918); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "*="; }
					}
					break;
				case 3 :
					// myCompiler.g:912:4: '/='
					{
					match(input,39,FOLLOW_39_in_assignment_operator1925); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "/="; }
					}
					break;
				case 4 :
					// myCompiler.g:913:4: '%='
					{
					match(input,20,FOLLOW_20_in_assignment_operator1932); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "%="; }
					}
					break;
				case 5 :
					// myCompiler.g:914:4: '+='
					{
					match(input,30,FOLLOW_30_in_assignment_operator1939); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "+="; }
					}
					break;
				case 6 :
					// myCompiler.g:915:4: '-='
					{
					match(input,34,FOLLOW_34_in_assignment_operator1946); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "-="; }
					}
					break;
				case 7 :
					// myCompiler.g:916:4: '<<='
					{
					match(input,44,FOLLOW_44_in_assignment_operator1953); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "<<="; }
					}
					break;
				case 8 :
					// myCompiler.g:917:4: '>>='
					{
					match(input,51,FOLLOW_51_in_assignment_operator1960); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = ">>="; }
					}
					break;
				case 9 :
					// myCompiler.g:918:4: '&='
					{
					match(input,23,FOLLOW_23_in_assignment_operator1967); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "&="; }
					}
					break;
				case 10 :
					// myCompiler.g:919:4: '^='
					{
					match(input,56,FOLLOW_56_in_assignment_operator1974); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "^="; }
					}
					break;
				case 11 :
					// myCompiler.g:920:4: '|='
					{
					match(input,92,FOLLOW_92_in_assignment_operator1981); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = "|="; }
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
			if ( state.backtracking>0 ) { memoize(input, 48, assignment_operator_StartIndex); }

		}
		return op;
	}
	// $ANTLR end "assignment_operator"



	// $ANTLR start "conditional_expression"
	// myCompiler.g:925:1: conditional_expression returns [Symbol symb] : logical_or_expression ( '?' expression ':' conditional_expression )? ;
	public final Symbol conditional_expression() throws RecognitionException {
		Symbol symb = null;

		int conditional_expression_StartIndex = input.index();

		Symbol logical_or_expression31 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return symb; }

			// myCompiler.g:926:2: ( logical_or_expression ( '?' expression ':' conditional_expression )? )
			// myCompiler.g:926:4: logical_or_expression ( '?' expression ':' conditional_expression )?
			{
			pushFollow(FOLLOW_logical_or_expression_in_conditional_expression2005);
			logical_or_expression31=logical_or_expression();
			state._fsp--;
			if (state.failed) return symb;
			if ( state.backtracking==0 ) { symb = logical_or_expression31; }
			// myCompiler.g:926:67: ( '?' expression ':' conditional_expression )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==52) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// myCompiler.g:926:68: '?' expression ':' conditional_expression
					{
					match(input,52,FOLLOW_52_in_conditional_expression2010); if (state.failed) return symb;
					pushFollow(FOLLOW_expression_in_conditional_expression2012);
					expression();
					state._fsp--;
					if (state.failed) return symb;
					match(input,40,FOLLOW_40_in_conditional_expression2014); if (state.failed) return symb;
					pushFollow(FOLLOW_conditional_expression_in_conditional_expression2016);
					conditional_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, conditional_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "conditional_expression"



	// $ANTLR start "logical_or_expression"
	// myCompiler.g:929:1: logical_or_expression returns [Symbol symb] : l1= logical_and_expression ( '||' logical_and_expression )* ;
	public final Symbol logical_or_expression() throws RecognitionException {
		Symbol symb = null;

		int logical_or_expression_StartIndex = input.index();

		Symbol l1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return symb; }

			// myCompiler.g:930:2: (l1= logical_and_expression ( '||' logical_and_expression )* )
			// myCompiler.g:930:4: l1= logical_and_expression ( '||' logical_and_expression )*
			{
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2035);
			l1=logical_and_expression();
			state._fsp--;
			if (state.failed) return symb;
			// myCompiler.g:930:30: ( '||' logical_and_expression )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==93) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// myCompiler.g:930:31: '||' logical_and_expression
					{
					match(input,93,FOLLOW_93_in_logical_or_expression2038); if (state.failed) return symb;
					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2040);
					logical_and_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop61;
				}
			}

			if ( state.backtracking==0 ) { symb = l1; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, logical_or_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "logical_or_expression"



	// $ANTLR start "logical_and_expression"
	// myCompiler.g:933:1: logical_and_expression returns [Symbol symb] : l1= inclusive_or_expression ( '&&' inclusive_or_expression )* ;
	public final Symbol logical_and_expression() throws RecognitionException {
		Symbol symb = null;

		int logical_and_expression_StartIndex = input.index();

		Symbol l1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return symb; }

			// myCompiler.g:934:2: (l1= inclusive_or_expression ( '&&' inclusive_or_expression )* )
			// myCompiler.g:934:4: l1= inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression2061);
			l1=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return symb;
			// myCompiler.g:934:31: ( '&&' inclusive_or_expression )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==21) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// myCompiler.g:934:32: '&&' inclusive_or_expression
					{
					match(input,21,FOLLOW_21_in_logical_and_expression2064); if (state.failed) return symb;
					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression2066);
					inclusive_or_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop62;
				}
			}

			if ( state.backtracking==0 ) { symb = l1; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, logical_and_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "logical_and_expression"



	// $ANTLR start "inclusive_or_expression"
	// myCompiler.g:937:1: inclusive_or_expression returns [Symbol symb] : e1= exclusive_or_expression ( '|' exclusive_or_expression )* ;
	public final Symbol inclusive_or_expression() throws RecognitionException {
		Symbol symb = null;

		int inclusive_or_expression_StartIndex = input.index();

		Symbol e1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return symb; }

			// myCompiler.g:938:2: (e1= exclusive_or_expression ( '|' exclusive_or_expression )* )
			// myCompiler.g:938:4: e1= exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression2087);
			e1=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return symb;
			// myCompiler.g:938:31: ( '|' exclusive_or_expression )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==91) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// myCompiler.g:938:32: '|' exclusive_or_expression
					{
					match(input,91,FOLLOW_91_in_inclusive_or_expression2090); if (state.failed) return symb;
					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression2092);
					exclusive_or_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop63;
				}
			}

			if ( state.backtracking==0 ) { symb = e1; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, inclusive_or_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "inclusive_or_expression"



	// $ANTLR start "exclusive_or_expression"
	// myCompiler.g:941:1: exclusive_or_expression returns [Symbol symb] : a1= and_expression ( '^' and_expression )* ;
	public final Symbol exclusive_or_expression() throws RecognitionException {
		Symbol symb = null;

		int exclusive_or_expression_StartIndex = input.index();

		Symbol a1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return symb; }

			// myCompiler.g:942:2: (a1= and_expression ( '^' and_expression )* )
			// myCompiler.g:942:4: a1= and_expression ( '^' and_expression )*
			{
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression2113);
			a1=and_expression();
			state._fsp--;
			if (state.failed) return symb;
			// myCompiler.g:942:22: ( '^' and_expression )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==55) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// myCompiler.g:942:23: '^' and_expression
					{
					match(input,55,FOLLOW_55_in_exclusive_or_expression2116); if (state.failed) return symb;
					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression2118);
					and_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop64;
				}
			}

			if ( state.backtracking==0 ) { symb = a1; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, exclusive_or_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "exclusive_or_expression"



	// $ANTLR start "and_expression"
	// myCompiler.g:945:1: and_expression returns [Symbol symb] : e1= equality_expression ( '&' equality_expression )* ;
	public final Symbol and_expression() throws RecognitionException {
		Symbol symb = null;

		int and_expression_StartIndex = input.index();

		Symbol e1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return symb; }

			// myCompiler.g:946:2: (e1= equality_expression ( '&' equality_expression )* )
			// myCompiler.g:946:4: e1= equality_expression ( '&' equality_expression )*
			{
			pushFollow(FOLLOW_equality_expression_in_and_expression2139);
			e1=equality_expression();
			state._fsp--;
			if (state.failed) return symb;
			// myCompiler.g:946:27: ( '&' equality_expression )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==22) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// myCompiler.g:946:28: '&' equality_expression
					{
					match(input,22,FOLLOW_22_in_and_expression2142); if (state.failed) return symb;
					pushFollow(FOLLOW_equality_expression_in_and_expression2144);
					equality_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop65;
				}
			}

			if ( state.backtracking==0 ) { symb = e1; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, and_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "and_expression"



	// $ANTLR start "equality_expression"
	// myCompiler.g:948:1: equality_expression returns [Symbol symb] : rlt1= relational_expression ( ( '==' | '!=' ) rlt2= relational_expression )* ;
	public final Symbol equality_expression() throws RecognitionException {
		Symbol symb = null;

		int equality_expression_StartIndex = input.index();

		ParserRuleReturnScope rlt1 =null;
		ParserRuleReturnScope rlt2 =null;

		 String op = null; String irOp = null; int line = -1; 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return symb; }

			// myCompiler.g:950:2: (rlt1= relational_expression ( ( '==' | '!=' ) rlt2= relational_expression )* )
			// myCompiler.g:950:4: rlt1= relational_expression ( ( '==' | '!=' ) rlt2= relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression2169);
			rlt1=relational_expression();
			state._fsp--;
			if (state.failed) return symb;
			if ( state.backtracking==0 ) { symb = (rlt1!=null?((myCompilerParser.relational_expression_return)rlt1).symb:null); line = (rlt1!=null?(rlt1.start):null).getLine(); }
			// myCompiler.g:951:2: ( ( '==' | '!=' ) rlt2= relational_expression )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==18||LA67_0==47) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// myCompiler.g:951:3: ( '==' | '!=' ) rlt2= relational_expression
					{
					// myCompiler.g:951:3: ( '==' | '!=' )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==47) ) {
						alt66=1;
					}
					else if ( (LA66_0==18) ) {
						alt66=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return symb;}
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// myCompiler.g:951:4: '=='
							{
							match(input,47,FOLLOW_47_in_equality_expression2176); if (state.failed) return symb;
							if ( state.backtracking==0 ) { op = "=="; irOp = "eq"; }
							}
							break;
						case 2 :
							// myCompiler.g:952:3: '!='
							{
							match(input,18,FOLLOW_18_in_equality_expression2182); if (state.failed) return symb;
							if ( state.backtracking==0 ) { op = "!="; irOp = "ne"; }
							}
							break;

					}

					pushFollow(FOLLOW_relational_expression_in_equality_expression2191);
					rlt2=relational_expression();
					state._fsp--;
					if (state.failed) return symb;
					if ( state.backtracking==0 ) { symb = genRelationalCode(symb, (rlt2!=null?((myCompilerParser.relational_expression_return)rlt2).symb:null), op, irOp, line); }
					}
					break;

				default :
					break loop67;
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
			if ( state.backtracking>0 ) { memoize(input, 55, equality_expression_StartIndex); }

		}
		return symb;
	}
	// $ANTLR end "equality_expression"


	public static class relational_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "relational_expression"
	// myCompiler.g:958:1: relational_expression returns [Symbol symb] : shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )* ;
	public final myCompilerParser.relational_expression_return relational_expression() throws RecognitionException {
		myCompilerParser.relational_expression_return retval = new myCompilerParser.relational_expression_return();
		retval.start = input.LT(1);
		int relational_expression_StartIndex = input.index();

		ParserRuleReturnScope shift1 =null;
		ParserRuleReturnScope shift2 =null;

		 String op = null; String irOp = null; int line = -1; 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// myCompiler.g:960:2: (shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )* )
			// myCompiler.g:960:4: shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )*
			{
			pushFollow(FOLLOW_shift_expression_in_relational_expression2220);
			shift1=shift_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.symb = (shift1!=null?((myCompilerParser.shift_expression_return)shift1).symb:null); line = (shift1!=null?(shift1.start):null).getLine(); }
			// myCompiler.g:961:2: ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==42||LA69_0==45||(LA69_0 >= 48 && LA69_0 <= 49)) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// myCompiler.g:961:3: ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression
					{
					// myCompiler.g:961:3: ( '<' | '>' | '<=' | '>=' )
					int alt68=4;
					switch ( input.LA(1) ) {
					case 42:
						{
						alt68=1;
						}
						break;
					case 48:
						{
						alt68=2;
						}
						break;
					case 45:
						{
						alt68=3;
						}
						break;
					case 49:
						{
						alt68=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 68, 0, input);
						throw nvae;
					}
					switch (alt68) {
						case 1 :
							// myCompiler.g:961:4: '<'
							{
							match(input,42,FOLLOW_42_in_relational_expression2227); if (state.failed) return retval;
							if ( state.backtracking==0 ) { op = "<"; irOp = "slt"; }
							}
							break;
						case 2 :
							// myCompiler.g:962:3: '>'
							{
							match(input,48,FOLLOW_48_in_relational_expression2233); if (state.failed) return retval;
							if ( state.backtracking==0 ) { op = ">"; irOp = "sgt"; }
							}
							break;
						case 3 :
							// myCompiler.g:963:3: '<='
							{
							match(input,45,FOLLOW_45_in_relational_expression2239); if (state.failed) return retval;
							if ( state.backtracking==0 ) { op = "<="; irOp = "sle"; }
							}
							break;
						case 4 :
							// myCompiler.g:964:3: '>='
							{
							match(input,49,FOLLOW_49_in_relational_expression2245); if (state.failed) return retval;
							if ( state.backtracking==0 ) { op = ">="; irOp = "sge"; }
							}
							break;

					}

					pushFollow(FOLLOW_shift_expression_in_relational_expression2254);
					shift2=shift_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.symb = genRelationalCode(retval.symb, (shift2!=null?((myCompilerParser.shift_expression_return)shift2).symb:null), op, irOp, line); }
					}
					break;

				default :
					break loop69;
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
			if ( state.backtracking>0 ) { memoize(input, 56, relational_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relational_expression"


	public static class shift_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "shift_expression"
	// myCompiler.g:971:1: shift_expression returns [Symbol symb] : additive1= additive_expression ( ( '<<' | '>>' ) additive2= additive_expression )* ;
	public final myCompilerParser.shift_expression_return shift_expression() throws RecognitionException {
		myCompilerParser.shift_expression_return retval = new myCompilerParser.shift_expression_return();
		retval.start = input.LT(1);
		int shift_expression_StartIndex = input.index();

		ParserRuleReturnScope additive1 =null;
		ParserRuleReturnScope additive2 =null;

		 String op = null;
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// myCompiler.g:973:2: (additive1= additive_expression ( ( '<<' | '>>' ) additive2= additive_expression )* )
			// myCompiler.g:973:4: additive1= additive_expression ( ( '<<' | '>>' ) additive2= additive_expression )*
			{
			pushFollow(FOLLOW_additive_expression_in_shift_expression2284);
			additive1=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.symb = (additive1!=null?((myCompilerParser.additive_expression_return)additive1).symb:null); }
			// myCompiler.g:974:2: ( ( '<<' | '>>' ) additive2= additive_expression )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==43||LA71_0==50) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// myCompiler.g:974:3: ( '<<' | '>>' ) additive2= additive_expression
					{
					// myCompiler.g:974:3: ( '<<' | '>>' )
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==43) ) {
						alt70=1;
					}
					else if ( (LA70_0==50) ) {
						alt70=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 70, 0, input);
						throw nvae;
					}

					switch (alt70) {
						case 1 :
							// myCompiler.g:974:4: '<<'
							{
							match(input,43,FOLLOW_43_in_shift_expression2291); if (state.failed) return retval;
							if ( state.backtracking==0 ) { op = "<<"; }
							}
							break;
						case 2 :
							// myCompiler.g:975:3: '>>'
							{
							match(input,50,FOLLOW_50_in_shift_expression2297); if (state.failed) return retval;
							if ( state.backtracking==0 ) { op = ">>"; }
							}
							break;

					}

					pushFollow(FOLLOW_additive_expression_in_shift_expression2308);
					additive2=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {	
								if(!(additive1!=null?((myCompilerParser.additive_expression_return)additive1).symb:null).type.isDecimal() || !(additive1!=null?((myCompilerParser.additive_expression_return)additive1).symb:null).type.isDecimal()
									|| !(additive2!=null?((myCompilerParser.additive_expression_return)additive2).symb:null).type.isDecimal() || !(additive2!=null?((myCompilerParser.additive_expression_return)additive2).symb:null).type.isDecimal())
									System.err.println(String.format(";error: invalid operands to binary %s at line %d", op, (additive1!=null?(additive1.start):null).getLine()));
								else {
									Long count = Long.parseLong((additive2!=null?((myCompilerParser.additive_expression_return)additive2).symb:null).value);
									Long tmp = Long.parseLong((additive1!=null?((myCompilerParser.additive_expression_return)additive1).symb:null).value);
									if(op.equals("<<")) {
										for(Long i = 0L; i < count; i++)
											tmp /= 2;
									} else {
										for(Long i = 0L; i < count; i++)
											tmp *= 2;
									}
									(additive1!=null?((myCompilerParser.additive_expression_return)additive1).symb:null).value = String.valueOf(tmp);
									System.out.println("shifttest: " + (additive1!=null?((myCompilerParser.additive_expression_return)additive1).symb:null).value);
								}	
							}
					}
					break;

				default :
					break loop71;
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
			if ( state.backtracking>0 ) { memoize(input, 57, shift_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "shift_expression"



	// $ANTLR start "statement"
	// myCompiler.g:1002:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// myCompiler.g:1003:2: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement )
			int alt72=6;
			alt72 = dfa72.predict(input);
			switch (alt72) {
				case 1 :
					// myCompiler.g:1003:4: labeled_statement
					{
					pushFollow(FOLLOW_labeled_statement_in_statement2335);
					labeled_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:1004:4: compound_statement
					{
					pushFollow(FOLLOW_compound_statement_in_statement2340);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:1005:4: expression_statement
					{
					pushFollow(FOLLOW_expression_statement_in_statement2345);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myCompiler.g:1006:4: selection_statement
					{
					pushFollow(FOLLOW_selection_statement_in_statement2350);
					selection_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myCompiler.g:1007:4: iteration_statement
					{
					pushFollow(FOLLOW_iteration_statement_in_statement2355);
					iteration_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myCompiler.g:1008:4: jump_statement
					{
					pushFollow(FOLLOW_jump_statement_in_statement2360);
					jump_statement();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 58, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "labeled_statement"
	// myCompiler.g:1011:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );
	public final void labeled_statement() throws RecognitionException {
		int labeled_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// myCompiler.g:1012:2: ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement )
			int alt73=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt73=1;
				}
				break;
			case 60:
				{
				alt73=2;
				}
				break;
			case 64:
				{
				alt73=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// myCompiler.g:1012:4: IDENTIFIER ':' statement
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_labeled_statement2371); if (state.failed) return;
					match(input,40,FOLLOW_40_in_labeled_statement2373); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement2375);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:1013:4: 'case' constant_expression ':' statement
					{
					match(input,60,FOLLOW_60_in_labeled_statement2380); if (state.failed) return;
					pushFollow(FOLLOW_constant_expression_in_labeled_statement2382);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,40,FOLLOW_40_in_labeled_statement2384); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement2386);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:1014:4: 'default' ':' statement
					{
					match(input,64,FOLLOW_64_in_labeled_statement2391); if (state.failed) return;
					match(input,40,FOLLOW_40_in_labeled_statement2393); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement2395);
					statement();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 59, labeled_statement_StartIndex); }

		}
	}
	// $ANTLR end "labeled_statement"



	// $ANTLR start "compound_statement"
	// myCompiler.g:1018:1: compound_statement : '{' ( declaration )* ( statement_list )? '}' ;
	public final void compound_statement() throws RecognitionException {
		int compound_statement_StartIndex = input.index();

		ParserRuleReturnScope declaration32 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// myCompiler.g:1023:2: ( '{' ( declaration )* ( statement_list )? '}' )
			// myCompiler.g:1023:4: '{' ( declaration )* ( statement_list )? '}'
			{
			match(input,90,FOLLOW_90_in_compound_statement2411); if (state.failed) return;
			// myCompiler.g:1023:8: ( declaration )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( ((LA74_0 >= 57 && LA74_0 <= 58)||(LA74_0 >= 61 && LA74_0 <= 62)||LA74_0==66||(LA74_0 >= 68 && LA74_0 <= 70)||(LA74_0 >= 74 && LA74_0 <= 76)||(LA74_0 >= 78 && LA74_0 <= 79)||(LA74_0 >= 81 && LA74_0 <= 82)||(LA74_0 >= 84 && LA74_0 <= 88)) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// myCompiler.g:1023:9: declaration
					{
					pushFollow(FOLLOW_declaration_in_compound_statement2414);
					declaration32=declaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {	
									List<Declarator> declarators = (declaration32!=null?((myCompilerParser.declaration_return)declaration32).declarators:null);
									List<Symbol> symbols = (declaration32!=null?((myCompilerParser.declaration_return)declaration32).symbols:null);
									for(int i = 0; i < declarators.size(); i++) {
										Declarator declarator = declarators.get(i);
										Symbol symbol = symbols.get(i);

										if(declarator == null)
											continue;
										if(symbolTable.containsKey(declarator.id)) {
											System.err.println(String.format(";error: redeclaration of '%s' at line %d", declarator.id, (declaration32!=null?(declaration32.start):null).getLine()));
										} else {
											if(symbol == null) {
												symbol = new Symbol();
												symbolTable.put(declarator.id, symbol);
												mainCode.add(String.format("%%t%d = alloca %s, align 4", symbol.offset, "i32"));
											} else if(symbol.isConstant) {
												symbol.isConstant = false; // this symbol is no longer a constant
												symbol.isStored = true;
												symbolTable.put(declarator.id, symbol);
												mainCode.add(String.format("%%t%d = alloca %s, align 4", symbol.offset, "i32"));
												mainCode.add(genStoreCode("i32", symbol.value, "%t", symbol.offset));
											} else { // declared variable
												int srcOffset = symbol.offset;
												String srcIdentifier = symbol.identifier;
												boolean isSrcStored = symbol.isStored;
												

												Type srcType = symbol.type;
												symbol = new Symbol();
												int destOffset = symbol.offset;
												mainCode.add(String.format("%%t%d = alloca %s, align 4", destOffset, "i32"));

												if(isSrcStored) {
													symbol = new Symbol();
													mainCode.add(genLoadCode("%t", symbol.offset, "i32", srcIdentifier, srcOffset));
													mainCode.add(genStoreCode("i32", "%t", symbol.offset, "%t", destOffset));
												} else {
													mainCode.add(genStoreCode("i32", srcIdentifier, srcOffset, "%t", destOffset));
												}
												
												symbol.type = srcType;
												symbol.isStored = true;
												symbol.offset = destOffset;
												symbolTable.put(declarator.id, symbol);
											}
										}
									}
								}
					}
					break;

				default :
					break loop74;
				}
			}

			// myCompiler.g:1074:3: ( statement_list )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==CHARACTER_LITERAL||LA75_0==DECIMAL_LITERAL||LA75_0==FLOATING_POINT_LITERAL||LA75_0==IDENTIFIER||LA75_0==STRING_LITERAL||LA75_0==17||LA75_0==22||LA75_0==24||LA75_0==26||(LA75_0 >= 28 && LA75_0 <= 29)||(LA75_0 >= 32 && LA75_0 <= 33)||LA75_0==41||(LA75_0 >= 59 && LA75_0 <= 60)||(LA75_0 >= 63 && LA75_0 <= 65)||(LA75_0 >= 71 && LA75_0 <= 73)||LA75_0==77||LA75_0==80||LA75_0==83||(LA75_0 >= 89 && LA75_0 <= 90)||LA75_0==95) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// myCompiler.g:1074:3: statement_list
					{
					pushFollow(FOLLOW_statement_list_in_compound_statement2429);
					statement_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,94,FOLLOW_94_in_compound_statement2434); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, compound_statement_StartIndex); }

		}
	}
	// $ANTLR end "compound_statement"



	// $ANTLR start "statement_list"
	// myCompiler.g:1079:1: statement_list : ( statement )+ ;
	public final void statement_list() throws RecognitionException {
		int statement_list_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// myCompiler.g:1080:2: ( ( statement )+ )
			// myCompiler.g:1080:4: ( statement )+
			{
			// myCompiler.g:1080:4: ( statement )+
			int cnt76=0;
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==CHARACTER_LITERAL||LA76_0==DECIMAL_LITERAL||LA76_0==FLOATING_POINT_LITERAL||LA76_0==IDENTIFIER||LA76_0==STRING_LITERAL||LA76_0==17||LA76_0==22||LA76_0==24||LA76_0==26||(LA76_0 >= 28 && LA76_0 <= 29)||(LA76_0 >= 32 && LA76_0 <= 33)||LA76_0==41||(LA76_0 >= 59 && LA76_0 <= 60)||(LA76_0 >= 63 && LA76_0 <= 65)||(LA76_0 >= 71 && LA76_0 <= 73)||LA76_0==77||LA76_0==80||LA76_0==83||(LA76_0 >= 89 && LA76_0 <= 90)||LA76_0==95) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// myCompiler.g:1080:4: statement
					{
					pushFollow(FOLLOW_statement_in_statement_list2446);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt76 >= 1 ) break loop76;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(76, input);
					throw eee;
				}
				cnt76++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, statement_list_StartIndex); }

		}
	}
	// $ANTLR end "statement_list"



	// $ANTLR start "expression_statement"
	// myCompiler.g:1084:1: expression_statement : ( ';' | expression ';' );
	public final void expression_statement() throws RecognitionException {
		int expression_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return; }

			// myCompiler.g:1085:2: ( ';' | expression ';' )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==41) ) {
				alt77=1;
			}
			else if ( (LA77_0==CHARACTER_LITERAL||LA77_0==DECIMAL_LITERAL||LA77_0==FLOATING_POINT_LITERAL||LA77_0==IDENTIFIER||LA77_0==STRING_LITERAL||LA77_0==17||LA77_0==22||LA77_0==24||LA77_0==26||(LA77_0 >= 28 && LA77_0 <= 29)||(LA77_0 >= 32 && LA77_0 <= 33)||LA77_0==80||LA77_0==95) ) {
				alt77=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// myCompiler.g:1085:4: ';'
					{
					match(input,41,FOLLOW_41_in_expression_statement2459); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:1086:4: expression ';'
					{
					pushFollow(FOLLOW_expression_in_expression_statement2464);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,41,FOLLOW_41_in_expression_statement2466); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 62, expression_statement_StartIndex); }

		}
	}
	// $ANTLR end "expression_statement"



	// $ANTLR start "selection_statement"
	// myCompiler.g:1090:1: selection_statement : ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement );
	public final void selection_statement() throws RecognitionException {
		int selection_statement_StartIndex = input.index();

		ParserRuleReturnScope expression33 =null;

		 
				Symbol cond = new Symbol();
				Symbol label1 = new Symbol();
				Symbol label2 = new Symbol();
				Symbol label3 = new Symbol();
				boolean isElse = false; 
				int index = -1; 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return; }

			// myCompiler.g:1098:2: ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==73) ) {
				alt79=1;
			}
			else if ( (LA79_0==83) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// myCompiler.g:1098:4: 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )?
					{
					match(input,73,FOLLOW_73_in_selection_statement2483); if (state.failed) return;
					match(input,24,FOLLOW_24_in_selection_statement2485); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selection_statement2487);
					expression33=expression();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_selection_statement2489); if (state.failed) return;
					if ( state.backtracking==0 ) {	
								mainCode.add(String.format("%%t%d = trunc i32 %%t%d to i1", cond.offset, (expression33!=null?((myCompilerParser.expression_return)expression33).symb:null).offset));

								mainCode.add(String.format("br i1 %%t%d, label %%t%d, label %%t%d", cond.offset, label1.offset, label2.offset));
								index = mainCode.size() - 1; // current index
								mainCode.add(String.format("t%d:", label1.offset));
							}
					pushFollow(FOLLOW_statement_in_selection_statement2498);
					statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { mainCode.add(String.format("br label %%t%d", label3.offset)); }
					// myCompiler.g:1108:2: ( options {k=1; backtrack=false; } : 'else' statement )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==67) ) {
						int LA78_1 = input.LA(2);
						if ( (true) ) {
							alt78=1;
						}
					}
					switch (alt78) {
						case 1 :
							// myCompiler.g:1108:35: 'else' statement
							{
							match(input,67,FOLLOW_67_in_selection_statement2519); if (state.failed) return;
							if ( state.backtracking==0 ) { mainCode.add(String.format("t%d:", label2.offset)); isElse = true; }
							pushFollow(FOLLOW_statement_in_selection_statement2527);
							statement();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { mainCode.add(String.format("br label %%t%d", label3.offset)); }
							}
							break;

					}

					if ( state.backtracking==0 ) { 	
								//for(String i : mainCode)
								// 	System.out.println(i);
								// System.out.println("");

								if(!isElse)
									mainCode.set(index, String.format("br i1 %%t%d, label %%t%d, label %%t%d", cond.offset, label1.offset, label3.offset));
								
								mainCode.add(String.format("t%d:", label3.offset));
							}
					}
					break;
				case 2 :
					// myCompiler.g:1124:4: 'switch' '(' expression ')' statement
					{
					match(input,83,FOLLOW_83_in_selection_statement2547); if (state.failed) return;
					match(input,24,FOLLOW_24_in_selection_statement2549); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selection_statement2551);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_selection_statement2553); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_selection_statement2555);
					statement();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 63, selection_statement_StartIndex); }

		}
	}
	// $ANTLR end "selection_statement"



	// $ANTLR start "iteration_statement"
	// myCompiler.g:1128:1: iteration_statement : ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement );
	public final void iteration_statement() throws RecognitionException {
		int iteration_statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// myCompiler.g:1129:2: ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement )
			int alt81=3;
			switch ( input.LA(1) ) {
			case 89:
				{
				alt81=1;
				}
				break;
			case 65:
				{
				alt81=2;
				}
				break;
			case 71:
				{
				alt81=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// myCompiler.g:1129:4: 'while' '(' expression ')' statement
					{
					match(input,89,FOLLOW_89_in_iteration_statement2567); if (state.failed) return;
					match(input,24,FOLLOW_24_in_iteration_statement2569); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_iteration_statement2571);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_iteration_statement2573); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_iteration_statement2575);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:1130:4: 'do' statement 'while' '(' expression ')' ';'
					{
					match(input,65,FOLLOW_65_in_iteration_statement2580); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_iteration_statement2582);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input,89,FOLLOW_89_in_iteration_statement2584); if (state.failed) return;
					match(input,24,FOLLOW_24_in_iteration_statement2586); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_iteration_statement2588);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,25,FOLLOW_25_in_iteration_statement2590); if (state.failed) return;
					match(input,41,FOLLOW_41_in_iteration_statement2592); if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:1131:4: 'for' '(' expression_statement expression_statement ( expression )? ')' statement
					{
					match(input,71,FOLLOW_71_in_iteration_statement2597); if (state.failed) return;
					match(input,24,FOLLOW_24_in_iteration_statement2599); if (state.failed) return;
					pushFollow(FOLLOW_expression_statement_in_iteration_statement2601);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expression_statement_in_iteration_statement2603);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					// myCompiler.g:1131:56: ( expression )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==CHARACTER_LITERAL||LA80_0==DECIMAL_LITERAL||LA80_0==FLOATING_POINT_LITERAL||LA80_0==IDENTIFIER||LA80_0==STRING_LITERAL||LA80_0==17||LA80_0==22||LA80_0==24||LA80_0==26||(LA80_0 >= 28 && LA80_0 <= 29)||(LA80_0 >= 32 && LA80_0 <= 33)||LA80_0==80||LA80_0==95) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// myCompiler.g:1131:56: expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement2605);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,25,FOLLOW_25_in_iteration_statement2608); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_iteration_statement2610);
					statement();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 64, iteration_statement_StartIndex); }

		}
	}
	// $ANTLR end "iteration_statement"



	// $ANTLR start "jump_statement"
	// myCompiler.g:1135:1: jump_statement : ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );
	public final void jump_statement() throws RecognitionException {
		int jump_statement_StartIndex = input.index();

		ParserRuleReturnScope expression34 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// myCompiler.g:1136:2: ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' )
			int alt82=5;
			switch ( input.LA(1) ) {
			case 72:
				{
				alt82=1;
				}
				break;
			case 63:
				{
				alt82=2;
				}
				break;
			case 59:
				{
				alt82=3;
				}
				break;
			case 77:
				{
				int LA82_4 = input.LA(2);
				if ( (LA82_4==41) ) {
					alt82=4;
				}
				else if ( (LA82_4==CHARACTER_LITERAL||LA82_4==DECIMAL_LITERAL||LA82_4==FLOATING_POINT_LITERAL||LA82_4==IDENTIFIER||LA82_4==STRING_LITERAL||LA82_4==17||LA82_4==22||LA82_4==24||LA82_4==26||(LA82_4 >= 28 && LA82_4 <= 29)||(LA82_4 >= 32 && LA82_4 <= 33)||LA82_4==80||LA82_4==95) ) {
					alt82=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 4, input);
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
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// myCompiler.g:1136:4: 'goto' IDENTIFIER ';'
					{
					match(input,72,FOLLOW_72_in_jump_statement2622); if (state.failed) return;
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_jump_statement2624); if (state.failed) return;
					match(input,41,FOLLOW_41_in_jump_statement2626); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:1137:4: 'continue' ';'
					{
					match(input,63,FOLLOW_63_in_jump_statement2631); if (state.failed) return;
					match(input,41,FOLLOW_41_in_jump_statement2633); if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:1138:4: 'break' ';'
					{
					match(input,59,FOLLOW_59_in_jump_statement2638); if (state.failed) return;
					match(input,41,FOLLOW_41_in_jump_statement2640); if (state.failed) return;
					}
					break;
				case 4 :
					// myCompiler.g:1139:4: 'return' ';'
					{
					match(input,77,FOLLOW_77_in_jump_statement2645); if (state.failed) return;
					match(input,41,FOLLOW_41_in_jump_statement2647); if (state.failed) return;
					if ( state.backtracking==0 ) { mainCode.add("ret void"); isReturned = true; }
					}
					break;
				case 5 :
					// myCompiler.g:1140:4: 'return' expression ';'
					{
					match(input,77,FOLLOW_77_in_jump_statement2654); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_jump_statement2656);
					expression34=expression();
					state._fsp--;
					if (state.failed) return;
					match(input,41,FOLLOW_41_in_jump_statement2658); if (state.failed) return;
					if ( state.backtracking==0 ) { 	
								isReturned = true;
								if((expression34!=null?((myCompilerParser.expression_return)expression34).symb:null).isConstant == true) {
									mainCode.add("ret i32 " + (expression34!=null?((myCompilerParser.expression_return)expression34).symb:null).value);
								} else {
									Symbol symbol = new Symbol();
									mainCode.add(String.format("%%t%d = load i32, i32* %%t%d, align 4", symbol.offset, (expression34!=null?((myCompilerParser.expression_return)expression34).symb:null).offset));
									//TODO: undeclared variable
									// System.out.println("test906: " + (expression34!=null?input.toString(expression34.start,expression34.stop):null));
									mainCode.add("ret i32 " + "%t" + (localCount - 1));
								}
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
			if ( state.backtracking>0 ) { memoize(input, 65, jump_statement_StartIndex); }

		}
	}
	// $ANTLR end "jump_statement"

	// $ANTLR start synpred4_myCompiler
	public final void synpred4_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:401:4: ( ( declaration_specifiers )? declarator ( declaration )* '{' )
		// myCompiler.g:401:6: ( declaration_specifiers )? declarator ( declaration )* '{'
		{
		// myCompiler.g:401:6: ( declaration_specifiers )?
		int alt83=2;
		int LA83_0 = input.LA(1);
		if ( ((LA83_0 >= 57 && LA83_0 <= 58)||(LA83_0 >= 61 && LA83_0 <= 62)||LA83_0==66||(LA83_0 >= 68 && LA83_0 <= 70)||(LA83_0 >= 74 && LA83_0 <= 76)||(LA83_0 >= 78 && LA83_0 <= 79)||(LA83_0 >= 81 && LA83_0 <= 82)||(LA83_0 >= 85 && LA83_0 <= 88)) ) {
			alt83=1;
		}
		switch (alt83) {
			case 1 :
				// myCompiler.g:401:6: declaration_specifiers
				{
				pushFollow(FOLLOW_declaration_specifiers_in_synpred4_myCompiler100);
				declaration_specifiers();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		pushFollow(FOLLOW_declarator_in_synpred4_myCompiler103);
		declarator();
		state._fsp--;
		if (state.failed) return;
		// myCompiler.g:401:41: ( declaration )*
		loop84:
		while (true) {
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( ((LA84_0 >= 57 && LA84_0 <= 58)||(LA84_0 >= 61 && LA84_0 <= 62)||LA84_0==66||(LA84_0 >= 68 && LA84_0 <= 70)||(LA84_0 >= 74 && LA84_0 <= 76)||(LA84_0 >= 78 && LA84_0 <= 79)||(LA84_0 >= 81 && LA84_0 <= 82)||(LA84_0 >= 84 && LA84_0 <= 88)) ) {
				alt84=1;
			}

			switch (alt84) {
			case 1 :
				// myCompiler.g:401:41: declaration
				{
				pushFollow(FOLLOW_declaration_in_synpred4_myCompiler105);
				declaration();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop84;
			}
		}

		match(input,90,FOLLOW_90_in_synpred4_myCompiler108); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_myCompiler

	// $ANTLR start synpred45_myCompiler
	public final void synpred45_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:586:4: ( ( pointer )? direct_declarator )
		// myCompiler.g:586:4: ( pointer )? direct_declarator
		{
		// myCompiler.g:586:4: ( pointer )?
		int alt89=2;
		int LA89_0 = input.LA(1);
		if ( (LA89_0==26) ) {
			alt89=1;
		}
		switch (alt89) {
			case 1 :
				// myCompiler.g:586:4: pointer
				{
				pushFollow(FOLLOW_pointer_in_synpred45_myCompiler762);
				pointer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		pushFollow(FOLLOW_direct_declarator_in_synpred45_myCompiler765);
		direct_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred45_myCompiler

	// $ANTLR start synpred47_myCompiler
	public final void synpred47_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:601:7: ( declarator_suffix )
		// myCompiler.g:601:7: declarator_suffix
		{
		pushFollow(FOLLOW_declarator_suffix_in_synpred47_myCompiler836);
		declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred47_myCompiler

	// $ANTLR start synpred52_myCompiler
	public final void synpred52_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:614:8: ( type_qualifier )
		// myCompiler.g:614:8: type_qualifier
		{
		pushFollow(FOLLOW_type_qualifier_in_synpred52_myCompiler937);
		type_qualifier();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_myCompiler

	// $ANTLR start synpred53_myCompiler
	public final void synpred53_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:614:24: ( pointer )
		// myCompiler.g:614:24: pointer
		{
		pushFollow(FOLLOW_pointer_in_synpred53_myCompiler940);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred53_myCompiler

	// $ANTLR start synpred54_myCompiler
	public final void synpred54_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:614:4: ( '*' ( type_qualifier )+ ( pointer )? )
		// myCompiler.g:614:4: '*' ( type_qualifier )+ ( pointer )?
		{
		match(input,26,FOLLOW_26_in_synpred54_myCompiler935); if (state.failed) return;
		// myCompiler.g:614:8: ( type_qualifier )+
		int cnt90=0;
		loop90:
		while (true) {
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==62||LA90_0==88) ) {
				alt90=1;
			}

			switch (alt90) {
			case 1 :
				// myCompiler.g:614:8: type_qualifier
				{
				pushFollow(FOLLOW_type_qualifier_in_synpred54_myCompiler937);
				type_qualifier();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				if ( cnt90 >= 1 ) break loop90;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(90, input);
				throw eee;
			}
			cnt90++;
		}

		// myCompiler.g:614:24: ( pointer )?
		int alt91=2;
		int LA91_0 = input.LA(1);
		if ( (LA91_0==26) ) {
			alt91=1;
		}
		switch (alt91) {
			case 1 :
				// myCompiler.g:614:24: pointer
				{
				pushFollow(FOLLOW_pointer_in_synpred54_myCompiler940);
				pointer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred54_myCompiler

	// $ANTLR start synpred55_myCompiler
	public final void synpred55_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:615:4: ( '*' pointer )
		// myCompiler.g:615:4: '*' pointer
		{
		match(input,26,FOLLOW_26_in_synpred55_myCompiler946); if (state.failed) return;
		pushFollow(FOLLOW_pointer_in_synpred55_myCompiler948);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred55_myCompiler

	// $ANTLR start synpred58_myCompiler
	public final void synpred58_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:631:28: ( declarator )
		// myCompiler.g:631:28: declarator
		{
		pushFollow(FOLLOW_declarator_in_synpred58_myCompiler1006);
		declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred58_myCompiler

	// $ANTLR start synpred59_myCompiler
	public final void synpred59_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:631:39: ( abstract_declarator )
		// myCompiler.g:631:39: abstract_declarator
		{
		pushFollow(FOLLOW_abstract_declarator_in_synpred59_myCompiler1008);
		abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_myCompiler

	// $ANTLR start synpred62_myCompiler
	public final void synpred62_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:646:12: ( direct_abstract_declarator )
		// myCompiler.g:646:12: direct_abstract_declarator
		{
		pushFollow(FOLLOW_direct_abstract_declarator_in_synpred62_myCompiler1058);
		direct_abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_myCompiler

	// $ANTLR start synpred65_myCompiler
	public final void synpred65_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:652:65: ( abstract_declarator_suffix )
		// myCompiler.g:652:65: abstract_declarator_suffix
		{
		pushFollow(FOLLOW_abstract_declarator_suffix_in_synpred65_myCompiler1090);
		abstract_declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred65_myCompiler

	// $ANTLR start synpred83_myCompiler
	public final void synpred83_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:754:4: ( 'sizeof' unary_expression )
		// myCompiler.g:754:4: 'sizeof' unary_expression
		{
		match(input,80,FOLLOW_80_in_synpred83_myCompiler1447); if (state.failed) return;
		pushFollow(FOLLOW_unary_expression_in_synpred83_myCompiler1449);
		unary_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_myCompiler

	// $ANTLR start synpred102_myCompiler
	public final void synpred102_myCompiler_fragment() throws RecognitionException {
		Symbol asgn2 =null;

		// myCompiler.g:872:4: ( lvalue assignment_operator asgn2= assignment_expression )
		// myCompiler.g:872:4: lvalue assignment_operator asgn2= assignment_expression
		{
		pushFollow(FOLLOW_lvalue_in_synpred102_myCompiler1859);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_assignment_operator_in_synpred102_myCompiler1861);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_assignment_expression_in_synpred102_myCompiler1865);
		asgn2=assignment_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred102_myCompiler

	// Delegated rules

	public final boolean synpred53_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred58_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred65_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred102_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA28 dfa28 = new DFA28(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA53 dfa53 = new DFA53(this);
	protected DFA58 dfa58 = new DFA58(this);
	protected DFA72 dfa72 = new DFA72(this);
	static final String DFA28_eotS =
		"\107\uffff";
	static final String DFA28_eofS =
		"\1\1\106\uffff";
	static final String DFA28_minS =
		"\1\13\34\uffff\1\13\1\4\1\0\1\uffff\1\0\2\uffff\42\0\1\uffff";
	static final String DFA28_maxS =
		"\1\132\34\uffff\1\130\1\137\1\0\1\uffff\1\0\2\uffff\42\0\1\uffff";
	static final String DFA28_acceptS =
		"\1\uffff\1\2\104\uffff\1\1";
	static final String DFA28_specialS =
		"\37\uffff\1\0\1\uffff\1\1\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
		"\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
		"\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\uffff}>";
	static final String[] DFA28_transitionS = {
			"\1\1\14\uffff\1\35\2\1\4\uffff\1\1\10\uffff\2\1\4\uffff\1\1\6\uffff\1"+
			"\36\3\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\3\1\3\uffff\3\1\1\uffff"+
			"\2\1\1\uffff\2\1\1\uffff\5\1\1\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41\14\uffff\1\1\1\37\1\1\32\uffff\1\1\3\uffff\1\46\1\63\2\uffff\1"+
			"\51\1\64\3\uffff\1\56\1\uffff\1\62\1\44\1\55\3\uffff\1\53\1\54\1\47\1"+
			"\uffff\1\52\1\57\1\uffff\1\45\1\61\2\uffff\1\61\1\60\1\50\1\65",
			"\1\72\1\uffff\1\71\2\uffff\1\74\1\uffff\1\70\3\uffff\1\73\1\uffff\1"+
			"\104\4\uffff\1\77\1\uffff\1\67\1\uffff\1\100\1\uffff\1\101\1\75\2\uffff"+
			"\1\102\1\76\24\uffff\1\66\31\uffff\1\105\16\uffff\1\103",
			"\1\uffff",
			"",
			"\1\uffff",
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
			""
	};

	static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
	static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
	static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
	static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
	static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
	static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
	static final short[][] DFA28_transition;

	static {
		int numStates = DFA28_transitionS.length;
		DFA28_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
		}
	}

	protected class DFA28 extends DFA {

		public DFA28(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 28;
			this.eot = DFA28_eot;
			this.eof = DFA28_eof;
			this.min = DFA28_min;
			this.max = DFA28_max;
			this.accept = DFA28_accept;
			this.special = DFA28_special;
			this.transition = DFA28_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 601:7: ( declarator_suffix )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA28_31 = input.LA(1);
						 
						int index28_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_31);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA28_33 = input.LA(1);
						 
						int index28_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_33);
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA28_36 = input.LA(1);
						 
						int index28_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_36);
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA28_37 = input.LA(1);
						 
						int index28_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_37);
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA28_38 = input.LA(1);
						 
						int index28_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_38);
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA28_39 = input.LA(1);
						 
						int index28_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_39);
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA28_40 = input.LA(1);
						 
						int index28_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_40);
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA28_41 = input.LA(1);
						 
						int index28_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_41);
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA28_42 = input.LA(1);
						 
						int index28_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_42);
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA28_43 = input.LA(1);
						 
						int index28_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_43);
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA28_44 = input.LA(1);
						 
						int index28_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_44);
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA28_45 = input.LA(1);
						 
						int index28_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_45);
						if ( s>=0 ) return s;
						break;
					case 12 : 
						int LA28_46 = input.LA(1);
						 
						int index28_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_46);
						if ( s>=0 ) return s;
						break;
					case 13 : 
						int LA28_47 = input.LA(1);
						 
						int index28_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_47);
						if ( s>=0 ) return s;
						break;
					case 14 : 
						int LA28_48 = input.LA(1);
						 
						int index28_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_48);
						if ( s>=0 ) return s;
						break;
					case 15 : 
						int LA28_49 = input.LA(1);
						 
						int index28_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_49);
						if ( s>=0 ) return s;
						break;
					case 16 : 
						int LA28_50 = input.LA(1);
						 
						int index28_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_50);
						if ( s>=0 ) return s;
						break;
					case 17 : 
						int LA28_51 = input.LA(1);
						 
						int index28_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_51);
						if ( s>=0 ) return s;
						break;
					case 18 : 
						int LA28_52 = input.LA(1);
						 
						int index28_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_52);
						if ( s>=0 ) return s;
						break;
					case 19 : 
						int LA28_53 = input.LA(1);
						 
						int index28_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_53);
						if ( s>=0 ) return s;
						break;
					case 20 : 
						int LA28_54 = input.LA(1);
						 
						int index28_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_54);
						if ( s>=0 ) return s;
						break;
					case 21 : 
						int LA28_55 = input.LA(1);
						 
						int index28_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_55);
						if ( s>=0 ) return s;
						break;
					case 22 : 
						int LA28_56 = input.LA(1);
						 
						int index28_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_56);
						if ( s>=0 ) return s;
						break;
					case 23 : 
						int LA28_57 = input.LA(1);
						 
						int index28_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_57);
						if ( s>=0 ) return s;
						break;
					case 24 : 
						int LA28_58 = input.LA(1);
						 
						int index28_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_58);
						if ( s>=0 ) return s;
						break;
					case 25 : 
						int LA28_59 = input.LA(1);
						 
						int index28_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_59);
						if ( s>=0 ) return s;
						break;
					case 26 : 
						int LA28_60 = input.LA(1);
						 
						int index28_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_60);
						if ( s>=0 ) return s;
						break;
					case 27 : 
						int LA28_61 = input.LA(1);
						 
						int index28_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_61);
						if ( s>=0 ) return s;
						break;
					case 28 : 
						int LA28_62 = input.LA(1);
						 
						int index28_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_62);
						if ( s>=0 ) return s;
						break;
					case 29 : 
						int LA28_63 = input.LA(1);
						 
						int index28_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_63);
						if ( s>=0 ) return s;
						break;
					case 30 : 
						int LA28_64 = input.LA(1);
						 
						int index28_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_64);
						if ( s>=0 ) return s;
						break;
					case 31 : 
						int LA28_65 = input.LA(1);
						 
						int index28_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_65);
						if ( s>=0 ) return s;
						break;
					case 32 : 
						int LA28_66 = input.LA(1);
						 
						int index28_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_66);
						if ( s>=0 ) return s;
						break;
					case 33 : 
						int LA28_67 = input.LA(1);
						 
						int index28_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_67);
						if ( s>=0 ) return s;
						break;
					case 34 : 
						int LA28_68 = input.LA(1);
						 
						int index28_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_68);
						if ( s>=0 ) return s;
						break;
					case 35 : 
						int LA28_69 = input.LA(1);
						 
						int index28_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_myCompiler()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_69);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 28, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA30_eotS =
		"\134\uffff";
	static final String DFA30_eofS =
		"\1\1\133\uffff";
	static final String DFA30_minS =
		"\1\13\24\uffff\2\0\105\uffff";
	static final String DFA30_maxS =
		"\1\132\24\uffff\2\0\105\uffff";
	static final String DFA30_acceptS =
		"\1\uffff\1\2\73\uffff\1\1\36\uffff";
	static final String DFA30_specialS =
		"\25\uffff\1\0\1\1\105\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\1\14\uffff\3\1\4\uffff\1\1\10\uffff\2\1\4\uffff\1\1\6\uffff\1\1\3"+
			"\uffff\2\1\2\uffff\1\1\1\25\3\uffff\1\1\1\uffff\3\1\3\uffff\3\1\1\uffff"+
			"\2\1\1\uffff\2\1\1\uffff\4\1\1\26\1\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 614:8: ( type_qualifier )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA30_21 = input.LA(1);
						 
						int index30_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred52_myCompiler()) ) {s = 61;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index30_21);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA30_22 = input.LA(1);
						 
						int index30_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred52_myCompiler()) ) {s = 61;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index30_22);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 30, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA31_eotS =
		"\76\uffff";
	static final String DFA31_eofS =
		"\1\2\75\uffff";
	static final String DFA31_minS =
		"\1\13\1\0\74\uffff";
	static final String DFA31_maxS =
		"\1\132\1\0\74\uffff";
	static final String DFA31_acceptS =
		"\2\uffff\1\2\72\uffff\1\1";
	static final String DFA31_specialS =
		"\1\uffff\1\0\74\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\2\14\uffff\2\2\1\1\4\uffff\1\2\10\uffff\2\2\4\uffff\1\2\6\uffff\1"+
			"\2\3\uffff\2\2\2\uffff\2\2\3\uffff\1\2\1\uffff\3\2\3\uffff\3\2\1\uffff"+
			"\2\2\1\uffff\2\2\1\uffff\5\2\1\uffff\1\2",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "614:24: ( pointer )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA31_1 = input.LA(1);
						 
						int index31_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_myCompiler()) ) {s = 61;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index31_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 31, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA53_eotS =
		"\74\uffff";
	static final String DFA53_eofS =
		"\1\1\73\uffff";
	static final String DFA53_minS =
		"\1\22\46\uffff\1\4\24\uffff";
	static final String DFA53_maxS =
		"\1\136\46\uffff\1\137\24\uffff";
	static final String DFA53_acceptS =
		"\1\uffff\1\10\44\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\2\1\3\16\uffff";
	static final String DFA53_specialS =
		"\74\uffff}>";
	static final String[] DFA53_transitionS = {
			"\6\1\1\47\4\1\1\52\3\1\1\53\1\1\1\51\1\50\1\uffff\17\1\1\46\3\1\42\uffff"+
			"\4\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55\1\uffff\1\55\2\uffff\1\55\1\uffff\1\55\3\uffff\1\55\1\uffff\1"+
			"\55\4\uffff\1\55\1\uffff\1\55\1\54\1\55\1\uffff\2\55\2\uffff\2\55\56"+
			"\uffff\1\55\16\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			return "()* loopback of 761:9: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*";
		}
	}

	static final String DFA58_eotS =
		"\u018b\uffff";
	static final String DFA58_eofS =
		"\1\uffff\5\41\u0185\uffff";
	static final String DFA58_minS =
		"\1\4\5\22\12\4\6\0\45\uffff\6\0\45\uffff\6\0\45\uffff\6\0\45\uffff\6\0"+
		"\45\uffff\17\0\16\uffff\u0087\0";
	static final String DFA58_maxS =
		"\1\137\5\136\12\137\6\0\45\uffff\6\0\45\uffff\6\0\45\uffff\6\0\45\uffff"+
		"\6\0\45\uffff\17\0\16\uffff\u0087\0";
	static final String DFA58_acceptS =
		"\26\uffff\1\1\12\uffff\1\2\u0169\uffff";
	static final String DFA58_specialS =
		"\20\uffff\1\0\1\1\1\2\1\3\1\4\1\5\45\uffff\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\45\uffff\1\14\1\15\1\16\1\17\1\20\1\21\45\uffff\1\22\1\23\1\24\1\25\1"+
		"\26\1\27\45\uffff\1\30\1\31\1\32\1\33\1\34\1\35\45\uffff\1\36\1\37\1\40"+
		"\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\16\uffff"+
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
	static final String[] DFA58_transitionS = {
			"\1\3\1\uffff\1\2\2\uffff\1\5\1\uffff\1\1\3\uffff\1\4\1\uffff\1\16\4\uffff"+
			"\1\11\1\uffff\1\6\1\uffff\1\12\1\uffff\1\13\1\7\2\uffff\1\14\1\10\56"+
			"\uffff\1\17\16\uffff\1\15",
			"\2\41\1\26\2\41\1\26\1\21\2\41\1\26\1\41\1\24\1\26\2\41\1\25\1\26\1"+
			"\23\1\22\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26\1\41\1\20\2"+
			"\41\1\26\42\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\74\2\41\1\26\1\41\1\77\1\26\2\41\1\100\1\26\1"+
			"\76\1\75\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26\1\41\1\73\2"+
			"\41\1\26\42\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\147\2\41\1\26\1\41\1\152\1\26\2\41\1\153\1\26"+
			"\1\151\1\150\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26\1\41\1\146"+
			"\2\41\1\26\42\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\u0092\2\41\1\26\1\41\1\u0095\1\26\2\41\1\u0096"+
			"\1\26\1\u0094\1\u0093\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26"+
			"\1\41\1\u0091\2\41\1\26\42\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\u00bd\2\41\1\26\1\41\1\u00c0\1\26\2\41\1\u00c1"+
			"\1\26\1\u00bf\1\u00be\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26"+
			"\1\41\1\u00bc\2\41\1\26\42\uffff\1\41\1\26\2\41",
			"\1\u00e9\1\uffff\1\u00e8\2\uffff\1\u00eb\1\uffff\1\u00e7\3\uffff\1\u00ea"+
			"\1\uffff\1\u00f4\4\uffff\1\u00ef\1\uffff\1\u00ec\1\uffff\1\u00f0\1\uffff"+
			"\1\u00f1\1\u00ed\2\uffff\1\u00f2\1\u00ee\30\uffff\1\41\2\uffff\2\41\3"+
			"\uffff\1\41\1\uffff\1\41\1\uffff\1\41\3\uffff\2\41\2\uffff\2\41\1\u00f5"+
			"\1\uffff\1\41\2\uffff\4\41\6\uffff\1\u00f3",
			"\1\u0106\1\uffff\1\u0105\2\uffff\1\u0108\1\uffff\1\u0104\3\uffff\1\u0107"+
			"\1\uffff\1\u0111\4\uffff\1\u010c\1\uffff\1\u0109\1\uffff\1\u010d\1\uffff"+
			"\1\u010e\1\u010a\2\uffff\1\u010f\1\u010b\56\uffff\1\u0112\16\uffff\1"+
			"\u0110",
			"\1\u0115\1\uffff\1\u0114\2\uffff\1\u0117\1\uffff\1\u0113\3\uffff\1\u0116"+
			"\1\uffff\1\u0120\4\uffff\1\u011b\1\uffff\1\u0118\1\uffff\1\u011c\1\uffff"+
			"\1\u011d\1\u0119\2\uffff\1\u011e\1\u011a\56\uffff\1\u0121\16\uffff\1"+
			"\u011f",
			"\1\u0125\1\uffff\1\u0124\2\uffff\1\u0127\1\uffff\1\u0123\3\uffff\1\u0126"+
			"\1\uffff\1\u012f\4\uffff\1\u012a\1\uffff\1\u0122\1\uffff\1\u012b\1\uffff"+
			"\1\u012c\1\u0128\2\uffff\1\u012d\1\u0129\56\uffff\1\u0130\16\uffff\1"+
			"\u012e",
			"\1\u0134\1\uffff\1\u0133\2\uffff\1\u0136\1\uffff\1\u0132\3\uffff\1\u0135"+
			"\1\uffff\1\u013e\4\uffff\1\u0139\1\uffff\1\u0131\1\uffff\1\u013a\1\uffff"+
			"\1\u013b\1\u0137\2\uffff\1\u013c\1\u0138\56\uffff\1\u013f\16\uffff\1"+
			"\u013d",
			"\1\u0143\1\uffff\1\u0142\2\uffff\1\u0145\1\uffff\1\u0141\3\uffff\1\u0144"+
			"\1\uffff\1\u014d\4\uffff\1\u0148\1\uffff\1\u0140\1\uffff\1\u0149\1\uffff"+
			"\1\u014a\1\u0146\2\uffff\1\u014b\1\u0147\56\uffff\1\u014e\16\uffff\1"+
			"\u014c",
			"\1\u0152\1\uffff\1\u0151\2\uffff\1\u0154\1\uffff\1\u0150\3\uffff\1\u0153"+
			"\1\uffff\1\u015c\4\uffff\1\u0157\1\uffff\1\u014f\1\uffff\1\u0158\1\uffff"+
			"\1\u0159\1\u0155\2\uffff\1\u015a\1\u0156\56\uffff\1\u015d\16\uffff\1"+
			"\u015b",
			"\1\u0161\1\uffff\1\u0160\2\uffff\1\u0163\1\uffff\1\u015f\3\uffff\1\u0162"+
			"\1\uffff\1\u016b\4\uffff\1\u0166\1\uffff\1\u015e\1\uffff\1\u0167\1\uffff"+
			"\1\u0168\1\u0164\2\uffff\1\u0169\1\u0165\56\uffff\1\u016c\16\uffff\1"+
			"\u016a",
			"\1\u0170\1\uffff\1\u016f\2\uffff\1\u0172\1\uffff\1\u016e\3\uffff\1\u0171"+
			"\1\uffff\1\u017a\4\uffff\1\u0175\1\uffff\1\u016d\1\uffff\1\u0176\1\uffff"+
			"\1\u0177\1\u0173\2\uffff\1\u0178\1\u0174\56\uffff\1\u017b\16\uffff\1"+
			"\u0179",
			"\1\u017f\1\uffff\1\u017e\2\uffff\1\u0181\1\uffff\1\u017d\3\uffff\1\u0180"+
			"\1\uffff\1\u0189\4\uffff\1\u0184\1\uffff\1\u017c\1\uffff\1\u0185\1\uffff"+
			"\1\u0186\1\u0182\2\uffff\1\u0187\1\u0183\56\uffff\1\u018a\16\uffff\1"+
			"\u0188",
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

	static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
	static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
	static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
	static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
	static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
	static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
	static final short[][] DFA58_transition;

	static {
		int numStates = DFA58_transitionS.length;
		DFA58_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
		}
	}

	protected class DFA58 extends DFA {

		public DFA58(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 58;
			this.eot = DFA58_eot;
			this.eof = DFA58_eof;
			this.min = DFA58_min;
			this.max = DFA58_max;
			this.accept = DFA58_accept;
			this.special = DFA58_special;
			this.transition = DFA58_transition;
		}
		@Override
		public String getDescription() {
			return "871:1: assignment_expression returns [Symbol symb] : ( lvalue assignment_operator asgn2= assignment_expression | conditional_expression );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA58_16 = input.LA(1);
						 
						int index58_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_16);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA58_17 = input.LA(1);
						 
						int index58_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_17);
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA58_18 = input.LA(1);
						 
						int index58_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_18);
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA58_19 = input.LA(1);
						 
						int index58_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_19);
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA58_20 = input.LA(1);
						 
						int index58_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_20);
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA58_21 = input.LA(1);
						 
						int index58_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_21);
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA58_59 = input.LA(1);
						 
						int index58_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_59);
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA58_60 = input.LA(1);
						 
						int index58_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_60);
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA58_61 = input.LA(1);
						 
						int index58_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_61);
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA58_62 = input.LA(1);
						 
						int index58_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_62);
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA58_63 = input.LA(1);
						 
						int index58_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_63);
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA58_64 = input.LA(1);
						 
						int index58_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_64);
						if ( s>=0 ) return s;
						break;
					case 12 : 
						int LA58_102 = input.LA(1);
						 
						int index58_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_102);
						if ( s>=0 ) return s;
						break;
					case 13 : 
						int LA58_103 = input.LA(1);
						 
						int index58_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_103);
						if ( s>=0 ) return s;
						break;
					case 14 : 
						int LA58_104 = input.LA(1);
						 
						int index58_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_104);
						if ( s>=0 ) return s;
						break;
					case 15 : 
						int LA58_105 = input.LA(1);
						 
						int index58_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_105);
						if ( s>=0 ) return s;
						break;
					case 16 : 
						int LA58_106 = input.LA(1);
						 
						int index58_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_106);
						if ( s>=0 ) return s;
						break;
					case 17 : 
						int LA58_107 = input.LA(1);
						 
						int index58_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_107);
						if ( s>=0 ) return s;
						break;
					case 18 : 
						int LA58_145 = input.LA(1);
						 
						int index58_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_145);
						if ( s>=0 ) return s;
						break;
					case 19 : 
						int LA58_146 = input.LA(1);
						 
						int index58_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_146);
						if ( s>=0 ) return s;
						break;
					case 20 : 
						int LA58_147 = input.LA(1);
						 
						int index58_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_147);
						if ( s>=0 ) return s;
						break;
					case 21 : 
						int LA58_148 = input.LA(1);
						 
						int index58_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_148);
						if ( s>=0 ) return s;
						break;
					case 22 : 
						int LA58_149 = input.LA(1);
						 
						int index58_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_149);
						if ( s>=0 ) return s;
						break;
					case 23 : 
						int LA58_150 = input.LA(1);
						 
						int index58_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_150);
						if ( s>=0 ) return s;
						break;
					case 24 : 
						int LA58_188 = input.LA(1);
						 
						int index58_188 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_188);
						if ( s>=0 ) return s;
						break;
					case 25 : 
						int LA58_189 = input.LA(1);
						 
						int index58_189 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_189);
						if ( s>=0 ) return s;
						break;
					case 26 : 
						int LA58_190 = input.LA(1);
						 
						int index58_190 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_190);
						if ( s>=0 ) return s;
						break;
					case 27 : 
						int LA58_191 = input.LA(1);
						 
						int index58_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_191);
						if ( s>=0 ) return s;
						break;
					case 28 : 
						int LA58_192 = input.LA(1);
						 
						int index58_192 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_192);
						if ( s>=0 ) return s;
						break;
					case 29 : 
						int LA58_193 = input.LA(1);
						 
						int index58_193 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_193);
						if ( s>=0 ) return s;
						break;
					case 30 : 
						int LA58_231 = input.LA(1);
						 
						int index58_231 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_231);
						if ( s>=0 ) return s;
						break;
					case 31 : 
						int LA58_232 = input.LA(1);
						 
						int index58_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_232);
						if ( s>=0 ) return s;
						break;
					case 32 : 
						int LA58_233 = input.LA(1);
						 
						int index58_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_233);
						if ( s>=0 ) return s;
						break;
					case 33 : 
						int LA58_234 = input.LA(1);
						 
						int index58_234 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_234);
						if ( s>=0 ) return s;
						break;
					case 34 : 
						int LA58_235 = input.LA(1);
						 
						int index58_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_235);
						if ( s>=0 ) return s;
						break;
					case 35 : 
						int LA58_236 = input.LA(1);
						 
						int index58_236 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_236);
						if ( s>=0 ) return s;
						break;
					case 36 : 
						int LA58_237 = input.LA(1);
						 
						int index58_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_237);
						if ( s>=0 ) return s;
						break;
					case 37 : 
						int LA58_238 = input.LA(1);
						 
						int index58_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_238);
						if ( s>=0 ) return s;
						break;
					case 38 : 
						int LA58_239 = input.LA(1);
						 
						int index58_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_239);
						if ( s>=0 ) return s;
						break;
					case 39 : 
						int LA58_240 = input.LA(1);
						 
						int index58_240 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_240);
						if ( s>=0 ) return s;
						break;
					case 40 : 
						int LA58_241 = input.LA(1);
						 
						int index58_241 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_241);
						if ( s>=0 ) return s;
						break;
					case 41 : 
						int LA58_242 = input.LA(1);
						 
						int index58_242 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_242);
						if ( s>=0 ) return s;
						break;
					case 42 : 
						int LA58_243 = input.LA(1);
						 
						int index58_243 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_243);
						if ( s>=0 ) return s;
						break;
					case 43 : 
						int LA58_244 = input.LA(1);
						 
						int index58_244 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_244);
						if ( s>=0 ) return s;
						break;
					case 44 : 
						int LA58_245 = input.LA(1);
						 
						int index58_245 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_245);
						if ( s>=0 ) return s;
						break;
					case 45 : 
						int LA58_260 = input.LA(1);
						 
						int index58_260 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_260);
						if ( s>=0 ) return s;
						break;
					case 46 : 
						int LA58_261 = input.LA(1);
						 
						int index58_261 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_261);
						if ( s>=0 ) return s;
						break;
					case 47 : 
						int LA58_262 = input.LA(1);
						 
						int index58_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_262);
						if ( s>=0 ) return s;
						break;
					case 48 : 
						int LA58_263 = input.LA(1);
						 
						int index58_263 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_263);
						if ( s>=0 ) return s;
						break;
					case 49 : 
						int LA58_264 = input.LA(1);
						 
						int index58_264 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_264);
						if ( s>=0 ) return s;
						break;
					case 50 : 
						int LA58_265 = input.LA(1);
						 
						int index58_265 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_265);
						if ( s>=0 ) return s;
						break;
					case 51 : 
						int LA58_266 = input.LA(1);
						 
						int index58_266 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_266);
						if ( s>=0 ) return s;
						break;
					case 52 : 
						int LA58_267 = input.LA(1);
						 
						int index58_267 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_267);
						if ( s>=0 ) return s;
						break;
					case 53 : 
						int LA58_268 = input.LA(1);
						 
						int index58_268 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_268);
						if ( s>=0 ) return s;
						break;
					case 54 : 
						int LA58_269 = input.LA(1);
						 
						int index58_269 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_269);
						if ( s>=0 ) return s;
						break;
					case 55 : 
						int LA58_270 = input.LA(1);
						 
						int index58_270 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_270);
						if ( s>=0 ) return s;
						break;
					case 56 : 
						int LA58_271 = input.LA(1);
						 
						int index58_271 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_271);
						if ( s>=0 ) return s;
						break;
					case 57 : 
						int LA58_272 = input.LA(1);
						 
						int index58_272 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_272);
						if ( s>=0 ) return s;
						break;
					case 58 : 
						int LA58_273 = input.LA(1);
						 
						int index58_273 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_273);
						if ( s>=0 ) return s;
						break;
					case 59 : 
						int LA58_274 = input.LA(1);
						 
						int index58_274 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_274);
						if ( s>=0 ) return s;
						break;
					case 60 : 
						int LA58_275 = input.LA(1);
						 
						int index58_275 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_275);
						if ( s>=0 ) return s;
						break;
					case 61 : 
						int LA58_276 = input.LA(1);
						 
						int index58_276 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_276);
						if ( s>=0 ) return s;
						break;
					case 62 : 
						int LA58_277 = input.LA(1);
						 
						int index58_277 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_277);
						if ( s>=0 ) return s;
						break;
					case 63 : 
						int LA58_278 = input.LA(1);
						 
						int index58_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_278);
						if ( s>=0 ) return s;
						break;
					case 64 : 
						int LA58_279 = input.LA(1);
						 
						int index58_279 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_279);
						if ( s>=0 ) return s;
						break;
					case 65 : 
						int LA58_280 = input.LA(1);
						 
						int index58_280 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_280);
						if ( s>=0 ) return s;
						break;
					case 66 : 
						int LA58_281 = input.LA(1);
						 
						int index58_281 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_281);
						if ( s>=0 ) return s;
						break;
					case 67 : 
						int LA58_282 = input.LA(1);
						 
						int index58_282 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_282);
						if ( s>=0 ) return s;
						break;
					case 68 : 
						int LA58_283 = input.LA(1);
						 
						int index58_283 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_283);
						if ( s>=0 ) return s;
						break;
					case 69 : 
						int LA58_284 = input.LA(1);
						 
						int index58_284 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_284);
						if ( s>=0 ) return s;
						break;
					case 70 : 
						int LA58_285 = input.LA(1);
						 
						int index58_285 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_285);
						if ( s>=0 ) return s;
						break;
					case 71 : 
						int LA58_286 = input.LA(1);
						 
						int index58_286 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_286);
						if ( s>=0 ) return s;
						break;
					case 72 : 
						int LA58_287 = input.LA(1);
						 
						int index58_287 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_287);
						if ( s>=0 ) return s;
						break;
					case 73 : 
						int LA58_288 = input.LA(1);
						 
						int index58_288 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_288);
						if ( s>=0 ) return s;
						break;
					case 74 : 
						int LA58_289 = input.LA(1);
						 
						int index58_289 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_289);
						if ( s>=0 ) return s;
						break;
					case 75 : 
						int LA58_290 = input.LA(1);
						 
						int index58_290 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_290);
						if ( s>=0 ) return s;
						break;
					case 76 : 
						int LA58_291 = input.LA(1);
						 
						int index58_291 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_291);
						if ( s>=0 ) return s;
						break;
					case 77 : 
						int LA58_292 = input.LA(1);
						 
						int index58_292 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_292);
						if ( s>=0 ) return s;
						break;
					case 78 : 
						int LA58_293 = input.LA(1);
						 
						int index58_293 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_293);
						if ( s>=0 ) return s;
						break;
					case 79 : 
						int LA58_294 = input.LA(1);
						 
						int index58_294 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_294);
						if ( s>=0 ) return s;
						break;
					case 80 : 
						int LA58_295 = input.LA(1);
						 
						int index58_295 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_295);
						if ( s>=0 ) return s;
						break;
					case 81 : 
						int LA58_296 = input.LA(1);
						 
						int index58_296 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_296);
						if ( s>=0 ) return s;
						break;
					case 82 : 
						int LA58_297 = input.LA(1);
						 
						int index58_297 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_297);
						if ( s>=0 ) return s;
						break;
					case 83 : 
						int LA58_298 = input.LA(1);
						 
						int index58_298 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_298);
						if ( s>=0 ) return s;
						break;
					case 84 : 
						int LA58_299 = input.LA(1);
						 
						int index58_299 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_299);
						if ( s>=0 ) return s;
						break;
					case 85 : 
						int LA58_300 = input.LA(1);
						 
						int index58_300 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_300);
						if ( s>=0 ) return s;
						break;
					case 86 : 
						int LA58_301 = input.LA(1);
						 
						int index58_301 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_301);
						if ( s>=0 ) return s;
						break;
					case 87 : 
						int LA58_302 = input.LA(1);
						 
						int index58_302 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_302);
						if ( s>=0 ) return s;
						break;
					case 88 : 
						int LA58_303 = input.LA(1);
						 
						int index58_303 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_303);
						if ( s>=0 ) return s;
						break;
					case 89 : 
						int LA58_304 = input.LA(1);
						 
						int index58_304 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_304);
						if ( s>=0 ) return s;
						break;
					case 90 : 
						int LA58_305 = input.LA(1);
						 
						int index58_305 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_305);
						if ( s>=0 ) return s;
						break;
					case 91 : 
						int LA58_306 = input.LA(1);
						 
						int index58_306 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_306);
						if ( s>=0 ) return s;
						break;
					case 92 : 
						int LA58_307 = input.LA(1);
						 
						int index58_307 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_307);
						if ( s>=0 ) return s;
						break;
					case 93 : 
						int LA58_308 = input.LA(1);
						 
						int index58_308 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_308);
						if ( s>=0 ) return s;
						break;
					case 94 : 
						int LA58_309 = input.LA(1);
						 
						int index58_309 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_309);
						if ( s>=0 ) return s;
						break;
					case 95 : 
						int LA58_310 = input.LA(1);
						 
						int index58_310 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_310);
						if ( s>=0 ) return s;
						break;
					case 96 : 
						int LA58_311 = input.LA(1);
						 
						int index58_311 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_311);
						if ( s>=0 ) return s;
						break;
					case 97 : 
						int LA58_312 = input.LA(1);
						 
						int index58_312 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_312);
						if ( s>=0 ) return s;
						break;
					case 98 : 
						int LA58_313 = input.LA(1);
						 
						int index58_313 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_313);
						if ( s>=0 ) return s;
						break;
					case 99 : 
						int LA58_314 = input.LA(1);
						 
						int index58_314 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_314);
						if ( s>=0 ) return s;
						break;
					case 100 : 
						int LA58_315 = input.LA(1);
						 
						int index58_315 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_315);
						if ( s>=0 ) return s;
						break;
					case 101 : 
						int LA58_316 = input.LA(1);
						 
						int index58_316 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_316);
						if ( s>=0 ) return s;
						break;
					case 102 : 
						int LA58_317 = input.LA(1);
						 
						int index58_317 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_317);
						if ( s>=0 ) return s;
						break;
					case 103 : 
						int LA58_318 = input.LA(1);
						 
						int index58_318 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_318);
						if ( s>=0 ) return s;
						break;
					case 104 : 
						int LA58_319 = input.LA(1);
						 
						int index58_319 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_319);
						if ( s>=0 ) return s;
						break;
					case 105 : 
						int LA58_320 = input.LA(1);
						 
						int index58_320 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_320);
						if ( s>=0 ) return s;
						break;
					case 106 : 
						int LA58_321 = input.LA(1);
						 
						int index58_321 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_321);
						if ( s>=0 ) return s;
						break;
					case 107 : 
						int LA58_322 = input.LA(1);
						 
						int index58_322 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_322);
						if ( s>=0 ) return s;
						break;
					case 108 : 
						int LA58_323 = input.LA(1);
						 
						int index58_323 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_323);
						if ( s>=0 ) return s;
						break;
					case 109 : 
						int LA58_324 = input.LA(1);
						 
						int index58_324 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_324);
						if ( s>=0 ) return s;
						break;
					case 110 : 
						int LA58_325 = input.LA(1);
						 
						int index58_325 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_325);
						if ( s>=0 ) return s;
						break;
					case 111 : 
						int LA58_326 = input.LA(1);
						 
						int index58_326 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_326);
						if ( s>=0 ) return s;
						break;
					case 112 : 
						int LA58_327 = input.LA(1);
						 
						int index58_327 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_327);
						if ( s>=0 ) return s;
						break;
					case 113 : 
						int LA58_328 = input.LA(1);
						 
						int index58_328 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_328);
						if ( s>=0 ) return s;
						break;
					case 114 : 
						int LA58_329 = input.LA(1);
						 
						int index58_329 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_329);
						if ( s>=0 ) return s;
						break;
					case 115 : 
						int LA58_330 = input.LA(1);
						 
						int index58_330 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_330);
						if ( s>=0 ) return s;
						break;
					case 116 : 
						int LA58_331 = input.LA(1);
						 
						int index58_331 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_331);
						if ( s>=0 ) return s;
						break;
					case 117 : 
						int LA58_332 = input.LA(1);
						 
						int index58_332 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_332);
						if ( s>=0 ) return s;
						break;
					case 118 : 
						int LA58_333 = input.LA(1);
						 
						int index58_333 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_333);
						if ( s>=0 ) return s;
						break;
					case 119 : 
						int LA58_334 = input.LA(1);
						 
						int index58_334 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_334);
						if ( s>=0 ) return s;
						break;
					case 120 : 
						int LA58_335 = input.LA(1);
						 
						int index58_335 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_335);
						if ( s>=0 ) return s;
						break;
					case 121 : 
						int LA58_336 = input.LA(1);
						 
						int index58_336 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_336);
						if ( s>=0 ) return s;
						break;
					case 122 : 
						int LA58_337 = input.LA(1);
						 
						int index58_337 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_337);
						if ( s>=0 ) return s;
						break;
					case 123 : 
						int LA58_338 = input.LA(1);
						 
						int index58_338 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_338);
						if ( s>=0 ) return s;
						break;
					case 124 : 
						int LA58_339 = input.LA(1);
						 
						int index58_339 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_339);
						if ( s>=0 ) return s;
						break;
					case 125 : 
						int LA58_340 = input.LA(1);
						 
						int index58_340 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_340);
						if ( s>=0 ) return s;
						break;
					case 126 : 
						int LA58_341 = input.LA(1);
						 
						int index58_341 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_341);
						if ( s>=0 ) return s;
						break;
					case 127 : 
						int LA58_342 = input.LA(1);
						 
						int index58_342 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_342);
						if ( s>=0 ) return s;
						break;
					case 128 : 
						int LA58_343 = input.LA(1);
						 
						int index58_343 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_343);
						if ( s>=0 ) return s;
						break;
					case 129 : 
						int LA58_344 = input.LA(1);
						 
						int index58_344 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_344);
						if ( s>=0 ) return s;
						break;
					case 130 : 
						int LA58_345 = input.LA(1);
						 
						int index58_345 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_345);
						if ( s>=0 ) return s;
						break;
					case 131 : 
						int LA58_346 = input.LA(1);
						 
						int index58_346 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_346);
						if ( s>=0 ) return s;
						break;
					case 132 : 
						int LA58_347 = input.LA(1);
						 
						int index58_347 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_347);
						if ( s>=0 ) return s;
						break;
					case 133 : 
						int LA58_348 = input.LA(1);
						 
						int index58_348 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_348);
						if ( s>=0 ) return s;
						break;
					case 134 : 
						int LA58_349 = input.LA(1);
						 
						int index58_349 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_349);
						if ( s>=0 ) return s;
						break;
					case 135 : 
						int LA58_350 = input.LA(1);
						 
						int index58_350 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_350);
						if ( s>=0 ) return s;
						break;
					case 136 : 
						int LA58_351 = input.LA(1);
						 
						int index58_351 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_351);
						if ( s>=0 ) return s;
						break;
					case 137 : 
						int LA58_352 = input.LA(1);
						 
						int index58_352 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_352);
						if ( s>=0 ) return s;
						break;
					case 138 : 
						int LA58_353 = input.LA(1);
						 
						int index58_353 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_353);
						if ( s>=0 ) return s;
						break;
					case 139 : 
						int LA58_354 = input.LA(1);
						 
						int index58_354 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_354);
						if ( s>=0 ) return s;
						break;
					case 140 : 
						int LA58_355 = input.LA(1);
						 
						int index58_355 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_355);
						if ( s>=0 ) return s;
						break;
					case 141 : 
						int LA58_356 = input.LA(1);
						 
						int index58_356 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_356);
						if ( s>=0 ) return s;
						break;
					case 142 : 
						int LA58_357 = input.LA(1);
						 
						int index58_357 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_357);
						if ( s>=0 ) return s;
						break;
					case 143 : 
						int LA58_358 = input.LA(1);
						 
						int index58_358 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_358);
						if ( s>=0 ) return s;
						break;
					case 144 : 
						int LA58_359 = input.LA(1);
						 
						int index58_359 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_359);
						if ( s>=0 ) return s;
						break;
					case 145 : 
						int LA58_360 = input.LA(1);
						 
						int index58_360 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_360);
						if ( s>=0 ) return s;
						break;
					case 146 : 
						int LA58_361 = input.LA(1);
						 
						int index58_361 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_361);
						if ( s>=0 ) return s;
						break;
					case 147 : 
						int LA58_362 = input.LA(1);
						 
						int index58_362 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_362);
						if ( s>=0 ) return s;
						break;
					case 148 : 
						int LA58_363 = input.LA(1);
						 
						int index58_363 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_363);
						if ( s>=0 ) return s;
						break;
					case 149 : 
						int LA58_364 = input.LA(1);
						 
						int index58_364 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_364);
						if ( s>=0 ) return s;
						break;
					case 150 : 
						int LA58_365 = input.LA(1);
						 
						int index58_365 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_365);
						if ( s>=0 ) return s;
						break;
					case 151 : 
						int LA58_366 = input.LA(1);
						 
						int index58_366 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_366);
						if ( s>=0 ) return s;
						break;
					case 152 : 
						int LA58_367 = input.LA(1);
						 
						int index58_367 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_367);
						if ( s>=0 ) return s;
						break;
					case 153 : 
						int LA58_368 = input.LA(1);
						 
						int index58_368 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_368);
						if ( s>=0 ) return s;
						break;
					case 154 : 
						int LA58_369 = input.LA(1);
						 
						int index58_369 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_369);
						if ( s>=0 ) return s;
						break;
					case 155 : 
						int LA58_370 = input.LA(1);
						 
						int index58_370 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_370);
						if ( s>=0 ) return s;
						break;
					case 156 : 
						int LA58_371 = input.LA(1);
						 
						int index58_371 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_371);
						if ( s>=0 ) return s;
						break;
					case 157 : 
						int LA58_372 = input.LA(1);
						 
						int index58_372 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_372);
						if ( s>=0 ) return s;
						break;
					case 158 : 
						int LA58_373 = input.LA(1);
						 
						int index58_373 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_373);
						if ( s>=0 ) return s;
						break;
					case 159 : 
						int LA58_374 = input.LA(1);
						 
						int index58_374 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_374);
						if ( s>=0 ) return s;
						break;
					case 160 : 
						int LA58_375 = input.LA(1);
						 
						int index58_375 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_375);
						if ( s>=0 ) return s;
						break;
					case 161 : 
						int LA58_376 = input.LA(1);
						 
						int index58_376 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_376);
						if ( s>=0 ) return s;
						break;
					case 162 : 
						int LA58_377 = input.LA(1);
						 
						int index58_377 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_377);
						if ( s>=0 ) return s;
						break;
					case 163 : 
						int LA58_378 = input.LA(1);
						 
						int index58_378 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_378);
						if ( s>=0 ) return s;
						break;
					case 164 : 
						int LA58_379 = input.LA(1);
						 
						int index58_379 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_379);
						if ( s>=0 ) return s;
						break;
					case 165 : 
						int LA58_380 = input.LA(1);
						 
						int index58_380 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_380);
						if ( s>=0 ) return s;
						break;
					case 166 : 
						int LA58_381 = input.LA(1);
						 
						int index58_381 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_381);
						if ( s>=0 ) return s;
						break;
					case 167 : 
						int LA58_382 = input.LA(1);
						 
						int index58_382 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_382);
						if ( s>=0 ) return s;
						break;
					case 168 : 
						int LA58_383 = input.LA(1);
						 
						int index58_383 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_383);
						if ( s>=0 ) return s;
						break;
					case 169 : 
						int LA58_384 = input.LA(1);
						 
						int index58_384 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_384);
						if ( s>=0 ) return s;
						break;
					case 170 : 
						int LA58_385 = input.LA(1);
						 
						int index58_385 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_385);
						if ( s>=0 ) return s;
						break;
					case 171 : 
						int LA58_386 = input.LA(1);
						 
						int index58_386 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_386);
						if ( s>=0 ) return s;
						break;
					case 172 : 
						int LA58_387 = input.LA(1);
						 
						int index58_387 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_387);
						if ( s>=0 ) return s;
						break;
					case 173 : 
						int LA58_388 = input.LA(1);
						 
						int index58_388 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_388);
						if ( s>=0 ) return s;
						break;
					case 174 : 
						int LA58_389 = input.LA(1);
						 
						int index58_389 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_389);
						if ( s>=0 ) return s;
						break;
					case 175 : 
						int LA58_390 = input.LA(1);
						 
						int index58_390 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_390);
						if ( s>=0 ) return s;
						break;
					case 176 : 
						int LA58_391 = input.LA(1);
						 
						int index58_391 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_391);
						if ( s>=0 ) return s;
						break;
					case 177 : 
						int LA58_392 = input.LA(1);
						 
						int index58_392 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_392);
						if ( s>=0 ) return s;
						break;
					case 178 : 
						int LA58_393 = input.LA(1);
						 
						int index58_393 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_393);
						if ( s>=0 ) return s;
						break;
					case 179 : 
						int LA58_394 = input.LA(1);
						 
						int index58_394 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_394);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 58, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA72_eotS =
		"\104\uffff";
	static final String DFA72_eofS =
		"\104\uffff";
	static final String DFA72_minS =
		"\1\4\1\22\102\uffff";
	static final String DFA72_maxS =
		"\1\137\1\135\102\uffff";
	static final String DFA72_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\1\3\16\uffff\1\4\1\uffff\1\5\2\uffff\1\6\52\uffff";
	static final String DFA72_specialS =
		"\104\uffff}>";
	static final String[] DFA72_transitionS = {
			"\1\5\1\uffff\1\5\2\uffff\1\5\1\uffff\1\1\3\uffff\1\5\1\uffff\1\5\4\uffff"+
			"\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\2\5\2\uffff\2\5\7\uffff\1\5\21\uffff"+
			"\1\31\1\2\2\uffff\1\31\1\2\1\26\5\uffff\1\26\1\31\1\24\3\uffff\1\31\2"+
			"\uffff\1\5\2\uffff\1\24\5\uffff\1\26\1\4\4\uffff\1\5",
			"\7\5\1\uffff\13\5\1\uffff\2\5\1\2\15\5\1\uffff\2\5\42\uffff\3\5",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
	static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
	static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
	static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
	static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
	static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
	static final short[][] DFA72_transition;

	static {
		int numStates = DFA72_transitionS.length;
		DFA72_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
		}
	}

	protected class DFA72 extends DFA {

		public DFA72(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 72;
			this.eot = DFA72_eot;
			this.eof = DFA72_eof;
			this.min = DFA72_min;
			this.max = DFA72_max;
			this.accept = DFA72_accept;
			this.special = DFA72_special;
			this.transition = DFA72_transition;
		}
		@Override
		public String getDescription() {
			return "1002:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );";
		}
	}

	public static final BitSet FOLLOW_external_declaration_in_translation_unit78 = new BitSet(new long[]{0x6600000005000802L,0x0000000001F6DC74L});
	public static final BitSet FOLLOW_function_definition_in_external_declaration113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_external_declaration118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_function_definition134 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_declarator_in_function_definition137 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_declaration_in_function_definition157 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_declaration201 = new BitSet(new long[]{0x6600000005000800L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_declaration_specifiers_in_declaration203 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_init_declarator_list_in_declaration210 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_declaration212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_declaration218 = new BitSet(new long[]{0x0000020005000800L});
	public static final BitSet FOLLOW_init_declarator_list_in_declaration220 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_declaration223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers249 = new BitSet(new long[]{0x6600000000000002L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers256 = new BitSet(new long[]{0x6600000000000002L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers266 = new BitSet(new long[]{0x6600000000000002L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list299 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_init_declarator_list309 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list313 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_declarator_in_init_declarator338 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_init_declarator343 = new BitSet(new long[]{0x0000000335428A50L,0x0000000084010000L});
	public static final BitSet FOLLOW_initializer_in_init_declarator345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_storage_class_specifier366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_storage_class_specifier373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_storage_class_specifier380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_storage_class_specifier387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_type_specifier404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_type_specifier411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_type_specifier418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_type_specifier425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_type_specifier432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_type_specifier439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_type_specifier446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_type_specifier453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_type_specifier460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_specifier_in_type_specifier475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_type_specifier486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier520 = new BitSet(new long[]{0x0000000000000800L,0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier522 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_struct_or_union_specifier525 = new BitSet(new long[]{0x6400000000000000L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier527 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_struct_or_union_specifier529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier534 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list563 = new BitSet(new long[]{0x6400000000000002L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration575 = new BitSet(new long[]{0x0000010005000800L});
	public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration577 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_struct_declaration579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list592 = new BitSet(new long[]{0x6400000000000002L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list596 = new BitSet(new long[]{0x6400000000000002L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list610 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_struct_declarator_list613 = new BitSet(new long[]{0x0000010005000800L});
	public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list615 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_declarator_in_struct_declarator628 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_struct_declarator631 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_struct_declarator633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_struct_declarator640 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_struct_declarator642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_enum_specifier660 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_enum_specifier662 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_enumerator_list_in_enum_specifier664 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_enum_specifier666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_enum_specifier671 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier673 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_enum_specifier675 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_enumerator_list_in_enum_specifier677 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_enum_specifier679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_enum_specifier684 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerator_in_enumerator_list697 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_enumerator_list700 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_enumerator_in_enumerator_list702 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enumerator715 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_enumerator718 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_enumerator720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_type_qualifier737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_type_qualifier744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator762 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_direct_declarator_in_declarator765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_direct_declarator795 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_24_in_direct_declarator826 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_declarator_in_direct_declarator828 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_direct_declarator833 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_declarator_suffix_in_direct_declarator836 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_53_in_declarator_suffix858 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_declarator_suffix860 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_declarator_suffix862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_declarator_suffix874 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_declarator_suffix876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_declarator_suffix888 = new BitSet(new long[]{0x6600000000000000L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_parameter_type_list_in_declarator_suffix890 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declarator_suffix892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_declarator_suffix904 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_identifier_list_in_declarator_suffix906 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declarator_suffix908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_declarator_suffix920 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declarator_suffix922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_pointer935 = new BitSet(new long[]{0x4000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_type_qualifier_in_pointer937 = new BitSet(new long[]{0x4000000004000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_pointer_in_pointer940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_pointer946 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_pointer_in_pointer948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_pointer953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_list_in_parameter_type_list965 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_parameter_type_list968 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_parameter_type_list970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list984 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_parameter_list987 = new BitSet(new long[]{0x6600000000000000L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list989 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration1003 = new BitSet(new long[]{0x0020000005000802L});
	public static final BitSet FOLLOW_declarator_in_parameter_declaration1006 = new BitSet(new long[]{0x0020000005000802L});
	public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration1008 = new BitSet(new long[]{0x0020000005000802L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list1022 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_identifier_list1025 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list1027 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name1041 = new BitSet(new long[]{0x0020000005000002L});
	public static final BitSet FOLLOW_abstract_declarator_in_type_name1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_abstract_declarator1056 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_direct_abstract_declarator1078 = new BitSet(new long[]{0x0020000005000000L});
	public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator1080 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_direct_abstract_declarator1082 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1086 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1090 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_53_in_abstract_declarator_suffix1103 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_abstract_declarator_suffix1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_abstract_declarator_suffix1110 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_abstract_declarator_suffix1112 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_abstract_declarator_suffix1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_abstract_declarator_suffix1119 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_abstract_declarator_suffix1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_abstract_declarator_suffix1126 = new BitSet(new long[]{0x6600000000000000L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_parameter_type_list_in_abstract_declarator_suffix1128 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_abstract_declarator_suffix1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_initializer1154 = new BitSet(new long[]{0x0000000335428A50L,0x0000000084010000L});
	public static final BitSet FOLLOW_initializer_list_in_initializer1156 = new BitSet(new long[]{0x0000000080000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_31_in_initializer1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_initializer1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initializer_in_initializer_list1173 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_initializer_list1176 = new BitSet(new long[]{0x0000000335428A50L,0x0000000084010000L});
	public static final BitSet FOLLOW_initializer_in_initializer_list1178 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1210 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_argument_expression_list1216 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1220 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1253 = new BitSet(new long[]{0x0000000110000002L});
	public static final BitSet FOLLOW_28_in_additive_expression1263 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1267 = new BitSet(new long[]{0x0000000110000002L});
	public static final BitSet FOLLOW_32_in_additive_expression1274 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1278 = new BitSet(new long[]{0x0000000110000002L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1313 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_26_in_multiplicative_expression1323 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1327 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_38_in_multiplicative_expression1334 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1338 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_19_in_multiplicative_expression1345 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1349 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_24_in_cast_expression1379 = new BitSet(new long[]{0x6400000000000000L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_type_name_in_cast_expression1381 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_cast_expression1383 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_unary_expression1416 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_unary_expression1426 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression1436 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_unary_expression1447 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_unary_expression1455 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_unary_expression1457 = new BitSet(new long[]{0x6400000000000000L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_type_name_in_unary_expression1459 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_unary_expression1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression1480 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_53_in_postfix_expression1496 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_postfix_expression1498 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_postfix_expression1500 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_24_in_postfix_expression1514 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_postfix_expression1516 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_24_in_postfix_expression1530 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1532 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_postfix_expression1534 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_36_in_postfix_expression1555 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1557 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_35_in_postfix_expression1571 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1573 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_29_in_postfix_expression1587 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_33_in_postfix_expression1601 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_22_in_unary_operator1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_unary_operator1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_unary_operator1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_unary_operator1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_unary_operator1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_unary_operator1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_primary_expression1699 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_primary_expression1701 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_primary_expression1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_constant1741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_LITERAL_in_constant1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_constant1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1815 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_expression1820 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1822 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_conditional_expression_in_constant_expression1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment_expression1859 = new BitSet(new long[]{0x0108508448900000L,0x0000000010000000L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1861 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_assignment_expression1876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_lvalue1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_assignment_operator1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_assignment_operator1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_assignment_operator1925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_assignment_operator1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_assignment_operator1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_assignment_operator1946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_assignment_operator1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_assignment_operator1960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_assignment_operator1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_assignment_operator1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_assignment_operator1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression2005 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_52_in_conditional_expression2010 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_conditional_expression2012 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_conditional_expression2014 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_expression2016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2035 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_logical_or_expression2038 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2040 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression2061 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_logical_and_expression2064 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression2066 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression2087 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_inclusive_or_expression2090 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression2092 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression2113 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_exclusive_or_expression2116 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression2118 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression2139 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_and_expression2142 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression2144 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression2169 = new BitSet(new long[]{0x0000800000040002L});
	public static final BitSet FOLLOW_47_in_equality_expression2176 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_18_in_equality_expression2182 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression2191 = new BitSet(new long[]{0x0000800000040002L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression2220 = new BitSet(new long[]{0x0003240000000002L});
	public static final BitSet FOLLOW_42_in_relational_expression2227 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_48_in_relational_expression2233 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_45_in_relational_expression2239 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_49_in_relational_expression2245 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression2254 = new BitSet(new long[]{0x0003240000000002L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression2284 = new BitSet(new long[]{0x0004080000000002L});
	public static final BitSet FOLLOW_43_in_shift_expression2291 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_50_in_shift_expression2297 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression2308 = new BitSet(new long[]{0x0004080000000002L});
	public static final BitSet FOLLOW_labeled_statement_in_statement2335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement2340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement2345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement2350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement2360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_labeled_statement2371 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_labeled_statement2373 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_labeled_statement2375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_labeled_statement2380 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_labeled_statement2382 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_labeled_statement2384 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_labeled_statement2386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_labeled_statement2391 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_labeled_statement2393 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_labeled_statement2395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_compound_statement2411 = new BitSet(new long[]{0xFE00020335428A50L,0x00000000C7FFFFF7L});
	public static final BitSet FOLLOW_declaration_in_compound_statement2414 = new BitSet(new long[]{0xFE00020335428A50L,0x00000000C7FFFFF7L});
	public static final BitSet FOLLOW_statement_list_in_compound_statement2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_compound_statement2434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement_list2446 = new BitSet(new long[]{0x9800020335428A52L,0x0000000086092383L});
	public static final BitSet FOLLOW_41_in_expression_statement2459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement2464 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_expression_statement2466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_selection_statement2483 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_selection_statement2485 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_selection_statement2487 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_selection_statement2489 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_selection_statement2498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_selection_statement2519 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_selection_statement2527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_selection_statement2547 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_selection_statement2549 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_selection_statement2551 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_selection_statement2553 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_selection_statement2555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_iteration_statement2567 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_iteration_statement2569 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2571 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_iteration_statement2573 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_iteration_statement2580 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_iteration_statement2584 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_iteration_statement2586 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2588 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_iteration_statement2590 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_iteration_statement2592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_iteration_statement2597 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_iteration_statement2599 = new BitSet(new long[]{0x0000020335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement2601 = new BitSet(new long[]{0x0000020335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement2603 = new BitSet(new long[]{0x0000000337428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2605 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_iteration_statement2608 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_jump_statement2622 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_jump_statement2624 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_jump_statement2631 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_jump_statement2638 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_jump_statement2645 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_jump_statement2654 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_jump_statement2656 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_synpred4_myCompiler100 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_declarator_in_synpred4_myCompiler103 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_declaration_in_synpred4_myCompiler105 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_90_in_synpred4_myCompiler108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred45_myCompiler762 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_direct_declarator_in_synpred45_myCompiler765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_suffix_in_synpred47_myCompiler836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_qualifier_in_synpred52_myCompiler937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred53_myCompiler940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_synpred54_myCompiler935 = new BitSet(new long[]{0x4000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_type_qualifier_in_synpred54_myCompiler937 = new BitSet(new long[]{0x4000000004000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_pointer_in_synpred54_myCompiler940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_synpred55_myCompiler946 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_pointer_in_synpred55_myCompiler948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_in_synpred58_myCompiler1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_in_synpred59_myCompiler1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred62_myCompiler1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_synpred65_myCompiler1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_synpred83_myCompiler1447 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_synpred83_myCompiler1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred102_myCompiler1859 = new BitSet(new long[]{0x0108508448900000L,0x0000000010000000L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred102_myCompiler1861 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred102_myCompiler1865 = new BitSet(new long[]{0x0000000000000002L});
}
