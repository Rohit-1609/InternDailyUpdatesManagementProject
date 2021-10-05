<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title>Update Daily Form</title>

<style>
body {
	background: #e2ae7e; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #ebdd90, #e0b351);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #ebdd90, #e0b351);
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
}


.topnav {
	overflow: hidden;
	background-color: #1d8ba1;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 20px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a.logout {
	float: right;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #ddeb64;
	color: white;
}
</style>
</head>
<body>
	<div class="container mt-3">


		<div class="row">

			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Update Intern details</h1>
				<div class="card">
					<div class="card-body">


						<form action="${pageContext.request.contextPath }/updateintern_process"
							method="post">
							<input type="hidden" value="${intern.id }" name="id" />
							<div class="form-group">
								<label for="fullname">Full Name</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="fullName" placeholder="Enter Full Name"
									value="${intern.fullName } " required="required">
							</div>

							

						

							<div class="form-group">
								<label for="email">Email</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="email" placeholder="Enter Email"
									value="${intern.email }" required="required" >
							</div>
                  <div class="form-group">
						<label for ="password">Password:-</label> <input type="text"
						placeholder="password" aria-describeby="emailHelp" 
							value="${intern.password}" id="name" class="form-control"
							name="password" required="required">
					</div>


							<div class="form-group">
								<label for="role">Role:- </label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="role" placeholder="Role"
									value="${intern.role}" required="required" >
							</div>

							<div class="form-group">
								<label for="joiningDate">Joining Date:-</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="joiningDate" placeholder="Joining Date"
									value="${intern.joiningDate }" required="required" >
							</div>


			<div class="form-group">
								<label for="mentor">Mentor:-</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="mentor" placeholder="Mentor"
									value="${intern.mentor}" required="required" >
							</div>

	        
							<div>
								<button type="submit" class="btn btn-warning">Update</button>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<button class="btn btn-outline-warning" id="reset" name="reset"
									onclick="this.form.querySelectorAll('input[type=text]').forEach(function(input,i){input.value='';})">Clear
									All fields</button>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<button class="btn btn-outline-dark" type="reset" value="Reset">Reset</button>
								&nbsp;&nbsp;&nbsp;&nbsp; <a href="
									${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Log
									Out</a>
							</div>
					</div>
				</div>




				</form>
			</div>

		</div>
	</div>
</body>
</html>