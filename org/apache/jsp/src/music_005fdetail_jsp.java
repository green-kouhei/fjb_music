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
      out.write("<!DOCTYPE html><html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel = \"stylesheet\"href = \"css/music_detail.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "test001.jsp", out, false);
      out.write("\r\n");
      out.write("<div class = \"soreppoi\" style=\"text-align : center\">商品詳細</div>\r\n");
      out.write("<div class = \"main_detail\">\r\n");
      out.write("<img alt=\"\" src=\"pic/cd.jpg\" id=\"cd_img\">\r\n");
      out.write("<span id= \"mei\" >商品名<span id = \"sin\">歌手</span></span>\r\n");
      out.write("<img alt=\"\" src=\"pic/cart.jpg\" id=\"cart_img\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class = \"mu\">\r\n");
      out.write("<span id = \"na\">曲名1</span>\r\n");
      out.write("<span id = \"shi\" >\r\n");
      out.write("<audio controls preload=\"auto\" style=\"width:200px;\">\r\n");
      out.write("\r\n");
      out.write("</audio>\r\n");
      out.write("</span>\r\n");
      out.write("</div>\r\n");
      out.write("<footer>\r\n");
      out.write("<br>Copyright 船橋あいす工房,all rights reserved.\r\n");
      out.write("</footer>\r\n");
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
