package _JDBC;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.*;

public class _01_Giris {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://demo.mersys.io:33906/sakila";
        String username="admin";
        String password="Techno24Study.%=";

        Connection connection= DriverManager.getConnection(url,username,password);

        Statement sorguEkrani= connection.createStatement();

        ResultSet sonucTablosu= sorguEkrani.executeQuery("select * from customer");

        sonucTablosu.next();
        String ad= sonucTablosu.getString("first_name");
        String soyad= sonucTablosu.getString("last_name");
        System.out.println("1. Satır ad ve soyad ="+ad+" "+ soyad);

        sonucTablosu.next();
        ad= sonucTablosu.getString("first_name");
        soyad= sonucTablosu.getString("last_name");
        System.out.println("2. Satır ad ve soyad ="+ad+" "+ soyad);


        connection.close();

    }
}
