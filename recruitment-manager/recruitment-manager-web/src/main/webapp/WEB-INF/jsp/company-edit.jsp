<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="companyEditForm" class="companyForm" method="post">
	<input type="hidden" name="companyid"/>
	    <table cellpadding="5">
	        <tr>
	            <td>企业名称:</td>
				<td><input class="easyui-textbox" type="text" name="name" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>企业官网:</td>
	            <td><input class="easyui-textbox" type="text" name="net" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>成立时间:</td>
	            <td><input class="easyui-textbox" type="text" name="buidltime" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>地址:</td>
	 			<td><input class="easyui-textbox" type="text" name="address" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>法人:</td>
	            <td><input class="easyui-textbox" type="text" name="legalperson" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>注册资金:</td>
	   
	                <td><input class="easyui-numberbox" type="text" name="capital" data-options="min:1,max:99999999,precision:0,required:true" /></td>
	            
	        </tr>
	        <tr>
	            <td>融资情况:</td>
	           
	                <td><input class="easyui-combobox"  name="financing" id="financing" data-options="required:true" style="width: 280px;"></input></td>
	           
	        </tr> 
	        <tr>
	            <td>企业规模:</td>
	            
	                <td><input class="easyui-combobox" id="scale" type="text" name="scale" data-options="required:true" style="width: 280px;"></input></td>
	            
	        </tr>
	       <tr>
	            <td>企业定位:</td>
	            
	                <td><input class="easyui-combobox" type="text" name="direction" id="direction" data-options="required:true" style="width: 280px;"></input></td>
	           
	        </tr>
	        <tr>
	            <td>企业描述:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="description"></textarea>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
	var companyEditEditor ;
	$(function(){
		//实例化编辑器
		companyEditEditor = TAOTAO.createEditor("#companyEditForm [name=description]");
	});
	
	function submitForm(){
		if(!$('#companyEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		companyEditEditor.sync();
		$.post("/company/update",$("#companyEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改企业成功!','info',function(){
					$("#companyEditWindow").window('close');
					$("#companyList").datagrid("reload");
				});
			}
		});
	}
</script>
