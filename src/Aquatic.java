package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;


public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String nom, int age, String habitat) throws InvalidAgeException {
        super(nom, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return getAge() == aquatic.getAge() && getNom().equals(aquatic.getNom()) && habitat.equals(aquatic.habitat);
    }
    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'}";
    }
}
