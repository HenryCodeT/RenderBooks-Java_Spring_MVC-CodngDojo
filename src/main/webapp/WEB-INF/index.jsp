<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title> Titulo </title>
	<!-- Bootstrap -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<h1 class="text-center text-info"><c:out value="${ book.getTitle() }"></c:out></h1>
	<p class="fs-2">Description: <c:out value="${ book.getDescription() }"></c:out></p>
	<p class="fs-2">Language: <c:out value="${ book.getLanguage() }"></c:out></p>
	<p class="fs-2">Number of pages: <c:out value="${ book.getNumOfPages() }"></c:out></p>
	
	<!--Bootstrap -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>