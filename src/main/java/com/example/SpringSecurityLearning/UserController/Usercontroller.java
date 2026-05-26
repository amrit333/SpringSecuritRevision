package com.example.SpringSecurityLearning.UserController;


import com.example.SpringSecurityLearning.Entity.UserModel;
import com.example.SpringSecurityLearning.Repositary.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class Usercontroller {
    UserRepo repo;


    @PostMapping
    public String userModel(@RequestBody UserModel model){
     repo.save(model);
     return "user added";
    }

}
