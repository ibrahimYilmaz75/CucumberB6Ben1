package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Soru extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        // city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
        DBConnectionOpen();
        ResultSet rs = statement.executeQuery("select city from city");

        rs.last();
        int sonSatirNo=rs.getRow();

        for (int i = 0; i < sonSatirNo; i++) {
            rs.absolute(i);
            System.out.println(rs.getString("city"));
        }

        DBConnectionClose();
    }
}
