package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("       <script>\n");
      out.write("function validateForm()\n");
      out.write("{\n");
      out.write("var f=document.forms[\"myForm\"][\"frstnm\"].value;\n");
      out.write("l=document.forms[\"myForm\"][\"lstnm\"].value;\n");
      out.write("a=document.forms[\"myForm\"][\"add\"].value;\n");
      out.write("c=document.forms[\"myForm\"][\"ct\"].value;\n");
      out.write("pw=document.forms[\"myForm\"][\"pw\"].value;\n");
      out.write("ml=document.forms[\"myForm\"][\"mail\"].value;\n");
      out.write("mo=document.forms[\"myForm\"][\"mbn\"].value;\n");
      out.write("\n");
      out.write("r=/([a-zA-z])/;\n");
      out.write("p=/^[0-9]+$/;\n");
      out.write("n=/^([a-zA-Z0-9-\\*$])+\\@([a-zA-Z0-9-\\*$])+\\.([a-z]{2,4})$/;\n");
      out.write("\n");
      out.write("if (f==null || f==\"\")\n");
      out.write("  {\n");
      out.write("  alert(\"Please enter your first name\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write("  if (l==null || l==\"\")\n");
      out.write("  {\n");
      out.write("  alert(\"Please enter your last name\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write("  if (a==null || a==\"\")\n");
      out.write("  {\n");
      out.write("  alert(\"Please enter your full address\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write("  if (c==null || c==\"\")\n");
      out.write("  {\n");
      out.write("  alert(\"Please enter your city\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write("  if (pw==null || pw==\"\")\n");
      out.write("  {\n");
      out.write("  alert(\"Please enter your password\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write("  if (ml==null || ml==\"\")\n");
      out.write("  {\n");
      out.write("  alert(\"Please enter your email\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write("  if (mo==null || mo==\"\")\n");
      out.write("  {\n");
      out.write("  alert(\"Please enter your mobile no.\");\n");
      out.write("  return false;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("else if(!f.match(r) || !l.match(r) || !c.match(r))\n");
      out.write("         {\n");
      out.write("           alert(\"Please enter characters only in Name and City\");\n");
      out.write("           return false;\n");
      out.write("          }\n");
      out.write("else if(!ml.match(n))\n");
      out.write("         {\n");
      out.write("           alert(\"Please enter your correct email_id\");\n");
      out.write("           return false;\n");
      out.write("          }\n");
      out.write("else if(!a.match(r) && !a.match(p))\n");
      out.write("         {\n");
      out.write("           alert(\"Please enter only alphabets and numbers in your address\");\n");
      out.write("           return false;\n");
      out.write("          }\n");
      out.write("else if(!mo.match(p))\n");
      out.write("         {\n");
      out.write("           alert(\"Please Enter only no[+91-digit] in mobile no.\");\n");
      out.write("           return false;\n");
      out.write("          }\n");
      out.write("          \n");
      out.write("}\n");
      out.write(" \n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("        <title>register</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <body bgcolor=\"#999999\">\n");
      out.write("        <form name=\"myForm\" action=\"buypolicyck.jsp\" onsubmit=\"return validateForm()\" method=\"post\">\n");
      out.write("    <u><h1 ALIGN=\"CENTER\">Welcome Customer</h1></u>\n");
      out.write("    <u><h2 align=\"center\">Enter Your Basic Details</h2></u>\n");
      out.write("        <table border=\"0\" align=\"center\">\n");
      out.write("           \n");
      out.write("            <tbody>\n");
      out.write("            <br>\n");
      out.write("                <tr>\n");
      out.write("                    <td>First Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"frstnm\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"lstnm\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><input type=\"text\" name=\"add\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ct\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pw\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>E-mail Id</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mail\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td><select name=\"gen\">\n");
      out.write("                            <option>Male</option>\n");
      out.write("                            <option>Female</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Mobile No</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mbn\" value=\"\" maxlength=\"10\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>POLICY</td>\n");
      out.write("                    <td><select name=\"pol\">\n");
      out.write("                            <option>Money Back Plan</option>\n");
      out.write("                            <option>New Endowment Plan</option>\n");
      out.write("                            <option>Child Secure Plan</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> purchase date (mm/dd/yyyy)</td>\n");
      out.write("                    <td><input type=\"text\" name=\"dop\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>LIFE INSURANCE Cover(in Rupees)</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cover\" id=\"cover\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>    \n");
      out.write("                <input type=\"submit\" value=\"submit\"  style=\"position: absolute; left: 700px; top:500px\"/></form>\n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("  ");
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
