<%@page import="com.base.util.ResultCodeDesc"%>
<%@page import="com.bean.Finance"%>
<%@page import="com.response.FinanceResponse"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		FinanceResponse response2 = (FinanceResponse) request
				.getAttribute("borrowResponse");
		if (response2.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
			List<Finance> result = response2.getResult();
	%>
	<table border="1" cellspacing="0" align="center" width="80%">
		<tr>
			<td>学号</td>
			<td>学费</td>
			<td>班费</td>
			<td>住宿费</td>
			<td>操作1</td>
			<td>操作2</td>
		</tr>
		<%
			for (int i = 0; i < result.size(); i++) {
		%>
		<tr>
			<td><%=result.get(i).getRefStuNo() %></td>
			<td><%=result.get(i).getTuition() %></td>
			<td><%=result.get(i).getClassMoney() %></td>
			<td><%=result.get(i).getHouseFee() %></td>
			<td><a
				href="finance/updateInput.jsp?id=<%=result.get(i).getId()%>">更新</a></td>
			<td><a href="deleteFinanceAction?id=<%=result.get(i).getId()%>">删除</a></td>
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
</body>
</html>
