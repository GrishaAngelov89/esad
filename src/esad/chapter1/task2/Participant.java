package esad.chapter1.task2;

/**
 * @author: grisha_angelov
 */
public class Participant {

    private String id;
    private String eFirstName;
    private String eLastName;

    public Participant(String id, String eFirstName, String eLastName) {
        this.id = id;
        this.eFirstName = eFirstName;
        this.eLastName = eLastName;
    }

    public String getId() {
        return id;
    }

    public String geteFirstName() {
        return eFirstName;
    }

    public String geteLastName() {
        return eLastName;
    }
}
