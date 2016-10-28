<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music_henkou.css">
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
<div id="main2">
<form action="music_henkou2.jsp">
<table  class="title1">
<tr>
<td align="center" ><font color="red" size ="5">変更したい情報のみ入力してください</font></td>
</tr>
</table>
	<table border="1" class="sample2">

		<tr>
			<td align="center" class="left2">メールアドレス</td>
			<td class="rigth2"><input type="text" name="アドレス" size="40"></td>
		</tr>
		<tr>
			<td align="center" class="left2">パスワード</td>
			<td class="rigth2"><input type="text" name="パスワード" size="8"></td>
		</tr>
		<tr>
			<td align="center" class="left2">パスワード確認</td>
			<td class="rigth2"><input type="text" name="パスワード" size="8"></td>
		</tr>
		<tr>
			<td align="center" class="left2">確認</td>
			<td class="rigth2"><input type="text" name="アドレス" size="40"></td>
		</tr>
		<tr>
			<td align="center" class="left2">郵便番号 </td>
			<td  class="rigth2"><input type="text" name="郵便" size="12">　※半角8桁　例：12345678</td>
		</tr>
		<tr>
			<td align="center" class="left2">都道府県</td>
			<td class="rigth2"><select onchange="disp()">
		<%
		String tlist[]=new String[47];
		tlist[0]="北海道";
		tlist[1]="青森県";
		tlist[2]="岩手県";
		tlist[3]="宮城県";
		tlist[4]="秋田県";
		tlist[5]="山形県";
		tlist[6]="福島県";
		tlist[7]="茨城県";
		tlist[8]="栃木県";
		tlist[9]="群馬県";
		tlist[10]="埼玉県";
		tlist[11]="千葉県";
		tlist[12]="東京都";
		tlist[13]="神奈川県";
		tlist[14]="新潟県";
		tlist[15]="富山県";
		tlist[16]="石川県";
		tlist[17]="福井県";
		tlist[18]="山梨県";
		tlist[19]="長野県";
		tlist[20]="岐阜県";
		tlist[21]="静岡県";
		tlist[22]="愛知県";
		tlist[23]="三重県";
		tlist[24]="滋賀県";
		tlist[25]="京都府";
		tlist[26]="大阪府";
		tlist[27]="兵庫県";
		tlist[28]="奈良県";
		tlist[29]="和歌山県";
		tlist[30]="鳥取県";
		tlist[31]="島根県";
		tlist[32]="岡山県";
		tlist[33]="広島県";
		tlist[34]="山口県";
		tlist[35]="徳島県";
		tlist[36]="香川県";
		tlist[37]="愛媛県";
		tlist[38]="高知県";
		tlist[39]="福岡県";
		tlist[40]="佐賀県";
		tlist[41]="長崎県";
		tlist[42]="熊本県";
		tlist[43]="大分県";
		tlist[44]="宮崎県";
		tlist[45]="鹿児島県";
		tlist[46]="沖縄県";

			for (int i = 0; i < 47; i++) {
		%>
		<option>
			<%=tlist[i]%></option>
		<%}%>
	</select></td>
		</tr>
		<tr>
			<td align="center" class="left2">市区町村</td>
			<td  class="rigth2"><input type="text" name="市区町村" size="40"></td>
		</tr>
		<tr>
			<td align="center" class="left2">番地・部屋番号</td>
			<td class="rigth2"><input type="text" name="番地" size="40"></td>
		</tr>

	</table>
	<input id="modoru" type="submit" value="戻る">
	<input id="kakunin" type="submit" value="確認">
	</form>
	</div>
</body>
</html>