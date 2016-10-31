<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
</head>
<header>
	<h1 id="head_h1"><u>FJB Music</u></h1>
	<body>
		<div align="center">
			<link rel="stylesheet" href="css/music_login.css">
			<div id="main1">
				<form action="list.html" method="get">
					<table class="login" height="100px">
						<tr>
							<th>ユーザID</th>
							<td><input type="text" name="user_id" value="" size="24">
							</td>
						</tr>
						<tr>
							<th>パスワード</th>
							<td><input type="password" name="password" value=""
								size="24"></td>
						</tr>
					</table>
				</form>
			<input id="login" type="submit" value="ログイン">
			</div>
		</div>
	</body>
</html>