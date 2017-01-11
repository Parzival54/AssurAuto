$('#commentaire').keypress(function () {
   var longueur =  $('#commentaire').html().length;
   $('#nbCar').html('Nombre de caractères : ' + longueur);
});