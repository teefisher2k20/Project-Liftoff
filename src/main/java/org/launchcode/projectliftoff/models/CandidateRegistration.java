package org.launchcode.projectliftoff.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class CandidateRegistration {

    @Id
    @GeneratedValue
    private int id;
    private static int nextId = 1;
    private String dateOfBirth;

    @NotBlank(message = "User name is required.")
    @Size(min = 5, max = 15, message = "name must be between 3 and 15 characters")
    private String userName;

    @NotBlank(message = "First name is required.")
    @Size(min = 3, max = 15, message = "first name must be between 3 and 15 characters")
    private String firstName;

    @NotBlank(message = "Last name is required.")
    @Size(min = 3, max = 15, message = "first name must be between 3 and 15 characters")
    private String lastName;


    public CandidateRegistration(String dateOfBirth, String userName, String firstName, String lastName) {
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = nextId;
        nextId++;
    }

    public CandidateRegistration() {
    }



    public int getId() {
        return id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    @Override
    public String toString() {
        return "CandidateRegistration{" +
                "id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandidateRegistration)) return false;
        CandidateRegistration that = (CandidateRegistration) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
