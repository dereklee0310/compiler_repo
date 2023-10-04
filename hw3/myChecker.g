grammar myChecker;

//  Note that k=1 results in a much smaller predictor for the 
//  fixed lookahead; k=2 made a few extra thousand lines. ;)
//  I'll have to optimize that in the future.
//  excerpt from https://github.com/antlr/examples-v3/blob/master/java/C/C.g

options {
    language = Java;
    backtrack=true;
    memoize=true;
    k=2;
}

@header {
    // import packages here.
    import java.util.HashMap;
	import java.util.Map;
	import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;
	enum Type {
		VOID, CHAR, SHORT, INT, LONG, FLOAT, DOUBLE, SIGNED, UNSIGNED, BOOL, CHARS, ERROR; // CHARS for string
	}
	HashMap<String,Type> symbolTable = new HashMap<String,Type>();
}

// start symbol
program
    : (VOID | INT) MAIN '(' (INT IDENTIFIER)? (',' (CHAR '**' IDENTIFIER) | (CHAR '*' IDENTIFIER '[' ']'))? ')' ( declaration+ compound_statement | compound_statement)
    	{ if (TRACEON) System.out.println("program: (VOID | INT) MAIN '(' (INT IDENTIFIER)? (',' (CHAR '**' IDENTIFIER) | (CHAR '*' IDENTIFIER '[' ']'))? ')' ( declaration+ compound_statement | compound_statement)"); }
    ;

// variable declarations, initilization is also implemented
declaration
@init { HashMap<String, Type> identifiers = new HashMap<String, Type>(); }
    : declaration_specifiers init_declarator_list[identifiers]? ';' 
		{ 
			if(TRACEON)
				System.out.println("declaration: declaration_specifiers init_declarator_list? ';'");

			if($init_declarator_list.text != null) {
				Type specifier = $declaration_specifiers.specifier;
				for(Map.Entry<String, Type> entry: identifiers.entrySet()) {
					String id = entry.getKey();
					Type type = entry.getValue();

					if(symbolTable.containsKey(id)) {
						System.out.println("Error! " + $declaration_specifiers.start.getLine() + ": Redeclared identifier ");
					} else {
						if(specifier == Type.VOID || specifier == Type.CHAR || specifier == Type.BOOL || specifier == Type.CHARS) {
							if(type != specifier && type != null)
								System.out.println("Error! " + $declaration_specifiers.start.getLine() + ": Type mismatch while initializing a variable ");
						} else if(type != null && ((specifier == Type.SHORT && (type != Type.CHAR && type != Type.SHORT))
								|| (specifier == Type.INT && (type != Type.CHAR && type != Type.SHORT && type != Type.INT))
								|| (specifier == Type.LONG && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG))
								|| (specifier == Type.FLOAT && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG && type != Type.FLOAT))
								|| (specifier == Type.DOUBLE && (type != Type.CHAR && type != Type.SHORT && type != Type.INT && type != Type.LONG && type != Type.FLOAT && type != Type.DOUBLE))))
							System.out.println("Error! " + $declaration_specifiers.start.getLine() + ": Type mismatch while initializing a variable ");
						symbolTable.put(id, specifier);
					}
					// VOID, CHAR, SHORT, INT, LONG, FLOAT, DOUBLE, SIGNED, UNSIGNED, BOOL, CHARS;
				}
			}
		}
	;

// multiple declarations in single line
init_declarator_list
[HashMap<String, Type> identifiers]
	: init_declarator[identifiers] (',' init_declarator[identifiers])* { if (TRACEON) System.out.println("init_declarator_list: init_declarator (',' init_declarator)*"); }
	;

// initialization
init_declarator
[HashMap<String, Type> identifiers]
	: declarator ('=' initializer)?
		{
			if(TRACEON) 
				System.out.println("init_declarator: declarator ('=' initializer)?");
			
			Type type = null;
			if($initializer.text != null)
				type = $initializer.type;
			$identifiers.put($declarator.id, type);
		}
	;

