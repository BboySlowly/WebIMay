package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyNavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Login.jsp");
  }

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

      out.write("<header>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("<!--Modal: Login / Register Form-->\r\n");
      out.write("<div class=\"modal fade\" id=\"modalLRForm\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog cascading-modal\" role=\"document\">\r\n");
      out.write("        <!--Content-->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("            <!--Modal cascading tabs-->\r\n");
      out.write("            <div class=\"modal-c-tabs\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav tabs -->\r\n");
      out.write("                <ul class=\"nav nav-tabs md-tabs tabs-2 light-blue darken-3\" role=\"tablist\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#panel7\" role=\"tab\"><i class=\"fas fa-user mr-1\"></i>\r\n");
      out.write("                            Login</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"tab\" href=\"#panel8\" role=\"tab\"><i class=\"fas fa-user-plus mr-1\"></i>\r\n");
      out.write("                            Register</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <!-- Tab panels -->\r\n");
      out.write("                <div class=\"tab-content\">\r\n");
      out.write("                    <!--Panel 7-->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"tab-pane fade in show active\" id=\"panel7\" role=\"tabpanel\">\r\n");
      out.write("                        <form action=\"Login\" method=\"post\">\r\n");
      out.write("                            <!--Body-->\r\n");
      out.write("                            <div class=\"modal-body mb-1\">\r\n");
      out.write("                                <div class=\"md-form form-sm mb-5\">\r\n");
      out.write("                                    <i class=\"fas fa-envelope prefix\"></i>\r\n");
      out.write("                                    <input type=\"email\" name=\"email\" id=\"modalLRInput10\" class=\"form-control form-control-sm validate\">\r\n");
      out.write("                                    <label data-error=\"wrong\" data-success=\"right\" for=\"modalLRInput10\">Your email</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"md-form form-sm mb-4\">\r\n");
      out.write("                                    <i class=\"fas fa-lock prefix\"></i>\r\n");
      out.write("                                    <input type=\"password\" name=\"password\" id=\"modalLRInput11\" class=\"form-control form-control-sm validate\">\r\n");
      out.write("                                    <label data-error=\"wrong\" data-success=\"right\" for=\"modalLRInput11\">Your password</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-center mt-2\">\r\n");
      out.write("                                    <button class=\"btn btn-info\" type=\"submit\">Log in <i class=\"fas fa-sign-in ml-1\"></i></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <!--Footer-->\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <div class=\"options text-center text-md-right mt-1\">\r\n");
      out.write("                                <p>Not a member? <a href=\"#\" class=\"blue-text\">Sign Up</a></p>\r\n");
      out.write("                                <p>Forgot <a href=\"#\" class=\"blue-text\">Password?</a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-info waves-effect ml-auto\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.Panel 7-->\r\n");
      out.write("\r\n");
      out.write("                    <!--Panel 8-->\r\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"panel8\" role=\"tabpanel\">\r\n");
      out.write("\r\n");
      out.write("                        <!--Body-->\r\n");
      out.write("                        <form action=\"Register\" method=\"post\">\r\n");
      out.write("                            <div class=\"modal-body\" >\r\n");
      out.write("                                <div class=\"md-form form-sm mb-5\">\r\n");
      out.write("                                    <i class=\"fas fa-envelope prefix\"></i>\r\n");
      out.write("                                    <input type=\"email\" name=\"email\" id=\"modalLRInput12\" class=\"form-control form-control-sm validate\">\r\n");
      out.write("                                    <label data-error=\"wrong\" data-success=\"right\" for=\"modalLRInput12\">Your email</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"md-form form-sm mb-5\">\r\n");
      out.write("                                    <i class=\"fas fa-user prefix\"></i>\r\n");
      out.write("                                    <input type=\"text\" name=\"username\" id=\"modalLRInput13\" class=\"form-control form-control-sm validate\">\r\n");
      out.write("                                    <label data-error=\"wrong\" data-success=\"right\" for=\"modalLRInput13\">User Name</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"md-form form-sm mb-5\">\r\n");
      out.write("                                    <i class=\"fas fa-lock prefix\"></i>\r\n");
      out.write("                                    <input type=\"password\" name=\"password\" id=\"modalLRInput15\" class=\"form-control form-control-sm validate\">\r\n");
      out.write("                                    <label data-error=\"wrong\" data-success=\"right\" for=\"modalLRInput15\">Your password</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"md-form form-sm mb-4\">\r\n");
      out.write("                                    <i class=\"fas fa-lock prefix\"></i>\r\n");
      out.write("                                    <input type=\"password\" id=\"modalLRInput16\" class=\"form-control form-control-sm validate\">\r\n");
      out.write("                                    <label data-error=\"wrong\" data-success=\"right\" for=\"modalLRInput16\">Repeat password</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"text-center form-sm mt-2\">\r\n");
      out.write("                                    <button class=\"btn btn-info\" type=\"submit\">Register<i class=\"fas fa-sign-in ml-1\"></i></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <!--Footer-->\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <div class=\"options text-right\">\r\n");
      out.write("                                <p class=\"pt-1\">Already have an account? <a href=\"#\" class=\"blue-text\">Log In</a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-info waves-effect ml-auto\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.Panel 8-->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/.Content-->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--Modal: Login / Register Form-->");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!--Navbar -->\r\n");
      out.write("    <nav class=\"mb-0 navbar navbar-expand-lg navbar-dark black\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">เวบ ไอ้ เมย์ พี่บอยทำ</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-555\"\r\n");
      out.write("                aria-controls=\"navbarSupportedContent-555\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-555\">\r\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Home\r\n");
      out.write("                        <span class=\"sr-only\">(current)</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">New</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Support</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink-555\" data-toggle=\"dropdown\"\r\n");
      out.write("                       aria-haspopup=\"true\" aria-expanded=\"false\">Product\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-secondary\" aria-labelledby=\"navbarDropdownMenuLink-555\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav ml-auto nav-flex-icons\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a href=\"#!\" class=\"nav-link waves-effect\">\r\n");
      out.write("                        <span class=\"badge red z-depth-1 mr-1\"> 2 </span>\r\n");
      out.write("                        <i id=\"navbar-static-cart\" alt=\"Cart\" class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("                        <span class=\"sr-only\"> Cart </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto nav-flex-icons\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link waves-effect waves-light\">1\r\n");
      out.write("                            <i class=\"fas fa-envelope\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item avatar dropdown\">\r\n");
      out.write("\r\n");
      out.write("                        ");

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
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!--/.Navbar -->\r\n");
      out.write("</header>");
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
