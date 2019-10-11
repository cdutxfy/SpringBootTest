package com.fields.business.constant;

/**
 * 
 * @author bbx王海丞
 * @Description: 定数值
 *
 */
public class ContantValue {
	private ContantValue() {

	}

	/**
	 * 返回空字符
	 */
	public static final String RE_BLANK = "";

	/**
	 * 商品编号字符串
	 */
	public static final String COMMODITY_ID = "commodityId";

	/**
	 * 货柜编号字符串
	 */
	public static final String CONTAINER_ID = "containerId";

	/**
	 * 商品名称字符串
	 */
	public static final String COMMODITY_NAME = "commodityName";

	/**
	 * 商品分类名称字符串
	 */
	public static final String CATEGORY_NAME = "categoryName";

	/**
	 * 商品分类ID字符串
	 */
	public static final String CATEGORY_ID = "categoryId";

	/**
	 * 商品进价字符串
	 */
	public static final String PURCHASE_PRICE = "purchasePrice";

	/**
	 * 商品定价字符串
	 */
	public static final String PRICE = "price";

	/**
	 * 商品售价字符串
	 */
	public static final String SELL_PRICE = "sellPrice";

	/**
	 * 商品副标题字符串
	 */
	public static final String SUB_TITLE = "subTitle";

	/**
	 * 商品详情字符串
	 */
	public static final String DETAIL = "detail";

	/**
	 * 图片不存在失败码
	 */
	public static final String RETURN_CODE_FAIL1 = "0001";

	/**
	 * 图片不存在失败文言
	 */
	public static final String RETURN_MSG_FAIL1 = "请选择一张图片上传";

	/**
	 * 商品保质期
	 */
	public static final String PERIOD_HOUR = "4320";

	/**
	 * 服务器图片路径
	 */
	public static final String SERVICE_PATH = "https://bbxbbx.320.io/DEMO/images/goods/";

	/**
	 * 商品状态
	 */
	public static final String COMMODITY_STATUS = "0";

	/**
	 * 商品新增成功码
	 */
	public static final String RETURN_CODE_SUCCESS = "0000";

	/**
	 * 商品新增成功文言
	 */
	public static final String RETURN_MSG_SUCCESS = "商品新增成功";

	/**
	 * 图片上传异常失败码
	 */
	public static final String RETURN_CODE_FAIL2 = "0002";

	/**
	 * 图片上传异常失败文言
	 */
	public static final String RETURN_MSG_FAIL2 = "上传的图片有误，请重新上传";

	/**
	 * 日期格式化
	 */
	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
}