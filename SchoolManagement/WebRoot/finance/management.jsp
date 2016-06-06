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
    <a href="finance/insertInput.jsp">添加记录</a><br>
    <a href="listFinanceAction.action">查看所有记录</a><br>
    <a href="finance/updateInput.jsp">更新记录</a><br>
    <a href="finance/searchInput.jsp">查找记录</a><br>
    <br>
    	<a href="javascript:history.back(-1)">返回上一页</a><br>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
