grammar myCompiler;

options {
    language = Java;
    backtrack=true;
    memoize=true;
    k=2;
}

@header {
    import java.util.HashMap;
	import java.util.Map;
	import java.util.ArrayList;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;
}

@members {
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
	static final String LOCAL = "\%t";

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
			case "\%":
				result = operand1 \% operand2;
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
		String wrap = (op == "/" || op == "\%") ? "" : "nsw";

		if(!symb1.type.isNumber() || !symb2.type.isNumber()){
			System.err.println(String.format(";error: invalid operands to binary \%s at line \%d", op, line));
		} else {
			if(symb1.isConstant && symb2.isConstant) {
				Type type = Type.getMaxType(symb1.type, symb2.type);
				newSymb.value = getResult(symb1, symb2, type, op);
			} else if(!symb1.isConstant && symb2.isConstant) {
				int offset = symb1.offset;
				if(symb1.isStored) {
					newSymb = new Symbol();
					mainCode.add(genLoadCode("\%t", newSymb.offset, "i32", symb1.identifier, offset));
					offset = newSymb.offset;
				}
				newSymb = new Symbol();
				newSymb.identifier = "\%t";
				mainCode.add(String.format("\%\%t\%d = \%s \%s \%s \%\%t\%d, \%s", newSymb.offset, irOp, wrap, "i32", offset, symb2.value));
			} else if(symb1.isConstant && !symb2.isConstant) {
				int offset = symb2.offset;
				if(symb2.isStored) {
					newSymb = new Symbol();
					mainCode.add(genLoadCode("\%t", newSymb.offset, "i32", symb2.identifier, offset));

					offset = newSymb.offset;
				}
				newSymb = new Symbol();
				newSymb.identifier = "\%t";
				mainCode.add(String.format("\%\%t\%d = \%s \%s \%s \%s, \%\%t\%d", newSymb.offset, irOp, wrap, "i32", symb1.value, offset));
			} else {
				int offset1 = symb1.offset;
				int offset2 = symb2.offset;
				if(symb1.isStored) {
					newSymb = new Symbol();
					mainCode.add(String.format("\%\%t\%d = load \%s, \%s* \%s\%d, align 4", newSymb.offset, "i32", "i32", symb1.identifier, offset1));
					offset1 = newSymb.offset;
				}

				if(symb2.isStored) {
					newSymb = new Symbol();
					mainCode.add(String.format("\%\%t\%d = load \%s, \%s* \%s\%d, align 4", newSymb.offset, "i32", "i32", symb2.identifier, offset2));
					offset2 = newSymb.offset;
				}
				newSymb = new Symbol();
				newSymb.identifier = "\%t";
				mainCode.add(String.format("\%\%t\%d = \%s \%s \%s \%\%t\%d, \%\%t\%d", newSymb.offset, irOp, wrap, "i32", offset1, offset2));
			}
			newSymb.isConstant = (symb1.isConstant & symb2.isConstant);
			newSymb.identifier = symb1.identifier;
			newSymb.type = Type.INT; //TODO: datatype
		}
		return newSymb;
	}
	
	String genLoadCode(String destIdentifier, int destOffset, String type, String srcIdentifier, int srcOffset) {
		return String.format("\%s\%d = load \%s, \%s* \%s\%d, align 4", destIdentifier, destOffset, type, type, srcIdentifier, srcOffset);
	}

	String genStoreCode(String type, String value, String destIdentifier, int destOffset) {
		return String.format("store \%s \%s, \%s* \%s\%d, align 4", type, value, type, destIdentifier, destOffset);
	}

	String genStoreCode(String type, String srcIdentifier, int srcOffset, String destIdentifier, int destOffset) {
		return String.format("store \%s \%s\%d, \%s* \%s\%d, align 4", type, srcIdentifier, srcOffset, type, destIdentifier, destOffset);
	}


	Symbol genRelationalCode(Symbol symb1, Symbol symb2, String op, String irOp, int line) {
		Symbol newSymb = symb1;
		if(!symb1.type.isNumber() || !symb2.type.isNumber()){
			System.err.println(String.format(";error: invalid operands to binary \%s at line \%d", op, line));
		} else {
			if(symb1.isConstant && symb2.isConstant) {
				newSymb.value = getResult(symb1, symb2, Type.INT, op);
			} else if(!symb1.isConstant && symb2.isConstant) {
				int offset = symb1.offset;
				if(symb1.isStored) {
					newSymb = new Symbol();
					mainCode.add(genLoadCode("\%t", newSymb.offset, "i32", symb1.identifier, offset));
					offset = newSymb.offset;
				}
				newSymb = new Symbol();
				newSymb.identifier = "\%t";
				mainCode.add(String.format("\%\%t\%d = icmp \%s \%s \%\%t\%d, \%s", newSymb.offset, irOp, "i32", offset, symb2.value));
			} else if(symb1.isConstant && !symb2.isConstant) {
				int offset = symb2.offset;
				if(symb2.isStored) {
					newSymb = new Symbol();
					mainCode.add(genLoadCode("\%t", newSymb.offset, "i32", symb2.identifier, offset));
					offset = newSymb.offset;
				}
				newSymb = new Symbol();
				newSymb.identifier = "\%t";
				mainCode.add(String.format("\%\%t\%d = icmp \%s \%s \%\%t\%d, \%s", newSymb.offset, irOp, "i32", offset, symb1.value));
			} else {
				int offset1 = symb1.offset;
				int offset2 = symb2.offset;
				if(symb1.isStored) {
					newSymb = new Symbol();
					mainCode.add(String.format("\%\%t\%d = load \%s, \%s* \%s\%d, align 4", newSymb.offset, "i32", "i32", symb1.identifier, offset1));
					offset1 = newSymb.offset;
				}

				if(symb2.isStored) {
					newSymb = new Symbol();
					mainCode.add(String.format("\%\%t\%d = load \%s, \%s* \%s\%d, align 4", newSymb.offset, "i32", "i32", symb2.identifier, offset2));
					offset2 = newSymb.offset;
				}
				newSymb = new Symbol();
				newSymb.identifier = "\%t";
				mainCode.add(String.format("\%\%t\%d = icmp \%s \%s \%\%t\%d, \%\%t\%d", newSymb.offset, irOp, "i32", offset1, offset2));
			}
		}
		
		newSymb.isConstant = (symb1.isConstant & symb2.isConstant);
		if(!newSymb.isConstant) {
			newSymb = new Symbol();
			mainCode.add(String.format("\%\%t\%d = zext i1 \%\%t\%d to i32", newSymb.offset, (newSymb.offset - 1)));
		}
		
		newSymb.isConstant = symb1.isConstant & symb2.isConstant;
		newSymb.identifier = symb1.identifier;
		newSymb.type = Type.BOOL; //TODO: datatype
		return newSymb;
	}
}

