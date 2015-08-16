<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-default navbar-custom navbar-fixed-top">
<div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header page-scroll">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/Bookhe/s/index">Bookhe</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav navbar-right">
            <li>
                <a href="${user != null ? "#shareBookModal" : "#loginModal" }" data-toggle="modal">Share a book</a>
            </li>
            <li>
                <a href="/Bookhe/s/about">About</a>
            </li>
            <li>
                <a href="/Bookhe/s/contact">Contact</a>
            </li>
            <c:choose>
	            <c:when test="${user == null}">
		            <li>
		                <a href="#loginModal" data-toggle="modal">Login</a>
		            </li>
		            <li>
		                <a href="#registerModal" data-toggle="modal">Register</a>
		            </li>
	            </c:when>
	            <c:otherwise>
	            	<li>
	            		<a href="/Bookhe/userProfile"> User Profile </a>
            		</li>
	            	<li>
	            		<a href="/Bookhe/logout"> Logout </a>
            		</li>
	            </c:otherwise>
            </c:choose>
        </ul>
    </div>
    <!-- /.navbar-collapse -->
</div>
<!-- /.container -->
</nav>