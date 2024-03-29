import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This program implements an animation that moves a car shape.
 */
public class AnimationTester {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		MoveableShape shape = new CarShape(0, 0, CAR_WIDTH);
		ShapeIcon icon = new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT);
		JLabel label = new JLabel(icon);
		frame.setLayout(new FlowLayout());
		frame.add(label);

		MoveableShape shape2 = new CarShape(0, 0, CAR_WIDTH);
		ShapeIcon icon2 = new ShapeIcon(shape2, ICON_WIDTH, ICON_HEIGHT);
		JLabel label2 = new JLabel(icon2);
		frame.setLayout(new FlowLayout());
		frame.add(label2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		final int DELAY = 100;
		// Milliseconds between timer ticks
		Timer t = new Timer(DELAY, event -> {
			shape.move();
			label.repaint();
		});
		t.start();

		final int DELAY2 = 100;
		// Milliseconds between timer ticks
		Timer t2 = new Timer(DELAY2, event -> {
			shape2.move();
			label2.repaint();
		});
		t2.start();
	}

	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
