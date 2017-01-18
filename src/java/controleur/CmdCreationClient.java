/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.DigestUtils;
import webservice.utilisateur.Utilisateur;

/**
 *
 * @author merguez
 */
public class CmdCreationClient implements ICommand {

    public CmdCreationClient() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(Integer.MIN_VALUE);
        utilisateur.setLogin(request.getParameter("pseudo"));
        utilisateur.setEmail(request.getParameter("mail"));
        utilisateur.setPassword(DigestUtils.sha1Hex(request.getParameter("password")));
        System.out.println(DigestUtils.sha1Hex(request.getParameter("password")).length());
        create(utilisateur);
        return "WEB-INF/accueil.jsp";
    }

    private static void create(webservice.utilisateur.Utilisateur entity) {
        webservice.utilisateur.UtilisateurWebService_Service service = new webservice.utilisateur.UtilisateurWebService_Service();
        webservice.utilisateur.UtilisateurWebService port = service.getUtilisateurWebServicePort();
        port.create(entity);
    }

}
