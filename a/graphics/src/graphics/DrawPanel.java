package graphics;

import java.awt.Color;
import java.security.SecureRandom;
import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
	private SecureRandom random = new SecureRandom();
	private MyLine[] lines;
	
	public DrawPanel() {
		
		setBackground(Color.WHITE);
		
		lines = new MyLine[5 + random.nextInt(5)];
		
		for(int count=0; count<lines.length;++count) {
			int x1 = random.nextInt(300);
			int y1 = random.nextInt(300);
			int x2 = random.nextInt(300);
			int y2 = random.nextInt(300);
			Color color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)); 
			
			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(MyLine line: lines) {
			line.draw(g);
		}
	}

	
}
