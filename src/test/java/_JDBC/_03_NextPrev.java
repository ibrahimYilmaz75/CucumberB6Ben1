package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrev extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();
        ResultSet resultSet = statement.executeQuery("select * from language");

        resultSet.next();
        System.out.println("1. Satır= " + resultSet.getString(2)); // 2 name ile aynı kolon ismi veya index

        resultSet.next();
        System.out.println("2. Satır= " + resultSet.getString(2));// Italian

        resultSet.next();
        System.out.println("3. Satır= " + resultSet.getString(2));


        resultSet.previous();
        System.out.println("1. Satır= " + resultSet.getString(2)); // English

        DBConnectionClose();
    }
}
