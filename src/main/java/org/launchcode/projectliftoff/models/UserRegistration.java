package org.launchcode.projectliftoff.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class UserRegistration {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "user DOB is required")
    private String dateOfBirth;

    @NotBlank(message = "User name is required.")
    @Size(min = 5, max = 15, message = "name must be between 3 and 15 characters")
    private String userName;

    @NotBlank(message = "First name is required.")
    @Size(min = 3, max = 15, message = "first name must be between 3 and 15 characters")
    private String firstName;

    @NotBlank(message = "Last name is required.")
    @Size(min = 3, max = 15, message = "last name must be between 3 and 15 characters")
    private String lastName;

    @NotBlank(message = "address is required.")
    @Size(min = 5, max = 30, message = "address must be between 5 and 30 characters")
    private String address;

    @NotBlank(message = "City is required.")
    @Size(min = 2, max = 20, message = "city must be between 5 and 30 characters")
    private String city;

    @NotBlank(message = "state is required.")
    @Size(max = 2, message = "State must be 2 characters")
    private String state;

    @NotBlank(message = "Zip code required.")
    @PositiveOrZero
    private int zipCode;

    @PositiveOrZero
    private int phone;

    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @ManyToOne
    private UserRegistration userRegistration;

    public UserRegistration(String dateOfBirth, String userName, String firstName, String lastName, String address, String city, String state, int zipCode, int phone, String contactEmail, UserRegistration userRegistration) {
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.contactEmail = contactEmail;
        this.userRegistration = userRegistration;

    }
    public UserRegistration() {}

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

    public UserRegistration getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "id=" + id +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", phone=" + phone +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRegistration)) return false;
        UserRegistration that = (UserRegistration) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
