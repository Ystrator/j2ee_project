function checkselect(object) {
	if (object.name.value == "") {
		alert("�û�������Ϊ�գ�");
		return false;
	} else if (object.password.value == "") {
		alert("���벻��Ϊ�գ�");
		return false;
	} else {
		return true;
	}

}