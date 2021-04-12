public abstract class Customer {
    private int CRM_ID;
    private CustomerType type;
    private String description;

    public Customer(int CRM_ID, CustomerType type, String description) {
        this.CRM_ID = CRM_ID;
        this.type = type;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CRM_ID=" + CRM_ID +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}
