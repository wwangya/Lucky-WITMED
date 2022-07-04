package com.wwangya.witmed.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/2
 */
public class BaseConstants {
	// 创建日志 Logger 对象，用于记录日志
	private static Logger logger = LoggerFactory.getLogger(BaseConstants.class);
	private static Properties props = new Properties();
	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (IOException e) {
			logger.error(e.getMessage() + ":" + new Date(), e);
			throw new RuntimeException(e);
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
	 * <b>系统启用状态</b>
	 */
	public static final String BASE_STATUS_ENABLE=props.getProperty("base.status.enable");
	/**
	 * <b>系统禁用状态</b>
	 */
	public static final String BASE_STATUS_DISABLE=props.getProperty("base.status.disable");
	/**
	 * <b>token 信息：token 加密私钥</b>
	 */
	public static final String BASE_TOKEN_KEY = props.getProperty("base.token.key");

	/**
	 * <b>token 信息：token 有效时长</b>
	 */
	public static final Integer BASE_TOKEN_EXPIRE = Integer.parseInt(props.getProperty("base.token.expire"));
}
