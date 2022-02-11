package calculator.service.operations;

import calculator.service.operations.interfaces.Operation;

import java.util.ArrayList;

public class OperationList extends ArrayList<Operation> {
    {
        add(new DivideOperation());
        add(new MultiplyOperation());
        add(new SubtractOperation());
        add(new AddOperation());
        add(new PercentOperation());
    }
}
