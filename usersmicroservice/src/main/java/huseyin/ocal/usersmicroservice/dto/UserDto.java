package huseyin.ocal.usersmicroservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {

    private String name;
    private String surname;
    private String email;
    private String password;
    private String userId;
    private String encryptedPassword;

}
