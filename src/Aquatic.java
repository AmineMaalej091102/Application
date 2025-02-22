package tn.esprit.gestionzoo.entities;

public class Aquatic extends tn.esprit.gestionzoo.entities.Animal {
    private String habitat;

    public Aquatic(String nom, int age, String habitat) {
        super(nom, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'}";
    }
}
