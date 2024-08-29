import java.util.Scanner;

public class Calculator {
    private String act;
    private String[] split;
    Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("Для запуска калькулятора нужно вызвать метод start()");
        System.out.println("и написать выражение строкой типа: A + B");
        System.out.println("Возможные операторы: \"+\" , \"-\" , \"*\" , \"/\"");
    }

    public Calculator() {

    }

    public void start() {
        calculate(scanner.nextLine());
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

}
