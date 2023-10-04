JCC = javac
J = java
JFLAGS = -cp
ANTLR = ./antlr-3.5.3-complete.jar
# ANTLR = .\antlr-3.5.3-complete.jar


default: mylexer.class testLexer.class

mylexer.java: mylexer.g
	$(J) $(JFLAGS) $(ANTLR) org.antlr.Tool mylexer.g

mylexer.class: mylexer.java
	$(JCC) $(JFLAGS) $(ANTLR) testLexer.java mylexer.java

run1: testLexer.class input1.c
#   $(J) $(JFLAGS) $(ANTLR)`;. testLexer input1.c
	$(J) $(JFLAGS) $(ANTLR):. testLexer input1.c


run2: testLexer.class input2.c
#   $(J) $(JFLAGS) $(ANTLR)`;. testLexer input2.c
	$(J) $(JFLAGS) $(ANTLR):. testLexer input2.c

run3: testLexer.class input3.c
#   $(J) $(JFLAGS) $(ANTLR)`;. testLexer input3.c
	$(J) $(JFLAGS) $(ANTLR):. testLexer input3.c

clean:
#	del *.class
#	del mylexer.java
	rm *.class mylexer.java





# java -cp .\antlr-3.5.3-complete.jar org.antlr.Tool mylexer.g

# javac -cp .\antlr-3.5.3-complete.jar .\testLexer.java .\mylexer.java

# java -cp .\antlr-3.5.3-complete.jar`;. .\testLexer.java .\input1.c 