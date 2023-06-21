package jComboBox;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
	private JComboBox<String> imagesJComboBox;
	private JLabel label;
	
	private  final String[] names = {
		"a.jpg","foto2.jpg"
	};
	private Icon[] icons = {
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1]))
	};
	
	public ComboBoxFrame() {
		super("Teste de ComboBox");
		setLayout(new FlowLayout());
		
		imagesJComboBox = new JComboBox<>(names);
		imagesJComboBox.setMaximumRowCount(2);
		
		add(imagesJComboBox);
		label = new JLabel(icons[0]);
		add(label);
		
		imagesJComboBox.addItemListener( 
				new ItemListener() {
					@Override
					public void itemStateChanged(ItemEvent e) {
						if(e.getStateChange()==ItemEvent.SELECTED) {
							label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
						}
					}
				});
	}
}