/* -------------------------------------------------------------------------- */
/*                                   Grammar                                  */
/* -------------------------------------------------------------------------- */

// Start Symbol
translation_unit
@init{System.out.println(";---------------    Debug Info     ---------------;\n");}
	: external_declaration+
	;

// declaration of global variable and function
external_declaration
options {k=1;}
	: ( declaration_specifiers? declarator declaration* '{' )=> function_definition
	| declaration
		{	
			List<Declarator> declarators = $declaration.declarators;
			List<Symbol> symbols = $declaration.symbols;
			for(int i = 0; i < declarators.size(); i++) {
				Declarator declarator = declarators.get(i);
				Symbol symbol = symbols.get(i);
				if(declarator == null)
					continue;
				if(symbolTable.containsKey(declarator.id)) {
					System.err.println(String.format(";error: redeclaration of '\%s' at line \%d", declarator.id, $declaration.start.getLine()));
				} else {
					if(symbol == null) {
						symbol = new Symbol();
						symbol.identifier = "@g";
						symbolTable.put(declarator.id, symbol);
						globalCode.add(String.format("@g\%d = dso_local global \%s \%s, align 4", localCount - 1, "i32", 0)); //TODO: datatype
					} else if(symbol.isConstant) {
						symbol.identifier = "@g";
						symbol.isConstant = false; // this symbol is no longer a constant
						symbolTable.put(declarator.id, symbol);
						globalCode.add(String.format("@g\%d = dso_local global \%s \%s, align 4", symbol.offset, "i32", symbol.value)); //TODO: datatype
					}
				}
			}
		}
	;

// function definition
function_definition
	:	declaration_specifiers? declarator
            {   
                if($declarator.declarator.id.equals("main") && $declarator.declarator.suffix.equals(Suffix.FUNCTION)) {
                    mainCode.add("declare dso_local i32 @printf(i8*, ...)\n"); //TODO
                    mainCode.add("define dso_local i32 @main()\n"); //TODO
                    mainCode.add("{");
                }
            }
		(	declaration+ compound_statement	// K&R style
		|	compound_statement			// ANSI style
		)
			{   
				if(!isReturned)
					mainCode.add("ret i32 0");
				mainCode.add("}");
			}
	;

