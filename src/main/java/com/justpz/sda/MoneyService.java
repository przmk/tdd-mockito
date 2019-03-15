package com.justpz.sda;


import com.justpz.sda.dependency.AccountService;
import com.justpz.sda.dependency.DadMoneyService;

public class MoneyService {
    private final AccountService accountService;
    private final DadMoneyService dadMoneyService;

    public MoneyService(AccountService accountService,
                        DadMoneyService dadMoneyService) {
        this.accountService = accountService;
        this.dadMoneyService = dadMoneyService;
    }

    /**
     * Logika dzialania:
     * 1. Jezeli pieniądze były na koncie zwróć pieniądze (AccountService)
     * 2. Jeżeli nie było pieniędzy na koncie poproś tata o pieniądze
     * 3. Jeżeli tato nie miał pieniędzy NotEnoughMoneyException wyrzuć wyjątek SeriousMoneyException
     * który powinien zawierać kwotę pieniędzy jaką potrzebujesz
     * 4. Jeżeli miałeś na koncie tylko część wymaganej kwoty poproś tatę o resztę jaka jest ci potrzebna
     *
     * Klasa powinna korzystać z AccountService i DadMoneyService
     * (najlepiej mieć ich wstrzykniętych w jakiś przyzwoity sposób).
     */
    public Integer checkOperator(String mobileNumber) {
        throw new UnsupportedOperationException("Implement me!");
    }
}
