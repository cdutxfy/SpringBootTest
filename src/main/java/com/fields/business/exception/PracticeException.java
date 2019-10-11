/**
 * 
 */
package com.fields.business.exception;

import com.fields.business.constant.ExceptionConst;

/**
 * @author bbx高
 * @Description: 异常信息
 * @ClassName: 异常信息
 * @CreateDate: 2018/11/08 11:00
 * @UpdateDate: 2018/11/08 11:00
 */

public class PracticeException extends Exception {
	private static final long serialVersionUID = 1L;
	// 异常信息
	public PracticeException(ExceptionConst exceptionConst) {
		super(exceptionConst.toString()); 
	}
}
