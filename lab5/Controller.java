import javax.swing.*;

public class Controller {
    Controller(JTextArea area, JTextField text) {
        area.setText(area.getText() + text.getText() + "\n");
        text.setText("");
    }
}