package com.wwangya.witmed.base.util;

import java.util.Properties;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/2
 */
public class BaseConstants {
	private static Properties props = new Properties();
	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息：当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("base.page.num"));

	/**
	 * <b>分页信息：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("base.page.size"));

	/**
	 * <b>系统响应码信息：系统响应成功</b>
	 */
	public static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("base.response.success"));

	/**
	 * <b>系统响应码信息：用户未进行认证</b>
	 */
	public static final Integer RESPONSE_UNAUTH = Integer.parseInt(props.getProperty("base.response.unauth"));

	/**
	 * <b>系统响应码信息：系统业务处理失败</b>
	 */
	public static final Integer RESPONSE_FAILURE = Integer.parseInt(props.getProperty("base.response.failure"));

	/**
	 * <b>系统响应码信息：系统响应异常</b>
	 */
	public static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("base.response.exception"));

	/**
	 * <b>Token 交互消息头绑定信息</b>
	 */
	public static final String TOKEN_HEADER = props.getProperty("base.token.header");

	/**
	 * <b>加密秘钥</b>
	 */
	public static final String TOKEN_SECRET = props.getProperty("base.token.secret");
}
