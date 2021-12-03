package com.example.backend.repositries;

import com.example.backend.domains.role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface roleRepositries extends MongoRepository<role,String> {
    role findbyRole(String role);
}
