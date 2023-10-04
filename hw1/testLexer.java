import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

public class testLexer {
    public static void main(String[] args) {
        try {
            CharStream input = new ANTLRFileStream(args[0]);
            mylexer lexer = new mylexer(input);
            Token token = lexer.nextToken();
            while (token.getType() != -1) { // -1 is EOF.
                System.out.println("Token: " + token.getType() + " " + token.getText());
                token = lexer.nextToken();
            }
        } catch (IOException t) {
            System.out.println("Exception:" + t);   
            t.printStackTrace();
        }
    }
}