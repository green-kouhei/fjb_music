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
					<h3>一覧</h3>

					<table border="1" width="100%"  style="table-layout: auto;">

						<tr>
							<td width="50%" ><img alt="" src="pic/cd.jpg" class="cd_img">
								歌手
								<br>
								<u>\3000</u>
								</td>
								<td width="50%" ><img alt="" src="pic/cd.jpg" class="cd_img">
								歌手
								<br>
								<u>\3000</u>
<!-- 								<div class="syou"> -->
<!-- 									<div id="mei">商品名</div> -->

<!-- 									<br> <br> -->

<!-- 									<div id="sin">歌手</div> -->
<!-- 									<br> <br> <span id="kane"> 金額 <u>\3000</u> -->

<!-- 									</span> <img alt="" src="pic/cart.png" id="cart_img"><br> <br> -->
<!-- 									<br> -->
<!-- 									<div id="kaka">カートへ</div> -->
									</td>
								<td width="50%">
							</td>
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

	<footer>
	<br> <br> <br>
		<div id="foot">Copyright FJB Music , all rights reserved.</div>
	</footer>

</body>
</html>