public class Individual extends Customer{
    private String firstname;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String locale = "English";

    private Details billing;
    private Details shipping;

    public Individual(String firstname, String lastName, String middleName, String email, String phone, String locale, Details billing, Details shipping) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phone = phone;
        this.locale = locale;
        this.billing = billing;
        this.shipping = shipping;
    }
}
