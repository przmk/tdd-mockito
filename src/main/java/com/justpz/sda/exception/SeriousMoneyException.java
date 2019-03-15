package com.justpz.sda.exception;

public class SeriousMoneyException extends RuntimeException {

    private final Integer amount;

    public SeriousMoneyException(Integer amount) {
        super(amount.toString());
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }
}
