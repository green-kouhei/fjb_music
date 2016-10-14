package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fpay2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/music_pay.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("\t<h1 id=\"head_h1\">FJB Music</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function disp(){\r\n");
      out.write("\tvar e1 =document.getElementById(\"no2\");\r\n");
      out.write("\te1.options[0] = new Option(\"1G1\")\r\n");
      out.write("\te1.options[1] = new Option(\"2G1\")\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body bgcolor=\"yellow\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"navi\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t\t<td><img alt=\"\"src=\"pic/login.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/nyuuryoku2.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/kakunin.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/kanryou.png\"class=\"main_img\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<form action=\"music_pay3.jsp\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<tr><br>\r\n");
      out.write("\t\t\t<td>名前<br><input type=\"text\" name=\"姓\" size=\"12\"><input type=\"text\" name=\"名\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>フリガナ<br><input type=\"text\" name=\"姓\" size=\"12\"><input type=\"text\" name=\"名\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>生年月日<br><input type=\"text\" name=\"年\" size=\"4\">年\r\n");
      out.write("\r\n");
      out.write("\t\t<select onchange=\"disp()\">\r\n");
      out.write("\t\t");

			for (int i = 1; i <= 12; i++) {
		
      out.write("\r\n");
      out.write("\t\t<option>\r\n");
      out.write("\t\t\t");
      out.print(i);
      out.write("</option>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</select>月\r\n");
      out.write("\t<select onchange=\"disp()\">\r\n");
      out.write("\t");

			for (int i = 1; i <= 31; i++) {
		
      out.write("\r\n");
      out.write("\t\t<option>\r\n");
      out.write("\t\t\t");
      out.print(i);
      out.write("</option>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</select>日</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>メールアドレス<br><input type=\"text\" name=\"アドレス\" size=\"40\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>確認<br><input type=\"text\" name=\"アドレス\" size=\"40\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>郵便番号<br><input type=\"text\" name=\"郵便\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>都道府県<br>\r\n");
      out.write("\t\t\t<select onchange=\"disp()\">\r\n");
      out.write("\t\t");

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
		
      out.write("\r\n");
      out.write("\t\t<option>\r\n");
      out.write("\t\t\t");
      out.print(tlist[i]);
      out.write("</option>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</select></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>市区町村<br><input type=\"text\" name=\"市区町村\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>番地・部屋番号<br><input type=\"text\" name=\"番地\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br>お支払い方法<br><br><input type=\"radio\" name=\"支払い\"value=\"クレジットカード\" >クレジットカード</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>番号<br><input type=\"text\" name=\"カード番号\" size=\"4\">-\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"カード番号\" size=\"4\">-\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"カード番号\" size=\"4\">-\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"カード番号\" size=\"4\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br><input type=\"radio\" name=\"支払い\"value=\"代引き\" >代引き</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><br><input id=\"btn\" type=\"submit\" value=\"確認\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- \t\t\t<div> -->\r\n");
      out.write("\t\t<!-- \t\t<select name=\"year\"> -->\r\n");
      out.write("\t\t<?php optionLoop('1950', date('Y'));?>\r\n");
      out.write("\t\t<!-- \t\t</select> 年 <select name=\"year\"> -->\r\n");
      out.write("\t\t<?php optionLoop('1', '12');?>\r\n");
      out.write("\t\t<!-- \t\t</select> 月 <select name=\"day\"> -->\r\n");
      out.write("\t\t<?php optionLoop('1', '31');?>\r\n");
      out.write("\t\t<!-- \t\t</select> 日 -->\r\n");
      out.write("\t\t<!-- \t</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
