/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import bean.UtilisationBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import rest.REST_Vehicule;

/**
 *
 * @author merguez
 */
public class CmdPersonnalise implements ICommand{

    public CmdPersonnalise() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        Double coef = Double.parseDouble(request.getParameter("kms")) 
                * Double.parseDouble(request.getParameter("frequence"))
                * Double.parseDouble(request.getParameter("travail"));
        
        REST_Vehicule rv = new REST_Vehicule();
        request.setAttribute("prime",rv.calculPrime(Double.class, 1, coef));
        
        HttpSession httpSession = request.getSession();
        //httpSession.setAttribute("utilisationBean", utilisationBean);
        
        return "WEB-INF/devisperso.jsp";
    }
    
    
    
}
