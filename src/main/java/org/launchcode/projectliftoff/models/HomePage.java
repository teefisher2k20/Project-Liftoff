package org.launchcode.projectliftoff.models;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


public class HomePage {


private int id;
private static int nextId = 1;

@NotBlank(message = "User name is required.")
@Size(min = 5, max = 15, message = "User name must be between 3 and 15 characters")
private String userName;

@NotBlank(message = "Password is required.")
private String password;

    public HomePage(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "HomePageController{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomePage)) return false;
        HomePage homePage = (HomePage) o;
        return id == homePage.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
