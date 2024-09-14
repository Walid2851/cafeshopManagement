package com.example.demo4;

import java.sql.Connection;
import java.sql.DriverManager;


public class database {

    public static Connection connectDB() {

        try {

            Class.forName( "com.mysql.cj.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/cafe", "root", ""); // LINK YOUR DATABASE
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}