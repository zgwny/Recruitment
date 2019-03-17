<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="jobAddForm" class="jobForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>工作名称:</td>
				<td><input class="easyui-textbox" type="text" name="jobname" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>部门:</td>
	 			<td><input class="easyui-textbox" type="text" name="department" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>工作地点:</td>
	 			<td><input class="easyui-textbox" type="text" name="address" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>薪酬:</td>
	            <td><input class="easyui-combobox"  name="salary" id="salary" data-options="required:true" style="width: 280px;"></input></input></td>
	        </tr>
	        <tr>
	            <td>学历要求:</td>
	 			<td><input class="easyui-combobox"  name="education" id="education" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>工作经验要求:</td>
	            <td><input class="easyui-combobox"  name="experience" id="experience" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>截止日期:</td>
	            <td><input class="easyui-textbox"  name="deadline"  data-options="required:true" style="width: 280px;"></input></td>
	        </tr>	     
	        <tr>
	            <td>职位描述:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="description"></textarea>
	            </td>
	        </tr>
	         <tr>
	            <td>技能要求:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="requirement"></textarea>
	            </td>
	        </tr>
	         
	        <tr class="params hide">
	        	<td></td>
	        	<td>
	        		
	        	</td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">


	var jobAddEditor ;
	var jobAddEditor1 ;
	var groupvalue;
	//页面初始化完毕后执行此方法
	$(function(){
		
		$("#jobAddForm").find('input').each(function(){
			if($(this).attr('id')== "salary"){
				
				groupvalue = "salary";
				getDictionary(groupvalue);
				
			}
			if($(this).attr('id')== "education"){
				
				groupvalue = "education";
				getDictionary(groupvalue);
				
			} 
			if($(this).attr('id')== "experience"){
				
				groupvalue = "experience";
				getDictionary(groupvalue);
				
			}
		});
		
		
		function getDictionary(groupvalue){
			$.ajax({
	            type:"get",
	            url:"/dictionary/get?groupvalue=" + groupvalue,
	             dataType:"json",
	             success:function(json){
	           	json[0].newParam = 'selected';
	           	json[0].selected=true;
	             
	             $("#"+groupvalue).combobox({//往下拉框塞值
	                     data:json,
	                     
	                     valueField:"itemkey",//value值
	                     textField:"itemvalue",//文本值
	                     panelHeight:"auto"
	             })
	             }
	     	});
		}
		
		//创建富文本编辑器
		jobAddEditor = TAOTAO.createEditor("#jobAddForm [name=description]");
		jobAddEditor1 = TAOTAO.createEditor("#jobAddForm [name=requirement]");
	});
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#jobAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}		
		jobAddEditor.sync();
		jobAddEditor1.sync();
		$.post("/job/save",$("#jobAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增工作成功!');
			}
		});
	}
	
	function clearForm(){
		$('#jobAddForm').form('reset');
		jobAddEditor.html('');
	}
</script>
