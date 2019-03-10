package com.justpz.sda.dependency;


import com.justpz.sda.exception.DependencyInvokedInUnitTestException;

import java.util.Optional;

public class MobileOperatorCheckerCache {

    public Optional<MobileOperator> getCachedOperator(String mobileNumber) {
        throw new DependencyInvokedInUnitTestException(getClass());
    }
}
