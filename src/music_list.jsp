<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_list.css">
</head>
<body>

	<!-- インクルード -->
	<jsp:include page="test001.jsp"></jsp:include>

	<!-- ここから -->
	<table style="border-style: none;" border="0" width="100%"
		height="400px" style="table-layout: auto;">
		<tbody>

			<!-- 1 -->
			<td style="border-style: none;" border="0" width="10%"
				bgcolor="#FF11AA">
				<div width="10%" align="center">
					<h3>ジャンル</h3>
					<table border="1" width="100px;" style="table-layout: auto;">
						<tr>
							<td>
								<center>JPOP</center>
							</td>
						</tr>
						<tr>
							<td>
								<center>クラシック</center>
							</td>
						</tr>
						<!-- ここまで -->
					</table>
				</div>


			</td>

			<!-- 2 -->

			<td style="border-style: none;" border="0" width="90%"
				bgcolor="#FFAACC">
				<div width="90%">
					<h3>商品一覧</h3>

					<table border="1" width="100%" style="table-layout: auto;">

						<tr align="center">
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\3000</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\2000</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\3050</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\1200</u></td>
						</tr>
						<tr align="center">
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\3500</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\1000</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\2600</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\2200</u></td>
						</tr>
						<tr align="center">
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\1800</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\1700</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\2600</u></td>
							<td width="25%"><img alt="" src="pic/cd.jpg" id="cd_img"
								width="100px;" height="100px;"> <br> 商品名<br> 金額
								<u>\9000</u></td>
						</tr>


						</div>

						</td>

						</tr>

					</table>
		</tbody>
	</table>
	<center>
		<u>前へ</u> 1 2 3 4 <u>次へ</u>
	</center>
	<footer>
		<br> <br> <br>
		<div id="foot">Copyright FJB Music , all rights reserved.</div>
	</footer>

</body>
</html>