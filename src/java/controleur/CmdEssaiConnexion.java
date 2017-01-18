/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import bean.Connexion;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import webservice.utilisateur.Utilisateur;

/**
 *
 * @author merguez
 */
public class CmdEssaiConnexion implements ICommand{

    public CmdEssaiConnexion() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        Boolean connecte = verifier(request.getParameter("identifiant"), request.getParameter("password"));
        if (connecte){
            Connexion connexion = new Connexion();
            connexion.setConnexion(true);
            Utilisateur utilisateur;
            utilisateur = findByLogin(request.getParameter("identifiant"));
            HttpSession httpSession = request.getSession(false);
            httpSession.setAttribute("connexion", connexion);
            httpSession.setAttribute("utilisateur", utilisateur);
            return "WEB-INF/accueil.jsp";
        } else {
            String erreur = "Erreur identification";
            request.setAttribute("erreur", erreur);
            request.setAttribute("identifiant", request.getParameter("identifiant"));
            request.setAttribute("password", request.getParameter("password"));
            return "WEB-INF/connexion.jsp";
        }
    }

    private static Boolean verifier(java.lang.String login, java.lang.String password) {
        webservice.utilisateur.UtilisateurWebService_Service service = new webservice.utilisateur.UtilisateurWebService_Service();
        webservice.utilisateur.UtilisateurWebService port = service.getUtilisateurWebServicePort();
        return port.verifier(login, password);
    }

    private static Utilisateur findByLogin(java.lang.String login) {
        webservice.utilisateur.UtilisateurWebService_Service service = new webservice.utilisateur.UtilisateurWebService_Service();
        webservice.utilisateur.UtilisateurWebService port = service.getUtilisateurWebServicePort();
        return port.findByLogin(login);
    }
    
    
    
}
