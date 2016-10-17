package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_detail.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- インクルード -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "test001.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- ここから -->\r\n");
      out.write("\t<table style=\"border-style: none;\" border=\"0\" width=\"100%\" height=\"100%\"\r\n");
      out.write("\t\t style=\"table-layout: auto;\">\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 1 -->\r\n");
      out.write("\t\t\t<td style=\"border-style: none;\" border=\"1\" width=\"20%\" bgcolor=\"#FF11AA\">\r\n");
      out.write("\t\t\t\t<div width=\"20%\">\r\n");
      out.write("\t\t\t\t\t<h3>詳細R</h3>\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" width=\"80%\" style=\"table-layout: auto;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 2 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td style=\"border-style: none;\" border=\"1\" width=\"60%\" bgcolor=\"#FFAACC\" >\r\n");
      out.write("\t\t\t\t<div width=\"60%\">\r\n");
      out.write("\t\t\t\t\t<h3>メイン</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" width=\"80%\" style=\"table-layout: auto;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"50%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"50%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"syou\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"mei\">商品名</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"sin\">歌手</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br> <br> <span id=\"kane\"> 金額 <u>\\3000</u>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span> <img alt=\"\" src=\"pic/cart.png\" id=\"cart_img\"><br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"kaka\">カートへ</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"50%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t視聴場所 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"na\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t曲名1\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<audio controls preload=\"auto\" style=\"width: 200px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</audio>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"na\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t曲名2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<audio controls preload=\"auto\" style=\"width: 200px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</audio>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"50%\" bgcolor=\"#AA00FF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 詳細入れる -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"syousai\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"height: 200px; width: 300px; overflow: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t商品詳細\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- ここから -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ta<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t<table style=\"border-style: none;\" border=\"1\" width=\"60%\" -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\tstyle=\"table-layout: auto\"> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<td width=\"30%\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t視聴場所 -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<div class=\"mu\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t<div id=\"na\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t曲名1 -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<audio controls preload=\"auto\" style=\"width: 200px;\"> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t</audio> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t<br> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t<div id=\"na\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t曲名2 -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t<audio controls preload=\"auto\" style=\"width: 200px;\"> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t</audio> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t</td> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<td width=\"30%\" height=\"100%\" bgcolor=\"#9999ff\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<div class=\"mu\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t詳細入れる -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t<div class=\"syousai\" -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\tstyle=\"height: 100%; width: 100%; overflow-x: scroll;\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t商品詳細 -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tここから -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t</td> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t</table> -->\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 3 -->\r\n");
      out.write("\t\t\t<td style=\"border-style: none;\" border=\"1\" width=\"20%\" bgcolor=\"#FF11AA\">\r\n");
      out.write("\t\t\t\t<div width=\"20%\">\r\n");
      out.write("\t\t\t\t\t<h3>詳細L</h3>\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" width=\"80%\" style=\"table-layout: auto;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- ここまで -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t<!-- サイド関連_R -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t<td width=\"20%\"  width=\"100%\" style=\"table-layout: auto\"> -->\r\n");
      out.write("\t<!-- \t\t\t\tここにかく 関連項目R -->\r\n");
      out.write("\t<!-- \t\t\t</td> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t<!-- 詳細 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t<td width=\"60%\"  width=\"100%\" style=\"table-layout: auto\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t<div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t<div class=\"soreppoi\" align=\"center\">商品詳細</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t<td width=\"50%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t</td> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t<td width=\"50%\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t<div class=\"syou\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<div id=\"mei\">商品名</div> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<br> <br> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<div id=\"sin\">歌手</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<br> <br> <span id=\"kane\"> \t金額 <u>\\3000</u> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t</span> <img alt=\"\" src=\"pic/cart.png\" id=\"cart_img\"><br> <br> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<br> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<div id=\"kaka\">カートへ</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t</td> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t\t\t<table style=\"border-style: none;\" border=\"0\" width=\"100%\" -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\tstyle=\"table-layout: auto\"> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t\t\t\t<td width=\"50%\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t視聴場所 -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<div class=\"mu\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t<div id=\"na\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t曲名1 -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t<audio controls preload=\"auto\" style=\"width: 200px;\"> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t</audio> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t<br> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t<div id=\"na\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t曲名2 -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t<audio controls preload=\"auto\" style=\"width: 200px;\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t</audio> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t</td> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t<td width=\"200px\" height=\"200px\" bgcolor=\"#9999ff\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t<div class=\"mu\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t詳細入れる -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t<div class=\"syousai\" -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\tstyle=\"height: 200px; width: 200px; overflow-x: scroll;\"> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t商品詳細 -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t\t\tここから -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t\t</td> -->\r\n");
      out.write("\t<!-- \t\t\t\t\t</table> -->\r\n");
      out.write("\t<!-- \t\t\t</td> -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t<!-- サイド関連_L -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t<td width=\"20%\"  width=\"100%\" style=\"table-layout: auto\"> -->\r\n");
      out.write("\t<!-- \t\t\t\tここにかく 関連項目L -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- \t\t\t</td> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<br> <br> <br> <br>\r\n");
      out.write("\t\t<div id=\"foot\">Copyright FJB Music , all rights reserved.</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
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
