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
				<h1 class="text-center mb-3">Update Daily Details</h1>
				<div class="card">
					<div class="card-body">


						<form action="${pageContext.request.contextPath }/updatedailyupdates_process"
							method="post">
							<input type="hidden" value="${dailyUpdates.id }" name="id" />
							<div class="form-group">
								<label for="topicname">Topic Name</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="topicName" placeholder="Enter Topic Name"
									value="${dailyUpdates.topicName } " required="required">
							</div>

							

						

							<div class="form-group">
								<label for="description">Description</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="description" placeholder="Enter description"
									value="${dailyUpdates.description }" required="required" >
							</div>
                  <div class="form-group">
						<label for ="nameOfTheIssue">Name Of the issue:-</label> <input type="text"
						placeholder="nameOfTheIssue" aria-describeby="emailHelp" 
							value="${dailyUpdates.nameOfTheIssue}" id="name" class="form-control"
							name="nameOfTheIssue" required="required">
					</div>


							<div class="form-group">
								<label for="solutionTried">Solution Tried:- </label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="solutionTried" placeholder="Solution Tried"
									value="${dailyUpdates.solutionTried }" required="required" >
							</div>

							<div class="form-group">
								<label for="solutionWorked">Solution Worked:- </label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="solutionWorked" placeholder="Solution Worked"
									value="${dailyUpdates.solutionWorked }" required="required" >
							</div>


			<div class="form-group">
								<label for="referenceUrls">Reference Urls</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="referenceUrls" placeholder="Reference Urls"
									value="${dailyUpdates.referenceUrls }" required="required" >
							</div>

               <div class="form-group">
								<label for="hours">Hours</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="hours" placeholder="Enter Hours"
									value="${dailyUpdates.hours }">
							</div>

	                <div class="form-group">
								<label for="date">Date</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="Date" placeholder="Enter Date"
									value="${dailyUpdates.date}">
							</div>
								<div class="form-group">
								<label for="assignmentDetails">Assignment Details</label><input type="text"
									class="form-control" id="name" aria-describeby="emailHelp"
									name="assignmentDetails" placeholder="Enter Assignment Details"
									value="${dailyUpdates.assignmentDetails}">
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