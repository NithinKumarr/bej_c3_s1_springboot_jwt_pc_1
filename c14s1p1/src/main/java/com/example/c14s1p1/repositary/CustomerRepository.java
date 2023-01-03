package com.example.c14s1p1.repositary;

import com.example.c14s1p1.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Integer> {

    public List<Customer>findBycustomerName(String customerName);
    @Query("{'customerProduct.productName':{$in:[?0]}}")//?0---first parameter in method
public List<Customer>findByCustomerProduct(String customerProduct);
}
