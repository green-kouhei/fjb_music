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
      out.write("</header>\r\n");
      out.write("<body bgcolor=\"yellow\">\r\n");
      out.write("\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>名前<input type=\"text\" name=\"姓\" size=\"12\"><input type=\"text\" name=\"名\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>フリガナ<input type=\"text\" name=\"姓\" size=\"12\"><input type=\"text\" name=\"名\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>生年月日</td>\r\n");
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
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>メールアドレス<input type=\"text\" name=\"アドレス\" size=\"40\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>確認<input type=\"text\" name=\"アドレス\" size=\"40\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<select name=\"pref_id\">\r\n");
      out.write("<option value=\"\" selected>都道府県</option>\r\n");
      out.write("<option value=\"1\">北海道</option>\r\n");
      out.write("<option value=\"2\">青森県</option>\r\n");
      out.write("<option value=\"3\">岩手県</option>\r\n");
      out.write("<option value=\"4\">宮城県</option>\r\n");
      out.write("<option value=\"5\">秋田県</option>\r\n");
      out.write("<option value=\"6\">山形県</option>\r\n");
      out.write("<option value=\"7\">福島県</option>\r\n");
      out.write("<option value=\"8\">茨城県</option>\r\n");
      out.write("<option value=\"9\">栃木県</option>\r\n");
      out.write("<option value=\"10\">群馬県</option>\r\n");
      out.write("<option value=\"11\">埼玉県</option>\r\n");
      out.write("<option value=\"12\">千葉県</option>\r\n");
      out.write("<option value=\"13\">東京都</option>\r\n");
      out.write("<option value=\"14\">神奈川県</option>\r\n");
      out.write("<option value=\"15\">新潟県</option>\r\n");
      out.write("<option value=\"16\">富山県</option>\r\n");
      out.write("<option value=\"17\">石川県</option>\r\n");
      out.write("<option value=\"18\">福井県</option>\r\n");
      out.write("<option value=\"19\">山梨県</option>\r\n");
      out.write("<option value=\"20\">長野県</option>\r\n");
      out.write("<option value=\"21\">岐阜県</option>\r\n");
      out.write("<option value=\"22\">静岡県</option>\r\n");
      out.write("<option value=\"23\">愛知県</option>\r\n");
      out.write("<option value=\"24\">三重県</option>\r\n");
      out.write("<option value=\"25\">滋賀県</option>\r\n");
      out.write("<option value=\"26\">京都府</option>\r\n");
      out.write("<option value=\"27\">大阪府</option>\r\n");
      out.write("<option value=\"28\">兵庫県</option>\r\n");
      out.write("<option value=\"29\">奈良県</option>\r\n");
      out.write("<option value=\"30\">和歌山県</option>\r\n");
      out.write("<option value=\"31\">鳥取県</option>\r\n");
      out.write("<option value=\"32\">島根県</option>\r\n");
      out.write("<option value=\"33\">岡山県</option>\r\n");
      out.write("<option value=\"34\">広島県</option>\r\n");
      out.write("<option value=\"35\">山口県</option>\r\n");
      out.write("<option value=\"36\">徳島県</option>\r\n");
      out.write("<option value=\"37\">香川県</option>\r\n");
      out.write("<option value=\"38\">愛媛県</option>\r\n");
      out.write("<option value=\"39\">高知県</option>\r\n");
      out.write("<option value=\"40\">福岡県</option>\r\n");
      out.write("<option value=\"41\">佐賀県</option>\r\n");
      out.write("<option value=\"42\">長崎県</option>\r\n");
      out.write("<option value=\"43\">熊本県</option>\r\n");
      out.write("<option value=\"44\">大分県</option>\r\n");
      out.write("<option value=\"45\">宮崎県</option>\r\n");
      out.write("<option value=\"46\">鹿児島県</option>\r\n");
      out.write("<option value=\"47\">沖縄県</option>\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
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
