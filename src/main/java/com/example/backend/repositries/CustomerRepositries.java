package com.example.backend.repositries;

import com.example.backend.domains.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepositries  extends MongoRepository<Customer,String> {
}
