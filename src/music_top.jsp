<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_top.css">

<!-- スライドのJQuery -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="jquery.bxslider/jquery.bxslider.min.js"></script>
<link href="jquery.bxslider/jquery.bxslider.css" rel="stylesheet" />
<script type="text/javascript">
	$(document).ready(function() {
		$('.bxslider').bxSlider({
			auto : true,
		});
	});
</script>
</head>

<body>

	<!-- include -->
	<jsp:include page="test001.jsp"></jsp:include>

	<div class="mainBox">

		<div class="A">

			<!-- キャンペーン・おすすめ -->
			<div class="boxa1">

				<font color="#0000ff"><center>
						<h1>最近のヘビロテ！</h1>
					</center></font>


			</div>

			<!-- スライド -->
			<div class="boxa2" align="center">
				<ul class="bxslider">
					<li><a href="music_detail.jsp"><img src="pic/10feet.jpg"></a></li>
					<li><a href="music_detail.jsp"><img src="pic/ken_yokoyama.jpg"></a></li>
					<li><a href="music_detail.jsp"><img src="pic/mwam.jpg"></a></li>
					<li><a href="music_detail.jsp"><img src="pic/wanima.jpg"></a></li>
					<li><a href="music_detail.jsp"><img src="pic/xmas_eileen.jpg"></a></li>
					<li><a href="music_detail.jsp"><img src="pic/hi-standard.jpg"></a></li>
				</ul>

			</div>
		</div>

<!-- 		<div> -->
<!-- 			<a href="music_detail.jsp"><img src="pic/login.png" width="180" height="57" alt="button" class="rollover"></a> -->
<!-- 			<a href="#"><img src="pic/login.png" width="180" height="57" alt="button"class="rollover"></a> -->
<!-- 			<a href="#"><img src="pic/login.png" width="180" height="57" alt="button" class="rollover-suffix"></a> -->
<!-- 			<a href="#"><img src="pic/login.png" width="180" height="57" alt="button" class="rollover-fade1"></a> -->
<!-- 			<a href="#"><img src="pic/login.png" width="180" height="57" alt="button" class="rollover-fade2"></a> -->

<!-- 			<script src="jquery.easy-rollover.js"></script> -->
<!-- 			<script> -->
<!--
// 				$(function() {
// 					// 通常
// 					$('.rollover').easyRollover();

// 					// サフィックス
// 					$('.rollover-suffix').easyRollover({
// 						suffix : '_off.',
// 						suffix_replace : '_on.'
// 					});

// 					// 透過フェードするだけのロールオーバー
// 					$('.rollover-fade1').easyRollover({
// 						suffix : false,
// 						transition : 'fade',
// 						opacity : 0.2,
// 						duration : 400
// 					});

// 					// フェードして切り替わるロールオーバー
// 					$('.rollover-fade2').easyRollover({
// 						transition : 'fade',
// 						duration : 1000,
// 						easing : 'swing'
// 					});
// 				});
 -->
<!-- 			</script> -->
<!-- 		</div> -->


		<!-- ランキング -->
		<div class="rank_table">

			<table style="border-style: none;" border="1" width="100%"
				style="table-layout: auto">

				<!-- ランキング1 -->

				<td style="border-style: none;" border="1">
					<div width="100%">
						<h3>今週の売り上げランキング1</h3>
						<table border="1" width="80%" style="table-layout: auto;">
							<dl>

								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_1.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->

								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_2.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->

								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_3.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->
							</dl>

						</table>
					</div>


				</td>

				<!-- ランキング2 -->

				<td style="border-style: none;" border="1">
					<div width="100%">
						<h3>今週の売り上げランキング2</h3>
						<table border="1" width="80%" style="table-layout: auto;">
							<dl>
								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_1.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->
								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_2.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->
								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_3.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->
							</dl>

						</table>
					</div>


				</td>


				<!-- 3  -->

				<td style="border-style: none;" border="1">
					<div width="100%">
						<h3>今週の売り上げランキング3</h3>
						<table border="1" width="80%" style="table-layout: auto;">
							<dl>
								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_1.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->
								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_2.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->
								<!-- ここから -->
								<tr style="table-layout: auto;">
									<td><img src="pic/rank_3.PNG" align="left"> <img
										src="pic/wanima_art.jpg" align="left">



										<dd>
											WANIMA JUICE UP‼<br> WANIMA JUICE UP‼
										</dd></td>
								</tr>
								<!-- ここまで -->
							</dl>

						</table>
					</div>


				</td>

			</table>

		</div>
		<!-- キャンペーン -->
		<div></div>




		<footer> Copyright FJB Music , all rights reserved. </footer>
	</div>


</body>
</html>