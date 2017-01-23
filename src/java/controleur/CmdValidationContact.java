/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import entite.Utilisateur;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entite.Contact;
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
        contact.setTypeDemande(Integer.parseInt(request.getParameter("demande")));
        contact.setEmail(request.getParameter("email"));
        contact.setDemande(request.getParameter("commentaire"));
        contact.setDateDemande(new Date());
        
        HttpSession session = request.getSession();
        
        if (session.getAttribute("utilisateur") != null){
            Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur");
            contact.setLogin(utilisateur.getLogin());
        } else {
            contact.setLogin("aucun");
        }
        request.setAttribute("contact", contact);
        
        REST_Contact rc = new REST_Contact();
        rc.create_JSON(contact);
                
        return "WEB-INF/contact.jsp";
    }
    
}