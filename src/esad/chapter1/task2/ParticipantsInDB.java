package esad.chapter1.task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: grisha_angelov
 */
public class ParticipantsInDB {
    Connection db;

    ParticipantsInDB() throws ClassNotFoundException, SQLException {
       db = new PostgreConnectionProvider().getConnection("ConferenceDB","PaulChan","myP@ssword");
    }

    void addParticipant(Participant part) throws SQLException {
        PreparedStatement st = db.prepareStatement("INSERT INTO participants VALUES (?,?,?,?,?,?,?)");
        try {
            st.setString(1, part.getId());
            st.setString(2, part.geteFirstName());
            st.setString(3, part.geteLastName());

            st.executeUpdate();
        } finally {
            st.close();
        }
    }
}
