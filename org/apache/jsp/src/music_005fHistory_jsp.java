package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_History.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- インクルード -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "test001.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- ここから -->\r\n");
      out.write("\t<table style=\"border-style: none;\" border=\"0\" width=\"200px;\"\r\n");
      out.write("\t\theight=\"300px;\" style=\"table-layout: auto;\" align=\"center\">\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 1 -->\r\n");
      out.write("\t\t\t<td style=\"border-style: none;\" border=\"0\" width=\"100%\"\r\n");
      out.write("\t\t\t\tbgcolor=\"#FF11AA\" >\r\n");
      out.write("\t\t\t\t<div width=\"20%\" >\r\n");
      out.write("\t\t\t\t\t<h3>購入履歴</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"syousai\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"height: 500px;; width: 500px;\">\r\n");
      out.write("\t\t\t\t\t<table border=\"1\" width=\"100%\" style=\"table-layout: auto;\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"wa\" ><img src=\"pic/wanima_art.jpg\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　曲名/アーティスト<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　5月30日<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　デジタル　<u>\\1200</u>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"wa\"><img src=\"pic/wanima_art.jpg\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　曲名/アーティスト<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　4月10日<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　デジタル　<u>\\1200</u>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"wa\"><img src=\"pic/wanima_art.jpg\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　曲名/アーティスト<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　3月25日<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　CD　<u>\\2000</u>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"wa\"><img src=\"pic/wanima_art.jpg\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　曲名/アーティスト<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　2月1日<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t　デジタル　<u>\\1200</u>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<!-- ここまで -->\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
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
