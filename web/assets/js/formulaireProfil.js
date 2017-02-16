$('#nom').change(function(){
    if ($('#nom').val().length > 0 && $('#prenom').val().length > 0 && $('#mail').val().length > 0){
    $('#validerProfil').attr('disabled',false);
    }
});
$('#prenom').change(function(){
    if ($('#nom').val().length > 0 && $('#prenom').val().length > 0 && $('#mail').val().length > 0){
    $('#validerProfil').attr('disabled',false);
    }
});
$('#mail').change(function(){
    if ($('#nom').val().length > 0 && $('#prenom').val().length > 0 && $('#mail').val().length > 0){
    $('#validerProfil').attr('disabled',false);
    }
});

$(document).ready(function () {
    if ($('#nom').val().length > 0 && $('#prenom').val().length > 0 && $('#mail').val().length > 0){
    $('#validerProfil').attr('disabled',false);
    }
});