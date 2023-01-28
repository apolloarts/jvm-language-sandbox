package hellojava.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HelloFactory {
    public int calculateUsingFactory(int a, int b, String operator) {
        Operation targetOperation = OperatorFactory
                .getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a, b);
    }

    public static void main(String args[]) {
        HelloFactory helloFactory = new HelloFactory();
        int result = helloFactory.calculateUsingFactory(2, 3, "add");
        System.out.println(result);
    }
}

interface Operation {
    int apply(int a, int b);
}

class Addition implements Operation {
    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}

class Division implements Operation {
    @Override
    public int apply(int a, int b) {
        return a / b;
    }
}

class OperatorFactory {
    static Map<String, Operation> operationMap = new HashMap<>();

    static {
        operationMap.put("add", new Addition());
        operationMap.put("divide", new Division());
        // more operators
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}