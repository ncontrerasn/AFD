import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        GrammarAFDLexer lexer = new GrammarAFDLexer(CharStreams.fromFileName("input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarAFDParser parser = new GrammarAFDParser(tokens);
        ParseTree tree = parser.automata();
        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        /*Form form = new Form(loader.estados, loader.alfabeto, loader.matriz);
        form.setVisible(true);
        form.setLocation(400, 250);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        Window window = new Window(loader.estados, loader.alfabeto, loader.matriz);
        window.setLocation(800, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ProcesamientoAFD procesamientoAFD = new ProcesamientoAFD();
        procesamientoAFD.setLocation(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
