package effectivejava.enums;

public enum Operation {

    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    };

    private final String operationSign;

    Operation(String operationSign) {
        this.operationSign = operationSign;
    }

    public abstract double apply(double x, double y);
}
