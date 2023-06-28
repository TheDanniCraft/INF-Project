package de.hws.fahrzeugverleih.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import de.hws.fahrzeugverleih.view.*;
import de.hws.fahrzeugverleih.view.mapView.*;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import de.hws.fahrzeugverleih.view.dataTable.NewItemCar;
import de.hws.fahrzeugverleih.view.dataTable.NewItemCustomer;

public class Fahrzeugverleih<NewItemFahrzeug> {

	private JFrame frmFahrzeugverleih;

	private MapPanel mapPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Runnable start = () -> {
			try {
				Fahrzeugverleih window = new Fahrzeugverleih();
				window.frmFahrzeugverleih.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		EventQueue.invokeLater(start);

	}

	/**
	 * Create the application.
	 *
	 * @wbp.parser.entryPoint
	 */
	public Fahrzeugverleih() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmFahrzeugverleih = new JFrame();
		frmFahrzeugverleih.setFont(new Font("Verdana", Font.BOLD, 14));
		frmFahrzeugverleih.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frmFahrzeugverleih.setTitle("Autovermietung (HWS Project)");
		frmFahrzeugverleih.setBounds(100, 100, 1050, 600);
		frmFahrzeugverleih.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				 | UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		BufferedImage image = null;
		try {
			image = ImageIO.read(this.getClass().getResource("/hws.png"));
			Image tmp = image.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			BufferedImage dimg = new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB);

			Graphics2D g2d = dimg.createGraphics();
			g2d.drawImage(tmp, 0, 0, null);
			g2d.dispose();

			frmFahrzeugverleih.setIconImage(dimg);

			ViewManager.getInstance().setRootPane(frmFahrzeugverleih.getContentPane());

			JMenuBar menuBar = new JMenuBar();
			menuBar.setFont(new Font("Verdana", Font.BOLD, 14));

			JMenu mnFile = new JMenu("File");
			mnFile.setFont(new Font("Verdana", Font.BOLD, 14));
			mnFile.setPreferredSize(new Dimension(80, 24));
			menuBar.add(mnFile);

			JMenuItem mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(e -> System.exit(0));
			mntmExit.setFont(new Font("Verdana", Font.BOLD, 14));
			mnFile.add(mntmExit);

			JMenuItem mntmOpen = new JMenuItem("Open");
			mntmOpen.setFont(new Font("Verdana", Font.BOLD, 14));
			mnFile.add(mntmOpen);

			JMenuItem mntmSave = new JMenuItem("Save");
			mntmSave.setFont(new Font("Verdana", Font.BOLD, 14));
			mnFile.add(mntmSave);

			JMenu mnEdit = new JMenu("Edit");
			mnEdit.setFont(new Font("Verdana", Font.BOLD, 14));
			mnEdit.setPreferredSize(new Dimension(80, 24));
			menuBar.add(mnEdit);

			JSplitPane splitPane = new JSplitPane();
			splitPane.setResizeWeight(0.5);
			frmFahrzeugverleih.getContentPane().add(splitPane, BorderLayout.CENTER);

			mapPanel = new MapPanel();
			splitPane.setLeftComponent(mapPanel);

			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBackground(Color.GRAY);
			splitPane.setRightComponent(tabbedPane);

			ViewManager.getInstance().setPanel(mapPanel, tabbedPane);

			JMenuItem mntmDelete = new JMenuItem("Delete");
			mntmDelete.setFont(new Font("Verdana", Font.BOLD, 14));
			mnEdit.add(mntmDelete);

			JMenu mnAbout = new JMenu("?");
			mnAbout.setFont(new Font("Verdana", Font.BOLD, 14));
			mnAbout.setPreferredSize(new Dimension(80, 24));
			menuBar.add(mnAbout);

			JMenuItem mntmAbout = new JMenuItem("About");
			mntmAbout.setFont(new Font("Verdana", Font.BOLD, 14));
			mnAbout.add(mntmAbout);

			mapPanel = new MapPanel();
			splitPane.setLeftComponent(mapPanel);

			GroupLayout groupLayout = new GroupLayout(frmFahrzeugverleih.getContentPane());
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
					.createSequentialGroup().addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 1020, GroupLayout.PREFERRED_SIZE)
							.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, 1020, GroupLayout.PREFERRED_SIZE))));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup().addGap(7)
							.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, 517, GroupLayout.PREFERRED_SIZE)));
			frmFahrzeugverleih.getContentPane().setLayout(groupLayout);

			JButton btnKundenfahrzeug = new JButton("Kundendaten");
			btnKundenfahrzeug.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					NewItemCustomer kunden = new NewItemCustomer();
					kunden.frame.setVisible(true);

				}
			});
			tabbedPane.addTab("Customer", null, btnKundenfahrzeug, null);

			JButton btnNewButton = new JButton("Fahrzeugdaten");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					NewItemCar fahrzeug = new NewItemCar();
					fahrzeug.frame.setVisible(true);

				}
			});
			tabbedPane.addTab("Car", null, btnNewButton, null);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
