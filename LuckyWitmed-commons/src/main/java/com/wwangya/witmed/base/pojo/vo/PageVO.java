package com.wwangya.witmed.base.pojo.vo;

import com.wwangya.witmed.base.util.BaseConstants;

import java.io.Serializable;
import java.util.List;

/**
 * <b></b>
 *
 * @author WWY
 * 2022/7/2
 */
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = 6064941315485331372L;
	private Integer pageNum;                    // 当前页码
	private Integer pageSize;                   // 每页显示数量
	private List<E> list;                       // 分页列表
	private Long totalCount;                    // 总数量
	private Integer totalPage;                  // 总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}

		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}
}
