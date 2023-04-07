package graphics;

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		DrawPanel panel = new DrawPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}

}
