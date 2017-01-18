<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : connexion
    Created on : 2 janv. 2017, 15:44:02
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

        <div id="headerwrap" style="background-color: #428bca">
            <div id="formulaire" class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="col-lg-6">
                        <form id="creationClient" class="form-horizontal" action="Accueil" method="POST">
                            <input type="hidden" name="cmd" value="creationClient"/>
                            <fieldset>

                                <legend>Créer un compte</legend>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="identifiant">Identifiant</label>
                                    <div class="col-md-4">
                                        <input type="text" id="pseudo" name="pseudo" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="mail">E-mail</label>
                                    <div class="col-md-4">
                                        <input type="email" id="mail" name="mail" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="password">Mot de passe</label>
                                    <div class="col-md-4">
                                        <input type="password" id="password" name="password" class="form-control">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="password2">Confirmer mot de passe</label>
                                    <div class="col-md-4">
                                        <input type="password" id="password2" name="password2" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-lg-4 control-label" for="singlebutton"></label>
                                    <div class="col-lg-4">
                                        <button id="validerProfil" name="singlebutton" class="btn btn-theme" type="submit">Valider</button>
                                    </div>
                                </div>

                            </fieldset>
                        </form>
                    </div>
                    <div class="col-lg-6">
                        <form id="connexionClient" class="form-horizontal" action="Accueil" method="POST">
                            <input type="hidden" name="cmd" value="essaiConnexion"/>
                            <fieldset>

                                <legend>Se connecter</legend>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="identifiant">Identifiant</label>
                                    <div class="col-md-4">
                                        <input type="text" id="identifiant" name="identifiant" class="form-control" value="${identifiant}">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="password">Mot de passe</label>
                                    <div class="col-md-4">
                                        <input type="password" id="password" name="password" class="form-control" value="${password}">
                                    </div>
                                </div>

                                    <span style="color: red;">${erreur}</span>
                                <div class="form-group">
                                    <label class="col-lg-4 control-label" for="singlebutton"></label>
                                    <div class="col-lg-4">
                                        <button id="validerProfil" name="singlebutton" class="btn btn-theme" type="submit">Valider</button>
                                    </div>
                                </div>

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
        <script src="assets/js/jquery.js" type="text/javascript"></script>

    </body>
</html>
