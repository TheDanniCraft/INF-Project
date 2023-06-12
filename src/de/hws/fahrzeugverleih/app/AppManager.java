package de.hws.fahrzeugverleih.app;

import java.awt.JobAttributes.DialogType;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.hws.fahrzeugverleih.data.Customer;
import de.hws.fahrzeugverleih.data.Location;
import de.hws.fahrzeugverleih.data.Motorcar;
import de.hws.fahrzeugverleih.view.ViewManager;

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
	private void writeCarsToFile(String filePath) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(allCars);
			oos.close();
		} 
		catch (IOException e) {
			ViewManager.getInstance().showMessage(e.getLocalizedMessage());
		}
	}
	private void readCarsFromFile(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			allCars = (ArrayList<Motorcar>) ois.readObject();
		} 
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void writeDataToFile() {
		try {
		FileOutputStream fos = new FileOutputStream("cars.json");
		DataOutputStream dos = new DataOutputStream(fos);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(allCars);
		dos.writeUTF(json);
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	private void readDataFromFile() {
		try {
		FileInputStream fis = new FileInputStream("cars.json");
		DataInputStream dis = new DataInputStream(fis);
		String json = dis.readUTF();
		Gson gson = new Gson();
		allCars = gson.fromJson(json, ArrayList.class);
		} catch (IOException e) { e.printStackTrace(); }
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
