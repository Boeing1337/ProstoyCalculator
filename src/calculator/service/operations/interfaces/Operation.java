package calculator.service.operations.interfaces;

import calculator.types.OperationType;

import java.math.BigDecimal;

public interface Operation {

    BigDecimal calculate(BigDecimal a, BigDecimal b);

    OperationType getType();

}
