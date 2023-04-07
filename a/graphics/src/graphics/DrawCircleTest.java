package graphics;

import javax.swing.JFrame;

public class DrawCircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawCircle panel = new DrawCircle();
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.add(panel);
		frame.setVisible(true);

	}

}
