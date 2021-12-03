package com.Ecommerce.store.controller;

import com.Ecommerce.store.model.Customer;
import com.Ecommerce.store.repository.CustomerRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
       return customerRepository.save(customer);
    }

    @GetMapping
    public @ResponseBody Iterable<Customer> getCustomers(){
         return customerRepository.findAll();
    }

    @DeleteMapping
    public HttpStatus deleteAll(){
        customerRepository.deleteAll();
        return HttpStatus.OK;
    }
}
