package de.hws.FahrzeugVerleih.view.dataTable;

import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.awt.event.ActionEvent;

public class NewItemCustomer {

	public JFrame frame;
	private JTextField textName;
	private JTextField textVorname;
	private JTextField textAdresse;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewItemCustomer window = new NewItemCustomer();
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
	public NewItemCustomer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("Bitte Kundendaten eingeben");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Name");
		frame.getContentPane().add(lblNewLabel, "cell 1 0");

		textName = new JTextField();
		frame.getContentPane().add(textName, "cell 3 0,growx");
		textName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Vorname");
		frame.getContentPane().add(lblNewLabel_1, "cell 1 1");

		textVorname = new JTextField();
		frame.getContentPane().add(textVorname, "cell 3 1,growx");
		textVorname.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Adresse");
		frame.getContentPane().add(lblNewLabel_2, "cell 1 2");

		textAdresse = new JTextField();
		frame.getContentPane().add(textAdresse, "cell 3 2,growx");
		textAdresse.setColumns(10);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textVorname.setText("");
				textAdresse.setText("");
			}
		});
		frame.getContentPane().add(btnNewButton, "cell 0 8 3 1,growx");

		btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton_1, "cell 3 8,grow");
	}

}
