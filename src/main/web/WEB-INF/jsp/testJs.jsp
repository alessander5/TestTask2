<html>
<script src="http://code.jquery.com/jquery-1.10.2.min.js" type="text/javascript" ></script>
<script type="text/javascript">
    $(document).ready(function() {
        $("#test").click(function(){
            $.get("/test/ajaxtest",function(data,status){
                alert("Data: " + data + "\nStatus: " + status);
            });
        });
    });
</script>
<body>
<input name="fio" value="" title="ФИО" maxlength="255" type="text" onchange="checkFIO()">
</body>
</html>