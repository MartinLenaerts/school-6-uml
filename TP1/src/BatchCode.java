import java.util.Set;

public class BatchCode {
    private String id;

    private Set<Product> products;
    private Set<Feature> features;

    public BatchCode(String id, Set<Product> products, Set<Feature> features) {
        this.id = id;
        this.products = products;
        this.features = features;
    }
}
