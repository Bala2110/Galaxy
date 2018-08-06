<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<title>search page - bala</title>
</head><body>

<c:url var="searchAction" value="/searchProcess" ></c:url>
 <form:form action="${searchAction}" method="post" commandName="search">
 <div style="text-align: center">
<h1 style="color: violet">Search candidate</h1>

	<form:label path="Name">
				<spring:message text="Name"/>
			</form:label>
		<form:input path="Name" />


<%-- 	<form:label path="Phone">
				<spring:message text="Phone"/>
			</form:label>
		<form:input path="Phone" />

	<form:label path="Email">
				<spring:message text="Email"/>
			</form:label>
		<form:input path="Email" />		

	<form:label path="Course">
				<spring:message text="Course"/>
			</form:label>
		<form:input path="Course" /> --%>

<input type="submit"
					value="<spring:message text="Search"/>" />

<span id=err></span>
</form:form>

<br>
<h3>Search Result</h3>
<c:if test="${!empty listCandidates}">
	<table class="tg" border="1" >
	<tr style="text-align:center">
	
		<th width="120">Candidate Name</th>
		<th width="120">Contact Number</th>
		<th width="60">Email id</th>
		<th width="60">Course</th>
	</tr>
	<c:forEach items="${listCandidates}" var="search">
		<tr>
			<td>${search.name}</td>
			<td>${search.phone}</td>
			<td>${search.email}</td>
			<td>${search.course}</td>
			<%-- <td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td> --%>
		</tr>
	</c:forEach>
	</table>
</c:if>
</div>
</body>
</html>



<!-- <html>
<head>

<title>search page</title>
</head><body>
<button id="myButton" class="float-left submit-button" >Back</button>
<h1>Search</h1>
<label for=name>Candidate Name</label>
<input type=text id=name>
<label for=phone>Contact Number</label>
<input type=text id=phone>
<label for=email>E-mail ID</label>
<input type=text id=email><br>


<br>
<button onclick="myfunction()" >Search</button>
<table id="hidethis" style="display:none;" border="1">
<tr>
<th>Canidate Name</th>
<th>Contact Number</th>
<th>E-mail ID</th>
<th>Course</th>
</tr>
<tr onclick="document.location='log.html'" style="cursor: hand">
<td>Manikandan</td>
<td>9840410251</td>
<td>manauto1@yahoo.com</td>
<td>Management</td>
</tr>
</table>

<script>

var x=document.getElementById("hidethis");
function myfunction(){


if(x.style.display=='none'){
x.style.display='table-row';
}
else{
x.style.display='none';
}}
document.getElementById("myButton").onclick = function () {
        location.href = "dashboard.html";
		}
</script>   
</body>
</html> -->