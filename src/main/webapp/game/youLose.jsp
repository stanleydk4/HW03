<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoserPage</title>
<link href ="<%= request.getContextPath() %>/style/myStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h1>你沒血條了QQ...</h1>
	<img src="image/cat02.png" style="width: 700px; height: auto;"/>
    </br></br></br>
    <a href="game/guess.jsp">新的一局</a>
    <a href="index.jsp">回到首頁</a>
	<% session.invalidate();%>
</body>
</html>