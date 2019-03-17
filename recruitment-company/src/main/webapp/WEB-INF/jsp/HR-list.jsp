<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="HRList" title="HR列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/HR/list',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'hrid',width:70,align:'center'">Id</th>
            <th data-options="field:'hrname',width:200,align:'center'">HR名称</th>
            <th data-options="field:'companyname',width:160,align:'center'">企业</th>
            <th data-options="field:'time',width:160,align:'center'">入职时间</th>
            <th data-options="field:'deparment',width:140,align:'center'">部门</th>
            <th data-options="field:'position',width:250,align:'center'">职位</th>           
            <th data-options="field:'phone',width:150,align:'center'">手机号</th>
            <th data-options="field:'status',width:150,align:'center'">状态</th>
             <th data-options="field:'companyid',hidden:true,width:150,align:'center'">公司id</th>
        </tr>
    </thead>
</table>
<div id="HREditWindow" class="easyui-window" title="编辑HR" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/HR-edit'" style="width:80%;height:80%;padding:10px;">
</div>
<script>
	

    function getSelectionsIds(){
    	var HRList = $("#HRList");
    	var sels = HRList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].hrid);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$(".tree-title:contains('新增HR')").parent().click();
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个HR才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一个HR!');
        		return ;
        	}
        	
        	$("#HREditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#HRList").datagrid("getSelections")[0];
        			//data.priceView = TAOTAO.formatPrice(data.price);
        			$("#HREditForm").form("load",data);   
        			
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var data = $("#HRList").datagrid("getSelections")[0];
        	if(data.length == 0){
        		$.messager.alert('提示','未选中HR!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+data.hrid+' 的HR吗？',function(r){
        	    if (r){    	
                	$.getJSON("/HR/delete/"+data.hrid, function(_data){
            			if(_data.status == 200){
            				$.messager.alert('提示','删除HR成功!',undefined,function(){
            					$("#HRList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>