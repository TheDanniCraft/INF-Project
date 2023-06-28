package de.hws.fahrzeugverleih.view.dataTable;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewItemCar {

	private int type;

	public JFrame frame;
	private JTextField textLic;
	private JTextField textBez;
	private JTextField textTyp;
	private JTextField textKm;
	private JTextField textChk;

	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewItemCar window = new NewItemCar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewItemCar() {
		initialize();

	}

	private void createLayoutCustomer() {

	}

	private void createLayoutCar() {

	}

	private boolean checkText(String text) {
		return false;

	}

	private boolean checkNumbers(String text) {
		return false;

	}

	private boolean checkTextAndNumbers(String text) {
		return false;

	}

	private void submitCustomerData() {

	}

	private void submitCarData() {

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Bitte Fahrtzeugdaten eingeben");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Kennzeichen");
		frame.getContentPane().add(lblNewLabel, "cell 1 0");

		textLic = new JTextField();
		frame.getContentPane().add(textLic, "cell 3 0,growx");
		textLic.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Fz-Typ");
		frame.getContentPane().add(lblNewLabel_1, "cell 1 1");

		textTyp = new JTextField();
		frame.getContentPane().add(textTyp, "cell 3 1,growx");
		textTyp.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Hersteller");
		frame.getContentPane().add(lblNewLabel_2, "cell 1 2");

		textBez = new JTextField();
		frame.getContentPane().add(textBez, "cell 3 2,growx");
		textBez.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Km-Stand");
		frame.getContentPane().add(lblNewLabel_3, "cell 1 3");

		textKm = new JTextField();
		frame.getContentPane().add(textKm, "cell 3 3,growx");
		textKm.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("N�chster Fz-Check");
		frame.getContentPane().add(lblNewLabel_4, "cell 1 4");

		textChk = new JTextField();
		frame.getContentPane().add(textChk, "cell 3 4,growx");
		textChk.setColumns(10);

		btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textLic.setText("");
				textTyp.setText("");
				textBez.setText("");
				textKm.setText("");
				textChk.setText("");

			}
		});
		frame.getContentPane().add(btnNewButton, "cell 0 8 3 1,growx");

		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton_1, "cell 3 8,growx");

	}

}
