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

/**
 *
 * @author merguez
 */
public class CmdPersonnalise implements ICommand{

    public CmdPersonnalise() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        UtilisationBean utilisationBean = new UtilisationBean();
        utilisationBean.setKms(request.getParameter("kms"));
        utilisationBean.setFrequence(request.getParameter("frequence"));
        utilisationBean.setTravail(request.getParameter("travail"));
        
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("utilisationBean", utilisationBean);
        
        return "WEB-INF/devisperso.jsp";
    }
    
    
    
}
