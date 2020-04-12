package com.shterm.springcloud.entities;

/**
 * 返回前端的Json封装的实体串
 * author: wangyc
 */
public class CommonResult<T> {
    /** 返回前端的结果编码 */
    private int code;
    /** 返回的消息 */
    private String message;
    /** 操作成功的结果集 */
    private T data;

    public CommonResult() {
    }

    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(int code, String message) {
        this(code, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
