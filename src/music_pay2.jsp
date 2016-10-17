<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_pay.css">
</head>
<header>
	<h1 id="head_h1">FJB Music</h1>


</header>
<script type="text/javascript">
function disp(){
	var e1 =document.getElementById("no2");
	e1.options[0] = new Option("1G1")
	e1.options[1] = new Option("2G1")
}

</script>
<body bgcolor="yellow">
<%-- <jsp:include page="test_pay001.jsp"></jsp:include> --%>
<div id="navi">
<table>
<tr>
			<td><img alt=""src="pic/login.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/nyuuryoku2.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/kakunin.png"class="main_img">
			<img alt=""src="pic/yazirusi.png"class="main_yimg">
			<img alt=""src="pic/kanryou.png"class="main_img"></td>
		</tr>
		</table>
		</div>

<div id="main2">
<table class="type01">
	<tr>
		<th scope="row">名前</th>
		<td>姓<input type="text" name="姓" size="12">　名<input type="text" name="名" size="12"></td>
	</tr>
	<tr>
		<th scope="row">フリガナ</th>
		<td>姓<input type="text" name="姓" size="12">　名<input type="text" name="名" size="12"></td>
	</tr>
	<tr>
		<th scope="row">項目名</th>
		<td>内容がはいります。</td>
	</tr>
</table>
<form action="music_pay3.jsp">

	</form>
	</div>
</body>
</html>