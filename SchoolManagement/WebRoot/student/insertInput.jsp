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
    <form action="insertStudentAction.action" method="POST">
    	姓名：<input name="name" type="text"><br>
    	年龄：<input name="age" type="text"><br>
    	入学年份：<input name="year" type="text"><br>
    	籍贯：<input name="birthPlace" type="text"><br>
    	专业：<input name="specialty" type="text"><br>
    	班级号：<input name="classNo" type="text"><br>
    	性别：<input name="sex" type="text"><br>
    	学号：<input name="stuNo" type="text"><br>
    	<input type="submit" value="提交"><br/>
    	<input type="reset" value="重置"><br/>
    </form><br><a href="student/management.jsp">返回管理页面</a><br>
    	<a href="javascript:history.back(-1)">返回上一页</a><br>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
