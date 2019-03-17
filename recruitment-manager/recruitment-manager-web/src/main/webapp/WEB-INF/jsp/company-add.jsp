<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="companyAddForm" class="companyForm" method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>企业名称:</td>
				<td><input class="easyui-textbox" type="text" name="name" data-options="required:true" style="width: 280px;"></input></td>
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
	            <td><input class="easyui-textbox" type="text" name="email" data-options="required:true" style="width: 280px;"></input></td>
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
	         
	        <tr class="params hide">
	        	<td></td>
	        	<td>
	        		
	        	</td>
	        </tr>
	    </table>
	    <input type="hidden" name="companyParams"/>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">


	var companyAddEditor ;
	var groupvalue;
	//页面初始化完毕后执行此方法
	$(function(){
		
		$("#companyAddForm").find('input').each(function(){
			
			if($(this).attr('id')== "scale"){
				
				groupvalue = "scale";
				getDictionary(groupvalue);
				
			}
			if($(this).attr('id')== "financing"){
				
				groupvalue = "financing";
				getDictionary(groupvalue);
				
			} 
			if($(this).attr('id')== "direction"){
				
				groupvalue = "direction";
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
		companyAddEditor = TAOTAO.createEditor("#companyAddForm [name=description]");
		//初始化类目选择和图片上传器
		TAOTAO.init({fun:function(node){
			//根据商品的分类id取商品 的规格模板，生成规格信息。第四天内容。
			TAOTAO.changecompanyParam(node, "companyAddForm");
		}});
	});
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#companyAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		
		//$("#companyAddForm [name=price]").val(eval($("#companyAddForm [name=priceView]").val()) * 100);
		//同步文本框中
		companyAddEditor.sync();
		//取商品的规格
		/*var paramJson = [];
		$("#companyAddForm .params li").each(function(i,e){
			var trs = $(e).find("tr");
			var group = trs.eq(0).text();
			var ps = [];
			for(var i = 1;i<trs.length;i++){
				var tr = trs.eq(i);
				ps.push({
					"k" : $.trim(tr.find("td").eq(0).find("span").text()),
					"v" : $.trim(tr.find("input").val())
				});
			}
			paramJson.push({
				"group" : group,
				"params": ps
			});
		});
		//把json对象转换成字符串
		paramJson = JSON.stringify(paramJson);
		$("#companyAddForm [name=companyParams]").val(paramJson);*/
		
		//ajax的post方式提交表单
		//$("#companyAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/company/save",$("#companyAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增企业成功!');
			}
		});
	}
	
	function clearForm(){
		$('#companyAddForm').form('reset');
		companyAddEditor.html('');
	}
</script>