// variable prefix, e.g., const int, static char.
declaration_specifiers returns [Type specifier]
	: (storage_class_specifier | type_specifier | type_qualifier)+ 
		{ 
			if(TRACEON)
				System.out.println("declaration_specifiers: (storage_class_specifier | type_specifier | type_qualifier)+");

			if($type_specifier.text != null)
				$specifier = $type_specifier.specifier;
		}
	;

type_qualifier
	: CONST { if (TRACEON) System.out.println("type_qualifier: CONST"); }
	| VOLATILE { if (TRACEON) System.out.println("type_qualifier: VOLATILE"); }
	;

storage_class_specifier
	: EXTERN { if (TRACEON) System.out.println("storage_class_specifier: EXTERN"); }
	| STATIC { if (TRACEON) System.out.println("storage_class_specifier: STATIC"); }
	| AUTO { if (TRACEON) System.out.println("storage_class_specifier: AUTO"); }
	| REGISTER { if (TRACEON) System.out.println("storage_class_specifier: REGISTER"); }
	;

// name of a data type, used in casting or sizeof()
type_name returns [Type specifier]
	: specifier_qualifier_list abstract_declarator? { if (TRACEON) System.out.println("type_name: specifier_qualifier_list abstract_declarator?"); $specifier = $specifier_qualifier_list.specifier;}
	;

// sequence of types, e.g., const char
specifier_qualifier_list returns [Type specifier]
	: (type_qualifier | qual1=type_specifier)+ { if (TRACEON) System.out.println("specifier_qualifier_list: (type_qualifier | type_specifier)+"); $specifier = $qual1.specifier; }
	;

// user-defined types are not implemented
type_specifier returns [Type specifier]
	: VOID { if (TRACEON) System.out.println("type_specifier: VOID"); $specifier = Type.VOID; }
	| CHAR { if (TRACEON) System.out.println("type_specifier: CHAR"); $specifier = Type.CHAR; }
	| SHORT { if (TRACEON) System.out.println("type_specifier: SHORT"); $specifier = Type.SHORT; }
	| INT { if (TRACEON) System.out.println("type_specifier: INT"); $specifier = Type.INT; }
	| LONG { if (TRACEON) System.out.println("type_specifier: LONG"); $specifier = Type.LONG; }
	| FLOAT { if (TRACEON) System.out.println("type_specifier: FLOAT"); $specifier = Type.FLOAT; }
	| DOUBLE { if (TRACEON) System.out.println("type_specifier: DOUBLE"); $specifier = Type.DOUBLE; }
	| SIGNED { if (TRACEON) System.out.println("type_specifier: SIGNED"); $specifier = Type.SIGNED; }
	| UNSIGNED { if (TRACEON) System.out.println("type_specifier: UNSIGNED"); $specifier = Type.UNSIGNED; }
	| BOOL { if (TRACEON) System.out.println("type_specifier: BOOL"); $specifier = Type.BOOL; } // optional
	;

// variable name
declarator returns [String id]
	: pointer? direct_declarator { if (TRACEON) System.out.println("declarator: pointer? direct_declarator"); $id = $direct_declarator.id; }
	| pointer { if (TRACEON) System.out.println("declarator: pointer"); }
	;

// single identifier or pointer with one or more suffixes
direct_declarator returns [String id]
	: (IDENTIFIER |	'(' declarator ')') declarator_suffix* 
		{ if (TRACEON) System.out.println("direct_declarator: (IDENTIFIER | '(' declarator ')') declarator_suffix*"); $id = $IDENTIFIER.text; }
	;

// array or function, yet function declaration is not implemented
declarator_suffix
	: '[' constant_expression ']' { if (TRACEON) System.out.println("declarator_suffix: '[' constant_expression ']'"); }
    | '[' ']' { if (TRACEON) System.out.println("declarator_suffix: '[' ']'"); }
    |   '(' parameter_type_list ')' { if (TRACEON) System.out.println("declarator_suffix: '(' parameter_type_list ')'"); }
    |   '(' identifier_list ')' { if (TRACEON) System.out.println("declarator_suffix: '(' identifier_list ')'"); }
    |   '(' ')' { if (TRACEON) System.out.println("declarator_suffix: '(' ')'"); }
	;

