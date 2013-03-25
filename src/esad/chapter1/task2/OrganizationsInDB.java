package esad.chapter1.task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: grisha_angelov
 */
public class OrganizationsInDB {
    Connection db;

    OrganizationsInDB() throws ClassNotFoundException, SQLException {
        db = new PostgreConnectionProvider().getConnection("ConferenceDB","PaulChan","myP@ssword");
    }

    void addOrganization(Organization org) throws SQLException {
        PreparedStatement st =
                db.prepareStatement("INSERT INTO organizations VALUES (?,?,?,?,?,?,?,?,?,?,)");
        try {
            st.setString(1, org.getId());
            st.setString(2, org.getEName());
            st.setString(3, org.getCName());
            st.executeUpdate();
        } finally {
            st.close();
        }
    }
}
