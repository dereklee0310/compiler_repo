Caution:
    The commands involved in the makefile are written for powershell originally.
    It should be able to run on on UN*X platforms,
    if you encounter any problems executing this makefile, please checkout the
    makefile and tune it yourself to serve your needs.

How to compile:
    Open a terminal
    Type "make" to let the makefile do it for u.

How to execute:
    Type "make run<test case number>"  in the terminal
    for example:
        "make run1" will run our parser testing program, and use test1.c as the input file. 

How to remove generated files:
    Type "make clean" to remove them

Content:
    c_subset.docx
    myparser.g
    testParser.java
    test1.c
    test2.c
    test3.c
    README.txt

Feature:
    This is an implementation of a simple parser for a C subset using ANTLR3 as the generator.
    A grammar file called myparser.g is implemented. With ANTLR, we can generate lexer, parser, and list of tokens from it.
    After that, we can execute a simple parser testing program called testParser to validate our input files.

    I implemented most of the features of ANSI C, leaving the user-defined data types and functions out to simplify it.
    For decimal and floating numbers, native suffixes in ANSI C like exponent or type is not included,
    i.e., the parser can only accept numbers that are composed of digits and a decimal point.
    Some escape sequences are not included.
    Instead of LL(1), LL(2) and backtracking are used in this parser to handle left recursion and factor. (which is not supported in ANTLR4) 

    reference: https://github.com/antlr/examples-v3/blob/master/java/C/C.g

    409410090 資工三 李明翰