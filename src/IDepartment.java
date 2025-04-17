import java.util.TreeSet;

public interface IDepartment<T> {
    void ajouterDepartement(T t);
    boolean rechercherDepartement(String name);
    boolean rechercherDepartement(T t);
    void supprimerDepartement(T t);
    void displayDepartement();
    TreeSet<T> trierDepartementById();
}