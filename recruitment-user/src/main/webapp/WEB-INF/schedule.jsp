<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<title>求职进展</title>

<link rel="stylesheet" href="css/vendors.css">
<link rel="stylesheet" href="css/schedule.css">
<script>
function button1(){
	document.getElementById("button1").setAttribute("class", "on");
	document.getElementById("button2").setAttribute("class", "");
	document.getElementById("button3").setAttribute("class", "");
	document.getElementById("button4").setAttribute("class", "");
	document.getElementById("button5").setAttribute("class", "");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty deliverySuccess}'>" + 
		"<c:forEach items='${deliverySuccess}' var='job' varStatus='status'>"+
		"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty deliverySuccess}'>"+
		"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
		"<p>你需要多多投递</p></div></c:if>";		
}



function button2(){
	document.getElementById("button1").setAttribute("class", "");
	document.getElementById("button2").setAttribute("class", "on");
	document.getElementById("button3").setAttribute("class", "");
	document.getElementById("button4").setAttribute("class", "");
	document.getElementById("button5").setAttribute("class", "");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty haveBeenSaw}'>" + 
	"<c:forEach items='${haveBeenSaw}' var='job' varStatus='status'>"+
	"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty haveBeenSaw}'>"+
	"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
	"<p>你需要多多投递</p></div></c:if>";	
	}

function button3(){
	document.getElementById("button1").setAttribute("class", "");
	document.getElementById("button2").setAttribute("class", "");
	document.getElementById("button3").setAttribute("class", "on");
	document.getElementById("button4").setAttribute("class", "");
	document.getElementById("button5").setAttribute("class", "");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty like}'>" + 
	"<c:forEach items='${like}' var='job' varStatus='status'>"+
	"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty like}'>"+
	"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
	"<p>你需要多多投递</p></div></c:if>";		
}

function display(){
	document.getElementById("st-nav-subnav").style.display = "block";
}

function undisplay(){
	document.getElementById("st-nav-subnav").style.display = "none";
}


function button5(){
	document.getElementById("button1").setAttribute("class", "");
	document.getElementById("button2").setAttribute("class", "");
	document.getElementById("button3").setAttribute("class", "");
	document.getElementById("button4").setAttribute("class", "on");
	document.getElementById("button5").setAttribute("class", "");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty haveBeenInvited}'>" + 
	"<c:forEach items='${haveBeenInvited}' var='job' varStatus='status'>"+
	"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty haveBeenInvited}'>"+
	"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
	"<p>你需要多多投递</p></div></c:if>";		
}

function button6(){
	document.getElementById("button1").setAttribute("class", "");
	document.getElementById("button2").setAttribute("class", "");
	document.getElementById("button3").setAttribute("class", "");
	document.getElementById("button4").setAttribute("class", "on");
	document.getElementById("button5").setAttribute("class", "");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty toConfirm}'>" + 
	"<c:forEach items='${toConfirm}' var='job' varStatus='status'>"+
	"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty toConfirm}'>"+
	"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
	"<p>你需要多多投递</p></div></c:if>";		
}

function button7(){
	document.getElementById("button1").setAttribute("class", "");
	document.getElementById("button2").setAttribute("class", "");
	document.getElementById("button3").setAttribute("class", "");
	document.getElementById("button4").setAttribute("class", "on");
	document.getElementById("button5").setAttribute("class", "");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty accept}'>" + 
	"<c:forEach items='${accept}' var='job' varStatus='status'>"+
	"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty accept}'>"+
	"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
	"<p>你需要多多投递</p></div></c:if>";		
}

function button8(){
	document.getElementById("button1").setAttribute("class", "");
	document.getElementById("button2").setAttribute("class", "");
	document.getElementById("button3").setAttribute("class", "");
	document.getElementById("button4").setAttribute("class", "on");
	document.getElementById("button5").setAttribute("class", "");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty refused}'>" + 
	"<c:forEach items='${refused}' var='job' varStatus='status'>"+
	"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty refused}'>"+
	"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
	"<p>你需要多多投递</p></div></c:if>";		
}

