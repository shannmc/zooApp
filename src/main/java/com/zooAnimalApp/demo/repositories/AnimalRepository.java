package com.zooAnimalApp.demo.repositories;

import com.zooAnimalApp.demo.entities.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animals, Long> {
}
