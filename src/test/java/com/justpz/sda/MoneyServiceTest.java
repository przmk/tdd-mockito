package com.justpz.sda;

import com.justpz.sda.dependency.AccountService;
import com.justpz.sda.dependency.DadMoneyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class MoneyServiceTest {
    @Mock
    private AccountService cache;
    @Mock
    private DadMoneyService webService;
    private MoneyService service;

    @BeforeEach
    void setUp() {
        service = new MoneyService(cache, webService);
    }

}