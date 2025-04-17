import java.util.*;

public class DepartmentHashSet implements IDepartment<Department> {
    private Set<Department> departments = new HashSet<>();
    @Override
    public void ajouterDepartement(Department department) {
        departments.add(department);
    }

    @Override
    public boolean rechercherDepartement(String name) {
        for (Department department : departments) {
            if (department.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Department department) {
        return departments.contains(department);
    }

    @Override
    public void supprimerDepartement(Department department) {
        departments.remove(department);
    }

    @Override
    public void displayDepartement() {
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    @Override
    public TreeSet<Department> trierDepartementById() {
        TreeSet<Department> sorted = new TreeSet<>(Comparator.comparingInt(Department::getId));
        sorted.addAll(departments);
        return sorted;
    }
}
