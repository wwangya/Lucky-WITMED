package com.wwangya.witmed.base.enums;

import com.wwangya.witmed.base.util.BaseConstants;

/**
 * <b></b>
 *
 * @author WWY
 * @date
 */
public enum ResponseEnum{
	RESPONSE_SUCCESS(BaseConstants.RESPONSE_SUCCESS, "系统响应成功"),
	RESPONSE_UNAUTH(BaseConstants.RESPONSE_UNAUTH, "用户未进行认证"),
	RESPONSE_FAILURE(BaseConstants.RESPONSE_FAILURE, "系统业务处理失败"),
	RESPONSE_EXCEPTION(BaseConstants.RESPONSE_EXCEPTION, "系统响应异常");

	private Integer code;                       // 编码
	private String remark;                      // 说明

	private ResponseEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
