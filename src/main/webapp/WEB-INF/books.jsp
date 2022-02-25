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
	<h1>all books</h1>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">#Id</th>
      <th scope="col">Title</th>
      <th scope="col">Language</th>
      <th scope="col">#Pages</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach var="book" items="${ books }">  
    <tr>
      <th scope="row"><c:out value="${ book.getId() }"></c:out></th>
      <td><a href="/books/${ book.getId() }"><c:out value="${ book.getTitle() }"></c:out></a></td>
      <td><c:out value="${ book.getLanguage() }"></c:out></td>
      <td><c:out value="${ book.getNumOfPages() }"></c:out></td>
    </tr>
	</c:forEach>    
  </tbody>	
</table>	
	<!--Bootstrap -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>