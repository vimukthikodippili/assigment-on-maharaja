package com.example.backend.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collation = "user")
public class user {
    @Id
    String id;
    @Indexed(unique = true,direction = IndexDirection.DESCENDING,dropDups = true)
    String password;
    @DBRef
    private Set<role> roles;

    public user() {
    }

    public user(String id, String password, Set<role> roles) {
        this.id = id;
        this.password = password;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<role> getRoles() {
        return roles;
    }

    public void setRoles(Set<role> roles) {
        this.roles = roles;
    }
}
