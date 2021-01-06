package com.dbms.boot.service;

import com.dbms.boot.domain.Users;
import com.dbms.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepository;

    public boolean register(String username, String password) {
        if (userRepository.findById(username).orElse(null) != null) return false;
        Users user = new Users();
        user.setUSERNAME(username);
        user.setPASSWORD(password);
        userRepository.save(user);
        return true;
    }

    public boolean login(String username, String password) {
        if (username.equals("") || password.equals("")) return false;
        if (userRepository.findById(username).orElse(null) == null) return false;
        if (userRepository.findById(username).get().getPASSWORD().equals(password)) return true;
        else return false;
    }
}
