package com.justpz.sda.exception;

public class MobileOperatorCheckFailedException extends RuntimeException {

    private final String mobileNumber;

    public MobileOperatorCheckFailedException(String mobileNumber) {
        super(mobileNumber);
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
