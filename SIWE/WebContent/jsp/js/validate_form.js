function validate_email(field, alerttxt) {
	with (field) {
		apos = value.indexOf("@");
		dotpos = value.lastIndexOf(".");
		if (apos < 1 || dotpos - apos < 2) {
			alert(alerttxt);
			return false;
		} else {
			return true;
		}
	}
}

function validate_password(alerttxt)
{
	var p1 = document.form0.password.value;
	var p2 = document.form0.againPassword.value;

	if(p1 != p2)
		{alert(alerttxt);return false;}
	else
		{return true;}
}


function validate_required(field,alerttxt)
{
with (field)
  {
  if (value==null||value=="")
    {alert(alerttxt);return false;}
  else {return true;}
  }
}




function validate_form(thisform) {
	with (thisform) {
		
		if(validate_required(username,"�û�������Ϊ��Ŷ���ף�����") == false){
			
			username.focus();
			return false;
		}
		
		if(validate_required(password,"���벻��Ϊ��Ŷ���ף�����") == false){
			
			password.focus();
			return false;
		}
		
		if(validate_required(againPassword,"ȷ�����벻��Ϊ��Ŷ���ף�����") == false){
			
			againPassword.focus();
			return false;
		}
		
		
		if(validate_required(againPassword,"ȷ�����벻��Ϊ��Ŷ���ף�����") == false){
			
			againPassword.focus();
			return false;
		}
		
		
		
		if (validate_email(userEmail, "Not a valid e-mail address!") == false) {
			email.focus();
			return false;
		}
		
		if(validate_password("�����ύ�����벻һ��Ŷ��") == false){
			password.focus();
			return false;
		}
		
	}
}




function rewrite_info(){
	form0.username.value = "";
	form0.password.value = "";
	form0.againPassword.value = "";
	form0.userPhone.value = "";
	form0.userOICQ.value = "";
	form0.userEmail.value = "";
	form0.userFrom.value = "";	
	
}
