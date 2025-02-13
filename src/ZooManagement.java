package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Esprit Zoo", 5);
        Animal lion = new Animal("simba", 5);
        Animal tiger = new Animal("baguira", 4);
        Animal elephant = new Animal("fifi", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);
        zoo.addAnimal(elephant);

        zoo.displayAnimals();

        int index = zoo.searchAnimal(new Animal("simba", 5));
        System.out.println("Lion trouve a l'indice : " + index);

        boolean removed = zoo.removeAnimal(tiger);
        System.out.println("Tigre supprime : " + removed);

        System.out.println("Le zoo est plein ? " + zoo.isZooFull());

        Zoo secondZoo = new Zoo("Wild Park", 25);
        secondZoo.addAnimal(new Animal("ziewziew", 2));

        Zoo largerZoo = Zoo.comparerZoo(zoo, secondZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.getNom());
    }
}