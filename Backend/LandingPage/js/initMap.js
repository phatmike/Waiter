var mapOptions = {
    center: {lat: 35.84716, lng: -86.36569},
    zoom: 1
};

function initMap(){
    var map = new google.maps.Map(document.getElementById('map'), mapOptions);
}