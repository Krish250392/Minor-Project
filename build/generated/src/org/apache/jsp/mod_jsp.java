package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mod_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>register</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    \n");
      out.write("    <body bgcolor=\"#999999\">\n");
      out.write("        <form action=\"modck.jsp\" method=\"get\">\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <u><h1 ALIGN=\"CENTER\">CUSTOMER SEARCH </h1></u><br>\n");
      out.write("        \n");
      out.write("        <table border=\"0\" align=\"center\">\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Enter mobile no</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mb\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Enter what to be modified</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mod\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                    <td>Enter new value</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nw\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Modify\" style=\"position: absolute; left: 600px;top:250px\"/></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
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
