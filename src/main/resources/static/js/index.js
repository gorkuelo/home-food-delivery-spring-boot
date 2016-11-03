$(document).ready(function(){
    $.fn.search = function(dogs, cats, small, medium, big, searchText){
        alert('You have successfully defined the function!'); 
        $.get( "searchWithFilter", function( data ) {
        	  //$( ".result" ).html( data );
        	  alert( "Load was performed." );
        	});
    }
    $("#searchButton").click(function(){
    	var dogs, cats, small, medium, big, searchText;
    	dogs = $('#checkDogs').is(':checked');
    	cats = $('#checkCats').is(':checked');
    	small = $('#checkSmall').is(':checked');
    	medium = $('#checkMedium').is(':checked');
    	big  = $('#checkBig').is(':checked');
    	searchText = $('searchText').val();
        $.fn.search(dogs, cats, small, medium, big, searchText);
    });
});