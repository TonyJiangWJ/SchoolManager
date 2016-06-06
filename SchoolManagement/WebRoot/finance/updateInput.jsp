<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateInput.jsp' starting page</title>
    
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
    <form action="updateFinanceAction.action" method="POST">
    	学费：<input name="tuition" type="text"><br>
    	班费：<input name="classMoney" type="text"><br>
    	住宿费：<input name="houseFee" type="text"><br>
    	学号：<input name="refStuNo" type="text"><br>
    	<input type="submit" value="提交"><br/>
    	<input type="reset" value="重置"><br/>
    </form>
  </body>
</html>
