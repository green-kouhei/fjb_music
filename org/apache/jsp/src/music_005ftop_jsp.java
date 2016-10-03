package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005ftop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_top.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- スライドのJQuery -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"jquery.bxslider/jquery.bxslider.min.js\"></script>\r\n");
      out.write("<link href=\"jquery.bxslider/jquery.bxslider.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('.bxslider').bxSlider({\r\n");
      out.write("\t\t\tauto : true,\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"yellow\";>\r\n");
      out.write("\r\n");
      out.write("\t<!-- include -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "test001.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- スライドショー\r\n");
      out.write("\t<div class=\"example\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"box1\">ボックス1</div>\r\n");
      out.write("\t<div class=\"box2\">ボックス2</div>\r\n");
      out.write("\r\n");
      out.write("\t -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"example\" align=\"center\">\r\n");
      out.write("\t\t<ul class=\"bxslider\">\r\n");
      out.write("\t\t\t<li><img src=\"pic/10feet.jpg\"></li>\r\n");
      out.write("\t\t\t<li><img src=\"pic/ken_yokoyama.jpg\"></li>\r\n");
      out.write("\t\t\t<li><img src=\"pic/mwam.jpg\"></li>\r\n");
      out.write("\t\t\t<li><img src=\"pic/wanima.jpg\"></li>\r\n");
      out.write("\t\t\t<li><img src=\"pic/xmas_eileen.jpg\"></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- キャンペーン・おすすめ -->\r\n");
      out.write("\t<div style=\"background-color: #AAEEDD\">\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\t<center>今週のおすすめ！</center>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer> Copyright FJB Music , all rights reserved. </footer>\r\n");
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
