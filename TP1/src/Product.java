import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Product {
    private int id;
    private String name;
    private LockingType lockingType;
    private Rehost rehost;
    private String description;

    private Product baseProduct;
    private Set<Product> provisionalProduct;
    private ArrayList<Feature> associatedFeature;


    public Product(){}
    public Product(int id, String name, LockingType lockingType, Rehost rehost, String description, Product baseProduct, Set<Product> provisionalProduct, ArrayList<Feature> associatedFeature) {
        this.id = id;
        this.name = name;
        this.lockingType = lockingType;
        this.rehost = rehost;
        this.description = description;
        this.baseProduct = baseProduct;
        this.provisionalProduct = provisionalProduct;
        this.associatedFeature = associatedFeature;
    }

    public Product(int id, String name, LockingType lockingType, Rehost rehost, String description, Product baseProduct, ArrayList<Feature> associatedFeature) {
        this.id = id;
        this.name = name;
        this.lockingType = lockingType;
        this.rehost = rehost;
        this.description = description;
        this.baseProduct = baseProduct;
        this.provisionalProduct = new HashSet<Product>();
        this.associatedFeature = associatedFeature;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lockingType=" + lockingType +
                ", rehost=" + rehost +
                ", description='" + description + '\'' +
                ", baseProduct=" + baseProduct +
                ", provisionalProduct=" + provisionalProduct +
                ", associatedFeature=" + associatedFeature +
                '}';
    }
}
