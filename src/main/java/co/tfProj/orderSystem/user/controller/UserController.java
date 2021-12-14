package co.tfProj.orderSystem.user.controller;

import co.tfProj.orderSystem.user.model.User;
import co.tfProj.orderSystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.findAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return this.userService.saveUser(user);
    }

}
