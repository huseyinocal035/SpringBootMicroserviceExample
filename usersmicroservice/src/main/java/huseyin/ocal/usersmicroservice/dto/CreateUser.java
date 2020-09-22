package huseyin.ocal.usersmicroservice.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUser {

    @NotNull
    @Size(min = 2, message = "Name should has minimum 2 characters")
    private String name;

    @NotNull
    @Size(min = 2, message = "Surname should has minimum 2 characters")
    private String surname;

    @NotNull
    @Size(min = 2, max = 16, message = "password should has between 8 and 16 characters")
    private String password;

    @NotNull
    @Email
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
}
