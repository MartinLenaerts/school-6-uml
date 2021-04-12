public class Details {
    private String street;
    private String city;
    private String postalCode;
    private String country;

    public Details(){};

    public Details(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }


    @Override
    public String toString() {
        return "Details{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
