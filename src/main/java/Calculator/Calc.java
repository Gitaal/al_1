//Задание №1. Калькулятор
package Calculator;

import java.util.Scanner;

public class Calc {
    public void setScanner() {
        // Scanner scanner;
        Scanner scanner = new Scanner(System.in);
        boolean question = true;

        //Цикл для продолжения программы
        while (question) {
            System.out.println("Введите первое число:");
            double first = scanner.nextDouble();
            System.out.println("Введите операцию +, -, *, /");
            char oper = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            double second = scanner.nextDouble();


            switch (oper) {
                case '+': //Если выполняется сложение
                    System.out.printf("Сумма чисел: %.4f", (first + second));
                    break;
                case '-'://Если выполняется вычитание
                    System.out.printf("Разница чисел: %.4f", (first - second));
                    break;
                case '*'://Если выполняется умножение
                    System.out.printf("Умножение чисел: %.4f", (first * second));
                    break;
                case '/'://Если выполняется деление
                    System.out.printf("Деление чисел: %.4f", (first / second));
                    break;
                default:
                    System.err.println("Неверная операция!");//Если некорректная операция
            }

            System.out.println();
            System.out.println("Продолжить операцию(y/n)?");
            String answer = scanner.next();

            if (answer.equals("y")) {
                question = true;
            } else {
                question = false;
                System.out.println("Пока!!!");
            }
        }
        scanner.close();
    }
}


