function doAjax() {

	var inputFio = $("#fioInput").val();
	var inputAddress= $("#addressInput").val();
	var inputComment = $("#commentInput").val();

	$.ajax({
		url : 'addSubString',
		type: 'GET',
		dataType: 'json',
		contentType: 'application/json',
		mimeType: 'application/json',
		data : ({
			fio: inputFio,
			address: inputAddress,
			comment: inputComment
		}),
		success: function (data) {
			document.getElementById("fioInput").value = data.fio;
			document.getElementById("addressInput").value = data.address;
			document.getElementById("commentInput").value = data.comment;
			document.getElementById("showHide").style.display = "block";
		}
	});
}