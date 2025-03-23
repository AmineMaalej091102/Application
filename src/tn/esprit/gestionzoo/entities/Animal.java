package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Animal {
    private String nom;
    private int age;

    public Animal(String nom, int age) throws InvalidAgeException{
        setNom(nom);
        setAge(age);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int age) throws InvalidAgeException {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new InvalidAgeException("L'age d'un animal ne peut pas etre negatif !");
        }
    }
}