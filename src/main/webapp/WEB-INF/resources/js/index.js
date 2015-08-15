$( function() {
	$("#search").keydown( function( event ) {
		if( event.keyCode == 13 && $('#search').val().trim()!= "") {
			$(location)[0].href="/Bookhe/search/" + $('#search').val().trim() + "/null";
		}
	});
});