/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.moncompte;

import bean.Connexion;
import controleur.ICommand;
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
        HttpSession httpSession = request.getSession(false);
        httpSession.invalidate();
        return "WEB-INF/accueil.jsp";
    }

}
