package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawFace extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// desenhar rosto
		g.setColor(Color.YELLOW);
		g.fillOval(10,10, 200, 200);
		
	}
}
