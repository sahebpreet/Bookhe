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

    <!-- Navigation -->
	<jsp:include page="../navigation.jsp"></jsp:include>

    <!-- Page Header -->
    <!-- Set your background image for this header on the line below. -->
    <header class="intro-header" style="background-image: url('/Bookhe/s/img/post-bg.jpg')">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="post-heading">
                        <h1> Explore the unexplored !</h1>
                        <h2 class="subheading"></h2>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Search Results -->
   	<article>
        <div class="container">
            <div class="row">
                <div class="col-lg-10 col-lg-offset-2 col-md-10 col-md-offset-1">
                	<h2>Search Results for "${keywords}"</h2>
                	<c:if test="${searchResults == null || searchResults.isEmpty()}">
                		<p>Sorry, no results to display.</p>
                		<p> But don't worry we have some cool stuff that you'll like, search again. </p>
                	</c:if>
                	<c:forEach var="book" items="${searchResults}">
	                	<div class="bookResult">
	                		<img src="/Bookhe/s/img/logo.jpg" class="bookImage">
	                		<div class="bookName">${book.name}</div>
	                		<div class="bookAuthor">Author: ${book.author}</div>
	                		<div class="bookPublisher">Published By: ${book.publisher}</div>
	                		<div class="btn btn-default">Borrow Book</div>
	                	</div>
                	</c:forEach>
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

</body>

</html>
