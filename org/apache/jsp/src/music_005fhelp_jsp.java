package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fhelp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_help.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "test001.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- ---お問い合わせ画面(中心部分開始)--- -->\r\n");
      out.write("\t<td style=\"table-layout: auto\" width=\"60%\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table style=\"border-style: none;\" border=\"1\" width=\"60%\"\r\n");
      out.write("\t\t\t\tstyle=\"table-layout: auto\" bgcolor=\"white\" id=\"help\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" id=\"box1\">よくある質問(Ｑ＆Ａ)</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"box2-1\">\r\n");
      out.write("\t\t\t\t\t\t<h1>カテゴリ</h1>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>初めてご利用の方へ</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>利用の仕方</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>会員登録の仕方</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>交換/返品/キャンセル</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>交換返品の仕方</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>キャンセルの仕方</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>返品の対象外</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>お届け方法について</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>宅配受け取り</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>コンビニ受け取り</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>フラゲについて</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"box2-2\">\r\n");
      out.write("\t\t\t\t\t<h1>閲覧の多いＦＡＱ</h1>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>ID/パスワードを忘れた場合は？</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>予約商品の料金はいつ支払うの？</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>コンビ二前払いの手順は？</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>在庫がないまたはわずかの商品でも購入できますか？</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" id=\"box3\">＜＜メールでのご連絡はこちら＞＞</td>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
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
