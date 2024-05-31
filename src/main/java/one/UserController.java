package one;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
   private UserService userService;
   
   @PostMapping("/user")
   public User saveUser(@RequestBody User user) {
	   return userService.saveUser(user);
   }
   
   @GetMapping("/user")
   public List<User> getAllUsers() {
	   return userService.fetchAllUsers();
   }
   
   @GetMapping("/user/{id}")
   public User getUserById(@PathVariable("id") Long id) {
	   return userService.getUserById(id);
   }
   
   @PutMapping("/user/{id}")
   public User updateUserById(@PathVariable("id") Long id, @RequestBody User user) {
	   return userService.updateUserById(id, user);
   }
   
   @DeleteMapping("/user/{id}")
   public String deleteUserById(@PathVariable("id") Long id) {
	   return userService.deleteUserById(id);
   }
}
