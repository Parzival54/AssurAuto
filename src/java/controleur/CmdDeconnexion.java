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

/**
 *
 * @author merguez
 */
public class CmdDeconnexion implements ICommand {

    public CmdDeconnexion() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Connexion connexion = new Connexion();
        connexion.setConnexion(false);
        String cmd = request.getParameter("cmd");
        System.out.println(cmd);
        HttpSession httpSession = request.getSession(false);
        httpSession.invalidate();
        return "WEB-INF/accueil.jsp";
    }

}
