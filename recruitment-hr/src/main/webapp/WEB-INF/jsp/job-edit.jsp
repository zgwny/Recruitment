<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="jobEditForm" class="jobForm" method="post">
	<input type="hidden" name="jobid"/>
	<input type="hidden" name="hrid"/>
	<input type="hidden" name="companyname"/>
	    <table cellpadding="5">
	        <tr>
	            <td>工作名称:</td>
				<td><input class="easyui-textbox" type="text" name="jobname" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>公司名称:</td>
	            <td><input class="easyui-combobox" type="text" id="companyid" name="companyid" data-options="required:true" style="width: 280px;"></input></td>
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
	            <td><input class="easyui-textbox"  name="deadline" data-options="required:true" style="width: 280px;"></input></td>
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
	</div>
</div>
<script type="text/javascript">
	var jobRequirementEditEditor;
	var jobDescriptionEditEditor;
	$(function(){
		//实例化编辑器
		jobDescriptionEditEditor = TAOTAO.createEditor("#jobEditForm [name=description]");
		jobRequirementEditEditor = TAOTAO.createEditor("#jobEditForm [name=requirement]");
	});
	
	function submitForm(){
		if(!$('#jobEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		jobRequirementEditEditor.sync();
		jobDescriptionEditEditor.sync();
		$.post("/job/update",$("#jobEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改职位成功!','info',function(){
					$("#jobEditWindow").window('close');
					$("#jobList").datagrid("reload");
				});
			}
		});
	}
</script>
