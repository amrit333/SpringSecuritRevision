package com.example.SpringSecurityLearning.Repositary;

import com.example.SpringSecurityLearning.Entity.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserModel,String> {
    public UserModel findByUsername(String  name);
}
