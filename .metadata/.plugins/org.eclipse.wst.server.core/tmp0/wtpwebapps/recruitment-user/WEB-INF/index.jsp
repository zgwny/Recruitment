<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<title>我的智联</title>

<link rel="stylesheet" type="text/css" href="css/vendors.css">
<link rel="stylesheet" type="text/css" href="css/index/index.css">
<link rel="stylesheet" type="text/css" href="css/index/iconfont.css">
<link href="css/idangerous.swiper.min.css" type="text/css"
	rel="stylesheet">
<script>
function show(){

	document.getElementById("show").style.display ="";
	document.getElementById("arrow").className ="zp-welcome__username--i icon zp-iconfont zp-jiantoucebianlan zp-welcome__arrow--up";
	
}

function noshow(){
	document.getElementById("show").style.display ="none";
	document.getElementById("arrow").className ="zp-welcome__username--i icon zp-iconfont zp-jiantoucebianlan zp-welcome__arrow--down";
}

function check(){
	
	if(document.getElementById("check").checked){
		var lis = document.getElementById("checkAll").getElementsByTagName("i");
		for (var i = 0;i<lis.length; i++ ){
			lis[i].innerHTML="<img src='images/checked.png' class='joblist-container__item__image'>";
		}
		
	}else{
		var lis = document.getElementById("checkAll").getElementsByTagName("i");
		for (var i = 0;i<lis.length; i++ ){
			lis[i].innerHTML="";
		}
		document.getElementById("check").checked=false;
	}
}
	

