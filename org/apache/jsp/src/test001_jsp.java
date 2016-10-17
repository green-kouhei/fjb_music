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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"pic/home_icon1.png\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table width=\"100%\" style=\"table-layout: fixed\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<a href=\"music_top.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<h1 id=\"head_logo\">FJB Music</h1>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"/\" name=\"search2\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<dl class=\"search2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"search\" value=\"\" placeholder=\"Search\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button>サイト内検索</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"head_login\"> <input type=\"submit\" value=\"ログイン\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"新規登録\">\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"nav\">\r\n");
      out.write("\t\t<ul class=\"nl clearFix\">\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/test01.css\">\r\n");
      out.write("\t\t\t<ul id=\"dropmenu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">おすすめ</a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">今週のおすすめ</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">あなたへのおすすめ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">ランキング</a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">CDシングル</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">CDアルバム</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">予約総合</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">ジャンル</a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">J-POP</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">ロック/ポップス</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">アニメ/キッズ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">トップ</a>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">マイページ</a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">会員情報</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">購入履歴</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">お気に入りアーティスト</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">カート</a>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">ヘルプ</a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Q＆A</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">お問い合わせ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- グローバルナビゲーション -->\r\n");
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
