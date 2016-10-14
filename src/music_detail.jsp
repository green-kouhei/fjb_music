<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_detail.css">
</head>
<body>

	<!-- インクルード -->
	<jsp:include page="test001.jsp"></jsp:include>

	<!-- ここから -->
	<table style="border-style: none;" border="1" width="100%"
		style="table-layout: auto">

		<!-- サイド関連_R -->
		<tr width="20%">
			<!-- ここにかく -->

		</tr>

		<!-- 詳細 -->
		<tr width="60%">
			<div>
				<div class="soreppoi" align="center">商品詳細</div>
				<div class="main_detail">
					<img alt="" src="pic/cd.jpg" id="cd_img"><br> <br>
					<br>
					<div id="mei">
						商品名
					</div>

					<span id="sin">歌手</span>

					<div class="mu">
						<div id="na">
							曲名1
							<audio controls preload="auto" style="width: 200px;">

							</audio>
						</div>
						<div id="na">曲名2</div>
						<span id="shi"> <audio controls preload="auto"
								style="width: 200px;">

							</audio>
						</span>
					</div>
					<img alt="" src="pic/cart.png" id="cart_img"><br> <br>
					<br> <br>
					<div id="kaka">カートへ</div>
				</div>


			</div>

		</tr>

		<!-- サイド関連_L -->
		<tr width="20%">

			<!-- ここにかく -->

		</tr>
	</table>



	<footer>
		<br> <br> <br> <br>
		<div id="foot">Copyright FJB Music , all rights reserved.</div>
	</footer>

</body>
</html>