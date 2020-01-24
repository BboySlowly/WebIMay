<header>

    <%@include file="MyStyle.jsp" %>

    <!--Navbar -->
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <nav class="mb-1 navbar navbar-expand-lg navbar-dark black">
        <a class="navbar-brand" href="#">เวบ ไอ้ เมย์ พี่บอยทำ</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-333"
                aria-controls="navbarSupportedContent-333" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-333" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">Product
                    </a>
                    <div class="dropdown-menu dropdown-default" aria-labelledby="navbarDropdownMenuLink-333">
                        <a class="dropdown-item" href="#">Camera</a>
                        <a class="dropdown-item" href="#">Tablet</a>
                        <a class="dropdown-item" href="#">Mobile</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">New</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Subport</a>
                </li>
            </ul>
            <ul class="navbar-nav ml-auto nav-flex-icons">
                <li class="nav-item">
                    <p class="nav-link waves-effect waves-light">0
                    </p>
                </li>
                <li class="nav-item">
                    <a class="nav-link waves-effect waves-light">
                        <i class="fas fa-shopping-cart"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link waves-effect waves-light">
                        <i class="fab fa-twitter"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link waves-effect waves-light">
                        <i class="fab fa-google-plus-g"></i>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-333" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-user"></i>
                    </a>
                    <%
                        if (session.getAttribute("username") == null || session.getAttribute("username") == "") {
                            out.print("<div class=\"dropdown-menu dropdown-menu-right dropdown-default\"");
                            out.print("aria-labelledby=\"navbarDropdownMenuLink-333\">");
                            out.print("<a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#modalLRForm\">Login</a>");
                            out.print("<a class=\"dropdown-item\" href=\"#\">Setting</a>");
                            out.print("</div>");
                        } else {
                            out.print("<div class=\"dropdown-menu dropdown-menu-right dropdown-default\"");
                            out.print("aria-labelledby=\"navbarDropdownMenuLink-333\">");
                            out.print("<a class=\"dropdown-item\" href=\"#\">" + session.getAttribute("username") + "</a>");
                            out.print("<a href=\"Logout\">Logout</a>");
                            out.print("<a class=\"dropdown-item\" href=\"#\">Setting</a>");
                            out.print("</div>");
                        }
                    %>
                </li>
            </ul>
        </div>
    </nav>
    <!--/.Navbar -->

    <%@include file="Slidebar.jsp" %>

</header>
<%@include file="Login.jsp" %>