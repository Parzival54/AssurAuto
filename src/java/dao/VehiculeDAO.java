/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author merguez
 */
public class VehiculeDAO {

    private static EntityManager em = Persistence.createEntityManagerFactory("AssurAutoPU").createEntityManager();

    public static List<String> listerMarques() throws SQLException {
        
        TypedQuery<String> query = em.createNamedQuery("vehicule.findAllMarque", String.class);
        List<String> marques = query.getResultList();
        
        return marques;
    }

    public static List<String> listerModeles(String marque) throws SQLException {
        
        TypedQuery<String> query = em.createNamedQuery("vehicule.findAllModele", String.class);
                query.setParameter("marque", marque);
        List<String> modeles = query.getResultList();
        
//        List<String> modeles = new ArrayList<>();
//        Connection connection = ConnectionMySQL.connecter();
//        PreparedStatement statement = connection.prepareStatement("SELECT DISTINCT modele FROM assurauto.vehicule WHERE marque = ?;");
//        statement.setString(1, marque);
//        ResultSet rs = statement.executeQuery();
//
//        while (rs.next()) {
//            modeles.add(rs.getString("modele"));
//        }
//        ConnectionMySQL.deconnecter();
        return modeles;
    }

    public static List<String> listerVersions(String marque, String modele) throws SQLException {
        
        TypedQuery<String> query = em.createNamedQuery("vehicule.findAllVersion", String.class);
                query.setParameter("marque", marque);
                query.setParameter("modele", modele);
        List<String> versions = query.getResultList();
        
//        List<String> versions = new ArrayList<>();
//        Connection connection = ConnectionMySQL.connecter();
//        PreparedStatement statement = connection.prepareStatement(""
//                + "SELECT CONCAT(marque,' ',modele,' ',version) AS version FROM assurauto.vehicule WHERE marque = ? AND modele = ?;");
//        statement.setString(1, marque);
//        statement.setString(2, modele);
//        ResultSet rs = statement.executeQuery();
//
//        while (rs.next()) {
//            versions.add(rs.getString("version"));
//        }
//        ConnectionMySQL.deconnecter();
        return versions;
    }

}
