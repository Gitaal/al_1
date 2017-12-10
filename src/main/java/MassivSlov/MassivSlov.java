package MassivSlov;

import java.util.Scanner;

import static java.lang.System.*;

public class MassivSlov {
    public void setScanner() {
        Scanner scanner = new Scanner(System.in);
        String samoeDlinnoeSlovo = "";
        String provSlovo;
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        String[] massivStr = new String[arraySize];

        /*Если в массиве встречается несколько слов одинаковой длины,
        то мы выбираем первое слово*/

        System.out.println("Наполните массив произвольными словами:");
        //Наполняем массив
        for (int i = 0; i < massivStr.length; i++) {
            String slovo = scanner.next();
            massivStr[i] = slovo;
            provSlovo = massivStr[i];
            if (samoeDlinnoeSlovo.length() < provSlovo.length()) {
                samoeDlinnoeSlovo = provSlovo;
            } else {
                continue;
            }
        }
        System.out.println("Самое длинное слово массива: " + samoeDlinnoeSlovo + " длина: " + samoeDlinnoeSlovo.length());
    }

}
