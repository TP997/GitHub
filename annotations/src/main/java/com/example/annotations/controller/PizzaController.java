package com.example.annotations.controller;

import com.example.annotations.service.VegPizza;
import org.springframework.stereotype.Component;

@Component //create spring bean automatically and manage that bean

public class PizzaController {
    private VegPizza vegPizza;  //service class calling
    public PizzaController(VegPizza vegPizza){   // creating constructor
        this.vegPizza= vegPizza;
    }
    public String getPizza() {
            return vegPizza.getPizza();
    }
}
