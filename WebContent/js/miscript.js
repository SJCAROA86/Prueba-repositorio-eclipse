/**
 * Esto es para la documentación
 */

// alert ("Bienvenido");
console.log("pagina cargada");

$(document).ready(function() {

	$("#miboton").on("click", function() {

		alert("hola");
		//$("form").css({'background-color' : 'orange'});
		
			
		//$("#miboton").css({'background-color' : 'green', 'color' : 'white'}); 
			
		//$(this).addClass('mi-boton-clase');
		
		//$(".contenedor").remove();
		
		//$(".contenedor").addClass('nuevo');
		//$(".contenedor").removeClass('contenedor');
		
		$( ".contenedor" ).on( "mouseenter", function(){
			$(this).addClass('nuevo').removeClass('contenedor');
		});
		
		$( ".contenedor" ).on( "mouseleave", function(){
			$(this).addClass('contenedor').removeClass('nuevo');
		});

	});
	
	$("miboton2").on("click", function(){
		$( ".contenedor" ).of( "click", function(){
			S
		});
		
		
	});
	
});