import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.08.15.
 */
public class Boolean011 {

// Даны два целых числа: A, B. Проверить истинность
// высказывания:«Числа A и B имеют одинаковую четность».

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите чило А : ");
        int a = s.nextInt();
        System.out.print("Введите число В : ");
        int b = s.nextInt();
        System.out.println();

        int c = a % 2;
        int d = b % 2;

        boolean isTrue;

        if ((c == 0 | d != 0) & (c != 0 | d == 0)) {
            isTrue = true;
        } else isTrue = false;

        String pravda = "истина!";
        String nepravda = "ложь!";
        String result = null;

        if (isTrue == true) {
            result = pravda;
        } else if (isTrue == false) {
            result = nepravda;
        }

        System.out.println("Числа A и B имеют одинаковую четность : " + result);
    }
}