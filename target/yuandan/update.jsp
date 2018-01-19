<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2017/12/31
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>


<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    request.setAttribute("path", basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>商城管理系统</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="${path}static/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${path}static/bower_components/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${path}static/bower_components/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${path}static/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="${path}static/dist/css/skins/_all-skins.min.css">
    <!-- Morris chart -->
    <link rel="stylesheet" href="${path}static/bower_components/morris.js/morris.css">
    <!-- jvectormap -->
    <link rel="stylesheet" href="${path}static/bower_components/jvectormap/jquery-jvectormap.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="${path}static/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="${path}static/bower_components/bootstrap-daterangepicker/daterangepicker.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="${path}static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">



</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <header class="main-header">
        <a href="index.jsp" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>商城</b>管理</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>商城管理</b>系统</span>
        </a>





        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">总览</span>
            </a>







        </nav>
    </header>
    <aside class="main-sidebar">
        <section class="sidebar">
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="static/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>linkboy</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">主菜单</li>
                <li class="active treeview">
                    <a href="#">
                        <i class="fa fa-dashboard"></i> <span>用户管理</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="index.html"><i class="fa fa-circle-o"></i> 用户管理 v1</a></li>
                        <li><a href="index2.html"><i class="fa fa-circle-o"></i> 用户管理 v2</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-files-o"></i>
                        <span>商品管理</span>
                        <span class="pull-right-container">

            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="pages/layout/top-nav.html"><i class="fa fa-circle-o"></i> 商品1级</a></li>
                        <li><a href="pages/layout/boxed.html"><i class="fa fa-circle-o"></i> 商品2级</a></li>
                        <li><a href="pages/layout/fixed.html"><i class="fa fa-circle-o"></i> 商品3级</a></li>
                        <li><a href="pages/layout/collapsed-sidebar.html"><i class="fa fa-circle-o"></i> 商品4级</a></li>
                    </ul>
                </li>


            </ul>



        </section>

    </aside>
    <div class="content-wrapper">


        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                用户管理
                <small>用户修改</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 后台管理</a></li>
                <li class="active">用户管理</li>
            </ol>
        </section>
        <!-- Main content -->
        <section class="content">
            <!--TODO 修改页面-->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">用户信息修改</h3>
                </div>
                <!-- /.box-header -->
                <!-- form start -->
                <form role="form" action="${pageContext.request.contextPath}/UserServlet?method=update" method="post">
                    <div class="box-body">
                        <input type="hidden" name="id" value="${userById.id}">
                        <div class="form-group">
                            <label>用户名</label>
                            <input type="text" class="form-control" value="${userById.username}" name="username" >
                        </div>
                        <div class="form-group">
                            <label>密码</label>
                            <input type="password" class="form-control" value="${userById.password}" name="password" >
                        </div>
                        <div class="form-group">
                            <label>email</label>
                            <input type="text" class="form-control" value="${userById.email}" name="email">
                        </div>

                    </div>
                    <!-- /.box-body -->
                    <div class="box-footer">
                        <input type="button" class="btn btn-default" value="返回" onclick="backToBefore()">
                        <button type="submit" class="btn btn-info pull-right">提交</button>
                    </div>
                </form>
            </div>
            <!-- /.box -->
            <!-- Main content end-->
        </section>
    </div>
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.0
        </div>
        <strong>Copyright &copy; 2017-2018 <a href="https://adminlte.io">Almsaeed Studio</a>.</strong> All rights
        reserved.
    </footer>


</div>



<!-- jQuery 3 -->
<script src="${path}static/bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="${path}static/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="${path}static/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="${path}static/bower_components/raphael/raphael.min.js"></script>
<script src="${path}static/bower_components/morris.js/morris.min.js"></script>
<!-- Sparkline -->
<script src="${path}static/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="${path}static/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${path}static/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="${path}static/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="${path}static/bower_components/moment/min/moment.min.js"></script>
<script src="${path}static/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="${path}static/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${path}static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="${path}static/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${path}static/bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${path}static/dist/js/adminlte.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${path}static/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${path}static/dist/js/demo.js"></script>
</body>
</html>
