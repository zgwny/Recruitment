<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="deliveryList" title="求职者列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/candidate/list?jobid='data.jobid,method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'candidateid',width:70,align:'center'">Id</th>
            <th data-options="field:'name',width:200,align:'center'">姓名</th>
            <th data-options="field:'sex',width:160,align:'center'">性别</th>
            <th data-options="field:'age',width:160,align:'center'">年龄</th>
            <th data-options="field:'phone',width:140,align:'center'">电话</th>
        </tr>
    </thead>
</table>
<div id="deliveryEditWindow" class="easyui-window" title="编辑求职者" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/delivery-edit'" style="width:80%;height:80%;padding:10px;">
</div>
<script>
	

    function getSelectionsIds(){
    	var deliveryList = $("#deliveryList");
    	var sels = deliveryList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].deliveryid);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$(".tree-title:contains('新增求职者')").parent().click();
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个求职者才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一个求职者!');
        		return ;
        	}
        	
        	$("#deliveryEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#deliveryList").datagrid("getSelections")[0];   				
        					if(data.sex == "男"){
        						$("#sex").append("<input  name ='sex'   type='radio' value='1' checked='checked'/>男"+
                						"<input value='2'   name='sex' type='radio' />女");	
        					}	
        				
        				
        					if(data.sex == "女"){
        						$("#sex").append("<input  name ='sex' value='1'  type='radio' />男"+
                						"<input value='2' name='sex' type='radio' checked='checked'/>女");				
        				}	
        			delete data.sex;
        			$("#deliveryEditForm").form("load",data);   
        			
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var data = $("#deliveryList").datagrid("getSelections")[0];
        	if(data.length == 0){
        		$.messager.alert('提示','未选中求职者!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+data.deliveryid+' 的求职者吗？',function(r){
        	    if (r){    	
                	$.getJSON("/delivery/delete/"+data.deliveryid, function(_data){
            			if(_data.status == 200){
            				$.messager.alert('提示','删除求职者成功!',undefined,function(){
            					$("#deliveryList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>