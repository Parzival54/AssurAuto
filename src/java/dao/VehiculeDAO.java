/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import rest.REST_Vehicule;

/**
 *
 * @author merguez
 */
public class VehiculeDAO {

    private static final EntityManager em = Persistence.createEntityManagerFactory("AssurAutoPU").createEntityManager();
    private static final REST_Vehicule rv = new REST_Vehicule();
    private static final JSONParser parser = new JSONParser();

    public static List<String> listerMarques() throws SQLException {

        List<String> marques = new ArrayList<>();
        try {
            String resultat = rv.findAllMarques_JSON(String.class);
            Object object = parser.parse(resultat);
            JSONArray resultats = (JSONArray) object;

            for (Object o : resultats) {
                JSONObject jso = (JSONObject) o;
                marques.add((String) jso.get("marque"));
            }

        } catch (ParseException ex) {
            Logger.getLogger(VehiculeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return marques;
    }

    public static List<String> listerModeles(String marque) throws SQLException {

        List<String> modeles = new ArrayList<>();
        try {
            String resultat = rv.findAllModelesByMarque_JSON(String.class, marque);
            Object object = parser.parse(resultat);
            JSONArray resultats = (JSONArray) object;

            for (Object o : resultats) {
                JSONObject jso = (JSONObject) o;
                modeles.add((String) jso.get("modele"));
            }

        } catch (ParseException ex) {
            Logger.getLogger(VehiculeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return modeles;
    }

    public static List<String> listerVersions(String marque, String modele) throws SQLException {

        List<String> versions = new ArrayList<>();
        try {
            String resultat = rv.findAllVersionByModele_JSON(String.class, marque, modele);
            Object object = parser.parse(resultat);
            JSONArray resultats = (JSONArray) object;

            for (Object o : resultats) {
                JSONObject jso = (JSONObject) o;
                versions.add((String) jso.get("version"));
            }

        } catch (ParseException ex) {
            Logger.getLogger(VehiculeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return versions;

    }

}
