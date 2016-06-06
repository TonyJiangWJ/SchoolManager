<%@page import="com.base.util.ResultCodeDesc"%>
<%@page import="com.response.AdminResponse"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'resetResult.jsp' starting page</title>

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
		AdminResponse adminResponse = (AdminResponse) request
				.getAttribute("adminResponse");
		if (adminResponse.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
	%>
	修改成功！
	<%
		} else {
	%>
	修改失败！<%=adminResponse.getResultMsg()%>
	<%
		}
	%><br><a href="javascript:history.back(-1)">返回上一页</a><br>
	<a href="index.jsp">返回首页</a>
</body>
</html>
