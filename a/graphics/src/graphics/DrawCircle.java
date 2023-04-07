package graphics;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawCircle extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x=190, y=190;
		for(int i=1;i<12;++i) {
			
		g.drawOval(x-i*10, y-i*10, i*20, i*20);
		
		}
	}

}
