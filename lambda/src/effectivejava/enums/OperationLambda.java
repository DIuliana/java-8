package effectivejava.enums;

import java.util.function.DoubleBinaryOperator;

public enum OperationLambda {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y);

    private final String operationSign;
    private final DoubleBinaryOperator op;

    OperationLambda(String operationSign, DoubleBinaryOperator op) {
        this.operationSign = operationSign;
        this.op = op;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}
