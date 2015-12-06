import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 13.08.15.
 */

// Дано целое положительное число. Проверить истинность
// высказывания: «Данное число является нечетным трехзначным».

public class Boolean017 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите положительное число А : ");
        int a = s.nextInt();
        System.out.println();

        int b = a % 2; // проверка четности
        boolean isTrue;

        if (a > 100 && a < 1000 && b != 0) {
            isTrue = true;
        } else isTrue = false;

        String result = null;
        String pravda = "Истина!";
        String nepravda = "Ложь!";

        if (isTrue == true) {
            result = pravda;
        } else result = nepravda;

        System.out.println("Данное число является нечетным трехзначным : " + result);
    }
}