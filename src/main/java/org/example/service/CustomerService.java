package org.example.service;


import org.example.model.Customer;
import org.example.repository.IGenerateRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private IGenerateRepo iGenerateRepo;

    @Override
    public Iterable<Customer> findAll() {
        return iGenerateRepo.findAll();
    }


    @Override
    public void save(Customer customer) {
        iGenerateRepo.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        return iGenerateRepo.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        iGenerateRepo.deleteById(id);
    }
}