package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowCase1_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <base target=\"_parent\">\n");
      out.write("        <style type=\"text/css\">/* Chart.js */\n");
      out.write("            @-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}\n");
      out.write("            @keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}\n");
      out.write("            .chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body aria-busy=\"true\">\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--Section: Content-->\n");
      out.write("            <section class=\"dark-grey-text text-center\">\n");
      out.write("                \n");
      out.write("                <!-- Grid row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                        <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                            <div class=\"view zoom\">\n");
      out.write("                                <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/5.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                <div class=\"stripe dark\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <p>Trousers\n");
      out.write("                                            <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                        <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                            <div class=\"view zoom\">\n");
      out.write("                                <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/8.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                <div class=\"stripe light\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <p>Sweatshirt\n");
      out.write("                                            <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                        <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                            <div class=\"view zoom\">\n");
      out.write("                                <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/9.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                <div class=\"stripe dark\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <p>Black hat\n");
      out.write("                                            <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <!-- Fourth column -->\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                        <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                            <div class=\"view zoom\">\n");
      out.write("                                <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/7.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                                <div class=\"stripe light\">\n");
      out.write("                                    <a>\n");
      out.write("                                        <p>Sweatshirt\n");
      out.write("                                            <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Card image -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Collection card -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Fourth column -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid row -->\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!--Section: Content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
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
