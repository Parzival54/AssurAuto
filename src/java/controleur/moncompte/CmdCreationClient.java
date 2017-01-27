/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.moncompte;

import controleur.ICommand;
import entite.Utilisateur;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.DigestUtils;
import rest.REST_Utilisateur;

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
        utilisateur.setLogin(request.getParameter("pseudo"));
        utilisateur.setEmail(request.getParameter("mail"));
        utilisateur.setPassword(DigestUtils.sha1Hex(request.getParameter("password")));
        
        REST_Utilisateur ru = new REST_Utilisateur();
        ru.create_JSON(utilisateur);
        return "WEB-INF/accueil.jsp";
    }

}
