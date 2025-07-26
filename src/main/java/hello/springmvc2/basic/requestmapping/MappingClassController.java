package hello.springmvc2.basic.requestmapping;


import org.springframework.web.bind.annotation.*;

@RestController
public class MappingClassController {

    @GetMapping("/mapping/users")
    public String user() {
        return "get users";
    }

    @PostMapping("/mapping/users")
    public String addUser() {
        return "add users";
    }

    @GetMapping("/mapping/users/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get user " + userId;
    }

    @PatchMapping("/mapping/users/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "get user " + userId;
    }

    @DeleteMapping("/mapping/users/{userId}")
    public String deleteeUser(@PathVariable String userId) {
        return "get user " + userId;
    }
}
