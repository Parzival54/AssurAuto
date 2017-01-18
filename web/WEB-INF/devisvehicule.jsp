<%-- 
    Document   : devis
    Created on : 20 déc. 2016, 15:26:22
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
                            <li role="presentation" class="active"><a href="">1. MON VEHICULE A ASSURER</a></li>
                            <li role="presentation" class="disabled"><a href="" class="disabled">2. MON PROFIL</a></li>
                            <li role="presentation" class="disabled"><a href="" class="disabled">3. MON UTILISATION</a></li>
                            <li role="presentation" class="disabled"><a href="" class="disabled">4. DEVIS PERSONNALISE</a></li>
                        </ul>
                    </div>
                    <div class="tab-content panel">
                        <form id="devis" class="form-horizontal" action="Devis" method="POST">
                            <input type="hidden" name="cmd" value="devisprofil"/>
                            <fieldset>

                                <legend>Choisissez votre véhicule</legend>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="marque">Marque</label>
                                    <div class="col-md-4">
                                        <select id="marque" name="marque" class="form-control" disabled>
                                            <option value="0">En cours de chargement</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-lg-4 control-label" for="modele">Modèle</label>
                                    <div class="col-lg-4">
                                        <select id="modele" name="modele" class="form-control" disabled>
                                            <option value="0"></option>
                                        </select>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-lg-4 control-label" for="version">Version</label>
                                    <div class="col-lg-4">
                                        <select id="version" name="version" class="form-control" disabled>
                                            <option value="0"></option>
                                        </select>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-lg-4 control-label" for="singlebutton"></label>
                                    <div class="col-lg-4">
                                        <button id="validerVehicule" name="singlebutton" class="btn btn-theme" type="submit" disabled>Valider</button>
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
        <script src="assets/js/formulaireVehicule.js" type="text/javascript"></script>

    </body>
</html>
