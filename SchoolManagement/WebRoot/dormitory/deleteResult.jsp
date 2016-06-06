<%@page import="com.response.DormitoryResponse"%>
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
    
    <title>My JSP 'deleteResult.jsp' starting page</title>
    
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
	DormitoryResponse response2 = (DormitoryResponse) request
			.getAttribute("dormitoryResponse");
	if (response2.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
%>
	删除成功!
	<%
	} else {
%>
	删除失败：<%=response2.getResultMsg()%>
<%	}
%>
<a href="dormitory/management.jsp">返回管理页面</a>
	<a href="javascript:history.back(-1)">返回上一页</a>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
