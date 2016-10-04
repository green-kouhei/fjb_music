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


	<!-- スライドショー
	<div class="example">

	<div class="box1">ボックス1</div>
	<div class="box2">ボックス2</div>

	 -->
	<div class="example">
		<jsp:include page="test001.jsp"></jsp:include>

		<div class="box1" align="center">
			<ul class="bxslider">
				<li><img src="pic/10feet.jpg"></li>
				<li><img src="pic/ken_yokoyama.jpg"></li>
				<li><img src="pic/mwam.jpg"></li>
				<li><img src="pic/wanima.jpg"></li>
				<li><img src="pic/xmas_eileen.jpg"></li>
			</ul>

		</div>


		<!-- キャンペーン・おすすめ -->
		<div class="box2" style="background-color: #AAEEDD">
			<h1>
				<center>今週のおすすめ！</center>
			</h1>

		</div>

		<footer> Copyright FJB Music , all rights reserved. </footer>
	</div>


</body>
</html>