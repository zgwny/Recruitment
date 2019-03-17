<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<title>我的简历</title>

<link rel="stylesheet" href="css/vendors.css">
<link rel="stylesheet" href="css/resume.css">
<link rel="stylesheet" type="text/css" href="css/iconfont.css">
<script type="text/javascript" src="js/see_resume.js"></script>
</head>
<body>
	<div id="root" class="zp">
		<div class="zp-header clearfix">
			<div class="zp-container">
				<div class="zp-top-menu zp-container">
					<div class="clearfix zp-top-menu__header">
						<div class="fl">
							<div>
								<span class="top-menu-city">北京站</span> <a
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
										class="zp-welcome__username--i icon zp-iconfont zp-jiantoucebianlan zp-welcome__arrow--down"></i>
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
								<i class="icon zp-iconfont zp-dianhua call-center__telephone"></i>400-885-9898
							</div>
						</div>
					</div>
				</div>
				<div class="zp-searchbar__wrapper">
					<div class="zp-searchbar clearfix">
						<div class="clearfix">
							<div class="fl zp-logo">
								<a href="https://www.zhaopin.com" target="_blank"
									class="fl zp-logo__link"><img
									src="//desktop-bucket.zhaopin.cn/assets/zhaopin.465947.png"></a>
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
										class="icon zp-iconfont zp-search zp-searchbox__button__icon"></i></a>
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
		<div class="zp-main-center clearfix">
			<div class="resume-tabs-wrapper clearfix zp-tabs">
				<span title="张文岳 的简历"
					class="resume-tabs-item fl resume-tabs-item-active"> 张文岳 的简历
				</span>
			</div>
			<div data-v-0a9de6af="" class="zp-left-container">
				<div data-v-3c122314="" data-v-0a9de6af="">
					<div data-v-3c122314="" class="resume-profile-wrapper jump-to"
						number="0">
						<div class="profile-pre-wrapper" id="profile-pre-wrapper">
							<c:if test="${!empty candidate}">
								<img
									src="//mypics.zhaopin.cn//avatar/2018/1/19/ce2e873a-2b33-421a-a0f5-926a7a7d8110.jpg"
									class="profile-pre-head">
								<p class="profile-pre-name clearfix">
									<span title="S{candidate.name}" class="fl">${candidate.name}</span>
									<span class="profile-pre-name__update-time">
										更新时间：2018-11-22</span>
								</p>
								<p class="profile-pre-info">
									<span>${candidate.sex}</span> <span>${candidate.age}岁</span> <span>${candidate.address}</span>
									<span>${candidate.experience}</span>
								</p>
								<p class="profile-pre-contact clearfix">
									<i class="iconfont icon-resume-phone fl"></i> <span class="fl">${candidate.phone}</span>
									<i class="iconfont icon-resume-email fl"></i> <span class="fl">${candidate.email}</span>
								</p>
							</c:if>
							<span class="resume-profile-edit" onclick="profileEdit()"><span
								class="iconfont icon-resume-edit"></span>编辑</span>
						</div>
						<!--点击编辑按钮插入新的div,不限制之前的div-->
						<div class="profile-edit-wrapper" id="profile-edit-wrapper"
							style="display: none;">
							<p class="profile-edit-title">个人信息</p>
							<c:if test="${empty candidate}">
								<form class="profile-edit-form clearfix"
									action="resume/profile/add" method="POST">
							</c:if>
							<c:if test="${!empty candidate}">
								<form class="profile-edit-form clearfix"
									action="resume/profile/edit" method="POST">
									<input type="hidden" name="candidateid"
										value="${candidate.candidateid}">
							</c:if>
							<div class="profile-edit-item clearfix">
								<span class="profile-edit-item-label fl"> 姓名: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="name" type="text" placeholder="必填" maxlength="100"
										value="${candidate.name}" class="ivu-input">
								</div>
							</div>
							<div class="profile-edit-item clearfix">
								<span class="profile-edit-item-label fl"> 性别: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="sex" type="text" placeholder="必填" maxlength="100"
										value="${candidate.age}" class="ivu-input">
								</div>
							</div>
							<div class="profile-edit-item clearfix">
								<span class="profile-edit-item-label fl"> 年龄: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="age" type="text" placeholder="必填" maxlength="100"
										value="${candidate.age}" class="ivu-input">岁
								</div>
							</div>
							<div class="profile-edit-item clearfix">
								<span class="profile-edit-item-label fl"> 工作经验: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="experience" type="text" placeholder="必填"
										maxlength="100" value="${candidate.experience}"
										class="ivu-input">
								</div>
							</div>
							<div class="profile-edit-item clearfix">
								<span class="profile-edit-item-label fl"> 现居地: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="address" type="text" placeholder="必填"
										maxlength="100" value="${candidate.address}" class="ivu-input">
								</div>
							</div>
							<div class="profile-edit-item clearfix">
								<span class="profile-edit-item-label fl"> 联系方式: </span>
								<!--  <p>
											<span>158****9493</span> <a
												href="//i.zhaopin.com/ResumeCenter/AccountSet/Index?tab=2"
												target="_blank">修改</a>
										</p>-->
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="phone" type="text" placeholder="必填"
										maxlength="100" value="${candidate.phone}" class="ivu-input">
								</div>
							</div>
							<div class="profile-edit-item clearfix">
								<span class="profile-edit-item-label fl"> 电子邮箱: </span>
								<!-- <p>
											<span>1584113****@139.com</span> <a
												href="//i.zhaopin.com/ResumeCenter/AccountSet/Index?tab=3"
												target="_blank">修改</a>
										</p>-->
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="email" type="text" placeholder="必填"
										maxlength="100" value="${candidate.email}" class="ivu-input">
								</div>
							</div>
							<!---->
							<p class="profile-edit-btns clearfix">
								<button class="profile-edit-btns-sure fl" type="submit">
									保存并更新</button>
								<button onclick="profileEditCancle()"
									class="profile-edit-btns-cancel fl" type="reset">取消</button>
							</p>
							</form>
						</div>
					</div>
					<div data-v-3c122314="" class="resume-wanna-wrapper jump-to"
						number="1">
						<p class="wanna-title clearfix">
							求职意向 <span onclick="wannaEdit()" class="wanna-edit fr"><i
								class="iconfont icon-resume-edit"></i> 编辑 </span>
						</p>

						<div class="wanna-pre-wrapper clearfix" id="wanna-pre-wrapper">
							<c:if test="${!empty want}">
								<div class="clearfix">
									<div class="wanna-pre-item fl">
										<label class="fl">求职状态:</label>
										<p title="${want.workstatus}">${want.workstatus}</p>
									</div>
									<div class="wanna-pre-item fl">
										<label class="fl">期望工作地点:</label>
										<p title="${want.wantcity}">${want.wantcity}</p>
									</div>
								</div>
								<div class="clearfix">
									<div class="wanna-pre-item fl clearfix">
										<label class="fl">期望从事行业:</label>
										<p title="${want.wantindustry}">${want.wantindustry}</p>
									</div>
									<div class="wanna-pre-item fl clearfix">
										<label class="fl">期望从事职业:</label>
										<p title="${want.wantjob}">${want.wantjob}</p>
									</div>
								</div>
								<div class="clearfix">
									<div class="wanna-pre-item fl">
										<label class="fl">税前期望月薪:</label>
										<p title="${want.wantsalary}元/月">${want.wantsalary}元/月</p>
									</div>
									<div class="wanna-pre-item fl">
										<label class="fl">期望工作性质:</label>
										<p title="${want.nature}">${want.nature}</p>
									</div>
								</div>
							</c:if>
						</div>

						<div class="wanna-edit-wrapper" id="wanna-edit-wrapper"
							style="display: none">
							<c:if test="${empty want}">
								<form class="wanna-edit-form" action="resume/want/add"
									method="post">
							</c:if>
							<c:if test="${!empty want}">
								<form class="wanna-edit-form" action="resume/want/edit"
									method="post">
									<input type="hidden" name="wantid" value="${want.wantid}">
							</c:if>
							<div class="wanna-edit-item clearfix">
								<span class="wanna-edit-item-label fl"> 期望工作性质: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<select class="ivu-input" name="nature" style="width: 300px">
										<c:forEach items="${natures}" var="nature" varStatus="status">
											<c:if test="${want.workstatus eq nature.itemvalue}">
												<option value="${nature.itemkey}" selected>${nature.itemvalue}</option>
											</c:if>
											<c:if test="${want.workstatus ne nature.itemvalue}">
												<option value="${nature.itemkey}">${nature.itemvalue}</option>
											</c:if>

										</c:forEach>
									</select>
								</div>
							</div>
							<div class="wanna-edit-item clearfix">
								<span class="wanna-edit-item-label fl"> 期望工作地点: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="wantcity" type="text" placeholder="必填"
										style="width: 300px" class="ivu-input">
								</div>
							</div>
							<div class="wanna-edit-item clearfix">
								<span class="wanna-edit-item-label fl"> 期望从事行业: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<select name="wantindustry" class="ivu-input"
										style="width: 300px">
										<c:forEach items="${directions}" var="direction"
											varStatus="status">
											<c:if test="${want.wantindustry eq direction.itemvalue}">
												<option value="${direction.itemkey}" selected>${direction.itemvalue}</option>
											</c:if>
											<c:if test="${want.wantindustry ne direction.itemvalue}">
												<option value="${direction.itemkey}">${direction.itemvalue}</option>
											</c:if>
										</c:forEach>

									</select>
								</div>
							</div>
							<div class="wanna-edit-item clearfix">
								<span class="wanna-edit-item-label fl"> 期望从事职业: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<input name="wantjob" type="text" placeholder="必填"
										style="width: 300px" class="ivu-input">
								</div>
							</div>
							<div class="wanna-edit-item clearfix">
								<span class="wanna-edit-item-label fl"> 税前期望月薪: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<select name="wantsalary" class="ivu-input"
										style="width: 300px">

										<c:forEach items="${salaries}" var="salary" varStatus="status">
											<c:if test="${want.wantsalary eq salary.itemvalue}">
												<option value="${salary.itemkey}" selected>${salary.itemvalue}</option>
											</c:if>
											<c:if test="${want.wantsalary ne salary.itemvalue}">
												<option value="${salary.itemkey}">${salary.itemvalue}</option>
											</c:if>
										</c:forEach>

									</select>
								</div>
							</div>
							<div class="wanna-edit-item clearfix">
								<span class="wanna-edit-item-label fl"> 求职状态: </span>
								<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
									<i
										class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
									<select name="workstatus" class="ivu-input"
										style="width: 300px">
										<c:forEach items="${workstatus}" var="workstate"
											varStatus="status">
											<c:if test="${want.workstatus eq workstate.itemvalue}">
												<option value="${workstate.itemkey}" selected>${workstate.itemvalue}</option>
											</c:if>
											<c:if test="${want.workstatus ne workstate.itemvalue}">
												<option value="${workstate.itemkey}">${workstate.itemvalue}</option>
											</c:if>
										</c:forEach>
									</select>
								</div>
							</div>
							<p class="wanna-edit-btns clearfix">
								<button class="wanna-edit-btns-sure fl" type="submit">保存并更新</button>
								<button class="wanna-edit-btns-cancel fl"
									onclick="wannaEditCancle()" type="reset">取消</button>
							</p>
							</form>
						</div>
					</div>
					<div data-v-3c122314="" class="resume-job-exp-wrapper jump-to"
						number="2">
						<p class="job-exp-title clearfix">
							工作经验 <span onselectstart="return false;" class="job-exp-add fr"
								onclick="jobExpAdd()"><i class="iconfont icon-resume-add"></i>
								添加工作经验 </span>
						</p>
						<div onselectstart="return false;" class="job-exp-add-null"
							style="display: none;">
							<i class="iconfont icon-resume-add"></i> 添加工作经验
						</div>
						<!--工作经历开发-->
						<div class="job-exp-edit-wrapper" id="job-exp-add-wrapper"
							style="display: none">
							<form class="job-exp-edit-form"
								action="resume/workExperience/add" method="post">
								<div class="job-exp-edit-item clearfix">
									<span class="job-exp-edit-label fl"> 公司名称: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<i
											class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
										<input name="company" type="text" placeholder="必填"
											style="width: 300px" class="ivu-input">
									</div>
								</div>
								<div class="job-exp-edit-item clearfix">
									<span class="job-exp-edit-label fl"> 职位名称: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<i
											class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
										<input name="jobname" type="text" placeholder="必填"
											style="width: 300px" class="ivu-input">
									</div>
								</div>
								<div class="job-exp-edit-item clearfix">
									<span class="job-exp-edit-label fl"> 在职时间: </span>
									<div class="zpfe-iview-date-picker ivu-date-picker"
										style="width: 254px;">
										<div class="ivu-date-picker-rel">
											<div
												class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
												<!---->
												<input name="start" autocomplete="off" spellcheck="false"
													type="text" placeholder="输入开始时间" class="ivu-input">
												<!---->
											</div>
										</div>
									</div>
									<span class="job-exp-edit-line"></span>
									<div class="zpfe-iview-date-picker ivu-date-picker"
										style="width: 254px;">
										<div class="ivu-date-picker-rel">
											<div
												class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
												<input name="end" autocomplete="off" spellcheck="false"
													type="text" placeholder="输入结束时间" class="ivu-input">
												<!---->
											</div>
										</div>
									</div>
								</div>
								<div class="job-exp-edit-item clearfix">
									<span class="job-exp-edit-label fl"> 税前月薪: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<i
											class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
										<select name="salary" class="ivu-input" style="width: 300px">

											<c:forEach items="${salaries}" var="salary"
												varStatus="status">
												<option value="${salary.itemkey}">${salary.itemvalue}</option>
											</c:forEach>

										</select>
									</div>
									<span class="job-exp-edit-label fl" style="margin: 0px 8px;">元/月</span>
								</div>
								<div class="job-exp-edit-item clearfix">
									<span class="job-exp-edit-label fl"> 工作描述: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<textarea name="description" autocomplete="off"
											spellcheck="false" placeholder="必填" rows="2"
											class="ivu-input"></textarea>
									</div>
									<p class="form-error-tip" style="clear: both; display: none;">请最少输入10个字符</p>
									<p class="job-exp-edit-textarea-tips">
										填写文字在100个字以上评定等级，少于不计算，内容越详细，等级越高 <span class="fr">
											还可输入 3000 个字 </span>
									</p>
								</div>
								<p class="job-exp-edit-btns clearfix">
									<button class="job-exp-edit-btns-sure fl" type="submit">保存并更新</button>
									<button class="job-exp-edit-btns-cancel fl"
										onclick="jobExpAddCancle()" type="reset">取消</button>
									<span class="iconfont icon-resume-delete fr"
										style="display: none;"></span>
								</p>
							</form>
						</div>
						<div class="job-exp-pre-wrapper">
							<div class="job-exp-pre-item">
								<c:forEach items="${works}" var="work" varStatus="status">
									<p class="job-exp-pre-item-title">
										<span title="${work.company}">${work.company}</span> <span
											class="job-exp-pre-item-time fr">${work.start}-${work.end}</span>
										<span class="job-exp-pre-item-edit fr"
											onclick="jobExpEdit(${work.id})"><i
											class="iconfont icon-resume-edit"></i> 编辑 </span>
									</p>
									<p class="job-exp-pre-item-detail">
										<span title="${work.jobname}" class="fl">
											${work.jobname}</span>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${work.salary}元/月
									</p>
									<div class="job-exp-pre-item-detail">
										<pre>${work.description}</pre>
									</div>

									<!--工作经历编辑-->
									<div class="job-exp-edit-wrapper"
										id="job-exp-edit-wrapper-${work.id}" style="display: none">
										<form class="job-exp-edit-form"
											action="resume/workExperience/edit" method="post">
											<input id="job-exp-edit-id-${work.id}" type="hidden"
												name="id">
											<div class="job-exp-edit-item clearfix">
												<span class="job-exp-edit-label fl"> 公司名称: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<i
														class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
													<input name="company" type="text" value="${work.company}"
														placeholder="必填" style="width: 300px" class="ivu-input">
												</div>
											</div>
											<div class="job-exp-edit-item clearfix">
												<span class="job-exp-edit-label fl"> 职位名称: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<i
														class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
													<input name="jobname" type="text" value="${work.jobname}"
														placeholder="必填" style="width: 300px" class="ivu-input">
												</div>
											</div>
											<div class="job-exp-edit-item clearfix">
												<span class="job-exp-edit-label fl"> 在职时间: </span>
												<div class="zpfe-iview-date-picker ivu-date-picker"
													style="width: 254px;">
													<div class="ivu-date-picker-rel">
														<div
															class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
															<input name="start" value="${work.start}"
																autocomplete="off" spellcheck="false" type="text"
																placeholder="选择开始时间" readonly="readonly"
																class="ivu-input">
														</div>
													</div>
													<div class="ivu-select-dropdown" style="display: none;">
														<div></div>
													</div>
												</div>
												<span class="job-exp-edit-line"></span>
												<div class="zpfe-iview-date-picker ivu-date-picker"
													style="width: 254px;">
													<div class="ivu-date-picker-rel">
														<div
															class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
															<input name="end" autocomplete="off" value="${work.end}"
																spellcheck="false" type="text" placeholder="选择结束时间"
																readonly="readonly" class="ivu-input">
														</div>
													</div>
													<div class="ivu-select-dropdown" style="display: none;">
														<div></div>
													</div>
												</div>
											</div>
											<div class="job-exp-edit-item clearfix">
												<span class="job-exp-edit-label fl"> 税前月薪: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<i
														class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
													<select name="salary" class="ivu-input"
														style="width: 300px">
														<c:forEach items="${salaries}" var="salary"
															varStatus="status">
															<c:if test="${work.salary eq salary.itemvalue}">
																<option value="${salary.itemkey}" selected>${salary.itemvalue}</option>
															</c:if>
															<c:if test="${work.salary ne salary.itemvalue}">
																<option value="${salary.itemkey}">${salary.itemvalue}</option>
															</c:if>
														</c:forEach>
													</select>
												</div>
												<span class="job-exp-edit-label fl" style="margin: 0px 8px;">元/月</span>
											</div>
											<div class="job-exp-edit-item clearfix">
												<span class="job-exp-edit-label fl"> 工作描述: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<textarea name="description" placeholder="必填" rows="2"
														class="ivu-input">${work.description}</textarea>
												</div>
												<p class="form-error-tip"
													style="clear: both; display: none;">请最少输入10个字符</p>
												<p class="job-exp-edit-textarea-tips">
													填写文字在100个字以上评定等级，少于不计算，内容越详细，等级越高 <span class="fr">
														还可输入 3000 个字 </span>
												</p>
											</div>
											<p class="job-exp-edit-btns clearfix">
												<button class="job-exp-edit-btns-sure fl" type="submit">保存并更新</button>
												<button class="job-exp-edit-btns-cancel fl"
													onclick="jobExpEditCancle(${work.id})" type="reset">取消</button>
												<span class="iconfont icon-resume-delete fr"
													style="display: none;"></span>
											</p>
										</form>
									</div>
								</c:forEach>
							</div>
							<p class="clearfix">
								<span class="show-all fr" style="display: none;"> 查看全部 <i
									class="iconfont icon-resume-arrow-down"></i></span>
							</p>
						</div>
					</div>
					<div data-v-3c122314="" class="resume-project-exp-wrapper jump-to"
						number="3">
						<p class="project-exp-title clearfix">
							项目经验 <span onselectstart="return false;"
								class="project-exp-add fr" onclick="projectExpAdd()"><i
								class="iconfont icon-resume-add"></i> 添加项目经验 </span>
						</p>
						<div onselectstart="return false;" class="project-exp-add-null"
							style="display: none;">
							<i class="iconfont icon-resume-add"></i> 添加项目经验
						</div>
						<div class="project-exp-edit-wrapper" id="project-exp-add-wrapper"
							style="display: none;">
							<form class="project-exp-edit-form" action="resume/project/add"
								method="post">
								<div class="project-exp-edit-item clearfix">
									<span class="project-exp-edit-label fl"> 项目名称: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<i
											class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
										<input name="name" type="text" placeholder="必填"
											style="width: 300px" class="ivu-input">
									</div>
								</div>
								<div class="project-exp-edit-item clearfix">
									<span class="project-exp-edit-label fl"> 项目时间: </span>
									<div class="zpfe-iview-date-picker ivu-date-picker"
										style="width: 254px;">
										<div class="ivu-date-picker-rel">
											<div
												class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
												<input name="start" autocomplete="off" spellcheck="false"
													type="text" placeholder="输入开始时间" class="ivu-input">
											</div>
										</div>
									</div>
									<span class="project-exp-edit-line"></span>
									<div class="zpfe-iview-date-picker ivu-date-picker"
										style="width: 254px;">
										<div class="ivu-date-picker-rel">
											<div
												class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
												<input name="end" type="text" placeholder="输入结束时间"
													class="ivu-input">
											</div>
										</div>
									</div>
								</div>
								<div class="project-exp-edit-item height-auto clearfix">
									<span class="project-exp-edit-label fl"> 项目描述: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<textarea name="description" placeholder="更完善的项目信息有助于HR快速找到你"
											rows="2" class="ivu-input"></textarea>
									</div>
									<p class="form-error-tip" style="display: none;">请输入项目描述</p>
									<p class="project-exp-edit-textarea-tips">
										填写文字在100个字以上评定等级，少于不计算，内容越详细，等级越高 <span class="fr">
											还可输入 3000 个字 </span>
									</p>
								</div>
								<div class="project-exp-edit-item height-auto clearfix">
									<span class="project-exp-edit-label fl"> 个人职责: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<textarea name="responsible" placeholder="更完善的工作信息有助于提升你的竞争力"
											rows="2" class="ivu-input"></textarea>
									</div>
									<p class="form-error-tip" style="display: none;">请输入个人职责</p>
									<p class="project-exp-edit-textarea-tips">
										填写文字在100个字以上评定等级，少于不计算，内容越详细，等级越高 <span class="fr">
											还可输入 3000 个字 </span>
									</p>
								</div>
								<div class="project-exp-edit-item clearfix">
									<span class="project-exp-edit-label fl"> 所属公司: </span>
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<i
											class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
										<input name="company" type="text" placeholder="必填"
											style="width: 300px" class="ivu-input">
									</div>
								</div>
								<p class="project-exp-edit-btns clearfix">
									<button class="project-exp-edit-btns-sure fl" type="submit">保存并更新</button>
									<button class="project-exp-edit-btns-cancel fl"
										onclick="projectExpAddCancle()" type="reset">取消</button>
									<span class="iconfont icon-resume-delete fr"
										style="display: none;"></span>
								</p>
							</form>
						</div>
						<div class="project-exp-pre-wrapper">
							<div class="project-exp-pre-item">
								<c:forEach items="${projects}" var="project" varStatus="status">
									<p class="project-exp-pre-item-title">
										<span title="">${project.name}</span> <span
											class="project-exp-pre-item-time fr">${project.start}-${project.end}</span>
										<span class="project-exp-pre-item-edit fr"
											onclick="projectExpEdit(${project.id})"><i
											class="iconfont icon-resume-edit"></i> 编辑 </span>
									</p>
									<p class="project-exp-pre-item-salary">项目描述</p>
									<div class="project-exp-pre-item-detail">
										<pre>${project.description}</pre>
									</div>
									<div class="project-exp-edit-wrapper"
										id="project-exp-edit-wrapper-${project.id}"
										style="display: none;">
										<form class="project-exp-edit-form"
											action="resume/project/edit" method="post">
											<input name="id" type="hidden"
												id="project-exp-edit-id-${project.id}">
											<div class="project-exp-edit-item clearfix">
												<span class="project-exp-edit-label fl"> 项目名称: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<i
														class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
													<input value="${project.name}" name="name" type="text"
														placeholder="必填" maxlength="100" class="ivu-input">
												</div>
											</div>
											<div class="project-exp-edit-item clearfix">
												<span class="project-exp-edit-label fl"> 项目时间: </span>
												<div class="zpfe-iview-date-picker ivu-date-picker"
													style="width: 254px;">
													<div class="ivu-date-picker-rel">
														<div
															class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
															<input name="start" type="text" value="${project.start}"
																placeholder="输入开始时间" class="ivu-input">
															<!---->
														</div>
													</div>
												</div>
												<span class="project-exp-edit-line"></span>
												<div class="zpfe-iview-date-picker ivu-date-picker"
													style="width: 254px;">
													<div class="ivu-date-picker-rel">
														<div
															class="ivu-input-wrapper ivu-input-type ivu-date-picker-editor">
															<input name="end" type="text" value="${project.end}"
																placeholder="输入结束时间" class="ivu-input">
															<!---->
														</div>
													</div>
												</div>
											</div>
											<div class="project-exp-edit-item height-auto clearfix">
												<span class="project-exp-edit-label fl"> 项目描述: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<textarea name="description" autocomplete="off"
														spellcheck="false" placeholder="更完善的项目信息有助于HR快速找到你"
														rows="2" class="ivu-input">${project.description}</textarea>
												</div>
												<p class="form-error-tip" style="display: none;">请输入项目描述</p>
												<p class="project-exp-edit-textarea-tips">
													填写文字在100个字以上评定等级，少于不计算，内容越详细，等级越高 <span class="fr">
														还可输入 2965 个字 </span>
												</p>
											</div>
											<div class="project-exp-edit-item height-auto clearfix">
												<span class="project-exp-edit-label fl"> 个人职责: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<textarea autocomplete="off" spellcheck="false"
														name="responsible" placeholder="更完善的工作信息有助于提升你的竞争力"
														rows="2" class="ivu-input">${project.responsible}</textarea>
												</div>
												<p class="form-error-tip" style="display: none;">请输入个人职责</p>
												<p class="project-exp-edit-textarea-tips">
													填写文字在100个字以上评定等级，少于不计算，内容越详细，等级越高 <span class="fr">
														还可输入 2932 个字 </span>
												</p>
											</div>
											<div class="project-exp-edit-item clearfix">
												<span class="project-exp-edit-label fl"> 所属公司: </span>
												<div
													class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
													<i
														class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
													<input value="${project.company}" name="company"
														type="text" placeholder="必填" maxlength="100"
														class="ivu-input">
												</div>
											</div>
											<p class="project-exp-edit-btns clearfix">
												<button class="project-exp-edit-btns-sure fl" type="submit">保存并更新
												</button>
												<button class="project-exp-edit-btns-cancel fl"
													onclick="projectExpEditCancle(${project.id})" type="reset">取消</button>
												<span class="iconfont icon-resume-delete fr"></span>
											</p>
										</form>
									</div>
								</c:forEach>
							</div>
							<p class="clearfix">
								<span class="show-all fr" style="display: none;"> 查看全部 <i
									class="iconfont icon-resume-arrow-down"></i></span>
							</p>
						</div>
					</div>
					<div data-v-560d03af="" data-v-3c122314=""
						class="resume-job-exp-wrapper jump-to" number="4">
						<p data-v-560d03af="" class="edu-title-container clearfix">
							<span data-v-560d03af="" class="edu-experience">教育经历</span> <span
								data-v-560d03af="" onselectstart="return false "
								class="edu-experience-add-right fr" onclick="eduExpAdd()"><i
								data-v-560d03af="" class="iconfont icon-resume-add"></i> 添加教育经历</span>
						</p>
						<!--添加教育经历-->
						<div data-v-67cfe24f="" data-v-560d03af="" class="edu-edit-panel"
							id="edu-Add-panel" style="display: none;">
							<form action="resume/education/add" method="post">
								<ul data-v-67cfe24f="" class="edu-edit-ul">
									<li data-v-67cfe24f=""><span data-v-67cfe24f=""
										class="edu-edit-title"> 学校名称： </span> <input name="school"
										data-v-67cfe24f="" type="text" placeholder="必填"
										style="width: 300px"></li>
									<li data-v-67cfe24f=""><span data-v-67cfe24f=""
										class="edu-edit-title">就读时间：</span> <input name="start"
										data-v-67cfe24f="" type="text" placeholder="必填"
										style="width: 300px"></li>
									<li data-v-67cfe24f=""><span data-v-67cfe24f=""
										class="edu-edit-title">所学专业：</span> <input name="major"
										data-v-67cfe24f="" type="text" placeholder="必填"
										style="width: 300px"></li>
									<li data-v-67cfe24f=""><span data-v-67cfe24f=""
										class="edu-edit-title"> 学历/学位： </span> <select
										name="education" class="ivu-input" style="width: 300px">
											<c:forEach items="${educationDictionary}" var="eduDic"
												varStatus="status">
												<option value="${eduDic.itemkey}">${eduDic.itemvalue}</option>												<
											</c:forEach>
									</select></li>
								</ul>
								<div data-v-67cfe24f="" class="edu-edit-bottom">
									<button data-v-67cfe24f="" onselectstart="return false "
										class="save-btn" type="submit">保存并更新</button>
									<button data-v-67cfe24f="" class="quit-btn"
										onclick="eduExpAddCancle()" type="reset">取消</button>
									<!---->
								</div>
							</form>
						</div>
						<ul data-v-560d03af="" class="edu-ul">
							<c:forEach items="${educations}" var="education"
								varStatus="status">
								<li data-v-560d03af="" class="clearfix"><span
									data-v-560d03af="" class="edu-ul-title">
										${education.school}</span> <span data-v-560d03af=""
									class="edu-ul-name"> ${education.major} </span> <span
									data-v-560d03af="" class="edu-ul-qualification">${education.education}
								</span> <span data-v-560d03af="" class="edu-ul-timerange">${education.start}年入学</span>
									<span data-v-560d03af="" onclick="eduExpEdit(${education.id})"
									class="zp-edit-icon iconfont icon-resume-edit fr"> 编辑</span>
									<div data-v-67cfe24f="" data-v-560d03af=""
										class="edu-edit-panel" id="edu-edit-panel-${education.id}"
										style="display: none;">
										<form action="resume/education/edit" method="post">
											<input name="id" type="hidden"
												id="edu-edit-id-${education.id}">
											<ul data-v-67cfe24f="" class="edu-edit-ul">
												<li data-v-67cfe24f=""><span data-v-67cfe24f=""
													class="edu-edit-title"> 学校名称： </span> <input
													data-v-67cfe24f="" type="text" name="school"
													value="${education.school}" placeholder="必填"
													style="width: 300px"></li>
												<li data-v-67cfe24f=""><span data-v-67cfe24f=""
													class="edu-edit-title">所学专业：</span> <input
													data-v-67cfe24f="" type="text" name="major"
													value="${education.major}" placeholder="必填"
													style="width: 300px"></li>
												<li data-v-67cfe24f=""><span data-v-67cfe24f=""
													class="edu-edit-title">入学时间：</span> <input
													data-v-67cfe24f="" type="text" name="start"
													value="${education.start}" placeholder="必填"
													style="width: 300px"></li>
												<li data-v-67cfe24f=""><span data-v-67cfe24f=""
													class="edu-edit-title"> 学历/学位： </span> <select
													name="education" class="ivu-input" style="width: 300px">
														<c:forEach items="${educationDictionary}" var="eduDic"
															varStatus="status">
															<c:if test="${education.education eq eduDic.itemvalue}">
																<option value="${eduDic.itemkey}" selected>${eduDic.itemvalue}</option>
															</c:if>
															<c:if test="${education.education ne eduDic.itemvalue}">
																<option value="${eduDic.itemkey}">${eduDic.itemvalue}</option>
															</c:if>
														</c:forEach>
												</select></li>
											</ul>
											<div data-v-67cfe24f="" class="edu-edit-bottom">
												<button data-v-67cfe24f="" onselectstart="return false "
													class="save-btn" type="submit">保存并更新</button>
												<button data-v-67cfe24f="" class="quit-btn"
													onclick="eduExpEditCancle(${education.id})" type="reset">取消</button>
												<i data-v-67cfe24f=""
													class="iconfont icon-resume-delete del-hover"></i>
											</div>
										</form>
									</div></li>
							</c:forEach>
						</ul>
					</div>
					<div data-v-225d6650="" data-v-3c122314=""
						class="resume-training-exp-wrapper jump-to" number="5">
						<p data-v-225d6650="" class="training-title">
							培训经历
							<!---->
						</p>
						<div data-v-225d6650="" onselectstart="return false "
							class="training-add">
							<i data-v-225d6650="" class="iconfont icon-resume-add"></i>
							添加培训经历
						</div>
						<!---->
						<ul data-v-225d6650="" class="training-ul"></ul>
					</div>
					<div data-v-43362fb4="" data-v-3c122314="" class="zp-wrap jump-to"
						number="6">
						<div data-v-43362fb4="">
							<div data-v-43362fb4="" class="zp-language">
								<span data-v-43362fb4="" class="zp-language-title">语言能力</span> <span
									data-v-43362fb4="" onselectstart="return false "
									class="zp-language-add-right fr" onclick="zplanguaAdd()"><i
									data-v-43362fb4="" class="iconfont icon-resume-add"></i> 添加语言能力</span>
							</div>
							<!--语言能力添加-->
							<div data-v-23a1cf55="" data-v-43362fb4=""
								class="language-edit-panel" id="language-add-panel"
								style="display: none;">
								<form action="resume/skill/add" method="post">
									<ul data-v-23a1cf55="" class="language-edit-ul">
										<li data-v-23a1cf55=""><span data-v-23a1cf55=""
											class="language-edit-title">语&nbsp;&nbsp;&nbsp;&nbsp;种：</span>
											<input data-v-67cfe24f="" type="text" name="name"
											placeholder="必填" style="width: 300px"></li>
										<li data-v-23a1cf55=""><span data-v-23a1cf55=""
											class="language-edit-title">听说能力：</span> <select
											name="listenskill" class="ivu-input" style="width: 300px">
												<c:forEach items="${masters}" var="master"
													varStatus="status">
													<c:if test="${skill.listenskill eq master.itemvalue}">
														<option value="${master.itemkey}" selected>${master.itemvalue}</option>
													</c:if>
													<c:if test="${skill.listenskill ne master.itemvalue}">
														<option value="${master.itemkey}">${master.itemvalue}</option>
													</c:if>
												</c:forEach>
										</select>
										<li data-v-23a1cf55=""><span data-v-23a1cf55=""
											class="language-edit-title">读写能力：</span> <select
											name="writeskill" class="ivu-input" style="width: 300px">
												<c:forEach items="${masters}" var="master"
													varStatus="status">
													<option value="${master.itemkey}">${master.itemvalue}</option>
												</c:forEach>
										</select></li>
									</ul>
									<div data-v-23a1cf55="" class="language-edit-bottom">
										<button data-v-23a1cf55="" onselectstart="return false "
											class="save-btn  zp-blue-button" type="submit">保存并更新</button>
										<button data-v-23a1cf55="" class="quit-btn"
											onclick="zplanguaAddCancle()" type="reset">取消</button>
										<!---->
									</div>
								</form>
							</div>
							<div data-v-43362fb4="" class="zp-language-list">
								<c:forEach items="${skills}" var="skill" varStatus="status">
									<ul data-v-43362fb4="">
										<li data-v-43362fb4="" class="clearfix"><span
											data-v-43362fb4="" class="zp-language-name">${skill.name}</span>
											<span data-v-43362fb4="" class="zp-language-say">听书能力：&nbsp;&nbsp;${skill.listenskill}</span>
											<span data-v-43362fb4="" class="zp-language-write">读写能力：&nbsp;&nbsp;${skill.writeskill}</span>
											<span data-v-43362fb4=""
											class="zp-edit-icon iconfont icon-resume-edit"
											onclick="zplanguaEdit(${skill.id})"> 编辑 </span> <!--语言能力编辑-->
											<div data-v-23a1cf55="" data-v-43362fb4=""
												class="language-edit-panel"
												id="language-edit-panel-${skill.id}" style="display: none;">
												<form action="resume/skill/edit" method="post">
													<input type="hidden" name="id"
														id="language-edit-id-${skill.id}">
													<ul data-v-23a1cf55="" class="language-edit-ul">
														<li data-v-23a1cf55=""><span data-v-23a1cf55=""
															class="language-edit-title">语&nbsp;&nbsp;&nbsp;&nbsp;种：</span>

															<input name="name" value="${skill.name}" type="text"
															placeholder="必填" style="width: 300px" class="ivu-input">
														</li>
														<li data-v-23a1cf55=""><span data-v-23a1cf55=""
															class="language-edit-title">听说能力：</span> <select
															name="listenskill" class="ivu-input" style="width: 300px">
																<c:forEach items="${masters}" var="master"
																	varStatus="status">
																	<c:if test="${skill.listenskill eq master.itemvalue}">
																		<option value="${master.itemkey}" selected>${master.itemvalue}</option>
																	</c:if>
																	<c:if test="${skill.listenskill ne master.itemvalue}">
																		<option value="${master.itemkey}">${master.itemvalue}</option>
																	</c:if>
																</c:forEach>
														</select></li>
														<li data-v-23a1cf55=""><span data-v-23a1cf55=""
															class="language-edit-title">读写能力：</span> <select
															name="writeskill" class="ivu-input" style="width: 300px">
																<c:forEach items="${masters}" var="master"
																	varStatus="status">
																	<c:if test="${skill.writeskill eq master.itemvalue}">
																		<option value="${master.itemkey}" selected>${master.itemvalue}</option>
																	</c:if>
																	<c:if test="${skill.writeskill ne master.itemvalue}">
																		<option value="${master.itemkey}">${master.itemvalue}</option>
																	</c:if>
																</c:forEach>
														</select></li>
													</ul>
													<div data-v-23a1cf55="" class="language-edit-bottom">
														<button data-v-23a1cf55="" onselectstart="return false "
															class="save-btn  zp-blue-button" type="submit">保存并更新</button>
														<button data-v-23a1cf55="" class="quit-btn"
															onclick="zplanguaEditCancle(${skill.id}) type="reset">取消</button>
														<i data-v-23a1cf55=""
															class="iconfont icon-resume-delete del-hover"></i>
													</div>
												</form>
											</div></li>
									</ul>
								</c:forEach>
							</div>
						</div>
					</div>
					<div data-v-3c122314="" class="zp-certificate jump-to" number="7">
						<div>
							<div class="zp-certificate-title clearfix">
								<span class="zp-certificate-title-name fl">证书</span> <span
									onselectstart="return false" class="zp-certificate-add fr"
									onclick="centificateAdd()"><span
									class="iconfont icon-resume-add"></span>添加证书</span>
							</div>
							<!--添加证书-->
							<div class="zp-certificate-edit-status" edit-index="-2"
								id="zp-certificate-add-status" style="display: none;">
								<form action="resume/reward/add" method="post">
								<div class="edit-status-ipt">
									<div>
										<label>证书名称：</label>
										<div
											class="ivu-auto-complete zpfe-iview-auto_complete edit-status-ipt-input ivu-select ivu-select-single">
											<div class="">
												<div class="ivu-input-wrapper ivu-input-type">
													<i
														class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
													<input name="name" type="text" placeholder="必填"
														class="ivu-input">
													<!---->
												</div>
											</div>
										</div>
									</div>
									<div class="edit-status-ipt-tiem">
										<label>获得时间：</label>
										<div
											class="ivu-auto-complete zpfe-iview-auto_complete edit-status-ipt-input ivu-select ivu-select-single">
											<div class="">
												<div class="ivu-input-wrapper ivu-input-type">
													<i
														class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
													<input name="gettime" type="text" placeholder="必填"
														class="ivu-input">
													<!---->
												</div>
											</div>
										</div>

									</div>
								</div>
								<div onselectstart="return false" class="edit-status-btn">
									<div>
										<button class="zp-blue-button" type="submit">保存并更新</button>
									</div>
									<div>
										<span onclick="certificationAddCancle()" >取消</span>
									</div>
									<div>
										<!---->
									</div>
								</div>
							</form>
							</div>
							<div class="zp-certificate-list">
								<c:forEach items="${rewards}" var="reward" varStatus="status">
									<ul>
										<li class="zp-certificate-list-lis">
											<div class="zp-certificate-list-item clearfix">
												<span title="CET6" class="zp-certificate-list-name">${reward.name}</span>
												<span>${reward.gettime}</span> <span
													onselectstart="return false" class="certificate-edit"
													onclick="certificationEdit(${reward.id})"><span
													class="iconfont icon-resume-edit"></span>编辑</span>
											</div> <!--编辑证书-->
											<div class="zp-certificate-edit-status"
												style="margin-top: 24px; display: none;" edit-index="0"
												id="zp-certificate-edit-status-${reward.id}">
												<form action="resume/reward/edit" method="post">
												<input name="id" value="${reward.id}" id="zp-certificate-edit-${reward.id}">
												<div class="edit-status-ipt">
													<div>
														<label>证书名称：</label>
														<div
															class="ivu-auto-complete zpfe-iview-auto_complete edit-status-ipt-input ivu-select ivu-select-single">
															<div class="">
																<div class="ivu-input-wrapper ivu-input-type">
																	<i
																		class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
																	<input name="name" value="${reward.name}" type="text"
																		placeholder="必填" class="ivu-input">
																	<!---->
																</div>
															</div>
														</div>

													</div>
													<div class="edit-status-ipt-tiem">
														<label>获得时间：</label>
														<div
															class="ivu-auto-complete zpfe-iview-auto_complete edit-status-ipt-input ivu-select ivu-select-single">
															<div class="">
																<div class="ivu-input-wrapper ivu-input-type">
																	<i
																		class="ivu-icon ivu-icon-load-c ivu-load-loop ivu-input-icon ivu-input-icon-validate"></i>
																	<input name="gettime" value="${reward.gettime}"
																		type="text" placeholder="必填" class="ivu-input">
																	<!---->
																</div>
															</div>
														</div>

													</div>
												</div>
												<div onselectstart="return false" class="edit-status-btn">
													<div>
														<button class="zp-blue-button" type="submit">保存并更新</button>
													</div>
													<div>
														<span onclick="certificationEditCancle(${reward.id})">取消</span>
													</div>
													<div>
														<span class="iconfont icon-resume-delete"></span>
													</div>
												</div>
												</form>
											</div>
										</li>
									</ul>
								</c:forEach>
							</div>
						</div>
					</div>
					<div data-v-3c122314="" class="zp-evalution jump-to" module-num="9"
						number="9">
						<div class="zp-evalution-title clearfix">
							<span class="fl">自我评价</span> <span onselectstart="return false"
								class="iconfont icon-resume-edit fr" onclick="zpEvalutionEdit()">编辑</span>
						</div>
						<div class="zp-evalution-content"><pre>${introduce.description}</pre></div>
						<div class="zp-evalution-edit" id="zp-evalution-edit"
							style="display: none">
							<c:if test="${empty introduce}">
							<form action="resume/introduce/add" method="post">
							</c:if>
							<c:if test="${empty introduce}">
							<form action="resume/introduce/edit" method="post">
							</c:if>
							<div class="zp-evalution-edit-content clearfix">
								<p class="fl description">评价内容：</p>
								<div class="zp-evalution-edit-surplus fr">
									<div class="zpfe-iview-input ivu-input-wrapper ivu-input-type">
										<textarea autocomplete="off" spellcheck="false" name="description" 
											placeholder="智联建议您对自己做一个简短评价，简明扼要地描述您的职业优势，让用人单位快速地了解您！优秀的自我评价可以吸引招聘人员的眼球，为您的简历增色不少！"
											rows="2" class="ivu-input">${introduce.description}</textarea>
									</div>
									<p class="clearfix">
										<span class="fl zp-illegal-red" style="display: none;">请输入自我评价内容</span>
										<span class="fr">还可输入500个字</span>
									</p>
								</div>
							</div>
							<div onselectstart="return false" class="zp-evalution-edit-btn">
								<div>
									<button class="zp-evalution-edit-btn__sure" type="submit">保存并更新</button>
								</div>
								<div>
									<span onclick="zpEvalutionEditCancle()"> 取消 </span>
								</div>
								<div>
									<span class="iconfont icon-resume-delete"></span>
								</div>
							</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div data-v-7cbe0384="" class="zp-right-container">
				<div data-v-7cbe0384="" class="zp-resumeCard">
					<div class="zp-photo-container">
						<span><img
							src="//desktop-bucket.zhaopin.cn/assets/img-assistant.938935.png"
							alt="" class="zp-photo-info"></span> <a href="/schedule"
							target="_blank" class="zp-pre-inline">有 <span>3条</span>
							新的投递进展快去查看吧
						</a>
					</div>
					<div class="zp-img-list">
						<ul class="clearfix">
							<li><a><img
									src="//images.zhaopin.cn//www/ihome/img/refresh_resume.png">
									<span>刷新</span></a></li>
							<li><a target="_blank"><img
									src="//images.zhaopin.cn//www/ihome/img/top_resume.png">
									<span>升级</span></a></li>
							<li><a
								href="/preview?resumeId=335401164
