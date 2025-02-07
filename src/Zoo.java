import java.util.ArrayList;

class Zoo {
    static final int MAX_ANIMALS = 25;
    ArrayList<Animal> animals;
    String name;
    String city;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new ArrayList<>();
    }

    public void displayZoo() {
        System.out.println("Zoo { Nom: " + name + ", Ville: " + city
                + ", Nombre d'animaux: " + animals.size() + " }");
    }
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Erreur : Le zoo est plein !");
            return false;
        }
        if (animals.contains(animal)) {
            System.out.println("Erreur : Cet animal est deja present dans le zoo !");
            return false;
        }
        animals.add(animal);
        return true;
    }
    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("Animaux dans le zoo " + name + " :");
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
    public boolean isZooFull() {
        return animals.size() >= MAX_ANIMALS;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animals.size() >= z2.animals.size() ? z1 : z2;
    }
}