<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html><html>
<head>
<link rel = "stylesheet"href = "css/music_detail.css">
</head>
<body>
<jsp:include page="test001.jsp"></jsp:include>
<div class = "soreppoi"align="center">商品詳細</div>
<div class = "main_detail">
<img alt="" src="pic/cd.jpg" id="cd_img"><br><br><br>
<div id= "mei" >商品名<span id = "sin">歌手</span></div>
<div class = "mu">
<span id = "na">曲名1</span>
<span id = "shi" >
<audio controls preload="auto" style="width:200px;">

</audio>
</span>
</div>
<img alt="" src="pic/cart.png" id="cart_img"><br><br><br><br>
<div id = "kaka">カートへ</div>
</div>



<footer><br><br><br><br>
<div id = "foot">Copyright FJB Music , all rights reserved.</div>
</footer>

</body>
</html>