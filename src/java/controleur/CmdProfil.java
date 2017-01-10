/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import entite.VehiculeEntite;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author merguez
 */
public class CmdProfil implements ICommand{

    public CmdProfil(){
    }
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        VehiculeEntite vehiculeEntite = new VehiculeEntite();
        vehiculeEntite.setMarque(request.getParameter("marque"));
        vehiculeEntite.setModele(request.getParameter("modele"));
        vehiculeEntite.setVersion(request.getParameter("version"));
        
        HttpSession httpSession = request.getSession(true);
        httpSession.setAttribute("vehiculeEntite", vehiculeEntite);
        
        return "WEB-INF/devisprofil.jsp";
    }
    
}
