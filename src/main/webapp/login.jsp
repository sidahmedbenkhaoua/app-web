<!DOCTYPE html>
<!--[if IE 8]><html class="ie8 login-pf"><![endif]-->
<!--[if IE 9]><html class="ie9 login-pf"><![endif]-->
<!--[if gt IE 9]><!-->
<html class="login-pf">
<!--<![endif]-->
<head>
    <title>Login - PatternFly</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="resource/dist/img/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="resource/dist/img/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="resource/dist/img/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="resource/dist/img/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="resource/dist/img/apple-touch-icon-57-precomposed.png">
    <link href="resource/dist/css/patternfly.min.css" rel="stylesheet" media="screen, print">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="resource/components/html5shiv/dist/html5shiv.min.js"></script>
    <script src="resource/components/respond/dest/respond.min.js"></script>
    <![endif]-->
    <!-- IE8 requires jQuery and Bootstrap JS to load in head to prevent rendering bugs -->
    <!-- IE8 requires jQuery v1.x -->
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="resource/components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="resource/dist/js/patternfly.js"></script>
    <style type="text/css">
        body{
            background-image: url('resource/dist/img/bg/bg3.jpg') !important;

            background-repeat: no-repeat !important;
        }
    </style>
</head>
<body>
<span id="badge">

    </span>
<div class="container">
    <div class="row">
        <div class="col-sm-12">

                <h1>Road Tarffic Analyse</h1>

        </div><!--/.col-*-->
        <div class="col-sm-7 col-md-6 col-lg-5 login">
            <form class="form-horizontal"  action="login"  name="login" method="post">
                <div class="form-group">
                    <label for="inputUsername" class="col-sm-2 col-md-2 control-label">Username</label>
                    <div class="col-sm-10 col-md-10">
                        <input type="text" class="form-control" id="inputUsername" name="inputUsername" >
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 col-md-2 control-label">Password</label>
                    <div class="col-sm-10 col-md-10">
                        <input type="password" class="form-control" id="inputPassword" name="inputPassword" >
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-xs-8 col-sm-offset-2 col-sm-6 col-md-offset-2 col-md-6">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" tabindex="3"> Remember username
                            </label>
                        </div>
                        <span class="help-block"> Forgot <a href="#" tabindex="5">username</a> or <a href="#" tabindex="6">password</a>?</span>
                    </div>
                    <div class="col-xs-4 col-sm-4 col-md-4 submit">
                        <button type="submit" class="btn btn-primary btn-lg" tabindex="4">Log In</button>
                    </div>
                </div>
            </form>
        </div><!--/.col-*-->
        <div class="col-sm-5 col-md-6 col-lg-7 details">
            <p><strong>Welcome to PatternFly!</strong>
                This is placeholder text, only. Use this area to place any information or introductory message about your application that may be relevant for users. For example, you might include news or information about the latest release of your product here&mdash;such as a version number.</p>
        </div><!--/.col-*-->
    </div><!--/.row-->
</div><!--/.container-->
</body>
</html>