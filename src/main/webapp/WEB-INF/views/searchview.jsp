<%@ page import="java.util.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.interndailyupdatesmanagement.model.Intern"%>
<!DOCTYPE HTML>

<html>
<%
ArrayList<Intern> list = new ArrayList<Intern>();
list = (ArrayList<Intern>) request.getAttribute("foundIntern");
%>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
body {
	background: #DCE35B; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #db9f2f, #dae057);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #db9f2f, #dae057);
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
}
</style>
</head>
<body>
	<table class="table table-dark table-hover">
		<tr>
			<td colspan=8 align="center" style="background-color:rgb(131, 122, 218)"><b><i>Intern Record</i></b></td>
		</tr>
		<tr style="background-color: rgb(153, 149, 149);">
			<th><b>Id</b></th>
			<th><b>Email</b></th>
			<th><b>FullName</b></th>
			<th><b>Role</b></th>
			<th><b>Joining Date</b></th>
			<th><b>Mentor</b></th>
		</tr>
		<%
		for (int i = 0; i < list.size(); i++) {
			Intern internNew= new Intern();
			internNew = list.get(i);
		%>
		<tr>
			<td><%=internNew.getid()%></td>
			<td><%=internNew.getEmail()%></td>
			<td><%=internNew.getFullName()%></td>
			<td><%=internNew.getRole()%></td>
			<td><%=internNew.getJoiningDate()%></td>
			<td><%=internNew.getMentor()%></td>

		</tr>
		<%
		}
		;
		%>
		<tr>
			<td colspan=8 align="center" style="background-color: #a1dcf8"><b>No
					Other Record Found..</b></td>
		</tr>
		<tr>
		<a href="list" class="btn btn-primary">BACK TO USERLIST</a>
							
		</tr>

	</table>
</body>
</html>