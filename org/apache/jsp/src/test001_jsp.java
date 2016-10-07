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
      out.write("<!DOCTYPE html><html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("\r\n");
      out.write("\t<h1  id=\"head_logo\">FJB Music\r\n");
      out.write("\r\n");
      out.write("\t<span id=\"head_search\">\r\n");
      out.write("\t\t<input type=\"text\" value=\"検索\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"検索\">\r\n");
      out.write("\t</span>\r\n");
      out.write("\r\n");
      out.write("\t<span id=\"head_login\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"ログイン\"><br>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"新規登録\">\r\n");
      out.write("\t</span>\r\n");
      out.write("\t</h1>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"nav\">\r\n");
      out.write("\t<ul class=\"nl clearFix\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/test01.css\">\r\n");
      out.write("\t\t<ul id=\"dropmenu\">\r\n");
      out.write("  <li><a href=\"#\">おすすめ</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li><a href=\"#\">ランキング</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li><a href=\"#\">ジャンル</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li><a href=\"#\">トップ</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li><a href=\"#\">マイページ</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li><a href=\"#\">カート</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li><a href=\"#\">お問い合わせ</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("      <li><a href=\"#\">サブメニュー</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </li>\r\n");
      out.write("</ul>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- グローバルナビゲーション -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
