JCC = javac
J = java
JFLAGS = -cp

ifeq ($(OS),Windows_NT)
	ANTLR = .\antlr-3.5.3-complete.jar
	PATH_SYMBOL = ;
else
	PATH_SYMBOL = :
	ANTLR = ./antlr-3.5.3-complete.jar
endif

default: myChecker.class myChecker_test.class

myChecker.java: myChecker.g
	$(J) $(JFLAGS) $(ANTLR) org.antlr.Tool myChecker.g

myChecker.class: myChecker.java
	$(JCC) $(JFLAGS) $(ANTLR) *.java

run1: myChecker_test.class test1.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). myChecker_test test1.c

run2: myChecker_test.class test2.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). myChecker_test test2.c

run3: myChecker_test.class test3.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). myChecker_test test3.c

run4: myChecker_test.class test3.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). myChecker_test test4.c

clean:
ifeq ($(OS),Windows_NT)
	del *.class
	del myCheckerParser.java
	del myCheckerLexer.java
	del myChecker.tokens
else
	rm *.class myCheckerParser.java myCheckerLexer.java myChecker.tokens
endif