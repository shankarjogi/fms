<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>


</head>
<body>
	<font size="6" >Congratulations ${name}</font>
	<font size="6" >your ticket booked successfully</font><br>
	
		<font size="6" color="Green"><i>${flightname}:Boarding Pass</i></font>
	
	<table border="2px" class="table table-striped table-bordered table-hover">

		<tr>
			<th>flight name</th>
			<th>Name</th>
			<th>Date of birth</th>
			<th>Source</th>
			<th>Destination</th>
			<th>Gender</th>
			<th></th>
		</tr>
		<tr>
			<td>${flightname}</td>
			<td>${name }</td>
			<td>${dob }</td>
			<td>${source }</td>
			<td>${destination }</td>
			<td>${gender }</td>
			<td>${users }</td>
		</tr>
	</table>
</body>
</html>