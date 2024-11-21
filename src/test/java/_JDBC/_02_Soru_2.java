package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Soru_2 extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();
        ResultSet resultSet= statement.executeQuery("select * from city order by city desc");
        while (resultSet.next())
            System.out.println(resultSet.getString("city"));
        DBConnectionClose();
    }
}
