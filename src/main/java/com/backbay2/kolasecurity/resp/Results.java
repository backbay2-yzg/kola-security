package com.backbay2.kolasecurity.resp;

import com.backbay2.kolasecurity.resp.code.BaseErrorCode;
import com.backbay2.kolasecurity.exception.AbstractException;

import java.util.Optional;

public final class Results {

    /**
     * 构造成功响应
     *
     * @return
     */
    public static Result<Void> success() {
        return new Result<Void>()
                .setCode(Result.SUCCESS_CODE);
                //.setRequestId(TraceContext.traceId());
    }

    /**
     * 构造带返回数据的成功响应
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>()
                .setCode(Result.SUCCESS_CODE)
                //.setRequestId(TraceContext.traceId())
                .setData(data);
    }

    /**
     * 构建服务端失败响应
     *
     * @return
     */
    public static Result<Void> failure() {
        return new Result<Void>()
                .setCode(BaseErrorCode.SERVICE_ERROR.code())
                //.setRequestId(TraceContext.traceId())
                .setMessage(BaseErrorCode.SERVICE_ERROR.message());
    }

    /**
     * 通过 {@link AbstractException} 构建失败响应
     *
     * @param abstractException
     * @return
     */
    public static Result<Void> failure(AbstractException abstractException) {
        String errorCode = Optional.ofNullable(abstractException.getErrorCode())
                .orElse(BaseErrorCode.SERVICE_ERROR.code());
        String errorMessage = Optional.ofNullable(abstractException.getErrorMessage())
                .orElse(BaseErrorCode.SERVICE_ERROR.message());
        return new Result<Void>()
                .setCode(errorCode)
                //.setRequestId(TraceContext.traceId())
                .setMessage(errorMessage);
    }

    /**
     * 通过 errorCode、errorMessage 构建失败响应
     *
     * @param errorCode
     * @param errorMessage
     * @return
     */
    public static Result<Void> failure(String errorCode, String errorMessage) {
        return new Result<Void>()
                .setCode(errorCode)
                //.setRequestId(TraceContext.traceId())
                .setMessage(errorMessage);
    }
}