/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.devis;

import controleur.ICommand;
import entite.Contrat;
import entite.Formule;
import entite.Utilisateur;
import entite.Utilisation;
import entite.Vehicule;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import rest.REST_Contrat;

/**
 *
 * @author merguez
 */
public class CmdEnregistrer implements ICommand{

    public CmdEnregistrer() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        HttpSession httpSession = request.getSession();
        
        Contrat contrat = new Contrat();
        contrat.setActif(Boolean.FALSE);
        contrat.setDateCreation(new java.sql.Timestamp(new Date().getTime()));
        contrat.setTarif((Double) httpSession.getAttribute("prime"));
        contrat.setFormule((Formule) httpSession.getAttribute("formule"));
        contrat.setUtilisateur((Utilisateur) httpSession.getAttribute("utilisateur"));
        contrat.setUtilisation((Utilisation) httpSession.getAttribute("utilisation"));
        contrat.setVehicule((Vehicule) httpSession.getAttribute("vehicule"));
        
        if (httpSession.getAttribute("tokenDevis").equals(httpSession.getAttribute("tokenSession"))){
        REST_Contrat rc = new REST_Contrat();
        rc.create_JSON(contrat);
        httpSession.setAttribute("tokenDevis", httpSession.getAttribute("tokenDevis") + "tokenmodifie");
        }
        
        return "WEB-INF/devisenregistre.jsp";
    }
    
}
