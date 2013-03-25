package esad.chapter3.task3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: grisha_angelov
 */
public class CustomersInDB {
    Connection conn;

    Customer getCustomer(String IDNumber) throws SQLException {
        PreparedStatement st = conn.prepareStatement("select * from customer where ID=?");
        try {
            st.setString(1, replaceSymbolsInIdNumber(IDNumber));
            ResultSet rs = st.executeQuery();
            // ...
        } finally {
            st.close();
        }
        return new Customer();
    }

    void addCustomer(Customer customer) throws SQLException {
        PreparedStatement st = conn.prepareStatement("insert into customer values(?,?,?,?)");
        try {
            st.setString(1, replaceSymbolsInIdNumber(customer.getIDNumber()));
            st.setString(2, customer.getName());
            // ...
            st.executeUpdate();
            //  ...
        } finally {
            st.close();
        }
    }

    private String replaceSymbolsInIdNumber(String id) {
        return id.replace('-', ' ').replace('(', ' ').replace(')', ' ').replace('/', ' ');
    }

    private String replaceInId(String id) {
        String symbols = "-()/";
        for (int i = 0; i < symbols.length(); i++) {
            id = id.replace(symbols.charAt(i), ' ');
        }
        return id;
    }
}
