import java.awt.Dimension;
import java.awt.Shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyCanvas extends JPanel {

	private ArrayList<Shape> things2Draw;

	public MyCanvas() {
		setPreferredSize(new Dimension(500, 300));

		things2Draw = new ArrayList<>();
		things2Draw.add(new Rectangle2D.Double(10, 10 , 50, 50));
		things2Draw.add(new Rectangle2D.Double(20, 20 , 70, 50));
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		for (Shape s: things2Draw) {
			g2.setColor(Color.RED);
			g2.draw(s);
		}
	}

	public ArrayList<Shape> getShapes() {
		return things2Draw;
	}
	
}