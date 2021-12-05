package com.example.backend.services;

import com.example.backend.domains.User;

public interface UserService {
    public boolean add(User user);
    public boolean delete(String id);
    public boolean update(User user);
    public User search(String id);
    User findByUsernameAndPassword(String username);
}
