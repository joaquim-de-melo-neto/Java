package textfield;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField1;
	private JTextField textField2;
	private  JTextField textField3;
	private  JPasswordField passwordField;
	
	public TextFieldFrame() {
		super("Testando textos");
		setLayout(new FlowLayout());
		
		textField1 = new JTextField(10);
		add(textField1);
		
		textField2 = new JTextField("texto inserido na inicialização");
		add(textField2);
		
		textField3 = new JTextField("texto não editavel");
		textField3.setEditable(false);
		add(textField3);
		
		passwordField = new JPasswordField("Texto escondido");
		add(passwordField);
		
		TextHandler handler = new TextHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
		
		private class TextHandler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				String string = "";
				
				if(e.getSource() == textField1) {
					string = String.format("TextField1: %s", e.getActionCommand()); 
				}
				else if(e.getSource()==textField2) {
					string = String.format("TextField2: %s",e.getActionCommand());
				}
				else if(e.getSource() == textField3) {
					string = String.format("TextField3: %s",e.getActionCommand());
				}
				else if(e.getSource() == passwordField) {
					string = String.format("passwordField: %s",e.getActionCommand());
				}
				
				JOptionPane.showMessageDialog(null,string);
				
			}
			
		
	}

}
