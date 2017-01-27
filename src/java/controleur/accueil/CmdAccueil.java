/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.accueil;

import controleur.ICommand;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author merguez
 */
public class CmdAccueil implements ICommand{

    public CmdAccueil() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        HttpSession session = request.getSession();
        String tokenSession = session.getId();
        session.setAttribute("tokenSession", tokenSession);
        
        return "WEB-INF/accueil.jsp";
    }
    
}
