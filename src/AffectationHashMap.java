import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employee, Department> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employee e, Department d) {
        affectations.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employee, Department> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + " -> Département : " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employee e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employee e, Department d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    public void afficherEmployes() {
        for (Employee e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Department d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employee e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Department d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employee, Department> trierMap() {
        return new TreeMap<>(affectations);
    }
}
