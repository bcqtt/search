<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="js/authority.js" type="text/javascript"></script>
<script type="text/javascript">
function showIcon(obj){
	if($(obj).val()==""){
		$("#adImg").attr("src","framework/images/ad_default.png");
	}else{
		$("#adImg").attr("src",$(obj).val());
	}
}
</script>
<div class="pageContent">
	<form method="post" action="adNews/saveAdNews?editType=${editType}&resKey=${resKey}" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<p class="p-width">
				<label>广告标题：</label>
				<input name="name" class="required" type="text" size="44" style="width:360px;" value="${an.name}" />
			</p>
			
			<p class="p-width">
				<label>广告链接：</label>
				<input name="link" class="required" type="text" size="44" style="width:360px;" value="${an.link}" />
			</p>
			<p class="p-width">
				<label>是否显示：</label>
				<label><input name="enable" type="checkbox" value="${an.enable}" onclick="RoleUtils.onClickOfEnable(this);" <c:if test="${an.enable == 1}">checked="checked"</c:if> />显示</label>
			</p>
			<p class="p-width">
				<label>广告位置(选填)：</label>
				<input name="pos" class="digits" type="text" size="44" style="width:360px;" value="${an.pos}" />
			</p>
			<p class="p-width">
				<label>广告图：</label>
				<a id="imagesWinBtn" class="button" href="images/queryImagesPaper?resId=68&type=31&resource=news" target="dialog" rel="toImagesView4News" resizable="false" maxable="false" mask="true" width="1220" height="660" ><span>选择..</span></a>
				<input name="img" type="hidden" size="44" style="width:230px;" value="${an.img}" onchange="showIcon(this);" />
			</p>
			<p class="p-width">
				<label>&nbsp;&nbsp;&nbsp;&nbsp;</label>
				<img id="adImg" src="${an.img eq null || an.img eq ''?'framework/images/ad_default.png':an.img}" width="238" height="90">
			</p>
			<input type="hidden" name="id" value="${an.id}" />
			<input type="hidden" name="type" value="${an.type}" />
			<input type="hidden" name="createTime" value="<fmt:formatDate value="${an.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />" />
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>

