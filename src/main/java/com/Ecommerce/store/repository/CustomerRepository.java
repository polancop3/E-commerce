package com.Ecommerce.store.repository;

import com.Ecommerce.store.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
