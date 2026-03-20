package com.himan.springboot.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        return username.equalsIgnoreCase("himan") && password.equals("himan");
    }
}
