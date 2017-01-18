<%-- 
    Document   : accueil
    Created on : 21 déc. 2016, 12:03:57
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
        <tag:banniere active="1" connecte="${connexion.connexion}"/>

        <!-- *****************************************************************************************************************
         HEADERWRAP
         ***************************************************************************************************************** -->
        <div id="headerwrap">
            <div class="row">
                <div class="col-lg-2">
                </div>
                <div class="col-lg-8">
                    <h3>Bienvenue sur</h3>
                    <h1>ASSUR'AUTO</h1>
                    <h5>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</h5>
                    <h5>More Lorem Ipsum added here too.</h5>
                </div>
                <div class="col-lg-2">
                </div>
            </div><!-- /row -->
            <div class="row">
                <div class="col-lg-2">
                </div>
                <div class="col-lg-8">
                    <img id="voiture_accueil" src="assets/img/assurAuto/voiture_accueil.svg" class="img-responsive" alt="">
                </div>
            </div>
        </div><!-- /headerwrap -->
        
        <!-- *****************************************************************************************************************
         OUR CLIENTS
         ***************************************************************************************************************** -->
        <div id="cwrap">
            <div class="container">
                <div class="row centered">
                    <h3>NOS FORMULES D'ASSURANCE</h3>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <img src="assets/img/clients/client01.png" class="img-responsive">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <img src="assets/img/clients/client02.png" class="img-responsive">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <img src="assets/img/clients/client03.png" class="img-responsive">
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <img src="assets/img/clients/client04.png" class="img-responsive">
                    </div>
                </div><! --/row -->
            </div><! --/container -->
        </div><! --/cwrap -->

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
