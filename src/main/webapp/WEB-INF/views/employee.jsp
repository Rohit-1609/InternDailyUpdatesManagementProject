<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title>Update Form</title>


<style>
body {
	background: #e979cd; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #b884a8,#e45ad8);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #b884a8,  #e45ad8);
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
	background-color: #dfe767;
	color: white;
}
</style>

</head>
<body>
	<div class="container mt-3">


		<div class="row">

			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Update Employee Details</h1>
<div class="card">
					<div class="card-body">
					<form action="${pageContext.request.contextPath }//normalEmployee"
							method="post">
					<input type="hidden" value="${employee.id }" name="id" />
					
						<div class="form-group">
								<label for="name">Employee fullName</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="fullName" placeholder="Enter full name"
									value="${employee.fullName } " required="required">
							</div>

							

						

							<div class="form-group">
								<label for="name">Employee Email</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="email" placeholder="Enter emailid"
									value="${employee.email }" required="required" readonly>
							</div>

                  <div class="form-group">
						<label for ="name">Password:-</label> <input type="text"
						placeholder="password" aria-describeby="emailHelp" 
							value="${employee.password}" id="name" class="form-control"
							name="password" required="required">
					</div>


							<div class="form-group">
								<label for="name">userRole</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="role" placeholder="Enter role"
									value="${employee.role }" required="required" readonly>
							</div>


			<div class="form-group">
								<label for="name">Employee EmployeeId</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="employeeId" placeholder="Enter employeeid"
									value="${employee.employeeId }" required="required" readonly>
							</div>

               <div class="form-group">
								<label for="name">Year of Experience In Our Org</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="yearOfExperienceInOurOrganisation" placeholder="Enter year of experience in our org "
									value="${employee.yearOfExperienceInOurOrganisation }">
							</div>

	                <div class="form-group">
								<label for="name">Position</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="position" placeholder="Enter position"
									value="${employee.position }">
							</div>
								<div class="form-group">
								<label for="name">skills</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="skills" placeholder="Enter skills"
									value="${employee.skills }">
							</div>
							
							<div class="form-group">
								<label for="name">Year of Experience In previous Org</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="yearOfExperienceInPreviousOrganisation" placeholder="Enter year of experience in previous org "
									value="${employee.yearOfExperienceInPreviousOrganisation }">
							</div>

	                <div class="form-group">
								<label for="name">Position in previous org</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="positionInPreviousOrganisation" placeholder="Enter position in previous organisation"
									value="${employee.positionInPreviousOrganisation }">
									</div>
							
						

							<div class="form-group">
								<label for="name">Employee Personal Email</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="personalEmail" placeholder="Enter personal emailid"
									value="${employee.personalEmail }" required="required" readonly>
							</div>

                         	<div class="form-group">
								<label for="name">Employee PhoneNumber</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="mobile" placeholder="Enter mobile no"
									value="${employee.mobile }" required="required" readonly>
							</div>
							
							<div class="form-group">
								<label for="name">Enter Permanent Address</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="permanentAddress" placeholder="Enter permanent address"
									value="${employee.permanentAddress }" required="required">
							</div>

	                        <div class="form-group">
								<label for="name">Employee Permanent City</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="permanentCity" placeholder="Enter Permanentcity"
									value="${employee.permanentCity }" required="required">
							</div>

							<div class="form-group">
								<label for="name">Enter current Address</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="currentAddress" placeholder="Enter current address"
									value="${employee.currentAddress }" required="required">
							</div>
							
							<div class="form-group">
								<label for="name">Employee Current City</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="currentCity" placeholder="Enter city"
									value="${employee.currentCity }" required="required">
							</div>
							
							<div class="form-group">
								<label for="name">State</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="state" placeholder="Enter state" value="${employee.state }">
							</div>


							<div class="form-group">
								<label for="name">Postal / Zip Code</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="zipCode" placeholder="Enter zipCode"
									value="${employee.zipCode }">
							</div>

							<div class="form-group">
								<label for="name">Country</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="country" placeholder="Enter country"
									value="${employee.country }">
							</div>


							<div class="form-group">
								<label for="name">schoolName</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="schoolName" placeholder="Enter schoolName"
									value="${employee.schoolName }">
							</div>

                              	<div class="form-group">
						<label for="name">Tenth Class Percentage</label> <input type="text"
							value="${employee.tenthPercentage}"
							 class="form-control" id="name" aria-describeby="emailHelp"
							name="tenthPercentage" required="required">
				           	</div>
						

							<div class="form-group">
								<label for="name">tenth classPassout</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="tenthPassout" placeholder="Enter tenthPassout "
									value="${employee.tenthPassout }">
							</div>

							<div class="form-group">
								<label for="name">collegeName</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="collegeName" placeholder="Enter collegeName"
									value="${employee.collegeName }">
							</div>

                       
                              	<div class="form-group">
						<label for="name">Twelth Class Percentage</label> <input type="text"
							value="${employee.twelthPercentage}"
							 class="form-control" id="name" aria-describeby="emailHelp"
							name="twelthPercentage" required="required">
				           	</div>
				           
							<div class="form-group">
								<label for="name">Year of twelth passout</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="twelthPassout"
									placeholder="Enter twelthPassout"
									value="${employee.twelthPassout }">
							</div>
							
							<div class="form-group">
								<label for="name">Qualification</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="qualification" placeholder="Enter qualification"
									value="${employee.qualification }">
							</div>
							
							<div class="form-group">
								<label for="name">Select Degree</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="degree" placeholder="Enter degree "
									value="${employee.degree }">
							</div>

							<div class="form-group">
								<label for="name">Year of passout</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="degreePassout" placeholder="Enter degreePassout "
									value="${employee.degreePassout }">
							</div>


                              	<div class="form-group">
						<label for="name">Tenth Class Percentage</label> <input type="text"
							value="${employee.degreePercentage}"
							 class="form-control" id="name" aria-describeby="emailHelp"
							name="degreePercentage" required="required">
				           	</div>
				           	

							
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-warning">Save</button>
					</div>
				
				

				</form>
			</div>

		</div>
	</div>
</body>
</html>