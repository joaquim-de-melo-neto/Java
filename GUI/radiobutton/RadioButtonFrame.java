package radiobutton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
	private JTextField textField; 
	private Font plainFont;
	private Font boldFont; 
	private Font italicFont; 
	private Font boldItalicFont; 
	private JRadioButton plainRadioButton; 
	private JRadioButton boldRadioButton;
	private JRadioButton italicRadioButton;
	private JRadioButton boldItalicRadioButton;
	private ButtonGroup radioGroup;
	
	public RadioButtonFrame() {
		super("Teste de radiobutton");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Teste de texto",25);
		add(textField);
		
		plainRadioButton = new JRadioButton("Plain",true);
		boldRadioButton = new JRadioButton("Bold",false);
		italicRadioButton = new JRadioButton("Italic",false);
		boldItalicRadioButton = new JRadioButton("Bold/Italic",false);
		add(plainRadioButton);
		add(boldRadioButton);
		add(italicRadioButton);
		add(boldItalicRadioButton);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(plainRadioButton);
		radioGroup.add(boldRadioButton);
		radioGroup.add(italicRadioButton);
		radioGroup.add(boldItalicRadioButton);
		
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		
		plainRadioButton.addItemListener(new RadioButtonListener(plainFont));
		boldRadioButton.addItemListener(new RadioButtonListener(boldFont));
		italicRadioButton.addItemListener(new RadioButtonListener(italicFont));
		boldItalicRadioButton.addItemListener(new RadioButtonListener(boldItalicFont));
	}
	
	private class RadioButtonListener implements ItemListener{
		private Font font;
		public RadioButtonListener(Font f) {
			font = f;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			textField.setFont(font);
		}
		
	}
	
}
