/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.devis;

import controleur.ICommand;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author merguez
 */
public class CmdAnnuler implements ICommand{

    public CmdAnnuler() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "WEB-INF/accueil.jsp";
    }
    
}
