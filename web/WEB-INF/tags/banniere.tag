<%@tag import="controleur.Accueil"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : banniere
    Created on : 21 déc. 2016, 11:41:43
    Author     : merguez
--%>

<%@tag description="banniere" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="active" required="true"%>
<%@attribute name="connecte" required="true"%>

<%-- any content can be specified here e.g.: --%>
<!-- Fixed navbar -->
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="javascript:;" onclick="document.getElementById('navaccueil').submit();">ASSUR'AUTO</a>
            <a href="javascript:;" onclick="document.getElementById('navaccueil').submit();">
                <img id="voiture_min" src="assets/img/assurAuto/voiture_accueil.svg" alt=""/>
            </a>
        </div>
        <div class="navbar-collapse collapse navbar-right">
            <ul class="nav navbar-nav">
                <c:if test="${active==1}">
                    <li class="active">
                    </c:if>
                    <c:if test="${active!=1}">
                    <li>
                    </c:if>
                    <form id="navaccueil" action="Accueil" method="POST">
                        <input type="hidden" name="cmd" value="accueil"/>
                    </form>
                    <a href="javascript:;" onclick="document.getElementById('navaccueil').submit();">ACCUEIL</a>
                </li>
                <c:if test="${active==2}">
                    <li class="active">
                    </c:if>
                    <c:if test="${active!=2}">
                    <li>
                    </c:if>

                    <form id="navdevis" action="Devis" method="POST">
                        <input type="hidden" name="cmd" value="devisvehicule"/>
                    </form>
                    <a href="javascript:;" onclick="document.getElementById('navdevis').submit();">DEVIS</a>
                </li>
                <c:if test="${active==3}">
                    <li class="active">
                    </c:if>
                    <c:if test="${active!=3}">
                    <li>
                    </c:if>
                    <form id="navcontact" action="Contact" method="POST">
                        <input type="hidden" name="cmd" value="contact"/>
                    </form>
                    <a href="javascript:;" onclick="document.getElementById('navcontact').submit();">CONTACT</a></li>
                <li class="dropdown">


                    <c:if test="${connecte==true}">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">MON COMPTE<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="single-post.html">CONTRATS</a></li>
                            <li><a href="" onclick="<% Accueil.deconnexion(); %>">DECONNEXION</a></li>
                            </c:if>

                        <c:if test="${connecte==false}">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">ESPACE CLIENT<b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <form id="connexion" action="Accueil" method="POST">
                                        <input type="hidden" name="cmd" value="connexion"/>
                                    </form>
                                    <a href="javascript:;" onclick="document.getElementById('connexion').submit();">CONNEXION</a></li>
                                </c:if>


                        </ul>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>