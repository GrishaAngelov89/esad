package esad.chapter2.example;

/**
 * @author: grisha_angelov
 */

public class ParticipantBadge {
    //    private String participantID;
    private String englishParticipantFullName;
    private String chineseParticipantFullName;
    private String englishOrganizationName;
    private String chineseOrganizationName;
    private String organizationCountryInEnglish;
    private String organizationCountryInChinese;
    private OrganizationsInDB organizationsInDB;

    ParticipantBadge(String participantID) {
//        this.participantID = participantID;

        load(participantID);
    }

    private void load(String participantID) {
        Participant participant = getParticipantByID(participantID);
        if (participant != null) {
            extractParticipantName(participant);
            String organizationID = getOrganizationID(participantID);
            if (organizationID != null) {
                Organization organization = getOrganizationByID(organizationID);
                extractOrganizationName(organization);
                extractOrganizationCountry(organization);
            }
        }
    }

    private void extractOrganizationCountry(Organization organization) {
        organizationCountryInEnglish = organization.getEAddress().getCountry();
        organizationCountryInChinese = organization.getCAddress().getCountry();
    }

    private void extractOrganizationName(Organization organization) {
        englishOrganizationName = organization.getEName();
        chineseOrganizationName = organization.getCName();
    }

    private Organization getOrganizationByID(String organizationID) {
        return organizationsInDB.locateOrganization(organizationID);
    }

    private void extractParticipantName(Participant participant) {
        englishParticipantFullName = getParticipantFullNameInEnglish(participant);
        chineseParticipantFullName = getParticipantFullNameInChinese(participant);
    }

    private String getParticipantFullNameInChinese(Participant participant) {
        return participant.getCLastName() + ", " + participant.getCFirstName();
    }

    private String getParticipantFullNameInEnglish(Participant participant) {
        return participant.getELastName() + ", " + participant.getEFirstName();
    }

    private Participant getParticipantByID(String participantID) {
        ParticipantsInDB partsInDB = ParticipantsInDB.getInstance();
        return partsInDB.locateParticipant(participantID);
    }

    private String getOrganizationID(String participantID) {
        OrganizationsInDB organizationsInDB = OrganizationsInDB.getInstance();
        return organizationsInDB.getOrganization(participantID);
    }
}