// variable declaration
declaration returns [DeclarationSpecifier declarationSpecifier, List<Declarator> declarators, List<Symbol> symbols]
// scope {
//   boolean isTypedef;
// }
// @init {
//   $declaration::isTypedef = false;
// }
	: 'typedef' declaration_specifiers? // {$declaration::isTypedef=true;}
	  init_declarator_list ';' // special case, looking for typedef	
	| declaration_specifiers init_declarator_list? ';'
		{
			$declarationSpecifier = $declaration_specifiers.declarationSpecifier;
			$declarators = $init_declarator_list.declarators;
			$symbols = $init_declarator_list.symbols;
		}
	;

// specifier, qualifier, and type, e.g., const int, static float, ...
declaration_specifiers returns [DeclarationSpecifier declarationSpecifier]
@init {	Type type = Type.VOID; List<Specifier> specifiers = new ArrayList<Specifier>(); List<Qualifier> qualifiers = new ArrayList<Qualifier>(); }
	: (storage_class_specifier { specifiers.add($storage_class_specifier.specifier); }
	| type_specifier { type = $type_specifier.type; }
    | type_qualifier { qualifiers.add($type_qualifier.qualifier); }
    )+ { $declarationSpecifier = new DeclarationSpecifier(type, specifiers, qualifiers); }
	;

// multiple declarator in a line
init_declarator_list returns [List<Declarator> declarators, List<Symbol> symbols]
@init{ $declarators = new ArrayList<Declarator>(); $symbols = new ArrayList<Symbol>(); }
	: dclr=init_declarator 
		{ 
			$declarators.add($dclr.declarator); 
			$symbols.add($dclr.symb); 
		} 
	(',' dclr2=init_declarator 
		{ 
			$declarators.add($dclr2.declarator); 
			$symbols.add($dclr2.symb); 
		}
	)*
	;

// single general declarator, e.g., *bar, baz, foo(), ...
init_declarator returns [Declarator declarator, Symbol symb]
	: declarator { $declarator = $declarator.declarator; } ('=' initializer { $symb = $initializer.symb; } )? // TODO: $value = initializer.value
	;

storage_class_specifier returns [Specifier specifier]
	: 'extern' { $specifier = Specifier.EXTERN; }
	| 'static' { $specifier = Specifier.STATIC; }
	| 'auto' { $specifier = Specifier.AUTO; }
	| 'register' { $specifier = Specifier.REGISTER; }
	;

type_specifier returns [Type type]
	: 'void' { $type = Type.VOID; }
	| 'char' { $type = Type.CHAR; }
	| 'short' { $type = Type.SHORT; }
	| 'int' { $type = Type.INT; }
	| 'long' { $type = Type.LONG; }
	| 'float' { $type = Type.FLOAT; }
	| 'double' { $type = Type.DOUBLE; }
	| 'signed' { $type = Type.SIGNED; }
	| 'unsigned' { $type = Type.UNSIGNED; }
	| struct_or_union_specifier { $type = Type.VOID; } // TODO
	| enum_specifier { $type = Type.VOID; } // TODO
    | 'bool' { $type = Type.BOOL; } // TODO
	// | type_id
	;


// block it for now
// type_id
//     :   {isTypeName(input.LT(1).getText())}? IDENTIFIER
// //    	{System.out.println($IDENTIFIER.text+" is a type");}
//     ;

struct_or_union_specifier
options {k=3;}
// scope Symbols; // structs are scopes
// @init {
//   $Symbols::types = new HashSet();
// }
	: struct_or_union IDENTIFIER? '{' struct_declaration_list '}'
	| struct_or_union IDENTIFIER
	;

struct_or_union
	: 'struct'
	| 'union'
	;

struct_declaration_list
	: struct_declaration+
	;

struct_declaration
	: specifier_qualifier_list struct_declarator_list ';'
	;

specifier_qualifier_list
	: ( type_qualifier | type_specifier )+
	;

struct_declarator_list
	: struct_declarator (',' struct_declarator)*
	;

struct_declarator
	: declarator (':' constant_expression)?
	| ':' constant_expression
	;

enum_specifier
options {k=3;}
	: 'enum' '{' enumerator_list '}'
	| 'enum' IDENTIFIER '{' enumerator_list '}'
	| 'enum' IDENTIFIER
	;

