<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IT人才求职招聘网站后台管理系统</title>
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="css/taotao.css" />
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<style type="text/css">
	.content {
		padding: 10px 10px 10px 10px;
	}
</style>
</head>
<body class="easyui-layout">
    <div data-options="region:'west',title:'菜单',split:true" style="width:180px;">
    	<ul id="menu" class="easyui-tree" style="margin-top: 10px;margin-left: 5px;">
         	<li>
         		<span>企业管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'company-list'}">查询企业</li>
	         		<li data-options="attributes:{'url':'company-add'}">新增企业</li>
	         	</ul>
         	</li>
         	<li>
         		<span>HR管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'HR-list'}">查询HR</li>
	         		<li data-options="attributes:{'url':'HR-add'}">新增HR</li>
	         	</ul>
         	</li>
         	<li>
         		<span>工作管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'job-list'}">查询工作</li>
	         		<li data-options="attributes:{'url':'job-add'}">新增工作</li>
	         	</ul>
         	</li>
         	<li>
         		<span>求职者管理</span>
         		<ul>
	         		<li data-options="attributes:{'url':'candidate-list'}">查询求职者</li>
	         		<li data-options="attributes:{'url':'candidate-add'}">新增求职者</li>
	         	</ul>
         	</li>
         </ul>
    </div>
    <div data-options="region:'center',title:''">
    	<div id="tabs" class="easyui-tabs">
		    <div title="首页" style="padding:20px;">
		        	
		    </div>
		</div>
    </div>
    
<script type="text/javascript">
$(function(){
	$('#menu').tree({
		onClick: function(node){
			if($('#menu').tree("isLeaf",node.target)){
				var tabs = $("#tabs");
				var tab = tabs.tabs("getTab",node.text);
				if(tab){
					tabs.tabs("select",node.text);
				}else{
					tabs.tabs('add',{
					    title:node.text,
					    href: node.attributes.url,
					    closable:true,
					    bodyCls:"content"
					});
				}
			}
		}
	});
});
</script>
</body>
</html>