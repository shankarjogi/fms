<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Booking Form HTML Template</title>

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=PT+Sans:400"
	rel="stylesheet">

<!-- Bootstrap -->
<link type="text/css" rel="stylesheet"
	href="resources/css/bootstrap.min.css" />

<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="resources/css/style.css" />


</head>

<body>
	<font size="6" >Congratulations ${name}</font>
	<font size="6">your ticket has been booked successfully</font>
	<br>

	<font size="6" color="Green"><i>${flightname}:Boarding Pass</i></font>
	<div id="booking" class="section">
		<div class="section-center">
			<div class="container">
				<div class="row">
					<div class="booking-form">
						<form>

							<div class="col-md-3">
								<div class="form-group">
									<span class="form-label">Ticket No</span> <input
										class="form-control" type="text" value="${ticket_no}" disabled>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<span class="form-label">Flight Name</span> <input
											class="form-control" type="text" value="${flightname}" disabled>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<span class="form-label">Name</span> <input
											class="form-control" type="text" value="${name }" disabled>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<span class="form-label">Flying from</span> <input
											class="form-control" type="text" value="${source}" disabled>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<span class="form-label">Flyning to</span> <input
											class="form-control" type="text" value="${destination }" disabled>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-3">
									<div class="form-group">
										<span class="form-label">Date of Birth</span> <input
											class="form-control" type="text" value="${dob }" disabled>
									</div>
								</div>
								<div class="row">
									<div class="col-md-3">
										<div class="form-group">
											<span class="form-label">Nationality</span> <input
												class="form-control" type="text" value="${nationality }" disabled>
										</div>
									</div>
									<div class="col-md-3">
										<div class="form-group">
											<span class="form-label">Gender</span> <input
												class="form-control" type="text" value="${gender}" disabled>
										</div>
									</div>
									<div class="col-md-3">
										<div class="form-group">
											<span class="form-label">Travel Date</span> <input
												class="form-control" type="text" value="${date}" disabled>
										</div>
									</div>
									<!-- 			<div class="col-md-2">
									<div class="form-group">
										<span class="form-label">Adults (18+)</span>
										<select class="form-control">
											<option>1</option>
											<option>2</option>
											<option>3</option>
										</select>
										<span class="select-arrow"></span>
									</div>
								</div> -->
									<!-- 			<div class="col-md-2">
									<div class="form-group">
										<span class="form-label">Children (0-17)</span>
										<select class="form-control">
											<option>0</option>
											<option>1</option>
											<option>2</option>
										</select>
										<span class="select-arrow"></span>
									</div>
								</ div>
							</div> -->
									<div class="row">
										<div class="col-md-3">
											<div class="form-group">
												<span class="form-label">Travel class</span> 
													<input class="form-control" type="text" value="Business" disabled>
											<!-- 		<option>Economy class </option>
												 <option >Business class</option>
													<option>First class</option> 
												</select>  -->
											</div>
										</div>
									</div>

									<!-- 		<div class="col-md-3">
									<div class="form-btn">
										<button class="submit-btn">Show flights</button>
									</div>
								</div> -->
								</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
</html> --%>