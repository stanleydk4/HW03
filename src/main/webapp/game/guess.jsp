<%@page import="com.systex.hw3.GuessGame"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GuessGame</title>
<link href ="<%= request.getContextPath() %>/style/myStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h1>Guess Game!</h1>
		<form action="${pageContext.request.contextPath}/gameController.do" method="get">
			<table border="0" style="margin:auto; text-align: Left">
				<tbody>
					<tr>
						<td>Guess 1 ~ 10: </td>
					</tr>
					<tr>
						<td>
							<input type="number" name="number" id="number" min="1" max="10" />
							<input type="submit" value="提交"/>
						</td>
					</tr>
					<br/><br/><br/><br/><br/><br/>
					<tr>
					<% GuessGame game = (GuessGame) session.getAttribute("game");
					        if (game != null) {
					            out.println("<p>剩餘血量： " + game.getRemains() + "滴血...</p>");
					        }%>
					</tr>
				</tbody>
			</table>
		</form>	
</body>
</html>