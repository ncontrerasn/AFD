import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {
        GrammarAFDLexer lexer = new GrammarAFDLexer(CharStreams.fromFileName("input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarAFDParser parser = new GrammarAFDParser(tokens);
        ParseTree tree = parser.automata();
        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
    }
}
