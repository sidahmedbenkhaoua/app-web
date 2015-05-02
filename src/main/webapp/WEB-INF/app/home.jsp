<%@ include file="include.jsp" %>
<%
    pageContext.setAttribute("account", org.apache.shiro.SecurityUtils.getSubject().getPrincipals().oneByType(java.util.Map.class));
%>
<!DOCTYPE html>
<html>
<!--<![endif]-->
<head>
    <title>Dashboard - PatternFly</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="../dist/img/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href=".../../resource/dist/img/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href=".../../resource/dist/img/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href=".../../resource/dist/img/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href=".../../resource/dist/img/apple-touch-icon-57-precomposed.png">
    <link href=".../../resource/dist/css/patternfly.min.css" rel="stylesheet" media="screen, print">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src=".../../resource/components/html5shiv/dist/html5shiv.min.js"></script>
    <script src=".../../resource/components/respond/dest/respond.min.js"></script>
    <![endif]-->
    <!-- IE8 requires jQuery and Bootstrap JS to load in head to prevent rendering bugs -->
    <!-- IE8 requires jQuery v1.x -->
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src=".../../resource/components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src=".../../resource/dist/js/patternfly.min.js"></script>

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
            <img src=".../../dist/img/brand.svg" alt="PatternFly Enterprise Application" />
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
            <li>
                <a href="bootstrap-treeview-2.html">Tree View</a>
            </li>
            <li class="active">
                <a href="dashboard.html" class="active">Dashboard</a>
            </li>
            <li>
                <a href="form.html">Form</a>
            </li>
            <li>
                <a href="tab.html">Tab</a>
            </li>
            <li>
                <a href="typography-2.html">Typography</a>
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
                <h1>Dashboard</h1>
            </div>
            <h2 class="h4">Infrastructure Performance</h2>
            <img src="img/dashboard-1.png" alt="Placeholder graph" class="img-responsive" />
            <hr>
            <h2 class="h4">Resource Usage</h2>
            <div class="row">
                <div class="col-sm-6">
                    <img src="img/dashboard-2.png" alt="Placeholder graph" class="img-responsive" />
                </div>
                <div class="col-sm-6">
                    <img src="img/dashboard-3.png" alt="Placeholder graph" class="img-responsive" />
                </div>
            </div>
            <hr>
            <h2 class="h4">Infrastructure Capacity</h2>
            <div class="row">
                <div class="col-sm-6">
                    <img src="img/dashboard-4.png" alt="Placeholder graph" class="img-responsive" />
                </div>
                <div class="col-sm-6">
                    <table class="table">
                        <tr>
                            <th>Status</th>
                            <th>Location Data</th>
                            <th>Hosts</th>
                        </tr>
                        <tr>
                            <td><span class="label label-success">New</span></td>
                            <td><strong>Fusce leo massa</strong><br>Created March 05, 2014 08:34:36 AM</td>
                            <td><span class="label label-default">11</span></td>
                        </tr>
                        <tr>
                            <td><span class="label label-success">New</span></td>
                            <td><strong>Iaculis at dapibus eget</strong><br>Created March 03, 2014 20:32:12 AM</td>
                            <td><span class="label label-default">9</span></td>
                        </tr>
                        <tr>
                            <td><span class="label label-default">Disabled</span></td>
                            <td><strong>Dapibus nec metus</strong><br>Created March 03, 2014 19:11:56 AM</td>
                            <td><span class="label label-default">25</span></td>
                        </tr>
                    </table>
                    <p><a href="#">See more &raquo;</a></p>
                </div>
            </div>
        </div><!-- /col -->
        <div class="col-sm-4 col-md-3 sidebar-pf sidebar-pf-right">
            <div class="sidebar-header sidebar-header-bleed-left sidebar-header-bleed-right">
                <div class="actions pull-right">
                    <a href="#">Clear Messages</a>
                </div>
                <h2 class="h5">Latest Notifications</h2>
            </div>
            <ul class="list-group">
                <li class="list-group-item active">
                    <h3 class="list-group-item-heading">Duis eu augue lectus</h3>
                    <p class="list-group-item-text">Donec id elit non mi porta gravida at eget metus.</p>
                </li>
                <li class="list-group-item">
                    <h3 class="list-group-item-heading">Donec dictum odio eu turpis rutrum</h3>
                    <p class="list-group-item-text">Etiam sit amet ultricies ligula.</p>
                </li>
                <li class="list-group-item">
                    <h3 class="list-group-item-heading">At egestas nibh dictum</h3>
                    <p class="list-group-item-text">Maecenas vitae tempus mauris.</p>
                </li>
                <li class="list-group-item active">
                    <h3 class="list-group-item-heading">Phasellus dictum posuere ante sit</h3>
                    <p class="list-group-item-text">Pellentesque rutrum justo in congue tristique.</p>
                </li>
                <li class="list-group-item">
                    <h3 class="list-group-item-heading">Amet commodo</h3>
                    <p class="list-group-item-text">Pellentesque in leo elit.</p>
                </li>
                <li class="list-group-item">
                    <h3 class="list-group-item-heading">Nunc viverra purus libero</h3>
                    <p class="list-group-item-text">Nulla lacinia lorem quis enim posuere dictum.</p>
                </li>
                <li class="list-group-item active">
                    <h3 class="list-group-item-heading">Non faucibus augue dapibus at</h3>
                    <p class="list-group-item-text">Fusce id rutrum ante, eget vestibulum dolor</p>
                </li>
                <li class="list-group-item">
                    <h3 class="list-group-item-heading">Vivamus at semper</h3>
                    <p class="list-group-item-text">Duis sagittis vitae neque at vehicula.</p>
                </li>
                <li class="list-group-item">
                    <h3 class="list-group-item-heading">Sed sit amet dolor</h3>
                    <p class="list-group-item-text">Donec id elit non mi porta gravida at eget metus.</p>
                </li>
            </ul>
            <p><a href="#">See all messages</a></p>


        </div><!-- /col -->
    </div><!-- /row -->
</div><!-- /container -->
</body>
</html>