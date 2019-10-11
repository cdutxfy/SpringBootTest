/**
 * 
 */
package com.fields.business.constant;

/**
 * @author bbx王海丞
 * @Description: 异常定数
 */
public enum ExceptionConst {
	/** 未知错误 */
	WARN_UNKNOWN_EXCEPTION(1001, "未知错误，请重新尝试！", "warn"),

	/** 系统错误 */
	SYSTEM_ERROR(1002, "系统错误，请重新尝试！", "error"),
	
	/** 预约异常 */
	ORDER_ERROR(1003, "该时段已被预约，请预约其他时段！", "warn"),
	
	/** 预约取消检索异常 */
	ORDER_CANCEL_SELECT_ERROR(1004, "没有未被使用的会议室预约信息，请重新检索！", "warn"),
	
	/** 取消的数据异常 */
	CANCEL_DATA_ERROR(1005, "需要删除的数据异常！", "warn"),
	
	/** 人员信息数据异常 */
	USER_DATA_ERROR(1006, "没有找到对应人员信息！", "warn"),
	
	/** 取消的数据异常 */
	CHANGE_DATA_ERROR(1007, "需要修改的数据异常！", "warn"),
	
	/** 取消的数据异常 */
	USER_NAME_ERROR(1008, "输入的使用者名错误！", "warn"),
	
	/** 人员信息输入异常 */
	USER_CHANGE_ERROR(1009, "输入的信息有误，请重新输入！", "warn"),
	
	/** 已预约会议室信息检索异常 */
	MEETING_ROOM_INFO_SELECT_ERROR(1004, "该时段没有被预约，请重新检索！", "warn");

	private int errorCode;
	private String errorMsg;
	private String errorType;

	ExceptionConst(int errorCode, String errorMsg, String errorType) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorType = errorType;
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the errorType
	 */
	public String getErrorType() {
		return errorType;
	}

	/**
	 * @param errorType the errorType to set
	 */
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	@Override
	public String toString() {
//		return "[" + this.errorCode + "]" + this.errorMsg;
		return this.errorCode + "," + this.errorMsg + ";" + this.errorType;
	}
}
