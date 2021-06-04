package com.vincent.pmsdemo.common.enums;

/**
 * 结果状态码枚举类
 */
public enum ResultCodeEnum {
	SUCCESS("200", "SUCCESS"),
	REDIRECT("301", "REDIRECT"),
	NOT_FOUND("404", "NOT FOUNT"),
	SERVER_ERROR("500", "SERVER ERROR"),
	PARAM_ERROR("600", "PARAM_ERROR");

	private String code;
	private String message;

	private ResultCodeEnum(String code, String msg) {
		this.code = code;
		this.message = msg;
	}

	public String getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

