package org.launchcode.projectliftoff.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.util.Objects;

public class UserRegistration {

    private int id;
    private static int nextId = 1;
    private int dateOfBirth;

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
    private int zip;

    @PositiveOrZero
    private int phone;

    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    public UserRegistration(int dateOfBirth, String userName, String firstName,
                            String lastName, String address, String city, String state, int zip,
                            int phone, String contactEmail) {
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.contactEmail = contactEmail;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return contactEmail;
    }

    public void setEmail(String email) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "VoterQuestions{" +
                "dateOfBirth=" + dateOfBirth +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRegistration)) return false;
        UserRegistration that = (UserRegistration) o;
        return dateOfBirth == that.dateOfBirth && zip == that.zip && phone == that.phone && userName.equals(that.userName) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && address.equals(that.address) && city.equals(that.city) && state.equals(that.state) && contactEmail.equals(that.contactEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth, userName, firstName, lastName, address, city, state, zip, phone, contactEmail);
    }
}
