public class Contact {
    private String firstname;
    private String lastName;
    private String middleName;
    private String email;
    private String locale = "English";

    public Contact(){};

    public Contact(String firstname, String lastName, String middleName, String email, String locale) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.locale = locale;
    }
    public Contact(String firstname, String lastName, String middleName, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}
