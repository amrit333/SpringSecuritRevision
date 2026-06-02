package com.example.SpringSecurityLearning.Repositary;

import com.example.SpringSecurityLearning.Entity.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserModel,String> {
    public UserModel findByName(String  name);
}
