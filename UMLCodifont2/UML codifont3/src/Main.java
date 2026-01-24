//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Country Alicante = new Country(1,"Alicante");
    Country Valencia = new Country(2,"Valencia");
    Country Castellon = new Country(3,"Castellón");


    State estado1 = new State(1,"Comunidad valenciana", Alicante);
    State estado2 = new State(1,"Comunidad valenciana", Valencia);
    State estado3 = new State(1,"Comunidad valenciana", Castellon);

    Person Pepe = new Person("Pepe", "123456789", "pepe@pepe.pepe");
    Person Alba = new Person("alba", "123456789", "alba@alba.alba");
    Person Juan = new Person("juan", "123456789", "juan@juan.juan");

    Address direccionPepe = new Address("calle 1", "Alicante", "12345", estado1);
    Address direccionJuan = new Address("calle 2", "Valencia", "12345", estado2);
    Address direccionAlba = new Address("calle 3", "Castellon", "12345", estado3);

    AddressBook uno = new AddressBook("123");
    AddressBook dos = new AddressBook("456");
    AddressBook tres = new AddressBook("789");

    uno.addPerson(Pepe);
    dos.addPerson(Alba);
    tres.addPerson(Juan);



}
