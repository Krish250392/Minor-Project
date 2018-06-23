package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ds1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("    \n");
      out.write("    <body bgcolor=\"#999999\">\n");
      out.write("        <form action=\"datesearchck.jsp\" method=\"get\">\n");
      out.write("            <BR>\n");
      out.write("            <BR>\n");
      out.write("            <u><h1 ALIGN=\"CENTER\">DATE WISE SEARCH </h1></u><br>\n");
      out.write("        \n");
      out.write("        <table border=\"0\" align=\"center\">\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Date of Purchase</td>\n");
      out.write("                    <td>\n");
      out.write("                            <select name=\"mm\">\n");
      out.write("                                <option>MM</option>\n");
      out.write("                                <option>01</option>\n");
      out.write("                                <option>02</option>\n");
      out.write("                                <option>03</option>\n");
      out.write("                                <option>04</option>\n");
      out.write("                                <option>05</option>\n");
      out.write("                                <option>06</option>\n");
      out.write("                                <option>07</option>\n");
      out.write("                                <option>08</option>\n");
      out.write("                                <option>09</option>\n");
      out.write("                                <option>10</option>\n");
      out.write("                                <option>11</option>\n");
      out.write("                                <option>12</option>\n");
      out.write("                            </select>\n");
      out.write("            <select name=\"dd\">\n");
      out.write("                <option>DD</option>\n");
      out.write("                                <option>01</option>\n");
      out.write("                                <option>02</option>\n");
      out.write("                                <option>03</option>\n");
      out.write("                                <option>04</option>\n");
      out.write("                                <option>05</option>\n");
      out.write("                                <option>06</option>\n");
      out.write("                                <option>07</option>\n");
      out.write("                                <option>08</option>\n");
      out.write("                                <option>09</option>\n");
      out.write("                                <option>10</option>\n");
      out.write("                                <option>11</option>\n");
      out.write("                                <option>12</option>\n");
      out.write("                                <option>13</option>\n");
      out.write("                                <option>14</option>\n");
      out.write("                                <option>15</option>\n");
      out.write("                                <option>16</option>\n");
      out.write("                                <option>17</option>\n");
      out.write("                                <option>18</option>\n");
      out.write("                                <option>19</option>\n");
      out.write("                                <option>20</option>\n");
      out.write("                                <option>21</option>\n");
      out.write("                                <option>22</option>\n");
      out.write("                                <option>23</option>\n");
      out.write("                                <option>24</option>\n");
      out.write("                                <option>25</option>\n");
      out.write("                                <option>26</option>\n");
      out.write("                                <option>27</option>\n");
      out.write("                                <option>28</option>\n");
      out.write("                                <option>29</option>\n");
      out.write("                                <option>30</option>\n");
      out.write("                                <option>31</option>\n");
      out.write("            </select>\n");
      out.write("            <select name=\"yyyy\">\n");
      out.write("                <option>YYYY</option>\n");
      out.write("                <option>2014</option>\n");
      out.write("                <option>2013</option>\n");
      out.write("                <option>2012</option>\n");
      out.write("                <option>2011</option>\n");
      out.write("                <option>2010</option>\n");
      out.write("                <option>2009</option>\n");
      out.write("                <option>2008</option>\n");
      out.write("                <option>2007</option>\n");
      out.write("                <option>2006</option>\n");
      out.write("                <option>2005</option>\n");
      out.write("                <option>2004</option>\n");
      out.write("                <option>2003</option>\n");
      out.write("            </select>\n");
      out.write("                        \n");
      out.write("                        </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"search policy\" style=\"position: absolute; left: 600px;top:250px\"/></td>\n");
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
