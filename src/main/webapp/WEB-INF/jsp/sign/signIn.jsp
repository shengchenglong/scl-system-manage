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
<link rel="shortcut icon" href="${ctx }/static/bracket/images/favicon.png" type="image/png">
<link href="${ctx }/static/bracket/css/style.default.css" rel="stylesheet"/>
<title>用户登录</title>
</head>
<body class="signin">

<section>
    <div class="signinpanel">
        <div class="row">
            <div class="col-md-7">
                <div class="signin-info">
                    <div class="logopanel">
                        <h1><span>[</span> bracket <span>]</span></h1>
                    </div><!-- logopanel -->
                
                    <div class="mb20"></div>
                
                    <h5><strong>Welcome to Bracket Bootstrap 3 Template!</strong></h5>
                    <ul>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> Fully Responsive Layout</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> HTML5/CSS3 Valid</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> Retina Ready</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> WYSIWYG CKEditor</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> and much more...</li>
                    </ul>
                    <div class="mb20"></div>
                    <strong>Not a member? <a href="signup.html">Sign Up</a></strong>
                </div><!-- signin0-info -->
            
            </div><!-- col-sm-7 -->
            
            <div class="col-md-5">
                
                <form id="editForm" method="post" action="${ctx }/manage/login">
                    <h4 class="nomargin">Sign In</h4>
                   	<c:choose>
                   		<c:when test="${error ne null }"><p class="mt5 mb20" style="color: red">${error }</p></c:when>
                   		<c:otherwise><p class="mt5 mb20">Login to access your account.</p></c:otherwise>
                   	</c:choose>
                
                    <input name="username" type="text" class="form-control uname" placeholder="Username" />
                    <input name="password" type="password" class="form-control pword" placeholder="Password" />
                    <a href=""><small>Forgot Your Password?</small></a>
                    <button id="signBtn" class="btn btn-success btn-block">Sign In</button>
                </form>
            </div><!-- col-sm-5 -->
            
        </div><!-- row -->
        
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2014. All Rights Reserved. Bracket Bootstrap 3 Admin Template
            </div>
            <div class="pull-right">
                Created By: <a href="http://themepixels.com/" target="_blank">ThemePixels</a>
            </div>
        </div>
        
    </div><!-- signin -->
  
</section>


<script src="${ctx }/static/bracket/js/jquery-1.11.1.min.js"></script>
<script src="${ctx }/static/bracket/js/jquery-migrate-1.2.1.min.js"></script>
<script src="${ctx }/static/bracket/js/bootstrap.min.js"></script>
<script src="${ctx }/static/bracket/js/modernizr.min.js"></script>
<script src="${ctx }/static/bracket/js/jquery.sparkline.min.js"></script>
<script src="${ctx }/static/bracket/js/jquery.cookies.js"></script>

<script src="${ctx }/static/bracket/js/toggles.min.js"></script>
<script src="${ctx }/static/bracket/js/retina.min.js"></script>

<script src="${ctx }/static/bracket/js/custom.js"></script>
<script>
$(function() {
	$("#signBtn").click(function() {
		$("#editForm").submit();
	});
});
</script>

</body>
</html>