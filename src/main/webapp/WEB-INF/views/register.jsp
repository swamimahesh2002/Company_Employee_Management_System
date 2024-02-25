<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<style>

.main{

border: 1px solid black;
    border-radius: 20px;
    display: flex;
    box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px, rgba(10, 37, 64, 0.35) 0px -2px 6px 0px inset;
    height: 280px;
    width: 500px;
    
    justify-content: center;
	background-color:powderblue;
	margin-left: auto;
	margin-right: auto;
    margin-top: 120px;
    margin-bottom: auto;
}
</style>

</head>
<spring:url value="/" var="url"></spring:url>
<body style="background-color:Azure">
<div style="background-color:powderblue">
<h1 style="text-align: center; font-size:4vw; margin-top: 15px;">Employee Application</h1>

</div>
<div class="main">
<form action="${url}registerUser" method="post">

<table style=" margin-top: 20px;">
			<tr>
				<td>name</td>
				<td><input type="text" name="name" required="required" maxlength="50"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" required="required" maxlength="50"></td>
			</tr>
			<tr>
				<td>Graduation</td>
				<td><input type="text" name="graduation" required="required" maxlength="50"></td>
			</tr>
			
			<tr>
				<td>Dept</td>
				<td><input type="text" name="dept_id" required="required" maxlength="50"></td>
			</tr>
				
				
			<tr>
				<td colspan="2" style="text-align: center;"><input type="submit" value="Register"></td>
			</tr>
		</table>

</form>
</div>
</body>
</html>