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

default: myparser.class testParser.class

myparser.java: myparser.g
	$(J) $(JFLAGS) $(ANTLR) org.antlr.Tool myparser.g

myparser.class: myparser.java
	$(JCC) $(JFLAGS) $(ANTLR) *.java

run1: testParser.class test1.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). testParser test1.c

run2: testParser.class test2.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). testParser test2.c

run3: testParser.class test3.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). testParser test3.c

run4: testParser.class test4.c
	$(J) $(JFLAGS) $(ANTLR)$(PATH_SYMBOL). testParser test4.c

clean:
ifeq ($(OS),Windows_NT)
	del *.class
	del myparserParser.java
	del myParserLexer.java
	del myparser.tokens
else
	rm *.class mylexer.java
endif