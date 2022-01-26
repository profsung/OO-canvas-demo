import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.geom.Rectangle2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindow extends JFrame {

	private JButton rightButton;
	private MyCanvas canvas;

	public void init() {

		setLocation(200, 100);

		Container cp = getContentPane();

		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);
		rightButton = new JButton("Right");
		southPanel.add(rightButton);

		canvas = new MyCanvas();
		cp.add(BorderLayout.CENTER, canvas);

		RightMoveEvent r = new RightMoveEvent();
		rightButton.addActionListener(r);

		// rightButton.addActionListener(event -> {
		// 	for (Shape s: canvas.getShapes()) {
		// 		Rectangle2D r = (Rectangle2D) s;
		// 		r.setRect(r.getX() + 5, r.getY(), r.getWidth(), r.getHeight());
		// 	}
		// 	canvas.repaint();
		// });

	}

	class RightMoveEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			for (Shape s: canvas.getShapes()) {
				Rectangle2D r = (Rectangle2D) s;
				r.setRect(r.getX() + 20, r.getY(), r.getWidth(), r.getHeight());
			}
			canvas.repaint();	
		}

	}

}