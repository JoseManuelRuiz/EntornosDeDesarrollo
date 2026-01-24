import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private String code;
    private List<Person> persons;

    public AddressBook(String code) {
        this.code = code;
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }
}
