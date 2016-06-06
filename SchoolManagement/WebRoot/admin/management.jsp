<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'management.jsp' starting page</title>
    
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
  <%if(session.getAttribute("userName")!=null){ %>
  	已经登陆！<%=session.getAttribute("userName") %><a href="admin/logout.jsp">注销</a>
  	<br><a href="admin/resetPwd.jsp">重置密码</a><br>
  <%} else{%>
    <a href="admin/login.jsp">登陆</a><br>
    <a href="admin/register.jsp">注册</a><br>
    <%} %>
    
  </body>
</html>
