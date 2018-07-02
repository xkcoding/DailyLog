package com.xkcoding.dailylog.common;

import lombok.Getter;

/**
 * <p>
 * 状态码枚举
 * </p>
 *
 * @package: com.xkcoding.dailylog.common
 * @description： 状态码枚举
 * @author: yangkai.shen
 * @date: Created in 2018/7/2 上午10:09
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Getter
public enum Status {

	/**
	 * 状态码约定的枚举值
	 */
	SUCCESS(200, "成功"),

	BAD_REQUEST(400, "请求错误"),

	NOT_FOUND(404, "请求不存在"),

	INTERNAL_SERVER_ERROR(500, "服务器内部错误");

	/**
	 * 状态码
	 */
	private Integer code;

	/**
	 * 状态信息
	 */
	private String msg;

	Status(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
