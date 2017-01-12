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

/**
 *
 * @author merguez
 */
public class VehiculeDAO {

    private static final EntityManager em = Persistence.createEntityManagerFactory("AssurAutoPU").createEntityManager();

    public static List<String> listerMarques() throws SQLException {
        
        List<String> marques = findAllMarque();
        
//        TypedQuery<String> query = em.createNamedQuery("vehicule.findAllMarque", String.class);
//        List<String> marques = query.getResultList();
        
        return marques;
    }

    public static List<String> listerModeles(String marque) throws SQLException {
        
        List<String> modeles = findAllModeleByMarque(marque);
        
//        TypedQuery<String> query = em.createNamedQuery("vehicule.findAllModele", String.class);
//                query.setParameter("marque", marque);
//        List<String> modeles = query.getResultList();
        
        return modeles;
    }

    public static List<String> listerVersions(String marque, String modele) throws SQLException {
        
        List<String> versions = findAllVersionByModele(marque, modele);
        
//        TypedQuery<String> query = em.createNamedQuery("vehicule.findAllVersion", String.class);
//                query.setParameter("marque", marque);
//                query.setParameter("modele", modele);
//        List<String> versions = query.getResultList();
        
        return versions;
    }

    private static java.util.List<java.lang.String> findAllMarque() {
        webservice.vehicule.VehiculeWebService_Service service = new webservice.vehicule.VehiculeWebService_Service();
        webservice.vehicule.VehiculeWebService port = service.getVehiculeWebServicePort();
        return port.findAllMarque();
    }

    private static java.util.List<java.lang.String> findAllModeleByMarque(java.lang.String arg0) {
        webservice.vehicule.VehiculeWebService_Service service = new webservice.vehicule.VehiculeWebService_Service();
        webservice.vehicule.VehiculeWebService port = service.getVehiculeWebServicePort();
        return port.findAllModeleByMarque(arg0);
    }

    private static java.util.List<java.lang.String> findAllVersionByModele(java.lang.String arg0, java.lang.String arg1) {
        webservice.vehicule.VehiculeWebService_Service service = new webservice.vehicule.VehiculeWebService_Service();
        webservice.vehicule.VehiculeWebService port = service.getVehiculeWebServicePort();
        return port.findAllVersionByModele(arg0, arg1);
    }

}
