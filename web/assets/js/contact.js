$('#commentaire').keyup(function () {
   var longueur =  $('#commentaire').val().length;
   $('#nbCar').html('Nombre de caractères : <span id="longueur">' + longueur + '/1000<span>');
   
   if ($('#commentaire').val().length > 1000){
       $('#longueur').css('color','red');
   } else {
       $('#longueur').css('color','black');
   }
   
});