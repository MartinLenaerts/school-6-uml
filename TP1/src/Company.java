public class Company extends Customer {
    private String name;
    private String phone;
    private String fax;

    private Details billing;
    private Details shipping;
    private Contact contact;

    public Company(int id, String description, String name, String phone, String fax, Details billing, Details shipping,Contact contact) {
        super(id, CustomerType.Company, description);
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.billing = billing;
        this.shipping = shipping;
        this.contact = contact;
    }

    public Company(int id, String description) {
        super(id, CustomerType.Company, description);
        this.billing = new Details();
        this.shipping = new Details();
        this.contact = new Contact();

    }


    public Company(int id) {
        super(id, CustomerType.Company, "");
        this.billing = new Details();
        this.shipping = new Details();
        this.contact = new Contact();
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", billing=" + billing +
                ", shipping=" + shipping +
                ", contact=" + contact +
                '}';
    }
}
