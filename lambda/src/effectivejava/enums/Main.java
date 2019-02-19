package effectivejava.enums;

public class Main {

    public static void main(String[] args) {

        //constant-specific	class bodies
        for (Operation o : Operation.values()) {
            System.out.println(o.apply(2, 5));
        }
        System.out.println("---------------------");

        //lambda approach with DoubleBinaryOperator
        for (OperationLambda o : OperationLambda.values()) {
            System.out.println(o.apply(6, -3));
        }
    }
}
