import java.util.Set;

public class Product {
    private int id;
    private String name;
    private LockingType lockingType;
    private Rehost rehost;
    private String description;

    private Product baseProduct;
    private Set<Product> provisionalProduct;
    private Set<Feature> associatedFeature;

    public Product(int id, String name, LockingType lockingType, Rehost rehost, String description, Product baseProduct, Set<Product> provisionalProduct, Set<Feature> associatedFeature) {
        this.id = id;
        this.name = name;
        this.lockingType = lockingType;
        this.rehost = rehost;
        this.description = description;
        this.baseProduct = baseProduct;
        this.provisionalProduct = provisionalProduct;
        this.associatedFeature = associatedFeature;
    }
}
