package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new tn.esprit.gestionzoo.entities.Zoo("Esprit Zoo", 5);

        Animal lion = new Terrestrial("simba", 5, 4);
        Animal tiger = new Terrestrial("baguira", 3, 4);
        Animal dolphin = new Dolphin("fifi", 8, "Ocean", 25.5f);
        Animal penguin = new Penguin("Penguin", 6, "Antarctica", 15.0f);

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(dolphin);
        zoo.addAnimal(penguin);
    }
}