package JLabelDemo;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JFrame;

import static javax.swing.JFrame.*;
import javax.swing.JLabel;

public class JLabelDemo {

	public static void main(String[] args) {
		JLabel up = new JLabel("Cima");
		Icon image1 = new ImageIcon("foto1.jpg");
		JLabel center = new JLabel(image1);
		
		JLabel down = new JLabel(image1,SwingConstants.CENTER);
		down.setText("Texto e Imagem");
		JFrame frame = new JFrame();
		
		frame.add(up,BorderLayout.NORTH);
		frame.add(center,BorderLayout.CENTER);
		frame.add(down,BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

}
