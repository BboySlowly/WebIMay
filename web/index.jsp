<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>เวบ ไอ้ เมย์ พี่บอยทำ</title>
        <!-- MDB icon -->
        <link rel="icon" href="" type="image/x-icon">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
        <!-- Google Fonts Roboto -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/compiled-4.12.0.min.css">
        <link rel="stylesheet" type="text/css" href="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/mdb-plugins-gathered.min.css">
    </head>
    <body>
        <%@include file="MyNavbar.jsp" %>
        <%@include file="Slidebar.jsp" %>
        <!-- Start your project here-->
        <%@include file="ShowCase1_1.jsp" %>

        <%@include file="ShowCase1_2.jsp" %>
        <!-- End your project here-->

        <%@include file="Footer.jsp" %>
        <div class="hiddendiv common"></div>
        <script type="text/javascript" src="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/compiled-4.12.0.min.js"></script>
        <script type="text/javascript" src="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/js/plugins/mdb-plugins-gathered.min.js"></script>
        <script type="text/javascript">$('.carousel').carousel({interval: 2000})</script>
        <script type="text/javascript">$(function () {
                $('.material-tooltip-main').tooltip({
                    template: '<div class="tooltip md-tooltip"><div class="tooltip-arrow md-arrow"></div><div class="tooltip-inner md-inner"></div></div>'
                });
            })
        </script>
    </body>
</html>
