package com.Ecommerce.store.controller;

import com.Ecommerce.store.model.Items;
import com.Ecommerce.store.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class ItemsController {

    @Autowired
    private ItemsRepository itemsRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewItem(@RequestParam String name, @RequestParam String description, @RequestParam double price){
        Items product = new Items();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        return "saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Items> getAllItems(){
        return itemsRepository.findAll();
    }
}
