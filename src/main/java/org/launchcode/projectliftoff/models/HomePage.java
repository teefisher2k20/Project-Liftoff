package org.launchcode.projectliftoff.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class HomePage {

    @Id
    @GeneratedValue
    private int id;


    @NotBlank(message = "User name is required.")
    @Size(min = 5, max = 15, message = "User name must be between 3 and 15 characters")
    private String userName;


    private String password;

    @ManyToOne
    private HomePage homePage;

    public HomePage(String userName, String password, HomePage homePage) {
        this.userName = userName;
        this.password = password;
        this.homePage = homePage;

    }

    public HomePage() {
    }

    public int getId() {
        return id;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
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
