public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felins", "Lion", 5, true );
        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);
        lion.displayAnimal();
        myZoo.displayZoo();
    }
}