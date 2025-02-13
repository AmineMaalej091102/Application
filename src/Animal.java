package tn.esprit.gestionzoo.entities;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        setNom(name);
        setAge(age);
    }

    public String getNom() {
        return name;
    }
    public void setNom(String name) {
        this.name = name;
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
}