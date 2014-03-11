<%-- 
    Document   : index
    Created on : 08-Mar-2014, 14:13:27
    Author     : boby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" ng-app="myApp">
<head>
  <meta charset="utf-8">
  <title>HomeBOX</title>
  <link rel="stylesheet" href="css/app.css"/>
  <link rel="stylesheet" href="css/menu.css"/>
  <!-- Including the Lobster font from Google's Font Directory -->
  <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Lobster" />
   <!-- In production use:
  <script src="//ajax.googleapis.com/ajax/libs/angularjs/x.x.x/angular.min.js"></script>
  -->
  <!-- Enabling HTML5 support for Internet Explorer -->
  <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
  <script src="lib/angular/angular.js"></script>
  <script src="lib/angular/angular-route.js"></script>
  <script src="lib/angular/angular-resource.js"></script>
  <script src="js/app.js"></script>
  <script src="js/services.js"></script>
  <script src="js/controllers.js"></script>
  <script src="js/filters.js"></script>
  <script src="js/directives.js"></script>
</head>
<body>
     <nav>
        <ul class="fancyNav">
            <li id="home"><a href="#view1" class="homeIcon">Home</a></li>
            <li id="news"><a href="#view2">News</a></li>
            <li id="about"><a href="#about">About us</a></li>
            <li id="services"><a href="#services">Services</a></li>
            <li id="contact"><a href="#contact">Contact us</a></li>
        </ul>
    </nav>
    <div ng-view class="context"></div>  

  <div>Angular seed app: v<span app-version></span></div>

</body>
</html>
