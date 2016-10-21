<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_History.css">
</head>
<body>

	<!-- インクルード -->
	<jsp:include page="test001.jsp"></jsp:include>

	<!-- ここから -->
	<table style="border-style: none;" border="0" width="900px;"
		height="400px" style="table-layout: auto;" align="center">
		<tbody>

			<!-- 1 -->
			<td style="border-style: none;" border="0" width="100%"
				bgcolor="#FF11AA">
				<div width="20%" >
					<h3>購入履歴</h3>
					<div class="syousai"
									style="height: 500px;; width: 1000px;">
					<table border="1" width="100%" style="table-layout: auto;">
						<tr>
							<td class="wa"><img src="pic/wanima_art.jpg" align="left">
								<dd><br><br>
									　5月30日<br>
									　デジタル　<u>\1200</u>
								</dd></td>
						</tr>
						<tr>
							<td class="wa"><img src="pic/wanima_art.jpg" align="left">
								<dd><br><br>
									　4月10日<br>
									　デジタル　<u>\1200</u>
								</dd></td>
						</tr>
						<tr>
							<td class="wa"><img src="pic/wanima_art.jpg" align="left">
								<dd><br><br>
									　3月25日<br>
									　CD　<u>\2000</u>
								</dd></td>
						</tr>
						<tr>
							<td class="wa"><img src="pic/wanima_art.jpg" align="left">
								<dd><br><br>
									　2月1日<br>
									　デジタル　<u>\1200</u>
								</dd></td>
						</tr>
						<!-- ここまで -->
					</table>
				</div>
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