package de.hws.fahrzeugverleih.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import net.miginfocom.swing.MigLayout;

public class DialogFrameCustomer extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField name;
	private JTextField adress;
	private JTextField forename;
	
	public DialogFrameCustomer() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[30%][70%,grow]", "[34%,center][33%,center][33%,center]"));
		{
			JTextPane Name = new JTextPane();
			Name.setText("Name");
			Name.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(Name, "cell 0 0,alignx right,aligny center");
		}

		{
			name = new JTextField();
			contentPanel.add(name, "cell 1 0,growx");
			name.setColumns(10);
		}
		{
			JTextPane txtpnFztyp = new JTextPane();
			txtpnFztyp.setText("vorname");
			txtpnFztyp.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(txtpnFztyp, "cell 0 1,alignx right,aligny center");
		}
	
		{
			forename = new JTextField();
			forename.setColumns(10);
			contentPanel.add(forename, "cell 1 1,growx");
		}
		{
			JTextPane txtpnHersteller = new JTextPane();
			txtpnHersteller.setText("Adresse");
			txtpnHersteller.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(txtpnHersteller, "cell 0 2,alignx right,aligny center");
		}
		{
			adress = new JTextField();
			adress.setColumns(10);
			contentPanel.add(adress, "cell 1 2,growx,aligny center");
		}

		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new MigLayout("", "[182.00px:50%][50%]", "[23px]"));
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton, "cell 0 0,growx,aligny top");
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton, "cell 1 0,growx,aligny top");
			}
		}
	}

}