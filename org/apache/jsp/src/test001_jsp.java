package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test001_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<header >\r\n");
      out.write("<h1 id = \"head_h1\">FJB Music</h1>\r\n");
      out.write("<div  id = \"head_login\">\r\n");
      out.write("<input type = \"text\" value = \"検索\">\r\n");
      out.write("<input type = \"submit\" value = \"検索\">\r\n");
      out.write("</div>\r\n");
      out.write("<input type = \"submit\" value = \"ログイン\">\r\n");
      out.write("<input type = \"submit\" value = \"新規登録\">\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"nav\">\r\n");
      out.write("\r\n");
      out.write("<ul class=\"nl clearFix\">\r\n");
      out.write("<link rel = \"stylesheet\"href = \"css/test01.css\">\r\n");
      out.write("<li><a href=\"#\">メニュー項目1<span class=\"en\"><br>おすすめ</span></a></li>\r\n");
      out.write("<li><a href=\"#\">メニュー項目2 <span class=\"en\"><br>ランキング</span></a></li>\r\n");
      out.write("<li><a href=\"#\">メニュー項目3 <span class=\"en\"><br>ジャンル</span></a></li>\r\n");
      out.write("<!-- ロゴ画像 (cd pic add)-->\r\n");
      out.write("<li><a href=\"#\"><img src = \"pic/cd.jpg\"><span class=\"en\">Top</span></a></li>\r\n");
      out.write("<li><a href=\"#\">メニュー項目4 <span class=\"en\"><br>Myページ</span></a></li>\r\n");
      out.write("<li><a href=\"#\">メニュー項目5 <span class=\"en\"><br>カート</span></a></li>\r\n");
      out.write("<li><a href=\"#\">メニュー項目6 <span class=\"en\"><br>問い合わせ</span></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- グローバルナビゲーション -->\r\n");
      out.write("<div id = \"gnavi\" >\r\n");
      out.write("<table>\r\n");
      out.write("\t<td class = \"gnavi_td\">○○○</td>\r\n");
      out.write("\t<td class = \"gnavi_td\">○○○</td>\r\n");
      out.write("\t<td class = \"gnavi_td\">○○○</td>\r\n");
      out.write("\t<td class = \"gnavi_td\">○○○</td>\r\n");
      out.write("\t<td class = \"gnavi_td\">○○○</td>\r\n");
      out.write("</table>\r\n");
      out.write("</div>");
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
