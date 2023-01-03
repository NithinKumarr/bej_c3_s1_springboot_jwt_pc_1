package com.example.c14s1p1.controller;

import com.example.c14s1p1.domain.Customer;
import com.example.c14s1p1.exception.CustomerAlreadyExistException;
import com.example.c14s1p1.exception.CustomerNotFoundException;
import com.example.c14s1p1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    ICustomerService customerService;
    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }
@PostMapping("/customer")
    public ResponseEntity<?>addCustomer(@RequestBody Customer customer)throws CustomerAlreadyExistException {
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
}
@GetMapping("/customer")
    public ResponseEntity<?>getAllCustomer(){
        return new ResponseEntity<>(customerService.getAllCustomer(),HttpStatus.OK);
}
@DeleteMapping("/customer/{id}")
    public ResponseEntity<?>deleteCustomer(@PathVariable int id)throws CustomerNotFoundException {
        return new ResponseEntity<>(customerService.deleteCustomer(id),HttpStatus.OK);
}
@GetMapping("/customers/{name}")
    public ResponseEntity<?>getAllCustomerByName(@PathVariable String name){
        return new ResponseEntity<>(customerService.getCustomerByName(name),HttpStatus.OK);
}
@GetMapping("/customer/{product}")
    public ResponseEntity<?>getCustomerByProductName(@PathVariable String product){
        return new ResponseEntity<>(customerService.getCustomerByProductName(product),HttpStatus.OK);
}


}
