package calculator.types;

import java.util.Arrays;
import java.util.Objects;

public enum OperationType {
    DIVIDE("/"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    ADD("+"),
    PERCENT("%");

    final String stringValue;

    OperationType(String s) {
        stringValue = s;
    }

    public static OperationType createBy(String value) {
        return Arrays.stream(OperationType.values())
                .filter(e -> Objects.equals(e.getStringValue(), value))
                .findFirst()
                .orElseThrow();
    }

    public String getStringValue() {
        return stringValue;
    }
}
