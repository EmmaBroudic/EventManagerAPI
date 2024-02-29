package co.simplon.event.manager.api.entities;

import java.util.UUID;
import java.time.LocalDate;

public class Participant {
	
	private UUID id;
	private String firstname;
	private String lastname;
	private LocalDate birthdate;
	
	public Participant() {
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public LocalDate getBirthdate() {
		return this.birthdate;
	}
	
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
}
