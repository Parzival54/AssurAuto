/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import webservice.contact.Contact;

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
        
        HttpSession session = request.getSession();
        if (session.getAttribute("connexion") == ("true")){
            session.getAttribute("login");
        }
        request.setAttribute("contact", contact);
        create(contact);
                
        return "WEB-INF/contact.jsp";
    }

    private static void create(webservice.contact.Contact entity) {
        webservice.contact.ContactWebService_Service service = new webservice.contact.ContactWebService_Service();
        webservice.contact.ContactWebService port = service.getContactWebServicePort();
        port.create(entity);
    }
    
    
    
}
