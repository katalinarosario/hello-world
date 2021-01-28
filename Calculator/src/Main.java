package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Double input1;
        Double input2;
        String operand;
        Double answer;

        try {
            System.out.print("Enter a numeric value: ");
            input1 = scanner.nextDouble();
            System.out.print("Enter another numeric value: ");
            input2 = scanner.nextDouble();
            System.out.print("Enter desired operand (+ - * /): ");
            operand = scanner.next();

            answer = executeOperation(operand, input1, input2);

            if (answer != null){
                System.out.println("Answer: "+ answer);
            }

        } catch (InputMismatchException ime) {
            System.out.println("Couldn't format as a number.");
        }
    }

    private static Double executeOperation(String operand, Double input1, Double input2){
        Double answer = 0.0;

        switch(operand){
            case "+":
                answer = input1 + input2;
                break;
            case "-":
                answer = input1 - input2;
                break;
            case "*":
                answer = input1 * input2;
                break;
            case "/":
                answer = input1 / input2;
                break;
            default:
                System.out.println("Operand not recognized.");
                answer = null;
        }
        return answer;
    }

}
