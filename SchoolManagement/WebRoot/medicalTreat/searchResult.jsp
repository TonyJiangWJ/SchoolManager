<%@page import="com.base.util.ResultCodeDesc"%>
<%@page import="com.bean.MedicalTreat"%>
<%@page import="com.response.MedicalTreatResponse"%>
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
	MedicalTreatResponse response2 = (MedicalTreatResponse) request
			.getAttribute("medicalTreatResponse");
	if (response2.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
		List<MedicalTreat> result = response2.getResult();
%>
	<table border="1" cellspacing="0" align="center" width="80%">
		<tr>
			<td>学号</td>
			<td>日期</td>
			<td>价格</td>
			<td>类别</td>
			<td>操作1</td>
			<td>操作2</td>
		</tr>
		<%
			for (int i = 0; i < result.size(); i++) {
		%>
		<tr>
			<td><%=result.get(i).getRefStuNo() %></td>
			<td><%=result.get(i).getMDate() %></td>
			<td><%=result.get(i).getPrice() %></td>
			<td><%=result.get(i).getMType() %></td>
			<td><a
				href="borrow/updateInput.jsp?id=<%=result.get(i).getId()%>">更新</a></td>
			<td><a href="deleteBorrowAction?id=<%=result.get(i).getId()%>">删除</a></td>
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
	%><a href="mediaclTreat/management.jsp">返回管理页面</a><br>
    	<a href="javascript:history.back(-1)">返回上一页</a><br>
	<a href="index.jsp">返回首页</a>
</body>
</html>
