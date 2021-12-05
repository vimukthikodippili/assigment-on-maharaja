package com.example.backend.services.impl;

import com.example.backend.domains.Customer;
import com.example.backend.domains.User;
import com.example.backend.repositries.CustomerRepositries;
import com.example.backend.repositries.UserRepositries;
import com.example.backend.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepositries customerRepositries ;
    @Override
    public boolean add(Customer customer) {
        customerRepositries.save(customer);
        return true;
    }

    @Override
    public boolean delete(String id) {
        customerRepositries.deleteById(id);
        return true;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

   // @Override
   // public boolean update(Customer customer) {
//        Customer user1 = customerRepositries.findById(customer.getName().orElseThrow(() -> new RuntimeException(
//                String.format("Can't find User By ID", user.getId())
//        ));
//
//        user1.setName(user.getName());
//        user1.setEmail(user.getEmail());
//        user1.setMobile(user.getMobile());
//        user1.setUsername(user.getUsername());
//        user1.setPassword(user.getPassword());
//        user1.setCustomer(user.getCustomer());
//        user1.setAdmin(user.getAdmin());
//
//        customerRepositries.save(cus);
//
//        return true;
    //}

    @Override
    public Customer search(String id) {
        Optional<Customer> byId = customerRepositries.findById(id);
        if (byId == null){
            return byId.get();
        }
        return null;
    }

}
