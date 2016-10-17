<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_cart.css">
</head>
<body>
	<jsp:include page="test001.jsp"></jsp:include>
	<div>

		<table width="100%" style="table-layout: auto">
			<td width="10%"></td>
			<td align="center">
				<div>
					<table style="border-style: none;" border="1" bgcolor="white">

						<tr width="100%" style="table-layout: auto">
							<td width="30%">商品画像</td>
							<td width="40%">商品名</td>
							<td width="20%">価格</td>
							<td width="5%">数量</td>
							<td width="5%">取り消し</td>

						</tr>

						<tr style="table-layout: auto">
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

						<tr width="100%" style="table-layout: auto">
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
							<div>
								<table>
									<td><a href="music_pay2.jsp">
											<h1 id="head_logo">注文</h1>
									</a></td>

								</table>


							</div>

						</tr>
					</table>
			</div>
			</td>
			<td width="10%"></td>
		</table>
	</div>



	<footer> Copyright 船橋あいす工房,all rights reserved. </footer>

</body>
</html>