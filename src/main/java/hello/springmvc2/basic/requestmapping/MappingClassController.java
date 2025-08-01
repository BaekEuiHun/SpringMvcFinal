package hello.springmvc2.basic.requestmapping;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "add users";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get user " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "get user " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteeUser(@PathVariable String userId) {
        return "get user " + userId;
    }
}
