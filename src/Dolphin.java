package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Aquatic;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String nom, int age, String habitat, float swimmingSpeed) {
        super(nom, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed + "}";
    }
}
