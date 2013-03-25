package esad.chapter1.task1;

/**
 * @author: grisha_angelov
 */
public class OrgName {
    private String id;
    private String name;

    public OrgName(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
