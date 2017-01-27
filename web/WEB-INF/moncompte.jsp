<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : moncompte
    Created on : 18 janv. 2017, 16:28:34
    Author     : merguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tag"%>
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
    <tag:banniere active="0" connecte="${connexion.connexion}"/>

    <div id="headerwrap" style="background-color: #428bca;">
        <div id="formulaire" class="row" style="min-height: 60vh;">
            <div class="col-lg-8 col-lg-offset-2">
                <div class="col-lg-12">
                    <form id="creationClient" class="form-horizontal" action="Accueil" method="POST">
                        <input type="hidden" name="cmd" value="creationClient"/>
                        <fieldset>

                            <legend>Mon compte</legend>
                            
                            <table id="infosClient" border="1" style="width: 80%; margin-left: 10%; margin-right: 10%; margin-top: 10%">
                                <thead>
                                    <tr>
                                        <th style="width: 20%"></th>
                                        <th style="width: 80%"></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Identifiant :</td>
                                        <td>${utilisateur.login}</td>
                                    </tr>
                                    <tr>
                                        <td>E-mail :</td>
                                        <td>${utilisateur.email}</td>
                                    </tr>
                                    <tr>
                                        <td>Mot de passe :</td>
                                        <td><button class="btn btn-theme">Modifier</button></td>
                                    </tr>
                                    <tr>
                                        <td>Contrats :</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td>Devis :</td>
                                        <td></td>
                                    </tr>
                                </tbody>
                            </table>
                        </fieldset>
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

</body>
</html>
