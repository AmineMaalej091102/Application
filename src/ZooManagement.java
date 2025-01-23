import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        System.out.println("Entrez le nombre de cages (entier positif) : ");
        while(!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide : ");
            scanner.next();
        }
        nbrCages = scanner.nextInt();

        while(nbrCages <= 0) {
            System.out.println("Le nombre de cages doit être supérieur à 0. Réessayez : ");
            nbrCages = scanner.nextInt();
        }

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        scanner.close();
    }
}