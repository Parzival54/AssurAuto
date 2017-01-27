/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.contact;

import controleur.ICommand;
import entite.Utilisateur;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entite.Contact;
import entite.TypeDemande;
import rest.REST_Contact;

/**
 *
 * @author merguez
 */
public class CmdValidationContact implements ICommand{
        

    public CmdValidationContact() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        Contact contact = new Contact();
        TypeDemande typeDemande = new TypeDemande();
        typeDemande.setId(Long.parseLong(request.getParameter("demande")));
        contact.setTypeDemande(typeDemande);
        contact.setEmail(request.getParameter("email"));
        contact.setDemande(request.getParameter("commentaire"));
        contact.setDateDemande(new java.sql.Timestamp(new Date().getTime()));
        
        HttpSession session = request.getSession();
        
        if (session.getAttribute("utilisateur") != null){
            Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur");
            contact.setLogin(utilisateur.getLogin());
        } else {
            contact.setLogin("aucun");
        }
        request.setAttribute("contact", contact);
        
        if (session.getAttribute("tokenContact").equals(session.getAttribute("tokenSession"))){
        REST_Contact rc = new REST_Contact();
        rc.create_JSON(contact);
        session.setAttribute("tokenContact", session.getAttribute("tokenContact") + "tokenmodifie");
        }
                
        return "WEB-INF/contact.jsp";
    }
    
}