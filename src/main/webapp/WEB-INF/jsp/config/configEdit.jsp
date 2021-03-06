<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="js/authority.js" type="text/javascript"></script>

<div class="pageContent">
	<form method="post" action="config/saveConfig?editType=${editType}&resKey=${resKey}" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<fieldset>
				<legend>参数信息</legend>
				<dl class="nowrap">
					<dt>参数代码：</dt>
					<dd><input name="code" class="required" type="text" size="40" style="width:230px;" value="${config.code}" /></dd>
				</dl>
				<dl class="nowrap">
					<dt>参数名：</dt>
					<dd><input name="name" class="required" type="text" size="40" style="width:230px;" value="${config.name}" /></dd>
				</dl>
				<dl class="nowrap">
					<dt>参数值：</dt>
					<dd><input name="value" class="required" type="text" size="40" style="width:230px;" value="${config.value}" /></dd>
				</dl>
				<dl class="nowrap">
					<dt>是否启用：</dt>
					<dd><input name="status" type="checkbox" value="${config.status}" onchange="RoleUtils.onClickOfEnable(this);" <c:if test="${config.status == 1}">checked="checked"</c:if> />启用</dd>
				</dl>
				<dl class="nowrap">
					<dt>参数说明：</dt>
					<dd><textarea name="description" cols="33" rows="2" style="width:230px;">${config.description}</textarea></dd>
				</dl>
			</fieldset>
			<input type="hidden" name="id" value="${config.id}" />
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

