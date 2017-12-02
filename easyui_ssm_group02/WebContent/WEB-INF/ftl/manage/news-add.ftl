<#assign ctx=request.contextPath />
<#include "../commons/manage/top.ftl">
<div id="main" class="wrap">
	<#include "../commons/manage/left.ftl">
	<div class="main">
		<h2>添加新闻ftl</h2>
		<div class="manage">
			<form action="${ctx}/news.do" method="post">
				<table class="form">
					<tr>
						<td class="field">新闻标题：</td>
						<td><input type="text" class="text" name="enTitle" value="" /></td>
					</tr>
					<tr>
						<td class="field">新闻内容：</td>
						<td><textarea name="enContent"></textarea></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-blue"><input type="submit" name="submit" value="添加" /></label></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="clear"></div>	
</div>