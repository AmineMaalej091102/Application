package tn.esprit.gestionzoo.entities;

public class Penguin extends tn.esprit.gestionzoo.entities.Aquatic {
    private float swimmingDepth;

    public Penguin(String nom, int age, String habitat, float swimmingDepth) {
        super(nom, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth + "}";
    }
}
