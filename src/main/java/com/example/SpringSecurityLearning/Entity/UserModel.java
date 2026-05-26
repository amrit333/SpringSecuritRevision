package com.example.SpringSecurityLearning.Entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class UserModel {
    private String name;
    private String course;
    private String  password;
    private String Role;


}
