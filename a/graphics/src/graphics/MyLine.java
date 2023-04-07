package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyLine extends JPanel {
	
	private Color color;
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public MyLine(int x1, int x2, int y1, int y2, Color color) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
}
