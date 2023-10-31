package com.icebear2n2.deliveryservice.exception;

import lombok.Getter;

@Getter
public class DeliveryServiceException extends RuntimeException {
    private final ErrorCode errorCode;
    private final String message;

    public DeliveryServiceException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.message = errorCode.getMessage();
    }
}
