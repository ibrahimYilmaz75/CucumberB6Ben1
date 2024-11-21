package _JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _10_Soru extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();
        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        int kolonSayisi = rsmd.getColumnCount();

        for (int i = 1; i <=kolonSayisi ; i++) {
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        while (rs.next())
        {
            for (int i = 1; i <= kolonSayisi; i++) {
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }




        DBConnectionClose();
    }
}
