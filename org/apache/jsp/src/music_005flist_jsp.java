package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_list.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- インクルード -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "test001.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- ここから -->\r\n");
      out.write("\t<table style=\"border-style: none;\" border=\"0\" width=\"100%\"\r\n");
      out.write("\t\theight=\"400px\" style=\"table-layout: auto;\">\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 1 -->\r\n");
      out.write("\t\t\t<td style=\"border-style: none;\" border=\"0\" width=\"10%\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#FF11AA\">\r\n");
      out.write("\t\t\t\t<div width=\"10%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<h3>ジャンル</h3>\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" width=\"100px;\" style=\"table-layout: auto;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<center>JPOP</center>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<center>クラシック</center>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<!-- ここまで -->\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 2 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td style=\"border-style: none;\" border=\"0\" width=\"90%\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#FFAACC\">\r\n");
      out.write("\t\t\t\t<div width=\"90%\">\r\n");
      out.write("\t\t\t\t\t<h3>商品一覧</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" width=\"100%\" style=\"table-layout: auto;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\3000</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\2000</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\3050</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\1200</u></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\3500</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\1000</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\2600</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\2200</u></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\1800</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\1700</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\2600</u></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\"><img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"100px;\" height=\"100px;\"> <br> 商品名/アーティスト<br> 金額\r\n");
      out.write("\t\t\t\t\t\t\t\t<u>\\9000</u></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<u>前へ</u> 1 2 3 4 <u>次へ</u>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<br> <br> <br>\r\n");
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
