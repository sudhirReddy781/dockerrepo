package wine.chardonnay.dataservice.app.controller;

import wine.chardonnay.dataservice.app.model.User;
import wine.chardonnay.dataservice.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.insertUserData(user);
    }

    @GetMapping
    public Collection<User> read() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public Optional<User> readQueryUsingId(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @GetMapping(value="/get/{name}")
    public User getUserByName(@PathVariable("name") String name) {
        return userService.getUserByName(name);
    }

    @PutMapping(path = "/update/{id}")
    public void update(@PathVariable String id, @RequestBody User user ) {
        userService.updateUserById(id, user);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable("id") String id){
        userService.deleteUserUsingId(id);
    }
}
