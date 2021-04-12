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

    public Entitlement(String EID, EntitlementType type, Date startDate, Date endDate, Boolean neverExpires, String comments, Customer customer, Set<Product> products) {
        this.EID = EID;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.neverExpires = neverExpires;
        this.comments = comments;
        this.customer = customer;
        this.products = products;
    }


    @Override
    public String toString() {
        return "Entitlement{" +
                "EID='" + EID + '\'' +
                ", type=" + type +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", neverExpires=" + neverExpires +
                ", comments='" + comments + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}