enumerator_list
	: enumerator (',' enumerator)*
	;

enumerator
	: IDENTIFIER ('=' constant_expression)?
	;

type_qualifier returns [Qualifier qualifier]
	: 'const' { $qualifier = Qualifier.CONST; }
	| 'volatile' { $qualifier = Qualifier.VOLATILE; }
	;

// support declarator with pointer
declarator returns [Declarator declarator]
	: pointer? direct_declarator { $declarator = $direct_declarator.declarator; } // TODO: pointer
	| pointer
	;

// identifier with suffix
direct_declarator returns [Declarator declarator]
@init { Suffix suffix = null; String id = null; }
	: (IDENTIFIER { id = $IDENTIFIER.text; }
			// {
			// if ($declaration.size()>0&&$declaration::isTypedef) {
			// 	$Symbols::types.add($IDENTIFIER.text);
			// 	System.out.println("define type "+$IDENTIFIER.text);
			// }
			// }
	| '(' declarator { id = $declarator.id; }
	')') declarator_suffix* { suffix = $declarator_suffix.suffix; $declarator = new Declarator(id, suffix); } // TODO
	;

// TODO: THIS IS IMPORTANT FOR REFERENCE TYPE VARIABLE !!!!!! (ONLY SUPPORT SIMPLE ARRAY AND FUNCTIONS THAT HAS NO PARAMETER NOW)
declarator_suffix returns [Suffix suffix]
	:   '[' constant_expression ']' { $suffix = Suffix.ARRAY; }
    |   '[' ']' { $suffix = Suffix.ARRAY; }
    |   '(' parameter_type_list ')' { $suffix = Suffix.FUNCTION; }
    |   '(' identifier_list ')' { $suffix = Suffix.FUNCTION; }
    |   '(' ')' { $suffix = Suffix.FUNCTION; }
	;

pointer
	: '*' type_qualifier+ pointer?
	| '*' pointer
	| '*'
	;

// function parameters with variable length arguement
parameter_type_list
	: parameter_list (',' '...')?
	;

// parameters
parameter_list
	: parameter_declaration (',' parameter_declaration)*
	;

// single parameter
parameter_declaration
	: declaration_specifiers (declarator|abstract_declarator)*
	;

// support K&R function definition (parameters with no type specified)
identifier_list
	: IDENTIFIER (',' IDENTIFIER)*
	;

// parameter for type casting and sizeof operator
type_name
	: specifier_qualifier_list abstract_declarator?
	;

// pointer support for parameter without identifier (abstract declarator)
abstract_declarator
	: pointer direct_abstract_declarator?
	| direct_abstract_declarator
	;

// multiple suffix support for abstract declarator
direct_abstract_declarator
	:	( '(' abstract_declarator ')' | abstract_declarator_suffix ) abstract_declarator_suffix*
	;

// suffix for abstract declarator
abstract_declarator_suffix
	:	'[' ']'
	|	'[' constant_expression ']'
	|	'(' ')'
	|	'(' parameter_type_list ')'
	;

// single initializer for declarator
initializer returns [Symbol symb] //TODO: multiple initializers
	: assignment_expression { $symb = $assignment_expression.symb; }
	| '{' initializer_list ','? '}'
	;

// support multiple initialization in a single line
initializer_list
	: initializer (',' initializer)*
	;

/* -------------------------------------------------------------------------- */
/*                                 Expressions                                */
/* -------------------------------------------------------------------------- */

// arguements for function call
argument_expression_list returns [List<Symbol> symbols]
@init { $symbols = new ArrayList<Symbol>(); }
	: asgn=assignment_expression { $symbols.add($asgn.symb); }
	(',' asgn2=assignment_expression { $symbols.add($asgn2.symb); }
	)*
	;

/* ------------------------- Arithmetic Expressions ------------------------- */

// addition and subtraction
additive_expression returns [Symbol symb]
@init { Symbol symb2 = null; String op = null; String irOp = null; int line = -1;}
	: (mul1=multiplicative_expression) { $symb = $mul1.symb; line = $mul1.start.getLine(); } 
	(( '+' mul2=multiplicative_expression { symb2 = $mul2.symb; op = "+"; irOp = "add"; }
	| '-' mul3=multiplicative_expression { symb2 = $mul3.symb; op = "-"; irOp = "sub";  }
	) { $symb = genArithmeticCode($symb, symb2, op, irOp, line); }
	)*
	;

