<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_cart.css">
</head>
<body>
	<jsp:include page="test001.jsp"></jsp:include>
	<div>


		<table class="cartcss" style="border-style: none;" border="1"
			bgcolor="white">

			<tr>
				<td width="30%">商品画像</td>
				<td width="40%">商品名</td>
				<td width="20%">価格</td>
				<td width="5%">数量</td>
				<td width="5%">取り消し</td>

			</tr>

			<tr>
				<td width="30%"><img src="pic/wanima_art.jpg" align="left"></td>
				<td width="40%">WANIMA/JUICE UP‼</td>
				<td width="20%">\100/\108</td>
				<td width="5%"><select name="vol">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="3">4</option>
						<option value="3">5</option>
						<option value="3">6</option>
						<option value="3">7</option>
						<option value="3">8</option>
						<option value="3">9</option>
						<option value="3">10</option>
				</select>
				<td width="5%"><input type="submit" name="remove" value="削除"></td>


				</td>

			</tr>

			<tr>
				<td width="30%"><img src="pic/wanima_art.jpg" align="left"></td>
				<td width="40%">WANIMA/JUICE UP‼</td>
				<td width="20%">\100/\108</td>
				<td width="5%"><select name="vol">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="3">4</option>
						<option value="3">5</option>
						<option value="3">6</option>
						<option value="3">7</option>
						<option value="3">8</option>
						<option value="3">9</option>
						<option value="3">10</option>
				</select>
				<td width="5%"><input type="submit" name="remove" value="削除"></td>






			</tr>




		</table>

	</div>
	<div>
		<table style="margin: 5px 40% 5px 30%;">

			<td style="padding: 2px 100px" bgcolor="#FF3300" nowrap>
				<div>
					<font size="4" face="ＭＳ ゴシック">注文合計</font><br> \1,000
				</div>
<!-- 				<div> -->
<!-- 					<input type="email" maxlength="128" id="ap_email" name="email" -->
<!-- 						tabindex="1" -->
<!-- 						class="a-input-text a-span12 auth-autofocus auth-required-field"> -->
<!-- 				</div> -->
			</td>
			<td><a href="music_pay2.jsp"><img src="pic/oder_button.png"
					width="180" height="57" alt="button" class="rollover"></a></td>

		</table>
	</div>


	<footer> Copyright 船橋あいす工房,all rights reserved. </footer>

</body>
</html>