JCC = javac
J = java
JFLAGS = -cp
DEBUG = -Xlint:unchecked

ifeq ($(OS),Windows_NT)
	ANTLR = .\antlr-3.5.3-complete.jar
	PATH_SYMBOL = ;
else
	PATH_SYMBOL = :
	ANTLR = ./antlr-3.5.3-complete.jar
endif

default: myCompiler.class myCompiler_test.class

myCompiler.java: myCompiler.g
	$(J) $(JFLAGS) $(ANTLR) org.antlr.Tool myCompiler.g

myCompiler.class: myCompiler.java
	$(JCC) $(JFLAGS) $(ANTLR) *.java

# use @ to hide the command for lli interpreter
run1: myCompiler_test.class test1.c
	@$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). myCompiler_test test1.c > output1.ll

run2: myCompiler_test.class test2.c
	@$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). myCompiler_test test2.c > output2.ll

run3: myCompiler_test.class test3.c
	@$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). myCompiler_test test3.c > output3.ll

clean:
ifeq ($(OS),Windows_NT)
	del *.class
	del myCompilerParser.java
	del myCompilerLexer.java
	del myCompiler.tokens
else
	rm *.class myCompilerParser.java myCompilerLexer.java myCompiler.tokens
	rm output*.ll
endif