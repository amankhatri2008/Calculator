package Service;

import java.math.BigDecimal;

public class CalculationStrategy {

    private final Calculate calculate;

    public CalculationStrategy(Calculate calculate) {
        this.calculate = calculate;
    }

    public BigDecimal doCalculation(int a, int b) throws Exception {
        return calculate.calculate(a, b);
    }

}
