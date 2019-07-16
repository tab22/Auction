<%@page import="com.dao.in.SellerDaoImpl"%>
<%@page import="com.dao.in.SellerDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <jsp:useBean id="emp" class="com.model.in.Seller" />
 <jsp:setProperty property="*" name="emp"/>
 <%
 SellerDao selDao= new SellerDaoImpl();
 int id=selDao.insert(emp);
    
 %>
   Record inserted with <%=id %>


</body>
</html>