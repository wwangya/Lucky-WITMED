package com.wwangya.witmed.base.pojo.vo;

import com.wwangya.witmed.base.enums.ResponseEnum;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/2
 */
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -994126916401544181L;
	private Integer code;                       // 系统响应编码
	private String message;                     // 系统响应信息
	private E data;                             // 系统响应数据

	public ResponseVO(ResponseEnum responseCode, String message, E data) {
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}

	/**
	 * <b>获得系统响应成功视图信息</b>
	 * @return
	 */
	public static ResponseVO successResponseVO() {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS, ResponseEnum.RESPONSE_SUCCESS.getRemark(), "");
	}

	/**
	 * <b>获得系统响应成功视图信息</b>
	 * @param message
	 * @return
	 */
	public static ResponseVO successResponseVO(String message) {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS, message, "");
	}

	/**
	 * <b>获得系统响应成功视图信息</b>
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseVO successResponseVO(String message, Object data) {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS, message, data);
	}

	/**
	 * <b>获得用户未认证视图信息</b>
	 * @return
	 */
	public static ResponseVO unAuthResponseVO() {
		return new ResponseVO(ResponseEnum.RESPONSE_UNAUTH, ResponseEnum.RESPONSE_UNAUTH.getRemark(), "");
	}

	/**
	 * <b>获得系统业务处理失败视图信息</b>
	 * @param message
	 * @return
	 */
	public static ResponseVO failureResponseVO(String message) {
		return new ResponseVO(ResponseEnum.RESPONSE_FAILURE, message, "");
	}

	/**
	 * <b>获得系统业务处理失败视图信息</b>
	 * @param fieldErrorVOList
	 * @return
	 */
	/*public static ResponseVO failureResponseVO(List<FieldErrorVO> fieldErrorVOList) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_FAILURE, "错误信息列表", fieldErrorVOList);
	}*/

	/**
	 * <b>获得系统响应异常视图信息</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO exceptionResponseVO(Exception e) {
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION, e.getMessage(), e);
	}
}
