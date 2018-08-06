<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<title>Galaxy</title></head>
<body>
<h1>WELCOME TO GALAXY</h1>
<h1>Login Page</h1>
<c:url var="addAction" value="/loginProcess" ></c:url>
 <form:form action="${addAction}" method="post" commandName="login">
 

			<form:label path="userName">
				<spring:message text="UserName"/>
			</form:label>
		<form:input path="userName" /><br>
		

		
		
			<form:label path="password">
				<spring:message text="Password"/>
			</form:label>
		<form:password path="password" /><br>
		
		<input type="submit"
					value="<spring:message text="Login"/>" />
<!-- <label for=un>Username</label>
<input type=text placeholder="Enter Username" id=un><br>
<label for=pw>Password</label>
<input type=password placeholder="Enter Password" id=pw><br>
<input type=submit value="Login" >
<input type="reset" value="Cancel"/> -->
<span id=err></span>
</form:form>
</body>
</html>