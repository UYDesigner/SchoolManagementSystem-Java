package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {

      static Connection connection = null ;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/schoolmanagement",
                    "root",
                    "8982008982nicky"
            );
            System.out.println("connection ho gya....");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection()
    {
      if(connection != null)
      {
          try {
              connection.close();
              System.out.println("connection closed...");
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
    }

//    public static void main(String[] args) {
//        MyConnection.getConnection();
//        MyConnection.closeConnection();
//    }


}
