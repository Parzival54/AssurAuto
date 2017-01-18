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

    <div id="headerwrap" style="background-color: #428bca">
        <div id="formulaire" class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <div class="col-lg-12">
                    <form id="creationClient" class="form-horizontal" action="Accueil" method="POST">
                        <input type="hidden" name="cmd" value="creationClient"/>
                        <fieldset>

                            <legend>Mon compte</legend>

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
            </div>
        </div>
    </div>

    <!-- *****************************************************************************************************************
    FOOTER
     ***************************************************************************************************************** -->
    <tag:footer/>

</body>
</html>
