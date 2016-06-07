<%@page import="com.bean.MClass"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.response.ClassResponse"%>
<%@page import="com.base.util.ResultCodeDesc"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'searchResult.jsp' starting page</title>
    
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
	ClassResponse response2 = (ClassResponse) request
			.getAttribute("classResponse");
	if (response2.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
		List<MClass> result = response2.getResult();
%>
	<table border="1" cellspacing="0" align="center" width="80%">
		<tr>
			<td>班级名称</td>
			<td>班级号</td>
			<td>年级</td>
			<td>学生人数</td>
			<td>操作1</td>
			<td>操作2</td>
		</tr>
		<%
			for (int i = 0; i < result.size(); i++) {
		%>
		<tr>
			<td><%=result.get(i).getClassName() %></td>
			<td><%=result.get(i).getClassNo()%></td>
			<td><%=result.get(i).getGrade() %></td>
			<td><%=result.get(i).getStudentNum()%></td>
			<td><a
				href="class/updateInput.jsp?id=<%=result.get(i).getId()%>">更新</a></td>
			<td><a href="deleteClassAction.action?id=<%=result.get(i).getId()%>">删除</a></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		} else {
	%>
	失败：<%=response2.getResultMsg()%>
	<%
		}
	%>
	    	<a href="borrow/management.jsp">返回管理页面</a>
	    		<a href="javascript:history.back(-1)">返回上一页</a>
	<a href="index.jsp">返回首页</a>
</html>
