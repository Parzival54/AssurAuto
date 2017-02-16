/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.devis;

import bean.Connexion;
import controleur.ICommand;
import entite.Contrat;
import entite.Formule;
import entite.Utilisateur;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import rest.REST_Formule;

/**
 *
 * @author merguez
 */
public class CmdUtilisation implements ICommand {

    public CmdUtilisation() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        HttpSession httpSession = request.getSession(true);
        Connexion connexion = (Connexion) httpSession.getAttribute("connexion");
        if (connexion == null) {
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setNom(request.getParameter("nom"));
            utilisateur.setPrenom(request.getParameter("prenom"));
            utilisateur.setEmail(request.getParameter("mail"));
            httpSession.setAttribute("utilisateur", utilisateur);
        }

        REST_Formule rf = new REST_Formule();
        Formule formule = rf.find_JSON(Formule.class, request.getParameter("formule"));

        Contrat contrat = new Contrat();
        contrat.setFormule(formule);

        httpSession.setAttribute("contrat", contrat);
        httpSession.setAttribute("formule", formule);

        return "WEB-INF/devisutilisation.jsp";
    }

}
