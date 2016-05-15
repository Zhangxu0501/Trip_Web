<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="img/1.jpg" style="background-attachment:fixed;background-size:cover">  
  <table border="1" bordercolor="#BBFFFF" align="center" width="100%">
	<caption align="top"><font size="7" color="#BCEE68">经过计算我们推荐</font></caption>
	<tr>
		<th align="center" ><font size="4" color="#BCEE68">出发地</font></th>
		<th align="center" ><font size="4" color="#BCEE68">目的地</font></th>
		<th align="center" ><font size="4" color="#BCEE68">出发日期</font></th>
		<th align="center" ><font size="4" color="#BCEE68">价格</font></th>
		<th align="center" ><font size="4" color="#BCEE68">景点信息</font></th> 	
		<th align="center" ><font size="4" color="#BCEE68">交通方式</font></th>
		<th align="center" ><font size="4" color="#BCEE68">总天数</font></th>  
		<th align="center" ><font size="4" color="#BCEE68">酒店信息</font></th> 
		<th align="center" ><font size="4" color="#BCEE68">详细信息</font></th>
	</tr>
	
	  <c:forEach  items="${recommend}" var="recommend" >
		<tr>
		 	<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${recommend.start_place}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">	${recommend.end_place}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${recommend.start_date}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${recommend.price}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${recommend.tour_route}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${recommend.traffic}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${recommend.time}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${recommend.hotel}</font></td>
			<td align="center" ><a href=${recommend.url} target="blank"><font size="2" color="#BCEE68">点击查看</font></a></td>
		</tr>
	  </c:forEach>
	</table>
	
<table border="1" bordercolor="#BBFFFF" align="center" width="100%">
	<caption align="top"><font size="7" color="#BCEE68">途牛网推荐</font></caption>
	<tr>
		<th align="center" ><font size="4" color="#BCEE68">出发地</font></th>
		<th align="center" ><font size="4" color="#BCEE68">目的地</font></th>
		<th align="center" ><font size="4" color="#BCEE68">出发日期</font></th>
		<th align="center" ><font size="4" color="#BCEE68">价格</font></th>
		<th align="center" ><font size="4" color="#BCEE68">景点信息</font></th> 	
		<th align="center" ><font size="4" color="#BCEE68">交通方式</font></th>
		<th align="center" ><font size="4" color="#BCEE68">总天数</font></th>  
		<th align="center" ><font size="4" color="#BCEE68">酒店信息</font></th> 
		<th align="center" ><font size="4" color="#BCEE68">详细信息</font></th>
	</tr>
	
	  <c:forEach  items="${tuniu}" var="tuniu" >
		<tr>
		 	<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${tuniu.start_place}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">	${tuniu.end_place}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${tuniu.start_date}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${tuniu.price}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${tuniu.tour_route}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${tuniu.traffic}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${tuniu.time}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${tuniu.hotel}</font></td>
			<td align="center" ><a href=${tuniu.url} target="blank"><font size="2" color="#BCEE68">点击查看</font></a></td>
		</tr>
	  </c:forEach>
	</table>
	
	<table border="1" bordercolor="#BBFFFF" align="center" width="100%">
	<caption align="top"><font size="7" color="#BCEE68">去哪儿网推荐</font></caption>
	<tr>
		<th align="center" ><font size="4" color="#BCEE68">出发地</font></th>
		<th align="center" ><font size="4" color="#BCEE68">目的地</font></th>
		<th align="center" ><font size="4" color="#BCEE68">出发日期</font></th>
		<th align="center" ><font size="4" color="#BCEE68">价格</font></th>
		<th align="center" ><font size="4" color="#BCEE68">景点信息</font></th> 	
		<th align="center" ><font size="4" color="#BCEE68">交通方式</font></th>
		<th align="center" ><font size="4" color="#BCEE68">总天数</font></th>  
		<th align="center" ><font size="4" color="#BCEE68">酒店信息</font></th> 
		<th align="center" ><font size="4" color="#BCEE68">详细信息</font></th>
	</tr>
	  <c:forEach  items="${qunai}" var="qunai" >
		<tr>
		 	<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${qunai.start_place}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">	${qunai.end_place}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${qunai.start_date}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${qunai.price}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${qunai.tour_route}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${qunai.traffic}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${qunai.time}</font></td>
			<td align="center" ><font size="2" color="#BCEE68" style="font-weight:bold">		${qunai.hotel}</font></td>
			<td align="center" ><a href=qunai.url target="blank"><font size="2" color="#BCEE68">点击查看</font></a></td>
		</tr>
	  </c:forEach>
	</table>
  </body>
</html>
