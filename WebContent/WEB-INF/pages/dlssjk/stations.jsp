<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dlssjk/all.css"/>
<script type="text/javascript">
	$(function(){
		$("#addStation").click(function(event){
			$("#addStationDialog").dialog({
				title:'添加菜单',
				modal:true,
				width:350,
				buttonAlign:'right',
				show:'flod',
				hide: "explode",
				buttons:[{
					text:"添加",
					click:function(event){
						$("form[name='stationForm']").submit();
					}
				}]
			});
		});
		
		$(".station").click(function(){
			$("#main",window.parent.document.body).attr("src","${pageContext.request.contextPath}/stations/"+$(this).attr("data-id"));
		});
	});
	
</script>
<title>工作站</title>
</head>
<body>
	<div class="headbar ui-accordion-header ui-state-active ">
		<span class="bartitle">工作站列表</span>
		<div class="btns">
			<span><a href="javascript:void(0)" id="addStation">添加站点</a></span>
		</div>
	</div>
	<c:forEach items="${stations}" var="station">
	<div class="station" data-id="${station.id}">
		<img alt="logo" src="${pageContext.request.contextPath}${station.logo}">
		<div class="stationDetail">
			<div class="title">${station.name}</div>
			<div class="content">IP:${station.ip}</div>
			<div class="content">负责人:${station.contact}</div>
			<div class="content">联系电话:${station.telephone}</div>
		</div>
	</div>
	</c:forEach>
	
	<div class="hide" id="addStationDialog">
		<form name="stationForm" action="${pageContext.request.contextPath}/stations/addStation" class="dialogForm" method="post" enctype="multipart/form-data">
			<div><label>站点名称:</label><input type="text" name="station.name"/></div>
			<div><label>IP</label><input type="text" name="station.ip"/></div>
			<div><label>端口</label><input type="text" name="station.port"/></div>
			<div><label>gps</label><input type="text" name="station.gps"/></div>
			<div><label>地址</label><input type="text" name="station.address"/></div>
			<div><label>负责人</label><input type="text" name="station.contact"/></div>
			<div><label>联系电话</label><input type="text" name="station.telephone"/></div>
			<div><label>logo</label><input type="file" name="station.logo"/></div>
			<div><label>站点描述</label><textarea name="station.description" cols="10" rows="10"></textarea></div>
		</form>
	</div>
</body>
</html>