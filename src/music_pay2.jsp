<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_pay.css">
</head>
<header>
	<h1 id="head_h1">FJB Music</h1>

</header>
<body bgcolor="yellow">
<div id="main">
<form action="music_pay3.jsp">
	<table>
		<tr>
			<td>名前<input type="text" name="姓" size="12"><input type="text" name="名" size="12"></td>
		</tr>
		<tr>
			<td>フリガナ<input type="text" name="姓" size="12"><input type="text" name="名" size="12"></td>
		</tr>
		<tr>
			<td>生年月日</td>
		</tr>
		<tr>
			<td>メールアドレス<input type="text" name="アドレス" size="40"></td>
		</tr>
		<tr>
			<td>確認<input type="text" name="アドレス" size="40"></td>
		</tr>
		<tr>
			<td>郵便番号</td>
		</tr>
		<tr>
			<td>都道府県<input type="text" name="都道府県" size="12"></td>
		</tr>
		<tr>
			<td>市区町村<input type="text" name="市区町村" size="12"></td>
		</tr>
		<tr>
			<td>番地・部屋番号<input type="text" name="番地" size="12"></td>
		</tr>
		<tr>
			<td><input type="radio" name="支払い"value="クレジットカード" >お支払い方法</td>
		</tr>
		<tr>
			<td>番号<input type="text" name="カード番号" size="12"></td>
		</tr>
		<tr>
			<td><input type="radio" name="支払い"value="代引き" >代引き</td>
		</tr>
		<tr>
			<td><input id="btn" type="submit" value="確認"></td>
		</tr>



		<!-- 			<div> -->
		<!-- 		<select name="year"> -->
		<?php optionLoop('1950', date('Y'));?>
		<!-- 		</select> 年 <select name="year"> -->
		<?php optionLoop('1', '12');?>
		<!-- 		</select> 月 <select name="day"> -->
		<?php optionLoop('1', '31');?>
		<!-- 		</select> 日 -->
		<!-- 	</div> -->




	</table>
	</form>
	</div>
</body>
</html>