<%@page import="com.bean.Student"%>
<%@page import="com.base.util.ResultCodeDesc"%>
<%@page import="com.response.StudentResponse"%>
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
		StudentResponse response2 = (StudentResponse) request
				.getAttribute("studentResponse");
		if (response2.getResultCode().equals(ResultCodeDesc.SUCCESS)) {
			List<Student> result = response2.getResult();
	%>
	<table border="1" cellspacing="0" align="center" width="80%">
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>入学年份</td>
			<td>籍贯</td>
			<td>专业</td>
			<td>班级号</td>
			<td>学号</td>
			<td>性别</td>
			<td>操作1</td>
			<td>操作2</td>
		</tr>
		<%
			for (int i = 0; i < result.size(); i++) {
		%>
		<tr>
			<td><%=result.get(i).getName() %></td>
			<td><%=result.get(i).getAge() %></td>
			<td><%=result.get(i).getYear() %></td>
			<td><%=result.get(i).getBirthPlace() %></td>
			<td><%=result.get(i).getSpecialty() %></td>
			<td><%=result.get(i).getClassNo() %></td>
			<td><%=result.get(i).getStuNo() %></td>
			<td><%=result.get(i).getSex() %></td>
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
	%>
</body>
</html>
