package com.example.backend.repositries;

import com.example.backend.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepositries extends MongoRepository<User,String> {
    @Query("{'username': ?0}")
    Optional<User> findUserNameAndPassword(String username);
}
