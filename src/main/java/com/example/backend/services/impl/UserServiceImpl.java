package com.example.backend.services.impl;

import com.example.backend.domains.User;
import com.example.backend.repositries.UserRepositries;
import com.example.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositries userRepositries;

    @Override
    public boolean add(User user) {
        userRepositries.save(user);
        return true;
    }

    @Override
    public boolean delete(String id) {
        userRepositries.deleteById(id);
        return true;
    }

    @Override
    public boolean update(User user) {
        User user1 = userRepositries.findById(user.getId()).orElseThrow(() -> new RuntimeException(
                String.format("Can't find User By ID", user.getId())
        ));

        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setMobile(user.getMobile());
        user1.setUsername(user.getUsername());
        user1.setPassword(user.getPassword());
        user1.setCustomer(user.getCustomer());
        user1.setAdmin(user.getAdmin());

        userRepositries.save(user);

        return true;
    }

    @Override
    public User search(String id) {
        Optional<User> byId = userRepositries.findById(id);
        if (byId == null){
            return byId.get();
        }
        return null;
    }

    @Override
    public User findByUsernameAndPassword(String username) {
        return userRepositries.findUserNameAndPassword(username).orElseThrow(()-> new RuntimeException(
                String.format("Cannot find user",username)));
//        return Optional.empty();
    }
}
