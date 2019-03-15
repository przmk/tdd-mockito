package com.justpz.sda.dependency;


import com.justpz.sda.exception.DependencyInvokedInUnitTestException;

import java.util.Optional;

public class AccountService {

    public Optional<Integer> getMoneyFromAccount(Integer amount) {
        throw new DependencyInvokedInUnitTestException(getClass());
    }
}
