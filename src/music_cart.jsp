<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_cart.css">
</head>
<body>
	<jsp:include page="test001.jsp"></jsp:include>
	<div>
		<table style="border-style: none;" border="1" width="100%"
			style="table-layout: auto">

			<tr width="100%" style="table-layout: auto">
				<td width="30%">商品画像</td>
				<td width="40%">商品名</td>
				<td width="20%">販売価格</td>
				<td width="10%">数量</td>

			</tr>

			<tr width="100%" style="table-layout: auto">
				<td width="30%"><img src="pic/wanima_art.jpg" align="left"></td>
				<td width="40%">WANIMA/JUICE UP‼</td>
				<td width="20%">\100/\108</td>
				<td width="10%"><select name="vol">
						<option value="サンプル1">1</option>
						<option value="サンプル2">2</option>
						<option value="サンプル3">3</option>
				</select></td>

			</tr>

			<tr width="100%" style="table-layout: auto">
				<td width="30%">注文合計</td>
				<td width="40%">なぞのスペース</td>
				<td width="20%">\100/\108</td>
				<td width="10%">1点</td>
			</tr>
			<tr style="table-layout: auto">
				<td><input type="submit" name="oder" value="注文"></td>
			</tr>
		</table>
	</div>

	<footer> Copyright 船橋あいす工房,all rights reserved. </footer>

</body>
</html>