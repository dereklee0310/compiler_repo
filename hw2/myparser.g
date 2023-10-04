grammar myparser;


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
}

@members {
    boolean TRACEON = true;
}

// start symbol
program
    : (VOID | INT) MAIN '(' (INT IDENTIFIER)? (',' (CHAR '**' IDENTIFIER) | (CHAR '*' IDENTIFIER '[' ']'))? ')' compound_statement 
    { if (TRACEON) System.out.println("program: (VOID | INT) MAIN '(' (INT IDENTIFIER)? (',' (CHAR '**' IDENTIFIER) | (CHAR '*' IDENTIFIER '[' ']'))? ')' compound_statement"); }
    ;

// variable declarations, initilization is also implemented
declaration
    : declaration_specifiers init_declarator_list? ';' { if (TRACEON) System.out.println("declaration: declaration_specifiers init_declarator_list? ';'");} {System.out.println($init_declarator_list.text);}
	;

// multiple declarations in single line
init_declarator_list
	: init_declarator (',' init_declarator)* { if (TRACEON) System.out.println("init_declarator_list: init_declarator (',' init_declarator)*"); }
	;

// initialization
init_declarator
	: declarator ('=' initializer)? { if (TRACEON) System.out.println("init_declarator: declarator ('=' initializer)?"); }
	;

// variable prefix, e.g., const int, static char.
declaration_specifiers
	: (storage_class_specifier | type_specifier | type_qualifier)+ 
	{ if (TRACEON) System.out.println("declaration_specifiers: (storage_class_specifier | type_specifier | type_qualifier)+"); }
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
type_name
	: specifier_qualifier_list abstract_declarator? { if (TRACEON) System.out.println("type_name: specifier_qualifier_list abstract_declarator?"); }
	;

// sequence of types, e.g., const char
specifier_qualifier_list
	: (type_qualifier | type_specifier)+ { if (TRACEON) System.out.println("specifier_qualifier_list: (type_qualifier | type_specifier)+"); }
	;

// user-defined types are not implemented
type_specifier
	: VOID { if (TRACEON) System.out.println("type_specifier: VOID"); }
	| CHAR { if (TRACEON) System.out.println("type_specifier: CHAR"); }
	| SHORT { if (TRACEON) System.out.println("type_specifier: SHORT"); }
	| INT { if (TRACEON) System.out.println("type_specifier: INT"); }
	| LONG { if (TRACEON) System.out.println("type_specifier: LONG"); }
	| FLOAT { if (TRACEON) System.out.println("type_specifier: FLOAT"); }
	| DOUBLE { if (TRACEON) System.out.println("type_specifier: DOUBLE"); }
	| SIGNED { if (TRACEON) System.out.println("type_specifier: SIGNED"); }
	| UNSIGNED { if (TRACEON) System.out.println("type_specifier: UNSIGNED"); }
	;

// variable name
declarator
	: pointer? direct_declarator { if (TRACEON) System.out.println("declarator: pointer? direct_declarator"); }
	| pointer { if (TRACEON) System.out.println("declarator: pointer"); }
	;

// single identifier or pointer with one or more suffixes
direct_declarator
	: (IDENTIFIER |	'(' declarator ')') declarator_suffix* { if (TRACEON) System.out.println("direct_declarator: (IDENTIFIER | '(' declarator ')') declarator_suffix*"); }
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
initializer
	: assignment_expression { if (TRACEON) System.out.println("initializer: assignment_expression"); }
	| '{' initializer_list ','? '}' { if (TRACEON) System.out.println("initializer: '{' initializer_list ','? '}'"); }
	;

// for nested structure
initializer_list
	: initializer (',' initializer)* { if (TRACEON) System.out.println("initializer_list: initializer (',' initializer)*"); }
	;




// expression concatenation
argument_expression_list
	: assignment_expression (',' assignment_expression)* { if (TRACEON) System.out.println("argument_expression_list: assignment_expression (',' assignment_expression)*"); }
	;

// base class for arithmetics
additive_expression
	: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)* 
	{ if (TRACEON) System.out.println("additive_expression: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)*"); }
	;

multiplicative_expression
	: (cast_expression) ('*' cast_expression | '/' cast_expression | '%' cast_expression)*
	{ if (TRACEON) System.out.println("multiplicative_expression: (cast_expression) ('*' cast_expression | '/' cast_expression | '\%' cast_expression)*"); }
	;

// casting
cast_expression
	: '(' type_name ')' cast_expression { if (TRACEON) System.out.println("cast_expression: '(' type_name ')' cast_expression"); }
	| unary_expression { if (TRACEON) System.out.println("cast_expression: unary_expression"); }
	;

// variable prefix
unary_expression
	: postfix_expression { if (TRACEON) System.out.println("unary_expression: postfix_expression"); }
	| '++' unary_expression { if (TRACEON) System.out.println("unary_expression: '++' unary_expression"); }
	| '--' unary_expression { if (TRACEON) System.out.println("unary_expression: '--' unary_expression"); }
	| unary_operator cast_expression { if (TRACEON) System.out.println("unary_expression: unary_operator cast_expression"); }
	| 'sizeof' unary_expression { if (TRACEON) System.out.println("unary_expression: 'sizeof' unary_expression"); }
	| 'sizeof' '(' type_name ')' { if (TRACEON) System.out.println("unary_expression: 'sizeof' '(' type_name ')'"); }
	;

