<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"
	content="multipart/form-data; charset=utf-8" />
<title>新增商品</title>
<script type="text/javascript" src="../js/jquery-1.12.3.min.js"></script>

</head>
<body>
	<table>
		<tr>
			<td>商品编号 <input id="commodityId" name="commodityId"
				maxlength="13" type="text"></input><label
				style="color: red; vertical-align: middle;"> *</label></td>
		</tr>
		<tr>
			<td>货柜编号 <input id="containerId" name="containerId"
				maxlength="6" type="text"></input><label
				style="color: red; vertical-align: middle;"> *</label></td>
		</tr>
		<tr>
			<td>商品名称 <input id="commodityName" name="commodityName"
				type="text"></input><label
				style="color: red; vertical-align: middle;"> *</label>
			</td>
		</tr>
		<tr>
			<td>商品分类 <select id="category" name="category">
					<option value="00"></option>
					<option value="01">营养早餐</option>
					<option value="02">美味零食</option>
					<option value="03">特色饮料</option>
					<option value="04">饥饿首选</option>
					<option value="05">日常必备</option>
			</select><label style="color: red; vertical-align: middle;"> *</label>
			</td>
		</tr>
		<tr>
			<td>
				<form id="upform" enctype="multipart/form-data">
					<input type="file" name="uploadFile" id="uploadFile" accept=".png"
						multiple /><label style="color: red; vertical-align: middle;">
						*</label>
				</form>
			</td>
		</tr>
		<tr>
			<td>商品进价 <input id="purchasePrice" name="purchasePrice"></input><label
				style="color: red; vertical-align: middle;"> *</label>
			</td>
		</tr>
		<tr>
			<td>商品定价 <input id="price" name="price"></input><label
				style="color: red; vertical-align: middle;"> *</label></td>
		</tr>
		<tr>
			<td>商品售价 <input id="sellPrice" name="sellPrice"></input><label
				style="color: red; vertical-align: middle;"> *</label></td>
		</tr>
		<tr>
			<td>商品副标题 <input id="subTitle" name="subTitle"></input></td>
		</tr>
		<tr>
			<td>商品详情 <input id="detail" name="detail"></input></td>
		</tr>
		<tr>
			<td><button type="submit" class="btn btn-primary" id="upload_ok">商品新增</button></td>
		</tr>
	</table>
	<script type="text/javascript">
		$(function() {
			// 货柜设置默认值
			$("#containerId").val("525274");
		})
		$("#upload_ok")
				.unbind()
				.click(
						function() {
							// 金额check正则表达式
							var moneyCheck = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
							// 商品编号
							var commodityId = $("#commodityId").val();
							// 货柜编号
							var containerId = $("#containerId").val();
							// 商品名称
							var commodityName = $("#commodityName").val();
							// 选中的商品分类的文本
							var categoryName = $('#category option:selected')
									.text();
							// 选中的商品分类的值
							var categoryId = $('#category option:selected')
									.val();
							// 本地图片
							var formData = new FormData($("#upform")[0]);
							// 商品进价
							var purchasePrice = $("#purchasePrice").val();
							// 商品定价
							var price = $("#price").val();
							// 商品售价
							var sellPrice = $("#sellPrice").val();
							// 商品副标题
							var subTitle = $("#subTitle").val();
							// 商品详情
							var detail = $("#detail").val();
							// 商品编号check
							if (!commodityId) {
								alert("请输入商品编号");
							} else if (isNaN(commodityId)) {
								alert("商品编号全为半角数字，请输入正确的商品编号");
							}
							else if (commodityId.length < 13) {
								alert("商品编号为13位，请输入正确的商品编号");
							} else {
								// 货柜编号check
								if (!containerId) {
									alert("请输入货柜编号");
								} else if (isNaN(containerId)) {
									alert("货柜编号全为数字，请输入正确的商品编号");
								} else if (commodityId.length < 6) {
									alert("货柜编号为6位，请输入正确的商品编号");
								}
								// 商品名称check
								else if (!commodityName) {
									alert("请输入商品名称");
								}
								// 商品分类check
								else if (categoryId == '00') {
									alert("请选择商品分类");
								}
								// 商品图片check
								else if ($("#uploadFile").val() == "") {
									alert("请选择图片");
								} else if (!/.*.png$/.test($("#uploadFile")
										.val())) {
									alert("请选择正确的图片，图片格式为.png");
								}
								// 商品进价check
								else if (!purchasePrice) {
									alert("请输入商品进价");
								} else if (!moneyCheck.test(purchasePrice)) {
									alert("请输入正确的商品进价金额");
								}
								// 商品定价check
								else if (!price) {
									alert("请输入商品定价");
								} else if (!moneyCheck.test(price)) {
									alert("请输入正确的商品定价金额");
								}
								// 商品售价check
								else if (!sellPrice) {
									alert("请输入商品售价");
								} else if (!moneyCheck.test(sellPrice)) {
									alert("请输入正确的商品售价金额");
								}
								// ajax API调用
								else {
									var commodityInfo = {
										commodityId : commodityId,
										containerId : containerId,
										commodityName : commodityName,
										categoryName : categoryName,
										categoryId : categoryId,
										purchasePrice : purchasePrice,
										price : price,
										sellPrice : sellPrice,
										subTitle : subTitle,
										detail : detail
									}

									formData.append("commodityInfo", JSON
											.stringify(commodityInfo));
									$.ajax({
										url : "/SpringBootTest/addCommodity",
										type : 'POST',
										data : formData,
										cache : false,
										processData : false,
										contentType : false,
										dataType : "json",
										success : function(res) {
											alert(res.returnString);
										},
										error : function(e) {
											alert("failed");
										}
									});
								}
							}
						})
	</script>
</body>
</html>