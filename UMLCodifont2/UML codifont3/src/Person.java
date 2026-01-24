public class Person {

    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private AddressBook addressBook;

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void purchaseParkingPass() {
        // lógica de compra
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
