package io.github.lambda;

public class OperationDemo {
    public static void main(String... args) {
        Operation addition2 = Integer::sum;
        float result2 = addition2.execute(2, 5);
        System.out.println("Lambda Result is " + result2);
    }
}
