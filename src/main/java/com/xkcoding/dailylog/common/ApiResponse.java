package com.xkcoding.dailylog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * API 统一返回格式封装
 * </p>
 *
 * @package: com.xkcoding.dailylog.common
 * @description： API 统一返回格式封装
 * @author: yangkai.shen
 * @date: Created in 2018/7/2 上午10:06
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class ApiResponse implements Serializable {

	private static final long serialVersionUID = -7385671561438859860L;

	/**
	 * 返回状态码
	 */
	private int code;
	/**
	 * 返回信息
	 */
	private String message;
	/**
	 * 返回数据
	 */
	private Object data;

	public ApiResponse(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public ApiResponse() {
		this.code = Status.SUCCESS.getCode();
		this.message = Status.SUCCESS.getMsg();
	}

	/**
	 * 通用构造包含返回信息的 ApiResponse <br>
	 * 主要用于只包含返回信息，不包含数据时的返回
	 *
	 * @param code    状态码
	 * @param message 信息
	 * @return ApiResponse
	 */
	public static ApiResponse message(int code, String message) {
		return new ApiResponse(code, message, null);
	}

	/**
	 * 通用构造包含返回信息的 ApiResponse <br>
	 * 主要用于只包含返回信息，不包含数据时的返回
	 *
	 * @param message 信息
	 * @return ApiResponse
	 */
	public static ApiResponse message(String message) {
		return new ApiResponse(Status.SUCCESS.getCode(), message, null);
	}

	/**
	 * 通用构造包含返回数据的 ApiResponse <br>
	 * 主要用于操作成功时的返回(不带数据)
	 *
	 * @return ApiResponse
	 */
	public static ApiResponse success() {
		return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), null);
	}

	/**
	 * 通用构造包含返回数据的 ApiResponse <br>
	 * 主要用于操作成功时的返回
	 *
	 * @param data 操作成功时需要返回的数据
	 * @return ApiResponse
	 */
	public static ApiResponse success(Object data) {
		return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), data);
	}

	/**
	 * 通过 Status 构造 ApiResponse <br>
	 * 主要用于出现异常时的返回
	 *
	 * @param status {@link Status}
	 * @return ApiResponse
	 */
	public static ApiResponse status(Status status) {
		return new ApiResponse(status.getCode(), status.getMsg(), null);
	}

}
