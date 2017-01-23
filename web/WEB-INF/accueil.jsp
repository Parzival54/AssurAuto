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
                    <h5>Il est actuellement</h5>
                    <h5 id='horloge'></h5>
                </div>
                <div class="col-lg-2">
                </div>
            </div><!-- /row -->
            <div class="row">
                <div class="col-lg-2">
                    <a name="pub" target="_blank" href="pubs/pub1.html"><img class="pub" id="1" src="assets/img/assurAuto/pub1.jpg" alt=""/></a>
                </div>
                <div class="col-lg-8">
                    <img id="voiture_accueil" src="assets/img/assurAuto/voiture_accueil.svg" class="img-responsive" alt="">
                </div>
                <div class="col-lg-2">
                    <a name="pub" target="_blank" href="pubs/pub1.html"><img class="pub" id="1" src="assets/img/assurAuto/pub1.jpg" alt=""/></a>
                </div>
            </div>
            <div class="row" style="height: 50px">
                
            </div>
        </div><!-- /headerwrap -->

        <!-- *****************************************************************************************************************
         OUR CLIENTS
         ***************************************************************************************************************** -->
        <div id="cwrap">
            <div class="container">
                <div class="row centered">
                    <h3>NOS FORMULES D'ASSURANCE</h3>
                    <div class="col-lg-12 col-md-12 col-sm-12 panel panel-default">
                        <fieldset>
                            <table id="formules" class="table" style="width: 100%;">
                                <thead>
                                    <tr>
                                        <th style="width: 25%; text-align: center"></th>
                                        <th style="width: 25%; text-align: center">Assurance au tiers</th>
                                        <th style="width: 25%; text-align: center">Assurance au tiers plus</th>
                                        <th style="width: 25%; text-align: center">Assurance tous risques</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Responsabilité civile</td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Assistance</td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Protection juridique</td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Bris de pare brise</td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Bris de toutes vitres</td>
                                        <td></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Vol du véhicule</td>
                                        <td></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Vol des éléments et accessoires</td>
                                        <td></td>
                                        <td></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Incendie</td>
                                        <td></td>
                                        <td></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Panne mécanique</td>
                                        <td></td>
                                        <td></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Véhicule de remplacement</td>
                                        <td></td>
                                        <td></td>
                                        <td><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
                                    </tr>
                                    <tr>
                                        <td>Indemnisation valeur d'achat</td>
                                        <td></td>
                                        <td></td>
                                        <td>jusqu'à 36 mois</td>
                                    </tr>
                                </tbody>
                            </table>

                        </fieldset>
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
        <script src="assets/js/pub.js" type="text/javascript"></script>

    </body>
</html>
