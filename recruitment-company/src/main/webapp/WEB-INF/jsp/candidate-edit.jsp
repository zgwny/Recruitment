<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="candidateEditForm" class="candidateForm" method="post">
	<input type="hidden" name="candidateid"/>
	     <table cellpadding="5">
	        <tr>
	            <td>姓名:</td>
				<td><input class="easyui-textbox" type="text" name="name" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>性别:</td>
	          <td id="sex"></td>
	        </tr>
	        <tr>
	            <td>年龄:</td>
	            <td><input class="easyui-textbox" id="man" type="text" name="age" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>手机号:</td>
	 			<td><input class="easyui-textbox" type="text" name="phone" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	</div>
</div>
<script type="text/javascript">



	function submitForm(){
		if(!$('#candidateEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
	
		$.post("/candidate/update",$("#candidateEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改求职者成功!','info',function(){
					$("#candidateEditWindow").window('close');
					$("#candidateList").datagrid("reload");
				});
			}
		});
	}
</script>
