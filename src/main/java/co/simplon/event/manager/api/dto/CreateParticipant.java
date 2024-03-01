package co.simplon.event.manager.api.dto;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class CreateParticipant {
	private UUID id;
	private String firstname;
	private String lastname;
	private LocalDate birthdate;
	
	public CreateParticipant() {
	}
	
	public CreateParticipant(UUID id, String firstname, String lastname, LocalDate birthdate) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
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

    @NotNull
    @Size(max=150)
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return this.lastname;
    }

    @NotNull
    @Size(max=150)
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    @NotNull
    @Past
    public void setBirthDate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
