var webSocketVehicule;
var wsUriVehicule = "ws://" + document.location.host + "/AssurAuto/formulairevehicule";

function chargermarque() {
    webSocketVehicule = new WebSocket(wsUriVehicule);
    webSocketVehicule.onopen = function () {
        webSocketVehicule.send(JSON.stringify({
            donnees: "marques",
            valeur: "",
            valeur2: ""
        }));
    };
    webSocketVehicule.onmessage = function (event) {
        var tab = JSON.parse(event.data);
        switch (tab[0].donnees) {
            case "marques":
                $('#marque').html('');
                $('#marque').html('<option value="0">--------------------------------------------</option>');
                for (elt in tab) {
                    $('#marque').append('<option>' + tab[elt].marque + '</option>');
                }
                $('#marque').attr('disabled', false);
                break;
            case "modeles":
                for (elt in tab) {
                    $('#modele').append('<option>' + tab[elt].modele + '</option>');
                }
                $('#modele').attr('disabled', false);
                $('#version').attr('disabled', true);
                break;
            case "versions":
                for (elt in tab) {
                    $('#version').append('<option>' + tab[elt].version + '</option>');
                }
                $('#version').attr('disabled', false);
                break;
            default:
                break;
        }
    };
}

chargermarque();

$('#marque').change(function () {
    $('#modele').html('<option value="0">--------------------------------------------</option>');
    $('#version').html('');
    webSocketVehicule.send(JSON.stringify({
        donnees: "modeles",
        valeur: $('#marque').val(),
        valeur2: ""
    }));
});

$('#modele').change(function () {
    $('#version').html('<option value="0">--------------------------------------------</option>');
    webSocketVehicule.send(JSON.stringify({
        donnees: "versions",
        valeur: $('#marque').val(),
        valeur2: $('#modele').val()
    }));
});

//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------

//$('#marque').change(function () {
//    $('#modele').html('<option value="0">--------------------------------------------</option>');
//    $('#version').html('');
//    var xhr = new XMLHttpRequest();
//
//    xhr.onreadystatechange = function () {
//        if (this.readyState === 4 && this.status === 200) {
//            // Récupération de la liste dans une variable String
//            // La méthode split permet de recréer le tableau
//            var tab = JSON.parse(this.responseText);
//
//            // Alimente le select "modele"
//            for (elt in tab) {
//                if (tab[elt].marque === $('#marque').val()
//                        && $('#modele').html().indexOf('<option>' + tab[elt].modele + '</option>') === -1) {
//                    $('#modele').append('<option>' + tab[elt].modele + '</option>');
//                }
//            }
//            $('#modele').attr('disabled', false);
//        }
//    };
//
//    xhr.open('POST', 'assets/json/voitures.json', false);
//    xhr.send();
//});

//$('#modele').change(function () {
//    $('#version').html('<option value="0">--------------------------------------------</option>');
//    var xhr = new XMLHttpRequest();
//
//    xhr.onreadystatechange = function () {
//        if (this.readyState === 4 && this.status === 200) {
//            // Récupération de la liste dans une variable String
//            // La méthode split permet de recréer le tableau
//            var tab = JSON.parse(this.responseText);
//
//            // Alimente le select "modele"
//            for (elt in tab) {
//                if (tab[elt].modele === $('#modele').val()
//                        && $('#version').html().indexOf('<option>' + tab[elt].version + '</option>') === -1) {
//                    $('#version').append('<option>' + tab[elt].version + '</option>');
//                }
//            }
//            $('#version').attr('disabled', false);
//        }
//    };
//
//    xhr.open('POST', 'assets/json/voitures.json', false);
//    xhr.send();
//});

$('#version').change(function () {
    if ($('#version').val().length > 0
            && $('#version').val() !== '<option value="0">--------------------------------------------</option>') {
        $('#validerVehicule').attr('disabled', false);
    }
});