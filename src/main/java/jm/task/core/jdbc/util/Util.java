package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//public class Util {

 //   private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/test";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "root";
    //private static Connection connection;
    //?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    //public static Connection getConnection()//throws SQLException {
  //  {
//        try {
            //Class.forName(DRIVER);
          //  connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        //} catch (ClassNotFoundException | SQLException e) {
      //      e.printStackTrace();
    //    }
  //      return connection;

       // return DriverManager.getConnection(URL, USERNAME, PASSWORD);
   // }
//}
       public class Util {

           private final static String HOST = "jdbc:mysql://localhost:3306/test";
           private final static String USERNAME = "root";
           private final static String PASSWORD = "root";

           public Util() {

           }

           public static Connection getConnection() throws SQLException {

               return DriverManager.getConnection(HOST, USERNAME, PASSWORD);
           }
       }
