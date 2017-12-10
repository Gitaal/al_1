//Задание №3. Поиск наименьшего отрицательного числа и наименьшего положительно. Пеменять местами данные числа
        package MaxElementMassiva;

        import java.util.Random;

/**
 * Created by OWL on 10.12.2017.
 */
public class MaxElement {
    public void zamenaElementa() {
        int[] massiv = new int[20];
        final Random random = new Random();
        int otricatelnoe = 0;
        int polozitelnoe = 11;
//Заполнение массива и поиск минимальных значений
        for (int i = 0; i < massiv.length; i++) {

            massiv[i] = (random.nextInt() % 11);
            System.out.print(massiv[i] + " ");
            //0 является отрицательным числом
            if ((massiv[i] <= 0) & (massiv[i] < otricatelnoe)) {
                otricatelnoe = massiv[i];
            } else {
                if ((massiv[i] > 0) & (massiv[i] < polozitelnoe)) {
                    polozitelnoe = massiv[i];
                } else {
                    continue;
                }

            }
        }
        System.out.println();
        //Поменять местами числа. Возможна некорректная работа с повторяющимися
        for (int i1 = 0; i1 < massiv.length; i1++) {
            if (massiv[i1] == polozitelnoe) {
                massiv[i1] = otricatelnoe;
            } else {
                if (massiv[i1] == otricatelnoe) {
                    massiv[i1] = polozitelnoe;
                }
            }

          System.out.print(massiv[i1] + " ");
        }
        System.out.println();
        System.out.println("Минимальное положительное "+polozitelnoe);
        System.out.println("Минимальное отрицательное "+otricatelnoe);

    }


}
