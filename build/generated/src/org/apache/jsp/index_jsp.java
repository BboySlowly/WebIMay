package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/MyNavbar.jsp");
    _jspx_dependants.add("/Slidebar.jsp");
    _jspx_dependants.add("/ShowCase1_1.jsp");
    _jspx_dependants.add("/ShowCase1_2.jsp");
    _jspx_dependants.add("/Footer.jsp");
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>เวบ ไอ้ เมย์ พี่บอยทำ</title>\n");
      out.write("        <!-- MDB icon -->\n");
      out.write("        <link rel=\"icon\" href=\"\" type=\"image/x-icon\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\">\n");
      out.write("        <!-- Google Fonts Roboto -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\">\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/compiled-4.12.0.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/mdb-plugins-gathered.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!--Navbar -->\n");
      out.write("<nav class=\"mb-1 navbar navbar-expand-lg navbar-dark black\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
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
      out.write("                <a class=\"nav-link\" href=\"#\">Features</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink-555\" data-toggle=\"dropdown\"\n");
      out.write("                   aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-secondary\" aria-labelledby=\"navbarDropdownMenuLink-555\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"navbar-nav ml-auto nav-flex-icons\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link waves-effect waves-light\">1\n");
      out.write("                    <i class=\"fas fa-envelope\"></i>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item avatar dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdownMenuLink-55\" data-toggle=\"dropdown\"\n");
      out.write("                   aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <img src=\"https://mdbootstrap.com/img/Photos/Avatars/avatar-2.jpg\" class=\"rounded-circle z-depth-0\"\n");
      out.write("                         alt=\"avatar image\">\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-lg-right dropdown-secondary\"\n");
      out.write("                     aria-labelledby=\"navbarDropdownMenuLink-55\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<!--/.Navbar -->");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"container my-5\">\n");
      out.write("\n");
      out.write("    <!--Section: Content-->\n");
      out.write("    <section class=\"text-center dark-grey-text mb-5\">\n");
      out.write("\n");
      out.write("        <h3 class=\"font-weight-bold pb-5 text-center\">Gallery</h3>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                <!--Carousel Wrapper-->\n");
      out.write("                <div id=\"carousel-example-1z\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <!--Indicators-->\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#carousel-example-1z\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#carousel-example-1z\" data-slide-to=\"1\"></li>\n");
      out.write("                        <li data-target=\"#carousel-example-1z\" data-slide-to=\"2\"></li>\n");
      out.write("                    </ol>\n");
      out.write("                    <!--/.Indicators-->\n");
      out.write("                    <!--Slides-->\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                        <!--First slide-->\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Architecture/12-col/img%20(10).jpg\"\n");
      out.write("                                 alt=\"First slide\">\n");
      out.write("                        </div>\n");
      out.write("                        <!--/First slide-->\n");
      out.write("                        <!--Second slide-->\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Architecture/12-col/img%20(11).jpg\"\n");
      out.write("                                 alt=\"Second slide\">\n");
      out.write("                        </div>\n");
      out.write("                        <!--/Second slide-->\n");
      out.write("                        <!--Third slide-->\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Architecture/12-col/img%20(12).jpg\"\n");
      out.write("                                 alt=\"Third slide\">\n");
      out.write("                        </div>\n");
      out.write("                        <!--/Third slide-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.Slides-->\n");
      out.write("                    <!--Controls-->\n");
      out.write("                    <a class=\"carousel-control-prev\" href=\"#carousel-example-1z\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"carousel-control-next\" href=\"#carousel-example-1z\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                    <!--/.Controls-->\n");
      out.write("                </div>\n");
      out.write("                <!--/.Carousel Wrapper-->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!--Section: Content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <!-- Start your project here-->\n");
      out.write("        ");
      out.write("<div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--Section: Content-->\n");
      out.write("    <section class=\"dark-grey-text text-center\">\n");
      out.write("\n");
      out.write("        <!-- Section heading -->\n");
      out.write("        <h3 class=\"font-weight-bold mb-4 pb-2\">Our bestsellers</h3>\n");
      out.write("        <!-- Section description -->\n");
      out.write("        <p class=\"grey-text w-responsive mx-auto mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit fugit, error amet numquam iure provident voluptate esse quasi nostrum quisquam eum porro a pariatur veniam.</p>\n");
      out.write("\n");
      out.write("        <!-- Grid row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                <!-- Collection card -->\n");
      out.write("                <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <div class=\"view zoom\">\n");
      out.write("                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/5.jpg\" class=\"img-fluid\"\n");
      out.write("                             alt=\"\">\n");
      out.write("                        <div class=\"stripe dark\">\n");
      out.write("                            <a>\n");
      out.write("                                <p>Trousers\n");
      out.write("                                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                </p>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Collection card -->\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                <!-- Collection card -->\n");
      out.write("                <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <div class=\"view zoom\">\n");
      out.write("                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/8.jpg\" class=\"img-fluid\"\n");
      out.write("                             alt=\"\">\n");
      out.write("                        <div class=\"stripe light\">\n");
      out.write("                            <a>\n");
      out.write("                                <p>Sweatshirt\n");
      out.write("                                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                </p>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Collection card -->\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                <!-- Collection card -->\n");
      out.write("                <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <div class=\"view zoom\">\n");
      out.write("                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/9.jpg\" class=\"img-fluid\"\n");
      out.write("                             alt=\"\">\n");
      out.write("                        <div class=\"stripe dark\">\n");
      out.write("                            <a>\n");
      out.write("                                <p>Black hat\n");
      out.write("                                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                </p>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Collection card -->\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <!-- Fourth column -->\n");
      out.write("            <div class=\"col-lg-3 col-md-6 mb-4\">\n");
      out.write("                <!-- Collection card -->\n");
      out.write("                <div class=\"card collection-card z-depth-1-half\">\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <div class=\"view zoom\">\n");
      out.write("                        <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/7.jpg\" class=\"img-fluid\"\n");
      out.write("                             alt=\"\">\n");
      out.write("                        <div class=\"stripe light\">\n");
      out.write("                            <a>\n");
      out.write("                                <p>Sweatshirt\n");
      out.write("                                    <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                                </p>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Collection card -->\n");
      out.write("            </div>\n");
      out.write("            <!-- Fourth column -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Grid row -->\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!--Section: Content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--Section: Content-->\n");
      out.write("    <section class=\"text-center\">\n");
      out.write("\n");
      out.write("        <!-- Section heading -->\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-4 col-md-12 mb-4\">\n");
      out.write("                <!-- Card -->\n");
      out.write("                <div class=\"card card-cascade wider card-ecommerce\">\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <div class=\"view view-cascade overlay\">\n");
      out.write("                        <img src=\"img/Products/img (55).jpg\" class=\"card-img-top\"\n");
      out.write("                             alt=\"sample photo\">\n");
      out.write("                        <a>\n");
      out.write("                            <div class=\"mask rgba-white-slight\"></div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <!-- Card content -->\n");
      out.write("                    <div class=\"card-body card-body-cascade text-center pb-0\">\n");
      out.write("                        <!-- Title -->\n");
      out.write("                        <h5 class=\"card-title\">\n");
      out.write("                            <strong>\n");
      out.write("                                <a href=\"\">GoPro</a>\n");
      out.write("                            </strong>\n");
      out.write("                        </h5>\n");
      out.write("                        <!-- Description -->\n");
      out.write("                        <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing minima veniam elit.</p>\n");
      out.write("                        <!-- Card footer -->\n");
      out.write("                        <div class=\"card-footer mt-4\">\n");
      out.write("                            <p class=\"float-left font-weight-bold mb-1 pb-2\">1439$</p>\n");
      out.write("                            <a class=\"float-right material-tooltip-main\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Add to Wishlist\">\n");
      out.write("                                <i class=\"fas fa-heart grey-text ml-3\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"float-right material-tooltip-main\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Quick Look\">\n");
      out.write("                                <i class=\"fas fa-eye grey-text ml-3\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card content -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Card -->\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                <!-- Card -->\n");
      out.write("                <div class=\"card card-cascade wider card-ecommerce\">\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <div class=\"view view-cascade overlay\">\n");
      out.write("                        <img src=\"img/Products/img (49).jpg\" class=\"card-img-top\"\n");
      out.write("                             alt=\"sample photo\">\n");
      out.write("                        <a>\n");
      out.write("                            <div class=\"mask rgba-white-slight\"></div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <!-- Card content -->\n");
      out.write("                    <div class=\"card-body card-body-cascade text-center pb-0\">\n");
      out.write("                        <!-- Title -->\n");
      out.write("                        <h5 class=\"card-title\">\n");
      out.write("                            <strong>\n");
      out.write("                                <a href=\"\">Camera</a>\n");
      out.write("                            </strong>\n");
      out.write("                        </h5>\n");
      out.write("                        <!-- Description -->\n");
      out.write("                        <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing minima veniam elit.</p>\n");
      out.write("                        <!-- Card footer -->\n");
      out.write("                        <div class=\"card-footer mt-4\">\n");
      out.write("                            <p class=\"float-left font-weight-bold mb-1 pb-2\">1160$</p>\n");
      out.write("                            <a class=\"float-right material-tooltip-main\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Add to Wishlist\">\n");
      out.write("                                <i class=\"fas fa-heart grey-text ml-3\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"float-right material-tooltip-main\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Quick Look\">\n");
      out.write("                                <i class=\"fas fa-eye grey-text ml-3\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card content -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Card -->\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("            <!--Grid column-->\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                <!-- Card -->\n");
      out.write("                <div class=\"card card-cascade wider card-ecommerce\">\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <div class=\"view view-cascade overlay\">\n");
      out.write("                        <img src=\"img/Products/img (56).jpg\" class=\"card-img-top\"\n");
      out.write("                             alt=\"sample photo\">\n");
      out.write("                        <a>\n");
      out.write("                            <div class=\"mask rgba-white-slight\"></div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card image -->\n");
      out.write("                    <!-- Card content -->\n");
      out.write("                    <div class=\"card-body card-body-cascade text-center pb-0\">\n");
      out.write("                        <!-- Title -->\n");
      out.write("                        <h5 class=\"card-title\">\n");
      out.write("                            <strong>\n");
      out.write("                                <a href=\"\">iPhone 6S</a>\n");
      out.write("                            </strong>\n");
      out.write("                        </h5>\n");
      out.write("                        <!-- Description -->\n");
      out.write("                        <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing minima veniam elit.</p>\n");
      out.write("                        <!-- Card footer -->\n");
      out.write("                        <div class=\"card-footer mt-4\">\n");
      out.write("                            <p class=\"float-left font-weight-bold mb-1 pb-2\">2079$</p>\n");
      out.write("                            <a class=\"float-right material-tooltip-main\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Add to Wishlist\">\n");
      out.write("                                <i class=\"fas fa-heart grey-text ml-3\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"float-right material-tooltip-main\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Quick Look\">\n");
      out.write("                                <i class=\"fas fa-eye grey-text ml-3\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Card content -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Card -->\n");
      out.write("            </div>\n");
      out.write("            <!--Grid column-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <nav class=\"d-flex justify-content-center mt-3\" aria-label=\"Page navigation example\">\n");
      out.write("            <ul class=\"pagination pagination-circle pg-blue\">\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\">First</a></li>\n");
      out.write("                <li class=\"page-item\">\n");
      out.write("                    <a class=\"page-link\" aria-label=\"Previous\">\n");
      out.write("                        <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"page-item active\"><a class=\"page-link\">1</a></li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\">2</a></li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\">3</a></li>\n");
      out.write("                <li class=\"page-item\">\n");
      out.write("                    <a class=\"page-link\" aria-label=\"Next\">\n");
      out.write("                        <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\">Last</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!--Section: Content-->\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <!-- End your project here-->\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"page-footer font-small blue-grey lighten-5\">\n");
      out.write("\n");
      out.write("    <div style=\"background-color: #000000;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- Grid row-->\n");
      out.write("            <div class=\"row py-4 d-flex align-items-center\">\n");
      out.write("\n");
      out.write("                <!-- Grid column -->\n");
      out.write("                <div class=\"col-md-6 col-lg-7 text-center text-md-right\">\n");
      out.write("\n");
      out.write("                    <!-- Facebook -->\n");
      out.write("                    <a class=\"fb-ic\">\n");
      out.write("                        <i class=\"fab fa-facebook-f white-text mr-4\"> </i>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Twitter -->\n");
      out.write("                    <a class=\"tw-ic\">\n");
      out.write("                        <i class=\"fab fa-twitter white-text mr-4\"> </i>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Google +-->\n");
      out.write("                    <a class=\"gplus-ic\">\n");
      out.write("                        <i class=\"fab fa-google-plus-g white-text mr-4\"> </i>\n");
      out.write("                    </a>\n");
      out.write("                    <!--Linkedin -->\n");
      out.write("                    <a class=\"li-ic\">\n");
      out.write("                        <i class=\"fab fa-linkedin-in white-text mr-4\"> </i>\n");
      out.write("                    </a>\n");
      out.write("                    <!--Instagram-->\n");
      out.write("                    <a class=\"ins-ic\">\n");
      out.write("                        <i class=\"fab fa-instagram white-text\"> </i>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid column -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid row-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer Links -->\n");
      out.write("    <div class=\"container text-center text-md-left mt-5\">\n");
      out.write("\n");
      out.write("        <!-- Grid row -->\n");
      out.write("        <div class=\"row mt-3 dark-grey-text\">\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-md-3 col-lg-4 col-xl-3 mb-4\">\n");
      out.write("\n");
      out.write("                <!-- Content -->\n");
      out.write("                <h6 class=\"text-uppercase font-weight-bold\">Company name</h6>\n");
      out.write("                <hr class=\"teal accent-3 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                <p>Here you can use rows and columns to organize your footer content. Lorem ipsum dolor sit amet,\n");
      out.write("                    consectetur\n");
      out.write("                    adipisicing elit.</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("\n");
      out.write("                <!-- Links -->\n");
      out.write("                <h6 class=\"text-uppercase font-weight-bold\">Products</h6>\n");
      out.write("                <hr class=\"teal accent-3 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">MDBootstrap</a>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">MDWordPress</a>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">BrandFlow</a>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">Bootstrap Angular</a>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("\n");
      out.write("                <!-- Links -->\n");
      out.write("                <h6 class=\"text-uppercase font-weight-bold\">Useful links</h6>\n");
      out.write("                <hr class=\"teal accent-3 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">Your Account</a>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">Become an Affiliate</a>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">Shipping Rates</a>\n");
      out.write("                </p>\n");
      out.write("                <p>\n");
      out.write("                    <a class=\"dark-grey-text\" href=\"#!\">Help</a>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n");
      out.write("\n");
      out.write("                <!-- Links -->\n");
      out.write("                <h6 class=\"text-uppercase font-weight-bold\">Contact</h6>\n");
      out.write("                <hr class=\"teal accent-3 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("                <p>\n");
      out.write("                    <i class=\"fas fa-home mr-3\"></i> New York, NY 10012, US</p>\n");
      out.write("                <p>\n");
      out.write("                    <i class=\"fas fa-envelope mr-3\"></i> info@example.com</p>\n");
      out.write("                <p>\n");
      out.write("                    <i class=\"fas fa-phone mr-3\"></i> + 01 234 567 88</p>\n");
      out.write("                <p>\n");
      out.write("                    <i class=\"fas fa-print mr-3\"></i> + 01 234 567 89</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Grid row -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Footer Links -->\n");
      out.write("\n");
      out.write("    <!-- Copyright -->\n");
      out.write("    <div class=\"footer-copyright text-center text-black-50 py-3\">© 2020 Copyright:\n");
      out.write("        <a class=\"dark-grey-text\" href=\"https://mdbootstrap.com/education/bootstrap/\"> MDBootstrap.com</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Copyright -->\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("<!-- Footer -->");
      out.write("\n");
      out.write("        <div class=\"hiddendiv common\"></div>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/compiled-4.12.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/plugins/mdb-plugins-gathered.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">$('.carousel').carousel({interval: 2000})</script>\n");
      out.write("        <script type=\"text/javascript\">$(function () {\n");
      out.write("                $('.material-tooltip-main').tooltip({\n");
      out.write("                    template: '<div class=\"tooltip md-tooltip\"><div class=\"tooltip-arrow md-arrow\"></div><div class=\"tooltip-inner md-inner\"></div></div>'\n");
      out.write("                });\n");
      out.write("            })\n");
      out.write("        </script>\n");
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
