package esad.chapter1.task4;

import java.sql.SQLException;

/**
 * @author: grisha_angelov
 */
public class ParticipantsInDB {
    private static ParticipantsInDB instance;
    private int count;

    public static ParticipantsInDB getInstance() {
        return instance;
    }

    void addParticipant(Participant part) throws SQLException {

    }

    public static void freeInstance() {

    }

    public void deleteAllParticipants() {
    }

    public int getCount() {
        return count;
    }

}