&amp;lang=1&amp;resumeNumber=JI149963469R90500000000"
								class=""><img
									src="//desktop-bucket.zhaopin.cn/assets/img-preview.18f7a3.png">
									<span>预览</span></a></li>
							<li><a href="" class=""><img
									src="//desktop-bucket.zhaopin.cn/assets/img-download.955bc3.png">
									<span>下载</span></a></li>
						</ul>
					</div>
				</div>
				<div data-v-3289107e="" data-v-7cbe0384="" class="zp-bar jobBar">
					<div data-v-3289107e="" class="bar">
						<ul data-v-3289107e="" onselectstart="return false"
							class="zp-bar-list">
							<li data-v-3289107e="" class=""><a data-v-3289107e="">求职意向</a></li>
							<li data-v-3289107e="" class=""><a data-v-3289107e="">工作经验</a></li>
							<li data-v-3289107e="" class=""><a data-v-3289107e="">项目经验</a></li>
							<li data-v-3289107e="" class=""><a data-v-3289107e="">教育经历</a></li>
							<li data-v-3289107e="" class=""><a data-v-3289107e="">培训经历</a></li>
							<li data-v-3289107e="" class=""><a data-v-3289107e="">语言能力</a></li>
							<li data-v-3289107e="" class=""><a data-v-3289107e="">证书</a></li>
							<li data-v-3289107e="" class=""><a data-v-3289107e="">自我评价</a></li>
						</ul>
					</div>
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
</body>

</html>