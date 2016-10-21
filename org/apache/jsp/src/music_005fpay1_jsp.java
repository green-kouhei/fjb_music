package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fpay1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<header >\r\n");
      out.write("<h1 id = \"head_h1\">FJB Music</h1>\r\n");
      out.write("<div id=\"navi\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t\t<td><img alt=\"\"src=\"pic/login2.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/nyuuryoku.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/kakunin.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/kanryou.png\"class=\"main_img\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"yellow\">\r\n");
      out.write("<div id=\"main1\">\r\n");
      out.write("\t<form action=\"music_pay2.jsp\">\r\n");
      out.write("\t<div id =\"login_title\"><font color=\"red\" size =5px>【ログインして購入】</font><br>アカウントをお持ちの方はこちら</div>\r\n");
      out.write("\t<table class=\"login\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>ユーザID</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"user_id\" value=\"\" size=\"24\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>パスワード</th>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" value=\"\" size=\"24\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<input id=\"login\"type=\"submit\" value=\"ログイン\">\r\n");
      out.write("\r\n");
      out.write("\t<table class=\"login2\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td><input type=\"submit\" id=\"gust\"name=\"gust\"value=\"ゲストで購入\">\r\n");
      out.write("\t<td><input type=\"submit\" id=\"sinki\"name=\"sinki\"value=\"新規会員登録\">\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
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
