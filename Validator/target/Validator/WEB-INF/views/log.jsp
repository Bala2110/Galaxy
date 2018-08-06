<html>
<head>
<title>LOG file</title>
</head>
<body>
<button id="myButton" class="float-left submit-button" >Home</button>
<h1>Log Page</h1><br>
<h3>Manikandan  &nbsp; &nbsp; 9840410251 &nbsp; &nbsp; manauto1@yahoo.com &nbsp; &nbsp; Management</h3>
<label for=comment>Enter comments</label><br>
<!input type="text" id="comment" value="" style="width:70%; height:40%;">
<p>
<textarea rows="10" cols="99" ></textarea>
</p>
<p>Please select the status</p>
<form>
  <input type="radio" name="log" value="In Progress"checked>In Progress
  <input type="radio" name="log" value="High Priority">High Priority
  <input type="radio" name="log" value="Low Priority">Low Priority
<input type="radio" name="log" value="Completed">Completed
<input type="radio" name="log" value="Rejected">Rejected<br>
<br>
<input type=submit value="Submit">
<input type=submit value="Cancel">
  </form> 
  <label for=pcomment>Previous Comments</label>
  <p>
  <textarea rows="10" cols="99" ></textarea>
  </p>
<script type="text/javascript">
    document.getElementById("myButton").onclick = function () {
        location.href = "dashboard.jsp";
    };
</script>
</body>
</html>