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
    myChecker.g
    myChecker_test.java
    test1.c
    test2.c
    test3.c
    README.txt

Feature:
    This is a simple static type checker for a using ANTLR3 as the generator.
    A grammar file called myChecker.g is implemented. With ANTLR, we can generate lexer, parser, tokens with type checking.
    After that, we can execute a simple checker testing program called myChecker_test to validate our input files.

    The type checking rule can be founded in c_subset.docx.
    test1.c is the example in the project illustration document.
    test2.c is used for validating type checking for variables.
    test3.c is used for validating type checking for control-flow statements.

    reference: https://github.com/antlr/examples-v3/blob/master/java/C/C.g

    409410090 資工三 李明翰