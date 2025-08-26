package Service.impl;

import Service.Calculate;

import java.math.BigDecimal;

public class Division implements Calculate {
    @Override
    public BigDecimal calculate(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by 0");
        }
        return BigDecimal.valueOf((double) a / b);
    }
}
