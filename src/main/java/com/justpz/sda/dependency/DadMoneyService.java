package com.justpz.sda.dependency;

import com.justpz.sda.exception.DependencyInvokedInUnitTestException;
import com.justpz.sda.exception.NotEnoughMoneyException;

public class DadMoneyService {
    public Integer askForMoney(Integer amount) throws NotEnoughMoneyException {
        throw new DependencyInvokedInUnitTestException(getClass());
    }
}
