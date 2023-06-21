package align;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;;

public class Align extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JCheckBox checkBoxSnap;
	private JCheckBox checkBoxGrid;
	private JLabel labelX;
	private JLabel labelY;
	private JTextField textFieldX;
	private JTextField textFieldY;
	private JButton buttonOk;
	private JButton buttonCancel;
	private JButton buttonHelp;

	public Align() {
		super("Align");
		setLayout(new BorderLayout(20,20));
		
		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(2,1,1,1));
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(2,4,1,1));
		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(3,1,1,1));
		
		checkBoxGrid = new JCheckBox("Snap to Grid");
		checkBoxSnap = new JCheckBox("Grid to Snap");
		westPanel.add(checkBoxGrid);
		westPanel.add(checkBoxSnap);
		add(westPanel,BorderLayout.WEST);

		labelX = new JLabel("X");
		labelY = new JLabel("Y");
		textFieldX = new JTextField();
		textFieldY = new JTextField();
		centerPanel.add(labelX);
		centerPanel.add(textFieldX);
		centerPanel.add(labelY);
		centerPanel.add(textFieldY);
		add(centerPanel,BorderLayout.CENTER);

		buttonOk = new JButton("ok");
		buttonCancel = new JButton("cancel");
		buttonHelp = new JButton("help");
		eastPanel.add(buttonOk);
		eastPanel.add(buttonCancel);
		eastPanel.add(buttonHelp);
		add(eastPanel,BorderLayout.EAST);

	}
}
