package huseyin.ocal.usersmicroservice.controllers;

import huseyin.ocal.usersmicroservice.dto.CreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    Environment environment;

    @GetMapping("/status")
    public String status() {
        return "working bro! on port --> " + environment.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@RequestBody @Valid CreateUser createUser) {
        return "User created";
    }
}
