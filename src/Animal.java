class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "Animal { Nom: " + name + ", Famille: "
                + family + ", Age: " + age + ", Mammifere: "
                + (isMammal ? "Oui" : "Non") + " }";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return this.name.equalsIgnoreCase(animal.name);
    }
}