<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.main.Entiry.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- FOR INSERTING -->

 User Details Entered:- <%= request.getAttribute("name") %>




<!-- FOR GETTING ALL DATA
	<h1>List Of Users</h1>
	<table align="center" bgcolor="yellow" border="8px" bordercolor="black"
		cellspacing="5px" cellpadding="8px">

		<tr>
			<th>UID</th>
			<th>UName</th>
			<th>UPassword</th>
			<th>UEmail</th>
		</tr>

		<% 
			List<User> l= (List<User>)request.getAttribute("output");
			
			if(l!=null && !l.isEmpty())
			{
				
			for(User u:l )
{
%>

		<tr>
			<td><%= u.getuId() %></td>
			<td><%= u.getuName() %></td>
			<td><%= u.getuPassword() %></td>
			<td><%= u.getuEmail() %></td>
		</tr>
		<%
}
}
else 
{
%>

		<tr>
			<td>Users Data Not Found!!</td>
		</tr>

		<%
}
%>

	</table>
-->

</body>
</html>