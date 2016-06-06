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
    <form action="searchClassAction.action" method="POST">
    		班级名称：<input name="className" type="text"><br>
    	班级号：<input name="classNo" type="text"><br>
    	年级：<select name="grade" id="grade" >
    					<option selected value="大一">大一</option>
    					<option value="大二">大二</optioin>
    					<option value = "大三">大三</option>
    					<option value="大四">大四</option>
    				</select>
  	<input type="submit" value="提交"><br/>
    	<input type="reset" value="重置"><br/>
    </form>
    	<a href="class/management.jsp">返回管理页面</a>
    		<a href="javascript:history.back(-1)">返回上一页</a>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
