package com.justpz.sda;


import com.justpz.sda.dependency.MobileOperator;

public class MobileOperatorCheckerService {

    /**
     * Logika dzialania:
     * 1. Jezeli zapytanie było w cache to ta wartosc jest zwracana.
     * 2. Jezeli nie było w cache (zwrocony został pusty Optional) to pytany jest Web Service (i jego wartość jest zwracana)
     * 3. Jezeli zapytanie Web Service'u zwroci wyjatek to jest on zamieniany na wyjatek biznesowy z numerem
     *    telefonu w komunikacie bledu (message) - MobileOperatorCheckFailedException.
     *
     * Klasa powinna korzystać z MobileOperatorCheckerCache i MobileOperatorCheckerWebService
     * (najlepiej mieć ich wstrzykniętych w jakiś przyzwoity sposób).
     */
    public MobileOperator checkOperator(String mobileNumber) {
        throw new UnsupportedOperationException("Implement me!");
    }
}
