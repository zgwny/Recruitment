<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="jobList" title="工作列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/job/list',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'jobid',width:70,align:'center',hidden:true">工作ID</th>
            <th data-options="field:'jobname',width:200,align:'center'">工作名称</th>
            <th data-options="field:'companyname',width:160,align:'center'">公司名</th>
            <th data-options="field:'department',width:140,align:'center'">部门名</th>
            <th data-options="field:'salary',width:250,align:'center'">薪资</th>           
            <th data-options="field:'education',width:150,align:'center'">学历要求</th>
            <th data-options="field:'experience',width:180,align:'center'">工作经验要求</th>          
            <th data-options="field:'deadline',width:150,align:'center'">截至日期</th>
            <th data-options="field:'companyid',width:150,align:'center',hidden:true">公司id</th>
            <th data-options="field:'hrid',width:150,align:'center',hidden:true">hrid</th>
        </tr>
    </thead>
</table>

<div id="jobEditWindow" class="easyui-window" title="编辑工作" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/job-edit'" style="width:80%;height:80%;padding:10px;">
</div>
<div id="deliveryEditWindow" class="easyui-window" title="编辑求职者" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/delivery-list'" style="width:80%;height:80%;padding:10px;">
</div>
<script>

    function getSelectionsIds(){
    	var jobList = $("#jobList");
    	var sels = jobList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].jobid);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$(".tree-title:contains('新增工作')").parent().click();
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个工作才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一个工作!');
        		return ;
        	}
        	
        	$("#jobEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#jobList").datagrid("getSelections")[0];
        			//data.priceView = TAOTAO.formatPrice(data.price);       			
        			$("#jobEditForm").form("load",data);
        			$("#jobEditForm").find('input').each(function(){       				

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
        			// 加载商品描述
        			$.getJSON('/job/desc/query/'+data.jobid,function(_data){
        				if(_data.status == 200){
        					jobRequirementEditEditor.html(_data.data.requirement);
        					jobDescriptionEditEditor.html(_data.data.description);
        					
        				}
        			});
        			
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var data = $("#jobList").datagrid("getSelections")[0];
        	if(data.length == 0){
        		$.messager.alert('提示','未选中工作!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除 '+data.jobname+'公司的工作吗？',function(r){
        	    if (r){    	
                	$.getJSON("/job/delete/"+data.jobid, function(_data){
            			if(_data.status == 200){
            				$.messager.alert('提示','删除工作成功!',undefined,function(){
            					$("#jobList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>