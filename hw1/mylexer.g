lexer grammar mylexer;

options {
    language = Java;
}

// literals
STRING_LITERAL : '\"'(options{greedy=false;}: .)*'\"';
CHAR_LITERAL : '\''(options{greedy=false;}: .)?'\'';

// Data Types
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE : 'float';
DOUBLE_TYPE :'double';
BOOL : 'bool';
BOOL_TYPE_2 : '_Bool';
COMPLEX_TYPE : 'complex';
COMPLEX_TYPE_2 : '_Complex';
IMAGINARY_TYPE : 'imaginary';
IMAGINARY_TYPE_2 : '_Imaginary';

// User-defined Types
ENUM_TYPE : 'enum';
STRUCT_TYPE : 'struct';
UNION_TYPE : 'union';

// Control Flows
SWITCH_TYPE : 'switch';
CASE_TYPE : 'case';
DEFAULT_TYPE : 'default';
DO_TYPE : 'do';
WHILE_TYPE :  'while';
BREAK_TYPE : 'break';
CONTINUE_TYPE : 'continue';
FOR_TYPE : 'for';
IF_TYPE : 'if';
ELSE_TYPE : 'else';
GOTO_TYPE : 'goto';
RETURN_TYPE : 'return';

// Type Qualifiers
CONST_TYPE : 'const';
RESTRICT_TYPE : 'restrict';

// Function Specifiers
INLINE_TYPE : 'inline';

// Type Modifiers
SHORT_TYPE : 'short';
LONG_TYPE : 'long';
SIGNED_TYPE : 'signed';
UNSIGNED_TYPE : 'unsigned';

// Storage-class specifiers
AUTO_TYPE : 'auto';
REGISTER_TYPE : 'register';
STATIC_TYPE : 'static';
EXTERN_TYPE : 'extern';
TYPEDEF_TYPE : 'typedef';

// Special Operator and Puctuations
SIZEOF : 'sizeof';
VAR_ARG: '...';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
HASH : '#';
LPAREN : '(';
RPAREN : ')';
LBRACKET : '[';
RBRACKET : ']';
CURLY_LBRACKET : '{';
CURLY_RBRACKET : '}';
APOSTROPHE : '\'';
QUOTE : '\"';
QUESTIONMARK : '?';

// Member Accessors
ACCESS_OP : '.';
PTR_ACCESS_OP : '->';

// Increment and Decrement Operators
PP_OP : '++';
MM_OP : '--';

// Logical Operators
NOT_OP : '!';
AND_OP : '&&';
OR_OP : '||';

// Comparison Operators
EQ_OP : '==';
NE_OP : '!=';
LE_OP : '<=';
GE_OP : '>=';
LT_OP : '<';
RT_OP : '>';

// Assignment Operators
ASSIGN_OP : '=';
ADD_ASSIGN_OP : '+=';
MINUS_ASSIGN_OP : '-=';
MUL_ASSIGN_OP : '*=';
DIVIDE_ASSIGN_OP : '/=';
MOD_ASSIGN_OP : '%=';
OR_ASSIGN_OP : '|=';
XOR_ASSIGN_OP : '^=';
LSHIFT_ASSIGN_OP : '<<=';
RSHIFT_ASSIGN_OP : '>>=';

// Arithmetic Operators
ADD_OP : '+';
MINUS_OP : '-';
MUL_OP : '*';
DIVIDE_OP : '/';
MOD_OP : '%';
B_NOT_OP : '~';
B_AND_OP : '&';
B_OR_OP : '|';
B_XOR_OP : '^';
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';


NEW_LINE: '\n' {skip();};
WS  : (' '|'\r'|'\t')+ {skip();}
    ;
