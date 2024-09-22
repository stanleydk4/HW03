<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lottery</title>
<link href ="<%= request.getContextPath() %>/style/myStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h1>Lottery</h1>
	 <form action="lotteryController.do" method="get">
		 <table border="0" style="margin:auto; text-align: Left">
				<tbody>
					<tr>
						<td>組數: </td><td><input type="int" name="group" id="group" /></td><br/>
					</tr>
					<tr>
						<td>欲排除的數字: </td><td><input type="text" name="excludeNum" id="excludeNum" /></td><br/>
					</tr>
					<tr>
						<td></td>
						<td>
							<br/><input type="reset" value="重設"/>
							<input type="submit" value="提交"/>
						</td>
					</tr>
				</tbody>
		</table>
	</form>
</body>
</html>

