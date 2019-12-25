import java.sql.*;

final class GetCountCustomersShop {
    private int count;

    int getCount() {
        return count;
    }

    GetCountCustomersShop() {
        final String url = "jdbc:mysql://192.168.65.5/shop";
        final String user = "readonly";
        final String password = "CeA~Av/Zau";
        String query = "select count(*) from customer";
        try (Connection con = DriverManager.getConnection(url, user, password); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                count = rs.getInt(1);
                System.out.println("Total number customers on shop : " + count);
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}

