<%@page import="com.response.ClassResponse"%>
<%@page import="com.base.util.ResultCodeDesc"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insertResult.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
	ClassResponse  response2 = (ClassResponse) request
			.getAttribute("classResponse");
	if (response2.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
%>
 <body style="text-align:center">
	插入成功!
	<%
	} else {
%>
	插入失败：<%=response2.getResultMsg()%>
	<%	}
%>
<a href="class/management.jsp">返回管理页面</a>
  	<a href="javascript:history.back(-1)">返回上一页</a>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
