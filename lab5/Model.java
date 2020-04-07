import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Model {

    JButton button;
    JTextField text;
    JTextArea area;

    Model() {
        JFrame f = new JFrame("MVC");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("add");
        button.setBounds(0, 0, 125, 30);
        f.add(button);

        text = new JTextField();
        text.setBounds(0, 161, 125, 24);
        f.add(text);
        area = new JTextArea();
        area.setBounds(0, 30, 200, 200);
        f.add(area);
        area.setColumns(17);
        area.setLineWrap(true);
        area.setWrapStyleWord(false);
        f.setSize(125, 225);
        f.setLayout(null);
        f.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller c = new Controller(area, text);
            }
        });
    }

}
