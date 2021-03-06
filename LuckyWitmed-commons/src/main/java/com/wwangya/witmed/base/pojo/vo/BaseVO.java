package com.wwangya.witmed.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/2
 */
@Data
public class BaseVO implements Serializable {
	private String status;
	private String createdBy;
	private Date createTime;
	private String modifiedBy;
	private Date modifiedTime;
}
