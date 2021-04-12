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
}
