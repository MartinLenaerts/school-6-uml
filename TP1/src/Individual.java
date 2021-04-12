public class Individual extends Customer{
    private String firstname;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String locale = "English";

    private Details billing;
    private Details shipping;

    public Individual(int id, String description , String firstname, String lastName, String middleName, String email, String phone, String locale, Details billing, Details shipping) {
        super(id,CustomerType.Individual,description);
        this.firstname = firstname;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phone = phone;
        this.locale = locale;
        this.billing = billing;
        this.shipping = shipping;
    }

    public Individual(int id, String description) {
        super(id, CustomerType.Individual, description);
        this.billing = new Details();
        this.shipping = new Details();

    }


    public Individual(int id) {
        super(id, CustomerType.Individual, "");
        this.billing = new Details();
        this.shipping = new Details();
    }


    @Override
    public String toString() {
        return "Individual{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", locale='" + locale + '\'' +
                ", billing=" + billing +
                ", shipping=" + shipping +
                '}';
    }
}
