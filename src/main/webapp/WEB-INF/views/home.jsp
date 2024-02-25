<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
	table.center{
	height: 150px; 
	width:350px; 
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

	
<div>
	

	<table class="center">
		<tr>
			<td> Welcome Employee Please register</td>
			
		</tr>
		<tr>
			<td style="text-align: center"> 
			<a href="${url}dashboard">View Dashboard </a>
			</td>
		</tr>
		
		
		<tr>
			<td style="text-align: center"> 
			<a href="${url}register">Register here.. </a>
			</td>
		</tr>	
	</table>
	<span style="color: green">${requestScope.msg}</span>
	<span style="color: red">${requestScope.errmsg}</span>

	</div>
</body>
</html>