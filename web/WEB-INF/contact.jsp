<%-- 
    Document   : contact
    Created on : 21 déc. 2016, 11:27:39
    Author     : merguez
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <tag:banniere active="3" connecte="${connexion.connexion}"/>

        <div id="headerwrap">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <form id="devis" class="form-horizontal" action="ContactUs" method="POST">
                        <c:choose>
                            <c:when test="${empty contact}">
                                <input type="hidden" name="cmd" value="validationContact"/>
                            </c:when>
                            <c:otherwise>
                                <input type="hidden" name="cmd" value="accueil"/>
                            </c:otherwise>
                        </c:choose>

                        <fieldset>

                            <legend>Fiche de contact</legend>

                            <div class="form-group">
                                <label class="col-md-2 control-label" for="demande">Objet de la demande :</label>
                                <div class="col-md-8">
                                    <select class="input-lg"  style="width: 100%" id="marque" name="demande" class="form-control">
                                        <option value="1">Demande de devis</option>
                                        <option value="2">Reporter un bug</option>
                                        <option value="3">Autre demande</option>
                                    </select>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-lg-2 control-label" for="texte">Votre email :</label>
                                <div class="col-lg-8">
                                    <c:if test="${empty contact.email}" var="email" scope="session">
                                        <input class="input-lg" style="width: 100%" type="email" id="email" value="${utilisateur.email}" name="email"/>
                                    </c:if>
                                    <c:if test="${!empty contact.email}" var="email" scope="session">
                                        <input class="input-lg" style="width: 100%" type="email" id="email" value="${contact.email}" name="email"/>
                                    </c:if>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-lg-2 control-label" for="texte">Votre texte :</label>
                                <div class="col-lg-8">
                                    <textarea class="input-lg" id="commentaire" name="commentaire" style="width: 100%; height: 200px;">${contact.demande}</textarea>
                                    <span id="nbCar" style="float: left;">Nombre de caractères : 0/1000</span>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-lg-4 control-label" for="singlebutton"></label>
                                <div class="col-lg-4">
                                    <c:choose>
                                        <c:when test="${!empty contact}">
                                            <span style="color: green">Demande envoyée</span>
                                            <button id="validerVehicule" name="singlebutton" class="btn btn-theme">Retour accueil</button>
                                        </c:when>
                                        <c:otherwise>
                                            <button id="validerVehicule" name="singlebutton" class="btn btn-theme">Valider</button>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>

                        </fieldset>
                    </form>
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
        <script src="assets/js/contact.js" type="text/javascript"></script>

    </body>
</html>
