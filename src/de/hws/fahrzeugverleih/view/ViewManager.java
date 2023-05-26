package de.hws.fahrzeugverleih.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.security.Timestamp;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import de.hws.fahrzeugverleih.app.AppManager;
import de.hws.fahrzeugverleih.data.Customer;
import de.hws.fahrzeugverleih.data.Motorcar;
import de.hws.fahrzeugverleih.view.mapView.MapPanel;

public class ViewManager {
	
	public static final int CAR = 1;
	public static final int CUSTOMER = 2;
	private static ViewManager instance;
	private Container rootPane;
	private MapPanel mapPanel;
	private JTabbedPane dataTabs;
	//private DataPanel carPanel;
	//private DataPanel customerPanel;
	private JPanel JPanelCars;
	private JPanel JPanelCustomers;
	private JTable tableCars;
	private JTable tableCust;

	public ViewManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static ViewManager getInstance() {
		if(instance == null) {
			instance = new ViewManager();
		}
		return instance;
	}
	public void setRootPane(Container root) {
		
	}
	public void setPanel(MapPanel map, JTabbedPane dataTabs) {
		
	}
	public void showStatusOverview() {
		
	}
	public void createMotorcar(String license, String name, String type, int km, Timestamp nextCheck) {
		
	}
	public void updateCarDataPanel(List<Motorcar> cars) {
		
	}
	public void updateMap() {
		
	}
	public void selectCarFromMap(String id) {
		
	}
	public void selectCar(String id) {
		
	}
	public void selectCustomer(String name, String vorname, String adresse) {
		
	}
	public void createCustomer(String name, String vorname, String adresse) {
		
	}
	public void updateCustomerDataPanel(List<Customer> customer) {
		
	}

}
