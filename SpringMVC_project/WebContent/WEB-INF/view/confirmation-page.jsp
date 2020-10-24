<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Student Confirmation Page</title>

</head>
<body>

Registration Completed for ${ student1.firstName} ${student1.lastName }  
<br> <br>
Country:  ${student1.country }
<br><br>

Favourite Language:     ${student1.favouriteLanguage }
<br><br>
Operating Systems:

<ul>
<c:forEach  var ="temp" items="${ student1.operatingSystem}">

<li>  ${temp }   </li>
</c:forEach>
</ul>

</body>
</html>