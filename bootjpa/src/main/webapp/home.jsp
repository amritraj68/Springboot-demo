<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<form action="registerUser" method="post">
<input type="text" placeholder="User ID" name="userId"><br>
<input type="text" placeholder="UserName" name="userName"><br>
<input type="email" placeholder="Email Address"  name="userEmail"><br>
<input type="password" placeholder="Password" name="userPassword"><br><br><br>
<input type="submit"><br>


<h2>Display All Users</h2>
</form>

<form action="displayUser" method="get" > 
<input type="text" placeholder="User ID" name="userId"><br>
<input type ="submit" Value="Display User ">
</form>

</body>
</html>