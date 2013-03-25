package esad.chapter1.task1;

/**
 * @author: grisha_angelov
 */
public class PersonName {
    private String firstName;
    private String lastName;

    public PersonName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
