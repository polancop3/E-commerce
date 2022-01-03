package com.Ecommerce.store.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
@Entity
public class Cart {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    private ArrayList<Items> items;

    //needs to be fixed
}
