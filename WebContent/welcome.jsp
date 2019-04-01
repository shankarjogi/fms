
<html>
<head>
<title>Login Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body
	style="background-image: url(https://i.pinimg.com/originals/dd/91/4c/dd914c6cca076f8cebb463a81e73e7e5.jpg)"
	class="jumbotron text-center">
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card" style="margin-top: 0px">
				<div class="card-header">

					<font size="4" color="Green"><i>Welcome To Flight
							Booking Portal</i></font><br> <font size="4" color="Red"><i>${date}</i></font>

					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square"></i></span> <span><i
							class="fab fa-google-plus-square"></i></span> <span><i
							class="fab fa-twitter-square"></i></span>
					</div>
				</div>
				<div class="card-body">
					<form action="SearchFlight" method="POST">
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Source"
								name="source">

						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Destination"
								name="destination">

										</div>
									<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Travel Date"
								name="date">

						</div>
					
						
							<div class="text-center">
								<input type="checkbox">Remember Me
							</div>
							<div class="form-group">
								<input type="submit" value="Search Flights"
									class="btn btn-success">
							</div>
					</form>
				</div>

			</div>
		</div>
	</div>
	</div>
</body>
</html>