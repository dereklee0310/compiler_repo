Caution:
    The commands involved in the makefile are written for powershell originally.
    I have modified some of them to make it applicable to UNIX platforms,
    if you encounter any problems executing the make command, please checkout the
    makefile and tune it to serve your needs.

    Sorry for the inconvenience.

How to compile:
    Open a terminal
    Type "make" to let the makefile do it for u.

How to execute:
    Type "make run<test case number>"  in the terminal
    for example:
        "make run1" will run our lexer testing program, and use input1.c as the inpt file. 

How to remove executable file:
    Type "make clean" to remove the executable files generated by this makefile

Content:
    c_subset.docx
    mylexer.g
    testLexer.java
    input1.c
    input2.c
    input3.c
    README.testLexer

Environment:
  CPU: AMD Ryzen 5 3600 6-Core Processor
  RAM: 16GB
  Host OS: Windows 10 professional
  Guest OS: Ubuntu 22.04.1 LTS in WSL2

Feature:
    This program will take two decimal number entered by user as inputs, convert them into BCD code format,
    then apply addition and subtraction on them. The output of the program will be the BCD code
    of two numbers, and the result of BCD addition and subtraction in binary format.

    User need to enter the numbers in terminal, and the output will show up in gdb console of insight debugger.

    The BCD conversion has been implemented in previous homework, so we only need to implement addition and
    subtraction of two numbers in BCD code format.

    In the addition part, I use bitwise anding to get the digit i want, then apply addition on that digit. After that,
    I check the validness of result, set up the carry bit if there is any, and turn the digit into valid form.

    For subtraction, I calculate the 10's complement of subtrahend first, add it on the given summand and discard the redundant carry.

    409410090 資工三 李明翰




    %