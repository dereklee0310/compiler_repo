import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        myCheckerLexer lex = new myCheckerLexer(new ANTLRFileStream("C:\\Users\\User\\workspace\\ccu_compiler\\hw3\\test2.c", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        myCheckerParser g = new myCheckerParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}