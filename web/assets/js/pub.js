var webSocketPub;
var wsUriPub = "ws://" + window.location.host + "/AssurAuto/pub";
webSocketPub = new WebSocket(wsUriPub);
var image;

webSocketPub.onmessage = function (event) {
    $('.pub').attr('src', 'assets/img/assurAuto/pub' + event.data + '.jpg')
            .attr('id', image);
    $('a[name=pub]').attr('href','pubs/pub' + event.data + '.html');
};

function pub() {
    image = parseInt($('.pub').attr('id'), 10) % 4 + 1;
    webSocketPub.send(image);
}

function Horloge() {
        var laDate = new Date();
        var heure,minute,seconde;
        if (laDate.getHours() < 10) {
            heure = "0" + laDate.getHours();
        } else {
            heure = laDate.getHours();
        }
        if (laDate.getMinutes() < 10) {
            minute = "0" + laDate.getMinutes();
        } else {
            minute = laDate.getMinutes();
        }
        if (laDate.getSeconds() < 10) {
            seconde = "0" + laDate.getSeconds();
        } else {
            seconde = laDate.getSeconds();
        }
        var h = heure + ":" + minute + ":" + seconde;
        $('#horloge').text(h);
}

setInterval(Horloge, 1000);

setInterval(pub, 5000);
