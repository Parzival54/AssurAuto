/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.moncompte;

import bean.Connexion;
import controleur.ICommand;
import entite.Utilisateur;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.digest.DigestUtils;
import rest.REST_Utilisateur;

/**
 *
 * @author merguez
 */
public class CmdEssaiConnexion implements ICommand{

    public CmdEssaiConnexion() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        REST_Utilisateur ru = new REST_Utilisateur();
        Boolean connecte = Boolean.valueOf(
                ru.verifier(String.class,
                        request.getParameter("identifiant"),
                        DigestUtils.sha1Hex(request.getParameter("password")))
        );
        if (connecte){
            Connexion connexion = new Connexion();
            connexion.setConnexion(true);
            Utilisateur utilisateur;
            utilisateur = ru.findByLogin_JSON(Utilisateur.class, request.getParameter("identifiant"));
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
    
}