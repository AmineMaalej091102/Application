package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Esprit Zoo", 3);

        Aquatic dolphin = new Dolphin("fifi", 8, "Ocean", 25.5f);
        Aquatic penguin = new Penguin("Penguin", 6, "Antarctica", 15.0f);

        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);

        for(Aquatic aquatic : zoo.aquaticAnimals) {
            if(aquatic != null) aquatic.swim();
        }

        System.out.println("Profondeur maximale des pinguoins : " + zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByType();
    }
}