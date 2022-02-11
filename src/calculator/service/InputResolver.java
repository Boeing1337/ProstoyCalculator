package calculator.service;

import calculator.model.Input;
import calculator.types.OperationType;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputResolver {

    public Input resolve() {
        BigDecimal a;
        BigDecimal b;
        OperationType operationType;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(" PLEASE INPUT YOUR DIFFICULT TASK");
                a = new BigDecimal(scanner.next());
                operationType = OperationType.createBy(scanner.next());
                b = new BigDecimal(scanner.next());

                return new Input.Builder()
                        .setA(a)
                        .setB(b)
                        .setOperationType(operationType)
                        .build();

            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(e.getMessage());
                System.out.println("DAVAU NORM ZADACY ZABAL KABAL");
            }
        }

    }
}
