package esad.chapter3.task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: grisha_angelov
 */
public class FoodSalesReport {
    int riceTotalQuantity;
    int noodleTotalQuantity;
    int drinkTotalQuantity;
    int dessertTotalQuantity;

    public void loadReport(Connection conn) throws SQLException {
        PreparedStatement st = conn.prepareStatement("select " +
                "sum(case when foodType=0 then qty else 0 end) as riceTotalQuantity," +
                "sum(case when foodType=1 then qty else 0 end) as noodleTotalQuantity," +
                "sum(case when foodType=2 then qty else 0 end) as drinkTotalQuantity," +
                "sum(case when foodType=3 then qty else 0 end) as dessertTotalQuantity " +
                "from foodSalesTable group by foodType");
        try {
            ResultSet rs = st.executeQuery();
            try {
                rs.next();
                riceTotalQuantity = rs.getInt("riceTotalQuantity");
                noodleTotalQuantity = rs.getInt("noodleTotalQuantity");
                drinkTotalQuantity = rs.getInt("drinkTotalQuantity");
                dessertTotalQuantity = rs.getInt("dessertTotalQuantity");
            } finally {
                rs.close();
            }
        } finally {
            st.close();
        }
    }
}
