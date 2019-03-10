package com.justpz.sda;

import com.justpz.sda.dependency.MobileOperator;
import com.justpz.sda.dependency.MobileOperatorCheckerCache;
import com.justpz.sda.dependency.MobileOperatorCheckerWebService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class MobileOperatorCheckerServiceTest {
    @Mock
    private MobileOperatorCheckerCache cache;
    @Mock
    private MobileOperatorCheckerWebService webService;
    private MobileOperatorCheckerService service;
    @BeforeEach
    void setUp() {
        service = new MobileOperatorCheckerService(cache, webService);
    }

    @Test
    void shouldReturnOperatorFromCacheWhenIsInCache() {
        //given
//        MobileOperatorCheckerCache cache = Mockito
//                .mock(MobileOperatorCheckerCache.class);
//        MobileOperatorCheckerWebService webService = Mockito
//                .mock(MobileOperatorCheckerWebService.class);
//        MobileOperatorCheckerService service =
//                new MobileOperatorCheckerService(cache, webService);
        //when
        Mockito.when(cache.getCachedOperator("200300620"))
                .thenReturn(Optional.of(MobileOperator.ORANGE));
        MobileOperator mobileOperator = service.checkOperator("200300620");
        //then
        assertEquals(MobileOperator.ORANGE, mobileOperator);

    }
}