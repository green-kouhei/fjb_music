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
	<table style="border-style: none;" border="0" width="100%"
		height="400px" style="table-layout: auto;">
		<tbody>

			<!-- 1 -->
			<td style="border-style: none;" border="0" width="20%"
				bgcolor="#FF11AA">
				<div width="20%">
					<h3>同一アーティストの作品</h3>
					<table border="0" width="100%" style="table-layout: auto;">
						<tr>
							<td><img src="pic/wanima_art.jpg" align="left">
								<dd>
									WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
								</dd></td>
						</tr>
						<tr>
							<td><img src="pic/wanima_art.jpg" align="left">
								<dd>
									WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
								</dd></td>
						</tr>
						<tr>
							<td><img src="pic/wanima_art.jpg" align="left">
								<dd>
									WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
								</dd></td>
						</tr>
						<tr>
							<td><img src="pic/wanima_art.jpg" align="left">
								<dd>
									WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
								</dd></td>
						</tr>
						<!-- ここまで -->
					</table>
				</div>


			</td>

			<!-- 2 -->

			<td style="border-style: none;" border="0" width="60%"
				bgcolor="#FFAACC">
				<div width="60%">
					<h3>商品詳細</h3>

					<table border="0" width="100%" style="table-layout: auto;">

						<tr>
							<td width="50%"><img alt="" src="pic/cd.jpg" id="cd_img">
							</td>
							<td width="50%">
								<div class="syou">
									<span id="mei">商品名</span><span id=ja>　　　JPOP</span>

									<br> <br>

									<div id="sin">歌手</div>
									<br>
									 <br>
									 <span id="kane"> 金額
									 <br>CD　　　　<u>\3000</u><input type ="radio" name="sen" value="CD">
									 <br>
									 デジタル　<u>\2500</u><input type ="radio" name="sen" value="Digital">

									</span> <img alt="" src="pic/cart.png" id="cart_img"><br> <br>
									<br>
									<div id="kaka">カートへ</div>

								</div>

							</td>

						</tr>

						<tr>
							<td width="50%">
								<!-- 						視聴場所 -->
								<div id="na">
									曲名1
									<audio controls preload="auto" style="width: 200px;">

									</audio>
								</div> <br>
								<div id="na">
									曲名2
									<audio controls preload="auto" style="width: 200px;">

									</audio>
								</div>
							</td>
							<td width="50%" bgcolor="#AA00FF">
								<!-- 詳細入れる -->
								<div class="syousai"
									style="height: 200px;; width: 390px; overflow: auto;">
									商品詳細
									<!-- ここから -->
									a aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br> a<br> a<br>
									a<br> a<br> a<br> a<br> a<br> a<br>
									a<br> a<br> a<br> a<br> a<br> a<br>
									a<br> a<br> a<br>
								</div>
						</tr>
					</table>

					<!-- 3 -->
					<td style="border-style: none;" border="0" width="20%"
						bgcolor="#FF11AA">
						<div width="20%">
							<h3>同一ジャンルの作品</h3>
							<table border="0" width="100%" style="table-layout: auto;">
								<tr>
									<td><img alt="" src="pic/cd.jpg" id="kanren"><img
										alt="" src="pic/cd.jpg" id="kanren"></td>
									<td><img alt="" src="pic/cd.jpg" id="kanren"><img
										alt="" src="pic/cd.jpg" id="kanren"></td>
								</tr>
								<tr>
									<td><img alt="" src="pic/cd.jpg" id="kanren"><img
										alt="" src="pic/cd.jpg" id="kanren"></td>
									<td><img alt="" src="pic/cd.jpg" id="kanren"><img
										alt="" src="pic/cd.jpg" id="kanren"></td>
								</tr>
							</table>
						</div>


					</td>
		</tbody>
	</table>
レビュー
	<table border="0" width="100%" style="table-layout: auto;"bgcolor="#FFAACC">
		<tr style="border-style: none;" border="0" width="100%">
		<td with="100%">
		<u>じぃ</u>
		</td>
		</tr>
		<tr style="border-style: none;" border="0" width="100%">
		<td with="100%">
		よさみ
		</td>
		</tr>
</table>
	<footer>
	<br> <br> <br>
		<div id="foot">Copyright FJB Music , all rights reserved.</div>
	</footer>

</body>
</html>