package com.p5.adoptions.repository.cats;

import com.p5.adoptions.repository.animal.Animal;
import com.p5.adoptions.repository.shelters.AnimalShelter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cat extends Animal {

    //Bidirectional
    //@ManyToOne
    //@JoinColumn(name = "shelter_id")
    //private AnimalShelter shelter;


}