// variable postfix, user-defined data types are not supported
postfix_expression
	:   
    primary_expression
    ( '[' expression ']'
    | '(' ')'
    | '(' argument_expression_list ')'
    |   '.' IDENTIFIER
    |   '->' IDENTIFIER
    | '++'
    | '--'
    )*
	{ if (TRACEON) System.out.println("postfix_expression: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '++' | '--' )*"); }
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
primary_expression
	: IDENTIFIER { if (TRACEON) System.out.println("primary_expression: IDENTIFIER"); }
	| constant { if (TRACEON) System.out.println("primary_expression: constant"); }
	| '(' expression ')' { if (TRACEON) System.out.println("primary_expression: '(' expression ')'"); }
	;

constant
    :   DECIMAL_LITERAL { if (TRACEON) System.out.println("constant: DECIMAL_LITERAL"); }
    |	CHARACTER_LITERAL { if (TRACEON) System.out.println("constant: CHARACTER_LITERAL"); }
	|	STRING_LITERAL { if (TRACEON) System.out.println("constant: STRING_LITERAL"); }
    |   FLOATING_POINT_LITERAL { if (TRACEON) System.out.println("constant: FLOATING_POINT_LITERAL"); }
    ;

// not native expression defined in C, can be transformed into statement with additional semicolons.
expression
	: assignment_expression (',' assignment_expression)* { if (TRACEON) System.out.println("expression: assignment_expression (',' assignment_expression)*"); }
	;

// predicate expression
constant_expression
	: conditional_expression { if (TRACEON) System.out.println("constant_expression: conditional_expression"); }
	;

// expression with assignment
assignment_expression
	: lvalue assignment_operator assignment_expression { if (TRACEON) System.out.println("assignment_expression: lvalue assignment_operator assignment_expression"); }
	| conditional_expression { if (TRACEON) System.out.println("assignment_expression: conditional_expression"); }
	;

lvalue
	: unary_expression { if (TRACEON) System.out.println("lvalue: unary_expression"); }
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
    
conditional_expression
	: logical_or_expression ('?' expression ':' conditional_expression)?
	{ if (TRACEON) System.out.println("conditional_expression: logical_or_expression ('?' expression ':' conditional_expression)?"); }
	;

logical_or_expression
	: logical_and_expression ('||' logical_and_expression)*
	{ if (TRACEON) System.out.println("logical_or_expression: logical_and_expression ('||' logical_and_expression)*"); }
	;
logical_and_expression
	: inclusive_or_expression ('&&' inclusive_or_expression)*
	{ if (TRACEON) System.out.println("logical_and_expression: inclusive_or_expression ('&&' inclusive_or_expression)*"); }
	;
inclusive_or_expression
	: exclusive_or_expression ('|' exclusive_or_expression)*
	{ if (TRACEON) System.out.println("inclusive_or_expression: exclusive_or_expression ('|' exclusive_or_expression)*"); }
	;
exclusive_or_expression
	: and_expression ('^' and_expression)*
	{ if (TRACEON) System.out.println("exclusive_or_expression: and_expression ('^' and_expression)*"); }
	;
and_expression
	: equality_expression ('&' equality_expression)*
	{ if (TRACEON) System.out.println("and_expression: equality_expression ('&' equality_expression)*"); }
	;
equality_expression
	: relational_expression (('=='|'!=') relational_expression)*
	{ if (TRACEON) System.out.println("equality_expression: relational_expression (('=='|'!=') relational_expression)*"); }
	;
relational_expression
	: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*
	{ if (TRACEON) System.out.println("relational_expression: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*"); }
	;
shift_expression
	: additive_expression (('<<'|'>>') additive_expression)*
	{ if (TRACEON) System.out.println("shift_expression: additive_expression (('<<'|'>>') additive_expression)*"); }
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

expression_statement
	: ';' { if (TRACEON) System.out.println("expression_statement: ';'"); }
	| expression ';' { if (TRACEON) System.out.println("expression_statement: expression ';'"); }
	;

// control flow
selection_statement
	: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?
	{ if (TRACEON) System.out.println("selection_statement: IF '(' expression ')' statement (options {k=1; backtrack=false;}:ELSE statement)?"); }
	| SWITCH '(' expression ')' statement
	{ if (TRACEON) System.out.println("selection_statement: SWITCH '(' expression ')' statement"); }
	;

// control flow
iteration_statement
    : WHILE '(' expression ')' statement { if (TRACEON) System.out.println("iteration_statement: WHILE '(' expression ')' statement"); }
	| DO statement WHILE '(' expression ')' ';' { if (TRACEON) System.out.println("iteration_statement: DO statement WHILE '(' expression ')' ';'"); }
	| FOR '(' expression_statement expression_statement expression? ')' statement 
	{ if (TRACEON) System.out.println("iteration_statement: FOR '(' expression_statement expression_statement expression? ')' statement"); }
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
