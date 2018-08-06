<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<title>Dash Board</title>
</head>
<body>
<h1> Dash Board</h1>
<div class="tab">
<c:url var="addCandidate" value="/reg" ></c:url>
<form:form action="${addCandidate}" method="get" commandName="reg">
  <button class="tablinks">ADD CANDIDATE</button></form:form>
  <form action=search.html>
  <button class="tablinks">SEARCH</button></form>
  <form action=workflow.html>
  <button class="tablinks">WORKFLOW</button></form>
</div>

</body>
</html>