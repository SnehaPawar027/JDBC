<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Athlete Details</h1>
<body style='background-color: skyblue;'>
	<b>${data}</b>
	<form action="register">
		<pre>
Name: <input type="text" name="name"><br>
Age	: <input type="text" name="age"><br>
Country : <select name="country">
	<option>Select</option>
	<option>India</option>
	<option>Kenada</option>
	<option>USA</option>
	<option>Itali</option>
	<option>Russia</option>
	<option>China</option>
	<option>Japan</option>
</select>

State	: <select name="state"><br>
    <option>Select</option>
	<option>Karnataka</option>
	<option>Goa</option>
	<option>Bhupal</option>
	<option>TamilNadu</option>
	<option>Kerala</option>
	<option>Rajastan</option>
	<option>Dheli</option>
	<option>Sikkim</option>
	</select>
	
City    : <select name="city"><br>
<option>Select</option>
	<option>Bijapur</option>
	<option>Bagalkot</option>
	<option>Dharwad</option>
	<option>Banglore</option>
	<option>Mysore</option>
	<option>Hasan</option>
	<option>Raybhag</option>
	<option>Chitradhurga</option>
	</select>
	
Sports	: <select name="sports"><br>
<option>Select</option>
	<option>Highjump</option>
	<option>Discuss</option>
	<option>Shotput</option>
	<option>Swimming</option>
	<option>Javllin</option>
	<option>Relay </option>
	<option>Hurdles</option>
	<option>Shooting</option>
	</select>

Date Of Birth: <input type="text" name="dob"><br>
     <input  style='background-color: blue;' type="submit" value="save">

</pre>
	</form>

</body>

</html>