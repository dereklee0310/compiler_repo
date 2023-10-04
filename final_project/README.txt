Caution:
    The commands involved in the makefile are written for powershell originally.
    It should be able to run on on UN*X platforms,
    if you encounter any problems executing this makefile, please checkout the
    makefile and tune it yourself to serve your needs.

How to compile:
    Open a terminal
    Type "make" to let the makefile do it for u.

How to execute:
    Type "make run<test case number>" in the terminal to generate LLVM IR
        for example: "make run1" will run our parser testing program, and use test1.c as the input file

    !!!!!! the output will be redirect to output<test case number>.ll !!!!!!

    Type "lli output<test case number>.ll" to interpret the IR we just generated
        for example: "lli output1.ll" will invoke the lli interpreter to interpret output1.ll

How to remove generated files:
    Type "make clean" to remove them

Content:
    c_subset.docx
    myCompiler.g
    myCompiler_test.java
    test1.c
    test2.c
    test3.c
    README.txt
    makefile

Feature:
    This is a small compiler that convert high level C code into LLVM IR 

    The subset definition can be founded in c_subset.docx.
    
    test1.c is used for testing simple declaration, initialization, assignment and printf().
    test2.c is used for testing arithmetic expression and statement.
    test3.c is used for testing if else statements.

    reference: https://github.com/antlr/examples-v3/blob/master/java/C/C.g

    409410090 資工三 李明翰