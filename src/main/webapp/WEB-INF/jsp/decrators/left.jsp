<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="${ctx }/static/bracket/cimages/favicon.png" type="image/png">
<link href="${ctx }/static/bracket/css/style.default.css" rel="stylesheet">
<title>后台管理:<sitemesh:write property='title' /></title>
</head>
<body>

<!-- Preloader -->
<div id="preloader">
    <div id="status"><i class="fa fa-spinner fa-spin"></i></div>
</div>

<section>

<!-- 左边菜单 开始 -->
  <div class="leftpanel">

    <div class="logopanel">
        <h1><span>[</span> bracket <span>]</span></h1>
    </div><!-- logopanel -->

    <div class="leftpanelinner">

      <h5 class="sidebartitle">Navigation</h5>
      <ul class="nav nav-pills nav-stacked nav-bracket">
		      
        <li class="nav-parent active"><a href=""><i class="fa fa-home"></i> <span>权限管理</span></a>
          <ul class="children">
          	<li><a href="${ctx }/manage/user/index"><i class="fa fa-caret-right"></i> 用户管理</a></li>
            <li><a href="${ctx }/manage/role/index"><i class="fa fa-caret-right"></i> 角色管理</a></li>
            <li><a href="${ctx }/manage/resource/index"><i class="fa fa-caret-right"></i> 资源管理</a></li>
            <li><a href="${ctx }/manage/organization/index"><i class="fa fa-caret-right"></i> 组织管理</a></li>
          </ul>
        </li>
      </ul>
		
		<!-- infosummary 开始 -->
      <div class="infosummary">
        <h5 class="sidebartitle">Information Summary</h5>
        <ul>
            <li>
                <div class="datainfo">
                    <span class="text-muted">Daily Traffic</span>
                    <h4>630, 201</h4>
                </div>
                <div id="sidebar-chart" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">Average Users</span>
                    <h4>1, 332, 801</h4>
                </div>
                <div id="sidebar-chart2" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">Disk Usage</span>
                    <h4>82.2%</h4>
                </div>
                <div id="sidebar-chart3" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">CPU Usage</span>
                    <h4>140.05 - 32</h4>
                </div>
                <div id="sidebar-chart4" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">Memory Usage</span>
                    <h4>32.2%</h4>
                </div>
                <div id="sidebar-chart5" class="chart"></div>
            </li>
        </ul>
      </div><!-- infosummary 结束 -->

    </div><!-- leftpanelinner -->
  </div><!-- leftpanel -->
<!-- 左边菜单 结束 -->
	<sitemesh:write property='body' />
</section>

<script src="${ctx }/static/bracket/js/jquery-1.11.1.min.js"></script>
<script src="${ctx }/static/bracket/js/jquery-migrate-1.2.1.min.js"></script>
<script src="${ctx }/static/bracket/js/jquery-ui-1.10.3.min.js"></script>
<script src="${ctx }/static/bracket/js/bootstrap.min.js"></script>
<script src="${ctx }/static/bracket/js/modernizr.min.js"></script>
<script src="${ctx }/static/bracket/js/jquery.sparkline.min.js"></script>
<script src="${ctx }/static/bracket/js/toggles.min.js"></script>
<script src="${ctx }/static/bracket/js/retina.min.js"></script>
<script src="${ctx }/static/bracket/js/jquery.cookies.js"></script>

<script src="${ctx }/static/bracket/js/flot/jquery.flot.min.js"></script>
<script src="${ctx }/static/bracket/js/flot/jquery.flot.resize.min.js"></script>
<script src="${ctx }/static/bracket/js/flot/jquery.flot.spline.min.js"></script>
<script src="${ctx }/static/bracket/js/morris.min.js"></script>
<script src="${ctx }/static/bracket/js/raphael-2.1.0.min.js"></script>

<script src="${ctx }/static/bracket/js/custom.js"></script>
<script src="${ctx }/static/bracket/js/dashboard.js"></script>
</body>
</html>