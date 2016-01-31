$(document).ready(function(){
    setInterval(function() {
        $.get("https://t1f3ktfmy8.execute-api.us-west-2.amazonaws.com/prod/getdata", function(data){
            var jsonObj = JSON.parse(data);

            var items = jsonObj.Items;
            var row = "";
            $.each(items, function(index, value){
                row += "<tr><td> " + value.rName + "</td><td> " + value.numPeople + "</td><td>" + value.waitTime + "</td></tr>";
            });
            $("#locations").html(row);
        });
    }, 500 );
});