pointer
	: '*' type_qualifier+ pointer? { if (TRACEON) System.out.println("pointer: '*' type_qualifier+ pointer?"); }
	| '*' pointer { if (TRACEON) System.out.println("pointer: '*' pointer"); }
	| '*' { if (TRACEON) System.out.println("pointer: '*'"); }
	;

parameter_type_list
	: parameter_list (',' '...')? { if (TRACEON) System.out.println("parameter_type_list: parameter_list (',' '...')?"); }
	;

parameter_list
	: parameter_declaration (',' parameter_declaration)* { if (TRACEON) System.out.println("parameter_type_list: parameter_declaration (',' parameter_declaration)*"); }
	;

parameter_declaration
	: declaration_specifiers (declarator|abstract_declarator)* { if (TRACEON) System.out.println("parameter_type_list: declaration_specifiers (declarator|abstract_declarator)*"); }
	;

identifier_list
	: IDENTIFIER (',' IDENTIFIER)* { if (TRACEON) System.out.println("identifier_list: IDENTIFIER (',' IDENTIFIER)*"); }
	;

// declarator without an identifier
abstract_declarator
	: pointer direct_abstract_declarator? { if (TRACEON) System.out.println("abstract_declarator: pointer direct_abstract_declarator?"); }
	| direct_abstract_declarator { if (TRACEON) System.out.println("abstract_declarator: direct_abstract_declarator"); }
	;

direct_abstract_declarator
	: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) abstract_declarator_suffix*
		{ if (TRACEON) System.out.println("direct_abstract_declarator: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) abstract_declarator_suffix*"); }
	;

abstract_declarator_suffix
	: '[' ']' { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' ']'"); }
	| '[' constant_expression ']' { if (TRACEON) System.out.println("abstract_declarator_suffix: '[' constant_expression ']'"); }
	| '(' ')' { if (TRACEON) System.out.println("abstract_declarator_suffix: '(' ')'"); }
	| '(' parameter_type_list ')' { if (TRACEON) System.out.println("abstract_declarator_suffix: '(' parameter_type_list ')'"); }
	;

// variable initialization
initializer returns [Type type]
	: assignment_expression { if (TRACEON) System.out.println("initializer: assignment_expression"); $type = $assignment_expression.type; }
	| '{' initializer_list ','? '}' { if (TRACEON) System.out.println("initializer: '{' initializer_list ','? '}'"); }
	;

// for nested structure
initializer_list returns [Type type]
	: init=initializer (',' initializer)* { if (TRACEON) System.out.println("initializer_list: initializer (',' initializer)*"); $type = $init.type; }
	;

// expression concatenation
argument_expression_list 
	: assignment_expression (',' assignment_expression)* { if (TRACEON) System.out.println("argument_expression_list: assignment_expression (',' assignment_expression)*"); }
	;

// base class for arithmetics
additive_expression returns [Type type]
	: (mul1=multiplicative_expression) ('+' mul2=multiplicative_expression | '-' mul3=multiplicative_expression)* 
		{ 
			if(TRACEON)
				System.out.println("additive_expression: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)*");
			
			if($mul2.text != null && $mul1.type != $mul2.type) {
				System.out.println("Error! " + $mul1.start.getLine() + ": Type mismatch in an addition");
				$type = Type.ERROR;
			} else if($mul3.text != null && $mul1.type != $mul3.type) {
				System.out.println("Error! " + $mul1.start.getLine() + ": Type mismatch in a subtraction");
				$type = Type.ERROR;
			} else {
				$type = $mul1.type;
			}	
		}
	;

multiplicative_expression returns [Type type]
	: (cast1=cast_expression) ('*' cast2=cast_expression | '/' cast3=cast_expression | '%' cast4=cast_expression)*
		{
			if(TRACEON)
				System.out.println("multiplicative_expression: (cast_expression) ('*' cast_expression | '/' cast_expression | '\%' cast_expression)*");

			if($cast2.text != null && $cast1.type != $cast2.type) {
				System.out.println("Error! " + $cast1.start.getLine() + ": Type mismatch in a multiplication");
				$type = Type.ERROR;
			} else if($cast3.text != null && $cast1.type != $cast3.type) {
				System.out.println("Error! " + $cast1.start.getLine() + ": Type mismatch in a division");
				$type = Type.ERROR;
			} else if($cast4.text != null && $cast1.type != $cast4.type) {
				System.out.println("Error! " + $cast1.start.getLine() + ": Type mismatch in a modulus");
				$type = Type.ERROR;
			} else {
				$type = $cast1.type;
			}
		}
	;

