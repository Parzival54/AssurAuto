/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.devis;

import controleur.ICommand;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author merguez
 */
public class CmdSouscrire implements ICommand{

    public CmdSouscrire() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        HttpSession httpSession = request.getSession();
        
        return "WEB-INF/accueil.jsp";
        
    }
    
}
