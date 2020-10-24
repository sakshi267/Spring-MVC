<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
FirstName  <form:input path="firstName" />
<br><br>
LastName   <form:input path="lastName"/>
<br><br>

<!-- countries list from properties file -->
<form:select path="country">
<form:options items="${theCountryOptions }"/>

</form:select>
<br> <br>
 Python <form:radiobutton path="favouriteLanguage" value="Python"   />
 Core Java<form:radiobutton path="favouriteLanguage" value="java"   />
 C++ <form:radiobutton path="favouriteLanguage" value="C++"   />
 C fundamentals <form:radiobutton path="favouriteLanguage" value="C"   />
 
 <br><br>
 
 Linux <form:checkbox  path="operatingSystem" value="Linux" />
 Mac Os <form:checkbox path="operatingSystem" value="Mac" />
 MS Windows <form:checkbox path="operatingSystem" value="Windows" />
 

<!-- hard code countries in jsp file
<form:select path="country">
<form:option value="IND" label="INDIA" />
<form:option value="FRA" label="FRANCE" />
<form:option value="JAP" label="JAPAN" />
<form:option value="USA" label="UNITED STATES OF AMERICA" />
</form:select> 



!-->


<br><br>
<input type="submit" value="submit">

</form:form>

</body>

</html>