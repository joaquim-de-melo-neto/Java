package multiple_selection;

import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
	private final JList<String> colorJList; 
	private final JList<String> copyJList;
	private JButton  copyJButton;
	private static final String[] colorNames = 
		{"Black", "Blue", "Cyan","Dark Gray", "Gray"};
	
	
	public MultipleSelectionFrame() {
		super("Multipla seleção");
		setLayout(new FlowLayout());
		
		colorJList = new JList<String>(colorNames);
		colorJList.setVisibleRowCount(3);
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));
		
		copyJButton = new JButton("Copy>>");
		copyJButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						copyJList.setListData(
								colorJList.getSelectedValuesList().toArray(new String[1]));
					}
				}
				);
		add(copyJButton);
		
		copyJList = new JList<String>();
		copyJList.setVisibleRowCount(5);
		copyJList.setFixedCellWidth(100);
		copyJList.setFixedCellHeight(15);
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList));
		
	}
}
