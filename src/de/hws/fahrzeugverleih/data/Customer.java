package de.hws.fahrzeugverleih.data;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private long cid;
	private String name;
	private String surname;
	private String adress;

	public Customer(long cid, String name, String surname, String adress) {
		this.cid = cid;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
	}
	public long getCid() {
		return cid;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		
	}
	public String toString() {
		return null;
	}
	public String[] getCustomerData() {
		return null;
	}
	public String[] getCustomerColumns() {
		return null;
	}

}
