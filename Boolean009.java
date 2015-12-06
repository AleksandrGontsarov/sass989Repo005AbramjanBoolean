import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 04.08.15.
 */

// Даны два целых числа: A, B. Проверить истинность
// высказывания: «Хотя бы одно из чисел A и B нечетное».

public class Boolean009 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите число А : ");
        int a = s.nextInt();
        System.out.print("Введите число B : ");
        int b = s.nextInt();
        System.out.println();

        boolean isTrue;
        int c = a % 2;
        int d = b % 2;

        if (c == 0 & d == 0) {
            isTrue = false;
        } else isTrue = true;

        System.out.println("Хотя бы одно из чисел A и B нечетное : " + isTrue);
    }
}