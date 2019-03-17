<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="HRAddForm" class="HRForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>HR名称:</td>
				<td><input class="easyui-textbox" type="text" name="hrname" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>企业:</td>
	            <td><input class="easyui-combobox" type="text" id="companyid" name="companyid" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>入职时间:</td>
	            <td><input class="easyui-textbox" type="text" name="time" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>部门:</td>
	 			<td><input class="easyui-textbox" type="text" name="deparment" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>职位:</td>
	            <td><input class="easyui-textbox" type="text" name="position" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	         <tr>
	            <td>手机号:</td>
	            <td><input class="easyui-textbox" type="text" name="phone" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>状态:</td>
	            <td><input class="easyui-combobox" type="text" id="status" name="status" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	          <tr>
	            <td>登录名:</td>
	            <td><input class="easyui-textbox" type="text" name="username" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	         <tr>
	            <td>密码:</td>
	            <td><input class="easyui-textbox" type="text" name="password" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	         <tr>
	            <td>邮箱:</td>
	            <td><input class="easyui-textbox" type="text" name="mail" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	    </table>
	    <input type="hidden" name="HRParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">


	//页面初始化完毕后执行此方法
	$(function(){
		
		$("#HRAddForm").find('input').each(function(){
			
			if($(this).attr('id')== "companyid"){
				
				
					$.ajax({
			            type:"get",
			            url:"/company/allList",
			             dataType:"json",
			             success:function(json){
			           	json[0].newParam = 'selected';
			           	json[0].selected=true;
			             $("#companyid").combobox({//往下拉框塞值
			                     data:json,			                     
			                     valueField:"companyid",//value值
			                     textField:"name",//文本值
			                     panelHeight:"auto"
			             })
			             }
			     	});

			}
			if($(this).attr('id')== "status"){
				
				
				$.ajax({
		            type:"get",
		            url:"/dictionary/get?groupvalue=status",
		             dataType:"json",
		             success:function(json){
		           	json[0].newParam = 'selected';
		           	json[0].selected=true;
		             $("#status").combobox({//往下拉框塞值
		                     data:json,
		                     
		                     valueField:"itemkey",//value值
		                     textField:"itemvalue",//文本值
		                     panelHeight:"auto"
		             })
		             }
		     	});

		}
		});

	});
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#HRAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		$.post("/HR/save",$("#HRAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增HR成功!');
			}
		});
	}
	
	function clearForm(){
		$('#HRAddForm').form('reset');
		HRAddEditor.html('');
	}
</script>
