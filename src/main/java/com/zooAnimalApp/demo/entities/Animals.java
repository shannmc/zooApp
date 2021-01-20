package com.zooAnimalApp.demo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Animals {

    @Column
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String species;

    @Column
    private int weight;
}
