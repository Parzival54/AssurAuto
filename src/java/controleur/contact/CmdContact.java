/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.contact;

import controleur.ICommand;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author merguez
 */
public class CmdContact implements ICommand{

    public CmdContact() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        HttpSession session = request.getSession();
        session.setAttribute("tokenContact", session.getAttribute("tokenSession"));
        
        return "WEB-INF/contact.jsp";
    }
    
}
