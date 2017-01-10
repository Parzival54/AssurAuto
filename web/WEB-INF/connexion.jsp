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
        <tag:banniere active="0" connecte="${connexion}"/>

        <div id="headerwrap">
            <div id="formulaire" class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="col-lg-6">
                        <form id="devis" class="form-horizontal" action="Accueil" method="POST">
                            <input type="hidden" name="cmd" value="essaiCreationCompte"/>
                            <fieldset>

                                <legend>Créer un compte</legend>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="identifiant">Identifiant</label>
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
                                    <label class="col-md-4 control-label" for="password">Mot de passe</label>
                                    <div class="col-md-4">
                                        <input type="password" id="password" name="password" class="form-control">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="password2">Confirmer mot de passe</label>
                                    <div class="col-md-4">
                                        <input type="password2" id="password" name="password2" class="form-control">
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
                        <form id="devis" class="form-horizontal" action="Accueil" method="POST">
                            <input type="hidden" name="cmd" value="essaiConnexion"/>
                            <fieldset>

                                <legend>Se connecter</legend>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="identifiant">Identifiant</label>
                                    <div class="col-md-4">
                                        <input type="text" id="identifiant" name="identifiant" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="password">Mot de passe</label>
                                    <div class="col-md-4">
                                        <input type="password" id="password" name="password" class="form-control">
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
        <div id="footerwrap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <h4>A propos</h4>
                        <div class="hline-w"></div>
                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>
                    </div>
                    <div class="col-lg-4">
                        <h4>Réseaux sociaux</h4>
                        <div class="hline-w"></div>
                        <p>
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-tumblr"></i></a>
                        </p>
                    </div>
                    <div class="col-lg-4">
                        <h4>Où nous trouver</h4>
                        <div class="hline-w"></div>
                        <p>
                            Some Ave, 987,<br/>
                            23890, New York,<br/>
                            United States.<br/>
                        </p>
                    </div>

                </div><! --/row -->
            </div><! --/container -->
        </div><! --/footerwrap -->

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
