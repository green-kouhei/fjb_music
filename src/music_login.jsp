<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
</head>
<header>
	<h1 id="head_h1">FJB Music</h1>
	<body>
		<hr>
		<div align="center">
			<link rel="stylesheet" href="css/music_login.css">
			<table border="0">
				<form action="list.html" method="get">
					<tr>
						<th>ユーザID</th>
						<td><input type="text" name="user_id" value="" size="24">
						</td>
					</tr>
					<tr>
						<th>パスワード</th>
						<td><input type="password" name="password" value="" size="24">
						</td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="ログイン"></td>
					</tr>
				</form>
			</table>
		</div>
	</body>
</html>