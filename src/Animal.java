package tn.esprit.gestionzoo.entities;

public class Animal {
    private String nom;
    private int age;

    public Animal(String nom, int age) {
        setNom(nom);
        setAge(age);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'age d'un animal ne peut etre negatif ! ");
        }
    }

    @Override
    public String toString() {
        return "Animal{nom='" + nom + "', age=" + age + "}";
    }
}