package de.hws.fahrzeugverleih.app;

import com.google.gson.*;
import de.hws.fahrzeugverleih.data.Customer;
import de.hws.fahrzeugverleih.data.Location;
import de.hws.fahrzeugverleih.data.Motorcar;
import de.hws.fahrzeugverleih.view.ViewManager;

import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
		} catch (IOException ex) {
			ViewManager.getInstance().showMessage(ex.getLocalizedMessage());
		}
	}
	private void readCarsFromFile(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			allCars = (ArrayList<Motorcar>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
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
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
			gson.toJson(allCars, new FileWriter(filePath));
		} catch (JsonIOException | IOException e) {
			e.printStackTrace();
		}
	}
	private List<Motorcar> importCarsFromFile(String filePath) {
		allCars = new ArrayList<Motorcar>();
		try {
			String resJSon = "";
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
			int data = reader.read();
			while (data != -1) {
				resJSon += (char) data;
				data = reader.read();
			}
			reader.close();
			JsonParser parser = new JsonParser();
			JsonElement tree = parser.parse(resJSon);
			JsonObject dataSet = tree.getAsJsonObject();
			JsonElement elem = dataSet.get("cars");
			if (elem.isJsonArray()) {
				JsonArray datArr = elem.getAsJsonArray();
				for (int i = 0; i < datArr.size(); i++) {
					JsonObject obj = datArr.get(i).getAsJsonObject();
					Motorcar car = new Motorcar(obj.get("fzid").getAsLong(), obj.get("license").getAsString(), obj.get("name").getAsString(), obj.get("type").getAsString(), obj.get("km").getAsInt(), Timestamp.valueOf(obj.get("nextcheck").getAsString()));
					allCars.add(car);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return allCars;
	}
	private void writeCustomerToFile(String filePath) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(allCustomers);
			oos.close();
		} catch (IOException ex) {
			ViewManager.getInstance().showMessage(ex.getLocalizedMessage());
		}
	}
	private void readCustomerFromFile(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			allCars = (ArrayList<Motorcar>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void exportCustomersToFile(String filePath) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
			gson.toJson(allCustomers, new FileWriter(filePath));
		} catch (JsonIOException | IOException e) {
			e.printStackTrace();
		}

	}
	private List<Customer> importCustomersFromFile(String filePath) {
		allCustomers = new ArrayList<Customer>();
		try {
			String resJSon = "";
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
			int data = reader.read();
			while (data != -1) {
				resJSon += (char) data;
				data = reader.read();
			}
			reader.close();
			JsonParser parser = new JsonParser();
			JsonElement tree = parser.parse(resJSon);
			JsonObject dataSet = tree.getAsJsonObject();
			JsonElement elem = dataSet.get("customers");
			if (elem.isJsonArray()) {
				JsonArray datArr = elem.getAsJsonArray();
				for (int i = 0; i < datArr.size(); i++) {
					JsonObject obj = datArr.get(i).getAsJsonObject();
					Customer customer = new Customer(obj.get("id").getAsLong(), obj.get("name").getAsString(), obj.get("vorname").getAsString(), obj.get("adresse").getAsString());
					allCustomers.add(customer);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return allCustomers;
	}
	public void readData() {
		readCarsFromFile("./Cars");
		readCustomerFromFile("./Customers");
	}
	public void saveData() {
		writeCarsToFile("./Cars");
		writeCustomerToFile("./Customers");
	}
	public void importData() {
		importCarsFromFile("./CarsDump.json");
		importCustomersFromFile("./CustomersDump.json");
	}
	public void exportData() {
		exportCarsToFile("./CarsDump.json");
		exportCustomersToFile("./CustomersDump.json");
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
