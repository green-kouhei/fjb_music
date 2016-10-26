package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/admin_list.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<h1 id=\"head_h1\">FJB Music</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<dl class=\"search2\">\r\n");
      out.write("\t\t<dt>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"search\" value=\"\" placeholder=\"Search\" />\r\n");
      out.write("\t\t\t<button>サイト内検索</button>\r\n");
      out.write("\t\t</dt>\r\n");
      out.write("\r\n");
      out.write("\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t<table width=\"100%\" border=\"1\" style=\"margin: auto;\" bgcolor=\"#48D1CC\">\r\n");
      out.write("\t\t<td width=\"20%\" border=\"1\" style=\"margin: auto;\" bgcolor=\"#FFFFF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3>ジャンル</h3>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://wanima.net/\">rock</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"1\" style=\"margin: auto;\">\r\n");
      out.write("\t\t\t\t\t<tr style=\"margin: auto;\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\" style=\"margin: auto;\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\" style=\"margin: auto;\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\" style=\"margin: auto;\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\" style=\"margin: auto;\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr style=\"margin: auto;\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"10\"><img src=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"10\"><img src=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"10\"><img src=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"10\"><img src=\"pic/wanima_art.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>タイトル</h4></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
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
