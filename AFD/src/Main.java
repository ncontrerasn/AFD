import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //se llama a Form, el formulario que deja ingresar el AFD
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Form form = new Form();
        form.setVisible(true);
        form.setLocation(400, 200);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
