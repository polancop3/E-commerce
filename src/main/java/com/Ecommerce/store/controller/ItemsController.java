package com.Ecommerce.store.controller;
import com.Ecommerce.store.model.Items;
import com.Ecommerce.store.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class ItemsController {
    @Autowired
    private ItemsRepository itemsRepository;

    @PostMapping(path = "/addItem")
    public Items createItems(@RequestBody Items item){
        return itemsRepository.save(item);
    }

    @GetMapping
    public @ResponseBody Iterable<Items> getAllItems(){
        return itemsRepository.findAll();
    }

    @PatchMapping(path = "/updateItem")
    public Items updateItems (@RequestBody Items item){ return  itemsRepository.save(item);}

    @DeleteMapping(path = "/{id}")
    public HttpStatus deleteItem( @PathVariable("id") int id){
        itemsRepository.deleteById(id);
        return HttpStatus.OK;
    }

}
