package co.simplon.event.manager.api.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateAddress {
	
	private UUID id;
	private String road;
	private int zipcode;
	private String town;
	
	public CreateAddress() {
	}
	
	public CreateAddress(UUID id, String road, int zipcode, String town) {
		this.id = id;
		this.road = road;
		this.zipcode = zipcode;
		this.town = town;
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

    @NotNull
    @Size(max=150)
    public void setRoad(String road) {
        this.road = road;
    }

    public int getZipcode() {
        return this.zipcode;
    }

    @NotNull
    @Size(max=5)
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getTown() {
        return this.town;
    }

    @NotNull
    @Size(max=100)
    public void setTown(String town) {
        this.town = town;
    }
}
