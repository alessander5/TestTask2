<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
  <title>Spring MVC Ajax example</title>
  <script type="text/JavaScript"
          src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js">
  </script>

  <script type="text/javascript">
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
        }
      });
    }
  </script>
</head>
<body>
<h3>Enter text:</h3>
<input id="fioInput" placeholder="fio" type="text">
<input id="addressInput" placeholder="address" type="text">
<input id="commentInput" placeholder="comment" type="text">
<input type="button" value="OK" onclick="doAjax()">
</body>
</html>