package tn.esprit.gestionzoo.entities;

public class Terrestrial extends tn.esprit.gestionzoo.entities.Animal {
    private int nbrLegs;

    public Terrestrial(String nom, int age, int nbrLegs) {
        super(nom, age);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs + "}";
    }
}
