<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_mypage.css">
</head>

<body>
	<jsp:include page="test001.jsp"></jsp:include>
	<table style="margin-top: auto;">
		<div>
			<table style="border-style: none;" border="1" width="20%"
				style="table-layout: auto" bgcolor="white">
				<tr>
					<td><img src="pic/wanima_art.jpg" align="left"><br>
						○○さんのマイページ<br> 保有ポイント○○P</td>
				</tr>
			</table>
		</div>
		<div>
			<table style="border-style: none;" border="1" width="60%"
				style="table-layout: auto" bgcolor="white" id="help">
				<tr>
					<td id="box2-1">
						<h1>注文履歴</h1>
						<ul>
							<h3>注文履歴</h3>
							<ul>
								<li>未発送の履歴</li>
								<li>発送済の履歴</li>
							</ul>
							<h3>その他</h3>
							<ul>
								<li>商品の返品・交換</li>
								<li>商品のレビュー</li>
							</ul>
						</ul>
					</td>
				</tr>

				<tr>
					<td id="box2-2">
						<h1>会員情報変更</h1>
						<ul>
							<h3>会員情報変更</h3>
							<ul>
								<li>アカウント設定を変更</li>
								<li>お支払い情報の変更</li>
							</ul>
						</ul>
					</td>

				</tr>
			</table>
		</div>
</body>
</html>