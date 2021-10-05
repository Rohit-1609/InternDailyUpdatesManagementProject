$(document).ready(function() {

	$('#email').focusout(function() {
		email_validate();
	});

	function email_validate() {

		var pattern = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
		var email = $('#email').val();

		if (email !== '') {
			if (pattern.test(email)) {
				$('#lbl').css('color', '#66ff33');
				$('#email').css('border', '2px solid #66ff33');
				$('#success').css('display', 'block');
				$('#error').css('display', 'none');
				$('#span1').css('display', 'none');
				$('#span2').css('display', 'none');
				$('#warning').css('display', 'none');
			}
			else {
				$('#lbl').css('color', 'red');
				$('#email').css('border', '2px solid red');
				$('#error').css('display', 'block');
				$('#success').css('display', 'none');
				$('#span1').css('display', 'block');
				$('#span2').css('display', 'none');
				$('#warning').css('display', 'none');
			}
		}
		else {
			$('#span2').css('display', 'block');
			$('#lbl').css('color', 'yellow');
			$('#email').css('border', '2px solid yellow');
			$('#error').css('display', 'none');
			$('#success').css('display', 'none');
			$('#warning').css('display', 'block');
			$('#span1').css('display', 'none');
		}
	}



	$('#password').focusout(function() {
		password_validate();
	});

	function password_validate() {


		var password = $('#password').val();

		if (password == '') {
			$('#span3').css('display', 'block');
			$('#lbl').css('color', 'yellow');
			$('#password').css('border', '2px solid yellow');
			$('#error').css('display', 'none');
			$('#success').css('display', 'none');
			$('#warning').css('display', 'block');
			$('#span1').css('display', 'none');

		}
		else {
			$('#span3').css('display', 'none');
			$('#lbl').css('color', '#66ff33');
			$('#password').css('border', '2px solid #66ff33');
			$('#error').css('display', 'none');
			$('#success').css('display', 'none');
			$('#warning').css('display', 'none');
			$('#span1').css('display', 'none');

		}

	};
	 
	 
	$('#role').focusout(function() {
		role_validate();
	});

	function role_validate() {


		var role = $('#role').val();


		if (role == '') {
			$('#lbl').css('color', 'red');
			$('#role').css('border', '2px solid red');
			$('#error').css('display', 'block');
			$('#success').css('display', 'none');
			$('#span10').css('display', 'block');
			$('#warning').css('display', 'none');

		}
		else {
			$('#lbl').css('color', '#66ff33');
			$('#role').css('border', '2px solid #66ff33');
			$('#success').css('display', 'block');
			$('#error').css('display', 'none');
			$('#warning').css('display', 'none');
			$('#span10').css('display', 'none');

		}
		
		
	
	$('#date').focusout(function() {
		date_validate();
	});

	function date_validate() 
	{

      var pattern = /-;
		var date = $('#date').val();
		


		if (date == '') {
			$('#lbl').css('color', 'red');
			$('#date').css('border', '2px solid red');
			$('#error').css('display', 'block');
			$('#success').css('display', 'none');
			$('#span10').css('display', 'block');
			$('#warning').css('display', 'none');

		}
		else {
			$('#lbl').css('color', '#66ff33');
			$('#date').css('border', '2px solid #66ff33');
			$('#success').css('display', 'block');
			$('#error').css('display', 'none');
			$('#warning').css('display', 'none');
			$('#span10').css('display', 'none');

		}
		
		
	
	
	
	$('#mentor').focusout(function() {
		mentor_validate();
	});

	function mentor_validate() {


		var mentor = $('#mentor').val();


		if (mentor == '') {
			$('#lbl').css('color', 'red');
			$('#mentor').css('border', '2px solid red');
			$('#error').css('display', 'block');
			$('#success').css('display', 'none');
			$('#span10').css('display', 'block');
			$('#warning').css('display', 'none');

		}
		else {
			$('#lbl').css('color', '#66ff33');
			$('#mentor').css('border', '2px solid #66ff33');
			$('#success').css('display', 'block');
			$('#error').css('display', 'none');
			$('#warning').css('display', 'none');
			$('#span10').css('display', 'none');

		}
		
		
		
		
		
		$('#currentAddress').focusout(function() {
			currentAddress_validate();
		});
	
	
	

	$('#confirmPassword').focusout(function() {
		confirmPassword_validate();
	});

	function confirmPassword_validate() {


		var password = $('#password').val();
		var confirmPassword = $('#confirmPassword').val();

		if (confirmPassword == password) {
			$('#lbl').css('color', '#66ff33');
			$('#confirmPassword').css('border', '2px solid #66ff33');
			$('#success').css('display', 'block');
			$('#error').css('display', 'none');
			$('#warning').css('display', 'none');
			$('#span4').css('display', 'none');
		}
		else {
			$('#lbl').css('color', 'red');
			$('#confirmPassword').css('border', '2px solid red');
			$('#error').css('display', 'block');
			$('#success').css('display', 'none');
			$('#span4').css('display', 'block');
			$('#warning').css('display', 'none');
		}
	};
	
	
});


