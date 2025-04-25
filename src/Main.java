public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectation = new AffectationHashMap();

        Employee e1 = new Employee(28, "sonic", "maurice", "IT", 3);
        Employee e2 = new Employee(25, "amy", "rose", "RH", 2);

        Department d1 = new Department(101, "Informatique", 10);
        Department d2 = new Department(102, "Ressources Humaines", 5);

        affectation.ajouterEmployeDepartement(e1, d1);
        affectation.ajouterEmployeDepartement(e2, d2);

        affectation.afficherEmployesEtDepartements();

        affectation.ajouterEmployeDepartement(e1, d2);

        affectation.afficherEmployesEtDepartements();

        affectation.supprimerEmploye(e2);

        affectation.afficherEmployesEtDepartements();
    }
}