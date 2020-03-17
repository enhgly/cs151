import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.*;

public class ActionTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		final int FIELD_WIDTH = 20;
		JTextField textField = new JTextField(FIELD_WIDTH);
		textField.setText("Click a button!");
		AtomicInteger count = new AtomicInteger();
		AtomicInteger count2 = new AtomicInteger();

		JButton helloButton = new JButton("Say Hello");
		helloButton.addActionListener(event -> textField.setText("Hello " + count));

		JButton goodbyeButton = new JButton("Say Goodbye");
		goodbyeButton.addActionListener(event -> textField.setText("Goodbye " + count2));
		
		goodbyeButton.setEnabled(false);
		
		helloButton.addActionListener(actionEvent -> {
			helloButton.setEnabled(false);
			goodbyeButton.setEnabled(true);
			count.getAndIncrement();
		});

		goodbyeButton.addActionListener(actionEvent -> {
			goodbyeButton.setEnabled(false);
			helloButton.setEnabled(true);
			count2.getAndIncrement();
		});

		frame.setLayout(new FlowLayout());

		frame.add(helloButton);
		frame.add(goodbyeButton);
		frame.add(textField);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}
}
