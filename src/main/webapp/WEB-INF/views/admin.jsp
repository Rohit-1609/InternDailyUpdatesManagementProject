<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>

<html>

<head>

<title>Nabla Employee Portal</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<style>
body {
	
    	 background: #f1aa89; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #493240, #FF0099);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient( #493240, #FF0099);
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
 
 }

 h2{
width: 500px;
margin: 0 auto;
text-align: center;

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
	background-color: #dce65d;
	color: white;
}
</style>
</head>

<body>

	<header>
		<div class="topnav">
			<a class="navbar-brand"
				href="https://www.nablainfotech.com/index.html"> <img
				src="https://www.nablainfotech.com/images/nabala_logo.png"
				alt="logo" style="width: 50px;">
			</a> <a class="active" href="list">Home</a> <a
				href="https://www.nablainfotech.com/index.html">About</a>
				<a
				class="search" href="${pageContext.request.contextPath }/searchEmployee">Search Employee</a>
				 <a
				class="logout" href="${pageContext.request.contextPath }/">Log Out</a>
		</div>
	</header>
	<br>
	<div class="container col-md-9">
		<div class="card">
			<div class="card-body">
				<form action="register" method="post">


	<h2>Intern Details</h2>



					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col"> Id</th>
								<th scope="col"> FullName</th>
								<th scope="col"> Email</th>
								<th scope="col">Role</th>
								<th scope="col">Joining date</th>
								<th scope="col">Mentor</th>
								<th scope="col">Action</th>
								<th scope="col">Daily Updates</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${intern}" var="intern">
								<tr>
									<th scope="row">${intern.id }</th>
									<td>${intern.fullName }</td>
									
									<td>${intern.email }</td>
									<td>${intern.role }</td>
									<td>${intern.joiningDate }</td>
									<td>${intern.mentor }</td>

									<td>
										<a href="deleteintern/${intern.id}"><i
											class="btn btn-outline-warning inline">delete</i></a> 
											<hr><a
										href="updateintern/${intern.id}"><i
											class="btn btn-outline-primary inline">update</i></a>
										</td>		
											<td>
												<a href="adddailyupdates"><i
										class="btn btn-outline-warning inline">Add </i></a> 
										<hr>
										<a
										href="viewdailyupdates"><i
									    class="btn btn-outline-primary inline">View</i></a></td>
																		
								</tr>
								
							</c:forEach>
							
								
							
							
						</tbody>
					</table>
					
					<div class="container  text-center">
						<button type="submit" class="btn btn-primary">Add Employee</button>
						
					</div>
				
					
				</form>
				
			</div>
		</div>
	</div>
</body>

</html>