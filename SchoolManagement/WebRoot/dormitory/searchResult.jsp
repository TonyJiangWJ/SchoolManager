<%@page import="com.bean.Dormitory"%>
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
	DormitoryResponse response2 = (DormitoryResponse) request
			.getAttribute("dormitoryResponse");
	if (response2.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
	List<Dormitory> result = response2.getResult();
%>
		<table border="1" cellspacing="0" align="center" width="80%">
		<tr>
			<td>寝室号</td>
			<td>床号</td>
			<td>学号</td>
			<td>地址</td>
			<td>创建时间</td>
			<td>最后一次修改时间</td>
		</tr>
		<%
			for (int i = 0; i < result.size(); i++) {
		%>
		<tr>
			<td><%=result.get(i).getDorNo()%></td>
			<td><%=result.get(i).getBedNo() %></td>
			<td><%=result.get(i).getRefStuNo() %></td>
			<td><%=result.get(i).getLocation()%></td>
			<td><%=result.get(i).getCreateTime()%></td>
			<td><%=result.get(i).getModifyTime()%></td>
			<td><a
				href="dormitory/updateInput.jsp?id=<%=result.get(i).getId()%>">更新</a></td>
			<td><a href="deleteDormitoryAction.action?id=<%=result.get(i).getId()%>">删除</a></td>
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
<a href="dormitory/management.jsp">返回管理页面</a><br>
    	<a href="javascript:history.back(-1)">返回上一页</a><br>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
