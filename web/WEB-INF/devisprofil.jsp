<%-- 
    Document   : devisprofil
    Created on : 21 déc. 2016, 13:43:39
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
        <tag:banniere active="2" connecte="${connexion.connexion}"/>


        <div id="headerwrap">
            <div id="formulaire" class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="tab-content panel">
                        <ul class="nav nav-pills nav-justified">
                            <li role="presentation" class="disabled"><a href="index.html">1. MON VEHICULE A ASSURER</a></li>
                            <li role="presentation" class="active"><a href="" class="disabled">2. MON PROFIL</a></li>
                            <li role="presentation" class="disabled"><a href="" class="disabled">3. MON UTILISATION</a></li>
                            <li role="presentation" class="disabled"><a href="" class="disabled">4. DEVIS PERSONNALISE</a></li>
                        </ul>
                    </div>
                    <div class="tab-content panel">
                        <form id="devis" class="form-horizontal" action="Devis" method="POST">
                            <input type="hidden" name="cmd" value="devisutilisation"/>
                            <fieldset>

                                <legend>Saisissez votre profil</legend>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="nom">Nom</label>
                                    <div class="col-md-4">
                                        <input type="text" id="nom" name="nom" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="prenom">Prenom</label>
                                    <div class="col-md-4">
                                        <input type="text" id="prenom" name="prenom" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="mail">E-mail</label>
                                    <div class="col-md-4">
                                        <input type="text" id="mail" name="mail" class="form-control">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label class="col-lg-4 control-label" for="jeune">Formule</label>
                                    <div class="col-lg-4">
                                        <select id="jeune" name="formule" class="form-control">
                                            <option value="0">Toutes</option>
                                            <option value="1">1 - Tiers</option>
                                            <option value="2">2 - Tiers plus</option>
                                            <option value="3">3 - Tous risques</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-lg-4 control-label" for="singlebutton"></label>
                                    <div class="col-lg-4">
                                        <button id="validerProfil" name="singlebutton" class="btn btn-theme" type="submit" disabled>Valider</button>
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
        <script src="assets/js/formulaireProfil.js" type="text/javascript"></script>

    </body>
</html>