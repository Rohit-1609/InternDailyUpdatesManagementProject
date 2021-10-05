<!--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>-->
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Registration form of Intern management at Nabla Infotech</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
 <!--<link rel="stylesheet" href="../resources/style.css"> -->
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css">
<style>
.button {
  background-color:#97c430;
  border-radius: 1px; 
  color: white;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 15px;
  width: 100px;
  padding: 10px 5px;
  margin: 10px 5px;
  cursor: pointer;
}
</style>
</head>
<body>
<!-- partial:index.partial.html -->
<!-- multistep form -->
<form action="register_process" method="post" id="msform">
  <!-- progressbar -->
  <ul id="progressbar">
    <li class="active">Login Details</li>
    <li>Other details</li>   
  
  </ul>
  
  <!-- fieldsets -->
  <fieldset>
    <legend>Create your account</legend>
  <br>
  <br>
  <br>
  
 
  <table class="registrationtable" cellpadding="2" width="100%" bgcolor="#9999FF" align="center" cellspacing="2">
    
  
	<!--     	<tr>
    <td> ID</td>
	<td><input type="text" name="id" placeholder="Id" id="id" required/>
        <span id="span3"><b>This field can't be Empty</b></span></td>
	</tr>-->
	
	
	<tr>
    <td><label> Office Email :-</label>
        
        </td>
	<td><input type="text" name="email" placeholder="Email" id="email" required/>
        <span id="span1"><b>Enter a valid email address</b></span>
        <span id="span2"><b>This field can't be empty</b></span>
        <span class="red-text accent-4" id="result"></span> 
        </td>
	</tr>
      
    <tr>
        <td><label>Full Name</label></td>
        <td><input type="text" name="fullName" placeholder="Full Name" id="fullName" required/>
            <span id="span15"><b>This field can't be empty</b></span></td>
        </tr>

	
	<tr>
    <td>Password :-</td>
	<td><input type="password" name="password" placeholder="Password" id="password" required />
        <span id="span3"><b>This field can't be empty</b></span></td>
	</tr>
	
	<tr>
    <td>Confirm Password :-</td>
	<td><input type="password" name="confirmPassword" placeholder="Confirm Password" 
     id="confirmPassword" required/>
        <span id="span4"><b>Password doesn't match</b> </span>
	</tr>
	
	
	
	</table>
    <br>
    <br>
    <br>
  <input type="button" name="next" class="next action-button" value="Next" />
 <a href="${pageContext.request.contextPath }/" 
                           class="next action-button">Login Page</a> 
 </fieldset>

 <fieldset>
    <legend> Other Details</legend>
	<br>
    <br>
	<br>
	<table class="registrationtable" cellpadding="2" width="100%" bgcolor="#FF99FF" align="center" cellspacing="2">
	
      <tr>
					<td><label for="role">Role:</label></td>
					    <td><select name="role" id="inputbox">
						<option value="" selected disabled hidden>Select
							Employee/Admin</option>
						<option value="Admin"><p style="font-family: courier;">Admin</p>
						</option>
						<option value="Intern"><p style="font-family: courier;">Intern</p>
						</option>
                        
					</select></td>
				</tr>
				
				<tr>
    <td><label>Date of joining:</label></td>
    <td><input type="date" id="inpbox" name="joiningDate" required></td>
	</tr>
				
				<tr>
        <td><label>Mentor</label></td>
        <td><input type="text" name="mentor" placeholder="mentor" id="mentor" required/>
            <span id="span15"><b>This field can't be empty</b></span></td>
        </tr>
                        
             
	
	</table>
    <br>
    <br>
    <br>
	
  
    <input type="button" name="previous" class="previous action-button" value="Previous" />
 <a href="${pageContext.request.contextPath }/"
							class="next action-button">Login Page</a>
	   <button class="action-button" >Register</button>
  </fieldset>
</form>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script>
<script  src="<c:url value= " ./resources/script.js" />"> </script>
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="<c:url value= " ./resources/validation.js" />"> </script> 

<script>
    $(document).ready(function(){
     $('email').change(function(){
         var emailval = $('#email').val();
		 
		 $.ajax({
		     type:'POST',
			 data:{emailval:email},
			 url:'ValueExistCheck',
			 success: function(result){
			     $('#result').html(result);
			 }
		 });
     });   
    });
    
</script>>

</body>
</html>
