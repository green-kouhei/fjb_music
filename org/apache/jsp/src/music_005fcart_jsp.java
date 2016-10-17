package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_cart.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "test001.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t<table width=\"100%\" style=\"table-layout: auto\">\r\n");
      out.write("\t\t\t<td width=\"10%\"></td>\r\n");
      out.write("\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<table style=\"border-style: none;\" border=\"1\" bgcolor=\"white\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr width=\"100%\" style=\"table-layout: auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30%\">商品画像</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40%\">商品名</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"20%\">価格</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\">数量</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\">取り消し</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"table-layout: auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30%\"><img src=\"pic/wanima_art.jpg\" align=\"left\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40%\">WANIMA/JUICE UP‼</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"20%\">\\100/\\108</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\"><select name=\"vol\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">7</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">8</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">9</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">10</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\"><input type=\"submit\" name=\"remove\" value=\"削除\"></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr width=\"100%\" style=\"table-layout: auto\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30%\"><img src=\"pic/wanima_art.jpg\" align=\"left\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40%\">WANIMA/JUICE UP‼</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"20%\">\\100/\\108</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\"><select name=\"vol\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">7</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">8</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">9</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">10</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\"><input type=\"submit\" name=\"remove\" value=\"削除\"></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"music_pay2.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h1 id=\"head_logo\">注文</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"10%\"></td>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer> Copyright 船橋あいす工房,all rights reserved. </footer>\r\n");
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
