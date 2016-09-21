<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loja Virtual de Silas</title>
</head>
<body>
	<form action="SubmitNameServlet" method="post">
	<label for="name">Calça:</label>
	<input type="text" name="name" id="name"/>
	<br/>
	<label for="name2">Camisa:</label>
	<input type="text" name="name2" id="name2"/>
	<br/>
	<label for="name3">Tênis:</label>
	<input type="text" name="name3" id="name3"/>
	<br/>
	<input type="submit" value="Confirme"/>
	</form>
</body>
</html>