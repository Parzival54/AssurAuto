/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClientBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author merguez
 */
public class ClientDAO {

    public static boolean verifierMotDePasse(String user, String password) throws SQLException {
        Connection connection = ConnectionMySQL.connecter();
        PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) FROM assurauto.client WHERE user = ? AND password = ?;");
        statement.setString(1, user);
        statement.setString(2, password);

        ResultSet rs = statement.executeQuery();
        rs.last();
        int nombreLignes = rs.getRow();

        rs.beforeFirst();
        ConnectionMySQL.deconnecter();

        if (nombreLignes == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void enregistrerClient(ClientBean client) throws SQLException {
        Connection connection = ConnectionMySQL.connecter();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO assurauto.client VALUES (?, ?, ?, ?, ?, ?);");
        statement.setString(1, client.getNom());
        statement.setString(2, client.getPrenom());
        statement.setString(3, client.getPseudo());
        statement.setString(4, client.getEmail());
        statement.setString(5, client.getPassword());

        ResultSet rs = statement.executeQuery();

        ConnectionMySQL.deconnecter();
    }

}
