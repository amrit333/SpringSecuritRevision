package com.example.SpringSecurityLearning.Entity;


import lombok.Data;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Document(collection = "users")
@Getter
public class UserModel implements UserDetails {

    private String  username;
    private String name;
    private String course;
    private String  password;
    private String Role;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }
}
