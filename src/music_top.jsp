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
					<li><img src="pic/10feet.jpg"></li>
					<li><img src="pic/ken_yokoyama.jpg"></li>
					<li><img src="pic/mwam.jpg"></li>
					<li><img src="pic/wanima.jpg"></li>
					<li><img src="pic/xmas_eileen.jpg"></li>
					<li><img src="pic/hi-standard.jpg"></li>
				</ul>

			</div>
		</div>

		<!-- ランキング -->
		<div class="rank_table">

			<table style="border-style: none;" border="1" width="100%"
				style="table-layout: auto">

				<!-- ランキング1 -->

				<td style="border-style: none;" border="1">
					<div width="100%">
						<h3>今週の売り上げランキング1</h3>
						<table border="1" width="100%" style="table-layout: auto;">
							<dl>


								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<img src="pic/wanima_art.jpg" alt="WANIMA" align="left">

										</dt>

										<dd>JUICE UP‼</dd>
									</td>
								</tr>


								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li> WANIMA
										</dt>
										<dd>JUICE UP‼</dd>
									</td>
								</tr>
								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li> WANIMA
										</dt>
										<dd>JUICE UP‼</dd>
									</td>
								</tr>
							</dl>

						</table>
					</div>


				</td>

				<!-- ランキング2 -->

				<td style="border-style: none;" border="1">
					<div width="100%">
						<h3>今週の売り上げランキング2</h3>
						<table border="1" width="100%" style="table-layout: auto;">
							<dl>
								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li>
										<dd>WANIMA</dd>
										<dd>JUICE UP‼</dd>
										</dt>
									</td>
								</tr>
								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li> WANIMA
										</dt>
										<dd>JUICE UP‼</dd>
									</td>
								</tr>
								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li> WANIMA
										</dt>
										<dd>JUICE UP‼</dd>
									</td>
								</tr>
							</dl>

						</table>
					</div>


				</td>


				<!-- 3  -->

				<td style="border-style: none;" border="1">
					<div width="100%">
						<h3>今週の売り上げランキング1</h3>
						<table border="1" width="100%" style="table-layout: auto;">
							<dl>
								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li>
										<dd>WANIMA</dd>
										<dd>JUICE UP‼</dd>
										</dt>
									</td>
								</tr>
								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li> WANIMA
										</dt>
										<dd>JUICE UP‼</dd>
									</td>
								</tr>
								<tr style="table-layout: auto;">
									<td>
										<dt class="sample1">
											<li><img src="pic/wanima_art.jpg"></li> WANIMA
										</dt>
										<dd>JUICE UP‼</dd>
									</td>
								</tr>
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