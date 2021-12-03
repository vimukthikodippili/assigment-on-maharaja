package com.example.backend.services;

import com.example.backend.domains.role;
import com.example.backend.domains.user;
import com.example.backend.repositries.roleRepositries;
import com.example.backend.repositries.userRepositries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;

@Service
public class CustomeUserdetailsService implements UserDetailsService {
@Autowired
    private userRepositries userRepositries;
@Autowired
    private roleRepositries roleRepositries;
@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
public user findByEmail(String email){
    return userRepositries.findbyemail(email);
}
public void saveUser(User user){
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    role userRoler =roleRepositries.findbyRole("admin");
    user.setRole(new HashSet<>(Arrays.asList(userRoler)));
    userRepositries.save(user);
@Override
        public UserDetails LoardUserByUsername(String email) throw {
       User user =userRepositries.findbyemail(email);
       if (user !=null){
           List<GrantedAuthority> authorities =getUserAuthority(user.getUsername());
           return b;
       }
    }
}
}
