package org.apache.jsp.src;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fpay2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/music_pay.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("\t<h1 id=\"head_h1\">FJB Music</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<body bgcolor=\"yellow\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"navi\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t\t<td><img alt=\"\"src=\"pic/login.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/nyuuryoku.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/kakunin.png\"class=\"main_img\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/yazirusi.png\"class=\"main_yimg\">\r\n");
      out.write("\t\t\t<img alt=\"\"src=\"pic/kanryou.png\"class=\"main_img\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<form action=\"music_pay3.jsp\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>名前<input type=\"text\" name=\"姓\" size=\"12\"><input type=\"text\" name=\"名\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>フリガナ<input type=\"text\" name=\"姓\" size=\"12\"><input type=\"text\" name=\"名\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>生年月日</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>メールアドレス<input type=\"text\" name=\"アドレス\" size=\"40\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>確認<input type=\"text\" name=\"アドレス\" size=\"40\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>郵便番号</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>都道府県<input type=\"text\" name=\"都道府県\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>市区町村<input type=\"text\" name=\"市区町村\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>番地・部屋番号<input type=\"text\" name=\"番地\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><input type=\"radio\" name=\"支払い\"value=\"クレジットカード\" >お支払い方法</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>番号<input type=\"text\" name=\"カード番号\" size=\"12\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><input type=\"radio\" name=\"支払い\"value=\"代引き\" >代引き</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><input id=\"btn\" type=\"submit\" value=\"確認\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- \t\t\t<div> -->\r\n");
      out.write("\t\t<!-- \t\t<select name=\"year\"> -->\r\n");
      out.write("\t\t<?php optionLoop('1950', date('Y'));?>\r\n");
      out.write("\t\t<!-- \t\t</select> 年 <select name=\"year\"> -->\r\n");
      out.write("\t\t<?php optionLoop('1', '12');?>\r\n");
      out.write("\t\t<!-- \t\t</select> 月 <select name=\"day\"> -->\r\n");
      out.write("\t\t<?php optionLoop('1', '31');?>\r\n");
      out.write("\t\t<!-- \t\t</select> 日 -->\r\n");
      out.write("\t\t<!-- \t</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
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
