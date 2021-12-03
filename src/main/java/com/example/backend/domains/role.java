package com.example.backend.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "role")
public class role {
    @Id
    String id;
    @Indexed(unique = true,direction = IndexDirection.DESCENDING,dropDups = true)
    String role;


}
