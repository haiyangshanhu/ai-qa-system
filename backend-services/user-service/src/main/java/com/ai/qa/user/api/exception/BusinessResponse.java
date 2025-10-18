package com.ai.qa.user.api.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务异常类
 * 
 * 用于处理业务逻辑相关的异常，提供错误码和错误信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessResponse extends RuntimeException {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 构造函数
     * 
     * @param code    错误码
     * @param message 错误消息
     */
    public BusinessResponse(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 构造函数（默认错误码500）
     * 
     * @param message 错误消息
     */
    public BusinessResponse(String message) {
        super(message);
        this.code = 500;
        this.message = message;
    }
}