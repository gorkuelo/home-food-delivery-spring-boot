$(document).ready(function(){
	$( ".result" ).hide();
    $.fn.order = function(orders){
        $.get( "orderHomeFood?orders="+orders, function( data ) {
        	$( ".result" ).show();
        	var resHtml = '';
        	var totalWithoutDiscounts = 0;
        	$.each( data.listDeliveries, function( key, value ) {
        		var calcPrecio = value.quantity * value.product.precio;
        		totalWithoutDiscounts = totalWithoutDiscounts + calcPrecio;
        		resHtml = resHtml + ('<p>' + value.quantity + ' ' + value.product.nombre + ' - Precio unidad: ' + value.product.precio + '€/' + value.product.unidad + ' - Precio total: ' + calcPrecio +'€ </p>');
        	});
        	$('#results').html(resHtml)
        	$('#totalWithoutDiscounts').text(totalWithoutDiscounts);
        	var resDiscountsHtml = '';
        	var totalWithDiscounts = 0;
        	$.each( data.listDeliveries, function( key, value ) {
        		totalWithDiscounts = totalWithDiscounts + value.price;
        		resDiscountsHtml = resDiscountsHtml + ('<p>' + value.quantity + ' ' + value.product.nombre + ' - Precio unidad: ' + value.product.precio + '€/' + value.product.unidad + ' - Precio total con descuentos: ' + value.price +'€ </p>');
        	});
        	var discountPercent = 0;
        	if (data.hasDiscount) {
        		discountPercent = totalWithDiscounts * 0.2;
        		resDiscountsHtml = resDiscountsHtml + ('<p>' + 'Descuento de 20% adicional por combinar plato principal, bebida y postre: - '  + discountPercent +'€ </p>');
        	}
        	$('#resultsDiscounts').html(resDiscountsHtml);
        	$('#totalWithDiscounts').text(totalWithDiscounts - discountPercent);
        });
    }
    $("#orderFood").click(function(){
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