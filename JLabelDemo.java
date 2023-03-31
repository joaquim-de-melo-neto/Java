package gui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import static javax.swing.JFrame.*;
import javax.swing.JLabel;

public class JLabelDemo {

	public static void main(String[] args) {
		JLabel up = new JLabel("Cima");
		ImageIcon image1 = new ImageIcon("foto1.jpg");
		JLabel center = new JLabel(image1);
		ImageIcon image2 = new ImageIcon("foto1.jpg");
		JLabel down = new JLabel(image2);
		down.setText("Texto e Imagem");
		JFrame frame = new JFrame();
		
		frame.add(up,BorderLayout.NORTH);
		frame.add(center,BorderLayout.CENTER);
		frame.add(down,BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(2000, 2000);
		frame.setVisible(true);

	}

}
