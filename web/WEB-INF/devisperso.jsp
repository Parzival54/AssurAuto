<%-- 
    Document   : devisperso
    Created on : 21 déc. 2016, 14:34:31
    Author     : merguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tag"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/assurAuto.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!-- Fixed navbar -->
        <tag:banniere active="2" connecte="${connexion.connexion}"/>


        <div id="headerwrap">
            <div id="formulaire" class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="tab-content panel">
                        <ul class="nav nav-pills nav-justified">
                            <li role="presentation" class="disabled"><a href="index.html">1. MON VEHICULE A ASSURER</a></li>
                            <li role="presentation" class="disabled"><a href="" class="disabled">2. MON PROFIL</a></li>
                            <li role="presentation" class="disabled"><a href="" class="disabled">3. MON UTILISATION</a></li>
                            <li role="presentation" class="active"><a href="" class="disabled">4. DEVIS PERSONNALISE</a></li>
                        </ul>
                    </div>
                    <div class="tab-content panel">

                        <form id="devis" class="form-horizontal" action="Devis" method="POST">
                            <div class="row">
                                <div class="col-lg-8 col-lg-offset-2">
                                    <span id="montarif">MON TARIF</span>
                                </div>
                                <table id="recap" border="1">
                                    <tbody>
                                        <tr>

                                            <td>
                                                <div id="souscrire" class="row">
                                                    <div class="col-lg-8">
                                                        <span style="font-size: 30px; color: black; font-weight: normal">Formule choisie : ${formule.libelle}<br/></span>
                                                        <span><fmt:formatNumber value="${prime}" minFractionDigits="2"/> € / mois TTC</span>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-lg-6 col-lg-offset-5">
                                                        <button type="submit" class="btn btn-primary btn-lg" name="cmd" value="souscrire">Souscrire en ligne</button>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <div id="enregistrer" class="row">
                                                    <div class="col-lg-8">
                                                        <span>Tarif valable 15 jours en enregistrant le devis</span>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-lg-6 col-lg-offset-5">
                                                        <button type="submit" class="btn btn-primary" name="cmd" value="enregistrer">Enregistrer le devis</button>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div id="findevisperso" class="row">
                                <div class="col-lg-4 col-lg-offset-8">
                                    <button type="submit" class="btn btn-primary" name="cmd" value="annuler">Annuler et revenir à l'accueil</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- *****************************************************************************************************************
         FOOTER
         ***************************************************************************************************************** -->
        <tag:footer/>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/retina-1.1.0.js"></script>
        <script src="assets/js/jquery.hoverdir.js"></script>
        <script src="assets/js/jquery.hoverex.min.js"></script>
        <script src="assets/js/jquery.prettyPhoto.js"></script>
        <script src="assets/js/jquery.isotope.min.js"></script>
        <script src="assets/js/custom.js"></script>
        <script src="assets/js/jquery.js" type="text/javascript"></script>

    </body>
</html>