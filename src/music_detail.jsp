<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html><html>
<head>
<link rel = "stylesheet"href = "css/music_detail.css">
</head>
<body>
<jsp:include page="test001.jsp"></jsp:include>
<div id = "main_detail">
<img alt="" src="pic/cd.jpg" id="cd_img">
<span id= "mei" >商品名<span id = "sin">歌手</span></span>
<img alt="" src="pic/cart.jpg" id="cart_img">
</div>
<div id = "mu">
<span class = "na">曲名1</span>
<span id = "shi" >
<body onLoad="getDuration()">
<audio id="video">
<source src="">
</audio>
<div style="width:400px; background-color:#333333; color:#ffffff;">
<input type="button" value="再生" onClick="playVideo()">
<input type="button" value="一時停止" onClick="pauseVideo()">
<input type="button" value="↑" onClick="upVolume()">
<input type="button" value="↓" onClick="downVolume()"><br>
現在（秒）：<span id="ichi">0</span><br>
全体（秒）：<span id="nagasa"></span><br>
<span id="kanryou"></span>
</span></div>
<script type="text/javascript">
var v = document.getElementById("video");

function getDuration() {
	//動画の長さ（秒）を表示
	document.getElementById("nagasa").innerHTML = v.duration;
}

function playVideo() {
	//再生完了の表示をクリア
	document.getElementById("kanryou").innerHTML = "";
	//動画を再生
	v.play();
	//現在の再生位置（秒）を表示
	v.addEventListener("timeupdate", function(){
		document.getElementById("ichi").innerHTML = v.currentTime;
	}, false);
	//再生完了を知らせる
	v.addEventListener("ended", function(){
		document.getElementById("kanryou").innerHTML = "動画の再生が完了しました。";
	}, false);
}

function pauseVideo() {
	//動画を一時停止
	v.pause();
}

function upVolume() {
	//音量を上げる
	v.volume = v.volume + 0.25;
}

function downVolume() {
	//音量を下げる
	v.volume = v.volume - 0.25;
}
</script>
</div>
<footer>
Copyright 船橋あいす工房,all rights reserved.
</footer>

</body>
</html>