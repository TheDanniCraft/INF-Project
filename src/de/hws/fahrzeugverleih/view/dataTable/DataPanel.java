package de.hws.fahrzeugverleih.view.dataTable;

import javax.swing.JPanel; 
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Dimension;

public class DataPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public DataPanel() {
		setSize(new Dimension(270, 560));
		setPreferredSize(new Dimension(270, 560));
		setLayout(new GridLayout(7, 3, 0, 0));
	}

}
