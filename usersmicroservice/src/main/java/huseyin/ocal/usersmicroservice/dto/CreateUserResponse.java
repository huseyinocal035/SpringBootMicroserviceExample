package huseyin.ocal.usersmicroservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponse {
    private String name;
    private String surname;
    private String email;
    private String userId;

}