</script>
</head>
<body>
	<div id="root" class="zp">
		<div class="zp-header clearfix" id="rightNav_top">
			<div class="zp-container">
				<div class="zp-top-menu
              zp-container">
					<div class="clearfix zp-top-menu__header">
						<div class="fl">
							<div>
								<span class="top-menu-city">大连</span> <a
									href="https://www.zhaopin.com/citymap" target="_blank"
									class="top-menu-city__change">[切换城市]</a>
							</div>
						</div>
						<div class="fr">
							<div class="zp-welcome">
								<span id="welcome"
									onclick="dyweTrackEvent('companysize','postsearchsetting001')">欢迎回来</span>
								<div class="zp-welcome__username" onmouseover="show()" onmouseout="noshow()">
									<span>张文岳</span> <i 
										class="zp-welcome__username--i icon zp-iconfont
                        zp-jiantoucebianlan zp-welcome__arrow--down" id="arrow"></i>							
										<div id="show"  style="display: none;">
										<ul class="zp-welcome__setlist">
											<li class="zp-welcome__setlist--li"><a href="/"
												target="_blank" class="zp-welcome__setlist--link"> 个人中心
											</a></li>
											<li class="zp-welcome__setlist--li"><a href="/resume"
												target="_blank" class="zp-welcome__setlist--link"> 我的简历</a></li>
											<li class="zp-welcome__setlist--li"><a
												href="/schedule?status=viewed" target="_blank"
												class="zp-welcome__setlist--link"> 求职反馈</a></li>
											<li class="zp-welcome__setlist--li"><a
												href="//i.zhaopin.com/ResumeCenter/AccountSet/Index"
												target="_blank" class="zp-welcome__setlist--link">账号设置</a></li>
											<li class="zp-welcome__setlist--li"><a
												href="//i.zhaopin.com/ResumeCenter/MyCollect/Index"
												target="_blank" class="zp-welcome__setlist--link">我的收藏</a></li>
											<li class="zp-welcome__setlist--li"><a
												href="//i.zhaopin.com/Order/OrderManager/MyOrder?waitPay=false&amp;pageNo=1&amp;pageSize=10"
												target="_blank" class="zp-welcome__setlist--link">我的订单</a></li>
											<li class="zp-welcome__setlist--li"><a
												href="//i.zhaopin.com/Order/OrderManager/GetJobSeekerStatistics?serviceId=&amp;resumeNumber=&amp;version="
												target="_blank" class="zp-welcome__setlist--link">求职统计</a></li>
											<li class="zp-welcome__setlist--li"><a id="logout"
												href="javascript:;" class="zp-welcome__setlist--link">退出</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="call-center zp-phone">
								<i
									class="icon zp-iconfont
                      zp-dianhua call-center__telephone"></i>400-885-9898
							</div>
						</div>
					</div>
				</div>
				<div class="zp-searchbar__wrapper">
					<div class="zp-searchbar clearfix">
						<div class="clearfix">
							<div class="fl zp-logo">
								<a href="https://www.zhaopin.com" target="_blank"
									class="fl zp-logo__link"></a>
							</div>
							<div class="zp-searchbox fl zp-searchbar__box">
								<div class="zp-searchbox__search">
									<div data-v-2c8a2978="" onselectstart="return false"
										class="zp-searchbox-select">
										<div data-v-2c8a2978=""
											class="zp-searchbox-select__label zp-iconfont">
											<span data-v-2c8a2978="">职位</span>
										</div>
										<!---->
									</div>
									<input placeholder="请输入关键词,例如:JAVA,销售代表,行政助理等" type="text"
										class="zp-searchbox__input"> <a href="javascript:;"
										class="zp-searchbox__button"><i
										class="icon zp-iconfont
                          zp-search zp-searchbox__button__icon"></i></a>
									<ul class="zp-searchbox__keywords" style="display: none;"></ul>
								</div>
							</div>
							<div class="fr zp-searchbar__qrcode"></div>
						</div>
					</div>
				</div>
				<!---->
			</div>
		</div>
		<div class="zp-main" style="z-index: 1;">
			<div class="zp-main__channel">
				<ul class="zp-container zp-nav__channel
              clearfix">
					<li class="zp-nav__channel--item zp-nav__common--li"><a
						href="https://www.zhaopin.com" target="_blank"
						class="zp-nav__channel--link"><span
							class="zp-nav__channel--name"><span><span>首页</span>
									<!----> <!----></span></span></a></li>
					<li class="zp-nav__channel--item zp-nav__common--li"><a
						href="//www.zhaopin.com/beijing/" target="_blank"
						class="zp-nav__channel--link"><span
							class="zp-nav__channel--name"><span><span>大连站</span>
									<!----> <i class="zp-nav__channel--point"></i></span></span></a></li>
					<li class="zp-nav__channel--item zp-nav__common--li"><a
						href="//xiaoyuan.zhaopin.com" target="_blank"
						class="zp-nav__channel--link"><span
							class="zp-nav__channel--name"><span><span>校园招聘</span>
									<!----> <!----></span></span></a></li>
					
				</ul>
				<!---->
			</div>
			<div class="zp-container zp-main__container clearfix">
				<!---->
				<div class="job-nav zp-main__jobnav">
					<ol>
						<li class="job-nav__class"><div class="job-nav__class__title">互联网IT</div>
							<div class="job-nav__pop" style="top: -10px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">后台开发</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">Java</a><a
											class="job-nav__pop__list__item">C++</a><a
											class="job-nav__pop__list__item">PHP</a><a
											class="job-nav__pop__list__item">数据挖掘</a><a
											class="job-nav__pop__list__item">C</a><a
											class="job-nav__pop__list__item">C#</a><a
											class="job-nav__pop__list__item">NET</a><a
											class="job-nav__pop__list__item">Hadoop</a><a
											class="job-nav__pop__list__item">Python</a><a
											class="job-nav__pop__list__item">Delphi</a><a
											class="job-nav__pop__list__item">VB</a><a
											class="job-nav__pop__list__item">Perl</a><a
											class="job-nav__pop__list__item">Ruby</a><a
											class="job-nav__pop__list__item">Node.js</a><a
											class="job-nav__pop__list__item">Goaling</a><a
											class="job-nav__pop__list__item">自然语言处理</a><a>
											class="job-nav__pop__list__item">推荐算法</a><a
											class="job-nav__pop__list__item">Erlang</a><a
											class="job-nav__pop__list__item">算法工程师</a><a
											class="job-nav__pop__list__item">声音/视频/图形开发</a><a
											class="job-nav__pop__list__item">数据采集</a>
									</div>
								</div>
							</div></li>
						<li class="job-nav__class"><div class="job-nav__class__title">移动开发</div>
							<div class="job-nav__pop" style="top: -54px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">移动开发</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">HTML5</a><a
											class="job-nav__pop__list__item">Android</a><a
											class="job-nav__pop__list__item">iOS</a><a
											class="job-nav__pop__list__item">WP</a><a
											class="job-nav__pop__list__item">web前端</a><a
											class="job-nav__pop__list__item">Flash</a><a
											class="job-nav__pop__list__item">JavaScript</a><a
											class="job-nav__pop__list__item">U3D</a><a
											class="job-nav__pop__list__item">COCOS2DX</a>
									</div>
									</div>
							</div></li>
						<li class="job-nav__class"><div class="job-nav__class__title">测试</div>
							<div class="job-nav__pop" style="top: -98px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">测试</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">测试工程师</a><a
											class="job-nav__pop__list__item">自动化测试</a><a
											class="job-nav__pop__list__item">功能测试</a><a
											class="job-nav__pop__list__item">性能测试</a><a
											class="job-nav__pop__list__item">测试开发</a><a
											class="job-nav__pop__list__item">移动端开发</a><a
											class="job-nav__pop__list__item">游戏测试</a><a
											class="job-nav__pop__list__item">硬件测试</a><a
											class="job-nav__pop__list__item">软件测试</a>
									</div>
								</div>
							</div></li>
						<li class="job-nav__class"><div class="job-nav__class__title">运维/技术支持</div>
							<div class="job-nav__pop" style="top: -142px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">运维/技术支持</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">运维工程师</a><a
											class="job-nav__pop__list__item">运维开发工程师</a><a
											class="job-nav__pop__list__item">网络工程师</a><a
											class="job-nav__pop__list__item">系统工程师</a><a
											class="job-nav__pop__list__item">IT技术工程</a><a
											class="job-nav__pop__list__item">系统管理员</a><a
											class="job-nav__pop__list__item">网络管理员</a><a
											class="job-nav__pop__list__item">网络安全</a><a
											class="job-nav__pop__list__item">系统安全</a><a
											class="job-nav__pop__list__item">DBA</a>
									</div>
									</div>
							</div></li>
						<li class="job-nav__class"><div class="job-nav__class__title">数据</div>
							<div class="job-nav__pop" style="top: -186px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">数据</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">ETL工程师</a><a
											class="job-nav__pop__list__item">数据仓库</a><a
											class="job-nav__pop__list__item">数据开发</a><a
											class="job-nav__pop__list__item">数据挖掘</a><a
											class="job-nav__pop__list__item">数据分析师</a><a
											class="job-nav__pop__list__item">数据架构师</a><a
											class="job-nav__pop__list__item">算法研究员</a>
									</div>
								</div>
							</div></li>
						<li class="job-nav__class"><div class="job-nav__class__title">前端开发</div>
							<div class="job-nav__pop" style="top: -230px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">前端开发</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">web前端</a><a
											class="job-nav__pop__list__item">JavaScript</a><a
											class="job-nav__pop__list__item">Flash</a><a
											class="job-nav__pop__list__item">HTML5</a>									
								</div>
							</div></li>
						<li class="job-nav__class"><div class="job-nav__class__title">前端技术职位</div>
							<div class="job-nav__pop" style="top: -274px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">前端技术职位</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">技术经理</a><a
											class="job-nav__pop__list__item">技术总监</a><a
											class="job-nav__pop__list__item">测试经理</a><a
											class="job-nav__pop__list__item">架构师</a><a
											class="job-nav__pop__list__item">CTO</a><a
											class="job-nav__pop__list__item">运维总监</a><a
											class="job-nav__pop__list__item">技术合伙人</a>
									</div>
								</div>
							</div></li>
						<li class="job-nav__class"><div class="job-nav__class__title">人工智能</div>
							<div class="job-nav__pop" style="top: -318px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">人工智能</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">技术学习</a><a
											class="job-nav__pop__list__item">深度学习</a><a
											class="job-nav__pop__list__item">图像算法</a><a
											class="job-nav__pop__list__item">图像处理</a><a
											class="job-nav__pop__list__item">语言识别</a><a
											class="job-nav__pop__list__item">图像识别</a><a
											class="job-nav__pop__list__item">算法研究院</a>
								</div>
							</div></li>
							<li class="job-nav__class"><div class="job-nav__class__title">其他技术职位</div>
							<div class="job-nav__pop" style="top: -318px;">
								<div class="job-nav__pop__wrapper">
									<div class="job-nav__pop__title">其他技术职位</div>
									<div class="job-nav__pop__list">
										<a class="job-nav__pop__list__item">其他技术职位</a>
								</div>
							</div></li>
					</ol>
				</div>
				<div class="activites zp-main__activities">
					<ul class="activites__list" style="width: 2800px;">
						<li class="activites__list__item" style="left: 0px; z-index: 0;"><a
							href="https://image.highpin.cn/Pages/Active/20181210/C.html?_=2018121118"
							target="_blank"><img
								src="images/ad1.jpg?x-oss-process=image/resize,m_lfit,h_410,w_700"
								width="700" height="410"></a></li>
						<li class="activites__list__item"
							style="left: -700px; z-index: 0;"><a
							href="http://t.cn/Rm7jKxK" target="_blank"><img
								src="images/ad2.jpg?x-oss-process=image/resize,m_lfit,h_410,w_700"
								width="700" height="410"></a></li>
						<li class="activites__list__item"
							style="left: -1400px; z-index: 0;"><a
							href="http://cnt.zhaopin.com/Market/whole_counter.jsp?sid=121129862&amp;site=zslb&amp;url=http://zphr.zhaopin.com/"
							target="_blank"><img
								src="images/ad3.jpg?x-oss-process=image/resize,m_lfit,h_410,w_700"
								width="700" height="410"></a></li>
						<li class="activites__list__item activites__list__item--actived"
							style="left: -2100px; z-index: 1;"><a
							href="https://xiaoyuan.zhaopin.com/" target="_blank"><img
								src="images/ad4.jpg?x-oss-process=image/resize,m_lfit,h_410,w_700"
								width="700" height="410"></a></li>
					</ul>
					<div class="activites__pagination" style="width: 88px;">
						<i class="activites__pagination__item"></i><i
							class="activites__pagination__item"></i><i
							class="activites__pagination__item"></i><i
							class="activites__pagination__item
                  activites__pagination__item--actived"></i>
					</div>
				</div>
				<div class="zp-main__personal">
					<div class="user-panel">
						<div class="user-panel__header clearfix">
							<div class="user-panel__header__avater">
								<img src="images/head.jpg"
									class="user-panel__header__avater__image"> <a
									href="/resume" target="_myzl"
									class="user-panel__header__avater__edit">更改头像</a>
							</div>
							<div class="user-panel__header__welcome">
								<h6 class="user-panel__header__welcome__name">Hi，张文岳</h6>
								<p class="user-panel__header__welcome__speech">欢迎回来，下午好！</p>
							</div>
						</div>
						<ul class="user-panel__feedback">
							<li
								class="user-panel__feedback__item
                    user-panel__feedback__item__view"><a
								href="https://i.zhaopin.com/schedule?status=viewed"
								target="_myzl" class="user-panel__feedback__link"><span
									class="user-panel__feedback__number">2</span>家<br> <span
									class="user-panel__feedback__type">企业看过</span></a></li>
							<li
								class="user-panel__feedback__item
                    user-panel__feedback__item__feed"><a
								href="https://i.zhaopin.com/schedule" target="_myzl"
								class="user-panel__feedback__link"><span
									class="user-panel__feedback__number">0</span>条<br> <span
									class="user-panel__feedback__type">企业反馈</span></a></li>
						</ul>
						<div class="user-panel__functions">
							<a href="see_resume" target="_myzl"
								class="user-panel__functions__link"><img
								src="images/resume.gif"
								class="user-panel__functions__link__icon">
								<p>我的简历</p></a> <a target="_blank"
								class="user-panel__functions__link"><img
								src="images/refresh_resume.png"
								class="user-panel__functions__link__icon">
								<p>刷新简历</p></a> <a href="/order/product" target="_myzl"
								class="user-panel__functions__link"><img
								src="images/top_resume.gif"
								class="user-panel__functions__link__icon">
								<p>升级简历</p></a>
						</div>
						<div class="refresh-resume-layer" style="display: none;">
							<div class="refresh-resume-layer__content">
								<h6 class="refresh-resume-layer__hint">简历信息不完整，暂时不能刷新！</h6>
								<a href="/resume" target="_blank"
									class="refresh-resume-layer__improve">立即完善</a> <a
									href="javascript:;"
									class="refresh-resume-layer__close
                      zp-guanbi zp-iconfont"></a>
							</div>
						</div>
					</div>
					<div class="zp-main__notice">
						<h6 class="zp-notice__title on">职场热点</h6>
						<div class="zp-notice__content">
							<a href="http://zpm.so/04bPF7" target="_notice"
								class="zp-notice__content__link"> <!----> 离职，是检验企业的最好标准
							</a><a
								href="https://zq.zhaopin.com/question/2398229?utm_source=%E5%B7%B2%E7%99%BB%E9%99%86%E9%A6%96%E9%A1%B5&amp;utm_medium=%E8%81%8C%E5%9C%BA%E7%83%AD%E7%82%B92&amp;utm_campaign=&amp;utm_term=&amp;utm_content="
								target="_notice" class="zp-notice__content__link"> <!---->
								选择做销售这个职业，你后悔过吗？
							</a><a href="https://www.wenjuan.com/s/6FFvqq/" target="_notice"
								class="zp-notice__content__link"><span
								class="zp-notice__content__title"></span> 新型雇佣关系趋势调研 </a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="rightNav_jobs" class="zp-container job-recommend">
			<h6 class="job-recommend__title" style="display: none;">推荐职位</h6>
			<div class="zp-job-header">
				<div class="fl zp-job-header__youxuan">为您优选</div>
				<div class="fr zp-job-header__deliver">
	<label class="a-checkbox a--selected"> <input id="check"
						type="checkbox" onclick="check()" checked></label>
					全选
					<div class="a-job-apply-button zp-job-header__txt">
						<button type="button" class="a-button a--bordered a--filled">一键投递</button>
						<!---->
					</div>
				</div>
			</div>
			<div class="zp-container"
				position-list="[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object],[object Object],[object Object],[object
            Object],[object Object]">
				<ul class="clearfix joblist-container" id="checkAll">
				<c:forEach items="${jobList }" var="job" varStatus="status">
				<li><div
						
						target="_blank" class="joblist-container__item"><label><i 
								class="joblist-container__item__flag"><img src='images/checked.png' class='joblist-container__item__image'></i> <input
								type="checkbox" class="joblist-container__item__hidden"></label>
							<p class="clearfix">
								<a target="_blank" href="job/desc/query/${job.jobid}"
									class="fl
                      zp-job-title">${job.jobname}</a>
								<span class="fr
                      zp-job-salary">
									${job.salary}</span>
							</p>
							<p class="zp-job-condition">
								<span class="zp-job-condition-date">最近</span> <span title=""
									class="zp-job-condition-label zp-job-city">${job.address}</span> <span
									class="zp-job-condition-label">${job.experience}</span> <span
									class="zp-job-condition-label">${job.education}</span>
							</p>
							<p class="clearfix zp-job-compnay-info">
								<span class="fl
                      zp-job-compnay-detail"><span
									class="clearfix"><a target="_blank" class="fl">
											${job.companyname}</a> <!----></span> <span></span></span>
							</p></div>
							</li>
				</c:forEach>		
				</ul>
			</div>
			<!---->
			<div class="job-recommend-loading" style="display: none;">
				<img src="//img03.zhaopin.cn/www/personal-img/zp-loading.gif"
					alt="loading pic" class="job-recommend-loading__image">
			</div>
		</div>
		<!---->
		<div id="rightNav_school" class="discover">
			<h6 class="discover__title">职Q</h6>
			<div class="zp-container
            discover__content clearfix">
				<div class="discover__item
              discover__personal">
					<h6 class="discover__item__title">
						<img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_kaishi.png"
							class="discover__item__title__icon"> <span
							class="discover__item__title__name"> 从这里开始 </span> <a
							target="_blank" class="discover__personal__unread"><span
							class="discover__personal__unread__num">3</span> 未读消息 </a>
					</h6>
					<div
						class="discover__item__content
                discover__personal__content">
						<a
							class="discover__personal__invite
                  discover__item__content__link"><p
								class="discover__personal__invite__title">
								<img
									src="https://ask-image.zhaopin.cn/discover_images/anonymous_avatar.png"
									class="discover__personal__invite__avatar"> 匿名用户 邀请你回答
							</p>
							<p class="discover__personal__content__invite">#国 际 商 业 机 器
								(中 国 )有 限 公 司#说说在这的工作体验？</p></a> <a target="_notice"
							class="discover__item__content__link"><img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_smallask1.png"
							class="discover__item__content__icon"> <span
							class="discover__item__content__title
                    discover__item__content__title--long">
								有38592名相关求职者也在这里，有什么想问他们的吗？ </span></a><a target="_notice"
							class="discover__item__content__link"><img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_smallask1.png"
							class="discover__item__content__icon"> <span
							class="discover__item__content__title
                    discover__item__content__title--long">
								有44位同事也在这里，有什么想问他们的吗？ </span></a><a target="_notice"
							class="discover__item__content__link"><img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_smallask1.png"
							class="discover__item__content__icon"> <span
							class="discover__item__content__title
                    discover__item__content__title--long">
								有204位校友也在辽宁 大连-金州区 工作，有什么想问他们的吗？ </span></a>
					</div>
				</div>
				<div class="discover__item
              discover__other">
					<h6 class="discover__item__title">
						<img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_xiangguan.png"
							class="discover__item__title__icon"> <span
							class="discover__item__title__name"> 与你相关 </span>
					</h6>
					<div class="discover__item__content">
						<a target="_notice" class="discover__item__content__link"><span
							title="#综合业务经理/主管#对于本行业的发展前景，你..."
							class="discover__item__content__title fl">#综合业务经理/主管#对于本行业的发展前景，你...</span>
							<span class="discover__item__content__title__info fr">2回答
								915阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"> <!----> <!----> <img
							src="https://ask-image.zhaopin.cn/discover_images/yunixiangguan1.jpg"
							class="discover__item__content__banner">
						</a><a target="_notice" class="discover__item__content__link"><span
							title="#总监理工程师#请问您觉得待遇多少可以接受"
							class="discover__item__content__title fl">#总监理工程师#请问您觉得待遇多少可以接受</span>
							<span class="discover__item__content__title__info fr">8回答
								1549阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="985本科➕英国硕士，家里不同意去私募股权投资..."
							class="discover__item__content__title fl">985本科➕英国硕士，家里不同意去私募股权投资...</span>
							<span class="discover__item__content__title__info fr">57回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="我马上面临毕业，学的是汽车销售，但是几年下来发..."
							class="discover__item__content__title fl">我马上面临毕业，学的是汽车销售，但是几年下来发...</span>
							<span class="discover__item__content__title__info fr">55回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="16年7月毕业的，在一家对日开发的公司呆到现在..."
							class="discover__item__content__title fl">16年7月毕业的，在一家对日开发的公司呆到现在...</span>
							<span class="discover__item__content__title__info fr">36回答
								67438阅读</span> <!----></a>
					</div>
				</div>
				<div class="discover__item discover__other">
					<h6 class="discover__item__title">
						<img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_jinpai.png"
							class="discover__item__title__icon"> <span
							class="discover__item__title__name"> 金牌答主 </span>
					</h6>
					<div class="discover__item__content">
						<a target="_notice" class="discover__item__content__link"><span
							title="Archon.J 雨润"
							class="discover__item__content__title
                    fl">Archon.J
								雨润</span> <span class="discover__item__content__title__info fr">897回答
								5858赞</span> <!----></a><a target="_notice"
							class="discover__item__content__link"> <!----> <!----> <img
							src="https://ask-image.zhaopin.cn/discover_images/jinpaidazhu1.jpg"
							class="discover__item__content__banner">
						</a><a target="_notice" class="discover__item__content__link"><span
							title="文森特 北京凯为科技有限公司"
							class="discover__item__content__title
                    fl">文森特
								北京凯为科技有限公司</span> <span class="discover__item__content__title__info fr">314回答
								6132赞</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="秦先生
                    78666部队"
							class="discover__item__content__title fl">秦先生 78666部队</span> <span
							class="discover__item__content__title__info fr">538回答
								8698赞</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="黄怡然
                    北京凯为科技有限公司"
							class="discover__item__content__title fl">黄怡然 北京凯为科技有限公司</span> <span
							class="discover__item__content__title__info fr">272回答
								6475赞</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="付先生 ****集团" class="discover__item__content__title fl">付先生
								****集团</span> <span class="discover__item__content__title__info fr">744回答
								4471赞</span> <!----></a>
					</div>
				</div>
				<div class="discover__item discover__other">
					<h6 class="discover__item__title">
						<img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_jingxuan.png"
							class="discover__item__title__icon"> <span
							class="discover__item__title__name"> 精选问答 </span>
					</h6>
					<div class="discover__item__content">
						<a target="_notice" class="discover__item__content__link"><span
							title="高薪不喜欢和低薪很喜欢的工作，《奇葩说》灵魂拷..."
							class="discover__item__content__title fl">高薪不喜欢和低薪很喜欢的工作，《奇葩说》灵魂拷...</span>
							<span class="discover__item__content__title__info fr">691回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"> <!----> <!----> <img
							src="https://ask-image.zhaopin.cn/discover_images/jingxuanwenda1.jpg"
							class="discover__item__content__banner">
						</a><a target="_notice" class="discover__item__content__link"><span
							title="对于没能力但强烈表示会学习的求职者，该不该聘用呢？"
							class="discover__item__content__title fl">对于没能力但强烈表示会学习的求职者，该不该聘用呢？</span>
							<span class="discover__item__content__title__info fr">732回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="感觉这辈子都找不到工作了 心态崩了"
							class="discover__item__content__title fl">感觉这辈子都找不到工作了
								心态崩了</span> <span class="discover__item__content__title__info fr">1336回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="大专毕业出来3年了，25了，从事过三份工作。都..."
							class="discover__item__content__title fl">大专毕业出来3年了，25了，从事过三份工作。都...</span>
							<span class="discover__item__content__title__info fr">491回答
								10万+阅读</span> <!----></a>
					</div>
				</div>
				<div class="discover__item discover__other">
					<h6 class="discover__item__title">
						<img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_shengzhi.png"
							class="discover__item__title__icon"> <span
							class="discover__item__title__name"> 涨薪水 </span>
					</h6>
					<div class="discover__item__content">
						<a target="_notice" class="discover__item__content__link"><span
							title="本人36了，到现在一事无成，有过几次创业失败的..."
							class="discover__item__content__title fl">本人36了，到现在一事无成，有过几次创业失败的...</span>
							<span class="discover__item__content__title__info fr">310回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"> <!----> <!----> <img
							src="https://ask-image.zhaopin.cn/discover_images/qiushengzhi1.jpg"
							class="discover__item__content__banner">
						</a><a target="_notice" class="discover__item__content__link"><span
							title="一直觉得自己好有才，刚换个地方。怎么找工作怎么..."
							class="discover__item__content__title fl">一直觉得自己好有才，刚换个地方。怎么找工作怎么...</span>
							<span class="discover__item__content__title__info fr">164回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="看到心仪的工作，被嫌弃学历低，不看经验看学历，..."
							class="discover__item__content__title fl">看到心仪的工作，被嫌弃学历低，不看经验看学历，...</span>
							<span class="discover__item__content__title__info fr">335回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="本人69年的，在做房产中介，请问成都周围有没有..."
							class="discover__item__content__title fl">本人69年的，在做房产中介，请问成都周围有没有...</span>
							<span class="discover__item__content__title__info fr">33回答
								54116阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span title="跳级晋升以及涨薪"
							class="discover__item__content__title fl">跳级晋升以及涨薪</span> <span
							class="discover__item__content__title__info fr">31回答
								42629阅读</span> <!----></a>
					</div>
				</div>
				<div class="discover__item discover__other">
					<h6 class="discover__item__title">
						<img
							src="https://ask-image.zhaopin.cn/discover_images/pc_icon_baofanwan.png"
							class="discover__item__title__icon"> <span
							class="discover__item__title__name"> 保饭碗 </span>
					</h6>
					<div class="discover__item__content">
						<a target="_notice" class="discover__item__content__link"><span
							title="不小了，是时候奋斗赚钱了"
							class="discover__item__content__title
                    fl">不小了，是时候奋斗赚钱了</span>
							<span class="discover__item__content__title__info fr">299回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"> <!----> <!----> <img
							src="https://ask-image.zhaopin.cn/discover_images/baofanwan1.jpg"
							class="discover__item__content__banner">
						</a><a target="_notice" class="discover__item__content__link"><span
							title="做了半年今天被告知降职降薪还要调岗不过调岗没同..."
							class="discover__item__content__title fl">做了半年今天被告知降职降薪还要调岗不过调岗没同...</span>
							<span class="discover__item__content__title__info fr">40回答
								10万+阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="找工作，工资在够我吃住"
							class="discover__item__content__title
                    fl">找工作，工资在够我吃住</span>
							<span class="discover__item__content__title__info fr">51回答
								87136阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="对于公司转正了都不签劳动合同这种事情，你们怎么看？"
							class="discover__item__content__title fl">对于公司转正了都不签劳动合同这种事情，你们怎么看？</span>
							<span class="discover__item__content__title__info fr">62回答
								42484阅读</span> <!----></a><a target="_notice"
							class="discover__item__content__link"><span
							title="大专男生，在建材辅料行业工作2年了，辞职后现在..."
							class="discover__item__content__title fl">大专男生，在建材辅料行业工作2年了，辞职后现在...</span>
							<span class="discover__item__content__title__info fr">225回答
								34902阅读</span> <!----></a>
					</div>
				</div>
			</div>
		</div>
		<div class="a-center-layout a-footer">
		<div class="a-center-layout__content">

			<div class="a-footer__bottom">
				<div class="a-footer__copyright">
					<p>未经 张文岳先生 同意，不得转载本网站之所有招聘信息及作品 IT人才求职招聘网版权所有</p>
					<p>京ICP备12025925号 京ICP证010207号 电信业务审批[2001]字第233号函 京公网安备
						11010502002133号</p>
				</div>
				<div class="a-footer__certifications">
					<a href="http://www.cyberpolice.cn/wfjb"
						class="a-footer__certification"><img
						src="//images.zhaopin.cn/2012/img/badge2.png"><span>网络110报警服务</span></a><a
						href="//img00.zhaopin.cn/new2011/bottom/license.html"
						class="a-footer__certification"><img
						src="//images.zhaopin.cn/2012/img/badge1.png"><span>电子营业执照</span></a><a
						href="//ss.knet.cn/verifyseal.dll?sn=e14032711010547573rieg000000&amp;ct=df&amp;a=1&amp;pa=500267"
						class="a-footer__certification"><img
						src="//images.zhaopin.cn/2012/img/knetSealLogo.png"> <!----></a>
				</div>
			</div>
		</div>
	</div>
		<ol class="zp-sidebar">
			<li class="zp-sidebar__item"><a
				class="zp-iconfont zp-sousuo zp-sidebar__item__inner
              zp-sidebar__map"><span
					class="zp-sidebar__map__name">搜索</span></a></li>
			<li class="zp-sidebar__item"><a
				class="zp-iconfont zp-zhiwei
              zp-sidebar__item__inner zp-sidebar__map"><span
					class="zp-sidebar__map__name">职位</span></a></li>
			<li class="zp-sidebar__item"><a
				class="zp-iconfont zp-zhidao
              zp-sidebar__item__inner zp-sidebar__map"><span
					class="zp-sidebar__map__name">职Q</span></a></li>
			<li class="zp-sidebar__item"><a
				class="zp-iconfont zp-fankui
              zp-sidebar__item__inner zp-sidebar__map"><span
					class="zp-sidebar__map__name">反馈</span></a></li>
			<li class="zp-sidebar__item"><a
				class="zp-sidebar__miniprogram
              zp-sidebar__item__inner zp-sidebar__map"><span
					class="zp-sidebar__map__name">小程序</span></a></li>
			<li class="zp-sidebar__item"><a
				class="zp-iconfont zp-fanhuidingbu
              zp-sidebar__item__inner"></a></li>
		</ol>
		<!---->
		<!---->
		<!---->
	</div>
</body>

</html>