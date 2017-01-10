/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author merguez
 */
public class ConnectionMySQL {

    private static Connection connection;

    private ConnectionMySQL() {
        String url = "jdbc:mysql://sebjouy.myds.me:5224/assurauto";
        String user = "assurauto";
        String password = "eDS4HPCi5Jy4XMDP";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Connection connecter() throws SQLException {
        if (connection == null || connection.isClosed()) {
            new ConnectionMySQL();
        }
        return connection;
    }

    public static void deconnecter() throws SQLException {
        connection.close();
    }

}