// casting
cast_expression returns [Type type]
	: '(' type_name ')' cast_expression { if (TRACEON) System.out.println("cast_expression: '(' type_name ')' cast_expression"); $type = $type_name.specifier; }
	| unary_expression { if (TRACEON) System.out.println("cast_expression: unary_expression"); $type = $unary_expression.type; }
	;

// variable prefix
unary_expression returns [Type type]
	: postfix_expression { if (TRACEON) System.out.println("unary_expression: postfix_expression"); $type = $postfix_expression.type; }
	| '++' unary2=unary_expression { if (TRACEON) System.out.println("unary_expression: '++' unary_expression"); $type = $unary2.type; }
	| '--' unary3=unary_expression { if (TRACEON) System.out.println("unary_expression: '--' unary_expression"); $type = $unary3.type; }
	| unary_operator cast_expression { if (TRACEON) System.out.println("unary_expression: unary_operator cast_expression"); $type = $cast_expression.type; }
	| 'sizeof' unary4=unary_expression { if (TRACEON) System.out.println("unary_expression: 'sizeof' unary_expression"); $type = Type.INT; }
	| 'sizeof' '(' type_name ')' { if (TRACEON) System.out.println("unary_expression: 'sizeof' '(' type_name ')'"); $type = Type.INT; }
	;

// variable postfix, user-defined data types are not supported
postfix_expression returns [Type type]
	:   
    primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' |  '.' IDENTIFIER |  '->' IDENTIFIER | '++' | '--')*
		{
			if(TRACEON)
				System.out.println("primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' |  '.' IDENTIFIER |  '->' IDENTIFIER | '++' | '--')*");
		
			$type = $primary_expression.type;
		}
	;

unary_operator
	: '&' { if (TRACEON) System.out.println("unary_operator: '&'"); }
	| '*' { if (TRACEON) System.out.println("unary_operator: '*'"); }
	| '+' { if (TRACEON) System.out.println("unary_operator: '+'"); }
	| '-' { if (TRACEON) System.out.println("unary_operator: '-'"); }
	| '~' { if (TRACEON) System.out.println("unary_operator: '~'"); }
	| '!' { if (TRACEON) System.out.println("unary_operator: '!'"); }
	;

// fundemental expression
primary_expression returns [Type type]
	: IDENTIFIER 
		{
			if(TRACEON)
				System.out.println("primary_expression: IDENTIFIER");

			if(symbolTable.containsKey($IDENTIFIER.text))
				$type = symbolTable.get($IDENTIFIER.text);
			else {
				System.out.println("Error! " + $IDENTIFIER.getLine() + ": Undeclared identifier");
				$type = Type.ERROR;
			}
		}
	| constant { if (TRACEON) System.out.println("primary_expression: constant"); $type = $constant.type; }
	| '(' expression ')' { if (TRACEON) System.out.println("primary_expression: '(' expression ')'"); $type = $expression.type; }
	;

constant returns [Type type]
    :   DECIMAL_LITERAL
		{ 
			if(TRACEON)
				System.out.println("constant: DECIMAL_LITERAL"); 
			
			long val = Integer.parseInt($DECIMAL_LITERAL.text);
			$type = Type.CHAR;
			if(val < -128 || val > 255)
				$type = Type.SHORT;
			if(val < -32768 || val > 32767)
				$type = Type.INT;
			if(val > 2147483647)
				$type = Type.LONG;
		}
    |	CHARACTER_LITERAL { if (TRACEON) System.out.println("constant: CHARACTER_LITERAL"); $type = Type.CHAR; }
	|	STRING_LITERAL { if (TRACEON) System.out.println("constant: STRING_LITERAL"); $type = Type.CHARS; }
    |   FLOATING_POINT_LITERAL 
		{ 
			if(TRACEON)
				System.out.println("constant: FLOATING_POINT_LITERAL");
			
			double val = Double.parseDouble($FLOATING_POINT_LITERAL.text);
			$type = Type.FLOAT;
			if(val < 1.2e-38 || val > 3.4e+38)
				$type = Type.DOUBLE;
		}
    ;

