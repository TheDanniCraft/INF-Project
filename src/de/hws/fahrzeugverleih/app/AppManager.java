package de.hws.fahrzeugverleih.app;

import java.awt.JobAttributes.DialogType;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import de.hws.fahrzeugverleih.data.Customer;
import de.hws.fahrzeugverleih.data.Location;
import de.hws.fahrzeugverleih.data.Motorcar;

public class AppManager {

	private static AppManager instance;
	private List<Motorcar> allCars = new ArrayList<Motorcar>();
	private List<Customer> allCustomers = new ArrayList<Customer>();

	private AppManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static AppManager getInstance() {
		if(instance == null) {
			instance = new AppManager();
		}
		return instance;
	}
	public long createId() {
		return 0;
	}
	public void createMotorcar(String license, String name, String type, int km, Timestamp nextCheck, Location loc) {
		
	}
	public void deleteCar(String license) {
		
	}
	private void writeCarsToFile(String filepath, List<Motorcar> car) {
		
	}
	private List<Motorcar> readCarsFromFile(String filepath) {
		return null;
	}
	private void exportCarsToFile(String filePath) {
		
	}
	private List<Motorcar> importCarsFromFile(String filePath) {
		return null;
	}
	private void writeCustomerToFile(String filepath, List<Customer> cars) {
		
	}
	private List<Customer> readCustomerFromFile(String filepath) {
		return null;
	}
	private void exportCustomersToFile(String filePath) {
		
	}
	private List<Customer> importCustomersToFile(String filePath) {
		return null;
	}
	public void readData() {
		
	}
	public void saveData() {
		
	}
	public void importData() {
		
	}
	public void exportData() {
		
	}
	public List<Motorcar> getCars() {
		return null;
	}
	public Motorcar getSpecificCar(long id) {
	return null;	
	}
	public void resetSelections() {
		
	}
	public void createCustomer(String name, String surname, String adress) {
		
	}
	public void deleteCustomer(int cid) {
		
	}
	public List<Customer> getCustomer() {
		return null;
	}
	public Customer getSpecificCustomer(long id) {
		return null;
	}

}
