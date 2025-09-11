package capitulo11;

import javax.swing.*;

public class TesteJOptionPane {

    public static void main(String[] args) {

        JOptionPane pane = new JOptionPane();

        pane.createDialog("teste");
        pane.setMessage("teste 2");

        JOptionPane.showConfirmDialog(pane, "teste");
    }
}
