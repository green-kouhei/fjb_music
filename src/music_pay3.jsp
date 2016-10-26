<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_pay.css">
</head>
<header>
	<h1 id="head_h1"><u>FJB Music</u></h1>

</header>
<body bgcolor="yellow">
<div id="navi">
<table>
<tr>
			<td align="center"><img alt=""src="pic/login.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/nyuuryoku.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/kakunin2.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/kanryou.png"class="main_img"></td>
		</tr>
		</table>
		</div>
<div id="main3">
<form action="music_pay4.jsp">
<table  class="title1">
<tr>
<td align="center" ><font size ="6">購入商品</font></td>
</tr>
</table>

<div>


		<table class="cartcss" style="border-style: none;" border="1"
			bgcolor="white">

			<tr>
				<td width="30%">商品画像</td>
				<td width="40%">商品名</td>
				<td width="20%">価格</td>
				<td width="5%">数量</td>

			</tr>

			<tr>
				<td align="center"width="30%"><img src="pic/wanima_art.jpg" align="left"></td>
				<td align="center"width="40%">WANIMA/JUICE UP‼</td>
				<td align="right"width="20%">\100/\108</td>
				<td align="center"width="5%">1

				</td>

			</tr>
			<tr>
				<td align="center"width="30%"><img src="pic/wanima_art.jpg" align="left"></td>
				<td align="center"width="40%">WANIMA/JUICE UP‼</td>
				<td align="right"width="20%">\100/\108</td>
				<td align="center"width="5%">1
			</tr>

		</table>
<table  class="title2">
<tr>
<td align="center" ><font size ="6">お客様情報</font></td>
</tr>
</table>
<table border="1" class="sample3">
		<tr>
			<td align="center" class="left3">氏名</td>
			<td  class="rigth3">船橋　太郎</td>
		</tr>
		<tr>
			<td align="center" class="left3">フリガナ</td>
			<td class="rigth3">フナバシ　タロウ</td>
		</tr>
		<tr>
			<td align="center" class="left3">生年月日</td>
			<td class="rigth3">1996年1月1日</td>
		</tr>
		<tr>
			<td align="center" class="left3">メールアドレス</td>
			<td class="rigth3">x15g000@chiba-fjb.ac.jp</td>
		</tr>
			<td align="center" class="left3">郵便番号 </td>
			<td class="rigth3">12345678</td>
		</tr>
		<tr>
			<td align="center" class="left3">住所（お届け先）</td>
			<td class="rigth3">千葉県船橋市船橋123</td>
		</tr>
		<tr>
			<td align="center" class="last3">お支払い方法</td>
			<td class="rigth3">クレジットカード<br>
			番号：xxxx-xxxx-xxxx-1234</td>


	</table>

	<table border="1" class="kakutei">
	<tr>
	<td align="center">配送料・手数料</td><td align="right">\540</td>
	</tr>
	<tr>
	<td align="center">商品小計</td><td align="right">\216</td>
	</tr>
	<tr>
	<td align="center">お支払い合計</td><td align="right">\756</td>
	</tr>
	</table>
	<input id="kakutei" type="submit" name="kakutei"value="注文を確定">
	</div>
	</form>
	</div>
</body>
</html>