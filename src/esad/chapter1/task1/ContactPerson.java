package esad.chapter1.task1;

/**
 * @author: grisha_angelov
 */
public class ContactPerson {
    private PersonName englishName;
    private PersonName chineseName;
    private Telephone fax;
    private Telephone telephone;
    private Telephone mobileTelephone;

    public ContactPerson(PersonName englishName,PersonName chineseName, Telephone fax, Telephone telephone, Telephone mobileTelephone) {
        this.englishName = englishName;
        this.chineseName = chineseName;

        this.fax = fax;
        this.telephone = telephone;
        this.mobileTelephone = mobileTelephone;
        this.chineseName = chineseName;
    }

    public PersonName getEnglishName() {
        return englishName;
    }

    public PersonName getChineseName() {
        return chineseName;
    }

    public Telephone getFax() {
        return fax;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Telephone getMobileTelephone() {
        return mobileTelephone;
    }
}