// multiplication, division, ...
multiplicative_expression returns [Symbol symb]
@init { Symbol symb2 = null; String op = null; String irOp = null; int line = -1; }
	: (cast1=cast_expression) { $symb = $cast1.symb; line = $cast1.start.getLine(); } 
	(( '*' cast2=cast_expression { symb2 = $cast2.symb; op = "*"; irOp = "mul"; }
	| '/' cast3=cast_expression { symb2 = $cast3.symb; op = "/"; irOp = "sdiv"; }
	| '%' cast4=cast_expression { symb2 = $cast4.symb; op = "\%"; irOp = "srem"; }
	) { $symb = genArithmeticCode($symb, symb2, op, irOp, line); }
	)*
	;

/* ---------------------------- Unary Expressions --------------------------- */

// support single variable type casting
cast_expression returns [Symbol symb]
	: '(' type_name ')' cast_expression //TODO
	| unary_expression { $symb = $unary_expression.symb; }
	;

// support single unary expression (mostly of them are prefixes)
unary_expression returns [Symbol symb]
	: postfix_expression { $symb = $postfix_expression.symb; }
	| '++' unary_expression { ; } //TODO
	| '--' unary_expression { ; } //TODO
	| unary_operator cast_expression
		{
			switch($unary_operator.op) {
				case '&':
					break;
				case '*':
					break;
				case '+':
					$symb = $cast_expression.symb;
					break;
				case '-':
					$symb = $cast_expression.symb;
					if(!$symb.isConstant) {
						Symbol tmp1 = new Symbol($symb.type, $symb.identifier, false);
						mainCode.add(genLoadCode(LOCAL, tmp1.offset, "i32", $symb.identifier, $symb.offset));

						Symbol tmp2 = new Symbol(Type.INT, "0", true);
						mainCode.add(genStoreCode("i32", LOCAL, tmp1.offset, $symb.identifier, $symb.offset));
						$symb = genArithmeticCode(tmp2, tmp1, "-", "sub", $unary_operator.start.getLine());
					} else {
						$symb.value = "-" + $symb.value;
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
	| 'sizeof' unary_expression //TODO
	| 'sizeof' '(' type_name ')' //TODO
	;

// suffixes and member access operators
postfix_expression returns [Symbol symb]
	:   primary_expression { $symb = $primary_expression.symb; }
        (   '[' expression ']'
        |   '(' ')'
        |   '(' argument_expression_list ')' 
				{	
					String args = "";
					int len = 0;
					for(Symbol symbol : $argument_expression_list.symbols) {
						// System.out.println("CHECK: " + symbol.offset);
						if(symbol.type == Type.STRING) {
							len = symbol.len;
							unnamedCode.add(String.format("@.str.\%d = private unnamed_addr constant [\%d x i8] c\%s", unnamedVarCount++, symbol.len, symbol.value));
						} else {
							if(symbol.isConstant) {
								args += String.format(", \%s noundef \%s", "i32", symbol.value);
							} else {
								if(symbol.isStored || symbol.identifier == "@g") {
									$symb = new Symbol();
									mainCode.add(genLoadCode("\%t", $symb.offset, "i32", symbol.identifier, symbol.offset));
									args += String.format(", \%s noundef \%s\%d", "i32", "\%t", $symb.offset);
								} else {
									args += String.format(", \%s noundef \%s\%d", "i32", symbol.identifier, symbol.offset);
								}
							}
						}	
					}

					if($primary_expression.isPrintf) {
						$symb = new Symbol();
						mainCode.add(String.format(
							"\%\%t\%d = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([\%d x i8], [\%d x i8]* @.str.\%d, i64 0, i64 0)\%s)"
							, symb.offset, len, len, unnamedVarCount - 1, args));
					}
				}
        |   '.' IDENTIFIER
        |   '->' IDENTIFIER
        |   '++'
        |   '--'
        )*
	;

unary_operator returns [char op]
	: '&' { $op = '&'; }
	| '*' { $op = '*'; }
	| '+' { $op = '+'; }
	| '-' { $op = '-'; }
	| '~' { $op = '~'; }
	| '!' { $op = '!'; }
	;

// single value expression, e.g., foo, 64, (128), boo(...), printf(...)
primary_expression returns [Symbol symb, boolean isPrintf] // use id to distinguish printf from identifiers
	: IDENTIFIER 
		{ 	
			if($IDENTIFIER.text.equals("printf")) {
				$isPrintf = true;
				$symb = new Symbol();
			} else if(!symbolTable.containsKey($IDENTIFIER.text)) {
				System.err.println(String.format(";error: '\%s' undeclared in line \%d", $IDENTIFIER.text, $IDENTIFIER.getLine()));
				$symb = null;
			} else {
				$isPrintf = false;
				$symb = symbolTable.get($IDENTIFIER.text);
			}
		} //TODO
	| constant { $symb = $constant.symb; }
	| '(' expression ')' { $symb = $expression.symb; }
	;

// literals
constant returns [Symbol symb]
@init { $symb = new Symbol(); $symb.isConstant = true;}
    // :   HEX_LITERAL
    // |   OCTAL_LITERAL
    :   DECIMAL_LITERAL 
		{ 	
			$symb.type = getMinType($DECIMAL_LITERAL.text);
			$symb.value = $DECIMAL_LITERAL.text;
		}

    |	CHARACTER_LITERAL { $symb.value = $CHARACTER_LITERAL.text; } 
		{	
			$symb.type = Type.CHAR;
			$symb.len = 2; // 1 literal + 1 null character 
			$symb.value = symb.value.replace("\\n", "\\0A");
		}

	|	STRING_LITERAL { $symb.value = $STRING_LITERAL.text; } { $symb.len = $symb.value.length(); }
		{	
			$symb.type = Type.STRING;
			$symb.len = $symb.value.replace("\\n", "0").length() - 1; // -2 quote + 1 null character 
			$symb.value = $symb.value.replace("\\n", "\\0A");
			$symb.value = $symb.value.substring(0, $symb.value.length() - 1) + "\\00" + "\"";
		}

    |   FLOATING_POINT_LITERAL { $symb.value = $FLOATING_POINT_LITERAL.text; $symb.type = Type.DOUBLE; } //TODO
    ;

/* ------------------- General Assignments and Expressions ------------------ */

// support multiple expressions in a single line
expression returns [Symbol symb] 
	: a1=assignment_expression { $symb = $a1.symb; } (',' assignment_expression)* 
	;

// final result after applying operators to primary expressions
constant_expression returns [Symbol symb]
	: conditional_expression { $symb = $conditional_expression.symb; }
	;

// single expression
assignment_expression returns [Symbol symb]
	: lvalue assignment_operator asgn2=assignment_expression 
		{ 	
			if($lvalue.symb != null) {
				//TODO: op
				$symb = $asgn2.symb;
				String identifier = symbolTable.get($lvalue.text).identifier;
				if($symb.isConstant) {		
					mainCode.add(genStoreCode("i32", $symb.value, identifier, symbolTable.get($lvalue.text).offset));
					$symb.isStored = true;
					$symb.isConstant = false;
					$symb.identifier = identifier;
					$symb.offset = symbolTable.get($lvalue.text).offset;
					symbolTable.put($lvalue.text, $symb);
				} else {
					if($symb.isStored) {
						$symb = new Symbol();
						mainCode.add(genLoadCode("\%t", symb.offset, "i32", $asgn2.symb.identifier, $asgn2.symb.offset));
						mainCode.add(genStoreCode("i32", "\%t", $symb.offset, identifier, symbolTable.get($lvalue.text).offset));
					} else {
						mainCode.add(genStoreCode("i32", "\%t", $symb.offset, identifier, symbolTable.get($lvalue.text).offset));
					}
					$symb.isStored = true;
					$symb.isConstant = false;
					$symb.identifier = identifier;
					$symb.offset = symbolTable.get($lvalue.text).offset;
					symbolTable.put($lvalue.text, $symb);
				}
			}
		} //TODO
	| conditional_expression { $symb = $conditional_expression.symb; }
	;

// left value of assignment
lvalue returns [Symbol symb]
	:	unary_expression { $symb = $unary_expression.symb; }
	;

assignment_operator returns [String op]
	: '=' { $op = "="; }
	| '*=' { $op = "*="; }
	| '/=' { $op = "/="; }
	| '%=' { $op = "\%="; }
	| '+=' { $op = "+="; }
	| '-=' { $op = "-="; }
	| '<<=' { $op = "<<="; }
	| '>>=' { $op = ">>="; }
	| '&=' { $op = "&="; }
	| '^=' { $op = "^="; }
	| '|=' { $op = "|="; }
	;

/* --------------------------- Logical Expressions -------------------------- */    

conditional_expression returns [Symbol symb]
	: logical_or_expression { $symb = $logical_or_expression.symb; } ('?' expression ':' conditional_expression)?
	;

logical_or_expression returns [Symbol symb]
	: l1=logical_and_expression ('||' logical_and_expression)* { $symb = $l1.symb; }
	;

logical_and_expression returns [Symbol symb]
	: l1=inclusive_or_expression ('&&' inclusive_or_expression)* { $symb = $l1.symb; }
	;

inclusive_or_expression returns [Symbol symb]
	: e1=exclusive_or_expression ('|' exclusive_or_expression)* { $symb = $e1.symb; }
	;

exclusive_or_expression returns [Symbol symb]
	: a1=and_expression ('^' and_expression)* { $symb = $a1.symb; }
	;

and_expression returns [Symbol symb]
	: e1=equality_expression ('&' equality_expression)* { $symb = $e1.symb; }
	;
equality_expression returns [Symbol symb]
@init { String op = null; String irOp = null; int line = -1; }
	: rlt1=relational_expression { $symb = $rlt1.symb; line = $rlt1.start.getLine(); }
	(('==' { op = "=="; irOp = "eq"; }
	|'!=' { op = "!="; irOp = "ne"; }
	) rlt2=relational_expression { $symb = genRelationalCode($symb, $rlt2.symb, op, irOp, line); }
	)*
	;

//TODO: type checking
relational_expression returns [Symbol symb]
@init { String op = null; String irOp = null; int line = -1; }
	: shift1=shift_expression { $symb = $shift1.symb; line = $shift1.start.getLine(); }
	(('<' { op = "<"; irOp = "slt"; }
	|'>' { op = ">"; irOp = "sgt"; }
	|'<=' { op = "<="; irOp = "sle"; }
	|'>=' { op = ">="; irOp = "sge"; }
	) shift2=shift_expression { $symb = genRelationalCode($symb, $shift2.symb, op, irOp, line); }
	)*
	;


//TODO
shift_expression returns [Symbol symb]
@init { String op = null;}
	: additive1=additive_expression { $symb = $additive1.symb; }
	(('<<' { op = "<<"; }
	|'>>' { op = ">>"; }  
	) additive2=additive_expression
		{	
			if(!$additive1.symb.type.isDecimal() || !$additive1.symb.type.isDecimal()
				|| !$additive2.symb.type.isDecimal() || !$additive2.symb.type.isDecimal())
				System.err.println(String.format(";error: invalid operands to binary \%s at line \%d", op, $additive1.start.getLine()));
			else {
				Long count = Long.parseLong($additive2.symb.value);
				Long tmp = Long.parseLong($additive1.symb.value);
				if(op.equals("<<")) {
					for(Long i = 0L; i < count; i++)
						tmp /= 2;
				} else {
					for(Long i = 0L; i < count; i++)
						tmp *= 2;
				}
				$additive1.symb.value = String.valueOf(tmp);
				System.out.println("shifttest: " + $additive1.symb.value);
			}	
		}
	)* 
	;

/* -------------------------------------------------------------------------- */
/*                                 Statements                                 */
/* -------------------------------------------------------------------------- */

statement
	: labeled_statement
	| compound_statement
	| expression_statement
	| selection_statement
	| iteration_statement
	| jump_statement
	;

labeled_statement
	: IDENTIFIER ':' statement
	| 'case' constant_expression ':' statement
	| 'default' ':' statement
	;

// a code block consisting of declarations and statements
compound_statement
// scope Symbols; // blocks have a scope of symbols
// @init {
//   $Symbols::types = new HashSet();
// }
	: '{' (declaration 
			{	
				List<Declarator> declarators = $declaration.declarators;
				List<Symbol> symbols = $declaration.symbols;
				for(int i = 0; i < declarators.size(); i++) {
					Declarator declarator = declarators.get(i);
					Symbol symbol = symbols.get(i);

					if(declarator == null)
						continue;
					if(symbolTable.containsKey(declarator.id)) {
						System.err.println(String.format(";error: redeclaration of '\%s' at line \%d", declarator.id, $declaration.start.getLine()));
					} else {
						if(symbol == null) {
							symbol = new Symbol();
							symbolTable.put(declarator.id, symbol);
							mainCode.add(String.format("\%\%t\%d = alloca \%s, align 4", symbol.offset, "i32"));
						} else if(symbol.isConstant) {
							symbol.isConstant = false; // this symbol is no longer a constant
							symbol.isStored = true;
							symbolTable.put(declarator.id, symbol);
							mainCode.add(String.format("\%\%t\%d = alloca \%s, align 4", symbol.offset, "i32"));
							mainCode.add(genStoreCode("i32", symbol.value, "\%t", symbol.offset));
						} else { // declared variable
							int srcOffset = symbol.offset;
							String srcIdentifier = symbol.identifier;
							boolean isSrcStored = symbol.isStored;
							

							Type srcType = symbol.type;
							symbol = new Symbol();
							int destOffset = symbol.offset;
							mainCode.add(String.format("\%\%t\%d = alloca \%s, align 4", destOffset, "i32"));

							if(isSrcStored) {
								symbol = new Symbol();
								mainCode.add(genLoadCode("\%t", symbol.offset, "i32", srcIdentifier, srcOffset));
								mainCode.add(genStoreCode("i32", "\%t", symbol.offset, "\%t", destOffset));
							} else {
								mainCode.add(genStoreCode("i32", srcIdentifier, srcOffset, "\%t", destOffset));
							}
							
							symbol.type = srcType;
							symbol.isStored = true;
							symbol.offset = destOffset;
							symbolTable.put(declarator.id, symbol);
						}
					}
				}
			}
		)*
		statement_list?
		'}'
	;

//  multiple statements
statement_list
	: statement+
	;

// empty or single statement
expression_statement
	: ';'
	| expression ';'
	;

// if else and switch case
selection_statement
@init { 
		Symbol cond = new Symbol();
		Symbol label1 = new Symbol();
		Symbol label2 = new Symbol();
		Symbol label3 = new Symbol();
		boolean isElse = false; 
		int index = -1; }
	: 'if' '(' expression ')' 
		{	
			mainCode.add(String.format("\%\%t\%d = trunc i32 \%\%t\%d to i1", cond.offset, $expression.symb.offset));

			mainCode.add(String.format("br i1 \%\%t\%d, label \%\%t\%d, label \%\%t\%d", cond.offset, label1.offset, label2.offset));
			index = mainCode.size() - 1; // current index
			mainCode.add(String.format("t\%d:", label1.offset));
		} 
	statement 
		{ mainCode.add(String.format("br label \%\%t\%d", label3.offset)); }
	(options {k=1; backtrack=false;}:'else' 
		{ mainCode.add(String.format("t\%d:", label2.offset)); isElse = true; }
	statement 
		{ mainCode.add(String.format("br label \%\%t\%d", label3.offset)); }
	)? 
		{ 	
			//for(String i : mainCode)
			// 	System.out.println(i);
			// System.out.println("");

			if(!isElse)
				mainCode.set(index, String.format("br i1 \%\%t\%d, label \%\%t\%d, label \%\%t\%d", cond.offset, label1.offset, label3.offset));
			
			mainCode.add(String.format("t\%d:", label3.offset));
		}

	| 'switch' '(' expression ')' statement
	;

// loop 
iteration_statement
	: 'while' '(' expression ')' statement
	| 'do' statement 'while' '(' expression ')' ';'
	| 'for' '(' expression_statement expression_statement expression? ')' statement
	;

// jump
jump_statement
	: 'goto' IDENTIFIER ';'
	| 'continue' ';'
	| 'break' ';'
	| 'return' ';' { mainCode.add("ret void"); isReturned = true; }
	| 'return' expression ';' 
		{ 	
			isReturned = true;
			if($expression.symb.isConstant == true) {
				mainCode.add("ret i32 " + $expression.symb.value);
			} else {
				Symbol symbol = new Symbol();
				mainCode.add(String.format("\%\%t\%d = load i32, i32* \%\%t\%d, align 4", symbol.offset, $expression.symb.offset));
				//TODO: undeclared variable
				// System.out.println("test906: " + $expression.text);
				mainCode.add("ret i32 " + "\%t" + (localCount - 1));
			}
		} //TODO: data type
	;


/* -------------------------------------------------------------------------- */
/*                                  Terminals                                 */
/* -------------------------------------------------------------------------- */

IDENTIFIER
	: LETTER (LETTER|'0'..'9')*
	;

fragment
LETTER
	: '$'
	| 'A'..'Z'
	| 'a'..'z'
	| '_'
	;

CHARACTER_LITERAL
    : '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

STRING_LITERAL
    : '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

// not supported: hex and octal literals
DECIMAL_LITERAL
    : ('0' | '1'..'9' '0'..'9'*)
    ;

FLOATING_POINT_LITERAL
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    // |   ('0'..'9')+ Exponent FloatTypeSuffix?
    // |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;


// not supported: octal and unicode escape sequences
fragment
EscapeSequence
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

WS
    : (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
