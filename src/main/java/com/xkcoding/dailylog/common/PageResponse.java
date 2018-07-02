package com.xkcoding.dailylog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 分页格式封装
 * </p>
 *
 * @package: com.xkcoding.dailylog.common
 * @description： 分页格式封装
 * @author: yangkai.shen
 * @date: Created in 2018/7/2 上午10:14
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResponse<T> implements Serializable {
	/**
	 * 总条数
	 */
	private Long total;

	/**
	 * 当前页数据
	 */
	private List<T> list;
}
