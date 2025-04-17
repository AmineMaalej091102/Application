public class Department {
    private int id;
    private String name;
    private int nombreEmployes;
    // Constructeurs
    public Department() {}
    public Department(int id, String name, int nombreEmployes) {
        this.id = id;
        this.name = name;
        this.nombreEmployes = nombreEmployes;
    }
    // Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNombreEmployes() {
        return nombreEmployes;
    }
    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }
    // Redéfinition equals : selon id et nom
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Department)) return false;
        Department other = (Department) o;
        return this.id == other.id && this.name.equalsIgnoreCase(other.name);
    }
    // Redéfinition hashCode (requis pour HashSet)
    @Override
    public int hashCode() {
        return id + name.toLowerCase().hashCode();
    }
    // Redéfinition toString
    @Override
    public String toString() {
        return "Department{id=" + id + ", name=" + name + ", nombreEmployes=" + nombreEmployes + "}";
    }
}