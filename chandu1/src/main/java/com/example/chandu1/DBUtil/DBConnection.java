package com.example.chandu1.DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
     static Connection con;
    public static Connection createDBConnection()  {
        try {
            String url = "jdbc:mysql://chandudb.ct8cpiavredm.us-east-2.rds.amazonaws.com:3306/chandu?useSSL=false";
            String user = "admin";
            String password = "Chandupriya9133";
           con= DriverManager.getConnection(url,user,password);
           System.out.println("con is "+con);
            }
            catch (Exception ex){
                ex.printStackTrace();
            }

        return con;
    }


}
