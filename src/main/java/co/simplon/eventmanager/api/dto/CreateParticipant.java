package co.simplon.eventmanager.api.dto;

import java.time.LocalDateTime;

public class CreateParticipant {

    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;

    public CreateParticipant() {
	// TODO Auto-generated constructor stub
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public LocalDateTime getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
	this.birthDate = birthDate;
    }

}
