package calculator.service.operations;

import calculator.service.operations.interfaces.Operation;
import calculator.types.OperationType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentOperation implements Operation {
    @Override
    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.multiply(b).divide(new BigDecimal(100), 5, RoundingMode.CEILING);
    }

    @Override
    public OperationType getType() {
        return OperationType.PERCENT;
    }
}
