<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_pay.css">
</head>
<header >
<h1 id = "head_h1"><u>FJB Music</u></h1>
<div id="navi">
<table>
<tr>
			<td align="center"><img alt=""src="pic/login2.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/nyuuryoku.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/kakunin.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/kanryou.png"class="main_img"></td>
		</tr>
		</table>
		</div>
</header>

<body bgcolor="yellow">
<div id="main1">
	<form action="music_pay2.jsp">
	<div id ="login_title"><font color="red" size =5px><center>【ログインして購入】</center></font><br><center>アカウントをお持ちの方はこちら</center></div>
	<table class="login" height="100px">
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
	</table>
	<input id="login"type="submit" value="ログイン">

	<table class="login2">
	<tr>
	<td><input type="submit" id="gust"name="gust"value="ゲストで購入"a href="PayServlet">
	<td><input type="submit" id="sinki"name="sinki"value="新規会員登録"a href="PayServlet">
	</tr>
	</table>
	</div>
	</form>
</body>
</html>