package org.launchcode.projectliftoff.models;

import java.util.Objects;

public class VoterQuestions {

    private int id;

    private int dateOfBirth;
    private String userName;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phone;
    private String email;

    public VoterQuestions(int dateOfBirth, String userName, String firstName,
                          String lastName, String address, String city, String state, int zip,
                          int phone, String email) {
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VoterQuestions)) return false;
        VoterQuestions that = (VoterQuestions) o;
        return dateOfBirth == that.dateOfBirth && zip == that.zip && phone == that.phone && userName.equals(that.userName) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && address.equals(that.address) && city.equals(that.city) && state.equals(that.state) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth, userName, firstName, lastName, address, city, state, zip, phone, email);
    }
}
