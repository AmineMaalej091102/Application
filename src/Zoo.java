package tn.esprit.gestionzoo.entities;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    ArrayList<Animal> animals;
    private int maxCapacity;

    public Zoo(String name, int maxCapacity) {
        setNom(name);
        this.maxCapacity = maxCapacity;
        this.animals = new ArrayList<>();
    }

    public String getNom() {
        return name;
    }
    public void setNom(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas etre vide !");
        }
    }

    public boolean isZooFull() {
        return animals.size() >= maxCapacity;
    }
    public void displayZoo() {
        System.out.println("Zoo { Nom: " + name + ", Nombre d'animaux: " + animals.size() + " }");
    }
    public void addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals.add(animal);
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter un nouvel animal !");
        }
    }
    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("Animaux dans le zoo " + name + " :");
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }
    public int searchAnimal(Animal animal) {
        return animals.indexOf(animal);
    }
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animals.size() >= z2.animals.size() ? z1 : z2;
    }
}