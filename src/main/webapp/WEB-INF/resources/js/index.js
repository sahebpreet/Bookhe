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
	                	if( data.success ) {
	                		$(location).attr('href', '/Bookhe/userProfile');
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
	            });
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

	$(function() {
	    $("#registerForm input,textarea").jqBootstrapValidation({
	        preventSubmit: true,
	        submitError: function($form, event, errors) {
	            // additional error messages or events
	        },
	        submitSuccess: function($form, event) {
	            event.preventDefault();
	            var fullName = $("input#name").val();
	            var street = $("input#street").val();
	            var city = $("input#city").val();
	            var state = $("input#state").val();
	            var contactno = $("input#contactno").val();
	            var emailId = $("input#email").val();
	            var password = $("input#password").val();

	            $.ajax({
	                url: "/Bookhe/register",
	                type: "POST",
	                dataType: "JSON",
	                data: {
	                	fullName: fullName,
	                	street: street,
	                	city: city,
	                	state: state,
	                	contactno: contactno,
	                    emailId: emailId,
	                    password: password
	                },
	                cache: false,
	                success: function( data ) {
	                	console.log( data );
	                	if( data.success ) {
	                		$(location).attr('href', '/Bookhe/userProfile');
	                	} else {
	                		// Fail message
		                    $('#register-result').html("<div class='alert alert-danger'>");
		                    $('#register-result > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
		                        .append("</button>");
		                    $('#register-result > .alert-danger').append("<strong>Sorry, registration failed. Please try again!!");
		                    $('#register-result > .alert-danger').append('</div>');
		                    //clear all fields
		                    $('#registerForm').trigger("reset");
	                	}
	                },
	                error: function( error ) {
	                    // Fail message
	                	$('#register-result').html("<div class='alert alert-danger'>");
	                    $('#register-result > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
	                        .append("</button>");
	                    $('#register-result > .alert-danger').append("<strong>Sorry, it seems we encountered a server error. Please try again!!");
	                    $('#register-result > .alert-danger').append('</div>');
	                    //clear all fields
	                    $('#registerForm').trigger("reset");
	                },
	            });
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
	$(function() {
	    $("#addBook input,textarea").jqBootstrapValidation({
	        preventSubmit: true,
	        submitError: function($form, event, errors) {
	            // additional error messages or events
	        },
	        submitSuccess: function($form, event) {
	            event.preventDefault();
	            var bookISBN= $("input#bookISBN").val();
	            var bookName = $("input#bookName").val();
	            var bookAuthor = $("input#bookAuthor").val();
	            var bookPublisher = $("input#bookPublisher").val();
	            var bookPublishedYear = $("input#publishedYear").val();
	            var bookCost = $("input#bookCost").val();
	            var bookCategory = $("input#bookCategory").val();
	            var eBookURL=$("input#eBookURL").val();

	            $.ajax({
	                url: "/Bookhe/addNewBook",
	                type: "POST",
	                dataType: "JSON",
	                data: {
	                	bookISBN: bookISBN,
	                	bookName: bookName,
	                	bookAuthor: bookAuthor,
	                	bookPublisher: bookPublisher,
	                	bookPublishedYear: bookPublishedYear,
	                	bookCost: bookCost,
	                	bookCategory: bookCategory,
	                	eBookURL:eBookURL
	                },
	                cache: false,
	                success: function(data) {
	                	console.log(data);
	                	if( data.success ) {
	                		$(location).attr('href', '/Bookhe/userProfile');
	                	} else {
	                		// Fail message
		                    $('#register-result').html("<div class='alert alert-danger'>");
		                    $('#register-result > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
		                        .append("</button>");
		                    $('#register-result > .alert-danger').append("<strong>Sorry, registration failed. Please try again!!");
		                    $('#register-result > .alert-danger').append('</div>');
		                    //clear all fields
		                    $('#registerForm').trigger("reset");
	                	}
	                },
	                error: function( error ) {
	                    // Fail message
	                	$('#register-result').html("<div class='alert alert-danger'>");
	                    $('#register-result > .alert-danger').html("<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;")
	                        .append("</button>");
	                    $('#register-result > .alert-danger').append("<strong>Sorry, it seems we encountered a server error. Please try again!!");
	                    $('#register-result > .alert-danger').append('</div>');
	                    //clear all fields
	                    $('#registerForm').trigger("reset");
	                    $('#addBook').trigger("reset");
	                },
	            });
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