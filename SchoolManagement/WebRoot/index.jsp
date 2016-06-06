<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body style="text-align:center">
  	<a href="borrow/management.jsp">借书管理</a><br>
  	<a href="class/management.jsp">班级管理</a><br>
  	<a href="dormitory/management.jsp">宿舍管理</a><br>
  	<a href="finance/management.jsp">财务管理</a><br>
  	<a href="medicalTreat/management.jsp">医疗管理</a><br>
  	<a href="student/management.jsp">学生管理</a><br>
  </body>
</html>
