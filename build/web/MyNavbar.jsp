<header>
    
    <%@include file="Login.jsp" %>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!--Navbar -->
    <nav class="mb-0 navbar navbar-expand-lg navbar-dark black">
        <a class="navbar-brand" href="#">เวบ ไอ้ เมย์ พี่บอยทำ</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-555"
                aria-controls="navbarSupportedContent-555" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent-555">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">New</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Support</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-555" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">Product
                    </a>
                    <div class="dropdown-menu dropdown-secondary" aria-labelledby="navbarDropdownMenuLink-555">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
            </ul>

            <ul class="navbar-nav ml-auto nav-flex-icons">
                <li class="nav-item">
                    <a href="#!" class="nav-link waves-effect">
                        <span class="badge red z-depth-1 mr-1"> 2 </span>
                        <i id="navbar-static-cart" alt="Cart" class="fas fa-shopping-cart"></i>
                        <span class="sr-only"> Cart </span>
                    </a>
                </li>

                <ul class="navbar-nav ml-auto nav-flex-icons">
                    <li class="nav-item">
                        <a class="nav-link waves-effect waves-light">1
                            <i class="fas fa-envelope"></i>
                        </a>
                    </li>
                    <li class="nav-item avatar dropdown">

                        <%
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
                        %>

                    </li>
                </ul>
        </div>
    </nav>
    <!--/.Navbar -->
</header>