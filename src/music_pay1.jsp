<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_pay.css">
</head>
<header >
<h1 id = "head_h1">FJB Music</h1>
<div id="navi">
<table>
<tr>
			<td><img alt=""src="pic/login2.png"class="main_img">
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
			<table id="tbl" border="1">
				<tr>
					<td id="in">ユーザーID　　　　<input type="text" name="ユーザーID" size="12"></td>
				</tr>
				<tr>
					<td id="in">パスワード　　　　<input type="text" name="パスワード" size="12"></td>
				</tr>
				<tr>
					<td id="in">パスワード再入力<input type="text" name="パスワード" size="12"></td>
				</tr>
			</table>

	<div id="btnbox">
			<input id="btn" type="submit" value="ログイン"> <input id="btn" type="submit"
				value="ゲストで購入"></div>

	</form>
	</div>
</body>
</html>