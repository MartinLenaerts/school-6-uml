public class Company  extends Customer{
    private String name;
    private String phone;
    private String fax;

    private Details billing;
    private Details shipping;

    public Company(String name, String phone, String fax, Details billing, Details shipping) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.billing = billing;
        this.shipping = shipping;
    }
}
