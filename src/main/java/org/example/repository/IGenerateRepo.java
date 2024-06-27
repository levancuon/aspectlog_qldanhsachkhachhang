package org.example.repository;

import org.example.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IGenerateRepo extends PagingAndSortingRepository<Customer,Long> {
}
