$(document).ready(function(){
	$( ".result" ).hide();
    $.fn.order = function(orders){
        $.get( "orderHomeFood?orders="+orders, function( data ) {
        	$( ".result" ).show();
        	var resHtml = '';
        	$.each( data, function( key, value ) {
        		var calcPrecio = value.quantity * value.product.precio;
        		resHtml = resHtml + ('<p>' + value.quantity + ' ' + value.product.nombre + ' - Precio unidad: ' + value.product.precio + '€' + ' - Precio total: ' + calcPrecio +'€ </p>');
        	});
        	$('#results').html(resHtml)
        });
    }
    $("#searchButton").click(function(){
    	var orders = '',
    	index, orderField, existingIds;
    	existingIds = document.getElementsByName('existingIds');
    	index = 0
    	
    	while(index < existingIds.length){
    		orderField = $('#product_' + existingIds[index].value);
        	
    		if (orderField.val()){
    			orders += 'product_' + existingIds[index].value + 'number_' +orderField.val(); 	
    		}
    		index++;
    		
    	}
    	$.fn.order(orders);
    });
});