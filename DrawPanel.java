import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	public void paintComponent(Graphics g){
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);

		int width = getWidth(); // largura total
		int heigth = getHeight(); // altura total
		
		// desenhas as linhas 
		g.drawLine(0,0,width,heigth);
		g.drawLine(0,heigth,width,0);
	}
}

import javax.swing.JFrame;

public class DrawPanelTest{
	public static void main(String[] args){
		
		// cria um frame que vai receber nosso painel com desenho desenho
		JFrame aplication = new JFrame();
		
		// cria um painel com o desenho
		DrawPanel panel = new DrawPanel();
		
		// configura o frame para ser encerrado quando fechado
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		aplication.add(panel);
		aplication.setSize(250,250);
		aplication.setVisible(true);
	}
}
