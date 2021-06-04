package com.vincent.pmsdemo.common.util;

import com.vincent.pmsdemo.common.enums.ResultCodeEnum;

import java.io.Serializable;

public class HttpResult<T> implements Serializable {
	private Boolean success;
	private String code;
	private T data;
	private String message;

	private HttpResult() {
		this.code = ResultCodeEnum.SUCCESS.getCode();
		this.success = true;
	}

	private HttpResult(T obj) {
		this.code = ResultCodeEnum.SUCCESS.getCode();
		this.data = obj;
		this.success = true;
	}

	private HttpResult(ResultCodeEnum resultCode) {
		this.success = false;
		this.code = resultCode.getCode();
		this.message = resultCode.getMessage();
	}

	private HttpResult(ResultCodeEnum resultCode, String message) {
		this.success = false;
		this.code = resultCode.getCode();
		this.message = message;
	}

	public static <T> HttpResult<T> success() {
		return new HttpResult();
	}

	public static <T> HttpResult<T> success(T data) {
		return new HttpResult(data);
	}

	public static <T> HttpResult<T> failure(ResultCodeEnum resultCode) {
		return new HttpResult(resultCode);
	}

	public static <T> HttpResult<T> failure(ResultCodeEnum resultCode, String message) {
		return new HttpResult(resultCode, message);
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return "HttpResult{success=" + this.success + ", code=" + this.code + ", data=" + this.data + ", message='" + this.message + '\'' + '}';
	}
}
