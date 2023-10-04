// $ANTLR null C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g 2023-06-13 15:19:42

    // import packages here.
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

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class myCompilerParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred100_myCompiler", "synpred34_myCompiler", "lvalue", 
		"statement_list", "synpred55_myCompiler", "inclusive_or_expression", "jump_statement", 
		"primary_expression", "synpred49_myCompiler", "synpred32_myCompiler", 
		"synpred57_myCompiler", "synpred67_myCompiler", "synpred124_myCompiler", 
		"synpred1_myCompiler", "synpred17_myCompiler", "expression", "init_declarator_list", 
		"parameter_declaration", "type_specifier", "synpred90_myCompiler", "synpred23_myCompiler", 
		"synpred44_myCompiler", "synpred115_myCompiler", "synpred120_myCompiler", 
		"synpred142_myCompiler", "synpred38_myCompiler", "synpred136_myCompiler", 
		"synpred128_myCompiler", "synpred30_myCompiler", "synpred103_myCompiler", 
		"synpred53_myCompiler", "multiplicative_expression", "synpred5_myCompiler", 
		"synpred10_myCompiler", "synpred114_myCompiler", "relational_expression", 
		"synpred72_myCompiler", "synpred130_myCompiler", "expression_statement", 
		"synpred73_myCompiler", "synpred74_myCompiler", "and_expression", "synpred21_myCompiler", 
		"external_declaration", "synpred43_myCompiler", "synpred108_myCompiler", 
		"synpred14_myCompiler", "additive_expression", "synpred94_myCompiler", 
		"synpred112_myCompiler", "constant_expression", "synpred60_myCompiler", 
		"declarator_suffix", "synpred145_myCompiler", "synpred106_myCompiler", 
		"synpred29_myCompiler", "synpred52_myCompiler", "synpred56_myCompiler", 
		"synpred104_myCompiler", "synpred131_myCompiler", "synpred25_myCompiler", 
		"synpred98_myCompiler", "synpred6_myCompiler", "synpred83_myCompiler", 
		"synpred7_myCompiler", "synpred116_myCompiler", "synpred118_myCompiler", 
		"synpred141_myCompiler", "abstract_declarator", "synpred89_myCompiler", 
		"synpred71_myCompiler", "synpred133_myCompiler", "synpred92_myCompiler", 
		"synpred16_myCompiler", "synpred3_myCompiler", "enum_specifier", "synpred93_myCompiler", 
		"synpred87_myCompiler", "synpred19_myCompiler", "synpred81_myCompiler", 
		"synpred97_myCompiler", "synpred110_myCompiler", "synpred59_myCompiler", 
		"enumerator_list", "synpred99_myCompiler", "synpred143_myCompiler", "specifier_qualifier_list", 
		"statement", "synpred96_myCompiler", "constant", "struct_declarator_list", 
		"synpred102_myCompiler", "synpred9_myCompiler", "parameter_list", "synpred111_myCompiler", 
		"synpred135_myCompiler", "translation_unit", "synpred109_myCompiler", 
		"synpred18_myCompiler", "synpred62_myCompiler", "parameter_type_list", 
		"unary_expression", "synpred37_myCompiler", "declaration_specifiers", 
		"function_definition", "direct_declarator", "init_declarator", "synpred42_myCompiler", 
		"synpred75_myCompiler", "struct_declaration", "synpred88_myCompiler", 
		"struct_or_union", "initializer_list", "storage_class_specifier", "synpred119_myCompiler", 
		"synpred33_myCompiler", "direct_abstract_declarator", "synpred86_myCompiler", 
		"synpred20_myCompiler", "synpred77_myCompiler", "synpred27_myCompiler", 
		"declaration", "synpred11_myCompiler", "synpred126_myCompiler", "synpred134_myCompiler", 
		"struct_declarator", "synpred140_myCompiler", "conditional_expression", 
		"synpred80_myCompiler", "struct_declaration_list", "unary_operator", "synpred68_myCompiler", 
		"synpred2_myCompiler", "abstract_declarator_suffix", "synpred24_myCompiler", 
		"synpred31_myCompiler", "synpred129_myCompiler", "logical_and_expression", 
		"synpred66_myCompiler", "synpred76_myCompiler", "synpred70_myCompiler", 
		"synpred12_myCompiler", "synpred50_myCompiler", "assignment_expression", 
		"synpred35_myCompiler", "synpred45_myCompiler", "assignment_operator", 
		"logical_or_expression", "synpred122_myCompiler", "synpred51_myCompiler", 
		"synpred91_myCompiler", "synpred107_myCompiler", "struct_or_union_specifier", 
		"synpred48_myCompiler", "synpred54_myCompiler", "shift_expression", "synpred121_myCompiler", 
		"identifier_list", "declarator", "synpred125_myCompiler", "labeled_statement", 
		"synpred41_myCompiler", "synpred84_myCompiler", "synpred105_myCompiler", 
		"synpred138_myCompiler", "synpred64_myCompiler", "synpred4_myCompiler", 
		"synpred13_myCompiler", "equality_expression", "compound_statement", "synpred40_myCompiler", 
		"synpred144_myCompiler", "enumerator", "pointer", "synpred26_myCompiler", 
		"synpred101_myCompiler", "synpred132_myCompiler", "synpred36_myCompiler", 
		"synpred22_myCompiler", "synpred79_myCompiler", "synpred85_myCompiler", 
		"synpred28_myCompiler", "synpred117_myCompiler", "synpred123_myCompiler", 
		"synpred82_myCompiler", "synpred78_myCompiler", "synpred65_myCompiler", 
		"cast_expression", "synpred61_myCompiler", "synpred8_myCompiler", "synpred39_myCompiler", 
		"synpred58_myCompiler", "synpred137_myCompiler", "synpred127_myCompiler", 
		"exclusive_or_expression", "synpred95_myCompiler", "synpred15_myCompiler", 
		"type_qualifier", "iteration_statement", "synpred113_myCompiler", "synpred69_myCompiler", 
		"synpred46_myCompiler", "selection_statement", "synpred63_myCompiler", 
		"postfix_expression", "synpred139_myCompiler", "synpred47_myCompiler", 
		"argument_expression_list", "initializer", "type_name"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, true, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, true, false, true, false, true, true, 
		    true, false, false, true, false, false, true, false, false, true, 
		    false, false, false, false, false, false, false, false, false, false, 
		    true, false, false, false, false, false, true, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public myCompilerParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[210+1];


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

	public myCompilerParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
		this.state.ruleMemo = new HashMap[210+1];


	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g"; }


		boolean isReturned = false;

		public enum Type {
			VOID(0), BOOL(1), CHAR(2), SHORT(3), INT(4), LONG(5), FLOAT(6), DOUBLE(7), SIGNED(8), UNSIGNED(9), STRING(10), CHARS(11), ERROR(12);
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

			public boolean isNumber() {
				//TODO: signed and unsigned
				int value = this.getValue();
				if(1 <= value && value <= 7)
					return true;
				return false;
			}

			public boolean isDecimal() {
				//TODO: signed and unsigned
				int value = this.getValue();
				if(1 <= value && value <= 5)
					return true;
				return false;
			}
		}

	    public enum Suffix {
	        ARRAY, FUNCTION;
	    }

	    int localCount = 1;
		int unnamedVarCount = 0;
	    List<String> mainCode = new ArrayList<String>();
	    List<String> unnamedCode = new ArrayList<String>();
	    List<String> globalCode = new ArrayList<String>();

		public enum Specifier {
			EXTERN, STATIC, AUTO, REGISTER;
		}

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
			
			DeclarationSpecifier(List<Specifier> specifiers, Type type, List<Qualifier> qualifiers) {
				this.type = type;
				this.specifiers = specifiers;
				this.qualifiers = qualifiers;
			}
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
	    
	    class Symbol {
	        Type type;
	        String value;
			int len;
			boolean isConstant;
			boolean isStored;
	        int offset;
			String identifier;

	        Symbol() {
	            type = Type.ERROR;
	            value = "";
				isConstant = false;
				offset=localCount++;
				identifier = "%t";
				isStored = false;
	        }

			Symbol(Type type, String value, int offset) {
	            this.type = type;
	            this.value = value;
	            this.offset = offset;
				isConstant = false;
				offset=localCount++;
				identifier = "%t";
				isStored = false;

	        }
	    }

	    public List<String> getCode()
	    {	
			// beautify
			unnamedCode.add(0, ";---------- Unnamed Variables ----------;\n");
			unnamedCode.add("\n");

			globalCode.add(0, ";---------- Global Variables ----------;\n");
			globalCode.add("\n");
			
			mainCode.add(0, ";---------- Main Code ----------;\n");
			
			// concatenation
			List<String> code = Stream.concat(unnamedCode.stream(), globalCode.stream()).collect(Collectors.toList());
			code = Stream.concat(code.stream(), mainCode.stream()).collect(Collectors.toList());
			return code;
	    }

		Map<String, Symbol> symbolTable = new HashMap<String, Symbol>();


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

		boolean isCompatible(Symbol symb1, Symbol symb2) {
			return false;
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
			if(!symb1.type.isNumber() || !symb2.type.isNumber()){
				System.err.println(String.format(";error: invalid operands to binary + at line %d", line));
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
					mainCode.add(String.format("%%t%d = %s nsw %s %%t%d, %s", newSymb.offset, irOp, "i32", offset, symb2.value));
				} else if(symb1.isConstant && !symb2.isConstant) {
					int offset = symb2.offset;
					if(symb2.isStored) {
						newSymb = new Symbol();
						mainCode.add(genLoadCode("%t", newSymb.offset, "i32", symb2.identifier, offset));

						offset = newSymb.offset;
					}
					newSymb = new Symbol();
					newSymb.identifier = "%t";
					mainCode.add(String.format("%%t%d = %s nsw %s %%t%d, %s", newSymb.offset, irOp, "i32", offset, symb1.value));
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
					mainCode.add(String.format("%%t%d = %s nsw %s %%t%d, %%t%d", newSymb.offset, irOp, "i32", offset1, offset2));
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
				System.err.println(String.format(";error: invalid operands to binary + at line %d", line));
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
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:373:1: translation_unit : ( external_declaration )+ ;
	public final void translation_unit() throws RecognitionException {
		int translation_unit_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "translation_unit");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(373, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:374:2: ( ( external_declaration )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:374:4: ( external_declaration )+
			{
			dbg.location(374,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:374:4: ( external_declaration )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==IDENTIFIER||LA1_0==24||LA1_0==26||(LA1_0 >= 57 && LA1_0 <= 58)||(LA1_0 >= 61 && LA1_0 <= 62)||LA1_0==66||(LA1_0 >= 68 && LA1_0 <= 70)||(LA1_0 >= 74 && LA1_0 <= 76)||(LA1_0 >= 78 && LA1_0 <= 79)||(LA1_0 >= 81 && LA1_0 <= 82)||(LA1_0 >= 84 && LA1_0 <= 88)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:374:4: external_declaration
					{
					dbg.location(374,4);
					pushFollow(FOLLOW_external_declaration_in_translation_unit74);
					external_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

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
		dbg.location(375, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "translation_unit");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "translation_unit"



	// $ANTLR start "external_declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:378:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );
	public final void external_declaration() throws RecognitionException {
		int external_declaration_StartIndex = input.index();

		ParserRuleReturnScope declaration1 =null;

		try { dbg.enterRule(getGrammarFileName(), "external_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(378, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:2: ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:4: ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition
					{
					dbg.location(380,62);
					pushFollow(FOLLOW_function_definition_in_external_declaration109);
					function_definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:381:4: declaration
					{
					dbg.location(381,4);
					pushFollow(FOLLOW_declaration_in_external_declaration114);
					declaration1=declaration();
					state._fsp--;
					if (state.failed) return;dbg.location(382,3);
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
		dbg.location(407, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "external_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "external_declaration"



	// $ANTLR start "function_definition"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:410:1: function_definition : ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) ;
	public final void function_definition() throws RecognitionException {
		int function_definition_StartIndex = input.index();

		Declarator declarator2 =null;

		try { dbg.enterRule(getGrammarFileName(), "function_definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(410, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:411:2: ( ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:411:4: ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement )
			{
			dbg.location(411,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:411:4: ( declaration_specifiers )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 57 && LA3_0 <= 58)||(LA3_0 >= 61 && LA3_0 <= 62)||LA3_0==66||(LA3_0 >= 68 && LA3_0 <= 70)||(LA3_0 >= 74 && LA3_0 <= 76)||(LA3_0 >= 78 && LA3_0 <= 79)||(LA3_0 >= 81 && LA3_0 <= 82)||(LA3_0 >= 85 && LA3_0 <= 88)) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:411:4: declaration_specifiers
					{
					dbg.location(411,4);
					pushFollow(FOLLOW_declaration_specifiers_in_function_definition130);
					declaration_specifiers();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(411,28);
			pushFollow(FOLLOW_declarator_in_function_definition133);
			declarator2=declarator();
			state._fsp--;
			if (state.failed) return;dbg.location(412,13);
			if ( state.backtracking==0 ) {   
			                if(declarator2.id.equals("main") && declarator2.suffix.equals(Suffix.FUNCTION)) {
			                    mainCode.add("declare dso_local i32 @printf(i8*, ...)\n"); //TODO
			                    mainCode.add("define dso_local i32 @main()\n"); //TODO
			                    mainCode.add("{");
			                }
			            }dbg.location(419,3);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:419:3: ( ( declaration )+ compound_statement | compound_statement )
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:419:5: ( declaration )+ compound_statement
					{
					dbg.location(419,5);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:419:5: ( declaration )+
					int cnt4=0;
					try { dbg.enterSubRule(4);

					loop4:
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= 57 && LA4_0 <= 58)||(LA4_0 >= 61 && LA4_0 <= 62)||LA4_0==66||(LA4_0 >= 68 && LA4_0 <= 70)||(LA4_0 >= 74 && LA4_0 <= 76)||(LA4_0 >= 78 && LA4_0 <= 79)||(LA4_0 >= 81 && LA4_0 <= 82)||(LA4_0 >= 84 && LA4_0 <= 88)) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:419:5: declaration
							{
							dbg.location(419,5);
							pushFollow(FOLLOW_declaration_in_function_definition153);
							declaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(4, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt4++;
					}
					} finally {dbg.exitSubRule(4);}
					dbg.location(419,18);
					pushFollow(FOLLOW_compound_statement_in_function_definition156);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:420:5: compound_statement
					{
					dbg.location(420,5);
					pushFollow(FOLLOW_compound_statement_in_function_definition163);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(422,4);
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
		dbg.location(427, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_definition"


	public static class declaration_return extends ParserRuleReturnScope {
		public DeclarationSpecifier declarationSpecifier;
		public List<Declarator> declarators;
		public List<Symbol> symbols;
	};


	// $ANTLR start "declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:430:1: declaration returns [DeclarationSpecifier declarationSpecifier, List<Declarator> declarators, List<Symbol> symbols] : ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' );
	public final myCompilerParser.declaration_return declaration() throws RecognitionException {
		myCompilerParser.declaration_return retval = new myCompilerParser.declaration_return();
		retval.start = input.LT(1);
		int declaration_StartIndex = input.index();

		DeclarationSpecifier declaration_specifiers3 =null;
		ParserRuleReturnScope init_declarator_list4 =null;

		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(430, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:437:2: ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:437:4: 'typedef' ( declaration_specifiers )? init_declarator_list ';'
					{
					dbg.location(437,4);
					match(input,84,FOLLOW_84_in_declaration197); if (state.failed) return retval;dbg.location(437,14);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:437:14: ( declaration_specifiers )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= 57 && LA6_0 <= 58)||(LA6_0 >= 61 && LA6_0 <= 62)||LA6_0==66||(LA6_0 >= 68 && LA6_0 <= 70)||(LA6_0 >= 74 && LA6_0 <= 76)||(LA6_0 >= 78 && LA6_0 <= 79)||(LA6_0 >= 81 && LA6_0 <= 82)||(LA6_0 >= 85 && LA6_0 <= 88)) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:437:14: declaration_specifiers
							{
							dbg.location(437,14);
							pushFollow(FOLLOW_declaration_specifiers_in_declaration199);
							declaration_specifiers();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(438,4);
					pushFollow(FOLLOW_init_declarator_list_in_declaration206);
					init_declarator_list();
					state._fsp--;
					if (state.failed) return retval;dbg.location(438,25);
					match(input,41,FOLLOW_41_in_declaration208); if (state.failed) return retval;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:439:4: declaration_specifiers ( init_declarator_list )? ';'
					{
					dbg.location(439,4);
					pushFollow(FOLLOW_declaration_specifiers_in_declaration214);
					declaration_specifiers3=declaration_specifiers();
					state._fsp--;
					if (state.failed) return retval;dbg.location(439,27);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:439:27: ( init_declarator_list )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==IDENTIFIER||LA7_0==24||LA7_0==26) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:439:27: init_declarator_list
							{
							dbg.location(439,27);
							pushFollow(FOLLOW_init_declarator_list_in_declaration216);
							init_declarator_list4=init_declarator_list();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(439,49);
					match(input,41,FOLLOW_41_in_declaration219); if (state.failed) return retval;dbg.location(440,3);
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
		dbg.location(445, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "declaration_specifiers"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:448:1: declaration_specifiers returns [DeclarationSpecifier declarationSpecifier] : ( storage_class_specifier | type_specifier | type_qualifier )+ ;
	public final DeclarationSpecifier declaration_specifiers() throws RecognitionException {
		DeclarationSpecifier declarationSpecifier = null;

		int declaration_specifiers_StartIndex = input.index();

		Specifier storage_class_specifier5 =null;
		Type type_specifier6 =null;
		Qualifier type_qualifier7 =null;

			Type type = Type.ERROR; List<Specifier> specifiers = new ArrayList<Specifier>(); List<Qualifier> qualifiers = new ArrayList<Qualifier>(); 
		try { dbg.enterRule(getGrammarFileName(), "declaration_specifiers");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(448, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return declarationSpecifier; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:450:2: ( ( storage_class_specifier | type_specifier | type_qualifier )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:450:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			{
			dbg.location(450,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:450:4: ( storage_class_specifier | type_specifier | type_qualifier )+
			int cnt9=0;
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=4;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

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
				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:450:5: storage_class_specifier
					{
					dbg.location(450,5);
					pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers245);
					storage_class_specifier5=storage_class_specifier();
					state._fsp--;
					if (state.failed) return declarationSpecifier;dbg.location(450,29);
					if ( state.backtracking==0 ) { specifiers.add(storage_class_specifier5); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:451:4: type_specifier
					{
					dbg.location(451,4);
					pushFollow(FOLLOW_type_specifier_in_declaration_specifiers252);
					type_specifier6=type_specifier();
					state._fsp--;
					if (state.failed) return declarationSpecifier;dbg.location(451,19);
					if ( state.backtracking==0 ) { type = type_specifier6; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:452:7: type_qualifier
					{
					dbg.location(452,7);
					pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers262);
					type_qualifier7=type_qualifier();
					state._fsp--;
					if (state.failed) return declarationSpecifier;dbg.location(452,22);
					if ( state.backtracking==0 ) { qualifiers.add(type_qualifier7); }
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return declarationSpecifier;}
					EarlyExitException eee = new EarlyExitException(9, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt9++;
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(453,8);
			if ( state.backtracking==0 ) { declarationSpecifier = new DeclarationSpecifier(specifiers, type, qualifiers); }
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
		dbg.location(454, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration_specifiers");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return declarationSpecifier;
	}
	// $ANTLR end "declaration_specifiers"


	public static class init_declarator_list_return extends ParserRuleReturnScope {
		public List<Declarator> declarators;
		public List<Symbol> symbols;
	};


	// $ANTLR start "init_declarator_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:457:1: init_declarator_list returns [List<Declarator> declarators, List<Symbol> symbols] : dclr= init_declarator ( ',' dclr2= init_declarator )* ;
	public final myCompilerParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
		myCompilerParser.init_declarator_list_return retval = new myCompilerParser.init_declarator_list_return();
		retval.start = input.LT(1);
		int init_declarator_list_StartIndex = input.index();

		ParserRuleReturnScope dclr =null;
		ParserRuleReturnScope dclr2 =null;

		 retval.declarators = new ArrayList<Declarator>(); retval.symbols = new ArrayList<Symbol>(); 
		try { dbg.enterRule(getGrammarFileName(), "init_declarator_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(457, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:459:2: (dclr= init_declarator ( ',' dclr2= init_declarator )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:459:4: dclr= init_declarator ( ',' dclr2= init_declarator )*
			{
			dbg.location(459,8);
			pushFollow(FOLLOW_init_declarator_in_init_declarator_list295);
			dclr=init_declarator();
			state._fsp--;
			if (state.failed) return retval;dbg.location(460,3);
			if ( state.backtracking==0 ) { 
						retval.declarators.add((dclr!=null?((myCompilerParser.init_declarator_return)dclr).declarator:null)); 
						retval.symbols.add((dclr!=null?((myCompilerParser.init_declarator_return)dclr).symb:null)); 
					}dbg.location(464,2);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:464:2: ( ',' dclr2= init_declarator )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==31) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:464:3: ',' dclr2= init_declarator
					{
					dbg.location(464,3);
					match(input,31,FOLLOW_31_in_init_declarator_list305); if (state.failed) return retval;dbg.location(464,12);
					pushFollow(FOLLOW_init_declarator_in_init_declarator_list309);
					dclr2=init_declarator();
					state._fsp--;
					if (state.failed) return retval;dbg.location(465,3);
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
			} finally {dbg.exitSubRule(10);}

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
		dbg.location(470, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init_declarator_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "init_declarator_list"


	public static class init_declarator_return extends ParserRuleReturnScope {
		public Declarator declarator;
		public Symbol symb;
	};


	// $ANTLR start "init_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:473:1: init_declarator returns [Declarator declarator, Symbol symb] : declarator ( '=' initializer )? ;
	public final myCompilerParser.init_declarator_return init_declarator() throws RecognitionException {
		myCompilerParser.init_declarator_return retval = new myCompilerParser.init_declarator_return();
		retval.start = input.LT(1);
		int init_declarator_StartIndex = input.index();

		Declarator declarator8 =null;
		Symbol initializer9 =null;

		try { dbg.enterRule(getGrammarFileName(), "init_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(473, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:474:2: ( declarator ( '=' initializer )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:474:4: declarator ( '=' initializer )?
			{
			dbg.location(474,4);
			pushFollow(FOLLOW_declarator_in_init_declarator334);
			declarator8=declarator();
			state._fsp--;
			if (state.failed) return retval;dbg.location(474,15);
			if ( state.backtracking==0 ) { retval.declarator = declarator8; }dbg.location(474,57);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:474:57: ( '=' initializer )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==46) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:474:58: '=' initializer
					{
					dbg.location(474,58);
					match(input,46,FOLLOW_46_in_init_declarator339); if (state.failed) return retval;dbg.location(474,62);
					pushFollow(FOLLOW_initializer_in_init_declarator341);
					initializer9=initializer();
					state._fsp--;
					if (state.failed) return retval;dbg.location(474,74);
					if ( state.backtracking==0 ) { retval.symb = initializer9; }
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

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
		dbg.location(475, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "init_declarator"



	// $ANTLR start "storage_class_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:477:1: storage_class_specifier returns [Specifier specifier] : ( 'extern' | 'static' | 'auto' | 'register' );
	public final Specifier storage_class_specifier() throws RecognitionException {
		Specifier specifier = null;

		int storage_class_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "storage_class_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(477, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return specifier; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:478:2: ( 'extern' | 'static' | 'auto' | 'register' )
			int alt12=4;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:478:4: 'extern'
					{
					dbg.location(478,4);
					match(input,69,FOLLOW_69_in_storage_class_specifier362); if (state.failed) return specifier;dbg.location(478,13);
					if ( state.backtracking==0 ) { specifier = Specifier.EXTERN; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:479:4: 'static'
					{
					dbg.location(479,4);
					match(input,81,FOLLOW_81_in_storage_class_specifier369); if (state.failed) return specifier;dbg.location(479,13);
					if ( state.backtracking==0 ) { specifier = Specifier.STATIC; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:480:4: 'auto'
					{
					dbg.location(480,4);
					match(input,57,FOLLOW_57_in_storage_class_specifier376); if (state.failed) return specifier;dbg.location(480,11);
					if ( state.backtracking==0 ) { specifier = Specifier.AUTO; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:481:4: 'register'
					{
					dbg.location(481,4);
					match(input,76,FOLLOW_76_in_storage_class_specifier383); if (state.failed) return specifier;dbg.location(481,15);
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
		dbg.location(482, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "storage_class_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return specifier;
	}
	// $ANTLR end "storage_class_specifier"



	// $ANTLR start "type_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:484:1: type_specifier returns [Type type] : ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | struct_or_union_specifier | enum_specifier | 'bool' );
	public final Type type_specifier() throws RecognitionException {
		Type type = null;

		int type_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(484, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return type; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:485:2: ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | struct_or_union_specifier | enum_specifier | 'bool' )
			int alt13=12;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:485:4: 'void'
					{
					dbg.location(485,4);
					match(input,87,FOLLOW_87_in_type_specifier400); if (state.failed) return type;dbg.location(485,11);
					if ( state.backtracking==0 ) { type = Type.VOID; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:486:4: 'char'
					{
					dbg.location(486,4);
					match(input,61,FOLLOW_61_in_type_specifier407); if (state.failed) return type;dbg.location(486,11);
					if ( state.backtracking==0 ) { type = Type.CHAR; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:487:4: 'short'
					{
					dbg.location(487,4);
					match(input,78,FOLLOW_78_in_type_specifier414); if (state.failed) return type;dbg.location(487,12);
					if ( state.backtracking==0 ) { type = Type.SHORT; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:488:4: 'int'
					{
					dbg.location(488,4);
					match(input,74,FOLLOW_74_in_type_specifier421); if (state.failed) return type;dbg.location(488,10);
					if ( state.backtracking==0 ) { type = Type.INT; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:489:4: 'long'
					{
					dbg.location(489,4);
					match(input,75,FOLLOW_75_in_type_specifier428); if (state.failed) return type;dbg.location(489,11);
					if ( state.backtracking==0 ) { type = Type.LONG; }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:490:4: 'float'
					{
					dbg.location(490,4);
					match(input,70,FOLLOW_70_in_type_specifier435); if (state.failed) return type;dbg.location(490,12);
					if ( state.backtracking==0 ) { type = Type.FLOAT; }
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:491:4: 'double'
					{
					dbg.location(491,4);
					match(input,66,FOLLOW_66_in_type_specifier442); if (state.failed) return type;dbg.location(491,13);
					if ( state.backtracking==0 ) { type = Type.DOUBLE; }
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:492:4: 'signed'
					{
					dbg.location(492,4);
					match(input,79,FOLLOW_79_in_type_specifier449); if (state.failed) return type;dbg.location(492,13);
					if ( state.backtracking==0 ) { type = Type.SIGNED; }
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:493:4: 'unsigned'
					{
					dbg.location(493,4);
					match(input,86,FOLLOW_86_in_type_specifier456); if (state.failed) return type;dbg.location(493,15);
					if ( state.backtracking==0 ) { type = Type.UNSIGNED; }
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:494:4: struct_or_union_specifier
					{
					dbg.location(494,4);
					pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier463);
					struct_or_union_specifier();
					state._fsp--;
					if (state.failed) return type;dbg.location(494,30);
					if ( state.backtracking==0 ) { type = Type.ERROR; }
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:495:4: enum_specifier
					{
					dbg.location(495,4);
					pushFollow(FOLLOW_enum_specifier_in_type_specifier471);
					enum_specifier();
					state._fsp--;
					if (state.failed) return type;dbg.location(495,19);
					if ( state.backtracking==0 ) { type = Type.ERROR; }
					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:496:7: 'bool'
					{
					dbg.location(496,7);
					match(input,58,FOLLOW_58_in_type_specifier482); if (state.failed) return type;dbg.location(496,14);
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
		dbg.location(498, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return type;
	}
	// $ANTLR end "type_specifier"



	// $ANTLR start "struct_or_union_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:507:1: struct_or_union_specifier options {k=3; } : ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER );
	public final void struct_or_union_specifier() throws RecognitionException {
		int struct_or_union_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "struct_or_union_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(507, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:513:2: ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER )
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

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
							dbg.recognitionException(nvae);
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
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:513:4: struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}'
					{
					dbg.location(513,4);
					pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier516);
					struct_or_union();
					state._fsp--;
					if (state.failed) return;dbg.location(513,20);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:513:20: ( IDENTIFIER )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==IDENTIFIER) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:513:20: IDENTIFIER
							{
							dbg.location(513,20);
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier518); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(513,32);
					match(input,90,FOLLOW_90_in_struct_or_union_specifier521); if (state.failed) return;dbg.location(513,36);
					pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier523);
					struct_declaration_list();
					state._fsp--;
					if (state.failed) return;dbg.location(513,60);
					match(input,94,FOLLOW_94_in_struct_or_union_specifier525); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:514:4: struct_or_union IDENTIFIER
					{
					dbg.location(514,4);
					pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier530);
					struct_or_union();
					state._fsp--;
					if (state.failed) return;dbg.location(514,20);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier532); if (state.failed) return;
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
		dbg.location(515, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "struct_or_union_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "struct_or_union_specifier"



	// $ANTLR start "struct_or_union"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:517:1: struct_or_union : ( 'struct' | 'union' );
	public final void struct_or_union() throws RecognitionException {
		int struct_or_union_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "struct_or_union");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(517, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:518:2: ( 'struct' | 'union' )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:
			{
			dbg.location(518,2);
			if ( input.LA(1)==82||input.LA(1)==85 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
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
		dbg.location(520, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "struct_or_union");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "struct_or_union"



	// $ANTLR start "struct_declaration_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:522:1: struct_declaration_list : ( struct_declaration )+ ;
	public final void struct_declaration_list() throws RecognitionException {
		int struct_declaration_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "struct_declaration_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(522, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:523:2: ( ( struct_declaration )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:523:4: ( struct_declaration )+
			{
			dbg.location(523,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:523:4: ( struct_declaration )+
			int cnt16=0;
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==58||(LA16_0 >= 61 && LA16_0 <= 62)||LA16_0==66||LA16_0==68||LA16_0==70||(LA16_0 >= 74 && LA16_0 <= 75)||(LA16_0 >= 78 && LA16_0 <= 79)||LA16_0==82||(LA16_0 >= 85 && LA16_0 <= 88)) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:523:4: struct_declaration
					{
					dbg.location(523,4);
					pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list559);
					struct_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(16, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt16++;
			}
			} finally {dbg.exitSubRule(16);}

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
		dbg.location(524, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "struct_declaration_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "struct_declaration_list"



	// $ANTLR start "struct_declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:526:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' ;
	public final void struct_declaration() throws RecognitionException {
		int struct_declaration_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "struct_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(526, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:527:2: ( specifier_qualifier_list struct_declarator_list ';' )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:527:4: specifier_qualifier_list struct_declarator_list ';'
			{
			dbg.location(527,4);
			pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration571);
			specifier_qualifier_list();
			state._fsp--;
			if (state.failed) return;dbg.location(527,29);
			pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration573);
			struct_declarator_list();
			state._fsp--;
			if (state.failed) return;dbg.location(527,52);
			match(input,41,FOLLOW_41_in_struct_declaration575); if (state.failed) return;
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
		dbg.location(528, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "struct_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "struct_declaration"



	// $ANTLR start "specifier_qualifier_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:530:1: specifier_qualifier_list : ( type_qualifier | type_specifier )+ ;
	public final void specifier_qualifier_list() throws RecognitionException {
		int specifier_qualifier_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "specifier_qualifier_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(530, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:531:2: ( ( type_qualifier | type_specifier )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:531:4: ( type_qualifier | type_specifier )+
			{
			dbg.location(531,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:531:4: ( type_qualifier | type_specifier )+
			int cnt17=0;
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=3;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( (LA17_0==62||LA17_0==88) ) {
					alt17=1;
				}
				else if ( (LA17_0==58||LA17_0==61||LA17_0==66||LA17_0==68||LA17_0==70||(LA17_0 >= 74 && LA17_0 <= 75)||(LA17_0 >= 78 && LA17_0 <= 79)||LA17_0==82||(LA17_0 >= 85 && LA17_0 <= 87)) ) {
					alt17=2;
				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:531:6: type_qualifier
					{
					dbg.location(531,6);
					pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list588);
					type_qualifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:531:23: type_specifier
					{
					dbg.location(531,23);
					pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list592);
					type_specifier();
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
		dbg.location(532, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specifier_qualifier_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "specifier_qualifier_list"



	// $ANTLR start "struct_declarator_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:534:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* ;
	public final void struct_declarator_list() throws RecognitionException {
		int struct_declarator_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "struct_declarator_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(534, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:535:2: ( struct_declarator ( ',' struct_declarator )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:535:4: struct_declarator ( ',' struct_declarator )*
			{
			dbg.location(535,4);
			pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list606);
			struct_declarator();
			state._fsp--;
			if (state.failed) return;dbg.location(535,22);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:535:22: ( ',' struct_declarator )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==31) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:535:23: ',' struct_declarator
					{
					dbg.location(535,23);
					match(input,31,FOLLOW_31_in_struct_declarator_list609); if (state.failed) return;dbg.location(535,27);
					pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list611);
					struct_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

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
		dbg.location(536, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "struct_declarator_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "struct_declarator_list"



	// $ANTLR start "struct_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:538:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
	public final void struct_declarator() throws RecognitionException {
		int struct_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "struct_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(538, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:539:2: ( declarator ( ':' constant_expression )? | ':' constant_expression )
			int alt20=2;
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:539:4: declarator ( ':' constant_expression )?
					{
					dbg.location(539,4);
					pushFollow(FOLLOW_declarator_in_struct_declarator624);
					declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(539,15);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:539:15: ( ':' constant_expression )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==40) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:539:16: ':' constant_expression
							{
							dbg.location(539,16);
							match(input,40,FOLLOW_40_in_struct_declarator627); if (state.failed) return;dbg.location(539,20);
							pushFollow(FOLLOW_constant_expression_in_struct_declarator629);
							constant_expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(19);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:540:4: ':' constant_expression
					{
					dbg.location(540,4);
					match(input,40,FOLLOW_40_in_struct_declarator636); if (state.failed) return;dbg.location(540,8);
					pushFollow(FOLLOW_constant_expression_in_struct_declarator638);
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
		dbg.location(541, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "struct_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "struct_declarator"



	// $ANTLR start "enum_specifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:543:1: enum_specifier options {k=3; } : ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER );
	public final void enum_specifier() throws RecognitionException {
		int enum_specifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "enum_specifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(543, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:545:2: ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER )
			int alt21=3;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

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
							dbg.recognitionException(nvae);
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

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:545:4: 'enum' '{' enumerator_list '}'
					{
					dbg.location(545,4);
					match(input,68,FOLLOW_68_in_enum_specifier656); if (state.failed) return;dbg.location(545,11);
					match(input,90,FOLLOW_90_in_enum_specifier658); if (state.failed) return;dbg.location(545,15);
					pushFollow(FOLLOW_enumerator_list_in_enum_specifier660);
					enumerator_list();
					state._fsp--;
					if (state.failed) return;dbg.location(545,31);
					match(input,94,FOLLOW_94_in_enum_specifier662); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:546:4: 'enum' IDENTIFIER '{' enumerator_list '}'
					{
					dbg.location(546,4);
					match(input,68,FOLLOW_68_in_enum_specifier667); if (state.failed) return;dbg.location(546,11);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier669); if (state.failed) return;dbg.location(546,22);
					match(input,90,FOLLOW_90_in_enum_specifier671); if (state.failed) return;dbg.location(546,26);
					pushFollow(FOLLOW_enumerator_list_in_enum_specifier673);
					enumerator_list();
					state._fsp--;
					if (state.failed) return;dbg.location(546,42);
					match(input,94,FOLLOW_94_in_enum_specifier675); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:547:4: 'enum' IDENTIFIER
					{
					dbg.location(547,4);
					match(input,68,FOLLOW_68_in_enum_specifier680); if (state.failed) return;dbg.location(547,11);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier682); if (state.failed) return;
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
		dbg.location(548, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "enum_specifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "enum_specifier"



	// $ANTLR start "enumerator_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:550:1: enumerator_list : enumerator ( ',' enumerator )* ;
	public final void enumerator_list() throws RecognitionException {
		int enumerator_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "enumerator_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(550, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:551:2: ( enumerator ( ',' enumerator )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:551:4: enumerator ( ',' enumerator )*
			{
			dbg.location(551,4);
			pushFollow(FOLLOW_enumerator_in_enumerator_list693);
			enumerator();
			state._fsp--;
			if (state.failed) return;dbg.location(551,15);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:551:15: ( ',' enumerator )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==31) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:551:16: ',' enumerator
					{
					dbg.location(551,16);
					match(input,31,FOLLOW_31_in_enumerator_list696); if (state.failed) return;dbg.location(551,20);
					pushFollow(FOLLOW_enumerator_in_enumerator_list698);
					enumerator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

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
		dbg.location(552, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "enumerator_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "enumerator_list"



	// $ANTLR start "enumerator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:554:1: enumerator : IDENTIFIER ( '=' constant_expression )? ;
	public final void enumerator() throws RecognitionException {
		int enumerator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "enumerator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(554, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:555:2: ( IDENTIFIER ( '=' constant_expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:555:4: IDENTIFIER ( '=' constant_expression )?
			{
			dbg.location(555,4);
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerator711); if (state.failed) return;dbg.location(555,15);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:555:15: ( '=' constant_expression )?
			int alt23=2;
			try { dbg.enterSubRule(23);
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			int LA23_0 = input.LA(1);
			if ( (LA23_0==46) ) {
				alt23=1;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:555:16: '=' constant_expression
					{
					dbg.location(555,16);
					match(input,46,FOLLOW_46_in_enumerator714); if (state.failed) return;dbg.location(555,20);
					pushFollow(FOLLOW_constant_expression_in_enumerator716);
					constant_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(23);}

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
		dbg.location(556, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "enumerator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "enumerator"



	// $ANTLR start "type_qualifier"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:558:1: type_qualifier returns [Qualifier qualifier] : ( 'const' | 'volatile' );
	public final Qualifier type_qualifier() throws RecognitionException {
		Qualifier qualifier = null;

		int type_qualifier_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_qualifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(558, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return qualifier; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:559:2: ( 'const' | 'volatile' )
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:559:4: 'const'
					{
					dbg.location(559,4);
					match(input,62,FOLLOW_62_in_type_qualifier733); if (state.failed) return qualifier;dbg.location(559,12);
					if ( state.backtracking==0 ) { qualifier = Qualifier.CONST; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:560:4: 'volatile'
					{
					dbg.location(560,4);
					match(input,88,FOLLOW_88_in_type_qualifier740); if (state.failed) return qualifier;dbg.location(560,15);
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
		dbg.location(561, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_qualifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return qualifier;
	}
	// $ANTLR end "type_qualifier"



	// $ANTLR start "declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:564:1: declarator returns [Declarator declarator] : ( ( pointer )? direct_declarator | pointer );
	public final Declarator declarator() throws RecognitionException {
		Declarator declarator = null;

		int declarator_StartIndex = input.index();

		Declarator direct_declarator10 =null;

		try { dbg.enterRule(getGrammarFileName(), "declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(564, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return declarator; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:2: ( ( pointer )? direct_declarator | pointer )
			int alt26=2;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:4: ( pointer )? direct_declarator
					{
					dbg.location(565,4);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:4: ( pointer )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==26) ) {
						alt25=1;
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:4: pointer
							{
							dbg.location(565,4);
							pushFollow(FOLLOW_pointer_in_declarator758);
							pointer();
							state._fsp--;
							if (state.failed) return declarator;
							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(565,13);
					pushFollow(FOLLOW_direct_declarator_in_declarator761);
					direct_declarator10=direct_declarator();
					state._fsp--;
					if (state.failed) return declarator;dbg.location(565,31);
					if ( state.backtracking==0 ) { declarator = direct_declarator10; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:566:4: pointer
					{
					dbg.location(566,4);
					pushFollow(FOLLOW_pointer_in_declarator769);
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
		dbg.location(567, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return declarator;
	}
	// $ANTLR end "declarator"



	// $ANTLR start "direct_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:570:1: direct_declarator returns [Declarator declarator] : ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* ;
	public final Declarator direct_declarator() throws RecognitionException {
		Declarator declarator = null;

		int direct_declarator_StartIndex = input.index();

		Token IDENTIFIER11=null;
		Suffix declarator_suffix12 =null;

		 Suffix suffix = null; String id = null; 
		try { dbg.enterRule(getGrammarFileName(), "direct_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(570, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return declarator; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:572:2: ( ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:572:4: ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )*
			{
			dbg.location(572,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:572:4: ( IDENTIFIER | '(' declarator ')' )
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:572:5: IDENTIFIER
					{
					dbg.location(572,5);
					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_direct_declarator791); if (state.failed) return declarator;dbg.location(572,16);
					if ( state.backtracking==0 ) { id = (IDENTIFIER11!=null?IDENTIFIER11.getText():null); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:579:4: '(' declarator ')'
					{
					dbg.location(579,4);
					match(input,24,FOLLOW_24_in_direct_declarator822); if (state.failed) return declarator;dbg.location(579,8);
					pushFollow(FOLLOW_declarator_in_direct_declarator824);
					declarator();
					state._fsp--;
					if (state.failed) return declarator;dbg.location(579,19);
					if ( state.backtracking==0 ) { id = declarator.id; }dbg.location(580,2);
					match(input,25,FOLLOW_25_in_direct_declarator829); if (state.failed) return declarator;
					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(580,7);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:580:7: ( declarator_suffix )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				try {
					isCyclicDecision = true;
					alt28 = dfa28.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:580:7: declarator_suffix
					{
					dbg.location(580,7);
					pushFollow(FOLLOW_declarator_suffix_in_direct_declarator832);
					declarator_suffix12=declarator_suffix();
					state._fsp--;
					if (state.failed) return declarator;
					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(580,26);
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
		dbg.location(581, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "direct_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return declarator;
	}
	// $ANTLR end "direct_declarator"



	// $ANTLR start "declarator_suffix"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:584:1: declarator_suffix returns [Suffix suffix] : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );
	public final Suffix declarator_suffix() throws RecognitionException {
		Suffix suffix = null;

		int declarator_suffix_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "declarator_suffix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(584, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return suffix; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:585:2: ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' )
			int alt29=5;
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

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
						dbg.recognitionException(nvae);
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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:585:6: '[' constant_expression ']'
					{
					dbg.location(585,6);
					match(input,53,FOLLOW_53_in_declarator_suffix854); if (state.failed) return suffix;dbg.location(585,10);
					pushFollow(FOLLOW_constant_expression_in_declarator_suffix856);
					constant_expression();
					state._fsp--;
					if (state.failed) return suffix;dbg.location(585,30);
					match(input,54,FOLLOW_54_in_declarator_suffix858); if (state.failed) return suffix;dbg.location(585,34);
					if ( state.backtracking==0 ) { suffix = Suffix.ARRAY; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:586:9: '[' ']'
					{
					dbg.location(586,9);
					match(input,53,FOLLOW_53_in_declarator_suffix870); if (state.failed) return suffix;dbg.location(586,13);
					match(input,54,FOLLOW_54_in_declarator_suffix872); if (state.failed) return suffix;dbg.location(586,17);
					if ( state.backtracking==0 ) { suffix = Suffix.ARRAY; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:587:9: '(' parameter_type_list ')'
					{
					dbg.location(587,9);
					match(input,24,FOLLOW_24_in_declarator_suffix884); if (state.failed) return suffix;dbg.location(587,13);
					pushFollow(FOLLOW_parameter_type_list_in_declarator_suffix886);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return suffix;dbg.location(587,33);
					match(input,25,FOLLOW_25_in_declarator_suffix888); if (state.failed) return suffix;dbg.location(587,37);
					if ( state.backtracking==0 ) { suffix = Suffix.FUNCTION; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:588:9: '(' identifier_list ')'
					{
					dbg.location(588,9);
					match(input,24,FOLLOW_24_in_declarator_suffix900); if (state.failed) return suffix;dbg.location(588,13);
					pushFollow(FOLLOW_identifier_list_in_declarator_suffix902);
					identifier_list();
					state._fsp--;
					if (state.failed) return suffix;dbg.location(588,29);
					match(input,25,FOLLOW_25_in_declarator_suffix904); if (state.failed) return suffix;dbg.location(588,33);
					if ( state.backtracking==0 ) { suffix = Suffix.FUNCTION; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:589:9: '(' ')'
					{
					dbg.location(589,9);
					match(input,24,FOLLOW_24_in_declarator_suffix916); if (state.failed) return suffix;dbg.location(589,13);
					match(input,25,FOLLOW_25_in_declarator_suffix918); if (state.failed) return suffix;dbg.location(589,17);
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
		dbg.location(590, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declarator_suffix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return suffix;
	}
	// $ANTLR end "declarator_suffix"



	// $ANTLR start "pointer"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:592:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );
	public final void pointer() throws RecognitionException {
		int pointer_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "pointer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(592, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:2: ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' )
			int alt32=3;
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

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
					new NoViableAltException("", 32, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:4: '*' ( type_qualifier )+ ( pointer )?
					{
					dbg.location(593,4);
					match(input,26,FOLLOW_26_in_pointer931); if (state.failed) return;dbg.location(593,8);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:8: ( type_qualifier )+
					int cnt30=0;
					try { dbg.enterSubRule(30);

					loop30:
					while (true) {
						int alt30=2;
						try { dbg.enterDecision(30, decisionCanBacktrack[30]);

						try {
							isCyclicDecision = true;
							alt30 = dfa30.predict(input);
						}
						catch (NoViableAltException nvae) {
							dbg.recognitionException(nvae);
							throw nvae;
						}
						} finally {dbg.exitDecision(30);}

						switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:8: type_qualifier
							{
							dbg.location(593,8);
							pushFollow(FOLLOW_type_qualifier_in_pointer933);
							type_qualifier();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(30, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt30++;
					}
					} finally {dbg.exitSubRule(30);}
					dbg.location(593,24);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:24: ( pointer )?
					int alt31=2;
					try { dbg.enterSubRule(31);
					try { dbg.enterDecision(31, decisionCanBacktrack[31]);

					try {
						isCyclicDecision = true;
						alt31 = dfa31.predict(input);
					}
					catch (NoViableAltException nvae) {
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(31);}

					switch (alt31) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:24: pointer
							{
							dbg.location(593,24);
							pushFollow(FOLLOW_pointer_in_pointer936);
							pointer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(31);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:594:4: '*' pointer
					{
					dbg.location(594,4);
					match(input,26,FOLLOW_26_in_pointer942); if (state.failed) return;dbg.location(594,8);
					pushFollow(FOLLOW_pointer_in_pointer944);
					pointer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:595:4: '*'
					{
					dbg.location(595,4);
					match(input,26,FOLLOW_26_in_pointer949); if (state.failed) return;
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
		dbg.location(596, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "pointer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "pointer"



	// $ANTLR start "parameter_type_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:599:1: parameter_type_list : parameter_list ( ',' '...' )? ;
	public final void parameter_type_list() throws RecognitionException {
		int parameter_type_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_type_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(599, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:600:2: ( parameter_list ( ',' '...' )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:600:4: parameter_list ( ',' '...' )?
			{
			dbg.location(600,4);
			pushFollow(FOLLOW_parameter_list_in_parameter_type_list961);
			parameter_list();
			state._fsp--;
			if (state.failed) return;dbg.location(600,19);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:600:19: ( ',' '...' )?
			int alt33=2;
			try { dbg.enterSubRule(33);
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			int LA33_0 = input.LA(1);
			if ( (LA33_0==31) ) {
				alt33=1;
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:600:20: ',' '...'
					{
					dbg.location(600,20);
					match(input,31,FOLLOW_31_in_parameter_type_list964); if (state.failed) return;dbg.location(600,24);
					match(input,37,FOLLOW_37_in_parameter_type_list966); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(33);}

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
		dbg.location(601, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_type_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_type_list"



	// $ANTLR start "parameter_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:604:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* ;
	public final void parameter_list() throws RecognitionException {
		int parameter_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(604, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:605:2: ( parameter_declaration ( ',' parameter_declaration )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:605:4: parameter_declaration ( ',' parameter_declaration )*
			{
			dbg.location(605,4);
			pushFollow(FOLLOW_parameter_declaration_in_parameter_list980);
			parameter_declaration();
			state._fsp--;
			if (state.failed) return;dbg.location(605,26);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:605:26: ( ',' parameter_declaration )*
			try { dbg.enterSubRule(34);

			loop34:
			while (true) {
				int alt34=2;
				try { dbg.enterDecision(34, decisionCanBacktrack[34]);

				int LA34_0 = input.LA(1);
				if ( (LA34_0==31) ) {
					int LA34_1 = input.LA(2);
					if ( ((LA34_1 >= 57 && LA34_1 <= 58)||(LA34_1 >= 61 && LA34_1 <= 62)||LA34_1==66||(LA34_1 >= 68 && LA34_1 <= 70)||(LA34_1 >= 74 && LA34_1 <= 76)||(LA34_1 >= 78 && LA34_1 <= 79)||(LA34_1 >= 81 && LA34_1 <= 82)||(LA34_1 >= 85 && LA34_1 <= 88)) ) {
						alt34=1;
					}

				}

				} finally {dbg.exitDecision(34);}

				switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:605:27: ',' parameter_declaration
					{
					dbg.location(605,27);
					match(input,31,FOLLOW_31_in_parameter_list983); if (state.failed) return;dbg.location(605,31);
					pushFollow(FOLLOW_parameter_declaration_in_parameter_list985);
					parameter_declaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}
			} finally {dbg.exitSubRule(34);}

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
		dbg.location(606, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_list"



	// $ANTLR start "parameter_declaration"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:609:1: parameter_declaration : declaration_specifiers ( declarator | abstract_declarator )* ;
	public final void parameter_declaration() throws RecognitionException {
		int parameter_declaration_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "parameter_declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(609, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:2: ( declaration_specifiers ( declarator | abstract_declarator )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:4: declaration_specifiers ( declarator | abstract_declarator )*
			{
			dbg.location(610,4);
			pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration999);
			declaration_specifiers();
			state._fsp--;
			if (state.failed) return;dbg.location(610,27);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:27: ( declarator | abstract_declarator )*
			try { dbg.enterSubRule(35);

			loop35:
			while (true) {
				int alt35=3;
				try { dbg.enterDecision(35, decisionCanBacktrack[35]);

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
				} finally {dbg.exitDecision(35);}

				switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:28: declarator
					{
					dbg.location(610,28);
					pushFollow(FOLLOW_declarator_in_parameter_declaration1002);
					declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:39: abstract_declarator
					{
					dbg.location(610,39);
					pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration1004);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}
			} finally {dbg.exitSubRule(35);}

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
		dbg.location(611, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter_declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter_declaration"



	// $ANTLR start "identifier_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:614:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* ;
	public final void identifier_list() throws RecognitionException {
		int identifier_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "identifier_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(614, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:615:2: ( IDENTIFIER ( ',' IDENTIFIER )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:615:4: IDENTIFIER ( ',' IDENTIFIER )*
			{
			dbg.location(615,4);
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list1018); if (state.failed) return;dbg.location(615,15);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:615:15: ( ',' IDENTIFIER )*
			try { dbg.enterSubRule(36);

			loop36:
			while (true) {
				int alt36=2;
				try { dbg.enterDecision(36, decisionCanBacktrack[36]);

				int LA36_0 = input.LA(1);
				if ( (LA36_0==31) ) {
					alt36=1;
				}

				} finally {dbg.exitDecision(36);}

				switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:615:16: ',' IDENTIFIER
					{
					dbg.location(615,16);
					match(input,31,FOLLOW_31_in_identifier_list1021); if (state.failed) return;dbg.location(615,20);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list1023); if (state.failed) return;
					}
					break;

				default :
					break loop36;
				}
			}
			} finally {dbg.exitSubRule(36);}

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
		dbg.location(616, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifier_list"



	// $ANTLR start "type_name"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:619:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
	public final void type_name() throws RecognitionException {
		int type_name_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "type_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(619, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:620:2: ( specifier_qualifier_list ( abstract_declarator )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:620:4: specifier_qualifier_list ( abstract_declarator )?
			{
			dbg.location(620,4);
			pushFollow(FOLLOW_specifier_qualifier_list_in_type_name1037);
			specifier_qualifier_list();
			state._fsp--;
			if (state.failed) return;dbg.location(620,29);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:620:29: ( abstract_declarator )?
			int alt37=2;
			try { dbg.enterSubRule(37);
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			int LA37_0 = input.LA(1);
			if ( (LA37_0==24||LA37_0==26||LA37_0==53) ) {
				alt37=1;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:620:29: abstract_declarator
					{
					dbg.location(620,29);
					pushFollow(FOLLOW_abstract_declarator_in_type_name1039);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(37);}

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
		dbg.location(621, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type_name"



	// $ANTLR start "abstract_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:624:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );
	public final void abstract_declarator() throws RecognitionException {
		int abstract_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "abstract_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(624, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:625:2: ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator )
			int alt39=2;
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(39);}

			switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:625:4: pointer ( direct_abstract_declarator )?
					{
					dbg.location(625,4);
					pushFollow(FOLLOW_pointer_in_abstract_declarator1052);
					pointer();
					state._fsp--;
					if (state.failed) return;dbg.location(625,12);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:625:12: ( direct_abstract_declarator )?
					int alt38=2;
					try { dbg.enterSubRule(38);
					try { dbg.enterDecision(38, decisionCanBacktrack[38]);

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
					} finally {dbg.exitDecision(38);}

					switch (alt38) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:625:12: direct_abstract_declarator
							{
							dbg.location(625,12);
							pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator1054);
							direct_abstract_declarator();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(38);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:626:4: direct_abstract_declarator
					{
					dbg.location(626,4);
					pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator1060);
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
		dbg.location(627, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "abstract_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "abstract_declarator"



	// $ANTLR start "direct_abstract_declarator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:630:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* ;
	public final void direct_abstract_declarator() throws RecognitionException {
		int direct_abstract_declarator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "direct_abstract_declarator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(630, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:2: ( ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )*
			{
			dbg.location(631,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )
			int alt40=2;
			try { dbg.enterSubRule(40);
			try { dbg.enterDecision(40, decisionCanBacktrack[40]);

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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(40);}

			switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:6: '(' abstract_declarator ')'
					{
					dbg.location(631,6);
					match(input,24,FOLLOW_24_in_direct_abstract_declarator1074); if (state.failed) return;dbg.location(631,10);
					pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator1076);
					abstract_declarator();
					state._fsp--;
					if (state.failed) return;dbg.location(631,30);
					match(input,25,FOLLOW_25_in_direct_abstract_declarator1078); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:36: abstract_declarator_suffix
					{
					dbg.location(631,36);
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1082);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(40);}
			dbg.location(631,65);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:65: ( abstract_declarator_suffix )*
			try { dbg.enterSubRule(41);

			loop41:
			while (true) {
				int alt41=2;
				try { dbg.enterDecision(41, decisionCanBacktrack[41]);

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

				} finally {dbg.exitDecision(41);}

				switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:65: abstract_declarator_suffix
					{
					dbg.location(631,65);
					pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1086);
					abstract_declarator_suffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop41;
				}
			}
			} finally {dbg.exitSubRule(41);}

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
		dbg.location(632, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "direct_abstract_declarator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "direct_abstract_declarator"



	// $ANTLR start "abstract_declarator_suffix"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:635:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );
	public final void abstract_declarator_suffix() throws RecognitionException {
		int abstract_declarator_suffix_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "abstract_declarator_suffix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(635, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:636:2: ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' )
			int alt42=4;
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

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
						dbg.recognitionException(nvae);
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
					new NoViableAltException("", 42, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(42);}

			switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:636:4: '[' ']'
					{
					dbg.location(636,4);
					match(input,53,FOLLOW_53_in_abstract_declarator_suffix1099); if (state.failed) return;dbg.location(636,8);
					match(input,54,FOLLOW_54_in_abstract_declarator_suffix1101); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:637:4: '[' constant_expression ']'
					{
					dbg.location(637,4);
					match(input,53,FOLLOW_53_in_abstract_declarator_suffix1106); if (state.failed) return;dbg.location(637,8);
					pushFollow(FOLLOW_constant_expression_in_abstract_declarator_suffix1108);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(637,28);
					match(input,54,FOLLOW_54_in_abstract_declarator_suffix1110); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:638:4: '(' ')'
					{
					dbg.location(638,4);
					match(input,24,FOLLOW_24_in_abstract_declarator_suffix1115); if (state.failed) return;dbg.location(638,8);
					match(input,25,FOLLOW_25_in_abstract_declarator_suffix1117); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:639:4: '(' parameter_type_list ')'
					{
					dbg.location(639,4);
					match(input,24,FOLLOW_24_in_abstract_declarator_suffix1122); if (state.failed) return;dbg.location(639,8);
					pushFollow(FOLLOW_parameter_type_list_in_abstract_declarator_suffix1124);
					parameter_type_list();
					state._fsp--;
					if (state.failed) return;dbg.location(639,28);
					match(input,25,FOLLOW_25_in_abstract_declarator_suffix1126); if (state.failed) return;
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
		dbg.location(640, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "abstract_declarator_suffix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "abstract_declarator_suffix"



	// $ANTLR start "initializer"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:643:1: initializer returns [Symbol symb] : ( assignment_expression | '{' initializer_list ( ',' )? '}' );
	public final Symbol initializer() throws RecognitionException {
		Symbol symb = null;

		int initializer_StartIndex = input.index();

		Symbol assignment_expression13 =null;

		try { dbg.enterRule(getGrammarFileName(), "initializer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(643, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:644:2: ( assignment_expression | '{' initializer_list ( ',' )? '}' )
			int alt44=2;
			try { dbg.enterDecision(44, decisionCanBacktrack[44]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(44);}

			switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:644:4: assignment_expression
					{
					dbg.location(644,4);
					pushFollow(FOLLOW_assignment_expression_in_initializer1143);
					assignment_expression13=assignment_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(644,26);
					if ( state.backtracking==0 ) { symb = assignment_expression13; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:645:4: '{' initializer_list ( ',' )? '}'
					{
					dbg.location(645,4);
					match(input,90,FOLLOW_90_in_initializer1150); if (state.failed) return symb;dbg.location(645,8);
					pushFollow(FOLLOW_initializer_list_in_initializer1152);
					initializer_list();
					state._fsp--;
					if (state.failed) return symb;dbg.location(645,25);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:645:25: ( ',' )?
					int alt43=2;
					try { dbg.enterSubRule(43);
					try { dbg.enterDecision(43, decisionCanBacktrack[43]);

					int LA43_0 = input.LA(1);
					if ( (LA43_0==31) ) {
						alt43=1;
					}
					} finally {dbg.exitDecision(43);}

					switch (alt43) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:645:25: ','
							{
							dbg.location(645,25);
							match(input,31,FOLLOW_31_in_initializer1154); if (state.failed) return symb;
							}
							break;

					}
					} finally {dbg.exitSubRule(43);}
					dbg.location(645,30);
					match(input,94,FOLLOW_94_in_initializer1157); if (state.failed) return symb;
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
		dbg.location(646, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "initializer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "initializer"



	// $ANTLR start "initializer_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:649:1: initializer_list : initializer ( ',' initializer )* ;
	public final void initializer_list() throws RecognitionException {
		int initializer_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "initializer_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(649, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:650:2: ( initializer ( ',' initializer )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:650:4: initializer ( ',' initializer )*
			{
			dbg.location(650,4);
			pushFollow(FOLLOW_initializer_in_initializer_list1169);
			initializer();
			state._fsp--;
			if (state.failed) return;dbg.location(650,16);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:650:16: ( ',' initializer )*
			try { dbg.enterSubRule(45);

			loop45:
			while (true) {
				int alt45=2;
				try { dbg.enterDecision(45, decisionCanBacktrack[45]);

				int LA45_0 = input.LA(1);
				if ( (LA45_0==31) ) {
					int LA45_1 = input.LA(2);
					if ( (LA45_1==CHARACTER_LITERAL||LA45_1==DECIMAL_LITERAL||LA45_1==FLOATING_POINT_LITERAL||LA45_1==IDENTIFIER||LA45_1==STRING_LITERAL||LA45_1==17||LA45_1==22||LA45_1==24||LA45_1==26||(LA45_1 >= 28 && LA45_1 <= 29)||(LA45_1 >= 32 && LA45_1 <= 33)||LA45_1==80||LA45_1==90||LA45_1==95) ) {
						alt45=1;
					}

				}

				} finally {dbg.exitDecision(45);}

				switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:650:17: ',' initializer
					{
					dbg.location(650,17);
					match(input,31,FOLLOW_31_in_initializer_list1172); if (state.failed) return;dbg.location(650,21);
					pushFollow(FOLLOW_initializer_in_initializer_list1174);
					initializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop45;
				}
			}
			} finally {dbg.exitSubRule(45);}

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
		dbg.location(651, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "initializer_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "initializer_list"



	// $ANTLR start "argument_expression_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:658:1: argument_expression_list returns [List<Symbol> symbols] : asgn= assignment_expression ( ',' asgn2= assignment_expression )* ;
	public final List<Symbol> argument_expression_list() throws RecognitionException {
		List<Symbol> symbols = null;

		int argument_expression_list_StartIndex = input.index();

		Symbol asgn =null;
		Symbol asgn2 =null;

		 symbols = new ArrayList<Symbol>(); 
		try { dbg.enterRule(getGrammarFileName(), "argument_expression_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(658, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return symbols; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:660:2: (asgn= assignment_expression ( ',' asgn2= assignment_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:660:4: asgn= assignment_expression ( ',' asgn2= assignment_expression )*
			{
			dbg.location(660,8);
			pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1206);
			asgn=assignment_expression();
			state._fsp--;
			if (state.failed) return symbols;dbg.location(660,31);
			if ( state.backtracking==0 ) { symbols.add(asgn); }dbg.location(661,2);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:661:2: ( ',' asgn2= assignment_expression )*
			try { dbg.enterSubRule(46);

			loop46:
			while (true) {
				int alt46=2;
				try { dbg.enterDecision(46, decisionCanBacktrack[46]);

				int LA46_0 = input.LA(1);
				if ( (LA46_0==31) ) {
					alt46=1;
				}

				} finally {dbg.exitDecision(46);}

				switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:661:3: ',' asgn2= assignment_expression
					{
					dbg.location(661,3);
					match(input,31,FOLLOW_31_in_argument_expression_list1212); if (state.failed) return symbols;dbg.location(661,12);
					pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1216);
					asgn2=assignment_expression();
					state._fsp--;
					if (state.failed) return symbols;dbg.location(661,35);
					if ( state.backtracking==0 ) { symbols.add(asgn2); }
					}
					break;

				default :
					break loop46;
				}
			}
			} finally {dbg.exitSubRule(46);}

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
		dbg.location(663, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "argument_expression_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symbols;
	}
	// $ANTLR end "argument_expression_list"


	public static class additive_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "additive_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:668:1: additive_expression returns [Symbol symb] : (mul1= multiplicative_expression ) ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )* ;
	public final myCompilerParser.additive_expression_return additive_expression() throws RecognitionException {
		myCompilerParser.additive_expression_return retval = new myCompilerParser.additive_expression_return();
		retval.start = input.LT(1);
		int additive_expression_StartIndex = input.index();

		ParserRuleReturnScope mul1 =null;
		ParserRuleReturnScope mul2 =null;
		ParserRuleReturnScope mul3 =null;

		 Symbol symb2 = null; String op = null; String irOp = null; int line = -1;
		try { dbg.enterRule(getGrammarFileName(), "additive_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(668, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:670:2: ( (mul1= multiplicative_expression ) ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:670:4: (mul1= multiplicative_expression ) ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )*
			{
			dbg.location(670,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:670:4: (mul1= multiplicative_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:670:5: mul1= multiplicative_expression
			{
			dbg.location(670,9);
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1249);
			mul1=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			}
			dbg.location(670,37);
			if ( state.backtracking==0 ) { retval.symb = (mul1!=null?((myCompilerParser.multiplicative_expression_return)mul1).symb:null); line = (mul1!=null?(mul1.start):null).getLine(); }dbg.location(671,2);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:671:2: ( ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression ) )*
			try { dbg.enterSubRule(48);

			loop48:
			while (true) {
				int alt48=2;
				try { dbg.enterDecision(48, decisionCanBacktrack[48]);

				int LA48_0 = input.LA(1);
				if ( (LA48_0==28||LA48_0==32) ) {
					alt48=1;
				}

				} finally {dbg.exitDecision(48);}

				switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:671:3: ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )
					{
					dbg.location(671,3);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:671:3: ( '+' mul2= multiplicative_expression | '-' mul3= multiplicative_expression )
					int alt47=2;
					try { dbg.enterSubRule(47);
					try { dbg.enterDecision(47, decisionCanBacktrack[47]);

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
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(47);}

					switch (alt47) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:671:5: '+' mul2= multiplicative_expression
							{
							dbg.location(671,5);
							match(input,28,FOLLOW_28_in_additive_expression1259); if (state.failed) return retval;dbg.location(671,13);
							pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1263);
							mul2=multiplicative_expression();
							state._fsp--;
							if (state.failed) return retval;dbg.location(671,40);
							if ( state.backtracking==0 ) { symb2 = (mul2!=null?((myCompilerParser.multiplicative_expression_return)mul2).symb:null); op = "+"; irOp = "add"; }
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:672:4: '-' mul3= multiplicative_expression
							{
							dbg.location(672,4);
							match(input,32,FOLLOW_32_in_additive_expression1270); if (state.failed) return retval;dbg.location(672,12);
							pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1274);
							mul3=multiplicative_expression();
							state._fsp--;
							if (state.failed) return retval;dbg.location(672,39);
							if ( state.backtracking==0 ) { symb2 = (mul3!=null?((myCompilerParser.multiplicative_expression_return)mul3).symb:null); op = "-"; irOp = "sub";  }
							}
							break;

					}
					} finally {dbg.exitSubRule(47);}
					dbg.location(673,4);
					if ( state.backtracking==0 ) { retval.symb = genArithmeticCode(retval.symb, symb2, op, irOp, line); }
					}
					break;

				default :
					break loop48;
				}
			}
			} finally {dbg.exitSubRule(48);}

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
		dbg.location(675, 1);

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
		public Symbol symb;
	};


	// $ANTLR start "multiplicative_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:678:1: multiplicative_expression returns [Symbol symb] : (cast1= cast_expression ) ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )* ;
	public final myCompilerParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		myCompilerParser.multiplicative_expression_return retval = new myCompilerParser.multiplicative_expression_return();
		retval.start = input.LT(1);
		int multiplicative_expression_StartIndex = input.index();

		ParserRuleReturnScope cast1 =null;
		ParserRuleReturnScope cast2 =null;
		ParserRuleReturnScope cast3 =null;
		ParserRuleReturnScope cast4 =null;

		 Symbol symb2 = null; String op = null; String irOp = null; int line = -1; 
		try { dbg.enterRule(getGrammarFileName(), "multiplicative_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(678, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:680:2: ( (cast1= cast_expression ) ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:680:4: (cast1= cast_expression ) ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )*
			{
			dbg.location(680,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:680:4: (cast1= cast_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:680:5: cast1= cast_expression
			{
			dbg.location(680,10);
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1309);
			cast1=cast_expression();
			state._fsp--;
			if (state.failed) return retval;
			}
			dbg.location(680,28);
			if ( state.backtracking==0 ) { retval.symb = (cast1!=null?((myCompilerParser.cast_expression_return)cast1).symb:null); line = (cast1!=null?(cast1.start):null).getLine(); }dbg.location(681,2);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:681:2: ( ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression ) )*
			try { dbg.enterSubRule(50);

			loop50:
			while (true) {
				int alt50=2;
				try { dbg.enterDecision(50, decisionCanBacktrack[50]);

				int LA50_0 = input.LA(1);
				if ( (LA50_0==19||LA50_0==26||LA50_0==38) ) {
					alt50=1;
				}

				} finally {dbg.exitDecision(50);}

				switch (alt50) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:681:3: ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )
					{
					dbg.location(681,3);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:681:3: ( '*' cast2= cast_expression | '/' cast3= cast_expression | '%' cast4= cast_expression )
					int alt49=3;
					try { dbg.enterSubRule(49);
					try { dbg.enterDecision(49, decisionCanBacktrack[49]);

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
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(49);}

					switch (alt49) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:681:5: '*' cast2= cast_expression
							{
							dbg.location(681,5);
							match(input,26,FOLLOW_26_in_multiplicative_expression1319); if (state.failed) return retval;dbg.location(681,14);
							pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1323);
							cast2=cast_expression();
							state._fsp--;
							if (state.failed) return retval;dbg.location(681,31);
							if ( state.backtracking==0 ) { symb2 = (cast2!=null?((myCompilerParser.cast_expression_return)cast2).symb:null); op = "*"; irOp = "mul"; }
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:682:4: '/' cast3= cast_expression
							{
							dbg.location(682,4);
							match(input,38,FOLLOW_38_in_multiplicative_expression1330); if (state.failed) return retval;dbg.location(682,13);
							pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1334);
							cast3=cast_expression();
							state._fsp--;
							if (state.failed) return retval;dbg.location(682,30);
							if ( state.backtracking==0 ) { symb2 = (cast3!=null?((myCompilerParser.cast_expression_return)cast3).symb:null); op = "/"; irOp = "div"; }
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:683:4: '%' cast4= cast_expression
							{
							dbg.location(683,4);
							match(input,19,FOLLOW_19_in_multiplicative_expression1341); if (state.failed) return retval;dbg.location(683,13);
							pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1345);
							cast4=cast_expression();
							state._fsp--;
							if (state.failed) return retval;dbg.location(683,30);
							if ( state.backtracking==0 ) { symb2 = (cast4!=null?((myCompilerParser.cast_expression_return)cast4).symb:null); op = "%"; irOp = "rem"; }
							}
							break;

					}
					} finally {dbg.exitSubRule(49);}
					dbg.location(684,4);
					if ( state.backtracking==0 ) { retval.symb = genArithmeticCode(retval.symb, symb2, op, irOp, line); }
					}
					break;

				default :
					break loop50;
				}
			}
			} finally {dbg.exitSubRule(50);}

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
		dbg.location(686, 1);

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
		public Symbol symb;
	};


	// $ANTLR start "cast_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:691:1: cast_expression returns [Symbol symb] : ( '(' type_name ')' cast_expression | unary_expression );
	public final myCompilerParser.cast_expression_return cast_expression() throws RecognitionException {
		myCompilerParser.cast_expression_return retval = new myCompilerParser.cast_expression_return();
		retval.start = input.LT(1);
		int cast_expression_StartIndex = input.index();

		Symbol unary_expression14 =null;

		try { dbg.enterRule(getGrammarFileName(), "cast_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(691, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:692:2: ( '(' type_name ')' cast_expression | unary_expression )
			int alt51=2;
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(51);}

			switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:692:4: '(' type_name ')' cast_expression
					{
					dbg.location(692,4);
					match(input,24,FOLLOW_24_in_cast_expression1375); if (state.failed) return retval;dbg.location(692,8);
					pushFollow(FOLLOW_type_name_in_cast_expression1377);
					type_name();
					state._fsp--;
					if (state.failed) return retval;dbg.location(692,18);
					match(input,25,FOLLOW_25_in_cast_expression1379); if (state.failed) return retval;dbg.location(692,22);
					pushFollow(FOLLOW_cast_expression_in_cast_expression1381);
					cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:693:4: unary_expression
					{
					dbg.location(693,4);
					pushFollow(FOLLOW_unary_expression_in_cast_expression1387);
					unary_expression14=unary_expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(693,21);
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
		dbg.location(694, 1);

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
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:697:1: unary_expression returns [Symbol symb] : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );
	public final Symbol unary_expression() throws RecognitionException {
		Symbol symb = null;

		int unary_expression_StartIndex = input.index();

		Symbol postfix_expression15 =null;
		char unary_operator16 =0;
		ParserRuleReturnScope cast_expression17 =null;

		try { dbg.enterRule(getGrammarFileName(), "unary_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(697, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:698:2: ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' )
			int alt52=6;
			try { dbg.enterDecision(52, decisionCanBacktrack[52]);

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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(52);}

			switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:698:4: postfix_expression
					{
					dbg.location(698,4);
					pushFollow(FOLLOW_postfix_expression_in_unary_expression1405);
					postfix_expression15=postfix_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(698,23);
					if ( state.backtracking==0 ) { symb = postfix_expression15; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:699:4: '++' unary_expression
					{
					dbg.location(699,4);
					match(input,29,FOLLOW_29_in_unary_expression1412); if (state.failed) return symb;dbg.location(699,9);
					pushFollow(FOLLOW_unary_expression_in_unary_expression1414);
					unary_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(699,26);
					if ( state.backtracking==0 ) { ; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:700:4: '--' unary_expression
					{
					dbg.location(700,4);
					match(input,33,FOLLOW_33_in_unary_expression1422); if (state.failed) return symb;dbg.location(700,9);
					pushFollow(FOLLOW_unary_expression_in_unary_expression1424);
					unary_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(700,26);
					if ( state.backtracking==0 ) { ; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:701:4: unary_operator cast_expression
					{
					dbg.location(701,4);
					pushFollow(FOLLOW_unary_operator_in_unary_expression1432);
					unary_operator16=unary_operator();
					state._fsp--;
					if (state.failed) return symb;dbg.location(701,19);
					pushFollow(FOLLOW_cast_expression_in_unary_expression1434);
					cast_expression17=cast_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(702,3);
					if ( state.backtracking==0 ) {
								switch(unary_operator16) {
									case '&':
										break;
									case '*':
										break;
									case '+':
										symb = (cast_expression17!=null?((myCompilerParser.cast_expression_return)cast_expression17).symb:null);
										break;
									case '-':
										symb = (cast_expression17!=null?((myCompilerParser.cast_expression_return)cast_expression17).symb:null);
										symb.value = "-" + symb.value;
										break;
									case '~':
										break;
									case '!':
										break;
									default:
										System.out.println("TODO443: unary operation");
								}

							}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:724:4: 'sizeof' unary_expression
					{
					dbg.location(724,4);
					match(input,80,FOLLOW_80_in_unary_expression1443); if (state.failed) return symb;dbg.location(724,13);
					pushFollow(FOLLOW_unary_expression_in_unary_expression1445);
					unary_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:725:4: 'sizeof' '(' type_name ')'
					{
					dbg.location(725,4);
					match(input,80,FOLLOW_80_in_unary_expression1451); if (state.failed) return symb;dbg.location(725,13);
					match(input,24,FOLLOW_24_in_unary_expression1453); if (state.failed) return symb;dbg.location(725,17);
					pushFollow(FOLLOW_type_name_in_unary_expression1455);
					type_name();
					state._fsp--;
					if (state.failed) return symb;dbg.location(725,27);
					match(input,25,FOLLOW_25_in_unary_expression1457); if (state.failed) return symb;
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
		dbg.location(726, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "unary_expression"



	// $ANTLR start "postfix_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:729:1: postfix_expression returns [Symbol symb] : primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* ;
	public final Symbol postfix_expression() throws RecognitionException {
		Symbol symb = null;

		int postfix_expression_StartIndex = input.index();

		ParserRuleReturnScope primary_expression18 =null;
		List<Symbol> argument_expression_list19 =null;

		try { dbg.enterRule(getGrammarFileName(), "postfix_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(729, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:730:2: ( primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:730:6: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			{
			dbg.location(730,6);
			pushFollow(FOLLOW_primary_expression_in_postfix_expression1476);
			primary_expression18=primary_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(730,25);
			if ( state.backtracking==0 ) { symb = (primary_expression18!=null?((myCompilerParser.primary_expression_return)primary_expression18).symb:null); }dbg.location(731,9);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:731:9: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
			try { dbg.enterSubRule(53);

			loop53:
			while (true) {
				int alt53=8;
				try { dbg.enterDecision(53, decisionCanBacktrack[53]);

				switch ( input.LA(1) ) {
				case 53:
					{
					alt53=1;
					}
					break;
				case 24:
					{
					int LA53_38 = input.LA(2);
					if ( (LA53_38==25) ) {
						alt53=2;
					}
					else if ( (LA53_38==CHARACTER_LITERAL||LA53_38==DECIMAL_LITERAL||LA53_38==FLOATING_POINT_LITERAL||LA53_38==IDENTIFIER||LA53_38==STRING_LITERAL||LA53_38==17||LA53_38==22||LA53_38==24||LA53_38==26||(LA53_38 >= 28 && LA53_38 <= 29)||(LA53_38 >= 32 && LA53_38 <= 33)||LA53_38==80||LA53_38==95) ) {
						alt53=3;
					}

					}
					break;
				case 36:
					{
					alt53=4;
					}
					break;
				case 35:
					{
					alt53=5;
					}
					break;
				case 29:
					{
					alt53=6;
					}
					break;
				case 33:
					{
					alt53=7;
					}
					break;
				}
				} finally {dbg.exitDecision(53);}

				switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:731:13: '[' expression ']'
					{
					dbg.location(731,13);
					match(input,53,FOLLOW_53_in_postfix_expression1492); if (state.failed) return symb;dbg.location(731,17);
					pushFollow(FOLLOW_expression_in_postfix_expression1494);
					expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(731,28);
					match(input,54,FOLLOW_54_in_postfix_expression1496); if (state.failed) return symb;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:732:13: '(' ')'
					{
					dbg.location(732,13);
					match(input,24,FOLLOW_24_in_postfix_expression1510); if (state.failed) return symb;dbg.location(732,17);
					match(input,25,FOLLOW_25_in_postfix_expression1512); if (state.failed) return symb;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:733:13: '(' argument_expression_list ')'
					{
					dbg.location(733,13);
					match(input,24,FOLLOW_24_in_postfix_expression1526); if (state.failed) return symb;dbg.location(733,17);
					pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1528);
					argument_expression_list19=argument_expression_list();
					state._fsp--;
					if (state.failed) return symb;dbg.location(733,42);
					match(input,25,FOLLOW_25_in_postfix_expression1530); if (state.failed) return symb;dbg.location(734,5);
					if ( state.backtracking==0 ) {	
										String args = "";
										int len = 0;
										for(Symbol symbol : argument_expression_list19) {
											// System.out.println("expression: " + symbol.value); 
											if(symbol.type == Type.STRING) {
												len = symbol.len;
												unnamedCode.add(String.format("@.str.%d = private unnamed_addr constant [%d x i8] c%s", unnamedVarCount++, symbol.len, symbol.value));
											} else {
												if(symbol.isConstant) {
													args += String.format(", %s noundef %s", "i32", symbol.value);
												} else {
													if(symbol.isStored) {
														symb = new Symbol();
														mainCode.add(genLoadCode("%t", symb.offset, "i32", symbol.identifier, symbol.offset));
														args += String.format(", %s noundef %s%d", "i32", symbol.identifier, symb.offset);
													} else {
														args += String.format(", %s noundef %s%d", "i32", symbol.identifier, symb.offset);
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
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:764:13: '.' IDENTIFIER
					{
					dbg.location(764,13);
					match(input,36,FOLLOW_36_in_postfix_expression1551); if (state.failed) return symb;dbg.location(764,17);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1553); if (state.failed) return symb;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:765:13: '->' IDENTIFIER
					{
					dbg.location(765,13);
					match(input,35,FOLLOW_35_in_postfix_expression1567); if (state.failed) return symb;dbg.location(765,18);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1569); if (state.failed) return symb;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:766:13: '++'
					{
					dbg.location(766,13);
					match(input,29,FOLLOW_29_in_postfix_expression1583); if (state.failed) return symb;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:767:13: '--'
					{
					dbg.location(767,13);
					match(input,33,FOLLOW_33_in_postfix_expression1597); if (state.failed) return symb;
					}
					break;

				default :
					break loop53;
				}
			}
			} finally {dbg.exitSubRule(53);}

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
		dbg.location(769, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "postfix_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "postfix_expression"



	// $ANTLR start "unary_operator"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:771:1: unary_operator returns [char op] : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final char unary_operator() throws RecognitionException {
		char op = 0;

		int unary_operator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "unary_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(771, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return op; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:772:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
			int alt54=6;
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

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
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(54);}

			switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:772:4: '&'
					{
					dbg.location(772,4);
					match(input,22,FOLLOW_22_in_unary_operator1623); if (state.failed) return op;dbg.location(772,8);
					if ( state.backtracking==0 ) { op = '&'; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:773:4: '*'
					{
					dbg.location(773,4);
					match(input,26,FOLLOW_26_in_unary_operator1630); if (state.failed) return op;dbg.location(773,8);
					if ( state.backtracking==0 ) { op = '*'; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:774:4: '+'
					{
					dbg.location(774,4);
					match(input,28,FOLLOW_28_in_unary_operator1637); if (state.failed) return op;dbg.location(774,8);
					if ( state.backtracking==0 ) { op = '+'; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:775:4: '-'
					{
					dbg.location(775,4);
					match(input,32,FOLLOW_32_in_unary_operator1644); if (state.failed) return op;dbg.location(775,8);
					if ( state.backtracking==0 ) { op = '-'; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:776:4: '~'
					{
					dbg.location(776,4);
					match(input,95,FOLLOW_95_in_unary_operator1651); if (state.failed) return op;dbg.location(776,8);
					if ( state.backtracking==0 ) { op = '~'; }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:777:4: '!'
					{
					dbg.location(777,4);
					match(input,17,FOLLOW_17_in_unary_operator1658); if (state.failed) return op;dbg.location(777,8);
					if ( state.backtracking==0 ) { op = '!'; }
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
			if ( state.backtracking>0 ) { memoize(input, 41, unary_operator_StartIndex); }

		}
		dbg.location(778, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return op;
	}
	// $ANTLR end "unary_operator"


	public static class primary_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
		public boolean isPrintf;
	};


	// $ANTLR start "primary_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:781:1: primary_expression returns [Symbol symb, boolean isPrintf] : ( IDENTIFIER | constant | '(' expression ')' );
	public final myCompilerParser.primary_expression_return primary_expression() throws RecognitionException {
		myCompilerParser.primary_expression_return retval = new myCompilerParser.primary_expression_return();
		retval.start = input.LT(1);
		int primary_expression_StartIndex = input.index();

		Token IDENTIFIER20=null;
		Symbol constant21 =null;
		ParserRuleReturnScope expression22 =null;

		try { dbg.enterRule(getGrammarFileName(), "primary_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(781, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:782:2: ( IDENTIFIER | constant | '(' expression ')' )
			int alt55=3;
			try { dbg.enterDecision(55, decisionCanBacktrack[55]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(55);}

			switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:782:4: IDENTIFIER
					{
					dbg.location(782,4);
					IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1677); if (state.failed) return retval;dbg.location(783,3);
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
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:795:4: constant
					{
					dbg.location(795,4);
					pushFollow(FOLLOW_constant_in_primary_expression1688);
					constant21=constant();
					state._fsp--;
					if (state.failed) return retval;dbg.location(795,13);
					if ( state.backtracking==0 ) { retval.symb = constant21; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:796:4: '(' expression ')'
					{
					dbg.location(796,4);
					match(input,24,FOLLOW_24_in_primary_expression1695); if (state.failed) return retval;dbg.location(796,8);
					pushFollow(FOLLOW_expression_in_primary_expression1697);
					expression22=expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(796,19);
					match(input,25,FOLLOW_25_in_primary_expression1699); if (state.failed) return retval;dbg.location(796,23);
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
		dbg.location(797, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "primary_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "primary_expression"



	// $ANTLR start "constant"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:800:1: constant returns [Symbol symb] : ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
	public final Symbol constant() throws RecognitionException {
		Symbol symb = null;

		int constant_StartIndex = input.index();

		Token DECIMAL_LITERAL23=null;
		Token CHARACTER_LITERAL24=null;
		Token STRING_LITERAL25=null;
		Token FLOATING_POINT_LITERAL26=null;

		 symb = new Symbol(); symb.isConstant = true;
		try { dbg.enterRule(getGrammarFileName(), "constant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(800, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:804:5: ( DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
			int alt56=4;
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:804:9: DECIMAL_LITERAL
					{
					dbg.location(804,9);
					DECIMAL_LITERAL23=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_constant1737); if (state.failed) return symb;dbg.location(805,3);
					if ( state.backtracking==0 ) { 	
								symb.type = getMinType((DECIMAL_LITERAL23!=null?DECIMAL_LITERAL23.getText():null));
								symb.value = (DECIMAL_LITERAL23!=null?DECIMAL_LITERAL23.getText():null);
							}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:810:7: CHARACTER_LITERAL
					{
					dbg.location(810,7);
					CHARACTER_LITERAL24=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_constant1751); if (state.failed) return symb;dbg.location(810,25);
					if ( state.backtracking==0 ) { symb.value = (CHARACTER_LITERAL24!=null?CHARACTER_LITERAL24.getText():null); }dbg.location(811,3);
					if ( state.backtracking==0 ) {	
								symb.type = Type.CHAR;
								symb.len = 2; // 1 literal + 1 null character 
								symb.value = symb.value.replace("\\n", "\\0A");
							}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:817:4: STRING_LITERAL
					{
					dbg.location(817,4);
					STRING_LITERAL25=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant1764); if (state.failed) return symb;dbg.location(817,19);
					if ( state.backtracking==0 ) { symb.value = (STRING_LITERAL25!=null?STRING_LITERAL25.getText():null); }dbg.location(817,59);
					if ( state.backtracking==0 ) { symb.len = symb.value.length(); }dbg.location(818,3);
					if ( state.backtracking==0 ) {	
								symb.type = Type.STRING;
								symb.len = symb.value.replace("\\n", "0").length() - 1; // -2 quote + 1 null character 
								symb.value = symb.value.replace("\\n", "\\0A");
								symb.value = symb.value.substring(0, symb.value.length() - 1) + "\\00" + "\"";
							}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:825:9: FLOATING_POINT_LITERAL
					{
					dbg.location(825,9);
					FLOATING_POINT_LITERAL26=(Token)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_constant1783); if (state.failed) return symb;dbg.location(825,32);
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
		dbg.location(826, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "constant"


	public static class expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:831:1: expression returns [Symbol symb] : a1= assignment_expression ( ',' assignment_expression )* ;
	public final myCompilerParser.expression_return expression() throws RecognitionException {
		myCompilerParser.expression_return retval = new myCompilerParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		Symbol a1 =null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(831, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:832:2: (a1= assignment_expression ( ',' assignment_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:832:4: a1= assignment_expression ( ',' assignment_expression )*
			{
			dbg.location(832,6);
			pushFollow(FOLLOW_assignment_expression_in_expression1811);
			a1=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(832,29);
			if ( state.backtracking==0 ) { retval.symb = a1; }dbg.location(832,51);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:832:51: ( ',' assignment_expression )*
			try { dbg.enterSubRule(57);

			loop57:
			while (true) {
				int alt57=2;
				try { dbg.enterDecision(57, decisionCanBacktrack[57]);

				int LA57_0 = input.LA(1);
				if ( (LA57_0==31) ) {
					alt57=1;
				}

				} finally {dbg.exitDecision(57);}

				switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:832:52: ',' assignment_expression
					{
					dbg.location(832,52);
					match(input,31,FOLLOW_31_in_expression1816); if (state.failed) return retval;dbg.location(832,56);
					pushFollow(FOLLOW_assignment_expression_in_expression1818);
					assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop57;
				}
			}
			} finally {dbg.exitSubRule(57);}

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
		dbg.location(833, 1);

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
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:836:1: constant_expression returns [Symbol symb] : conditional_expression ;
	public final Symbol constant_expression() throws RecognitionException {
		Symbol symb = null;

		int constant_expression_StartIndex = input.index();

		Symbol conditional_expression27 =null;

		try { dbg.enterRule(getGrammarFileName(), "constant_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(836, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:837:2: ( conditional_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:837:4: conditional_expression
			{
			dbg.location(837,4);
			pushFollow(FOLLOW_conditional_expression_in_constant_expression1837);
			conditional_expression27=conditional_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(837,27);
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
		dbg.location(838, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "constant_expression"



	// $ANTLR start "assignment_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:841:1: assignment_expression returns [Symbol symb] : ( lvalue assignment_operator asgn2= assignment_expression | conditional_expression );
	public final Symbol assignment_expression() throws RecognitionException {
		Symbol symb = null;

		int assignment_expression_StartIndex = input.index();

		Symbol asgn2 =null;
		ParserRuleReturnScope lvalue28 =null;
		Symbol conditional_expression29 =null;

		try { dbg.enterRule(getGrammarFileName(), "assignment_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(841, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:842:2: ( lvalue assignment_operator asgn2= assignment_expression | conditional_expression )
			int alt58=2;
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			try {
				isCyclicDecision = true;
				alt58 = dfa58.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(58);}

			switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:842:4: lvalue assignment_operator asgn2= assignment_expression
					{
					dbg.location(842,4);
					pushFollow(FOLLOW_lvalue_in_assignment_expression1855);
					lvalue28=lvalue();
					state._fsp--;
					if (state.failed) return symb;dbg.location(842,11);
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1857);
					assignment_operator();
					state._fsp--;
					if (state.failed) return symb;dbg.location(842,36);
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1861);
					asgn2=assignment_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(843,3);
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
											mainCode.add(genStoreCode("i32", symb.identifier, symb.offset, identifier, symbolTable.get((lvalue28!=null?input.toString(lvalue28.start,lvalue28.stop):null)).offset));
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
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:871:4: conditional_expression
					{
					dbg.location(871,4);
					pushFollow(FOLLOW_conditional_expression_in_assignment_expression1872);
					conditional_expression29=conditional_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(871,27);
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
		dbg.location(872, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "assignment_expression"


	public static class lvalue_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "lvalue"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:875:1: lvalue returns [Symbol symb] : unary_expression ;
	public final myCompilerParser.lvalue_return lvalue() throws RecognitionException {
		myCompilerParser.lvalue_return retval = new myCompilerParser.lvalue_return();
		retval.start = input.LT(1);
		int lvalue_StartIndex = input.index();

		Symbol unary_expression30 =null;

		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(875, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:876:2: ( unary_expression )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:876:4: unary_expression
			{
			dbg.location(876,4);
			pushFollow(FOLLOW_unary_expression_in_lvalue1890);
			unary_expression30=unary_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(876,21);
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
		dbg.location(877, 1);

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
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:879:1: assignment_operator returns [String op] : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final String assignment_operator() throws RecognitionException {
		String op = null;

		int assignment_operator_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "assignment_operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(879, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return op; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:880:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			int alt59=11;
			try { dbg.enterDecision(59, decisionCanBacktrack[59]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(59);}

			switch (alt59) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:880:4: '='
					{
					dbg.location(880,4);
					match(input,46,FOLLOW_46_in_assignment_operator1907); if (state.failed) return op;dbg.location(880,8);
					if ( state.backtracking==0 ) { op = "="; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:881:4: '*='
					{
					dbg.location(881,4);
					match(input,27,FOLLOW_27_in_assignment_operator1914); if (state.failed) return op;dbg.location(881,9);
					if ( state.backtracking==0 ) { op = "*="; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:882:4: '/='
					{
					dbg.location(882,4);
					match(input,39,FOLLOW_39_in_assignment_operator1921); if (state.failed) return op;dbg.location(882,9);
					if ( state.backtracking==0 ) { op = "/="; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:883:4: '%='
					{
					dbg.location(883,4);
					match(input,20,FOLLOW_20_in_assignment_operator1928); if (state.failed) return op;dbg.location(883,9);
					if ( state.backtracking==0 ) { op = "%="; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:884:4: '+='
					{
					dbg.location(884,4);
					match(input,30,FOLLOW_30_in_assignment_operator1935); if (state.failed) return op;dbg.location(884,9);
					if ( state.backtracking==0 ) { op = "+="; }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:885:4: '-='
					{
					dbg.location(885,4);
					match(input,34,FOLLOW_34_in_assignment_operator1942); if (state.failed) return op;dbg.location(885,9);
					if ( state.backtracking==0 ) { op = "-="; }
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:886:4: '<<='
					{
					dbg.location(886,4);
					match(input,44,FOLLOW_44_in_assignment_operator1949); if (state.failed) return op;dbg.location(886,10);
					if ( state.backtracking==0 ) { op = "<<="; }
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:887:4: '>>='
					{
					dbg.location(887,4);
					match(input,51,FOLLOW_51_in_assignment_operator1956); if (state.failed) return op;dbg.location(887,10);
					if ( state.backtracking==0 ) { op = ">>="; }
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:888:4: '&='
					{
					dbg.location(888,4);
					match(input,23,FOLLOW_23_in_assignment_operator1963); if (state.failed) return op;dbg.location(888,9);
					if ( state.backtracking==0 ) { op = "&="; }
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:889:4: '^='
					{
					dbg.location(889,4);
					match(input,56,FOLLOW_56_in_assignment_operator1970); if (state.failed) return op;dbg.location(889,9);
					if ( state.backtracking==0 ) { op = "^="; }
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:890:4: '|='
					{
					dbg.location(890,4);
					match(input,92,FOLLOW_92_in_assignment_operator1977); if (state.failed) return op;dbg.location(890,9);
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
		dbg.location(891, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment_operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return op;
	}
	// $ANTLR end "assignment_operator"



	// $ANTLR start "conditional_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:895:1: conditional_expression returns [Symbol symb] : logical_or_expression ( '?' expression ':' conditional_expression )? ;
	public final Symbol conditional_expression() throws RecognitionException {
		Symbol symb = null;

		int conditional_expression_StartIndex = input.index();

		Symbol logical_or_expression31 =null;

		try { dbg.enterRule(getGrammarFileName(), "conditional_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(895, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:896:2: ( logical_or_expression ( '?' expression ':' conditional_expression )? )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:896:4: logical_or_expression ( '?' expression ':' conditional_expression )?
			{
			dbg.location(896,4);
			pushFollow(FOLLOW_logical_or_expression_in_conditional_expression2001);
			logical_or_expression31=logical_or_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(896,26);
			if ( state.backtracking==0 ) { symb = logical_or_expression31; }dbg.location(896,67);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:896:67: ( '?' expression ':' conditional_expression )?
			int alt60=2;
			try { dbg.enterSubRule(60);
			try { dbg.enterDecision(60, decisionCanBacktrack[60]);

			int LA60_0 = input.LA(1);
			if ( (LA60_0==52) ) {
				alt60=1;
			}
			} finally {dbg.exitDecision(60);}

			switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:896:68: '?' expression ':' conditional_expression
					{
					dbg.location(896,68);
					match(input,52,FOLLOW_52_in_conditional_expression2006); if (state.failed) return symb;dbg.location(896,72);
					pushFollow(FOLLOW_expression_in_conditional_expression2008);
					expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(896,83);
					match(input,40,FOLLOW_40_in_conditional_expression2010); if (state.failed) return symb;dbg.location(896,87);
					pushFollow(FOLLOW_conditional_expression_in_conditional_expression2012);
					conditional_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

			}
			} finally {dbg.exitSubRule(60);}

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
		dbg.location(897, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "conditional_expression"



	// $ANTLR start "logical_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:899:1: logical_or_expression returns [Symbol symb] : l1= logical_and_expression ( '||' logical_and_expression )* ;
	public final Symbol logical_or_expression() throws RecognitionException {
		Symbol symb = null;

		int logical_or_expression_StartIndex = input.index();

		Symbol l1 =null;

		try { dbg.enterRule(getGrammarFileName(), "logical_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(899, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:900:2: (l1= logical_and_expression ( '||' logical_and_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:900:4: l1= logical_and_expression ( '||' logical_and_expression )*
			{
			dbg.location(900,6);
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2031);
			l1=logical_and_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(900,30);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:900:30: ( '||' logical_and_expression )*
			try { dbg.enterSubRule(61);

			loop61:
			while (true) {
				int alt61=2;
				try { dbg.enterDecision(61, decisionCanBacktrack[61]);

				int LA61_0 = input.LA(1);
				if ( (LA61_0==93) ) {
					alt61=1;
				}

				} finally {dbg.exitDecision(61);}

				switch (alt61) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:900:31: '||' logical_and_expression
					{
					dbg.location(900,31);
					match(input,93,FOLLOW_93_in_logical_or_expression2034); if (state.failed) return symb;dbg.location(900,36);
					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression2036);
					logical_and_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop61;
				}
			}
			} finally {dbg.exitSubRule(61);}
			dbg.location(900,61);
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
		dbg.location(901, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "logical_or_expression"



	// $ANTLR start "logical_and_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:903:1: logical_and_expression returns [Symbol symb] : l1= inclusive_or_expression ( '&&' inclusive_or_expression )* ;
	public final Symbol logical_and_expression() throws RecognitionException {
		Symbol symb = null;

		int logical_and_expression_StartIndex = input.index();

		Symbol l1 =null;

		try { dbg.enterRule(getGrammarFileName(), "logical_and_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(903, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:904:2: (l1= inclusive_or_expression ( '&&' inclusive_or_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:904:4: l1= inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			dbg.location(904,6);
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression2057);
			l1=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(904,31);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:904:31: ( '&&' inclusive_or_expression )*
			try { dbg.enterSubRule(62);

			loop62:
			while (true) {
				int alt62=2;
				try { dbg.enterDecision(62, decisionCanBacktrack[62]);

				int LA62_0 = input.LA(1);
				if ( (LA62_0==21) ) {
					alt62=1;
				}

				} finally {dbg.exitDecision(62);}

				switch (alt62) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:904:32: '&&' inclusive_or_expression
					{
					dbg.location(904,32);
					match(input,21,FOLLOW_21_in_logical_and_expression2060); if (state.failed) return symb;dbg.location(904,37);
					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression2062);
					inclusive_or_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop62;
				}
			}
			} finally {dbg.exitSubRule(62);}
			dbg.location(904,63);
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
		dbg.location(905, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "logical_and_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "logical_and_expression"



	// $ANTLR start "inclusive_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:907:1: inclusive_or_expression returns [Symbol symb] : e1= exclusive_or_expression ( '|' exclusive_or_expression )* ;
	public final Symbol inclusive_or_expression() throws RecognitionException {
		Symbol symb = null;

		int inclusive_or_expression_StartIndex = input.index();

		Symbol e1 =null;

		try { dbg.enterRule(getGrammarFileName(), "inclusive_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(907, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:908:2: (e1= exclusive_or_expression ( '|' exclusive_or_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:908:4: e1= exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			dbg.location(908,6);
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression2083);
			e1=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(908,31);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:908:31: ( '|' exclusive_or_expression )*
			try { dbg.enterSubRule(63);

			loop63:
			while (true) {
				int alt63=2;
				try { dbg.enterDecision(63, decisionCanBacktrack[63]);

				int LA63_0 = input.LA(1);
				if ( (LA63_0==91) ) {
					alt63=1;
				}

				} finally {dbg.exitDecision(63);}

				switch (alt63) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:908:32: '|' exclusive_or_expression
					{
					dbg.location(908,32);
					match(input,91,FOLLOW_91_in_inclusive_or_expression2086); if (state.failed) return symb;dbg.location(908,36);
					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression2088);
					exclusive_or_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop63;
				}
			}
			} finally {dbg.exitSubRule(63);}
			dbg.location(908,62);
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
		dbg.location(909, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inclusive_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "inclusive_or_expression"



	// $ANTLR start "exclusive_or_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:911:1: exclusive_or_expression returns [Symbol symb] : a1= and_expression ( '^' and_expression )* ;
	public final Symbol exclusive_or_expression() throws RecognitionException {
		Symbol symb = null;

		int exclusive_or_expression_StartIndex = input.index();

		Symbol a1 =null;

		try { dbg.enterRule(getGrammarFileName(), "exclusive_or_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(911, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:912:2: (a1= and_expression ( '^' and_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:912:4: a1= and_expression ( '^' and_expression )*
			{
			dbg.location(912,6);
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression2109);
			a1=and_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(912,22);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:912:22: ( '^' and_expression )*
			try { dbg.enterSubRule(64);

			loop64:
			while (true) {
				int alt64=2;
				try { dbg.enterDecision(64, decisionCanBacktrack[64]);

				int LA64_0 = input.LA(1);
				if ( (LA64_0==55) ) {
					alt64=1;
				}

				} finally {dbg.exitDecision(64);}

				switch (alt64) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:912:23: '^' and_expression
					{
					dbg.location(912,23);
					match(input,55,FOLLOW_55_in_exclusive_or_expression2112); if (state.failed) return symb;dbg.location(912,27);
					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression2114);
					and_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop64;
				}
			}
			} finally {dbg.exitSubRule(64);}
			dbg.location(912,44);
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
		dbg.location(913, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exclusive_or_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "exclusive_or_expression"



	// $ANTLR start "and_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:915:1: and_expression returns [Symbol symb] : e1= equality_expression ( '&' equality_expression )* ;
	public final Symbol and_expression() throws RecognitionException {
		Symbol symb = null;

		int and_expression_StartIndex = input.index();

		Symbol e1 =null;

		try { dbg.enterRule(getGrammarFileName(), "and_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(915, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:916:2: (e1= equality_expression ( '&' equality_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:916:4: e1= equality_expression ( '&' equality_expression )*
			{
			dbg.location(916,6);
			pushFollow(FOLLOW_equality_expression_in_and_expression2135);
			e1=equality_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(916,27);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:916:27: ( '&' equality_expression )*
			try { dbg.enterSubRule(65);

			loop65:
			while (true) {
				int alt65=2;
				try { dbg.enterDecision(65, decisionCanBacktrack[65]);

				int LA65_0 = input.LA(1);
				if ( (LA65_0==22) ) {
					alt65=1;
				}

				} finally {dbg.exitDecision(65);}

				switch (alt65) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:916:28: '&' equality_expression
					{
					dbg.location(916,28);
					match(input,22,FOLLOW_22_in_and_expression2138); if (state.failed) return symb;dbg.location(916,32);
					pushFollow(FOLLOW_equality_expression_in_and_expression2140);
					equality_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop65;
				}
			}
			} finally {dbg.exitSubRule(65);}
			dbg.location(916,54);
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
		dbg.location(917, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "and_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "and_expression"



	// $ANTLR start "equality_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:918:1: equality_expression returns [Symbol symb] : r1= relational_expression ( ( '==' | '!=' ) relational_expression )* ;
	public final Symbol equality_expression() throws RecognitionException {
		Symbol symb = null;

		int equality_expression_StartIndex = input.index();

		Symbol r1 =null;

		try { dbg.enterRule(getGrammarFileName(), "equality_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(918, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:919:2: (r1= relational_expression ( ( '==' | '!=' ) relational_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:919:4: r1= relational_expression ( ( '==' | '!=' ) relational_expression )*
			{
			dbg.location(919,6);
			pushFollow(FOLLOW_relational_expression_in_equality_expression2160);
			r1=relational_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(919,29);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:919:29: ( ( '==' | '!=' ) relational_expression )*
			try { dbg.enterSubRule(66);

			loop66:
			while (true) {
				int alt66=2;
				try { dbg.enterDecision(66, decisionCanBacktrack[66]);

				int LA66_0 = input.LA(1);
				if ( (LA66_0==18||LA66_0==47) ) {
					alt66=1;
				}

				} finally {dbg.exitDecision(66);}

				switch (alt66) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:919:30: ( '==' | '!=' ) relational_expression
					{
					dbg.location(919,30);
					if ( input.LA(1)==18||input.LA(1)==47 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return symb;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(919,42);
					pushFollow(FOLLOW_relational_expression_in_equality_expression2169);
					relational_expression();
					state._fsp--;
					if (state.failed) return symb;
					}
					break;

				default :
					break loop66;
				}
			}
			} finally {dbg.exitSubRule(66);}
			dbg.location(919,66);
			if ( state.backtracking==0 ) { symb = r1; }
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
		dbg.location(920, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "equality_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "equality_expression"



	// $ANTLR start "relational_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:923:1: relational_expression returns [Symbol symb] : shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )* ;
	public final Symbol relational_expression() throws RecognitionException {
		Symbol symb = null;

		int relational_expression_StartIndex = input.index();

		ParserRuleReturnScope shift1 =null;
		ParserRuleReturnScope shift2 =null;

		 String op = null; String irOp = null; int line = -1; 
		try { dbg.enterRule(getGrammarFileName(), "relational_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(923, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return symb; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:925:2: (shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:925:4: shift1= shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )*
			{
			dbg.location(925,10);
			pushFollow(FOLLOW_shift_expression_in_relational_expression2196);
			shift1=shift_expression();
			state._fsp--;
			if (state.failed) return symb;dbg.location(925,28);
			if ( state.backtracking==0 ) { symb = (shift1!=null?((myCompilerParser.shift_expression_return)shift1).symb:null); line = (shift1!=null?(shift1.start):null).getLine();}dbg.location(926,2);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:926:2: ( ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression )*
			try { dbg.enterSubRule(68);

			loop68:
			while (true) {
				int alt68=2;
				try { dbg.enterDecision(68, decisionCanBacktrack[68]);

				int LA68_0 = input.LA(1);
				if ( (LA68_0==42||LA68_0==45||(LA68_0 >= 48 && LA68_0 <= 49)) ) {
					alt68=1;
				}

				} finally {dbg.exitDecision(68);}

				switch (alt68) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:926:3: ( '<' | '>' | '<=' | '>=' ) shift2= shift_expression
					{
					dbg.location(926,3);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:926:3: ( '<' | '>' | '<=' | '>=' )
					int alt67=4;
					try { dbg.enterSubRule(67);
					try { dbg.enterDecision(67, decisionCanBacktrack[67]);

					switch ( input.LA(1) ) {
					case 42:
						{
						alt67=1;
						}
						break;
					case 48:
						{
						alt67=2;
						}
						break;
					case 45:
						{
						alt67=3;
						}
						break;
					case 49:
						{
						alt67=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return symb;}
						NoViableAltException nvae =
							new NoViableAltException("", 67, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(67);}

					switch (alt67) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:926:4: '<'
							{
							dbg.location(926,4);
							match(input,42,FOLLOW_42_in_relational_expression2203); if (state.failed) return symb;dbg.location(926,8);
							if ( state.backtracking==0 ) { op = "<"; irOp = "slt"; }
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:927:3: '>'
							{
							dbg.location(927,3);
							match(input,48,FOLLOW_48_in_relational_expression2209); if (state.failed) return symb;dbg.location(927,7);
							if ( state.backtracking==0 ) { op = ">"; irOp = "sgt"; }
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:928:3: '<='
							{
							dbg.location(928,3);
							match(input,45,FOLLOW_45_in_relational_expression2215); if (state.failed) return symb;dbg.location(928,8);
							if ( state.backtracking==0 ) { op = "<="; irOp = "sle"; }
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:929:3: '>='
							{
							dbg.location(929,3);
							match(input,49,FOLLOW_49_in_relational_expression2221); if (state.failed) return symb;dbg.location(929,8);
							if ( state.backtracking==0 ) { op = ">="; irOp = "sge"; }
							}
							break;

					}
					} finally {dbg.exitSubRule(67);}
					dbg.location(930,10);
					pushFollow(FOLLOW_shift_expression_in_relational_expression2230);
					shift2=shift_expression();
					state._fsp--;
					if (state.failed) return symb;dbg.location(930,28);
					if ( state.backtracking==0 ) { symb = genRelationalCode(symb, (shift2!=null?((myCompilerParser.shift_expression_return)shift2).symb:null), op, irOp, line); }
					}
					break;

				default :
					break loop68;
				}
			}
			} finally {dbg.exitSubRule(68);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, relational_expression_StartIndex); }

		}
		dbg.location(932, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relational_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return symb;
	}
	// $ANTLR end "relational_expression"


	public static class shift_expression_return extends ParserRuleReturnScope {
		public Symbol symb;
	};


	// $ANTLR start "shift_expression"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:936:1: shift_expression returns [Symbol symb] : additive1= additive_expression ( ( '<<' | '>>' ) additive2= additive_expression )* ;
	public final myCompilerParser.shift_expression_return shift_expression() throws RecognitionException {
		myCompilerParser.shift_expression_return retval = new myCompilerParser.shift_expression_return();
		retval.start = input.LT(1);
		int shift_expression_StartIndex = input.index();

		ParserRuleReturnScope additive1 =null;
		ParserRuleReturnScope additive2 =null;

		 String op = null;
		try { dbg.enterRule(getGrammarFileName(), "shift_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(936, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:938:2: (additive1= additive_expression ( ( '<<' | '>>' ) additive2= additive_expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:938:4: additive1= additive_expression ( ( '<<' | '>>' ) additive2= additive_expression )*
			{
			dbg.location(938,13);
			pushFollow(FOLLOW_additive_expression_in_shift_expression2260);
			additive1=additive_expression();
			state._fsp--;
			if (state.failed) return retval;dbg.location(938,34);
			if ( state.backtracking==0 ) { retval.symb = (additive1!=null?((myCompilerParser.additive_expression_return)additive1).symb:null); }dbg.location(939,2);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:939:2: ( ( '<<' | '>>' ) additive2= additive_expression )*
			try { dbg.enterSubRule(70);

			loop70:
			while (true) {
				int alt70=2;
				try { dbg.enterDecision(70, decisionCanBacktrack[70]);

				int LA70_0 = input.LA(1);
				if ( (LA70_0==43||LA70_0==50) ) {
					alt70=1;
				}

				} finally {dbg.exitDecision(70);}

				switch (alt70) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:939:3: ( '<<' | '>>' ) additive2= additive_expression
					{
					dbg.location(939,3);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:939:3: ( '<<' | '>>' )
					int alt69=2;
					try { dbg.enterSubRule(69);
					try { dbg.enterDecision(69, decisionCanBacktrack[69]);

					int LA69_0 = input.LA(1);
					if ( (LA69_0==43) ) {
						alt69=1;
					}
					else if ( (LA69_0==50) ) {
						alt69=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 69, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(69);}

					switch (alt69) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:939:4: '<<'
							{
							dbg.location(939,4);
							match(input,43,FOLLOW_43_in_shift_expression2267); if (state.failed) return retval;dbg.location(939,9);
							if ( state.backtracking==0 ) { op = "<<"; }
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:940:3: '>>'
							{
							dbg.location(940,3);
							match(input,50,FOLLOW_50_in_shift_expression2273); if (state.failed) return retval;dbg.location(940,8);
							if ( state.backtracking==0 ) { op = ">>"; }
							}
							break;

					}
					} finally {dbg.exitSubRule(69);}
					dbg.location(941,13);
					pushFollow(FOLLOW_additive_expression_in_shift_expression2284);
					additive2=additive_expression();
					state._fsp--;
					if (state.failed) return retval;dbg.location(942,3);
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
					break loop70;
				}
			}
			} finally {dbg.exitSubRule(70);}

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
		dbg.location(961, 1);

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
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:967:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(967, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:968:2: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement )
			int alt71=6;
			try { dbg.enterDecision(71, decisionCanBacktrack[71]);

			try {
				isCyclicDecision = true;
				alt71 = dfa71.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(71);}

			switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:968:4: labeled_statement
					{
					dbg.location(968,4);
					pushFollow(FOLLOW_labeled_statement_in_statement2311);
					labeled_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:969:4: compound_statement
					{
					dbg.location(969,4);
					pushFollow(FOLLOW_compound_statement_in_statement2316);
					compound_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:970:4: expression_statement
					{
					dbg.location(970,4);
					pushFollow(FOLLOW_expression_statement_in_statement2321);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:971:4: selection_statement
					{
					dbg.location(971,4);
					pushFollow(FOLLOW_selection_statement_in_statement2326);
					selection_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:972:4: iteration_statement
					{
					dbg.location(972,4);
					pushFollow(FOLLOW_iteration_statement_in_statement2331);
					iteration_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:973:4: jump_statement
					{
					dbg.location(973,4);
					pushFollow(FOLLOW_jump_statement_in_statement2336);
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
		dbg.location(974, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "labeled_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:976:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );
	public final void labeled_statement() throws RecognitionException {
		int labeled_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "labeled_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(976, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:977:2: ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement )
			int alt72=3;
			try { dbg.enterDecision(72, decisionCanBacktrack[72]);

			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt72=1;
				}
				break;
			case 60:
				{
				alt72=2;
				}
				break;
			case 64:
				{
				alt72=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(72);}

			switch (alt72) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:977:4: IDENTIFIER ':' statement
					{
					dbg.location(977,4);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_labeled_statement2347); if (state.failed) return;dbg.location(977,15);
					match(input,40,FOLLOW_40_in_labeled_statement2349); if (state.failed) return;dbg.location(977,19);
					pushFollow(FOLLOW_statement_in_labeled_statement2351);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:978:4: 'case' constant_expression ':' statement
					{
					dbg.location(978,4);
					match(input,60,FOLLOW_60_in_labeled_statement2356); if (state.failed) return;dbg.location(978,11);
					pushFollow(FOLLOW_constant_expression_in_labeled_statement2358);
					constant_expression();
					state._fsp--;
					if (state.failed) return;dbg.location(978,31);
					match(input,40,FOLLOW_40_in_labeled_statement2360); if (state.failed) return;dbg.location(978,35);
					pushFollow(FOLLOW_statement_in_labeled_statement2362);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:979:4: 'default' ':' statement
					{
					dbg.location(979,4);
					match(input,64,FOLLOW_64_in_labeled_statement2367); if (state.failed) return;dbg.location(979,14);
					match(input,40,FOLLOW_40_in_labeled_statement2369); if (state.failed) return;dbg.location(979,18);
					pushFollow(FOLLOW_statement_in_labeled_statement2371);
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
		dbg.location(980, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "labeled_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "labeled_statement"



	// $ANTLR start "compound_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:983:1: compound_statement : '{' ( declaration )* ( statement_list )? '}' ;
	public final void compound_statement() throws RecognitionException {
		int compound_statement_StartIndex = input.index();

		ParserRuleReturnScope declaration32 =null;

		try { dbg.enterRule(getGrammarFileName(), "compound_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(983, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:988:2: ( '{' ( declaration )* ( statement_list )? '}' )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:988:4: '{' ( declaration )* ( statement_list )? '}'
			{
			dbg.location(988,4);
			match(input,90,FOLLOW_90_in_compound_statement2387); if (state.failed) return;dbg.location(988,8);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:988:8: ( declaration )*
			try { dbg.enterSubRule(73);

			loop73:
			while (true) {
				int alt73=2;
				try { dbg.enterDecision(73, decisionCanBacktrack[73]);

				int LA73_0 = input.LA(1);
				if ( ((LA73_0 >= 57 && LA73_0 <= 58)||(LA73_0 >= 61 && LA73_0 <= 62)||LA73_0==66||(LA73_0 >= 68 && LA73_0 <= 70)||(LA73_0 >= 74 && LA73_0 <= 76)||(LA73_0 >= 78 && LA73_0 <= 79)||(LA73_0 >= 81 && LA73_0 <= 82)||(LA73_0 >= 84 && LA73_0 <= 88)) ) {
					alt73=1;
				}

				} finally {dbg.exitDecision(73);}

				switch (alt73) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:988:9: declaration
					{
					dbg.location(988,9);
					pushFollow(FOLLOW_declaration_in_compound_statement2390);
					declaration32=declaration();
					state._fsp--;
					if (state.failed) return;dbg.location(989,4);
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
					break loop73;
				}
			}
			} finally {dbg.exitSubRule(73);}
			dbg.location(1035,3);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1035:3: ( statement_list )?
			int alt74=2;
			try { dbg.enterSubRule(74);
			try { dbg.enterDecision(74, decisionCanBacktrack[74]);

			int LA74_0 = input.LA(1);
			if ( (LA74_0==CHARACTER_LITERAL||LA74_0==DECIMAL_LITERAL||LA74_0==FLOATING_POINT_LITERAL||LA74_0==IDENTIFIER||LA74_0==STRING_LITERAL||LA74_0==17||LA74_0==22||LA74_0==24||LA74_0==26||(LA74_0 >= 28 && LA74_0 <= 29)||(LA74_0 >= 32 && LA74_0 <= 33)||LA74_0==41||(LA74_0 >= 59 && LA74_0 <= 60)||(LA74_0 >= 63 && LA74_0 <= 65)||(LA74_0 >= 71 && LA74_0 <= 73)||LA74_0==77||LA74_0==80||LA74_0==83||(LA74_0 >= 89 && LA74_0 <= 90)||LA74_0==95) ) {
				alt74=1;
			}
			} finally {dbg.exitDecision(74);}

			switch (alt74) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1035:3: statement_list
					{
					dbg.location(1035,3);
					pushFollow(FOLLOW_statement_list_in_compound_statement2405);
					statement_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(74);}
			dbg.location(1036,3);
			match(input,94,FOLLOW_94_in_compound_statement2410); if (state.failed) return;
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
		dbg.location(1037, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compound_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compound_statement"



	// $ANTLR start "statement_list"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1040:1: statement_list : ( statement )+ ;
	public final void statement_list() throws RecognitionException {
		int statement_list_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "statement_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1040, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1041:2: ( ( statement )+ )
			dbg.enterAlt(1);

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1041:4: ( statement )+
			{
			dbg.location(1041,4);
			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1041:4: ( statement )+
			int cnt75=0;
			try { dbg.enterSubRule(75);

			loop75:
			while (true) {
				int alt75=2;
				try { dbg.enterDecision(75, decisionCanBacktrack[75]);

				int LA75_0 = input.LA(1);
				if ( (LA75_0==CHARACTER_LITERAL||LA75_0==DECIMAL_LITERAL||LA75_0==FLOATING_POINT_LITERAL||LA75_0==IDENTIFIER||LA75_0==STRING_LITERAL||LA75_0==17||LA75_0==22||LA75_0==24||LA75_0==26||(LA75_0 >= 28 && LA75_0 <= 29)||(LA75_0 >= 32 && LA75_0 <= 33)||LA75_0==41||(LA75_0 >= 59 && LA75_0 <= 60)||(LA75_0 >= 63 && LA75_0 <= 65)||(LA75_0 >= 71 && LA75_0 <= 73)||LA75_0==77||LA75_0==80||LA75_0==83||(LA75_0 >= 89 && LA75_0 <= 90)||LA75_0==95) ) {
					alt75=1;
				}

				} finally {dbg.exitDecision(75);}

				switch (alt75) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1041:4: statement
					{
					dbg.location(1041,4);
					pushFollow(FOLLOW_statement_in_statement_list2422);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt75 >= 1 ) break loop75;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(75, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt75++;
			}
			} finally {dbg.exitSubRule(75);}

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
		dbg.location(1042, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement_list"



	// $ANTLR start "expression_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1045:1: expression_statement : ( ';' | expression ';' );
	public final void expression_statement() throws RecognitionException {
		int expression_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "expression_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1045, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1046:2: ( ';' | expression ';' )
			int alt76=2;
			try { dbg.enterDecision(76, decisionCanBacktrack[76]);

			int LA76_0 = input.LA(1);
			if ( (LA76_0==41) ) {
				alt76=1;
			}
			else if ( (LA76_0==CHARACTER_LITERAL||LA76_0==DECIMAL_LITERAL||LA76_0==FLOATING_POINT_LITERAL||LA76_0==IDENTIFIER||LA76_0==STRING_LITERAL||LA76_0==17||LA76_0==22||LA76_0==24||LA76_0==26||(LA76_0 >= 28 && LA76_0 <= 29)||(LA76_0 >= 32 && LA76_0 <= 33)||LA76_0==80||LA76_0==95) ) {
				alt76=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(76);}

			switch (alt76) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1046:4: ';'
					{
					dbg.location(1046,4);
					match(input,41,FOLLOW_41_in_expression_statement2435); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1047:4: expression ';'
					{
					dbg.location(1047,4);
					pushFollow(FOLLOW_expression_in_expression_statement2440);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(1047,15);
					match(input,41,FOLLOW_41_in_expression_statement2442); if (state.failed) return;
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
		dbg.location(1048, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression_statement"



	// $ANTLR start "selection_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1051:1: selection_statement : ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement );
	public final void selection_statement() throws RecognitionException {
		int selection_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "selection_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1051, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1052:2: ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement )
			int alt78=2;
			try { dbg.enterDecision(78, decisionCanBacktrack[78]);

			int LA78_0 = input.LA(1);
			if ( (LA78_0==73) ) {
				alt78=1;
			}
			else if ( (LA78_0==83) ) {
				alt78=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(78);}

			switch (alt78) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1052:4: 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )?
					{
					dbg.location(1052,4);
					match(input,73,FOLLOW_73_in_selection_statement2454); if (state.failed) return;dbg.location(1052,9);
					match(input,24,FOLLOW_24_in_selection_statement2456); if (state.failed) return;dbg.location(1052,13);
					pushFollow(FOLLOW_expression_in_selection_statement2458);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(1052,24);
					match(input,25,FOLLOW_25_in_selection_statement2460); if (state.failed) return;dbg.location(1052,28);
					pushFollow(FOLLOW_statement_in_selection_statement2462);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(1052,38);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1052:38: ( options {k=1; backtrack=false; } : 'else' statement )?
					int alt77=2;
					try { dbg.enterSubRule(77);
					try { dbg.enterDecision(77, decisionCanBacktrack[77]);

					int LA77_0 = input.LA(1);
					if ( (LA77_0==67) ) {
						int LA77_1 = input.LA(2);
						if ( (true) ) {
							alt77=1;
						}
					}
					} finally {dbg.exitDecision(77);}

					switch (alt77) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1052:71: 'else' statement
							{
							dbg.location(1052,71);
							match(input,67,FOLLOW_67_in_selection_statement2477); if (state.failed) return;dbg.location(1052,78);
							pushFollow(FOLLOW_statement_in_selection_statement2479);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(77);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1053:4: 'switch' '(' expression ')' statement
					{
					dbg.location(1053,4);
					match(input,83,FOLLOW_83_in_selection_statement2486); if (state.failed) return;dbg.location(1053,13);
					match(input,24,FOLLOW_24_in_selection_statement2488); if (state.failed) return;dbg.location(1053,17);
					pushFollow(FOLLOW_expression_in_selection_statement2490);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(1053,28);
					match(input,25,FOLLOW_25_in_selection_statement2492); if (state.failed) return;dbg.location(1053,32);
					pushFollow(FOLLOW_statement_in_selection_statement2494);
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
		dbg.location(1054, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selection_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selection_statement"



	// $ANTLR start "iteration_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1057:1: iteration_statement : ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement );
	public final void iteration_statement() throws RecognitionException {
		int iteration_statement_StartIndex = input.index();

		try { dbg.enterRule(getGrammarFileName(), "iteration_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1057, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1058:2: ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement )
			int alt80=3;
			try { dbg.enterDecision(80, decisionCanBacktrack[80]);

			switch ( input.LA(1) ) {
			case 89:
				{
				alt80=1;
				}
				break;
			case 65:
				{
				alt80=2;
				}
				break;
			case 71:
				{
				alt80=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(80);}

			switch (alt80) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1058:4: 'while' '(' expression ')' statement
					{
					dbg.location(1058,4);
					match(input,89,FOLLOW_89_in_iteration_statement2506); if (state.failed) return;dbg.location(1058,12);
					match(input,24,FOLLOW_24_in_iteration_statement2508); if (state.failed) return;dbg.location(1058,16);
					pushFollow(FOLLOW_expression_in_iteration_statement2510);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(1058,27);
					match(input,25,FOLLOW_25_in_iteration_statement2512); if (state.failed) return;dbg.location(1058,31);
					pushFollow(FOLLOW_statement_in_iteration_statement2514);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1059:4: 'do' statement 'while' '(' expression ')' ';'
					{
					dbg.location(1059,4);
					match(input,65,FOLLOW_65_in_iteration_statement2519); if (state.failed) return;dbg.location(1059,9);
					pushFollow(FOLLOW_statement_in_iteration_statement2521);
					statement();
					state._fsp--;
					if (state.failed) return;dbg.location(1059,19);
					match(input,89,FOLLOW_89_in_iteration_statement2523); if (state.failed) return;dbg.location(1059,27);
					match(input,24,FOLLOW_24_in_iteration_statement2525); if (state.failed) return;dbg.location(1059,31);
					pushFollow(FOLLOW_expression_in_iteration_statement2527);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(1059,42);
					match(input,25,FOLLOW_25_in_iteration_statement2529); if (state.failed) return;dbg.location(1059,46);
					match(input,41,FOLLOW_41_in_iteration_statement2531); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1060:4: 'for' '(' expression_statement expression_statement ( expression )? ')' statement
					{
					dbg.location(1060,4);
					match(input,71,FOLLOW_71_in_iteration_statement2536); if (state.failed) return;dbg.location(1060,10);
					match(input,24,FOLLOW_24_in_iteration_statement2538); if (state.failed) return;dbg.location(1060,14);
					pushFollow(FOLLOW_expression_statement_in_iteration_statement2540);
					expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(1060,35);
					pushFollow(FOLLOW_expression_statement_in_iteration_statement2542);
					expression_statement();
					state._fsp--;
					if (state.failed) return;dbg.location(1060,56);
					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1060:56: ( expression )?
					int alt79=2;
					try { dbg.enterSubRule(79);
					try { dbg.enterDecision(79, decisionCanBacktrack[79]);

					int LA79_0 = input.LA(1);
					if ( (LA79_0==CHARACTER_LITERAL||LA79_0==DECIMAL_LITERAL||LA79_0==FLOATING_POINT_LITERAL||LA79_0==IDENTIFIER||LA79_0==STRING_LITERAL||LA79_0==17||LA79_0==22||LA79_0==24||LA79_0==26||(LA79_0 >= 28 && LA79_0 <= 29)||(LA79_0 >= 32 && LA79_0 <= 33)||LA79_0==80||LA79_0==95) ) {
						alt79=1;
					}
					} finally {dbg.exitDecision(79);}

					switch (alt79) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1060:56: expression
							{
							dbg.location(1060,56);
							pushFollow(FOLLOW_expression_in_iteration_statement2544);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(79);}
					dbg.location(1060,68);
					match(input,25,FOLLOW_25_in_iteration_statement2547); if (state.failed) return;dbg.location(1060,72);
					pushFollow(FOLLOW_statement_in_iteration_statement2549);
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
		dbg.location(1061, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteration_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteration_statement"



	// $ANTLR start "jump_statement"
	// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1064:1: jump_statement : ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );
	public final void jump_statement() throws RecognitionException {
		int jump_statement_StartIndex = input.index();

		ParserRuleReturnScope expression33 =null;

		try { dbg.enterRule(getGrammarFileName(), "jump_statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(1064, 0);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1065:2: ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' )
			int alt81=5;
			try { dbg.enterDecision(81, decisionCanBacktrack[81]);

			switch ( input.LA(1) ) {
			case 72:
				{
				alt81=1;
				}
				break;
			case 63:
				{
				alt81=2;
				}
				break;
			case 59:
				{
				alt81=3;
				}
				break;
			case 77:
				{
				int LA81_4 = input.LA(2);
				if ( (LA81_4==41) ) {
					alt81=4;
				}
				else if ( (LA81_4==CHARACTER_LITERAL||LA81_4==DECIMAL_LITERAL||LA81_4==FLOATING_POINT_LITERAL||LA81_4==IDENTIFIER||LA81_4==STRING_LITERAL||LA81_4==17||LA81_4==22||LA81_4==24||LA81_4==26||(LA81_4 >= 28 && LA81_4 <= 29)||(LA81_4 >= 32 && LA81_4 <= 33)||LA81_4==80||LA81_4==95) ) {
					alt81=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 81, 4, input);
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
					new NoViableAltException("", 81, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(81);}

			switch (alt81) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1065:4: 'goto' IDENTIFIER ';'
					{
					dbg.location(1065,4);
					match(input,72,FOLLOW_72_in_jump_statement2561); if (state.failed) return;dbg.location(1065,11);
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_jump_statement2563); if (state.failed) return;dbg.location(1065,22);
					match(input,41,FOLLOW_41_in_jump_statement2565); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1066:4: 'continue' ';'
					{
					dbg.location(1066,4);
					match(input,63,FOLLOW_63_in_jump_statement2570); if (state.failed) return;dbg.location(1066,15);
					match(input,41,FOLLOW_41_in_jump_statement2572); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1067:4: 'break' ';'
					{
					dbg.location(1067,4);
					match(input,59,FOLLOW_59_in_jump_statement2577); if (state.failed) return;dbg.location(1067,12);
					match(input,41,FOLLOW_41_in_jump_statement2579); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1068:4: 'return' ';'
					{
					dbg.location(1068,4);
					match(input,77,FOLLOW_77_in_jump_statement2584); if (state.failed) return;dbg.location(1068,13);
					match(input,41,FOLLOW_41_in_jump_statement2586); if (state.failed) return;dbg.location(1068,17);
					if ( state.backtracking==0 ) { mainCode.add("ret void"); isReturned = true; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:1069:4: 'return' expression ';'
					{
					dbg.location(1069,4);
					match(input,77,FOLLOW_77_in_jump_statement2593); if (state.failed) return;dbg.location(1069,13);
					pushFollow(FOLLOW_expression_in_jump_statement2595);
					expression33=expression();
					state._fsp--;
					if (state.failed) return;dbg.location(1069,24);
					match(input,41,FOLLOW_41_in_jump_statement2597); if (state.failed) return;dbg.location(1070,3);
					if ( state.backtracking==0 ) { 	
								isReturned = true;
								if((expression33!=null?((myCompilerParser.expression_return)expression33).symb:null).isConstant == true) {
									mainCode.add("ret i32 " + (expression33!=null?((myCompilerParser.expression_return)expression33).symb:null).value);
								} else {
									Symbol symbol = new Symbol();
									mainCode.add(String.format("%%t%d = load i32, i32* %%t%d, align 4", symbol.offset, (expression33!=null?((myCompilerParser.expression_return)expression33).symb:null).offset));
									//TODO: undeclared variable
									// System.out.println("test906: " + (expression33!=null?input.toString(expression33.start,expression33.stop):null));
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
		dbg.location(1082, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "jump_statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "jump_statement"

	// $ANTLR start synpred4_myCompiler
	public final void synpred4_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:4: ( ( declaration_specifiers )? declarator ( declaration )* '{' )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:6: ( declaration_specifiers )? declarator ( declaration )* '{'
		{
		dbg.location(380,6);
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:6: ( declaration_specifiers )?
		int alt82=2;
		try { dbg.enterSubRule(82);
		try { dbg.enterDecision(82, decisionCanBacktrack[82]);

		int LA82_0 = input.LA(1);
		if ( ((LA82_0 >= 57 && LA82_0 <= 58)||(LA82_0 >= 61 && LA82_0 <= 62)||LA82_0==66||(LA82_0 >= 68 && LA82_0 <= 70)||(LA82_0 >= 74 && LA82_0 <= 76)||(LA82_0 >= 78 && LA82_0 <= 79)||(LA82_0 >= 81 && LA82_0 <= 82)||(LA82_0 >= 85 && LA82_0 <= 88)) ) {
			alt82=1;
		}
		} finally {dbg.exitDecision(82);}

		switch (alt82) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:6: declaration_specifiers
				{
				dbg.location(380,6);
				pushFollow(FOLLOW_declaration_specifiers_in_synpred4_myCompiler96);
				declaration_specifiers();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(82);}
		dbg.location(380,30);
		pushFollow(FOLLOW_declarator_in_synpred4_myCompiler99);
		declarator();
		state._fsp--;
		if (state.failed) return;dbg.location(380,41);
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:41: ( declaration )*
		try { dbg.enterSubRule(83);

		loop83:
		while (true) {
			int alt83=2;
			try { dbg.enterDecision(83, decisionCanBacktrack[83]);

			int LA83_0 = input.LA(1);
			if ( ((LA83_0 >= 57 && LA83_0 <= 58)||(LA83_0 >= 61 && LA83_0 <= 62)||LA83_0==66||(LA83_0 >= 68 && LA83_0 <= 70)||(LA83_0 >= 74 && LA83_0 <= 76)||(LA83_0 >= 78 && LA83_0 <= 79)||(LA83_0 >= 81 && LA83_0 <= 82)||(LA83_0 >= 84 && LA83_0 <= 88)) ) {
				alt83=1;
			}

			} finally {dbg.exitDecision(83);}

			switch (alt83) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:380:41: declaration
				{
				dbg.location(380,41);
				pushFollow(FOLLOW_declaration_in_synpred4_myCompiler101);
				declaration();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop83;
			}
		}
		} finally {dbg.exitSubRule(83);}
		dbg.location(380,54);
		match(input,90,FOLLOW_90_in_synpred4_myCompiler104); if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_myCompiler

	// $ANTLR start synpred45_myCompiler
	public final void synpred45_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:4: ( ( pointer )? direct_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:4: ( pointer )? direct_declarator
		{
		dbg.location(565,4);
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:4: ( pointer )?
		int alt88=2;
		try { dbg.enterSubRule(88);
		try { dbg.enterDecision(88, decisionCanBacktrack[88]);

		int LA88_0 = input.LA(1);
		if ( (LA88_0==26) ) {
			alt88=1;
		}
		} finally {dbg.exitDecision(88);}

		switch (alt88) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:565:4: pointer
				{
				dbg.location(565,4);
				pushFollow(FOLLOW_pointer_in_synpred45_myCompiler758);
				pointer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(88);}
		dbg.location(565,13);
		pushFollow(FOLLOW_direct_declarator_in_synpred45_myCompiler761);
		direct_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred45_myCompiler

	// $ANTLR start synpred47_myCompiler
	public final void synpred47_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:580:7: ( declarator_suffix )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:580:7: declarator_suffix
		{
		dbg.location(580,7);
		pushFollow(FOLLOW_declarator_suffix_in_synpred47_myCompiler832);
		declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred47_myCompiler

	// $ANTLR start synpred52_myCompiler
	public final void synpred52_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:8: ( type_qualifier )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:8: type_qualifier
		{
		dbg.location(593,8);
		pushFollow(FOLLOW_type_qualifier_in_synpred52_myCompiler933);
		type_qualifier();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_myCompiler

	// $ANTLR start synpred53_myCompiler
	public final void synpred53_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:24: ( pointer )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:24: pointer
		{
		dbg.location(593,24);
		pushFollow(FOLLOW_pointer_in_synpred53_myCompiler936);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred53_myCompiler

	// $ANTLR start synpred54_myCompiler
	public final void synpred54_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:4: ( '*' ( type_qualifier )+ ( pointer )? )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:4: '*' ( type_qualifier )+ ( pointer )?
		{
		dbg.location(593,4);
		match(input,26,FOLLOW_26_in_synpred54_myCompiler931); if (state.failed) return;dbg.location(593,8);
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:8: ( type_qualifier )+
		int cnt89=0;
		try { dbg.enterSubRule(89);

		loop89:
		while (true) {
			int alt89=2;
			try { dbg.enterDecision(89, decisionCanBacktrack[89]);

			int LA89_0 = input.LA(1);
			if ( (LA89_0==62||LA89_0==88) ) {
				alt89=1;
			}

			} finally {dbg.exitDecision(89);}

			switch (alt89) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:8: type_qualifier
				{
				dbg.location(593,8);
				pushFollow(FOLLOW_type_qualifier_in_synpred54_myCompiler933);
				type_qualifier();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				if ( cnt89 >= 1 ) break loop89;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(89, input);
				dbg.recognitionException(eee);

				throw eee;
			}
			cnt89++;
		}
		} finally {dbg.exitSubRule(89);}
		dbg.location(593,24);
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:24: ( pointer )?
		int alt90=2;
		try { dbg.enterSubRule(90);
		try { dbg.enterDecision(90, decisionCanBacktrack[90]);

		int LA90_0 = input.LA(1);
		if ( (LA90_0==26) ) {
			alt90=1;
		}
		} finally {dbg.exitDecision(90);}

		switch (alt90) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:593:24: pointer
				{
				dbg.location(593,24);
				pushFollow(FOLLOW_pointer_in_synpred54_myCompiler936);
				pointer();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(90);}

		}

	}
	// $ANTLR end synpred54_myCompiler

	// $ANTLR start synpred55_myCompiler
	public final void synpred55_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:594:4: ( '*' pointer )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:594:4: '*' pointer
		{
		dbg.location(594,4);
		match(input,26,FOLLOW_26_in_synpred55_myCompiler942); if (state.failed) return;dbg.location(594,8);
		pushFollow(FOLLOW_pointer_in_synpred55_myCompiler944);
		pointer();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred55_myCompiler

	// $ANTLR start synpred58_myCompiler
	public final void synpred58_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:28: ( declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:28: declarator
		{
		dbg.location(610,28);
		pushFollow(FOLLOW_declarator_in_synpred58_myCompiler1002);
		declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred58_myCompiler

	// $ANTLR start synpred59_myCompiler
	public final void synpred59_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:39: ( abstract_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:610:39: abstract_declarator
		{
		dbg.location(610,39);
		pushFollow(FOLLOW_abstract_declarator_in_synpred59_myCompiler1004);
		abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_myCompiler

	// $ANTLR start synpred62_myCompiler
	public final void synpred62_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:625:12: ( direct_abstract_declarator )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:625:12: direct_abstract_declarator
		{
		dbg.location(625,12);
		pushFollow(FOLLOW_direct_abstract_declarator_in_synpred62_myCompiler1054);
		direct_abstract_declarator();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_myCompiler

	// $ANTLR start synpred65_myCompiler
	public final void synpred65_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:65: ( abstract_declarator_suffix )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:631:65: abstract_declarator_suffix
		{
		dbg.location(631,65);
		pushFollow(FOLLOW_abstract_declarator_suffix_in_synpred65_myCompiler1086);
		abstract_declarator_suffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred65_myCompiler

	// $ANTLR start synpred83_myCompiler
	public final void synpred83_myCompiler_fragment() throws RecognitionException {
		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:724:4: ( 'sizeof' unary_expression )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:724:4: 'sizeof' unary_expression
		{
		dbg.location(724,4);
		match(input,80,FOLLOW_80_in_synpred83_myCompiler1443); if (state.failed) return;dbg.location(724,13);
		pushFollow(FOLLOW_unary_expression_in_synpred83_myCompiler1445);
		unary_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred83_myCompiler

	// $ANTLR start synpred102_myCompiler
	public final void synpred102_myCompiler_fragment() throws RecognitionException {
		Symbol asgn2 =null;

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:842:4: ( lvalue assignment_operator asgn2= assignment_expression )
		dbg.enterAlt(1);

		// C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\myCompiler.g:842:4: lvalue assignment_operator asgn2= assignment_expression
		{
		dbg.location(842,4);
		pushFollow(FOLLOW_lvalue_in_synpred102_myCompiler1855);
		lvalue();
		state._fsp--;
		if (state.failed) return;dbg.location(842,11);
		pushFollow(FOLLOW_assignment_operator_in_synpred102_myCompiler1857);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;dbg.location(842,36);
		pushFollow(FOLLOW_assignment_expression_in_synpred102_myCompiler1861);
		asgn2=assignment_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred102_myCompiler

	// Delegated rules

	public final boolean synpred53_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred53_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred45_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred45_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred58_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred58_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred55_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred55_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred65_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred65_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred83_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred83_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred59_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred59_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred62_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred62_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred52_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred52_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred102_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred102_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred54_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred54_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred47_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred47_myCompiler_fragment(); // can never throw exception
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
	public final boolean synpred4_myCompiler() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred4_myCompiler_fragment(); // can never throw exception
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


	protected DFA28 dfa28 = new DFA28(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA58 dfa58 = new DFA58(this);
	protected DFA71 dfa71 = new DFA71(this);
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
			return "()* loopback of 580:7: ( declarator_suffix )*";
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
			return "()+ loopback of 593:8: ( type_qualifier )+";
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
			return "593:24: ( pointer )?";
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

	static final String DFA58_eotS =
		"\u0186\uffff";
	static final String DFA58_eofS =
		"\1\uffff\5\41\u0180\uffff";
	static final String DFA58_minS =
		"\1\4\5\22\12\4\6\0\44\uffff\6\0\44\uffff\6\0\44\uffff\6\0\44\uffff\6\0"+
		"\44\uffff\17\0\16\uffff\u0087\0";
	static final String DFA58_maxS =
		"\1\137\5\136\12\137\6\0\44\uffff\6\0\44\uffff\6\0\44\uffff\6\0\44\uffff"+
		"\6\0\44\uffff\17\0\16\uffff\u0087\0";
	static final String DFA58_acceptS =
		"\26\uffff\1\1\12\uffff\1\2\u0164\uffff";
	static final String DFA58_specialS =
		"\20\uffff\1\0\1\1\1\2\1\3\1\4\1\5\44\uffff\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\44\uffff\1\14\1\15\1\16\1\17\1\20\1\21\44\uffff\1\22\1\23\1\24\1\25\1"+
		"\26\1\27\44\uffff\1\30\1\31\1\32\1\33\1\34\1\35\44\uffff\1\36\1\37\1\40"+
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
			"\2\41\1\26\2\41\1\26\1\73\2\41\1\26\1\41\1\76\1\26\2\41\1\77\1\26\1"+
			"\75\1\74\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26\1\41\1\72\2"+
			"\41\1\26\42\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\145\2\41\1\26\1\41\1\150\1\26\2\41\1\151\1\26"+
			"\1\147\1\146\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26\1\41\1\144"+
			"\2\41\1\26\42\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\u008f\2\41\1\26\1\41\1\u0092\1\26\2\41\1\u0093"+
			"\1\26\1\u0091\1\u0090\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26"+
			"\1\41\1\u008e\2\41\1\26\42\uffff\1\41\1\26\2\41",
			"\2\41\1\26\2\41\1\26\1\u00b9\2\41\1\26\1\41\1\u00bc\1\26\2\41\1\u00bd"+
			"\1\26\1\u00bb\1\u00ba\1\uffff\1\41\1\26\4\41\1\26\1\41\1\26\4\41\1\26"+
			"\1\41\1\u00b8\2\41\1\26\42\uffff\1\41\1\26\2\41",
			"\1\u00e4\1\uffff\1\u00e3\2\uffff\1\u00e6\1\uffff\1\u00e2\3\uffff\1\u00e5"+
			"\1\uffff\1\u00ef\4\uffff\1\u00ea\1\uffff\1\u00e7\1\uffff\1\u00eb\1\uffff"+
			"\1\u00ec\1\u00e8\2\uffff\1\u00ed\1\u00e9\30\uffff\1\41\2\uffff\2\41\3"+
			"\uffff\1\41\1\uffff\1\41\1\uffff\1\41\3\uffff\2\41\2\uffff\2\41\1\u00f0"+
			"\1\uffff\1\41\2\uffff\4\41\6\uffff\1\u00ee",
			"\1\u0101\1\uffff\1\u0100\2\uffff\1\u0103\1\uffff\1\u00ff\3\uffff\1\u0102"+
			"\1\uffff\1\u010c\4\uffff\1\u0107\1\uffff\1\u0104\1\uffff\1\u0108\1\uffff"+
			"\1\u0109\1\u0105\2\uffff\1\u010a\1\u0106\56\uffff\1\u010d\16\uffff\1"+
			"\u010b",
			"\1\u0110\1\uffff\1\u010f\2\uffff\1\u0112\1\uffff\1\u010e\3\uffff\1\u0111"+
			"\1\uffff\1\u011b\4\uffff\1\u0116\1\uffff\1\u0113\1\uffff\1\u0117\1\uffff"+
			"\1\u0118\1\u0114\2\uffff\1\u0119\1\u0115\56\uffff\1\u011c\16\uffff\1"+
			"\u011a",
			"\1\u0120\1\uffff\1\u011f\2\uffff\1\u0122\1\uffff\1\u011e\3\uffff\1\u0121"+
			"\1\uffff\1\u012a\4\uffff\1\u0125\1\uffff\1\u011d\1\uffff\1\u0126\1\uffff"+
			"\1\u0127\1\u0123\2\uffff\1\u0128\1\u0124\56\uffff\1\u012b\16\uffff\1"+
			"\u0129",
			"\1\u012f\1\uffff\1\u012e\2\uffff\1\u0131\1\uffff\1\u012d\3\uffff\1\u0130"+
			"\1\uffff\1\u0139\4\uffff\1\u0134\1\uffff\1\u012c\1\uffff\1\u0135\1\uffff"+
			"\1\u0136\1\u0132\2\uffff\1\u0137\1\u0133\56\uffff\1\u013a\16\uffff\1"+
			"\u0138",
			"\1\u013e\1\uffff\1\u013d\2\uffff\1\u0140\1\uffff\1\u013c\3\uffff\1\u013f"+
			"\1\uffff\1\u0148\4\uffff\1\u0143\1\uffff\1\u013b\1\uffff\1\u0144\1\uffff"+
			"\1\u0145\1\u0141\2\uffff\1\u0146\1\u0142\56\uffff\1\u0149\16\uffff\1"+
			"\u0147",
			"\1\u014d\1\uffff\1\u014c\2\uffff\1\u014f\1\uffff\1\u014b\3\uffff\1\u014e"+
			"\1\uffff\1\u0157\4\uffff\1\u0152\1\uffff\1\u014a\1\uffff\1\u0153\1\uffff"+
			"\1\u0154\1\u0150\2\uffff\1\u0155\1\u0151\56\uffff\1\u0158\16\uffff\1"+
			"\u0156",
			"\1\u015c\1\uffff\1\u015b\2\uffff\1\u015e\1\uffff\1\u015a\3\uffff\1\u015d"+
			"\1\uffff\1\u0166\4\uffff\1\u0161\1\uffff\1\u0159\1\uffff\1\u0162\1\uffff"+
			"\1\u0163\1\u015f\2\uffff\1\u0164\1\u0160\56\uffff\1\u0167\16\uffff\1"+
			"\u0165",
			"\1\u016b\1\uffff\1\u016a\2\uffff\1\u016d\1\uffff\1\u0169\3\uffff\1\u016c"+
			"\1\uffff\1\u0175\4\uffff\1\u0170\1\uffff\1\u0168\1\uffff\1\u0171\1\uffff"+
			"\1\u0172\1\u016e\2\uffff\1\u0173\1\u016f\56\uffff\1\u0176\16\uffff\1"+
			"\u0174",
			"\1\u017a\1\uffff\1\u0179\2\uffff\1\u017c\1\uffff\1\u0178\3\uffff\1\u017b"+
			"\1\uffff\1\u0184\4\uffff\1\u017f\1\uffff\1\u0177\1\uffff\1\u0180\1\uffff"+
			"\1\u0181\1\u017d\2\uffff\1\u0182\1\u017e\56\uffff\1\u0185\16\uffff\1"+
			"\u0183",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			return "841:1: assignment_expression returns [Symbol symb] : ( lvalue assignment_operator asgn2= assignment_expression | conditional_expression );";
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
						int LA58_58 = input.LA(1);
						 
						int index58_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_58);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA58_59 = input.LA(1);
						 
						int index58_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_59);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA58_60 = input.LA(1);
						 
						int index58_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_60);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA58_61 = input.LA(1);
						 
						int index58_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_61);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA58_62 = input.LA(1);
						 
						int index58_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_62);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA58_63 = input.LA(1);
						 
						int index58_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_63);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA58_100 = input.LA(1);
						 
						int index58_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_100);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA58_101 = input.LA(1);
						 
						int index58_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_101);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA58_102 = input.LA(1);
						 
						int index58_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_102);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA58_103 = input.LA(1);
						 
						int index58_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_103);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA58_104 = input.LA(1);
						 
						int index58_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_104);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA58_105 = input.LA(1);
						 
						int index58_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_105);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA58_142 = input.LA(1);
						 
						int index58_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_142);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA58_143 = input.LA(1);
						 
						int index58_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_143);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA58_144 = input.LA(1);
						 
						int index58_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_144);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA58_145 = input.LA(1);
						 
						int index58_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_145);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA58_146 = input.LA(1);
						 
						int index58_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_146);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA58_147 = input.LA(1);
						 
						int index58_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_147);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA58_184 = input.LA(1);
						 
						int index58_184 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_184);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA58_185 = input.LA(1);
						 
						int index58_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_185);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA58_186 = input.LA(1);
						 
						int index58_186 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_186);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA58_187 = input.LA(1);
						 
						int index58_187 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_187);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA58_188 = input.LA(1);
						 
						int index58_188 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_188);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA58_189 = input.LA(1);
						 
						int index58_189 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_189);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA58_226 = input.LA(1);
						 
						int index58_226 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_226);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA58_227 = input.LA(1);
						 
						int index58_227 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_227);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA58_228 = input.LA(1);
						 
						int index58_228 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_228);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA58_229 = input.LA(1);
						 
						int index58_229 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_229);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA58_230 = input.LA(1);
						 
						int index58_230 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_230);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA58_231 = input.LA(1);
						 
						int index58_231 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_231);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA58_232 = input.LA(1);
						 
						int index58_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_232);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA58_233 = input.LA(1);
						 
						int index58_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_233);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA58_234 = input.LA(1);
						 
						int index58_234 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_234);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA58_235 = input.LA(1);
						 
						int index58_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_235);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA58_236 = input.LA(1);
						 
						int index58_236 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_236);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA58_237 = input.LA(1);
						 
						int index58_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_237);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA58_238 = input.LA(1);
						 
						int index58_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_238);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA58_239 = input.LA(1);
						 
						int index58_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_239);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA58_240 = input.LA(1);
						 
						int index58_240 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_240);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA58_255 = input.LA(1);
						 
						int index58_255 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_255);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA58_256 = input.LA(1);
						 
						int index58_256 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_256);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA58_257 = input.LA(1);
						 
						int index58_257 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_257);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA58_258 = input.LA(1);
						 
						int index58_258 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_258);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA58_259 = input.LA(1);
						 
						int index58_259 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_259);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA58_260 = input.LA(1);
						 
						int index58_260 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_260);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA58_261 = input.LA(1);
						 
						int index58_261 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_261);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA58_262 = input.LA(1);
						 
						int index58_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_262);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA58_263 = input.LA(1);
						 
						int index58_263 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_263);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA58_264 = input.LA(1);
						 
						int index58_264 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_264);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA58_265 = input.LA(1);
						 
						int index58_265 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_265);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA58_266 = input.LA(1);
						 
						int index58_266 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_266);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA58_267 = input.LA(1);
						 
						int index58_267 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_267);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA58_268 = input.LA(1);
						 
						int index58_268 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_268);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA58_269 = input.LA(1);
						 
						int index58_269 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_269);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA58_270 = input.LA(1);
						 
						int index58_270 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_270);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA58_271 = input.LA(1);
						 
						int index58_271 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_271);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA58_272 = input.LA(1);
						 
						int index58_272 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_272);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA58_273 = input.LA(1);
						 
						int index58_273 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_273);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA58_274 = input.LA(1);
						 
						int index58_274 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_274);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA58_275 = input.LA(1);
						 
						int index58_275 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_275);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA58_276 = input.LA(1);
						 
						int index58_276 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_276);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA58_277 = input.LA(1);
						 
						int index58_277 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_277);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA58_278 = input.LA(1);
						 
						int index58_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_278);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA58_279 = input.LA(1);
						 
						int index58_279 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_279);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA58_280 = input.LA(1);
						 
						int index58_280 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_280);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA58_281 = input.LA(1);
						 
						int index58_281 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_281);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA58_282 = input.LA(1);
						 
						int index58_282 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_282);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA58_283 = input.LA(1);
						 
						int index58_283 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_283);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA58_284 = input.LA(1);
						 
						int index58_284 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_284);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA58_285 = input.LA(1);
						 
						int index58_285 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_285);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA58_286 = input.LA(1);
						 
						int index58_286 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_286);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA58_287 = input.LA(1);
						 
						int index58_287 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_287);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA58_288 = input.LA(1);
						 
						int index58_288 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_288);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA58_289 = input.LA(1);
						 
						int index58_289 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_289);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA58_290 = input.LA(1);
						 
						int index58_290 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_290);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA58_291 = input.LA(1);
						 
						int index58_291 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_291);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA58_292 = input.LA(1);
						 
						int index58_292 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_292);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA58_293 = input.LA(1);
						 
						int index58_293 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_293);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA58_294 = input.LA(1);
						 
						int index58_294 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_294);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA58_295 = input.LA(1);
						 
						int index58_295 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_295);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA58_296 = input.LA(1);
						 
						int index58_296 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_296);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA58_297 = input.LA(1);
						 
						int index58_297 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_297);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA58_298 = input.LA(1);
						 
						int index58_298 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_298);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA58_299 = input.LA(1);
						 
						int index58_299 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_299);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA58_300 = input.LA(1);
						 
						int index58_300 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_300);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA58_301 = input.LA(1);
						 
						int index58_301 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_301);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA58_302 = input.LA(1);
						 
						int index58_302 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_302);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA58_303 = input.LA(1);
						 
						int index58_303 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_303);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA58_304 = input.LA(1);
						 
						int index58_304 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_304);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA58_305 = input.LA(1);
						 
						int index58_305 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_305);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA58_306 = input.LA(1);
						 
						int index58_306 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_306);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA58_307 = input.LA(1);
						 
						int index58_307 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_307);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA58_308 = input.LA(1);
						 
						int index58_308 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_308);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA58_309 = input.LA(1);
						 
						int index58_309 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_309);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA58_310 = input.LA(1);
						 
						int index58_310 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_310);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA58_311 = input.LA(1);
						 
						int index58_311 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_311);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA58_312 = input.LA(1);
						 
						int index58_312 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_312);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA58_313 = input.LA(1);
						 
						int index58_313 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_313);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA58_314 = input.LA(1);
						 
						int index58_314 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_314);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA58_315 = input.LA(1);
						 
						int index58_315 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_315);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA58_316 = input.LA(1);
						 
						int index58_316 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_316);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA58_317 = input.LA(1);
						 
						int index58_317 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_317);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA58_318 = input.LA(1);
						 
						int index58_318 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_318);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA58_319 = input.LA(1);
						 
						int index58_319 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_319);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA58_320 = input.LA(1);
						 
						int index58_320 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_320);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA58_321 = input.LA(1);
						 
						int index58_321 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_321);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA58_322 = input.LA(1);
						 
						int index58_322 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_322);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA58_323 = input.LA(1);
						 
						int index58_323 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_323);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA58_324 = input.LA(1);
						 
						int index58_324 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_324);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA58_325 = input.LA(1);
						 
						int index58_325 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_325);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA58_326 = input.LA(1);
						 
						int index58_326 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_326);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA58_327 = input.LA(1);
						 
						int index58_327 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_327);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA58_328 = input.LA(1);
						 
						int index58_328 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_328);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA58_329 = input.LA(1);
						 
						int index58_329 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_329);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA58_330 = input.LA(1);
						 
						int index58_330 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_330);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA58_331 = input.LA(1);
						 
						int index58_331 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_331);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA58_332 = input.LA(1);
						 
						int index58_332 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_332);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA58_333 = input.LA(1);
						 
						int index58_333 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_333);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA58_334 = input.LA(1);
						 
						int index58_334 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_334);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA58_335 = input.LA(1);
						 
						int index58_335 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_335);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA58_336 = input.LA(1);
						 
						int index58_336 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_336);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA58_337 = input.LA(1);
						 
						int index58_337 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_337);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA58_338 = input.LA(1);
						 
						int index58_338 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_338);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA58_339 = input.LA(1);
						 
						int index58_339 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_339);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA58_340 = input.LA(1);
						 
						int index58_340 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_340);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA58_341 = input.LA(1);
						 
						int index58_341 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_341);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA58_342 = input.LA(1);
						 
						int index58_342 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_342);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA58_343 = input.LA(1);
						 
						int index58_343 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_343);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA58_344 = input.LA(1);
						 
						int index58_344 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_344);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA58_345 = input.LA(1);
						 
						int index58_345 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_345);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA58_346 = input.LA(1);
						 
						int index58_346 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_346);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA58_347 = input.LA(1);
						 
						int index58_347 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_347);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA58_348 = input.LA(1);
						 
						int index58_348 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_348);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA58_349 = input.LA(1);
						 
						int index58_349 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_349);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA58_350 = input.LA(1);
						 
						int index58_350 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_350);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA58_351 = input.LA(1);
						 
						int index58_351 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_351);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA58_352 = input.LA(1);
						 
						int index58_352 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_352);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA58_353 = input.LA(1);
						 
						int index58_353 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_353);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA58_354 = input.LA(1);
						 
						int index58_354 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_354);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA58_355 = input.LA(1);
						 
						int index58_355 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_355);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA58_356 = input.LA(1);
						 
						int index58_356 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_356);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA58_357 = input.LA(1);
						 
						int index58_357 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_357);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA58_358 = input.LA(1);
						 
						int index58_358 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_358);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA58_359 = input.LA(1);
						 
						int index58_359 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_359);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA58_360 = input.LA(1);
						 
						int index58_360 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_360);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA58_361 = input.LA(1);
						 
						int index58_361 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_361);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA58_362 = input.LA(1);
						 
						int index58_362 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_362);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA58_363 = input.LA(1);
						 
						int index58_363 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_363);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA58_364 = input.LA(1);
						 
						int index58_364 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_364);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA58_365 = input.LA(1);
						 
						int index58_365 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_365);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA58_366 = input.LA(1);
						 
						int index58_366 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_366);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA58_367 = input.LA(1);
						 
						int index58_367 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_367);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA58_368 = input.LA(1);
						 
						int index58_368 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_368);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA58_369 = input.LA(1);
						 
						int index58_369 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_369);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA58_370 = input.LA(1);
						 
						int index58_370 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_370);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA58_371 = input.LA(1);
						 
						int index58_371 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_371);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA58_372 = input.LA(1);
						 
						int index58_372 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_372);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA58_373 = input.LA(1);
						 
						int index58_373 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_373);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA58_374 = input.LA(1);
						 
						int index58_374 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_374);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA58_375 = input.LA(1);
						 
						int index58_375 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_375);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA58_376 = input.LA(1);
						 
						int index58_376 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_376);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA58_377 = input.LA(1);
						 
						int index58_377 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_377);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA58_378 = input.LA(1);
						 
						int index58_378 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_378);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA58_379 = input.LA(1);
						 
						int index58_379 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_379);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA58_380 = input.LA(1);
						 
						int index58_380 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_380);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA58_381 = input.LA(1);
						 
						int index58_381 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_381);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA58_382 = input.LA(1);
						 
						int index58_382 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_382);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA58_383 = input.LA(1);
						 
						int index58_383 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_383);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA58_384 = input.LA(1);
						 
						int index58_384 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_384);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA58_385 = input.LA(1);
						 
						int index58_385 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_385);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA58_386 = input.LA(1);
						 
						int index58_386 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_386);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA58_387 = input.LA(1);
						 
						int index58_387 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_387);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA58_388 = input.LA(1);
						 
						int index58_388 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_388);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA58_389 = input.LA(1);
						 
						int index58_389 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred102_myCompiler()) ) {s = 22;}
						else if ( (true) ) {s = 33;}
						 
						input.seek(index58_389);
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

	static final String DFA71_eotS =
		"\103\uffff";
	static final String DFA71_eofS =
		"\103\uffff";
	static final String DFA71_minS =
		"\1\4\1\22\101\uffff";
	static final String DFA71_maxS =
		"\1\137\1\135\101\uffff";
	static final String DFA71_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\1\3\16\uffff\1\4\1\uffff\1\5\2\uffff\1\6\51\uffff";
	static final String DFA71_specialS =
		"\103\uffff}>";
	static final String[] DFA71_transitionS = {
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
			""
	};

	static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
	static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
	static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
	static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
	static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
	static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
	static final short[][] DFA71_transition;

	static {
		int numStates = DFA71_transitionS.length;
		DFA71_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
		}
	}

	protected class DFA71 extends DFA {

		public DFA71(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 71;
			this.eot = DFA71_eot;
			this.eof = DFA71_eof;
			this.min = DFA71_min;
			this.max = DFA71_max;
			this.accept = DFA71_accept;
			this.special = DFA71_special;
			this.transition = DFA71_transition;
		}
		@Override
		public String getDescription() {
			return "967:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_external_declaration_in_translation_unit74 = new BitSet(new long[]{0x6600000005000802L,0x0000000001F6DC74L});
	public static final BitSet FOLLOW_function_definition_in_external_declaration109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_external_declaration114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_function_definition130 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_declarator_in_function_definition133 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_declaration_in_function_definition153 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_declaration197 = new BitSet(new long[]{0x6600000005000800L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_declaration_specifiers_in_declaration199 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_init_declarator_list_in_declaration206 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_declaration208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_declaration214 = new BitSet(new long[]{0x0000020005000800L});
	public static final BitSet FOLLOW_init_declarator_list_in_declaration216 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_declaration219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers245 = new BitSet(new long[]{0x6600000000000002L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers252 = new BitSet(new long[]{0x6600000000000002L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers262 = new BitSet(new long[]{0x6600000000000002L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list295 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_init_declarator_list305 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarator_list309 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_declarator_in_init_declarator334 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_init_declarator339 = new BitSet(new long[]{0x0000000335428A50L,0x0000000084010000L});
	public static final BitSet FOLLOW_initializer_in_init_declarator341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_storage_class_specifier362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_storage_class_specifier369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_storage_class_specifier376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_storage_class_specifier383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_type_specifier400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_type_specifier407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_type_specifier414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_type_specifier421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_type_specifier428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_type_specifier435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_type_specifier442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_type_specifier449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_type_specifier456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_specifier_in_type_specifier471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_type_specifier482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier516 = new BitSet(new long[]{0x0000000000000800L,0x0000000004000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier518 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_struct_or_union_specifier521 = new BitSet(new long[]{0x6400000000000000L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier523 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_struct_or_union_specifier525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier530 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list559 = new BitSet(new long[]{0x6400000000000002L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration571 = new BitSet(new long[]{0x0000010005000800L});
	public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration573 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_struct_declaration575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list588 = new BitSet(new long[]{0x6400000000000002L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list592 = new BitSet(new long[]{0x6400000000000002L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list606 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_struct_declarator_list609 = new BitSet(new long[]{0x0000010005000800L});
	public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list611 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_declarator_in_struct_declarator624 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_struct_declarator627 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_struct_declarator629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_struct_declarator636 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_struct_declarator638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_enum_specifier656 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_enum_specifier658 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_enumerator_list_in_enum_specifier660 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_enum_specifier662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_enum_specifier667 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier669 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_enum_specifier671 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_enumerator_list_in_enum_specifier673 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_enum_specifier675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_enum_specifier680 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerator_in_enumerator_list693 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_enumerator_list696 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_enumerator_in_enumerator_list698 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enumerator711 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_enumerator714 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_enumerator716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_type_qualifier733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_type_qualifier740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator758 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_direct_declarator_in_declarator761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_declarator769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_direct_declarator791 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_24_in_direct_declarator822 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_declarator_in_direct_declarator824 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_direct_declarator829 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_declarator_suffix_in_direct_declarator832 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_53_in_declarator_suffix854 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_declarator_suffix856 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_declarator_suffix858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_declarator_suffix870 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_declarator_suffix872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_declarator_suffix884 = new BitSet(new long[]{0x6600000000000000L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_parameter_type_list_in_declarator_suffix886 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declarator_suffix888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_declarator_suffix900 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_identifier_list_in_declarator_suffix902 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declarator_suffix904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_declarator_suffix916 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declarator_suffix918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_pointer931 = new BitSet(new long[]{0x4000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_type_qualifier_in_pointer933 = new BitSet(new long[]{0x4000000004000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_pointer_in_pointer936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_pointer942 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_pointer_in_pointer944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_pointer949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_list_in_parameter_type_list961 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_parameter_type_list964 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_parameter_type_list966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list980 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_parameter_list983 = new BitSet(new long[]{0x6600000000000000L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_parameter_declaration_in_parameter_list985 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration999 = new BitSet(new long[]{0x0020000005000802L});
	public static final BitSet FOLLOW_declarator_in_parameter_declaration1002 = new BitSet(new long[]{0x0020000005000802L});
	public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration1004 = new BitSet(new long[]{0x0020000005000802L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list1018 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_identifier_list1021 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list1023 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name1037 = new BitSet(new long[]{0x0020000005000002L});
	public static final BitSet FOLLOW_abstract_declarator_in_type_name1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_abstract_declarator1052 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_direct_abstract_declarator1074 = new BitSet(new long[]{0x0020000005000000L});
	public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator1076 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_direct_abstract_declarator1078 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1082 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator1086 = new BitSet(new long[]{0x0020000001000002L});
	public static final BitSet FOLLOW_53_in_abstract_declarator_suffix1099 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_abstract_declarator_suffix1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_abstract_declarator_suffix1106 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_abstract_declarator_suffix1108 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_abstract_declarator_suffix1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_abstract_declarator_suffix1115 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_abstract_declarator_suffix1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_abstract_declarator_suffix1122 = new BitSet(new long[]{0x6600000000000000L,0x0000000001E6DC74L});
	public static final BitSet FOLLOW_parameter_type_list_in_abstract_declarator_suffix1124 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_abstract_declarator_suffix1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_initializer1150 = new BitSet(new long[]{0x0000000335428A50L,0x0000000084010000L});
	public static final BitSet FOLLOW_initializer_list_in_initializer1152 = new BitSet(new long[]{0x0000000080000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_31_in_initializer1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_initializer1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initializer_in_initializer_list1169 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_initializer_list1172 = new BitSet(new long[]{0x0000000335428A50L,0x0000000084010000L});
	public static final BitSet FOLLOW_initializer_in_initializer_list1174 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1206 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_argument_expression_list1212 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1216 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1249 = new BitSet(new long[]{0x0000000110000002L});
	public static final BitSet FOLLOW_28_in_additive_expression1259 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1263 = new BitSet(new long[]{0x0000000110000002L});
	public static final BitSet FOLLOW_32_in_additive_expression1270 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1274 = new BitSet(new long[]{0x0000000110000002L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1309 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_26_in_multiplicative_expression1319 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1323 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_38_in_multiplicative_expression1330 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1334 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_19_in_multiplicative_expression1341 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1345 = new BitSet(new long[]{0x0000004004080002L});
	public static final BitSet FOLLOW_24_in_cast_expression1375 = new BitSet(new long[]{0x6400000000000000L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_type_name_in_cast_expression1377 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_cast_expression1379 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_unary_expression1412 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_unary_expression1422 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression1432 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_unary_expression1443 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_unary_expression1451 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_unary_expression1453 = new BitSet(new long[]{0x6400000000000000L,0x0000000001E4CC54L});
	public static final BitSet FOLLOW_type_name_in_unary_expression1455 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_unary_expression1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression1476 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_53_in_postfix_expression1492 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_postfix_expression1494 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_postfix_expression1496 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_24_in_postfix_expression1510 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_postfix_expression1512 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_24_in_postfix_expression1526 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1528 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_postfix_expression1530 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_36_in_postfix_expression1551 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1553 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_35_in_postfix_expression1567 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1569 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_29_in_postfix_expression1583 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_33_in_postfix_expression1597 = new BitSet(new long[]{0x0020001A21000002L});
	public static final BitSet FOLLOW_22_in_unary_operator1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_unary_operator1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_unary_operator1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_unary_operator1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_unary_operator1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_unary_operator1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression1688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_primary_expression1695 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_primary_expression1697 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_primary_expression1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_constant1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_LITERAL_in_constant1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_constant1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1811 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_expression1816 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1818 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_conditional_expression_in_constant_expression1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment_expression1855 = new BitSet(new long[]{0x0108508448900000L,0x0000000010000000L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1857 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_assignment_expression1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_lvalue1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_assignment_operator1907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_assignment_operator1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_assignment_operator1921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_assignment_operator1928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_assignment_operator1935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_assignment_operator1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_assignment_operator1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_assignment_operator1956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_assignment_operator1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_assignment_operator1970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_assignment_operator1977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression2001 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_52_in_conditional_expression2006 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_conditional_expression2008 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_conditional_expression2010 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_expression2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2031 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_logical_or_expression2034 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression2036 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression2057 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_logical_and_expression2060 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression2062 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression2083 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_inclusive_or_expression2086 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression2088 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression2109 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_exclusive_or_expression2112 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression2114 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression2135 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_and_expression2138 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression2140 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression2160 = new BitSet(new long[]{0x0000800000040002L});
	public static final BitSet FOLLOW_set_in_equality_expression2163 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression2169 = new BitSet(new long[]{0x0000800000040002L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression2196 = new BitSet(new long[]{0x0003240000000002L});
	public static final BitSet FOLLOW_42_in_relational_expression2203 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_48_in_relational_expression2209 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_45_in_relational_expression2215 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_49_in_relational_expression2221 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression2230 = new BitSet(new long[]{0x0003240000000002L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression2260 = new BitSet(new long[]{0x0004080000000002L});
	public static final BitSet FOLLOW_43_in_shift_expression2267 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_50_in_shift_expression2273 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression2284 = new BitSet(new long[]{0x0004080000000002L});
	public static final BitSet FOLLOW_labeled_statement_in_statement2311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement2316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement2321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement2326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement2336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_labeled_statement2347 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_labeled_statement2349 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_labeled_statement2351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_labeled_statement2356 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_constant_expression_in_labeled_statement2358 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_labeled_statement2360 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_labeled_statement2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_labeled_statement2367 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_labeled_statement2369 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_labeled_statement2371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_compound_statement2387 = new BitSet(new long[]{0xFE00020335428A50L,0x00000000C7FFFFF7L});
	public static final BitSet FOLLOW_declaration_in_compound_statement2390 = new BitSet(new long[]{0xFE00020335428A50L,0x00000000C7FFFFF7L});
	public static final BitSet FOLLOW_statement_list_in_compound_statement2405 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_compound_statement2410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement_list2422 = new BitSet(new long[]{0x9800020335428A52L,0x0000000086092383L});
	public static final BitSet FOLLOW_41_in_expression_statement2435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement2440 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_expression_statement2442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_selection_statement2454 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_selection_statement2456 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_selection_statement2458 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_selection_statement2460 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_selection_statement2462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_selection_statement2477 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_selection_statement2479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_selection_statement2486 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_selection_statement2488 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_selection_statement2490 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_selection_statement2492 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_selection_statement2494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_iteration_statement2506 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_iteration_statement2508 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2510 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_iteration_statement2512 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_iteration_statement2519 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2521 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_iteration_statement2523 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_iteration_statement2525 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2527 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_iteration_statement2529 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_iteration_statement2531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_iteration_statement2536 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_iteration_statement2538 = new BitSet(new long[]{0x0000020335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement2540 = new BitSet(new long[]{0x0000020335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement2542 = new BitSet(new long[]{0x0000000337428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement2544 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_iteration_statement2547 = new BitSet(new long[]{0x9800020335428A50L,0x0000000086092383L});
	public static final BitSet FOLLOW_statement_in_iteration_statement2549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_jump_statement2561 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDENTIFIER_in_jump_statement2563 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_jump_statement2570 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_jump_statement2577 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_jump_statement2584 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_jump_statement2593 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_expression_in_jump_statement2595 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_jump_statement2597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_specifiers_in_synpred4_myCompiler96 = new BitSet(new long[]{0x0000000005000800L});
	public static final BitSet FOLLOW_declarator_in_synpred4_myCompiler99 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_declaration_in_synpred4_myCompiler101 = new BitSet(new long[]{0x6600000000000000L,0x0000000005F6DC74L});
	public static final BitSet FOLLOW_90_in_synpred4_myCompiler104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred45_myCompiler758 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_direct_declarator_in_synpred45_myCompiler761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_suffix_in_synpred47_myCompiler832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_qualifier_in_synpred52_myCompiler933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointer_in_synpred53_myCompiler936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_synpred54_myCompiler931 = new BitSet(new long[]{0x4000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_type_qualifier_in_synpred54_myCompiler933 = new BitSet(new long[]{0x4000000004000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_pointer_in_synpred54_myCompiler936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_synpred55_myCompiler942 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_pointer_in_synpred55_myCompiler944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarator_in_synpred58_myCompiler1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_in_synpred59_myCompiler1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred62_myCompiler1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstract_declarator_suffix_in_synpred65_myCompiler1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_synpred83_myCompiler1443 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_unary_expression_in_synpred83_myCompiler1445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred102_myCompiler1855 = new BitSet(new long[]{0x0108508448900000L,0x0000000010000000L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred102_myCompiler1857 = new BitSet(new long[]{0x0000000335428A50L,0x0000000080010000L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred102_myCompiler1861 = new BitSet(new long[]{0x0000000000000002L});
}
