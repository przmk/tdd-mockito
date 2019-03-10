package com.justpz.sda.dependency;

import com.justpz.sda.exception.DependencyInvokedInUnitTestException;
import com.justpz.sda.exception.WebServiceNetworkException;

public class MobileOperatorCheckerWebService {
    public MobileOperator checkOperator(String mobileNumber) throws WebServiceNetworkException {
        throw new DependencyInvokedInUnitTestException(getClass());
    }
}
