package graphics;

import javax.swing.JFrame;

public class DrawFaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		DrawFace face = new DrawFace();
		
		frame.add(face);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,250);
		frame.setVisible(true);
		
	}

}
