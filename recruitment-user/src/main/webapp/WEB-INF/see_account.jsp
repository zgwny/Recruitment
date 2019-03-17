<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8" http-equiv="X-UA-Compatible" content="IE=EmulateIE8">
    <title>账号设置</title>

    <!-- begin新版添加的css文件-->

    <link type="text/css" rel="stylesheet" href="css/account/resumeContainer.css">
    <!--end 新版添加的css文件-->
    <!--begin jquery-->

    <!--end jquery-->
    <link rel="stylesheet" href="css/account/layer.css">
    <link type="text/css" rel="stylesheet" href="css/account/resumeHeadFooter.css">
</head>

<body style="background: #F0F0F0;">

    
    <div class="top">
        <div class="top_con clearfix">
            <p style="float: left; font-size: 14px; color: #90a4b7; height: 38px; line-height: 40px;display:none;"><span style="font-weight: bold">公告：</span>4月28日22:00-4月28日24:00时简历置顶系统升级维护，在此期间内简历置顶无法购买。给您带来的不便，尽请谅解。</p>
    
            <ul class="fr">
                <li class="people">
                    <i onmousedown="dyweTrackEvent('luMYinfo','UserCenterLst')" class="icon icon_people"></i>
                    <i class="icon icon_triangle"></i>
    
                    <ul class="acc_hover">
                        <li><a href="/Resume/BaseInfo/Edit/335401164/JI149963469R90500000000/1/1" target="_blank">修改个人信息</a></li>
                        <li><a href="/ResumeCenter/AccountSet/Index" target="_blank">账号设置</a></li>
                        <li><a href="/ResumeCenter/MyCollect/Index">我的收藏</a></li>
                        <li><a href="/PositionSearcher/Searcher/JobSearch">我的订阅</a></li>
    
                        
                        <li><a href="http://article.zhaopin.com/payquery/index.do">薪酬查询</a></li>
                        <li><a href="/Order/OrderManager/MyOrder?waitPay=false&amp;pageNo=1&amp;pageSize=10" onclick="dyweTrackEvent('luStickGoodsSelect','clickMyorder')">我的订单</a></li>
                        <li><a onclick="dyweTrackEvent('luStickGoodsSelect','clickMyStat')" href="/Order/OrderManager/GetJobSeekerStatistics?serviceId=&amp;resumeNumber=&amp;version=">求职统计</a></li>
                        <li><a href="http://passport.zhaopin.com/account/logout">退出</a></li>
                    </ul>
                </li>
                <li>
                    <a onclick="recordOutboundLink(this,'addnewlink','mobilejob')" href="//img00.zhaopin.cn/2012/other/mobile/mobile.html" target="_blank">
                        <i class="icon icon_phone"></i>
                        <span>手机求职</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <!-- top结束 -->
    
    <!-- nav结束 -->
        <div class="acc_container">
            <div class="acc_content">
                <div class="tab_con">
                    <div class="tab clearfix">
                        <p class="acc_zhsz"><i class="icon icon_set"></i><span class="zhsz_font col555">账号设置</span></p>
                        <ul class="fl tabList">
                            
                                                 
                            <li class="cur" id="password_button">修改密码</li>
                            
                        </ul>
                        <div class="fl tabConList" id="bind_show">
                            <input type="hidden" id="currMobileMail" data-mobile="158****9493" data-mail="1584113****@139.com">
                            <div class="tabCon bindAccount ">
                                <p class="fs16 mb28">
                                    <span class="col555 left_con">当前登录账号：</span><span class="col282" data-mail="http://mail.163.com/">1584113****@139.com</span>
    
                                        <a href="javascript:void(0);" class="colf46">立即验证</a>
                                </p>
                                    <p class="fs16 mb25">
                                        <span class="col555 left_con">当前手机号码：</span>
                                        <span class="col282 mr150">158****9493</span>
                                        <a href="javascript:void(0);" class="col999">已绑定</a>
                                    </p>
                            </div>
                            <div class="tabCon modify_phone " id="phone_show">
                                <p class="fs16 mb25"><span class="col555 left_con">当前手机号码：</span><span class="col282">158****9493</span></p>
    
                                <p class="fs16 mb17 n_phone clearfix">
                                    <span class="col555 left_con fl">新手机号码：</span><input type="text" class="new_number fl" maxlength="11">
                                    <span class="pin_phone fl">
                                        <i class="icon icon_yzmot fl mlr5"></i>
                                        <i class="fs14 col555 fl"></i>
                                    </span>
                                </p>
    
                                <p class="fs16 mb17 clearfix">
                                    <span class="col555 left_con fl">验证码：</span><input type="text" class="new_yzm mr10 fl"><a href="javascript:void(0);" class="get_yzm fl">获取验证码</a>
                                    <span class="phone_yzm fl"><i class="icon icon_nphone fl mlr5"></i><span class="col555 fs14 fl"></span></span>
                                </p>
                                <p class="col777 mb40"><span class="fs16">注：</span><span class="fs14">手机号码用于登录、接收HR来电。修改成功后，请使用新手机号登录智联。</span></p>
                                <p class="pl120"><a href="javascript:void(0);" class="acc_save fs16">保 存</a></p>
                            </div>
                            <div class="tabCon modify_mail" id="mail_show">
                                <p class="fs16 mb25"><span class="col555 left_con">当前邮箱：</span><span class="col282">1584113****@139.com</span></p>
    
                                <p class="fs16 mb33 new_yx clearfix"><span class="col555 left_con fl">新邮箱：</span><input type="text" class="new_number fl" maxlength="100"><i class="icon icon_yzmyx fl mlr5"></i><span class="col555 fs14 in_yx fl"></span></p>
                                <p class="col777 mb40"><span class="fs16">注：</span><span class="fs14">邮箱用于登录、找回密码、接收HR来信。修改成功后，请使用新邮箱登录智联。</span></p>
                                <p class="pl120"><a href="javascript:void(0);" class="acc_save fs16">修改邮箱</a></p>
                            </div>
                            <div class="tabCon modify_pwd cur" id="password_show">
                                <form action="user/update/password" method="POST">
                                <p class="fs16 mb15 clearfix">
                                    <span class="col555 left_con fl">旧密码：</span><input type="password" name="oldpassword" class="old_pwd fl" maxlength="25" id="pwd_old">
                                    <span class="pwd_tip_old fl">
                                        <i class="icon fl mlr5"></i>
                                        <i class="fs14 col555 fl"></i>
                                    </span>
                                </p>
                                <p class="fs16 mb15 clearfix">
                                    <span class="col555 left_con fl">新密码：</span><input type="password" class="old_pwd fl" maxlength="25" id="pwd_first">
                                    <span class="pwd_tip_first fl">
                                        <i class="icon fl mlr5"></i>
                                        <i class="fs14 col555 fl"></i>
                                    </span>
                                </p>
                                <p class="fs16 mb40 clearfix">
                                    <span class="col555 left_con fl">新密码确认：</span><input type="password" name="password" class="old_pwd fl" maxlength="25" id="pwd_second">
                                    <span class="pwd_tip_second fl">
                                        <i class="icon fl mlr5"></i>
                                        <i class="fs14 col555 fl"></i>
                                    </span>
                                </p>
                                <p class="pl120"><button href="javascript:void(0);" class="acc_save fs16" type="submit">保 存</button></p>
                            </form>
                            </div>
                                <div style="padding: 20px 0 0 50px;" class="tabCon ">
                                    <div class="fs16 mb15 p-list2 choseP">
                                        <font class="left_conq col555">选择简历：</font>
                                        <input type="text" readonly="readonly" class="choseResume old_pwd" value="张文岳 的简历" data-resume_num="JI149963469R90500000000" data-version="1">
                                        <ul class="choseUl">
                                                <li data-resume_num="JI149963469R90500000000" data-resumeid="335401164" data-version="1">张文岳 的简历</li>
                                        </ul>
                                    </div>
                                    <div class="fs16 mb15 p-list2 enterpriseAdd">
                                        <span class="col555 left_conq">屏蔽企业（<span class="col333">0</span>/<span>10</span>）:</span>
                                        <span class="col333 fwb add_com"><i class="icon icon_add"></i>添加屏蔽企业</span>
                                        <span class="input_add">
                                            <input type="text" class="old_pwd add_name mr10 fl"><a href="javascript:void(0);" class="save_quit save_click mr10">保存</a><a href="javascript:void(0);" class="save_quit quit_click">取消</a>
                                        </span>
                                        <ul class="en_sug_ul"></ul>
                                    </div>
                                    <div class="fs16 mb15 p-list2 tips">
                                        <span class="fs18 col777 left_conq">注： </span>
                                        <span class="col777">
                                            企业屏蔽24小时内生效，已经下载你简历的企业不在屏蔽范围内。
                                        </span>
                                    </div>
                                </div>                       </div>
                    </div>
                </div>
                <!-- tab_con结束 -->
    
            </div>
            <!-- acc_content结束 -->
        </div>
        <!-- acc_container结束 -->
    

    </body>
    </html>
    