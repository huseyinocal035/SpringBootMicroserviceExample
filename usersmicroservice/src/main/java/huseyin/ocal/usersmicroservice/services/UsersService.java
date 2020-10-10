package huseyin.ocal.usersmicroservice.services;

import huseyin.ocal.usersmicroservice.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDto);
    UserDto getUserDetailsByEmail(String email);

}
