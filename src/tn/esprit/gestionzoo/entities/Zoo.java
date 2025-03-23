package tn.esprit.gestionzoo.entities;
import java.util.ArrayList;
import java.util.List;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private String nom;
    private List<Animal> animals;
    private int capaciteMax = 3;

    public Zoo(String nom) {
        setNom(nom);
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (animals.size() >= capaciteMax) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter un nouvel animal !");
        }
        animals.add(animal);
        System.out.println("Animal ajoute : " + animal);
        System.out.println("Nombre d'animaux dans le zoo : " + animals.size());
    }

    public void setNom(String nom) {
        if(!nom.isEmpty()) {
            this.nom = nom;
        } else {
            System.out.println("Le nom du zoo ne peut pas etre vide !");
        }
    }
}