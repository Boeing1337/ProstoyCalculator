package calculator.model;

import calculator.types.OperationType;

import java.math.BigDecimal;

public class Input {
    private final BigDecimal a;
    private final BigDecimal b;
    private final OperationType operationType;

    public Input(BigDecimal a, BigDecimal b, OperationType operationType) {
        this.a = a;
        this.b = b;
        this.operationType = operationType;
    }

    public BigDecimal getA() {
        return a;
    }

    public BigDecimal getB() {
        return b;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public static class Builder {
        private BigDecimal a;
        private BigDecimal b;
        private OperationType operationType;


        public Builder setA(BigDecimal a) {
            this.a = a;
            return this;
        }

        public Builder setB(BigDecimal b) {
            this.b = b;
            return this;
        }

        public Builder setOperationType(OperationType operationType) {
            this.operationType = operationType;
            return this;
        }

        public Input build() {
            return new Input(a, b, operationType);
        }
    }
}
