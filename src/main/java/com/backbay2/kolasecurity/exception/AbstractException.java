package com.backbay2.kolasecurity.exception;

import com.backbay2.kolasecurity.resp.code.IErrorCode;
import com.google.common.base.Strings;
import lombok.Getter;

import java.util.Optional;

@Getter
public abstract class AbstractException extends RuntimeException {

    public final String errorCode;

    public final String errorMessage;

    public AbstractException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = Optional.ofNullable(Strings.emptyToNull(message)).orElse(errorCode.message());
    }
}
