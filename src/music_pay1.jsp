<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_pay.css">
</head>
<header >
<h1 id = "head_h1">FJB Music</h1>

</header>

<body bgcolor="yellow">
<jsp:include page="test_pay001.jsp"></jsp:include>
	<form action="music_pay2.jsp">
		<div id="main">
			<table>
				<tr>
					<td>ユーザーID<input type="text" name="ユーザーID" size="12"></td>
				</tr>
				<tr>
					<td>パスワード<input type="text" name="パスワード" size="12"></td>
				</tr>
			</table>
			<input type="submit" value="ログイン"> <input type="submit"
				value="ゲストで購入">
		</div>
	</form>
</body>
</html>