import java.sql.*;

final class GetCountCustomersClub {
    private int count;

    int getCount() {
        return count;
    }

    GetCountCustomersClub() {
        final String url = "jdbc:mysql://192.168.48.54/bob_live";
        final String user = "shop-reader";
        final String password = "sMofX5QyjfrxdMDOivo4zoIuohR4pAYI";
        String query = "select count(*) from customer";
        try (Connection con = DriverManager.getConnection(url, user, password); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                count = rs.getInt(1);
                System.out.println("Total number customers on club : " + count);
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}

