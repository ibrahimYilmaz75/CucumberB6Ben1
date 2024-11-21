package _JDBC;

import java.sql.*;

public class _05_FirstLastGetRowgetType {
    public static void main(String[] args) {
        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select city from city");

            rs.last();  // son satıra götürüyor
            System.out.println("Son satır = " + rs.getString(1)); // son satır
            int kacinciSatirdayim = rs.getRow(); // sorgunun sonucunda dönen kayıt sayısı
            System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

            rs.first();
            System.out.println("ilk satır = " + rs.getString(1)); // ilk satır
            kacinciSatirdayim = rs.getRow(); // sorgunun sonucunda dönen kayıt sayısı
            System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
