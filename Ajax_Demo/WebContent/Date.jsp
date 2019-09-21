<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*,java.text.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Date</title>
</head>
<body>
<%
 Date d=new Date();
 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-YYYY");
 SimpleDateFormat sdf1=new SimpleDateFormat("EEEE");
 String str=sdf.format(d);
 String str1=sdf1.format(d);
 String str2="Abhilash Sharma Welcomes you all on this day";
%>
<%=str +"  "+str1%><br>
<%=str2 %>
</body>
</html>