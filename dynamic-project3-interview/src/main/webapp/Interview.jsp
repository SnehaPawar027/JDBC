<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Interview data</h1>
	<span style="color: Red"><b>${process}</b></span>
	<form action="save">
		<pre>
		Interview Round: <select name="round">
			<option>Select</option>
			<option>written</option>
			<option>Face2face</option>
			<option>Manager</option>
			<option>Hr round</option>
	</select>
	<br>
		 Company:<select name="company">
			<option>Select</option>
			<option>wiproo</option>
			<option>amazon</option>
			<option>facebook</option>
			<option>TCS</option>
			<option>HP</option>
		</select>
	
		 Venue:<input type="text" name="venue"> <br>
		 package:<input type="text" name="package1"> <br>
		 criteria:<input type="text" name="criteria"><br> 
         <input type="submit" value="save">
         <input type="submit" value="clear">
             
             
</pre>
	</form>
	
	<form action="clear"></form>
	<div>
		<img src="Butterfly.jpg"></img>
	</div>

</body>
</html>