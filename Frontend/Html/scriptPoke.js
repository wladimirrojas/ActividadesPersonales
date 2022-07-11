$(document).ready(function() {
    //peticion ajax
    //$.get('url', function(respuesta) {}, 'json'); formato de peticion get
    /*for (let i = 0; i < 2; i++) {
        $('.container').append('<img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/' + i + '.png" alt="imagen">');

    }*/
    for (let i = 1; i <= 898; i++) {

        $('.pokedex').append("<img id='" + i + "' src='https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + i + ".png' alt=''>")

    }

    $('img').click(function() {
        console.log("Hola");

    });

});