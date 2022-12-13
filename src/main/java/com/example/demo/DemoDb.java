package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoDb {
    public static BookModel getModel(int id) {
        Connection c;
        try {
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookdb", "user", "password");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM books WHERE BookID=" + id + " LIMIT 1");
            rs.next();
            BookModel bk = new BookModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
            c.close();
            return bk;
        } catch (SQLException e) {
            System.out.println("ERROR !!! " + e);
        }
        return null;
    }
    
    public static BookModel[] getModelList(String opt) {
        Connection c;
        try {
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookdb", "user", "password");
            Statement s = c.createStatement();
            ResultSet rs;
            if ( opt.equals("rating")) {
                rs = s.executeQuery("SELECT * FROM books ORDER BY Rating DESC LIMIT 6");
            } else if ( opt.equals("downloads"))  {
                rs = s.executeQuery("SELECT * FROM books ORDER BY Downloads DESC LIMIT 6");
            } else {
                rs = s.executeQuery("SELECT * FROM books ORDER BY RAND() LIMIT 6");
            }
            BookModel[] bk = new BookModel[10];
            int i=0;
            while ( rs.next() ) {
                bk[i] = new BookModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
                i++;
            }
            c.close();
            return bk;
        } catch (SQLException e) {
            System.out.println("ERROR !!! " + e);
        }
        return null;
    }
}
