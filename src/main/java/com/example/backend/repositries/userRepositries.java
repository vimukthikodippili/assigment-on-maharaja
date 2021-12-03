package com.example.backend.repositries;

import com.example.backend.domains.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepositries extends MongoRepository<user,String> {
    user findbyemail(String email);
}
