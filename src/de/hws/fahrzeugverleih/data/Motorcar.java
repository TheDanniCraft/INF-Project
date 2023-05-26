package de.hws.fahrzeugverleih.data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Motorcar implements Serializable {
	
	private long fzid;
	private String license;
	private String name;
	private String type;
	private int km;
	private Timestamp nextCheck;
	private List<Location> locations;
	//private SwingWaypoint swPoint;

	public Motorcar(long fzid, String lic, String name, String type, int km, Timestamp nextCheck) {
		this.fzid = fzid;
		this.license = lic;
		this.name = name;
		this.type = type;
		this.km = km;
		this.nextCheck = nextCheck;
	}
	
	public long getFzid() {
		return fzid;
	}
	public String getLicense() {
		return license;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		
	}
	public int getKm() {
		return km;
	}
	public Timestamp getNextCheck() {
		return nextCheck;
	}
	public void setNextCheck(Timestamp nextCheck) {
		this.nextCheck = nextCheck;
	}
	public Location getLastPos() {
		if(locations != null && locations.size() > 0) {
			return locations.get(locations.size()-1);
		}
		return null;
	}
	public List<Location> getLocationList() {
		return locations;
	}
	public void addLocation(Location loc) {
		if(locations == null) {
			locations = new ArrayList<Location>();
		}
		
	}
	/*public SwingWaypoint getMyPoint() {
		return null;
	}
	public void setPyPoint(SwingWaypoint swp) {
		
	}*/
	public String toString() {
		return null;
	}
	public String[] getCarData() {
		return null;
	}
	public String[] getCarColumns() {
		return null;
	}

}
