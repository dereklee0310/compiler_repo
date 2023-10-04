import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        myCompilerLexer lex = new myCompilerLexer(new ANTLRFileStream("C:\\Users\\User\\workspace\\ccu_compiler\\final_project\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        myCompilerParser g = new myCompilerParser(tokens, 49100, null);
        try {
            g.translation_unit();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}