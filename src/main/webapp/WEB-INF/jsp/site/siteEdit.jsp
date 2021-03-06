<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="js/authority.js" type="text/javascript"></script>
<script type="text/javascript">
function showIcon(obj){
	if($(obj).val()==""){
		$("#urlLogo").attr("src","framework/images/icon_pic.png");
	}else{
		$("#urlLogo").attr("src",$(obj).val());
	}
}
$("#dicId").change(function(){
	if($(this).val()!=-1){
		$("#site_type").val(0);
	}
});
</script>
<div class="pageContent">
	<form method="post" action="site/saveSite?editType=${editType}&resKey=${resKey}" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>机型：</label>
				<select id="dicId" name="dicId" >
					<option value="-1" >选择机型..</option>
					<c:forEach var="ml" items="${mechineList}">
					   <option value="${ml.id}" ${site.dicId == ml.id?"selected":"" }>${ml.dicValue}</option>
					</c:forEach>
				</select>
				<span class="info">不选择即针对旧版本机型</span>
			</p>
			<p>
				<label>网址类型：</label>
				<select id="site_type" name="type" >
					<option value="0" ${site.type == 0?"selected":"" }>常规网址</option>
					<option value="1" ${site.type == 1?"selected":"" }>桌面widget网址</option>
				</select>
			</p>
			<p>
				<label>名称：</label>
				<input name="siteName" class="required" type="text" size="30" style="width:220px;"; value="${site.siteName}" />
			</p>
			<p>
				<label>排序号：</label>
				<input name="sortId" class="digits" type="text" size="30" style="width:220px;" value="${site.sortId}" />
			</p>
			<p>
				<label>URL：</label>
				<input name="siteUrl" class="required url" type="text" size="30" style="width:220px;" value="${site.siteUrl}" />
			</p>
			<p>
				<label>是否显示：</label>
				<label><input name="showEnable" type="checkbox" value="${site.showEnable}" onclick="RoleUtils.onClickOfEnable(this);" <c:if test="${site.showEnable == 1}">checked="checked"</c:if> />显示在首页</label>
			</p>
			<p>
				<label>Logo图片：</label>
				<a id="imagesWinBtn" class="button" href="images/queryImagesPaper?resId=68&type=32&resource=nav" target="dialog" rel="toImagesView4Site" resizable="false" maxable="false" mask="true" width="1220" height="660" ><span>选择..</span></a>
				<input name="iconUrl" class="required url" type="hidden" size="30" style="width:200px;" value="${site.iconUrl}" onchange="showIcon(this);"/>
			</p>
			<p>
				<label>&nbsp;&nbsp;&nbsp;&nbsp;</label>
				<img id="urlLogo" src="${site.iconUrl eq null || site.iconUrl eq ''?'framework/images/logo_default.jpg':site.iconUrl}" width="68" height="68">
			</p>
			<input type="hidden" name="id" value="${site.id}" />
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>

