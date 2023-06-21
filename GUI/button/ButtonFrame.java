package button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
	
	private JButton plainButton;
	private JButton fancyButton;
	
	public ButtonFrame(){
		super("Testando Botões");
		setLayout(new FlowLayout());
		
		plainButton = new JButton("Plain Button");
		add(plainButton);
		
		Icon image1 = new ImageIcon(getClass().getResource("a.jpg"));
		Icon image2 = new ImageIcon(getClass().getResource("foto2.jpg"));
		fancyButton = new JButton(image1);
		fancyButton.setRolloverIcon(image2);
		add(fancyButton);
		
		ButtonFrameHandler handler = new ButtonFrameHandler();
		plainButton.addActionListener(handler);
		fancyButton.addActionListener(handler);
	}
		
		private class ButtonFrameHandler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ButtonFrame.this,String.format("Você apertou: %s",e.getActionCommand()));
				
			}
			
		}
		
		

}
