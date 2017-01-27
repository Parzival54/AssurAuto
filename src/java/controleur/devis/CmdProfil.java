/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.devis;

import controleur.ICommand;
import entite.Vehicule;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import rest.REST_Vehicule;

/**
 *
 * @author merguez
 */
public class CmdProfil implements ICommand {

    public CmdProfil() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        REST_Vehicule rv = new REST_Vehicule();
        Vehicule vehicule = rv.find_JSON(Vehicule.class, request.getParameter("version"));
        HttpSession httpSession = request.getSession(true);
        httpSession.setAttribute("vehicule", vehicule);

        return "WEB-INF/devisprofil.jsp";
    }

}
