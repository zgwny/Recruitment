<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="candidateList" title="求职者列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/candidate/list',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'deliveryid',width:10,align:'center',hidden:true">Id</th>
            <th data-options="field:'candidatename',width:80,align:'center'">姓名</th>
            <th data-options="field:'sex',width:40,align:'center'">性别</th>
            <th data-options="field:'phone',width:140,align:'center'">电话</th>
            <th data-options="field:'email',width:140,align:'center'">邮箱</th>
            <th data-options="field:'address',width:80,align:'center'">地址</th>
            <th data-options="field:'experience',width:80,align:'center'">工作经验</th>
            <th data-options="field:'department',width:140,align:'center'">部门</th>
            <th data-options="field:'jobname',width:140,align:'center'">职位</th>
            <th data-options="field:'schedule',width:140,align:'center'">招聘进程</th> 
            <th data-options="field:'deliverytime',width:140,align:'center',formatter:TAOTAO.formatDateTime">简历投递时间</th>           
        </tr>
    </thead>
</table>
<div id="candidateEditWindow" class="easyui-window" title="编辑求职者" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/candidate-edit'" style="width:80%;height:80%;padding:10px;">
</div>
<script>
	

    function getSelectionsIds(){
    	var candidateList = $("#candidateList");
    	var sels = candidateList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].deliveryid);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
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
        	
        	$("#candidateEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#candidateList").datagrid("getSelections")[0];   				
        			$("#candidateEditForm").form("load",data);  
        			$("#candidateEditForm").find('input').each(function(){       				
        				if($(this).attr('id')== "schedule"){
        					
        					groupvalue = "schedule";
        					getDictionary(groupvalue);
        				}
        			});
        			function getDictionary(groupvalue){
        				$.ajax({
        		            type:"get",
        		            url:"/dictionary/get?groupvalue=" + groupvalue,
        		             dataType:"json",
        		             success:function(json){
        		           	$.each(json,function(index,item){
        		           		if(json[index].itemvalue==$("#"+groupvalue).val()){
        		           			json[index].newParam = 'selected';
        		           			json[index].selected=true;
        		           		}
        		           	})
        		             $("#"+groupvalue).combobox({//往下拉框塞值
        		                     data:json,
        		                     
        		                     valueField:"itemkey",//value值
        		                     textField:"itemvalue",//文本值
        		                     panelHeight:"auto"
        		             })
        		             }
        		     	});
        			}
        			
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var data = $("#candidateList").datagrid("getSelections")[0];
        	if(data.length == 0){
        		$.messager.alert('提示','未选中求职者!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+data.candidateid+' 的求职者吗？',function(r){
        	    if (r){    	
                	$.getJSON("/candidate/delete/"+data.deliveryid, function(_data){
            			if(_data.status == 200){
            				$.messager.alert('提示','删除求职者成功!',undefined,function(){
            					$("#candidateList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>