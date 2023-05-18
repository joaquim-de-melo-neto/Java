package gui;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	/**
	 * @param label1
	 * @param label2
	 * @param label3
	 * @throws HeadlessException
	 */
	public LabelFrame(){
		super("Testing Label");
		setLayout(new FlowLayout());
		label1 = new JLabel("label 01");
		label1.setToolTipText(getTitle());
		add(label1);
		
		Icon image = new ImageIcon("foto1.jpg");
		label2 = new JLabel("label 02",image,SwingConstants.CENTER);
		add(label2);
		
		label3 = new JLabel();
		label3.setText("label 03");
		label3.setIcon(image);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		add(label3);
	}
	
	
}
