<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'searchInput.jsp' starting page</title>
    
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
    <form action="insertBorrowAction.action" method="POST">
    	学号：<input name="refStuNo" type="text"><br>
		价格：<input name="price" type="text"><br>
		类型：<select name="MType">
						<option selected value="1">外科</option>
						<option  value="2">眼科</option>
						<option value="3">肛肠科</option>
						<option value="4">皮肤科</option>
						<option value="5">其他</option>
					</select>
    	<input type="submit" value="提交"><br/>
    	<input type="reset" value="重置"><br/>
    </form><br>
    	<a href="javascript:history.back(-1)">返回上一页</a><br>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
