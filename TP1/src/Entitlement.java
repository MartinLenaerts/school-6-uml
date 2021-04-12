import java.util.Date;
import java.util.Set;

public class Entitlement {
    private String EID;
    private EntitlementType type;
    private Date startDate;
    private Date endDate;
    private  Boolean neverExpires = true;
    private String comments;

    private Customer customer;
    private Set<Product> products;
}
