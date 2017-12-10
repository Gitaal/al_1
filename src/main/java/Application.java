import Calculator.Calc;
import MassivSlov.MassivSlov;

import java.util.Scanner;

/**
 * Created by OWL on 01.12.2017.
 *
 * @author OWL
 * @see #main(String[])
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        MassivSlov massivSlov = new MassivSlov();
        System.out.println("Какую программу Вы собираетесь выбрать?");
        System.out.println("Введите 1 для калькулятор 2 поиск наимбольшего слова в массиве:");
        int vibor = scanner.nextInt();
        switch (vibor){
            case 1: calc.setScanner();
                break;
            case 2: massivSlov.setScanner();
                break;
            default:
                System.err.println("Выход из операции.");//Если некорректная операция
        }


    }
}
