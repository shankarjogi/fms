<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="resources/css/jquery.js" type="text/javascript"></script>
<style>
body {
	background:url(https://images.unsplash.com/photo-1532973497172-04b34d604825?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80);
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style> 

<title>Welcome User</title>

<h3>
	<font size="6" color="Black">The flights between ${source} and
		${destination} on ${date} :</font>
</h3>

</head>
<body>


	<table border="2px"
		class="table table-striped table-bordered table-hover">
		<tr>
			<th>Flight Name</th>
			<th>Flight Fare</th>
			<th>Source</th>
			<th>Destination</th>
			<th></th>
		</tr>



		<c:forEach items="${flight}" var="f">



			 <form action="bookflight" method="POST">
				<tr>

					<td><c:out value="${f.flightname }" ></c:out></td>
					<td><c:out value="${f.travel_fare }" ></c:out></td>
					<td><c:out value="${f.source }" ></c:out></td>
					<td><c:out value="${f.destination }"></c:out></td>



					<td><input type="hidden" value="${f.flightname}${f.travel_fare}" name="flightname">
						<input type="submit" value="Book!"></td>
				</tr>
			</form> 
			
			
			
			

		</c:forEach>
	</table>

</body>
</html>


