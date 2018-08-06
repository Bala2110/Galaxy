<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<title>Registration page</title>
</head><body>

<c:url var="addAction" value="/regProcess" ></c:url>
 <form:form action="${addAction}" method="post" commandName="reg">
<h1>Registration Form</h1>

	<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		<form:input path="name" /><br>


	<form:label path="phone">
				<spring:message text="Phone"/>
			</form:label>
		<form:input path="phone" /><br>

	<form:label path="email">
				<spring:message text="Email"/>
			</form:label>
		<form:input path="email" />		<br>

	<form:label path="course">
				<spring:message text="Course"/>
			</form:label>
		<form:input path="course" /><br>

<input type="submit"
					value="<spring:message text="Register"/>" />

<span id=err></span>

</form:form>
<c:if test="${!empty result}">
<span>"${result}"</span>
</c:if>
<!-- <script type="text/javascript">
var cname=document.getElementById("name");
var cnum=document.getElementById("phone");
var cmail=document.getElementById("email");
var ccour=document.getElementById("course");
var errspan=document.getElementById("err");
function validate(){
cnameformat=/^[A-Z a-z]{1,20}$/;
result=cnameformat.test(cname.value);
if(result==false){
errspan.innerHTML="Should be 1 to 20 alphabets";
cname.focus();
return false;
}

}

    document.getElementById("myButton").onclick = function () {
        location.href = "dashboard.html";
    };
</script> -->
</body>
</html>