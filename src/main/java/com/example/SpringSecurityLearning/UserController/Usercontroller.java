package com.example.SpringSecurityLearning.UserController;


import com.example.SpringSecurityLearning.Entity.UserModel;
import com.example.SpringSecurityLearning.Repositary.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")

public class Usercontroller {
    @Autowired
    UserRepo repo;


    @PostMapping
    public String userModel(@RequestBody UserModel model){
     repo.save(model);
     return "user added";
    }
    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable String  id){
        return repo.findByName(id);
    }
}
