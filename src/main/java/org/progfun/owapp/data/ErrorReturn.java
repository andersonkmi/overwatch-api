package org.progfun.owapp.data;

public class ErrorReturn {
    private int errorCode;
    private String message;

    public ErrorReturn setErrorCode(int error) {
        errorCode = error;
        return this;
    }

    public ErrorReturn setMessage(String value) {
        message = value;
        return this;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
