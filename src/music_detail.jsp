<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html><html>
<head>
<link rel = "stylesheet"href = "css/music_detail.css">
</head>
<body>
<jsp:include page="test001.jsp"></jsp:include>
<div class = "soreppoi" style="text-align : center">商品詳細</div>
<div class = "main_detail">
<img alt="" src="pic/cd.jpg" id="cd_img">
<span id= "mei" >商品名<span id = "sin">歌手</span></span>
<img alt="" src="pic/cart.jpg" id="cart_img">
</div>
<div class = "mu">
<span id = "na">曲名1</span>
<span id = "shi" >
<audio controls preload="auto" style="width:200px;">

</audio>
</span>
</div>
<footer>
<br>Copyright 船橋あいす工房,all rights reserved.
</footer>

</body>
</html>