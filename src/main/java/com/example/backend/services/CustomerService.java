package com.example.backend.services;

import com.example.backend.domains.Customer;
import com.example.backend.domains.User;

public interface CustomerService {
    public boolean add(Customer customer);
    public boolean delete(String id);
    public boolean update(Customer customer);
    public Customer search(String id);
}
