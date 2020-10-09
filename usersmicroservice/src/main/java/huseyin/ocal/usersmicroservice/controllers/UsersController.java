package huseyin.ocal.usersmicroservice.controllers;
import huseyin.ocal.usersmicroservice.dto.CreateUser;
import huseyin.ocal.usersmicroservice.dto.UserDto;
import huseyin.ocal.usersmicroservice.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UsersController {

    private final Environment environment;
    private final UsersService usersService;

    @GetMapping("/status")
    public String status() {
        return "working bro! on port --> " + environment.getProperty("local.server.port");
    }

    @PostMapping("/create")
    public String createUser(@RequestBody @Valid CreateUser createUser) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(createUser, UserDto.class);
        usersService.createUser(userDto);

        return "User created";
    }
}
