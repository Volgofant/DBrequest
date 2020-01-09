import java.sql.*;

final class GetCountCustomersClub {
    private int count;

    int getCount() {
        return count;
    }

    GetCountCustomersClub() {
        final String url = "url";
        final String user = "user";
        final String password = "pass";
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

