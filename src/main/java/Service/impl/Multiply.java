package Service.impl;

import Service.Calculate;

import java.math.BigDecimal;

public class Multiply implements Calculate {
    @Override
    public BigDecimal calculate(int a, int b) {
        return BigDecimal.valueOf((long) a * b);
    }
}
