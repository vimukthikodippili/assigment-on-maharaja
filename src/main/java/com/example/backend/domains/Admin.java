package com.example.backend.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Admin")
public class Admin {
    @Id
    private String employeeNumber;
    private String nic;
}
