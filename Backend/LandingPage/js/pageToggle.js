$(document).ready(function() {
    $("#tableView").on('click', function() {
        $("#map").css("display", 'none');
        $("#table").style.display = '';
    });

    $("#mapView").on('click', function() {
        $("#table").hide();
        $("#map").css("display", "block");
    });
});