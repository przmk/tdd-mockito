package com.justpz.sda.exception;

import static java.lang.String.format;

public class DependencyInvokedInUnitTestException extends RuntimeException {
    public DependencyInvokedInUnitTestException(Class dependencyClass) {
        super(format("Dependency %s should not be invoked in unit test!", dependencyClass.getSimpleName()));
    }
}
