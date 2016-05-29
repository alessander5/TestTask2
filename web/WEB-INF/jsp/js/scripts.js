	function checkFIO() {
		var form = document.forms.orderForm;
		var surname = form.elements.fio;
		if (surname.value.length<5) {
			document.getElementById('spanSurname').innerHTML = "Field 'FIO' must be longer than 5 chars";
		}else{
			document.getElementById('spanSurname').innerHTML = "";
		}
	}

	function checkTel() { 
		var form = document.forms.orderForm;
		var tel = form.elements.tel;
		var re = /^\+\d{2}\(\d{3}\)\d{3}-\d{2}-\d{2}$/;
		
		if (!re.test(tel.value)){
			document.getElementById('spanTel').innerHTML = "Field 'Tel' must be +xx(xxx)xxx-xx-xx  format";
		}else{
			document.getElementById('spanTel').innerHTML = "";
		}
	}
	