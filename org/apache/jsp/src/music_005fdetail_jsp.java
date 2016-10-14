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
      out.write("\t<table style=\"border-style: none;\" border=\"1\" width=\"100%\"\r\n");
      out.write("\t\tstyle=\"table-layout: auto\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- サイド関連_R -->\r\n");
      out.write("\t\t<tr width=\"20%\">\r\n");
      out.write("\t\t\t<!-- ここにかく -->\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 詳細 -->\r\n");
      out.write("\t\t<tr width=\"60%\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div class=\"soreppoi\" align=\"center\">商品詳細</div>\r\n");
      out.write("\t\t\t\t<div class=\"main_detail\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"><br> <br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div id=\"mei\">\r\n");
      out.write("\t\t\t\t\t\t商品名\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<span id=\"sin\">歌手</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"mu\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"na\">\r\n");
      out.write("\t\t\t\t\t\t\t曲名1\r\n");
      out.write("\t\t\t\t\t\t\t<audio controls preload=\"auto\" style=\"width: 200px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</audio>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"na\">曲名2</div>\r\n");
      out.write("\t\t\t\t\t\t<span id=\"shi\"> <audio controls preload=\"auto\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 200px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</audio>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"pic/cart.png\" id=\"cart_img\"><br> <br>\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<div id=\"kaka\">カートへ</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- サイド関連_L -->\r\n");
      out.write("\t\t<tr width=\"20%\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- ここにかく -->\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
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
