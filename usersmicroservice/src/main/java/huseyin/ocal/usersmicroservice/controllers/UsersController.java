package huseyin.ocal.usersmicroservice.controllers;
import huseyin.ocal.usersmicroservice.dto.CreateUser;
import huseyin.ocal.usersmicroservice.dto.CreateUserResponse;
import huseyin.ocal.usersmicroservice.dto.UserDto;
import huseyin.ocal.usersmicroservice.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/root")
public class UsersController {

    private final Environment environment;
    private final UsersService usersService;

    @GetMapping("/status")
    public String status() {
        return "working bro! on port --> " + environment.getProperty("local.server.port");
    }

    @PostMapping(value = "/users",
            consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUser createUser) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(createUser, UserDto.class);
        UserDto createdUser = usersService.createUser(userDto);

        CreateUserResponse returnValue = modelMapper.map(createdUser, CreateUserResponse.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
    }
}
