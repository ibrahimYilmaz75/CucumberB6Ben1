package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _07_Soru extends JDBCParent{
    //city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();
        ResultSet rs = statement.executeQuery("select city from city");
        rs.last();
        int sonSatir= rs.getRow();
        rs.first();
        for (int i = 0; i < sonSatir; i++) {
            rs.relative(i);
            System.out.println(rs.getString("city"));
        }

        DBConnectionClose();
    }
}
