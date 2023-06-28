package de.hws.FahrzeugVerleih.view.dataTable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import de.hws.FahrzeugVerleih.view.DialogFrameCustomer;

public class PopupMenueListener extends MouseAdapter {

	private int type;

	public PopupMenueListener(int t) {
		type = t;

	}

	private class PopUpNewDialog extends JPopupMenu {
		JMenuItem anItem;

		public PopUpNewDialog() {
			anItem = new JMenuItem("+ Insert a new Item");
			anItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					try {
						DialogFrameCustomer customer_dialog = new DialogFrameCustomer();
						customer_dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						customer_dialog.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			add(anItem);
		}
	}

	public void mousePressed(MouseEvent e) {
		if (SwingUtilities.isRightMouseButton(e) == true) {
			PopUpNewDialog menu = new PopUpNewDialog();
			menu.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (e.isPopupTrigger()) {
			PopUpNewDialog menu = new PopUpNewDialog();
			menu.show(e.getComponent(), e.getX(), e.getY());
		}
	}

}
