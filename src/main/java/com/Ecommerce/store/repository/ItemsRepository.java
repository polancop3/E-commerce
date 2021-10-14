package com.Ecommerce.store.repository;

import com.Ecommerce.store.model.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepository extends CrudRepository<Items, Integer> {

}
