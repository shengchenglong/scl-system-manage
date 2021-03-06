<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
	<title></title>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
	<c:if test="${not empty msg}">
		<div class="message">${msg}</div>
	</c:if>
	<div class="table-responsive">
		<table id="table" class="table table-hover mb30">
			<thead>
				<tr>
					<th>名称</th>
					<th>类型</th>
					<th>URL路径</th>
					<th>权限字符串</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${resourceList}" var="resource">
					<!-- 如果不是子节点，就是父节点， -->
					<tr data-tt-id='${resource.code}' <c:if test="${not resource.rootNode}">data-tt-parent-id='${resource.parentCode}'</c:if>>
						<td>${resource.name}</td>
						<td>${resource.type}</td>
						<td>${resource.url}</td>
						<td>${resource.permission}</td>
						<td>
							<shiro:hasPermission name="resource:create">
								<!-- 如果不是按钮就是菜单 可以添加子节点 -->
								<c:if test="${resource.type ne 'button'}">
									<a href="${ctx}/resource/edit?parentId=${resource.id}"><button>添加子节点</button></a>
								</c:if>
							</shiro:hasPermission>
							
							<shiro:hasPermission name="resource:update">
								<a href="${ctx}/resource/edit?id=${resource.id}"><button>修改</button></a>
							</shiro:hasPermission>
							
							<c:if test="${not resource.rootNode}">
								<shiro:hasPermission name="resource:delete">
									<a class="deleteBtn" href="javascript:void(0)" data-id="${resource.code}" resourceId="${resource.id }">
										<button id="deleteBtn">删除</button>
									</a>
								</shiro:hasPermission>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<script type="text/javascript">
$(function() {
	$("#table").treetable({ expandable: true }).treetable("expandNode", 1);
});
</script>
</body>
</html>