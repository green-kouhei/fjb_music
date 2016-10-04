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
				</ul>

			</div>
		</div>

		<div class="B">
			<div class="boxb1">
				<h3>
					<left>今週の売り上げランキング！</left>
				</h3>
				<table>

						<li class="no01">
							<p class="item-name">
								<a href="http://www.apple.com/jp/">Apple</a>
							</p>
							<p>macのディスプレイのコーティングはがれた。。。</p>
						</li>

						<li class="no02">
							<p class="item-name">
								<a href="http://www.apple.com/jp/">Apple</a>
							</p>
							<p>macのディスプレイのコーティングはがれた。。。</p>
						</li>

						<li class="no03">
							<p class="item-name">
								<a href="http://www.apple.com/jp/">Apple</a>
							</p>
							<p>macのディスプレイのコーティングはがれた。。。</p>
						</li>

						<li class="no04">
							<p class="item-name">
								<a href="http://www.apple.com/jp/">Apple</a>
							</p>
							<p>macのディスプレイのコーティングはがれた。。。</p>
						</li>

						<li class="no05 end">
							<p class="item-name">
								<a href="http://www.apple.com/jp/">Apple</a>
							</p>
							<p>macのディスプレイのコーティングはがれた。。。</p>
						</li>

				</table>

			</div>

		</div>



		<footer> Copyright FJB Music , all rights reserved. </footer>
	</div>


</body>
</html>