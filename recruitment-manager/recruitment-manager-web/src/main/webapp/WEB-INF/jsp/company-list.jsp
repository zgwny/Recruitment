<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="companyList" title="企业列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,url:'/company/list',method:'get',pageSize:30,toolbar:toolbar">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'companyid',width:70,align:'center'">企业ID</th>
            <th data-options="field:'name',width:200,align:'center'">企业名称</th>
            <th data-options="field:'net',width:160,align:'center'">企业官网</th>
            <th data-options="field:'buidltime',width:140,align:'center'">成立时间</th>
            <th data-options="field:'address',width:250,align:'center'">地址</th>           
            <th data-options="field:'legalperson',width:150,align:'center'">法人</th>
            <th data-options="field:'capital',width:180,align:'center'">注册资金</th>
            <th data-options="field:'financing',width:150,align:'center'">融资情况</th>           
            <th data-options="field:'scale',width:150,align:'center'">企业规模</th>
            <th data-options="field:'direction',width:150,align:'center'">企业定位</th>
        </tr>
    </thead>
</table>
<div id="companyEditWindow" class="easyui-window" title="编辑企业" data-options="modal:true,closed:true,iconCls:'icon-save',href:'/company-edit'" style="width:80%;height:80%;padding:10px;">
</div>
<script>

    function getSelectionsIds(){
    	var companyList = $("#companyList");
    	var sels = companyList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].companyid);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbar = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$(".tree-title:contains('新增企业')").parent().click();
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个企业才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一个企业!');
        		return ;
        	}
        	
        	$("#companyEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#companyList").datagrid("getSelections")[0];
        			//data.priceView = TAOTAO.formatPrice(data.price);
        			$("#companyEditForm").form("load",data); 
        			$("#companyEditForm").find('input').each(function(){
        				
        				if($(this).attr('id')== "scale"){
        					
        					groupvalue = "scale";
        					getDictionary(groupvalue);
        					$("#"+groupvalue).val()
        					
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
        			$.getJSON('/company/query/'+data.companyid,function(_data){
        				if(_data.status == 200){
        					//UM.getEditor('companyeEditDescEditor').setContent(_data.data.companyDesc, false);
        					companyEditEditor.html(_data.data.description);
        				}
        			});
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var data = $("#companyList").datagrid("getSelections")[0];
        	if(data.length == 0){
        		$.messager.alert('提示','未选中企业!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+data.companyid+' 的企业吗？',function(r){
        	    if (r){    	
                	$.getJSON("/company/delete/"+data.companyid, function(_data){
            			if(_data.status == 200){
            				$.messager.alert('提示','删除企业成功!',undefined,function(){
            					$("#companyList").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
        }
    }];
</script>