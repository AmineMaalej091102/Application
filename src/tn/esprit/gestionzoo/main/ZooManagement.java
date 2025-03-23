package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {
    public static void main(String[] args) throws InvalidAgeException {
        /*

        Zoo zoo = new Zoo("Esprit Zoo");

        try {
            Animal lion = new Terrestrial("Lion", 5, 4);
            Animal tiger = new Terrestrial("Tigre", 3, 4);
            Animal dolphin = new Dolphin("Dolphin", 8, "Ocean", 25.5f);
            Animal penguin = new Penguin("Penguin", 6, "Antarctica", 15.0f);
            // Animal invalidAnimal = new Terrestrial("Invalid", -2, 4);

            zoo.addAnimal(lion);
            zoo.addAnimal(tiger);
            zoo.addAnimal(dolphin);
            zoo.addAnimal(penguin);
        } catch (ZooFullException e) {
            System.out.println("Exception capturee : " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Exception capturee : " + e.getMessage());
        }

         */
        Penguin penguin = new Penguin("Penguin", 5, "Antarctica", 10.2f);
        Terrestrial terrestrial = new Terrestrial("Terrestrial", 4, 4);
        Aquatic aquatic = new Aquatic("Aquatic", 3, "Forest") {
            @Override
            public void swim() {
                System.out.println("Swimming!");
            }
        };
        penguin.eatMeat(Food.MEAT);
        terrestrial.eatPlantAndMeat(Food.BOTH);
        aquatic.eatMeat(Food.MEAT);
    }
}