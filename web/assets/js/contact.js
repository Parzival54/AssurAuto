$('#commentaire').keyup(function () {
   var longueur =  $('#commentaire').val().length;
   $('#nbCar').html('Nombre de caractères : <span id="longueur">' + longueur + '/1000<span>');
   
   if ($('#commentaire').val().length > 1000){
       $('#longueur').css('color','red');
   } else {
       $('#longueur').css('color','black');
   }
   
});

function desactiver() {
    if ($('input[name=cmd]').val() === 'accueil'){
        $('#email').prop('disabled',false);
        $('#commentaire').prop('disabled',false);
    } else {
        $('#email').prop('disabled',true);
        $('#commentaire').prop('disabled',true);
    }
    alert($('input[name=cmd]').val());
}

desactiver();

