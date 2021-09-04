import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		MyWindow win = new MyWindow();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.init();

		win.pack();
		win.setVisible(true);
	}
}