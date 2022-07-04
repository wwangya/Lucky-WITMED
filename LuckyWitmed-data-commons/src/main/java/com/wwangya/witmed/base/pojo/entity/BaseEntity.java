package com.wwangya.witmed.base.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/4
 */
@Data
public class BaseEntity implements Serializable {
	private String status;
	private String createdBy;
	private Date createTime;
	private String modifiedBy;
	private Date modifiedTime;
}
