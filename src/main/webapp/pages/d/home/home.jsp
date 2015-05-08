<%@ include file="include.jsp" %>
<%
    pageContext.setAttribute("account", org.apache.shiro.SecurityUtils.getSubject().getPrincipals().oneByType(java.util.Map.class));
%>
<!DOCTYPE html>
<html ng-app="roadtrafficapps">
<!--<![endif]-->
<head>
    <title>Dashboard - PatternFly</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="../dist/img/favicon.ico">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <link rel="shortcut icon" href="../../../resource">
    <link rel="apple-touch-icon-precomposed" sizes="144x144"
          href="/app-web/resource/dist/img/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114"
          href="/app-web/resource/dist/img/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72"
          href="/app-web/resource/dist/img/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/app-web/resource/dist/img/apple-touch-icon-57-precomposed.png">
    <link href="/app-web/resource/dist/css/patternfly.min.css" rel="stylesheet" media="screen, print">
    <link rel="stylesheet" href="/app-web/resource/api/font-awesome-4.3.0/css/font-awesome.min.css">




    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="../../../resource/components/html5shiv/dist/html5shiv.min.js"></script>
    <script src="../../../resource/components/respond/dest/respond.min.js"></script>
    <![endif]-->
    <!-- IE8 requires jQuery and Bootstrap JS to load in head to prevent rendering bugs -->
    <!-- IE8 requires jQuery v1.x -->

    <script src="/app-web/resource/components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="/app-web/resource/dist/js/patternfly.min.js"></script>



<script>

</script>

</head>

<body>


<nav class="navbar navbar-default navbar-pf" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">
            <img src="/app-web/dist/img/brand.svg" alt="PatternFly Enterprise Application"/>
        </a>
    </div>
    <div class="collapse navbar-collapse navbar-collapse-1">
        <ul class="nav navbar-nav navbar-utility">
            <li>
                <a href="#">Status</a>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <span class="pficon pficon-user"></span>
                    ${username}<b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#">Link</a>
                    </li>
                    <li>
                        <a href="#">Another link</a>
                    </li>
                    <li>
                        <a href="#">Something else here</a>
                    </li>
                    <li class="divider"></li>
                    <li class="dropdown-submenu">
                        <a tabindex="-1" href="#">More options</a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="#">Link</a>
                            </li>
                            <li>
                                <a href="#">Another link</a>
                            </li>
                            <li>
                                <a href="#">Something else here</a>
                            </li>
                            <li class="divider"></li>
                            <li class="dropdown-header">Nav header</li>
                            <li>
                                <a href="#">Separated link</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                ...
                            </li>
                        </ul>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="${pageContext.request.contextPath}/logout">Logout</a>
                    </li>
                </ul>
            </li>
        </ul>
        <ul class="nav navbar-nav navbar-primary">
            <li>
                <a href="basic.html">Basic</a>
            </li>

            <li class="active">
                <a href="#/dashbord" class="active"> <i class="fa fa-tachometer"></i> Tableau Bord</a>
            </li>
            <li>
                <a href="#/sumult"> <i
                    class="fa fa-car"></i>  Simulateur</a>
            </li>

            <li>
                <a href="bootstrap-treeview-2.html"> <i class="fa fa-line-chart"></i> Statistique</a>
            </li>

            <li>
                <a href="tab.html"><i class="fa fa-wrench"></i> Parametre</a>
            </li>

        </ul>
    </div>
</nav>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-8 col-md-9">
            <div class="page-header page-header-bleed-right">
                <div class="actions pull-right">
                    <a href="#"><span class="pficon pficon-refresh"></span> Refresh Results</a>
                </div>

                <ng-view></ng-view>
            </div>
        </div>
        <!-- /col -->
        <!-- /row -->
    </div>
</div>
<!-- /container -->
<!--file required angularjs-->
<script type="text/javascript" src="/app-web/resource/api/angularjs-1.3.15/angular.min.js"></script>
<script type="text/javascript" src="/app-web/resource/api/angularjs-1.3.15/angular-route.min.js"></script>
<!--dashbord controller-->
<script
        src="/app-web/pages/d/dashBord/js/dashBordCntrl.js"></script>

<%--Map controller--%>
<script
        src="/app-web/pages/d/map/js/mapCntrl.js"></script>

<script type="text/javascript" src="/app-web/app/config/appConfig.js"></script>
<!--All app cinfig-->
</body>
</html>