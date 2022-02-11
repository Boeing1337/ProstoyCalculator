package calculator;

import calculator.service.Calculator;
import calculator.service.InputFiller;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println(
                    "VASH OTVET: \n" +
                            calculator.calculate(new InputFiller().resolveUserInput())
            );
        }
    }
}
