package huseyin.ocal.usersmicroservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
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
    private String email;
}
