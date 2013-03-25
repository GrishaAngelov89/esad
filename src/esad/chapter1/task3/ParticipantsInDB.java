package esad.chapter1.task3;

import esad.chapter1.task2.Participant;
import esad.chapter1.task2.PostgreConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: grisha_angelov
 */
public class ParticipantsInDB {
    // Duplication in table name

    private Connection db;
    private String table = "participants";

    private ParticipantsInDB() throws ClassNotFoundException, SQLException {
        db = new PostgreConnectionProvider().getConnection("ConferenceDB", "PaulChan", "myP@ssword");
    }

    void addParticipant(Participant part) throws SQLException {
        PreparedStatement st = db.prepareStatement("INSERT INTO "+ table+" VALUES (?,?,?,?,?,?,?)");
        try {
            st.setString(1, part.getId());
            st.setString(2, part.geteFirstName());
            st.setString(3, part.geteLastName());

            st.executeUpdate();
        } finally {
            st.close();
        }
    }

    void deleteAllParticipants() throws SQLException {
        PreparedStatement st = db.prepareStatement("DELETE FROM "+table);
        try {
            st.executeUpdate();
        } finally {
            st.close();
        }
    }

    int getCount() throws SQLException {
        PreparedStatement st = db.prepareStatement("SELECT COUNT(*) FROM "+table);
        try {
            ResultSet rs = st.executeQuery();
            rs.next();
            return rs.getInt(1);
        } finally {
            st.close();
        }
    }
}
