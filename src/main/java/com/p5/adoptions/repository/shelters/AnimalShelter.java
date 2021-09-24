package com.p5.adoptions.repository.shelters;

import com.p5.adoptions.repository.cats.Cat;
import com.p5.adoptions.repository.dogs.Dog;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AnimalShelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String name;

    private String location;

    //@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    //@JoinColumn(name = "cat_id")
    //private Cat cat;

    //Unidirectional OneToMany
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "shelter_id")
    private List<Cat> cats = new ArrayList<>();

    //Bidirectional
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "shelter")
    //private List<Cat> cats = new ArrayList<>();

    //@ManyToMany
    //@JoinTable(name = "shelters_cats",
    //            joinColumns = @JoinColumn(name = "shelter_id", referencedColumnName = "id"),
    //            inverseJoinColumns = @JoinColumn(name = "cat_id", referencedColumnName = "id"))
    //private List<Cat> cats = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public AnimalShelter setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AnimalShelter setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public AnimalShelter setLocation(String location) {
        this.location = location;
        return this;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public AnimalShelter setCats(List<Cat> cats) {
        this.cats = cats;
        return this;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public AnimalShelter setDogs(List<Dog> dogs) {
        this.dogs = dogs;
        return this;
    }

}
