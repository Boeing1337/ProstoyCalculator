package calculator.service;

import calculator.model.Input;
import calculator.service.operations.interfaces.Operation;
import calculator.service.operations.OperationList;
import calculator.types.OperationType;

import java.math.BigDecimal;
import java.util.HashMap;

public class Calculator {

    private final HashMap<OperationType, Operation> operations = new HashMap<>();

    public Calculator() {
        for (Operation o : new OperationList()) {
            operations.put(o.getType(), o);
        }
    }

    public BigDecimal calculate(Input input) {
        return operations.get(input.getOperationType())
                .calculate(input.getA(), input.getB());
    }


}
