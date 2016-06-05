<%@page import="com.base.util.ResultCodeDesc"%>
<%@page import="com.response.AdminResponse"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'registerResult.jsp' starting page</title>
    
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
    <%
    	AdminResponse response2 = (AdminResponse)request.getAttribute("adminResponse");
    	if(response2.getResultCode().equals(ResultCodeDesc.SUCCESS)){
    	
    	%>
    	注册成功，请登陆！<a href="admin/login.jsp">去登陆</a>
    	<%
    	}else{
     %>
     	注册失败，请重试！<%=response2.getResultMsg() %><a href="admin/register.jsp">重新注册</a>
     <%} %>
  </body>
</html>
