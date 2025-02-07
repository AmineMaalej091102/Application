public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Tunis");
        Animal lion = new Animal("Felins", "Lion", 5, true);
        Animal tiger = new Animal("Felins", "Tigre", 4, true);
        Animal elephant = new Animal("Elephantides", "Elephant", 10, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(elephant);

        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(new Animal("Felins", "Lion", 5, true));
        System.out.println("Lion trouve a l'indice : " + index);

        boolean removed = myZoo.removeAnimal(tiger);
        System.out.println("Tigre supprime : " + removed);

        System.out.println("Le zoo est plein ? " + myZoo.isZooFull());

        Zoo secondZoo = new Zoo("Wild Park", "Sousse");
        secondZoo.addAnimal(new Animal("Oiseaux","Perroquet", 2, false));

        Zoo largerZoo = Zoo.comparerZoo(myZoo, secondZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.name);
    }
}