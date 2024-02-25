<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<style>
	table.center{
	height: auto; 
	width:auto; 
	border: 1px solid black;
	background-color:powderblue;
	margin-left: auto;
	  margin-right: auto;
	  margin-top: 80px;
	 box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px, rgba(10, 37, 64, 0.35) 0px -2px 6px 0px inset;
   	  text-align: center
   	  
	}

</style>
</head>
<spring:url var="url" value="/"></spring:url>
<body style="background-color:Azure">

<div style="background-color:powderblue">
<h1 style="text-align: center; font-size:4vw; margin-top: 15px;">Employee Application</h1>

</div>
	
	
	<table class="center">
		<tr>
			<td>ID</td>		
			<td>Name</td>		
				
			<td>Email</td>
			<td>graduation</td>
			<td>Dept</td>
		</tr>
		<c:forEach var="v" items="${requestScope.vlist}">
			<tr>
			<td>${v.id}</td>		
			<td>${v.name}</td>		
			<td>${v.email}</td>	
			<td>${v.graduation}</td>			
			<td>${v.dept}</td>	
			</tr>
		
		
		</c:forEach>
	
	</table>
	
</body>
</html>