package com.Ecommerce.store.controller;
import com.Ecommerce.store.model.Items;
import com.Ecommerce.store.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/demo")
public class ItemsController {
    @Autowired
    private ItemsRepository itemsRepository;

    @PostMapping
    public Items createItems(@RequestBody Items item){
        return itemsRepository.save(item);
    }

    @GetMapping
    public @ResponseBody Iterable<Items> getAllItems(){
        return itemsRepository.findAll();
    }
}
