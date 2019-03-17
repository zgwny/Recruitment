/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-04 03:21:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidate_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<table class=\"easyui-datagrid\" id=\"candidateList\" title=\"求职者列表\" \r\n");
      out.write("       data-options=\"singleSelect:false,collapsible:true,pagination:true,url:'/candidate/list',method:'get',pageSize:30,toolbar:toolbar\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("        \t<th data-options=\"field:'deliveryid',width:10,align:'center',hidden:true\">Id</th>\r\n");
      out.write("            <th data-options=\"field:'candidatename',width:80,align:'center'\">姓名</th>\r\n");
      out.write("            <th data-options=\"field:'sex',width:40,align:'center'\">性别</th>\r\n");
      out.write("            <th data-options=\"field:'phone',width:140,align:'center'\">电话</th>\r\n");
      out.write("            <th data-options=\"field:'email',width:140,align:'center'\">邮箱</th>\r\n");
      out.write("            <th data-options=\"field:'address',width:80,align:'center'\">地址</th>\r\n");
      out.write("            <th data-options=\"field:'experience',width:80,align:'center'\">工作经验</th>\r\n");
      out.write("            <th data-options=\"field:'department',width:140,align:'center'\">部门</th>\r\n");
      out.write("            <th data-options=\"field:'jobname',width:140,align:'center'\">职位</th>\r\n");
      out.write("            <th data-options=\"field:'schedule',width:140,align:'center'\">招聘进程</th> \r\n");
      out.write("            <th data-options=\"field:'deliverytime',width:140,align:'center',formatter:TAOTAO.formatDateTime\">简历投递时间</th>           \r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"candidateEditWindow\" class=\"easyui-window\" title=\"编辑求职者\" data-options=\"modal:true,closed:true,iconCls:'icon-save',href:'/candidate-edit'\" style=\"width:80%;height:80%;padding:10px;\">\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("    function getSelectionsIds(){\r\n");
      out.write("    \tvar candidateList = $(\"#candidateList\");\r\n");
      out.write("    \tvar sels = candidateList.datagrid(\"getSelections\");\r\n");
      out.write("    \tvar ids = [];\r\n");
      out.write("    \tfor(var i in sels){\r\n");
      out.write("    \t\tids.push(sels[i].deliveryid);\r\n");
      out.write("    \t}\r\n");
      out.write("    \tids = ids.join(\",\");\r\n");
      out.write("    \treturn ids;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    var toolbar = [{\r\n");
      out.write("        text:'编辑',\r\n");
      out.write("        iconCls:'icon-edit',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \tvar ids = getSelectionsIds();\r\n");
      out.write("        \tif(ids.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','必须选择一个求职者才能编辑!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(ids.indexOf(',') > 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','只能选择一个求职者!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t\r\n");
      out.write("        \t$(\"#candidateEditWindow\").window({\r\n");
      out.write("        \t\tonLoad :function(){\r\n");
      out.write("        \t\t\t//回显数据\r\n");
      out.write("        \t\t\tvar data = $(\"#candidateList\").datagrid(\"getSelections\")[0];   \t\t\t\t\r\n");
      out.write("        \t\t\t$(\"#candidateEditForm\").form(\"load\",data);  \r\n");
      out.write("        \t\t\t$(\"#candidateEditForm\").find('input').each(function(){       \t\t\t\t\r\n");
      out.write("        \t\t\t\tif($(this).attr('id')== \"schedule\"){\r\n");
      out.write("        \t\t\t\t\t\r\n");
      out.write("        \t\t\t\t\tgroupvalue = \"schedule\";\r\n");
      out.write("        \t\t\t\t\tgetDictionary(groupvalue);\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t});\r\n");
      out.write("        \t\t\tfunction getDictionary(groupvalue){\r\n");
      out.write("        \t\t\t\t$.ajax({\r\n");
      out.write("        \t\t            type:\"get\",\r\n");
      out.write("        \t\t            url:\"/dictionary/get?groupvalue=\" + groupvalue,\r\n");
      out.write("        \t\t             dataType:\"json\",\r\n");
      out.write("        \t\t             success:function(json){\r\n");
      out.write("        \t\t           \t$.each(json,function(index,item){\r\n");
      out.write("        \t\t           \t\tif(json[index].itemvalue==$(\"#\"+groupvalue).val()){\r\n");
      out.write("        \t\t           \t\t\tjson[index].newParam = 'selected';\r\n");
      out.write("        \t\t           \t\t\tjson[index].selected=true;\r\n");
      out.write("        \t\t           \t\t}\r\n");
      out.write("        \t\t           \t})\r\n");
      out.write("        \t\t             $(\"#\"+groupvalue).combobox({//往下拉框塞值\r\n");
      out.write("        \t\t                     data:json,\r\n");
      out.write("        \t\t                     \r\n");
      out.write("        \t\t                     valueField:\"itemkey\",//value值\r\n");
      out.write("        \t\t                     textField:\"itemvalue\",//文本值\r\n");
      out.write("        \t\t                     panelHeight:\"auto\"\r\n");
      out.write("        \t\t             })\r\n");
      out.write("        \t\t             }\r\n");
      out.write("        \t\t     \t});\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\t\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t}).window(\"open\");\r\n");
      out.write("        }\r\n");
      out.write("    },{\r\n");
      out.write("        text:'删除',\r\n");
      out.write("        iconCls:'icon-cancel',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \tvar data = $(\"#candidateList\").datagrid(\"getSelections\")[0];\r\n");
      out.write("        \tif(data.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','未选中求职者!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t$.messager.confirm('确认','确定删除ID为 '+data.candidateid+' 的求职者吗？',function(r){\r\n");
      out.write("        \t    if (r){    \t\r\n");
      out.write("                \t$.getJSON(\"/candidate/delete/\"+data.deliveryid, function(_data){\r\n");
      out.write("            \t\t\tif(_data.status == 200){\r\n");
      out.write("            \t\t\t\t$.messager.alert('提示','删除求职者成功!',undefined,function(){\r\n");
      out.write("            \t\t\t\t\t$(\"#candidateList\").datagrid(\"reload\");\r\n");
      out.write("            \t\t\t\t});\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t\t});\r\n");
      out.write("        \t    }\r\n");
      out.write("        \t});\r\n");
      out.write("        }\r\n");
      out.write("    }];\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