function button9(){
	document.getElementById("button1").setAttribute("class", "");
	document.getElementById("button2").setAttribute("class", "");
	document.getElementById("button3").setAttribute("class", "");
	document.getElementById("button4").setAttribute("class", "");
	document.getElementById("button5").setAttribute("class", "on");
	document.getElementById("st-nodate").innerHTML=" <c:if test='${!empty notFit}'>" + 
	"<c:forEach items='${notFit}' var='job' varStatus='status'>"+
	"${job.jobname}&nbsp;&nbsp;&nbsp;${job.companyname}<br></c:forEach> </c:if><c:if test='${empty notFit}'>"+
	"<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>"+
	"<p>你需要多多投递</p></div></c:if>";		
}



</script>
</head>

<body rlt="1">
	<div id="root" class="zp">
		<div class="zp-header clearfix">
			<div class="zp-container">
				<div class="zp-top-menu zp-container">
					<div class="clearfix zp-top-menu__header">
						<div class="fl">
							<div>
								<span class="top-menu-city">大连站</span> 
							</div>
						</div>
						<div class="fr">
							<div class="zp-welcome">
								<span id="welcome"
									onclick="dyweTrackEvent('companysize','postsearchsetting001')">欢迎回来</span>
								<div class="zp-welcome__username">
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
			</div>
		</div>
		<div class="zp-main zp-container clearfix">
			<div class="st scheduletab fl">
				<!---->
				<div onselectstart="return false" class="st-nav">
					<ul>
						<li class="" id="button1" onclick="button1()"><a>投递成功</a></li>
						<li class="" id="button2" onclick="button2()"><a>被查看 <span class="st-dot"></span></a></li>
						<li class="" id="button3" onclick="button3()"><a>有意向 <span class="st-dot"></span></a></li>
						<li class="" id="button4" onmouseover="display()" onmouseout="undisplay()"><a>邀请面试 <span class="st-dot"></span> <span
								class="icon zp-iconfont
                    zp-jiantoucebianlan zp-welcome__arrow--down"></span></a>
							<div  class="st-nav-subnav" id="st-nav-subnav" style="display:none">
								<a onclick="button5()" class="">全部</a> <a class="" onclick="button6()">待确认</a> <a class="" onclick="button7()">已接受</a> 
								<a onclick="button8()" class="">已拒绝</a>
							</div></li>
						<li class="" id="button5" onclick="button9()"><a>不合适 <span class="st-dot"></span></a></li>
					</ul>
				</div>
				<div class="searched-unread">
					<p>最近又有 商业机器大连有限公司 等 3 家公司的HR查看了你的简历~</p>
				</div>
				<div class="js"></div>
				<div class="st-nodate" id="st-nodate">
					<img src='//desktop-bucket.zhaopin.cn/assets/noData.be6906.png'><div class='fr'><p>没有记录，好可怕 ~~~</p>
					<p>你需要多多投递</p></div>
				</div>
			</div>

			<div class="rc recommend fr">
				<div class="rc-title
            clearfix">
					<h6 class="fl">为您优选</h6>
					<a onselectstart="return false" class="fr"><img
						src="//desktop-bucket.zhaopin.cn/assets/change.88465c.svg">换一批
					</a>
				</div>
				<ul>
				<c:forEach items="${jobList }" var="job" varStatus="status">
					<li><a href="/see_job?jobid=${job.jobid}" target="_blank" class="rc-item-jobname">${job.jobname}</a> 
					<span
						class="rc-item-salary"> ${job.salary} </span> <a
						href="/see_job?jobid=${job.jobid}" target="_blank"
						class="rc-item-companyname">${job.companyname}</a></li>
					<li>
				</c:forEach>		
				</ul>
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
						src="/images/badge2.png"><span>网络110报警服务</span></a><a
						href="//img00.zhaopin.cn/new2011/bottom/license.html"
						class="a-footer__certification"><img
						src="/images/badge1.png"><span>电子营业执照</span></a>
				</div>
			</div>
		</div>
		<!---->
	</div>

	<div class="ivu-loading-bar" style="height: 2px; display: none;">
		<div class="ivu-loading-bar-inner ivu-loading-bar-inner-color-primary"
			style="width: 0%; height: 2px;"></div>
	</div>
</body>
</html>