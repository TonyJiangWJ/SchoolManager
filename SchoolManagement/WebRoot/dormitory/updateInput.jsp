<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateInput.jsp' starting page</title>
    
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
 	<form action="searchDormitoryAction.action" method="POST">
 	<input name="id" type="hidden" value="<%=request.getAttribute("id") %>">
    	床号：<input name="bedNo" type="text"><br>
    	寝室号：<input name="dorNo" type="text"><br>
    	学号：<input name="refStuNo" type="text"><br>
    	地址：<select name="location" id="location" >
    					<option selected value="1号楼">1号楼</option>
    					<option value="2号楼">2号楼</optioin>
    					<option value = "3号楼">3号楼</option>
    					<option value="4号楼">4号楼</option>
    					<option value="5号楼">5号楼</option>
    				    <option value="6号楼">6号楼</option>
    				    <option value="7号楼">7号楼</option>
    				    <option value="8号楼">8号楼</option>
    				</select><br>
    	房间大小：<select name="size" id="size" >
    					<option selected value="4">4人寝</option>
    					<option value="5">5人寝</optioin>
    				</select><br>
    	<input type="submit" value="提交"><br/>
    	<input type="reset" value="重置"><br/>
    </form>
    	<a href="dormitory/management.jsp">返回管理页面</a><br>
    	<a href="javascript:history.back(-1)">返回上一页</a><br>
	<a href="index.jsp">返回首页</a>
  </body>
</html>
