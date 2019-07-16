<%@page import="com.dao.in.BidderDaoImpl"%>
<%@page import="com.dao.in.BidderDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <jsp:useBean id="emp" class="com.model.in.Bidder" />
 <jsp:setProperty property="*" name="emp"/>
 <%
 BidderDao selDao= new BidderDaoImpl();
 String id=selDao.register(emp);
    
 %>
   Record inserted with <%=id %>


</body>
</html>