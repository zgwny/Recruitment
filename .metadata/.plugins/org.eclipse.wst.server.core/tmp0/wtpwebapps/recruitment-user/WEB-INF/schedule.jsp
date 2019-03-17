<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<title>求职进展</title>

<link rel="stylesheet" href="css/vendors.css">
<link rel="stylesheet" href="css/schedule.css">
</head>

<body rlt="1">
	<div id="root" class="zp">
		<div class="zp-header clearfix">
			<div class="zp-container">
				<div class="zp-top-menu zp-container">
					<div class="clearfix zp-top-menu__header">
						<div class="fl">
							<div>
								<span class="top-menu-city">大连站</span> <a
									href="https://www.zhaopin.com/citymap" target="_blank"
									class="top-menu-city__change">[切换城市]</a>
							</div>
						</div>
						<div class="fr">
							<div class="zp-welcome">
								<span id="welcome"
									onclick="dyweTrackEvent('companysize','postsearchsetting001')">欢迎回来</span>
								<div class="zp-welcome__username">
									<span>张文岳</span> <i
										class="zp-welcome__username--i icon zp-iconfont
                      zp-jiantoucebianlan zp-welcome__arrow--down"></i>
									<div style="display: none;">
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
									class="fl zp-logo__link"><img src="imags/zhaopin.png"></a>
							</div>
							<div class="zp-searchbox fl zp-searchbar__box">
								<div class="zp-searchbox__search">
									<div data-v-2c8a2978="" onselectstart="return false"
										class="zp-searchbox-select">
										<div data-v-2c8a2978=""
											class="zp-searchbox-select__label
                        zp-iconfont">
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
							<div class="download download__appbg">
								<img src="imags/app_qrcode.jpg" class="download__app"> <span
									class="download__text
                    download__text--active">
									扫码下载APP </span><span class="download__text"> 扫码进小程序 </span>
							</div>
							<div class="fr zp-searchbar__qrcode"></div>
						</div>
					</div>
				</div>
				<!---->
			</div>
		</div>
		<div class="zp-main zp-container clearfix">
			<div class="st scheduletab fl">
				<!---->
				<div onselectstart="return false" class="st-nav">
					<ul>
						<li class=""><a>投递成功</a></li>
						<li class="on"><a>被查看 <span class="st-dot"></span></a></li>
						<li class=""><a>有意向 <span class="st-dot"></span></a></li>
						<li class=""><a>邀请面试 <span class="st-dot"></span> <span
								class="icon zp-iconfont
                    zp-jiantoucebianlan zp-welcome__arrow--down"></span></a>
							<div class="st-nav-subnav" style="display: none;">
								<a class="">全部</a> <a class="">待确认</a> <a class="">已接受</a> <a
									class="">已拒绝</a>
							</div></li>
						<li class=""><a>不合适 <span class="st-dot"></span></a></li>
					</ul>
				</div>
				<div class="searched-unread">
					<p>最近又有 恩梯梯数据通信软件工程（大连）有限公司 等 2 家公司的HR查看了你的简历~</p>
				</div>
				<div class="js"></div>
				<div class="st-nodate">
					<img src="//desktop-bucket.zhaopin.cn/assets/noData.be6906.png">
					<div class="fr">
						<p>没有记录，好可怕 ~~~</p>
						<p>你需要多多投递</p>
					</div>
				</div>
			</div>
			<div class="small-program">
				<img
					src="//desktop-bucket.zhaopin.cn/assets/deliver_feedback.e4b78a.png"
					class="small-program__image"> <img
					src="//desktop-bucket.zhaopin.cn/assets/close.b3be77.png"
					class="small-program__close">
				<p class="small-program__text">关注微信小程序 不错过重要通知！</p>
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
					<li><a href="https://jobs.zhaopin.com/200756236250339.htm"
						target="_blank" class="rc-item-jobname">Java高级开发工程师</a> <span
						class="rc-item-salary"> 10K-15K </span> <a
						href="http://company.zhaopin.com/CC200756236.htm" target="_blank"
						class="rc-item-companyname">沈阳稻田科技有限公司</a></li>
					<li><a
						href="https://jobs.zhaopin.com/CC337392930J00131204806.htm"
						target="_blank" class="rc-item-jobname">高级JAVA开发工程师</a> <span
						class="rc-item-salary"> 10K-15K </span> <a
						href="http://company.zhaopin.com/CZ337392930.htm" target="_blank"
						class="rc-item-companyname">希望启程网络科技(沈阳)有限公司</a></li>
					<li><a
						href="https://jobs.zhaopin.com/CC362275219J00134900402.htm"
						target="_blank" class="rc-item-jobname">高级JAVA/J2EE开发工程师（欧美）</a> <span
						class="rc-item-salary"> 8K-15K </span> <a
						href="http://company.zhaopin.com/%E5%A4%A7%E8%BF%9E%E9%9A%86%E5%9F%BA%E4%BF%A1%E6%81%AF%E6%8A%80%E6%9C%AF%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8_CC362275219.htm"
						target="_blank" class="rc-item-companyname">大连隆基信息技术有限公司</a></li>
					<li><a
						href="https://jobs.zhaopin.com/CC612383822J00165932707.htm"
						target="_blank" class="rc-item-jobname">Java开发工程师（银行科技、共享物流）</a> <span
						class="rc-item-salary"> 8K-12K </span> <a
						href="http://company.zhaopin.com/CZ612383820.htm" target="_blank"
						class="rc-item-companyname">大连盈灿科技有限公司</a></li>
					<li><a href="https://jobs.zhaopin.com/357977720250367.htm"
						target="_blank" class="rc-item-jobname">Java开发工程师</a> <span
						class="rc-item-salary"> 10K-15K </span> <a
						href="http://company.zhaopin.com/%E6%B2%88%E9%98%B3%E9%9F%A9%E9%82%A6%E8%BD%AF%E4%BB%B6%E5%BC%80%E5%8F%91%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8_CC357977720.htm"
						target="_blank" class="rc-item-companyname">沈阳韩邦软件开发有限公司</a></li>
				</ul>
			</div>
		</div>
		<div class="a-center-layout a-footer">
			<div class="a-center-layout__content">
				<div class="a-footer__top">
					<dl class="a-footer__links">
						<dt class="a-footer__title">关于</dt>
						<dd>
							<a href="//special.zhaopin.com/sh/2009/aboutus/about.html"
								target="_blank">智联招聘</a>
						</dd>
						<dd>
							<a href="//jobs.zhaopin.com/" target="_blank">人才招聘</a>
						</dd>
						<dd>
							<a href="//special.zhaopin.com/sh/2009/aboutus/contact.html"
								target="_blank">联系方式</a>
						</dd>
						<dd>
							<a href="//www.zhaopin.com/sitemap.html" target="_blank">网站地图</a>
						</dd>
					</dl>
					<dl class="a-footer__links">
						<dt class="a-footer__title">帮助</dt>
						<dd>
							<a href="//special.zhaopin.com/sh/2009/aboutus/join.html"
								target="_blank">加入智联</a>
						</dd>
						<dd>
							<a href="//www.zhaopin.com/customer-service" target="_blank">客户服务</a>
						</dd>
						<dd>
							<a href="//special.zhaopin.com/sh/2009/aboutus/law.html"
								target="_blank">法律声明</a>
						</dd>
						<dd>
							<a href="//special.zhaopin.com/sh/2009/aboutus/secrecy.html"
								target="_blank">隐私政策</a>
						</dd>
						<dd>
							<a href="//www.zhaopin.com/invoice-system" target="_blank">发票制度</a>
						</dd>
						<dd>
							<a href="//www.zhaopin.com/service-agreement" target="_blank">用户协议</a>
						</dd>
					</dl>
					<div class="a-footer__slogan">
						<p class="a-footer__title">智联招聘 更懂你的价值</p>
						<div class="a-footer__qrcode">
							<span class="a-footer__mini-program">小程序</span><span
								class="a-footer__wechat">官方微信</span>
						</div>
					</div>
				</div>
				<div class="a-footer__bottom">
					<div class="a-footer__copyright">
						<p>未经 Zhaopin.com 同意，不得转载本网站之所有招聘信息及作品 智联招聘网版权所有</p>
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
							src="//images.zhaopin.cn/2012/img/knetSealLogo.png">
						<!----></a>
					</div>
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