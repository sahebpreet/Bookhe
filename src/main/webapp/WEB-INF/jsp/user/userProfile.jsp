<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Bookhe - Search Results</title>

    <!-- Bootstrap Core CSS -->
    <link href="/Bookhe/s/css/bootstrap.min.css" rel="stylesheet">
    <link href="/Bookhe/s/css/bookhe.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/Bookhe/s/css/clean-blog.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<c:choose>
		<c:when test="${user == null}"> 404 not found </c:when>
		<c:otherwise>
		    <!-- Navigation -->
			<jsp:include page="../navigation.jsp"></jsp:include>
		
		    <!-- Page Header -->
		    <!-- Set your background image for this header on the line below. -->
		    <header class="intro-header" style="background-image: url('/Bookhe/s/img/test.jpg')">
		        <div class="container">
		            <div class="row">
		                <div class="col-lg-10 col-md-10 col-md-offset-1">
		                	<div class="userImage"><img src="/Bookhe/s/img/default-user-icon.jpg"></div>
		                    <div class="post-heading">
		                        <h1> Hi ${user.name} !</h1>
		                        <h2 class="subheading"></h2>
		                    </div>
		                </div>
		            </div>
		        </div>
		    </header>
		
		    <!-- User Profile -->
		
			<article>
		        <div class="container">
		            <div class="row">
		                <div class="col-lg-10 col-lg-offset-2 col-md-10 col-md-offset-1">
		                	<h2>User Information</h2>
		                	<table class="user-table">
		                		<tr>
		                			<td> Name </td>
		                			<td> ${user.name} </td>
		                		</tr>
		                		<tr>
		                			<td> Address </td>
		                			<td> ${user.address} </td>
		                		</tr>
		                		<tr>
		                			<td> Contact Number </td>
		                			<td> ${user.contactNumber} </td>
		                		</tr>
		                		<tr>
		                			<td> Email Id </td>
		                			<td> ${user.emailId} </td>
		                		</tr>
		                		<tr>
		                			<td> Points </td>
		                			<td> ${user.points} </td>
		                		</tr>
		                	</table>
		               	</div>
		            </div>
		        </div>
			</article>
		
		    <hr>
		
		    <!-- Footer -->
			<jsp:include page="../footer.jsp"></jsp:include>
		

		 	<c:choose>
		 		<c:when test="${user==null}">
		 			<!-- Login Modal -->
					<jsp:include page="../loginModal.jsp"></jsp:include>
		
					<!-- Register Modal -->
					<jsp:include page="../registerModal.jsp"></jsp:include>
		
		 		</c:when>
		 		<c:otherwise>
					<!-- Share Book Modal -->
					<jsp:include page="../shareBookModal.jsp"></jsp:include>
		 		</c:otherwise>
			</c:choose>
	
			<!-- Search Bar -->
			<jsp:include page="../searchBar.jsp"></jsp:include>
		
		
		    <!-- jQuery -->
		    <script src="/Bookhe/s/js/jquery.js"></script>
		
		    <!-- Bootstrap Core JavaScript -->
		    <script src="/Bookhe/s/js/bootstrap.min.js"></script>
		
		    <!-- Custom Theme JavaScript -->
		    <script src="/Bookhe/s/js/clean-blog.min.js"></script>
		    <script src="/Bookhe/s/js/index.js"></script>
		</c:otherwise>
	</c:choose>
</body>

</html>
