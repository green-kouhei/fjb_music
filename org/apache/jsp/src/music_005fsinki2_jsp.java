package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fsinki2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_sinki.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("\t<h1 id=\"head_h1\">FJB Music</h1>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<body bgcolor=\"yellow\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"main3\">\r\n");
      out.write("<form action=\"music_top.jsp\">\r\n");
      out.write("\r\n");
      out.write("<table  class=\"title2\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\" ><font size =\"6\">会員情報確認</font></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table border=\"1\" class=\"sample3\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"left3\">氏名</td>\r\n");
      out.write("\t\t\t<td  class=\"rigth3\">船橋　太郎</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"left3\">フリガナ</td>\r\n");
      out.write("\t\t\t<td class=\"rigth3\">フナバシ　タロウ</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"left3\">生年月日</td>\r\n");
      out.write("\t\t\t<td class=\"rigth3\">1996年1月1日</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"left3\">メールアドレス</td>\r\n");
      out.write("\t\t\t<td class=\"rigth3\">x15g000@chiba-fjb.ac.jp</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"left3\">パスワード</td>\r\n");
      out.write("\t\t\t<td class=\"rigth3\">●●●●●●●●</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"left3\">郵便番号 </td>\r\n");
      out.write("\t\t\t<td class=\"rigth3\">12345678</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" class=\"left3\">住所（お届け先）</td>\r\n");
      out.write("\t\t\t<td class=\"rigth3\">千葉県船橋市船橋123</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<input id=\"kakutei\" type=\"submit\" name=\"kakutei\"value=\"確定してTOPへ\">\r\n");
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
