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

	<table>
		<tr>
			<td>名前<input type="text" name="姓" size="12"><input type="text" name="名" size="12"></td>
		</tr>
		<tr>
			<td>フリガナ<input type="text" name="姓" size="12"><input type="text" name="名" size="12"></td>
		</tr>
		<tr>
			<td>生年月日</td>


		<!-- 			<div> -->
		<!-- 		<select name="year"> -->
		<?php optionLoop('1950', date('Y'));?>
		<!-- 		</select> 年 <select name="year"> -->
		<?php optionLoop('1', '12');?>
		<!-- 		</select> 月 <select name="day"> -->
		<?php optionLoop('1', '31');?>
		<!-- 		</select> 日 -->
		<!-- 	</div> -->

		</tr>
		<tr>
			<td>メールアドレス<input type="text" name="アドレス" size="40"></td>
		</tr>
		<tr>
			<td>確認<input type="text" name="アドレス" size="40"></td>
		</tr>



	</table>
</body>
</html>