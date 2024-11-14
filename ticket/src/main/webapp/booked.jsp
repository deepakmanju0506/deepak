<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Login</title>
</head>
<body>
<h1>Ticket Booking</h1>
<form action="ticket success" method="post">
<pre>
Stadium Name<select name="name">
<option>select</option>
<option>Adelaide Oval</option>
<option>Melbourne cricket Ground</option>
<option>Belmore </option>
<option>Perth Stadium</option>
<option>AAMI Park</option>
<option>The Gabba</option>
<option>Bankstown Oval</option>
<option>Cazalys Stadium</option>
</select>
Tickets<input type="number" name="ticket"/>
Primary Contact<input type="number" name="contact"/>
Email<input type="email" name="email"/>
<input type="submit" value="Book">

</pre>


</form>
</body>
</html>