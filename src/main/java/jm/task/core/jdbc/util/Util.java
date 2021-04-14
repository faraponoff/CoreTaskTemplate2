package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

       public class Util {
           private static String url = "jdbc:mysql://localhost:3306/test";
           private static String user = "root";
           private static String pass = "root";
           public static Connection getConnection() throws SQLException {
               return DriverManager.getConnection(url, user, pass);
           }
       }
