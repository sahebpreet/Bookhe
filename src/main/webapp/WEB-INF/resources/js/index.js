$( function() {
	$("#search").keydown( function( event ) {
		if( event.keyCode == 13 && $('#search').val().trim()!= "") {
			$(location)[0].href="/Bookhe/search/" + $('#search').val().trim() + "/null";
		}
	});

	$(function() {

	    $("#loginForm input,textarea").jqBootstrapValidation({
	        preventSubmit: true,
	        submitError: function($form, event, errors) {
	            // additional error messages or events
	        },
	        submitSuccess: function($form, event) {
	            event.preventDefault();
	            var userName = $("input#login-email").val();
	            var password = $("input#login-password").val();
	            $.ajax({
	                url: "/Bookhe/login",
	                type: "POST",
	                dataType: "JSON",
	                data: {
	                    emailId: userName,
	                    password: password
	                },
	                cache: false,
	                success: function( data ) {
	                	console.log( data );
	                	if( data.success ) {
	                		location.reload();
	                	} else {
	                		// Fail message
		                    $('#login-result').html("<div class='alert alert-danger'>");
		                    $('#login-result > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
		                        .append("</button>");
		                    $('#login-result > .alert-danger').append("<strong>Sorry, it seems you entered a wrong Username or password. Please try again!!");
		                    $('#login-result > .alert-danger').append('</div>');
		                    //clear all fields
		                    $('#loginForm').trigger("reset");
	                		
	                	}
	                },
	                error: function( error ) {
	                    // Fail message
	                    $('#login-result').html("<div class='alert alert-danger'>");
	                    $('#login-result > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
	                        .append("</button>");
	                    $('#login-result > .alert-danger').append("<strong>Sorry, it seems you entered a wrong Username or password. Please try again!!");
	                    $('#login-result > .alert-danger').append('</div>');
	                    //clear all fields
	                    $('#loginForm').trigger("reset");
	                },
	            })
	        },
	        filter: function() {
	            return $(this).is(":visible");
	        },
	    });

	    $("a[data-toggle=\"tab\"]").click(function(e) {
	        e.preventDefault();
	        $(this).tab("show");
	    });
	});
});