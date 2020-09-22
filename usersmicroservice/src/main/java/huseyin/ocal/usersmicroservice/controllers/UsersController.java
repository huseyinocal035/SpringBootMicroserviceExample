package huseyin.ocal.usersmicroservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    Environment environment;

    @GetMapping("/status")
    public String status() {
        return "working bro! on port --> " + environment.getProperty("local.server.port");
    }
}
