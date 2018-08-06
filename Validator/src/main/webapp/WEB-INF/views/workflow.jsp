<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Workflow page</title>
<style>

/* Style the tab */
.tab {
    overflow: hidden;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
    background-color: inherit;
    float: left;
    border: none;
    outline: none;
    cursor: pointer;
    padding: 14px 16px;
    transition: 0.3s;
    font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
    background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
    background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 6px 12px;
    border: 1px solid #ccc;
    border-top: none;
}
</style>
</head>
<h1>Workflow page</h1>
<body>
<c:url var="workAction" value="/registered" ></c:url>
 <form:form action="${workAction}" method="post" commandName="work">
<div class="tab">
  <button class="tablinks" onclick="workflow(event, 'Registered')">REGISTERED</button>
  <button class="tablinks" onclick="workflow(event, 'InProgress')">IN PROGRESS</button>
  <button class="tablinks" onclick="workflow(event, 'High')">HIGH</button>
  <button class="tablinks" onclick="workflow(event, 'Low')">LOW</button>
  <button class="tablinks" onclick="workflow(event, 'Completed')">COMPLETED</button>
  <button class="tablinks" onclick="workflow(event, 'Rejected')">REJECTED</button>
</div>
</form:form>
<div id="Registered" class="tabcontent">
<c:if test="${!empty listCandidates}">
	<table class="tg" border="1" >
	<tr style="text-align:center" onclick="document.location='log.jsp'" style="cursor: hand">
	
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

<div id="InProgress" class="tabcontent">
<c:if test="${!empty listCandidates}">
	<table class="tg" border="1" >
	<tr style="text-align:center" onclick="document.location='log.jsp'" style="cursor: hand">
	
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

<div id="High" class="tabcontent">
<c:if test="${!empty listCandidates}">
	<table class="tg" border="1" >
	<tr style="text-align:center" onclick="document.location='log.jsp'" style="cursor: hand">
	
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

<div id="Low" class="tabcontent">
<c:if test="${!empty listCandidates}">
	<table class="tg" border="1" >
	<tr style="text-align:center" onclick="document.location='log.jsp'" style="cursor: hand">
	
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

<div id="Completed" class="tabcontent">
<c:if test="${!empty listCandidates}">
	<table class="tg" border="1" >
	<tr style="text-align:center" onclick="document.location='log.jsp'" style="cursor: hand">
	
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

<div id="Rejected" class="tabcontent">
<c:if test="${!empty listCandidates}">
	<table class="tg" border="1" >
	<tr style="text-align:center" onclick="document.location='log.jsp'" style="cursor: hand">
	
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


<script>
function workflow(evt, cityName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}
</script>


</body>
</html>