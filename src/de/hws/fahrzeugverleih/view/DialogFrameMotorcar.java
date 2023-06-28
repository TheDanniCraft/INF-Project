package de.hws.fahrzeugverleih.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class DialogFrameMotorcar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nextFzCheck;
	private JTextField km;
	private JTextField hersteller;
	private JTextField FzType;
	private JTextField kennzeichen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogFrameMotorcar dialog = new DialogFrameMotorcar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogFrameMotorcar() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[30%][70%]", "[38px][37px][38px][37px][38px]"));
		{
			JTextPane txtpnKennzeichen = new JTextPane();
			txtpnKennzeichen.setText("Kennzeichen");
			txtpnKennzeichen.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(txtpnKennzeichen, "cell 0 0,alignx right,aligny center");
		}
		{
			kennzeichen = new JTextField();
			kennzeichen.setColumns(10);
			contentPanel.add(kennzeichen, "cell 1 0,growx,aligny center");
		}
		{
			JTextPane txtpnFztyp = new JTextPane();
			txtpnFztyp.setText("Fz-Typ");
			txtpnFztyp.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(txtpnFztyp, "cell 0 1,alignx right,aligny center");
		}
		{
			FzType = new JTextField();
			FzType.setColumns(10);
			contentPanel.add(FzType, "cell 1 1,growx,aligny center");
		}
		{
			JTextPane txtpnHersteller = new JTextPane();
			txtpnHersteller.setText("Hersteller");
			txtpnHersteller.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(txtpnHersteller, "cell 0 2,alignx right,aligny center");
		}
		{
			hersteller = new JTextField();
			hersteller.setColumns(10);
			contentPanel.add(hersteller, "cell 1 2,growx,aligny center");
		}
		{
			JTextPane txtpnKmstand = new JTextPane();
			txtpnKmstand.setText("Km-Stand");
			txtpnKmstand.setBackground(Color.LIGHT_GRAY);
			contentPanel.add(txtpnKmstand, "cell 0 3,alignx right,aligny center");
		}
		{
			km = new JTextField();
			km.setColumns(10);
			contentPanel.add(km, "cell 1 3,growx,aligny center");
		}
		{
			JTextPane txtpnKennzeichen = new JTextPane();
			txtpnKennzeichen.setBackground(Color.LIGHT_GRAY);
			txtpnKennzeichen.setText("Nächster Fz-Check");
			contentPanel.add(txtpnKennzeichen, "cell 0 4,alignx right,aligny center");
		}
		{
			nextFzCheck = new JTextField();
			contentPanel.add(nextFzCheck, "cell 1 4,growx,aligny center");
			nextFzCheck.setColumns(10);
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
