/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author merguez
 */
public class CmdMonCompte implements ICommand{

    public CmdMonCompte() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        return "WEB-INF/moncompte.jsp";
    }
    
}
