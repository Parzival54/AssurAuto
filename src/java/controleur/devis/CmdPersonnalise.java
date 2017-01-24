/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur.devis;

import controleur.ICommand;
import entite.Vehicule;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
        
        
        HttpSession httpSession = request.getSession();
        Vehicule vehicule = (Vehicule) httpSession.getAttribute("vehicule");
        
        Double coef = Double.parseDouble(request.getParameter("kms")) 
                * Double.parseDouble(request.getParameter("frequence"))
                * Double.parseDouble(request.getParameter("travail"));
        
        REST_Vehicule rv = new REST_Vehicule();
        Double prime = rv.calculPrime(Double.class, Integer.toString(vehicule.getId()), Double.toString(coef));
        NumberFormat formatter = new DecimalFormat("#0.00");
        httpSession.setAttribute("prime", formatter.format(prime));
        
        return "WEB-INF/devisperso.jsp";
    }
    
    
    
}
