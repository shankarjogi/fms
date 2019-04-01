<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	background:
		url(http://www.gulfstream.com/images/uploads/desktop_downloads/g500-p1-ext-widescreen-2560x1440.jpg)
		no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>
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
<body class="jumbotron text-center" style="margin-left: 800px;">
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card" style="margin-top: 0px">
				<div class="card-header">
					<h3 class="text-center">Welcome to Flight Booking Portal</h3>
					<h3 class="text-center">${sh}</h3>
					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square"></i></span> <span><i
							class="fab fa-google-plus-square"></i></span> <span><i
							class="fab fa-twitter-square"></i></span>

					</div>
				</div>
				<div class="card-body">
	<form action="Book" method="POST"> 
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="First Name"
								name="first_name">

						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Last Name"
								name="last_name">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control"
								placeholder="Date Of Birth" name="d_0_b">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Nationality"
								name="nationality">
						</div>
							
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="Gender"
								name="gender">
						</div>

						<div class="form-group">
							 <!-- <input type="submit" value="Payment" class="btn btn-success"> <a href="Payment.jsp">Payment</a>
							<button type="submit" value="Payment" class="btn btn-success">
 -->
 
 <input type="submit" value="Payment" class="btn btn-success"></input>
 
						</div>
					</form>
				</div>
				<div class="card-footer">
					<div class="d-flex justify-content-center links"></div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>