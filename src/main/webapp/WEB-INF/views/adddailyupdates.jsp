<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Add Daily update page</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
 <!--<link rel="stylesheet" href="../resources/style.css"> -->
<link href="<c:url value="/resources/style1.css" />" rel="stylesheet" type="text/css">
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
<form action="adddailyupdates_process" method="post" id="msform">
  <!-- progressbar -->
    <legend>Add your Daily updates</legend>
  <br>
  <table class="registrationtable" cellpadding="2" width="100%" bgcolor="#9999FF" align="center" cellspacing="2">
    
  
		<!--  <tr>
   <td> ID</td>
	<td><input type="text" name="id" placeholder="Enter Id" id="id" style="height: 20px; width:300px" />
        <span id="span3"><b>This field can't be Empty</b></span></td>
	</tr>-->
	
	
	<tr>
    <td><label> Topic Name :-</label> 
        </td>
	<td><input type="text" name="topicName" placeholder="Enter Topic Name" id="topicName" style="height: 30px; width:300px"  />
        <span id="span1"><b>Enter a topic Name</b></span>
        <span id="span2"><b>This field can't be empty</b></span>
        <span class="red-text accent-4" id="result"></span> 
        </td>
	</tr>
      
    <tr>
        <td><label>Description:-</label></td>
        <td><input type="text" name="description" placeholder="Enter Description" id="description" style="height: 60px; width:300px" />
            <span id="span15"><b>This field can't be empty</b></span></td>
        </tr>

	   
	<tr>
    <td>Name of the issue :-</td>
	<td><input type="nameOfTheIssue" name="nameOfTheIssue" placeholder=" Enter Name of the issue" id="nameOfTheIssue" style="height: 50px; width:300px"  />
        <span id="span3"><b>This field can't be empty</b></span></td>
	</tr>
	
	<tr>
    <td>Solution Tried :-</td>
	<td><input type="" name="solutionTried" placeholder="Enter Solution Tried"  id="solutionWorked" style="height: 50px; width:300px" />
        <span id="span6"><b>This field can't be Empty</b></span>
	</tr>
    <td>Solution Worked :-</td>
	<td><input type="" name="solutionWorked" placeholder="Enter Solution Worked" id="solutionWorked" style="height: 50px; width:300px"  />
        <span id="span3"><b>This field can't be empty</b></span></td>
	</tr>
	
	<tr>
    <td>Reference Urls :-</td>
	<td><input type="" name="referenceUrls" placeholder="Enter Reference Urls"  id="referenceUrls" style="height: 50px; width:300px" />
        <span id="span6"><b>This field can't be Empty</b></span>
	</tr>
	<tr>
        <td>Hours :-</td>
        <td><input type="" name="hours" placeholder="Enter Hours"  id="hours" style="height: 20px; width:300px" />
            <span id="span6"><b>This field can't be Empty</b></span>
        </tr>
        <td>Date :-</td>
        <td><input type="" name="date" placeholder="Enter Date" id="solutionWorked" style="height: 20px; width:300px"  />
            <span id="span3"><b>This field can't be empty</b></span></td>
        </tr>
        
        <tr>
        <td>Assignment Details :-</td>
        <td><input type="" name="assignmentDetails" placeholder="Enter Assignment details" 
             id="assignmentDetails" style=" width:300px" />;
            <span id="span6"><b>This field can't be Empty</b></span>
        </tr>
        <tr>
            <td>-</td>
            <button class="action-button" >Save Daily Updates</button>
         </tr>

    
  
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
