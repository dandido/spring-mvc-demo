<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<title> Student registration page</title>
</head>


<body>

<form:form action="processForm" modelAttribute="student">

	First name : <form:input path="firstName" />
	<br><br>
	Last name : <form:input path="lastName" />
	<br><br>
	
	Country : 
	<form:select path="country">
	<form:option value="Hell Gate" label ="Hell Gate"></form:option>
	<form:option value="France" label ="France"></form:option>
	<form:option value="Tunisia" label ="Tunisia"></form:option>
	<form:option value="Silver City" label ="Silver City"></form:option>

	</form:select>
	
	countryoptimized : 
	<form:select path="countryoptimized">
		<form:options items="${student.countryOptions}"/>
	</form:select>
		
	
	<br><br>
	<input type="submit" value="Submit">
	
</form:form>
</body>
</html>