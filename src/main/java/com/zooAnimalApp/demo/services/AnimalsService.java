package com.zooAnimalApp.demo.services;

import com.zooAnimalApp.demo.entities.Animals;
import com.zooAnimalApp.demo.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsService {
    final AnimalRepository animalRepository;

    public AnimalsService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animals> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animals addAnimal(Animals animal) {
        return animalRepository.save(animal);
    }
}
