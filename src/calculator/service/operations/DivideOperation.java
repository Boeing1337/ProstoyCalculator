package calculator.service.operations;

import calculator.service.operations.interfaces.Operation;
import calculator.types.OperationType;

import java.math.BigDecimal;

import static java.math.RoundingMode.CEILING;

public class DivideOperation implements Operation {
    @Override
    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.divide(b, 5, CEILING);
    }
    @Override
    public OperationType getType() {
        return OperationType.DIVIDE;
    }
}
