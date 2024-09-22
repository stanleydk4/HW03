<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ResultPage</title>
<link href ="<%= request.getContextPath() %>/style/myStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h2>已產生號碼，祝您中獎</h2>
	<h5 color:red>購買彩券應該量力而為，勿因過度投注而影響正常生活</h5>
	<table border="0" style="margin: auto; text-align: left">
		<today>
			<% 	List<List<Integer>> generatedNumbers = (List<List<Integer>>) request.getAttribute("generatedNumbers"); 
				for(List<Integer> group : generatedNumbers) {%>
					<tr><td><% out.println(group);%></td></tr>
		                
		       	 <% }%>
	    </today>
    </table>
    </br></br></br>
    <a href="main.jsp">重新產生</a>
    <a href="../index.jsp">回到首頁</a>
	<% session.invalidate();%>
</body>
</html>