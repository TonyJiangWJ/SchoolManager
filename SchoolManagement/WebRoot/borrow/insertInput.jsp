<%@page import="java.sql.Timestamp"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insertInput.jsp' starting page</title>
    
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
    	书名：<input name="BName" type="text"><br>
    	类型：<select name="BType" id="BType" >
    					<option selected value="1">文艺</option>
    					<option value="2">技术</optioin>
    					<option value = "3">教材</option>
    					<option value="4">其他</option>
    				</select><br>
    	状态：<select name="BStatus" id="BStatus" >
    					<option selected value="1">新借</option>
    					<option value="2">已归还</optioin>
    				</select><br>
    	学号：<input name="refStuNo" type="text"><br>
    	<input type="submit" value="提交"><br/>
    	<input type="reset" value="重置"><br/>
    </form>
  </body>
</html>