// not native expression defined in C, can be transformed into statement with additional semicolons.
expression returns [Type type]
	: assign1=assignment_expression (',' assignment_expression)* 
		{ 
			if(TRACEON)
				System.out.println("expression: assignment_expression (',' assignment_expression)*");

			$type = $assign1.type;
		}
	;

// predicate expression
constant_expression returns [Type type]
	: conditional_expression { if (TRACEON) System.out.println("constant_expression: conditional_expression"); $type = $conditional_expression.type; }
	;

// expression with assignment
assignment_expression returns [Type type]
	: lvalue assignment_operator assign2=assignment_expression 
		{ 
			if(TRACEON) 
				System.out.println("assignment_expression: lvalue assignment_operator assignment_expression");
			if($lvalue.type == Type.VOID || $lvalue.type == Type.CHAR || $lvalue.type == Type.BOOL || $lvalue.type == Type.CHARS) {
				if($assign2.type != $lvalue.type && $assign2.type != null)
					System.out.println("Error! " + $lvalue.start.getLine() + ": Type mismatch while assigning a value to a variable");
			} else if(($lvalue.type == Type.SHORT && ($assign2.type != Type.CHAR && $assign2.type != Type.SHORT))
					|| ($lvalue.type == Type.INT && ($assign2.type != Type.CHAR && $assign2.type != Type.SHORT && $assign2.type != Type.INT))
					|| ($lvalue.type == Type.LONG && ($assign2.type != Type.CHAR && $assign2.type != Type.SHORT && $assign2.type != Type.INT && $assign2.type != Type.LONG))
					|| ($lvalue.type == Type.FLOAT && ($assign2.type != Type.CHAR && $assign2.type != Type.SHORT && $assign2.type != Type.INT && $assign2.type != Type.LONG && $assign2.type != Type.FLOAT))
					|| ($lvalue.type == Type.DOUBLE && ($assign2.type != Type.CHAR && $assign2.type != Type.SHORT && $assign2.type != Type.INT && $assign2.type != Type.LONG && $assign2.type != Type.FLOAT && $assign2.type != Type.DOUBLE)))
				System.out.println("Error! " +$lvalue.start.getLine() + ": Type mismatch while assigning a value to a variable ");
			$type = $lvalue.type;
		}
	| conditional_expression { if (TRACEON) System.out.println("assignment_expression: conditional_expression"); $type = $conditional_expression.type; }
	;

lvalue returns [Type type]
	: unary_expression { if (TRACEON) System.out.println("lvalue: unary_expression"); $type = $unary_expression.type; }
	;

assignment_operator
	: '=' { if (TRACEON) System.out.println("assignment_operator: '='"); }
	| '*=' { if (TRACEON) System.out.println("assignment_operator: '*='"); }
	| '/=' { if (TRACEON) System.out.println("assignment_operator: '/='"); }
	| '%=' { if (TRACEON) System.out.println("assignment_operator: '\%='"); }
	| '+=' { if (TRACEON) System.out.println("assignment_operator: '+='"); }
	| '-=' { if (TRACEON) System.out.println("assignment_operator: '-='"); }
	| '<<=' { if (TRACEON) System.out.println("assignment_operator: '<<='"); }
	| '>>=' { if (TRACEON) System.out.println("assignment_operator: '>>='"); }
	| '&=' { if (TRACEON) System.out.println("assignment_operator: '&='"); }
	| '^=' { if (TRACEON) System.out.println("assignment_operator: '^='"); }
	| '|=' { if (TRACEON) System.out.println("assignment_operator: '|='"); }
	;
    
conditional_expression returns [Type type]
	: con1=logical_or_expression ('?' expression ':' conditional_expression)?
		{
			if(TRACEON)
				System.out.println("conditional_expression: logical_or_expression ('?' expression ':' conditional_expression)?");

			$type = $con1.type;
			if($expression.text != null) {
				if($expression.type != Type.BOOL) {
					System.out.println("Error! " + $con1.start.getLine() + ": Invalid condition type");
					$type = Type.ERROR;
				}
			}
		}
	;

