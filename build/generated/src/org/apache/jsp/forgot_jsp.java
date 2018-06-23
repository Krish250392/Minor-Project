package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>Forgot Password</title>\n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("    <body bgcolor=\"#999999\">\n");
      out.write("        <form action=\"forgotck.jsp\" method=\"get\">\n");
      out.write("            \n");
      out.write("            <u><h1 ALIGN=\"CENTER\">FORGET PASSWORD</h1></u>\n");
      out.write("            \n");
      out.write("            <p ALIGN=\"CENTER\">&nbsp;</p>\n");
      out.write("          </u><br>\n");
      out.write("          \n");
      out.write("            <table height=\"210\" width=\"1000px\" border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"3\">\n");
      out.write("            \n");
      out.write("          <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\"width=\"643\" height=\"66\"> Your Email   \n");
      out.write("                      <input type=\"email\" name=\"em\" value=\"\" /></td>\n");
      out.write("                    <td width=\"10\">&nbsp;</td>\n");
      out.write("              </tr>\n");
      out.write("                <tr><td style=\"position: absolute; left: 400px; top:220px\">Your password will now be sent to your Email, Click on the Validate Button to get the new password...</td></tr>\n");
      out.write("                <td><input name=\"submit\" type=\"submit\" style=\"position: absolute; left: 600px; top:270px\" value=\"Validate\"/></td>   \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("        </font>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
