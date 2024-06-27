package org.example.service;

import org.example.model.Customer;

public interface ICustomerService {
    Iterable<Customer> findAll();
    void save(Customer customer);
    Customer findById(Long id);
    void remove(Long id);
}