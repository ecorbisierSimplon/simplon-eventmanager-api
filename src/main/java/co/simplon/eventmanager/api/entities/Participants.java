
package co.simplon.eventmanager.api.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Participants {

    private UUID id;
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;

    public Participants() {
	// TODO Auto-generated constructor stub
    }

    public UUID getId() {
	return id;
    }

    public void setId(UUID id) {
	this.id = id;
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
