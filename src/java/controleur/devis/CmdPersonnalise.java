/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.devis;

import controleur.ICommand;
import entite.Formule;
import entite.Frequence;
import entite.Kms;
import entite.Utilisateur;
import entite.Utilisation;
import entite.Vehicule;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import rest.REST_Frequence;
import rest.REST_Kms;
import rest.REST_Vehicule;

/**
 *
 * @author merguez
 */
public class CmdPersonnalise implements ICommand{

    public CmdPersonnalise() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("tokenDevis", httpSession.getId());
        Vehicule vehicule = (Vehicule) httpSession.getAttribute("vehicule");
        
        Utilisateur u = (Utilisateur) httpSession.getAttribute("utilisateur");
        
        REST_Frequence rf = new REST_Frequence();
        Frequence frequence = rf.find_JSON(Frequence.class, request.getParameter("frequence"));
        
        REST_Kms rk = new REST_Kms();
        Kms kms = rk.find_JSON(Kms.class, request.getParameter("kms"));
        
        Utilisation utilisation = new Utilisation();
        utilisation.setFrequence(frequence);
        utilisation.setKms(kms);
        utilisation.setTravail(Boolean.parseBoolean(request.getParameter("travail")));
        httpSession.setAttribute("utilisation", utilisation);
        
        String travail = request.getParameter("travail");
        String freq = Long.toString(frequence.getId());
        String k = Long.toString(kms.getId());
        
        Formule formule = (Formule) httpSession.getAttribute("formule");
        String form = Long.toString(formule.getId());
        
        REST_Vehicule rv = new REST_Vehicule();
        Double prime = rv.calculPrime(Double.class, Long.toString(vehicule.getId()), freq, k, travail, form);
        httpSession.setAttribute("prime", prime);
        
        return "WEB-INF/devisperso.jsp";
    }
    
    
    
}
