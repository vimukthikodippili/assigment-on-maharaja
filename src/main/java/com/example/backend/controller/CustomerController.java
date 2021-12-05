package com.example.backend.controller;

import com.example.backend.domains.Customer;
import com.example.backend.services.CustomerService;
import com.example.backend.services.UserService;
import com.example.backend.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/contend/programme")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping(path="/create",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveProduct(@RequestBody Customer customer) {

        customerService.add(customer);
        return new ResponseEntity(new StandardResponse("201", "Done", customer), HttpStatus.CREATED);

    }
  //  @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity updateCustomer(@RequestBody Customer customer) {
//        if (customer.getName().trim().length() <= 0) {
//          //  throw new NotFoundException("No id provided to update");
//        }
//      //  customer..updateCatagory(dto);
//        return new ResponseEntity(new StandradResponse("200", "Done", dto), HttpStatus.OK);
   // }


}
