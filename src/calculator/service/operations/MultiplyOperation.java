package calculator.service.operations;

import calculator.service.operations.interfaces.Operation;
import calculator.types.OperationType;

import java.math.BigDecimal;

public class MultiplyOperation implements Operation {
    @Override
    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    @Override
    public OperationType getType() {
        return OperationType.MULTIPLY;
    }
}
