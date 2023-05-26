package de.hws.fahrzeugverleih.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class Location implements Serializable {
	
	private long locid;
	private long fzid;
	private Timestamp timestamp;
	private double longitude;
	private double latitude;
	private String notice;

	public Location(long locid, long fzid, Timestamp tStamp, String notice) {
		this.locid = locid;
		this.fzid = fzid;
		this.timestamp = tStamp;
		this.notice = notice;
	}
	public long getLocId() {
		return locid;
	}
	public long getFzId() {
		return fzid;
	}
	public double getLongitude() {
		return longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(double longitude) {
		
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp tStamp) {
		
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		
	}
	public String toString() {
		return null;
	}

}
