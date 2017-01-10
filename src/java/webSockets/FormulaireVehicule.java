/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webSockets;

import dao.VehiculeDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author merguez
 */
@ServerEndpoint("/formulairevehicule")
public class FormulaireVehicule {

    @OnMessage
    public String onMessage(String message) throws SQLException {
        JSONParser parser = new JSONParser();
        String donnees = "";
        String valeur = "";
        String valeur2 = "";
        String liste = "[";

        try {
            JSONObject obj = (JSONObject) parser.parse(message);
            donnees = (String) obj.get("donnees");
            valeur = (String) obj.get("valeur");
            valeur2 = (String) obj.get("valeur2");
        } catch (ParseException ex) {
            Logger.getLogger(FormulaireVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (donnees) {
            case "marques":
                List<String> marques = VehiculeDAO.listerMarques();
                for (String marque : marques) {
                    liste += "{\"donnees\":\"" + donnees + "\",\"marque\":\"" + marque + "\"},\n";
                }
                break;
            case "modeles":
                List<String> modeles = VehiculeDAO.listerModeles(valeur);
                for (String modele : modeles) {
                    liste += "{\"donnees\":\"" + donnees + "\",\"modele\":\"" + modele + "\"},\n";
                }
                break;
            case "versions":
                List<String> versions = VehiculeDAO.listerVersions(valeur,valeur2);
                for (String version : versions) {
                    liste += "{\"donnees\":\"" + donnees + "\",\"version\":\"" + (valeur + " " + valeur2 + " " + version).trim() + "\"},\n";
                }
                break;
            default:
                break;
        }
        liste = liste.substring(0, liste.length() - 2);
        return liste + "]";
    }

}
