/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tarmp
 */
public class ConclassDB {

    private String Driver = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost/webimay?useUnicode=yes&characterEncoding=UTF-8";
    private String Username = "root";
    private String Pass = "1234";

    public Connection Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConnection = DriverManager.getConnection(URL, Username, Pass);

            return myConnection;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConclassDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
