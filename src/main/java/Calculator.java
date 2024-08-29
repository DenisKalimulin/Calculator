import java.util.Scanner;

public class Calculator {
    private String[] split;
    Scanner scanner = new Scanner(System.in);

    public Calculator() {

    }

    public void startCalculator() {
        System.out.println("Калькулятор принимает строку вида: A + B");
        System.out.println("Возможные операторы: \"+\" , \"-\" , \"*\" , \"/\"");
        calculate(scanner.nextLine());
    }

    public void startSquare() {
        System.out.println("Введите число, из которого хотите вычислить квадратный корень");
        long result = square(scanner.nextInt());
        System.out.println(result);
    }

    private void calculate(String input) {
        split = input.split(" ");

        if (split[1].equals("+")) {
            Addition addition = new Addition(split[0], split[2]);
            System.out.println(addition.action());
        } else if (split[1].equals("-")) {
            Subtraction subtraction = new Subtraction(split[0], split[2]);
            System.out.println(subtraction.action());
        } else if (split[1].equals("*")) {
            Multiplication multiplication = new Multiplication(split[0], split[2]);
            System.out.println(multiplication.action());
        } else if (split[1].equals("/")) {
            Division division = new Division(split[0], split[2]);
            System.out.println(division.action());
        }
    }

    private long square(int input) {
        return input * input;
    }

}
