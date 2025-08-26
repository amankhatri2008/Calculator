package Service.impl;

import Service.Calculate;

import java.math.BigDecimal;

public class Addition implements Calculate {


    @Override
    public BigDecimal calculate(int a, int b) {
        return BigDecimal.valueOf(a + b);
    }
}
