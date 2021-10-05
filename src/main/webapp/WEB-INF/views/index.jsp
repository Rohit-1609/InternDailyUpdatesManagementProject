<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<%@page import="com.interndailyupdatesmanagement.model.Message" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login </title>
    	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">


	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">

 <!--<link rel="stylesheet" type="text/css" href="../resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="../resources/css/main.css"> -->
	
<link rel="stylesheet" type="text/css" href=" <c:url value="/resources/css/util.css" />"  >
<link rel="stylesheet" type="text/css" href=" <c:url value="/resources/css/main.css" />"> 

<script>  
	var fade_out = function() {
		$("#Message").fadeOut().empty();
	}
	setTimeout(fade_out, 1000);
	
</script>
<script>
	var fade_out = function() {
		$("#failureMessage").fadeOut().empty();
	}
	setTimeout(fade_out, 1000);

</script>
<script>
	var fade_out = function() {
		$("#ForgotPassword").fadeOut().empty();
	}
	setTimeout(fade_out, 1000);

</script>

<style>
  p {color:red;
  text-align:center;
  }
</style>
</head>

<body background="<c:url value="/resources/images/canvas2.png" />">
	
	<div >
        <div>  
			<div  class="text-center p-t-136">
				<form action="validate" class="text-center p-t-136" class="login100-form validate-form"  method="post">
					<div >
						<img src="<c:url value="/resources/images/avatar.png" />"   alt="IMG" >
					</div>
					<span class="login100-form-title" >

					     <h1> <b> Welcome</b></h1>
					</span>
					<span class="login100-form-title" >

						Log In into your account
					</span>
						
				    <div id="Message">
				    <%@include file="message.jsp" %>
						<%
			     	if (null != request.getAttribute("Message")) {

					Object succ = request.getAttribute("Message");
					out.println("<p>" + succ + "</p>");
				    }
				    %>
					</div>
					<div id="failureMessage">
						<%
				    if (null != request.getAttribute("failureMessage")) {

					Object fail = request.getAttribute("failureMessage");
					out.println("<p>" + fail + "<p>");
				     }
				     %>
					</div>
					<div id="ForgotPassword">
						<%
	     	         if (null != request.getAttribute("ForgotPassword")) {

					Object fPassword = request.getAttribute("ForgotPassword");
					out.println("<p><b>" + fPassword + "</b><p>");
				     }
				     %>
					</div>
				     
			       
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="email" style="width: 400px;" id="email"  placeholder="Email">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i aria-hidden="true"></i>
						</span>
					</div>
                    <br>
					<div class="wrap-input100 validate-input"   data-validate = "Password is required">
						<input class="input100" type="password" name="password" style="width: 400px" id="password" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i aria-hidden="true"></i>
						</span>
					</div>
					<br>
					
					
					<div class="container-login100-form-btn" >
						<button class="login100-form-btn" style="width: 100px">
							Login
						</button>
					</div>
					
						<div class="d-flex justify-content-right links">
							Don't have an account?<a href="register">Sign Up</a>
						</div>
					<div class="text-center p-t-12">
						<span class="txt1">
							Forgot
						</span>
						<a class="txt2" href="forgotpassword.jsp">
							Password?
						</a>
					</div>
                       
					
				</form>
			</div>
		</div>
	</div>	

</body>
</html>