package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String nom, int age, String habitat, float swimmingDepth) throws InvalidAgeException {
        super(nom, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth + "}";
    }
}
