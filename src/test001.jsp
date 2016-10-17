<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="apple-touch-icon" href="pic/home_icon1.png" />
</head>
<body>

	<header>
		<div>
			<table width="100%" style="table-layout: fixed">
				<td>
					<div>
					<a href="music_top.jsp">
						<h1 id="head_logo">FJB Music</h1>
						</a>
					</div>
				</td>
				<td>
					<div>
						<form action="/" name="search2" method="post">
							<dl class="search2">
								<dt>
									<input type="text" name="search" value="" placeholder="Search" />
								</dt>
								<dd>
									<button>サイト内検索</button>
								</dd>
							</dl>
					</div>
				</td>
				<td>
					<div>

						</form>
						<span id="head_login"> <input type="submit" value="ログイン"><br>
							<input type="submit" value="新規登録">
						</span>

					</div>
				</td>
			</table>

		</div>
	</header>


	<div class="nav">
		<ul class="nl clearFix">
			<link rel="stylesheet" href="css/test01.css">
			<ul id="dropmenu">
				<li><a href="#">おすすめ</a>
					<ul>
						<li><a href="#">今週のおすすめ</a></li>
						<li><a href="#">あなたへのおすすめ</a></li>
					</ul></li>
				<li><a href="#">ランキング</a>
					<ul>
						<li><a href="#">CDシングル</a></li>
						<li><a href="#">CDアルバム</a></li>
						<li><a href="#">予約総合</a></li>
					</ul></li>
				<li><a href="#">ジャンル</a>
					<ul>
						<li><a href="#">J-POP</a></li>
						<li><a href="#">ロック/ポップス</a></li>
						<li><a href="#">アニメ/キッズ</a></li>
					</ul></li>
				<li><a href="#">トップ</a>
				<li><a href="#">マイページ</a>
					<ul>
						<li><a href="#">会員情報</a></li>
						<li><a href="#">購入履歴</a></li>
						<li><a href="#">お気に入りアーティスト</a></li>
					</ul></li>
				<li><a href="#">カート</a>
				<li><a href="#">ヘルプ</a>
					<ul>
						<li><a href="#">Q＆A</a></li>
						<li><a href="#">お問い合わせ</a></li>
					</ul></li>
			</ul>
		</ul>
	</div>


	<!-- グローバルナビゲーション -->


</body>
</html>
