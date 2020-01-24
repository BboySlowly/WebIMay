package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyNavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("<!--Navbar -->\n");
      out.write("<nav class=\"mb-0 navbar navbar-expand-lg navbar-dark black\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">เวบ ไอ้ เมย์ พี่บอยทำ</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-555\"\n");
      out.write("            aria-controls=\"navbarSupportedContent-555\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-555\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Home\n");
      out.write("                    <span class=\"sr-only\">(current)</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">New</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Support</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink-555\" data-toggle=\"dropdown\"\n");
      out.write("                   aria-haspopup=\"true\" aria-expanded=\"false\">Product\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-secondary\" aria-labelledby=\"navbarDropdownMenuLink-555\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <ul class=\"navbar-nav ml-auto nav-flex-icons\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a href=\"#!\" class=\"nav-link waves-effect\">\n");
      out.write("                    <span class=\"badge red z-depth-1 mr-1\"> 2 </span>\n");
      out.write("                    <i id=\"navbar-static-cart\" alt=\"Cart\" class=\"fas fa-shopping-cart\"></i>\n");
      out.write("                    <span class=\"sr-only\"> Cart </span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <ul class=\"navbar-nav ml-auto nav-flex-icons\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link waves-effect waves-light\">1\n");
      out.write("                        <i class=\"fas fa-envelope\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item avatar dropdown\">\n");
      out.write("\n");
      out.write("                    ");

                        if (session.getAttribute("username") == null || session.getAttribute("username") == "") {
                            out.print("<a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink-55\" data-toggle=\"dropdown\"");
                            out.print("aria-haspopup=\"true\" aria-expanded=\"false\">");
                            out.print("<img src=\"img/icon/user.jpg\" class=\"rounded-circle z-depth-0\"");
                            out.print("alt=\"avatar image\">");
                            out.print("</a>");
                            out.print("<div class=\"dropdown-menu dropdown-menu-lg-right dropdown-secondary\"");
                            out.print("aria-labelledby=\"navbarDropdownMenuLink-55\">");
                            out.print("<a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#modalLRForm\">Login</a>");
                            out.print("<a class=\"dropdown-item\" href=\"#\">Setting</a>");
                            out.print("</div>");
                        } else {
                            out.print("<a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink-55\" data-toggle=\"dropdown\"");
                            out.print("aria-haspopup=\"true\" aria-expanded=\"false\">");
                            out.print("<img src=\"https://mdbootstrap.com/img/Photos/Avatars/avatar-2.jpg\" class=\"rounded-circle z-depth-0\"");
                            out.print("alt=\"avatar image\">");
                            out.print("</a>");
                            out.print("<div class=\"dropdown-menu dropdown-menu-lg-right dropdown-secondary\"");
                            out.print("aria-labelledby=\"navbarDropdownMenuLink-55\">");
                            out.print("<a class=\"dropdown-item\" href=\"Logout\">Logout</a>");
                            out.print("<a class=\"dropdown-item\" href=\"#\">Setting</a>");
                            out.print("</div>");
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <a href=\"Login.jsp\" class=\"btn btn-default btn-rounded my-3 waves-effect waves-light\" data-toggle=\"modal\" data-target=\"#modalLRForm\">Launch\n");
      out.write("                    Modal LogIn/Register</a>\n");
      out.write("            </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<!--/.Navbar -->");
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