logical_or_expression returns [Type type]
	: or1=logical_and_expression ('||' or2=logical_and_expression)*
		{ 
			if(TRACEON)
				System.out.println("logical_or_expression: logical_and_expression ('||' logical_and_expression)*");
			
			$type = $or1.type;
			if($or2.text != null) {
				if($or1.type != $or2.type) {
					System.out.println("Error! " + $or1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				} else {
					$type = Type.BOOL;
				}
			}
		}
	;
logical_and_expression returns [Type type]
	: and1=inclusive_or_expression ('&&' and2=inclusive_or_expression)*
		{ 
			if(TRACEON)
				System.out.println("logical_and_expression: inclusive_or_expression ('&&' inclusive_or_expression)*");
			
			$type = $and1.type;
			if($and2.text != null) {
				if($and1.type != $and2.type) {
					System.out.println("Error! " + $and1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				} else {
					$type = Type.BOOL;
				}
			}
		}
	;
inclusive_or_expression returns [Type type]
	: eor1=exclusive_or_expression ('|' eor2=exclusive_or_expression)*
		{ 
			if(TRACEON)
				System.out.println("inclusive_or_expression: exclusive_or_expression ('|' exclusive_or_expression)*");
			
			$type = $eor1.type;
			if($eor2.text != null) {
				if($eor1.type != $eor2.type) {
					System.out.println("Error! " + $eor1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				}
			}
		}
	;
exclusive_or_expression returns [Type type]
	: and1=and_expression ('^' and2=and_expression)*
		{ 
			if(TRACEON)
				System.out.println("exclusive_or_expression: and_expression ('^' and_expression)*");
			
			$type = $and1.type;
			if($and2.text != null) {
				if($and1.type != $and2.type) {
					System.out.println("Error! " + $and1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				}
			}
		}
	;
and_expression returns [Type type]
	: equal1=equality_expression ('&' equal2=equality_expression)*
		{ 
			if(TRACEON)
				System.out.println("and_expression: equality_expression ('&' equality_expression)*");

			$type = $equal1.type;
			if($equal2.text != null) {
				if($equal1.type != $equal2.type) {
					System.out.println("Error! " + $equal1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				}
			}
		}
	;
equality_expression returns [Type type]
	: rel1=relational_expression (('=='|'!=') rel2=relational_expression)*
		{ 
			if(TRACEON)
				System.out.println("equality_expression: relational_expression (('=='|'!=') relational_expression)*");
			// System.out.println($rel1.text + " " + $rel1.type + "___" + $rel2.text + " " + $rel2.type);
			$type = $rel1.type;
			if($rel2.text != null) {
				if($rel1.type != $rel2.type) {
					System.out.println("Error! " + $rel1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				} else {
					$type = Type.BOOL;
				}
			}
		}
	;
relational_expression returns [Type type]
	: shift1=shift_expression (('<'|'>'|'<='|'>=') shift2=shift_expression)*
		{ 
			if(TRACEON)
				System.out.println("relational_expression: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*");

			$type = $shift1.type;
			if($shift2.text != null) {
				if($shift1.type != $shift2.type) {
					System.out.println("Error! " + $shift1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				} else {
					$type = Type.BOOL;
				}
			}
		}
	;
shift_expression returns [Type type]
	: add1=additive_expression (('<<'|'>>') add2=additive_expression)*
		{ 
			if(TRACEON)
				System.out.println("shift_expression: additive_expression (('<<'|'>>') additive_expression)*");

			$type = $add1.type;
			if($add2.text != null) {
				if($add1.type != $add2.type) {
					System.out.println("Error! " + $add1.start.getLine() + ": Type mismatch between two side of an operator");
					$type = Type.ERROR;
				}
			}
		}
	;

// base class
statement
    : labeled_statement { if (TRACEON) System.out.println("statement: labeled_statement;"); }
    | compound_statement { if (TRACEON) System.out.println("statement: compound_statement"); }
    | expression_statement { if (TRACEON) System.out.println("statement: compound_statement"); }
    | selection_statement { if (TRACEON) System.out.println("statement: selection_statement"); }
    | iteration_statement { if (TRACEON) System.out.println("statement: iteration_statement"); }
	| jump_statement { if (TRACEON) System.out.println("statement: jump_statement"); }
    ;

// cases in switch statement
labeled_statement
	: IDENTIFIER ':' statement { if (TRACEON) System.out.println("labeled_statement: IDENTIFIER ':' statement"); }
	| 'case' constant_expression ':' statement { if (TRACEON) System.out.println("labeled_statement: 'case' constant_expression ':' statement"); }
	| 'default' ':' statement { if (TRACEON) System.out.println("labeled_statement: 'default' ':' statement"); }
	;

// code block
compound_statement
    : '{' declaration* statement_list? '}' { if (TRACEON) System.out.println("compound_statement: '{' declaration* statement_list? '}'"); }
    ;

// sequence of statements
statement_list
	: statement+ { if (TRACEON) System.out.println("statement_list: statement+"); }
	;

expression_statement returns [Type type]
	: ';' { if (TRACEON) System.out.println("expression_statement: ';'"); $type = Type.BOOL; }
	| expression ';' { if (TRACEON) System.out.println("expression_statement: expression ';'"); $type = $expression.type; }
	;

// control flow
selection_statement
	: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?
		{ 
			if(TRACEON)
				System.out.println("selection_statement: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?");

			if($expression.type != Type.BOOL)
				System.out.println("Error! " + $IF.getLine() + ": Invalid condition type");
		}
	| SWITCH '(' expression ')' statement
		{ if (TRACEON) System.out.println("selection_statement: SWITCH '(' expression ')' statement"); }
	;

// control flow
iteration_statement
    : WHILE '(' expression ')' statement 
		{ 
			if(TRACEON)
				System.out.println("iteration_statement: WHILE '(' expression ')' statement");

			if($expression.type != Type.BOOL)
				System.out.println("Error! " + $WHILE.getLine() + ": Invalid condition type");
		}
	| DO statement WHILE '(' expression ')' ';' 
		{ 
			if(TRACEON)
				System.out.println("iteration_statement: DO statement WHILE '(' expression ')' ';'");
			
			if($expression.type != Type.BOOL)
				System.out.println("Error! " + $DO.getLine() + ": Invalid condition type");
		}
	| FOR '(' expression_statement expr2=expression_statement expression? ')' statement 
		{ 
			if(TRACEON)
				System.out.println("iteration_statement: FOR '(' expression_statement expression_statement expression? ')' statement");

			if($expr2.type != Type.BOOL)
				System.out.println("Error! " + $expr2.start.getLine() + ": Invalid condition type");
		}
	;

// control flow
jump_statement
	: GOTO IDENTIFIER ';' { if (TRACEON) System.out.println("jump_statement: GOTO IDENTIFIER ';'"); }
	| CONTINUE ';' { if (TRACEON) System.out.println("jump_statement: CONTINUE ';'"); }
	| BREAK ';' { if (TRACEON) System.out.println("jump_statement: BREAK ';'"); }
	| RETURN ';' { if (TRACEON) System.out.println("jump_statement: RETURN ';'"); }
	| RETURN expression ';' { if (TRACEON) System.out.println("jump_statement: RETURN expression ';'"); }
	;
   
/* description of the tokens */
VOID: 'void';
CHAR: 'char';
SHORT: 'short';
INT:'int';
LONG: 'long';
FLOAT:'float';
DOUBLE: 'double';
SIGNED: 'signed';
UNSIGNED: 'unsigned';
BOOL: 'bool';

CONST: 'const';
VOLATILE: 'volatile';
EXTERN: 'extern';
STATIC: 'static';
AUTO: 'auto';
REGISTER: 'register';

MAIN: 'main';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
WHILE: 'while';
DO: 'do';
FOR: 'for';
GOTO: 'goto';
CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

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

DECIMAL_LITERAL
    : ('0' | '1'..'9' '0'..'9'*)
    ;

FLOATING_POINT_LITERAL
    : ('0'..'9')+ '.' ('0'..'9')*
    | '.' ('0'..'9')+
	;

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
