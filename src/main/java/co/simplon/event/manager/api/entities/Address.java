package co.simplon.event.manager.api.entities;

import java.util.UUID;

public class Address {

	private UUID id;
	private String road;
	private int zipcode;
	private String town;
	
	public Address() {
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getRoad() {
		return this.road;
	}
	
	public void setRoad(String road) {
		this.road = road;
	}
	
	public int getZipcode() {
		return this.zipcode;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getTown() {
		return this.town;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
}
