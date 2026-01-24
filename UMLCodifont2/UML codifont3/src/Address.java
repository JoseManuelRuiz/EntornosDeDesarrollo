public class Address {

    private String street;
    private String city;
    private String postalCode;
    private State state;

    public Address(String street, String city, String postalCode, State state) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
