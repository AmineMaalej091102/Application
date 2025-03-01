package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Dolphin;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private ArrayList<Animal> animals;
    public Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;

    public Zoo(String nom, int maxCapacity) {
        setNom(nom);
        this.animals = new ArrayList<>();
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < 10) {
            aquaticAnimals[aquaticCount++] = aquatic;
        } else {
            System.out.println("Le tableau des animaux aquatiques est plein !");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for(Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                maxDepth = Math.max(maxDepth, ((Penguin) aquatic).getSwimmingDepth());
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0, penguinCount = 0;
        for(Aquatic aquatic : aquaticAnimals) {
            if(aquatic instanceof Dolphin) dolphinCount++;
            else if(aquatic instanceof Penguin) penguinCount++;
        }
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de penguins : " + penguinCount);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(!nom.isEmpty()) {
            this.nom = nom;
        } else {
            System.out.println("Le nom du zoo ne peut pas etre vide !");
        }
    }

    public void displayZoo() {
        System.out.println("Zoo { Nom: " + nom + ", Nombre d'animaux: " + animals.size() + " }");
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("Animaux dans le zoo " + nom + " :");
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