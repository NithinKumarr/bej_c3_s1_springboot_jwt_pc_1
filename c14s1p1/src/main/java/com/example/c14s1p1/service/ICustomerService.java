package com.example.c14s1p1.service;

import com.example.c14s1p1.domain.Customer;
import com.example.c14s1p1.exception.CustomerAlreadyExistException;
import com.example.c14s1p1.exception.CustomerNotFoundException;

import java.util.List;

public interface ICustomerService {
    public Customer addCustomer(Customer customer)throws CustomerAlreadyExistException;
public List<Customer> getAllCustomer();
public String deleteCustomer(int CustomerId)throws CustomerNotFoundException;
public List<Customer>getCustomerByName(String customerName);
public List<Customer>getCustomerByProductName(String customerProduct);
}
