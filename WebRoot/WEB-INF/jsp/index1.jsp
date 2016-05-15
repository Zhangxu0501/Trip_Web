<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta charset="utf-8">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="body_bg_page.jpg" style="background-size:cover">
  
  <div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
  <img src="img/1.jpg" height="100%" width="100%"/>    
  </div>   
    <form action="search.do" method="post" align="center">
    <div class="top-bottom-middle"></div> 
	<hr/>
	<table align="center" width="450" height="202">
		<tr>
			<td align="left" width="300">  <font size="7" color="#BCEE68">  出发地:</font></td>
			<td align="left"> <input type="textbox" autocomplete="off" placeholder="Enter Name" name="start_place"><br/></td>
		</tr>
		<tr>
		 	<td>  <font size="7" color="#BCEE68">     旅行天数: </font></td>
			<td><input type="textbox" autocomplete="off" placeholder="Enter Date" name="date"><br/>			</td>
		</tr>
		<tr>
			<td>  <font size="7" color="#BCEE68">    目的地:</font></td>
			<td><input type="textbox" autocomplete="off" placeholder="Enter Address" name="end_place"><br/>	</td>
		</tr>
		<tr>
			<td rowspan="2" align="center"><font size=""><input type="submit" value="查询" ></font><br/></td>
		</tr>
	</table>
</form>
  </body>
</html>
