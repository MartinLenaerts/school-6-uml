public class Feature {
    private int id;
    private String name;
    private String description;

    public Feature(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Feature() {
    }

    @Override
    public String toString() {
        return "Feature{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
