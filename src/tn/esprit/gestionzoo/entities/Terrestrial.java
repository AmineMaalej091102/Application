package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(String nom, int age, int nbrLegs) throws InvalidAgeException {
        super(nom, age);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs + "}";
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println(getNom() + " eats " + food);
    }
}
