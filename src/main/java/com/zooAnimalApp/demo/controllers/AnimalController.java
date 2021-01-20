package com.zooAnimalApp.demo.controllers;

import com.zooAnimalApp.demo.entities.Animals;
import com.zooAnimalApp.demo.services.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    final AnimalsService animalsService;

    public AnimalController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @GetMapping("/animals")
    public List<Animals> getAllAnimals() {
        return animalsService.getAllAnimals();

    }

    @PostMapping("/animal")
    public Animals addAnimal(@RequestBody Animals animal) {
        return animalsService.addAnimal(animal);
    }
}
